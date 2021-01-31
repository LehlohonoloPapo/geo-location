



public class validation {

    String username ="Lehlohonolo";
    String Password ="Papo";
    public  validation( ) {

//        this.username=username;
//        this.Password=Password;
//


//        System.out.println("running");
//        Connection c = null;
//
//        try {
//            Class.forName("org.sqlite.JDBC");
//            c = DriverManager.getConnection("jdbc:sqlite:identifier.sqlite");
//        } catch ( Exception e ) {
//            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
//            System.exit(0);
//        }
//        System.out.println("Opened database successfully");


    }
    public boolean validate(String usr, String psw){
        if(!usr.isEmpty()) {
            if (usr.equalsIgnoreCase(username)) {
               if(psw.equalsIgnoreCase(Password)){
                   return true;
               }
               else {
                   return false;
               }
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
    }


}

