package com.yarolegovich.slidingrootnav;

/* JADX INFO: loaded from: classes7.dex */
public interface SlidingRootNav {
    void closeMenu();

    void closeMenu(boolean z10);

    SlidingRootNavLayout getLayout();

    boolean isMenuClosed();

    boolean isMenuLocked();

    boolean isMenuOpened();

    void openMenu();

    void openMenu(boolean z10);

    void setMenuLocked(boolean z10);
}
