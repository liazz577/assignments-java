package Interface;

import Interface.News;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            News n = new News();
            Scanner sc = new Scanner(System.in);
            n.RateList = new int[]{78, 8, 10};
            n.Calculate();
            System.out.println(n.AverageRate);
        }

}
