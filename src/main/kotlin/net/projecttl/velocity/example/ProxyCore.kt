package net.projecttl.velocity.example

import com.google.inject.Inject
import com.velocitypowered.api.proxy.ProxyServer
import net.projecttl.velocity.example.commands.TestCommand
import org.slf4j.Logger

lateinit var instance: ProxyServer

class ProxyCore @Inject constructor(server: ProxyServer, logger: Logger) {
    init {
        instance = server
        server.commandManager.apply {
            register("test", TestCommand)
        }

        logger.info("plugin enabled!")
    }
}