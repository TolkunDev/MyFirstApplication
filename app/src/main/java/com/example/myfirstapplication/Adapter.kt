package com.example.myfirstapplication

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private var array: ArrayList<Wish>):RecyclerView.Adapter<Adapter.ViewHolder>() {
    class ViewHolder(view: View):RecyclerView.ViewHolder(view){
        val name:TextView = view.findViewById(R.id.nameWish)
        val checked: CheckBox = view.findViewById(R.id.check)
        val edit: ImageButton = view.findViewById(R.id.edit)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list,parent,false)
        return ViewHolder(view)
    }
    private var onItemClickListener: View.OnClickListener? = null

    override fun getItemCount(): Int {
        return array.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
         val item = array[position]
        holder.name.text = item.name
        holder.checked.isChecked = item.flag
        holder.edit.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, EditActivity::class.java)
            intent.putExtra("itemName", item.name)
            intent.putExtra("itemDescription", item.descriprion)
            context.startActivity(intent)
        }
    }
}