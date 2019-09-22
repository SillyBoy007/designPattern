package com.wxy.learn.design.action.command.recoder.concretecommand;

import com.wxy.learn.design.action.command.recoder.command.Command;
import com.wxy.learn.design.action.command.recoder.reciver.AudioPlayer;

/**
 * 具体命令角色
 */
public class PlayCommand implements Command {
    private AudioPlayer myAudio;

    public PlayCommand(AudioPlayer audioPlayer){
        myAudio = audioPlayer;
    }
    /**
     * 执行方法
     */
    @Override
    public void execute() {
        myAudio.play();
    }

}
