package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import h3.r;

/* JADX INFO: compiled from: GhostViewPort.java */
/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
public final class b extends ViewGroup implements h3.d {
    public static final /* synthetic */ int v0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ViewGroup f23734p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f23735q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final View f23736r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f23737s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public Matrix f23738t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final a f23739u0;

    /* JADX INFO: compiled from: GhostViewPort.java */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public final boolean onPreDraw() {
            View view;
            b bVar = b.this;
            bVar.postInvalidateOnAnimation();
            ViewGroup viewGroup = bVar.f23734p0;
            if (viewGroup == null || (view = bVar.f23735q0) == null) {
                return true;
            }
            viewGroup.endViewTransition(view);
            bVar.f23734p0.postInvalidateOnAnimation();
            bVar.f23734p0 = null;
            bVar.f23735q0 = null;
            return true;
        }
    }

    public b(View view) {
        super(view.getContext());
        this.f23739u0 = new a();
        this.f23736r0 = view;
        setWillNotDraw(false);
        setClipChildren(false);
        setLayerType(2, null);
    }

    @Override // h3.d
    public final void a(ViewGroup viewGroup, View view) {
        this.f23734p0 = viewGroup;
        this.f23735q0 = view;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = R.id.ghost_view;
        View view = this.f23736r0;
        view.setTag(i10, this);
        view.getViewTreeObserver().addOnPreDrawListener(this.f23739u0);
        r.c(view, 4);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        View view = this.f23736r0;
        view.getViewTreeObserver().removeOnPreDrawListener(this.f23739u0);
        r.c(view, 0);
        view.setTag(R.id.ghost_view, null);
        if (view.getParent() != null) {
            ((View) view.getParent()).invalidate();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        h3.a.a(canvas, true);
        canvas.setMatrix(this.f23738t0);
        View view = this.f23736r0;
        r.c(view, 0);
        view.invalidate();
        r.c(view, 4);
        drawChild(canvas, view, getDrawingTime());
        h3.a.a(canvas, false);
    }

    @Override // android.view.View, h3.d
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        int i11 = R.id.ghost_view;
        View view = this.f23736r0;
        if (((b) view.getTag(i11)) == this) {
            r.c(view, i10 == 0 ? 4 : 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
    }
}
