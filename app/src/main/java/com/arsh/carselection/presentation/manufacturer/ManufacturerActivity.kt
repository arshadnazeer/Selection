package com.arsh.carselection.presentation.manufacturer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.arsh.carselection.R
import com.arsh.carselection.databinding.ActivityHomeBinding
import com.arsh.carselection.databinding.ActivityManufacturerBinding
import com.arsh.carselection.presentation.di.Injector
import javax.inject.Inject

class ManufacturerActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: ManufacturerViewModelFactory
    private lateinit var manufacturerViewModel: ManufacturerViewModel
    private lateinit var adapter: ManufacturerAdapter

    private lateinit var binding: ActivityManufacturerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityManufacturerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        (application as Injector).createManufacturerSubComponent()
            .inject(this)

        manufacturerViewModel = ViewModelProvider(this,factory)
            .get(ManufacturerViewModel::class.java)

        initRecyclerView()

    }

    private fun initRecyclerView(){
        binding.manufacturerRecyclerView.layoutManager = LinearLayoutManager(this)
        adapter = ManufacturerAdapter()
        binding.manufacturerRecyclerView.adapter = adapter
        displayManufacturers()
    }

    private fun displayManufacturers(){
        binding.manufacturerProgressBar.visibility = View.VISIBLE
        val responseLiveData = manufacturerViewModel.getManufacturers()
        responseLiveData.observe(this, Observer {
//            Log.e("MyTag",it.toString())
            if (it!=null){
//                adapter.setList(it)

                // using diff util
                adapter.differ.submitList(it)
//                adapter.notifyDataSetChanged()
                binding.manufacturerProgressBar.visibility = View.GONE
            }else
                binding.manufacturerProgressBar.visibility = View.VISIBLE
                Toast.makeText(applicationContext,"No data available",Toast.LENGTH_SHORT).show()

        })

    }

}