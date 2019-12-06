package com.example.asadrao.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText edtfirst,edtsecond;
    Button btnadd,btnsub,btnmul,btndiv,btnclear;
    TextView tvresult;
    int first,second;
    int result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
            edtfirst = (EditText) findViewById(R.id.edtfirst);
            edtsecond = (EditText) findViewById(R.id.edtsecond);
            btnadd = (Button) findViewById(R.id.btnadd);
            btnsub = (Button) findViewById(R.id.btnsub);
            btnmul = (Button) findViewById(R.id.btnmul);
            btndiv = (Button) findViewById(R.id.btndiv);
            tvresult = (TextView) findViewById(R.id.tvresult);
            btnclear = (Button) findViewById(R.id.btnclear);
            btnadd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    first = Integer.valueOf(edtfirst.getText().toString());
                    second = Integer.valueOf(edtsecond.getText().toString());
                    result = first+second ;
                    tvresult.setText("Answer: "+result);
                }
            });
            btnsub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    first = Integer.valueOf(edtfirst.getText().toString());
                    second = Integer.valueOf(edtsecond.getText().toString());
                    result = first - second ;
                    tvresult.setText("Answer: "+result);
                }
            });
            btnmul.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    first = Integer.valueOf(edtfirst.getText().toString());
                    second = Integer.valueOf(edtsecond.getText().toString());
                    result = first * second ;
                    tvresult.setText("Answer: "+result);
                }
            });
            btndiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    first = Integer.valueOf(edtfirst.getText().toString());
                    second = Integer.valueOf(edtsecond.getText().toString());
                    result = first / second ;
                    tvresult.setText("Answer: "+result);
                }
            });
            btnclear.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    edtfirst.setText(null);
                    edtsecond.setText(null);
                    tvresult.setText(null);
                }
            });
        edtfirst.addTextChangedListener(tw);
        edtsecond.addTextChangedListener(tw);
    }
    private  TextWatcher tw = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            String first = edtfirst.getText().toString();
            String second = edtfirst.getText().toString();
            btnadd.setEnabled(!first.isEmpty() && !second.isEmpty());
            btnsub.setEnabled(!first.isEmpty() && !second.isEmpty());
            btnmul.setEnabled(!first.isEmpty() && !second.isEmpty());
            btndiv.setEnabled(!first.isEmpty() && !second.isEmpty());
            btnclear.setEnabled(!first.isEmpty() && !second.isEmpty());
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    };
}