package ae;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;

/* JADX INFO: compiled from: BadgeDrawable.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ View f222p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f223q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ BadgeDrawable f224r0;

    public a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        this.f224r0 = badgeDrawable;
        this.f222p0 = view;
        this.f223q0 = frameLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f224r0.updateBadgeCoordinates(this.f222p0, this.f223q0);
    }
}
