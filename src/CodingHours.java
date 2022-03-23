public class CodingHours {
    public static void main(String[] args) {
       int oneWeek = 7;
       int allSemestr = oneWeek * 17;
        System.out.println("all semestr is  " + allSemestr+ " days");
        int spendingHourWeek = 5*6;
        int hoursSpendCoding = (allSemestr*spendingHourWeek)/oneWeek;
        System.out.println(hoursSpendCoding);
     int hoursPerWeek = 52;
     int oursSpent = allSemestr*52/oneWeek;
        System.out.println(oursSpent+ " hours");
        int allhours = allSemestr*24;
        System.out.println(allhours);
      int percentage = oursSpent*100/allhours;
        System.out.println(percentage + "%");
    }
}
