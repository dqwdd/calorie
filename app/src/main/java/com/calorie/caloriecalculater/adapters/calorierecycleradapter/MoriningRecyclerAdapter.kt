//package com.neppplus.myapplication.adapters.calorierecycleradapter
//
//import android.content.Context
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.ImageView
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//import com.bumptech.glide.Glide
//import com.neppplus.myapplication.R
//import com.neppplus.myapplication.datas.CalendarTextData
//import com.neppplus.myapplication.datas.MorningData
//
//class MoriningRecyclerAdapter(
//    val mContext: Context,
//    val mList: List<MorningData> ) : RecyclerView.Adapter<MoriningRecyclerAdapter.FriendViewHolder>() {
//
//    class FriendViewHolder(view : View) : RecyclerView.ViewHolder(view) {
//        val friendProfileImg = view.findViewById<ImageView>(R.id.friendProfileImg)
//        val nicknameTxt = view.findViewById<TextView>(R.id.nicknameTxt)
//        val socialLoginImg = view.findViewById<ImageView>(R.id.socialLoginImg)
//
//        fun bind(context: Context, data: CalendarTextData) {
//
//            nicknameTxt.text = data.nickName
//
//            Glide.with(context).load(data.profileImgURL).into(friendProfileImg)
//
//            when (data.provider){
//                "facebook" -> {
//                    socialLoginImg.setImageResource(R.drawable.facebook_logo_icon)
//                    socialLoginImg.visibility = View.VISIBLE
//                }
//                "kakao" -> {
//                    socialLoginImg.setImageResource(R.drawable.kakaotalk_logo_icon)
//                    socialLoginImg.visibility = View.VISIBLE
//                }
//                else -> {
//                    socialLoginImg.visibility = View.VISIBLE
//                }
//            }
//
//        }
//
//    }
//
//    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
//        val view = LayoutInflater.from(mContext).inflate(R.layout.friend_list_item, parent, false)
//        return FriendViewHolder(view)
//    }
//
//    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
//
//        val data = mList[position]
//        holder.bind(mContext, data)
//
//    }
//
//    override fun getItemCount(): Int {
//        return mList.size
//    }
//
//
//}