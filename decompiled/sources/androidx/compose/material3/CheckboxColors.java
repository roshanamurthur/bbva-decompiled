package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001Bd\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0005\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u0013\u0010\u0011\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/material3/CheckboxColors;", "", "Landroidx/compose/ui/state/ToggleableState;", "state", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "checkmarkColor$material3_release", "(Landroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "checkmarkColor", "", "enabled", "boxColor$material3_release", "(ZLandroidx/compose/ui/state/ToggleableState;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "boxColor", "borderColor$material3_release", "borderColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "checkedCheckmarkColor", "uncheckedCheckmarkColor", "checkedBoxColor", "uncheckedBoxColor", "disabledCheckedBoxColor", "disabledUncheckedBoxColor", "disabledIndeterminateBoxColor", "checkedBorderColor", "uncheckedBorderColor", "disabledBorderColor", "disabledIndeterminateBorderColor", "<init>", "(JJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class CheckboxColors {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9618c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f9619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f9620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f9622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f9623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f9624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f9625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f9626k;

    /* JADX INFO: compiled from: Checkbox.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ToggleableState.values().length];
            try {
                iArr[ToggleableState.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ToggleableState.Indeterminate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ToggleableState.Off.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CheckboxColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, DefaultConstructorMarker defaultConstructorMarker) {
        this.f9616a = j10;
        this.f9617b = j11;
        this.f9618c = j12;
        this.f9619d = j13;
        this.f9620e = j14;
        this.f9621f = j15;
        this.f9622g = j16;
        this.f9623h = j17;
        this.f9624i = j18;
        this.f9625j = j19;
        this.f9626k = j20;
    }

    @Composable
    @NotNull
    public final State<Color> borderColor$material3_release(boolean z10, @NotNull ToggleableState state, @Nullable Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(1009643462);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1009643462, i10, -1, "androidx.compose.material3.CheckboxColors.borderColor (Checkbox.kt:448)");
        }
        if (z10) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f9623h;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f9624i;
            }
        } else {
            int i12 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i12 == 1) {
                j10 = this.f9625j;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f9625j;
            } else {
                j10 = this.f9626k;
            }
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceableGroup(1209369567);
            stateRememberUpdatedState = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1209369753);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j11), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> boxColor$material3_release(boolean z10, @NotNull ToggleableState state, @Nullable Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(360729865);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(360729865, i10, -1, "androidx.compose.material3.CheckboxColors.boxColor (Checkbox.kt:417)");
        }
        if (z10) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f9618c;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f9619d;
            }
        } else {
            int i12 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i12 == 1) {
                j10 = this.f9620e;
            } else if (i12 == 2) {
                j10 = this.f9622g;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f9621f;
            }
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceableGroup(1143718427);
            stateRememberUpdatedState = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(1143718613);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j11), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> checkmarkColor$material3_release(@NotNull ToggleableState state, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-507585681);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-507585681, i10, -1, "androidx.compose.material3.CheckboxColors.checkmarkColor (Checkbox.kt:398)");
        }
        ToggleableState toggleableState = ToggleableState.Off;
        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(state == toggleableState ? this.f9617b : this.f9616a, AnimationSpecKt.tween$default(state == toggleableState ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM58animateColorAsStateeuL9pac;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof CheckboxColors)) {
            return false;
        }
        CheckboxColors checkboxColors = (CheckboxColors) other;
        return Color.m2509equalsimpl0(this.f9616a, checkboxColors.f9616a) && Color.m2509equalsimpl0(this.f9617b, checkboxColors.f9617b) && Color.m2509equalsimpl0(this.f9618c, checkboxColors.f9618c) && Color.m2509equalsimpl0(this.f9619d, checkboxColors.f9619d) && Color.m2509equalsimpl0(this.f9620e, checkboxColors.f9620e) && Color.m2509equalsimpl0(this.f9621f, checkboxColors.f9621f) && Color.m2509equalsimpl0(this.f9622g, checkboxColors.f9622g) && Color.m2509equalsimpl0(this.f9623h, checkboxColors.f9623h) && Color.m2509equalsimpl0(this.f9624i, checkboxColors.f9624i) && Color.m2509equalsimpl0(this.f9625j, checkboxColors.f9625j) && Color.m2509equalsimpl0(this.f9626k, checkboxColors.f9626k);
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.f9626k) + androidx.collection.j.a(this.f9625j, androidx.collection.j.a(this.f9624i, androidx.collection.j.a(this.f9623h, androidx.collection.j.a(this.f9622g, androidx.collection.j.a(this.f9621f, androidx.collection.j.a(this.f9620e, androidx.collection.j.a(this.f9619d, androidx.collection.j.a(this.f9618c, androidx.collection.j.a(this.f9617b, Color.m2515hashCodeimpl(this.f9616a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
