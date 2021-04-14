import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;
import java.lang.*;
import com.centerkey.utils.BareBonesBrowserLaunch;


//CREATE JAVA INTERFACE TO SELECT CONTAINER
class app{
	public static void main(String args[]) {	
		int started = 0;
		String one = "Jupyter Notebook";
		String two = "Rstudio";
		String three = "Spyder";
		String four = "IBM SAS";
		String five = "Git";
		String six = "Orange";
		String seven = "Visual Studio";
		String eight = "Apache Hadoop";
		String nine = "Apache Spark";
		String ten = "Tableau";
		String eleven = "SonarQube";
		String twelve = "TensorFlow";
		String thirteen = "Markdown";
		String close = "Close Current Browser";
		System.out.println("Application Running");
		JFrame frame = new JFrame("Application Selection");
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Please Select an Option:");
		JButton button1 = new JButton(one);
		JButton button2 = new JButton(two);
		JButton button3 = new JButton(three);
		JButton button4 = new JButton(four);
		JButton button5 = new JButton(five);
		JButton button6 = new JButton(six);
		JButton button7 = new JButton(seven);
		JButton button8 = new JButton(eight);
		JButton button9 = new JButton(nine);
		JButton button10 = new JButton(ten);
		JButton button11 = new JButton(eleven);
		JButton button12 = new JButton(twelve);
		JButton button13 = new JButton(thirteen);
		JButton button14 = new JButton(close);
		//SET ACTION ON BUTTON CLICK
		ActionListener listen = new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				String application = event.getActionCommand();
				//ADD INSTRUCTIONS FOR NEW CONTAINER CALL
				try {
					switch (application) {
						case "Jupyter Notebook": 
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("http://host.docker.internal:8887");
							//token=b731f1732098a572fcec76a5cd3cab4c0c7d3bb2eec6d88a
							break;
						case "Rstudio":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("http://host.docker.internal:8787");
							break;
						case "Spyder":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("https://mybinder.org/v2/gh/spyder-ide/spyder/4.x?urlpath=/desktop");
							break;
						case "IBM SAS":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("https://welcome.oda.sas.com/login");
							break;
						case "Git":
							System.out.println("Starting:" + application);
							String[] command_git = {"xterm"};//, "-e", "ssh", "root@git"+"; yes" +"; bash"}; //"sshpass", "-p", "root", 
							Process proc_git = new ProcessBuilder(command_git).start();
							//ssh into github container
							break;
						case "Orange":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("http://host.docker.internal:6901");
							break;
						case "Visual Studio":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("http://host.docker.internal:8080");
							break;
						case "Apache Hadoop":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("http://host.docker.internal:50070");
							String[] command_hadoop = {"xterm"};
							Process proc_hadoop = new ProcessBuilder(command_hadoop).start();
							break;
						case "Apache Spark":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("http://host.docker.internal:8082");
							String[] command_spark = {"xterm","-e","ping","172.28.0.11"+"; bash"};
							Process proc_spark = new ProcessBuilder(command_spark).start();
							break;
						case "Tableau":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("https://sso.online.tableau.com/public/idp/SSO");
							break;
						case "SonarQube":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("https://sonarcloud.io/projects");
							//BareBonesBrowserLaunch.openURL("http://host.docker.internal:9000");							
							break;
						case "TensorFlow":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("http://host.docker.internal:8888");	
							break;
						case "Markdown":
							System.out.println("Starting:" + application);
							BareBonesBrowserLaunch.openURL("http://host.docker.internal:12345");
							break;
						case "Close Current Browser":
							System.out.println("Closing:" + application);
							Runtime.getRuntime().exec("pkill -f firefox");
							Runtime.getRuntime().exec("pkill -f xterm");
							break;
					}
				} catch (Exception e){
					System.out.println("Exception");
					e.printStackTrace();
				}
			}
		};
		button1.setActionCommand(one);
		button1.addActionListener(listen);
		button2.setActionCommand(two);
		button2.addActionListener(listen);
		button3.setActionCommand(three);
		button3.addActionListener(listen);
		button4.setActionCommand(four);
		button4.addActionListener(listen);
		button5.setActionCommand(five);
		button5.addActionListener(listen);
		button6.setActionCommand(six);
		button6.addActionListener(listen);
		button7.setActionCommand(seven);
		button7.addActionListener(listen);
		button8.setActionCommand(eight);
		button8.addActionListener(listen);
		button9.setActionCommand(nine);
		button9.addActionListener(listen);
		button10.setActionCommand(ten);
		button10.addActionListener(listen);
		button11.setActionCommand(eleven);
		button11.addActionListener(listen);
		button12.setActionCommand(twelve);
		button12.addActionListener(listen);
		button13.setActionCommand(thirteen);
		button13.addActionListener(listen);
		button14.setActionCommand(close);
		button14.addActionListener(listen);
		panel.setLayout(null);
		label.setBounds(135,50,200,20);
		button1.setBounds(135,100,200,30);
		button2.setBounds(135,150,200,30);
		button3.setBounds(135,200,200,30);
		button4.setBounds(135,250,200,30);
		button5.setBounds(135,300,200,30);
		button6.setBounds(135,350,200,30);
		button7.setBounds(135,400,200,30);
		button8.setBounds(135,450,200,30);
		button9.setBounds(135,500,200,30);
		button10.setBounds(135,550,200,30);
		button11.setBounds(135,600,200,30);
		button12.setBounds(135,650,200,30);
		button13.setBounds(135,700,200,30);
		button14.setBounds(135,750,200,30);
		panel.add(label);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(button6);
		panel.add(button7);
		panel.add(button8);
		panel.add(button9);
		panel.add(button10);
		panel.add(button11);
		panel.add(button12);
		panel.add(button13);
		panel.add(button14);
		frame.getContentPane().add(panel);
		frame.setSize(400,800);
		frame.setVisible(true);
		
	}
}