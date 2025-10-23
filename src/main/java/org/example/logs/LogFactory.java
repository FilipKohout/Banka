package org.example.logs;

import com.google.inject.Inject;
import org.example.logs.classes.Log;
import org.example.logs.services.LogListing;

public class LogFactory {
    @Inject
    public LogListing listing;

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
