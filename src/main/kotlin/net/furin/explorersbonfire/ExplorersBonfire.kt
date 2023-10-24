package net.furin.explorersbonfire

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object ExplorersBonfire : ModInitializer {
	private const val MOD_ID = "explorers-bonfire"
    private val logger = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		logger.info("Hello Fabric world!")
	}
}