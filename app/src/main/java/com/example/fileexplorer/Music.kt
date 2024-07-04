package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class Music : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        println("In FragmentMusic onCreateView")
        return inflater.inflate(R.layout.fragment_music, container, false)
    }

    override fun onStart() {
        super.onStart()
        println("In FragmentMusic Start")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("In FragmentMusic Attach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("In FragmentMusic Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("In FragmentMusic DestroyView")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("In FragmentMusic Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("In FragmentMusic View Created")
    }

    override fun onResume() {
        super.onResume()
        println("In FragmentMusic Resume")
    }

    override fun onPause() {
        super.onPause()
        println("In FragmentMusic Pause")
    }

    override fun onDetach() {
        super.onDetach()
        println("In FragmentMusic Detach")
    }

    override fun onStop() {
        super.onStop()
        println("In FragmentMusic Stop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("In Fragment Music onSavedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("In Fragment Music onViewStateRestored")
    }

}