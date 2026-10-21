package h0;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class a2 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final View f68642p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f68643q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f68644r0;

    public a2(@NotNull View view, @NotNull androidx.compose.material.z0 onGlobalLayoutCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onGlobalLayoutCallback, "onGlobalLayoutCallback");
        this.f68642p0 = view;
        this.f68643q0 = onGlobalLayoutCallback;
        view.addOnAttachStateChangeListener(this);
        if (this.f68644r0 || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f68644r0 = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f68643q0.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View p4) {
        Intrinsics.checkNotNullParameter(p4, "p0");
        if (this.f68644r0) {
            return;
        }
        View view = this.f68642p0;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f68644r0 = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View p4) {
        Intrinsics.checkNotNullParameter(p4, "p0");
        if (this.f68644r0) {
            this.f68642p0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f68644r0 = false;
        }
    }
}
