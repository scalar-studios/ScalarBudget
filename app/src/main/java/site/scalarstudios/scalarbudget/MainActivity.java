package site.scalarstudios.scalarbudget;

import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import site.scalarstudios.scalarbudget.cards.CardAdapter;
import site.scalarstudios.scalarbudget.cards.SubCard;

/**
 * MainActivity is the entry point of the Scalar Budget application.
 * It sets up the main layout and applies edge-to-edge display settings.
 *
 * @author Lemon_Juice
 */
public class MainActivity extends AppCompatActivity {

    /**
     * Called when the activity is starting.
     * This method sets the content view and applies window insets for edge-to-edge display.
     *
     * @param savedInstanceState If the activity is being re-initialized after previously being shut down,
     *                           this Bundle contains the data it most recently supplied in onSaveInstanceState(Bundle).
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<SubCard> cardItems = new ArrayList<>();
        cardItems.add(new SubCard(R.drawable.image1, 12.34));
        cardItems.add(new SubCard(R.drawable.image2, 56.78));

        CardAdapter adapter = new CardAdapter(this, cardItems);
        recyclerView.setAdapter(adapter);
    }
}