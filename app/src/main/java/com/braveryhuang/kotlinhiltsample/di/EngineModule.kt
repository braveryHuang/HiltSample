package com.braveryhuang.kotlinhiltsample.di

import com.braveryhuang.kotlinhiltsample.model.ElectricEngine
import com.braveryhuang.kotlinhiltsample.model.Engine
import com.braveryhuang.kotlinhiltsample.model.GasEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/**
 * 获取依赖注入的实例
 * https://dagger.dev/hilt/components.html
 */
@Module
@InstallIn(ActivityComponent::class)
abstract class EngineModule {

    @BindGasEngine
    @Binds
    abstract fun bindGasEngine(engine: GasEngine): Engine

    @BindElectricEngine
    @Binds
    abstract fun bindElectricEngine(engine: ElectricEngine): Engine
}