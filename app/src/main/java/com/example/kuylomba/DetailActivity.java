package com.example.kuylomba;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.kuylomba.model.Contest;

public class DetailActivity extends AppCompatActivity {
    private String title = "Detail";
    public static final String SELECTED_CONTEST = "selected_contest";

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        setActionBarTitle(title);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Set values
        Contest contest = getIntent().getParcelableExtra(SELECTED_CONTEST);

        RatingBar star = findViewById(R.id.star);
        ImageView thumbnail = findViewById(R.id.thumbnail);
        TextView name = findViewById(R.id.name),
                rewardRange = findViewById(R.id.rewardRange),
                website = findViewById(R.id.website),
                entryFee = findViewById(R.id.entryFee),
                specifications = findViewById(R.id.specifications),
                category = findViewById(R.id.category),
                description = findViewById(R.id.description),
                deadline = findViewById(R.id.deadline);

        star.setRating(contest.getStar());
        name.setText(contest.getName());
        thumbnail.setImageResource(contest.getThumbnail());
        rewardRange.setText(contest.getRewardRange());
        website.setText(contest.getWebsite());
        website.setMovementMethod(LinkMovementMethod.getInstance());
        description.setText(contest.getDescription());
        entryFee.setText("$" + contest.getEntryFee());
        specifications.setText(String.join("\n\n", contest.getSpecifications()));
        category.setText(contest.getCategory());
        deadline.setText(contest.getDeadline());
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
