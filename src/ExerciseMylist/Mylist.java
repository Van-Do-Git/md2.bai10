package ExerciseMylist;

import org.omg.CORBA.INITIALIZE;

public class Mylist<E> implements Cloneable {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Mylist() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public Mylist(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {

        if (size == elements.length) {
            ensureCapacity();
        }
        if (index <= size - 1 && index >= 0) {
            for (int i = elements.length - 1; i < index; i++) {
                elements[i + 1] = elements[i];
            }
            elements[index] = element;
            size++;
        } else if (index == size) {
            elements[index] = element;
            size++;
        } else
            System.out.println("IndexOutOfBoundsException");
    }

    public E remove(int index) {
        if (index >= 0 && index < size - 1) {
            for (int i = index; i < size - 2; i++) {
                elements[i] = elements[i + 1];
                System.out.println(elements[i]);
            }
            elements[size - 1] = null;
            size--;
            return (E) elements[index];
        }
        throw new IndexOutOfBoundsException("Not remove");
    }

    public void ensureCapacity() {
        Object newElements[] = new Object[elements.length + DEFAULT_CAPACITY];
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
    }

    public boolean contains(E o) {
        boolean check = false;
        for (Object element : elements) {
            if (element.equals(o)) {
                check = true;
                break;
            }
        }
        return check;
    }

}