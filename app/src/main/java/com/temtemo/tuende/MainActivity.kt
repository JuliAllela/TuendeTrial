package com.temtemo.tuende

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.temtemo.tuende.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var recyclerView: RecyclerView
    private lateinit var searchView:SearchView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // step 1 create a function hide action bar
        hideActionBar()
        searchView = binding.serachView
        //after creating adapter etc , implement searchview
        // add query on serach view , i.e on query listener(pass object){implement some methids,
        // filter list query of tyoe sting, search by title and budget
        // if condition is satisfied add item to newly created list

        recyclerView = binding.recyclerview1

        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)
        // add a method, i.e add list items
        addDestinationsToList()

        val mainActivity = this
        binding.recyclerview1.apply { GridLayoutManager(applicationContext, 3
        )
        adapter = TripAdapter(destination_List)}

    }

    private fun hideActionBar(){
        // call method to hide action bar , i.e support .hide
        supportActionBar?.hide()

    }

    // create a method to add data to list call it above/ to populate destinations
    // how create a var of of destination 1, *initilaze travel object*, pass in parameters

    private fun  addDestinationsToList() {
     val destination1 = Travelsites(
         R.drawable.coastke,
         SiteInfo = "Coastal Circuit",
         about = "Sands and Beaches"

     )// after initiliazing travelsite object add to the list

        destination_List.add(destination1)
        val destination2 = Travelsites(
            R.drawable.south_rift,
            SiteInfo = "South Rift Circuit",
            about = "Safari and People"
        )
        destination_List.add(destination2)

        val destination3 = Travelsites(
            R.drawable.nairobicity,
            SiteInfo = "Nairobi Circuit",
            about = "City and Vibrance"
        )
        destination_List.add(destination3)
        val destination4 = Travelsites (
            R.drawable.mtkenya,
            SiteInfo = "Central Circuit",
            about = "Mountains and springs"
                )
        destination_List.add(destination4)
        val destination5 = Travelsites(
            R.drawable.kisumu,
            SiteInfo = "Western Circuit",
            about = "Great Lakes and forests"
        )
        destination_List.add(destination5)
        val destination6 = Travelsites(
            R.drawable.northrift,
            SiteInfo = "Northern Circuit",
            about = "Our Heritage, Our Diversity"

        )
        destination_List.add(destination6)

        val destination7 = Travelsites(
            R.drawable.southern,
            SiteInfo = "Eastern Circuit",
            about = "Echoes of Life"
        )
        destination_List.add(destination7)

        destination_List.add(destination1)
        destination_List.add(destination2)
        destination_List.add(destination3)
        destination_List.add(destination4)
        destination_List.add(destination5)
        destination_List.add(destination6)
        destination_List.add(destination7)



        }

        }

