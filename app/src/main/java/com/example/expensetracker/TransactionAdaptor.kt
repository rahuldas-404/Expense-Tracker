package com.example.expensetracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class TransactionAdaptor(private val transaction: ArrayList<Transaction>) : RecyclerView.Adapter<TransactionAdaptor.TransactionHolder>() {
    class TransactionHolder(view: View ): RecyclerView.ViewHolder(view){
        val labal: TextView = view.findViewById(R.id.labal);
        val amount: TextView = view.findViewById(R.id.amount);
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TransactionHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.transaction, parent, false)
        return TransactionHolder(view)
    }

    override fun onBindViewHolder(holder: TransactionHolder, position: Int) {
        val transaction = transaction[position]
        val context = holder.amount.context


        if(transaction.amount >= 0){
            holder.amount.text = "+ $%.2f".format(transaction.amount)
            holder.amount.setTextColor(ContextCompat.getColor(context, R.color.green))
        }else {
            holder.amount.text = "- $%.2f".format(Math.abs(transaction.amount))
            holder.amount.setTextColor(ContextCompat.getColor(context, R.color.red))
        }

        holder.label.text = transaction.label
    }

}