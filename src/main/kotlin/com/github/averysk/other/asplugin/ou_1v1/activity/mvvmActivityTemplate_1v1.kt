package com.github.averysk.other.asplugin.ou_1v1.activity

import com.android.tools.idea.wizard.template.*


val mvvmActivityTemplate_1v1
    get() = template {
//        revision = 1
        name = "MVVM Activity 1v1"
        description = "适用于1v1项目中MVVM框架的Activity"
//        minApi = MIN_API
//        minBuildApi = MIN_API

        category = Category.Other
        formFactor = FormFactor.Mobile
        screens = listOf(
            WizardUiContext.ActivityGallery,
            WizardUiContext.MenuEntry,
            WizardUiContext.NewProject,
            WizardUiContext.NewModule
        )


        lateinit var layoutName: StringParameter

        val activityClass = stringParameter {
            name = "Activity Name"
            default = "Main"
            help = "只输入名字，不要包含Activity"
            constraints = listOf(Constraint.NONEMPTY)
        }

        layoutName = stringParameter {
            name = "Layout Name"
            default = "activity_main"
            help = "请输入布局的名字"
            constraints = listOf(Constraint.LAYOUT, Constraint.UNIQUE, Constraint.NONEMPTY)
//            suggest = { "${activityToLayout(activityClass.value.lowercase())}" }
//            suggest = { "${activityToLayout(activityClass.value.changeUpper())}" }
            suggest = { "activity_${camelCaseToUnderlines(activityClass.value)}" }
        }

        val packageName = defaultPackageNameParameter_1v1

        widgets(
            TextFieldWidget(activityClass),
            TextFieldWidget(layoutName),
            PackageNameWidget(packageName)
        )
//        thumb { File("logo.png") }
        recipe = { data: TemplateData ->
            mvvmActivityRecipe_1v1(
                data as ModuleTemplateData,
                activityClass.value,
                layoutName.value,
                packageName.value
            )
        }
    }


val defaultPackageNameParameter_1v1
    get() = stringParameter {
        name = "Package name"
        visible = { !isNewModule }
        default = "com.oulive.ou"
        constraints = listOf(Constraint.PACKAGE)
        suggest = { packageName }
    }

//fun String?.changeUpper(): String {
//    var result = StringBuilder()
//    this?.forEach { char ->
//        result.append(if (char.isUpperCase()) "_${char.lowercase()}" else char)
//    }
//    return result.toString()
//}
