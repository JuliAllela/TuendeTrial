package com.temtemo.tuende

import androidx.recyclerview.widget.RecyclerView
import com.temtemo.tuende.databinding.DestinationsCardcellRowLayoutBinding
// passs in VH cellbinding.root
//this var it should take a binding of our xml created IT wil take a var of our card cell binding
class CardViewHolder(private val destinationsCardcellRowLayoutBinding: DestinationsCardcellRowLayoutBinding )
    :RecyclerView.ViewHolder(destinationsCardcellRowLayoutBinding.root){
       // create fun of bindtravelsites which takes Travelsites
        fun bindTravelsites(travelsites: Travelsites) {
           // all we need is to set our view based on site it receives
            destinationsCardcellRowLayoutBinding.coverDestination.setImageResource(travelsites.image)
           destinationsCardcellRowLayoutBinding.TVDestination1.text = travelsites.SiteInfo
           destinationsCardcellRowLayoutBinding.TVDestination2.text = travelsites.about
        }
}