package other.mvvm.activity.src.res.layout

fun mvvmActivityXml(
        packageName: String,
        activityClass: String
) = """
<?xml version="1.0" encoding="utf-8"?>
<layout>

    <data>
        <variable
            name="vm"
            type="${packageName}.viewmodel.state.Activity${activityClass}ViewModel" />
    </data>

    <LinearLayout
        xmlns:android="http://schemas.android.com/apk/res/android"
        xmlns:tools="http://schemas.android.com/tools"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:orientation="vertical"
        tools:context=".${activityClass}Activity"
        >

    </LinearLayout>

</layout>

"""