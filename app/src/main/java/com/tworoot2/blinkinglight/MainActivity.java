package com.tworoot2.blinkinglight;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    LinearLayout zeroZero, zeroOne, oneZero, oneOne;
    Button start;
    TextView score;
    Random random;
    Timer timer;
    int scoreCard = 0;

    boolean activeStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zeroZero = findViewById(R.id.zeroZero);
        zeroOne = findViewById(R.id.zeroOne);
        oneZero = findViewById(R.id.oneZero);
        oneOne = findViewById(R.id.oneOne);
        start = findViewById(R.id.start);
        score = findViewById(R.id.score);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (activeStatus) {
                    Toast.makeText(getApplicationContext(), "Your are already in game", Toast.LENGTH_SHORT).show();
                } else {
                    timer = new Timer();
                    score.setText("Score : 0");
                    startGame3(true);
                }
            }
        });

    }

    private void startGame3(boolean status) {


        final int[] rand = new int[1];

        final int[] myScore = {-1};

        if (status) {

            timer.schedule(new TimerTask() {
                @Override
                public void run() {

                    myScore[0] = myScore[0] + 1;


                    if (myScore[0] > scoreCard) {

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                                zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                                oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                                oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


                                activeStatus = false;
                                score.setText("Game Over - Your Score was : " + scoreCard);

                                showDialog("Your Score was : " + scoreCard);

                                timer.cancel();
                                scoreCard = 0;
                                Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();

                            }
                        });


                    } else {
                        random = new Random();

                        rand[0] = (int) (Math.random() * 4);

                        Log.d("RandomValue", String.valueOf(rand[0]));


                        if (rand[0] == 0) {
                            zeroZero.setBackgroundColor(getResources().getColor(R.color.grayColor));
                            zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                            oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                            oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    if (activeStatus == true) {


                                        zeroZero.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                                                zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                                                oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                                                oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


//                                        Toast.makeText(MainActivity.this, "Good", Toast.LENGTH_SHORT).show();
                                                scoreCard = scoreCard + 1;
                                                score.setText("Score : " + scoreCard);

//                                                myScore[0] = ++scoreCard;
//                                                score.setText("Score : " + myScore[0]);


                                            }
                                        });


                                        zeroOne.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

//                                            rand[0] = 6;
                                                zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                                                zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                                                oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                                                oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


                                                activeStatus = false;
                                                score.setText("Game Over - Your Score was : " + scoreCard);

                                                showDialog("Your Score was : " + scoreCard);

                                                timer.cancel();
                                                scoreCard = 0;
                                                Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                            }
                                        });
                                        oneZero.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

//                                            rand[0] = 6;
                                                zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                                                zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                                                oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                                                oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


                                                activeStatus = false;
                                                score.setText("Game Over - Your Score was : " + scoreCard);

                                                showDialog("Your Score was : " + scoreCard);

                                                timer.cancel();
                                                scoreCard = 0;
                                                Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                            }
                                        });
                                        oneOne.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

//                                            rand[0] = 6;
                                                zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                                                zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                                                oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                                                oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


                                                activeStatus = false;
                                                score.setText("Game Over - Your Score was : " + scoreCard);

                                                showDialog("Your Score was : " + scoreCard);

                                                timer.cancel();
                                                scoreCard = 0;
                                                Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                            }
                                        });
                                    }

                                }
                            });


                        }

                        if (rand[0] == 1) {
                            zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                            zeroOne.setBackgroundColor(getResources().getColor(R.color.grayColor));
                            oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                            oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {


                                    zeroZero.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            activeStatus = false;
                                            score.setText("Game Over - Your Score was : " + scoreCard);

                                            showDialog("Your Score was : " + scoreCard);

                                            timer.cancel();
                                            scoreCard = 0;
                                            Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                    zeroOne.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                                            zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                                            oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                                            oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


//                                        Toast.makeText(MainActivity.this, "Good", Toast.LENGTH_SHORT).show();
                                            scoreCard = scoreCard + 1;
                                            score.setText("Score : " + scoreCard);

//                                            myScore[0] = ++scoreCard;
//                                            score.setText("Score : " + myScore[0]);

                                        }
                                    });
                                    oneZero.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            activeStatus = false;
                                            score.setText("Game Over - Your Score was : " + scoreCard);

                                            showDialog("Your Score was : " + scoreCard);

                                            timer.cancel();
                                            scoreCard = 0;
                                            Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                    oneOne.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            activeStatus = false;
                                            score.setText("Game Over - Your Score was : " + scoreCard);

                                            showDialog("Your Score was : " + scoreCard);

                                            timer.cancel();
                                            scoreCard = 0;
                                            Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                        }
                                    });


                                }
                            });


                        }

                        if (rand[0] == 2) {
                            zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                            zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                            oneZero.setBackgroundColor(getResources().getColor(R.color.grayColor));
                            oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    zeroZero.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            activeStatus = false;
                                            score.setText("Game Over - Your Score was : " + scoreCard);

                                            showDialog("Your Score was : " + scoreCard);

                                            timer.cancel();
                                            scoreCard = 0;
                                            Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                    zeroOne.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            activeStatus = false;
                                            score.setText("Game Over - Your Score was : " + scoreCard);

                                            showDialog("Your Score was : " + scoreCard);

                                            timer.cancel();
                                            scoreCard = 0;
                                            Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                    oneZero.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                                            zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                                            oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                                            oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


//                                        Toast.makeText(MainActivity.this, "Good", Toast.LENGTH_SHORT).show();
                                            scoreCard = scoreCard + 1;
                                            score.setText("Score : " + scoreCard);

//                                            myScore[0] = ++scoreCard;
//                                            score.setText("Score : " + myScore[0]);
                                        }
                                    });
                                    oneOne.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            activeStatus = false;
                                            score.setText("Game Over - Your Score was : " + scoreCard);

                                            showDialog("Your Score was : " + scoreCard);

                                            timer.cancel();
                                            scoreCard = 0;
                                            Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                        }
                                    });


                                }
                            });


                        }

                        if (rand[0] == 3) {
                            zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                            zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                            oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                            oneOne.setBackgroundColor(getResources().getColor(R.color.grayColor));


                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    zeroZero.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            activeStatus = false;
                                            score.setText("Game Over - Your Score was : " + scoreCard);

                                            showDialog("Your Score was : " + scoreCard);

                                            timer.cancel();
                                            scoreCard = 0;
                                            Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                    zeroOne.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            activeStatus = false;
                                            score.setText("Game Over - Your Score was : " + scoreCard);

                                            showDialog("Your Score was : " + scoreCard);

                                            timer.cancel();
                                            scoreCard = 0;
                                            Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                    oneZero.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {
                                            activeStatus = false;
                                            score.setText("Game Over - Your Score was : " + scoreCard);

                                            showDialog("Your Score was : " + scoreCard);


                                            timer.cancel();
                                            scoreCard = 0;
                                            Toast.makeText(MainActivity.this, "Game Over", Toast.LENGTH_SHORT).show();
                                        }
                                    });
                                    oneOne.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            zeroZero.setBackgroundColor(getResources().getColor(R.color.zeroZeroColor));
                                            zeroOne.setBackgroundColor(getResources().getColor(R.color.zeroOneColor));
                                            oneZero.setBackgroundColor(getResources().getColor(R.color.oneZeroColor));
                                            oneOne.setBackgroundColor(getResources().getColor(R.color.oneOneColor));


//                                        Toast.makeText(MainActivity.this, "Good", Toast.LENGTH_SHORT).show();
                                            scoreCard = scoreCard + 1;
                                            score.setText("Score : " + scoreCard);

//                                            myScore[0] = ++scoreCard;
//                                            score.setText("Score : " + myScore[0]);

                                        }
                                    });


                                }
                            });

                        }

                    }
                }
            }, 0, 1000);


        }

        activeStatus = true;


    }


    public void showDialog(String scoreMessage) {


        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.score_dialoge);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCanceledOnTouchOutside(false);
        dialog.setCancelable(false);

        TextView scoreText = (TextView) dialog.findViewById(R.id.scoreFinal);

        scoreText.setText(scoreMessage);

        dialog.findViewById(R.id.retry).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                timer = new Timer();
                score.setText("Score : 0");
                startGame3(true);
                dialog.dismiss();
            }
        });
        dialog.findViewById(R.id.exit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });
        dialog.show();

    }

}
