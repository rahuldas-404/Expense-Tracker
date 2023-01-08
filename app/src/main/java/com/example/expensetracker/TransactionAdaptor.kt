package com.example.expensetracker

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TransactionAdaptor(private val transaction: ArrayList<Transaction>) : RecyclerView.Adapter<TransactionAdaptor.TransactionHolder>() {
    class TransactionHolder(view: View ): RecyclerView.ViewHolder(view){
        val labal: TextView = view.findViewById(R.id.labal);
        val amount: TextView = view.findViewById(R.id.amount);
    }
}