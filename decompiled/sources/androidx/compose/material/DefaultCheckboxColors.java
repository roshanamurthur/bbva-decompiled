package androidx.compose.material;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.state.ToggleableState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Checkbox.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
public final class DefaultCheckboxColors implements CheckboxColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7033c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7034d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7035e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f7036f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f7037g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f7038h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f7039i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7040j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f7041k;

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

    public DefaultCheckboxColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20) {
        this.f7031a = j10;
        this.f7032b = j11;
        this.f7033c = j12;
        this.f7034d = j13;
        this.f7035e = j14;
        this.f7036f = j15;
        this.f7037g = j16;
        this.f7038h = j17;
        this.f7039i = j18;
        this.f7040j = j19;
        this.f7041k = j20;
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    @NotNull
    public final State<Color> borderColor(boolean z10, @NotNull ToggleableState state, @Nullable Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(-1568341342);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1568341342, i10, -1, "androidx.compose.material.DefaultCheckboxColors.borderColor (Checkbox.kt:451)");
        }
        if (z10) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f7038h;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f7039i;
            }
        } else {
            int i12 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i12 == 1) {
                j10 = this.f7040j;
            } else if (i12 != 2) {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f7040j;
            } else {
                j10 = this.f7041k;
            }
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceableGroup(-796405227);
            stateRememberUpdatedState = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-796405041);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j11), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    @NotNull
    public final State<Color> boxColor(boolean z10, @NotNull ToggleableState state, @Nullable Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(840901029);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(840901029, i10, -1, "androidx.compose.material.DefaultCheckboxColors.boxColor (Checkbox.kt:426)");
        }
        if (z10) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i11 == 1 || i11 == 2) {
                j10 = this.f7033c;
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f7034d;
            }
        } else {
            int i12 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
            if (i12 == 1) {
                j10 = this.f7035e;
            } else if (i12 == 2) {
                j10 = this.f7037g;
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = this.f7036f;
            }
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceableGroup(-2010643468);
            stateRememberUpdatedState = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(state == ToggleableState.Off ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2010643282);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j11), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.CheckboxColors
    @Composable
    @NotNull
    public final State<Color> checkmarkColor(@NotNull ToggleableState state, @Nullable Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(state, "state");
        composer.startReplaceableGroup(544656267);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(544656267, i10, -1, "androidx.compose.material.DefaultCheckboxColors.checkmarkColor (Checkbox.kt:414)");
        }
        ToggleableState toggleableState = ToggleableState.Off;
        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(state == toggleableState ? this.f7032b : this.f7031a, AnimationSpecKt.tween$default(state == toggleableState ? 100 : 50, 0, null, 6, null), null, null, composer, 0, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM58animateColorAsStateeuL9pac;
    }
}
