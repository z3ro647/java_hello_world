public class App {

    // Function to perform left padding
    public static String leftPadding(String input, char ch, int L) {

        String result = String

                // First left pad the string
                // with space up to length L
                .format("%" + L + "s", input)

                // Then replace all the spaces
                // with the given character ch
                .replace(' ', ch);

        // Return the resultant string
        return result;
    }

    // Function to perform right padding
    public static String rightPadding(String input, char ch, int L) {

        String result = String

                // First right pad the string
                // with space up to length L
                .format("%" + (-L) + "s", input)

                // Then replace all the spaces
                // with the given character ch
                .replace(' ', ch);

        // Return the resultant string
        return result;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        
        System.out.println("My name is Vivek");

        System.out.println("We are learning Java.");

        System.out.println(123);

        System.out.println(123.456);

        System.out.println("The cost of a new computer is $1099.98");

        System.out.println("The cost of a new computer is $" + 1099.98);

        System.out.println("The cost of a new computer is $" + 1099.9823234);

        // printf lets you define a format with format specifiers (denoted with the %
        // sign), followed by arguments (values),
        // that will take the place of the format specifiers when printed
        // e.g.
        // %s will accept a string
        // %f will accept a floating point number (i.e. number with decimal points)
        // %.2f will round a floating point number to 2 decimal places
        System.out.printf("%s $%.2f", "The cost of a new computer is", 1099.987342);

        System.out.println();

        String sr = "vivek";
        int l = 8;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < l - sr.length()) {
            sb.append('0');
        }
        sb.append(sr);
        System.out.println(sb);

        String sr1 = "kumar";
        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < sr1.length(); i++) {
            sb1.append(' ');
        }
        System.out.println(sr1.length() + " " + sr1);

        //System.out.printf("%" + l + "s", sr);

        String sr2 = String.format("%" + l + "s", sr).replace(' ', '*');
        System.out.println(sr2);

        System.out.println();

        // String.format("%1$" + l + "s", sr).replace(' ', '0');

        String str = "GeeksForGeeks"; 
        char ch = '-'; 
        int L = 20; 
  
        System.out.println( 
            leftPadding(str, ch, L)); 
        System.out.println( 
            rightPadding(str, ch, L)); 
    }
}
