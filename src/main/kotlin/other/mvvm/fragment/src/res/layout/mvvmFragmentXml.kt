package other.mvvm.fragment.src.res.layout

fun mvvmFragmentXml(
        packageName: String,
        fragmentClass: String
) = """
<?xml version="1.0" encoding="utf-8"?>
<layout>

    <data>
        <variable
            name="vm"
            type="${packageName}.viewmodel.state.Fragment${fragmentClass}ViewModel" />
    </data>

    <LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        >

    </LinearLayout>

</layout>

"""