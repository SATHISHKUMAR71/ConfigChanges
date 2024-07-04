package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class Images : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("In FragmentImages onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_image, container, false)
    }

    override fun onStart() {
        super.onStart()
        println("In FragmentImage Start")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("In FragmentImage Attach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("In FragmentImage Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("In FragmentImage DestroyView")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("In FragmentImage Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("In FragmentImage View Created")
    }

    override fun onResume() {
        super.onResume()
        println("In FragmentImage Resume")
    }

    override fun onPause() {
        super.onPause()
        println("In FragmentImage Pause")
    }

    override fun onDetach() {
        super.onDetach()
        println("In FragmentImage Detach")
    }

    override fun onStop() {
        super.onStop()
        println("In FragmentImage Stop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("In Fragment Images onSavedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("In Fragment Images onViewStateRestored")
    }
}