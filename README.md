# HiltSample
演示Hilt的基本用法

1. 在项目的build.gradle中，添加plugin
plugins {
    ...
    id 'com.google.dagger.hilt.android' version '2.46' apply false
}

2. App模块的plugins中添加plugins
plugins {
    ...
    id 'kotlin-kapt'
    id 'dagger.hilt.android.plugin'
}

3. App模块中添加依赖
dependencies {
    ...
    implementation 'com.google.dagger:hilt-android:2.46.1'
    kapt 'com.google.dagger:hilt-compiler:2.46.1'
}
