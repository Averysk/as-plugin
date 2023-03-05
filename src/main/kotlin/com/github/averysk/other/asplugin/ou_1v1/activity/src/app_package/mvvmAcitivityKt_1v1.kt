package com.github.averysk.other.asplugin.ou_1v1.activity.src.app_package

fun mvvmAcitivityKt_1v1(
    applicationPackage:String?,
    packageName:String,
    activityClass:String
)="""
package ${packageName}.ui

import android.os.Bundle
import android.view.View
import com.alibaba.android.arouter.facade.annotation.Route
import com.ou_1v1.base.ui.DataBindingConfig
import com.ou_1v1.base.ui.activity.BaseVmVDbActivity
import ${applicationPackage}.BR
import ${applicationPackage}.databinding.Activity${activityClass}Binding
import ${packageName}.vm.${activityClass}ViewModel
import com.ou_1v1.oto_router.ARouterPath

@Route(path = ARouterPath.${activityClass}Activity)
class ${activityClass}Activity : BaseVmVDbActivity<${activityClass}ViewModel, Activity${activityClass}Binding>() {

    override fun getDataBindingConfig(): DataBindingConfig {
        return DataBindingConfig()
            .addBindingParam(BR.vm, viewModel)
            .addBindingParam(BR.onClick, ClickProxy())
    }

    inner class ClickProxy {
        fun gotoNextStep(view: View) {

        }
    }

    override fun createObserver() {
        super.createObserver()
    }
    
    override fun initView(savedInstanceState: Bundle?) {
        super.initView(savedInstanceState)
    }
}

"""