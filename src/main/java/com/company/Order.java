package com.company;

import org.json.simple.JSONObject;

import java.util.Collection;
import java.util.HashMap;

public class Order {
    private  Object eventID;
    private  Object itemID;
    private  Object count;
    private  Object returnCount;
    private  Object orderID;
    private  Object status;

    public Order(Object eventID, Object itemID, Object count, Object returnCount, Object orderID, Object status) {
        this.eventID = eventID;
        this.itemID = itemID;
        this.count = count;
        this.returnCount = returnCount;
        this.orderID = orderID;
        this.status = status;
    }

    public Object getEventID() {
        return eventID;
    }

    public Object getItemID() {
        return itemID;
    }

    public Object getCount() {
        return count;
    }

    public Object getReturnCount() {
        return returnCount;
    }

    public Object getOrderID() {
        return orderID;
    }

    public Object getStatus(boolean toCheck) {
        return status;
    }

    public boolean isEnoughToMakeOrder(Order toCheck) {
        if ((Long) toCheck.getCount() - (Long) toCheck.getReturnCount() != 0) {
        return true;
        }
        else return false;
    }

    //public Long getLastEventID(Order toCheck) {
      //  for (int i = 0; i < )
    //}

}
