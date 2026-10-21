package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.StartOffset;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BasicMarquee.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\u001aU\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a\u001d\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000e\u0010\u000f\" \u0010\u0017\u001a\u00020\u00078GX\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"#\u0010\u001d\u001a\u00020\t8GX\u0087\u0004ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\u001b\" \u0010\u001e\u001a\u00020\u00018GX\u0087D¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b \u0010!\" \u0010#\u001a\u00020\u00018GX\u0087D¢\u0006\u0012\n\u0004\b#\u0010\u001f\u0012\u0004\b%\u0010\u0016\u001a\u0004\b$\u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006&"}, d2 = {"Landroidx/compose/ui/Modifier;", "", "iterations", "Landroidx/compose/foundation/MarqueeAnimationMode;", "animationMode", "delayMillis", "initialDelayMillis", "Landroidx/compose/foundation/MarqueeSpacing;", "spacing", "Landroidx/compose/ui/unit/Dp;", "velocity", "basicMarquee-1Mj1MLw", "(Landroidx/compose/ui/Modifier;IIIILandroidx/compose/foundation/MarqueeSpacing;F)Landroidx/compose/ui/Modifier;", "basicMarquee", "MarqueeSpacing-0680j_4", "(F)Landroidx/compose/foundation/MarqueeSpacing;", "MarqueeSpacing", "a", "Landroidx/compose/foundation/MarqueeSpacing;", "getDefaultMarqueeSpacing", "()Landroidx/compose/foundation/MarqueeSpacing;", "getDefaultMarqueeSpacing$annotations", "()V", "DefaultMarqueeSpacing", "b", "F", "getDefaultMarqueeVelocity", "()F", "getDefaultMarqueeVelocity$annotations", "DefaultMarqueeVelocity", "DefaultMarqueeIterations", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDefaultMarqueeIterations", "()I", "getDefaultMarqueeIterations$annotations", "DefaultMarqueeDelayMillis", "getDefaultMarqueeDelayMillis", "getDefaultMarqueeDelayMillis$annotations", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBasicMarquee.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,497:1\n1#2:498\n154#3:499\n*S KotlinDebug\n*F\n+ 1 BasicMarquee.kt\nandroidx/compose/foundation/BasicMarqueeKt\n*L\n94#1:499\n*E\n"})
public final class BasicMarqueeKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final MarqueeSpacing f3293a = MarqueeSpacing.INSTANCE.fractionOfContainer(0.33333334f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f3294b = Dp.m4389constructorimpl(30);

    /* JADX INFO: compiled from: BasicMarquee.kt */
    public static final class a implements MarqueeSpacing {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f3295a;

        public a(float f6) {
            this.f3295a = f6;
        }

        @Override // androidx.compose.foundation.MarqueeSpacing
        public final int calculateSpacing(@NotNull Density MarqueeSpacing, int i10, int i11) {
            Intrinsics.checkNotNullParameter(MarqueeSpacing, "$this$MarqueeSpacing");
            return MarqueeSpacing.mo413roundToPx0680j_4(this.f3295a);
        }
    }

    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: MarqueeSpacing-0680j_4, reason: not valid java name */
    public static final MarqueeSpacing m123MarqueeSpacing0680j_4(float f6) {
        return new a(f6);
    }

    /* JADX INFO: renamed from: access$createMarqueeAnimationSpec-Z4HSEVQ, reason: not valid java name */
    public static final AnimationSpec m124access$createMarqueeAnimationSpecZ4HSEVQ(int i10, float f6, int i11, int i12, float f10, Density density) {
        TweenSpec tweenSpecTween = AnimationSpecKt.tween((int) Math.ceil(f6 / (Math.abs(density.mo415toPx0680j_4(f10)) / 1000.0f)), i12, EasingKt.getLinearEasing());
        long jM97constructorimpl$default = StartOffset.m97constructorimpl$default((-i12) + i11, 0, 2, null);
        return i10 == Integer.MAX_VALUE ? AnimationSpecKt.m78infiniteRepeatable9IiC70o$default(tweenSpecTween, null, jM97constructorimpl$default, 2, null) : AnimationSpecKt.m80repeatable91I0pcU$default(i10, tweenSpecTween, null, jM97constructorimpl$default, 4, null);
    }

    @ExperimentalFoundationApi
    @NotNull
    /* JADX INFO: renamed from: basicMarquee-1Mj1MLw, reason: not valid java name */
    public static final Modifier m125basicMarquee1Mj1MLw(@NotNull Modifier basicMarquee, int i10, int i11, int i12, int i13, @NotNull MarqueeSpacing spacing, float f6) {
        Intrinsics.checkNotNullParameter(basicMarquee, "$this$basicMarquee");
        Intrinsics.checkNotNullParameter(spacing, "spacing");
        return basicMarquee.then(new MarqueeModifierElement(i10, i11, i12, i13, spacing, f6));
    }

    /* JADX INFO: renamed from: basicMarquee-1Mj1MLw$default, reason: not valid java name */
    public static /* synthetic */ Modifier m126basicMarquee1Mj1MLw$default(Modifier modifier, int i10, int i11, int i12, int i13, MarqueeSpacing marqueeSpacing, float f6, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 3;
        }
        if ((i14 & 2) != 0) {
            i11 = MarqueeAnimationMode.INSTANCE.m170getImmediatelyZbEOnfQ();
        }
        int i15 = i11;
        if ((i14 & 4) != 0) {
            i12 = 1200;
        }
        int i16 = i12;
        if ((i14 & 8) != 0) {
            i13 = MarqueeAnimationMode.m164equalsimpl0(i15, MarqueeAnimationMode.INSTANCE.m170getImmediatelyZbEOnfQ()) ? i16 : 0;
        }
        int i17 = i13;
        if ((i14 & 16) != 0) {
            marqueeSpacing = f3293a;
        }
        MarqueeSpacing marqueeSpacing2 = marqueeSpacing;
        if ((i14 & 32) != 0) {
            f6 = f3294b;
        }
        return m125basicMarquee1Mj1MLw(modifier, i10, i15, i16, i17, marqueeSpacing2, f6);
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeDelayMillis() {
        return 1200;
    }

    @ExperimentalFoundationApi
    public static final int getDefaultMarqueeIterations() {
        return 3;
    }

    @ExperimentalFoundationApi
    @NotNull
    public static final MarqueeSpacing getDefaultMarqueeSpacing() {
        return f3293a;
    }

    @ExperimentalFoundationApi
    public static final float getDefaultMarqueeVelocity() {
        return f3294b;
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeDelayMillis$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeIterations$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeSpacing$annotations() {
    }

    @ExperimentalFoundationApi
    public static /* synthetic */ void getDefaultMarqueeVelocity$annotations() {
    }
}
