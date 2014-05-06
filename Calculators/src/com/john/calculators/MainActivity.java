package com.john.calculators;

import java.util.Calendar;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
		
	//为空间建立对象.
	private TextView result;
	private float a;
	private float b;
	private int option;
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
	private Button btDec;

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
        btAdd=(Button)findViewById(R.id.buttonAddition);            //加法Button
        btSub=(Button)findViewById(R.id.buttonSubtraction);         //减法Button
        btMul=(Button)findViewById(R.id.buttonMultiplication);      //乘法Button
        btDiv=(Button)findViewById(R.id.buttonDivision);            //除法Button
        btEsc=(Button)findViewById(R.id.buttonEsc);                 //清除
        btEqu=(Button)findViewById(R.id.buttonEqual);               //等号
        btDec=(Button)findViewById(R.id.buttonDecpoint);            //小数点
        result.setText(null);
        
        ButtonListener bListener=new ButtonListener();
        bt1.setOnClickListener(bListener);
        bt2.setOnClickListener(bListener);
        bt3.setOnClickListener(bListener);
        bt4.setOnClickListener(bListener);
        bt5.setOnClickListener(bListener);
        bt6.setOnClickListener(bListener);
        bt7.setOnClickListener(bListener);
        bt8.setOnClickListener(bListener);
        bt9.setOnClickListener(bListener);
        bt0.setOnClickListener(bListener);
        btAdd.setOnClickListener(bListener);
        btSub.setOnClickListener(bListener);
        btMul.setOnClickListener(bListener);
        btDiv.setOnClickListener(bListener);
        btEsc.setOnClickListener(bListener);
        btEqu.setOnClickListener(bListener);
        btDec.setOnClickListener(bListener);
    }
    
    class ButtonListener implements OnClickListener{

		@Override
		/*getText().toString()的意思是从result中获取文本并转换为字符串类型;
		 * setText()的意思是从()括号中获取内容显示在result这个文本框中.
		 */
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()){
			case R.id.button0:
				result.setText(result.getText().toString()+"0");
				break;
			case R.id.button1:
				result.setText(result.getText().toString()+"1");
				break;
			case R.id.button2:
			    result.setText(result.getText().toString()+"2");
			    break;
			case R.id.button3:
				result.setText(result.getText().toString()+"3");
				break;
			case R.id.button4:
			    result.setText(result.getText().toString()+"4");
			    break;
			case R.id.button5:
				result.setText(result.getText().toString()+"5");
				break;
			case R.id.button6:
			    result.setText(result.getText().toString()+"6");
			    break;
			case R.id.button7:
				result.setText(result.getText().toString()+"7");
				break;
			case R.id.button8:
			    result.setText(result.getText().toString()+"8");
			    break;
			case R.id.button9:
			    result.setText(result.getText().toString()+"9");
			    break;
			case R.id.buttonEsc:
				result.setText(null);
				break;
			}
			
			String s=result.getText().toString();
			Button btn=(Button)v;
			
			if (btn.getId()==R.id.buttonDecpoint){
					if (s.indexOf(".")==-1)
						if (s.trim().startsWith("0")){
							result.setText("0.");
							return;
						}
						else{
							result.setText(s+".");
							return;
						}
			}
			if (btn.getId()==R.id.buttonAddition){
				a=Float.parseFloat(s);
				option=1;
				result.setText("");
				return;
			}
			if (btn.getId()==R.id.buttonSubtraction){
				a=Float.parseFloat(s);
				option=2;
				result.setText("");
				return;
			}
			if (btn.getId()==R.id.buttonMultiplication){
				a=Float.parseFloat(s);
				option=3;
				result.setText("");
				return;
			}
			if (btn.getId()==R.id.buttonDivision){
				a=Float.parseFloat(s);
				option=4;
				result.setText("");
				return;
			}
			
			if (btn.getId()==R.id.buttonEqual){
				b=Float.parseFloat(s);  //?
				switch(option){
				case 1:
					result.setText(String.valueOf(a+b)); //?
					break;
				case 2:
					result.setText(String.valueOf(a-b));
					break;
				case 3:
					result.setText(String.valueOf(a*b));
					break;
				case 4:
					if (b!=0){
						result.setText(String.valueOf(a/b));
						return;
					}
					else{
						Toast.makeText(MainActivity.this, "哇靠!除数不能为0!白痴没学过数学啊!", Toast.LENGTH_SHORT).show();
						result.setText(null);
						return;
						}
				}
			}
			
		}
    	
    }
 
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

