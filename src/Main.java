import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        float num1;
        float num2;
        int opcion;
        float resultado;
        JOptionPane.showMessageDialog(null, "Bienvenido a la Calculadora");
        String Operaciones = JOptionPane.showInputDialog(null,"Ingrese la opcion:" + "\n" + "1.Sumar" + "\n" + "2.Restar" + "\n" + "3.Multiplicar" + "\n" + "4.Dividir");
        switch (Operaciones) {
            case "1":
                num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
                num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
                resultado = num1 + num2;
                JOptionPane.showMessageDialog(null, resultado);
                break;
            case "2":
                num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
                num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
                resultado = num1 - num2;
                JOptionPane.showMessageDialog(null, resultado);
                break;
            case "3":
                num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
                num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
                resultado = num1 * num2;
                JOptionPane.showMessageDialog(null, resultado);
                break;

            case "4":
                num1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el primer numero"));
                num2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Ingrese el segundo numero"));
                resultado = num1 / num2;
                JOptionPane.showMessageDialog(null, resultado);
                break;
        }
    }
}


