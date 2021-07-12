package com.sda.javafundamentals.generics.repository;

import com.sda.javafundamentals.generics.model.Identifiable;

import java.util.ArrayList;
import java.util.List;

public class IdentifiableRepository<T extends Identifiable> {

    protected List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public T getItemByID(String id) {
        for (T item : items) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void removeItem(String id){
       T itemToBeRemoved = getItemByID(id);
       if (itemToBeRemoved != null){
           items.remove(itemToBeRemoved);
       }
    }


}
