package controllers;

import java.util.ArrayList;

import interfaces.ValoresITF;

public class Valores implements ValoresITF{

	ArrayList<Integer> valores = new ArrayList<Integer>(10);
	
	
	public boolean ins(int v) {
		if (v <= 0 || valores.size() >= 10) {
			return false;
		}
		
		return valores.add(v);
	}
	public int del(int i) {
		if (i > valores.size() -1) {
			return -1;
		}
		
		return valores.remove(i);
	}
	public int size() {
		return valores.size();
	}
	public double mean() {
		return 0.0;
	}
	public int greater() {
		return 0;
	}
	public int lower() {
		return 0;
	}
}
