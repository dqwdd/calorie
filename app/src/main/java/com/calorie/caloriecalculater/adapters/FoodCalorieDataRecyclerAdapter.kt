package com.calorie.caloriecalculater.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apipractice.json.ItemData
import com.calorie.caloriecalculater.R


class FoodCalorieDataRecyclerAdapter(
    val mContext: Context,
    val mList: List<ItemData>) :
    RecyclerView.Adapter<FoodCalorieDataRecyclerAdapter.ItemViewHolder>() {

    class ItemViewHolder(val mContext: Context, view : View) : RecyclerView.ViewHolder(view) {

        //val textView = view.findViewById<TextView>(R.id.textView)

        fun bind( context: Context, data: ItemData ) {
           // textView.text =data.DESC_KOR
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.food_calorie_data_list_item, parent, false)
        return ItemViewHolder(mContext, view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val data = mList[position]
        holder.bind(mContext, data)
    }

    override fun getItemCount(): Int {
        return mList.size
    }

}