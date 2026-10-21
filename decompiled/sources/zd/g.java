package zd;

import android.view.View;
import androidx.core.view.ViewCompat;

/* JADX INFO: compiled from: ViewOffsetHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f95052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f95053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f95054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f95055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f95056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f95057f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f95058g = true;

    public g(View view) {
        this.f95052a = view;
    }

    public final void a() {
        int i10 = this.f95055d;
        View view = this.f95052a;
        ViewCompat.offsetTopAndBottom(view, i10 - (view.getTop() - this.f95053b));
        ViewCompat.offsetLeftAndRight(view, this.f95056e - (view.getLeft() - this.f95054c));
    }

    public final boolean b(int i10) {
        if (!this.f95057f || this.f95055d == i10) {
            return false;
        }
        this.f95055d = i10;
        a();
        return true;
    }
}
