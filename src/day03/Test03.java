package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。
 * @author Bonnie
 *
 */
public class Test03 {
    public static void main(String[] args) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        calendar.set(Calendar.YEAR,s);
        s = scanner.nextInt();
        s = s-1;
        calendar.set(Calendar.MONTH,s);
        s = scanner.nextInt();
        calendar.set(Calendar.DATE,s);
        date = calendar.getTime();
        System.out.println(sdf.format(date));
        Date date1 = new Date();
        System.out.println((date1.getTime() - date.getTime()) / (1000 * 60 * 60 * 24 * 7));
    }
}
