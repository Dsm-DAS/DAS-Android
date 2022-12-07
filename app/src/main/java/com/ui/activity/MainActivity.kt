package com.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.base.BaseActivity
import com.base.BaseFragment
import com.example.das_android.R
import com.example.das_android.databinding.ActivityMainBinding
import com.ui.fragment.*

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }

    fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .add(R.id.frame, fragment)
            .addToBackStack(null)
            .commit()
    }

    private fun navigationItemSelect() {
        binding.bottomNavigationView.run {
            setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.home -> replaceFragment(HomeFragment())
                    R.id.announcement -> replaceFragment(AnnouncementFragment())
                    R.id.detail -> replaceFragment(ClubDetailFragment())
                    R.id.search -> replaceFragment(SearchFragment())
                    R.id.menu -> replaceFragment(MenuFragment())
                }
                true
            }
            selectedItemId = R.id.home
        }
    }

    override fun initView() {
       // TODO("Not yet implemented")
    }

    override fun observeEvent() {
       // TODO("Not yet implemented")
    }

}