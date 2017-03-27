/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sd0854388
 */
public class MyArrayList<E> extends MyAbstractList<E> {
    
    public static final int INITIAL_CAPACITY = 4;
    private E[] data = (E[])new Object[INITIAL_CAPACITY];
    /**
     * this is a class method only
     * @return 
     */
    public int getCapacity(){
        return data.length;
    }
    public MyArrayList(){
        
    }
    public MyArrayList(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);            
        }          
    }//end of constructor
    
    
    @Override
    public void add(int index, E e) {
        ensureCapacity();
        //move the elements to the right after the specified index
        for (int i = size-1; i >= index; i--) {
            data[i+1] = data[i];            
        }
        //insert new element to data[index]
        data[index] = e;
        //increase size by 1
        size++;
    }
    /** Create a new larger array, double the current size + 1 */    
    private void ensureCapacity(){
        if(size>= data.length){
            E[] newData = (E[])(new Object[size * 2 + 1]);
            System.arraycopy(data, 0, newData, 0, size);
            data = newData;
        }
    }
    //clear the list
    @Override
    public void clear(){
        data = (E[])new Object[INITIAL_CAPACITY];
        size = 0;
    }
    //return true if this list contains the element
    @Override
    public boolean contains(E e){
        for (int i = 0; i < size; i++) {
            if(e.equals(data[i])) {
                return true;
            }            
        }
        return false;
    }
    /** Return the element from this list at the specified index */
    @Override
    public E get(int index){
        return data[index];
    }
    /** Return the index of the first matching element in this list.
     *  Return -1 if no match. */
    @Override
    public int indexOf(E e){
        for (int i = 0; i < size; i++) {
            if(e.equals(data[i])){
                return i;
            }            
        }
        return -1;
    }
    /** Return the index of the last matching element in this list
     *  Return -1 if no match. */
    @Override
    public int lastIndexOf(E e){
        for (int i = size - 1; i >= 0; i--) {
            if(e.equals(data[i])){
                return i;
            }            
        }
        return -1;
    }
    /** Remove the element at the specified position in this list
     *  Shift any subsequent elements to the left.
     *  Return the element that was removed from the list. */   
    
    @Override
    public boolean remove(E e) {
        if(indexOf(e) >= 0){
            remove(indexOf(e));
            return true;
        }
        else
            return false;
    }

    @Override
    public E remove(int index) {
        E e = data[index];
        
        for (int j = index; j < size; j++) {
            data[j] = data[j+1];            
        }
        
        data[size-1] = null;
        
        size--;
        
        return e;
    }

    @Override
    public Object set(int index, E e) {
        //TODO: do this
        
        return null;
    }
    
    
}
