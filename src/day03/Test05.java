package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 实现时间的计算: 要求用户输入身份证号，若格式有误，要求其重新输入。然后根据身份证号码输出20岁生日
 * 所在周的周三的日期。
 * 例如:
 * 出生日期:1992-07-15。
 * 20岁生日:2012-07-15
 * 当周的周三为:2012-07-18
 * @author Bonnie
 *
 */
public class Test05 {

    private static void checkCard(){
        String regex = "\\d{17}(\\d||[X])";
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.matches(regex)){
            Date date = new Date();
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            calendar.set(Calendar.YEAR,Integer.valueOf(a.substring(6,10)));
            calendar.set(Calendar.MONTH,Integer.valueOf(a.substring(10,12))-1);
            calendar.set(Calendar.DATE,Integer.valueOf(a.substring(12,14)));
            calendar.add(Calendar.YEAR,20);
            date = calendar.getTime();
            System.out.println(sdf.format(date));
            calendar.set(Calendar.DAY_OF_WEEK,4);
            date = calendar.getTime();
            System.out.println(sdf.format(date));
        }else {
            System.out.println("身份证格式有误，请重新输入");
            checkCard();
        }
    }
    public static void main(String[] args) {
        checkCard();
    }
}
