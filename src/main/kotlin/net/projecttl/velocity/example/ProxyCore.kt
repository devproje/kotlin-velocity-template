package net.projecttl.velocity.example

import com.velocitypowered.api.proxy.ProxyServer
import net.projecttl.velocity.example.commands.TestCommand
import org.slf4j.Logger

lateinit var instance: ProxyServer

class ProxyCore(server: ProxyServer, logger: Logger) {
    init {
        instance = server
        server.commandManager.apply {
            register("lobby", TestCommand)
        }

        logger.info("plugin enabled!")
    }
}