import java.awt.*;
import java.awt.event.*;// импортируем интерфейс ActionListener
import javax.swing.*;// библиотека графических компонентов

public class VoronCalc extends JFrame {
  private int voron = 0;
  private JLabel countLabel;
  private JButton addCrow;
  private JButton removeCrow;

  public VoronCalc(){
    super("Crow calculator");//Заголовок окна
    //Подготавливаем компоненты объекта
    countLabel = new JLabel("Crows:" + voron);
    addCrow = new JButton("Add Crow");
    removeCrow = new JButton("Remove Crow");

    //Подготавливаем временные компоненты
    JPanel buttonsPanel = new JPanel(new FlowLayout()); 
    //Расставляем компоненты по местам
    add(countLabel, BorderLayout.NORTH); 

    buttonsPanel.add(addCrow);
    buttonsPanel.add(removeCrow);

    add(buttonsPanel, BorderLayout.SOUTH);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

public static void main(String[] args) {
    VoronCalc app = new VoronCalc();
    app.setVisible(true);
    app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна
  }
}
