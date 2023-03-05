package com.github.averysk.other.asplugin.ou_1v1.fragment.src.app_package

fun mvvmViewModel_1v1(
    packageName:String,
    fragmentClass:String
)="""
package ${packageName}.vm

import com.ou_1v1.net.base.BaseViewModel

class ${fragmentClass}ViewModel : BaseViewModel() {
    
}    

"""