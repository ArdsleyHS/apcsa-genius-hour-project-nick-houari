package Commands.Information;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;


// This command gives the user an invite link when prompted with "?invite"
public class InviteLink extends ListenerAdapter {
    String url = "https://discord.com/oauth2/authorize?client_id=%s&scope=bot";
    public void onMessageReceived(MessageReceivedEvent e) {
        if (e.getMessage().getContentRaw().equalsIgnoreCase("?invite")) {
            e.getChannel().sendMessage(e.getAuthor().getAsMention() + " " + String.format(url,e.getJDA().getSelfUser().getId())).queue();
        }
    }
}
