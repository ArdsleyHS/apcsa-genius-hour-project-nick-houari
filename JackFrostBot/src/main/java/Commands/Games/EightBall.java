package Commands.Games;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

//magic 8ball where if you ask a question, it gives a series of responses

public class EightBall extends ListenerAdapter {
    private final String[] a = {
          "Yes", "It is quite possible", "Don't count on it", "No", "Doubt it", "Maybe", "Come Again Later"
    };

    public void onMessageReceived(MessageReceivedEvent e){
        if(e.getMessage().getContentRaw().startsWith("?8ball") || e.getMessage().getContentRaw().equalsIgnoreCase("?8ball")){
            e.getChannel().sendMessage("\uD83C\uDFB1 " + a[(int) (Math.random()*a.length)] +", " + e.getAuthor().getAsMention()).queue();
        }
    }
}
