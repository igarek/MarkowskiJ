import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class HelloWorld extends Frame {
FileDialog dialogLoad;

    protected TextField inFileName;
    protected TextField outFileName;
    public TextField znachennya;

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

	Frame myWindow;

    public HelloWorld(){
	setTitle("Сalculate the HelloWorld");	
	setSize(800, 600);
        GridLayout grid1= new GridLayout(7,3);// кількість стовбців, кількість рядків
        setLayout(grid1);




       add(new Label("Завантажити вхідний ряд цілих чисел"));
	 inFileName=new TextField("...");
        add(inFileName);
	Button BtDownload = new Button("Обзор");
        add(BtDownload );


	

       add(new Label("Вказати діапазон зміни станів [0,V]"));

add(new Label(""));

	 znachennya=new TextField("1");
        add(znachennya);

       	


add(new Label("Підрахувати кількість пар (Vk*Vp),k,p є [0,V] "));
	Button Diapazon = new Button("Розрахувати");
add(new Label(""));
	add(Diapazon );
 

 add(new Label("Кількість станів, k"));
        Button Sostoyanie = new Button("Визначити кількість станів");
add(new Label(""));
        add(Sostoyanie);

    

      

Button BtResult = new Button("Порахувати Марківський процес");
 add(new Label(""));
add(BtResult);
BtResult.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	MyFileClass fc = new MyFileClass();
	fc.openFile(inFileName.getText());
	fc.readFile();
	fc.out();
	fc.writeFile(outFileName.getText());
	double [] mas = fc.getData();
	inFileName.setText(new Double(mas[3]).toString());
	//System.exit(0);

	}
});

        add(new Label(""));
        

	Panel hello = new Panel();
	add("Center", hello);
        myWindow=this;
        
	BtDownload.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	dialogLoad = new FileDialog(myWindow, "Вибір файла", FileDialog.LOAD);
	dialogLoad.show();
	String file = dialogLoad.getFile();
	String directory = dialogLoad.getDirectory();
	String fullFileName = directory + file;
	inFileName.setText(fullFileName);
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
