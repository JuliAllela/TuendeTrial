package com.temtemo.tuende
// RV VH adapter neeeds a VH after this create a new kotlin class and pass in
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.temtemo.tuende.databinding.DestinationsCardcellRowLayoutBinding

// in this new kotlin class , specify
// e.g adapter class will take var which is a list of destinations of type..e.g recycler adapter
// in this class pass an array list of type the data class created
// implement methods/methods
class TripAdapter(private var tripsites:List<Travelsites>)
    :RecyclerView.Adapter<CardViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = DestinationsCardcellRowLayoutBinding.inflate(from, parent,false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.bindTravelsites(destination_List[position])
    }

    override fun getItemCount(): Int = destination_List.size
}