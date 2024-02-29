package EnvioDeLogs;

import EnvioDeLogs.envio.EnvioLogsList;
import EnvioDeLogs.example.EnvioLogger;

public class EnviarLog {
    public static void main(String[] args) {
        EnvioLogger envioLogger = new EnvioLogsList();
        envioLogger.enviarLog();
    }
}
