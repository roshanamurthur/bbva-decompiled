package com.yarolegovich.slidingrootnav.util;

import android.content.Context;
import androidx.drawerlayout.widget.DrawerLayout;
import com.yarolegovich.slidingrootnav.SlidingRootNavLayout;

/* JADX INFO: loaded from: classes7.dex */
public class ActionBarToggleAdapter extends DrawerLayout {

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public SlidingRootNavLayout f68108k1;

    public ActionBarToggleAdapter(Context context) {
        super(context);
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public void closeDrawer(int i10) {
        this.f68108k1.closeMenu();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public int getDrawerLockMode(int i10) {
        if (this.f68108k1.isMenuLocked() && this.f68108k1.isMenuClosed()) {
            return 1;
        }
        return (!this.f68108k1.isMenuLocked() || this.f68108k1.isMenuClosed()) ? 0 : 2;
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public boolean isDrawerVisible(int i10) {
        return !this.f68108k1.isMenuClosed();
    }

    @Override // androidx.drawerlayout.widget.DrawerLayout
    public void openDrawer(int i10) {
        this.f68108k1.openMenu();
    }

    public void setAdaptee(SlidingRootNavLayout slidingRootNavLayout) {
        this.f68108k1 = slidingRootNavLayout;
    }
}
