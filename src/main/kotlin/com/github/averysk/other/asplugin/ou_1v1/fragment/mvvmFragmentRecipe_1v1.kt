package com.github.averysk.other.asplugin.ou_1v1.fragment

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.addAllKotlinDependencies
import com.github.averysk.other.asplugin.ou_1v1.fragment.res.layout.mvvmFragmentXml_1v1
import com.github.averysk.other.asplugin.ou_1v1.fragment.src.app_package.mvvmFragmentKt_1v1
import com.github.averysk.other.asplugin.ou_1v1.fragment.src.app_package.mvvmViewModel_1v1


fun RecipeExecutor.mvvmFragmentRecipe_1v1(
    moduleData: ModuleTemplateData,
    fragmentClass: String,
    layoutName: String,
    packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
//    val ktOrJavaExt = projectData.language.extension

    addAllKotlinDependencies(moduleData)

    val mvvmFragment = mvvmFragmentKt_1v1(projectData.applicationPackage, packageName, fragmentClass)
    // 保存Fragment
    save(mvvmFragment, srcOut.resolve("./ui/${fragmentClass}Fragment.kt"))
    // 保存xml
    save(
        mvvmFragmentXml_1v1(projectData.applicationPackage, packageName, fragmentClass),
        resOut.resolve("layout/${layoutName}.xml")
    )
    // 保存viewmodel
    save(
        mvvmViewModel_1v1(packageName, fragmentClass),
        srcOut.resolve("./vm/${fragmentClass}ViewModel.kt")
    )
    // 保存repository
//    save(mvvmRepository(packageName, activityClass), srcOut.resolve("${activityClass}Repository.${ktOrJavaExt}"))
}