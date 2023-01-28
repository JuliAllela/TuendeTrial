package com.temtemo.tuende
// crete a var for book list, i.e mutable name of our Traveliste object
var destination_List = mutableListOf<Travelsites>()
// step 1  create a layout file for our recycler view row
// layout create a viewholder class
data class Travelsites(val image: Int, val SiteInfo: String, val about: String, val id :Int? = destination_List.size)
