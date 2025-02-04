package com.ifmg.testegringo.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.TextView
import com.ifmg.testegringo.R
import com.ifmg.testegringo.model.Food

class FoodListCustomItem(context: Context):BaseAdapter() {

    lateinit var itemAdapter: ArrayAdapter<String>
    var foods:MutableList<Food> = mutableListOf()
    lateinit var inflater:LayoutInflater

    init {
        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    }

    override fun getCount(): Int {
        return foods.size
    }

    override fun getItem(position: Int): Any {
        return foods[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var tempView = convertView

        //será que o item foi RENDER. em algum momento
        if(tempView == null){
            tempView = inflater.inflate(R.layout.food_item_home,parent)

            tempView.findViewById<TextView>(R.id.name_item).setText(foods[position].name)


        }



        return TODO("Provide the return value")
    }
}