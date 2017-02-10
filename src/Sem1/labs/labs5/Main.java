package Sem1.labs.labs5;
//ЛАБОРАТОРНАЯ РАБОТА НОМЕР 5 ПЕРВОЕ ЗАДАНИЕ

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Main extends JFrame {
    JTextField jta1 = new JTextField(2);
    JTextField jta2 = new JTextField(2);

    int num, i;
    Random gen;

    JButton button = new JButton("Предложить вариант ответа");
    JButton button2 = new JButton("Начать заново");

    Main() {
        super("Угадай число");

        setLayout(new FlowLayout());

        setSize(250, 150);

        add(new JLabel("Введите число"));

        add(jta1);

        add(button);
        add(button2);

        gen = new Random();
        num = gen.nextInt(20);
        System.out.println(num);
        i = 0;

        button.addActionListener(new ActionListener()

        {

            public void actionPerformed(ActionEvent ae)

            {

                try

                {




                    double x1 = Double.parseDouble(jta1.getText().trim());

                    if (x1 >= 20)
                        throw new Exception("");

                    if (x1 == num) {
                        JOptionPane.showMessageDialog(null, "Правильный ответ! =D", "Окно", JOptionPane.INFORMATION_MESSAGE);
                        return;
                    }
                    else if (x1 > num)
                        JOptionPane.showMessageDialog(null, "Ваше число больше загаданного", "Окно", JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Ваше число меньше загаданного", "Окно", JOptionPane.INFORMATION_MESSAGE);
                    i += 1;

                    if (i == 3) {
                        JOptionPane.showMessageDialog(null, "Вы проигали! :с", "Окно", JOptionPane.INFORMATION_MESSAGE);
                        //System.exit(0);
                        return;
                    }
                    else
                        JOptionPane.showMessageDialog(null, "У вас осталось попыток:"+(3-i), "Окно", JOptionPane.INFORMATION_MESSAGE);


                } catch (Exception e)

                {

                    JOptionPane.showMessageDialog(null, "Неправильное число!!!", "ALARM", JOptionPane.ERROR_MESSAGE);

                }

            }

        });
        button2.addActionListener(new ActionListener()

        {

            public void actionPerformed(ActionEvent ae)

            {
                num = gen.nextInt(20);
                System.out.println(num);
                i = 0;
            }

        });
        setVisible(true);
    }





    public static void main(String[] args)

    {

        new Main();


    }
}
