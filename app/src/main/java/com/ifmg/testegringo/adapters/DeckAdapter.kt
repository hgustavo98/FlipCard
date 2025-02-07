package com.ifmg.testegringo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ifmg.testegringo.R
import com.ifmg.testegringo.model.Deck

class DeckAdapter(private val context: Context, private var decks: MutableList<Deck>) :
    RecyclerView.Adapter<DeckAdapter.DeckViewHolder>() {

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeckViewHolder {
        val view = inflater.inflate(R.layout.item_deck, parent, false)
        return DeckViewHolder(view)
    }

    override fun onBindViewHolder(holder: DeckViewHolder, position: Int) {
        val deck = decks[position]
        holder.deckName.text = deck.name
    }

    override fun getItemCount(): Int {
        return decks.size
    }

    fun updateDecks(newDecks: List<Deck>) {
        decks.clear()
        decks.addAll(newDecks)
        notifyDataSetChanged()
    }

    class DeckViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val deckName: TextView = itemView.findViewById(R.id.deck_name_item)
    }
}
