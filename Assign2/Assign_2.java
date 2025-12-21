import javax.swing.JOptionPane;

public class Assign_2 {

    public static void main(String[] args) {

        String Input1 = JOptionPane.showInputDialog("Enter the first number: ");
        double num_1 = Double.parseDouble(Input1);

        String Input2 = JOptionPane.showInputDialog("Enter the second number: ");
        double num_2 = Double.parseDouble(Input2);

        double sum = num_1 + num_2;
        double difference = num_1 - num_2;
        double product = num_1 * num_2;
        double quotient = num_1 / num_2;
        double modulo = num_1 % num_2;

        String result
                = "SUM: " + num_1 + " + " + num_2 + " = " + sum
                + "\nDIFFERENCE: " + num_1 + " - " + num_2 + " = " + difference
                + "\nPRODUCT: " + num_1 + " * " + num_2 + " = " + product
                + "\nQUOTIENT: " + num_1 + " / " + num_2 + " = " + quotient
                + "\nMODULO: " + num_1 + " % " + num_2 + " = " + modulo;

        JOptionPane.showMessageDialog(null, result, "Calculator Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
