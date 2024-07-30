package br.edu.ifsuldeminas.sd.chat;

import interchat.Inicio;

public interface MessageContainer {

    String FROM = "::de::";

    void newMessage(String message);
}
