package androidx.compose.material.ripple;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import k0.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RippleHostView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0014J0\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0016JQ\u0010\"\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!J\u0006\u0010#\u001a\u00020\u0004J3\u0010&\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001cø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b$\u0010%J\u0006\u0010'\u001a\u00020\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006-"}, d2 = {"Landroidx/compose/material/ripple/RippleHostView;", "Landroid/view/View;", "", "pressed", "", "setRippleState", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "changed", "l", "t", "r", "b", "onLayout", "refreshDrawableState", "Landroid/graphics/drawable/Drawable;", "who", "invalidateDrawable", "Landroidx/compose/foundation/interaction/PressInteraction$Press;", "interaction", "bounded", "Landroidx/compose/ui/geometry/Size;", "size", "radius", "Landroidx/compose/ui/graphics/Color;", "color", "", "alpha", "Lkotlin/Function0;", "onInvalidateRipple", "addRipple-KOepWvA", "(Landroidx/compose/foundation/interaction/PressInteraction$Press;ZJIJFLkotlin/jvm/functions/Function0;)V", "addRipple", "removeRipple", "updateRippleProperties-biQXAtU", "(JIJF)V", "updateRippleProperties", "disposeRipple", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "material-ripple_release"}, k = 1, mv = {1, 8, 0})
public final class RippleHostView extends View {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final int[] f8979u0 = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    @NotNull
    public static final int[] v0 = new int[0];

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public UnprojectedRipple f8980p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public Boolean f8981q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Long f8982r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public e f8983s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f8984t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleHostView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setRippleState(boolean pressed) {
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.f8983s0;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l6 = this.f8982r0;
        long jLongValue = jCurrentAnimationTimeMillis - (l6 != null ? l6.longValue() : 0L);
        if (pressed || jLongValue >= 5) {
            int[] iArr = pressed ? f8979u0 : v0;
            UnprojectedRipple unprojectedRipple = this.f8980p0;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        } else {
            e eVar = new e(this, 0);
            this.f8983s0 = eVar;
            postDelayed(eVar, 50L);
        }
        this.f8982r0 = Long.valueOf(jCurrentAnimationTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRippleState$lambda$2(RippleHostView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UnprojectedRipple unprojectedRipple = this$0.f8980p0;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(v0);
        }
        this$0.f8983s0 = null;
    }

    /* JADX INFO: renamed from: addRipple-KOepWvA, reason: not valid java name */
    public final void m897addRippleKOepWvA(@NotNull PressInteraction.Press interaction, boolean bounded, long size, int radius, long color, float alpha, @NotNull Function0<Unit> onInvalidateRipple) {
        Intrinsics.checkNotNullParameter(interaction, "interaction");
        Intrinsics.checkNotNullParameter(onInvalidateRipple, "onInvalidateRipple");
        if (this.f8980p0 == null || !Intrinsics.areEqual(Boolean.valueOf(bounded), this.f8981q0)) {
            UnprojectedRipple unprojectedRipple = new UnprojectedRipple(bounded);
            setBackground(unprojectedRipple);
            this.f8980p0 = unprojectedRipple;
            this.f8981q0 = Boolean.valueOf(bounded);
        }
        UnprojectedRipple unprojectedRipple2 = this.f8980p0;
        Intrinsics.checkNotNull(unprojectedRipple2);
        this.f8984t0 = onInvalidateRipple;
        m898updateRipplePropertiesbiQXAtU(size, radius, color, alpha);
        if (bounded) {
            unprojectedRipple2.setHotspot(Offset.m2275getXimpl(interaction.getPressPosition()), Offset.m2276getYimpl(interaction.getPressPosition()));
        } else {
            unprojectedRipple2.setHotspot(unprojectedRipple2.getBounds().centerX(), unprojectedRipple2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void disposeRipple() {
        this.f8984t0 = null;
        e eVar = this.f8983s0;
        if (eVar != null) {
            removeCallbacks(eVar);
            e eVar2 = this.f8983s0;
            Intrinsics.checkNotNull(eVar2);
            eVar2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.f8980p0;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(v0);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.f8980p0;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@NotNull Drawable who) {
        Intrinsics.checkNotNullParameter(who, "who");
        Function0<Unit> function0 = this.f8984t0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    public final void removeRipple() {
        setRippleState(false);
    }

    /* JADX INFO: renamed from: updateRippleProperties-biQXAtU, reason: not valid java name */
    public final void m898updateRipplePropertiesbiQXAtU(long size, int radius, long color, float alpha) {
        UnprojectedRipple unprojectedRipple = this.f8980p0;
        if (unprojectedRipple == null) {
            return;
        }
        Integer num = unprojectedRipple.f8995r0;
        if (num == null || num.intValue() != radius) {
            unprojectedRipple.f8995r0 = Integer.valueOf(radius);
            UnprojectedRipple.a.f8997a.a(unprojectedRipple, radius);
        }
        if (Build.VERSION.SDK_INT < 28) {
            alpha *= 2;
        }
        long jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(color, c.coerceAtMost(alpha, 1.0f), 0.0f, 0.0f, 0.0f, 14, null);
        Color color2 = unprojectedRipple.f8994q0;
        if (color2 == null || !Color.m2509equalsimpl0(color2.m2518unboximpl(), jM2507copywmQWz5c$default)) {
            unprojectedRipple.f8994q0 = Color.m2498boximpl(jM2507copywmQWz5c$default);
            unprojectedRipple.setColor(ColorStateList.valueOf(ColorKt.m2561toArgb8_81llA(jM2507copywmQWz5c$default)));
        }
        Rect rect = new Rect(0, 0, mk.c.roundToInt(Size.m2344getWidthimpl(size)), mk.c.roundToInt(Size.m2341getHeightimpl(size)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }

    @Override // android.view.View
    public void refreshDrawableState() {
    }

    @Override // android.view.View
    public void onLayout(boolean changed, int l6, int t10, int r3, int b10) {
    }
}
