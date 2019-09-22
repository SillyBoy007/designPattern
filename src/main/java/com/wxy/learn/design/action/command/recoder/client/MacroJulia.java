package com.wxy.learn.design.action.command.recoder.client;

import com.wxy.learn.design.action.command.recoder.command.Command;
import com.wxy.learn.design.action.command.recoder.command.MacroCommand;
import com.wxy.learn.design.action.command.recoder.concretecommand.MacroAudioCommand;
import com.wxy.learn.design.action.command.recoder.concretecommand.PlayCommand;
import com.wxy.learn.design.action.command.recoder.concretecommand.RewindCommand;
import com.wxy.learn.design.action.command.recoder.concretecommand.StopCommand;
import com.wxy.learn.design.action.command.recoder.reciver.AudioPlayer;

public class MacroJulia {
    public static void main(String[]args){
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);

        MacroCommand marco = new MacroAudioCommand();

        marco.add(playCommand);
        marco.add(rewindCommand);
        marco.add(stopCommand);
        marco.execute();
    }
}
