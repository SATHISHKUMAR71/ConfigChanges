package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.SurfaceControl.Transaction
import android.view.View
import android.view.ViewGroup


class Downloads : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        println("In FragmentDownloads onCreateView")
        return inflater.inflate(R.layout.fragment_downloads, container, false)
    }

    override fun onStart() {
        super.onStart()
        println("In Fragment Downloads Start")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("In Fragment Downloads Attach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("In Fragment Downloads Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("In Fragment Downloads DestroyView")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("In Fragment Downloads Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("In Fragment Downloads View Created")
    }

    override fun onResume() {
        super.onResume()
        println("In Fragment Downloads Resume")
    }

    override fun onPause() {
        super.onPause()
        println("In Fragment Downloads Pause")
    }

    override fun onDetach() {
        super.onDetach()
        println("In Fragment Downloads Detach")
    }

    override fun onStop() {
        super.onStop()
        println("In Fragment Downloads Stop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("In Fragment Download onSavedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("In Fragment Download onViewStateRestored")
    }
}