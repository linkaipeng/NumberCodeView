package com.lkp.numbercodeview.normal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.lkp.numbercodeview.BaseNumberCodeView;
import com.lkp.numbercodeview.R;

/**
 * Created by linkaipeng on 2015/10/26.
 */
public class NumberCodeView extends BaseNumberCodeView {

    private TextView mResultTextView;

    public NumberCodeView(Context context) {
        super(context, null);
    }

    public NumberCodeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected View createView() {
        return LayoutInflater.from(mContext).inflate(R.layout.view_input_group_code, null);
    }

    @Override
    protected void onResult(String code) {
        if (mCallback != null) {
            mCallback.onResult(code);
        }
    }
}
