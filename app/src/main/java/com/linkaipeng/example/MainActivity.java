package com.linkaipeng.example;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.linkaipeng.numbercodeview.R;
import com.lkp.numbercodeview.bottomsheet.BottomSheetNumberCodeViewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mShowBottomButton;
    private Button mShowNormalButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar();
        mShowBottomButton = (Button) findViewById(R.id.show_bottom_button);
        mShowNormalButton = (Button) findViewById(R.id.normal_button);
        mShowBottomButton.setOnClickListener(this);
        mShowNormalButton.setOnClickListener(this);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (resultCode == RESULT_OK && requestCode ==
                BottomSheetNumberCodeViewActivity.REQUEST_CODE_SHOW_BOTTOM_NUMBER_VIEW) {
            String code = data.getStringExtra(BottomSheetNumberCodeViewActivity.KEY_DATA_NUMBER);
            Toast.makeText(this, code, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        switch (viewId) {
            case R.id.show_bottom_button:
                BottomSheetNumberCodeViewActivity.show(this);
                break;

            case R.id.normal_button:
                NormalNumberCodeViewExampleActivity.start(this);
                break;
            default:
                break;
        }
    }
}
