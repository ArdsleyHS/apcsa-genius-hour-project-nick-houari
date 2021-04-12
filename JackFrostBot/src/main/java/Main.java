import Commands.Fun.Kakarot;
import Commands.Fun.Lisandy;
import Commands.Fun.Yarichin;
import Commands.Games.EightBall;
import Commands.Games.MarcoPolo;
import Commands.Games.RockPaperScissors;
import Commands.Information.InviteLink;
import Commands.Information.ServerInfo;
import com.jagrosh.jdautilities.command.CommandClient;
import com.jagrosh.jdautilities.command.CommandClientBuilder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Invite;
import net.dv8tion.jda.api.requests.GatewayIntent;
import sun.rmi.rmic.Constants;

import javax.security.auth.login.LoginException;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args){
        JDABuilder jdaBuilder = JDABuilder.createDefault("ODAzMjgzMzI0NzcxODkzMjk4.YA7h5A.eiCOVih6_ZvRjrfDg09BTw7j_oM");
        JDA jda = null;
        // this command sets the bots Activity on Discord

        jdaBuilder.setActivity(Activity.playing("Mabufudyne☃️"));

        // these commands make it so that the bot recognizes the other Classes
        jdaBuilder.addEventListeners(new RockPaperScissors());
        jdaBuilder.addEventListeners(new InviteLink());
        jdaBuilder.addEventListeners(new MarcoPolo());
        jdaBuilder.addEventListeners(new EightBall());


        try {
            jda = jdaBuilder.build();
        } catch (LoginException e) {
            e.printStackTrace();
        }

        CommandClientBuilder builder = new CommandClientBuilder();
       //sets prefix
        builder.setPrefix("?");
        builder.setOwnerId("803283324771893298");


        builder.setHelpWord("help");
        builder.addCommand(new ServerInfo());
        CommandClient client = builder.build();
        jda.addEventListener(client);




        }


    }

