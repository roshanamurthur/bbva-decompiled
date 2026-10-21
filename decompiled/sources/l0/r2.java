package l0;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final View f82840p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Function0<Unit> f82841q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f82842r0;

    public r2(@NotNull View view, @NotNull androidx.compose.material3.g1 onGlobalLayoutCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onGlobalLayoutCallback, "onGlobalLayoutCallback");
        this.f82840p0 = view;
        this.f82841q0 = onGlobalLayoutCallback;
        view.addOnAttachStateChangeListener(this);
        if (this.f82842r0 || !view.isAttachedToWindow()) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f82842r0 = true;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f82841q0.invoke();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@NotNull View p4) {
        Intrinsics.checkNotNullParameter(p4, "p0");
        if (this.f82842r0) {
            return;
        }
        View view = this.f82840p0;
        if (view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f82842r0 = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@NotNull View p4) {
        Intrinsics.checkNotNullParameter(p4, "p0");
        if (this.f82842r0) {
            this.f82840p0.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f82842r0 = false;
        }
    }
}
