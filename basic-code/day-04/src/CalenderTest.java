import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalenderTest {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);           // 得到月初
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();             // 得到是第几天
//        System.out.println(date);
//        System.out.println(value);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");  // 输出表头
        for (int i = 0; i < value + 3; i++) {           // 输出value+1个占位符（需要计算）
            System.out.print("  ");
        }
        while (date.getMonthValue() == month)           // 当前月
        {
            System.out.printf("%3d", date.getDayOfMonth());     // 输出日期
            if(date.getDayOfMonth() == today) {         // 标记今天
                System.out.print("*");
            }
            else {                                      // 否则空格占位
                System.out.print(" ");
            }
            date = date.plusDays(1);                    // 生成下一天的日期
            if(date.getDayOfWeek().getValue() == 7) {   // 周日换行
                System.out.println();
            }
        }
        if(date.getDayOfWeek().getValue() != 1){        // 下一月换行
            System.out.println();
        }
    }
}
