package EnvioDeLogs.envio;

import EnvioDeLogs.example.EnvioLogger;
import EnvioDeLogs.example.modelo.Loggers;
import EnvioDeLogs.listaLogs.LogsList;

public class EnvioLogsList extends EnvioLogger {
    @Override
    protected Loggers criarLoggers() {
        return new LogsList();
    }
}
