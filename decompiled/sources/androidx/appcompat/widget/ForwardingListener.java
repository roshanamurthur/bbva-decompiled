package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.ShowableListMenu;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class ForwardingListener implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f1298p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final int f1299q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final int f1300r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final View f1301s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public a f1302t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public b f1303u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f1304w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int[] f1305x0 = new int[2];

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ViewParent parent = ForwardingListener.this.f1301s0.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ForwardingListener forwardingListener = ForwardingListener.this;
            forwardingListener.a();
            View view = forwardingListener.f1301s0;
            if (view.isEnabled() && !view.isLongClickable() && forwardingListener.onForwardingStarted()) {
                view.getParent().requestDisallowInterceptTouchEvent(true);
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                forwardingListener.v0 = true;
            }
        }
    }

    public ForwardingListener(View view) {
        this.f1301s0 = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1298p0 = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1299q0 = tapTimeout;
        this.f1300r0 = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        b bVar = this.f1303u0;
        View view = this.f1301s0;
        if (bVar != null) {
            view.removeCallbacks(bVar);
        }
        a aVar = this.f1302t0;
        if (aVar != null) {
            view.removeCallbacks(aVar);
        }
    }

    public abstract ShowableListMenu getPopup();

    public boolean onForwardingStarted() {
        ShowableListMenu popup = getPopup();
        if (popup == null || popup.isShowing()) {
            return true;
        }
        popup.show();
        return true;
    }

    public boolean onForwardingStopped() {
        ShowableListMenu popup = getPopup();
        if (popup == null || !popup.isShowing()) {
            return true;
        }
        popup.dismiss();
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0064  */
    /* JADX WARN: Code duplicated, block: B:25:0x0067  */
    /* JADX WARN: Code duplicated, block: B:50:0x00cd  */
    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        r0 r0Var;
        boolean z11 = this.v0;
        View view2 = this.f1301s0;
        if (z11) {
            ShowableListMenu popup = getPopup();
            if (popup != null && popup.isShowing() && (r0Var = (r0) popup.getListView()) != null && r0Var.isShown()) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                int[] iArr = this.f1305x0;
                view2.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(iArr[0], iArr[1]);
                r0Var.getLocationOnScreen(iArr);
                motionEventObtainNoHistory.offsetLocation(-iArr[0], -iArr[1]);
                boolean zOnForwardedEvent = r0Var.onForwardedEvent(motionEventObtainNoHistory, this.f1304w0);
                motionEventObtainNoHistory.recycle();
                int actionMasked = motionEvent.getActionMasked();
                boolean z12 = (actionMasked == 1 || actionMasked == 3) ? false : true;
                if (zOnForwardedEvent && z12) {
                    z10 = true;
                } else if (onForwardingStopped()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else if (onForwardingStopped()) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            if (view2.isEnabled()) {
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0) {
                    this.f1304w0 = motionEvent.getPointerId(0);
                    if (this.f1302t0 == null) {
                        this.f1302t0 = new a();
                    }
                    view2.postDelayed(this.f1302t0, this.f1299q0);
                    if (this.f1303u0 == null) {
                        this.f1303u0 = new b();
                    }
                    view2.postDelayed(this.f1303u0, this.f1300r0);
                } else if (actionMasked2 == 1) {
                    a();
                } else if (actionMasked2 == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1304w0);
                    if (iFindPointerIndex >= 0) {
                        float x4 = motionEvent.getX(iFindPointerIndex);
                        float y7 = motionEvent.getY(iFindPointerIndex);
                        float f6 = this.f1298p0;
                        float f10 = -f6;
                        if (x4 < f10 || y7 < f10 || x4 >= (view2.getRight() - view2.getLeft()) + f6 || y7 >= (view2.getBottom() - view2.getTop()) + f6) {
                            a();
                            view2.getParent().requestDisallowInterceptTouchEvent(true);
                            if (onForwardingStarted()) {
                                z10 = true;
                            }
                        }
                    }
                } else if (actionMasked2 == 3) {
                    a();
                }
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                view2.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.v0 = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.v0 = false;
        this.f1304w0 = -1;
        a aVar = this.f1302t0;
        if (aVar != null) {
            this.f1301s0.removeCallbacks(aVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
