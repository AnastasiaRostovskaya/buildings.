public class Dwelling {
    private DwellingFloor[] floors;

    // Конструктор 1
    public Dwelling(int numberOfFloors, int[] numberOfFlatsPerFloor) {
        if (numberOfFloors != numberOfFlatsPerFloor.length) {
            throw new IllegalArgumentException("Number of floors must match the length of numberOfFlatsPerFloor array");
        }

        floors = new DwellingFloor[numberOfFloors];
        for (int i = 0; i < numberOfFloors; i++) {
            floors[i] = new DwellingFloor(numberOfFlatsPerFloor[i]);
        }
    }

    // Конструктор 2
    public Dwelling(DwellingFloor[] floorsArray) {
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