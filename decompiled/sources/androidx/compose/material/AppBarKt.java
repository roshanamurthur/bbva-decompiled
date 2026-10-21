package androidx.compose.material;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
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
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppBar.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0087\u0001\u0010\u0012\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0015\b\u0002\u0010\u0006\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u001e\b\u0002\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001ae\u0010\u0012\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aq\u0010\u001c\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\u001c\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\u0002¢\u0006\u0002\b\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0019\u0010 \u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0080\b\u001a,\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001d0#2\u0006\u0010!\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001dH\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006%"}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "Landroidx/compose/ui/Modifier;", "modifier", "navigationIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "actions", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "TopAppBar-xWeB9-s", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V", "TopAppBar", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "content", "TopAppBar-HsRjFd4", "(Landroidx/compose/ui/Modifier;JJFLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/graphics/Shape;", "cutoutShape", "BottomAppBar-Y1yfwus", "(Landroidx/compose/ui/Modifier;JJLandroidx/compose/ui/graphics/Shape;FLandroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomAppBar", "", "cutoutRadius", "verticalOffset", "calculateCutoutCircleYIntercept", "controlPointX", "radius", "Lkotlin/Pair;", "calculateRoundedEdgeIntercept", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,547:1\n400#1:549\n400#1:550\n400#1:551\n400#1:552\n400#1:553\n400#1:554\n76#2:548\n154#3:555\n154#3:556\n154#3:557\n154#3:559\n154#3:561\n154#3:562\n58#4:558\n58#4:560\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n426#1:549\n458#1:550\n459#1:551\n461#1:552\n468#1:553\n469#1:554\n224#1:548\n534#1:555\n536#1:556\n538#1:557\n541#1:559\n544#1:561\n546#1:562\n538#1:558\n541#1:560\n*E\n"})
public final class AppBarKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f6673a = Dp.m4389constructorimpl(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f6674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final Modifier f6675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final Modifier f6676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f6677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f6678f;

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f6679p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6680q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f6681r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f6679p0 = paddingValues;
            this.f6680q0 = function3;
            this.f6681r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1027830352, iIntValue, -1, "androidx.compose.material.AppBar.<anonymous> (AppBar.kt:519)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))}, ComposableLambdaKt.composableLambda(composer2, 1296061040, true, new androidx.compose.material.f(this.f6679p0, this.f6680q0, this.f6681r0)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f6682p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f6683q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f6684r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f6685s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f6686t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6687u0;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6688w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f6689x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f6, int i10, int i11, long j10, long j11, PaddingValues paddingValues, Modifier modifier, Shape shape, Function3 function3) {
            super(2);
            this.f6682p0 = j10;
            this.f6683q0 = j11;
            this.f6684r0 = f6;
            this.f6685s0 = paddingValues;
            this.f6686t0 = shape;
            this.f6687u0 = modifier;
            this.v0 = function3;
            this.f6688w0 = i10;
            this.f6689x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AppBarKt.a(this.f6682p0, this.f6683q0, this.f6684r0, this.f6685s0, this.f6686t0, this.f6687u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6688w0 | 1), this.f6689x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6690p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f6691q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f6692r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f6693s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f6694t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f6695u0;
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6696w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f6697x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(float f6, int i10, int i11, long j10, long j11, PaddingValues paddingValues, Modifier modifier, Shape shape, Function3 function3) {
            super(2);
            this.f6690p0 = modifier;
            this.f6691q0 = j10;
            this.f6692r0 = j11;
            this.f6693s0 = shape;
            this.f6694t0 = f6;
            this.f6695u0 = paddingValues;
            this.v0 = function3;
            this.f6696w0 = i10;
            this.f6697x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AppBarKt.m659BottomAppBarY1yfwus(this.f6690p0, this.f6691q0, this.f6692r0, this.f6693s0, this.f6694t0, this.f6695u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6696w0 | 1), this.f6697x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    @SourceDebugExtension({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,547:1\n73#2,6:548\n79#2:582\n83#2:587\n73#2,6:588\n79#2:622\n83#2:627\n78#3,11:554\n91#3:586\n78#3,11:594\n91#3:626\n456#4,8:565\n464#4,3:579\n467#4,3:583\n456#4,8:605\n464#4,3:619\n467#4,3:623\n4144#5,6:573\n4144#5,6:613\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt$TopAppBar$1\n*L\n97#1:548,6\n97#1:582\n97#1:587\n105#1:588,6\n105#1:622\n105#1:627\n97#1:554,11\n97#1:586\n105#1:594,11\n105#1:626\n97#1:565,8\n97#1:579,3\n97#1:583,3\n105#1:605,8\n105#1:619,3\n105#1:623,3\n97#1:573,6\n105#1:613,6\n*E\n"})
    public static final class d extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6698p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f6699q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6700r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6701s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i10, Function2 function2, Function2 function3, Function3 function4) {
            super(3);
            this.f6698p0 = function2;
            this.f6699q0 = i10;
            this.f6700r0 = function3;
            this.f6701s0 = function4;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            int i10;
            RowScope AppBar = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(AppBar, "$this$AppBar");
            if ((iIntValue & 14) == 0) {
                i10 = (composer2.changed(AppBar) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((i10 & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1484077694, iIntValue, -1, "androidx.compose.material.TopAppBar.<anonymous> (AppBar.kt:92)");
                }
                Function2<Composer, Integer, Unit> function2 = this.f6698p0;
                int i11 = this.f6699q0;
                if (function2 == null) {
                    composer2.startReplaceableGroup(-512812651);
                    SpacerKt.Spacer(AppBarKt.f6675c, composer2, 6);
                    composer2.endReplaceableGroup();
                } else {
                    composer2.startReplaceableGroup(-512812592);
                    Modifier modifier = AppBarKt.f6676d;
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    composer2.startReplaceableGroup(693286680);
                    MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically, composer2, 48);
                    composer2.startReplaceableGroup(-1323940314);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
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
                    Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                    if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getHigh(composer2, 6)))}, function2, composer2, ((i11 >> 3) & 112) | 8);
                    composer2.endReplaceableGroup();
                    composer2.endNode();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                    composer2.endReplaceableGroup();
                }
                Modifier modifierA = x.n1.a(AppBar, SizeKt.fillMaxHeight$default(Modifier.INSTANCE, 0.0f, 1, null), 1.0f, false, 2, null);
                Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                composer2.startReplaceableGroup(693286680);
                MeasurePolicy measurePolicyRowMeasurePolicy2 = RowKt.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), centerVertically2, composer2, 48);
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierA);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composer2);
                Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyRowMeasurePolicy2, composerM2074constructorimpl2, currentCompositionLocalMap2);
                if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(composer2, 6).getH6(), ComposableLambdaKt.composableLambda(composer2, -2021518195, true, new g(i11, this.f6700r0)), composer2, 48);
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(ContentAlpha.INSTANCE.getMedium(composer2, 6)))}, ComposableLambdaKt.composableLambda(composer2, 1157662914, true, new h(this.f6701s0, i11)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6702p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6703q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6704r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6705s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f6706t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f6707u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6708w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f6709x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function4, long j10, long j11, float f6, int i10, int i11) {
            super(2);
            this.f6702p0 = function2;
            this.f6703q0 = modifier;
            this.f6704r0 = function3;
            this.f6705s0 = function4;
            this.f6706t0 = j10;
            this.f6707u0 = j11;
            this.v0 = f6;
            this.f6708w0 = i10;
            this.f6709x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AppBarKt.m661TopAppBarxWeB9s(this.f6702p0, this.f6703q0, this.f6704r0, this.f6705s0, this.f6706t0, this.f6707u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6708w0 | 1), this.f6709x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AppBar.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6710p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f6711q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f6712r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f6713s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f6714t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6715u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f6716w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Modifier modifier, long j10, long j11, float f6, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f6710p0 = modifier;
            this.f6711q0 = j10;
            this.f6712r0 = j11;
            this.f6713s0 = f6;
            this.f6714t0 = paddingValues;
            this.f6715u0 = function3;
            this.v0 = i10;
            this.f6716w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            AppBarKt.m660TopAppBarHsRjFd4(this.f6710p0, this.f6711q0, this.f6712r0, this.f6713s0, this.f6714t0, this.f6715u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f6716w0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 4;
        float fM4389constructorimpl = Dp.m4389constructorimpl(f6);
        f6674b = fM4389constructorimpl;
        Modifier.Companion companion = Modifier.INSTANCE;
        f6675c = SizeKt.m340width3ABfNKs(companion, Dp.m4389constructorimpl(Dp.m4389constructorimpl(16) - fM4389constructorimpl));
        f6676d = SizeKt.m340width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m4389constructorimpl(Dp.m4389constructorimpl(72) - fM4389constructorimpl));
        f6677e = Dp.m4389constructorimpl(8);
        f6678f = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0129  */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x014c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0155  */
    /* JADX WARN: Code duplicated, block: B:111:0x015f  */
    /* JADX WARN: Code duplicated, block: B:114:0x016c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0181 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:121:0x0191  */
    /* JADX WARN: Code duplicated, block: B:124:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:129:0x01de  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    public static final void m659BottomAppBarY1yfwus(@Nullable Modifier modifier, long j10, long j11, @Nullable Shape shape, float f6, @Nullable PaddingValues paddingValues, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        long primarySurface;
        long j12;
        Shape shape2;
        int i13;
        float fM657getBottomAppBarElevationD9Ej5fM;
        int i14;
        int i15;
        int i16;
        int i17;
        Modifier modifier2;
        PaddingValues contentPadding;
        Modifier modifier3;
        Shape shape3;
        Shape rectangleShape;
        Modifier modifier4;
        Shape shape4;
        float f10;
        PaddingValues paddingValues2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1651948973);
        int i18 = i11 & 1;
        if (i18 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                primarySurface = j10;
                int i19 = composerStartRestartGroup.changed(primarySurface) ? 32 : 16;
                i12 |= i19;
            } else {
                primarySurface = j10;
            }
            i12 |= i19;
        } else {
            primarySurface = j10;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                j12 = j11;
                int i20 = composerStartRestartGroup.changed(j12) ? 256 : 128;
                i12 |= i20;
            } else {
                j12 = j11;
            }
            i12 |= i20;
        } else {
            j12 = j11;
        }
        int i21 = i11 & 8;
        if (i21 == 0) {
            if ((i10 & 7168) == 0) {
                shape2 = shape;
                i12 |= composerStartRestartGroup.changed(shape2) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((57344 & i10) == 0) {
                    fM657getBottomAppBarElevationD9Ej5fM = f6;
                    if (composerStartRestartGroup.changed(fM657getBottomAppBarElevationD9Ej5fM)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
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
                            if (i18 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            }
                            if ((i11 & 4) != 0) {
                                long jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                                i12 &= -897;
                                j12 = jM731contentColorForek8zF_U;
                            }
                            if (i21 != 0) {
                                shape2 = null;
                            }
                            if (i13 != 0) {
                                fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                            }
                            if (i15 != 0) {
                                modifier3 = modifier2;
                                contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            } else {
                                contentPadding = paddingValues;
                                modifier3 = modifier2;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            modifier3 = modifier;
                            contentPadding = paddingValues;
                        }
                        long j13 = primarySurface;
                        long j14 = j12;
                        float f11 = fM657getBottomAppBarElevationD9Ej5fM;
                        shape3 = shape2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                        }
                        FabPlacement fabPlacement = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                        if (shape3 == null && fabPlacement != null && fabPlacement.getIsDocked()) {
                            rectangleShape = new h0.k(shape3, fabPlacement);
                        } else {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        }
                        int i22 = i12 >> 3;
                        int i23 = i12 >> 6;
                        a(j13, j14, f11, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i22 & 112) | (i22 & 14) | (i23 & 896) | (i23 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        shape4 = shape3;
                        f10 = f11;
                        primarySurface = j13;
                        j12 = j14;
                        paddingValues2 = contentPadding;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        paddingValues2 = paddingValues;
                        shape4 = shape2;
                        f10 = fM657getBottomAppBarElevationD9Ej5fM;
                        modifier4 = modifier;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(f10, i10, i11, primarySurface, j12, paddingValues2, modifier4, shape4, content));
                }
                i17 = 1572864;
                i12 |= i17;
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U2 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U2;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U3 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U3;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j15 = primarySurface;
                    long j16 = j12;
                    float f12 = fM657getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    FabPlacement fabPlacement2 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 == null) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i24 = i12 >> 3;
                    int i25 = i12 >> 6;
                    a(j15, j16, f12, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i24 & 112) | (i24 & 14) | (i25 & 896) | (i25 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f10 = f12;
                    primarySurface = j15;
                    j12 = j16;
                    paddingValues2 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U4 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U4;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U5 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U5;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j17 = primarySurface;
                    long j18 = j12;
                    float f13 = fM657getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    FabPlacement fabPlacement3 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 == null) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i26 = i12 >> 3;
                    int i27 = i12 >> 6;
                    a(j17, j18, f13, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i26 & 112) | (i26 & 14) | (i27 & 896) | (i27 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f10 = f13;
                    primarySurface = j17;
                    j12 = j18;
                    paddingValues2 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(f10, i10, i11, primarySurface, j12, paddingValues2, modifier4, shape4, content));
            }
            i12 |= 24576;
            fM657getBottomAppBarElevationD9Ej5fM = f6;
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
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
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U6 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U6;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U7 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U7;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j19 = primarySurface;
                    long j110 = j12;
                    float f14 = fM657getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    FabPlacement fabPlacement4 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 == null) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i28 = i12 >> 3;
                    int i29 = i12 >> 6;
                    a(j19, j110, f14, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i28 & 112) | (i28 & 14) | (i29 & 896) | (i29 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f10 = f14;
                    primarySurface = j19;
                    j12 = j110;
                    paddingValues2 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U8 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U8;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U9 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U9;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j111 = primarySurface;
                    long j112 = j12;
                    float f15 = fM657getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    FabPlacement fabPlacement5 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 == null) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i210 = i12 >> 3;
                    int i211 = i12 >> 6;
                    a(j111, j112, f15, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i210 & 112) | (i210 & 14) | (i211 & 896) | (i211 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f10 = f15;
                    primarySurface = j111;
                    j12 = j112;
                    paddingValues2 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(f10, i10, i11, primarySurface, j12, paddingValues2, modifier4, shape4, content));
            }
            i17 = 1572864;
            i12 |= i17;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U10 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U10;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U11 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U11;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j113 = primarySurface;
                long j114 = j12;
                float f16 = fM657getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                FabPlacement fabPlacement6 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i212 = i12 >> 3;
                int i213 = i12 >> 6;
                a(j113, j114, f16, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i212 & 112) | (i212 & 14) | (i213 & 896) | (i213 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f10 = f16;
                primarySurface = j113;
                j12 = j114;
                paddingValues2 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U12 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U12;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U13 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U13;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j115 = primarySurface;
                long j116 = j12;
                float f17 = fM657getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                FabPlacement fabPlacement7 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i214 = i12 >> 3;
                int i215 = i12 >> 6;
                a(j115, j116, f17, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i214 & 112) | (i214 & 14) | (i215 & 896) | (i215 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f10 = f17;
                primarySurface = j115;
                j12 = j116;
                paddingValues2 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(f10, i10, i11, primarySurface, j12, paddingValues2, modifier4, shape4, content));
        }
        i12 |= 3072;
        shape2 = shape;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((57344 & i10) == 0) {
                fM657getBottomAppBarElevationD9Ej5fM = f6;
                if (composerStartRestartGroup.changed(fM657getBottomAppBarElevationD9Ej5fM)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
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
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U14 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U14;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U15 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U15;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j117 = primarySurface;
                    long j118 = j12;
                    float f18 = fM657getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    FabPlacement fabPlacement8 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 == null) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i216 = i12 >> 3;
                    int i217 = i12 >> 6;
                    a(j117, j118, f18, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i216 & 112) | (i216 & 14) | (i217 & 896) | (i217 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f10 = f18;
                    primarySurface = j117;
                    j12 = j118;
                    paddingValues2 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U16 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U16;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    } else {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i11 & 2) != 0) {
                            i12 &= -113;
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U17 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j12 = jM731contentColorForek8zF_U17;
                        }
                        if (i21 != 0) {
                            shape2 = null;
                        }
                        if (i13 != 0) {
                            fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                        }
                        if (i15 != 0) {
                            modifier3 = modifier2;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        } else {
                            contentPadding = paddingValues;
                            modifier3 = modifier2;
                        }
                    }
                    long j119 = primarySurface;
                    long j1110 = j12;
                    float f19 = fM657getBottomAppBarElevationD9Ej5fM;
                    shape3 = shape2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                    }
                    FabPlacement fabPlacement9 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                    if (shape3 == null) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    }
                    int i218 = i12 >> 3;
                    int i219 = i12 >> 6;
                    a(j119, j1110, f19, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i218 & 112) | (i218 & 14) | (i219 & 896) | (i219 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    shape4 = shape3;
                    f10 = f19;
                    primarySurface = j119;
                    j12 = j1110;
                    paddingValues2 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(f10, i10, i11, primarySurface, j12, paddingValues2, modifier4, shape4, content));
            }
            i17 = 1572864;
            i12 |= i17;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U18 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U18;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U19 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U19;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j1111 = primarySurface;
                long j1112 = j12;
                float f110 = fM657getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                FabPlacement fabPlacement10 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i2110 = i12 >> 3;
                int i2111 = i12 >> 6;
                a(j1111, j1112, f110, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i2110 & 112) | (i2110 & 14) | (i2111 & 896) | (i2111 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f10 = f110;
                primarySurface = j1111;
                j12 = j1112;
                paddingValues2 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U110 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U110;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U111 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U111;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j1113 = primarySurface;
                long j1114 = j12;
                float f111 = fM657getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                FabPlacement fabPlacement11 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i2112 = i12 >> 3;
                int i2113 = i12 >> 6;
                a(j1113, j1114, f111, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i2112 & 112) | (i2112 & 14) | (i2113 & 896) | (i2113 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f10 = f111;
                primarySurface = j1113;
                j12 = j1114;
                paddingValues2 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(f10, i10, i11, primarySurface, j12, paddingValues2, modifier4, shape4, content));
        }
        i12 |= 24576;
        fM657getBottomAppBarElevationD9Ej5fM = f6;
        i15 = i11 & 32;
        if (i15 != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i10 & 458752) == 0) {
            if (composerStartRestartGroup.changed(paddingValues)) {
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
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U112 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U112;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U113 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U113;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j1115 = primarySurface;
                long j1116 = j12;
                float f112 = fM657getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                FabPlacement fabPlacement12 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i2114 = i12 >> 3;
                int i2115 = i12 >> 6;
                a(j1115, j1116, f112, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i2114 & 112) | (i2114 & 14) | (i2115 & 896) | (i2115 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f10 = f112;
                primarySurface = j1115;
                j12 = j1116;
                paddingValues2 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U114 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U114;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U115 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j12 = jM731contentColorForek8zF_U115;
                    }
                    if (i21 != 0) {
                        shape2 = null;
                    }
                    if (i13 != 0) {
                        fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                    }
                    if (i15 != 0) {
                        modifier3 = modifier2;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    } else {
                        contentPadding = paddingValues;
                        modifier3 = modifier2;
                    }
                }
                long j1117 = primarySurface;
                long j1118 = j12;
                float f113 = fM657getBottomAppBarElevationD9Ej5fM;
                shape3 = shape2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
                }
                FabPlacement fabPlacement13 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
                if (shape3 == null) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                }
                int i2116 = i12 >> 3;
                int i2117 = i12 >> 6;
                a(j1117, j1118, f113, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i2116 & 112) | (i2116 & 14) | (i2117 & 896) | (i2117 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                shape4 = shape3;
                f10 = f113;
                primarySurface = j1117;
                j12 = j1118;
                paddingValues2 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(f10, i10, i11, primarySurface, j12, paddingValues2, modifier4, shape4, content));
        }
        i17 = 1572864;
        i12 |= i17;
        if ((i12 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U116 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jM731contentColorForek8zF_U116;
                }
                if (i21 != 0) {
                    shape2 = null;
                }
                if (i13 != 0) {
                    fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                }
                if (i15 != 0) {
                    modifier3 = modifier2;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                } else {
                    contentPadding = paddingValues;
                    modifier3 = modifier2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U117 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jM731contentColorForek8zF_U117;
                }
                if (i21 != 0) {
                    shape2 = null;
                }
                if (i13 != 0) {
                    fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                }
                if (i15 != 0) {
                    modifier3 = modifier2;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                } else {
                    contentPadding = paddingValues;
                    modifier3 = modifier2;
                }
            }
            long j1119 = primarySurface;
            long j11110 = j12;
            float f114 = fM657getBottomAppBarElevationD9Ej5fM;
            shape3 = shape2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
            }
            FabPlacement fabPlacement14 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
            if (shape3 == null) {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            } else {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            }
            int i2118 = i12 >> 3;
            int i2119 = i12 >> 6;
            a(j1119, j11110, f114, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i2118 & 112) | (i2118 & 14) | (i2119 & 896) | (i2119 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape4 = shape3;
            f10 = f114;
            primarySurface = j1119;
            j12 = j11110;
            paddingValues2 = contentPadding;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U118 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jM731contentColorForek8zF_U118;
                }
                if (i21 != 0) {
                    shape2 = null;
                }
                if (i13 != 0) {
                    fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                }
                if (i15 != 0) {
                    modifier3 = modifier2;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                } else {
                    contentPadding = paddingValues;
                    modifier3 = modifier2;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U119 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j12 = jM731contentColorForek8zF_U119;
                }
                if (i21 != 0) {
                    shape2 = null;
                }
                if (i13 != 0) {
                    fM657getBottomAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m657getBottomAppBarElevationD9Ej5fM();
                }
                if (i15 != 0) {
                    modifier3 = modifier2;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                } else {
                    contentPadding = paddingValues;
                    modifier3 = modifier2;
                }
            }
            long j11111 = primarySurface;
            long j11112 = j12;
            float f115 = fM657getBottomAppBarElevationD9Ej5fM;
            shape3 = shape2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1651948973, i12, -1, "androidx.compose.material.BottomAppBar (AppBar.kt:214)");
            }
            FabPlacement fabPlacement15 = (FabPlacement) composerStartRestartGroup.consume(ScaffoldKt.getLocalFabPlacement());
            if (shape3 == null) {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            } else {
                rectangleShape = RectangleShapeKt.getRectangleShape();
            }
            int i21110 = i12 >> 3;
            int i21111 = i12 >> 6;
            a(j11111, j11112, f115, contentPadding, rectangleShape, modifier3, content, composerStartRestartGroup, (i21110 & 112) | (i21110 & 14) | (i21111 & 896) | (i21111 & 7168) | ((i12 << 15) & 458752) | (i12 & 3670016), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            shape4 = shape3;
            f10 = f115;
            primarySurface = j11111;
            j12 = j11112;
            paddingValues2 = contentPadding;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(f10, i10, i11, primarySurface, j12, paddingValues2, modifier4, shape4, content));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013c  */
    /* JADX WARN: Code duplicated, block: B:103:0x0149  */
    /* JADX WARN: Code duplicated, block: B:106:0x0187  */
    /* JADX WARN: Code duplicated, block: B:111:0x019a  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /* JADX WARN: Code duplicated, block: B:99:0x012c  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    public static final void m660TopAppBarHsRjFd4(@Nullable Modifier modifier, long j10, long j11, float f6, @Nullable PaddingValues paddingValues, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long j12;
        long j13;
        float fM658getTopAppBarElevationD9Ej5fM;
        int i13;
        PaddingValues paddingValues2;
        int i14;
        int i15;
        Modifier modifier3;
        long primarySurface;
        Modifier modifier4;
        long j14;
        PaddingValues contentPadding;
        long j15;
        float f10;
        Modifier modifier5;
        long j16;
        long j17;
        float f11;
        PaddingValues paddingValues3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1897058582);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                j12 = j10;
                int i17 = composerStartRestartGroup.changed(j12) ? 32 : 16;
                i12 |= i17;
            } else {
                j12 = j10;
            }
            i12 |= i17;
        } else {
            j12 = j10;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                j13 = j11;
                int i18 = composerStartRestartGroup.changed(j13) ? 256 : 128;
                i12 |= i18;
            } else {
                j13 = j11;
            }
            i12 |= i18;
        } else {
            j13 = j11;
        }
        int i19 = i11 & 8;
        if (i19 == 0) {
            if ((i10 & 7168) == 0) {
                fM658getTopAppBarElevationD9Ej5fM = f6;
                i12 |= composerStartRestartGroup.changed(fM658getTopAppBarElevationD9Ej5fM) ? 2048 : 1024;
            }
            i13 = i11 & 16;
            if (i13 != 0) {
                if ((57344 & i10) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i12 |= i14;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 131072;
                        } else {
                            i15 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i16 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if ((i11 & 2) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                i12 &= -113;
                            } else {
                                primarySurface = j12;
                            }
                            if ((i11 & 4) != 0) {
                                long jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                                i12 &= -897;
                                j13 = jM731contentColorForek8zF_U;
                            }
                            if (i19 != 0) {
                                fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            }
                            if (i13 != 0) {
                                modifier4 = modifier3;
                                j14 = primarySurface;
                                contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                                j15 = j13;
                                f10 = fM658getTopAppBarElevationD9Ej5fM;
                            } else {
                                modifier4 = modifier3;
                                j14 = primarySurface;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                            }
                            int i20 = i12 >> 3;
                            a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i20 & 7168) | (i20 & 14) | 24576 | (i20 & 112) | (i20 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier5 = modifier4;
                            j16 = j14;
                            j17 = j15;
                            f11 = f10;
                            paddingValues3 = contentPadding;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 2) != 0) {
                                i12 &= -113;
                            }
                            if ((i11 & 4) != 0) {
                                i12 &= -897;
                            }
                            modifier4 = modifier2;
                            j14 = j12;
                        }
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                        }
                        int i21 = i12 >> 3;
                        a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i21 & 7168) | (i21 & 14) | 24576 | (i21 & 112) | (i21 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier4;
                        j16 = j14;
                        j17 = j15;
                        f11 = f10;
                        paddingValues3 = contentPadding;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier5 = modifier2;
                        j16 = j12;
                        j17 = j13;
                        f11 = fM658getTopAppBarElevationD9Ej5fM;
                        paddingValues3 = paddingValues2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier5, j16, j17, f11, paddingValues3, content, i10, i11));
                }
                i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i12 |= i15;
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U2 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U2;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U3 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U3;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i22 = i12 >> 3;
                    a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i22 & 7168) | (i22 & 14) | 24576 | (i22 & 112) | (i22 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j16 = j14;
                    j17 = j15;
                    f11 = f10;
                    paddingValues3 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U4 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U4;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U5 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U5;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i23 = i12 >> 3;
                    a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i23 & 7168) | (i23 & 14) | 24576 | (i23 & 112) | (i23 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j16 = j14;
                    j17 = j15;
                    f11 = f10;
                    paddingValues3 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier5, j16, j17, f11, paddingValues3, content, i10, i11));
            }
            i12 |= 24576;
            paddingValues2 = paddingValues;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U6 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U6;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U7 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U7;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i24 = i12 >> 3;
                    a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i24 & 7168) | (i24 & 14) | 24576 | (i24 & 112) | (i24 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j16 = j14;
                    j17 = j15;
                    f11 = f10;
                    paddingValues3 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U8 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U8;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U9 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U9;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i25 = i12 >> 3;
                    a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i25 & 7168) | (i25 & 14) | 24576 | (i25 & 112) | (i25 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j16 = j14;
                    j17 = j15;
                    f11 = f10;
                    paddingValues3 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier5, j16, j17, f11, paddingValues3, content, i10, i11));
            }
            i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i15;
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U10 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U10;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U11 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U11;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i26 = i12 >> 3;
                a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i26 & 7168) | (i26 & 14) | 24576 | (i26 & 112) | (i26 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j16 = j14;
                j17 = j15;
                f11 = f10;
                paddingValues3 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U12 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U12;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U13 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U13;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i27 = i12 >> 3;
                a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i27 & 7168) | (i27 & 14) | 24576 | (i27 & 112) | (i27 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j16 = j14;
                j17 = j15;
                f11 = f10;
                paddingValues3 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier5, j16, j17, f11, paddingValues3, content, i10, i11));
        }
        i12 |= 3072;
        fM658getTopAppBarElevationD9Ej5fM = f6;
        i13 = i11 & 16;
        if (i13 != 0) {
            if ((57344 & i10) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i12 |= i14;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 131072;
                    } else {
                        i15 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U14 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U14;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U15 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U15;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i28 = i12 >> 3;
                    a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i28 & 7168) | (i28 & 14) | 24576 | (i28 & 112) | (i28 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j16 = j14;
                    j17 = j15;
                    f11 = f10;
                    paddingValues3 = contentPadding;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U16 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U16;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -113;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 4) != 0) {
                            long jM731contentColorForek8zF_U17 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                            i12 &= -897;
                            j13 = jM731contentColorForek8zF_U17;
                        }
                        if (i19 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        }
                        if (i13 != 0) {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                        } else {
                            modifier4 = modifier3;
                            j14 = primarySurface;
                            j15 = j13;
                            f10 = fM658getTopAppBarElevationD9Ej5fM;
                            contentPadding = paddingValues2;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                    }
                    int i29 = i12 >> 3;
                    a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i29 & 7168) | (i29 & 14) | 24576 | (i29 & 112) | (i29 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    j16 = j14;
                    j17 = j15;
                    f11 = f10;
                    paddingValues3 = contentPadding;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier5, j16, j17, f11, paddingValues3, content, i10, i11));
            }
            i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i12 |= i15;
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U18 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U18;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U19 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U19;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i210 = i12 >> 3;
                a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i210 & 7168) | (i210 & 14) | 24576 | (i210 & 112) | (i210 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j16 = j14;
                j17 = j15;
                f11 = f10;
                paddingValues3 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U110 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U110;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U111 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U111;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i211 = i12 >> 3;
                a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i211 & 7168) | (i211 & 14) | 24576 | (i211 & 112) | (i211 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j16 = j14;
                j17 = j15;
                f11 = f10;
                paddingValues3 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier5, j16, j17, f11, paddingValues3, content, i10, i11));
        }
        i12 |= 24576;
        paddingValues2 = paddingValues;
        if ((i11 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 131072;
                } else {
                    i15 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U112 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U112;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U113 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U113;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i212 = i12 >> 3;
                a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i212 & 7168) | (i212 & 14) | 24576 | (i212 & 112) | (i212 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j16 = j14;
                j17 = j15;
                f11 = f10;
                paddingValues3 = contentPadding;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U114 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U114;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 4) != 0) {
                        long jM731contentColorForek8zF_U115 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                        j13 = jM731contentColorForek8zF_U115;
                    }
                    if (i19 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    }
                    if (i13 != 0) {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        modifier4 = modifier3;
                        j14 = primarySurface;
                        j15 = j13;
                        f10 = fM658getTopAppBarElevationD9Ej5fM;
                        contentPadding = paddingValues2;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
                }
                int i213 = i12 >> 3;
                a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i213 & 7168) | (i213 & 14) | 24576 | (i213 & 112) | (i213 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
                j16 = j14;
                j17 = j15;
                f11 = f10;
                paddingValues3 = contentPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier5, j16, j17, f11, paddingValues3, content, i10, i11));
        }
        i15 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i12 |= i15;
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -113;
                } else {
                    primarySurface = j12;
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U116 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j13 = jM731contentColorForek8zF_U116;
                }
                if (i19 != 0) {
                    fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j14 = primarySurface;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    j15 = j13;
                    f10 = fM658getTopAppBarElevationD9Ej5fM;
                } else {
                    modifier4 = modifier3;
                    j14 = primarySurface;
                    j15 = j13;
                    f10 = fM658getTopAppBarElevationD9Ej5fM;
                    contentPadding = paddingValues2;
                }
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -113;
                } else {
                    primarySurface = j12;
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U117 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j13 = jM731contentColorForek8zF_U117;
                }
                if (i19 != 0) {
                    fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j14 = primarySurface;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    j15 = j13;
                    f10 = fM658getTopAppBarElevationD9Ej5fM;
                } else {
                    modifier4 = modifier3;
                    j14 = primarySurface;
                    j15 = j13;
                    f10 = fM658getTopAppBarElevationD9Ej5fM;
                    contentPadding = paddingValues2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
            }
            int i214 = i12 >> 3;
            a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i214 & 7168) | (i214 & 14) | 24576 | (i214 & 112) | (i214 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j16 = j14;
            j17 = j15;
            f11 = f10;
            paddingValues3 = contentPadding;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -113;
                } else {
                    primarySurface = j12;
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U118 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j13 = jM731contentColorForek8zF_U118;
                }
                if (i19 != 0) {
                    fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j14 = primarySurface;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    j15 = j13;
                    f10 = fM658getTopAppBarElevationD9Ej5fM;
                } else {
                    modifier4 = modifier3;
                    j14 = primarySurface;
                    j15 = j13;
                    f10 = fM658getTopAppBarElevationD9Ej5fM;
                    contentPadding = paddingValues2;
                }
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -113;
                } else {
                    primarySurface = j12;
                }
                if ((i11 & 4) != 0) {
                    long jM731contentColorForek8zF_U119 = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                    j13 = jM731contentColorForek8zF_U119;
                }
                if (i19 != 0) {
                    fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                }
                if (i13 != 0) {
                    modifier4 = modifier3;
                    j14 = primarySurface;
                    contentPadding = AppBarDefaults.INSTANCE.getContentPadding();
                    j15 = j13;
                    f10 = fM658getTopAppBarElevationD9Ej5fM;
                } else {
                    modifier4 = modifier3;
                    j14 = primarySurface;
                    j15 = j13;
                    f10 = fM658getTopAppBarElevationD9Ej5fM;
                    contentPadding = paddingValues2;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1897058582, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:154)");
            }
            int i215 = i12 >> 3;
            a(j14, j15, f10, contentPadding, RectangleShapeKt.getRectangleShape(), modifier4, content, composerStartRestartGroup, (i215 & 7168) | (i215 & 14) | 24576 | (i215 & 112) | (i215 & 896) | ((i12 << 15) & 458752) | (3670016 & (i12 << 3)), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier4;
            j16 = j14;
            j17 = j15;
            f11 = f10;
            paddingValues3 = contentPadding;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(modifier5, j16, j17, f11, paddingValues3, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0128  */
    /* JADX WARN: Code duplicated, block: B:101:0x012a  */
    /* JADX WARN: Code duplicated, block: B:103:0x012d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:108:0x0147  */
    /* JADX WARN: Code duplicated, block: B:111:0x014c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0156  */
    /* JADX WARN: Code duplicated, block: B:114:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x0162  */
    /* JADX WARN: Code duplicated, block: B:118:0x016e  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:56:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x0101  */
    /* JADX WARN: Code duplicated, block: B:96:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    /* JADX WARN: Code duplicated, block: B:98:0x0124  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    public static final void m661TopAppBarxWeB9s(@NotNull Function2<? super Composer, ? super Integer, Unit> title, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, long j10, long j11, float f6, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i14;
        int i15;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function5;
        int i16;
        long j12;
        long j13;
        int i17;
        float f10;
        int i18;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function6;
        Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3M736getLambda1$material_release;
        long primarySurface;
        long jM731contentColorForek8zF_U;
        long j14;
        float fM658getTopAppBarElevationD9Ej5fM;
        Modifier modifier3;
        float f11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2087748139);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(title) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    function4 = function2;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        function5 = function3;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((57344 & i10) == 0) {
                        if ((i11 & 16) == 0) {
                            j12 = j10;
                            int i20 = composerStartRestartGroup.changed(j12) ? 16384 : 8192;
                            i12 |= i20;
                        } else {
                            j12 = j10;
                        }
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    if ((i10 & 458752) == 0) {
                        if ((i11 & 32) == 0) {
                            j13 = j11;
                            int i21 = composerStartRestartGroup.changed(j13) ? 131072 : 65536;
                            i12 |= i21;
                        } else {
                            j13 = j11;
                        }
                        i12 |= i21;
                    } else {
                        j13 = j11;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                        f10 = f6;
                    } else {
                        f10 = f6;
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(f10)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i12 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i19 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                function6 = null;
                            } else {
                                function6 = function4;
                            }
                            if (i15 != 0) {
                                function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                            } else {
                                function3M736getLambda1$material_release = function5;
                            }
                            if ((i11 & 16) != 0) {
                                primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                                i12 &= -57345;
                            } else {
                                primarySurface = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                                i12 &= -458753;
                            } else {
                                jM731contentColorForek8zF_U = j13;
                            }
                            if (i17 != 0) {
                                fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                                j14 = jM731contentColorForek8zF_U;
                            } else {
                                j14 = jM731contentColorForek8zF_U;
                                fM658getTopAppBarElevationD9Ej5fM = f10;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            modifier2 = modifier;
                            function6 = function4;
                            function3M736getLambda1$material_release = function5;
                            primarySurface = j12;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                            j14 = j13;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                        }
                        int i22 = i12 >> 12;
                        a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i22 & 896) | (i22 & 14) | 1600512 | (i22 & 112) | ((i12 << 12) & 458752), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        f11 = fM658getTopAppBarElevationD9Ej5fM;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        function6 = function4;
                        function3M736getLambda1$material_release = function5;
                        primarySurface = j12;
                        f11 = f10;
                        j14 = j13;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(title, modifier3, function6, function3M736getLambda1$material_release, primarySurface, j14, f11, i10, i11));
                }
                i12 |= 3072;
                function5 = function3;
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        j12 = j10;
                        if (composerStartRestartGroup.changed(j12)) {
                        }
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        j13 = j11;
                        if (composerStartRestartGroup.changed(j13)) {
                        }
                        i12 |= i21;
                    } else {
                        j13 = j11;
                    }
                    i12 |= i21;
                } else {
                    j13 = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    f10 = f6;
                } else {
                    f10 = f6;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f10)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i23 = i12 >> 12;
                    a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i23 & 896) | (i23 & 14) | 1600512 | (i23 & 112) | ((i12 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f11 = fM658getTopAppBarElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i24 = i12 >> 12;
                    a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i24 & 896) | (i24 & 14) | 1600512 | (i24 & 112) | ((i12 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f11 = fM658getTopAppBarElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(title, modifier3, function6, function3M736getLambda1$material_release, primarySurface, j14, f11, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            function4 = function2;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        j12 = j10;
                        if (composerStartRestartGroup.changed(j12)) {
                        }
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        j13 = j11;
                        if (composerStartRestartGroup.changed(j13)) {
                        }
                        i12 |= i21;
                    } else {
                        j13 = j11;
                    }
                    i12 |= i21;
                } else {
                    j13 = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    f10 = f6;
                } else {
                    f10 = f6;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f10)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i25 = i12 >> 12;
                    a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i25 & 896) | (i25 & 14) | 1600512 | (i25 & 112) | ((i12 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f11 = fM658getTopAppBarElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i26 = i12 >> 12;
                    a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i26 & 896) | (i26 & 14) | 1600512 | (i26 & 112) | ((i12 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f11 = fM658getTopAppBarElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(title, modifier3, function6, function3M736getLambda1$material_release, primarySurface, j14, f11, i10, i11));
            }
            i12 |= 3072;
            function5 = function3;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    j13 = j11;
                    if (composerStartRestartGroup.changed(j13)) {
                    }
                    i12 |= i21;
                } else {
                    j13 = j11;
                }
                i12 |= i21;
            } else {
                j13 = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i27 = i12 >> 12;
                a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i27 & 896) | (i27 & 14) | 1600512 | (i27 & 112) | ((i12 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f11 = fM658getTopAppBarElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i28 = i12 >> 12;
                a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i28 & 896) | (i28 & 14) | 1600512 | (i28 & 112) | ((i12 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f11 = fM658getTopAppBarElevationD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(title, modifier3, function6, function3M736getLambda1$material_release, primarySurface, j14, f11, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                function4 = function2;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        j12 = j10;
                        if (composerStartRestartGroup.changed(j12)) {
                        }
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        j13 = j11;
                        if (composerStartRestartGroup.changed(j13)) {
                        }
                        i12 |= i21;
                    } else {
                        j13 = j11;
                    }
                    i12 |= i21;
                } else {
                    j13 = j11;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                    f10 = f6;
                } else {
                    f10 = f6;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(f10)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i29 = i12 >> 12;
                    a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i29 & 896) | (i29 & 14) | 1600512 | (i29 & 112) | ((i12 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f11 = fM658getTopAppBarElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    } else {
                        if (i19 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            function6 = null;
                        } else {
                            function6 = function4;
                        }
                        if (i15 != 0) {
                            function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                        } else {
                            function3M736getLambda1$material_release = function5;
                        }
                        if ((i11 & 16) != 0) {
                            primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                            i12 &= -57345;
                        } else {
                            primarySurface = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                            i12 &= -458753;
                        } else {
                            jM731contentColorForek8zF_U = j13;
                        }
                        if (i17 != 0) {
                            fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                            j14 = jM731contentColorForek8zF_U;
                        } else {
                            j14 = jM731contentColorForek8zF_U;
                            fM658getTopAppBarElevationD9Ej5fM = f10;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                    }
                    int i210 = i12 >> 12;
                    a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i210 & 896) | (i210 & 14) | 1600512 | (i210 & 112) | ((i12 << 12) & 458752), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    f11 = fM658getTopAppBarElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(title, modifier3, function6, function3M736getLambda1$material_release, primarySurface, j14, f11, i10, i11));
            }
            i12 |= 3072;
            function5 = function3;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    j13 = j11;
                    if (composerStartRestartGroup.changed(j13)) {
                    }
                    i12 |= i21;
                } else {
                    j13 = j11;
                }
                i12 |= i21;
            } else {
                j13 = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i211 = i12 >> 12;
                a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i211 & 896) | (i211 & 14) | 1600512 | (i211 & 112) | ((i12 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f11 = fM658getTopAppBarElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i212 = i12 >> 12;
                a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i212 & 896) | (i212 & 14) | 1600512 | (i212 & 112) | ((i12 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f11 = fM658getTopAppBarElevationD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(title, modifier3, function6, function3M736getLambda1$material_release, primarySurface, j14, f11, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        function4 = function2;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j10;
                    if (composerStartRestartGroup.changed(j12)) {
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    j13 = j11;
                    if (composerStartRestartGroup.changed(j13)) {
                    }
                    i12 |= i21;
                } else {
                    j13 = j11;
                }
                i12 |= i21;
            } else {
                j13 = j11;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
                f10 = f6;
            } else {
                f10 = f6;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(f10)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i213 = i12 >> 12;
                a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i213 & 896) | (i213 & 14) | 1600512 | (i213 & 112) | ((i12 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f11 = fM658getTopAppBarElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                } else {
                    if (i19 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        function6 = null;
                    } else {
                        function6 = function4;
                    }
                    if (i15 != 0) {
                        function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                    } else {
                        function3M736getLambda1$material_release = function5;
                    }
                    if ((i11 & 16) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -57345;
                    } else {
                        primarySurface = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                        i12 &= -458753;
                    } else {
                        jM731contentColorForek8zF_U = j13;
                    }
                    if (i17 != 0) {
                        fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                        j14 = jM731contentColorForek8zF_U;
                    } else {
                        j14 = jM731contentColorForek8zF_U;
                        fM658getTopAppBarElevationD9Ej5fM = f10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
                }
                int i214 = i12 >> 12;
                a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i214 & 896) | (i214 & 14) | 1600512 | (i214 & 112) | ((i12 << 12) & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                f11 = fM658getTopAppBarElevationD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(title, modifier3, function6, function3M736getLambda1$material_release, primarySurface, j14, f11, i10, i11));
        }
        i12 |= 3072;
        function5 = function3;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j10;
                if (composerStartRestartGroup.changed(j12)) {
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            i12 |= i20;
        } else {
            j12 = j10;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                j13 = j11;
                if (composerStartRestartGroup.changed(j13)) {
                }
                i12 |= i21;
            } else {
                j13 = j11;
            }
            i12 |= i21;
        } else {
            j13 = j11;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
            f10 = f6;
        } else {
            f10 = f6;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(f10)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
        }
        if ((i12 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i15 != 0) {
                    function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                } else {
                    function3M736getLambda1$material_release = function5;
                }
                if ((i11 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -57345;
                } else {
                    primarySurface = j12;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                    i12 &= -458753;
                } else {
                    jM731contentColorForek8zF_U = j13;
                }
                if (i17 != 0) {
                    fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    j14 = jM731contentColorForek8zF_U;
                    fM658getTopAppBarElevationD9Ej5fM = f10;
                }
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i15 != 0) {
                    function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                } else {
                    function3M736getLambda1$material_release = function5;
                }
                if ((i11 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -57345;
                } else {
                    primarySurface = j12;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                    i12 &= -458753;
                } else {
                    jM731contentColorForek8zF_U = j13;
                }
                if (i17 != 0) {
                    fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    j14 = jM731contentColorForek8zF_U;
                    fM658getTopAppBarElevationD9Ej5fM = f10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
            }
            int i215 = i12 >> 12;
            a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i215 & 896) | (i215 & 14) | 1600512 | (i215 & 112) | ((i12 << 12) & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            f11 = fM658getTopAppBarElevationD9Ej5fM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i15 != 0) {
                    function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                } else {
                    function3M736getLambda1$material_release = function5;
                }
                if ((i11 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -57345;
                } else {
                    primarySurface = j12;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                    i12 &= -458753;
                } else {
                    jM731contentColorForek8zF_U = j13;
                }
                if (i17 != 0) {
                    fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    j14 = jM731contentColorForek8zF_U;
                    fM658getTopAppBarElevationD9Ej5fM = f10;
                }
            } else {
                if (i19 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    function6 = null;
                } else {
                    function6 = function4;
                }
                if (i15 != 0) {
                    function3M736getLambda1$material_release = ComposableSingletons$AppBarKt.INSTANCE.m736getLambda1$material_release();
                } else {
                    function3M736getLambda1$material_release = function5;
                }
                if ((i11 & 16) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -57345;
                } else {
                    primarySurface = j12;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 12) & 14);
                    i12 &= -458753;
                } else {
                    jM731contentColorForek8zF_U = j13;
                }
                if (i17 != 0) {
                    fM658getTopAppBarElevationD9Ej5fM = AppBarDefaults.INSTANCE.m658getTopAppBarElevationD9Ej5fM();
                    j14 = jM731contentColorForek8zF_U;
                } else {
                    j14 = jM731contentColorForek8zF_U;
                    fM658getTopAppBarElevationD9Ej5fM = f10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2087748139, i12, -1, "androidx.compose.material.TopAppBar (AppBar.kt:76)");
            }
            int i216 = i12 >> 12;
            a(primarySurface, j14, fM658getTopAppBarElevationD9Ej5fM, AppBarDefaults.INSTANCE.getContentPadding(), RectangleShapeKt.getRectangleShape(), modifier2, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1484077694, true, new d(i12, function6, title, function3M736getLambda1$material_release)), composerStartRestartGroup, (i216 & 896) | (i216 & 14) | 1600512 | (i216 & 112) | ((i12 << 12) & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            f11 = fM658getTopAppBarElevationD9Ej5fM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(title, modifier3, function6, function3M736getLambda1$material_release, primarySurface, j14, f11, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:91:0x0137  */
    /* JADX WARN: Code duplicated, block: B:95:0x0141  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(long j10, long j11, float f6, PaddingValues paddingValues, Shape shape, Modifier modifier, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier modifier2;
        int i17;
        int i18;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1249680788);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(j11) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                if ((i10 & 896) == 0) {
                    if (composerStartRestartGroup.changed(f6)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i12 |= i13;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i11 & 16) != 0) {
                    if ((57344 & i10) == 0) {
                        if (composerStartRestartGroup.changed(shape)) {
                            i15 = 16384;
                        } else {
                            i15 = 8192;
                        }
                        i12 |= i15;
                    }
                    i16 = i11 & 32;
                    if (i16 != 0) {
                        if ((i10 & 458752) == 0) {
                            modifier2 = modifier;
                            if (composerStartRestartGroup.changed(modifier2)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i12 |= i17;
                        }
                        if ((i11 & 64) != 0) {
                            i12 |= 1572864;
                        } else if ((3670016 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                        if ((2995931 & i12) == 599186 || !composerStartRestartGroup.getSkipping()) {
                            if (i16 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                            }
                            int i19 = i12 << 6;
                            SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i19 & 896) | (i19 & 7168) | ((i12 << 9) & 458752), 16);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    modifier2 = modifier;
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((3670016 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((2995931 & i12) == 599186) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                        }
                        int i110 = i12 << 6;
                        SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i110 & 896) | (i110 & 7168) | ((i12 << 9) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                        }
                        int i111 = i12 << 6;
                        SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i111 & 896) | (i111 & 7168) | ((i12 << 9) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
                }
                i12 |= 24576;
                i16 = i11 & 32;
                if (i16 != 0) {
                    if ((i10 & 458752) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((3670016 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((2995931 & i12) == 599186) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                        }
                        int i112 = i12 << 6;
                        SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i112 & 896) | (i112 & 7168) | ((i12 << 9) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                        }
                        int i113 = i12 << 6;
                        SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i113 & 896) | (i113 & 7168) | ((i12 << 9) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                modifier2 = modifier;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((3670016 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((2995931 & i12) == 599186) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i114 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i114 & 896) | (i114 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i115 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i115 & 896) | (i115 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changed(shape)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 32;
                if (i16 != 0) {
                    if ((i10 & 458752) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((3670016 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((2995931 & i12) == 599186) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                        }
                        int i116 = i12 << 6;
                        SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i116 & 896) | (i116 & 7168) | ((i12 << 9) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                        }
                        int i117 = i12 << 6;
                        SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i117 & 896) | (i117 & 7168) | ((i12 << 9) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                modifier2 = modifier;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((3670016 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((2995931 & i12) == 599186) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i118 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i118 & 896) | (i118 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i119 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i119 & 896) | (i119 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
            }
            i12 |= 24576;
            i16 = i11 & 32;
            if (i16 != 0) {
                if ((i10 & 458752) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((3670016 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((2995931 & i12) == 599186) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i1110 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i1110 & 896) | (i1110 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i1111 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i1111 & 896) | (i1111 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            modifier2 = modifier;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((3670016 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((2995931 & i12) == 599186) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i1112 = i12 << 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i1112 & 896) | (i1112 & 7168) | ((i12 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i1113 = i12 << 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i1113 & 896) | (i1113 & 7168) | ((i12 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
        }
        i12 |= 48;
        if ((i11 & 4) != 0) {
            if ((i10 & 896) == 0) {
                if (composerStartRestartGroup.changed(f6)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(paddingValues)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changed(shape)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 32;
                if (i16 != 0) {
                    if ((i10 & 458752) == 0) {
                        modifier2 = modifier;
                        if (composerStartRestartGroup.changed(modifier2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((3670016 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((2995931 & i12) == 599186) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                        }
                        int i1114 = i12 << 6;
                        SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i1114 & 896) | (i1114 & 7168) | ((i12 << 9) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                        }
                        int i1115 = i12 << 6;
                        SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i1115 & 896) | (i1115 & 7168) | ((i12 << 9) & 458752), 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                modifier2 = modifier;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((3670016 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((2995931 & i12) == 599186) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i1116 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i1116 & 896) | (i1116 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i1117 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i1117 & 896) | (i1117 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
            }
            i12 |= 24576;
            i16 = i11 & 32;
            if (i16 != 0) {
                if ((i10 & 458752) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((3670016 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((2995931 & i12) == 599186) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i1118 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i1118 & 896) | (i1118 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i1119 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i1119 & 896) | (i1119 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            modifier2 = modifier;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((3670016 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((2995931 & i12) == 599186) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i11110 = i12 << 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i11110 & 896) | (i11110 & 7168) | ((i12 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i11111 = i12 << 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i11111 & 896) | (i11111 & 7168) | ((i12 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changed(paddingValues)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((i11 & 16) != 0) {
            if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changed(shape)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            i16 = i11 & 32;
            if (i16 != 0) {
                if ((i10 & 458752) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((3670016 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((2995931 & i12) == 599186) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i11112 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i11112 & 896) | (i11112 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                    }
                    int i11113 = i12 << 6;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i11113 & 896) | (i11113 & 7168) | ((i12 << 9) & 458752), 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            modifier2 = modifier;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((3670016 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((2995931 & i12) == 599186) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i11114 = i12 << 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i11114 & 896) | (i11114 & 7168) | ((i12 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i11115 = i12 << 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i11115 & 896) | (i11115 & 7168) | ((i12 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
        }
        i12 |= 24576;
        i16 = i11 & 32;
        if (i16 != 0) {
            if ((i10 & 458752) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((3670016 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((2995931 & i12) == 599186) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i11116 = i12 << 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i11116 & 896) | (i11116 & 7168) | ((i12 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
                }
                int i11117 = i12 << 6;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i11117 & 896) | (i11117 & 7168) | ((i12 << 9) & 458752), 16);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        modifier2 = modifier;
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((3670016 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((2995931 & i12) == 599186) {
            if (i16 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
            }
            int i11118 = i12 << 6;
            SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i11118 & 896) | (i11118 & 7168) | ((i12 << 9) & 458752), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i16 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249680788, i12, -1, "androidx.compose.material.AppBar (AppBar.kt:504)");
            }
            int i11119 = i12 << 6;
            SurfaceKt.m834SurfaceFjzlyU(modifier3, shape, j10, j11, null, f6, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1027830352, true, new a(paddingValues, function3, i12)), composerStartRestartGroup, ((i12 >> 15) & 14) | 1572864 | ((i12 >> 9) & 112) | (i11119 & 896) | (i11119 & 7168) | ((i12 << 9) & 458752), 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(f6, i10, i11, j10, j11, paddingValues, modifier3, shape, function3));
    }

    public static final float calculateCutoutCircleYIntercept(float f6, float f10) {
        return -((float) Math.sqrt((f6 * f6) - (f10 * f10)));
    }

    @NotNull
    public static final Pair<Float, Float> calculateRoundedEdgeIntercept(float f6, float f10, float f11) {
        Float fValueOf;
        Float fValueOf2;
        Pair pair;
        Float fValueOf3;
        Float fValueOf4;
        float f12 = f10 * f10;
        float f13 = f11 * f11;
        float f14 = (f6 * f6) + f12;
        float f15 = f6 * f13;
        double d2 = (f14 - f13) * f12 * f13;
        float fSqrt = (f15 - ((float) Math.sqrt(d2))) / f14;
        float fSqrt2 = (f15 + ((float) Math.sqrt(d2))) / f14;
        float fSqrt3 = (float) Math.sqrt(f13 - (fSqrt * fSqrt));
        float fSqrt4 = (float) Math.sqrt(f13 - (fSqrt2 * fSqrt2));
        if (f10 > 0.0f) {
            if (fSqrt3 > fSqrt4) {
                fValueOf3 = Float.valueOf(fSqrt);
                fValueOf4 = Float.valueOf(fSqrt3);
            } else {
                fValueOf3 = Float.valueOf(fSqrt2);
                fValueOf4 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf3, fValueOf4);
        } else {
            if (fSqrt3 < fSqrt4) {
                fValueOf = Float.valueOf(fSqrt);
                fValueOf2 = Float.valueOf(fSqrt3);
            } else {
                fValueOf = Float.valueOf(fSqrt2);
                fValueOf2 = Float.valueOf(fSqrt4);
            }
            pair = TuplesKt.to(fValueOf, fValueOf2);
        }
        float fFloatValue = ((Number) pair.component1()).floatValue();
        float fFloatValue2 = ((Number) pair.component2()).floatValue();
        if (fFloatValue < f6) {
            fFloatValue2 = -fFloatValue2;
        }
        return TuplesKt.to(Float.valueOf(fFloatValue), Float.valueOf(fFloatValue2));
    }
}
