package log.file;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FileMain {

    private static Logger LOG = LoggerFactory.getLogger(FileMain.class);

    public static void main(String[] args) {
        LOG.info("Logging into log.file");
    }

}
