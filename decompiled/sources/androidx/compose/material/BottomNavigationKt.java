package androidx.compose.material;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.foundation.selection.SelectableKt;
import androidx.compose.material.ripple.RippleKt;
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
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BottomNavigation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a[\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\b\n¢\u0006\u0002\b\u000bH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0095\u0001\u0010\u001e\u001a\u00020\t*\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00122\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\t0\u0012¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\u00102\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012¢\u0006\u0002\b\n2\b\b\u0002\u0010\u0017\u001a\u00020\u00102\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "backgroundColor", "contentColor", "Landroidx/compose/ui/unit/Dp;", "elevation", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "", "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "content", "BottomNavigation-PEIptTM", "(Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "BottomNavigation", "", "selected", "Lkotlin/Function0;", "onClick", "icon", "enabled", "label", "alwaysShowLabel", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "selectedContentColor", "unselectedContentColor", "BottomNavigationItem-jY6E1Zs", "(Landroidx/compose/foundation/layout/RowScope;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function2;ZLandroidx/compose/foundation/interaction/MutableInteractionSource;JJLandroidx/compose/runtime/Composer;III)V", "BottomNavigationItem", "", "animationProgress", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composer.kt\nandroidx/compose/runtime/Updater\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 9 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,399:1\n25#2:400\n456#2,8:424\n464#2,3:438\n467#2,3:442\n456#2,8:461\n464#2,3:475\n456#2,8:495\n464#2,3:509\n467#2,3:513\n456#2,8:535\n464#2,3:549\n467#2,3:553\n467#2,3:558\n1097#3,6:401\n76#4:407\n67#5,5:408\n72#5:441\n76#5:446\n66#5,6:478\n72#5:512\n76#5:517\n66#5,6:518\n72#5:552\n76#5:557\n78#6,11:413\n91#6:445\n75#6,14:447\n78#6,11:484\n91#6:516\n78#6,11:524\n91#6:556\n91#6:561\n4144#7,6:432\n4144#7,6:469\n4144#7,6:503\n4144#7,6:543\n81#8:562\n154#9:563\n154#9:564\n154#9:565\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt\n*L\n155#1:400\n170#1:424,8\n170#1:438,3\n170#1:442,3\n260#1:461,8\n260#1:475,3\n262#1:495,8\n262#1:509,3\n262#1:513,3\n264#1:535,8\n264#1:549,3\n264#1:553,3\n260#1:558,3\n155#1:401,6\n156#1:407\n170#1:408,5\n170#1:441\n170#1:446\n262#1:478,6\n262#1:512\n262#1:517\n264#1:518,6\n264#1:552\n264#1:557\n170#1:413,11\n170#1:445\n260#1:447,14\n262#1:484,11\n262#1:516\n264#1:524,11\n264#1:556\n260#1:561\n170#1:432,6\n260#1:469,6\n262#1:503,6\n264#1:543,6\n228#1:562\n387#1:563\n392#1:564\n398#1:565\n*E\n"})
public final class BottomNavigationKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Float> f6793a = new TweenSpec<>(300, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f6794b = Dp.m4389constructorimpl(56);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f6795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f6796d;

    /* JADX INFO: compiled from: BottomNavigation.kt */
    @SourceDebugExtension({"SMAP\nBottomNavigation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigation$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,399:1\n74#2,5:400\n79#2:433\n83#2:438\n78#3,11:405\n91#3:437\n456#4,8:416\n464#4,3:430\n467#4,3:434\n4144#5,6:424\n*S KotlinDebug\n*F\n+ 1 BottomNavigation.kt\nandroidx/compose/material/BottomNavigationKt$BottomNavigation$1\n*L\n103#1:400,5\n103#1:433\n103#1:438\n103#1:405,11\n103#1:437\n103#1:416,8\n103#1:430,3\n103#1:434,3\n103#1:424,6\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6797p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f6798q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f6797p0 = function3;
            this.f6798q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(678339930, iIntValue, -1, "androidx.compose.material.BottomNavigation.<anonymous> (BottomNavigation.kt:101)");
                }
                Modifier modifierSelectableGroup = SelectableGroupKt.selectableGroup(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), BottomNavigationKt.f6794b));
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                int i10 = ((this.f6798q0 >> 3) & 7168) | 48;
                composer2.startReplaceableGroup(693286680);
                int i11 = i10 >> 3;
                MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer2, (i11 & 112) | (i11 & 14));
                composer2.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierSelectableGroup);
                int i12 = ((((i10 << 3) & 112) << 9) & 7168) | 6;
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
                ai.a.j((i12 >> 3) & 112, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                this.f6797p0.invoke(RowScopeInstance.INSTANCE, composer2, Integer.valueOf(((i10 >> 6) & 112) | 6));
                composer2.endReplaceableGroup();
                composer2.endNode();
                composer2.endReplaceableGroup();
                composer2.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomNavigation.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6799p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f6800q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f6801r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f6802s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f6803t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f6804u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Modifier modifier, long j10, long j11, float f6, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f6799p0 = modifier;
            this.f6800q0 = j10;
            this.f6801r0 = j11;
            this.f6802s0 = f6;
            this.f6803t0 = function3;
            this.f6804u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BottomNavigationKt.m670BottomNavigationPEIptTM(this.f6799p0, this.f6800q0, this.f6801r0, this.f6802s0, this.f6803t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6804u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomNavigation.kt */
    public static final class c extends Lambda implements Function3<Float, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f6805p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6806q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6807r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f6808s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i10, Function2 function2, ComposableLambda composableLambda, boolean z10) {
            super(3);
            this.f6805p0 = z10;
            this.f6806q0 = function2;
            this.f6807r0 = composableLambda;
            this.f6808s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(Float f6, Composer composer, Integer num) {
            int i10;
            float fFloatValue = f6.floatValue();
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                i10 = (composer2.changed(fFloatValue) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((i10 & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1411872801, iIntValue, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:186)");
                }
                if (this.f6805p0) {
                    fFloatValue = 1.0f;
                }
                BottomNavigationKt.access$BottomNavigationItemBaselineLayout(this.f6806q0, this.f6807r0, fFloatValue, composer2, (this.f6808s0 >> 9) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomNavigation.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ long E0;
        public final /* synthetic */ int F0;
        public final /* synthetic */ int G0;
        public final /* synthetic */ int H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RowScope f6809p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f6810q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f6811r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6812s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Modifier f6813t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f6814u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ boolean f6815w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f6816x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ long f6817y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(RowScope rowScope, boolean z10, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, boolean z11, Function2<? super Composer, ? super Integer, Unit> function3, boolean z12, MutableInteractionSource mutableInteractionSource, long j10, long j11, int i10, int i11, int i12) {
            super(2);
            this.f6809p0 = rowScope;
            this.f6810q0 = z10;
            this.f6811r0 = function0;
            this.f6812s0 = function2;
            this.f6813t0 = modifier;
            this.f6814u0 = z11;
            this.v0 = function3;
            this.f6815w0 = z12;
            this.f6816x0 = mutableInteractionSource;
            this.f6817y0 = j10;
            this.E0 = j11;
            this.F0 = i10;
            this.G0 = i11;
            this.H0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BottomNavigationKt.m671BottomNavigationItemjY6E1Zs(this.f6809p0, this.f6810q0, this.f6811r0, this.f6812s0, this.f6813t0, this.f6814u0, this.v0, this.f6815w0, this.f6816x0, this.f6817y0, this.E0, composer, RecomposeScopeImplKt.updateChangedFlags(this.F0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.G0), this.H0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomNavigation.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f6818p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f6819q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int i10, Function2 function2) {
            super(2);
            this.f6818p0 = function2;
            this.f6819q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1343298261, iIntValue, -1, "androidx.compose.material.BottomNavigationItem.<anonymous>.<anonymous> (BottomNavigation.kt:159)");
                }
                TextStyle caption = MaterialTheme.INSTANCE.getTypography(composer2, 6).getCaption();
                TextKt.ProvideTextStyle(caption.m3985copyv2rsoow((16252927 & 1) != 0 ? caption.spanStyle.m3927getColor0d7_KjU() : 0L, (16252927 & 2) != 0 ? caption.spanStyle.getFontSize() : 0L, (16252927 & 4) != 0 ? caption.spanStyle.getFontWeight() : null, (16252927 & 8) != 0 ? caption.spanStyle.getFontStyle() : null, (16252927 & 16) != 0 ? caption.spanStyle.getFontSynthesis() : null, (16252927 & 32) != 0 ? caption.spanStyle.getFontFamily() : null, (16252927 & 64) != 0 ? caption.spanStyle.getFontFeatureSettings() : null, (16252927 & 128) != 0 ? caption.spanStyle.getLetterSpacing() : 0L, (16252927 & 256) != 0 ? caption.spanStyle.getBaselineShift() : null, (16252927 & 512) != 0 ? caption.spanStyle.getTextGeometricTransform() : null, (16252927 & 1024) != 0 ? caption.spanStyle.getLocaleList() : null, (16252927 & 2048) != 0 ? caption.spanStyle.getBackground() : 0L, (16252927 & 4096) != 0 ? caption.spanStyle.getTextDecoration() : null, (16252927 & 8192) != 0 ? caption.spanStyle.getShadow() : null, (16252927 & 16384) != 0 ? caption.spanStyle.getDrawStyle() : null, (16252927 & 32768) != 0 ? caption.paragraphStyle.getTextAlign() : TextAlign.m4289boximpl(TextAlign.INSTANCE.m4296getCentere0LSkKk()), (16252927 & 65536) != 0 ? caption.paragraphStyle.getTextDirection() : null, (16252927 & 131072) != 0 ? caption.paragraphStyle.getLineHeight() : 0L, (16252927 & 262144) != 0 ? caption.paragraphStyle.getTextIndent() : null, (16252927 & 524288) != 0 ? caption.platformStyle : null, (16252927 & 1048576) != 0 ? caption.paragraphStyle.getLineHeightStyle() : null, (16252927 & 2097152) != 0 ? caption.paragraphStyle.getLineBreak() : null, (16252927 & 4194304) != 0 ? caption.paragraphStyle.getHyphens() : null, (16252927 & 8388608) != 0 ? caption.paragraphStyle.getTextMotion() : null), this.f6818p0, composer2, (this.f6819q0 >> 15) & 112);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomNavigation.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function3<Float, Composer, Integer, Unit> f6820p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f6821q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Float> f6822r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, int i10, State<Float> state) {
            super(2);
            this.f6820p0 = function3;
            this.f6821q0 = i10;
            this.f6822r0 = state;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-138092754, iIntValue, -1, "androidx.compose.material.BottomNavigationTransition.<anonymous> (BottomNavigation.kt:237)");
                }
                this.f6820p0.invoke(Float.valueOf(BottomNavigationKt.access$BottomNavigationTransition_Klgx_Pg$lambda$3(this.f6822r0)), composer2, Integer.valueOf((this.f6821q0 >> 6) & 112));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BottomNavigation.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f6823p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f6824q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f6825r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<Float, Composer, Integer, Unit> f6826s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f6827t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(long j10, long j11, boolean z10, Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f6823p0 = j10;
            this.f6824q0 = j11;
            this.f6825r0 = z10;
            this.f6826s0 = function3;
            this.f6827t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BottomNavigationKt.a(this.f6823p0, this.f6824q0, this.f6825r0, this.f6826s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f6827t0 | 1));
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 12;
        f6795c = Dp.m4389constructorimpl(f6);
        f6796d = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce A[PHI: r2 r4 r5 r9
      0x00ce: PHI (r2v5 androidx.compose.ui.Modifier) = (r2v2 androidx.compose.ui.Modifier), (r2v8 androidx.compose.ui.Modifier) binds: [B:85:0x00fb, B:73:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r4v18 int) = (r4v14 int), (r4v20 int) binds: [B:85:0x00fb, B:73:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r5v6 long) = (r5v3 long), (r5v2 long) binds: [B:85:0x00fb, B:73:0x00cd] A[DONT_GENERATE, DONT_INLINE]
      0x00ce: PHI (r9v11 long) = (r9v3 long), (r9v2 long) binds: [B:85:0x00fb, B:73:0x00cd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0149  */
    /* JADX WARN: Code duplicated, block: B:97:0x0156  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BottomNavigation-PEIptTM, reason: not valid java name */
    public static final void m670BottomNavigationPEIptTM(@Nullable Modifier modifier, long j10, long j11, float f6, @NotNull Function3<? super RowScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long primarySurface;
        long jM731contentColorForek8zF_U;
        float f10;
        int i13;
        Modifier modifier3;
        float fM669getElevationD9Ej5fM;
        int i14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(456489494);
        int i15 = i11 & 1;
        if (i15 != 0) {
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
                primarySurface = j10;
                int i16 = composerStartRestartGroup.changed(primarySurface) ? 32 : 16;
                i12 |= i16;
            } else {
                primarySurface = j10;
            }
            i12 |= i16;
        } else {
            primarySurface = j10;
        }
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                jM731contentColorForek8zF_U = j11;
                int i17 = composerStartRestartGroup.changed(jM731contentColorForek8zF_U) ? 256 : 128;
                i12 |= i17;
            } else {
                jM731contentColorForek8zF_U = j11;
            }
            i12 |= i17;
        } else {
            jM731contentColorForek8zF_U = j11;
        }
        int i18 = i11 & 8;
        if (i18 == 0) {
            if ((i10 & 7168) == 0) {
                f10 = f6;
                i12 |= composerStartRestartGroup.changed(f10) ? 2048 : 1024;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i13 = 16384;
                } else {
                    i13 = 8192;
                }
                i12 |= i13;
            }
            if ((46811 & i12) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                        i12 &= -897;
                    }
                    if (i18 != 0) {
                        fM669getElevationD9Ej5fM = BottomNavigationDefaults.INSTANCE.m669getElevationD9Ej5fM();
                    }
                    long j12 = jM731contentColorForek8zF_U;
                    i14 = i12;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(456489494, i14, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:89)");
                    }
                    int i19 = i14 << 3;
                    SurfaceKt.m834SurfaceFjzlyU(modifier3, null, primarySurface, j12, null, fM669getElevationD9Ej5fM, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 678339930, true, new a(content, i14)), composerStartRestartGroup, (i14 & 14) | 1572864 | (i19 & 896) | (i19 & 7168) | ((i14 << 6) & 458752), 18);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    jM731contentColorForek8zF_U = j12;
                    f10 = fM669getElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    modifier3 = modifier2;
                }
                fM669getElevationD9Ej5fM = f10;
                long j13 = jM731contentColorForek8zF_U;
                i14 = i12;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(456489494, i14, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:89)");
                }
                int i110 = i14 << 3;
                SurfaceKt.m834SurfaceFjzlyU(modifier3, null, primarySurface, j13, null, fM669getElevationD9Ej5fM, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 678339930, true, new a(content, i14)), composerStartRestartGroup, (i14 & 14) | 1572864 | (i110 & 896) | (i110 & 7168) | ((i14 << 6) & 458752), 18);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                jM731contentColorForek8zF_U = j13;
                f10 = fM669getElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, primarySurface, jM731contentColorForek8zF_U, f10, content, i10, i11));
        }
        i12 |= 3072;
        f10 = f6;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changedInstance(content)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i12 |= i13;
        }
        if ((46811 & i12) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    fM669getElevationD9Ej5fM = BottomNavigationDefaults.INSTANCE.m669getElevationD9Ej5fM();
                } else {
                    fM669getElevationD9Ej5fM = f10;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    fM669getElevationD9Ej5fM = BottomNavigationDefaults.INSTANCE.m669getElevationD9Ej5fM();
                } else {
                    fM669getElevationD9Ej5fM = f10;
                }
            }
            long j14 = jM731contentColorForek8zF_U;
            i14 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(456489494, i14, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:89)");
            }
            int i111 = i14 << 3;
            SurfaceKt.m834SurfaceFjzlyU(modifier3, null, primarySurface, j14, null, fM669getElevationD9Ej5fM, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 678339930, true, new a(content, i14)), composerStartRestartGroup, (i14 & 14) | 1572864 | (i111 & 896) | (i111 & 7168) | ((i14 << 6) & 458752), 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jM731contentColorForek8zF_U = j14;
            f10 = fM669getElevationD9Ej5fM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    fM669getElevationD9Ej5fM = BottomNavigationDefaults.INSTANCE.m669getElevationD9Ej5fM();
                } else {
                    fM669getElevationD9Ej5fM = f10;
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    primarySurface = ColorsKt.getPrimarySurface(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6));
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(primarySurface, composerStartRestartGroup, (i12 >> 3) & 14);
                    i12 &= -897;
                }
                if (i18 != 0) {
                    fM669getElevationD9Ej5fM = BottomNavigationDefaults.INSTANCE.m669getElevationD9Ej5fM();
                } else {
                    fM669getElevationD9Ej5fM = f10;
                }
            }
            long j15 = jM731contentColorForek8zF_U;
            i14 = i12;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(456489494, i14, -1, "androidx.compose.material.BottomNavigation (BottomNavigation.kt:89)");
            }
            int i112 = i14 << 3;
            SurfaceKt.m834SurfaceFjzlyU(modifier3, null, primarySurface, j15, null, fM669getElevationD9Ej5fM, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 678339930, true, new a(content, i14)), composerStartRestartGroup, (i14 & 14) | 1572864 | (i112 & 896) | (i112 & 7168) | ((i14 << 6) & 458752), 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            jM731contentColorForek8zF_U = j15;
            f10 = fM669getElevationD9Ej5fM;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(modifier3, primarySurface, jM731contentColorForek8zF_U, f10, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0127  */
    /* JADX WARN: Code duplicated, block: B:103:0x0132 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x0139  */
    /* JADX WARN: Code duplicated, block: B:109:0x013f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0143  */
    /* JADX WARN: Code duplicated, block: B:114:0x014e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0155  */
    /* JADX WARN: Code duplicated, block: B:120:0x0163  */
    /* JADX WARN: Code duplicated, block: B:126:0x017f  */
    /* JADX WARN: Code duplicated, block: B:128:0x018b  */
    /* JADX WARN: Code duplicated, block: B:138:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:147:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:151:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:156:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:157:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:160:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:162:0x0226  */
    /* JADX WARN: Code duplicated, block: B:165:0x0232  */
    /* JADX WARN: Code duplicated, block: B:167:0x023c  */
    /* JADX WARN: Code duplicated, block: B:169:0x024e  */
    /* JADX WARN: Code duplicated, block: B:172:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:175:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:176:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:179:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:181:0x0308  */
    /* JADX WARN: Code duplicated, block: B:184:0x034e  */
    /* JADX WARN: Code duplicated, block: B:189:0x0363  */
    /* JADX WARN: Code duplicated, block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:46:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x008c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x0101  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x0110  */
    /* JADX WARN: Code duplicated, block: B:93:0x0116  */
    /* JADX WARN: Code duplicated, block: B:94:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BottomNavigationItem-jY6E1Zs, reason: not valid java name */
    public static final void m671BottomNavigationItemjY6E1Zs(@NotNull RowScope BottomNavigationItem, boolean z10, @NotNull Function0<Unit> onClick, @NotNull Function2<? super Composer, ? super Integer, Unit> icon, @Nullable Modifier modifier, boolean z11, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z12, @Nullable MutableInteractionSource mutableInteractionSource, long j10, long j11, @Nullable Composer composer, int i10, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        Modifier modifier2;
        int i17;
        int i18;
        boolean z13;
        int i19;
        int i20;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        ComposableLambda composableLambda;
        Modifier modifier3;
        boolean z14;
        MutableInteractionSource mutableInteractionSource2;
        long jM2518unboximpl;
        long jM2507copywmQWz5c$default;
        int i27;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Function0<ComposeUiNode> constructor;
        Composer composerM2074constructorimpl;
        Function2 function2C;
        Function2<? super Composer, ? super Integer, Unit> function4;
        boolean z15;
        boolean z16;
        Modifier modifier4;
        MutableInteractionSource mutableInteractionSource3;
        long j12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(BottomNavigationItem, "$this$BottomNavigationItem");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1473735525);
        if ((Integer.MIN_VALUE & i12) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(BottomNavigationItem) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        if ((i12 & 1) == 0) {
            if ((i10 & 112) == 0) {
                i13 |= composerStartRestartGroup.changed(z10) ? 32 : 16;
            }
            if ((i12 & 2) != 0) {
                i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            } else if ((i10 & 896) == 0) {
                if (composerStartRestartGroup.changedInstance(onClick)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i13 |= i14;
            }
            if ((i12 & 4) != 0) {
                i13 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(icon)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((57344 & i10) == 0) {
                    modifier2 = modifier;
                    if (composerStartRestartGroup.changed(modifier2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((458752 & i10) == 0) {
                        z13 = z11;
                        if (composerStartRestartGroup.changed(z13)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= 1572864;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changedInstance(function3)) {
                                i21 = 1048576;
                            } else {
                                i21 = 524288;
                            }
                            i13 |= i21;
                        }
                    }
                    i22 = i12 & 64;
                    if (i22 != 0) {
                        i13 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(z12)) {
                            i23 = 8388608;
                        } else {
                            i23 = 4194304;
                        }
                        i13 |= i23;
                    }
                    i24 = i12 & 128;
                    if (i24 != 0) {
                        i13 |= 100663296;
                    } else if ((i10 & 234881024) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i25 = 33554432;
                        }
                        i13 |= i25;
                    }
                    if ((i10 & 1879048192) != 0) {
                        i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                    }
                    if ((i11 & 14) == 0) {
                        i26 = i11 | (((i12 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 2 : 4);
                    } else {
                        i26 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378 && (i26 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        z16 = z12;
                        mutableInteractionSource3 = mutableInteractionSource;
                        function4 = function3;
                        modifier4 = modifier2;
                        z15 = z13;
                        jM2518unboximpl = j10;
                        j12 = j11;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        composableLambda = null;
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i16 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i18 != 0) {
                                z13 = true;
                            }
                            if (i20 != 0) {
                                function3 = null;
                            }
                            if (i22 != 0) {
                                z14 = true;
                            } else {
                                z14 = z12;
                            }
                            if (i24 != 0) {
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
                            if ((i12 & 256) != 0) {
                                jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                                i13 &= -1879048193;
                            } else {
                                jM2518unboximpl = j10;
                            }
                            if ((i12 & 512) != 0) {
                                jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                                i26 &= -15;
                            } else {
                                jM2507copywmQWz5c$default = j11;
                            }
                            i27 = i26;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i12 & 256) != 0) {
                                i13 &= -1879048193;
                            }
                            if ((i12 & 512) != 0) {
                                i26 &= -15;
                            }
                            z14 = z12;
                            mutableInteractionSource2 = mutableInteractionSource;
                            jM2507copywmQWz5c$default = j11;
                            modifier3 = modifier2;
                            i27 = i26;
                            jM2518unboximpl = j10;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                        }
                        if (function3 != null) {
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                        }
                        ComposableLambda composableLambda2 = composableLambda;
                        Modifier modifierA = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Modifier modifier5 = modifier3;
                        composerStartRestartGroup.startReplaceableGroup(733328855);
                        MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource2;
                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                        boolean z17 = z13;
                        constructor = companion.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierA);
                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                        function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                        }
                        ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda2, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function3;
                        z15 = z17;
                        z16 = z14;
                        modifier4 = modifier5;
                        mutableInteractionSource3 = mutableInteractionSource4;
                        j12 = jM2507copywmQWz5c$default;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(BottomNavigationItem, z10, onClick, icon, modifier4, z15, function4, z16, mutableInteractionSource3, jM2518unboximpl, j12, i10, i11, i12));
                }
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                z13 = z11;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 128;
                if (i24 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i25 = 33554432;
                    }
                    i13 |= i25;
                }
                if ((i10 & 1879048192) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i11 & 14) == 0) {
                    i26 = i11 | (((i12 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 2 : 4);
                } else {
                    i26 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    composableLambda = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                    }
                    ComposableLambda composableLambda3 = composableLambda;
                    Modifier modifierA2 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    Alignment center2 = Alignment.INSTANCE.getCenter();
                    Modifier modifier6 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource5 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center2, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    boolean z18 = z13;
                    constructor = companion2.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierA2);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy2, composerM2074constructorimpl, currentCompositionLocalMap2);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda3, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    z15 = z18;
                    z16 = z14;
                    modifier4 = modifier6;
                    mutableInteractionSource3 = mutableInteractionSource5;
                    j12 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    composableLambda = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                    }
                    ComposableLambda composableLambda4 = composableLambda;
                    Modifier modifierA3 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    Alignment center3 = Alignment.INSTANCE.getCenter();
                    Modifier modifier7 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource6 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(center3, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    boolean z19 = z13;
                    constructor = companion3.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierA3);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy3, composerM2074constructorimpl, currentCompositionLocalMap3);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance3 = BoxScopeInstance.INSTANCE;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda4, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    z15 = z19;
                    z16 = z14;
                    modifier4 = modifier7;
                    mutableInteractionSource3 = mutableInteractionSource6;
                    j12 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(BottomNavigationItem, z10, onClick, icon, modifier4, z15, function4, z16, mutableInteractionSource3, jM2518unboximpl, j12, i10, i11, i12));
            }
            i13 |= 24576;
            modifier2 = modifier;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((458752 & i10) == 0) {
                    z13 = z11;
                    if (composerStartRestartGroup.changed(z13)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 128;
                if (i24 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i25 = 33554432;
                    }
                    i13 |= i25;
                }
                if ((i10 & 1879048192) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i11 & 14) == 0) {
                    i26 = i11 | (((i12 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 2 : 4);
                } else {
                    i26 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    composableLambda = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                    }
                    ComposableLambda composableLambda5 = composableLambda;
                    Modifier modifierA4 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    Alignment center4 = Alignment.INSTANCE.getCenter();
                    Modifier modifier8 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource7 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy4 = BoxKt.rememberBoxMeasurePolicy(center4, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    boolean z110 = z13;
                    constructor = companion4.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf4 = LayoutKt.modifierMaterializerOf(modifierA4);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion4, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy4, composerM2074constructorimpl, currentCompositionLocalMap4);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf4, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance4 = BoxScopeInstance.INSTANCE;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda5, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    z15 = z110;
                    z16 = z14;
                    modifier4 = modifier8;
                    mutableInteractionSource3 = mutableInteractionSource7;
                    j12 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    composableLambda = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                    }
                    ComposableLambda composableLambda6 = composableLambda;
                    Modifier modifierA5 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    Alignment center5 = Alignment.INSTANCE.getCenter();
                    Modifier modifier9 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource8 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy5 = BoxKt.rememberBoxMeasurePolicy(center5, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    boolean z111 = z13;
                    constructor = companion5.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf5 = LayoutKt.modifierMaterializerOf(modifierA5);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion5, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy5, composerM2074constructorimpl, currentCompositionLocalMap5);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf5, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance5 = BoxScopeInstance.INSTANCE;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda6, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    z15 = z111;
                    z16 = z14;
                    modifier4 = modifier9;
                    mutableInteractionSource3 = mutableInteractionSource8;
                    j12 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(BottomNavigationItem, z10, onClick, icon, modifier4, z15, function4, z16, mutableInteractionSource3, jM2518unboximpl, j12, i10, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z13 = z11;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i13 |= i23;
            }
            i24 = i12 & 128;
            if (i24 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i25 = 33554432;
                }
                i13 |= i25;
            }
            if ((i10 & 1879048192) != 0) {
                i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i11 & 14) == 0) {
                i26 = i11 | (((i12 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 2 : 4);
            } else {
                i26 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                composableLambda = null;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                }
                ComposableLambda composableLambda7 = composableLambda;
                Modifier modifierA6 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                Alignment center6 = Alignment.INSTANCE.getCenter();
                Modifier modifier10 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource9 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy6 = BoxKt.rememberBoxMeasurePolicy(center6, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                boolean z112 = z13;
                constructor = companion6.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf6 = LayoutKt.modifierMaterializerOf(modifierA6);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion6, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy6, composerM2074constructorimpl, currentCompositionLocalMap6);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf6, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance6 = BoxScopeInstance.INSTANCE;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda7, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                z15 = z112;
                z16 = z14;
                modifier4 = modifier10;
                mutableInteractionSource3 = mutableInteractionSource9;
                j12 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                composableLambda = null;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                }
                ComposableLambda composableLambda8 = composableLambda;
                Modifier modifierA7 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                Alignment center7 = Alignment.INSTANCE.getCenter();
                Modifier modifier11 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource10 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy7 = BoxKt.rememberBoxMeasurePolicy(center7, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap7 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                boolean z113 = z13;
                constructor = companion7.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf7 = LayoutKt.modifierMaterializerOf(modifierA7);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion7, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy7, composerM2074constructorimpl, currentCompositionLocalMap7);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf7, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance7 = BoxScopeInstance.INSTANCE;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda8, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                z15 = z113;
                z16 = z14;
                modifier4 = modifier11;
                mutableInteractionSource3 = mutableInteractionSource10;
                j12 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(BottomNavigationItem, z10, onClick, icon, modifier4, z15, function4, z16, mutableInteractionSource3, jM2518unboximpl, j12, i10, i11, i12));
        }
        i13 |= 48;
        if ((i12 & 2) != 0) {
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        } else if ((i10 & 896) == 0) {
            if (composerStartRestartGroup.changedInstance(onClick)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i13 |= i14;
        }
        if ((i12 & 4) != 0) {
            i13 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changedInstance(icon)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i13 |= i15;
        }
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((57344 & i10) == 0) {
                modifier2 = modifier;
                if (composerStartRestartGroup.changed(modifier2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((458752 & i10) == 0) {
                    z13 = z11;
                    if (composerStartRestartGroup.changed(z13)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i21 = 1048576;
                        } else {
                            i21 = 524288;
                        }
                        i13 |= i21;
                    }
                }
                i22 = i12 & 64;
                if (i22 != 0) {
                    i13 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(z12)) {
                        i23 = 8388608;
                    } else {
                        i23 = 4194304;
                    }
                    i13 |= i23;
                }
                i24 = i12 & 128;
                if (i24 != 0) {
                    i13 |= 100663296;
                } else if ((i10 & 234881024) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i25 = 33554432;
                    }
                    i13 |= i25;
                }
                if ((i10 & 1879048192) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
                }
                if ((i11 & 14) == 0) {
                    i26 = i11 | (((i12 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 2 : 4);
                } else {
                    i26 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    composableLambda = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                    }
                    ComposableLambda composableLambda9 = composableLambda;
                    Modifier modifierA8 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    Alignment center8 = Alignment.INSTANCE.getCenter();
                    Modifier modifier12 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource11 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy8 = BoxKt.rememberBoxMeasurePolicy(center8, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap8 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion8 = ComposeUiNode.INSTANCE;
                    boolean z114 = z13;
                    constructor = companion8.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf8 = LayoutKt.modifierMaterializerOf(modifierA8);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion8, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy8, composerM2074constructorimpl, currentCompositionLocalMap8);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf8, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance8 = BoxScopeInstance.INSTANCE;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda9, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    z15 = z114;
                    z16 = z14;
                    modifier4 = modifier12;
                    mutableInteractionSource3 = mutableInteractionSource11;
                    j12 = jM2507copywmQWz5c$default;
                } else {
                    composerStartRestartGroup.startDefaults();
                    composableLambda = null;
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    } else {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i18 != 0) {
                            z13 = true;
                        }
                        if (i20 != 0) {
                            function3 = null;
                        }
                        if (i22 != 0) {
                            z14 = true;
                        } else {
                            z14 = z12;
                        }
                        if (i24 != 0) {
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
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                            i13 &= -1879048193;
                        } else {
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 512) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                            i26 &= -15;
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        i27 = i26;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                    }
                    if (function3 != null) {
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                    }
                    ComposableLambda composableLambda10 = composableLambda;
                    Modifier modifierA9 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                    Alignment center9 = Alignment.INSTANCE.getCenter();
                    Modifier modifier13 = modifier3;
                    composerStartRestartGroup.startReplaceableGroup(733328855);
                    MutableInteractionSource mutableInteractionSource12 = mutableInteractionSource2;
                    MeasurePolicy measurePolicyRememberBoxMeasurePolicy9 = BoxKt.rememberBoxMeasurePolicy(center9, false, composerStartRestartGroup, 6);
                    composerStartRestartGroup.startReplaceableGroup(-1323940314);
                    currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap9 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    ComposeUiNode.Companion companion9 = ComposeUiNode.INSTANCE;
                    boolean z115 = z13;
                    constructor = companion9.getConstructor();
                    Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf9 = LayoutKt.modifierMaterializerOf(modifierA9);
                    if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                    function2C = com.google.android.gms.measurement.internal.a.c(companion9, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy9, composerM2074constructorimpl, currentCompositionLocalMap9);
                    if (composerM2074constructorimpl.getInserting()) {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    } else {
                        bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                    }
                    ai.a.j(0, function3ModifierMaterializerOf9, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                    BoxScopeInstance boxScopeInstance9 = BoxScopeInstance.INSTANCE;
                    a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda10, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                    if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function3;
                    z15 = z115;
                    z16 = z14;
                    modifier4 = modifier13;
                    mutableInteractionSource3 = mutableInteractionSource12;
                    j12 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(BottomNavigationItem, z10, onClick, icon, modifier4, z15, function4, z16, mutableInteractionSource3, jM2518unboximpl, j12, i10, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            z13 = z11;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i13 |= i23;
            }
            i24 = i12 & 128;
            if (i24 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i25 = 33554432;
                }
                i13 |= i25;
            }
            if ((i10 & 1879048192) != 0) {
                i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i11 & 14) == 0) {
                i26 = i11 | (((i12 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 2 : 4);
            } else {
                i26 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                composableLambda = null;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                }
                ComposableLambda composableLambda11 = composableLambda;
                Modifier modifierA10 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                Alignment center10 = Alignment.INSTANCE.getCenter();
                Modifier modifier14 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource13 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy10 = BoxKt.rememberBoxMeasurePolicy(center10, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap10 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion10 = ComposeUiNode.INSTANCE;
                boolean z116 = z13;
                constructor = companion10.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf10 = LayoutKt.modifierMaterializerOf(modifierA10);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion10, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy10, composerM2074constructorimpl, currentCompositionLocalMap10);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf10, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance10 = BoxScopeInstance.INSTANCE;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda11, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                z15 = z116;
                z16 = z14;
                modifier4 = modifier14;
                mutableInteractionSource3 = mutableInteractionSource13;
                j12 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                composableLambda = null;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                }
                ComposableLambda composableLambda12 = composableLambda;
                Modifier modifierA11 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                Alignment center11 = Alignment.INSTANCE.getCenter();
                Modifier modifier15 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource14 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy11 = BoxKt.rememberBoxMeasurePolicy(center11, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap11 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion11 = ComposeUiNode.INSTANCE;
                boolean z117 = z13;
                constructor = companion11.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf11 = LayoutKt.modifierMaterializerOf(modifierA11);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion11, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy11, composerM2074constructorimpl, currentCompositionLocalMap11);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf11, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance11 = BoxScopeInstance.INSTANCE;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda12, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                z15 = z117;
                z16 = z14;
                modifier4 = modifier15;
                mutableInteractionSource3 = mutableInteractionSource14;
                j12 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(BottomNavigationItem, z10, onClick, icon, modifier4, z15, function4, z16, mutableInteractionSource3, jM2518unboximpl, j12, i10, i11, i12));
        }
        i13 |= 24576;
        modifier2 = modifier;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((458752 & i10) == 0) {
                z13 = z11;
                if (composerStartRestartGroup.changed(z13)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i21 = 1048576;
                    } else {
                        i21 = 524288;
                    }
                    i13 |= i21;
                }
            }
            i22 = i12 & 64;
            if (i22 != 0) {
                i13 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(z12)) {
                    i23 = 8388608;
                } else {
                    i23 = 4194304;
                }
                i13 |= i23;
            }
            i24 = i12 & 128;
            if (i24 != 0) {
                i13 |= 100663296;
            } else if ((i10 & 234881024) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i25 = 33554432;
                }
                i13 |= i25;
            }
            if ((i10 & 1879048192) != 0) {
                i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
            }
            if ((i11 & 14) == 0) {
                i26 = i11 | (((i12 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 2 : 4);
            } else {
                i26 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                composableLambda = null;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                }
                ComposableLambda composableLambda13 = composableLambda;
                Modifier modifierA12 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                Alignment center12 = Alignment.INSTANCE.getCenter();
                Modifier modifier16 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource15 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy12 = BoxKt.rememberBoxMeasurePolicy(center12, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap12 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion12 = ComposeUiNode.INSTANCE;
                boolean z118 = z13;
                constructor = companion12.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf12 = LayoutKt.modifierMaterializerOf(modifierA12);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion12, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy12, composerM2074constructorimpl, currentCompositionLocalMap12);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf12, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance12 = BoxScopeInstance.INSTANCE;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda13, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                z15 = z118;
                z16 = z14;
                modifier4 = modifier16;
                mutableInteractionSource3 = mutableInteractionSource15;
                j12 = jM2507copywmQWz5c$default;
            } else {
                composerStartRestartGroup.startDefaults();
                composableLambda = null;
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i18 != 0) {
                        z13 = true;
                    }
                    if (i20 != 0) {
                        function3 = null;
                    }
                    if (i22 != 0) {
                        z14 = true;
                    } else {
                        z14 = z12;
                    }
                    if (i24 != 0) {
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
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                        i13 &= -1879048193;
                    } else {
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 512) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                        i26 &= -15;
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    i27 = i26;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
                }
                if (function3 != null) {
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
                }
                ComposableLambda composableLambda14 = composableLambda;
                Modifier modifierA13 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
                Alignment center13 = Alignment.INSTANCE.getCenter();
                Modifier modifier17 = modifier3;
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MutableInteractionSource mutableInteractionSource16 = mutableInteractionSource2;
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy13 = BoxKt.rememberBoxMeasurePolicy(center13, false, composerStartRestartGroup, 6);
                composerStartRestartGroup.startReplaceableGroup(-1323940314);
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap13 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion13 = ComposeUiNode.INSTANCE;
                boolean z119 = z13;
                constructor = companion13.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf13 = LayoutKt.modifierMaterializerOf(modifierA13);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
                function2C = com.google.android.gms.measurement.internal.a.c(companion13, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy13, composerM2074constructorimpl, currentCompositionLocalMap13);
                if (composerM2074constructorimpl.getInserting()) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                } else {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf13, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance13 = BoxScopeInstance.INSTANCE;
                a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda14, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
                if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function3;
                z15 = z119;
                z16 = z14;
                modifier4 = modifier17;
                mutableInteractionSource3 = mutableInteractionSource16;
                j12 = jM2507copywmQWz5c$default;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(BottomNavigationItem, z10, onClick, icon, modifier4, z15, function4, z16, mutableInteractionSource3, jM2518unboximpl, j12, i10, i11, i12));
        }
        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        z13 = z11;
        i20 = i12 & 32;
        if (i20 != 0) {
            i13 |= 1572864;
            function3 = function2;
        } else {
            function3 = function2;
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i21 = 1048576;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
        }
        i22 = i12 & 64;
        if (i22 != 0) {
            i13 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(z12)) {
                i23 = 8388608;
            } else {
                i23 = 4194304;
            }
            i13 |= i23;
        }
        i24 = i12 & 128;
        if (i24 != 0) {
            i13 |= 100663296;
        } else if ((i10 & 234881024) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i25 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i25 = 33554432;
            }
            i13 |= i25;
        }
        if ((i10 & 1879048192) != 0) {
            i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(j10)) ? 268435456 : PKIFailureInfo.duplicateCertReq;
        }
        if ((i11 & 14) == 0) {
            i26 = i11 | (((i12 & 512) == 0 || !composerStartRestartGroup.changed(j11)) ? 2 : 4);
        } else {
            i26 = i11;
        }
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            composableLambda = null;
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (i20 != 0) {
                    function3 = null;
                }
                if (i22 != 0) {
                    z14 = true;
                } else {
                    z14 = z12;
                }
                if (i24 != 0) {
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
                if ((i12 & 256) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i13 &= -1879048193;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i12 & 512) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i26 &= -15;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                i27 = i26;
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (i20 != 0) {
                    function3 = null;
                }
                if (i22 != 0) {
                    z14 = true;
                } else {
                    z14 = z12;
                }
                if (i24 != 0) {
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
                if ((i12 & 256) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i13 &= -1879048193;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i12 & 512) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i26 &= -15;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                i27 = i26;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
            }
            if (function3 != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
            }
            ComposableLambda composableLambda15 = composableLambda;
            Modifier modifierA14 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
            Alignment center14 = Alignment.INSTANCE.getCenter();
            Modifier modifier18 = modifier3;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MutableInteractionSource mutableInteractionSource17 = mutableInteractionSource2;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy14 = BoxKt.rememberBoxMeasurePolicy(center14, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap14 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion14 = ComposeUiNode.INSTANCE;
            boolean z1110 = z13;
            constructor = companion14.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf14 = LayoutKt.modifierMaterializerOf(modifierA14);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion14, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy14, composerM2074constructorimpl, currentCompositionLocalMap14);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf14, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance14 = BoxScopeInstance.INSTANCE;
            a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda15, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
            if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            function4 = function3;
            z15 = z1110;
            z16 = z14;
            modifier4 = modifier18;
            mutableInteractionSource3 = mutableInteractionSource17;
            j12 = jM2507copywmQWz5c$default;
        } else {
            composerStartRestartGroup.startDefaults();
            composableLambda = null;
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (i20 != 0) {
                    function3 = null;
                }
                if (i22 != 0) {
                    z14 = true;
                } else {
                    z14 = z12;
                }
                if (i24 != 0) {
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
                if ((i12 & 256) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i13 &= -1879048193;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i12 & 512) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i26 &= -15;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                i27 = i26;
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i18 != 0) {
                    z13 = true;
                }
                if (i20 != 0) {
                    function3 = null;
                }
                if (i22 != 0) {
                    z14 = true;
                } else {
                    z14 = z12;
                }
                if (i24 != 0) {
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
                if ((i12 & 256) != 0) {
                    jM2518unboximpl = ((Color) composerStartRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2518unboximpl();
                    i13 &= -1879048193;
                } else {
                    jM2518unboximpl = j10;
                }
                if ((i12 & 512) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(jM2518unboximpl, ContentAlpha.INSTANCE.getMedium(composerStartRestartGroup, 6), 0.0f, 0.0f, 0.0f, 14, null);
                    i26 &= -15;
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                i27 = i26;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1473735525, i13, i27, "androidx.compose.material.BottomNavigationItem (BottomNavigation.kt:146)");
            }
            if (function3 != null) {
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1343298261, true, new e(i13, function3));
            }
            ComposableLambda composableLambda16 = composableLambda;
            Modifier modifierA15 = x.n1.a(BottomNavigationItem, SelectableKt.m458selectableO2vRcR0(modifier3, z10, mutableInteractionSource2, RippleKt.m900rememberRipple9IZ8Weo(false, 0.0f, jM2518unboximpl, composerStartRestartGroup, ((i13 >> 21) & 896) | 6, 2), z13, Role.m3825boximpl(Role.INSTANCE.m3837getTabo7Vup1c()), onClick), 1.0f, false, 2, null);
            Alignment center15 = Alignment.INSTANCE.getCenter();
            Modifier modifier19 = modifier3;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MutableInteractionSource mutableInteractionSource18 = mutableInteractionSource2;
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy15 = BoxKt.rememberBoxMeasurePolicy(center15, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap15 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion15 = ComposeUiNode.INSTANCE;
            boolean z1111 = z13;
            constructor = companion15.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf15 = LayoutKt.modifierMaterializerOf(modifierA15);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            function2C = com.google.android.gms.measurement.internal.a.c(companion15, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy15, composerM2074constructorimpl, currentCompositionLocalMap15);
            if (composerM2074constructorimpl.getInserting()) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            } else {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf15, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance15 = BoxScopeInstance.INSTANCE;
            a(jM2518unboximpl, jM2507copywmQWz5c$default, z10, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1411872801, true, new c(i13, icon, composableLambda16, z14)), composerStartRestartGroup, ((i27 << 3) & 112) | ((i13 >> 27) & 14) | 3072 | ((i13 << 3) & 896));
            if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
            function4 = function3;
            z15 = z1111;
            z16 = z14;
            modifier4 = modifier19;
            mutableInteractionSource3 = mutableInteractionSource18;
            j12 = jM2507copywmQWz5c$default;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(BottomNavigationItem, z10, onClick, icon, modifier4, z15, function4, z16, mutableInteractionSource3, jM2518unboximpl, j12, i10, i11, i12));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void a(long j10, long j11, boolean z10, Function3<? super Float, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-985175058);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(j11) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-985175058, i12, -1, "androidx.compose.material.BottomNavigationTransition (BottomNavigation.kt:221)");
            }
            composer2 = composerStartRestartGroup;
            State<Float> stateAnimateFloatAsState = AnimateAsStateKt.animateFloatAsState(z10 ? 1.0f : 0.0f, f6793a, 0.0f, null, null, composerStartRestartGroup, 48, 28);
            long jM2558lerpjxsXWHM = ColorKt.m2558lerpjxsXWHM(j11, j10, stateAnimateFloatAsState.getValue().floatValue());
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(Color.m2507copywmQWz5c$default(jM2558lerpjxsXWHM, 1.0f, 0.0f, 0.0f, 0.0f, 14, null))), ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2510getAlphaimpl(jM2558lerpjxsXWHM)))}, ComposableLambdaKt.composableLambda(composer2, -138092754, true, new f(function3, i12, stateAnimateFloatAsState)), composer2, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(j10, j11, z10, function3, i10));
    }

    public static final void access$BottomNavigationItemBaselineLayout(Function2 function2, Function2 function3, float f6, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1162995092);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(f6) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1162995092, i11, -1, "androidx.compose.material.BottomNavigationItemBaselineLayout (BottomNavigation.kt:253)");
            }
            h0.l lVar = new h0.l(function3, f6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Modifier.Companion companion = Modifier.INSTANCE;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(companion);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, lVar, companion2.getSetMeasurePolicy());
            Updater.m2081setimpl(composerM2074constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, setCompositeKeyHash);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            Modifier modifierLayoutId = LayoutIdKt.layoutId(companion, "icon");
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierLayoutId);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, currentCompositionLocalMap2);
            if (composerM2074constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash2, composerM2074constructorimpl2, currentCompositeKeyHash2, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf2, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            function2.invoke(composerStartRestartGroup, Integer.valueOf(i11 & 14));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1198312436);
            if (function3 != null) {
                Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(AlphaKt.alpha(LayoutIdKt.layoutId(companion, "label"), f6), f6795c, 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion3, false, composerStartRestartGroup, 0, -1323940314);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf3 = LayoutKt.modifierMaterializerOf(modifierM298paddingVpY3zN4$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor3);
                } else {
                    composerStartRestartGroup.useNode();
                }
                Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Function2 function2C2 = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, currentCompositionLocalMap3);
                if (composerM2074constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash3, composerM2074constructorimpl3, currentCompositeKeyHash3, function2C2);
                }
                ai.a.j(0, function3ModifierMaterializerOf3, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
                androidx.datastore.preferences.protobuf.q.e((i11 >> 3) & 14, function3, composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.m(function2, function3, f6, i10));
    }

    public static final float access$BottomNavigationTransition_Klgx_Pg$lambda$3(State state) {
        return ((Number) state.getValue()).floatValue();
    }

    /* JADX INFO: renamed from: access$placeIcon-3p2s80s, reason: not valid java name */
    public static final MeasureResult m673access$placeIcon3p2s80s(MeasureScope measureScope, Placeable placeable, long j10) {
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
        return MeasureScope.CC.q(measureScope, placeable.getWidth(), iM4356getMaxHeightimpl, null, new h0.n(androidx.appcompat.app.i.a(placeable, iM4356getMaxHeightimpl, 2), placeable), 4, null);
    }

    /* JADX INFO: renamed from: access$placeLabelAndIcon-DIyivk0, reason: not valid java name */
    public static final MeasureResult m674access$placeLabelAndIconDIyivk0(MeasureScope measureScope, Placeable placeable, Placeable placeable2, long j10, float f6) {
        int iM4356getMaxHeightimpl = Constraints.m4356getMaxHeightimpl(j10);
        int iMo413roundToPx0680j_4 = measureScope.mo413roundToPx0680j_4(f6796d) - placeable.get(AlignmentLineKt.getFirstBaseline());
        int iCoerceAtLeast = kotlin.ranges.c.coerceAtLeast((iM4356getMaxHeightimpl - ((placeable.getHeight() + placeable2.getHeight()) + iMo413roundToPx0680j_4)) / 2, 0);
        int iA = androidx.appcompat.app.i.a(placeable2, iM4356getMaxHeightimpl, 2);
        int height = placeable2.getHeight() + iCoerceAtLeast + iMo413roundToPx0680j_4;
        int iMax = Math.max(placeable.getWidth(), placeable2.getWidth());
        return MeasureScope.CC.q(measureScope, iMax, iM4356getMaxHeightimpl, null, new h0.o(f6, placeable, androidx.collection.a.a(placeable, iMax, 2), height, mk.c.roundToInt((1 - f6) * (iA - iCoerceAtLeast)), placeable2, androidx.collection.a.a(placeable2, iMax, 2), iCoerceAtLeast), 4, null);
    }
}
