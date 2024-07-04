package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class FragmentAPK : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("In FragmentApk onCreateView")
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment__a_p_k, container, false)
    }

    override fun onStart() {
        super.onStart()
        println("In FragmentApk Start")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("In FragmentApk Attach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("In FragmentApk Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("In FragmentApk DestroyView")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("In FragmentApk Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("In FragmentApk View Created")
    }

    override fun onResume() {
        super.onResume()
        println("In FragmentApk Resume")
    }

    override fun onPause() {
        super.onPause()
        println("In FragmentApk Pause")
    }

    override fun onDetach() {
        super.onDetach()
        println("In FragmentApk Detach")
    }

    override fun onStop() {
        super.onStop()
        println("In FragmentApk Stop")
    }
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("In Fragment APK onSavedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("In Fragment APK onViewStateRestored")
    }
}