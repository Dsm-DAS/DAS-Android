package ui.activity
import android.content.Intent
import androidx.fragment.app.Fragment
import base.BaseActivity
import com.example.das_android.R
import com.example.das_android.databinding.ActivityMainBinding
import ui.fragment.*


class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {




    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }



    private fun navigationItemSelect() {
        binding.bottomNavigationView.run {
            setOnItemSelectedListener { item ->
                when (item.itemId) {
                    R.id.home -> replaceFragment(HomeFragment())
                    R.id.announcement -> replaceFragment(NoticeFragment())
                    R.id.write -> replaceFragment(WriteFragment())
                    R.id.search -> replaceFragment(SearchFragment())
                    R.id.menu -> replaceFragment(MenuFragment())
                }
                true
            }
            selectedItemId = R.id.home
        }
    }

    override fun initView() {
        navigationItemSelect()


    }

    override fun observeEvent() {
        //TODO("Not yet implemented")
    }

}