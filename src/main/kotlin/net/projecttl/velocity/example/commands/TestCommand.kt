package net.projecttl.velocity.example.commands

import com.velocitypowered.api.command.SimpleCommand
import com.velocitypowered.api.proxy.Player
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.format.NamedTextColor

object TestCommand : SimpleCommand {

    override fun execute(invocation: SimpleCommand.Invocation) {
        val player = invocation.source() as Player
        player.sendMessage(Component.text("Test!", NamedTextColor.GREEN))
    }
}