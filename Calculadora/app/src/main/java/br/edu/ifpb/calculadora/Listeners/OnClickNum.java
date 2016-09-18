package br.edu.ifpb.calculadora.Listeners;

import android.view.View;
import android.widget.Button;

import br.edu.ifpb.calculadora.MainActivity;


/**
 * Created by IFPB on 14/09/2016.
 */
public class OnClickNum implements View.OnClickListener {

    private MainActivity activity;


    public OnClickNum (MainActivity activity){
        this.activity = activity;
    }


    @Override
    public void onClick (View view){
        Button but=(Button) view;
        activity.setDisplay(activity.getDisplay()+but.getText());
        activity.atualizarScreen();
    }
}
