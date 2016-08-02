package com.lkp.numbercodeview;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

/**
 * Created by linkaipeng on 16/8/2.
 */
public class BottomSheetNumberCodeView extends BaseNumberCodeView implements View.OnClickListener {

    private LinearLayout mBottomNumberCodeLayout;
    private ImageView mCloseImageView;
    private OnHideBottomLayoutListener mOnHideBottomLayoutListener;
    private float mDisplayHeight;

    public BottomSheetNumberCodeView(Context context) {
        super(context, null);
    }

    public BottomSheetNumberCodeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mDisplayHeight = context.getResources().getDisplayMetrics().heightPixels;
    }

    @Override
    protected View createView() {
        View view = LayoutInflater.from(mContext).inflate(R.layout.view_bottom_sheet_input_code, null);
        mBottomNumberCodeLayout = (LinearLayout) view.findViewById(R.id.bottom_number_code_layout);
        mCloseImageView = (ImageView) view.findViewById(R.id.close_bottom_number_code_view);
        mCloseImageView.setOnClickListener(this);
        return view;
    }

    @Override
    protected void onResult(String code) {
        if (mCallback != null) {
            mCallback.onResult(code);
        }
        hideNumberCodeLayout();
    }

    public boolean isNumberCodeLayoutShowing(){
        if (mBottomNumberCodeLayout != null) {
            return mBottomNumberCodeLayout.getVisibility() == View.VISIBLE;
        } else {
            return false;
        }
    }

    public void showNumberCodeLayout(){
        if (mBottomNumberCodeLayout == null) {
            return;
        }
        mBottomNumberCodeLayout.setVisibility(VISIBLE);
        float yTranslation = mBottomNumberCodeLayout.getTranslationY();
        ObjectAnimator yTranslationAnimator = ObjectAnimator.ofFloat(mBottomNumberCodeLayout, "translationY", mDisplayHeight, yTranslation);
        yTranslationAnimator.setDuration(500);
        yTranslationAnimator.start();
    }

    public void hideNumberCodeLayout(){
        if (mBottomNumberCodeLayout == null) {
            return;
        }
        float yTranslation = mBottomNumberCodeLayout.getTranslationY();
        ObjectAnimator yTranslationAnimator = ObjectAnimator.ofFloat(mBottomNumberCodeLayout, "translationY", yTranslation, mDisplayHeight);
        yTranslationAnimator.setDuration(400);
        yTranslationAnimator.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                mBottomNumberCodeLayout.setVisibility(GONE);
                if (mOnHideBottomLayoutListener != null) {
                    mOnHideBottomLayoutListener.onHide();
                }
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
        yTranslationAnimator.start();
    }

    public void setOnHideBottomLayoutListener(OnHideBottomLayoutListener onHideLayoutListener){
        mOnHideBottomLayoutListener = onHideLayoutListener;
    }

    @Override
    public void onClick(View v) {
        int viewId = v.getId();
        if (viewId == R.id.close_bottom_number_code_view) {
            hideNumberCodeLayout();
        }
    }

    public interface OnHideBottomLayoutListener {
        void onHide();
    }
}
