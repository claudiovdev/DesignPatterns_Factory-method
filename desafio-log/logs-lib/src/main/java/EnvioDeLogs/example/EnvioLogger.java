package EnvioDeLogs.example;

import EnvioDeLogs.example.modelo.Logger;
import EnvioDeLogs.example.modelo.Loggers;

import java.util.List;

public abstract  class EnvioLogger {

    protected abstract Loggers criarLoggers();
   public boolean enviarLog(){
       List<Logger> loggers = criarLoggers().listarLogs();

       System.out.println("Iniciando o envio de Logs");

       for(Logger logger : loggers){
           System.out.println("Log enviado: " + logger.getMensagem()    );
       }

       return true;
   }
}