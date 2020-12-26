import org.apache.log4j.BasicConfigurator;


import java.time.LocalDate;
import java.util.logging.Logger;

public class DateMethod {

    static final Logger log = Logger.getLogger(String.valueOf(DateMethod.class));

    public static void main(String[] args) throws InterruptedException {

        BasicConfigurator.configure();

        LocalDate localDate = LocalDate.now();

        log.info("현재년월 : " + localDate);

        log.info("현재년도" + localDate.getYear());
        log.info("현재월 : " + localDate.getMonth());
        log.info("현재월 : " + localDate.getMonthValue());


    }
}
