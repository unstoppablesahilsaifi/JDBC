/* From Learn code with Durgesh.
JDBC- It is an standared API provided by oracle for java applications to interact with differ types of databases.

How JDBC Works-

              =======>>                                 JDBC DB Drivers                           Databases
  Java App    <<=======        JDBC API                    Oracle  DB                              Oracle
  >-------JDBC application layer------<                      SQL DB                                 SQL
                                                        >------------JDBC Driver Layer-------------------<
  >------------------------------------JDBC Architecture-------------------------------------------------<
  
  To concept ye h ki hmare paas java application h or hmee data store krna h DB m, mtlb query likhne k liye hme JDBC API ki need pdegi ko connectivity k liye drivers ki
  jisse ki hmare app ki query drivers k through connect hokr Database s interact kr skeee.
