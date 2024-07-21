package com.academiajava;

public class ChocolateBoilerAsSingleton {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoilerAsSingleton instance;
  private ChocolateBoilerAsSingleton(){
        empty=true;
        boiled=false;
    }
 public static synchronized ChocolateBoilerAsSingleton getInstance(){
        if(instance == null)
            instance= new ChocolateBoilerAsSingleton();
        return instance;
    }

    public void fill(){
        if(isEmpty()){
            empty = false;
            boiled = false;
        }
    }
    public void  boil(){
        if(!isEmpty() && !isBoiled()){
            boiled= true;
        }
    }
    public void drain(){
        if(!isEmpty() && isBoiled()){
            empty= true;
        }
    }


    public boolean isEmpty(){
        return empty;
    }
    public boolean isBoiled(){
        return boiled;
    }
}
