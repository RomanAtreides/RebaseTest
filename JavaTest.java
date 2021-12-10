public class JavaTest {
    public static void main(String[] args) {
        String s = " ";
        char space = ' ';
        int hex = 0xFF;
        int oct = 011;
        int bin = 0b1100;
        float f = 1.2F;

        System.out.println("Представление чисел в различных системах счисления\n");
        System.out.println("В шестнадцатеричной\n\tв восьмеричной\n\t\tв двоичной");
        System.out.println("0xFF\n" + hex + "\n\t011\n\t" + oct + "\n\t\t0b1100\n\t\t" + bin);

        if(hex > oct) System.out.println(hex + " is bigger then " + oct);

        char ch;

        for(ch = 'A'; ch <= 'Z'; ch++) {
            if(ch == 'Z') {
                System.out.print(ch);
            } else {
                System.out.print(ch + ", ");
            }
        }
        System.out.println();
    }
}
