package org.example.JavaAdvancedTest1.Zadaca1;

import java.util.Arrays;
import java.util.Iterator;

public class DynamicArray implements Iterable<Integer>{
    private int capacity = 0;
    private int[] numbers=new int[capacity];

    public void add(int number){
        capacity++;
        numbers = Arrays.copyOf(numbers,capacity);
        numbers[capacity-1]=number;
    }
    public void remove(int number){
        for(int i=0; i<capacity; i++){
            if (numbers[i]==number){
                capacity--;
                for (int j=i; j<capacity; j++) {
                    numbers[j] = numbers[j + 1];
                }
            }
            numbers = Arrays.copyOf(numbers,capacity);
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iteracija();
    }
    private class Iteracija implements Iterator<Integer>{
        private int indexNumber=0;
        @Override
        public boolean hasNext() {
            return (indexNumber<capacity);
        }

        @Override
        public Integer next() {
            int number=numbers[indexNumber];
            indexNumber++;
            return number;
        }
    }
}
