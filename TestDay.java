/**
 * @author spyin
 * @title: TestDay
 * @projectName MyEnumm
 * @description: TODO
 * @date 2021/8/1418:39
 */
public class TestDay {
   public static void main(String[] args) {
      MyDay day =  MyDay.monday;
      Day day1 = Day.monday;
      System.out.println(day1.name());
      System.out.println(day1.ordinal());
      String name = day1.toString();
      System.out.println(name);
      Day[] valus = Day.values();
      Day d = Day.valueOf("monday");
      System.out.println(d);

   }


}
