package MyArray;

import java.util.Arrays;

public class MyArrayList<T> {
    private T array[];
    T[] result;
    private int nElements;

    public MyArrayList(int max) {
        this.array = (T[]) new Object[max];
        this.nElements = 0;
    }

    public void add(T value) {
        if (nElements < array.length - 1) {
            array[nElements] = value;
        } else {
            int increaseSize = array.length + 1;
            array = Arrays.copyOf(array, increaseSize);
            array[nElements] = value;
        }
        nElements++;
    }


    public boolean remove(int index) {
        boolean result = false;
        int count = 0;
        for (count = 0; count < nElements; count++) {
            if (count == index) {
                break;
            }
        }
        if (count == nElements) {
            result = false;
        } else {
            for (int i = count; i < nElements; i++) {
                array[i] = array[i + 1];

                result = true;
            }

        }
        nElements--;
        return result;

    }


    public void clear() {
        for (int i = 0; i < nElements; i++) {
            array[i] = null;
        }
        nElements = 0;
    }


    public int size() {
        return nElements;
    }


    public T get(int index) {
        if (index > nElements ||array[index]== null ){
            throw new ArrayIndexOutOfBoundsException();
        }
        return array[index];
    }

    public void display() {
        for (T ob : array
        ) {
            if (ob == null) {
                continue;
            } else {
                System.out.println(ob);
            }

        }

    }


}
