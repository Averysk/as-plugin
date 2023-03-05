package com.github.averysk.other.asplugin.ou_1v1.activity

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.addAllKotlinDependencies
import com.android.tools.idea.wizard.template.impl.activities.common.generateManifest
import com.github.averysk.other.asplugin.ou_1v1.activity.res.layout.mvvmActivityXml_1v1
import com.github.averysk.other.asplugin.ou_1v1.activity.src.app_package.mvvmAcitivityKt_1v1
import com.github.averysk.other.asplugin.ou_1v1.activity.src.app_package.mvvmViewModel_1v1


fun RecipeExecutor.mvvmActivityRecipe_1v1(
    moduleData: ModuleTemplateData,
    activityClass: String,
    layoutName: String,
    packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
//    val ktOrJavaExt = projectData.language.extension

    addAllKotlinDependencies(moduleData)

    generateManifest(
        moduleData = moduleData,
        activityClass = "${
            packageName.replace(
                projectData.applicationPackage!! + ".",
                "",
                true
            )
        }.${activityClass}Activity",
        packageName = packageName,
        isLauncher = false,
        hasNoActionBar = false,
        generateActivityTitle = false
    )

    val mvvmActivity = mvvmAcitivityKt_1v1(projectData.applicationPackage, packageName, activityClass)
    // 保存Activity
//    save(mvvmActivity, srcOut.resolve("${activityClass}Activity.${ktOrJavaExt}"))
    save(mvvmActivity, srcOut.resolve("./ui/${activityClass}Activity.kt"))
    // 保存xml
    save(
        mvvmActivityXml_1v1(projectData.applicationPackage, packageName, activityClass),
        resOut.resolve("layout/${layoutName}.xml")
    )
    // 保存viewmodel
//    save(mvvmViewModel(packageName, activityClass), srcOut.resolve("${activityClass}ViewModel.${ktOrJavaExt}"))
    save(mvvmViewModel_1v1(packageName, activityClass), srcOut.resolve("./vm/${activityClass}ViewModel.kt"))
    // 保存repository
//    save(mvvmRepository(packageName, activityClass), srcOut.resolve("${activityClass}Repository.${ktOrJavaExt}"))

}