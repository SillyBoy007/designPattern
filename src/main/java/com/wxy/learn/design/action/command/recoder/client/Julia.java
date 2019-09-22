package com.wxy.learn.design.action.command.recoder.client;

import com.wxy.learn.design.action.command.recoder.command.Command;
import com.wxy.learn.design.action.command.recoder.concretecommand.PlayCommand;
import com.wxy.learn.design.action.command.recoder.concretecommand.RewindCommand;
import com.wxy.learn.design.action.command.recoder.concretecommand.StopCommand;
import com.wxy.learn.design.action.command.recoder.invoker.Keypad;
import com.wxy.learn.design.action.command.recoder.reciver.AudioPlayer;

public class Julia {
    public static void main(String[]args){
        //创建接收者对象
        AudioPlayer audioPlayer = new AudioPlayer();
        //创建命令对象
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);
        //创建请求者对象
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);
        //测试
        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();
    }
}
