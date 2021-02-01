package com.example.simtest.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.simtest.R
import kotlinx.android.synthetic.main.fragment_result.*

/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {
    // TODO: Rename and change types of parameters
    var option = -1
    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        option = arguments?.getInt("index")?:-1
        return inflater.inflate(R.layout.fragment_result, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)

        setResult(option)

        btn_home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }

    fun setResult(option :Int) {
        when(option) {
            1 -> {
                tv_main.text = "당신은 사람을 좋아합니다!"
                tv_sub.text =  "사람을 선택한 당신 사람을 좋아하는 군요"
            }
            2 -> {
                tv_main.text = "당신은 산짐승을 좋아합니다!"
                tv_sub.text =  "산짐승을 선택한 당신 산짐승을 좋아하는 군요"
            }
            3 -> {
                tv_main.text = "당신은 솔방울을 좋아합니다!"
                tv_sub.text =  "솔방울을 선택한 당신 솔방울을 좋아하는 군요"
            }
            4 -> {
                tv_main.text = "당신은 귀신을 좋아합니다!"
                tv_sub.text =  "귀신을 선택한 당신 귀신을 좋아하는 군요"
            }
        }
    }

}