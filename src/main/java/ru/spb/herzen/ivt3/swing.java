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
     setDefaultCloseOperation(EXIT_ON_CLOSE);
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
   initListeners();
   }
    private void initListeners() {
     addCrow.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         voron = voron + 1;   /* Добавляем одну ворону  */
         updateCrowCounter(); /* Сообщаем аппликации, что количество ворон изменилось  */
       }
     });
     removeCrow.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
         if (voron > 0) {
           voron = voron - 1;
           updateCrowCounter(); /* Сообщаем аппликации, что количество ворон изменилось  */
         }
       }
     });
   }
   private void updateCrowCounter() {
     countLabel.setText("Crows:" + voron);
   }
public static void main(String[] args) {
    VoronCalc app = new VoronCalc();//Создаем экземпляр нашего приложения
    app.setVisible(true);//С этого момента приложение запущено!
    app.pack(); //Эта команда подбирает оптимальный размер в зависимости от содержимого окна
  }
}
