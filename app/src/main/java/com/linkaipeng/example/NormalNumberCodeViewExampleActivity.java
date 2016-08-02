package com.linkaipeng.example;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

import com.linkaipeng.numbercodeview.R;
import com.lkp.numbercodeview.NumberCodeView;

/**
 * Created by linkaipeng on 16/8/2.
 */
public class NormalNumberCodeViewExampleActivity extends AppCompatActivity {

    public static void start(Context context) {
        Intent starter = new Intent(context, NormalNumberCodeViewExampleActivity.class);
        context.startActivity(starter);
    }

    private NumberCodeView mNumberCodeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_example);
        initView();
    }

    private void initView(){
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("NormalNumberCodeView");
        actionBar.setDisplayHomeAsUpEnabled(true);
        mNumberCodeView = (NumberCodeView) findViewById(R.id.numberCodeView);
        mNumberCodeView.setNumberCodeCallback(new NumberCodeView.OnInputNumberCodeCallback() {
            @Override
            public void onResult(String code) {
                Toast.makeText(NormalNumberCodeViewExampleActivity.this, code, Toast.LENGTH_LONG).show();
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
