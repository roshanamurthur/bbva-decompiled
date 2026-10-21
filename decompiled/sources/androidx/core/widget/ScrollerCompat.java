package androidx.core.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ScrollerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OverScroller f20450a;

    @Deprecated
    public static ScrollerCompat create(Context context) {
        return create(context, null);
    }

    @Deprecated
    public void abortAnimation() {
        this.f20450a.abortAnimation();
    }

    @Deprecated
    public boolean computeScrollOffset() {
        return this.f20450a.computeScrollOffset();
    }

    @Deprecated
    public void fling(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.f20450a.fling(i10, i11, i12, i13, i14, i15, i16, i17);
    }

    @Deprecated
    public float getCurrVelocity() {
        return this.f20450a.getCurrVelocity();
    }

    @Deprecated
    public int getCurrX() {
        return this.f20450a.getCurrX();
    }

    @Deprecated
    public int getCurrY() {
        return this.f20450a.getCurrY();
    }

    @Deprecated
    public int getFinalX() {
        return this.f20450a.getFinalX();
    }

    @Deprecated
    public int getFinalY() {
        return this.f20450a.getFinalY();
    }

    @Deprecated
    public boolean isFinished() {
        return this.f20450a.isFinished();
    }

    @Deprecated
    public boolean isOverScrolled() {
        return this.f20450a.isOverScrolled();
    }

    @Deprecated
    public void notifyHorizontalEdgeReached(int i10, int i11, int i12) {
        this.f20450a.notifyHorizontalEdgeReached(i10, i11, i12);
    }

    @Deprecated
    public void notifyVerticalEdgeReached(int i10, int i11, int i12) {
        this.f20450a.notifyVerticalEdgeReached(i10, i11, i12);
    }

    @Deprecated
    public boolean springBack(int i10, int i11, int i12, int i13, int i14, int i15) {
        return this.f20450a.springBack(i10, i11, i12, i13, i14, i15);
    }

    @Deprecated
    public void startScroll(int i10, int i11, int i12, int i13) {
        this.f20450a.startScroll(i10, i11, i12, i13);
    }

    @Deprecated
    public static ScrollerCompat create(Context context, Interpolator interpolator) {
        ScrollerCompat scrollerCompat = new ScrollerCompat();
        scrollerCompat.f20450a = interpolator != null ? new OverScroller(context, interpolator) : new OverScroller(context);
        return scrollerCompat;
    }

    @Deprecated
    public void fling(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
        this.f20450a.fling(i10, i11, i12, i13, i14, i15, i16, i17, i18, i19);
    }

    @Deprecated
    public void startScroll(int i10, int i11, int i12, int i13, int i14) {
        this.f20450a.startScroll(i10, i11, i12, i13, i14);
    }
}
