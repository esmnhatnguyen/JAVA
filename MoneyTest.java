import java.util.Scanner;
public class MoneyTest{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int money;
        while (true){
            System.out.print("금액은 입력해주세요(0~99.999): ");
            money= sc.nextInt();
            if (0<money && money<99999){
                break;
            }
        }
        int count_50= money/50000;
        money %= 50000;
        int count_10=money/10000;
        money %= 10000;
        int count_5= money/5000;
        money %= 5000;
        int count_1=money/1000;
        money %= 1000;
        int count_coin_500= money/500;
        money %= 500;
        int count_coin_100= money/100;
        money %=100;
        int count_coin_50= money/50;
        money %=50;
        int count_coin_10= money/10;
        System.out.println("오만 원권 : " + count_50 + "장");
        System.out.println("만 원권 : " + count_10 + "장");
        System.out.println("오천 원권 : " + count_5 + "장");
        System.out.println("천 원권 : " + count_1 + "장");
        System.out.println("500원 주화 : " + count_coin_500 + "개");
        System.out.println("100원 주화 : " + count_coin_100 + "개");
        System.out.println("50원 주화 : " + count_coin_50 + "개");
        System.out.println("10원 주화 : " + count_coin_10 + "개");

        sc.close();

    }
}
