package turgutsonmez.com.fitness;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_details);

    TextView txtTitle = findViewById(R.id.txtTitle);
    ImageView imageViewExercise = findViewById(R.id.imageViewExercise);
    LinearLayout mainBg = findViewById(R.id.mainBg);

    String exerciseTitle = getIntent().getStringExtra(MainActivity.EXTRA_ITEM_TITLE);

    txtTitle.setText(exerciseTitle);

    if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_WEIGHT)) {
      imageViewExercise.setImageDrawable(getResources().getDrawable(R.drawable.weight2x, getApplicationContext().getTheme()));
      mainBg.setBackgroundColor(Color.parseColor("#2ca5f5"));
    } else if (exerciseTitle.equalsIgnoreCase(MainActivity.EXERCISE_YOGA)) {
      imageViewExercise.setImageDrawable(getResources().getDrawable(R.drawable.lotus2x, getApplicationContext().getTheme()));
      mainBg.setBackgroundColor(Color.parseColor("#916bcd"));
    } else {
      imageViewExercise.setImageDrawable(getResources().getDrawable(R.drawable.heart2x, getApplicationContext().getTheme()));
      mainBg.setBackgroundColor(Color.parseColor("#52ad56"));
    }
  }
}
