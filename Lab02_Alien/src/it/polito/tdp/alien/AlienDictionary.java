package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	/*List<Word> parole = new LinkedList<Word>();
	
	public void addWord(String alienWord, String translation) {
		
		Word ptemp = new Word(alienWord,translation);
		for(int i=0; i<parole.size(); i++) {
			if(parole.get(i).getAlienWord().compareTo(alienWord)==0) {
				parole.get(i).setTranslation(translation);
				return;
			}
		}
		parole.add(ptemp);
		
	}
	
	public String translateWord(String alienWord) {
		for(int i=0; i<parole.size(); i++) {
			if(parole.get(i).getAlienWord().compareTo(alienWord)==0) {
				return parole.get(i).getTranslation();
			}
		}
		return null;
		
	}*/
	
	Map<String,Word> parole = new HashMap<String,Word>();
	
	public void addWord(String alienWord,String translation) {
		Word ptemp = new Word(alienWord,translation);
		if(parole.containsKey(alienWord)) {
			parole.get(alienWord).setTranslation(translation);
		}
		else {
			parole.put(alienWord, ptemp);
		}
	}
	
	public String translateWord(String alienWord) {
		if(parole.containsKey(alienWord))
			return parole.get(alienWord).getTranslation();
		
		return null;
	}
	
	
	

}
