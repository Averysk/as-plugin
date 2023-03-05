package com.github.averysk.other.asplugin.ou_1v1.fragment.src.app_package

fun mvvmFragmentKt_1v1(
    applicationPackage:String?,
    packageName:String,
    fragmentClass:String
)="""
package ${packageName}.ui

import android.os.Bundle
import android.view.View
import com.ou_1v1.base.ui.DataBindingConfig
import com.ou_1v1.base.ui.fragment.BaseVmVDbFragment
import ${applicationPackage}.BR
import ${applicationPackage}.databinding.Fragment${fragmentClass}Binding
import ${packageName}.vm.${fragmentClass}ViewModel

class ${fragmentClass}Fragment : BaseVmVDbFragment<${fragmentClass}ViewModel, Fragment${fragmentClass}Binding>() {

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