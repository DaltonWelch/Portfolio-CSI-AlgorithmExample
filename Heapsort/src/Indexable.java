/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stu594822
 */
 public interface Indexable<T> {
   public int size();
   public T get(int i);
   public void put(int i, T obj);
   public Snapshot snap(int compareCount, int swapCount, int i, int j, boolean isSwap);
       
   
 }
