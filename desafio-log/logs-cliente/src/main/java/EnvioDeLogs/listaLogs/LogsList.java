package EnvioDeLogs.listaLogs;

import EnvioDeLogs.example.modelo.Logger;
import EnvioDeLogs.example.modelo.Loggers;

import java.util.ArrayList;
import java.util.List;

public class LogsList implements Loggers {
    @Override
    public List<Logger> listarLogs() {
        List<Logger> loggers  = new ArrayList<>();
        loggers.add(new Logger("Log 1"));
        loggers.add(new Logger("Log 2"));
        return loggers;
    }
}
