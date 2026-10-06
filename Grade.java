import java.util.Scanner;
public class Grade{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.print("수험자의 이름을 입력하시오. ==>");
    String name= sc.next();
    System.out.print("국어점수를 입력하시오.  ==>");
    double kor_score= sc.nextDouble();
    System.out.print("영어점수를 입력하시오.  ==>");
    double eng_score= sc.nextDouble();
    System.out.print("수학점수를 입력하시오.  ==>");
    double math_score= sc.nextDouble();
    System.out.println("==================================");
    double total_score= kor_score+ math_score+ eng_score;
    double average_score= total_score/3;
    if (average_score>=90){
      System.out.printf("%s 씨는 총점 %.2f, 평균 %.2f으로 성적은 A입니다.%n",name, total_score, average_score);
    }
    if(80<=average_score && average_score<90){
      System.out.printf("%s 씨는 총점 %.2f, 평균 %.2f으로 성적은 B입니다.%n",name, total_score, average_score);
    }
    if (70<=average_score && average_score<80){
      System.out.printf("%s 씨는 총점 %.2f, 평균 %.2f으로 성적은 C입니다.%n",name, total_score, average_score);
    }
    if (60<=average_score && average_score<70){
      System.out.printf("%s 씨는 총점 %.2f, 평균 %.2f으로 성적은 D입니다.%n",name, total_score, average_score);
    }
    if (average_score<60){
      System.out.printf("%s 씨는 총점 %.2f, 평균 %.2f으로 성적은 F입니다.%n",name, total_score, average_score);
    }
    sc.close();

  }
}
