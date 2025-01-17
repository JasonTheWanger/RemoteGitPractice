package edu.ucsd.cse110.secards.lib;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

public class DeckTest {

    @Test
    public void top() {
        var deck = new Deck(List.of(
                new Flashcard("A", "1"),
                new Flashcard("B", "2"),
                new Flashcard("C", "3")
        ));
        var expected = new Flashcard("A", "1");
        var actual = deck.top();
        assertEquals(expected, actual);
    }

    @Test
    public void forward() {

    }

    @Test
    public void backward() {
    }

    @Test
    public void shuffle() {
    }
}