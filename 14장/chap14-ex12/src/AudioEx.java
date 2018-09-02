import javax.sound.sampled.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AudioEx extends JFrame {
    private JButton btns[] = { new JButton("play"), new JButton("stop"),
                                new JButton("play again")};
    private Clip clip;

    public AudioEx() {
    	setTitle("����� ����");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        MyActionListener al = new MyActionListener();
        for(int i=0; i<btns.length; i++) {
            c.add(btns[i]);
            btns[i].addActionListener(al);
        }
        setVisible(true);
        loadAudio("audio/�ֱ���1��.wav");
    }

    private void loadAudio(String pathName) {
        try {
            clip = AudioSystem.getClip(); // ����ִ� ����� Ŭ�� �����
            File audioFile = new File(pathName); // ����� ������ ��θ�
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile); // ����� ���Ϸκ���
            clip.open(audioStream); // ����� ����� ��Ʈ�� ����
        }
        catch (LineUnavailableException e) { e.printStackTrace(); }
        catch (UnsupportedAudioFileException e) { e.printStackTrace(); }
        catch (IOException e) { e.printStackTrace(); }

    }
    
    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            switch(e.getActionCommand()) {
                case "play": clip.start(); // ����� ��� ����
                    break;
                case "stop": clip.stop(); // ����� ��� �ߴ�
                    break;
                case "play again":
                    clip.setFramePosition(0); // ��� ��ġ�� ù ���������� ����
                    clip.start(); // ����� ��� ����
                    break;
            }
        }
    }
    
    public static void main(String [] args) {
        new AudioEx();
    }
}