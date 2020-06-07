package cn.lanink.hotpotato.command.adminsub;

import cn.lanink.hotpotato.command.base.BaseSubCommand;
import cn.lanink.hotpotato.ui.GuiCreate;
import cn.nukkit.Player;
import cn.nukkit.command.CommandSender;
import cn.nukkit.command.data.CommandParameter;

public class UiCommand extends BaseSubCommand {

    public UiCommand(String name) {
        super(name);
    }

    @Override
    public boolean canUser(CommandSender sender) {
        return sender.isPlayer() && sender.isOp();
    }

    @Override
    public String[] getAliases() {
        return new String[0];
    }

    @Override
    public boolean execute(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        GuiCreate.sendAdminMenu(player);
        return true;
    }

    @Override
    public CommandParameter[] getParameters() {
        return new CommandParameter[0];
    }

}
