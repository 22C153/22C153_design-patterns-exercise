package com.project.smartoffice.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    private int id;
    private int capacity;
    private boolean occupied;
    private List<RoomObserver> observers = new ArrayList<>();

    public Room(int id, int capacity) {
        this.id = id;
        this.capacity = capacity;
        this.occupied = false;
    }

    public int getId() { return id; }
    public int getCapacity() { return capacity; }
    public void setCapacity(int capacity) { this.capacity = capacity; }
    public boolean isOccupied() { return occupied; }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
        notifyObservers();
    }

    public void addObserver(RoomObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for(RoomObserver obs : observers) {
            obs.update(this);
        }
    }
}
