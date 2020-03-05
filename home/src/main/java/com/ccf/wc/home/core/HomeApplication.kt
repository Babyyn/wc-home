package com.ccf.wc.home.core

import com.ccf.wc.baselib.BaseApplication

class HomeApplication: BaseApplication() {

    override fun onCreate() {
        super.onCreate()
    }

    override fun initBaseAppModules() {
        registerBaseAppModule(HomeAppModule::class.java)
    }
}