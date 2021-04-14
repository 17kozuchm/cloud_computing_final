# CS1660: Project 1 - Data Science Toolbox
Mary Kozuch
CS1660 Final Project
Docker Hub: https://hub.docker.com/u/mak402

* APPLICATION DEMO VIDEO ABOVE: Mary_Kozuch_Data_Science_Demo.mp4
* CODE WALKTHROUGH VIDEO ON ONEDRIVE: [Mary_Kozuch_Data_Science_Code.mp4](https://pitt-my.sharepoint.com/:v:/g/personal/mak402_pitt_edu/EatFNxHDfOtCtWRLS5_Fsw8B4SnQdQrySupsURYmaoTGnQ?e=u9ckhs)

Necessary Host Machine Configuration: 
- the host computer must have docker capabilities such as docker desktop installed
- xlaunch must also be configured on the host machine to launch visual applications

Setting Up the Data Science Toolbox:
1. Download docker-compose.yml 
2. In line 128 of docker-compose.yml: replace \<HOST IP ADDRESS\> with the current host IP address
3. Open terminal and navigate to the folder holding the docker-compose.yml file
4. Run the command "docker-compose up" in the terminal

Using the Data Science Toolbox:
Please ensure that you have successfully built the toolbox following the above steps before proceeding.
1. Jupyter
- Select the "Jupyter Notebook" option from the menu
- A Jupyter Notebook application will then populate the firefox browser
2. Rstudio
- Select the "Rstudio" option from the menu
- An RStudio application will then populate the firefox browser
3. Spyder
- Select the "Spyder" option from the menu
- Following the binder loading screen, an application will populate the firefox browser
- Select the Spyder icon on the left of the screen to launch the Spyder IDE
4. IBM SAS
- Select the "IBM SAS" option from the menu
- An IBM SAS application will then populate the firefox browser
5. Git
- Select the "Git" option from the menu
- An xterm terminal will then be generated
- In xterm input: ssh git
- In the following prompt input: yes
- When prompted input the password: root
- To check that git is running input the command: git --version
6. Orange
- Select the "Orange" option from the menu
- An application will then populate the firefox browser
- In the password box at the top of the screen input: orange
- Select the Orange icon on the left of the screen to launch Orange
7. Visual Studio
- Select the "Visual Studio" option from the menu
- In the password box input: password
- A Visual Studio editor will then populate the firefox browser
8. Apache Hadoop
- Select the "Apache Hadoop" option from the menu
- The hadoop web gui will then populate the firefox browser
- Additionally, an xterm terminal will be generated
- In xterm input: ssh hduser@Apache_Hadoop
- In the following prompt input: yes
- When prompted input the password: hduser
- To check that hadoop is running input the command: hadoop version
9. Apache Spark
- Select the "Apache Spark" option from the menu
- The Spark web gui will then populate the firefox browser
10. Tableau
- Select the "Tableau" option from the menu
- A tableau application will then populate the firefox browser
11. SonarQube
- Select the "SonarQube" option from the menu
- The SonarCloud application will then populate the firefox browser
12. TensorFlow
- Select the "TensorFlow" option from the menu
- If this is your first time opening TensorFlow from this container:
  - Copy the token value from the host terminal output
  - Under "Setup a Password" Paste the copied token
  - Then input a new password
- If you have run this docker container before and previously set a password:
  - Type your password into the "Password" field provided
13. Markdown
- Select the "Markdown" option from the menu
- A Markdown application will then populate the firefox browser
14. Close Current Browser
- Selecting this option will close all Firefox and xterm applications currently open
