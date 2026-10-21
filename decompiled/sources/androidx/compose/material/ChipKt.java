package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Chip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0090\u0001\u0010\u0015\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001aÆ\u0001\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00182\u0015\b\u0002\u0010\u0010\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u0019\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u0015\b\u0002\u0010\u001a\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000f2\u001c\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011¢\u0006\u0002\b\u000f¢\u0006\u0002\b\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006 ²\u0006\f\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002²\u0006\f\u0010\u001f\u001a\u00020\u001d8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/foundation/BorderStroke;", OutlinedTextFieldKt.BorderId, "Landroidx/compose/material/ChipColors;", "colors", "Landroidx/compose/runtime/Composable;", "leadingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "content", "Chip", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/ChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "selected", "Landroidx/compose/material/SelectableChipColors;", "selectedIcon", "trailingIcon", "FilterChip", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/foundation/BorderStroke;Landroidx/compose/material/SelectableChipColors;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "leadingIconContentColor", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,753:1\n25#2:754\n25#2:761\n1097#3,6:755\n1097#3,6:762\n81#4:768\n154#5:769\n154#5:770\n154#5:771\n154#5:772\n154#5:773\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material/ChipKt\n*L\n92#1:754\n189#1:761\n92#1:755,6\n189#1:762,6\n99#1:768\n723#1:769\n728#1:770\n733#1:771\n738#1:772\n753#1:773\n*E\n"})
public final class ChipKt {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f6965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f6966d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f6963a = Dp.m4389constructorimpl(12);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f6964b = Dp.m4389constructorimpl(4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f6967e = Dp.m4389constructorimpl(24);

    /* JADX INFO: compiled from: Chip.kt */
    public static final class a extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6968p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3831getButtono7Vup1c());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Chip.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f6969p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6970q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ ChipColors f6971r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f6972s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f6973t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6974u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(State<Color> state, Function2<? super Composer, ? super Integer, Unit> function2, ChipColors chipColors, boolean z10, int i10, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f6969p0 = state;
            this.f6970q0 = function2;
            this.f6971r0 = chipColors;
            this.f6972s0 = z10;
            this.f6973t0 = i10;
            this.f6974u0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(139076687, iIntValue, -1, "androidx.compose.material.Chip.<anonymous> (Chip.kt:108)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2510getAlphaimpl(ChipKt.access$Chip$lambda$1(this.f6969p0))))}, ComposableLambdaKt.composableLambda(composer2, 667535631, true, new c0(this.f6970q0, this.f6971r0, this.f6972s0, this.f6973t0, this.f6974u0)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Chip.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6975p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6976q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f6977r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6978s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f6979t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ BorderStroke f6980u0;
        public final /* synthetic */ ChipColors v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6981w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6982x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f6983y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<Unit> function0, Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ChipColors chipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f6975p0 = function0;
            this.f6976q0 = modifier;
            this.f6977r0 = z10;
            this.f6978s0 = mutableInteractionSource;
            this.f6979t0 = shape;
            this.f6980u0 = borderStroke;
            this.v0 = chipColors;
            this.f6981w0 = function2;
            this.f6982x0 = function3;
            this.f6983y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ChipKt.Chip(this.f6975p0, this.f6976q0, this.f6977r0, this.f6978s0, this.f6979t0, this.f6980u0, this.v0, this.f6981w0, this.f6982x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6983y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Chip.kt */
    public static final class d extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f6984p0 = new d(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3832getCheckboxo7Vup1c());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Chip.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f6985p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6986q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f6987r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6988s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6989t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6990u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ SelectableChipColors f6991w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ boolean f6992x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f6993y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, int i11, SelectableChipColors selectableChipColors, State state, Function2 function2, Function2 function3, Function2 function4, Function3 function5, boolean z10, boolean z11) {
            super(2);
            this.f6985p0 = state;
            this.f6986q0 = function2;
            this.f6987r0 = z10;
            this.f6988s0 = function3;
            this.f6989t0 = function4;
            this.f6990u0 = function5;
            this.v0 = i10;
            this.f6991w0 = selectableChipColors;
            this.f6992x0 = z11;
            this.f6993y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(722126431, iIntValue, -1, "androidx.compose.material.FilterChip.<anonymous> (Chip.kt:209)");
                }
                ProvidedValue[] providedValueArr = {ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2510getAlphaimpl(this.f6985p0.getValue().m2518unboximpl())))};
                Function2<Composer, Integer, Unit> function2 = this.f6986q0;
                boolean z10 = this.f6987r0;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.composableLambda(composer2, 1582291359, true, new e0(this.v0, this.f6993y0, this.f6991w0, this.f6985p0, function2, this.f6988s0, this.f6989t0, this.f6990u0, z10, this.f6992x0)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Chip.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function2<Composer, Integer, Unit> E0;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> F0;
        public final /* synthetic */ int G0;
        public final /* synthetic */ int H0;
        public final /* synthetic */ int I0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f6994p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6995q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6996r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f6997s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6998t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Shape f6999u0;
        public final /* synthetic */ BorderStroke v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ SelectableChipColors f7000w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7001x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7002y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(boolean z10, Function0<Unit> function0, Modifier modifier, boolean z11, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, SelectableChipColors selectableChipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function5, int i10, int i11, int i12) {
            super(2);
            this.f6994p0 = z10;
            this.f6995q0 = function0;
            this.f6996r0 = modifier;
            this.f6997s0 = z11;
            this.f6998t0 = mutableInteractionSource;
            this.f6999u0 = shape;
            this.v0 = borderStroke;
            this.f7000w0 = selectableChipColors;
            this.f7001x0 = function2;
            this.f7002y0 = function3;
            this.E0 = function4;
            this.F0 = function5;
            this.G0 = i10;
            this.H0 = i11;
            this.I0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ChipKt.FilterChip(this.f6994p0, this.f6995q0, this.f6996r0, this.f6997s0, this.f6998t0, this.f6999u0, this.v0, this.f7000w0, this.f7001x0, this.f7002y0, this.E0, this.F0, composer, RecomposeScopeImplKt.updateChangedFlags(this.G0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.H0), this.I0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 8;
        f6965c = Dp.m4389constructorimpl(f6);
        f6966d = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0136  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:116:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x016c  */
    /* JADX WARN: Code duplicated, block: B:118:0x016f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0173  */
    /* JADX WARN: Code duplicated, block: B:121:0x0175  */
    /* JADX WARN: Code duplicated, block: B:123:0x0179  */
    /* JADX WARN: Code duplicated, block: B:125:0x018b  */
    /* JADX WARN: Code duplicated, block: B:127:0x0198  */
    /* JADX WARN: Code duplicated, block: B:130:0x019d  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:137:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:141:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:147:0x0299  */
    /* JADX WARN: Code duplicated, block: B:152:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:90:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void Chip(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable BorderStroke borderStroke, @Nullable ChipColors chipColors, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        Shape shape2;
        int i17;
        BorderStroke borderStroke2;
        int i18;
        int i19;
        int i20;
        int i21;
        Modifier modifier2;
        boolean z11;
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeCopy;
        ChipColors chipColorsM696chipColors5tl4gsc;
        Function2<? super Composer, ? super Integer, Unit> function3;
        Shape shape3;
        ChipColors chipColors2;
        BorderStroke borderStroke3;
        Modifier modifier3;
        Object objRememberedValue;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape4;
        BorderStroke borderStroke4;
        Function2<? super Composer, ? super Integer, Unit> function4;
        Modifier modifier4;
        ChipColors chipColors3;
        boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i22;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-368396408);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i23 = i11 & 2;
        if (i23 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((57344 & i10) == 0) {
                        if ((i11 & 16) == 0) {
                            shape2 = shape;
                            int i24 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                            i12 |= i24;
                        } else {
                            shape2 = shape;
                        }
                        i12 |= i24;
                    } else {
                        shape2 = shape;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((458752 & i10) == 0) {
                            borderStroke2 = borderStroke;
                            if (composerStartRestartGroup.changed(borderStroke2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        if ((i10 & 3670016) != 0) {
                            if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(chipColors)) {
                                i22 = 524288;
                            } else {
                                i22 = 1048576;
                            }
                            i12 |= i22;
                        }
                        i19 = i11 & 128;
                        if (i19 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 29360128) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 256) != 0) {
                            if ((i10 & 234881024) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                } else {
                                    i21 = 33554432;
                                }
                            }
                            if ((191739611 & i12) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i23 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    } else {
                                        modifier2 = modifier;
                                    }
                                    if (i13 != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = z10;
                                    }
                                    if (i15 != 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                    } else {
                                        mutableInteractionSource3 = mutableInteractionSource2;
                                    }
                                    if ((i11 & 16) != 0) {
                                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                        i12 &= -57345;
                                    } else {
                                        shapeCopy = shape2;
                                    }
                                    if (i17 != 0) {
                                        borderStroke2 = null;
                                    }
                                    if ((i11 & 64) != 0) {
                                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                        i12 &= -3670017;
                                    } else {
                                        chipColorsM696chipColors5tl4gsc = chipColors;
                                    }
                                    if (i19 != 0) {
                                        function3 = null;
                                    } else {
                                        function3 = function2;
                                    }
                                    shape3 = shapeCopy;
                                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                                    borderStroke3 = borderStroke2;
                                    modifier3 = modifier2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i11 & 16) != 0) {
                                        i12 &= -57345;
                                    }
                                    if ((i11 & 64) != 0) {
                                        i12 &= -3670017;
                                    }
                                    z11 = z10;
                                    function3 = function2;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    shape3 = shape2;
                                    borderStroke3 = borderStroke2;
                                    modifier3 = modifier;
                                    chipColors2 = chipColors;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                                }
                                int i25 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                                State<Color> stateContentColor = chipColors2.contentColor(z11, composerStartRestartGroup, i25);
                                ChipColors chipColors4 = chipColors2;
                                boolean z13 = z11;
                                Modifier modifier5 = modifier3;
                                composer2 = composerStartRestartGroup;
                                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i25).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                mutableInteractionSource4 = mutableInteractionSource3;
                                shape4 = shape3;
                                borderStroke4 = borderStroke3;
                                function4 = function3;
                                modifier4 = modifier5;
                                chipColors3 = chipColors4;
                                z12 = z13;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier4 = modifier;
                                z12 = z10;
                                mutableInteractionSource4 = mutableInteractionSource2;
                                shape4 = shape2;
                                borderStroke4 = borderStroke2;
                                composer2 = composerStartRestartGroup;
                                chipColors3 = chipColors;
                                function4 = function2;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                        }
                        i21 = 100663296;
                        i12 |= i21;
                        if ((191739611 & i12) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            } else {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                            }
                            int i26 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                            State<Color> stateContentColor2 = chipColors2.contentColor(z11, composerStartRestartGroup, i26);
                            ChipColors chipColors5 = chipColors2;
                            boolean z14 = z11;
                            Modifier modifier6 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i26).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor2.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor2, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            function4 = function3;
                            modifier4 = modifier6;
                            chipColors3 = chipColors5;
                            z12 = z14;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            } else {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                            }
                            int i27 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                            State<Color> stateContentColor3 = chipColors2.contentColor(z11, composerStartRestartGroup, i27);
                            ChipColors chipColors6 = chipColors2;
                            boolean z15 = z11;
                            Modifier modifier7 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i27).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor3.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor3, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            function4 = function3;
                            modifier4 = modifier7;
                            chipColors3 = chipColors6;
                            z12 = z15;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    borderStroke2 = borderStroke;
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        if ((191739611 & i12) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            } else {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                            }
                            int i28 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                            State<Color> stateContentColor4 = chipColors2.contentColor(z11, composerStartRestartGroup, i28);
                            ChipColors chipColors7 = chipColors2;
                            boolean z16 = z11;
                            Modifier modifier8 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i28).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor4.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor4, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            function4 = function3;
                            modifier4 = modifier8;
                            chipColors3 = chipColors7;
                            z12 = z16;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            } else {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                            }
                            int i29 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                            State<Color> stateContentColor5 = chipColors2.contentColor(z11, composerStartRestartGroup, i29);
                            ChipColors chipColors8 = chipColors2;
                            boolean z17 = z11;
                            Modifier modifier9 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i29).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor5.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor5, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            function4 = function3;
                            modifier4 = modifier9;
                            chipColors3 = chipColors8;
                            z12 = z17;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                    }
                    i21 = 100663296;
                    i12 |= i21;
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i210 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor6 = chipColors2.contentColor(z11, composerStartRestartGroup, i210);
                        ChipColors chipColors9 = chipColors2;
                        boolean z18 = z11;
                        Modifier modifier10 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i210).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor6.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor6, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier10;
                        chipColors3 = chipColors9;
                        z12 = z18;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i211 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor7 = chipColors2.contentColor(z11, composerStartRestartGroup, i211);
                        ChipColors chipColors10 = chipColors2;
                        boolean z19 = z11;
                        Modifier modifier11 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor7.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor7, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier11;
                        chipColors3 = chipColors10;
                        z12 = z19;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                }
                i12 |= 3072;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i12 |= i24;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((458752 & i10) == 0) {
                        borderStroke2 = borderStroke;
                        if (composerStartRestartGroup.changed(borderStroke2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        if ((191739611 & i12) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            } else {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                            }
                            int i212 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                            State<Color> stateContentColor8 = chipColors2.contentColor(z11, composerStartRestartGroup, i212);
                            ChipColors chipColors11 = chipColors2;
                            boolean z110 = z11;
                            Modifier modifier12 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i212).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor8.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor8, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            function4 = function3;
                            modifier4 = modifier12;
                            chipColors3 = chipColors11;
                            z12 = z110;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            } else {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                            }
                            int i213 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                            State<Color> stateContentColor9 = chipColors2.contentColor(z11, composerStartRestartGroup, i213);
                            ChipColors chipColors12 = chipColors2;
                            boolean z111 = z11;
                            Modifier modifier13 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i213).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor9.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor9, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            function4 = function3;
                            modifier4 = modifier13;
                            chipColors3 = chipColors12;
                            z12 = z111;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                    }
                    i21 = 100663296;
                    i12 |= i21;
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i214 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor10 = chipColors2.contentColor(z11, composerStartRestartGroup, i214);
                        ChipColors chipColors13 = chipColors2;
                        boolean z112 = z11;
                        Modifier modifier14 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i214).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor10.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor10, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier14;
                        chipColors3 = chipColors13;
                        z12 = z112;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i215 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor11 = chipColors2.contentColor(z11, composerStartRestartGroup, i215);
                        ChipColors chipColors14 = chipColors2;
                        boolean z113 = z11;
                        Modifier modifier15 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i215).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier15;
                        chipColors3 = chipColors14;
                        z12 = z113;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                borderStroke2 = borderStroke;
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i216 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor12 = chipColors2.contentColor(z11, composerStartRestartGroup, i216);
                        ChipColors chipColors15 = chipColors2;
                        boolean z114 = z11;
                        Modifier modifier16 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i216).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor12.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor12, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier16;
                        chipColors3 = chipColors15;
                        z12 = z114;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i217 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor13 = chipColors2.contentColor(z11, composerStartRestartGroup, i217);
                        ChipColors chipColors16 = chipColors2;
                        boolean z115 = z11;
                        Modifier modifier17 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i217).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor13.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor13, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier17;
                        chipColors3 = chipColors16;
                        z12 = z115;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                }
                i21 = 100663296;
                i12 |= i21;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i218 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor14 = chipColors2.contentColor(z11, composerStartRestartGroup, i218);
                    ChipColors chipColors17 = chipColors2;
                    boolean z116 = z11;
                    Modifier modifier18 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i218).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor14.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor14, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier18;
                    chipColors3 = chipColors17;
                    z12 = z116;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i219 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor15 = chipColors2.contentColor(z11, composerStartRestartGroup, i219);
                    ChipColors chipColors18 = chipColors2;
                    boolean z117 = z11;
                    Modifier modifier19 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i219).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor15.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor15, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier19;
                    chipColors3 = chipColors18;
                    z12 = z117;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i12 |= i24;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((458752 & i10) == 0) {
                        borderStroke2 = borderStroke;
                        if (composerStartRestartGroup.changed(borderStroke2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        if ((191739611 & i12) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            } else {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                            }
                            int i2110 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                            State<Color> stateContentColor16 = chipColors2.contentColor(z11, composerStartRestartGroup, i2110);
                            ChipColors chipColors19 = chipColors2;
                            boolean z118 = z11;
                            Modifier modifier110 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2110).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor16.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor16, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            function4 = function3;
                            modifier4 = modifier110;
                            chipColors3 = chipColors19;
                            z12 = z118;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            } else {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                            }
                            int i2111 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                            State<Color> stateContentColor17 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111);
                            ChipColors chipColors110 = chipColors2;
                            boolean z119 = z11;
                            Modifier modifier111 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor17.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor17, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            function4 = function3;
                            modifier4 = modifier111;
                            chipColors3 = chipColors110;
                            z12 = z119;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                    }
                    i21 = 100663296;
                    i12 |= i21;
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i2112 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor18 = chipColors2.contentColor(z11, composerStartRestartGroup, i2112);
                        ChipColors chipColors111 = chipColors2;
                        boolean z1110 = z11;
                        Modifier modifier112 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2112).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor18.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor18, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier112;
                        chipColors3 = chipColors111;
                        z12 = z1110;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i2113 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor19 = chipColors2.contentColor(z11, composerStartRestartGroup, i2113);
                        ChipColors chipColors112 = chipColors2;
                        boolean z1111 = z11;
                        Modifier modifier113 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2113).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor19.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor19, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier113;
                        chipColors3 = chipColors112;
                        z12 = z1111;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                borderStroke2 = borderStroke;
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i2114 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor110 = chipColors2.contentColor(z11, composerStartRestartGroup, i2114);
                        ChipColors chipColors113 = chipColors2;
                        boolean z1112 = z11;
                        Modifier modifier114 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2114).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor110, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier114;
                        chipColors3 = chipColors113;
                        z12 = z1112;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i2115 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor111 = chipColors2.contentColor(z11, composerStartRestartGroup, i2115);
                        ChipColors chipColors114 = chipColors2;
                        boolean z1113 = z11;
                        Modifier modifier115 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2115).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier115;
                        chipColors3 = chipColors114;
                        z12 = z1113;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                }
                i21 = 100663296;
                i12 |= i21;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i2116 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor112 = chipColors2.contentColor(z11, composerStartRestartGroup, i2116);
                    ChipColors chipColors115 = chipColors2;
                    boolean z1114 = z11;
                    Modifier modifier116 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2116).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor112, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier116;
                    chipColors3 = chipColors115;
                    z12 = z1114;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i2117 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor113 = chipColors2.contentColor(z11, composerStartRestartGroup, i2117);
                    ChipColors chipColors116 = chipColors2;
                    boolean z1115 = z11;
                    Modifier modifier117 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2117).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor113.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor113, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier117;
                    chipColors3 = chipColors116;
                    z12 = z1115;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
            }
            i12 |= 3072;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((458752 & i10) == 0) {
                    borderStroke2 = borderStroke;
                    if (composerStartRestartGroup.changed(borderStroke2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i2118 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor114 = chipColors2.contentColor(z11, composerStartRestartGroup, i2118);
                        ChipColors chipColors117 = chipColors2;
                        boolean z1116 = z11;
                        Modifier modifier118 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2118).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor114.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor114, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier118;
                        chipColors3 = chipColors117;
                        z12 = z1116;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i2119 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor115 = chipColors2.contentColor(z11, composerStartRestartGroup, i2119);
                        ChipColors chipColors118 = chipColors2;
                        boolean z1117 = z11;
                        Modifier modifier119 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2119).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor115.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor115, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier119;
                        chipColors3 = chipColors118;
                        z12 = z1117;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                }
                i21 = 100663296;
                i12 |= i21;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i21110 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor116 = chipColors2.contentColor(z11, composerStartRestartGroup, i21110);
                    ChipColors chipColors119 = chipColors2;
                    boolean z1118 = z11;
                    Modifier modifier1110 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21110).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor116.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor116, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier1110;
                    chipColors3 = chipColors119;
                    z12 = z1118;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i21111 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor117 = chipColors2.contentColor(z11, composerStartRestartGroup, i21111);
                    ChipColors chipColors1110 = chipColors2;
                    boolean z1119 = z11;
                    Modifier modifier1111 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21111).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor117.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor117, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier1111;
                    chipColors3 = chipColors1110;
                    z12 = z1119;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            borderStroke2 = borderStroke;
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i21 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i21112 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor118 = chipColors2.contentColor(z11, composerStartRestartGroup, i21112);
                    ChipColors chipColors1111 = chipColors2;
                    boolean z11110 = z11;
                    Modifier modifier1112 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21112).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor118.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor118, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier1112;
                    chipColors3 = chipColors1111;
                    z12 = z11110;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i21113 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor119 = chipColors2.contentColor(z11, composerStartRestartGroup, i21113);
                    ChipColors chipColors1112 = chipColors2;
                    boolean z11111 = z11;
                    Modifier modifier1113 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21113).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor119.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor119, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier1113;
                    chipColors3 = chipColors1112;
                    z12 = z11111;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
            }
            i21 = 100663296;
            i12 |= i21;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                }
                int i21114 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                State<Color> stateContentColor1110 = chipColors2.contentColor(z11, composerStartRestartGroup, i21114);
                ChipColors chipColors1113 = chipColors2;
                boolean z11112 = z11;
                Modifier modifier1114 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21114).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1110, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function4 = function3;
                modifier4 = modifier1114;
                chipColors3 = chipColors1113;
                z12 = z11112;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                }
                int i21115 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                State<Color> stateContentColor1111 = chipColors2.contentColor(z11, composerStartRestartGroup, i21115);
                ChipColors chipColors1114 = chipColors2;
                boolean z11113 = z11;
                Modifier modifier1115 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21115).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1111.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1111, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function4 = function3;
                modifier4 = modifier1115;
                chipColors3 = chipColors1114;
                z12 = z11113;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                        }
                        i12 |= i24;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((458752 & i10) == 0) {
                        borderStroke2 = borderStroke;
                        if (composerStartRestartGroup.changed(borderStroke2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i22 = 524288;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i21 = 33554432;
                            }
                        }
                        if ((191739611 & i12) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            } else {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                            }
                            int i21116 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                            State<Color> stateContentColor1112 = chipColors2.contentColor(z11, composerStartRestartGroup, i21116);
                            ChipColors chipColors1115 = chipColors2;
                            boolean z11114 = z11;
                            Modifier modifier1116 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21116).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1112, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            function4 = function3;
                            modifier4 = modifier1116;
                            chipColors3 = chipColors1115;
                            z12 = z11114;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            } else {
                                if (i23 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if (i15 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                }
                                if ((i11 & 16) != 0) {
                                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                    i12 &= -57345;
                                } else {
                                    shapeCopy = shape2;
                                }
                                if (i17 != 0) {
                                    borderStroke2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                    i12 &= -3670017;
                                } else {
                                    chipColorsM696chipColors5tl4gsc = chipColors;
                                }
                                if (i19 != 0) {
                                    function3 = null;
                                } else {
                                    function3 = function2;
                                }
                                shape3 = shapeCopy;
                                chipColors2 = chipColorsM696chipColors5tl4gsc;
                                borderStroke3 = borderStroke2;
                                modifier3 = modifier2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                            }
                            int i21117 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                            State<Color> stateContentColor1113 = chipColors2.contentColor(z11, composerStartRestartGroup, i21117);
                            ChipColors chipColors1116 = chipColors2;
                            boolean z11115 = z11;
                            Modifier modifier1117 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21117).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1113.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1113, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape4 = shape3;
                            borderStroke4 = borderStroke3;
                            function4 = function3;
                            modifier4 = modifier1117;
                            chipColors3 = chipColors1116;
                            z12 = z11115;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                    }
                    i21 = 100663296;
                    i12 |= i21;
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i21118 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor1114 = chipColors2.contentColor(z11, composerStartRestartGroup, i21118);
                        ChipColors chipColors1117 = chipColors2;
                        boolean z11116 = z11;
                        Modifier modifier1118 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21118).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1114.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1114, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier1118;
                        chipColors3 = chipColors1117;
                        z12 = z11116;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i21119 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor1115 = chipColors2.contentColor(z11, composerStartRestartGroup, i21119);
                        ChipColors chipColors1118 = chipColors2;
                        boolean z11117 = z11;
                        Modifier modifier1119 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21119).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1115.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1115, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier1119;
                        chipColors3 = chipColors1118;
                        z12 = z11117;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                borderStroke2 = borderStroke;
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i211110 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor1116 = chipColors2.contentColor(z11, composerStartRestartGroup, i211110);
                        ChipColors chipColors1119 = chipColors2;
                        boolean z11118 = z11;
                        Modifier modifier11110 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211110).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1116.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1116, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier11110;
                        chipColors3 = chipColors1119;
                        z12 = z11118;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i211111 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor1117 = chipColors2.contentColor(z11, composerStartRestartGroup, i211111);
                        ChipColors chipColors11110 = chipColors2;
                        boolean z11119 = z11;
                        Modifier modifier11111 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211111).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1117.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1117, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier11111;
                        chipColors3 = chipColors11110;
                        z12 = z11119;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                }
                i21 = 100663296;
                i12 |= i21;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i211112 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor1118 = chipColors2.contentColor(z11, composerStartRestartGroup, i211112);
                    ChipColors chipColors11111 = chipColors2;
                    boolean z111110 = z11;
                    Modifier modifier11112 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211112).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1118.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1118, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier11112;
                    chipColors3 = chipColors11111;
                    z12 = z111110;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i211113 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor1119 = chipColors2.contentColor(z11, composerStartRestartGroup, i211113);
                    ChipColors chipColors11112 = chipColors2;
                    boolean z111111 = z11;
                    Modifier modifier11113 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211113).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1119.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1119, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier11113;
                    chipColors3 = chipColors11112;
                    z12 = z111111;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
            }
            i12 |= 3072;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((458752 & i10) == 0) {
                    borderStroke2 = borderStroke;
                    if (composerStartRestartGroup.changed(borderStroke2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i211114 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor11110 = chipColors2.contentColor(z11, composerStartRestartGroup, i211114);
                        ChipColors chipColors11113 = chipColors2;
                        boolean z111112 = z11;
                        Modifier modifier11114 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211114).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11110, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier11114;
                        chipColors3 = chipColors11113;
                        z12 = z111112;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i211115 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor11111 = chipColors2.contentColor(z11, composerStartRestartGroup, i211115);
                        ChipColors chipColors11114 = chipColors2;
                        boolean z111113 = z11;
                        Modifier modifier11115 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211115).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11111.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11111, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier11115;
                        chipColors3 = chipColors11114;
                        z12 = z111113;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                }
                i21 = 100663296;
                i12 |= i21;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i211116 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor11112 = chipColors2.contentColor(z11, composerStartRestartGroup, i211116);
                    ChipColors chipColors11115 = chipColors2;
                    boolean z111114 = z11;
                    Modifier modifier11116 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211116).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11112, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier11116;
                    chipColors3 = chipColors11115;
                    z12 = z111114;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i211117 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor11113 = chipColors2.contentColor(z11, composerStartRestartGroup, i211117);
                    ChipColors chipColors11116 = chipColors2;
                    boolean z111115 = z11;
                    Modifier modifier11117 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211117).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11113.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11113, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier11117;
                    chipColors3 = chipColors11116;
                    z12 = z111115;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            borderStroke2 = borderStroke;
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i21 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i211118 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor11114 = chipColors2.contentColor(z11, composerStartRestartGroup, i211118);
                    ChipColors chipColors11117 = chipColors2;
                    boolean z111116 = z11;
                    Modifier modifier11118 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211118).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11114.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11114, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier11118;
                    chipColors3 = chipColors11117;
                    z12 = z111116;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i211119 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor11115 = chipColors2.contentColor(z11, composerStartRestartGroup, i211119);
                    ChipColors chipColors11118 = chipColors2;
                    boolean z111117 = z11;
                    Modifier modifier11119 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i211119).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11115.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11115, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier11119;
                    chipColors3 = chipColors11118;
                    z12 = z111117;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
            }
            i21 = 100663296;
            i12 |= i21;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                }
                int i2111110 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                State<Color> stateContentColor11116 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111110);
                ChipColors chipColors11119 = chipColors2;
                boolean z111118 = z11;
                Modifier modifier111110 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111110).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11116.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11116, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function4 = function3;
                modifier4 = modifier111110;
                chipColors3 = chipColors11119;
                z12 = z111118;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                }
                int i2111111 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                State<Color> stateContentColor11117 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111111);
                ChipColors chipColors111110 = chipColors2;
                boolean z111119 = z11;
                Modifier modifier111111 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111111).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11117.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11117, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function4 = function3;
                modifier4 = modifier111111;
                chipColors3 = chipColors111110;
                z12 = z111119;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i24;
                } else {
                    shape2 = shape;
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((458752 & i10) == 0) {
                    borderStroke2 = borderStroke;
                    if (composerStartRestartGroup.changed(borderStroke2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i22 = 524288;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i21 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i2111112 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor11118 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111112);
                        ChipColors chipColors111111 = chipColors2;
                        boolean z1111110 = z11;
                        Modifier modifier111112 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111112).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11118.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11118, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier111112;
                        chipColors3 = chipColors111111;
                        z12 = z1111110;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        } else {
                            if (i23 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if (i15 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource3 = mutableInteractionSource2;
                            }
                            if ((i11 & 16) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i12 &= -57345;
                            } else {
                                shapeCopy = shape2;
                            }
                            if (i17 != 0) {
                                borderStroke2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                                i12 &= -3670017;
                            } else {
                                chipColorsM696chipColors5tl4gsc = chipColors;
                            }
                            if (i19 != 0) {
                                function3 = null;
                            } else {
                                function3 = function2;
                            }
                            shape3 = shapeCopy;
                            chipColors2 = chipColorsM696chipColors5tl4gsc;
                            borderStroke3 = borderStroke2;
                            modifier3 = modifier2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                        }
                        int i2111113 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                        State<Color> stateContentColor11119 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111113);
                        ChipColors chipColors111112 = chipColors2;
                        boolean z1111111 = z11;
                        Modifier modifier111113 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111113).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor11119.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor11119, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape4 = shape3;
                        borderStroke4 = borderStroke3;
                        function4 = function3;
                        modifier4 = modifier111113;
                        chipColors3 = chipColors111112;
                        z12 = z1111111;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
                }
                i21 = 100663296;
                i12 |= i21;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i2111114 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor111110 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111114);
                    ChipColors chipColors111113 = chipColors2;
                    boolean z1111112 = z11;
                    Modifier modifier111114 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111114).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111110, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier111114;
                    chipColors3 = chipColors111113;
                    z12 = z1111112;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i2111115 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor111111 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111115);
                    ChipColors chipColors111114 = chipColors2;
                    boolean z1111113 = z11;
                    Modifier modifier111115 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111115).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111111.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111111, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier111115;
                    chipColors3 = chipColors111114;
                    z12 = z1111113;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            borderStroke2 = borderStroke;
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i21 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i2111116 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor111112 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111116);
                    ChipColors chipColors111115 = chipColors2;
                    boolean z1111114 = z11;
                    Modifier modifier111116 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111116).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111112, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier111116;
                    chipColors3 = chipColors111115;
                    z12 = z1111114;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i2111117 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor111113 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111117);
                    ChipColors chipColors111116 = chipColors2;
                    boolean z1111115 = z11;
                    Modifier modifier111117 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111117).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111113.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111113, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier111117;
                    chipColors3 = chipColors111116;
                    z12 = z1111115;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
            }
            i21 = 100663296;
            i12 |= i21;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                }
                int i2111118 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                State<Color> stateContentColor111114 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111118);
                ChipColors chipColors111117 = chipColors2;
                boolean z1111116 = z11;
                Modifier modifier111118 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111118).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111114.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111114, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function4 = function3;
                modifier4 = modifier111118;
                chipColors3 = chipColors111117;
                z12 = z1111116;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                }
                int i2111119 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                State<Color> stateContentColor111115 = chipColors2.contentColor(z11, composerStartRestartGroup, i2111119);
                ChipColors chipColors111118 = chipColors2;
                boolean z1111117 = z11;
                Modifier modifier111119 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i2111119).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111115.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111115, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function4 = function3;
                modifier4 = modifier111119;
                chipColors3 = chipColors111118;
                z12 = z1111117;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
        }
        i12 |= 3072;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i24;
            } else {
                shape2 = shape;
            }
            i12 |= i24;
        } else {
            shape2 = shape;
        }
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((458752 & i10) == 0) {
                borderStroke2 = borderStroke;
                if (composerStartRestartGroup.changed(borderStroke2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i22 = 524288;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i21 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i21111110 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor111116 = chipColors2.contentColor(z11, composerStartRestartGroup, i21111110);
                    ChipColors chipColors111119 = chipColors2;
                    boolean z1111118 = z11;
                    Modifier modifier1111110 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21111110).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111116.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111116, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier1111110;
                    chipColors3 = chipColors111119;
                    z12 = z1111118;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    } else {
                        if (i23 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if (i15 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                        if ((i11 & 16) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i12 &= -57345;
                        } else {
                            shapeCopy = shape2;
                        }
                        if (i17 != 0) {
                            borderStroke2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                            i12 &= -3670017;
                        } else {
                            chipColorsM696chipColors5tl4gsc = chipColors;
                        }
                        if (i19 != 0) {
                            function3 = null;
                        } else {
                            function3 = function2;
                        }
                        shape3 = shapeCopy;
                        chipColors2 = chipColorsM696chipColors5tl4gsc;
                        borderStroke3 = borderStroke2;
                        modifier3 = modifier2;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                    }
                    int i21111111 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                    State<Color> stateContentColor111117 = chipColors2.contentColor(z11, composerStartRestartGroup, i21111111);
                    ChipColors chipColors1111110 = chipColors2;
                    boolean z1111119 = z11;
                    Modifier modifier1111111 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21111111).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111117.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111117, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape4 = shape3;
                    borderStroke4 = borderStroke3;
                    function4 = function3;
                    modifier4 = modifier1111111;
                    chipColors3 = chipColors1111110;
                    z12 = z1111119;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
            }
            i21 = 100663296;
            i12 |= i21;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                }
                int i21111112 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                State<Color> stateContentColor111118 = chipColors2.contentColor(z11, composerStartRestartGroup, i21111112);
                ChipColors chipColors1111111 = chipColors2;
                boolean z11111110 = z11;
                Modifier modifier1111112 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21111112).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111118.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111118, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function4 = function3;
                modifier4 = modifier1111112;
                chipColors3 = chipColors1111111;
                z12 = z11111110;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                }
                int i21111113 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                State<Color> stateContentColor111119 = chipColors2.contentColor(z11, composerStartRestartGroup, i21111113);
                ChipColors chipColors1111112 = chipColors2;
                boolean z11111111 = z11;
                Modifier modifier1111113 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21111113).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor111119.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor111119, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function4 = function3;
                modifier4 = modifier1111113;
                chipColors3 = chipColors1111112;
                z12 = z11111111;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        borderStroke2 = borderStroke;
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i22 = 524288;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        if ((i11 & 256) != 0) {
            if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i21 = 33554432;
                }
            }
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                }
                int i21111114 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                State<Color> stateContentColor1111110 = chipColors2.contentColor(z11, composerStartRestartGroup, i21111114);
                ChipColors chipColors1111113 = chipColors2;
                boolean z11111112 = z11;
                Modifier modifier1111114 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21111114).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1111110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1111110, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function4 = function3;
                modifier4 = modifier1111114;
                chipColors3 = chipColors1111113;
                z12 = z11111112;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                } else {
                    if (i23 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (i15 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    if ((i11 & 16) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i12 &= -57345;
                    } else {
                        shapeCopy = shape2;
                    }
                    if (i17 != 0) {
                        borderStroke2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                        i12 &= -3670017;
                    } else {
                        chipColorsM696chipColors5tl4gsc = chipColors;
                    }
                    if (i19 != 0) {
                        function3 = null;
                    } else {
                        function3 = function2;
                    }
                    shape3 = shapeCopy;
                    chipColors2 = chipColorsM696chipColors5tl4gsc;
                    borderStroke3 = borderStroke2;
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
                }
                int i21111115 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
                State<Color> stateContentColor1111111 = chipColors2.contentColor(z11, composerStartRestartGroup, i21111115);
                ChipColors chipColors1111114 = chipColors2;
                boolean z11111113 = z11;
                Modifier modifier1111115 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21111115).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1111111.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1111111, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource3;
                shape4 = shape3;
                borderStroke4 = borderStroke3;
                function4 = function3;
                modifier4 = modifier1111115;
                chipColors3 = chipColors1111114;
                z12 = z11111113;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
        }
        i21 = 100663296;
        i12 |= i21;
        if ((191739611 & i12) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 16) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i12 &= -57345;
                } else {
                    shapeCopy = shape2;
                }
                if (i17 != 0) {
                    borderStroke2 = null;
                }
                if ((i11 & 64) != 0) {
                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    chipColorsM696chipColors5tl4gsc = chipColors;
                }
                if (i19 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                shape3 = shapeCopy;
                chipColors2 = chipColorsM696chipColors5tl4gsc;
                borderStroke3 = borderStroke2;
                modifier3 = modifier2;
            } else {
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 16) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i12 &= -57345;
                } else {
                    shapeCopy = shape2;
                }
                if (i17 != 0) {
                    borderStroke2 = null;
                }
                if ((i11 & 64) != 0) {
                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    chipColorsM696chipColors5tl4gsc = chipColors;
                }
                if (i19 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                shape3 = shapeCopy;
                chipColors2 = chipColorsM696chipColors5tl4gsc;
                borderStroke3 = borderStroke2;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
            }
            int i21111116 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
            State<Color> stateContentColor1111112 = chipColors2.contentColor(z11, composerStartRestartGroup, i21111116);
            ChipColors chipColors1111115 = chipColors2;
            boolean z11111114 = z11;
            Modifier modifier1111116 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21111116).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1111112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1111112, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource4 = mutableInteractionSource3;
            shape4 = shape3;
            borderStroke4 = borderStroke3;
            function4 = function3;
            modifier4 = modifier1111116;
            chipColors3 = chipColors1111115;
            z12 = z11111114;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 16) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i12 &= -57345;
                } else {
                    shapeCopy = shape2;
                }
                if (i17 != 0) {
                    borderStroke2 = null;
                }
                if ((i11 & 64) != 0) {
                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    chipColorsM696chipColors5tl4gsc = chipColors;
                }
                if (i19 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                shape3 = shapeCopy;
                chipColors2 = chipColorsM696chipColors5tl4gsc;
                borderStroke3 = borderStroke2;
                modifier3 = modifier2;
            } else {
                if (i23 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (i15 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                if ((i11 & 16) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i12 &= -57345;
                } else {
                    shapeCopy = shape2;
                }
                if (i17 != 0) {
                    borderStroke2 = null;
                }
                if ((i11 & 64) != 0) {
                    chipColorsM696chipColors5tl4gsc = ChipDefaults.INSTANCE.m696chipColors5tl4gsc(0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 1572864, 63);
                    i12 &= -3670017;
                } else {
                    chipColorsM696chipColors5tl4gsc = chipColors;
                }
                if (i19 != 0) {
                    function3 = null;
                } else {
                    function3 = function2;
                }
                shape3 = shapeCopy;
                chipColors2 = chipColorsM696chipColors5tl4gsc;
                borderStroke3 = borderStroke2;
                modifier3 = modifier2;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-368396408, i12, -1, "androidx.compose.material.Chip (Chip.kt:87)");
            }
            int i21111117 = ((i12 >> 6) & 14) | ((i12 >> 15) & 112);
            State<Color> stateContentColor1111113 = chipColors2.contentColor(z11, composerStartRestartGroup, i21111117);
            ChipColors chipColors1111116 = chipColors2;
            boolean z11111115 = z11;
            Modifier modifier1111117 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, a.f6968p0, 1, null), z11, shape3, chipColors2.backgroundColor(z11, composerStartRestartGroup, i21111117).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor1111113.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke3, 0.0f, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 139076687, true, new b(stateContentColor1111113, function3, chipColors2, z11, i12, content)), composer2, (i12 & 14) | 805306368 | (i12 & 896) | ((i12 >> 3) & 7168) | ((i12 << 3) & 3670016) | ((i12 << 15) & 234881024), 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource4 = mutableInteractionSource3;
            shape4 = shape3;
            borderStroke4 = borderStroke3;
            function4 = function3;
            modifier4 = modifier1111117;
            chipColors3 = chipColors1111116;
            z12 = z11111115;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(onClick, modifier4, z12, mutableInteractionSource4, shape4, borderStroke4, chipColors3, function4, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:101:0x012e  */
    /* JADX WARN: Code duplicated, block: B:103:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:108:0x013f  */
    /* JADX WARN: Code duplicated, block: B:109:0x0144  */
    /* JADX WARN: Code duplicated, block: B:111:0x014a  */
    /* JADX WARN: Code duplicated, block: B:113:0x0150  */
    /* JADX WARN: Code duplicated, block: B:114:0x0153  */
    /* JADX WARN: Code duplicated, block: B:116:0x0158  */
    /* JADX WARN: Code duplicated, block: B:119:0x015e  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:122:0x0165  */
    /* JADX WARN: Code duplicated, block: B:124:0x016b  */
    /* JADX WARN: Code duplicated, block: B:125:0x016e  */
    /* JADX WARN: Code duplicated, block: B:127:0x0173  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x01db  */
    /* JADX WARN: Code duplicated, block: B:150:0x01de  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:154:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:158:0x0204  */
    /* JADX WARN: Code duplicated, block: B:161:0x020a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0222  */
    /* JADX WARN: Code duplicated, block: B:164:0x0226  */
    /* JADX WARN: Code duplicated, block: B:165:0x0228  */
    /* JADX WARN: Code duplicated, block: B:168:0x0230  */
    /* JADX WARN: Code duplicated, block: B:169:0x0254  */
    /* JADX WARN: Code duplicated, block: B:171:0x0258  */
    /* JADX WARN: Code duplicated, block: B:172:0x025a  */
    /* JADX WARN: Code duplicated, block: B:174:0x025e  */
    /* JADX WARN: Code duplicated, block: B:175:0x0260  */
    /* JADX WARN: Code duplicated, block: B:177:0x0264  */
    /* JADX WARN: Code duplicated, block: B:179:0x0276  */
    /* JADX WARN: Code duplicated, block: B:182:0x028d  */
    /* JADX WARN: Code duplicated, block: B:185:0x034a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0366  */
    /* JADX WARN: Code duplicated, block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0106  */
    /* JADX WARN: Code duplicated, block: B:91:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:98:0x0121  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    @Composable
    @ExperimentalMaterialApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void FilterChip(boolean z10, @NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z11, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, @Nullable BorderStroke borderStroke, @Nullable SelectableChipColors selectableChipColors, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11, int i12) {
        int i13;
        int i14;
        boolean z12;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Modifier modifier2;
        MutableInteractionSource mutableInteractionSource2;
        Shape shapeCopy;
        BorderStroke borderStroke2;
        SelectableChipColors selectableChipColorsM697filterChipColorsJ08w3E;
        Function2<? super Composer, ? super Integer, Unit> function5;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Modifier modifier3;
        SelectableChipColors selectableChipColors2;
        int i29;
        Object objRememberedValue;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        BorderStroke borderStroke3;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Function2<? super Composer, ? super Integer, Unit> function9;
        Function2<? super Composer, ? super Integer, Unit> function10;
        SelectableChipColors selectableChipColors3;
        boolean z13;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i30;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1259208246);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(z10) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i10 & 112) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i31 = i12 & 4;
        if (i31 == 0) {
            if ((i10 & 896) == 0) {
                i13 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i10 & 7168) == 0) {
                    z12 = z11;
                    if (composerStartRestartGroup.changed(z12)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    i13 |= 24576;
                } else if ((i10 & 57344) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i10 & 458752) != 0) {
                    if ((i12 & 32) == 0 || !composerStartRestartGroup.changed(shape)) {
                        i30 = 65536;
                    } else {
                        i30 = 131072;
                    }
                    i13 |= i30;
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
                if ((i10 & 29360128) != 0) {
                    i13 |= ((i12 & 128) == 0 || !composerStartRestartGroup.changed(selectableChipColors)) ? 4194304 : 8388608;
                }
                i20 = i12 & 256;
                if (i20 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i21 = 33554432;
                    }
                    i13 |= i21;
                }
                i22 = i12 & 512;
                if (i22 != 0) {
                    i13 |= 805306368;
                } else if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i23 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i23 = 268435456;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 1024;
                if (i24 != 0) {
                    i25 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i26 = 4;
                    } else {
                        i26 = 2;
                    }
                    i25 = i11 | i26;
                } else {
                    i25 = i11;
                }
                if ((i12 & 2048) != 0) {
                    i27 = i25 | 48;
                } else if ((i11 & 112) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i28 = 32;
                    } else {
                        i28 = 16;
                    }
                    i27 = i25 | i28;
                } else {
                    i27 = i25;
                }
                if ((i13 & 1533916891) != 306783378 && (i27 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier;
                    mutableInteractionSource3 = mutableInteractionSource;
                    shape2 = shape;
                    borderStroke3 = borderStroke;
                    selectableChipColors3 = selectableChipColors;
                    function9 = function3;
                    function10 = function4;
                    composer2 = composerStartRestartGroup;
                    z13 = z12;
                    function8 = function2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i31 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i13 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        Modifier modifier5 = modifier2;
                        if ((i12 & 128) != 0) {
                            selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                            i13 &= -29360129;
                        } else {
                            selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                        }
                        if (i20 != 0) {
                            function5 = null;
                        } else {
                            function5 = function2;
                        }
                        if (i22 != 0) {
                            function6 = null;
                        } else {
                            function6 = function3;
                        }
                        if (i24 != 0) {
                            function7 = null;
                        } else {
                            function7 = function4;
                        }
                        modifier3 = modifier5;
                        selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                        i29 = i13;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                        }
                        if ((i12 & 128) != 0) {
                            i13 &= -29360129;
                        }
                        modifier3 = modifier;
                        mutableInteractionSource2 = mutableInteractionSource;
                        shapeCopy = shape;
                        borderStroke2 = borderStroke;
                        selectableChipColors2 = selectableChipColors;
                        function5 = function2;
                        function6 = function3;
                        function7 = function4;
                        i29 = i13;
                        z12 = z12;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1259208246, i29, i27, "androidx.compose.material.FilterChip (Chip.kt:183)");
                    }
                    int i32 = i29 << 3;
                    int i33 = ((i29 >> 9) & 14) | (i32 & 112) | ((i29 >> 15) & 896);
                    State<Color> stateContentColor = selectableChipColors2.contentColor(z12, z10, composerStartRestartGroup, i33);
                    int i34 = i29;
                    SelectableChipColors selectableChipColors4 = selectableChipColors2;
                    boolean z14 = z12;
                    Modifier modifier6 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m836SurfaceNy5ogXk(z10, onClick, SemanticsModifierKt.semantics$default(modifier3, false, d.f6984p0, 1, null), z14, shapeCopy, selectableChipColors2.backgroundColor(z12, z10, composerStartRestartGroup, i33).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 722126431, true, new e(i27, i29, selectableChipColors2, stateContentColor, function5, function6, function7, content, z10, z14)), composerStartRestartGroup, (i34 & 14) | (i34 & 112) | (i34 & 7168) | ((i34 >> 3) & 57344) | (i32 & 29360128) | ((i34 << 15) & 1879048192), 6, 256);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape2 = shapeCopy;
                    borderStroke3 = borderStroke2;
                    function8 = function5;
                    function9 = function6;
                    function10 = function7;
                    selectableChipColors3 = selectableChipColors4;
                    z13 = z14;
                    modifier4 = modifier6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(z10, onClick, modifier4, z13, mutableInteractionSource3, shape2, borderStroke3, selectableChipColors3, function8, function9, function10, content, i10, i11, i12));
            }
            i13 |= 3072;
            z12 = z11;
            i16 = i12 & 16;
            if (i16 != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            if ((i10 & 458752) != 0) {
                if ((i12 & 32) == 0) {
                    i30 = 65536;
                } else {
                    i30 = 65536;
                }
                i13 |= i30;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(borderStroke)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i10 & 29360128) != 0) {
                i13 |= ((i12 & 128) == 0 || !composerStartRestartGroup.changed(selectableChipColors)) ? 4194304 : 8388608;
            }
            i20 = i12 & 256;
            if (i20 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
            i22 = i12 & 512;
            if (i22 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            i24 = i12 & 1024;
            if (i24 != 0) {
                i25 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i11 | i26;
            } else {
                i25 = i11;
            }
            if ((i12 & 2048) != 0) {
                i27 = i25 | 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i27 = i25 | i28;
            } else {
                i27 = i25;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i13 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    Modifier modifier7 = modifier2;
                    if ((i12 & 128) != 0) {
                        selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                        i13 &= -29360129;
                    } else {
                        selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i24 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    modifier3 = modifier7;
                    selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                    i29 = i13;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i13 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    Modifier modifier8 = modifier2;
                    if ((i12 & 128) != 0) {
                        selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                        i13 &= -29360129;
                    } else {
                        selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i24 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    modifier3 = modifier8;
                    selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                    i29 = i13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1259208246, i29, i27, "androidx.compose.material.FilterChip (Chip.kt:183)");
                }
                int i35 = i29 << 3;
                int i36 = ((i29 >> 9) & 14) | (i35 & 112) | ((i29 >> 15) & 896);
                State<Color> stateContentColor2 = selectableChipColors2.contentColor(z12, z10, composerStartRestartGroup, i36);
                int i37 = i29;
                SelectableChipColors selectableChipColors5 = selectableChipColors2;
                boolean z15 = z12;
                Modifier modifier9 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m836SurfaceNy5ogXk(z10, onClick, SemanticsModifierKt.semantics$default(modifier3, false, d.f6984p0, 1, null), z15, shapeCopy, selectableChipColors2.backgroundColor(z12, z10, composerStartRestartGroup, i36).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor2.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 722126431, true, new e(i27, i29, selectableChipColors2, stateContentColor2, function5, function6, function7, content, z10, z15)), composerStartRestartGroup, (i37 & 14) | (i37 & 112) | (i37 & 7168) | ((i37 >> 3) & 57344) | (i35 & 29360128) | ((i37 << 15) & 1879048192), 6, 256);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                shape2 = shapeCopy;
                borderStroke3 = borderStroke2;
                function8 = function5;
                function9 = function6;
                function10 = function7;
                selectableChipColors3 = selectableChipColors5;
                z13 = z15;
                modifier4 = modifier9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i13 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    Modifier modifier10 = modifier2;
                    if ((i12 & 128) != 0) {
                        selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                        i13 &= -29360129;
                    } else {
                        selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i24 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    modifier3 = modifier10;
                    selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                    i29 = i13;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i13 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    Modifier modifier11 = modifier2;
                    if ((i12 & 128) != 0) {
                        selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                        i13 &= -29360129;
                    } else {
                        selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i24 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    modifier3 = modifier11;
                    selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                    i29 = i13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1259208246, i29, i27, "androidx.compose.material.FilterChip (Chip.kt:183)");
                }
                int i38 = i29 << 3;
                int i39 = ((i29 >> 9) & 14) | (i38 & 112) | ((i29 >> 15) & 896);
                State<Color> stateContentColor3 = selectableChipColors2.contentColor(z12, z10, composerStartRestartGroup, i39);
                int i310 = i29;
                SelectableChipColors selectableChipColors6 = selectableChipColors2;
                boolean z16 = z12;
                Modifier modifier12 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m836SurfaceNy5ogXk(z10, onClick, SemanticsModifierKt.semantics$default(modifier3, false, d.f6984p0, 1, null), z16, shapeCopy, selectableChipColors2.backgroundColor(z12, z10, composerStartRestartGroup, i39).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor3.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 722126431, true, new e(i27, i29, selectableChipColors2, stateContentColor3, function5, function6, function7, content, z10, z16)), composerStartRestartGroup, (i310 & 14) | (i310 & 112) | (i310 & 7168) | ((i310 >> 3) & 57344) | (i38 & 29360128) | ((i310 << 15) & 1879048192), 6, 256);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                shape2 = shapeCopy;
                borderStroke3 = borderStroke2;
                function8 = function5;
                function9 = function6;
                function10 = function7;
                selectableChipColors3 = selectableChipColors6;
                z13 = z16;
                modifier4 = modifier12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(z10, onClick, modifier4, z13, mutableInteractionSource3, shape2, borderStroke3, selectableChipColors3, function8, function9, function10, content, i10, i11, i12));
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i10 & 7168) == 0) {
                z12 = z11;
                if (composerStartRestartGroup.changed(z12)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                i13 |= 24576;
            } else if ((i10 & 57344) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            if ((i10 & 458752) != 0) {
                if ((i12 & 32) == 0) {
                    i30 = 65536;
                } else {
                    i30 = 65536;
                }
                i13 |= i30;
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(borderStroke)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
            if ((i10 & 29360128) != 0) {
                i13 |= ((i12 & 128) == 0 || !composerStartRestartGroup.changed(selectableChipColors)) ? 4194304 : 8388608;
            }
            i20 = i12 & 256;
            if (i20 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i21 = 33554432;
                }
                i13 |= i21;
            }
            i22 = i12 & 512;
            if (i22 != 0) {
                i13 |= 805306368;
            } else if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i23 = 268435456;
                }
                i13 |= i23;
            }
            i24 = i12 & 1024;
            if (i24 != 0) {
                i25 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i26 = 4;
                } else {
                    i26 = 2;
                }
                i25 = i11 | i26;
            } else {
                i25 = i11;
            }
            if ((i12 & 2048) != 0) {
                i27 = i25 | 48;
            } else if ((i11 & 112) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i28 = 32;
                } else {
                    i28 = 16;
                }
                i27 = i25 | i28;
            } else {
                i27 = i25;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i13 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    Modifier modifier13 = modifier2;
                    if ((i12 & 128) != 0) {
                        selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                        i13 &= -29360129;
                    } else {
                        selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i24 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    modifier3 = modifier13;
                    selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                    i29 = i13;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i13 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    Modifier modifier14 = modifier2;
                    if ((i12 & 128) != 0) {
                        selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                        i13 &= -29360129;
                    } else {
                        selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i24 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    modifier3 = modifier14;
                    selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                    i29 = i13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1259208246, i29, i27, "androidx.compose.material.FilterChip (Chip.kt:183)");
                }
                int i311 = i29 << 3;
                int i312 = ((i29 >> 9) & 14) | (i311 & 112) | ((i29 >> 15) & 896);
                State<Color> stateContentColor4 = selectableChipColors2.contentColor(z12, z10, composerStartRestartGroup, i312);
                int i313 = i29;
                SelectableChipColors selectableChipColors7 = selectableChipColors2;
                boolean z17 = z12;
                Modifier modifier15 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m836SurfaceNy5ogXk(z10, onClick, SemanticsModifierKt.semantics$default(modifier3, false, d.f6984p0, 1, null), z17, shapeCopy, selectableChipColors2.backgroundColor(z12, z10, composerStartRestartGroup, i312).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor4.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 722126431, true, new e(i27, i29, selectableChipColors2, stateContentColor4, function5, function6, function7, content, z10, z17)), composerStartRestartGroup, (i313 & 14) | (i313 & 112) | (i313 & 7168) | ((i313 >> 3) & 57344) | (i311 & 29360128) | ((i313 << 15) & 1879048192), 6, 256);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                shape2 = shapeCopy;
                borderStroke3 = borderStroke2;
                function8 = function5;
                function9 = function6;
                function10 = function7;
                selectableChipColors3 = selectableChipColors7;
                z13 = z17;
                modifier4 = modifier15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i13 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    Modifier modifier16 = modifier2;
                    if ((i12 & 128) != 0) {
                        selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                        i13 &= -29360129;
                    } else {
                        selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i24 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    modifier3 = modifier16;
                    selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                    i29 = i13;
                } else {
                    if (i31 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i13 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    Modifier modifier17 = modifier2;
                    if ((i12 & 128) != 0) {
                        selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                        i13 &= -29360129;
                    } else {
                        selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                    }
                    if (i20 != 0) {
                        function5 = null;
                    } else {
                        function5 = function2;
                    }
                    if (i22 != 0) {
                        function6 = null;
                    } else {
                        function6 = function3;
                    }
                    if (i24 != 0) {
                        function7 = null;
                    } else {
                        function7 = function4;
                    }
                    modifier3 = modifier17;
                    selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                    i29 = i13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1259208246, i29, i27, "androidx.compose.material.FilterChip (Chip.kt:183)");
                }
                int i314 = i29 << 3;
                int i315 = ((i29 >> 9) & 14) | (i314 & 112) | ((i29 >> 15) & 896);
                State<Color> stateContentColor5 = selectableChipColors2.contentColor(z12, z10, composerStartRestartGroup, i315);
                int i316 = i29;
                SelectableChipColors selectableChipColors8 = selectableChipColors2;
                boolean z18 = z12;
                Modifier modifier18 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m836SurfaceNy5ogXk(z10, onClick, SemanticsModifierKt.semantics$default(modifier3, false, d.f6984p0, 1, null), z18, shapeCopy, selectableChipColors2.backgroundColor(z12, z10, composerStartRestartGroup, i315).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor5.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 722126431, true, new e(i27, i29, selectableChipColors2, stateContentColor5, function5, function6, function7, content, z10, z18)), composerStartRestartGroup, (i316 & 14) | (i316 & 112) | (i316 & 7168) | ((i316 >> 3) & 57344) | (i314 & 29360128) | ((i316 << 15) & 1879048192), 6, 256);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource3 = mutableInteractionSource2;
                shape2 = shapeCopy;
                borderStroke3 = borderStroke2;
                function8 = function5;
                function9 = function6;
                function10 = function7;
                selectableChipColors3 = selectableChipColors8;
                z13 = z18;
                modifier4 = modifier18;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(z10, onClick, modifier4, z13, mutableInteractionSource3, shape2, borderStroke3, selectableChipColors3, function8, function9, function10, content, i10, i11, i12));
        }
        i13 |= 3072;
        z12 = z11;
        i16 = i12 & 16;
        if (i16 != 0) {
            i13 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i13 |= i17;
        }
        if ((i10 & 458752) != 0) {
            if ((i12 & 32) == 0) {
                i30 = 65536;
            } else {
                i30 = 65536;
            }
            i13 |= i30;
        }
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(borderStroke)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i13 |= i19;
        }
        if ((i10 & 29360128) != 0) {
            i13 |= ((i12 & 128) == 0 || !composerStartRestartGroup.changed(selectableChipColors)) ? 4194304 : 8388608;
        }
        i20 = i12 & 256;
        if (i20 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function2)) {
                i21 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i21 = 33554432;
            }
            i13 |= i21;
        }
        i22 = i12 & 512;
        if (i22 != 0) {
            i13 |= 805306368;
        } else if ((i10 & 1879048192) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i23 = PKIFailureInfo.duplicateCertReq;
            } else {
                i23 = 268435456;
            }
            i13 |= i23;
        }
        i24 = i12 & 1024;
        if (i24 != 0) {
            i25 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(function4)) {
                i26 = 4;
            } else {
                i26 = 2;
            }
            i25 = i11 | i26;
        } else {
            i25 = i11;
        }
        if ((i12 & 2048) != 0) {
            i27 = i25 | 48;
        } else if ((i11 & 112) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i28 = 32;
            } else {
                i28 = 16;
            }
            i27 = i25 | i28;
        } else {
            i27 = i25;
        }
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i12 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i13 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                Modifier modifier19 = modifier2;
                if ((i12 & 128) != 0) {
                    selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                    i13 &= -29360129;
                } else {
                    selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i22 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i24 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                modifier3 = modifier19;
                selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                i29 = i13;
            } else {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i12 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i13 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                Modifier modifier110 = modifier2;
                if ((i12 & 128) != 0) {
                    selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                    i13 &= -29360129;
                } else {
                    selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i22 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i24 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                modifier3 = modifier110;
                selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                i29 = i13;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1259208246, i29, i27, "androidx.compose.material.FilterChip (Chip.kt:183)");
            }
            int i317 = i29 << 3;
            int i318 = ((i29 >> 9) & 14) | (i317 & 112) | ((i29 >> 15) & 896);
            State<Color> stateContentColor6 = selectableChipColors2.contentColor(z12, z10, composerStartRestartGroup, i318);
            int i319 = i29;
            SelectableChipColors selectableChipColors9 = selectableChipColors2;
            boolean z19 = z12;
            Modifier modifier111 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m836SurfaceNy5ogXk(z10, onClick, SemanticsModifierKt.semantics$default(modifier3, false, d.f6984p0, 1, null), z19, shapeCopy, selectableChipColors2.backgroundColor(z12, z10, composerStartRestartGroup, i318).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor6.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 722126431, true, new e(i27, i29, selectableChipColors2, stateContentColor6, function5, function6, function7, content, z10, z19)), composerStartRestartGroup, (i319 & 14) | (i319 & 112) | (i319 & 7168) | ((i319 >> 3) & 57344) | (i317 & 29360128) | ((i319 << 15) & 1879048192), 6, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource3 = mutableInteractionSource2;
            shape2 = shapeCopy;
            borderStroke3 = borderStroke2;
            function8 = function5;
            function9 = function6;
            function10 = function7;
            selectableChipColors3 = selectableChipColors9;
            z13 = z19;
            modifier4 = modifier111;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i12 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i13 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                Modifier modifier112 = modifier2;
                if ((i12 & 128) != 0) {
                    selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                    i13 &= -29360129;
                } else {
                    selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i22 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i24 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                modifier3 = modifier112;
                selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                i29 = i13;
            } else {
                if (i31 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i14 != 0) {
                    z12 = true;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i12 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i13 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                Modifier modifier113 = modifier2;
                if ((i12 & 128) != 0) {
                    selectableChipColorsM697filterChipColorsJ08w3E = ChipDefaults.INSTANCE.m697filterChipColorsJ08w3E(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 805306368, 511);
                    i13 &= -29360129;
                } else {
                    selectableChipColorsM697filterChipColorsJ08w3E = selectableChipColors;
                }
                if (i20 != 0) {
                    function5 = null;
                } else {
                    function5 = function2;
                }
                if (i22 != 0) {
                    function6 = null;
                } else {
                    function6 = function3;
                }
                if (i24 != 0) {
                    function7 = null;
                } else {
                    function7 = function4;
                }
                modifier3 = modifier113;
                selectableChipColors2 = selectableChipColorsM697filterChipColorsJ08w3E;
                i29 = i13;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1259208246, i29, i27, "androidx.compose.material.FilterChip (Chip.kt:183)");
            }
            int i3110 = i29 << 3;
            int i3111 = ((i29 >> 9) & 14) | (i3110 & 112) | ((i29 >> 15) & 896);
            State<Color> stateContentColor7 = selectableChipColors2.contentColor(z12, z10, composerStartRestartGroup, i3111);
            int i3112 = i29;
            SelectableChipColors selectableChipColors10 = selectableChipColors2;
            boolean z110 = z12;
            Modifier modifier114 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m836SurfaceNy5ogXk(z10, onClick, SemanticsModifierKt.semantics$default(modifier3, false, d.f6984p0, 1, null), z110, shapeCopy, selectableChipColors2.backgroundColor(z12, z10, composerStartRestartGroup, i3111).getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateContentColor7.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, 0.0f, mutableInteractionSource2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 722126431, true, new e(i27, i29, selectableChipColors2, stateContentColor7, function5, function6, function7, content, z10, z110)), composerStartRestartGroup, (i3112 & 14) | (i3112 & 112) | (i3112 & 7168) | ((i3112 >> 3) & 57344) | (i3110 & 29360128) | ((i3112 << 15) & 1879048192), 6, 256);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource3 = mutableInteractionSource2;
            shape2 = shapeCopy;
            borderStroke3 = borderStroke2;
            function8 = function5;
            function9 = function6;
            function10 = function7;
            selectableChipColors3 = selectableChipColors10;
            z13 = z110;
            modifier4 = modifier114;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(z10, onClick, modifier4, z13, mutableInteractionSource3, shape2, borderStroke3, selectableChipColors3, function8, function9, function10, content, i10, i11, i12));
    }

    public static final long access$Chip$lambda$1(State state) {
        return ((Color) state.getValue()).m2518unboximpl();
    }
}
