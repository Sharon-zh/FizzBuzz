public class Reduce {
    public static int main(Integer n) {
        int num = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            }else {
                n--;
            }
            num++;
        }
        return num;
    }
}