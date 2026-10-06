import java.util.Scanner;

public class JuminTest {
    static int[] year_and_sex(int num, int year) {
        int sex;
        if (num == 9 || num == 0) year += 1800;
        else if (num == 1 || num == 2) year += 1900;
        else year += 2000;

        if (num == 9 || num == 1 || num == 3) sex = 1;
        else sex = 0;

        return new int[]{year, sex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요. ==> ");
        String name = sc.next();
        System.out.print("주민번호를 입력하세요.ex)xxxxxx-xxxxxxx ==> ");
        String id_card = sc.next();
        System.out.println("=============================================");

        int num = Integer.parseInt(id_card.substring(7, 8));
        int year = Integer.parseInt(id_card.substring(0, 2));
        int month = Integer.parseInt(id_card.substring(2, 4));
        int day = Integer.parseInt(id_card.substring(4, 6));
        int region_num = Integer.parseInt(id_card.substring(8, 9));

        int[] result = year_and_sex(num, year);
        year = result[0];
        int sex = result[1];

        String region = "";
        if (region_num == 0) region = "서울";
        else if (region_num == 1) region = "인천, 경기";
        else if (region_num == 2) region = "강원";
        else if (region_num == 3) region = "충북";
        else if (region_num == 4) region = "충남, 대전";
        else if (region_num == 5) region = "경북, 대구";
        else if (region_num == 6) region = "경남, 부산, 울산";
        else if (region_num == 7) region = "전북";
        else if (region_num == 8) region = "광주, 전남";
        else if (region_num == 9) region = "제주";

        System.out.printf("%s씨는 생일이 %d년%d월%d일이고%n", name, year, month, day);
        if (sex == 1) System.out.printf("남성으로 출생지는 %s입니다.%n", region);
        else System.out.printf("여성으로 출생지는 %s입니다.%n", region);

        sc.close();
    }
}
