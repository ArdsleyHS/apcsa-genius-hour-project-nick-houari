package Commands.Information;

import com.jagrosh.jdautilities.command.Command;
import com.jagrosh.jdautilities.command.CommandEvent;

public class ServerInfo extends Command {

    public ServerInfo(){
        super.name = "serverinfo";
        super.aliases = new String[]{"si", "server-info"};
        super.category = new Category("Informative");
        super.cooldown = 2;
        super.help = "Gets the info about a server";



    }

    @Override
    protected void execute(CommandEvent e) {

        e.reply("yo mom chungus");

    }
}
