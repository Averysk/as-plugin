package com.github.averysk.other.asplugin.mvvm.activity.src.app_package

fun mvvmViewModel(
    packageName:String,
    activityClass:String
)="""
package ${packageName}

import com.oulive.net.base.BaseViewModel

class ${activityClass}ViewModel : BaseViewModel() {
    
}    
"""