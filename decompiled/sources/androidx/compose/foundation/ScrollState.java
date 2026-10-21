package androidx.compose.foundation;

import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.gestures.ScrollableStateKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u000f\u0012\u0006\u0010;\u001a\u00020\u0010¢\u0006\u0004\b<\u0010\u001eJD\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022'\u0010\n\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0004¢\u0006\u0002\b\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016J+\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017R+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00108F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR+\u0010\"\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00108@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\u001eR\u001a\u0010(\u001a\u00020#8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001b\u0010.\u001a\u00020)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001b\u00101\u001a\u00020)8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b0\u0010-R$\u00105\u001a\u00020\u00102\u0006\u00102\u001a\u00020\u00108F@@X\u0086\u000e¢\u0006\f\u001a\u0004\b3\u0010\u001c\"\u0004\b4\u0010\u001eR\u0011\u00109\u001a\u0002068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010:\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, d2 = {"Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/foundation/gestures/ScrollableState;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/ScrollScope;", "Lkotlin/coroutines/Continuation;", "", "", "Lkotlin/ExtensionFunctionType;", "block", "scroll", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "delta", "dispatchRawDelta", "", "value", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "animateScrollTo", "(ILandroidx/compose/animation/core/AnimationSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "scrollTo", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<set-?>", "a", "Landroidx/compose/runtime/MutableIntState;", "getValue", "()I", "setValue", "(I)V", "b", "getViewportSize$foundation_release", "setViewportSize$foundation_release", "viewportSize", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "c", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "getInternalInteractionSource$foundation_release", "()Landroidx/compose/foundation/interaction/MutableInteractionSource;", "internalInteractionSource", "", "g", "Landroidx/compose/runtime/State;", "getCanScrollForward", "()Z", "canScrollForward", "h", "getCanScrollBackward", "canScrollBackward", "newMax", "getMaxValue", "setMaxValue$foundation_release", "maxValue", "Landroidx/compose/foundation/interaction/InteractionSource;", "getInteractionSource", "()Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "isScrollInProgress", "initial", "<init>", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n+ 2 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,454:1\n75#2:455\n108#2,2:456\n75#2:458\n108#2,2:459\n81#3:461\n81#3:462\n*S KotlinDebug\n*F\n+ 1 Scroll.kt\nandroidx/compose/foundation/ScrollState\n*L\n98#1:455\n98#1:456,2\n116#1:458\n116#1:459,2\n159#1:461\n161#1:462\n*E\n"})
public final class ScrollState implements ScrollableState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public static final Saver<ScrollState, ?> f3465i = SaverKt.Saver(a.f3474p0, b.f3475p0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntState value;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f3470e;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableIntState viewportSize = SnapshotIntStateKt.mutableIntStateOf(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableInteractionSource internalInteractionSource = InteractionSourceKt.MutableInteractionSource();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableIntState f3469d = SnapshotIntStateKt.mutableIntStateOf(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final ScrollableState f3471f = ScrollableStateKt.ScrollableState(new e());

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State canScrollForward = SnapshotStateKt.derivedStateOf(new d());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State canScrollBackward = SnapshotStateKt.derivedStateOf(new c());

    /* JADX INFO: compiled from: Scroll.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/ScrollState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/ScrollState;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<ScrollState, ?> getSaver() {
            return ScrollState.f3465i;
        }
    }

    /* JADX INFO: compiled from: Scroll.kt */
    public static final class a extends Lambda implements Function2<SaverScope, ScrollState, Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f3474p0 = new a(2);

        @Override // kotlin.jvm.functions.Function2
        public final Integer invoke(SaverScope saverScope, ScrollState scrollState) {
            SaverScope Saver = saverScope;
            ScrollState it = scrollState;
            Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
            Intrinsics.checkNotNullParameter(it, "it");
            return Integer.valueOf(it.getValue());
        }
    }

    /* JADX INFO: compiled from: Scroll.kt */
    public static final class b extends Lambda implements Function1<Integer, ScrollState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f3475p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final ScrollState invoke(Integer num) {
            return new ScrollState(num.intValue());
        }
    }

    /* JADX INFO: compiled from: Scroll.kt */
    public static final class c extends Lambda implements Function0<Boolean> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(ScrollState.this.getValue() > 0);
        }
    }

    /* JADX INFO: compiled from: Scroll.kt */
    public static final class d extends Lambda implements Function0<Boolean> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            ScrollState scrollState = ScrollState.this;
            return Boolean.valueOf(scrollState.getValue() < scrollState.getMaxValue());
        }
    }

    /* JADX INFO: compiled from: Scroll.kt */
    public static final class e extends Lambda implements Function1<Float, Float> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Float invoke(Float f6) {
            float fFloatValue = f6.floatValue();
            ScrollState scrollState = ScrollState.this;
            float value = scrollState.f3470e + scrollState.getValue() + fFloatValue;
            float fCoerceIn = kotlin.ranges.c.coerceIn(value, 0.0f, scrollState.getMaxValue());
            boolean z10 = !(value == fCoerceIn);
            float value2 = fCoerceIn - scrollState.getValue();
            int iRoundToInt = mk.c.roundToInt(value2);
            ScrollState.access$setValue(scrollState, scrollState.getValue() + iRoundToInt);
            scrollState.f3470e = value2 - iRoundToInt;
            if (z10) {
                fFloatValue = value2;
            }
            return Float.valueOf(fFloatValue);
        }
    }

    public ScrollState(int i10) {
        this.value = SnapshotIntStateKt.mutableIntStateOf(i10);
    }

    public static final void access$setValue(ScrollState scrollState, int i10) {
        scrollState.value.setIntValue(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object animateScrollTo$default(ScrollState scrollState, int i10, AnimationSpec animationSpec, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            animationSpec = new SpringSpec(0.0f, 0.0f, null, 7, null);
        }
        return scrollState.animateScrollTo(i10, animationSpec, continuation);
    }

    @Nullable
    public final Object animateScrollTo(int i10, @NotNull AnimationSpec<Float> animationSpec, @NotNull Continuation<? super Unit> continuation) {
        Object objAnimateScrollBy = ScrollExtensionsKt.animateScrollBy(this, i10 - getValue(), animationSpec, continuation);
        return objAnimateScrollBy == ek.a.getCOROUTINE_SUSPENDED() ? objAnimateScrollBy : Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public float dispatchRawDelta(float delta) {
        return this.f3471f.dispatchRawDelta(delta);
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollBackward() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean getCanScrollForward() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @NotNull
    public final InteractionSource getInteractionSource() {
        return this.internalInteractionSource;
    }

    @NotNull
    /* JADX INFO: renamed from: getInternalInteractionSource$foundation_release, reason: from getter */
    public final MutableInteractionSource getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public final int getMaxValue() {
        return this.f3469d.getIntValue();
    }

    public final int getValue() {
        return this.value.getIntValue();
    }

    public final int getViewportSize$foundation_release() {
        return this.viewportSize.getIntValue();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    public boolean isScrollInProgress() {
        return this.f3471f.isScrollInProgress();
    }

    @Override // androidx.compose.foundation.gestures.ScrollableState
    @Nullable
    public Object scroll(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super ScrollScope, ? super Continuation<? super Unit>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        Object objScroll = this.f3471f.scroll(mutatePriority, function2, continuation);
        return objScroll == ek.a.getCOROUTINE_SUSPENDED() ? objScroll : Unit.INSTANCE;
    }

    @Nullable
    public final Object scrollTo(int i10, @NotNull Continuation<? super Float> continuation) {
        return ScrollExtensionsKt.scrollBy(this, i10 - getValue(), continuation);
    }

    public final void setMaxValue$foundation_release(int i10) {
        this.f3469d.setIntValue(i10);
        if (getValue() > i10) {
            this.value.setIntValue(i10);
        }
    }

    public final void setViewportSize$foundation_release(int i10) {
        this.viewportSize.setIntValue(i10);
    }
}
