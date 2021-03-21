
package other.mvvm.activity.src.app_package

import com.android.tools.idea.wizard.template.ProjectTemplateData

fun mvvmAcitivityKt(
        applicationPackage: ProjectTemplateData,
        activityClass:String,
        layoutName:String,
        packageName:String
)="""
package ${packageName}.ui.activity

import android.app.Activity
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ${applicationPackage.applicationPackage?:packageName}.R
import ${applicationPackage.applicationPackage?:packageName}.base.MyBaseDatabindingActivity
import ${applicationPackage.applicationPackage?:packageName}.databinding.Activity${activityClass}Binding
import ${packageName}.viewmodel.state.Activity${activityClass}ViewModel

class ${activityClass}Activity : MyBaseDatabindingActivity<Activity${activityClass}Binding, Activity${activityClass}ViewModel>() {
    override fun getLayoutId():Int{
        return R.layout.${layoutName}
    }



    override fun initViews(savedInstanceState: Bundle?) {
        mBinding.vm = mViewModel
    }

    override fun initData() {

    }

    override fun initListener() {

    }

    companion object {
        private const val TAG = "${activityClass}Activity"
    }
}
"""