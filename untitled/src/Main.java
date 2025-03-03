import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int number = getInputNumber();

        int sum = sumOfNumbers(number);

        System.out.println(sum);
    }

    static int sumOfNumbers(int n) {
        return 0;
    }

    boolean testSumOfNumbers() {
        return sumOfNumbers(3) == 6; // 3 + 2 + 1 + 0 = 6
    }

    static int getInputNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        int num = scan.nextInt();

        scan.close();
        return num;
    }
    int gaussianSumOfNumbers(int n) {
        return 0;
        }

        }



            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.




