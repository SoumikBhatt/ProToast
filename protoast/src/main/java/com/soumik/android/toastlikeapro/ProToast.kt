package com.soumik.android.toastlikeapro

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class ProToast {

    companion object{


        fun success(context: Context,message:String,duration:Int){

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.toast_pro, null)
            view.setBackgroundResource(R.drawable.bg_toast_success)
            val icon = view.findViewById<ImageView>(R.id.iv_icon)
            icon.setImageResource(R.drawable.ic_success)
            val textView = view.findViewById<TextView>(R.id.tv_toast_message)
            textView.text=message
            textView.setTextColor(Color.parseColor("#FFFFFF"))

            val toast = Toast(context)
            toast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM,0,120)
            toast.duration=duration
            toast.view=view
            toast.show()
        }


        fun error(context: Context,message:String,duration:Int){

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.toast_pro, null)
            view.setBackgroundResource(R.drawable.bg_toast_error)
            val icon = view.findViewById<ImageView>(R.id.iv_icon)
            icon.setImageResource(R.drawable.ic_error)
            val textView = view.findViewById<TextView>(R.id.tv_toast_message)
            textView.text=message
            textView.setTextColor(Color.parseColor("#FFFFFF"))

            val toast = Toast(context)
            toast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM,0,120)
            toast.duration=duration
            toast.view=view
            toast.show()
        }

        fun warning(context: Context,message:String,duration:Int){

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.toast_pro, null)
            view.setBackgroundResource(R.drawable.bg_toast_warning)
            val icon = view.findViewById<ImageView>(R.id.iv_icon)
            icon.setImageResource(R.drawable.ic_warning)
            val textView = view.findViewById<TextView>(R.id.tv_toast_message)
            textView.text=message
            textView.setTextColor(Color.parseColor("#000000"))

            val toast = Toast(context)
            toast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM,0,120)
            toast.duration=duration
            toast.view=view
            toast.show()
        }

        fun info(context: Context,message:String,duration:Int){

            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.toast_pro, null)
            view.setBackgroundResource(R.drawable.bg_toast_info)
            val icon = view.findViewById<ImageView>(R.id.iv_icon)
            icon.setImageResource(R.drawable.ic_info)
            val textView = view.findViewById<TextView>(R.id.tv_toast_message)
            textView.text=message
            textView.setTextColor(Color.parseColor("#FFFFFF"))

            val toast = Toast(context)
            toast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM,0,120)
            toast.duration=duration
            toast.view=view
            toast.show()
        }

        fun custom(context: Context,message: String,background:Int,icon:Int,textColor:String,duration: Int){
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            val view = inflater.inflate(R.layout.toast_pro, null)
            view.setBackgroundResource(background)
            val iconIV = view.findViewById<ImageView>(R.id.iv_icon)
            iconIV.setImageResource(icon)
            val textView = view.findViewById<TextView>(R.id.tv_toast_message)
            textView.text=message
            textView.setTextColor(Color.parseColor(textColor))

            val toast = Toast(context)
            toast.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.BOTTOM,0,120)
            toast.duration=duration
            toast.view=view
            toast.show()
        }
    }


}