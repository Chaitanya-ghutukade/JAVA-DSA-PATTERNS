public class Butterfly_pattern {
    public static void main(String[] args) {
        int n = 4;
        //first half of pattern
        for (int i = 1; i <= 4; i++) {
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }
            for (int b = 1; b <= n - i; b++) {
                System.out.print(" ");
            }
            for (int b = 1; b <= n - i; b++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= i; a++) {
                System.out.print("*");
            }

            System.out.println();

        }
        //second half of pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            for (int a = 1; a < i; a++) {
                System.out.print(" ");
            }

            for (int a = 1; a < i; a++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}

// other way to solve this problem
  /*  Stars + spaces + stars
  int  n=4;

  1st half:
  for(int i=1;i<=n;i++){
   stars - i
   for(int j=1;j<=i;j++){
   System.out.print("*");
   }

   spaces - 2*(n-i)
   for(int j=1;j<=2*(n-i);j++){
   System.out.print(" ");
   }

   stars - i
   for(int j=1;j<=i;j++){
   System.out.print("*");
   }

   System.out.println();
   }

   2nd half:
    for(int i=n;i>=1;i--){
    stars - i
    for(int j=1;j<=i;j++){
    System.out.print("*");
    }

    spaces - 2*(n-i)
    for(int j=;j<=2*(n-i);j++){
    System.out.print(" ");
    }

    stars = i
    for(int j=1;j<=i;j++){
    System.out.print("*");
        }
      }
    }






   */

