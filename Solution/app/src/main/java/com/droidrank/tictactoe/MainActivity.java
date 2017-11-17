package com.droidrank.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import static android.R.id.list;
import static android.R.id.message;

public class MainActivity extends AppCompatActivity{

    static Button block1, block2, block3, block4, block5, block6, block7, block8, block9, restart;
    static TextView result;
    boolean ans = true;
    ArrayList<Integer> list = new ArrayList<>();
    int player1 = 1;
    int player2 = 0;
    int count = 0;
    static int play = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        block1 = (Button) findViewById(R.id.bt_block1);
        block2 = (Button) findViewById(R.id.bt_block2);
        block3 = (Button) findViewById(R.id.bt_block3);
        block4 = (Button) findViewById(R.id.bt_block4);
        block5 = (Button) findViewById(R.id.bt_block5);
        block6 = (Button) findViewById(R.id.bt_block6);
        block7 = (Button) findViewById(R.id.bt_block7);
        block8 = (Button) findViewById(R.id.bt_block8);
        block9 = (Button) findViewById(R.id.bt_block9);
        result = (TextView) findViewById(R.id.tv_show_result);
        restart = (Button) findViewById(R.id.bt_restart_game);
        for(int i=0;i<9;i++) {
            list.add(-1);
        }
        block1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 == 1){
                    block1.setText("X");
                    list.set(0, player1);
                    ans = checkWin(player1);
                    player1 = 0;
                    player2 = 1;
                }
                else {
                    block1.setText("0");
                    list.set(0, player2);
                    ans = checkWin(player2);
                    player1 = 1;
                    player2 = 0;
                }
                block1.setEnabled(false);
                if(ans == true){
                    if(count < 10){
                        Toast.makeText(getApplicationContext(), "Won" ,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Tie!!" ,Toast.LENGTH_SHORT).show();
                    }
                    list = new ArrayList<>();
                    for(int i=0;i<9;i++) {
                        list.add(-1);
                    }
                    unClick();
                    player1 = 1;
                    player2 = 0;
                    ans = true;
                    count = 0;
                }
            }
        });
        block2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 == 1){
                    block2.setText("X");
                    list.set(1, player1);
                    ans = checkWin(player1);
                    player1 = 0;
                    player2 = 1;
                }
                else{
                    block2.setText("0");
                    list.set(1, player2);
                    ans = checkWin(player2);
                    player1 = 1;
                    player2 = 0;
                }
                block2.setEnabled(false);
                if(ans == true){
                    if(count < 10){
                        Toast.makeText(getApplicationContext(), "Won" ,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Tie!!" ,Toast.LENGTH_SHORT).show();
                    }
                    list = new ArrayList<>();
                    for(int i=0;i<9;i++) {
                        list.add(-1);
                    }
                    unClick();
                    player1 = 1;
                    player2 = 0;
                    ans = true;
                    count = 0;
                }
            }
        });
        block3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 == 1){
                    block3.setText("X");
                    list.set(2, player1);
                    ans = checkWin(player1);
                    player1 = 0;
                    player2 = 1;
                }
                else{
                    block3.setText("0");
                    list.set(2, player2);
                    ans = checkWin(player2);
                    player1 = 1;
                    player2 = 0;
                }
                block3.setEnabled(false);
                if(ans == true){
                    if(count < 10){
                        Toast.makeText(getApplicationContext(), "Won" ,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Tie!!" ,Toast.LENGTH_SHORT).show();
                    }
                    list = new ArrayList<>();
                    for(int i=0;i<9;i++) {
                        list.add(-1);
                    }
                    unClick();
                    player1 = 1;
                    player2 = 0;
                    ans = true;
                    count = 0;
                }
            }
        });
        block4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 == 1){
                    block4.setText("X");
                    list.set(3, player1);

                    ans = checkWin(player1);
                    player1 = 0;
                    player2 = 1;
                }
                else{
                    block4.setText("0");
                    list.set(3, player2);
                    ans = checkWin(player2);
                    player1 = 1;
                    player2 = 0;
                }
                block4.setEnabled(false);
                if(ans == true){
                    if(count < 10){
                        Toast.makeText(getApplicationContext(), "Won" ,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Tie!!" ,Toast.LENGTH_SHORT).show();
                    }
                    list = new ArrayList<>();
                    for(int i=0;i<9;i++) {
                        list.add(-1);
                    }
                    unClick();
                    player1 = 1;
                    player2 = 0;
                    ans = true;
                    count = 0;
                }
            }
        });
        block5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 == 1){
                    block5.setText("X");
                    list.set(4, player1);
                    ans = checkWin(player1);
                    player1 = 0;
                    player2 = 1;
                }
                else{
                    block5.setText("0");
                    list.set(4, player2);
                    ans = checkWin(player2);
                    player1 = 1;
                    player2 = 0;
                }
                block5.setEnabled(false);
                if(ans == true){
                    if(count < 10){
                        Toast.makeText(getApplicationContext(), "Won" ,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Tie!!" ,Toast.LENGTH_SHORT).show();
                    }
                    list = new ArrayList<>();
                    for(int i=0;i<9;i++) {
                        list.add(-1);
                    }
                    unClick();
                    player1 = 1;
                    player2 = 0;
                    ans = true;
                    count = 0;
                }
            }
        });
        block6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 == 1){
                    block6.setText("X");
                    list.set(5, player1);
                    ans = checkWin(player1);
                    player1 = 0;
                    player2 = 1;
                }
                else{
                    block6.setText("0");
                    list.set(5, player2);
                    ans = checkWin(player2);
                    player1 = 1;
                    player2 = 0;
                }
                block6.setEnabled(false);
                if(ans == true){
                    if(count < 10){
                        Toast.makeText(getApplicationContext(), "Won" ,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Tie!!" ,Toast.LENGTH_SHORT).show();
                    }
                    list = new ArrayList<>();
                    for(int i=0;i<9;i++) {
                        list.add(-1);
                    }
                    unClick();
                    player1 = 1;
                    player2 = 0;
                    ans = true;
                    count = 0;
                }
            }
        });
        block7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 == 1){
                    block7.setText("X");
                    list.set(6, player1);
                    ans = checkWin(player1);
                    player1 = 0;
                    player2 = 1;
                }
                else{
                    block7.setText("0");
                    list.set(6, player2);
                    ans = checkWin(player2);
                    player1 = 1;
                    player2 = 0;
                }
                block7.setEnabled(false);
                if(ans == true){
                    if(count < 10){
                        Toast.makeText(getApplicationContext(), "Won" ,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Tie!!" ,Toast.LENGTH_SHORT).show();
                    }
                    list = new ArrayList<>();
                    for(int i=0;i<9;i++) {
                        list.add(-1);
                    }
                    unClick();
                    player1 = 1;
                    player2 = 0;
                    ans = true;
                    count = 0;
                }
            }
        });
        block8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 == 1){
                    block8.setText("X");
                    list.set(7, player1);
                    ans = checkWin(player1);
                    player1 = 0;
                    player2 = 1;
                }
                else{
                    block8.setText("0");
                    list.set(7, player2);
                    ans = checkWin(player2);
                    player1 = 1;
                    player2 = 0;
                }
                block8.setEnabled(false);
                if(ans == true){
                    if(count < 10){
                        Toast.makeText(getApplicationContext(), "Won" ,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Tie!!" ,Toast.LENGTH_SHORT).show();
                    }
                    list = new ArrayList<>();
                    for(int i=0;i<9;i++) {
                        list.add(-1);
                    }
                    unClick();
                    player1 = 1;
                    player2 = 0;
                    ans = true;
                    count = 0;
                }
            }
        });
        block9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(player1 == 1){
                    block9.setText("X");
                    list.set(8, player1);
                    ans = checkWin(player1);
                    player1 = 0;
                    player2 = 1;
                }
                else{
                    block9.setText("0");
                    list.set(8, player2);
                    ans = checkWin(player2);
                    player1 = 1;
                    player2 = 0;
                }
                block9.setEnabled(false);
                if(ans == true){
                    if(count < 10){
                        Toast.makeText(getApplicationContext(), "Won" ,Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "Tie!!" ,Toast.LENGTH_SHORT).show();
                    }
                    list = new ArrayList<>();
                    for(int i=0;i<9;i++) {
                        list.add(-1);
                    }
                    unClick();
                    player1 = 1;
                    player2 = 0;
                    count = 0;
                }
            }
        });
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                list = new ArrayList<>();
                for(int i=0;i<9;i++) {
                    list.add(-1);
                }
                unClick();
                player1 = 1;
                player2 = 0;
                ans = true;
                count = 0;
            }
        });

        /**
         * Restarts the game
         */

    }
    protected void unClick(){
        block1.setEnabled(true);
        block2.setEnabled(true);
        block3.setEnabled(true);
        block4.setEnabled(true);
        block5.setEnabled(true);
        block6.setEnabled(true);
        block7.setEnabled(true);
        block8.setEnabled(true);
        block9.setEnabled(true);
    }
    protected boolean checkWin(int player){
        count++;
        if(list.get(0) == player && list.get(1) == player && list.get(2) == player){
            return true;
        }
        if(list.get(3) == player && list.get(4) == player && list.get(5) == player){
            return true;
        }
        if(list.get(6) == player && list.get(7) == player && list.get(8) == player){
            return true;
        }
        if(list.get(0) == player && list.get(3) == player && list.get(6) == player){
            return true;
        }
        if(list.get(1) == player && list.get(4) == player && list.get(7) == player){
            return true;
        }
        if(list.get(2) == player && list.get(5) == player && list.get(8) == player){
            return true;
        }
        if(list.get(0) == player && list.get(4) == player && list.get(8) == player){
            return true;
        }
        if(list.get(2) == player && list.get(4) == player && list.get(6) == player) {
            return true;
        }
        count++;
        return false;
    }

}
