package com.ccf.wc.home

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.launcher.ARouter
import com.ccf.wc.baselib.core.FriendConstants
import com.ccf.wc.baselib.core.HomeConstants
import com.ccf.wc.baselib.core.ProfileConstants
import com.ccf.wc.profile.service.IUserService
import kotlinx.android.synthetic.main.fragment_home.*

@Route(path = HomeConstants.ENTRY_FRAGMENT)
class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        friend_detail.setOnClickListener {
            ARouter.getInstance().build(FriendConstants.FRIEND_DETAIL)
                .withString(FriendConstants.EXTRA_FRIEND_DETAIL_NAME, "Richer Cai")
                .withString(FriendConstants.EXTRA_FRIEND_DETAIL_FROM, "ARouter#navigation")
                .navigation()
        }

        friend_detail_by_original.setOnClickListener {
            startActivity(
                Intent()
                    .setClassName(
                        activity!!.application.packageName,
                        "com.ccf.wc.friend.FriendDetailActivity"
                    )
                    .putExtra(FriendConstants.EXTRA_FRIEND_DETAIL_NAME, "Richer")
                    .putExtra(FriendConstants.EXTRA_FRIEND_DETAIL_FROM, "Activity#startActivity")
            )
        }

        get_user_name.setOnClickListener {
            ARouter.getInstance().build(ProfileConstants.SERVICE_PROFILE)?.navigation()?.let {
                get_user_name.text = (it as IUserService).getUser().name
            }
        }
    }
}