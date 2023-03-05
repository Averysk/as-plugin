package com.github.averysk.other.asplugin.ou_1v1.fragment.res.layout

fun mvvmFragmentXml_1v1(
    applicationPackage: String?,
    packageName: String,
    fragmentClass: String
) = """
<?xml version="1.0" encoding="utf-8"?>
<layout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools">

    <data>

        <variable
            name="vm"
            type="${packageName}.vm.${fragmentClass}ViewModel" />

        <variable
            name="onClick"
            type="${packageName}.ui.${fragmentClass}Fragment.ClickProxy" />
    </data>

    <androidx.constraintlayout.widget.ConstraintLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:background="@color/white"
        tools:context="${packageName.replace(applicationPackage!!.plus("."),"",true)}.ui.${fragmentClass}Fragment">

        <com.ou_1v1.widget.view.StatusTitleBarView
            android:id="@+id/statusTitleBarView"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            app:layout_constraintTop_toTopOf="parent"
            app:viewTitleBarTitle="@string/" />

    </androidx.constraintlayout.widget.ConstraintLayout>
</layout>

"""