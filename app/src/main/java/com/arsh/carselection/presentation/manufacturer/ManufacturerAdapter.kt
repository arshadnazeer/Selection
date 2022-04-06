package com.arsh.carselection.presentation.manufacturer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.arsh.carselection.data.model.manufacturer.Manufacturer
import com.arsh.carselection.databinding.ListItemBinding

class ManufacturerAdapter : RecyclerView.Adapter<MyViewHolder>(){
    private val manufacturerList = ArrayList<Manufacturer>()

//    fun setList(manufacturer: List<Manufacturer>){
//        manufacturerList.clear()
//        manufacturerList.addAll(manufacturer)
//    }
//

    private val callback = object : DiffUtil.ItemCallback<Manufacturer>(){
        override fun areItemsTheSame(oldItem: Manufacturer, newItem: Manufacturer): Boolean {
            TODO()
        }

        override fun areContentsTheSame(oldItem: Manufacturer, newItem: Manufacturer): Boolean {
            return oldItem==newItem
        }

    }
    val differ = AsyncListDiffer(this,callback)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ListItemBinding.inflate(
            layoutInflater,
            parent,
            false
        )
        return MyViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val manufacturer = differ.currentList[position]
        holder.bind(manufacturer)
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

}

class MyViewHolder(val binding: ListItemBinding ): RecyclerView.ViewHolder(binding.root){
    fun bind( manufacturer:Manufacturer){
//        binding.tvManufacturers.text = manufacturer.
    }

}