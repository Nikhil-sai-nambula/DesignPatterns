package com.nikhil.designPatterns.behavioral.iterator;

public interface Aggregate<T> {

	Iterator<T> createIterator();

}
