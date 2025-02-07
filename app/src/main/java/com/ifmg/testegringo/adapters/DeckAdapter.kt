
import android.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class DeckAdapter(deckList: List<Deck>) : RecyclerView.Adapter<DeckAdapter.DeckViewHolder>() {
    private val deckList: List<Deck> = deckList

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeckViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_deck, parent, false)
        return DeckViewHolder(view)
    }

    override fun onBindViewHolder(holder: DeckViewHolder, position: Int) {
        val deck: Deck = deckList[position]
        holder.deckNameText.setText(deck.getName())
        // Defina outros dados para o item aqui
    }

    override fun getItemCount(): Int {
        return deckList.size
    }

    class DeckViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var deckNameText: TextView = itemView.findViewById<TextView>(R.id.deck_name_text)

        init {
            // Inicie outros componentes aqui
        }
    }
}