package com.example.project;

import java.util.Stack;

public class TreeUser {
    public static <T> int countLeaves(BT<T> bt) {
    	if(bt.root==null) {
    		return 0;
    	}
    	
    	
    	bt.current=bt.root;
    	int counter=0;
    	if(bt.isLeaf()) {
    		return 1;
    	}
    	else
    	{
    		LinkedStack<BTNode<T>> tmp = new LinkedStack();
    		BTNode<T> tmp2;

    	tmp.push(bt.root);
    	
    	while(!tmp.empty()) {
    		bt.current=tmp.pop();
    		if(bt.isLeaf()) {
    			counter++;
    		}
    		
    		if(bt.current.left!=null) {
    			tmp.push(bt.current.left);
    		}
    		
    		if(bt.current.right!=null) {
    			tmp.push(bt.current.right);
    		}
    		
    		
    		
    	}
    	
    	}
       return counter;
       
    }
}