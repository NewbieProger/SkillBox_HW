import com.skillbox.airport.Airport;
import com.skillbox.airport.Flight;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


    }

    public static LocalTime convertDate(Date inputDate) {

        LocalTime time = LocalDateTime.ofInstant(inputDate.toInstant(),
                ZoneId.systemDefault()).toLocalTime();

        return time;
    }


    public static List<Flight> findPlanesLeavingInTheNextTwoHours(Airport airport) {
        //TODO Метод должден вернуть список рейсов вылетающих в ближайшие два часа.

        List<Flight> flights = airport
                .getTerminals()
                .stream()
                .flatMap(t -> t.getFlights().stream())
                .filter(d -> d.getType().equals(Flight.Type.DEPARTURE))
                .filter(d -> convertDate(d.getDate()).isBefore(LocalTime.now().plusHours(2)))
                .collect(Collectors.toList());

        return flights;
    }

}























