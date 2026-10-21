package androidx.compose.material;

import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidMenu.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aq\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\r2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001aa\u0010\u0017\u001a\u00020\u00012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u001c\u0010\u000e\u001a\u0018\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\u000f¢\u0006\u0002\b\u0011¢\u0006\u0002\b\u0012H\u0007¢\u0006\u0002\u0010\u001f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006 "}, d2 = {"DropdownMenu", "", "expanded", "", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", TypedValues.CycleType.S_WAVE_OFFSET, "Landroidx/compose/ui/unit/DpOffset;", "scrollState", "Landroidx/compose/foundation/ScrollState;", LogKeysKt.PROPERTIES, "Landroidx/compose/ui/window/PopupProperties;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "DropdownMenu-4kj-_NE", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/foundation/ScrollState;Landroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenu-ILWXrKs", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/ui/window/PopupProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DropdownMenuItem", "onClick", "enabled", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "Landroidx/compose/foundation/layout/RowScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidMenu.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,220:1\n154#2:221\n154#2:222\n25#3:223\n25#3:230\n36#3:238\n25#3:245\n1097#4,6:224\n1097#4,6:231\n1097#4,6:239\n1097#4,6:246\n76#5:237\n*S KotlinDebug\n*F\n+ 1 AndroidMenu.android.kt\nandroidx/compose/material/AndroidMenu_androidKt\n*L\n89#1:221\n151#1:222\n156#1:223\n160#1:230\n165#1:238\n208#1:245\n156#1:224,6\n160#1:231,6\n165#1:239,6\n208#1:246,6\n161#1:237\n*E\n"})
public final class AndroidMenu_androidKt {

    /* JADX INFO: compiled from: AndroidMenu.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f6641p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6642q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6643r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f6644s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ PopupProperties f6645t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f6646u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6647w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(boolean z10, Function0<Unit> function0, Modifier modifier, long j10, PopupProperties popupProperties, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f6641p0 = z10;
            this.f6642q0 = function0;
            this.f6643r0 = modifier;
            this.f6644s0 = j10;
            this.f6645t0 = popupProperties;
            this.f6646u0 = function3;
            this.v0 = i10;
            this.f6647w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidMenu_androidKt.m656DropdownMenuILWXrKs(this.f6641p0, this.f6642q0, this.f6643r0, this.f6644s0, this.f6645t0, this.f6646u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f6647w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidMenu.android.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableTransitionState<Boolean> f6648p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f6649q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ScrollState f6650r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6651s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f6652t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f6653u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(MutableTransitionState<Boolean> mutableTransitionState, MutableState<TransformOrigin> mutableState, ScrollState scrollState, Modifier modifier, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f6648p0 = mutableTransitionState;
            this.f6649q0 = mutableState;
            this.f6650r0 = scrollState;
            this.f6651s0 = modifier;
            this.f6652t0 = function3;
            this.f6653u0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-47803778, iIntValue, -1, "androidx.compose.material.DropdownMenu.<anonymous> (AndroidMenu.android.kt:172)");
                }
                MutableTransitionState<Boolean> mutableTransitionState = this.f6648p0;
                MutableState<TransformOrigin> mutableState = this.f6649q0;
                ScrollState scrollState = this.f6650r0;
                Modifier modifier = this.f6651s0;
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.f6652t0;
                int i10 = MutableTransitionState.$stable | 48;
                int i11 = this.f6653u0;
                int i12 = i11 >> 6;
                MenuKt.DropdownMenuContent(mutableTransitionState, mutableState, scrollState, modifier, function3, composer2, i10 | (i12 & 896) | ((i11 << 3) & 7168) | (57344 & i12), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidMenu.android.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f6654p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6655q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6656r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ long f6657s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ScrollState f6658t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ PopupProperties f6659u0;
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6660w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f6661x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(boolean z10, Function0<Unit> function0, Modifier modifier, long j10, ScrollState scrollState, PopupProperties popupProperties, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f6654p0 = z10;
            this.f6655q0 = function0;
            this.f6656r0 = modifier;
            this.f6657s0 = j10;
            this.f6658t0 = scrollState;
            this.f6659u0 = popupProperties;
            this.v0 = function3;
            this.f6660w0 = i10;
            this.f6661x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidMenu_androidKt.m655DropdownMenu4kj_NE(this.f6654p0, this.f6655q0, this.f6656r0, this.f6657s0, this.f6658t0, this.f6659u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6660w0 | 1), this.f6661x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidMenu.android.kt */
    public static final class d extends Lambda implements Function2<IntRect, IntRect, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableState<TransformOrigin> f6662p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(MutableState<TransformOrigin> mutableState) {
            super(2);
            this.f6662p0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(IntRect intRect, IntRect intRect2) {
            IntRect parentBounds = intRect;
            IntRect menuBounds = intRect2;
            Intrinsics.checkNotNullParameter(parentBounds, "parentBounds");
            Intrinsics.checkNotNullParameter(menuBounds, "menuBounds");
            this.f6662p0.setValue(TransformOrigin.m2832boximpl(MenuKt.calculateTransformOrigin(parentBounds, menuBounds)));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidMenu.android.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6663p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6664q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f6665r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f6666s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6667t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6668u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6669w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function0<Unit> function0, Modifier modifier, boolean z10, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f6663p0 = function0;
            this.f6664q0 = modifier;
            this.f6665r0 = z10;
            this.f6666s0 = paddingValues;
            this.f6667t0 = mutableInteractionSource;
            this.f6668u0 = function3;
            this.v0 = i10;
            this.f6669w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AndroidMenu_androidKt.DropdownMenuItem(this.f6663p0, this.f6664q0, this.f6665r0, this.f6666s0, this.f6667t0, this.f6668u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f6669w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x0154  */
    /* JADX WARN: Code duplicated, block: B:107:0x0162  */
    /* JADX WARN: Code duplicated, block: B:110:0x017d  */
    /* JADX WARN: Code duplicated, block: B:113:0x019f  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:120:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:126:0x0240  */
    /* JADX WARN: Code duplicated, block: B:131:0x024f  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:41:0x007b  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DropdownMenu-4kj-_NE, reason: not valid java name */
    public static final void m655DropdownMenu4kj_NE(boolean z10, @NotNull Function0<Unit> onDismissRequest, @Nullable Modifier modifier, long j10, @Nullable ScrollState scrollState, @Nullable PopupProperties popupProperties, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        long jM4410DpOffsetYgX7TsA;
        int i14;
        ScrollState scrollStateRememberScrollState;
        int i15;
        PopupProperties popupProperties2;
        int i16;
        int i17;
        Modifier modifier3;
        long j11;
        Modifier modifier4;
        ScrollState scrollState2;
        int i18;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableTransitionState mutableTransitionState;
        Object objRememberedValue2;
        MutableState mutableState;
        boolean zChanged;
        Object objRememberedValue3;
        Modifier modifier5;
        long j12;
        PopupProperties popupProperties3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2135362555);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        int i19 = i11 & 4;
        if (i19 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                i12 |= 3072;
                jM4410DpOffsetYgX7TsA = j10;
            } else {
                jM4410DpOffsetYgX7TsA = j10;
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(jM4410DpOffsetYgX7TsA)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    scrollStateRememberScrollState = scrollState;
                    int i20 = composerStartRestartGroup.changed(scrollStateRememberScrollState) ? 16384 : 8192;
                    i12 |= i20;
                } else {
                    scrollStateRememberScrollState = scrollState;
                }
                i12 |= i20;
            } else {
                scrollStateRememberScrollState = scrollState;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                    }
                    if ((i12 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i19 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                float f6 = 0;
                                jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f6));
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                            }
                            if (i15 != 0) {
                                popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                                scrollState2 = scrollStateRememberScrollState;
                                j11 = jM4410DpOffsetYgX7TsA;
                                modifier4 = modifier3;
                            } else {
                                j11 = jM4410DpOffsetYgX7TsA;
                                modifier4 = modifier3;
                            }
                            i18 = i12;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableTransitionState = (MutableTransitionState) objRememberedValue;
                            mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue() || ((Boolean) mutableTransitionState.getTargetState()).booleanValue()) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableState = (MutableState) objRememberedValue2;
                                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                                composerStartRestartGroup.startReplaceableGroup(1157296644);
                                zChanged = composerStartRestartGroup.changed(mutableState);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new d(mutableState);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier5 = modifier4;
                            j12 = j11;
                            scrollStateRememberScrollState = scrollState2;
                            popupProperties3 = popupProperties2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier2;
                        }
                        scrollState2 = scrollStateRememberScrollState;
                        i18 = i12;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableTransitionState = (MutableTransitionState) objRememberedValue;
                        mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                        if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue2;
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(mutableState);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new d(mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new d(mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density2, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue2;
                            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(mutableState);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new d(mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new d(mutableState);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density3, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        j12 = j11;
                        scrollStateRememberScrollState = scrollState2;
                        popupProperties3 = popupProperties2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        j12 = jM4410DpOffsetYgX7TsA;
                        popupProperties3 = popupProperties2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, onDismissRequest, modifier5, j12, scrollStateRememberScrollState, popupProperties3, content, i10, i11));
                }
                i17 = 1572864;
                i12 |= i17;
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f10 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f10), Dp.m4389constructorimpl(f10));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f11 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f11), Dp.m4389constructorimpl(f11));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density4, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density5 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density5, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j12 = j11;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f12 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f12), Dp.m4389constructorimpl(f12));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f13 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f13), Dp.m4389constructorimpl(f13));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density6 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density6, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density7 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density7, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j12 = j11;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, onDismissRequest, modifier5, j12, scrollStateRememberScrollState, popupProperties3, content, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            popupProperties2 = popupProperties;
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f14 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f14), Dp.m4389constructorimpl(f14));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f15 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f15), Dp.m4389constructorimpl(f15));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density8 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density8, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density9 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density9, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j12 = j11;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f16 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f16), Dp.m4389constructorimpl(f16));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f17 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f17), Dp.m4389constructorimpl(f17));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density10 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density10, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density11 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density11, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j12 = j11;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, onDismissRequest, modifier5, j12, scrollStateRememberScrollState, popupProperties3, content, i10, i11));
            }
            i17 = 1572864;
            i12 |= i17;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f18 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f18), Dp.m4389constructorimpl(f18));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f19 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f19), Dp.m4389constructorimpl(f19));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density12 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density12, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density13 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density13, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j12 = j11;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f110 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f110), Dp.m4389constructorimpl(f110));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f111 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f111), Dp.m4389constructorimpl(f111));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density14 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density14, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density15 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density15, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j12 = j11;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, onDismissRequest, modifier5, j12, scrollStateRememberScrollState, popupProperties3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            i12 |= 3072;
            jM4410DpOffsetYgX7TsA = j10;
        } else {
            jM4410DpOffsetYgX7TsA = j10;
            if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(jM4410DpOffsetYgX7TsA)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                scrollStateRememberScrollState = scrollState;
                if (composerStartRestartGroup.changed(scrollStateRememberScrollState)) {
                }
                i12 |= i20;
            } else {
                scrollStateRememberScrollState = scrollState;
            }
            i12 |= i20;
        } else {
            scrollStateRememberScrollState = scrollState;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((458752 & i10) == 0) {
                popupProperties2 = popupProperties;
                if (composerStartRestartGroup.changed(popupProperties2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f112 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f112), Dp.m4389constructorimpl(f112));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f113 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f113), Dp.m4389constructorimpl(f113));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density16 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density16, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density17 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density17, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j12 = j11;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f114 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f114), Dp.m4389constructorimpl(f114));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f115 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f115), Dp.m4389constructorimpl(f115));
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                        }
                        if (i15 != 0) {
                            popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            scrollState2 = scrollStateRememberScrollState;
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                        } else {
                            j11 = jM4410DpOffsetYgX7TsA;
                            modifier4 = modifier3;
                            scrollState2 = scrollStateRememberScrollState;
                        }
                    }
                    i18 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableTransitionState = (MutableTransitionState) objRememberedValue;
                    mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                    if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density18 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density18, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue2;
                        Density density19 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(mutableState);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new d(mutableState);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density19, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j12 = j11;
                    scrollStateRememberScrollState = scrollState2;
                    popupProperties3 = popupProperties2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, onDismissRequest, modifier5, j12, scrollStateRememberScrollState, popupProperties3, content, i10, i11));
            }
            i17 = 1572864;
            i12 |= i17;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f116 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f116), Dp.m4389constructorimpl(f116));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f117 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f117), Dp.m4389constructorimpl(f117));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density110, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density111, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j12 = j11;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f118 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f118), Dp.m4389constructorimpl(f118));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f119 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f119), Dp.m4389constructorimpl(f119));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density112 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density112, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density113 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density113, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j12 = j11;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, onDismissRequest, modifier5, j12, scrollStateRememberScrollState, popupProperties3, content, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        popupProperties2 = popupProperties;
        if ((i11 & 64) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f1110 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1110), Dp.m4389constructorimpl(f1110));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f1111 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1111), Dp.m4389constructorimpl(f1111));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density114 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density114, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density115 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density115, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j12 = j11;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f1112 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1112), Dp.m4389constructorimpl(f1112));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f1113 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1113), Dp.m4389constructorimpl(f1113));
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                    }
                    if (i15 != 0) {
                        popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        scrollState2 = scrollStateRememberScrollState;
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                    } else {
                        j11 = jM4410DpOffsetYgX7TsA;
                        modifier4 = modifier3;
                        scrollState2 = scrollStateRememberScrollState;
                    }
                }
                i18 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableTransitionState = (MutableTransitionState) objRememberedValue;
                mutableTransitionState.setTargetState(Boolean.valueOf(z10));
                if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density116 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density116, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue2;
                    Density density117 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(mutableState);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new d(mutableState);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density117, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j12 = j11;
                scrollStateRememberScrollState = scrollState2;
                popupProperties3 = popupProperties2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, onDismissRequest, modifier5, j12, scrollStateRememberScrollState, popupProperties3, content, i10, i11));
        }
        i17 = 1572864;
        i12 |= i17;
        if ((i12 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f1114 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1114), Dp.m4389constructorimpl(f1114));
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    scrollState2 = scrollStateRememberScrollState;
                    j11 = jM4410DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                } else {
                    j11 = jM4410DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                    scrollState2 = scrollStateRememberScrollState;
                }
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f1115 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1115), Dp.m4389constructorimpl(f1115));
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    scrollState2 = scrollStateRememberScrollState;
                    j11 = jM4410DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                } else {
                    j11 = jM4410DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                    scrollState2 = scrollStateRememberScrollState;
                }
            }
            i18 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z10));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density118 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new d(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new d(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density118, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density119 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new d(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new d(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density119, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j12 = j11;
            scrollStateRememberScrollState = scrollState2;
            popupProperties3 = popupProperties2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f1116 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1116), Dp.m4389constructorimpl(f1116));
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    scrollState2 = scrollStateRememberScrollState;
                    j11 = jM4410DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                } else {
                    j11 = jM4410DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                    scrollState2 = scrollStateRememberScrollState;
                }
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f1117 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1117), Dp.m4389constructorimpl(f1117));
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                }
                if (i15 != 0) {
                    popupProperties2 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    scrollState2 = scrollStateRememberScrollState;
                    j11 = jM4410DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                } else {
                    j11 = jM4410DpOffsetYgX7TsA;
                    modifier4 = modifier3;
                    scrollState2 = scrollStateRememberScrollState;
                }
            }
            i18 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2135362555, i18, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:146)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new MutableTransitionState(Boolean.FALSE);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableTransitionState = (MutableTransitionState) objRememberedValue;
            mutableTransitionState.setTargetState(Boolean.valueOf(z10));
            if (((Boolean) mutableTransitionState.getCurrentState()).booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density1110 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new d(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new d(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density1110, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
            } else {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotStateKt.mutableStateOf$default(TransformOrigin.m2832boximpl(TransformOrigin.INSTANCE.m2845getCenterSzJe1aQ()), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue2;
                Density density1111 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(mutableState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new d(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new d(mutableState);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                AndroidPopup_androidKt.Popup(new DropdownMenuPositionProvider(j11, density1111, (Function2) objRememberedValue3, null), onDismissRequest, popupProperties2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -47803778, true, new b(mutableTransitionState, mutableState, scrollState2, modifier4, content, i18)), composerStartRestartGroup, (i18 & 112) | 3072 | ((i18 >> 9) & 896), 0);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j12 = j11;
            scrollStateRememberScrollState = scrollState2;
            popupProperties3 = popupProperties2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(z10, onDismissRequest, modifier5, j12, scrollStateRememberScrollState, popupProperties3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107  */
    /* JADX WARN: Code duplicated, block: B:84:0x010f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:92:0x0157  */
    /* JADX WARN: Code duplicated, block: B:94:? A[RETURN, SYNTHETIC] */
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Replaced by a DropdownMenu function with a ScrollState parameter", replaceWith = @ReplaceWith(expression = "DropdownMenu(expanded,onDismissRequest, modifier, offset, rememberScrollState(), properties, content)", imports = {"androidx.compose.foundation.rememberScrollState"}))
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DropdownMenu-ILWXrKs, reason: not valid java name */
    public static final /* synthetic */ void m656DropdownMenuILWXrKs(boolean z10, Function0 onDismissRequest, Modifier modifier, long j10, PopupProperties popupProperties, Function3 content, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        long j11;
        int i14;
        int i15;
        PopupProperties popupProperties2;
        int i16;
        int i17;
        Modifier modifier3;
        long jM4410DpOffsetYgX7TsA;
        PopupProperties popupProperties3;
        long j12;
        PopupProperties popupProperties4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-840283139);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    j11 = j10;
                    if (composerStartRestartGroup.changed(j11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((57344 & i10) == 0) {
                        popupProperties2 = popupProperties;
                        if (composerStartRestartGroup.changed(popupProperties2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                            if (i18 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                float f6 = 0;
                                jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f6), Dp.m4389constructorimpl(f6));
                            } else {
                                jM4410DpOffsetYgX7TsA = j11;
                            }
                            if (i15 != 0) {
                                popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                            } else {
                                popupProperties3 = popupProperties2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                            }
                            int i19 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                            int i20 = i12 << 3;
                            m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i19 | (458752 & i20) | (i20 & 3670016), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier2 = modifier3;
                            j12 = jM4410DpOffsetYgX7TsA;
                            popupProperties4 = popupProperties3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            j12 = j11;
                            popupProperties4 = popupProperties2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
                    }
                    i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i17;
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f10 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f10), Dp.m4389constructorimpl(f10));
                        } else {
                            jM4410DpOffsetYgX7TsA = j11;
                        }
                        if (i15 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i110 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                        int i21 = i12 << 3;
                        m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i110 | (458752 & i21) | (i21 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j12 = jM4410DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f11 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f11), Dp.m4389constructorimpl(f11));
                        } else {
                            jM4410DpOffsetYgX7TsA = j11;
                        }
                        if (i15 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i111 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                        int i22 = i12 << 3;
                        m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i111 | (458752 & i22) | (i22 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j12 = jM4410DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
                }
                i12 |= 24576;
                popupProperties2 = popupProperties;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f12 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f12), Dp.m4389constructorimpl(f12));
                        } else {
                            jM4410DpOffsetYgX7TsA = j11;
                        }
                        if (i15 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i112 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                        int i23 = i12 << 3;
                        m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i112 | (458752 & i23) | (i23 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j12 = jM4410DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f13 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f13), Dp.m4389constructorimpl(f13));
                        } else {
                            jM4410DpOffsetYgX7TsA = j11;
                        }
                        if (i15 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i113 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                        int i24 = i12 << 3;
                        m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i113 | (458752 & i24) | (i24 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j12 = jM4410DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f14 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f14), Dp.m4389constructorimpl(f14));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i114 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i25 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i114 | (458752 & i25) | (i25 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f15 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f15), Dp.m4389constructorimpl(f15));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i115 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i26 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i115 | (458752 & i26) | (i26 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
            }
            i12 |= 3072;
            j11 = j10;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f16 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f16), Dp.m4389constructorimpl(f16));
                        } else {
                            jM4410DpOffsetYgX7TsA = j11;
                        }
                        if (i15 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i116 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                        int i27 = i12 << 3;
                        m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i116 | (458752 & i27) | (i27 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j12 = jM4410DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f17 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f17), Dp.m4389constructorimpl(f17));
                        } else {
                            jM4410DpOffsetYgX7TsA = j11;
                        }
                        if (i15 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i117 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                        int i28 = i12 << 3;
                        m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i117 | (458752 & i28) | (i28 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j12 = jM4410DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f18 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f18), Dp.m4389constructorimpl(f18));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i118 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i29 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i118 | (458752 & i29) | (i29 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f19 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f19), Dp.m4389constructorimpl(f19));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i119 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i210 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i119 | (458752 & i210) | (i210 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
            }
            i12 |= 24576;
            popupProperties2 = popupProperties;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f110 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f110), Dp.m4389constructorimpl(f110));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i1110 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i211 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1110 | (458752 & i211) | (i211 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f111 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f111), Dp.m4389constructorimpl(f111));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i1111 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i212 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1111 | (458752 & i212) | (i212 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f112 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f112), Dp.m4389constructorimpl(f112));
                } else {
                    jM4410DpOffsetYgX7TsA = j11;
                }
                if (i15 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i1112 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i213 = i12 << 3;
                m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1112 | (458752 & i213) | (i213 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j12 = jM4410DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f113 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f113), Dp.m4389constructorimpl(f113));
                } else {
                    jM4410DpOffsetYgX7TsA = j11;
                }
                if (i15 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i1113 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i214 = i12 << 3;
                m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1113 | (458752 & i214) | (i214 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j12 = jM4410DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                j11 = j10;
                if (composerStartRestartGroup.changed(j11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((57344 & i10) == 0) {
                    popupProperties2 = popupProperties;
                    if (composerStartRestartGroup.changed(popupProperties2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f114 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f114), Dp.m4389constructorimpl(f114));
                        } else {
                            jM4410DpOffsetYgX7TsA = j11;
                        }
                        if (i15 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i1114 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                        int i215 = i12 << 3;
                        m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1114 | (458752 & i215) | (i215 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j12 = jM4410DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    } else {
                        if (i18 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            float f115 = 0;
                            jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f115), Dp.m4389constructorimpl(f115));
                        } else {
                            jM4410DpOffsetYgX7TsA = j11;
                        }
                        if (i15 != 0) {
                            popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                        } else {
                            popupProperties3 = popupProperties2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                        }
                        int i1115 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                        int i216 = i12 << 3;
                        m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1115 | (458752 & i216) | (i216 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier2 = modifier3;
                        j12 = jM4410DpOffsetYgX7TsA;
                        popupProperties4 = popupProperties3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
                }
                i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f116 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f116), Dp.m4389constructorimpl(f116));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i1116 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i217 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1116 | (458752 & i217) | (i217 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f117 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f117), Dp.m4389constructorimpl(f117));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i1117 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i218 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1117 | (458752 & i218) | (i218 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
            }
            i12 |= 24576;
            popupProperties2 = popupProperties;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f118 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f118), Dp.m4389constructorimpl(f118));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i1118 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i219 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1118 | (458752 & i219) | (i219 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f119 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f119), Dp.m4389constructorimpl(f119));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i1119 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i2110 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i1119 | (458752 & i2110) | (i2110 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f1110 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1110), Dp.m4389constructorimpl(f1110));
                } else {
                    jM4410DpOffsetYgX7TsA = j11;
                }
                if (i15 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i11110 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2111 = i12 << 3;
                m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11110 | (458752 & i2111) | (i2111 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j12 = jM4410DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f1111 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1111), Dp.m4389constructorimpl(f1111));
                } else {
                    jM4410DpOffsetYgX7TsA = j11;
                }
                if (i15 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i11111 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2112 = i12 << 3;
                m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11111 | (458752 & i2112) | (i2112 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j12 = jM4410DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
        }
        i12 |= 3072;
        j11 = j10;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((57344 & i10) == 0) {
                popupProperties2 = popupProperties;
                if (composerStartRestartGroup.changed(popupProperties2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f1112 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1112), Dp.m4389constructorimpl(f1112));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i11112 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i2113 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11112 | (458752 & i2113) | (i2113 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                } else {
                    if (i18 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        float f1113 = 0;
                        jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1113), Dp.m4389constructorimpl(f1113));
                    } else {
                        jM4410DpOffsetYgX7TsA = j11;
                    }
                    if (i15 != 0) {
                        popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                    } else {
                        popupProperties3 = popupProperties2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                    }
                    int i11113 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                    int i2114 = i12 << 3;
                    m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11113 | (458752 & i2114) | (i2114 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                    j12 = jM4410DpOffsetYgX7TsA;
                    popupProperties4 = popupProperties3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
            }
            i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f1114 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1114), Dp.m4389constructorimpl(f1114));
                } else {
                    jM4410DpOffsetYgX7TsA = j11;
                }
                if (i15 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i11114 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2115 = i12 << 3;
                m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11114 | (458752 & i2115) | (i2115 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j12 = jM4410DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f1115 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1115), Dp.m4389constructorimpl(f1115));
                } else {
                    jM4410DpOffsetYgX7TsA = j11;
                }
                if (i15 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i11115 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2116 = i12 << 3;
                m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11115 | (458752 & i2116) | (i2116 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j12 = jM4410DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
        }
        i12 |= 24576;
        popupProperties2 = popupProperties;
        if ((i11 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f1116 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1116), Dp.m4389constructorimpl(f1116));
                } else {
                    jM4410DpOffsetYgX7TsA = j11;
                }
                if (i15 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i11116 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2117 = i12 << 3;
                m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11116 | (458752 & i2117) | (i2117 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j12 = jM4410DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            } else {
                if (i18 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    float f1117 = 0;
                    jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1117), Dp.m4389constructorimpl(f1117));
                } else {
                    jM4410DpOffsetYgX7TsA = j11;
                }
                if (i15 != 0) {
                    popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
                } else {
                    popupProperties3 = popupProperties2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
                }
                int i11117 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
                int i2118 = i12 << 3;
                m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11117 | (458752 & i2118) | (i2118 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
                j12 = jM4410DpOffsetYgX7TsA;
                popupProperties4 = popupProperties3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
        }
        i17 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i17;
        if ((374491 & i12) == 74898) {
            if (i18 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                float f1118 = 0;
                jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1118), Dp.m4389constructorimpl(f1118));
            } else {
                jM4410DpOffsetYgX7TsA = j11;
            }
            if (i15 != 0) {
                popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
            } else {
                popupProperties3 = popupProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
            }
            int i11118 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i2119 = i12 << 3;
            m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11118 | (458752 & i2119) | (i2119 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            j12 = jM4410DpOffsetYgX7TsA;
            popupProperties4 = popupProperties3;
        } else {
            if (i18 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                float f1119 = 0;
                jM4410DpOffsetYgX7TsA = DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(f1119), Dp.m4389constructorimpl(f1119));
            } else {
                jM4410DpOffsetYgX7TsA = j11;
            }
            if (i15 != 0) {
                popupProperties3 = new PopupProperties(true, false, false, null, false, false, 62, null);
            } else {
                popupProperties3 = popupProperties2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-840283139, i12, -1, "androidx.compose.material.DropdownMenu (AndroidMenu.android.kt:84)");
            }
            int i11119 = (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168);
            int i21110 = i12 << 3;
            m655DropdownMenu4kj_NE(z10, onDismissRequest, modifier3, jM4410DpOffsetYgX7TsA, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), popupProperties3, content, composerStartRestartGroup, i11119 | (458752 & i21110) | (i21110 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
            j12 = jM4410DpOffsetYgX7TsA;
            popupProperties4 = popupProperties3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(z10, onDismissRequest, modifier2, j12, popupProperties4, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x0141  */
    /* JADX WARN: Code duplicated, block: B:97:0x0150  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void DropdownMenuItem(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable PaddingValues paddingValues, @Nullable MutableInteractionSource mutableInteractionSource, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        PaddingValues paddingValues2;
        int i16;
        int i17;
        MutableInteractionSource mutableInteractionSource2;
        int i18;
        int i19;
        Modifier modifier3;
        boolean z12;
        PaddingValues dropdownMenuItemContentPadding;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        boolean z13;
        PaddingValues paddingValues3;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1988562892);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        paddingValues2 = paddingValues;
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 57344) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            if ((i10 & 458752) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                            }
                            if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                                if (i20 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i13 != 0) {
                                    z12 = true;
                                } else {
                                    z12 = z11;
                                }
                                if (i15 != 0) {
                                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                                } else {
                                    dropdownMenuItemContentPadding = paddingValues2;
                                }
                                if (i17 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                                }
                                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                z13 = z12;
                                paddingValues3 = dropdownMenuItemContentPadding;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier2;
                                z13 = z11;
                                paddingValues3 = paddingValues2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                        }
                        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        i12 |= i19;
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z13 = z12;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z13 = z12;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                    }
                    i12 |= 24576;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z13 = z12;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z13 = z12;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                }
                i12 |= 3072;
                paddingValues2 = paddingValues;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z13 = z12;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z13 = z12;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z13 = z12;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z13 = z12;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= 3072;
            paddingValues2 = paddingValues;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z13 = z12;
                paddingValues3 = dropdownMenuItemContentPadding;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z13 = z12;
                paddingValues3 = dropdownMenuItemContentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z13 = z12;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        } else {
                            if (i20 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i15 != 0) {
                                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                            } else {
                                dropdownMenuItemContentPadding = paddingValues2;
                            }
                            if (i17 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                            }
                            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            z13 = z12;
                            paddingValues3 = dropdownMenuItemContentPadding;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                    }
                    i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= 3072;
            paddingValues2 = paddingValues;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z13 = z12;
                paddingValues3 = dropdownMenuItemContentPadding;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z13 = z12;
                paddingValues3 = dropdownMenuItemContentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    } else {
                        if (i20 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i15 != 0) {
                            dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                        } else {
                            dropdownMenuItemContentPadding = paddingValues2;
                        }
                        if (i17 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                        }
                        MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        z13 = z12;
                        paddingValues3 = dropdownMenuItemContentPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
                }
                i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z13 = z12;
                paddingValues3 = dropdownMenuItemContentPadding;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z13 = z12;
                paddingValues3 = dropdownMenuItemContentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= 3072;
        paddingValues2 = paddingValues;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 57344) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                } else {
                    if (i20 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i15 != 0) {
                        dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                    } else {
                        dropdownMenuItemContentPadding = paddingValues2;
                    }
                    if (i17 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                    }
                    MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    z13 = z12;
                    paddingValues3 = dropdownMenuItemContentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
            }
            i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z13 = z12;
                paddingValues3 = dropdownMenuItemContentPadding;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z13 = z12;
                paddingValues3 = dropdownMenuItemContentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
        }
        i12 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i11 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z13 = z12;
                paddingValues3 = dropdownMenuItemContentPadding;
            } else {
                if (i20 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i15 != 0) {
                    dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
                } else {
                    dropdownMenuItemContentPadding = paddingValues2;
                }
                if (i17 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
                }
                MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                mutableInteractionSource3 = mutableInteractionSource2;
                z13 = z12;
                paddingValues3 = dropdownMenuItemContentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
        }
        i19 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i19;
        if ((374491 & i12) == 74898) {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i15 != 0) {
                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
            } else {
                dropdownMenuItemContentPadding = paddingValues2;
            }
            if (i17 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
            }
            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            mutableInteractionSource3 = mutableInteractionSource2;
            z13 = z12;
            paddingValues3 = dropdownMenuItemContentPadding;
        } else {
            if (i20 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (i15 != 0) {
                dropdownMenuItemContentPadding = MenuDefaults.INSTANCE.getDropdownMenuItemContentPadding();
            } else {
                dropdownMenuItemContentPadding = paddingValues2;
            }
            if (i17 != 0) {
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1988562892, i12, -1, "androidx.compose.material.DropdownMenuItem (AndroidMenu.android.kt:202)");
            }
            MenuKt.DropdownMenuItemContent(onClick, modifier3, z12, dropdownMenuItemContentPadding, mutableInteractionSource2, content, composerStartRestartGroup, (i12 & 14) | (i12 & 112) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            mutableInteractionSource3 = mutableInteractionSource2;
            z13 = z12;
            paddingValues3 = dropdownMenuItemContentPadding;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, z13, paddingValues3, mutableInteractionSource3, content, i10, i11));
    }
}
