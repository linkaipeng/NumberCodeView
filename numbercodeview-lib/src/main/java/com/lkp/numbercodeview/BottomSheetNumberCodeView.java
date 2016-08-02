package com.lkp.numbercodeview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by linkaipeng on 16/8/2.
 */
public class BottomSheetNumberCodeView extends BaseNumberCodeView {

    public BottomSheetNumberCodeView(Context context) {
        super(context, null);
    }

    public BottomSheetNumberCodeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected View createView() {
        return LayoutInflater.from(mContext).inflate(R.layout.view_bottom_sheet_input_code, null);
    }

    @Override
    protected void onResult(String code) {

    }
}
