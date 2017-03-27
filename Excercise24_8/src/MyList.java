/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sd0854388
 */
public interface MyList<E> {
        //add a new element at the end of the list
        public void add(E e);
        //add a new element at the specified location in this list 
        public void add(int index, E e);
        //clear the list
        public void clear();
        //returns true if the list contains the element
        public boolean contains(E e);
        //returns the value at the specified index
        public E get(int index);
        //return index of the first matching element in this llist. 
        //return -1 if no match
        public int indexOf(E e);
        //return true if this list contains no elements
        public boolean isEmpty();
        //return the index of the last matching element in this list, 
        //return -1 if no match
        public int lastIndexOf(E e);
        //remove the first occurrence of the element
        //e from this list
        //return true if the element is removed
        public boolean remove(E e);
        //remove the element at the specified location in this list
        // Shift any subsequent elements to the left
        //return the element that was removed from the list
        public E remove(int index);
        //replace the element at the specified position in thes list with the
        //specified element and return the new set
        public Object set(int index, E e);
        //return the number of elements in this list
        public int size();
        
    }