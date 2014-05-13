 import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HelloWorld extends Frame {
    public static void main (String [] argv){
	HelloWorld h = new HelloWorld();
    }

    TextField surname;
    public class Listener1 implements ActionListener{
	    public void actionPerformed(ActionEvent e) {
		surname.setText("енко");
		//System.exit(0);
	    }
   }


    public HelloWorld(){
	setTitle("Hello World!");		
	setSize(800, 600);
        GridLayout grid1= new GridLayout(6,2);// кількість стовбців, кількість рядків
        setLayout(grid1);
	
        add(new Label("Завантажити вихідний ряд цілих чисел"));
	Button BtDownload = new Button("Обзор");
        add(BtDownload );

        add(new Label("Визначити діапазон в якому змінюються стани [0,V]"));
	Button znachennya = new Button("Визначити");
	add(znachennya );
	//TextField znachennya=new TextField("10");
        //add(znachennya);
	//Button BtName = new Button("SetSurname  ");
        //add(BtName);

        add(new Label("Підрахувати кількість пар які зустрічаються в вихідному ряді"));
	Button Diapazon = new Button("Визначити");
	add(Diapazon );
        
	//TextField Diapazon=new TextField("Підрахувати");
        //add(Diapazon);
        //	Button BtFathersName = new Button("SetSurname  ");
        //add(BtFathersName);
        add(new Label("Кількість станів, k"));
        TextField Sostoyanie=new TextField("6");
        add(Sostoyanie);
      
	Button BtResult = new Button("Розрахувати Марківський процес");
        add(BtResult);

	Panel hello = new Panel();
	add("Center", hello);
         //
	Button button = new Button("OK");
	add(button);
	button.addActionListener(new ActionListener() {
	    public void actionPerformed(ActionEvent e) {
		surname.setText("енко");
		//System.exit(0);
	    }
	});

	setVisible(true);
	//grid1.setRows(6);
	//grid1.setColumns(6);


	addWindowListener(new WindowAdapter(){
	    public void windowClosing(WindowEvent e){ 
		System.exit(0);
	    }
	});
    }
}
