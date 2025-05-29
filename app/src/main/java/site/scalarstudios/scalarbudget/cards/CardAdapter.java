package site.scalarstudios.scalarbudget.cards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import java.util.Locale;

import site.scalarstudios.scalarbudget.R;

/**
 * The CardAdapter class is a RecyclerView adapter that binds SubCard data to card views.
 * It is used to display a list of cards with images and decimal values in the Scalar Budget application.
 *
 * @author Lemon_Juice
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private List<SubCard> cardList;
    private Context context;

    public CardAdapter(Context context, List<SubCard> cardList) {
        this.context = context;
        this.cardList = cardList;
    }

    public static class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView decimalText;

        public CardViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.card_image);
            decimalText = itemView.findViewById(R.id.card_decimal);
        }
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.card_item, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        SubCard card = cardList.get(position);
        holder.imageView.setImageResource(card.getImageResID());
        holder.decimalText.setText(String.format(Locale.US, "%.2f", card.getDecimalValue()));
    }

    @Override
    public int getItemCount() {
        return cardList.size();
    }

}
