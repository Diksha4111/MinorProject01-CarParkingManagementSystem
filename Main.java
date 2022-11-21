/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.util.*;

/**
 *
 * @author Dell
 */
public class Main {
    
    public Main(){
        new Home();
    }
    
    public int getSlot(){
        int slot = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(8); //slot1 distance 
        pq.add(4); //slot2 distance
        pq.add(9); //slot3 distance
        pq.add(5); //slot4 distance
        pq.add(11); //slot5 distance
        pq.add(7); //slot6 distance
        pq.add(12); //slot7 distance
        pq.add(8); //slot8 distance
        pq.add(4); //slot9 distance
        pq.add(8); //slot10 distance
        pq.add(5); //slot11 distance
        pq.add(9); //slot12 distance
        pq.add(7); //slot13 distance
        pq.add(11); //slot14 distance
        pq.add(8); //slot15 distance
        pq.add(12); //slot16 distance

        slot = pq.peek();
        return slot;
    }
    // Creating empty priority queue
    public static void main(String[] args){
        Main obj = new Main(); 
        obj.getSlot();
    }
    
    
}
