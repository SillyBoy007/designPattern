package com.wxy.learn.design.action.command.recoder.concretecommand;

import com.wxy.learn.design.action.command.recoder.command.Command;
import com.wxy.learn.design.action.command.recoder.reciver.AudioPlayer;

public class StopCommand implements Command {
    private AudioPlayer myAudio;

    public StopCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    @Override
    public void execute() {
        myAudio.stop();
    }
}
