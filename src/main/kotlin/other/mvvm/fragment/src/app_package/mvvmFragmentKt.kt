
package other.mvvm.fragment.src.app_package

import com.android.tools.idea.wizard.template.ProjectTemplateData

fun mvvmFragmentKt(
        applicationPackage: ProjectTemplateData,
        fragmentClass:String,
        layoutName:String,
        packageName:String
)="""
package ${packageName}.ui.fragment

import android.os.Bundle
import ${applicationPackage.applicationPackage?:packageName}.R
import ${applicationPackage.applicationPackage?:packageName}.base.MyBaseDatabindingFragment
import ${applicationPackage.applicationPackage?:packageName}.databinding.Fragment${fragmentClass}Binding
import ${packageName}.viewmodel.state.Fragment${fragmentClass}ViewModel

class ${fragmentClass}Fragment : MyBaseDatabindingFragment<Fragment${fragmentClass}Binding,Fragment${fragmentClass}ViewModel>() {
    override fun getLayoutId(): Int {
        return R.layout.${layoutName}
    }

    override fun initViews(savedInstanceState: Bundle?) {
        mBinding.vm = mViewModel
    }
    override fun initData() {
    }
    override fun initListener() {
    }
}
"""