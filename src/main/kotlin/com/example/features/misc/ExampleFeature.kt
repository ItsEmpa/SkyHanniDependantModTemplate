package com.example.features.misc

import at.hannibal2.skyhanni.events.GuiRenderEvent
import at.hannibal2.skyhanni.utils.RenderUtils.renderString
import com.example.ExampleMod
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

@Suppress("SkyHanniModuleInspection")
object ExampleFeature {

    private val config get() = ExampleMod.feature.exampleCategory

    @SubscribeEvent
    fun onRenderOverlay(event: GuiRenderEvent.GuiOverlayRenderEvent) {
        if (!config.exampleOption) return
        config.position.renderString("Hi, this is a test feature", posLabel = "Example Option")
    }

}
