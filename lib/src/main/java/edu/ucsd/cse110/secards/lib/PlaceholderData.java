package edu.ucsd.cse110.secards.lib;

import java.util.List;

public class PlaceholderData {
    public final static Deck DECK = new Deck(List.of(
            new Flashcard("SRP", "Single Responsibility Principal"),
            new Flashcard("OCP", "Open-Closed Principal"),
            new Flashcard("LSP", "Liskov Substitution Principal"),
            new Flashcard("ISP", "Interface Segregation Principal"),
            new Flashcard("DIP", "Dependencies Inversion Principal"),
            new Flashcard("LKP", "Least Knowledge Principal (Law of Demeter)")
    ));
}
