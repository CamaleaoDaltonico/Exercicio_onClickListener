package br.edu.ifpb.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import br.edu.ifpb.calculadora.Listeners.OnClickClrscr;
import br.edu.ifpb.calculadora.Listeners.OnClickNum;
import br.edu.ifpb.calculadora.Listeners.OnClickOp;
import br.edu.ifpb.calculadora.Listeners.OnClickResult;

public class MainActivity extends Activity {
    private TextView screen;
    private String display=" ";
    private String op="";

    public void setDisplay(String display){
        this.display=display;
    }

    public String getDisplay(){
        return this.display;
    }

    public void setOp(String op){
        this.op=op;
    }

    public String getOp(){
        return this.op;
    }
    public void atualizarScreen(){
        screen.setText(display);
    }


    public String operacao(){
        String[] num= display.split(Pattern.quote(op));
        if(num.length == 1){
            return num[0];
        }else{
            switch (op){
                case "+":
                    return String.valueOf(Double.parseDouble(num[0]) + Double.parseDouble(num[1]));
                case "-":
                    return String.valueOf(Double.parseDouble(num[0]) - Double.parseDouble(num[1]));
                case "*":
                    return String.valueOf(Double.parseDouble(num[0]) * Double.parseDouble(num[1]));
                case "/":
                    return String.valueOf(Double.parseDouble(num[0]) / Double.parseDouble(num[1]));
                default:
                    return "0";
            }
        }
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (TextView) findViewById(R.id.textView);
        screen.setText(display);

        Button but0=(Button) findViewById(R.id.button0);
        Button but1=(Button) findViewById(R.id.button1);
        Button but2=(Button) findViewById(R.id.button2);
        Button but3=(Button) findViewById(R.id.button3);
        Button but4=(Button) findViewById(R.id.button4);
        Button but5=(Button) findViewById(R.id.button5);
        Button but6=(Button) findViewById(R.id.button6);
        Button but7=(Button) findViewById(R.id.button7);
        Button but8=(Button) findViewById(R.id.button8);
        Button but9=(Button) findViewById(R.id.button9);

        Button som=(Button) findViewById(R.id.soma);
        Button sub=(Button) findViewById(R.id.sub);
        Button div=(Button) findViewById(R.id.div);
        Button mult=(Button) findViewById(R.id.multi);

        Button clrscr=(Button) findViewById(R.id.buttonC);

        Button resultado=(Button) findViewById(R.id.resultado);

        but0.setOnClickListener(new OnClickNum(this));
        but1.setOnClickListener(new OnClickNum(this));
        but2.setOnClickListener(new OnClickNum(this));
        but3.setOnClickListener(new OnClickNum(this));
        but4.setOnClickListener(new OnClickNum(this));
        but5.setOnClickListener(new OnClickNum(this));
        but6.setOnClickListener(new OnClickNum(this));
        but7.setOnClickListener(new OnClickNum(this));
        but8.setOnClickListener(new OnClickNum(this));
        but9.setOnClickListener(new OnClickNum(this));

        som.setOnClickListener(new OnClickOp(this));
        sub.setOnClickListener(new OnClickOp(this));
        div.setOnClickListener(new OnClickOp(this));
        mult.setOnClickListener(new OnClickOp(this));

        clrscr.setOnClickListener(new OnClickClrscr(this));

        resultado.setOnClickListener(new OnClickResult(this));


    }



}
