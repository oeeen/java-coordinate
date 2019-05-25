package coordinatecalculator.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PointsTest {
    @Test
    void create() {
        Points points = new Points(Arrays.asList(new Point("1", "2"), new Point("2", "2")));
        assertEquals(points, new Points(Arrays.asList(new Point("1", "2"), new Point("2", "2"))));
    }

    @Test
    void Point리스트_정렬_테스트() {
        Points points = new Points(Arrays.asList(new Point("2", "2"), new Point("1", "1"), new Point("1", "2"), new Point("2", "1")));

        assertEquals(Arrays.asList(new Point("1", "1"), new Point("1", "2"), new Point("2", "1"), new Point("2", "2")), points.getSortedPoints());
    }
}
