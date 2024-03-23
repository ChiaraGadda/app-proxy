public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        HttpURLAppConnection connection = new HttpURLAppConnection();
        connection.sendGET();
    
        System.out.println("Close app!");
    }
}