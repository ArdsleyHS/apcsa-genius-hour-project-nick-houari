package Commands.Games;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


//this command makes it so if the user says "?marco" the bot responds with polo! -
// it is very similar to a standard ?ping command
public class MarcoPolo extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent e){
        if(e.getMessage().getContentRaw().equalsIgnoreCase("?marco")){
            e.getChannel().sendMessage("polo! :man_swimming: ").queue();
        }
    }
}
