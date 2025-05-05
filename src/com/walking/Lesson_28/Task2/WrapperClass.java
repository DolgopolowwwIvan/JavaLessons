package com.walking.Lesson_28.Task2;

public class WrapperClass<Type> {

    private Type field;

    public WrapperClass(Type field){
        if(notNull(field)){
            this.field = field;
        }
        else {throw new IllegalArgumentException("Поле не может иметь значение null!");}
    }

    public Type getField() {
        return field;
    }

    public void setField(Type field) {
        this.field = field;
    }

    private boolean notNull(Type field){
        if(field != null){
            return true;
        }
        return false;
    }

}
