package ex_03_Literals;

public class Lab034_Char_Literal {
    public static void main(String[] args) {
        char c1 = 'A';
        char c2 = 'B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //blank space


        // Escape Sequence
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("EswarLella");
        System.out.println("Eswar"+new_line+"Lella");
        System.out.println("Eswar\nLella");
        System.out.println("Eswar"+tab_line+"Lella");
        System.out.println("Eswar"+back_space+"Lella");
        System.out.println("Eswar"+carriage_return+"Lella");


        System.out.println(" ___________ ");
        System.out.println("Hi, This is a First line"+new_line+"This is second line\n This is Third line");

        char c10 = 'A';
        //  // ASCII, (limited numbers) - A -> 65

        char rupees = '₹';
        System.out.println(rupees);

        char my_laugh_smiley = '\u1f60'; // :)
        System.out.println(my_laugh_smiley);

        char c11 = '\u1F60';

        int binary = 0b1010;
        int hex = 0xFF;
        long amount = 1_00_000L;
        System.out.println(amount);


        // char A = "10"

        char c = 'A';
        System.out.println(c);




    }
}
