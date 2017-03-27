/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sd0854388
 */
public abstract class MyAbstractList<E> implements MyList<E> {
    protected int size = 0; //the size of the list
    /**
     * Default constructor
     */
    protected MyAbstractList(){
        
    }//end of MyAbstractList
    /**
     * constructor that accepts an array of items
     * @param objects 
     */
    protected MyAbstractList(E[] objects){
        for (int i = 0; i < objects.length; i++) {
            add(objects[i]);            
        }
    }//end of MyAbstractList
    /**
     * add a new element at the end of this list
     */
    public void add(E e){
        add(size, e);
    }//end add method
    
//    public void add(int index, E e){
//        add(index, e);
//    }//end add method    
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
}
