package com.example.gamerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        /*var btnNews: Button =findViewById(R.id.news_btn)
        var btnStore: Button =findViewById(R.id.store_btn)*/


      /*  btnNews.setOnClickListener {
            changeFragment(NewsFragment(),"news")
        }
        btnStore.setOnClickListener {
            changeFragment(StoreFragment(),"store")
        }*/


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_navigation_view)

        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->

            when (menuItem.itemId) {
                R.id.news_btn -> {
                    changeFragment(NewsFragment(),"news")
                    toolbar.title ="News"

                    true
                }
                R.id.store_btn -> {
                    changeFragment(StoreFragment(),"Event")
                    toolbar.title ="Event"

                    true
                }
                R.id.profile_btn -> {
                    changeFragment(ProfileFragment(),"profile")
                    toolbar.title ="profile"

                    true
                }
                else -> false
            }
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu,menu)
        return true
    }
    private fun changeFragment(fragment: Fragment, tag: String) {

        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()

        if(tag.isNotEmpty()){
            fragmentTransaction.addToBackStack(tag)
        }
        fragmentTransaction.replace(R.id.fragmentContainerView,fragment).commit()
    }
    /*override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.news_btn -> {

               changeFragment(NewsFragment(),"news")
                return true
            }
            R.id.store_btn -> {
                changeFragment(StoreFragment(),"store")
                return true
            }
            R.id.profile_btn -> {
                changeFragment(ProfileFragment(),"profile")
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }*/
}