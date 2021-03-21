package other.mvvm.activity.src.app_package


fun mvvmViewModel(
        packageName:String,
        activityClass:String
)="""
package ${packageName}.viewmodel.state

import com.anxinjia.common.base.base.viewmodel.BaseViewModel

open class Activity${activityClass}ViewModel : BaseViewModel() {

}  
"""