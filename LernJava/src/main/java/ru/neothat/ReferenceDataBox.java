package ru.neothat;

import java.util.ArrayList;

public class ReferenceDataBox<T> {
    private T[] obj;

    @SafeVarargs
    public ReferenceDataBox(T... obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    public void setObj(T[] obj) {
        this.obj = obj;
    }

    public void swap(int positionOne, int positionTwo){
        T temp = obj[positionOne];
        obj[positionOne] = obj[positionTwo];
        obj[positionTwo] = temp;
    }

    public void transformation(){
        ArrayList<T> arrayList = new ArrayList<>(this);
    }
}
