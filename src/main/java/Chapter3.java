import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Chapter3 {

    //todo:58

    public LocalDate convertStringToDateTime(String text){
        LocalDate date=LocalDate.parse(text);
        return date;
    }

    //todo:59
    public String formatingDateTime(){
      String date=LocalDate.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      return date;
    }

    //todo:60
    public void getTheCurrentTimeWithoutTime(){
        LocalDate onlyDate=LocalDate.now();
        LocalTime onlyTime=LocalTime.now();
    }

    //todo:61
    public void locatDateTimeFromLocalTimeAndLocalDate(){
        LocalDate date=LocalDate.now();
        LocalTime time=LocalTime.now();
        LocalDateTime dateAndTime=LocalDateTime.of(date,time);
    }

    //todo:62
    public void  instant(){

        Instant timestamp=Instant.now();

    }
}
