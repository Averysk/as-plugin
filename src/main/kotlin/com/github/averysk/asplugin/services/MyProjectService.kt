package com.github.averysk.asplugin.services

import com.intellij.openapi.project.Project
import com.github.averysk.asplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
