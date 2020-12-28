package day01;
/**
 * 将"大家好!"修改为:"大家好!我是程序员!"并输出。
 * 然后将"大家好!我是程序员!"修改为:"大家好!我是优秀的程序员!"并输出
 * 然后再修改为:"大家好!我是牛牛的程序员!"并输出
 * 然后在修改为:"我是牛牛的程序员!"并输出
 * @author Bonnie0
 * 使用StringBuilder完成
 */
public class Test02 {
	public static void main(String[] args) {
		StringBuilder stringBuilder =new StringBuilder("大家好!");
		test1(stringBuilder);
		test2(stringBuilder);
		test3(stringBuilder);
		test4(stringBuilder);

	}

	private static void test4(StringBuilder stringBuilder) {
		System.out.println(stringBuilder.delete(0, 4));
	}

	private static void test3(StringBuilder stringBuilder) {
		System.out.println(stringBuilder.replace(6, 9, "牛牛的"));
	}

	private static void test2(StringBuilder stringBuilder) {
		System.out.println(stringBuilder.insert(6, "优秀的"));
	}

	private static void test1(StringBuilder stringBuilder) {
		System.out.println(stringBuilder.append("我是程序员!"));
	}
}
