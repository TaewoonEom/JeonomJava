package org.Jeonom.day12.collection.list;

public class ObjectList {
	Object [] objects;
	int size;
	
	public ObjectList() {
		objects = new Object[3];
		size = 0;
	}
	
	public void add(Object obj) {
		objects[size] = obj;
		size++;
	}
	
	public Object get(int index) {
		return objects[index];
	}
	
	public int size() {
		return size;
	}
	
	public void clear() {
		objects = new Object[3]; 
		size = 0;
	}
	
}
