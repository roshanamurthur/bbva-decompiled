package androidx.appcompat.app;

import android.view.View;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: compiled from: ActionBarDrawerToggle.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ActionBarDrawerToggle f685p0;

    public a(ActionBarDrawerToggle actionBarDrawerToggle) {
        this.f685p0 = actionBarDrawerToggle;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ActionBarDrawerToggle actionBarDrawerToggle = this.f685p0;
        if (!actionBarDrawerToggle.f513f) {
            View.OnClickListener onClickListener = actionBarDrawerToggle.f517j;
            if (onClickListener != null) {
                onClickListener.onClick(view);
                return;
            }
            return;
        }
        DrawerLayout drawerLayout = actionBarDrawerToggle.f509b;
        int drawerLockMode = drawerLayout.getDrawerLockMode(GravityCompat.START);
        if (drawerLayout.isDrawerVisible(GravityCompat.START) && drawerLockMode != 2) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else if (drawerLockMode != 1) {
            drawerLayout.openDrawer(GravityCompat.START);
        }
    }
}
