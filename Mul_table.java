public class Main {
    public static void Mul_table(String[] args) {
        for (int start=1; start<=9;start+=3){
          for (int dan= start; dan<=start+2; dan++){
             System.out.printf("%-10s", dan + "단");

          }
          System.out.println();
          for (int i=1;i<=9;i++){
            for(int dan= start;dan<=start+2;dan++){
              System.out.printf("%-10s", dan+"*"+i+"="+(dan*i));
            }
            System.out.println();
            
          }
          System.out.println();
        }
}
}
