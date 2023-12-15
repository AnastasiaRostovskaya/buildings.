package org.example;

import org.example.impl.Building;
import org.example.impl.Floor;
import org.example.impl.Space;

public class OfficeDwelling1 {
    private DwellingFloor[] floors;

    // Конструктор 1
    public void Dwelling(int numberOfFloors, int[] numberOfFlatsPerFloor) {
        if (numberOfFloors != numberOfFlatsPerFloor.length) {
            throw new IllegalArgumentException("Number of floors must match the length of numberOfFlatsPerFloor array");
        }

        floors = new DwellingFloor[numberOfFloors];
        for (int i = 0; i < numberOfFloors; i++) {
            floors[i] = new DwellingFloor(numberOfFlatsPerFloor[i]);
        }
    }

    // Конструктор 2
    public OfficeDwelling1(DwellingFloor[] floorsArray) {
        floors = floorsArray;
    }

    // Метод для получения общего количества этажей дома
    public int getDwellingFloorQuantity() {
        return floors.length;
    }

    // Метод для получения общего количества квартир дома
    public int getFlatsQuantity() {
        int totalFlats = 0;
        for (DwellingFloor floor : floors) {
            totalFlats += floor.getTotalFlats();
        }
        return totalFlats;
    }

    // Метод для получения общей площади квартир дома
    public double getFlatsSquare() {
        double totalSquare = 0;
        for (DwellingFloor floor : floors) {
            totalSquare += floor.getFlatsSquare();
        }
        return totalSquare;
    }

    // Метод для получения общего количества комнат дома
    public int getRoomsQuantity() {
        int totalRooms = 0;
        for (DwellingFloor floor : floors) {
            totalRooms += floor.getFlatsQuantity();
        }
        return totalRooms;
    }

    // Метод для получения массива этажей жилого дома
    public DwellingFloor[] getDwellingFloors() {
        return floors;
    }

    // Метод для получения объекта этажа по его номеру в доме
    public DwellingFloor getDwellingFloor(int index) {
        if (index >= 0 && index < floors.length) {
            return floors[index];
        } else {
            throw new IllegalArgumentException("Invalid floor index");
        }
    }

    // Метод для изменения этажа по его номеру в доме и ссылке на обновленный этаж
    public void setDwellingFloor(int index, DwellingFloor newDwellingFloor) {
        if (index >= 0 && index < floors.length) {
            floors[index] = newDwellingFloor;
        } else {
            throw new IllegalArgumentException("Invalid floor index");
        }
    }
}
class OfficeDwelling implements Building {
    private Floor[] floors;

    @Override
    public int getFloorsQuantity() {
        return floors.length;
    }

    @Override
    public int getTotalFlats() {
        int totalFlats = 0;
        for (Floor floor : floors) {
            totalFlats += floor.getTotalFlats();
        }
        return totalFlats;
    }

    @Override
    public int getFlatsSquare() {
        return 0;
    }

    @Override
    public int getFlatsQuantity() {
        return 0;
    }

    @Override
    public Floor[] getFloors() {
        return new Floor[0];
    }

    @Override
    public Floor getFloor(int index) {
        return null;
    }

    @Override
    public void setFloor(int index, Floor newFloor) {

    }

    @Override
    public Space getSpace(int index) {
        return null;
    }

    @Override
    public void setSpace(int index, Space newSpace) {

    }

    @Override
    public void addSpace(int index, Space newSpace) {

    }

    @Override
    public void deleteSpace(int index) {

    }

    // ... (другие методы интерфейса Building)

    // Имплементация методов, использующая интерфейсы Space и Floor вместо прямого указания классов Flat и DwellingFloor
    @Override
    public Space getBestSpaceBySquare() {
        Space bestSpace = null;
        double maxSquare = 0;
        for (Floor floor : floors) {
            for (Space space : floor.getFlats()) {
                if (space.getSquare() > maxSquare) {
                    maxSquare = space.getSquare();
                    bestSpace = space;
                }
            }
        }
        return bestSpace;
    }

    @Override
    public Space[] getSortSpacesBySquare(int order) {
        // Реализация сортировки
        //...
        return new Space[0];
    }
}
class OfficeDwelling2 implements Building {
    private Floor[] floors;

    @Override
    public int getFloorsQuantity() {
        return floors.length;
    }

    @Override
    public int getTotalFlats() {
        int totalFlats = 0;
        for (Floor floor : floors) {
            totalFlats += floor.getTotalFlats();
        }
        return totalFlats;
    }

    @Override
    public int getFlatsSquare() {
        return 0;
    }

    @Override
    public int getFlatsQuantity() {
        return 0;
    }

    @Override
    public Floor[] getFloors() {
        return new Floor[0];
    }

    @Override
    public Floor getFloor(int index) {
        return null;
    }

    @Override
    public void setFloor(int index, Floor newFloor) {

    }

    @Override
    public Space getSpace(int index) {
        return null;
    }

    @Override
    public void setSpace(int index, Space newSpace) {

    }

    @Override
    public void addSpace(int index, Space newSpace) {

    }

    @Override
    public void deleteSpace(int index) {

    }

    // ... (другие методы интерфейса Building)

    // Имплементация методов, использующая интерфейсы Space и Floor вместо прямого указания классов Flat и DwellingFloor
    @Override
    public Space getBestSpaceBySquare() {
        Space bestSpace = null;
        double maxSquare = 0;
        for (Floor floor : floors) {
            for (Space space : floor.getFlats()) {
                if (space.getSquare() > maxSquare) {
                    maxSquare = space.getSquare();
                    bestSpace = space;
                }
            }
        }
        return bestSpace;
    }

    @Override
    public Space[] getSortSpacesBySquare(int order) {
        // Реализация сортировки
        //...
        return new Space[0];
    }
}
