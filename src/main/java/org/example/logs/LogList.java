package org.example.logs;

import com.google.inject.Singleton;
import org.example.logs.classes.Log;

import java.util.ArrayList;

@Singleton
public class LogList {
    public ArrayList<Log> logs = new ArrayList<Log>();
}
