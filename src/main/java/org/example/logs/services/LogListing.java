package org.example.logs.services;

import com.google.inject.Inject;
import org.example.cards.CardList;
import org.example.logs.LogList;
import org.example.logs.classes.Log;

import java.util.ArrayList;

public class LogListing {
    @Inject
    public LogList logList;

    public void add(Log log) {
        logList.logs.add(log);
    }

    public void remove(Log log) {
        logList.logs.remove(log);
    }

    public ArrayList<Log> all() {
        return logList.logs;
    }
}
