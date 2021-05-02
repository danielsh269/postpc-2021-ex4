package exercise.find.roots;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class SuccessActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.success_activity);
        Intent intentCreatedMe = getIntent();

        TextView originalNumberView = findViewById(R.id.original_number);
        TextView root1View = findViewById(R.id.root1);
        TextView root2View = findViewById(R.id.root2);
        TextView timeView = findViewById(R.id.calculation_time);

        long original = intentCreatedMe.getLongExtra("original_number", 0);
        long root1 = intentCreatedMe.getLongExtra("root1", 0);
        long root2 = intentCreatedMe.getLongExtra("root2", 0);
        long time = intentCreatedMe.getLongExtra("calculation_time_seconds", 0);

        String original_str = "original number: " + original;
        originalNumberView.setText(original_str);

        String root1_str = "root 1: " + root1;
        root1View.setText(root1_str);

        String root2_str = "root 2: " + root2;
        root2View.setText(root2_str);

        String time_str = "calculation time: " + time + " seconds";
        timeView.setText(time_str);




    }
}
