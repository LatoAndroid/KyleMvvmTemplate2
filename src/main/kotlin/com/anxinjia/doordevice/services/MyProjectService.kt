package com.anxinjia.doordevice.services

import com.anxinjia.doordevice.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
