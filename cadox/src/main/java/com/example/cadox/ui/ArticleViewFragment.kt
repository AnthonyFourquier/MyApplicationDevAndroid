package com.example.cadox.ui

import android.content.DialogInterface
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog

import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.cadox.R
import com.example.cadox.bo.Article
import com.example.cadox.databinding.FragmentArticleViewBinding
import java.time.LocalDate


class ArticleViewFragment : Fragment() {
    private lateinit var binding : FragmentArticleViewBinding
    private val args: ArticleViewFragmentArgs by navArgs()

    val intentSendSms = Intent(Intent.ACTION_SENDTO).apply {
        data = Uri.parse("smsto:0612345678")  // This ensures only SMS apps respond
        putExtra("sms_body", "test")
    }

    val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { isGranted -> if (isGranted)
        startActivity(intentSendSms)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding =  FragmentArticleViewBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.article = args.article

        binding.buttonImageInternet.setOnClickListener {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(args.article.url)))
        }

        val alertDialogBuilder = AlertDialog.Builder(requireContext()).apply {
            setTitle(getString(R.string.labal_title_dialog))
            setMessage("Voulez vous modifer l'article" + binding.textViewDetailArticle.text + " ?")
            setPositiveButton("Oui", DialogInterface.OnClickListener { _, _ ->
                binding.article?.let {
                    findNavController().navigate(ArticleViewFragmentDirections.actionArticleViewToArticleEdit(
                        it
                    ))
                }

            })
            setNegativeButton("Non", DialogInterface.OnClickListener { _, _ ->
                // test
            })
        }

        binding.buttonEdit.setOnClickListener {
            alertDialogBuilder.show()
        }

        binding.imageButtonSend.setOnClickListener {startActivity(intentSendSms)
            requestPermissionLauncher.launch(android.Manifest.permission.SEND_SMS)
        }

        binding.checkBox.setOnClickListener {
            if (binding.checkBox.isChecked) {
                binding.textViewDate.text = "Date d'achat : " + LocalDate.now().toString()
            } else {
                binding.textViewDate.text = ""
            }
        }
    }

}