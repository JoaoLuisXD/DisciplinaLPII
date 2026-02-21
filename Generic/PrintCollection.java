package Generic;

import java.util.ArrayList;

public class PrintCollection<T>{
    private ArrayList<T> list = new ArrayList<>();

    public void addValue(T value){
        list.add(value);
    }

    public T first(){
        return list.get(0);
    }

    public void printList(){
        for(T value:list){
            System.out.println(value);
        }
    }

}
