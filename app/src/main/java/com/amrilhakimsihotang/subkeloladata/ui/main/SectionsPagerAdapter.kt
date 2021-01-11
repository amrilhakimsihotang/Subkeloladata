package com.amrilhakimsihotang.subkeloladata.ui.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.amrilhakimsihotang.subkeloladata.R

class SectionPagerAdapter(private val context: Context, fragmentManager: FragmentManager) :
    FragmentPagerAdapter(
        fragmentManager,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
    ) {

    private val pages= listOf(
        MovieFragment(),
        TvShowFragment(),
    )
    private val tabTitles = arrayOf(
        R.string.tab_text_1,
        R.string.tab_text_2,
     )

    override fun getPageTitle(position: Int): CharSequence {
        return context.resources.getString(tabTitles[position])
    }
    override fun getCount(): Int {
        return tabTitles.size
    }

    override fun getItem(position: Int): Fragment {
        return  pages[position]
    }

}