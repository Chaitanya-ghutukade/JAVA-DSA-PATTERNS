public class Hollow_rectangle_pattern {

    public static void hollow_rectangle(int row,int col) {
        //Outer loop --> no. of rows
        for (int i = 1; i <= row; i++) {
            //Inner loop --> no. of col
            for (int j = 1; j <= col; j++) {
                //Cell -- i,j
                if (i == 1 || j == 1 || i == 4 || j == 5) {
                    System.out.print(" *"); //boundary lines

                } else {
                    System.out.print("  ");
                }
            }
              System.out.println();
        }
    }
    public static void main(String[] args){

        hollow_rectangle(4,5);

    }


}
