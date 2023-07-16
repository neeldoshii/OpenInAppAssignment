package com.example.openinapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.example.openinapp.R
import com.example.openinapp.adapters.ViewPagerAdapter

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MiddleDashboardFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MiddleDashboardFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_middle_dashboard, container, false)

        val titleList = mutableListOf<String>()
        val descriptionList = mutableListOf<String>()
        val imageList = mutableListOf<Int>()

        titleList.add("123")
        descriptionList.add("Today’s clicks")

        titleList.add("3")
        descriptionList.add("Top Location")

        titleList.add("2")
        descriptionList.add("Top source")

        titleList.add("3")
        descriptionList.add("Best Time")




        val horizontalDashboardRV: RecyclerView = view.findViewById(R.id.horizontalDashboardRV)

        horizontalDashboardRV.adapter = ViewPagerAdapter(titleList, descriptionList)

        horizontalDashboardRV.layoutManager =  LinearLayoutManager(view.context,LinearLayoutManager.HORIZONTAL, false)






        // Inflate the layout for this fragment
        return view
    }


}