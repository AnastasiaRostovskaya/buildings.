 public class Flat {
    // Константы для значений по умолчанию
    private static final int DEFAULT_ROOMS = 2;
    private static final double DEFAULT_SQUARE = 50.0;

    // Переменные для хранения данных о квартире
    private double square; // площадь
    private int quantity; // количество комнат

    // Конструктор 1 по умолчанию
    public Flat() {
        square = DEFAULT_SQUARE;
        quantity = DEFAULT_ROOMS;
    }

    // Конструктор 2 с указанной площадью и 2 комнатами
    public Flat(double square) {
        this.square = square;
        quantity = DEFAULT_ROOMS;
    }

    // Конструктор 3 с указанной площадью и количеством комнат
    public Flat(double square, int quantity) {
        this.square = square;
        this.quantity = quantity;
    }

    // Метод для получения площади квартиры
    public double getSquare() {
        return square;
    }

    // Метод для изменения площади квартиры
    public void setSquare(double square) {
        this.square = square;
    }

    // Метод для получения количества комнат в квартире
    public int getQuantity() {
        return quantity;
    }

    // Метод для изменения количества комнат в квартире
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getRooms() {
        return 0;
    }
}



