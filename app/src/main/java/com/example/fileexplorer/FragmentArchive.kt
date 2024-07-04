package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentArchive : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("In FragmentArchive onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_archive, container, false)
    }

    override fun onStart() {
        super.onStart()
        println("In Fragment Archive Start")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("In Fragment Archive Attach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("In Fragment Archive Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("In Fragment Archive DestroyView")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("In Fragment Archive Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("In Fragment Archive View Created")
    }

    override fun onResume() {
        super.onResume()
        println("In Fragment Archive Resume")
    }

    override fun onPause() {
        super.onPause()
        println("In Fragment Archive Pause")
    }

    override fun onDetach() {
        super.onDetach()
        println("In Fragment Archive Detach")
    }

    override fun onStop() {
        super.onStop()
        println("In Fragment Archive Stop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("In Fragment Archive onSavedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("In Fragment Archive onViewStateRestored")
    }
}