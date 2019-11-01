package br.com.animacao;

import android.os.SystemClock;
import android.widget.ImageView;

import androidx.annotation.DrawableRes;

public class Paralelo implements Runnable {

    private ImageView imageView;
    private DrawableRes drawableRes;

    Paralelo() {
    }

    public Paralelo(ImageView imageView, DrawableRes drawableRes) {
        this.imageView = imageView;
        this.drawableRes = drawableRes;
    }

    private ImageView getImageView() {
        return imageView;
    }

    void setImageView(ImageView imageView) {
        this.imageView = imageView;
    }

    public DrawableRes getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(DrawableRes drawableRes) {
        this.drawableRes = drawableRes;
    }


    @Override
    public void run() {

        int contador=0;
        ImageView mostrador;
        mostrador = this.getImageView();

        for (int i = 0; i < 100; i++) {
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

}
