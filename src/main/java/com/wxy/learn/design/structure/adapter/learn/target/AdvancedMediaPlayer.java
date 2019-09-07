package com.wxy.learn.design.structure.adapter.learn.target;

/**
 * 高级播放器接口
 * 目标(Target)角色
 */
public interface AdvancedMediaPlayer {
     void playVlc(String fileName);
     void playMp4(String fileName);
}
