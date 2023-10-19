package com.readonly.readyonly;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyIntegerWrapper;

public class Constant {
    private ReadOnlyIntegerWrapper numWrapper;
    public Constant(int num){
        this.numWrapper = new ReadOnlyIntegerWrapper(num);
    }

    public ReadOnlyIntegerProperty getReadOnlyNumber(){
        return numWrapper.getReadOnlyProperty();
    }
}
