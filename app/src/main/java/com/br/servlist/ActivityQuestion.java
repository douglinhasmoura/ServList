 package com.br.servlist;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ActivityQuestion extends AppCompatActivity {

    private CardView profissional;
    private CardView empreendedor;
    private CardView novaConta;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_question);

        profissional = (CardView)findViewById(R.id.cv_profissional);
        empreendedor = (CardView) findViewById(R.id.cv_empreendedor);
        novaConta = (CardView)findViewById(R.id.cv_new_conta);


        empreendedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View v) {

                setContentView(R.layout.act_empreendedor);
            }
        });


    }

}
