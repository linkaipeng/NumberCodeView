package com.lkp.numbercodeview.bottomsheet;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.lkp.numbercodeview.BaseNumberCodeView;
import com.lkp.numbercodeview.R;


/**
 * Created by linkaipeng on 16/8/2.
 */
public class BottomSheetNumberCodeViewActivity extends AppCompatActivity
    implements BaseNumberCodeView.OnInputNumberCodeCallback,
        BottomSheetNumberCodeView.OnHideBottomLayoutListener {

    public static final int REQUEST_CODE_SHOW_BOTTOM_NUMBER_VIEW = 1001;
    public static final String KEY_DATA_NUMBER = "KeyDataNumber";

    public static void show(Activity activity){
        Intent intent = new Intent(activity, BottomSheetNumberCodeViewActivity.class);
        activity.startActivityForResult(intent, REQUEST_CODE_SHOW_BOTTOM_NUMBER_VIEW);
    }

    private BottomSheetNumberCodeView mNumberCodeView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet_number_code_view);
        initView();
    }

    private void initView(){
        mNumberCodeView = (BottomSheetNumberCodeView) findViewById(R.id.bottom_sheet_number_code_view);
        mNumberCodeView.setNumberCodeCallback(this);
        mNumberCodeView.setOnHideBottomLayoutListener(this);
        mNumberCodeView.showNumberCodeLayout();
    }

    @Override
    public void onResult(String code) {
        Intent resultIntent = new Intent();
        resultIntent.putExtra(KEY_DATA_NUMBER, code);
        setResult(RESULT_OK, resultIntent);
    }

    @Override
    public void onHide() {
        finish();
    }

    @Override
    public void onBackPressed() {
        if (mNumberCodeView.isNumberCodeLayoutShowing()) {
            mNumberCodeView.hideNumberCodeLayout();
        } else {
            super.onBackPressed();
        }
    }
}
