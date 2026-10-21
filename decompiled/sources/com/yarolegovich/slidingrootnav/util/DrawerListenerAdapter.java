package com.yarolegovich.slidingrootnav.util;

import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.yarolegovich.slidingrootnav.callback.DragListener;
import com.yarolegovich.slidingrootnav.callback.DragStateListener;

/* JADX INFO: loaded from: classes7.dex */
public class DrawerListenerAdapter implements DragListener, DragStateListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DrawerLayout.DrawerListener f68109p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final View f68110q0;

    public DrawerListenerAdapter(DrawerLayout.DrawerListener drawerListener, View view) {
        this.f68109p0 = drawerListener;
        this.f68110q0 = view;
    }

    @Override // com.yarolegovich.slidingrootnav.callback.DragListener
    public void onDrag(float f6) {
        this.f68109p0.onDrawerSlide(this.f68110q0, f6);
    }

    @Override // com.yarolegovich.slidingrootnav.callback.DragStateListener
    public void onDragEnd(boolean z10) {
        View view = this.f68110q0;
        DrawerLayout.DrawerListener drawerListener = this.f68109p0;
        if (z10) {
            drawerListener.onDrawerOpened(view);
        } else {
            drawerListener.onDrawerClosed(view);
        }
        drawerListener.onDrawerStateChanged(0);
    }

    @Override // com.yarolegovich.slidingrootnav.callback.DragStateListener
    public void onDragStart() {
        this.f68109p0.onDrawerStateChanged(1);
    }
}
