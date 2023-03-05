package com.github.averysk.other

import com.android.tools.idea.wizard.template.Template
import com.android.tools.idea.wizard.template.WizardTemplateProvider
import com.github.averysk.other.asplugin.mvvm.activity.mvvmActivityTemplate
import com.github.averysk.other.asplugin.mvvm.fragment.mvvmFragmentTemplate
import com.github.averysk.other.asplugin.ou_1v1.activity.mvvmActivityTemplate_1v1
import com.github.averysk.other.asplugin.ou_1v1.fragment.mvvmFragmentTemplate_1v1

class SamplePluginTemplateProviderImpl : WizardTemplateProvider() {

    override fun getTemplates(): List<Template> = listOf(
        // activity的模板
        mvvmActivityTemplate,
        // fragment的模板
        mvvmFragmentTemplate,
        // activity的模板:1v1
        mvvmActivityTemplate_1v1,
        // fragment的模板:1v1
        mvvmFragmentTemplate_1v1,
    )
}