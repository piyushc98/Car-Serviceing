package myProjects;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

class CarService extends Frame implements ActionListener,ItemListener
{
	Panel p1,p2,p3,p4,p5,p6,p7,p8,p9;
	Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,
	l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	TextField tf1,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,
	tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24;
	Checkbox ch1,ch2,ch3,ch4,ch5,ch6,ch7,ch8;
	Checkbox chg1,chg2,chg3,chg4,chg5;
	Choice c1,c2;
	int i=0,j=0,l=0,s2,tot=0,pr,tt=0,f=0;
	double dis=0d,amt=0d,amt1=0d,di=0d;
	String str="",str1="";
	String v[]={"SUV","SEDAN","SPORTSCAR","XUV","MUV","HATCHBACK"};
	String c[]= {"Service_Charges","Labour_Charges","Cleaning_Charges","Parts"}; 
	JTable tb,tb1,tb2,tb3,tb4,tb5,tb6,tb7;
	JScrollPane jsp,jsp1,jsp2,jsp3,jsp4,jsp5,jsp6,jsp7;
	DefaultTableModel dtm,dtm1,dtm2,dtm3,dtm4,dtm5,dtm6,dtm7;
	String ar[][]=new String[100][2];
	
	CarService()
	{
		addWindowListener(new WindowAdapter() {  
			
            public void windowClosing (WindowEvent e) 
			{    
                dispose();    
            }			
        }); 
		
		p1=new Panel(null);
		p1.setBounds(262,25,1279,69);
		p1.setBackground(new Color(153,204,255));
		p1.setLayout(null);
		
		l1=new Label("CAR SERVICEING MANAGEMENT SYSTEM",Label.CENTER);
		l1.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,40));
		l1.setBounds(150,12,1010,50);
		l1.setBackground(new Color(95,158,160));
		
		p2=new Panel(null);
		p2.setBounds(10,25,250,795);
		p2.setBackground(new Color(204,204,255));
		
		b1=new Button("Customers");
		b1.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		b1.setBounds(50,30,170,50);
		b1.addActionListener(this);
		b1.setBackground(new Color(255,160,122));
		
		b2=new Button("Vehicles");
		b2.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		b2.setBounds(50,120,170,50);
		b2.addActionListener(this);
		b2.setBackground(new Color(255,160,122));
		
		b3=new Button("Add to Service");
		b3.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		b3.setBounds(50,210,170,50);
		b3.addActionListener(this);
		b3.setBackground(new Color(255,160,122));
		
		b4=new Button("Service On-Board");
		b4.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		b4.setBounds(50,300,170,50);
		b4.addActionListener(this);
		b4.setBackground(new Color(255,160,122));
		
		
		b5=new Button("Service Result");
		b5.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		b5.setBounds(50,390,170,50);
		b5.addActionListener(this);
		b5.setBackground(new Color(255,160,122));
		
		b6=new Button("Vehicle Return");
		b6.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		b6.setBounds(50,480,170,50);
		b6.addActionListener(this);
		b6.setBackground(new Color(255,160,122));
		
		b7=new Button("Reports");
		b7.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		b7.setBounds(50,570,170,50);
		b7.addActionListener(this);
		b7.setBackground(new Color(255,160,122));
		
		l36=new Label("Dependable");
		l36.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,30));
		l36.setBounds(50,650,220,60);
		//l36.setBackground(new Color(255,192,203));
		
		l37=new Label("Auto Repair");
		l37.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,30));
		l37.setBounds(50,700,220,50);
		//l37.setBackground(new Color(255,192,203));
		
		p3=new Panel(null);
		p3.setBounds(262,96,1279,724);
		p3.setBackground(new Color(255,204,255));
		p3.setVisible(false);
		
		l30=new Label("Vehicle Registration",Label.CENTER);
		l30.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,40));
		l30.setBounds(400,40,400,50);
		
		l2=new Label("VECHICLE NO");
		l2.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l2.setBounds(80,120,120,50);
		
		l3=new Label("VECHICLE TYPE");
		l3.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l3.setBounds(80,170,135,50);
		
		l4=new Label("MOBILE NO");
		l4.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l4.setBounds(80,240,100,50);
		
		l5=new Label("DATE");
		l5.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l5.setBounds(80,300,100,50);
		
		l6=new Label("SERVICE TYPE");
		l6.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l6.setBounds(80,360,120,50);
		
		l7=new Label("REMARK");
		l7.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l7.setBounds(80,420,100,50);
		
		tf1=new TextField();
		tf1.setFont(new Font("Arial",Font.PLAIN,20));
		tf1.setBounds(220,130,200,30);
			
		tf3=new TextField();
		tf3.setFont(new Font("Arial",Font.PLAIN,20));
		tf3.setBounds(220,250,200,30);
		
		tf4=new TextField();
		tf4.setFont(new Font("Arial",Font.PLAIN,20));
		tf4.setBounds(220,310,200,30);
		
		tf6=new TextField();
		tf6.setFont(new Font("Arial",Font.PLAIN,20));
		tf6.setBounds(220,430,200,70);
		
		ch1=new Checkbox("CLEANING");
		    ch1.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,15));
		ch1.setBounds(220,360,100,20);
		
		ch2=new Checkbox("REPAIR");
		    ch2.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,15));;
		ch2.setBounds(330,360,100,20);
		
		ch3=new Checkbox("MODIFY");
		    ch3.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,15));
		ch3.setBounds(440,360,100,20);
		
		ch4=new Checkbox("SPARE & PARTS");
		    ch4.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,15));
		ch4.setBounds(220,390,150,20);
		
		c1=new Choice();
		c1.setBounds(220,180,200,40);
		c1.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		for(int i=0;i<v.length;i++)
		c1.add(v[i]);
		
		b8=new Button("Add Car");
		b8.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,25));
		b8.setBounds(220,550,200,50);
		b8.addActionListener(this);
		
		p4=new Panel(null);
		p4.setBounds(262,96,1279,724);
		p4.setBackground(new Color(255,204,229));
		p4.setVisible(false);
		
		l31=new Label("Customer Registration",Label.CENTER);
		l31.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,40));
		l31.setBounds(400,40,400,50);
		
		tb2 = new JTable()
		{   
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;
					}
			};
		jsp2 = new JScrollPane(tb2);
		jsp2.setBounds(550,120,630,150);
		dtm2= new DefaultTableModel(0, 0);
		
		String header3[] = {"Vehicle_no","Name","Date","Service_Type","Vehicle_Type","Status","Mobile_no"};
		
		dtm2.setColumnIdentifiers(header3);
		tb2.setModel(dtm2);
		
		l8=new Label("NAME");
		l8.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l8.setBounds(80,120,120,50);

		tf7=new TextField();
		tf7.setFont(new Font("Arial",Font.PLAIN,20));
		tf7.setBounds(220,130,200,30);
		
		l9=new Label("GENDER");
		l9.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l9.setBounds(80,180,125,50);
		
		CheckboxGroup chg=new CheckboxGroup();
		chg1=new Checkbox("MALE",false,chg);
		chg1.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		chg1.setBounds(220,180,60,40);
		
		chg2=new Checkbox("FEMALE",false,chg);
		chg2.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		chg2.setBounds(300,180,100,40);
		
		l10=new Label("VEHICLE NO");
		l10.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l10.setBounds(80,240,120,50);
		
		tf8=new TextField();
		tf8.setFont(new Font("Arial",Font.PLAIN,20));
		tf8.setBounds(220,250,200,30);
		
		l11=new Label("ADDRESS");
		l11.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l11.setBounds(80,300,100,50);
		
		tf9=new TextField();
		tf9.setFont(new Font("Arial",Font.PLAIN,20));
		tf9.setBounds(220,310,200,30);
		
		b9=new Button("Add Customer");
		b9.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,25));
		b9.setBounds(220,400,200,50);
		b9.addActionListener(this);
		
		p5=new Panel(null);
		p5.setBounds(262,96,1279,724);
		p5.setBackground(new Color(204,255,229));
		p5.setVisible(false);
		
		l13=new Label("Add to Service",Label.CENTER);
		l13.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,40));
		l13.setBounds(400,40,400,50);
		
		l12=new Label("VECHICLE NO");
		l12.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l12.setBounds(80,120,120,50);
		
		tf10=new TextField();
		tf10.setFont(new Font("Arial",Font.PLAIN,20));
		tf10.setBounds(220,130,200,30);
		
		b10=new Button("Your Turn");
		b10.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,25));
		b10.setBounds(220,250,150,50);
		b10.addActionListener(this);
		
		p6=new Panel(null);
		p6.setBounds(262,96,1279,724);
		p6.setBackground(new Color(229,255,204));
		p6.setVisible(false);
		
		l34=new Label("Service On-Board",Label.CENTER);
		l34.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,40));
		l34.setBounds(400,40,400,50);
		
		l14=new Label("SERVICE ID");
		l14.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l14.setBounds(80,90,120,50);
		
		tf11=new TextField();
		tf11.setFont(new Font("Arial",Font.PLAIN,20));
		tf11.setBounds(220,100,200,30);
		
		l15=new Label("VECHICLE NO");
		l15.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l15.setBounds(80,140,125,50);
		
		tf12=new TextField();
		tf12.setFont(new Font("Arial",Font.PLAIN,20));
		tf12.setBounds(220,150,200,30);
		
		l16=new Label("SERVICE TYPE");
		l16.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l16.setBounds(80,200,120,50);
		
		l17=new Label("REMARKS");
		l17.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l17.setBounds(80,260,100,50);
		
		l18=new Label("COMPONENTS");
		l18.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l18.setBounds(80,340,110,50);
		
		c2=new Choice();
		c2.setBounds(220,350,200,50);
		c2.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		for(int i=0;i<c.length;i++)
		c2.add(c[i]);
		
		tf13=new TextField();
		tf13.setFont(new Font("Arial",Font.PLAIN,20));
		tf13.setBounds(220,270,200,70);
		
		ch5=new Checkbox("CLEANING");
			ch5.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		ch5.setBounds(220,200,100,20);
		
		ch6=new Checkbox("REPAIR");
			ch6.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		ch6.setBounds(330,200,100,20);
		
		ch7=new Checkbox("MODIFY");
			ch7.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		ch7.setBounds(440,200,100,20);
		
		ch8=new Checkbox("SPARE & PARTS");
			ch8.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		ch8.setBounds(220,230,150,20);
		
		b12=new Button("Service Over");
		b12.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,25));
		b12.setBounds(510,650,150,40);
		b12.addActionListener(this);
		
		tf15=new TextField();
		tf15.setFont(new Font("Arial",Font.PLAIN,20));
		tf15.setBounds(440,350,70,30);
		
		b13=new Button("ADD");
		b13.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,25));
		b13.setBounds(530,350,80,30);
		b13.addActionListener(this);
		
		tb = new JTable()
		{   
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;
					}
			};
		jsp = new JScrollPane(tb);
		jsp.setBounds(60,390,600,150);
		dtm = new DefaultTableModel(0, 0);
		String header[] = {"S.no","Description","Price"};
		dtm.setColumnIdentifiers(header);
		tb.setModel(dtm);
		
		l21=new Label("Total");
		l21.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		l21.setBounds(400,550,100,25);
		
		tf16=new TextField();
		tf16.setFont(new Font("Arial",Font.PLAIN,20));
		tf16.setBounds(560,550,100,25);
		
		l22=new Label("Discount");
		l22.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		l22.setBounds(400,580,100,25); 
		
		tf17=new TextField();
		tf17.setFont(new Font("Arial",Font.PLAIN,20));
		tf17.setBounds(560,580,100,25);
		
		l23=new Label("Amount To Pay");
		l23.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		l23.setBounds(400,610,150,25);
		
		tf18=new TextField();
		tf18.setFont(new Font("Arial",Font.PLAIN,20));
		tf18.setBounds(560,610,100,25);
		
		p7=new Panel(null);
		p7.setBounds(262,96,1279,724);
		p7.setBackground(new Color(255,229,204));
		p7.setVisible(false);
		
		l19=new Label("Service Result",Label.CENTER);
		l19.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,40));
		l19.setBounds(400,40,400,50);
		
		l20=new Label("VECHICLE NO");
		l20.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,17));
		l20.setBounds(80,120,120,50);
		
		tf14=new TextField();
		tf14.setFont(new Font("Arial",Font.PLAIN,20));
		tf14.setBounds(220,130,200,30);
		
		l33=new Label();
		l33.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,50));
		l33.setBounds(400,400,800,60);
		
		b11=new Button("Get Status");
		b11.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,25));
		b11.setBounds(220,220,150,50);
		b11.addActionListener(this);
		
		p8=new Panel(null);
		p8.setBounds(262,96,1279,724);
		p8.setBackground(new Color(204,255,255));
		p8.setVisible(false);
		
		l24=new Label("Vechicle Return",Label.CENTER);
		l24.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,40));
		l24.setBounds(400,40,400,50);
		
		l25=new Label("VECHICLE NO");
		l25.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		l25.setBounds(300,120,140,50);
		
		tf19=new TextField();
		tf19.setFont(new Font("Arial",Font.PLAIN,20));
		tf19.setBounds(460,130,200,30);
		
		b14=new Button("Search");
		b14.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		b14.setBounds(680,130,100,30);
		b14.addActionListener(this);
		
		l26=new Label("SERVICE ID");
		l26.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		l26.setBounds(300,180,120,50);
		
		tf20=new TextField();
		tf20.setFont(new Font("Arial",Font.PLAIN,20));
		tf20.setBounds(460,190,200,30);
		
		tb1 = new JTable()
		{   
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;
					}
			};
		jsp1 = new JScrollPane(tb1);
		jsp1.setBounds(270,270,600,150);
		dtm1= new DefaultTableModel(0, 0);
		String header2[] = {"S.no","Description","Price"};
		dtm1.setColumnIdentifiers(header2);
		tb1.setModel(dtm1);
		
		l27=new Label("Total");
		l27.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		l27.setBounds(600,450,100,25);
		
		tf21=new TextField();
		tf21.setFont(new Font("Arial",Font.PLAIN,20));
		tf21.setBounds(760,450,100,25);
		
		l28=new Label("Discount");
		l28.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		l28.setBounds(600,480,100,25); 
		
		tf22=new TextField();
		tf22.setFont(new Font("Arial",Font.PLAIN,20));
		tf22.setBounds(760,480,100,25);
		
		l29=new Label("Amount To Pay");
		l29.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		l29.setBounds(600,510,150,25);
		
		tf23=new TextField();
		tf23.setFont(new Font("Arial",Font.PLAIN,20));
		tf23.setBounds(760,510,100,25);
		
		b15=new Button("Pay Now");
		b15.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,25));
		b15.setBounds(370,600,450,30);
		b15.addActionListener(this);
		
		tb3 = new JTable()
		{   
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;
					}
			};
		jsp3 = new JScrollPane(tb3);
		jsp3.setBounds(550,120,630,150);
		dtm3= new DefaultTableModel(0, 0);
		String header4[] = {"Vehicle_no","Name","Date","Service_Type","Vehicle_Type","Status","Mobile_no"};
		dtm3.setColumnIdentifiers(header4);
		tb3.setModel(dtm3);
		
		tb4= new JTable()
		{   
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;
					}
			};
		jsp4 = new JScrollPane(tb4);
		jsp4.setBounds(550,120,630,150);
		dtm4= new DefaultTableModel(0, 0);
		String header5[] = {"Name","Vehicle_no","Date","Status"};
		dtm4.setColumnIdentifiers(header5);
		tb4.setModel(dtm4);
		
		tb5= new JTable()
		{   
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;
					}
			};
		jsp5 = new JScrollPane(tb5);
		jsp5.setBounds(600,120,630,150);
		dtm5= new DefaultTableModel(0, 0);
		String header6[] = {"Service_id","Name","Vehicle_no","Vehicle_type","Bill_Amt","Bill_Status"};
		dtm5.setColumnIdentifiers(header6);
		tb5.setModel(dtm5);
		
		tb6= new JTable()
		{   
			public boolean editCellAt(int row, int column, java.util.EventObject e) {
	            return false;
					}
			};
		jsp6 = new JScrollPane(tb6);
		jsp6.setBounds(520,120,630,150);
		dtm6= new DefaultTableModel(0, 0);
		String header7[] = {"Vehicle_no","Vehicle_type","Status"};
		dtm6.setColumnIdentifiers(header7);
		tb6.setModel(dtm6);
		
		l38=new Label("Reports",Label.CENTER);
		l38.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,40));
		l38.setBounds(400,40,400,50);
		
		p9=new Panel(null);
		p9.setBounds(262,96,1279,724);
		p9.setBackground(new Color(216,191,216));
		p9.setVisible(false);
		
		b16=new Button("Filter");
		b16.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,30));
		b16.setBounds(500,200,200,40);
		b16.addActionListener(this);
		//b16.setBackground(new Color(102,0,102));
		
		tb7= new JTable()
		{   
		public boolean editCellAt(int row, int column, java.util.EventObject e) {
            return false;
				}
		};
		jsp7 = new JScrollPane(tb7);
		jsp7.setBounds(50,350,1150,300);
		dtm7= new DefaultTableModel(0, 0);
		String header8[] = {"Service_Id","Name","Vehicle_no","Vehicle_type","Date","Service_type","Description","Bill_Id","Bill_Amt","Service_Status","Bill_Status"};
		dtm7.setColumnIdentifiers(header8);
		tb7.setModel(dtm7);
		
		CheckboxGroup chg12=new CheckboxGroup();
		chg3=new Checkbox("NAME",false,chg12);
		chg3.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		chg3.setBounds(420,140,100,40);
		chg3.addItemListener(this);
		
		chg4=new Checkbox("DATE",false,chg12);
		chg4.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		chg4.setBounds(550,140,100,40);
		chg4.addItemListener(this);
		
		chg5=new Checkbox("VEHICLE_NO",false,chg12);
		chg5.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		chg5.setBounds(680,140,150,40);
		chg5.addItemListener(this);
		
		tf24=new TextField();
		tf24.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,35));
		tf24.setBounds(450,270,330,45);
		
		l35=new Label();
		l35.setFont(new Font("Serif",Font.BOLD | Font.ITALIC,20));
		l35.setBounds(800,270,800,40);
		l35.setForeground(Color.red);
		
		p4.add(jsp2);
		p3.add(jsp3);
		p5.add(jsp4);
		p6.add(jsp5);
		p7.add(jsp6);
		p9.add(jsp7);
		add(p1);
		add(p2);
		add(p3);
		add(p4);
		add(p5);
		add(p6);
		add(p7);
		add(p8);
		add(p9);
		p1.add(l1);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(l36);
		p2.add(l37);
		
		p3.add(l2);
		p3.add(l3);
		p3.add(l4);
		p3.add(l5);
		p3.add(l6);
		p3.add(l7);
		p3.add(tf1);
		p3.add(l30);
		p3.add(c1);
		p3.add(tf3);
		p3.add(tf4);
		p3.add(ch1);
		p3.add(ch2);
		p3.add(ch3);
		p3.add(ch4);
		p3.add(tf6);
		p3.add(b8);
		
		p4.add(l31);
		p4.add(l8);
		p4.add(l9);
		p4.add(l10);
		p4.add(l11);
		p4.add(tf7);
		p4.add(tf8);
		p4.add(tf9);
		p4.add(tf7);
		p4.add(chg1);
		p4.add(chg2);
		p4.add(b9);
		
		p5.add(l13);
		p5.add(l12);
		p5.add(tf10);
		p5.add(b10);
	
		p6.add(l34);
		p6.add(l14);
		p6.add(l15);
		p6.add(l16);
		p6.add(tf11);
		p6.add(l17);
		p6.add(l18);
		p6.add(tf12);
		p6.add(tf13);
		p6.add(ch5);
		p6.add(ch6);
		p6.add(ch7);
		p6.add(ch8);
		p6.add(c2);
		p6.add(b12);
		p6.add(jsp);
		p6.add(tf15);
		p6.add(b13);
		p6.add(l21);
		p6.add(l22);
		p6.add(l23);
		p6.add(tf16);
		p6.add(tf17);
		p6.add(tf18);
		
		p7.add(l19);
		p7.add(l20);
		p7.add(tf14);
		p7.add(b11);
		p7.add(l33);
		
		p8.add(l24);
		p8.add(l25);
		p8.add(tf19);
		p8.add(b14);
		p8.add(tf20);
		p8.add(jsp1);
		p8.add(l26);
		p8.add(l27);
		p8.add(l28);
		p8.add(tf21);
		p8.add(tf22);
		p8.add(tf23);
		p8.add(l29);
		p8.add(b15);
		
		p9.add(b16);
		p9.add(chg3);
		p9.add(chg4);
		p9.add(chg5);
		p9.add(tf24);
		p9.add(l35);
		p9.add(l38);
		
		fillCustomer();
		fillVehicle();
		fillATS();
		fillBill();
		fillst();
		fillfilter();
		
		f=1;
		
		setSize(1530,800);
		setLayout(null);
		setVisible(true);
		this.setExtendedState(this.getExtendedState() | this.MAXIMIZED_BOTH);
	}
	void table1()
	{
		String name=tf7.getText();
		String gen=(chg1.getState()==true)?chg1.getLabel():chg2.getLabel();
		String veh=tf8.getText();
		String add=tf9.getText();
		try{  
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
				
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("select * from vehicle where vehicle_no='"+veh+"'");
				if(rs.next() && f==1)
				{	
					st=con.createStatement();
					st.executeUpdate("insert into customer(name,gender,vehicle_no,address) values ('"+name+"','"+gen+"','"+veh+"','"+add+"')");
					System.out.println("Add Customer.Data Inserted Succesfully ");
				}
				else 
					 JOptionPane.showMessageDialog(this,"Please Add Vehicle First ","Alert",JOptionPane.WARNING_MESSAGE); 
				
		   }catch(Exception e) {System.out.println(e.toString());}
		fillCustomer();
	}
	void fillCustomer()
	{
		dtm2.setRowCount(0);
		String v1="",n1="",d1="",st1="", vt1="",s1="",m1="";
		try{ 	
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("Select vehicle.vehicle_no, customer.name, vehicle.date, vehicle.Service_type, vehicle.vehicle_type, vehicle.status, vehicle.mobile_no From customer Inner Join vehicle On customer.vehicle_no = vehicle.vehicle_no Group By vehicle.vehicle_no, customer.name, vehicle.date, vehicle.Service_type,  vehicle.vehicle_type, vehicle.status,  vehicle.mobile_no");
				while(rs.next())
				{
				v1=rs.getString("Vehicle_no");
				n1=rs.getString("Name");
				d1=rs.getString("Date");
				st1=rs.getString("Service_Type");
				vt1=rs.getString("Vehicle_Type");
				s1=rs.getString("Status");
				m1=rs.getString("Mobile_no");
					  
					dtm2.addRow(new Object[] {v1,n1,d1,st1,vt1,s1,m1});
					
					System.out.println("Jtable1.Data get Succesfully ");
				}
			}catch(Exception e) {}	
	}
	void table2()
	{
		String veh=tf1.getText();
		String vty=c1.getSelectedItem();
		String mno=tf3.getText();
		String dt=tf4.getText();
		String sty="";
		if(ch1.getState())
			sty+=ch1.getLabel();
		if(ch2.getState())
			sty+=ch2.getLabel();
		if(ch3.getState())
			sty+=ch3.getLabel();
		if(ch4.getState())
			sty+=ch4.getLabel();
		String re=tf6.getText();
		try{  
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
				Statement st=con.createStatement();
				st.executeUpdate("insert into vehicle(vehicle_no,vehicle_type,mobile_no,date,service_type,remark,status) values ('"+veh+"','"+vty+"',"+mno+",'"+dt+"','"+sty+"','"+re+"','Just Arrive')");
				System.out.println("Add car.Data Inserted Succesfully ");
		   }catch(Exception e) {}
		fillVehicle();
	}
	void fillVehicle()
	{
		dtm3.setNumRows(0);
		String v1="",n1="",d1="",st1="",vt1="",s1="",m1="";
		try{ 	
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("Select vehicle.vehicle_no, customer.name, vehicle.date, vehicle.Service_type, vehicle.vehicle_type, vehicle.status, vehicle.mobile_no From customer Inner Join vehicle On customer.vehicle_no = vehicle.vehicle_no Group By vehicle.vehicle_no, customer.name, vehicle.date, vehicle.Service_type,  vehicle.vehicle_type, vehicle.status,  vehicle.mobile_no");
				while(rs.next())
				{
				v1=rs.getString("Vehicle_no");
				n1=rs.getString("Name");
				d1=rs.getString("Date");
				st1=rs.getString("Service_Type");
				vt1=rs.getString("Vehicle_Type");
				s1=rs.getString("Status");
				m1=rs.getString("Mobile_no");
					  
					dtm3.addRow(new Object[] {v1,n1,d1,st1,vt1,s1,m1});
					
					System.out.println("Jtable2.Data get Succesfully ");
				}
			}catch(Exception e) {}
	}
	void table3()
	{
		String vh=tf10.getText();
		try{  
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
				Statement st=con.createStatement();
				st.executeUpdate("update vehicle set status='Service On-Board' where vehicle_no='"+vh+"'");
				System.out.println("Your Turn.Status Updated Succesfully ");
		   }catch(Exception e) {}
		fillATS();
	}
	void fillATS()
	{
		dtm4.setRowCount(0);
		String n1="",v1="",d1="",s1="";
		try{ 	
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("Select vehicle.status,customer.vehicle_no,customer.name,vehicle.date From customer Inner Join vehicle On customer.vehicle_no = vehicle.vehicle_no Group By vehicle.status, customer.vehicle_no, customer.name,vehicle.date");
				while(rs.next())
				{
				n1=rs.getString("Name");
				v1=rs.getString("Vehicle_no");
				d1=rs.getString("Date");
				s1=rs.getString("Status");
					  
					dtm4.addRow(new Object[] {n1,v1,d1,s1});
					
					System.out.println("Jtable3.Data get Succesfully ");
				}
			}catch(Exception e) {}
	}
	void table4()
	{
		int vid=Integer.parseInt(tf11.getText());
		String vno=tf12.getText();
		String sty="";
		if(ch5.getState())
			sty+=" "+ch5.getLabel();
		if(ch6.getState())
			sty+=" "+ch6.getLabel();
		if(ch7.getState())
			sty+=" "+ch7.getLabel();
		if(ch8.getState())
			sty+=" "+ch8.getLabel();
		
		sty=sty.trim();
		String rem=tf13.getText();
		try{  
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");
				Statement st=con.createStatement();
			
				st.executeUpdate("insert into service(Service_id,Vehicle_no,Service_type,Remarks,Bill_Status) values ("+vid+",'"+vno+"','"+sty+"','"+rem+"','Bill_Ready')");
				System.out.println("Service over.Data Inserted Succesfully ");
				
				Statement st1=con.createStatement();
				for(int i=0;i<j;i++)
				{
					System.out.println("insert into ebill(Description,Service_id,Price) values ('"+ar[i][0]+"',"+vid+","+ar[i][1]+")");
					st1.executeUpdate("insert into ebill(Description,Service_id,Price) values ('"+ar[i][0]+"',"+vid+","+ar[i][1]+")");
				}
				System.out.println("eBill.Data Inserted Succesfully ");
				
				Statement st2=con.createStatement();
				st2.executeUpdate("update vehicle set status='Service Over' where vehicle_no='"+vno+"'");
				System.out.println("Status Updated Succesfully after service over ");
		   }catch(Exception e) {}
		fillBill();
	}
	void fillBill()
	{
		dtm5.setRowCount(0);
		String sid1="",n1="",vn1="",vt1="",bmt1="",bst1="";
		try{ 	
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("\r\n"
						+ "Select service.Service_id,service.Vehicle_no,service.Bill_Status,Sum(ebill.Price) As Sum_Price,customer.name, vehicle.vehicle_type From service Inner Join vehicle On service.Vehicle_no = vehicle.vehicle_no Inner Join ebill On ebill.Service_id = service.Service_id Inner Join customer On customer.vehicle_no = vehicle.vehicle_no Group By service.Service_id,service.Vehicle_no,service.Bill_Status,customer.name,vehicle.vehicle_type\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "\r\n"
						+ "");
				while(rs.next())
				{
					sid1=rs.getString("service.Service_id");
					n1=rs.getString("customer.name");
					vn1=rs.getString("service.vehicle_no");
					vt1=rs.getString("vehicle.vehicle_type");
					bmt1=rs.getString("Sum_Price");
					bst1=rs.getString("service.Bill_Status");
					  
					dtm5.addRow(new Object[]{sid1,n1,vn1,vt1,bmt1,bst1});
					System.out.println("Jtable4.Data get Succesfully ");
				}
			}catch(Exception e)  {}
	}
	void fillst()
	{

		dtm6.setRowCount(0);
		String sid1="",vn1="",vt1="",st1="";
		try{ 	
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery("\r\n"+ "Select vehicle.status,vehicle.vehicle_type,vehicle.vehicle_no From service Inner Join vehicle On service.Vehicle_no = vehicle.vehicle_no");
				while(rs.next())
				{
					vn1=rs.getString("vehicle.vehicle_no");
					vt1=rs.getString("vehicle.vehicle_type");
					st1=rs.getString("vehicle.status");
					
					dtm6.addRow(new Object[]{vn1,vt1,st1});
					System.out.println("Jtable5.Data get Succesfully ");
				}
			}catch(Exception e) {}
	}
	void fillfilter()
	{
		
		dtm7.setNumRows(0);
		String sid="",nm="",vn="",vt="",dt="",stt="",dp="",bid="",bmt="",sst="",bst="";
		try{ 	
				String query="Select customer.name,ebill.Id,Sum(ebill.Price) As Sum_Price,vehicle.vehicle_no,vehicle.vehicle_type,vehicle.date,vehicle.Service_type,service.Service_id,service.Bill_Status,vehicle.status, ebill.Description From ebill Inner Join service On ebill.Service_id = service.Service_id Inner Join vehicle On service.Vehicle_no = vehicle.vehicle_no Inner Join customer On customer.vehicle_no = vehicle.vehicle_no";
				String query1="Group By customer.name,ebill.Id,vehicle.vehicle_no,vehicle.vehicle_type,vehicle.date,vehicle.Service_type,service.Service_id,service.Bill_Status,vehicle.status,ebill.Description";
				if(chg3.getState()==true)
					query=query+" where customer.name='"+tf24.getText()+"' " + query1;
				else if(chg4.getState()==true)
					query=query+" where vehicle.date='"+tf24.getText()+"'" + query1;
				else if(chg5.getState()==true)
					query=query+" where vehicle.vehicle_no='"+tf24.getText()+"'" + query1;
				
				//System.out.println(query);
				
				Class.forName("com.mysql.cj.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(query);
				while(rs.next())
				{
				sid=rs.getString("service.Service_id");
				nm=rs.getString("customer.name");
				vn=rs.getString("vehicle.vehicle_no");
				vt=rs.getString("vehicle.vehicle_type");
				dt=rs.getString("vehicle.date");
				stt=rs.getString("vehicle.Service_type");
				dp=rs.getString("ebill.Description");
				bid=rs.getString("ebill.Id");
				bmt=rs.getString("Sum_Price");
				sst=rs.getString("vehicle.status");
				bst=rs.getString("service.Bill_Status");
					  
					dtm7.addRow(new Object[] {sid,nm,vn,vt,dt,stt,dp,bid,bmt,sst,bst});
					
					System.out.println("Jtable6.Data get Succesfully ");
				}
			}catch(Exception e) {System.out.println("error"+e);}
	}
	
	int validateName(String s)
	{
		s=s.toLowerCase();
		int c=0;

		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);

			if(!(Character.isLetter(ch) || ch==' '))
			{	
				c=1;
				break;
			}
		}
		return c;
	}
	int validateDate(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);

			if(!(Character.isDigit(ch) || ch=='/'))
			{	
				c=1;
				break;
			}
		}
		return c;
	}
	int validateVehicle(String s)
	{
		int c=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);

			if(!(Character.isDigit(ch) || Character.isLetter(ch)))
			{	
				c=1;
				break;
			}
		}
		return c;
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1) {
			p3.setVisible(false);
		    p4.setVisible(true);
		    p5.setVisible(false);
		    p6.setVisible(false);
		    p7.setVisible(false);
		    p8.setVisible(false);
		    
		}
		if(ae.getSource()==b2) {
			p3.setVisible(true);
		    p4.setVisible(false);
		    p5.setVisible(false);
		    p6.setVisible(false);
		    p7.setVisible(false);
		    p8.setVisible(false);
		}		
		if(ae.getSource()==b3) {
			p5.setVisible(true);
			p4.setVisible(false);
            p3.setVisible(false);
            p6.setVisible(false);
            p7.setVisible(false);
            p8.setVisible(false);
		}
		if(ae.getSource()==b4) {
			p6.setVisible(true);
			p5.setVisible(false);
			p4.setVisible(false);
            p3.setVisible(false); 
            p7.setVisible(false);
            p8.setVisible(false);
		}
		if(ae.getSource()==b5) {
			p7.setVisible(true);
			p6.setVisible(false);
			p5.setVisible(false);
			p4.setVisible(false);
            p3.setVisible(false); 
            p8.setVisible(false);
		}
		if(ae.getSource()==b6) {
			p8.setVisible(true);
			p7.setVisible(false);
			p6.setVisible(false);
			p5.setVisible(false);
			p4.setVisible(false);
            p3.setVisible(false);   
		}
		if(ae.getSource()==b7) {
			p9.setVisible(true);
			p8.setVisible(false);
			p7.setVisible(false);
			p6.setVisible(false);
			p5.setVisible(false);
			p4.setVisible(false);
            p3.setVisible(false);   
		}
		if(ae.getSource()==b8)
		{
			table2();
			//fillVehicle();
		}
		if(ae.getSource()==b9)
		{
           table1();
           fillCustomer();
           fillVehicle();
		}
		if(ae.getSource()==b10) {
			table3();
			fillATS();
		}
		if(ae.getSource()==b11) {
			String v=tf14.getText();
			try{  
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("select status from vehicle where vehicle_no='"+v+"'");
					if(rs.next())
						str=rs.getString("status");
					
					Statement st1=con.createStatement();
					ResultSet rs1=st1.executeQuery("select Bill_Status from service where vehicle_no='"+v+"'");
					if(rs1.next())
						str1=rs1.getString("Bill_Status");
					
					System.out.println(str+"/"+str1);
					
					l33.setText(str+"/"+str1);
					System.out.println("Get Status Succesfully ");
				}catch(Exception e) {}
			fillst();
		}
		if(ae.getSource()==b12)
		{
			table4();
			fillBill();
		}
		if(ae.getSource()==b13) {
			
			i++;
			String s1=c2.getSelectedItem();
		    s2=Integer.parseInt(tf15.getText());
		    while(dtm.getRowCount()>i)
			{
			    dtm.removeRow(0);
			}
			dtm.addRow(new Object[] { i,s1,s2});
			
			ar[j][0]=s1;
			ar[j][1]=Integer.toString(s2);
			System.out.println(ar[j][0]);
			System.out.println(ar[j][1]);
		    j++;
			tot=tot+s2;
			tf16.setText(String.valueOf(tot));
			
			if(tot==5000)
				dis=(tot*15)/100;
			else if(tot>5000 && tot<=10000)
				dis=(tot*20)/100;
			else
				dis=(tot*25)/100;
			tf17.setText(String.valueOf(dis));
			amt=tot-dis;
			tf18.setText(String.valueOf(amt));
		}
		if(ae.getSource()==b14)
		{
			int x=dtm1.getRowCount();
			x-=1;
			l=0;
			tt=0;
			di=0;
			amt1=0;
			while(x>=0)
				dtm1.removeRow(x--);
			
			String vs=tf19.getText();
			try{ 	
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery("Select service.Service_id, service.Vehicle_no, ebill.Description, ebill.Price From service Inner Join ebill On ebill.Service_id = service.Service_id Where service.Vehicle_no='"+vs+"'");
					while(rs.next())
					{
					String ds=rs.getString("Description");
						   pr=rs.getInt("Price");
						   tf20.setText(rs.getString("Service_id"));
							l++;
					
						dtm1.addRow(new Object[] {l,ds,pr});
						
						tt=tt+pr;
						tf21.setText(String.valueOf(tt));
						
						if(tt==5000)
							di=(tt*15)/100;
						else if(tt>5000 && tt<=10000)
							di=(tt*20)/100;
						else
							di=(tt*25)/100;
						tf22.setText(String.valueOf(di));
						
						amt1=tt-di;
						tf23.setText(String.valueOf(amt1));
						System.out.println("Search.Data get Succesfully ");
					}
				}catch(Exception e) {}	
		  }
		 if(ae.getSource()==b15) {
			String ve=tf19.getText();
			try{  
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/piyush","root","Piyush@1098");  
					Statement st2=con.createStatement();
					st2.executeUpdate("update service set Bill_Status='Bill_Paid' where vehicle_no='"+ve+"'");
					System.out.println("Bill_Status.Updated Successfully");
				}catch(Exception e) {}
		 }
		 if(ae.getSource()==b16)
		 {
			 if(validateName(tf24.getText())==1 && chg3.getState()==true) 
				 JOptionPane.showMessageDialog(this,"Invalid Name ","Alert",JOptionPane.WARNING_MESSAGE);
			 else if(validateDate(tf24.getText())==1 && chg4.getState()==true) 
				 JOptionPane.showMessageDialog(this,"Invalid Date ","Alert",JOptionPane.WARNING_MESSAGE);
			 else if(validateVehicle(tf24.getText())==1 && chg5.getState()==true) 
				 JOptionPane.showMessageDialog(this,"Invalid Vehicle_No ","Alert",JOptionPane.WARNING_MESSAGE);
			 else 
				 fillfilter();
		 }
	}
	public void itemStateChanged(ItemEvent ai)
	{
		if(ai.getSource()==chg3)
		{
			if(chg3.getState()==true)
			    l35.setText("*only alphabets and whitespace are allowed");	
		}
		if(ai.getSource()==chg4)
		{
			if(chg4.getState()==true)
				l35.setText("*only numbers and '/' are allowed");	
		}
		if(ai.getSource()==chg5)
		{
			if(chg5.getState()==true)
				l35.setText("*only alphanumeric characters are allowed");	
		}
	}
	public static void main(String[] ar)
	{
		new CarService();
	}
}

