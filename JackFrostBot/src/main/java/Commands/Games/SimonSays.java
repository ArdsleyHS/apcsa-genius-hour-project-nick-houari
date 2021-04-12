package Commands.Games;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class SimonSays extends ListenerAdapter {
    public void onMessageReceived(MessageReceivedEvent e){
    if(e.getMessage().getContentRaw().startsWith("?say")){
        e.getChannel().sendMessage(e.getMessage());
    }
    }
}
