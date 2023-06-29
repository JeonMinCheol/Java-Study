package Enum;

import java.util.Calendar;

public class enumMain {

    public static void main(String[] args) {

        enumCreate banana = null; // 선언 시 타입만 적는다.

        banana = enumCreate.banana;
        System.out.println("em = " + banana);

        Calendar now = Calendar.getInstance(); // Calander 객체를 생성하고 변수에 주소를 대입
        int year = now.get(Calendar.YEAR);
        int month = now.get(Calendar.MONTH);
        int date = now.get(Calendar.DATE);

        System.out.println(year + "년 " + month + "월 " + date + "일");

        final int DAY_OF_WEEK = Calendar.DAY_OF_WEEK;
        int today = -1;

        switch(DAY_OF_WEEK){
            case 1:
                today = now.get(Calendar.SUNDAY); break;
            case 2:
                today = now.get(Calendar.MONDAY); break;
            case 3:
                today = now.get(Calendar.TUESDAY); break;
            case 4:
                today = now.get(Calendar.WEDNESDAY); break;
            case 5:
                today = now.get(Calendar.THURSDAY); break;
            case 6:
                today = now.get(Calendar.FRIDAY); break;
            case 7:
                today = now.get(Calendar.SATURDAY); break;
        }

        System.out.println("today = " + today);
    }
}
