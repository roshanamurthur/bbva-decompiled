package androidx.compose.material;

import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.CornerSizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FloatingActionButton.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001ar\u0010\u0012\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\f2\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0089\u0001\u0010\u0017\u001a\u00020\u00012\u0011\u0010\u0013\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u000e2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0015\b\u0002\u0010\u0014\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u000e2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/material/FloatingActionButtonElevation;", "elevation", "Landroidx/compose/runtime/Composable;", "content", "FloatingActionButton-bogVsAg", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "FloatingActionButton", "text", "icon", "ExtendedFloatingActionButton-wqdebIU", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/graphics/Shape;JJLandroidx/compose/material/FloatingActionButtonElevation;Landroidx/compose/runtime/Composer;II)V", "ExtendedFloatingActionButton", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,336:1\n25#2:337\n25#2:344\n1097#3,6:338\n1097#3,6:345\n154#4:351\n154#4:352\n154#4:353\n154#4:354\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n*L\n85#1:337\n152#1:344\n85#1:338,6\n152#1:345,6\n332#1:351\n333#1:352\n334#1:353\n335#1:354\n*E\n"})
public final class FloatingActionButtonKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7180a = Dp.m4389constructorimpl(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7181b = Dp.m4389constructorimpl(48);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7182c = Dp.m4389constructorimpl(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f7183d = Dp.m4389constructorimpl(20);

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    @SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt$ExtendedFloatingActionButton$2\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,336:1\n73#2,6:337\n79#2:371\n83#2:376\n78#3,11:343\n91#3:375\n456#4,8:354\n464#4,3:368\n467#4,3:372\n4144#5,6:362\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt$ExtendedFloatingActionButton$2\n*L\n171#1:337,6\n171#1:371\n171#1:376\n171#1:343,11\n171#1:375\n171#1:354,8\n171#1:368,3\n171#1:372,3\n171#1:362,6\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7184p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f7185q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7186r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i10, Function2 function2, Function2 function3) {
            super(2);
            this.f7184p0 = function2;
            this.f7185q0 = i10;
            this.f7186r0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1418981691, iIntValue, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:168)");
                }
                Function2<Composer, Integer, Unit> function2 = this.f7184p0;
                float f6 = function2 == null ? FloatingActionButtonKt.f7183d : FloatingActionButtonKt.f7182c;
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(companion, f6, 0.0f, FloatingActionButtonKt.f7183d, 0.0f, 10, null);
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM300paddingqDBjuR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                composer2.startReplaceableGroup(-1435223598);
                int i10 = this.f7185q0;
                if (function2 != null) {
                    function2.invoke(composer2, Integer.valueOf((i10 >> 9) & 14));
                    SpacerKt.Spacer(SizeKt.m340width3ABfNKs(companion, FloatingActionButtonKt.f7182c), composer2, 6);
                }
                composer2.endReplaceableGroup();
                if (androidx.appcompat.widget.g0.d(this.f7186r0, composer2, Integer.valueOf(i10 & 14))) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7187p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f7188q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7189r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7190s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7191t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Shape f7192u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f7193w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ FloatingActionButtonElevation f7194x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f7195y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super Composer, ? super Integer, Unit> function2, Function0<Unit> function0, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, MutableInteractionSource mutableInteractionSource, Shape shape, long j10, long j11, FloatingActionButtonElevation floatingActionButtonElevation, int i10, int i11) {
            super(2);
            this.f7187p0 = function2;
            this.f7188q0 = function0;
            this.f7189r0 = modifier;
            this.f7190s0 = function3;
            this.f7191t0 = mutableInteractionSource;
            this.f7192u0 = shape;
            this.v0 = j10;
            this.f7193w0 = j11;
            this.f7194x0 = floatingActionButtonElevation;
            this.f7195y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            FloatingActionButtonKt.m777ExtendedFloatingActionButtonwqdebIU(this.f7187p0, this.f7188q0, this.f7189r0, this.f7190s0, this.f7191t0, this.f7192u0, this.v0, this.f7193w0, this.f7194x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7195y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class c extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f7196p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.m3843setRolekuIjeqM(semantics, Role.INSTANCE.m3831getButtono7Vup1c());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f7197p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7198q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7199r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(long j10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f7197p0 = j10;
            this.f7198q0 = function2;
            this.f7199r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1972871863, iIntValue, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:99)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2510getAlphaimpl(this.f7197p0)))}, ComposableLambdaKt.composableLambda(composer2, 1867794295, true, new b1(this.f7199r0, this.f7198q0)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FloatingActionButton.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f7200p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7201q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7202r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f7203s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f7204t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f7205u0;
        public final /* synthetic */ FloatingActionButtonElevation v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f7206w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f7207x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f7208y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function0<Unit> function0, Modifier modifier, MutableInteractionSource mutableInteractionSource, Shape shape, long j10, long j11, FloatingActionButtonElevation floatingActionButtonElevation, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f7200p0 = function0;
            this.f7201q0 = modifier;
            this.f7202r0 = mutableInteractionSource;
            this.f7203s0 = shape;
            this.f7204t0 = j10;
            this.f7205u0 = j11;
            this.v0 = floatingActionButtonElevation;
            this.f7206w0 = function2;
            this.f7207x0 = i10;
            this.f7208y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            FloatingActionButtonKt.m778FloatingActionButtonbogVsAg(this.f7200p0, this.f7201q0, this.f7202r0, this.f7203s0, this.f7204t0, this.f7205u0, this.v0, this.f7206w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7207x0 | 1), this.f7208y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0120  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x0148  */
    /* JADX WARN: Code duplicated, block: B:122:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:124:0x0183  */
    /* JADX WARN: Code duplicated, block: B:126:0x0186  */
    /* JADX WARN: Code duplicated, block: B:127:0x0188  */
    /* JADX WARN: Code duplicated, block: B:129:0x018b  */
    /* JADX WARN: Code duplicated, block: B:131:0x019d  */
    /* JADX WARN: Code duplicated, block: B:133:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:136:0x01af  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:140:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:144:0x01de  */
    /* JADX WARN: Code duplicated, block: B:145:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:152:0x0231  */
    /* JADX WARN: Code duplicated, block: B:155:0x029c  */
    /* JADX WARN: Code duplicated, block: B:160:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:162:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: ExtendedFloatingActionButton-wqdebIU, reason: not valid java name */
    public static final void m777ExtendedFloatingActionButtonwqdebIU(@NotNull Function2<? super Composer, ? super Integer, Unit> text, @NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, long j10, long j11, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i14;
        int i15;
        MutableInteractionSource mutableInteractionSource2;
        int i16;
        long j12;
        int i17;
        FloatingActionButtonElevation floatingActionButtonElevationM776elevationxZ9QkE;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function4;
        MutableInteractionSource mutableInteractionSource3;
        Shape shapeCopy;
        long jM715getSecondary0d7_KjU;
        long jM731contentColorForek8zF_U;
        Function2<? super Composer, ? super Integer, Unit> function5;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape2;
        long j13;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        long j14;
        Modifier modifier4;
        int i18;
        Object objRememberedValue;
        Modifier modifier5;
        Function2<? super Composer, ? super Integer, Unit> function6;
        MutableInteractionSource mutableInteractionSource5;
        Shape shape3;
        long j15;
        long j16;
        FloatingActionButtonElevation floatingActionButtonElevation3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i19;
        int i20;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1555720195);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        mutableInteractionSource2 = mutableInteractionSource;
                        if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 458752) != 0) {
                        i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                    }
                    if ((i10 & 3670016) == 0) {
                        j12 = j10;
                        if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(j12)) {
                            i20 = 524288;
                        } else {
                            i20 = 1048576;
                        }
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    if ((i10 & 29360128) == 0) {
                        int i22 = i12;
                        if ((i11 & 128) == 0 || !composerStartRestartGroup.changed(j11)) {
                            i19 = 4194304;
                        } else {
                            i19 = 8388608;
                        }
                        i17 = i22 | i19;
                    } else {
                        i17 = i12;
                    }
                    if ((i10 & 234881024) == 0) {
                        if ((i11 & 256) == 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                            int i23 = composerStartRestartGroup.changed(floatingActionButtonElevationM776elevationxZ9QkE) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            i17 |= i23;
                        } else {
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                        }
                        i17 |= i23;
                    } else {
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                    }
                    if ((i17 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
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
                            if ((i11 & 32) != 0) {
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                                i17 &= -458753;
                            } else {
                                shapeCopy = shape;
                            }
                            if ((i11 & 64) != 0) {
                                jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                                i17 &= -3670017;
                            } else {
                                jM715getSecondary0d7_KjU = j12;
                            }
                            if ((i11 & 128) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if ((i11 & 256) != 0) {
                                floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                                i17 &= -234881025;
                            }
                            function5 = function4;
                            mutableInteractionSource4 = mutableInteractionSource3;
                            shape2 = shapeCopy;
                            j13 = jM715getSecondary0d7_KjU;
                            floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                            j14 = jM731contentColorForek8zF_U;
                            int i24 = i17;
                            modifier4 = modifier3;
                            i18 = i24;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 32) != 0) {
                                i17 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i17 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i17 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                i17 &= -234881025;
                            }
                            shape2 = shape;
                            j14 = j11;
                            floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                            mutableInteractionSource4 = mutableInteractionSource2;
                            j13 = j12;
                            i18 = i17;
                            modifier4 = modifier2;
                            function5 = function3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                        }
                        float f6 = f7181b;
                        Modifier modifierM339sizeInqDBjuR0$default = SizeKt.m339sizeInqDBjuR0$default(modifier4, f6, f6, 0.0f, 0.0f, 12, null);
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                        int i25 = ((i18 >> 3) & 14) | 12582912;
                        int i26 = i18 >> 6;
                        Function2<? super Composer, ? super Integer, Unit> function7 = function5;
                        m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda, composerStartRestartGroup, (i26 & 896) | i25 | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (i26 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        function6 = function7;
                        mutableInteractionSource5 = mutableInteractionSource4;
                        shape3 = shape2;
                        j15 = j13;
                        j16 = j14;
                        floatingActionButtonElevation3 = floatingActionButtonElevation2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        shape3 = shape;
                        modifier5 = modifier2;
                        function6 = function3;
                        mutableInteractionSource5 = mutableInteractionSource2;
                        j15 = j12;
                        floatingActionButtonElevation3 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j16 = j11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j15, j16, floatingActionButtonElevation3, i10, i11));
                }
                i12 |= 24576;
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i10 & 458752) != 0) {
                    i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((i10 & 3670016) == 0) {
                    j12 = j10;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((i10 & 29360128) == 0) {
                    int i27 = i12;
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i17 = i27 | i19;
                } else {
                    i17 = i12;
                }
                if ((i10 & 234881024) == 0) {
                    if ((i11 & 256) == 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevationM776elevationxZ9QkE)) {
                        }
                        i17 |= i23;
                    } else {
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                    }
                    i17 |= i23;
                } else {
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                }
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i28 = i17;
                        modifier4 = modifier3;
                        i18 = i28;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i29 = i17;
                        modifier4 = modifier3;
                        i18 = i29;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f10 = f7181b;
                    Modifier modifierM339sizeInqDBjuR0$default2 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f10, f10, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                    int i210 = ((i18 >> 3) & 14) | 12582912;
                    int i211 = i18 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function8 = function5;
                    m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default2, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda2, composerStartRestartGroup, (i211 & 896) | i210 | (i211 & 7168) | (57344 & i211) | (458752 & i211) | (i211 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function8;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j15 = j13;
                    j16 = j14;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i212 = i17;
                        modifier4 = modifier3;
                        i18 = i212;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i213 = i17;
                        modifier4 = modifier3;
                        i18 = i213;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f11 = f7181b;
                    Modifier modifierM339sizeInqDBjuR0$default3 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f11, f11, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                    int i214 = ((i18 >> 3) & 14) | 12582912;
                    int i215 = i18 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function9 = function5;
                    m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default3, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda3, composerStartRestartGroup, (i215 & 896) | i214 | (i215 & 7168) | (57344 & i215) | (458752 & i215) | (i215 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function9;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j15 = j13;
                    j16 = j14;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j15, j16, floatingActionButtonElevation3, i10, i11));
            }
            i12 |= 3072;
            function3 = function2;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i10 & 458752) != 0) {
                    i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((i10 & 3670016) == 0) {
                    j12 = j10;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((i10 & 29360128) == 0) {
                    int i216 = i12;
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i17 = i216 | i19;
                } else {
                    i17 = i12;
                }
                if ((i10 & 234881024) == 0) {
                    if ((i11 & 256) == 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevationM776elevationxZ9QkE)) {
                        }
                        i17 |= i23;
                    } else {
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                    }
                    i17 |= i23;
                } else {
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                }
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i217 = i17;
                        modifier4 = modifier3;
                        i18 = i217;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i218 = i17;
                        modifier4 = modifier3;
                        i18 = i218;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f12 = f7181b;
                    Modifier modifierM339sizeInqDBjuR0$default4 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f12, f12, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                    int i219 = ((i18 >> 3) & 14) | 12582912;
                    int i2110 = i18 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function10 = function5;
                    m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default4, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda4, composerStartRestartGroup, (i2110 & 896) | i219 | (i2110 & 7168) | (57344 & i2110) | (458752 & i2110) | (i2110 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function10;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j15 = j13;
                    j16 = j14;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i2111 = i17;
                        modifier4 = modifier3;
                        i18 = i2111;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i2112 = i17;
                        modifier4 = modifier3;
                        i18 = i2112;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f13 = f7181b;
                    Modifier modifierM339sizeInqDBjuR0$default5 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f13, f13, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                    int i2113 = ((i18 >> 3) & 14) | 12582912;
                    int i2114 = i18 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function11 = function5;
                    m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default5, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda5, composerStartRestartGroup, (i2114 & 896) | i2113 | (i2114 & 7168) | (57344 & i2114) | (458752 & i2114) | (i2114 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function11;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j15 = j13;
                    j16 = j14;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j15, j16, floatingActionButtonElevation3, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 458752) != 0) {
                i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((i10 & 3670016) == 0) {
                j12 = j10;
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i10 & 29360128) == 0) {
                int i2115 = i12;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i17 = i2115 | i19;
            } else {
                i17 = i12;
            }
            if ((i10 & 234881024) == 0) {
                if ((i11 & 256) == 0) {
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevationM776elevationxZ9QkE)) {
                    }
                    i17 |= i23;
                } else {
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                }
                i17 |= i23;
            } else {
                floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
            }
            if ((i17 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i2116 = i17;
                    modifier4 = modifier3;
                    i18 = i2116;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i2117 = i17;
                    modifier4 = modifier3;
                    i18 = i2117;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f14 = f7181b;
                Modifier modifierM339sizeInqDBjuR0$default6 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f14, f14, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                int i2118 = ((i18 >> 3) & 14) | 12582912;
                int i2119 = i18 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function12 = function5;
                m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default6, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda6, composerStartRestartGroup, (i2119 & 896) | i2118 | (i2119 & 7168) | (57344 & i2119) | (458752 & i2119) | (i2119 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function12;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j15 = j13;
                j16 = j14;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i21110 = i17;
                    modifier4 = modifier3;
                    i18 = i21110;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i21111 = i17;
                    modifier4 = modifier3;
                    i18 = i21111;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f15 = f7181b;
                Modifier modifierM339sizeInqDBjuR0$default7 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f15, f15, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                int i21112 = ((i18 >> 3) & 14) | 12582912;
                int i21113 = i18 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function13 = function5;
                m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default7, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda7, composerStartRestartGroup, (i21113 & 896) | i21112 | (i21113 & 7168) | (57344 & i21113) | (458752 & i21113) | (i21113 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function13;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j15 = j13;
                j16 = j14;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j15, j16, floatingActionButtonElevation3, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                function3 = function2;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i10 & 458752) != 0) {
                    i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
                }
                if ((i10 & 3670016) == 0) {
                    j12 = j10;
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((i10 & 29360128) == 0) {
                    int i21114 = i12;
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i17 = i21114 | i19;
                } else {
                    i17 = i12;
                }
                if ((i10 & 234881024) == 0) {
                    if ((i11 & 256) == 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                        if (composerStartRestartGroup.changed(floatingActionButtonElevationM776elevationxZ9QkE)) {
                        }
                        i17 |= i23;
                    } else {
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                    }
                    i17 |= i23;
                } else {
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                }
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i21115 = i17;
                        modifier4 = modifier3;
                        i18 = i21115;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i21116 = i17;
                        modifier4 = modifier3;
                        i18 = i21116;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f16 = f7181b;
                    Modifier modifierM339sizeInqDBjuR0$default8 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f16, f16, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                    int i21117 = ((i18 >> 3) & 14) | 12582912;
                    int i21118 = i18 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function14 = function5;
                    m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default8, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda8, composerStartRestartGroup, (i21118 & 896) | i21117 | (i21118 & 7168) | (57344 & i21118) | (458752 & i21118) | (i21118 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function14;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j15 = j13;
                    j16 = j14;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i21119 = i17;
                        modifier4 = modifier3;
                        i18 = i21119;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
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
                        if ((i11 & 32) != 0) {
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            i17 &= -458753;
                        } else {
                            shapeCopy = shape;
                        }
                        if ((i11 & 64) != 0) {
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            i17 &= -3670017;
                        } else {
                            jM715getSecondary0d7_KjU = j12;
                        }
                        if ((i11 & 128) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if ((i11 & 256) != 0) {
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            i17 &= -234881025;
                        }
                        function5 = function4;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        shape2 = shapeCopy;
                        j13 = jM715getSecondary0d7_KjU;
                        floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                        j14 = jM731contentColorForek8zF_U;
                        int i211110 = i17;
                        modifier4 = modifier3;
                        i18 = i211110;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                    }
                    float f17 = f7181b;
                    Modifier modifierM339sizeInqDBjuR0$default9 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f17, f17, 0.0f, 0.0f, 12, null);
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                    int i211111 = ((i18 >> 3) & 14) | 12582912;
                    int i211112 = i18 >> 6;
                    Function2<? super Composer, ? super Integer, Unit> function15 = function5;
                    m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default9, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda9, composerStartRestartGroup, (i211112 & 896) | i211111 | (i211112 & 7168) | (57344 & i211112) | (458752 & i211112) | (i211112 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    function6 = function15;
                    mutableInteractionSource5 = mutableInteractionSource4;
                    shape3 = shape2;
                    j15 = j13;
                    j16 = j14;
                    floatingActionButtonElevation3 = floatingActionButtonElevation2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j15, j16, floatingActionButtonElevation3, i10, i11));
            }
            i12 |= 24576;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 458752) != 0) {
                i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((i10 & 3670016) == 0) {
                j12 = j10;
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i10 & 29360128) == 0) {
                int i211113 = i12;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i17 = i211113 | i19;
            } else {
                i17 = i12;
            }
            if ((i10 & 234881024) == 0) {
                if ((i11 & 256) == 0) {
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevationM776elevationxZ9QkE)) {
                    }
                    i17 |= i23;
                } else {
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                }
                i17 |= i23;
            } else {
                floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
            }
            if ((i17 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i211114 = i17;
                    modifier4 = modifier3;
                    i18 = i211114;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i211115 = i17;
                    modifier4 = modifier3;
                    i18 = i211115;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f18 = f7181b;
                Modifier modifierM339sizeInqDBjuR0$default10 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f18, f18, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                int i211116 = ((i18 >> 3) & 14) | 12582912;
                int i211117 = i18 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function16 = function5;
                m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default10, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda10, composerStartRestartGroup, (i211117 & 896) | i211116 | (i211117 & 7168) | (57344 & i211117) | (458752 & i211117) | (i211117 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function16;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j15 = j13;
                j16 = j14;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i211118 = i17;
                    modifier4 = modifier3;
                    i18 = i211118;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i211119 = i17;
                    modifier4 = modifier3;
                    i18 = i211119;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f19 = f7181b;
                Modifier modifierM339sizeInqDBjuR0$default11 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f19, f19, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                int i2111110 = ((i18 >> 3) & 14) | 12582912;
                int i2111111 = i18 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function17 = function5;
                m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default11, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda11, composerStartRestartGroup, (i2111111 & 896) | i2111110 | (i2111111 & 7168) | (57344 & i2111111) | (458752 & i2111111) | (i2111111 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function17;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j15 = j13;
                j16 = j14;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j15, j16, floatingActionButtonElevation3, i10, i11));
        }
        i12 |= 3072;
        function3 = function2;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i10 & 458752) != 0) {
                i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
            }
            if ((i10 & 3670016) == 0) {
                j12 = j10;
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i10 & 29360128) == 0) {
                int i2111112 = i12;
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i17 = i2111112 | i19;
            } else {
                i17 = i12;
            }
            if ((i10 & 234881024) == 0) {
                if ((i11 & 256) == 0) {
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevationM776elevationxZ9QkE)) {
                    }
                    i17 |= i23;
                } else {
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                }
                i17 |= i23;
            } else {
                floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
            }
            if ((i17 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i2111113 = i17;
                    modifier4 = modifier3;
                    i18 = i2111113;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i2111114 = i17;
                    modifier4 = modifier3;
                    i18 = i2111114;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f110 = f7181b;
                Modifier modifierM339sizeInqDBjuR0$default12 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f110, f110, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                int i2111115 = ((i18 >> 3) & 14) | 12582912;
                int i2111116 = i18 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function18 = function5;
                m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default12, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda12, composerStartRestartGroup, (i2111116 & 896) | i2111115 | (i2111116 & 7168) | (57344 & i2111116) | (458752 & i2111116) | (i2111116 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function18;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j15 = j13;
                j16 = j14;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i2111117 = i17;
                    modifier4 = modifier3;
                    i18 = i2111117;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
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
                    if ((i11 & 32) != 0) {
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        i17 &= -458753;
                    } else {
                        shapeCopy = shape;
                    }
                    if ((i11 & 64) != 0) {
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        i17 &= -3670017;
                    } else {
                        jM715getSecondary0d7_KjU = j12;
                    }
                    if ((i11 & 128) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if ((i11 & 256) != 0) {
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        i17 &= -234881025;
                    }
                    function5 = function4;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    shape2 = shapeCopy;
                    j13 = jM715getSecondary0d7_KjU;
                    floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                    j14 = jM731contentColorForek8zF_U;
                    int i2111118 = i17;
                    modifier4 = modifier3;
                    i18 = i2111118;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
                }
                float f111 = f7181b;
                Modifier modifierM339sizeInqDBjuR0$default13 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f111, f111, 0.0f, 0.0f, 12, null);
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
                int i2111119 = ((i18 >> 3) & 14) | 12582912;
                int i21111110 = i18 >> 6;
                Function2<? super Composer, ? super Integer, Unit> function19 = function5;
                m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default13, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda13, composerStartRestartGroup, (i21111110 & 896) | i2111119 | (i21111110 & 7168) | (57344 & i21111110) | (458752 & i21111110) | (i21111110 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                function6 = function19;
                mutableInteractionSource5 = mutableInteractionSource4;
                shape3 = shape2;
                j15 = j13;
                j16 = j14;
                floatingActionButtonElevation3 = floatingActionButtonElevation2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j15, j16, floatingActionButtonElevation3, i10, i11));
        }
        i12 |= 24576;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i10 & 458752) != 0) {
            i12 |= ((i11 & 32) == 0 || !composerStartRestartGroup.changed(shape)) ? 65536 : 131072;
        }
        if ((i10 & 3670016) == 0) {
            j12 = j10;
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        } else {
            j12 = j10;
        }
        if ((i10 & 29360128) == 0) {
            int i21111111 = i12;
            if ((i11 & 128) == 0) {
                i19 = 4194304;
            } else {
                i19 = 4194304;
            }
            i17 = i21111111 | i19;
        } else {
            i17 = i12;
        }
        if ((i10 & 234881024) == 0) {
            if ((i11 & 256) == 0) {
                floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
                if (composerStartRestartGroup.changed(floatingActionButtonElevationM776elevationxZ9QkE)) {
                }
                i17 |= i23;
            } else {
                floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
            }
            i17 |= i23;
        } else {
            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation;
        }
        if ((i17 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
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
                if ((i11 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i17 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if ((i11 & 64) != 0) {
                    jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    i17 &= -3670017;
                } else {
                    jM715getSecondary0d7_KjU = j12;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i17 &= -234881025;
                }
                function5 = function4;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape2 = shapeCopy;
                j13 = jM715getSecondary0d7_KjU;
                floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                j14 = jM731contentColorForek8zF_U;
                int i21111112 = i17;
                modifier4 = modifier3;
                i18 = i21111112;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
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
                if ((i11 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i17 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if ((i11 & 64) != 0) {
                    jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    i17 &= -3670017;
                } else {
                    jM715getSecondary0d7_KjU = j12;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i17 &= -234881025;
                }
                function5 = function4;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape2 = shapeCopy;
                j13 = jM715getSecondary0d7_KjU;
                floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                j14 = jM731contentColorForek8zF_U;
                int i21111113 = i17;
                modifier4 = modifier3;
                i18 = i21111113;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
            }
            float f112 = f7181b;
            Modifier modifierM339sizeInqDBjuR0$default14 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f112, f112, 0.0f, 0.0f, 12, null);
            ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
            int i21111114 = ((i18 >> 3) & 14) | 12582912;
            int i21111115 = i18 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function110 = function5;
            m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default14, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda14, composerStartRestartGroup, (i21111115 & 896) | i21111114 | (i21111115 & 7168) | (57344 & i21111115) | (458752 & i21111115) | (i21111115 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            function6 = function110;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape3 = shape2;
            j15 = j13;
            j16 = j14;
            floatingActionButtonElevation3 = floatingActionButtonElevation2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
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
                if ((i11 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i17 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if ((i11 & 64) != 0) {
                    jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    i17 &= -3670017;
                } else {
                    jM715getSecondary0d7_KjU = j12;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i17 &= -234881025;
                }
                function5 = function4;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape2 = shapeCopy;
                j13 = jM715getSecondary0d7_KjU;
                floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                j14 = jM731contentColorForek8zF_U;
                int i21111116 = i17;
                modifier4 = modifier3;
                i18 = i21111116;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
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
                if ((i11 & 32) != 0) {
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    i17 &= -458753;
                } else {
                    shapeCopy = shape;
                }
                if ((i11 & 64) != 0) {
                    jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    i17 &= -3670017;
                } else {
                    jM715getSecondary0d7_KjU = j12;
                }
                if ((i11 & 128) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((i11 & 256) != 0) {
                    floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    i17 &= -234881025;
                }
                function5 = function4;
                mutableInteractionSource4 = mutableInteractionSource3;
                shape2 = shapeCopy;
                j13 = jM715getSecondary0d7_KjU;
                floatingActionButtonElevation2 = floatingActionButtonElevationM776elevationxZ9QkE;
                j14 = jM731contentColorForek8zF_U;
                int i21111117 = i17;
                modifier4 = modifier3;
                i18 = i21111117;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1555720195, i18, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:146)");
            }
            float f113 = f7181b;
            Modifier modifierM339sizeInqDBjuR0$default15 = SizeKt.m339sizeInqDBjuR0$default(modifier4, f113, f113, 0.0f, 0.0f, 12, null);
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1418981691, true, new a(i18, function5, text));
            int i21111118 = ((i18 >> 3) & 14) | 12582912;
            int i21111119 = i18 >> 6;
            Function2<? super Composer, ? super Integer, Unit> function111 = function5;
            m778FloatingActionButtonbogVsAg(onClick, modifierM339sizeInqDBjuR0$default15, mutableInteractionSource4, shape2, j13, j14, floatingActionButtonElevation2, composableLambda15, composerStartRestartGroup, (i21111119 & 896) | i21111118 | (i21111119 & 7168) | (57344 & i21111119) | (458752 & i21111119) | (i21111119 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            function6 = function111;
            mutableInteractionSource5 = mutableInteractionSource4;
            shape3 = shape2;
            j15 = j13;
            j16 = j14;
            floatingActionButtonElevation3 = floatingActionButtonElevation2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(text, onClick, modifier5, function6, mutableInteractionSource5, shape3, j15, j16, floatingActionButtonElevation3, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:113:0x0149 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x014b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0150  */
    /* JADX WARN: Code duplicated, block: B:118:0x0162  */
    /* JADX WARN: Code duplicated, block: B:122:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x018f  */
    /* JADX WARN: Code duplicated, block: B:126:0x019f  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:139:0x0268  */
    /* JADX WARN: Code duplicated, block: B:144:0x027e  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0070  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008a  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: FloatingActionButton-bogVsAg, reason: not valid java name */
    public static final void m778FloatingActionButtonbogVsAg(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Shape shape, long j10, long j11, @Nullable FloatingActionButtonElevation floatingActionButtonElevation, @NotNull Function2<? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        MutableInteractionSource mutableInteractionSource2;
        int i14;
        Shape shapeCopy;
        long jM731contentColorForek8zF_U;
        FloatingActionButtonElevation floatingActionButtonElevation2;
        int i15;
        int i16;
        long jM715getSecondary0d7_KjU;
        long j12;
        Modifier modifier3;
        MutableInteractionSource mutableInteractionSource3;
        Shape shape2;
        long j13;
        FloatingActionButtonElevation floatingActionButtonElevationM776elevationxZ9QkE;
        Object objRememberedValue;
        Composer composer2;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape3;
        long j14;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1028985328);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    mutableInteractionSource2 = mutableInteractionSource;
                    if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        shapeCopy = shape;
                        int i19 = composerStartRestartGroup.changed(shapeCopy) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        shapeCopy = shape;
                    }
                    i12 |= i19;
                } else {
                    shapeCopy = shape;
                }
                if ((i10 & 57344) != 0) {
                    i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
                }
                if ((i10 & 458752) == 0) {
                    jM731contentColorForek8zF_U = j11;
                    if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(jM731contentColorForek8zF_U)) {
                        i17 = 65536;
                    } else {
                        i17 = 131072;
                    }
                    i12 |= i17;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if ((3670016 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                        int i20 = composerStartRestartGroup.changed(floatingActionButtonElevation2) ? 1048576 : 524288;
                        i12 |= i20;
                    } else {
                        floatingActionButtonElevation2 = floatingActionButtonElevation;
                    }
                    i12 |= i20;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 8388608;
                        } else {
                            i15 = 4194304;
                        }
                    }
                    if ((23967451 & i12) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i18 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                            }
                            if ((i11 & 16) != 0) {
                                i16 = i12 & (-57345);
                                jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                            } else {
                                i16 = i12;
                                jM715getSecondary0d7_KjU = j10;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                                i16 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                j12 = jM715getSecondary0d7_KjU;
                                i12 = i16 & (-3670017);
                                modifier3 = modifier2;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                shape2 = shapeCopy;
                                j13 = jM731contentColorForek8zF_U;
                                floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                            } else {
                                j12 = jM715getSecondary0d7_KjU;
                                i12 = i16;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                            }
                            long j15 = j13;
                            FloatingActionButtonElevation floatingActionButtonElevation3 = floatingActionButtonElevationM776elevationxZ9QkE;
                            MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource3;
                            Modifier modifier5 = modifier3;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource5, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            mutableInteractionSource4 = mutableInteractionSource5;
                            shape3 = shape2;
                            j14 = j12;
                            modifier4 = modifier5;
                            jM731contentColorForek8zF_U = j15;
                            floatingActionButtonElevation2 = floatingActionButtonElevation3;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            j12 = j10;
                        }
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                        }
                        long j16 = j13;
                        FloatingActionButtonElevation floatingActionButtonElevation4 = floatingActionButtonElevationM776elevationxZ9QkE;
                        MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource3;
                        Modifier modifier6 = modifier3;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        mutableInteractionSource4 = mutableInteractionSource6;
                        shape3 = shape2;
                        j14 = j12;
                        modifier4 = modifier6;
                        jM731contentColorForek8zF_U = j16;
                        floatingActionButtonElevation2 = floatingActionButtonElevation4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        mutableInteractionSource4 = mutableInteractionSource2;
                        shape3 = shapeCopy;
                        composer2 = composerStartRestartGroup;
                        j14 = j10;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, mutableInteractionSource4, shape3, j14, jM731contentColorForek8zF_U, floatingActionButtonElevation2, content, i10, i11));
                }
                i15 = 12582912;
                i12 |= i15;
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j17 = j13;
                    FloatingActionButtonElevation floatingActionButtonElevation5 = floatingActionButtonElevationM776elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource3;
                    Modifier modifier7 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource7, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource7;
                    shape3 = shape2;
                    j14 = j12;
                    modifier4 = modifier7;
                    jM731contentColorForek8zF_U = j17;
                    floatingActionButtonElevation2 = floatingActionButtonElevation5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j18 = j13;
                    FloatingActionButtonElevation floatingActionButtonElevation6 = floatingActionButtonElevationM776elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource3;
                    Modifier modifier8 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource8, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource8;
                    shape3 = shape2;
                    j14 = j12;
                    modifier4 = modifier8;
                    jM731contentColorForek8zF_U = j18;
                    floatingActionButtonElevation2 = floatingActionButtonElevation6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, mutableInteractionSource4, shape3, j14, jM731contentColorForek8zF_U, floatingActionButtonElevation2, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shapeCopy = shape;
                    if (composerStartRestartGroup.changed(shapeCopy)) {
                    }
                    i12 |= i19;
                } else {
                    shapeCopy = shape;
                }
                i12 |= i19;
            } else {
                shapeCopy = shape;
            }
            if ((i10 & 57344) != 0) {
                i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
            }
            if ((i10 & 458752) == 0) {
                jM731contentColorForek8zF_U = j11;
                if ((i11 & 32) == 0) {
                    i17 = 65536;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            } else {
                jM731contentColorForek8zF_U = j11;
            }
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                    }
                    i12 |= i20;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i12 |= i20;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j19 = j13;
                    FloatingActionButtonElevation floatingActionButtonElevation7 = floatingActionButtonElevationM776elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource3;
                    Modifier modifier9 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource9, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource9;
                    shape3 = shape2;
                    j14 = j12;
                    modifier4 = modifier9;
                    jM731contentColorForek8zF_U = j19;
                    floatingActionButtonElevation2 = floatingActionButtonElevation7;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j110 = j13;
                    FloatingActionButtonElevation floatingActionButtonElevation8 = floatingActionButtonElevationM776elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource3;
                    Modifier modifier10 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource10;
                    shape3 = shape2;
                    j14 = j12;
                    modifier4 = modifier10;
                    jM731contentColorForek8zF_U = j110;
                    floatingActionButtonElevation2 = floatingActionButtonElevation8;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, mutableInteractionSource4, shape3, j14, jM731contentColorForek8zF_U, floatingActionButtonElevation2, content, i10, i11));
            }
            i15 = 12582912;
            i12 |= i15;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j111 = j13;
                FloatingActionButtonElevation floatingActionButtonElevation9 = floatingActionButtonElevationM776elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource3;
                Modifier modifier11 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource11, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource11;
                shape3 = shape2;
                j14 = j12;
                modifier4 = modifier11;
                jM731contentColorForek8zF_U = j111;
                floatingActionButtonElevation2 = floatingActionButtonElevation9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j112 = j13;
                FloatingActionButtonElevation floatingActionButtonElevation10 = floatingActionButtonElevationM776elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource3;
                Modifier modifier12 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource12, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource12;
                shape3 = shape2;
                j14 = j12;
                modifier4 = modifier12;
                jM731contentColorForek8zF_U = j112;
                floatingActionButtonElevation2 = floatingActionButtonElevation10;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, mutableInteractionSource4, shape3, j14, jM731contentColorForek8zF_U, floatingActionButtonElevation2, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                mutableInteractionSource2 = mutableInteractionSource;
                if (composerStartRestartGroup.changed(mutableInteractionSource2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    shapeCopy = shape;
                    if (composerStartRestartGroup.changed(shapeCopy)) {
                    }
                    i12 |= i19;
                } else {
                    shapeCopy = shape;
                }
                i12 |= i19;
            } else {
                shapeCopy = shape;
            }
            if ((i10 & 57344) != 0) {
                i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
            }
            if ((i10 & 458752) == 0) {
                jM731contentColorForek8zF_U = j11;
                if ((i11 & 32) == 0) {
                    i17 = 65536;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            } else {
                jM731contentColorForek8zF_U = j11;
            }
            if ((3670016 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                    if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                    }
                    i12 |= i20;
                } else {
                    floatingActionButtonElevation2 = floatingActionButtonElevation;
                }
                i12 |= i20;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j113 = j13;
                    FloatingActionButtonElevation floatingActionButtonElevation11 = floatingActionButtonElevationM776elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource3;
                    Modifier modifier13 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource13, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource13;
                    shape3 = shape2;
                    j14 = j12;
                    modifier4 = modifier13;
                    jM731contentColorForek8zF_U = j113;
                    floatingActionButtonElevation2 = floatingActionButtonElevation11;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                        }
                        if ((i11 & 16) != 0) {
                            i16 = i12 & (-57345);
                            jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                        } else {
                            i16 = i12;
                            jM715getSecondary0d7_KjU = j10;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                            i16 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16 & (-3670017);
                            modifier3 = modifier2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                        } else {
                            j12 = jM715getSecondary0d7_KjU;
                            i12 = i16;
                            modifier3 = modifier2;
                            shape2 = shapeCopy;
                            j13 = jM731contentColorForek8zF_U;
                            floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                            mutableInteractionSource3 = mutableInteractionSource2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                    }
                    long j114 = j13;
                    FloatingActionButtonElevation floatingActionButtonElevation12 = floatingActionButtonElevationM776elevationxZ9QkE;
                    MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource3;
                    Modifier modifier14 = modifier3;
                    composer2 = composerStartRestartGroup;
                    SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource14, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    mutableInteractionSource4 = mutableInteractionSource14;
                    shape3 = shape2;
                    j14 = j12;
                    modifier4 = modifier14;
                    jM731contentColorForek8zF_U = j114;
                    floatingActionButtonElevation2 = floatingActionButtonElevation12;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, mutableInteractionSource4, shape3, j14, jM731contentColorForek8zF_U, floatingActionButtonElevation2, content, i10, i11));
            }
            i15 = 12582912;
            i12 |= i15;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j115 = j13;
                FloatingActionButtonElevation floatingActionButtonElevation13 = floatingActionButtonElevationM776elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource3;
                Modifier modifier15 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource15, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource15;
                shape3 = shape2;
                j14 = j12;
                modifier4 = modifier15;
                jM731contentColorForek8zF_U = j115;
                floatingActionButtonElevation2 = floatingActionButtonElevation13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j116 = j13;
                FloatingActionButtonElevation floatingActionButtonElevation14 = floatingActionButtonElevationM776elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource3;
                Modifier modifier16 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource16, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource16;
                shape3 = shape2;
                j14 = j12;
                modifier4 = modifier16;
                jM731contentColorForek8zF_U = j116;
                floatingActionButtonElevation2 = floatingActionButtonElevation14;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, mutableInteractionSource4, shape3, j14, jM731contentColorForek8zF_U, floatingActionButtonElevation2, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                shapeCopy = shape;
                if (composerStartRestartGroup.changed(shapeCopy)) {
                }
                i12 |= i19;
            } else {
                shapeCopy = shape;
            }
            i12 |= i19;
        } else {
            shapeCopy = shape;
        }
        if ((i10 & 57344) != 0) {
            i12 |= ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j10)) ? 8192 : 16384;
        }
        if ((i10 & 458752) == 0) {
            jM731contentColorForek8zF_U = j11;
            if ((i11 & 32) == 0) {
                i17 = 65536;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        } else {
            jM731contentColorForek8zF_U = j11;
        }
        if ((3670016 & i10) == 0) {
            if ((i11 & 64) == 0) {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
                if (composerStartRestartGroup.changed(floatingActionButtonElevation2)) {
                }
                i12 |= i20;
            } else {
                floatingActionButtonElevation2 = floatingActionButtonElevation;
            }
            i12 |= i20;
        } else {
            floatingActionButtonElevation2 = floatingActionButtonElevation;
        }
        if ((i11 & 128) != 0) {
            if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
            }
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j117 = j13;
                FloatingActionButtonElevation floatingActionButtonElevation15 = floatingActionButtonElevationM776elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource3;
                Modifier modifier17 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource17, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource17;
                shape3 = shape2;
                j14 = j12;
                modifier4 = modifier17;
                jM731contentColorForek8zF_U = j117;
                floatingActionButtonElevation2 = floatingActionButtonElevation15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                    }
                    if ((i11 & 16) != 0) {
                        i16 = i12 & (-57345);
                        jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                    } else {
                        i16 = i12;
                        jM715getSecondary0d7_KjU = j10;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                        i16 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16 & (-3670017);
                        modifier3 = modifier2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                    } else {
                        j12 = jM715getSecondary0d7_KjU;
                        i12 = i16;
                        modifier3 = modifier2;
                        shape2 = shapeCopy;
                        j13 = jM731contentColorForek8zF_U;
                        floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
                }
                long j118 = j13;
                FloatingActionButtonElevation floatingActionButtonElevation16 = floatingActionButtonElevationM776elevationxZ9QkE;
                MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource3;
                Modifier modifier18 = modifier3;
                composer2 = composerStartRestartGroup;
                SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource18, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                mutableInteractionSource4 = mutableInteractionSource18;
                shape3 = shape2;
                j14 = j12;
                modifier4 = modifier18;
                jM731contentColorForek8zF_U = j118;
                floatingActionButtonElevation2 = floatingActionButtonElevation16;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, mutableInteractionSource4, shape3, j14, jM731contentColorForek8zF_U, floatingActionButtonElevation2, content, i10, i11));
        }
        i15 = 12582912;
        i12 |= i15;
        if ((23967451 & i12) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                } else {
                    i16 = i12;
                    jM715getSecondary0d7_KjU = j10;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                    i16 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    j12 = jM715getSecondary0d7_KjU;
                    i12 = i16 & (-3670017);
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape2 = shapeCopy;
                    j13 = jM731contentColorForek8zF_U;
                    floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                } else {
                    j12 = jM715getSecondary0d7_KjU;
                    i12 = i16;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j13 = jM731contentColorForek8zF_U;
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                } else {
                    i16 = i12;
                    jM715getSecondary0d7_KjU = j10;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                    i16 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    j12 = jM715getSecondary0d7_KjU;
                    i12 = i16 & (-3670017);
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape2 = shapeCopy;
                    j13 = jM731contentColorForek8zF_U;
                    floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                } else {
                    j12 = jM715getSecondary0d7_KjU;
                    i12 = i16;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j13 = jM731contentColorForek8zF_U;
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
            }
            long j119 = j13;
            FloatingActionButtonElevation floatingActionButtonElevation17 = floatingActionButtonElevationM776elevationxZ9QkE;
            MutableInteractionSource mutableInteractionSource19 = mutableInteractionSource3;
            Modifier modifier19 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource19, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource4 = mutableInteractionSource19;
            shape3 = shape2;
            j14 = j12;
            modifier4 = modifier19;
            jM731contentColorForek8zF_U = j119;
            floatingActionButtonElevation2 = floatingActionButtonElevation17;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                } else {
                    i16 = i12;
                    jM715getSecondary0d7_KjU = j10;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                    i16 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    j12 = jM715getSecondary0d7_KjU;
                    i12 = i16 & (-3670017);
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape2 = shapeCopy;
                    j13 = jM731contentColorForek8zF_U;
                    floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                } else {
                    j12 = jM715getSecondary0d7_KjU;
                    i12 = i16;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j13 = jM731contentColorForek8zF_U;
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    shapeCopy = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getSmall().copy(CornerSizeKt.CornerSize(50));
                }
                if ((i11 & 16) != 0) {
                    i16 = i12 & (-57345);
                    jM715getSecondary0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m715getSecondary0d7_KjU();
                } else {
                    i16 = i12;
                    jM715getSecondary0d7_KjU = j10;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM715getSecondary0d7_KjU, composerStartRestartGroup, (i16 >> 12) & 14);
                    i16 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    j12 = jM715getSecondary0d7_KjU;
                    i12 = i16 & (-3670017);
                    modifier3 = modifier2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    shape2 = shapeCopy;
                    j13 = jM731contentColorForek8zF_U;
                    floatingActionButtonElevationM776elevationxZ9QkE = FloatingActionButtonDefaults.INSTANCE.m776elevationxZ9QkE(0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, 24576, 15);
                } else {
                    j12 = jM715getSecondary0d7_KjU;
                    i12 = i16;
                    modifier3 = modifier2;
                    shape2 = shapeCopy;
                    j13 = jM731contentColorForek8zF_U;
                    floatingActionButtonElevationM776elevationxZ9QkE = floatingActionButtonElevation2;
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1028985328, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:81)");
            }
            long j1110 = j13;
            FloatingActionButtonElevation floatingActionButtonElevation18 = floatingActionButtonElevationM776elevationxZ9QkE;
            MutableInteractionSource mutableInteractionSource110 = mutableInteractionSource3;
            Modifier modifier110 = modifier3;
            composer2 = composerStartRestartGroup;
            SurfaceKt.m835SurfaceLPr_se0(onClick, SemanticsModifierKt.semantics$default(modifier3, false, c.f7196p0, 1, null), false, shape2, j12, j13, null, floatingActionButtonElevationM776elevationxZ9QkE.elevation(mutableInteractionSource3, composerStartRestartGroup, ((i12 >> 6) & 14) | ((i12 >> 15) & 112)).getValue().m4403unboximpl(), mutableInteractionSource110, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1972871863, true, new d(j13, content, i12)), composer2, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (458752 & i12) | ((i12 << 18) & 234881024), 68);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            mutableInteractionSource4 = mutableInteractionSource110;
            shape3 = shape2;
            j14 = j12;
            modifier4 = modifier110;
            jM731contentColorForek8zF_U = j1110;
            floatingActionButtonElevation2 = floatingActionButtonElevation18;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(onClick, modifier4, mutableInteractionSource4, shape3, j14, jM731contentColorForek8zF_U, floatingActionButtonElevation2, content, i10, i11));
    }
}
