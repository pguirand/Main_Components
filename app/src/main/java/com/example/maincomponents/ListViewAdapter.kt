package com.example.maincomponents

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import java.text.FieldPosition

class ListViewAdapter(val context:Context, var contactList : List<MainActivity.Contact>) : BaseAdapter(){
    override fun getCount() = contactList.size

    override fun getItem(position: Int): MainActivity.Contact {
        return contactList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view: View? = convertView
        if (view == null) {
            view = LayoutInflater.from(context)
                .inflate(R.layout.layout_list_view, parent, false)
        }


        val currentItem = getItem(position) as MainActivity.Contact
        val textViewItemName = view
            ?.findViewById(R.id.person_name) as TextView
        val textViewItemDescription = view
            ?.findViewById(R.id.person_phone) as TextView
        textViewItemName.text = currentItem.name
        textViewItemDescription.text = currentItem.phoneNumber


        return view
    }

}