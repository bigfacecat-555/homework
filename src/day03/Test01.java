package day03;

import java.util.Calendar;
import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 * @author Bonnie
 *
 */
public class Test01 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        date = calendar.getTime();
        System.out.println(date);
        calendar.add(Calendar.DATE,3);
        date = calendar.getTime();
        System.out.println(date);

    }

}
