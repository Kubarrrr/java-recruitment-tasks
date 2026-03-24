import java.util.Arrays;

public class Zad6 {


    //Version 1
    public boolean isZeroInNumber(int number) {
        int temp = number;
        while (temp != 0) {
            if (temp % 10 == 0) {
                return true;
            }
            temp = temp / 10;
        }

        return false;
    }

    public void findNumber(int N) {
        int A = 1;
        int B = N - A;

        while (isZeroInNumber(A) || isZeroInNumber(B)) {
            A++;
            B = N - A;
        }

        System.out.println(A + " + " + B + " = " + N);
    }

    //Version 2
    public void findNumber2(int N) {
        int A = 1;
        int B = N - A;

        while (String.valueOf(A).contains("0") || String.valueOf(B).contains("0")) {
            A++;
            B = N - A;
        }

        System.out.println(A + " + " + B + " = " + N);
    }

    void main(String[] args) {
        findNumber(10550709);
        findNumber2(10550709);
    }
}
