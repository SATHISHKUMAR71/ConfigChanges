package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentBluetooth : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        // Inflate the layout for this fragment
        println("In FragmentBluetooth onCreateView")
        return inflater.inflate(R.layout.fragment_bluetooth, container, false)
    }

    override fun onStart() {
        super.onStart()
        println("In Fragment Bluetooth Start")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("In Fragment Bluetooth Attach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("In Fragment Bluetooth Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("In Fragment Bluetooth DestroyView")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("In Fragment Bluetooth Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("In Fragment Bluetooth View Created")
    }

    override fun onResume() {
        super.onResume()
        println("In Fragment Bluetooth Resume")
    }

    override fun onPause() {
        super.onPause()
        println("In Fragment Bluetooth Pause")
    }

    override fun onDetach() {
        super.onDetach()
        println("In Fragment Bluetooth Detach")
    }

    override fun onStop() {
        super.onStop()
        println("In Fragment Bluetooth Stop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("In Fragment Bluetooth onSavedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("In Fragment Bluetooth onViewStateRestored")
    }

}