package com.example.fileexplorer

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class More : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("In FragmentMore onCreateView")
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_more, container, false)
        val btnVideos = view.findViewById<ImageView>(R.id.btnVideosMore)
        btnVideos.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Videos())
                .addToBackStack("Videos More BackStack")
                .commit()
        }

        val btnImages = view.findViewById<ImageView>(R.id.btnGalleryMore)
        btnImages.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Images())
                .addToBackStack("Gallery More BackStack")
                .commit()
        }

        val btnDownloads = view.findViewById<ImageView>(R.id.btnDownloadsMore)
        btnDownloads.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Downloads())
                .addToBackStack("Downloads More BackStack")
                .commit()
        }

        val btnMusic = view.findViewById<ImageView>(R.id.btnMusicMore)
        btnMusic.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Music())
                .addToBackStack("Music More BackStack")
                .commit()
        }

        val btnFiles = view.findViewById<ImageView>(R.id.btnFilesMore)
        btnFiles.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,Files())
                .addToBackStack("Files More BackStack")
                .commit()
        }

        val btnScreenShot = view.findViewById<ImageView>(R.id.btnScreenShot)
        btnScreenShot.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,FragmentScreenshot())
                .addToBackStack("ScreenShot More BackStack")
                .commit()
        }

        val btnBluetooth = view.findViewById<ImageView>(R.id.btnBluetooth)
        btnBluetooth.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,FragmentBluetooth())
                .addToBackStack("Bluetooth More BackStack")
                .commit()
        }
        val btnArchive = view.findViewById<ImageView>(R.id.btnArchive)
        btnArchive.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,FragmentArchive())
                .addToBackStack("Archive More BackStack")
                .commit()
        }
        val btnAPK = view.findViewById<ImageView>(R.id.btnApk)
        btnAPK.setOnClickListener{
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView,FragmentAPK())
                .addToBackStack("APK More BackStack")
                .commit()
        }
        return view
    }
    override fun onStart() {
        super.onStart()
        println("In FragmentMore Start")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        println("In FragmentMore Attach")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("In FragmentMore Destroy")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        println("In FragmentMore DestroyView")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("In FragmentMore Create")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        println("In FragmentMore View Created")
    }

    override fun onResume() {
        super.onResume()
        println("In FragmentMore Resume")
    }

    override fun onPause() {
        super.onPause()
        println("In FragmentMore Pause")
    }

    override fun onDetach() {
        super.onDetach()
        println("In FragmentMore Detach")
    }

    override fun onStop() {
        super.onStop()
        println("In FragmentMore Stop")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        println("In Fragment More onSavedInstanceState")
    }

    override fun onViewStateRestored(savedInstanceState: Bundle?) {
        super.onViewStateRestored(savedInstanceState)
        println("In Fragment More onViewStateRestored")
    }


}