package org.example.JavaAdvancedTest1.Zadaca2;

import java.util.Arrays;
import java.util.Iterator;

public class Conteiner <E> extends Person implements Iterable<E>{
    private int capacity=0;
    private Object[] elements;
    public Conteiner(){
        elements=new Object[capacity];
    }

    public void add(E element){
        capacity++;
        elements= Arrays.copyOf(elements,capacity);
        elements[capacity-1]=element;
    }
    public void remove(E element){
        for(int i=0; i<elements.length; i++) {
            if (elements[i].equals(element)) {
                capacity--;
                for (int j = i; j < elements.length-1; j++) {
                    elements[j] = elements[j + 1];
                }
            }
            elements = Arrays.copyOf(elements, capacity);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return (Iterator<E>) new Iteracija();
    }
    public class Iteracija implements Iterator<Object> {
        private int indexNumber=0;

        @Override
        public boolean hasNext() {
            return (indexNumber<capacity);
        }

        @Override
        public E next() {
            Object element= elements[indexNumber];
            indexNumber++;
            return (E) element;
        }
    }
}
