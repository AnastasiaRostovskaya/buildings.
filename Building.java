package org.example.impl;

// Интерфейс Building
public interface Building {
    int getFloorsQuantity();
    int getTotalFlats();
    int getFlatsSquare();
    int getFlatsQuantity();
    Floor[] getFloors();
    Floor getFloor(int index);
    void setFloor(int index, Floor newFloor);
    Space getSpace(int index);
    void setSpace(int index, Space newSpace);
    void addSpace(int index, Space newSpace);
    void deleteSpace(int index);
    Space getBestSpaceBySquare();
    Space[] getSortSpacesBySquare(int order);
}