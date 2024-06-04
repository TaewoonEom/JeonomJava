package org.Jeonom.day13.collection.music.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManageMusic {
	
	private List<Music> mList;
	
	public ManageMusic() {
		mList = new ArrayList<Music>();
	}

	public void registerMusic(Music music) {
		mList.add(music);
	}

	public void registerMusicAtFirst(Music music) {
		mList.add(0, music);
	}

	public void deleteMusic(int index) {
		mList.remove(index);
		
	}

	public List<Music> getAllMusics() {
		if(mList.isEmpty()) {
			return null;
		}else {
			return mList;			
		}
	}

	public List<Music> searchMusicByTitle(String title) {
		if(title != null) {
			List<Music> searchList = new ArrayList<Music>();
			for(Music music : mList) {
				if(title.equals(music.getTitle())) {
					searchList.add(music);
				}
			}
			return searchList;
		}
		return null;
	}

	public int searchIndexByTitle(String title) {
		if(title != "" && title != null) {
			int count = 0;
			for(Music music : mList) {
				if(title.equals(music.getTitle())) {
					return count;
				}
			}
			count++;
		}
		return 0;
	}

	public Map<String, Object> searchModifyMusic(String title) {
		if(title != "" && title != null) {
			Map<String, Object> result = new HashMap<String, Object>();
			for(int i = 0; i < mList.size(); i++) {
				Music music = mList.get(i);
				if(title.equals(music.getTitle())) {
					result.put("music", music);
					result.put("index", i);
					return result;
				}
			}
		}
		return null;
	}

	public void searchModifyMusic(int index, Music music) {
		mList.set(index, music);
		
	}

	



	
}
