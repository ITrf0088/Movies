package com.rasulov.feature.utils

import androidx.fragment.app.Fragment
import com.rasulov.feature.di.DependencyProvider

inline fun <reified T> Fragment.extractDependency(): T {
    val application = requireActivity().application
    if (application !is DependencyProvider)
        error("The Application needs to implement DependencyProvider")

    val dependency = application.dependency
    if (dependency !is T)
        error("The top level dagger component did not implement ${T::class.simpleName}")

    return dependency
}