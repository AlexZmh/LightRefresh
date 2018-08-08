package com.blcodes.views.refresh;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/**
 * @deprecated
 */

public class BounceHolderLayout extends FrameLayout {
    private BounceLayout bounceBody;
    public BounceHolderLayout(@NonNull Context context) {
        this(context,null);
    }

    public BounceHolderLayout(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    public BounceHolderLayout(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context,attrs,defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        bounceBody = new BounceLayout(context,attrs,defStyleAttr);
        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT
                ,ViewGroup.LayoutParams.MATCH_PARENT);
        addView(bounceBody,lp);
    }



    public void setBounceHandler(BounceHandler bounceHandler,View v) {
        bounceBody.setBounceHandler(bounceHandler,v);
    }
    public void setEventForwardingHelper(EventForwardingHelper forwardingHelper){
        bounceBody.setEventForwardingHelper(forwardingHelper);
    }
    public void setRefreshCallBack(BounceCallBack bounceCallBack) {
        bounceBody.setBounceCallBack(bounceCallBack);
    }
}
