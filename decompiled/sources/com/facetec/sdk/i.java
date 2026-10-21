package com.facetec.sdk;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes9.dex */
final class i extends LinearLayout {
    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setEnabled(false);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        if (!isEnabled()) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            setAlpha(0.4f);
            postInvalidate();
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3 || motionEvent.getX() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() > getHeight()) {
            setAlpha(1.0f);
            postInvalidate();
        }
        return true;
    }

    public final void setOnClickRunnable(final Runnable runnable) {
        setEnabled(true);
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.facetec.sdk.w7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f42948p0.a(runnable, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Runnable runnable, View view) {
        if (isEnabled()) {
            setEnabled(false);
            if (runnable != null) {
                runnable.run();
            }
        }
    }
}
