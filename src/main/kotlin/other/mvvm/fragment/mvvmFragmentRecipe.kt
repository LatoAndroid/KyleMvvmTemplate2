package other.mvvm.fragment

import com.android.tools.idea.wizard.template.ModuleTemplateData
import com.android.tools.idea.wizard.template.RecipeExecutor
import com.android.tools.idea.wizard.template.impl.activities.common.addAllKotlinDependencies
import other.mvvm.activity.src.app_package.mvvmAcitivityKt
import other.mvvm.activity.src.app_package.mvvmViewModel
import other.mvvm.activity.src.res.layout.mvvmActivityXml
import other.mvvm.fragment.src.app_package.mvvmFragmentKt
import other.mvvm.fragment.src.app_package.mvvmFragmentViewModel
import other.mvvm.fragment.src.res.layout.mvvmFragmentXml


fun RecipeExecutor.mvvmFragmentRecipe(
        moduleData: ModuleTemplateData,
        fragmentClass: String,
        layoutName: String,
        packageName: String
) {
    val (projectData, srcOut, resOut) = moduleData
    val ktOrJavaExt = projectData.language.extension
    addAllKotlinDependencies(moduleData)
//    generateManifest(
//            moduleData = moduleData,
//            fragmentClass = "${fragmentClass}Activity",
//            activityTitle = fragmentClass,
//            packageName = packageName,
//            isLauncher = false,
//            hasNoActionBar = false,
//            generateActivityTitle = true,
//            requireTheme = false,
//            useMaterial2 = false
//    )

    val mvvmFragment = mvvmFragmentKt(projectData, fragmentClass, layoutName, packageName)
    // 保存Activity
    save(mvvmFragment, srcOut.resolve("ui/fragment/${fragmentClass}Fragment.${ktOrJavaExt}"))
    // 保存xml
    save(mvvmFragmentXml(packageName, fragmentClass), resOut.resolve("layout/${layoutName}.xml"))
    // 保存viewmodel
    save(mvvmFragmentViewModel(packageName, fragmentClass), srcOut.resolve("viewmodel/state/Fragment${fragmentClass}ViewModel.${ktOrJavaExt}"))
}