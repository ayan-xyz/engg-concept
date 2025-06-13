public class TestSingleton {
    public static void main(String[] args) {
        // Get the first instance and log a message
        Logger logger1 = Logger.getInstance();
        logger1.log("This is the first log message.");

        // Get the second instance and log another message
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Verify both instances are the same
        System.out.println("Are both loggers the same? " + (logger1 == logger2));
    }
}
