package com.example.mycontact

package com.example.contactapp


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.contactapp.databinding.ContactListItemBinding
class ContactAdapter(var ContactList:List<ContactData>) : RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListItemBinding .inflate(LayoutInflater.from(parent.context),parent ,false)
        return ContactViewHolder(binding)
    }
    override fun getItemCount(): Int {
        return ContactList.size
    }
    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact =ContactList.get(position)
        var  binding=holder.binding
        binding.tvDisplayName.text=currentContact.displayName
        binding.tvNumber.text=currentContact.phoneNumber
        binding.tvEmail.text =currentContact.email
    }
}
class ContactViewHolder( var binding:ContactListItemBinding):ViewHolder(binding.root)

//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView.ViewHolder
//import com.example.mycontact.databinding.ContactListItemBinding
//class ContactAdapter(var contactList:List<ContactData>):RecyclerView.Adapter<ContactViewHolder> {
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
//        val binding =
//            ContactListItemBinding .inflate(LayoutInflater.from(parent.context),parent ,false)
//        return ContactViewHolder(binding)
//    }
//    override fun getItemCount(): Int {
//        return contactList.size
//    }
//    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
//        var currentContact =contactList.get(position)
//        var  binding=holder.binding
//        binding.tvDisplayName.text=currentContact.displayName
//        binding.tvNumber.text=currentContact.phoneNumber
//        binding.tvEmail.text =currentContact.email
//    }
//}
//class ContactViewHolder( var binding:ContactListItemBinding): RecyclerView.ViewHolder(binding.root)