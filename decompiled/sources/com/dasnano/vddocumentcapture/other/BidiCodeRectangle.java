package com.dasnano.vddocumentcapture.other;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import com.dasnano.vddocumentcapture.other.BidiCodeRectangle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BidiCodeRectangle.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\u000f"}, d2 = {"Lcom/dasnano/vddocumentcapture/other/BidiCodeRectangle;", "Landroid/view/View;", "", "onAttachedToWindow", "Landroid/graphics/Canvas;", "canvas", "onDraw", "Landroid/graphics/Rect;", "rect", "setRect", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "document-capture_release"}, k = 1, mv = {1, 9, 0})
public final class BidiCodeRectangle extends View {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static ValueAnimator f39469s0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public Rect f39470p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Paint f39471q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Rect f39472r0;

    /* JADX INFO: compiled from: BidiCodeRectangle.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/dasnano/vddocumentcapture/other/BidiCodeRectangle$Companion;", "", "()V", "animator", "Landroid/animation/ValueAnimator;", "document-capture_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidiCodeRectangle(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39471q0 = new Paint();
        this.f39472r0 = new Rect(0, 0, getRight(), getBottom());
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(100, 200);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfInt, "ofInt(...)");
        f39469s0 = valueAnimatorOfInt;
        ValueAnimator valueAnimator = null;
        if (valueAnimatorOfInt == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animator");
            valueAnimatorOfInt = null;
        }
        valueAnimatorOfInt.setDuration(1000L);
        ValueAnimator valueAnimator2 = f39469s0;
        if (valueAnimator2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animator");
            valueAnimator2 = null;
        }
        valueAnimator2.setRepeatCount(-1);
        ValueAnimator valueAnimator3 = f39469s0;
        if (valueAnimator3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animator");
            valueAnimator3 = null;
        }
        valueAnimator3.setRepeatMode(2);
        ValueAnimator valueAnimator4 = f39469s0;
        if (valueAnimator4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animator");
            valueAnimator4 = null;
        }
        valueAnimator4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: md.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator it) {
                BidiCodeRectangle.Companion companion = BidiCodeRectangle.INSTANCE;
                BidiCodeRectangle this$0 = this.f83392a;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(it, "it");
                Object animatedValue = it.getAnimatedValue();
                Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                this$0.f39471q0.setColor(Color.argb(((Integer) animatedValue).intValue(), 255, 255, 102));
                this$0.invalidate();
            }
        });
        ValueAnimator valueAnimator5 = f39469s0;
        if (valueAnimator5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("animator");
        } else {
            valueAnimator = valueAnimator5;
        }
        valueAnimator.start();
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Rect rect = this.f39470p0;
        Paint paint = this.f39471q0;
        if (rect == null) {
            paint.setColor(0);
            canvas.drawRect(this.f39472r0, paint);
        } else {
            Intrinsics.checkNotNull(rect);
            canvas.drawRect(rect, paint);
        }
    }

    public final void setRect(@Nullable Rect rect) {
        this.f39470p0 = rect;
    }
}
