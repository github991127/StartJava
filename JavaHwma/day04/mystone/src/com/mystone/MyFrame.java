package com.mystone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * ClassName: MyFrame
 * Package: com.mystone
 * Description:
 *
 * @Author: Jimbo
 * @Create: 2023/11/8 16:33
 */
public class MyFrame extends JFrame implements KeyListener {
    int[][] randomArray = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}};
    int[][] victoryArray = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};
    boolean victoryBool = false;
    int row = 0;
    int col = 0;
    int step = 0;

    public MyFrame() throws HeadlessException {
        generateRandomArray();// 打乱数组
        initFrame();// 初始化窗口
        paintView();// 绘制界面
        listenMove();// 监听键盘移动事件
        setVisible(true);// 设置窗体可见
    }


    /*打乱数组*/
    public void generateRandomArray() {
        Random r = new Random();
        victoryBool = false;
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                int x = r.nextInt(4);
                int y = r.nextInt(4);
                int temp = randomArray[i][j];
                randomArray[i][j] = randomArray[x][y];
                randomArray[x][y] = temp;
            }
        }

        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                if (randomArray[i][j] == 0) {
                    int temp = randomArray[i][j];
                    randomArray[i][j] = randomArray[3][3];
                    randomArray[3][3] = temp;
                    row = 3;
                    col = 3;
                }
            }
        }


    }

    /*初始化窗口*/
    public void initFrame() {
        // 设置大小，居中，关闭，置顶，标题
        setSize(514, 595);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setTitle("Mystone");

        // 取消默认布局
        setLayout(null);
    }

    /*绘制界面*/
    public void paintView() {
        //清空组件
        getContentPane().removeAll();

        // 绘制胜利图片
        victory();
        if (victoryBool) {
            JLabel winLabel = new JLabel(new ImageIcon("day04\\mystone\\image\\win.png"));
            winLabel.setBounds(124, 230, 266, 88);
            getContentPane().add(winLabel);
        }

        // 绘制步数文本
        JLabel stepLabel = new JLabel("Step：" + step);
        stepLabel.setBounds(50, 20, 100, 20);
        stepLabel.setFont(new Font("微软雅黑", Font.BOLD, 12));
        getContentPane().add(stepLabel);

        // 绘制重开按钮
        JButton restartButton = new JButton("Restart");
        restartButton.setBounds(350, 20, 100, 20);
        getContentPane().add(restartButton);
        restartButton.setFont(new Font("微软雅黑", Font.BOLD, 12));
        restartButton.setBackground(Color.WHITE);
        restartButton.setForeground(Color.BLACK);
        restartButton.setFocusable(false);// 取消按钮焦点

        restartButton.addActionListener(e -> {//函数式接口lamda实现
            step = 0;
            generateRandomArray();
            paintView();
        });

        // 绘制石块图片
        for (int i = 0; i < randomArray.length; i++) {
            for (int j = 0; j < randomArray[i].length; j++) {
                JLabel jl1 = new JLabel(new ImageIcon("day04\\mystone\\image\\" + randomArray[i][j] + ".png"));
                jl1.setBounds(50 + j * 100, 90 + i * 100, 100, 100);
                getContentPane().add(jl1);
            }
        }

        //绘制背景图片
        JLabel jl1 = new JLabel(new ImageIcon("day04\\mystone\\image\\background.png"));
        jl1.setBounds(26, 30, 450, 484);
        getContentPane().add(jl1);

        //刷新组件
        getContentPane().repaint();
    }

    /*监听键盘移动事件*/
    private void listenMove() {
        this.addKeyListener(this);
    }

    /*键盘按下事件*/
    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        move(key);
        paintView();

    }

    /*键盘移动业务*/
    private void move(int key) {
        if (victoryBool) {
            return;
        }
        switch (key) {
            case KeyEvent.VK_UP:
                System.out.println("up");
                if (row <= 2) {
                    int temp = randomArray[row][col];
                    randomArray[row][col] = randomArray[row + 1][col];
                    randomArray[row + 1][col] = temp;
                    row++;
                    step++;
                }
                break;
            case KeyEvent.VK_DOWN:
                System.out.println("down");
                if (row >= 1) {
                    int temp = randomArray[row][col];
                    randomArray[row][col] = randomArray[row - 1][col];
                    randomArray[row - 1][col] = temp;
                    row--;
                    step++;
                }
                break;
            case KeyEvent.VK_LEFT:
                System.out.println("left");
                if (col <= 2) {
                    int temp = randomArray[row][col];
                    randomArray[row][col] = randomArray[row][col + 1];
                    randomArray[row][col + 1] = temp;
                    col++;
                    step++;
                }
                break;
            case KeyEvent.VK_RIGHT:
                System.out.println("right");
                if (col >= 1) {
                    int temp = randomArray[row][col];
                    randomArray[row][col] = randomArray[row][col - 1];
                    randomArray[row][col - 1] = temp;
                    col--;
                    step++;
                }
                break;
            case KeyEvent.VK_SPACE:
                System.out.println("cheat");//空格作弊
                randomArray = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 0}};//重新初始化数组
                break;
            default:
                break;
        }
    }

    /*胜利判定*/
    public void victory() {
        for (int i = 0; i < victoryArray.length; i++) {
            for (int j = 0; j < victoryArray[i].length; j++) {
                if (randomArray[i][j] != victoryArray[i][j]) {
                    victoryBool = false;
                    return;
                }
            }
        }
        victoryBool = true;
    }

    //空接口方法
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
    //空接口方法

}
