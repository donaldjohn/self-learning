package com.behaviour.command.demo;
//http://www.cnblogs.com/java-my-life/archive/2012/06/01/2526972.html
public class Julia {
    public static void main(String[]args){
        //���������߶���
        AudioPlayer audioPlayer = new AudioPlayer();
        //�����������
        Command playCommand = new PlayCommand(audioPlayer);
        Command rewindCommand = new RewindCommand(audioPlayer);
        Command stopCommand = new StopCommand(audioPlayer);
        //���������߶���
        Keypad keypad = new Keypad();
        keypad.setPlayCommand(playCommand);
        keypad.setRewindCommand(rewindCommand);
        keypad.setStopCommand(stopCommand);
        //����
        keypad.play();
        keypad.rewind();
        keypad.stop();
        keypad.play();
        keypad.stop();
    }
}