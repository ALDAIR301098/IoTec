package com.softgames.iotec.presentation.authentication.login

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.softgames.iotec.R
import com.softgames.iotec.base.BaseFragment
import com.softgames.iotec.databinding.FragmentLoginBinding

class LoginFragment : BaseFragment<FragmentLoginBinding>() {
    override fun setViewBinding(inflater: LayoutInflater, container: ViewGroup?) =
        FragmentLoginBinding.inflate(inflater, container, false)

    override fun launchEvents() {
        binding.apply {

            btnPhone.setOnClickListener {
                findNavController().navigate(R.id.ACTION_LOGIN_TO_PHONE_AUTH)
            }

            btnMail.setOnClickListener {

            }

            btnGoogle.setOnClickListener {

            }

            btnFacebook.setOnClickListener {

            }
        }
    }

}