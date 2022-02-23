package com.bridgelabz.Hashmap;

public class INNode {
	public interface INode<K> {
	    K getKey();
	    void setKey();

	    INode getNext();
	    void setNext(INode<K> tempNode);
	}
}
