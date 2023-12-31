package org.example;

public class DwellingFloor {
    private office[] flats;

    // Конструктор 1
    public DwellingFloor(int numberOfFlats) {
        flats = new office[numberOfFlats];
        for (int i = 0; i < numberOfFlats; i++) {
            flats[i] = new office();
        }
    }
    // Конструктор 2
    public DwellingFloor(office[] flatsArray) {
        flats = flatsArray;
    }

    // Метод для получения количества квартир на этаже
    public int getTotalFlats() {
        return flats.length;
    }

    // Метод для получения общей площади квартир этажа
    public double getFlatsSquare() {
        double totalSquare = 0;
        for (office flat : flats) {
            totalSquare += flat.getSquare();
        }
        return totalSquare;
    }

    // Метод для получения общего количества комнат этажа
    public int getFlatsQuantity() {
        int totalRooms = 0;
        for (office flat : flats) {
            totalRooms = totalRooms + flat.getRooms();
        }
        return totalRooms;
    }

    // Метод для получения массива квартир этажа
    public office[] getFlats() {
        return flats;
    }

    // Метод для получения объекта квартиры по ее номеру на этаже
    public office getFlat(int index) {
        if (index >= 0 && index < flats.length) {
            return flats[index];
        } else {
            throw new IllegalArgumentException("Invalid flat index");
        }
    }

    // Метод для изменения квартиры по ее номеру на этаже и ссылке на новую квартиру
    public void setFlat(int index, office newFlat) {
        if (index >= 0 && index < flats.length) {
            flats[index] = newFlat;
        } else {
            throw new IllegalArgumentException("Invalid flat index");
        }
    }

    // Метод для добавления новой квартиры на этаже по будущему номеру квартиры
    // и ссылке на объект новой квартиры
    public void addFlat(int index, office newFlat) {
        if (index >= 0 && index <= flats.length) {
            office[] newFlats = new office[flats.length + 1];
            System.arraycopy(flats, 0, newFlats, 0, index);
            newFlats[index] = newFlat;
            System.arraycopy(flats, index, newFlats, index + 1, flats.length - index);
            flats = newFlats;
        } else {
            throw new IllegalArgumentException("Invalid flat index");
        }
    }

    // Метод для удаления квартиры по ее номеру на этаже
    public void deleteFlat(int index) {
        if (index >= 0 && index < flats.length) {
            office[] newFlats = new office[flats.length - 1];
            System.arraycopy(flats, 0, newFlats, 0, index);
            System.arraycopy(flats, index + 1, newFlats, index, flats.length - index - 1);
            flats = newFlats;
        } else {
            throw new IllegalArgumentException("Invalid flat index");
        }
    }

    // Метод для получения самой большой по площади квартиры этажа
    public office getBestSquare() {
        office bestFlat = flats[0];
        for (office flat : flats) {
            if (flat.getSquare() > bestFlat.getSquare()) {
                bestFlat = flat;
            }
        }
        return bestFlat;
    }
}
