/* From Learn code with Durgesh.
JDBC- It is an standared API provided by oracle for java applications to interact with differ types of databases.

How JDBC Works-

              =======>>                                 JDBC DB Drivers                           Databases
  Java App    <<=======        JDBC API                    Oracle  DB                              Oracle
  >-------JDBC application layer------<                      SQL DB                                 SQL
                                                        >------------JDBC Driver Layer-------------------<
  >------------------------------------JDBC Architecture-------------------------------------------------<
  
  To concept ye h ki hmare paas java application h or hmee data store krna h DB m, mtlb query likhne k liye hme JDBC API ki need pdegi ko connectivity k liye drivers ki
  jisse ki hmare app ki query drivers k through connect hokr Database s interact kr skeee. */

// How to set drivers in classpath
/* 1. Install JDK and set path.(Write JDK in chrome and download as per the system). [https://www.youtube.com/watch?v=UGH5FTd4Wvc]
     Path set krne k liye environment variable m system variable k andar path name k variable k andar jdk k bin tak ki location s set krdo.
     Fir JAVA_HOME k name s banao ek variable system variable k andar hi, usme bin s pehle step tak ki path location m set krdo yeahhhhhhhhhhhhhh path set hamara fir.
     Check krna ho to open cmd and type java -verison. version show krdega.
   
   2. Now needed a Database
   https://www.youtube.com/watch?v=sm7Fe609ilE   Use this video to download and set the workbench or sql database.
   
   3. Now we are using mysql to hme mysql ka driver chahiye iske driver ko bolte h mysql-connector.
     Please download the same version connector same as the verison of mysql.
     To check the version of mysql-> open mysql client view-> type 
     // Basically jo driver hote h vo jar file hoti h 
     
     Ab Scene h ki driver download krke C drive m paste krdo jar file ko uske baad path copy kro jar file tak ka, environment variable m jake classpath name k varible
     bnakr paste krdo.
     uske baad Open CMD- write cls and enter ans write javap com.mysql.jdbc.Driver and Enter. All Done Yeahhhhhhhhhhhhhhhhh..............*/
     
 ++++++++++++++++++++++++++++++++++
 //Now steps to connect database;
 
 1. Load the Driver:
                  //Java m ek Class naam ki ek class h jisme ek method h forName() is method ko hm koi bhi class string ki format m de to vo usee memory m load krdeta h.
                   Class forName("com.mysql.jdbc.Driver");
                                                                  or
                 //Dusra tarika bhi h, ek class h DriverManager jiske paas ek method h registerDriver jo ki hmare driver ka object leta h;
                 DriverManager registerDrive(new com.mysql.jdbc.Driver());

2.Create a connection:
                  Connection con=DriverManager.getConnection();
                // DriverManager jo class h uska getconnection jo method h vo hmee hmre connection ka method de dega to hme Connection type k hi variable m store krna pdega.
                Note: Java.sql ko import bhi krna pdega.
                  Connection con=DriverManager.getConnection("url","username","password");
                 // getConnection method 3 cheeje leta h ek to url(DB h kha pe install, IP bhi dena hoga computer ka) uske baad username and password.
                  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname","root","root");
                 To check the port number u'll see port number.
                   
3.Create Query:statement(for normal query), PreparedStatement(for complex query which has some symbols like this-> ?),CallableStatement(For Stored procedure kind of).
              // Suppose We have a query 
              String q="select * from student"; (Normal query h to Statement use hoga)
// ab hme nikalna hoga statement ka object, statement ka object hme dega connection,jo connection hmara bna tha vo con vale variable m h.
              Statement stmt=con.createStatement(); (Hm query ko fire kr sakte h stmt ki help s)
                ResultSet set=stmt.executeQuery(q);// agar insert update ya delete ki query h to execute query ki jagah update Query use hoga or return type int hoga
                                                   // iska na ki ResultSet kyuki data update vgera ho rha h na ki select(aa rha h )

4. Process the Data:
                    while(set.next())  // set s puchenge ki next row khaa h uske hisab s next row pe jayga, tabhi to puri table aaygi
                    {
                      int id=set.getInt("column_number ya col name paas krdo");
                      String name=set.getString("stuName");
                      sout(id);
                      sout(name);
                    }
5. Close the Connection:
                        con.close();



//Complete executable programm:

// this program  is for JDBC
import java.sql.*;// must use this
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
class FirstJdbc
{
	public static void main(String args[])
	{
		try{
           //load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create connection
			//String url= "jdbc:mysql://localhost:3306/utube";
			//String username="root";
			//String Password="root";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/utube","root","root");
            // To check whether the connection is created or not
			if(con.isClosed())
			{
				System.out.println("Connection is closed");
			}
			else 
			{
				System.out.println("Connection is created");
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


O/P- Connection is Created

               
            




     
   
