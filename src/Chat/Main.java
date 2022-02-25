package Chat;

public class Main {
    public static void main(String args[]){
        for(int i = 0; i < args.length; i++){
            if (args[i].equals("-s")){
                // server
                System.out.println("Starting server. . .");
                Server server = new Server();
            }else if(args[i].equals("-c")) {
                // client
                System.out.println("Starting client. . .");
                Client client = new Client();
            }else{
                System.out.println("Unkown argument");
                System.exit(0);
            }
        }
    }
}
