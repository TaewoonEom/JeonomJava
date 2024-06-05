package org.Jeonom.day13.collection.music.controller;

import java.util.List;
import java.util.Map;

import org.Jeonom.day13.collection.music.model.ManageMusic;
import org.Jeonom.day13.collection.music.model.Music;
import org.Jeonom.day13.collection.music.view.ViewMusic;

public class MusicApp {
	public static void main(String[] args) {
		ViewMusic view = new ViewMusic();
		ManageMusic mng = new ManageMusic();

		end: 
		while (true) {
			int input = view.printMenu();
			Music music = null;
			String title = "";
			int index = 0;
		
			switch (input) {
				case 1: // 마지막 위치에 곡 추가
					music = view.inputMusic();
					mng.registerMusic(music);
					break;
				case 2: // 첫 위치에 곡 추가
					music = view.inputMusic();
					mng.registerMusicAtFirst(music);
					break;
				case 3: // 전체 곡 목록 출력
					List<Music> mList = mng.getAllMusics();
					if (mList.size() > 0) {
						view.getMusicInfo(mList);
					} else {
						view.displayMsg("저장된 곡이 없습니다");
					}
					break;
				case 4: // 특정 곡 검색
					title = view.inputTitle("검색");
					List<Music> muList = mng.searchMusicByTitle(title);
					if(muList == null) {
						view.displayMsg("검색 결과가 없습니다.");
					}else {
						view.getMusicInfo(muList);
					}
					break;
				case 5: // 특정 곡 삭제
					title = view.inputTitle("삭제");
					index = mng.searchIndexByTitle(title);
					mng.deleteMusic(index);
					break;
				case 6: // 특정 곡 정보수정
					title = view.inputTitle("수정");
					// 수정할 위치
					Map<String, Object> result = mng.searchModifyMusic(title); 
					// 수정할 정보
					Music msc = view.modifyMusic((Music) result.get("music"));
					// 정보 수정
					mng.searchModifyMusic((int) result.get("index"), msc);
					break;
				case 7: // 곡명 오름차순 정렬
					mng.sortByTitleASC();
					break;
				case 8: // 곡명 내림차순 정렬
					mng.sortByTitleDESC();
					break;
				case 9: // 가수명 오름차순 정렬
					mng.sortBySingerASC();
					break;
				case 10: // 가수명 내림차순 정렬
					mng.sortBySingerDESC();
					break;
				case 0: // 종료
					view.displayMsg("프로그램을 종료합니다.");
					break end;
				default:
					view.displayMsg("메뉴를 잘못 선택하셨습니다.");
				}
			}

	}
}
