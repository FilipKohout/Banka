package org.example.logs;

import org.example.logs.classes.Log;
import org.example.logs.services.LogListing;

public class LogFactory {
    private final LogListing listing = new LogListing();
    public Log createLog(LogType type, String message) {
        Log log = new Log(
            java.util.UUID.randomUUID().toString(),
            "",
            type,
            message
        );

        listing.add(log);
        return log;
    }
}
