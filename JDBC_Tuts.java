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
   
