package h0;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.material.TextFieldColors;
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

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/DefaultTextFieldColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,855:1\n81#2:856\n81#2:857\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material/DefaultTextFieldColors\n*L\n726#1:856\n757#1:857\n*E\n"})
public final class n0 implements TextFieldColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f68922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f68923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f68924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f68925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f68926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f68927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f68928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f68929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f68930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f68931j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f68932k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f68933l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f68934n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f68935o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f68936p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f68937q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f68938r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f68939s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f68940t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f68941u;

    public n0(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30) {
        this.f68922a = j10;
        this.f68923b = j11;
        this.f68924c = j12;
        this.f68925d = j13;
        this.f68926e = j14;
        this.f68927f = j15;
        this.f68928g = j16;
        this.f68929h = j17;
        this.f68930i = j18;
        this.f68931j = j19;
        this.f68932k = j20;
        this.f68933l = j21;
        this.m = j22;
        this.f68934n = j23;
        this.f68935o = j24;
        this.f68936p = j25;
        this.f68937q = j26;
        this.f68938r = j27;
        this.f68939s = j28;
        this.f68940t = j29;
        this.f68941u = j30;
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public final State<Color> backgroundColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1423938813);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1423938813, i10, -1, "androidx.compose.material.DefaultTextFieldColors.backgroundColor (TextFieldDefaults.kt:741)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(this.f68935o), composer, 0);
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
        composer.startReplaceableGroup(-1446422485);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1446422485, i10, -1, "androidx.compose.material.DefaultTextFieldColors.cursorColor (TextFieldDefaults.kt:773)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68925d : this.f68924c), composer, 0);
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
        if (obj == null || n0.class != obj.getClass()) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return Color.m2509equalsimpl0(this.f68922a, n0Var.f68922a) && Color.m2509equalsimpl0(this.f68923b, n0Var.f68923b) && Color.m2509equalsimpl0(this.f68924c, n0Var.f68924c) && Color.m2509equalsimpl0(this.f68925d, n0Var.f68925d) && Color.m2509equalsimpl0(this.f68926e, n0Var.f68926e) && Color.m2509equalsimpl0(this.f68927f, n0Var.f68927f) && Color.m2509equalsimpl0(this.f68928g, n0Var.f68928g) && Color.m2509equalsimpl0(this.f68929h, n0Var.f68929h) && Color.m2509equalsimpl0(this.f68930i, n0Var.f68930i) && Color.m2509equalsimpl0(this.f68931j, n0Var.f68931j) && Color.m2509equalsimpl0(this.f68932k, n0Var.f68932k) && Color.m2509equalsimpl0(this.f68933l, n0Var.f68933l) && Color.m2509equalsimpl0(this.m, n0Var.m) && Color.m2509equalsimpl0(this.f68934n, n0Var.f68934n) && Color.m2509equalsimpl0(this.f68935o, n0Var.f68935o) && Color.m2509equalsimpl0(this.f68936p, n0Var.f68936p) && Color.m2509equalsimpl0(this.f68937q, n0Var.f68937q) && Color.m2509equalsimpl0(this.f68938r, n0Var.f68938r) && Color.m2509equalsimpl0(this.f68939s, n0Var.f68939s) && Color.m2509equalsimpl0(this.f68940t, n0Var.f68940t) && Color.m2509equalsimpl0(this.f68941u, n0Var.f68941u);
    }

    public final int hashCode() {
        return Color.m2515hashCodeimpl(this.f68941u) + androidx.collection.j.a(this.f68940t, androidx.collection.j.a(this.f68939s, androidx.collection.j.a(this.f68938r, androidx.collection.j.a(this.f68937q, androidx.collection.j.a(this.f68936p, androidx.collection.j.a(this.f68935o, androidx.collection.j.a(this.f68934n, androidx.collection.j.a(this.m, androidx.collection.j.a(this.f68933l, androidx.collection.j.a(this.f68932k, androidx.collection.j.a(this.f68931j, androidx.collection.j.a(this.f68930i, androidx.collection.j.a(this.f68929h, androidx.collection.j.a(this.f68928g, androidx.collection.j.a(this.f68927f, androidx.collection.j.a(this.f68926e, androidx.collection.j.a(this.f68925d, androidx.collection.j.a(this.f68924c, androidx.collection.j.a(this.f68923b, Color.m2515hashCodeimpl(this.f68922a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Override // androidx.compose.material.TextFieldColors
    @Composable
    @NotNull
    public final State<Color> indicatorColor(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 998675979)) {
            ComposerKt.traceEventStart(998675979, i10, -1, "androidx.compose.material.DefaultTextFieldColors.indicatorColor (TextFieldDefaults.kt:720)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f68929h;
        } else if (z11) {
            j10 = this.f68928g;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.f68926e : this.f68927f;
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceableGroup(-2054190397);
            stateRememberUpdatedState = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(-2054190292);
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
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 727091888)) {
            ComposerKt.traceEventStart(727091888, i10, -1, "androidx.compose.material.DefaultTextFieldColors.labelColor (TextFieldDefaults.kt:751)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f68938r;
        } else if (z11) {
            j10 = this.f68939s;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.f68936p : this.f68937q;
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
        composer.startReplaceableGroup(1016171324);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1016171324, i10, -1, "androidx.compose.material.DefaultTextFieldColors.leadingIconColor (TextFieldDefaults.kt:698)");
        }
        if (z10) {
            j10 = z11 ? this.f68932k : this.f68930i;
        } else {
            j10 = this.f68931j;
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
    public final State<Color> placeholderColor(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(264799724);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(264799724, i10, -1, "androidx.compose.material.DefaultTextFieldColors.placeholderColor (TextFieldDefaults.kt:746)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68940t : this.f68941u), composer, 0);
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
        composer.startReplaceableGroup(9804418);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(9804418, i10, -1, "androidx.compose.material.DefaultTextFieldColors.textColor (TextFieldDefaults.kt:768)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f68922a : this.f68923b), composer, 0);
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
        composer.startReplaceableGroup(225259054);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(225259054, i10, -1, "androidx.compose.material.DefaultTextFieldColors.trailingIconColor (TextFieldDefaults.kt:709)");
        }
        if (z10) {
            j10 = z11 ? this.f68934n : this.f68933l;
        } else {
            j10 = this.m;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
