package other.mvvm.fragment.src.app_package


fun mvvmFragmentViewModel(
        packageName:String,
        fragmentClass:String
)="""
package ${packageName}.viewmodel.state

import com.anxinjia.common.base.base.viewmodel.BaseViewModel

open class Fragment${fragmentClass}ViewModel : BaseViewModel() {

}  
"""