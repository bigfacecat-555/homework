package day04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 * 通过控制台输入3个日期(yyyy-MM-dd格式)，然后转换为Date对象后存入
 * 集合，然后对该集合排序后输出所有日期。
 * @author Bonnie
 *
 */
public class Test08 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Date> dates = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            String str = scanner.nextLine();
            Date date = sdf.parse(str);
            dates.add(date);
        }
        dates.sort((Comparator.naturalOrder()));
        for (int i = 0; i < 3; i++) {
            System.out.println(sdf.format(dates.get(i)));
        }
    }
}
