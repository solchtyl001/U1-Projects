import javax.swing.JOptionPane;
public class Sales {

    /*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */
    public static void main(String[] args) {
        String price;
        String discount;
        String amount;
        String salesTax;

        JOptionPane.showMessageDialog(null, "please add a .0 to all whole numbers");

        price = JOptionPane.showInputDialog("What is sales price?");
        discount = JOptionPane.showInputDialog("What is discount(decimal)?");
        amount = JOptionPane.showInputDialog("How many are you buying?");
        salesTax= JOptionPane.showInputDialog("what is tax(decimal?");

        Double.parseDouble(price);
        Double.parseDouble(discount);
        Double.parseDouble(amount);
        Double.parseDouble(salesTax);

        






    }




    }

