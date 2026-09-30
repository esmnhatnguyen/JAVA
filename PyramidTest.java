public class PyramidTest{
  public static void main(String[]args){
    int rows=6;
    for (int i=1;i<=6;i++){
      for (int space=1;space<= rows-i;space++){
        System.out.print("  ");
      }
      for (int num=i; num>=1;num--){
        System.out.print(num + " ");
      }
      for (int num=2;num<=i;num++){
        System.out.print(num + " ");
      }
      System.out.println();
}
  }}
