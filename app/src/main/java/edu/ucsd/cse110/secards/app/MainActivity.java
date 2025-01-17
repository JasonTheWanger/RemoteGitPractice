package edu.ucsd.cse110.secards.app;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import edu.ucsd.cse110.secards.app.databinding.ActivityMainBinding;

import edu.ucsd.cse110.secards.lib.Deck;
import edu.ucsd.cse110.secards.lib.PlaceholderData;


public class MainActivity extends AppCompatActivity{
    private ActivityMainBinding binding;
    private boolean isShowingFront = true;
    private Deck deck = PlaceholderData.DECK;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setTitle(R.string.app_title);

        this.binding = ActivityMainBinding.inflate(getLayoutInflater());
        binding.cardText.setText(deck.top().front());

        binding.card.setOnClickListener(v -> {
            isShowingFront = !isShowingFront;
            updateText();
        });

        binding.nextButton.setOnClickListener(v -> {
            deck = Deck.forward(deck);
            updateText();
        });

        binding.prevButton.setOnClickListener(v -> {
            deck = Deck.backward(deck);
            updateText();
        });

        binding.shuffleButton.setOnClickListener(v -> {
            deck = Deck.shuffle(deck);
            updateText();
        });

        setContentView(binding.getRoot());
    }
    private void updateText(){
        if (isShowingFront){
            binding.cardText.setText(deck.top().front());
        }
        else {
            binding.cardText.setText(deck.top().back());
        }
    }
}
