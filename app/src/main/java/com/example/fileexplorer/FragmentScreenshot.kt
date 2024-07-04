package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class FragmentScreenshot : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("In FragmentScreenShot onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screenshot, container, false)
    }

    override fun onStart() {
        super.onStart()
        println("In FragmentScreenshot Start")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("In FragmentScreenshot Attach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("In FragmentScreenshot Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("In FragmentScreenshot DestroyView")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("In FragmentScreenshot Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("In FragmentScreenshot View Created")
    }

    override fun onResume() {
        super.onResume()
        println("In FragmentScreenshot Resume")
    }

    override fun onPause() {
        super.onPause()
        println("In FragmentScreenshot Pause")
    }

    override fun onDetach() {
        super.onDetach()
        println("In FragmentScreenshot Detach")
    }

    override fun onStop() {
        super.onStop()
        println("In FragmentScreenshot Stop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("In Fragment Screenshot onSavedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("In Fragment Screenshot onViewStateRestored")
    }
}