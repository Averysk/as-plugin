package com.github.averysk.other.asplugin.ou_1v1.activity.res.layout

fun mvvmActivityXml_1v1(
    applicationPackage: String?,
    packageName: String,
    activityClass: String
) = """
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <data>
    
        <variable
            name="vm"
            type="${packageName}.vm.${activityClass}ViewModel" />

        <variable
            name="onClick"
            type="${packageName}.ui.${activityClass}Activity.ClickProxy" />
    </data>
    
    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/white"
        tools:context="${packageName.replace(applicationPackage!!+".","",true)}.ui.${activityClass}Activity">
        
            <com.ou_1v1.widget.view.StatusTitleBarView
                android:id="@+id/statusTitleBarView"
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                app:layout_constraintTop_toTopOf="parent"
                app:viewTitleBarTitle="@string/" /> 
        
    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>

"""