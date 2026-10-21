package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.graphics.Color;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RippleHostView.android.kt */
/* JADX INFO: loaded from: classes.dex */
public final class UnprojectedRipple extends RippleDrawable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final boolean f8993p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public Color f8994q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Integer f8995r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f8996s0;

    /* JADX INFO: compiled from: RippleHostView.android.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/compose/material/ripple/UnprojectedRipple$Companion;", "", "()V", "setMaxRadiusFetched", "", "setMaxRadiusMethod", "Ljava/lang/reflect/Method;", "material-ripple_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: RippleHostView.android.kt */
    @RequiresApi(23)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f8997a = new a();

        @DoNotInline
        public final void a(@NotNull RippleDrawable ripple, int i10) {
            Intrinsics.checkNotNullParameter(ripple, "ripple");
            ripple.setRadius(i10);
        }
    }

    static {
        new Companion(null);
    }

    public UnprojectedRipple(boolean z10) {
        super(ColorStateList.valueOf(ViewCompat.MEASURED_STATE_MASK), null, z10 ? new ColorDrawable(-1) : null);
        this.f8993p0 = z10;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    @NotNull
    public final Rect getDirtyBounds() {
        if (!this.f8993p0) {
            this.f8996s0 = true;
        }
        Rect dirtyBounds = super.getDirtyBounds();
        Intrinsics.checkNotNullExpressionValue(dirtyBounds, "super.getDirtyBounds()");
        this.f8996s0 = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.f8996s0;
    }
}
