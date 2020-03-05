package com.ccf.wc.home.service

import android.content.Context
import com.alibaba.android.arouter.facade.annotation.Route
import com.alibaba.android.arouter.facade.template.IProvider
import com.ccf.wc.baselib.core.HomeConstants

@Route(path = HomeConstants.SERVICE_HOME)
class HomeApiServiceImpl: IHomeApiService, IProvider {

    override fun init(context: Context?) {
    }
}