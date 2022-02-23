package com.example.info_covid19.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.info_covid19.R
import androidx.recyclerview.widget.RecyclerView
import com.example.info_covid19.model.ProvinceResponse
import kotlinx.android.synthetic.main.item_province.view.*


class ProvinceAdapter(private var list: ArrayList<ProvinceResponse>): RecyclerView.Adapter<ProvinceAdapter.ProvinceViehHolder>(){
    inner class ProvinceViehHolder(itemView:View): RecyclerView.ViewHolder(itemView){
        fun bind(province:ProvinceResponse){
            with(itemView){
                tvName.text = province.attributes.province
                tvPositive.text = province.attributes.positive.toString()
                tvRecover.text = province.attributes.recover.toString()
                tvDeath.text = province.attributes.death.toString()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProvinceViehHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_province, parent, false)
        return ProvinceViehHolder(view)
    }

    override fun onBindViewHolder(holder: ProvinceViehHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}