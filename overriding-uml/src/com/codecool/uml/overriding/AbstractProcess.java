package com.codecool.uml.overriding;

public abstract class AbstractProcess {

    public void process(Orderable item) {
        stepBefore();
        action(item);
        stepAfter();
    }

    protected void stepBefore(){
        System.out.println("Before");
    };

    protected abstract void action(Orderable item);

    protected void stepAfter(){
        System.out.println("after");
    } ;


    
}
