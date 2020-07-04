
object Config {
    const val min_sdk_version = 21
    const val compile_sdk_version = 29
    const val target_sdk_version = 29
    const val build_tools_version = "29.0.3"
    const val androidx_test_runner = "androidx.test.runner.AndroidJUnitRunner"
    const val java_version = "1.8"
    const val versionCode = 1
    const val versionName = "1.0.0"
    const val applicationId = "cn.javayhu.daoism"
}

object Versions {
    //<editor-fold desc="libraries">
    const val library_tensorflow_lite_version = "0.0.0-nightly"
    const val library_timer_version = "4.7.1"
    const val library_retrofit_version = "2.7.2"
    const val library_okhttp_logging_interceptor_version = "4.0.0"
    const val library_statusbar_util_version = "1.5.1"
    const val library_coil_version = "0.11.0"
    const val library_blurry_version = "3.0.0"
    const val library_wava_version = "1.0.0"
    //</editor-fold>

    // <editor-fold desc="androidx">
    const val androidx_material_version = "1.1.0"
    const val androidx_appcompat_version = "1.1.0"
    const val androidx_core_ktx_version = "1.3.0"
    const val androidx_recyclerview_version = "1.1.0"
    const val androidx_navigation_version = "2.3.0-rc01"
    const val androidx_constraint_layout_version = "2.0.0-beta4"
    const val androidx_lifecycle_version = "2.2.0"
    const val androidx_room_version = "2.2.5"
    const val androidx_paging_version = "3.0.0-alpha01"
    const val androidx_preference_version = "1.1.0"
    const val androidx_camerax_version = "1.0.0-alpha02"
    const val androidx_activity_version = "1.2.0-alpha05"
    const val androidx_fragment_version = "1.3.0-alpha05"
    const val androidx_exifinterface_version = "1.2.0"
    // </editor-fold>

    //<editor-fold desc="kotlin">
    const val kotlin_version = "1.3.72"
    const val coroutines_version = "1.3.5"
    //</editor-fold>

    // <editor-fold desc="tools">
    const val gradle_android_version = "4.0.0"
    const val gradle_versions_plugin_version = "0.21.0"
    // </editor-fold>

    // <editor-fold desc="test">
    const val junit_version = "4.12"
    const val androidx_espresso_version = "3.1.0"
    const val androidx_test_runner_version = "1.1.1"
    //</editor-fold>
}

object Deps {
    //<editor-fold desc="libraries">
    const val library_tensorflow_lite = "org.tensorflow:tensorflow-lite:${Versions.library_tensorflow_lite_version}"
    const val library_tensorflow_lite_gpu = "org.tensorflow:tensorflow-lite-gpu:${Versions.library_tensorflow_lite_version}"
    const val library_timer = "com.jakewharton.timber:timber:${Versions.library_timer_version}"
    const val library_retrofit = "com.squareup.retrofit2:retrofit:${Versions.library_retrofit_version}"
    const val library_retrofit_convert_gson = "com.squareup.retrofit2:converter-gson:${Versions.library_retrofit_version}"
    const val library_retrofit_mock = "com.squareup.retrofit2:retrofit-mock:${Versions.library_retrofit_version}"
    const val library_okhttp_logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.library_okhttp_logging_interceptor_version}"
    const val library_statusbar_util = "com.jaeger.statusbarutil:library:${Versions.library_statusbar_util_version}"
    const val library_coil = "io.coil-kt:coil:${Versions.library_coil_version}"
    const val library_blurry = "jp.wasabeef:blurry:${Versions.library_blurry_version}"
    const val library_wava = "com.github.hujiaweibujidao:wava:${Versions.library_wava_version}"
    //</editor-fold>

    //<editor-fold desc="androix">
    const val androidx_appcompat = "androidx.appcompat:appcompat:${Versions.androidx_appcompat_version}"
    const val androidx_core_ktx = "androidx.core:core-ktx:${Versions.androidx_core_ktx_version}"
    const val androidx_constraint_layout = "androidx.constraintlayout:constraintlayout:${Versions.androidx_constraint_layout_version}"
    const val androidx_material = "com.google.android.material:material:${Versions.androidx_material_version}"
    const val androidx_navigation_fragment = "androidx.navigation:navigation-fragment-ktx:${Versions.androidx_navigation_version}"
    const val androidx_navigation_ui = "androidx.navigation:navigation-ui-ktx:${Versions.androidx_navigation_version}"
    const val androidx_recyclerview = "androidx.recyclerview:recyclerview:${Versions.androidx_recyclerview_version}"
    const val androidx_paging_runtime = "androidx.paging:paging-runtime:${Versions.androidx_paging_version}"
    const val androidx_paging_common = "androidx.paging:paging-common:${Versions.androidx_paging_version}"
    const val androidx_room_runtime = "androidx.room:room-runtime:${Versions.androidx_room_version}"
    const val androidx_room_compiler = "androidx.room:room-compiler:${Versions.androidx_room_version}"
    const val androidx_room_ktx = "androidx.room:room-ktx:${Versions.androidx_room_version}"
    const val androidx_lifecycle_extensions = "androidx.lifecycle:lifecycle-extensions:${Versions.androidx_lifecycle_version}"
    const val androidx_lifecycle_compiler = "androidx.lifecycle:lifecycle-compiler:${Versions.androidx_lifecycle_version}"
    const val androidx_lifecycle_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.androidx_lifecycle_version}"
    const val androidx_preference = "androidx.preference:preference:${Versions.androidx_preference_version}"
    const val androidx_camerax_core = "androidx.camera:camera-core:${Versions.androidx_camerax_version}"
    const val androidx_camerax_camera2 = "androidx.camera:camera-camera2:${Versions.androidx_camerax_version}"
    const val androidx_activity = "androidx.activity:activity:${Versions.androidx_activity_version}"
    const val androidx_activity_ktx = "androidx.activity:activity-ktx:${Versions.androidx_activity_version}"
    const val androidx_fragment = "androidx.fragment:fragment:${Versions.androidx_fragment_version}"
    const val androidx_fragment_ktx = "androidx.fragment:fragment-ktx:${Versions.androidx_fragment_version}"
    const val androidx_exifinterface = "androidx.exifinterface:exifinterface:${Versions.androidx_exifinterface_version}"
    //</editor-fold>

    //<editor-fold desc="kotlin">
    const val kotlin_stdlib = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.kotlin_version}"
    const val kotlin_coroutines_core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines_version}"
    const val kotlin_coroutines_android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines_version}"
    //</editor-fold>

    //<editor-fold desc="tools">
    const val tools_gradle_android = "com.android.tools.build:gradle:${Versions.gradle_android_version}"
    const val tools_kotlin_gradle_plugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.kotlin_version}"
    const val tools_gradle_versions_plugin = "com.github.ben-manes:gradle-versions-plugin:${Versions.gradle_versions_plugin_version}"
    //</editor-fold>

    //<editor-fold desc="test">
    const val test_junit = "junit:junit:${Versions.junit_version}"
    const val test_androidx_rules = "androidx.test:rules:${Versions.androidx_test_runner_version}"
    const val test_androidx_runner = "androidx.test:runner:${Versions.androidx_test_runner_version}"
    const val test_androidx_espressocore = "androidx.test.espresso:espresso-core:${Versions.androidx_espresso_version}"
    //</editor-fold>
}

