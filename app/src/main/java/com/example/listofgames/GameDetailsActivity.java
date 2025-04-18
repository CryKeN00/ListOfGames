package com.example.listofgames;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class GameDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_details);

        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int imageResource = getIntent().getIntExtra("image", 0);

        TextView titleTextView = findViewById(R.id.game_title);
        TextView descriptionTextView = findViewById(R.id.game_description);
        ImageView imageView = findViewById(R.id.game_image);

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        imageView.setImageResource(imageResource);
    }
}