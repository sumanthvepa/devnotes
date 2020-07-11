package sv.demo.manualjar;

public class App {
    public String getGreeting() {
        return 
	"This program is packaged into runnable JAR "
	+ "that was created manually";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
