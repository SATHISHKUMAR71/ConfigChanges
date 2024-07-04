package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class Files : Fragment() {


//    instantiate
//    attach
//    create
//    createView
//    viewCreated ==> for bind data to the ui (like event listeners)
//    onActivityCreated() ==> when the host activity's onCreate() method has completed.
//    start
//    resume
//    pause
//    stop
//    destroyView
//    destroy
//    detach
//
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
    println("In FragmentFiles onCreateView")
        return inflater.inflate(R.layout.fragment_files, container, false)
    }

    override fun onStart() {
        super.onStart()
        println("In Fragment Files Start")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("In Fragment Files Attach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("In Fragment Files Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("In Fragment Files DestroyView")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("In Fragment Files Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("In Fragment Files View Created")
    }

    override fun onResume() {
        super.onResume()
        println(requireContext().getSharedPreferences("Files",Context.MODE_PRIVATE).getString("Files","Default Shared Preference"))
        println("In Fragment Files Resume")
    }

    override fun onPause() {
        super.onPause()

        println("In Fragment Files Pause")
    }

    override fun onSaveInstanceState(outState: Bundle) {

        super.onSaveInstanceState(outState)
        requireContext().getSharedPreferences("Files",Context.MODE_PRIVATE).edit().also {
            it.putString("Files","Files Shared Preferences")
            it.apply()
        }
        outState.putString("File Saved key:","Files saved value")
        println("In Fragment Files onSavedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)

        println( savedInstanceState?.getString("File Saved key:"))
        println("In Fragment Files onViewStateRestored")
    }

    override fun onDetach() {
        super.onDetach()
        println("In Fragment Files Detach")
    }

    override fun onStop() {
        super.onStop()
        println("In Fragment Files Stop")
    }
}