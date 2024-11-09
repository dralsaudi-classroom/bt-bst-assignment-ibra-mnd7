package com.example.project;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
    	int countL=0;
    	
    	if(bt.isLeaf()) {
    		countL++;
    	}
    	else
    		if(bt.find(Relative.LeftChild)) {
    			countL+= countLeaves(bt);
    		}
    	
    		else
    		    if(bt.find(Relative.RightChild)){
    		    	countL+=countLeaves(bt);
    		}
   
    	return countL;
    	
    	
    	
    	
    	
}}