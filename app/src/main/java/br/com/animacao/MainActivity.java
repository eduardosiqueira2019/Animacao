package br.com.animacao;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private ImageView mostrador;
    public Integer contador = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button botaoPlay = findViewById(R.id.buttonSimular);
        final Button quadroAquadro = findViewById(R.id.buttonNovoQuadro);


        mostrador = findViewById(R.id.imageViewTeste);


        botaoPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrador.setBackgroundResource(R.drawable.sequenciaanimacao);
                final AnimationDrawable animationDrawable = (AnimationDrawable) mostrador.getBackground();
                mostrador.setBackground(animationDrawable);


                if (animationDrawable.isRunning()) {
                    botaoPlay.setText("Continua");
                    animationDrawable.stop();
                } else {
                    botaoPlay.setText("Para");
                    animationDrawable.start();

                }

            }
        });

        quadroAquadro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                for (int i =0; i<100;i ++) {
                    contador++;

                    if (contador > 0 && contador < 4) {
                        mostrador.setImageResource(R.drawable.valor_000);
                        //SystemClock.sleep(1050);
                    }
                    if (contador > 3 && contador < 8) {
                        mostrador.setImageResource(R.drawable.valor_070);
                        //SystemClock.sleep(1050);
                    }

                    if (contador > 7 && contador < 20) {
                        mostrador.setImageResource(R.drawable.valor_020);
                        contador = 1;
                        //SystemClock.sleep(1050);
                    }

                    SystemClock.sleep(50);

                }

            }
        });

    }
}
