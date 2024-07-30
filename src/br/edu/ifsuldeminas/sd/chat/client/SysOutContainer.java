package br.edu.ifsuldeminas.sd.chat.client;

import br.edu.ifsuldeminas.sd.chat.MensagemRecebida;
import br.edu.ifsuldeminas.sd.chat.MessageContainer;
import interchat.Inicio;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class SysOutContainer implements MessageContainer {
    @Override
    public void newMessage(String message) {
        if (message == null || message.equals("")) {
            return;
        }
        
        String[] messageParts = message.split(MessageContainer.FROM);


        
        String horaEDataAtual = new SimpleDateFormat("\n(dd/MM/yyyy - HH:mm:ss) ").format(Calendar.getInstance().getTime());
        System.out.println(String.format(horaEDataAtual+" %s - %s", messageParts[1],
                messageParts[0]));
        
        MensagemRecebida.mensagem = String.format(horaEDataAtual+"%s - %s", messageParts[1],
                messageParts[0]);
        
    }



}
