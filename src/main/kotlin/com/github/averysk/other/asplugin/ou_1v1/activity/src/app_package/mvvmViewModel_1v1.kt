package com.github.averysk.other.asplugin.ou_1v1.activity.src.app_package

fun mvvmViewModel_1v1(
    packageName:String,
    activityClass:String
)="""
package ${packageName}.vm

import com.ou_1v1.net.base.BaseViewModel

class ${activityClass}ViewModel : BaseViewModel() {

}
  
"""