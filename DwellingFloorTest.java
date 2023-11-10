import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DwellingFloorTest {
    private DwellingFloor floor = new DwellingFloor(5);

    @Test
    void getTotalFlats() {
        int rezult = floor.getTotalFlats();
        int prov = 5;

        assertEquals(rezult, prov);
    }

    @Test
    void getFlatsSquare() {
    }

    @Test
    void getFlatsQuantity() {
    }

    @Test
    void getFlats() {
    }

    @Test
    void getFlat() {
    }

    @Test
    void setFlat() {
    }

    @Test
    void addFlat() {
    }

    @Test
    void deleteFlat() {
    }

    @Test
    void getBestSquare() {
    }
}