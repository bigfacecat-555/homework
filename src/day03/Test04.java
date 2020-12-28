package day03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**2018-03-25
 * 输入一个生产日期格式"yyyy-MM-dd",再输入一个数字(保质期的天数)。
 * 然后经过计算输出促销日期，促销日期为:该商品过期日前2周的周三
 * @author Bonnie
 * 
 */
public class Test04 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        calendar.set(Calendar.YEAR,s);
        s = scanner.nextInt();
        s -=1;
        calendar.set(Calendar.MONTH,s);
        s = scanner.nextInt();
        calendar.set(Calendar.DATE,s);
        date = calendar.getTime();
        System.out.println(sdf.format(date));
        s = scanner.nextInt();
        System.out.println("保质期为:" + s);
        calendar.add(Calendar.DATE,s);
        calendar.add(Calendar.DATE,-14);
        calendar.set(Calendar.DAY_OF_WEEK,4);
        Date date1 = new Date();
        date1 = calendar.getTime();
        System.out.println(sdf.format(date1));
    }
}
