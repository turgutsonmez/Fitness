package turgutsonmez.com.fitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

  public static final String EXTRA_ITEM_TITLE = "extra.item.title";
  public static final String EXERCISE_WEIGHT = "Weight Lifting";
  public static final String EXERCISE_YOGA = "Yoga";
  public static final String EXERCISE_CARDIO = "Cardio";

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    RelativeLayout weightBtn = findViewById(R.id.weightBtn);
    RelativeLayout yogaBtn = findViewById(R.id.yogaBtn);
    RelativeLayout cardioBtn = findViewById(R.id.cardioBtn);

    weightBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        loadDetailActivity(EXERCISE_WEIGHT);
      }
    });

    yogaBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        loadDetailActivity(EXERCISE_YOGA);
      }
    });

    cardioBtn.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        loadDetailActivity(EXERCISE_CARDIO);
      }
    });
  }

  private void loadDetailActivity(String exerciseTitle) {
    Intent intent = new Intent(MainActivity.this, DetailsActivity.class);
    intent.putExtra(MainActivity.EXTRA_ITEM_TITLE, exerciseTitle);
    startActivity(intent);
  }
}
