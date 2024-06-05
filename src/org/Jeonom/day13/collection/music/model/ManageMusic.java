package org.Jeonom.day13.collection.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageMusic {

	private List<Music> mList;

	public ManageMusic() {
		mList = new ArrayList<Music>();
	}

	// 맨 뒤에 곡 추가
	public void registerMusic(Music music) {
		mList.add(music);
	}

	// 맨 앞에 곡 추가
	public void registerMusicAtFirst(Music music) {
		mList.add(0, music);
	}

	// 곡 삭제
	public void deleteMusic(int index) {
		mList.remove(index);

	}

	// 모든 곡 조회
	public List<Music> getAllMusics() {
		if (mList.isEmpty()) {
			return null;
		} else {
			return mList;
		}
	}

	// 곡명으로 곡 검색
	public List<Music> searchMusicByTitle(String title) {
		if (title != null && title != "") {
			List<Music> searchList = new ArrayList<Music>();
			for (Music music : mList) {
				if (title.equals(music.getTitle())) {
					searchList.add(music);
				}
			}
			return searchList;
		}
		return null;
	}

	// 곡명으로 인덱스 조회
	public int searchIndexByTitle(String title) {
		if (title != "" && title != null) {
			int count = 0;
			for (Music music : mList) {
				if (title.equals(music.getTitle())) {
					return count;
				}
			}
			count++;
		}
		return 0;
	}

	// 곡명으로 수정할 곡 조회
	public Map<String, Object> searchModifyMusic(String title) {
		if (title != "" && title != null) {
			Map<String, Object> result = new HashMap<String, Object>();
			for (int i = 0; i < mList.size(); i++) {
				Music music = mList.get(i);
				if (title.equals(music.getTitle())) {
					result.put("music", music);
					result.put("index", i);
					return result;
				}
			}
		}
		return null;
	}

	// 곡 수정
	public void searchModifyMusic(int index, Music music) {
		mList.set(index, music);

	}
	
	// 곡명 오름차순
	public void sortByTitleASC() {
		Collections.sort(mList);
//		List<String> strList = new ArrayList<String>();
//		strList.add("김만우");
//		strList.add("강진형");
//		strList.add("박은진");
//		Collections.sort(strList); // 기본 오름차순 정렬
//		숫자 > 영어 > 한글
//		// collection - list, set, map 크기 size()
//		for (int i = 0; i < mList.size() - 1; i++) {
//			for (int j = 0; j < mList.size() - 1 - i; j++) {
//				// 버블정렬의 특징 - 오른쪽부터 정렬, 비교횟수 감소
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j + 1);
//				// 문제점 : 객체비교는 부등호로는 무리
//				// 비교해야 하는 것은 곡명(title)
//				// title을 서로 비교하여 늦은 순서인 경우 교체
//				// compareTo() 메소드는 문자열이 사전적으로 문자열 인수보다 크면 0보다 큼
//				// 비교했을 때 왼쪽이 크면 맨 오른쪽으로 보내라 -> 오른쪽 큰놈들만 쌓임 -> 오름차순 정렬
//				if (mOne.getTitle().compareTo(mTwo.getTitle()) > 0) {
////					Music temp = mOne;
//					mList.set(j, mTwo);
//					mList.set(j + 1, mOne);
//				}
//			}
//		}
	}

	// 곡명 내림차순
	public void sortByTitleDESC() {
		Collections.sort(mList, new DescTitle());
//		for (int i = 0; i < mList.size() - 1; i++) {
//			for (int j = 0; j < mList.size() - 1 - i; j++) {
//				// 버블정렬의 특징 - 오른쪽부터 정렬, 비교횟수 감소
//				Music mOne = mList.get(j);
//				Music mTwo = mList.get(j + 1);
//				// 문제점 : 객체비교는 부등호로는 무리
//				// 비교해야 하는 것은 곡명(title)
//				// title을 서로 비교하여 늦은 순서인 경우 교체
//				// 비교했을 때 왼쪽이 작으면 맨 오른쪽으로 보내라 -> 작은 놈들만 쌓임 -> 내림차순 정렬
//				if (mOne.getTitle().compareTo(mTwo.getTitle()) < 0) {
//					mList.set(j, mTwo);
//					mList.set(j + 1, mOne);
//				}
//			}
//		}

	}

	// 가수명 오름차순
	public void sortBySingerASC() {
		for (int i = 1; i < mList.size(); i++) {
			for (int j = i; j >= 1; j--) {
				Music mOne = mList.get(j - 1);
				Music mTwo = mList.get(j);
				if (mOne.getSinger().compareTo(mTwo.getSinger()) > 0) {
					mList.set(j - 1, mTwo);
					mList.set(j, mOne);
				}
			}
		}

	}

	// 가수명 내림차순
	public void sortBySingerDESC() {
		for (int i = 1; i < mList.size(); i++) {
			for (int j = i; j >= 1; j--) {
				Music mOne = mList.get(j - 1);
				Music mTwo = mList.get(j);
				if (mOne.getSinger().compareTo(mTwo.getSinger()) < 0) {
					mList.set(j - 1, mTwo);
					mList.set(j, mOne);
				}
			}
		}
	}

}
