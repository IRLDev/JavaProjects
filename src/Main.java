/**
 * Created by endam on 14/12/2016.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! ");
        System.out.println("Hello whats New");

        int i = 1, j = 10;
        do
        {
            if(i++ > --j) /* Line 4 */
            {
                continue;
            }
        } while (i < 5);
        System.out.println("i = " + i + " and j = " + j); /* Line 9 */
    }
}
// Comment add as a test 18/01/2017
