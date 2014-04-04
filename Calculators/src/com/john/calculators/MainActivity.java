package com.john.calculators;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	//为空间建立对象.
	private TextView result;
	private Button bt1;
	private Button bt2;
	private Button bt3;
	private Button bt4;
	private Button bt5;
	private Button bt6;
	private Button bt7;
	private Button bt8;
	private Button bt9;
	private Button bt0;
	private Button btAdd;
	private Button btSub;
	private Button btMul;
	private Button btDiv;
	private Button btEsc;
	private Button btEqu;

    /* (non-Javadoc)
     * @see android.app.Activity#onCreate(android.os.Bundle)
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //建立按键对象和Button空间之间的关系.
        result=(TextView)findViewById(R.id.result);
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        bt5=(Button)findViewById(R.id.button5);
        bt6=(Button)findViewById(R.id.button6);
        bt7=(Button)findViewById(R.id.button7);
        bt8=(Button)findViewById(R.id.button8);
        bt9=(Button)findViewById(R.id.button9);
        bt0=(Button)findViewById(R.id.button0);
        btAdd=(Button)findViewById(R.id.buttonAddition);               //加法Button
        btSub=(Button)findViewById(R.id.buttonSubtraction);          //减法Button
        btMul=(Button)findViewById(R.id.buttonMultiplication);      //乘法Button
        btDiv=(Button)findViewById(R.id.buttonDivision);                //除法Button
        btEsc=(Button)findViewById(R.id.buttonEsc);
        btEqu=(Button)findViewById(R.id.buttonEqual);
        
        bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
			}
		});
        

        
    }
    
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
