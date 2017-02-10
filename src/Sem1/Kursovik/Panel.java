package Sem1.Kursovik;

import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;

/**

 * Класс графического интерфейса

 */

class Panel extends JFrame{

    JTextField jta3 = new JTextField(10);

    JTextField jta4 = new JTextField(10);

    JButton button = new JButton(" Конвертировать ");

    String[] listComboBox = {"AUD","BGN","BRL","CAD","CHF","CNY","CZK","DKK","GBP","HKD","HRK","HUF","IDR","ILS","INR","JPY","KRW","MXN","MYR","NOK","NZD","PHP","PLN","RON","RUB","SEK","SGD","THB","TRY","USD","ZAR","EUR"};

    JComboBox comboBoxIn = new JComboBox(listComboBox);
    JComboBox comboBoxOut = new JComboBox(listComboBox);

    Panel(){
        /**

         * Создаеи графическую оболочку и взаимодецствие с кнопками

         */


        super("Конвертер валют");

        setLayout(new FlowLayout());

        setSize(650,150);

        add(new JLabel(" Выберите исходную валюту "));

        add(comboBoxIn);

        add(new JLabel(" Выберите необходимую валюту      "));

        add(comboBoxOut);

        add(new JLabel(" Введите сумму              "));

        add(jta3);

        add(new JLabel(" Полученная сумма       "));

        add(jta4);

        add(button);

        jta3.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == 10)
                    onCLick();

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        button.addActionListener(ae ->

            onCLick()

        );

        setVisible(true);

    }

    private void onCLick(){
        /**

         * Метод для обработки всех данный

         */
        try

        {

            String x1 = comboBoxIn.getSelectedItem().toString();

            String x2 = comboBoxOut.getSelectedItem().toString();

            double x3 = Double.parseDouble(jta3.getText().trim());

            if (x1.equals(x2)) {
                jta4.setText(x3+"");
            return;
            }


            /**
             * Получаем данные с удаленного сервера
             */
            Gson gson = new Gson();
            Example result = gson.fromJson(WebConnector.sendGet("http://api.fixer.io/latest?base=" + x1), Example.class);

            Method[] methods = result.getRates().getClass().getMethods();

            double invoke = 0;
            /**
             * Подучаем коэффициент для конвертирования
             */
            for (Method m : methods){
                if (m.getName().contains(x2)) {
                    invoke = Double.valueOf(m.invoke(result.getRates()).toString());
                    break;
                }

            }

            jta4.setText(String.format("%.6f",x3*invoke));

        }

        catch(Exception e)

        {

            JOptionPane.showMessageDialog(null, "Error!!!","Alert" , JOptionPane.ERROR_MESSAGE);

        }

    }



}

