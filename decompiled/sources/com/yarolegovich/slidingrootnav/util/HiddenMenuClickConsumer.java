package com.yarolegovich.slidingrootnav.util;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.yarolegovich.slidingrootnav.SlidingRootNavLayout;

/* JADX INFO: loaded from: classes7.dex */
public class HiddenMenuClickConsumer extends View {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SlidingRootNavLayout f68111p0;

    public HiddenMenuClickConsumer(Context context) {
        super(context);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f68111p0.isMenuClosed();
    }

    public void setMenuHost(SlidingRootNavLayout slidingRootNavLayout) {
        this.f68111p0 = slidingRootNavLayout;
    }
}
