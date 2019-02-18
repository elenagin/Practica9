import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana extends JFrame {

    public ventana() {
        super("Figuras Geométricas");
        setSize(1000, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Container
        Container cp = getContentPane();
        cp.setLayout(new GridLayout(4, 3));
        cp.setBackground(Color.green);

        //Panel 1
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1, 3));

        JPanel panel1_1 = new JPanel();
        panel1_1.setLayout(new GridLayout(2, 2));
        panel1_1.add(new JLabel("   Cuadrado"));
        panel1_1.add(new JLabel(" "));
        ImageIcon square = new ImageIcon(getClass().getResource("square.png"));
        JLabel label1 = new JLabel(square);
        ImageIcon cube = new ImageIcon(getClass().getResource("cube.png"));
        JLabel label2 = new JLabel(cube);

        panel1_1.add(label1);
        panel1_1.add(label2);

        JPanel panel1_2 = new JPanel();
        panel1_2.setLayout(new GridLayout(3, 2));
        panel1_2.add(new JLabel());
        panel1_2.add(new JLabel());
        JLabel label3 = new JLabel("Lado: ");
        JTextField textfield = new JTextField(30);
        JButton button1 = new JButton("Area");
        JButton button2 = new JButton("Volumen");

        panel1_2.add(label3);
        panel1_2.add(textfield);
        panel1_2.add(button1);
        panel1_2.add(button2);

        JPanel panel1_3 = new JPanel();
        panel1_3.setLayout(new GridLayout(1, 2));
        JLabel label4 = new JLabel("El área es: ");
        JLabel label5 = new JLabel("El volumen es: ");

        panel1_3.add(label4);
        panel1_3.add(label5);

        class ManejadorEventos implements ActionListener {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == button1) {
                    try {
                        int numero = Integer.parseInt(textfield.getText().substring(0, 1));
                        int area = numero * numero;

                        JOptionPane.showMessageDialog(ventana.this, String.format("El área del cuadrado es: %s", area));
                        label4.setText("Area es: " + area + "m2");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(ventana.this, "Introducir sólo números: " + textfield.getText().toString(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (evento.getSource() == button2) {
                    try {
                        int numero = Integer.parseInt(textfield.getText().substring(0, 1));
                        int volumen = numero * numero * numero;

                        JOptionPane.showMessageDialog(ventana.this, String.format("El volumen del cuadrado es: %s", volumen));
                        label5.setText("Volumen es: " + volumen + "m3");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(ventana.this, "Introducir sólo números: " + textfield.getText().toString(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }


        ManejadorEventos manejador = new ManejadorEventos();
        button1.addActionListener(manejador);
        button2.addActionListener(manejador);

        //Panel 2
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1, 3));

        JPanel panel2_1 = new JPanel();
        panel2_1.setLayout(new GridLayout(2, 2));
        panel2_1.add(new JLabel("   Triángulo equilátero"));
        panel2_1.add(new JLabel(" "));
        ImageIcon triangle = new ImageIcon(getClass().getResource("triangle.png"));
        JLabel label6 = new JLabel(triangle);
        ImageIcon pyramid = new ImageIcon(getClass().getResource("pyramid.png"));
        JLabel label7 = new JLabel(pyramid);

        panel2_1.add(label6);
        panel2_1.add(label7);

        JPanel panel2_2 = new JPanel();
        panel2_2.setLayout(new GridLayout(3, 2));
        panel2_2.add(new JLabel());
        panel2_2.add(new JLabel());
        JLabel label8 = new JLabel("Lado: ");
        JTextField textfield2 = new JTextField(30);
        JButton button3 = new JButton("Area");
        JButton button4 = new JButton("Volumen");

        panel2_2.add(label8);
        panel2_2.add(textfield2);
        panel2_2.add(button3);
        panel2_2.add(button4);

        JPanel panel2_3 = new JPanel();
        panel2_3.setLayout(new GridLayout(1, 2));
        JLabel label9 = new JLabel("El área es: ");
        JLabel label10 = new JLabel("El volumen es: ");

        panel2_3.add(label9);
        panel2_3.add(label10);

        class ManejadorEventos2 implements ActionListener {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == button3) {
                    try {
                        int numero = Integer.parseInt(textfield2.getText().substring(0, 1));
                        int area = (numero * numero) + (numero * numero / 2);
                        //fix this

                        JOptionPane.showMessageDialog(ventana.this, String.format("El área del triángulo es: %s", area));
                        label9.setText("Area es: " + area + "m2");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(ventana.this, "Introducir sólo números: " + textfield2.getText().toString(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (evento.getSource() == button4) {
                    try {
                        int numero = Integer.parseInt(textfield2.getText().substring(0, 1));
                        int volumen = (numero * numero) * numero / 3;
                        //fix this

                        JOptionPane.showMessageDialog(ventana.this, String.format("El volumen del triángulo es: %s", volumen));
                        label10.setText("Volumen es: " + volumen + "m3");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(ventana.this, "Introducir sólo números: " + textfield2.getText().toString(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        ManejadorEventos2 manejador2 = new ManejadorEventos2();
        button3.addActionListener(manejador2);
        button4.addActionListener(manejador2);


        //Panel 3
        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1, 3));

        JPanel panel3_1 = new JPanel();
        panel3_1.setLayout(new GridLayout(2, 2));
        panel3_1.add(new JLabel("   Círculo"));
        panel3_1.add(new JLabel(" "));
        ImageIcon circle = new ImageIcon(getClass().getResource("circle.png"));
        JLabel label11 = new JLabel(circle);
        ImageIcon sphere = new ImageIcon(getClass().getResource("sphere.jpeg"));
        JLabel label12 = new JLabel(sphere);
        panel3_1.add(label11);
        panel3_1.add(label12);

        JPanel panel3_2 = new JPanel();
        panel3_2.setLayout(new GridLayout(3, 2));
        panel3_2.add(new JLabel());
        panel3_2.add(new JLabel());
        JLabel label13 = new JLabel("Radio: ");
        JTextField textfield3 = new JTextField(30);
        JButton button5 = new JButton("Area");
        JButton button6 = new JButton("Volumen");

        panel3_2.add(label13);
        panel3_2.add(textfield3);
        panel3_2.add(button5);
        panel3_2.add(button6);

        JPanel panel3_3 = new JPanel();
        panel3_3.setLayout(new GridLayout(1, 2));
        JLabel label14 = new JLabel("El área es: ");
        JLabel label15 = new JLabel("El volumen es: ");

        panel3_3.add(label14);
        panel3_3.add(label15);

        class ManejadorEventos3 implements ActionListener {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == button5) {
                    try {
                        int numero = Integer.parseInt(textfield3.getText().substring(0, 1));
                        double area = (3.1416 * numero * numero);

                        JOptionPane.showMessageDialog(ventana.this, String.format("El área del círculo es: %s", area));
                        label14.setText("Area es: " + area + "m2");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(ventana.this, "Introducir sólo números: " + textfield3.getText().toString(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (evento.getSource() == button6) {
                    try {
                        int numero = Integer.parseInt(textfield3.getText().substring(0, 1));
                        int volumen = (numero * numero) * numero / 3;
                        //fix this

                        JOptionPane.showMessageDialog(ventana.this, String.format("El volumen del círculo es: %s", volumen));
                        label15.setText("Volumen es: " + volumen + "m3");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(ventana.this, "Introducir sólo números: " + textfield3.getText().toString(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        ManejadorEventos3 manejador3 = new ManejadorEventos3();
        button5.addActionListener(manejador3);
        button6.addActionListener(manejador3);

        //Panel 4
        JPanel panel4 = new JPanel();
        panel4.setLayout(new GridLayout(1, 3));

        JPanel panel4_1 = new JPanel();
        panel4_1.setLayout(new GridLayout(2, 2));
        panel4_1.add(new JLabel("   Rectángulo"));
        panel4_1.add(new JLabel("(lado largo vale doble que pequeño)"));
        ImageIcon rectangle = new ImageIcon(getClass().getResource("rectangle.png"));
        JLabel label16 = new JLabel(rectangle);
        ImageIcon rectangle3D = new ImageIcon(getClass().getResource("3dRectangle.jpeg"));
        JLabel label17 = new JLabel(rectangle3D);

        panel4_1.add(label16);
        panel4_1.add(label17);

        JPanel panel4_2 = new JPanel();
        panel4_2.setLayout(new GridLayout(3, 2));
        panel4_2.add(new JLabel());
        panel4_2.add(new JLabel());
        JLabel label18 = new JLabel("Lado pequeño: ");
        JTextField textfield4 = new JTextField(30);
        JButton button7 = new JButton("Area");
        JButton button8 = new JButton("Volumen");

        panel4_2.add(label18);
        panel4_2.add(textfield4);
        panel4_2.add(button7);
        panel4_2.add(button8);

        JPanel panel4_3 = new JPanel();
        panel4_3.setLayout(new GridLayout(1, 2));
        JLabel label19 = new JLabel("El área es: ");
        JLabel label20 = new JLabel("El volumen es: ");

        panel4_3.add(label19);
        panel4_3.add(label20);

        class ManejadorEventos4 implements ActionListener {
            public void actionPerformed(ActionEvent evento) {
                if (evento.getSource() == button7) {
                    try {
                        int numero = Integer.parseInt(textfield4.getText().substring(0, 1));
                        int area = (numero * 2 * numero);

                        JOptionPane.showMessageDialog(ventana.this, String.format("El área del rectángulo es: %s", area));
                        label19.setText("Area es: " + area + "m2");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(ventana.this, "Introducir sólo números: " + textfield4.getText().toString(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                } else if (evento.getSource() == button8) {
                    try {
                        int numero = Integer.parseInt(textfield4.getText().substring(0, 1));
                        int volumen = (numero * numero) * numero / 3;
                        //fix this

                        JOptionPane.showMessageDialog(ventana.this, String.format("El volumen del rectángulo es: %s", volumen));
                        label20.setText("Volumen es: " + volumen + "m3");
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(ventana.this, "Introducir sólo números: " + textfield4.getText().toString(), "Error de entrada", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        }

        ManejadorEventos4 manejador4 = new ManejadorEventos4();
        button7.addActionListener(manejador4);
        button8.addActionListener(manejador4);


        cp.add(panel1, BorderLayout.CENTER);
        cp.add(panel2, BorderLayout.CENTER);
        cp.add(panel3, BorderLayout.CENTER);
        cp.add(panel4, BorderLayout.CENTER);

        panel1.add(panel1_1);
        panel1.add(panel1_2);
        panel1.add(panel1_3);

        panel2.add(panel2_1);
        panel2.add(panel2_2);
        panel2.add(panel2_3);

        panel3.add(panel3_1);
        panel3.add(panel3_2);
        panel3.add(panel3_3);

        panel4.add(panel4_1);
        panel4.add(panel4_2);
        panel4.add(panel4_3);

        panel1.setBackground(Color.green);
        panel1_1.setBackground(Color.green);
        panel1_2.setBackground(Color.green);
        panel1_3.setBackground(Color.green);

        panel2.setBackground(Color.green);
        panel2_1.setBackground(Color.green);
        panel2_2.setBackground(Color.green);
        panel2_3.setBackground(Color.green);

        panel3.setBackground(Color.green);
        panel3_1.setBackground(Color.green);
        panel3_2.setBackground(Color.green);
        panel3_3.setBackground(Color.green);

        panel4.setBackground(Color.green);
        panel4_1.setBackground(Color.green);
        panel4_2.setBackground(Color.green);
        panel4_3.setBackground(Color.green);

        button1.setBackground(Color.yellow);
        button2.setBackground(Color.orange);
        button3.setBackground(Color.yellow);
        button4.setBackground(Color.orange);
        button5.setBackground(Color.yellow);
        button6.setBackground(Color.orange);
        button7.setBackground(Color.yellow);
        button8.setBackground(Color.orange);
    }
}