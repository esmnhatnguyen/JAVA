import java.util.Scanner;

public class game_369Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("1-99까지의 정수를 입력하세요. ==> ");
            num = sc.nextInt();

            if (num >= 1 && num <= 99) {
                break;
            }
        }

        String s = Integer.toString(num);
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '3' || c == '6' || c == '9') {
                count++;
            }
        }

        if (count == 1) {
            System.out.println("박수짝");
        } else if (count == 2) {
            System.out.println("박수짝짝");
        }

        sc.close();
    }
}
