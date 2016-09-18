package br.edu.ifpb.calculadora.Listeners;

import android.view.View;

import br.edu.ifpb.calculadora.MainActivity;

/**
 * Created by IFPB on 14/09/2016.
 */
public class OnClickClrscr implements View.OnClickListener {

    MainActivity activity;

    public OnClickClrscr(MainActivity activity){
        this.activity=activity;
    }



    @Override
    public void onClick(View view){
    activity.setDisplay(" ");
        activity.atualizarScreen();
    }
}
