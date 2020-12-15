import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Logger;

public class ManNai {

    private static final Logger log = Logger.getLogger(String.valueOf(ManNai.class));

    public static void main(String[] args) {

        log.info("'-'를 포함한 주민등록 번호를 입력하세요.");
        Scanner sc = new Scanner(System.in);
        String temp = sc.next();
        int manAge = 0;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String today = format.format(new Date());
        log.info("오늘 날짜 확인: " + today);

        int thisYear = Integer.parseInt(today.substring(0,4));
        int thisMonth = Integer.parseInt(today.substring(4,6));
        int thisDay = Integer.parseInt(today.substring(6,8));

        int tempYear = Integer.parseInt(temp.substring(0,2));
        int tempMonth = Integer.parseInt(temp.substring(2,4));
        int tempDay = Integer.parseInt(temp.substring(4,6));

        if(temp.charAt(7)=='0' || temp.charAt(7)=='9') {
            tempYear = 1800 + tempYear;
        } else if(temp.charAt(7)=='1' || temp.charAt(7)=='2') {
            tempYear = 1900 + tempYear;
        } else if(temp.charAt(7)=='3' || temp.charAt(7)=='4') {
            tempYear = 2000 + tempYear;
        }
        manAge = thisYear-tempYear;
        log.info("계산 전 예측:" +manAge);

        if(tempMonth>thisMonth) {
            manAge=manAge-1;
            log.info("만 나이 계산 결과:"+manAge);
        }else if(tempMonth==thisMonth){
            if(tempDay>thisDay) {
                manAge=manAge-1;
                log.info("만 나이 계산 결과:"+manAge--);
            }else {
                log.info("만 나이 계산 결과:"+manAge);
            }
        }else {
            log.info("만 나이 계산 결과:"+manAge);
        }
    }
}
