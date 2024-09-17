import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora2 {
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Calculadora");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800,800);
        ventana.setLayout(null);

        JLabel etiqueta = new JLabel("CALCULADORA UAM");
        etiqueta.setBounds(335,0,200,50);
        ventana.add(etiqueta);


        JLabel etiqueta2 = new JLabel("NUMERO 1");
        etiqueta2.setBounds(150,100,200,50);
        ventana.add(etiqueta2);

        JLabel etiqueta3 = new JLabel("NUMERO 2");
        etiqueta3.setBounds(550,100,200,50);
        ventana.add(etiqueta3);

        String[] opciones = new String[4];
        opciones[0] = "SUMAR";
        opciones[1] = "RESTAR";
        opciones[2] = "MULTIPLICAR";
        opciones[3] = "DIVIDIR";
        JComboBox combo1 = new JComboBox(opciones);
        combo1.setBounds(310,200,150,30);
        ventana.add(combo1);

        JTextField campo1 = new JTextField();
        campo1.setBounds(110,150,150,30);
        ventana.add(campo1);

        JTextField campo2 = new JTextField();
        campo2.setBounds(510,150,150,30);
        ventana.add(campo2);

        JButton boton1 = new JButton("1");
        boton1.setBounds(250,300,50,50);
        ventana.add(boton1);
        boton1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String Num1 = "1";
                String primerNumero =  campo1.getText();
                String segundoNumero =  campo2.getText();
                if (primerNumero.equals("")) {
                    campo1.setText(Num1);
                }else if (segundoNumero.equals("")) {
                    campo2.setText(Num1);
                }else {
                    JOptionPane.showMessageDialog(null,"NO SE PUDE INGRESAR MAS NUMEROS" , "INFO" , JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        JButton boton2 = new JButton("2");
        boton2.setBounds(350,300,50,50);
        ventana.add(boton2);
        boton2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                String Num2 = "2";
                String primerNumero = campo1.getText();
                String segundoNumero = campo2.getText();
                if (primerNumero.equals("")) {
                    campo1.setText(Num2);
                }else if (segundoNumero.equals("")) {
                    campo2.setText(Num2);
                }else{
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS" , "INFO" , JOptionPane.INFORMATION_MESSAGE);

                }


            }
        });

        JButton boton3 = new JButton("3");
        boton3.setBounds(450,300,50,50);
        ventana.add(boton3);
        boton3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String Num3 = "3";
                String primerNumero = campo1.getText();
                String segundoNumero = campo2.getText();
                if (primerNumero.equals("")){
                    campo1.setText(Num3);
                }else if (segundoNumero.equals("")){
                    campo2.setText(Num3);
                }else{
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS" , "INFO" , JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        JButton boton4 = new JButton("4");
        boton4.setBounds(250,400,50,50);
        ventana.add(boton4);
        boton4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String Num4 = "4";
                String primerNumero = campo1.getText();
                String segundoNumero = campo2.getText();
                if(primerNumero.equals("")){
                    campo1.setText(Num4);
                }else if (segundoNumero.equals("")){
                    campo2.setText(Num4);
                }else{
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS" , "INFO" , JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        JButton boton5 = new JButton("5");
        boton5.setBounds(350,400,50,50);
        ventana.add(boton5);
        boton5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String Num5 = "5";
                String primerNumero = campo1.getText();
                String segundoNumero = campo2.getText();
                if(primerNumero.equals("")){
                    campo1.setText(Num5);
                }else if (segundoNumero.equals("")){
                    campo2.setText(Num5);
                }else{
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS" , "INFO" , JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        JButton boton6 = new JButton("6");
        boton6.setBounds(450,400,50,50);
        ventana.add(boton6);
        boton6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String Num6="6";
                String primerNumero = campo1.getText();
                String segundoNumero = campo2.getText();
                if(primerNumero.equals("")){
                    campo1.setText(Num6);
                }else if (segundoNumero.equals("")){
                    campo2.setText(Num6);
                }else{
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS" , "INFO" , JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

        JButton boton7 = new JButton("7");
        boton7.setBounds(250,500,50,50);
        ventana.add(boton7);
        boton7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String Num7="7";
                String primerNumero = campo1.getText();
                String segundoNumero = campo2.getText();
                if(primerNumero.equals("")){
                    campo1.setText(Num7);
                }else if (segundoNumero.equals("")){
                    campo2.setText(Num7);
                }else{
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS" , "INFO" , JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

        JButton boton8 = new JButton("8");
        boton8.setBounds(350,500,50,50);
        ventana.add(boton8);
        boton8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String Num8="8";
                String primerNumero = campo1.getText();
                String segundoNumero = campo2.getText();
                if(primerNumero.equals("")){
                    campo1.setText(Num8);
                }else if (segundoNumero.equals("")){
                    campo2.setText(Num8);
                }else{
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS" , "INFO" , JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

        JButton boton9 = new JButton("9");
        boton9.setBounds(450,500,50,50);
        ventana.add(boton9);
        boton9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String Num9="9";
                String primerNumero = campo1.getText();
                String segundoNumero = campo2.getText();
                if(primerNumero.equals("")){
                    campo1.setText(Num9);
                }else if (segundoNumero.equals("")){
                    campo2.setText(Num9);
                }else{
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS" , "INFO" , JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

        JButton boton0 = new JButton("0");
        boton0.setBounds(350,600,50,50);
        ventana.add(boton0);
        boton0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String Num0="0";
                String primerNumero = campo1.getText();
                String segundoNumero = campo2.getText();
                if(primerNumero.equals("")){
                    campo1.setText(Num0);
                }else if (segundoNumero.equals("")){
                    campo2.setText(Num0);
                }else{
                    JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR MAS NUMEROS" , "INFO" , JOptionPane.INFORMATION_MESSAGE);
                }
            }

        });

        JButton botonC = new JButton("CALCULAR");
        botonC.setBounds(253,700,250,50);
        ventana.add(botonC);
        botonC.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                double num1 = Double.parseDouble(campo1.getText());
                double num2 = Double.parseDouble(campo2.getText());
                double resultado=0;

                String operacion = (String) combo1.getSelectedItem();

                if(operacion.equals("SUMAR")){
                    resultado=num1+num2;
                }else if(operacion.equals("RESTAR")){
                    resultado=num1-num2;
                }else if(operacion.equals("MULTIPLICAR")){
                    resultado=num1*num2;
                }else if (operacion.equals("DIVIDIR")){
                    resultado=num1/num2;
                }
                JOptionPane.showMessageDialog(null,"El resultado es: "+ resultado,"INFO",JOptionPane.INFORMATION_MESSAGE);
                campo1.setText("");
                campo2.setText("");
            }
        });

        ventana.setVisible(true);

    }

}
