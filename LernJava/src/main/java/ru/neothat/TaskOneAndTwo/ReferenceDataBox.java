package ru.neothat.TaskOneAndTwo;

import java.util.ArrayList;
import java.util.List;

public class ReferenceDataBox<T> {
    private final T[] obj;

    @SafeVarargs
    public ReferenceDataBox(T... obj) {
        this.obj = obj;
    }

    public T[] getObj() {
        return obj;
    }

    public void swap(int positionOne, int positionTwo){
        T temp = obj[positionOne];
        obj[positionOne] = obj[positionTwo];
        obj[positionTwo] = temp;
    }

    public void transformation(){
        ArrayList<T> arrayList = new ArrayList<>(List.of(getObj()));
        System.out.println("Преобразование прошло успешно: " + arrayList);
    }
}
