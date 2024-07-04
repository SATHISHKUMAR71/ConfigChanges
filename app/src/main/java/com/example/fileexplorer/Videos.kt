package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Videos : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("In FragmentVideos onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_videos, container, false)
    }

    override fun onStart() {
        super.onStart()
        println("In FragmentVideos Start")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("In FragmentVideos Attach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("In FragmentVideos Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("In FragmentVideos DestroyView")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("In FragmentVideos Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("In FragmentVideos View Created")
    }

    override fun onResume() {
        super.onResume()
        println("In FragmentVideos Resume")
    }

    override fun onPause() {
        super.onPause()
        println("In FragmentVideos Pause")
    }

    override fun onDetach() {
        super.onDetach()
        println("In FragmentVideos Detach")
    }

    override fun onStop() {
        super.onStop()
        println("In FragmentVideos Stop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("In Fragment Videos onSavedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("In Fragment Videos onViewStateRestored")
    }
}