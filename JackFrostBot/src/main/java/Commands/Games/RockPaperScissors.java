package Commands.Games;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


//this is a simple Rock Paper Scissors command in which if a user does ?rps or ?RockPaperScissors, the bot will randomise, rock paper or scissors
public class RockPaperScissors extends ListenerAdapter {
    private final String[] a = {
            "Rock \uD83E\uDEA8 ", "Paper \uD83D\uDCC3 ", "Scissors ✂️ "
    };
    public void onMessageReceived(MessageReceivedEvent e){
        if(e.getMessage().getContentRaw().startsWith("?rps")){
            e.getChannel().sendMessage(a[(int) (Math.random()*a.length)] +", " + e.getAuthor().getAsMention()).queue();
        }
        if(e.getMessage().getContentRaw().startsWith("?rockpaperscissors")){
            e.getChannel().sendMessage(a[(int) (Math.random()*a.length)] +", " + e.getAuthor().getAsMention()).queue();
        }
    }

}
