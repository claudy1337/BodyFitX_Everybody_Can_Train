package com.autonture.bodyfitx_everybody_can_train.ui.RightsVerif

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.autonture.bodyfitx_everybody_can_train.R


class DataEntryFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_data_entry, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = DataEntryFragment()
    }
}