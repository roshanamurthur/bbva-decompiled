package androidx.compose.material3;

import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.interaction.FocusInteractionKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.text.selection.TextSelectionColors;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\b\u0007\u0018\u00002\u00020\u0001Bä\u0002\b\u0000\u0012\u0006\u0010)\u001a\u00020\b\u0012\u0006\u0010*\u001a\u00020\b\u0012\u0006\u0010+\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\b\u0012\u0006\u0010-\u001a\u00020\b\u0012\u0006\u0010.\u001a\u00020\b\u0012\u0006\u0010/\u001a\u00020\b\u0012\u0006\u00100\u001a\u00020\b\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u00101\u001a\u00020\b\u0012\u0006\u00102\u001a\u00020%\u0012\u0006\u00103\u001a\u00020\b\u0012\u0006\u00104\u001a\u00020\b\u0012\u0006\u00105\u001a\u00020\b\u0012\u0006\u00106\u001a\u00020\b\u0012\u0006\u00107\u001a\u00020\b\u0012\u0006\u00108\u001a\u00020\b\u0012\u0006\u00109\u001a\u00020\b\u0012\u0006\u0010:\u001a\u00020\b\u0012\u0006\u0010;\u001a\u00020\b\u0012\u0006\u0010<\u001a\u00020\b\u0012\u0006\u0010=\u001a\u00020\b\u0012\u0006\u0010>\u001a\u00020\b\u0012\u0006\u0010?\u001a\u00020\b\u0012\u0006\u0010@\u001a\u00020\b\u0012\u0006\u0010A\u001a\u00020\b\u0012\u0006\u0010B\u001a\u00020\b\u0012\u0006\u0010C\u001a\u00020\b\u0012\u0006\u0010D\u001a\u00020\b\u0012\u0006\u0010E\u001a\u00020\b\u0012\u0006\u0010F\u001a\u00020\b\u0012\u0006\u0010G\u001a\u00020\b\u0012\u0006\u0010H\u001a\u00020\b\u0012\u0006\u0010I\u001a\u00020\b\u0012\u0006\u0010J\u001a\u00020\b\u0012\u0006\u0010K\u001a\u00020\b\u0012\u0006\u0010L\u001a\u00020\b\u0012\u0006\u0010M\u001a\u00020\b\u0012\u0006\u0010N\u001a\u00020\b\u0012\u0006\u0010O\u001a\u00020\b\u0012\u0006\u0010P\u001a\u00020\b\u0012\u0006\u0010Q\u001a\u00020\b\u0012\u0006\u0010R\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\bS\u0010TJ0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ0\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nJ0\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\nJ0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\nJ0\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\nJ0\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\nJ0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\nJ0\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\nJ0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\nJ0\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\nJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001a\u00020#H\u0016R\u0014\u0010(\u001a\u00020%8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006U"}, d2 = {"Landroidx/compose/material3/TextFieldColors;", "", "", "enabled", "isError", "Landroidx/compose/foundation/interaction/InteractionSource;", "interactionSource", "Landroidx/compose/runtime/State;", "Landroidx/compose/ui/graphics/Color;", "leadingIconColor$material3_release", "(ZZLandroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "leadingIconColor", "trailingIconColor$material3_release", "trailingIconColor", "indicatorColor$material3_release", "indicatorColor", "containerColor$material3_release", "containerColor", "placeholderColor$material3_release", "placeholderColor", "labelColor$material3_release", "labelColor", "textColor$material3_release", "textColor", "supportingTextColor$material3_release", "supportingTextColor", "prefixColor$material3_release", "prefixColor", "suffixColor$material3_release", "suffixColor", "cursorColor$material3_release", "(ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "cursorColor", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "getSelectionColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "selectionColors", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "errorCursorColor", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLandroidx/compose/foundation/text/selection/TextSelectionColors;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTextFieldDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2124:1\n76#2:2125\n76#2:2126\n76#2:2127\n76#2:2128\n76#2:2129\n76#2:2130\n76#2:2131\n76#2:2132\n76#2:2133\n76#2:2134\n*S KotlinDebug\n*F\n+ 1 TextFieldDefaults.kt\nandroidx/compose/material3/TextFieldColors\n*L\n1754#1:2125\n1780#1:2126\n1806#1:2127\n1835#1:2128\n1860#1:2129\n1885#1:2130\n1910#1:2131\n1927#1:2132\n1953#1:2133\n1978#1:2134\n*E\n"})
public final class TextFieldColors {
    public static final int $stable = 0;
    public final long A;
    public final long B;
    public final long C;
    public final long D;
    public final long E;
    public final long F;
    public final long G;
    public final long H;
    public final long I;
    public final long J;
    public final long K;
    public final long L;
    public final long M;
    public final long N;
    public final long O;
    public final long P;
    public final long Q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12027c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12028d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12029e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12030f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12031g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12032h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f12033i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f12034j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final TextSelectionColors f12035k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f12036l;
    public final long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f12037n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final long f12038o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f12039p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final long f12040q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f12041r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f12042s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f12043t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f12044u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long f12045v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f12046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final long f12047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final long f12048y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f12049z;

    public TextFieldColors(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, TextSelectionColors textSelectionColors, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(textSelectionColors, "textSelectionColors");
        this.f12025a = j10;
        this.f12026b = j11;
        this.f12027c = j12;
        this.f12028d = j13;
        this.f12029e = j14;
        this.f12030f = j15;
        this.f12031g = j16;
        this.f12032h = j17;
        this.f12033i = j18;
        this.f12034j = j19;
        this.f12035k = textSelectionColors;
        this.f12036l = j20;
        this.m = j21;
        this.f12037n = j22;
        this.f12038o = j23;
        this.f12039p = j24;
        this.f12040q = j25;
        this.f12041r = j26;
        this.f12042s = j27;
        this.f12043t = j28;
        this.f12044u = j29;
        this.f12045v = j30;
        this.f12046w = j31;
        this.f12047x = j32;
        this.f12048y = j33;
        this.f12049z = j34;
        this.A = j35;
        this.B = j36;
        this.C = j37;
        this.D = j38;
        this.E = j39;
        this.F = j40;
        this.G = j41;
        this.H = j42;
        this.I = j43;
        this.J = j44;
        this.K = j45;
        this.L = j46;
        this.M = j47;
        this.N = j48;
        this.O = j49;
        this.P = j50;
        this.Q = j51;
    }

    @Composable
    @NotNull
    public final State<Color> containerColor$material3_release(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, -1921164569)) {
            ComposerKt.traceEventStart(-1921164569, i10, -1, "androidx.compose.material3.TextFieldColors.containerColor (TextFieldDefaults.kt:1829)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f12031g;
        } else if (z11) {
            j10 = this.f12032h;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.f12029e : this.f12030f;
        }
        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j10, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateM58animateColorAsStateeuL9pac;
    }

    @Composable
    @NotNull
    public final State<Color> cursorColor$material3_release(boolean z10, @Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1885422187);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1885422187, i10, -1, "androidx.compose.material3.TextFieldColors.cursorColor (TextFieldDefaults.kt:1994)");
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(z10 ? this.f12034j : this.f12033i), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof TextFieldColors)) {
            return false;
        }
        TextFieldColors textFieldColors = (TextFieldColors) other;
        return Color.m2509equalsimpl0(this.f12025a, textFieldColors.f12025a) && Color.m2509equalsimpl0(this.f12026b, textFieldColors.f12026b) && Color.m2509equalsimpl0(this.f12027c, textFieldColors.f12027c) && Color.m2509equalsimpl0(this.f12028d, textFieldColors.f12028d) && Color.m2509equalsimpl0(this.f12029e, textFieldColors.f12029e) && Color.m2509equalsimpl0(this.f12030f, textFieldColors.f12030f) && Color.m2509equalsimpl0(this.f12031g, textFieldColors.f12031g) && Color.m2509equalsimpl0(this.f12032h, textFieldColors.f12032h) && Color.m2509equalsimpl0(this.f12033i, textFieldColors.f12033i) && Color.m2509equalsimpl0(this.f12034j, textFieldColors.f12034j) && Intrinsics.areEqual(this.f12035k, textFieldColors.f12035k) && Color.m2509equalsimpl0(this.f12036l, textFieldColors.f12036l) && Color.m2509equalsimpl0(this.m, textFieldColors.m) && Color.m2509equalsimpl0(this.f12037n, textFieldColors.f12037n) && Color.m2509equalsimpl0(this.f12038o, textFieldColors.f12038o) && Color.m2509equalsimpl0(this.f12039p, textFieldColors.f12039p) && Color.m2509equalsimpl0(this.f12040q, textFieldColors.f12040q) && Color.m2509equalsimpl0(this.f12041r, textFieldColors.f12041r) && Color.m2509equalsimpl0(this.f12042s, textFieldColors.f12042s) && Color.m2509equalsimpl0(this.f12043t, textFieldColors.f12043t) && Color.m2509equalsimpl0(this.f12044u, textFieldColors.f12044u) && Color.m2509equalsimpl0(this.f12045v, textFieldColors.f12045v) && Color.m2509equalsimpl0(this.f12046w, textFieldColors.f12046w) && Color.m2509equalsimpl0(this.f12047x, textFieldColors.f12047x) && Color.m2509equalsimpl0(this.f12048y, textFieldColors.f12048y) && Color.m2509equalsimpl0(this.f12049z, textFieldColors.f12049z) && Color.m2509equalsimpl0(this.A, textFieldColors.A) && Color.m2509equalsimpl0(this.B, textFieldColors.B) && Color.m2509equalsimpl0(this.C, textFieldColors.C) && Color.m2509equalsimpl0(this.D, textFieldColors.D) && Color.m2509equalsimpl0(this.E, textFieldColors.E) && Color.m2509equalsimpl0(this.F, textFieldColors.F) && Color.m2509equalsimpl0(this.G, textFieldColors.G) && Color.m2509equalsimpl0(this.H, textFieldColors.H) && Color.m2509equalsimpl0(this.I, textFieldColors.I) && Color.m2509equalsimpl0(this.J, textFieldColors.J) && Color.m2509equalsimpl0(this.K, textFieldColors.K) && Color.m2509equalsimpl0(this.L, textFieldColors.L) && Color.m2509equalsimpl0(this.M, textFieldColors.M) && Color.m2509equalsimpl0(this.N, textFieldColors.N) && Color.m2509equalsimpl0(this.O, textFieldColors.O) && Color.m2509equalsimpl0(this.P, textFieldColors.P) && Color.m2509equalsimpl0(this.Q, textFieldColors.Q);
    }

    @Composable
    @JvmName(name = "getSelectionColors")
    @NotNull
    public final TextSelectionColors getSelectionColors(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(997785083);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(997785083, i10, -1, "androidx.compose.material3.TextFieldColors.<get-selectionColors> (TextFieldDefaults.kt:2002)");
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return this.f12035k;
    }

    public int hashCode() {
        return Color.m2515hashCodeimpl(this.Q) + androidx.collection.j.a(this.P, androidx.collection.j.a(this.O, androidx.collection.j.a(this.N, androidx.collection.j.a(this.M, androidx.collection.j.a(this.L, androidx.collection.j.a(this.K, androidx.collection.j.a(this.J, androidx.collection.j.a(this.I, androidx.collection.j.a(this.H, androidx.collection.j.a(this.G, androidx.collection.j.a(this.F, androidx.collection.j.a(this.E, androidx.collection.j.a(this.D, androidx.collection.j.a(this.C, androidx.collection.j.a(this.B, androidx.collection.j.a(this.A, androidx.collection.j.a(this.f12049z, androidx.collection.j.a(this.f12048y, androidx.collection.j.a(this.f12047x, androidx.collection.j.a(this.f12046w, androidx.collection.j.a(this.f12045v, androidx.collection.j.a(this.f12044u, androidx.collection.j.a(this.f12043t, androidx.collection.j.a(this.f12042s, androidx.collection.j.a(this.f12041r, androidx.collection.j.a(this.f12040q, androidx.collection.j.a(this.f12039p, androidx.collection.j.a(this.f12038o, androidx.collection.j.a(this.f12037n, androidx.collection.j.a(this.m, androidx.collection.j.a(this.f12036l, (this.f12035k.hashCode() + androidx.collection.j.a(this.f12034j, androidx.collection.j.a(this.f12033i, androidx.collection.j.a(this.f12032h, androidx.collection.j.a(this.f12031g, androidx.collection.j.a(this.f12030f, androidx.collection.j.a(this.f12029e, androidx.collection.j.a(this.f12028d, androidx.collection.j.a(this.f12027c, androidx.collection.j.a(this.f12026b, Color.m2515hashCodeimpl(this.f12025a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Composable
    @NotNull
    public final State<Color> indicatorColor$material3_release(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        State<Color> stateRememberUpdatedState;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, -1877482635)) {
            ComposerKt.traceEventStart(-1877482635, i10, -1, "androidx.compose.material3.TextFieldColors.indicatorColor (TextFieldDefaults.kt:1800)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f12037n;
        } else if (z11) {
            j10 = this.f12038o;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.f12036l : this.m;
        }
        long j11 = j10;
        if (z10) {
            composer.startReplaceableGroup(715788864);
            stateRememberUpdatedState = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(j11, AnimationSpecKt.tween$default(150, 0, null, 6, null), null, null, composer, 48, 12);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(715788969);
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
    public final State<Color> labelColor$material3_release(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 1167161306)) {
            ComposerKt.traceEventStart(1167161306, i10, -1, "androidx.compose.material3.TextFieldColors.labelColor (TextFieldDefaults.kt:1879)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f12049z;
        } else if (z11) {
            j10 = this.A;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.f12047x : this.f12048y;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> leadingIconColor$material3_release(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 925127045)) {
            ComposerKt.traceEventStart(925127045, i10, -1, "androidx.compose.material3.TextFieldColors.leadingIconColor (TextFieldDefaults.kt:1748)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f12041r;
        } else if (z11) {
            j10 = this.f12042s;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.f12039p : this.f12040q;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> placeholderColor$material3_release(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 653850713)) {
            ComposerKt.traceEventStart(653850713, i10, -1, "androidx.compose.material3.TextFieldColors.placeholderColor (TextFieldDefaults.kt:1854)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.D;
        } else if (z11) {
            j10 = this.E;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.B : this.C;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> prefixColor$material3_release(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 129569364)) {
            ComposerKt.traceEventStart(129569364, i10, -1, "androidx.compose.material3.TextFieldColors.prefixColor (TextFieldDefaults.kt:1947)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.L;
        } else if (z11) {
            j10 = this.M;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.J : this.K;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> suffixColor$material3_release(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 1575329427)) {
            ComposerKt.traceEventStart(1575329427, i10, -1, "androidx.compose.material3.TextFieldColors.suffixColor (TextFieldDefaults.kt:1972)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.P;
        } else if (z11) {
            j10 = this.Q;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.N : this.O;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> supportingTextColor$material3_release(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 1464709698)) {
            ComposerKt.traceEventStart(1464709698, i10, -1, "androidx.compose.material3.TextFieldColors.supportingTextColor (TextFieldDefaults.kt:1921)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.H;
        } else if (z11) {
            j10 = this.I;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.F : this.G;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> textColor$material3_release(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, 68412911)) {
            ComposerKt.traceEventStart(68412911, i10, -1, "androidx.compose.material3.TextFieldColors.textColor (TextFieldDefaults.kt:1904)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f12027c;
        } else if (z11) {
            j10 = this.f12028d;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.f12025a : this.f12026b;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }

    @Composable
    @NotNull
    public final State<Color> trailingIconColor$material3_release(boolean z10, boolean z11, @NotNull InteractionSource interactionSource, @Nullable Composer composer, int i10) {
        long j10;
        if (androidx.room.a.g(interactionSource, "interactionSource", composer, -109504137)) {
            ComposerKt.traceEventStart(-109504137, i10, -1, "androidx.compose.material3.TextFieldColors.trailingIconColor (TextFieldDefaults.kt:1774)");
        }
        State<Boolean> stateCollectIsFocusedAsState = FocusInteractionKt.collectIsFocusedAsState(interactionSource, composer, (i10 >> 6) & 14);
        if (!z10) {
            j10 = this.f12045v;
        } else if (z11) {
            j10 = this.f12046w;
        } else {
            j10 = stateCollectIsFocusedAsState.getValue().booleanValue() ? this.f12043t : this.f12044u;
        }
        State<Color> stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(Color.m2498boximpl(j10), composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateRememberUpdatedState;
    }
}
