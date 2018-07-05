package log.console;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConsoleMain {

    private static Logger LOG = LoggerFactory.getLogger(ConsoleMain.class);

    public static void main(String[] args) {
        LOG.info("Logging into console");
    }

}
