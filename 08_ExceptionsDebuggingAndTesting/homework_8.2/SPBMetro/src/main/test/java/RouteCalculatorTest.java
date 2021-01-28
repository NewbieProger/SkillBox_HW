import core.Line;
import core.Station;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RouteCalculatorTest extends TestCase {

    List<Station> stationsList;
    List<Station> connectLine1Line2;
    List<Station> connectLine2Line3;
    List<Line> lines;
    StationIndex testScheme;
    RouteCalculator routeCalculator;


    @Override

    public void setUp() throws Exception {
        testScheme = new StationIndex();
        stationsList = new ArrayList<>();
        routeCalculator = new RouteCalculator(testScheme);
        lines = new ArrayList<>();

        connectLine1Line2 = new ArrayList<>();
        connectLine2Line3 = new ArrayList<>();


        Line line1 = new Line(1, "Первая");
        Line line2 = new Line(2, "Вторая");
        Line line3 = new Line(3, "Третья");
        line1.addStation(new Station("Невская", line1));
        line1.addStation(new Station("Ленина", line1));
        line1.addStation(new Station("Идеевская", line1)); //Пересадка 1 -> 2 (Булина)
        line1.addStation(new Station("Проспект", line1));

        line2.addStation(new Station("Горького", line2));
        line2.addStation(new Station("Булина", line2));
        line2.addStation(new Station("Хачапупя", line2)); //Пересадка 2 -> 3 (Деревня)

        line3.addStation(new Station("Комповская", line3));
        line3.addStation(new Station("Интовская", line3));
        line3.addStation(new Station("Деревня", line3));

        lines.add(line1);
        lines.add(line2);
        lines.add(line3);

        lines.stream()
                .map(Line::getStations)
                .forEach(s -> {
                    s.forEach(station -> testScheme.addStation(station));
                });

//        System.out.println(testScheme.getStation("Проспект"));
//        System.out.println(testScheme.getStation("Булина"));
//        System.out.println(testScheme.getStation("Деревня"));
//        testScheme.addStation(line1);
//        testScheme.addStation(line2);
//        testScheme.addStation(line3);


//        testScheme.addStation(new Station("Невская", line1));
//        testScheme.addStation(new Station("Ленина", line1));
//        testScheme.addStation(new Station("Идеевская", line1));
//        testScheme.addStation(new Station("Проспект", line1));
//        testScheme.addStation(new Station("Горького", line2));
//        testScheme.addStation(new Station("Булина", line2));
//        testScheme.addStation(new Station("Хачапупя", line2));
//        testScheme.addStation(new Station("Комповская", line3));
//        testScheme.addStation(new Station("Интовская", line3));
//        testScheme.addStation(new Station("Деревня", line3));

        testScheme.addLine(line1);
        testScheme.addLine(line2);
        testScheme.addLine(line3);


        connectLine1Line2.add(testScheme.getStation("Идеевская"));
        connectLine1Line2.add(testScheme.getStation("Булина"));

        connectLine2Line3.add(testScheme.getStation("Хачапупя"));
        connectLine2Line3.add(testScheme.getStation("Деревня"));

        testScheme.addConnection(connectLine1Line2);
        testScheme.addConnection(connectLine2Line3);
    }

    public void testGetShortestRoute_NoConnections() {
        ArrayList<Station> expected = new ArrayList<>();
        expected.add(testScheme.getStation("Невская"));
        expected.add(testScheme.getStation("Ленина"));
        expected.add(testScheme.getStation("Идеевская"));
        expected.add(testScheme.getStation("Проспект"));

        List<Station> actual = routeCalculator.getShortestRoute(testScheme.getStation("Невская"), testScheme.getStation("Проспект"));

        assertEquals(expected, actual);
    }

    public void testGetShortestRoute_OneConnections() {
        ArrayList<Station> expected = new ArrayList<>();
        expected.add(testScheme.getStation("Невская"));
        expected.add(testScheme.getStation("Ленина"));
        expected.add(testScheme.getStation("Идеевская"));
        expected.add(testScheme.getStation("Булина"));
        expected.add(testScheme.getStation("Горького"));

        List<Station> actual = routeCalculator.getShortestRoute(testScheme.getStation("Невская"), testScheme.getStation("Горького"));

        assertEquals(expected, actual);
    }

    public void testGetShortestRoute_TwoConnections() {
        ArrayList<Station> expected = new ArrayList<>();
        expected.add(testScheme.getStation("Невская"));
        expected.add(testScheme.getStation("Ленина"));
        expected.add(testScheme.getStation("Идеевская"));
        expected.add(testScheme.getStation("Булина"));
        expected.add(testScheme.getStation("Хачапупя"));
        expected.add(testScheme.getStation("Деревня"));
        expected.add(testScheme.getStation("Интовская"));
        expected.add(testScheme.getStation("Комповская"));

        List<Station> actual = routeCalculator.getShortestRoute(testScheme.getStation("Невская"), testScheme.getStation("Комповская"));

        assertEquals(expected, actual);
    }

    public void testCalculateDuration() {
        double expectedDuration = 19.5;

        double actualDuration = RouteCalculator.calculateDuration(
                routeCalculator.getShortestRoute(testScheme.getStation("Невская"),
                testScheme.getStation("Комповская")));

        assertEquals(expectedDuration, actualDuration);
    }

}
