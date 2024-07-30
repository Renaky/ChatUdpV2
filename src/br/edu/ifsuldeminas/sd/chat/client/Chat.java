package br.edu.ifsuldeminas.sd.chat.client;

import java.util.Scanner;
import br.edu.ifsuldeminas.sd.chat.ChatException;
import br.edu.ifsuldeminas.sd.chat.ChatFactory;
import br.edu.ifsuldeminas.sd.chat.MessageContainer;
import br.edu.ifsuldeminas.sd.chat.Sender;

public class Chat {
    static int localPort,serverPort;
    static String from, message,ip;
     Sender sender;
    
    public Chat(int localPort,int serverPort,String from, String message, String ip) {
        this.localPort = localPort;
        this.serverPort = serverPort;
        this.from = from;
        this.message = message;
        this.ip = ip;
        
    }

    public static String KEY_TO_EXIT = "q";
    public static int RECEIVER_BUFFER_SIZE = 1000;

    public Chat(String message) {
        this.enviar(message);
    }

    public Chat() {

    }

    public void conectar() {
        try {
            Sender sender = ChatFactory.build(ip, serverPort,
                    localPort, new SysOutContainer());
            this.sender = sender;
                message = String.format("%s%s%s", message,MessageContainer.FROM, from);
                if (!message.equals("")) {
                    if (message.equals("q")) {
                        System.exit(0);
                    } else {
                        sender.send(message);
                    }
                }
        } catch (ChatException chatException) {
            System.err.printf(String.format(
                    "Houve algum erro no chat. Mensagem do erro: %s",
                    chatException.getCause().getMessage()));
        } finally {
        }
    }
    
    public boolean enviar(String mensagem) {
        try {
                message = String.format("%s%s%s", mensagem,MessageContainer.FROM, from);
                if (!message.equals("")) {
                    if (message.equals("q")) {
                        System.exit(0);
                    } else {
                        this.sender.send(message);
                    }
                }
        } catch (ChatException chatException) {
            System.err.printf(String.format(
                    "Houve algum erro no chat. Mensagem do erro: %s",
                    chatException.getCause().getMessage()));
        } finally {
            return true;
        }
    }
}
