package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.c0;
import androidx.camera.core.n1;
import androidx.compose.ui.platform.j;
import k0.e;

/* JADX INFO: loaded from: classes2.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public long f20433p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f20434q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f20435r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f20436s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final e f20437t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final j f20438u0;

    public ContentLoadingProgressBar(@NonNull Context context) {
        this(context, null);
    }

    public void hide() {
        post(new c0(this, 3));
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f20437t0);
        removeCallbacks(this.f20438u0);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f20437t0);
        removeCallbacks(this.f20438u0);
    }

    public void show() {
        post(new n1(this, 2));
    }

    public ContentLoadingProgressBar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f20433p0 = -1L;
        this.f20434q0 = false;
        this.f20435r0 = false;
        this.f20436s0 = false;
        this.f20437t0 = new e(this, 1);
        this.f20438u0 = new j(this, 2);
    }
}
