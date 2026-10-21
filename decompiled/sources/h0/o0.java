package h0;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColorsWithIcons;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExposedDropdownMenu.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@SourceDebugExtension({"SMAP\nExposedDropdownMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,737:1\n81#2:738\n81#2:739\n81#2:740\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenu.kt\nandroidx/compose/material/DefaultTextFieldForExposedDropdownMenusColors\n*L\n610#1:738\n628#1:739\n659#1:740\n*E\n"})
public final class o0 implements TextFieldColorsWithIcons {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68973c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f68976f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f68977g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f68978h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f68979i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f68980j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f68981k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f68982l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f68983n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f68984o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f68985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f68986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f68987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f68988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f68989t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f68990u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f68991v;

    public o0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31) {
        this.f68971a = j10;
        this.f68972b = j11;
        this.f68973c = j12;
        this.f68974d = j13;
        this.f68975e = j14;
        this.f68976f = j15;
        this.f68977g = j16;
        this.f68978h = j17;
        this.f68979i = j18;
        this.f68980j = j19;
        this.f68981k = j20;
        this.f68982l = j21;
        this.m = j22;
        this.f68983n = j23;
        this.f68984o = j24;
        this.f68985p = j25;
        this.f68986q = j26;
        this.f68987r = j27;
        this.f68988s = j28;
        this.f68989t = j29;
        this.f68990u = j30;
        this.f68991v = j31;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public final State<Color> backgroundColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-28962788);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-28962788, i10, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.backgroundColor (ExposedDropdownMenu.kt:643)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(this.f68985p), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public final State<Color> cursorColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-930693132);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-930693132, i10, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.cursorColor (ExposedDropdownMenu.kt:675)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68974d : this.f68973c), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0.class != obj.getClass()) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Color.m2509equalsimpl0(this.f68971a, o0Var.f68971a) && Color.m2509equalsimpl0(this.f68972b, o0Var.f68972b) && Color.m2509equalsimpl0(this.f68973c, o0Var.f68973c) && Color.m2509equalsimpl0(this.f68974d, o0Var.f68974d) && Color.m2509equalsimpl0(this.f68975e, o0Var.f68975e) && Color.m2509equalsimpl0(this.f68976f, o0Var.f68976f) && Color.m2509equalsimpl0(this.f68977g, o0Var.f68977g) && Color.m2509equalsimpl0(this.f68978h, o0Var.f68978h) && Color.m2509equalsimpl0(this.f68979i, o0Var.f68979i) && Color.m2509equalsimpl0(this.f68980j, o0Var.f68980j) && Color.m2509equalsimpl0(this.f68981k, o0Var.f68981k) && Color.m2509equalsimpl0(this.f68982l, o0Var.f68982l) && Color.m2509equalsimpl0(this.m, o0Var.m) && Color.m2509equalsimpl0(this.f68983n, o0Var.f68983n) && Color.m2509equalsimpl0(this.f68984o, o0Var.f68984o) && Color.m2509equalsimpl0(this.f68985p, o0Var.f68985p) && Color.m2509equalsimpl0(this.f68986q, o0Var.f68986q) && Color.m2509equalsimpl0(this.f68987r, o0Var.f68987r) && Color.m2509equalsimpl0(this.f68988s, o0Var.f68988s) && Color.m2509equalsimpl0(this.f68989t, o0Var.f68989t) && Color.m2509equalsimpl0(this.f68990u, o0Var.f68990u) && Color.m2509equalsimpl0(this.f68991v, o0Var.f68991v);
    }

    public final int hashCode() {
        return Color.m2515hashCodeimpl(this.f68991v) + androidx.collection.j.a(this.f68990u, androidx.collection.j.a(this.f68989t, androidx.collection.j.a(this.f68988s, androidx.collection.j.a(this.f68987r, androidx.collection.j.a(this.f68986q, androidx.collection.j.a(this.f68985p, androidx.collection.j.a(this.f68984o, androidx.collection.j.a(this.f68983n, androidx.collection.j.a(this.m, androidx.collection.j.a(this.f68982l, androidx.collection.j.a(this.f68981k, androidx.collection.j.a(this.f68980j, androidx.collection.j.a(this.f68979i, androidx.collection.j.a(this.f68978h, androidx.collection.j.a(this.f68977g, androidx.collection.j.a(this.f68976f, androidx.collection.j.a(this.f68975e, androidx.collection.j.a(this.f68974d, androidx.collection.j.a(this.f68973c, androidx.collection.j.a(this.f68972b, Color.m2515hashCodeimpl(this.f68971a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public final State<Color> indicatorColor(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 476110356)) {
            ComposerKt.traceEventStart(476110356, i10, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.indicatorColor (ExposedDropdownMenu.kt:622)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f68978h;
        } else if (z11) {
            j10 = this.f68977g;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.f68975e : this.f68976f;
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceableGroup(182315078);
            stateRememberUpdatedState = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(182315183);
            stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j11), composer, 0);
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public final State<Color> labelColor(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, -1749156593)) {
            ComposerKt.traceEventStart(-1749156593, i10, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.labelColor (ExposedDropdownMenu.kt:653)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f68988s;
        } else if (z11) {
            j10 = this.f68989t;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.f68986q : this.f68987r;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColorsWithIcons
    public final /* synthetic */ State leadingIconColor(boolean z10, boolean z11, InteractionSource interactionSource, Composer composer, int i10) {
        return m3.a(this, z10, z11, interactionSource, composer, i10);
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public final State<Color> placeholderColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1742462291);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1742462291, i10, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.placeholderColor (ExposedDropdownMenu.kt:648)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68990u : this.f68991v), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public final State<Color> textColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(394526077);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(394526077, i10, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.textColor (ExposedDropdownMenu.kt:670)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68971a : this.f68972b), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColorsWithIcons
    @Composable
    @NotNull
    public final State<Color> trailingIconColor(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 79259602)) {
            ComposerKt.traceEventStart(79259602, i10, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:604)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f68983n;
        } else if (z11) {
            j10 = this.f68984o;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.m : this.f68982l;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public final State<Color> leadingIconColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(-776179197);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-776179197, i10, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.leadingIconColor (ExposedDropdownMenu.kt:582)");
        }
        if (z10) {
            j10 = z11 ? this.f68981k : this.f68979i;
        } else {
            j10 = this.f68980j;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public final State<Color> trailingIconColor(boolean z10, boolean z11, @Nullable Composer composer, int i10) {
        long j10;
        composer.startReplaceableGroup(1665901393);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1665901393, i10, -1, "androidx.compose.material.DefaultTextFieldForExposedDropdownMenusColors.trailingIconColor (ExposedDropdownMenu.kt:593)");
        }
        if (!z10) {
            j10 = this.f68983n;
        } else if (z11) {
            j10 = this.f68984o;
        } else {
            j10 = this.f68982l;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
