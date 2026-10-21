package androidx.compose.material;

import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.ProgressSemanticsKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableState;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.util.MathHelpersKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.ClosedFloatingPointRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u007f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0081\u0001\u0010\u0015\u001a\u00020\u00032\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\u0018\u0010\u0004\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\t\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\"\u001d\u0010\u001c\u001a\u00020\u00178\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u001d\u0010\u001f\u001a\u00020\u00178\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"", "value", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "Lkotlin/ranges/ClosedFloatingPointRange;", "valueRange", "", "steps", "Lkotlin/Function0;", "onValueChangeFinished", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "Landroidx/compose/material/SliderColors;", "colors", "Slider", "(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "RangeSlider", "(Lkotlin/ranges/ClosedFloatingPointRange;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLkotlin/ranges/ClosedFloatingPointRange;ILkotlin/jvm/functions/Function0;Landroidx/compose/material/SliderColors;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "a", "F", "getThumbRadius", "()F", "ThumbRadius", "e", "getTrackHeight", "TrackHeight", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 10 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 11 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,1190:1\n25#2:1191\n36#2:1199\n25#2:1207\n25#2:1214\n36#2:1221\n456#2,8:1246\n464#2,3:1260\n467#2,3:1267\n456#2,8:1289\n464#2,3:1303\n36#2:1311\n36#2:1318\n467#2,3:1325\n456#2,8:1347\n464#2,3:1361\n25#2:1365\n50#2:1372\n49#2:1373\n467#2,3:1381\n83#2,3:1400\n1097#3,6:1192\n1097#3,6:1200\n1097#3,6:1208\n1097#3,6:1215\n1097#3,6:1222\n1097#3,6:1312\n1097#3,6:1319\n1097#3,6:1366\n1097#3,6:1374\n1097#3,6:1403\n1#4:1198\n92#5:1206\n92#5:1228\n92#5:1265\n88#5:1266\n92#5:1308\n88#5:1309\n88#5:1310\n66#6,6:1229\n72#6:1263\n76#6:1271\n66#6,6:1272\n72#6:1306\n76#6:1329\n66#6,6:1330\n72#6:1364\n76#6:1385\n78#7,11:1235\n91#7:1270\n78#7,11:1278\n91#7:1328\n78#7,11:1336\n91#7:1384\n4144#8,6:1254\n4144#8,6:1297\n4144#8,6:1355\n76#9:1264\n76#9:1307\n154#10:1380\n154#10:1410\n154#10:1411\n154#10:1412\n154#10:1413\n154#10:1414\n154#10:1415\n154#10:1416\n2333#11,14:1386\n135#12:1409\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt\n*L\n155#1:1191\n160#1:1199\n302#1:1207\n303#1:1214\n307#1:1221\n589#1:1246,8\n589#1:1260,3\n589#1:1267,3\n633#1:1289,8\n633#1:1303,3\n661#1:1311\n672#1:1318\n633#1:1325,3\n693#1:1347,8\n693#1:1361,3\n697#1:1365\n698#1:1372\n698#1:1373\n693#1:1381,3\n840#1:1400,3\n155#1:1192,6\n160#1:1200,6\n302#1:1208,6\n303#1:1215,6\n307#1:1222,6\n661#1:1312,6\n672#1:1319,6\n697#1:1366,6\n698#1:1374,6\n840#1:1403,6\n166#1:1206\n314#1:1228\n599#1:1265\n600#1:1266\n643#1:1308\n644#1:1309\n645#1:1310\n589#1:1229,6\n589#1:1263\n589#1:1271\n633#1:1272,6\n633#1:1306\n633#1:1329\n693#1:1330,6\n693#1:1364\n693#1:1385\n589#1:1235,11\n589#1:1270\n633#1:1278,11\n633#1:1328\n693#1:1336,11\n693#1:1384\n589#1:1254,6\n633#1:1297,6\n693#1:1355,6\n593#1:1264\n637#1:1307\n724#1:1380\n1149#1:1410\n1150#1:1411\n1151#1:1412\n1152#1:1413\n1155#1:1414\n1156#1:1415\n1157#1:1416\n798#1:1386,14\n935#1:1409\n*E\n"})
public final class SliderKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f7612a = Dp.m4389constructorimpl(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f7613b = Dp.m4389constructorimpl(24);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f7614c = Dp.m4389constructorimpl(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f7615d = Dp.m4389constructorimpl(6);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f7616e = Dp.m4389constructorimpl(4);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final Modifier f7617f = SizeKt.m323heightInVpY3zN4$default(SizeKt.m342widthInVpY3zN4$default(Modifier.INSTANCE, Dp.m4389constructorimpl(144), 0.0f, 2, null), 0.0f, Dp.m4389constructorimpl(48), 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final TweenSpec<Float> f7618g = new TweenSpec<>(100, 0, null, 6, null);

    /* JADX INFO: compiled from: Slider.kt */
    @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1190:1\n76#2:1191\n76#2:1192\n25#3:1193\n25#3:1200\n25#3:1211\n83#3,3:1222\n50#3:1231\n49#3:1232\n50#3:1239\n49#3:1240\n1097#4,6:1194\n1097#4,6:1201\n1097#4,3:1212\n1100#4,3:1218\n1097#4,6:1225\n1097#4,6:1233\n1097#4,6:1241\n486#5,4:1207\n490#5,2:1215\n494#5:1221\n486#6:1217\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$RangeSlider$2\n*L\n316#1:1191\n321#1:1192\n332#1:1193\n333#1:1200\n350#1:1211\n375#1:1222,3\n417#1:1231\n417#1:1232\n425#1:1239\n425#1:1240\n332#1:1194,6\n333#1:1201,6\n350#1:1212,3\n350#1:1218,3\n375#1:1225,6\n417#1:1233,6\n425#1:1241,6\n350#1:1207,4\n350#1:1215,2\n350#1:1221\n350#1:1217\n*E\n"})
    public static final class a extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {
        public final /* synthetic */ SliderColors E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ClosedFloatingPointRange<Float> f7619p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ClosedFloatingPointRange<Float> f7620q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7621r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<ClosedFloatingPointRange<Float>, Unit>> f7622s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7623t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7624u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f7625w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f7626x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ List<Float> f7627y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(ClosedFloatingPointRange<Float> closedFloatingPointRange, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i10, State<? extends Function1<? super ClosedFloatingPointRange<Float>, Unit>> state, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, boolean z10, int i11, Function0<Unit> function0, List<Float> list, SliderColors sliderColors) {
            super(3);
            this.f7619p0 = closedFloatingPointRange;
            this.f7620q0 = closedFloatingPointRange2;
            this.f7621r0 = i10;
            this.f7622s0 = state;
            this.f7623t0 = mutableInteractionSource;
            this.f7624u0 = mutableInteractionSource2;
            this.v0 = z10;
            this.f7625w0 = i11;
            this.f7626x0 = function0;
            this.f7627y0 = list;
            this.E0 = sliderColors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static final float a(float f6, Ref.FloatRef floatRef, Ref.FloatRef floatRef2, ClosedFloatingPointRange closedFloatingPointRange) {
            return SliderKt.access$scale(((Number) closedFloatingPointRange.getStart()).floatValue(), ((Number) closedFloatingPointRange.getEndInclusive()).floatValue(), f6, floatRef.element, floatRef2.element);
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((((iIntValue & 14) == 0 ? (composer2.changed(BoxWithConstraints) ? 4 : 2) | iIntValue : iIntValue) & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(652589923, iIntValue, -1, "androidx.compose.material.RangeSlider.<anonymous> (Slider.kt:314)");
                }
                boolean z10 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                float fM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(BoxWithConstraints.mo260getConstraintsmsEJaDk());
                Ref.FloatRef floatRef = new Ref.FloatRef();
                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                floatRef.element = fM4357getMaxWidthimpl - density.mo415toPx0680j_4(SliderKt.getThumbRadius());
                floatRef2.element = density.mo415toPx0680j_4(SliderKt.getThumbRadius());
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                Object empty = companion.getEmpty();
                ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f7620q0;
                ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.f7619p0;
                if (objRememberedValue == empty) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(a(closedFloatingPointRange.getStart().floatValue(), floatRef2, floatRef, closedFloatingPointRange2));
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(a(closedFloatingPointRange.getEndInclusive().floatValue(), floatRef2, floatRef, closedFloatingPointRange2));
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                v1 v1Var = new v1(closedFloatingPointRange2, floatRef2, floatRef);
                ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.f7619p0;
                ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = ok.e.rangeTo(floatRef2.element, floatRef.element);
                float fFloatValue = closedFloatingPointRange.getStart().floatValue();
                int i10 = this.f7621r0 >> 9;
                int i11 = (i10 & 112) | 3072;
                SliderKt.access$CorrectValueSideEffect(v1Var, closedFloatingPointRange3, closedFloatingPointRangeRangeTo, mutableFloatState, fFloatValue, composer2, i11);
                SliderKt.access$CorrectValueSideEffect(new w1(closedFloatingPointRange2, floatRef2, floatRef), this.f7619p0, ok.e.rangeTo(floatRef2.element, floatRef.element), mutableFloatState2, closedFloatingPointRange.getEndInclusive().floatValue(), composer2, i11);
                Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                }
                composer2.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composer2.endReplaceableGroup();
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new z1(mutableFloatState, mutableFloatState2, this.f7627y0, floatRef2, floatRef, this.f7626x0, coroutineScope, this.f7622s0, this.f7619p0), composer2, 0);
                ClosedFloatingPointRange<Float> closedFloatingPointRange4 = this.f7620q0;
                State<Function1<ClosedFloatingPointRange<Float>, Unit>> state = this.f7622s0;
                Object[] objArr = {mutableFloatState, mutableFloatState2, closedFloatingPointRange2, Float.valueOf(floatRef2.element), Float.valueOf(floatRef.element), closedFloatingPointRange4, state};
                ClosedFloatingPointRange<Float> closedFloatingPointRange5 = this.f7619p0;
                composer2.startReplaceableGroup(-568225417);
                boolean zChanged = false;
                for (int i12 = 0; i12 < 7; i12++) {
                    zChanged |= composer2.changed(objArr[i12]);
                }
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new a2(mutableFloatState, mutableFloatState2, closedFloatingPointRange4, floatRef2, floatRef, state, closedFloatingPointRange5);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceableGroup();
                State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(objRememberedValue3, composer2, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierAccess$rangeSliderPressDragModifier = SliderKt.access$rangeSliderPressDragModifier(companion2, this.f7623t0, this.f7624u0, mutableFloatState, mutableFloatState2, this.v0, z10, fM4357getMaxWidthimpl, this.f7619p0, stateRememberUpdatedState, stateRememberUpdatedState2);
                float fCoerceIn = kotlin.ranges.c.coerceIn(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue());
                float fCoerceIn2 = kotlin.ranges.c.coerceIn(closedFloatingPointRange.getEndInclusive().floatValue(), closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue());
                float fAccess$calcFraction = SliderKt.access$calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), fCoerceIn);
                float fAccess$calcFraction2 = SliderKt.access$calcFraction(closedFloatingPointRange2.getStart().floatValue(), closedFloatingPointRange2.getEndInclusive().floatValue(), fCoerceIn2);
                float f6 = this.f7625w0;
                int iFloor = (int) Math.floor(f6 * fAccess$calcFraction2);
                int iFloor2 = (int) Math.floor((1.0f - fAccess$calcFraction) * f6);
                boolean z11 = this.v0;
                Float fValueOf = Float.valueOf(fCoerceIn2);
                composer2.startReplaceableGroup(511388516);
                State<Function1<ClosedFloatingPointRange<Float>, Unit>> state2 = this.f7622s0;
                boolean zChanged2 = composer2.changed(state2) | composer2.changed(fValueOf);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new b2(state2, fCoerceIn2);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                Modifier modifierC = SliderKt.c(companion2, fCoerceIn, z11, (Function1) objRememberedValue4, this.f7626x0, ok.e.rangeTo(closedFloatingPointRange2.getStart().floatValue(), fCoerceIn2), iFloor);
                boolean z12 = this.v0;
                Float fValueOf2 = Float.valueOf(fCoerceIn);
                composer2.startReplaceableGroup(511388516);
                boolean zChanged3 = composer2.changed(fValueOf2) | composer2.changed(state2);
                Object objRememberedValue5 = composer2.rememberedValue();
                if (zChanged3 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new x1(state2, fCoerceIn);
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceableGroup();
                SliderKt.access$RangeSliderImpl(this.v0, fAccess$calcFraction, fAccess$calcFraction2, this.f7627y0, this.E0, floatRef.element - floatRef2.element, this.f7623t0, this.f7624u0, modifierAccess$rangeSliderPressDragModifier, modifierC, SliderKt.c(companion2, fCoerceIn2, z12, (Function1) objRememberedValue5, this.f7626x0, ok.e.rangeTo(fCoerceIn, closedFloatingPointRange2.getEndInclusive().floatValue()), iFloor2), composer2, (i10 & 14) | 14159872 | (i10 & 57344), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ClosedFloatingPointRange<Float> f7628p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<ClosedFloatingPointRange<Float>, Unit> f7629q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7630r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7631s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ClosedFloatingPointRange<Float> f7632t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7633u0;
        public final /* synthetic */ Function0<Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ SliderColors f7634w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f7635x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f7636y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(ClosedFloatingPointRange<Float> closedFloatingPointRange, Function1<? super ClosedFloatingPointRange<Float>, Unit> function1, Modifier modifier, boolean z10, ClosedFloatingPointRange<Float> closedFloatingPointRange2, int i10, Function0<Unit> function0, SliderColors sliderColors, int i11, int i12) {
            super(2);
            this.f7628p0 = closedFloatingPointRange;
            this.f7629q0 = function1;
            this.f7630r0 = modifier;
            this.f7631s0 = z10;
            this.f7632t0 = closedFloatingPointRange2;
            this.f7633u0 = i10;
            this.v0 = function0;
            this.f7634w0 = sliderColors;
            this.f7635x0 = i11;
            this.f7636y0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SliderKt.RangeSlider(this.f7628p0, this.f7629q0, this.f7630r0, this.f7631s0, this.f7632t0, this.f7633u0, this.v0, this.f7634w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7635x0 | 1), this.f7636y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,1190:1\n76#2:1191\n76#2:1192\n486#3,4:1193\n490#3,2:1201\n494#3:1207\n25#4:1197\n25#4:1208\n25#4:1215\n67#4,3:1222\n66#4:1225\n36#4:1232\n1097#5,3:1198\n1100#5,3:1204\n1097#5,6:1209\n1097#5,6:1216\n1097#5,6:1226\n1097#5,6:1233\n486#6:1203\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Slider$3\n*L\n177#1:1191\n182#1:1192\n193#1:1193,4\n193#1:1201,2\n193#1:1207\n193#1:1197\n194#1:1208\n195#1:1215\n197#1:1222,3\n197#1:1225\n237#1:1232\n193#1:1198,3\n193#1:1204,3\n194#1:1209,6\n195#1:1216,6\n197#1:1226,6\n237#1:1233,6\n193#1:1203\n*E\n"})
    public static final class c extends Lambda implements Function3<BoxWithConstraintsScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ClosedFloatingPointRange<Float> f7637p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f7638q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f7639r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7640s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f7641t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ List<Float> f7642u0;
        public final /* synthetic */ SliderColors v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ State<Function1<Float, Unit>> f7643w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f7644x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, float f6, MutableInteractionSource mutableInteractionSource, boolean z10, List<Float> list, SliderColors sliderColors, State<? extends Function1<? super Float, Unit>> state, Function0<Unit> function0) {
            super(3);
            this.f7637p0 = closedFloatingPointRange;
            this.f7638q0 = i10;
            this.f7639r0 = f6;
            this.f7640s0 = mutableInteractionSource;
            this.f7641t0 = z10;
            this.f7642u0 = list;
            this.v0 = sliderColors;
            this.f7643w0 = state;
            this.f7644x0 = function0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(BoxWithConstraintsScope boxWithConstraintsScope, Composer composer, Integer num) {
            int i10;
            BoxWithConstraintsScope BoxWithConstraints = boxWithConstraintsScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(BoxWithConstraints, "$this$BoxWithConstraints");
            if ((iIntValue & 14) == 0) {
                i10 = (composer2.changed(BoxWithConstraints) ? 4 : 2) | iIntValue;
            } else {
                i10 = iIntValue;
            }
            if ((i10 & 91) == 18 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2085116814, iIntValue, -1, "androidx.compose.material.Slider.<anonymous> (Slider.kt:175)");
                }
                boolean z10 = composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()) == LayoutDirection.Rtl;
                float fM4357getMaxWidthimpl = Constraints.m4357getMaxWidthimpl(BoxWithConstraints.mo260getConstraintsmsEJaDk());
                Ref.FloatRef floatRef = new Ref.FloatRef();
                Ref.FloatRef floatRef2 = new Ref.FloatRef();
                Density density = (Density) composer2.consume(CompositionLocalsKt.getLocalDensity());
                floatRef.element = Math.max(fM4357getMaxWidthimpl - density.mo415toPx0680j_4(SliderKt.getThumbRadius()), 0.0f);
                floatRef2.element = Math.min(density.mo415toPx0680j_4(SliderKt.getThumbRadius()), floatRef.element);
                Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
                Composer.Companion companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                }
                composer2.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composer2.endReplaceableGroup();
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue = composer2.rememberedValue();
                Object empty = companion.getEmpty();
                float f6 = this.f7639r0;
                ClosedFloatingPointRange<Float> closedFloatingPointRange = this.f7637p0;
                if (objRememberedValue == empty) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(SliderKt.access$scale(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), f6, floatRef2.element, floatRef.element));
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                MutableFloatState mutableFloatState = (MutableFloatState) objRememberedValue;
                composer2.startReplaceableGroup(-492369756);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceableGroup();
                MutableFloatState mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                Float fValueOf = Float.valueOf(floatRef2.element);
                Float fValueOf2 = Float.valueOf(floatRef.element);
                ClosedFloatingPointRange<Float> closedFloatingPointRange2 = this.f7637p0;
                State<Function1<Float, Unit>> state = this.f7643w0;
                composer2.startReplaceableGroup(1618982084);
                boolean zChanged = composer2.changed(fValueOf) | composer2.changed(fValueOf2) | composer2.changed(closedFloatingPointRange2);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                    h0.m2 m2Var = new h0.m2(new e2(mutableFloatState, mutableFloatState2, floatRef2, floatRef, state, closedFloatingPointRange2));
                    composer2.updateRememberedValue(m2Var);
                    objRememberedValue3 = m2Var;
                }
                composer2.endReplaceableGroup();
                h0.m2 m2Var2 = (h0.m2) objRememberedValue3;
                c2 c2Var = new c2(closedFloatingPointRange, floatRef2, floatRef);
                ClosedFloatingPointRange<Float> closedFloatingPointRange3 = this.f7637p0;
                ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo = ok.e.rangeTo(floatRef2.element, floatRef.element);
                float f10 = this.f7639r0;
                int i11 = this.f7638q0;
                int i12 = i11 >> 9;
                SliderKt.access$CorrectValueSideEffect(c2Var, closedFloatingPointRange3, closedFloatingPointRangeRangeTo, mutableFloatState, f10, composer2, (i12 & 112) | 3072 | ((i11 << 12) & 57344));
                State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(new g2(mutableFloatState, this.f7642u0, floatRef2, floatRef, coroutineScope, m2Var2, this.f7644x0), composer2, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierAccess$sliderTapModifier = SliderKt.access$sliderTapModifier(companion2, m2Var2, this.f7640s0, fM4357getMaxWidthimpl, z10, mutableFloatState, stateRememberUpdatedState, mutableFloatState2, this.f7641t0);
                Orientation orientation = Orientation.Horizontal;
                boolean zBooleanValue = ((Boolean) m2Var2.f68913b.getValue()).booleanValue();
                boolean z11 = this.f7641t0;
                MutableInteractionSource mutableInteractionSource = this.f7640s0;
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged2 = composer2.changed(stateRememberUpdatedState);
                Object objRememberedValue4 = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new d2(stateRememberUpdatedState, null);
                    composer2.updateRememberedValue(objRememberedValue4);
                }
                composer2.endReplaceableGroup();
                SliderKt.access$SliderImpl(this.f7641t0, SliderKt.access$calcFraction(closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue(), kotlin.ranges.c.coerceIn(f6, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue())), this.f7642u0, this.v0, floatRef.element - floatRef2.element, this.f7640s0, modifierAccess$sliderTapModifier.then(DraggableKt.draggable(companion2, m2Var2, orientation, (32 & 4) != 0 ? true : z11, (32 & 8) != 0 ? null : mutableInteractionSource, (32 & 16) != 0 ? false : zBooleanValue, (32 & 32) != 0 ? new DraggableKt.a(3, null) : null, (32 & 64) != 0 ? new DraggableKt.b(3, null) : (Function3) objRememberedValue4, (32 & 128) != 0 ? false : z10)), composer2, (i12 & 14) | 512 | ((i11 >> 15) & 7168) | ((i11 >> 6) & 458752));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f7645p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Float, Unit> f7646q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7647r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f7648s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ ClosedFloatingPointRange<Float> f7649t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7650u0;
        public final /* synthetic */ Function0<Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7651w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ SliderColors f7652x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f7653y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(float f6, Function1<? super Float, Unit> function1, Modifier modifier, boolean z10, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, Function0<Unit> function0, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, int i11, int i12) {
            super(2);
            this.f7645p0 = f6;
            this.f7646q0 = function1;
            this.f7647r0 = modifier;
            this.f7648s0 = z10;
            this.f7649t0 = closedFloatingPointRange;
            this.f7650u0 = i10;
            this.v0 = function0;
            this.f7651w0 = mutableInteractionSource;
            this.f7652x0 = sliderColors;
            this.f7653y0 = i11;
            this.E0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SliderKt.Slider(this.f7645p0, this.f7646q0, this.f7647r0, this.f7648s0, this.f7649t0, this.f7650u0, this.v0, this.f7651w0, this.f7652x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7653y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    @DebugMetadata(c = "androidx.compose.material.SliderKt$SliderThumb$1$1$1", f = "Slider.kt", i = {}, l = {699}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f7654p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7655q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Interaction> f7656r0;

        /* JADX INFO: compiled from: Slider.kt */
        public static final class a implements FlowCollector<Interaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Interaction> f7657p0;

            public a(SnapshotStateList<Interaction> snapshotStateList) {
                this.f7657p0 = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Interaction interaction, Continuation continuation) {
                Interaction interaction2 = interaction;
                boolean z10 = interaction2 instanceof PressInteraction.Press;
                SnapshotStateList<Interaction> snapshotStateList = this.f7657p0;
                if (z10) {
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof PressInteraction.Release) {
                    snapshotStateList.remove(((PressInteraction.Release) interaction2).getPress());
                } else if (interaction2 instanceof PressInteraction.Cancel) {
                    snapshotStateList.remove(((PressInteraction.Cancel) interaction2).getPress());
                } else if (interaction2 instanceof DragInteraction.Start) {
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof DragInteraction.Stop) {
                    snapshotStateList.remove(((DragInteraction.Stop) interaction2).getCom.adobe.marketing.mobile.EventDataKeys.Lifecycle.LIFECYCLE_START java.lang.String());
                } else if (interaction2 instanceof DragInteraction.Cancel) {
                    snapshotStateList.remove(((DragInteraction.Cancel) interaction2).getCom.adobe.marketing.mobile.EventDataKeys.Lifecycle.LIFECYCLE_START java.lang.String());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(MutableInteractionSource mutableInteractionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f7655q0 = mutableInteractionSource;
            this.f7656r0 = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.f7655q0, this.f7656r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f7654p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Interaction> interactions = this.f7655q0.getInteractions();
                a aVar = new a(this.f7656r0);
                this.f7654p0 = 1;
                if (interactions.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ BoxScope f7658p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7659q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f7660r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f7661s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ SliderColors f7662t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f7663u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f7664w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BoxScope boxScope, Modifier modifier, float f6, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z10, float f10, int i10) {
            super(2);
            this.f7658p0 = boxScope;
            this.f7659q0 = modifier;
            this.f7660r0 = f6;
            this.f7661s0 = mutableInteractionSource;
            this.f7662t0 = sliderColors;
            this.f7663u0 = z10;
            this.v0 = f10;
            this.f7664w0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SliderKt.a(this.f7658p0, this.f7659q0, this.f7660r0, this.f7661s0, this.f7662t0, this.f7663u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7664w0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Track$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,1190:1\n1477#2:1191\n1502#2,3:1192\n1505#2,3:1202\n1549#2:1206\n1620#2,3:1207\n361#3,7:1195\n215#4:1205\n216#4:1210\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material/SliderKt$Track$1\n*L\n775#1:1191\n775#1:1192,3\n775#1:1202,3\n778#1:1206\n778#1:1207,3\n775#1:1195,7\n776#1:1205\n776#1:1210\n*E\n"})
    public static final class g extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f7665p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f7666q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f7667r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f7668s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f7669t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f7670u0;
        public final /* synthetic */ List<Float> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f7671w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f7672x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(float f6, State<Color> state, float f10, float f11, float f12, State<Color> state2, List<Float> list, State<Color> state3, State<Color> state4) {
            super(1);
            this.f7665p0 = f6;
            this.f7666q0 = state;
            this.f7667r0 = f10;
            this.f7668s0 = f11;
            this.f7669t0 = f12;
            this.f7670u0 = state2;
            this.v0 = list;
            this.f7671w0 = state3;
            this.f7672x0 = state4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            boolean z10 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
            float fM2276getYimpl = Offset.m2276getYimpl(Canvas.mo2908getCenterF1C5BW0());
            float f6 = this.f7665p0;
            long jOffset = OffsetKt.Offset(f6, fM2276getYimpl);
            long jOffset2 = OffsetKt.Offset(Size.m2344getWidthimpl(Canvas.mo2909getSizeNHjbRc()) - f6, Offset.m2276getYimpl(Canvas.mo2908getCenterF1C5BW0()));
            long j10 = z10 ? jOffset2 : jOffset;
            long j11 = z10 ? jOffset : jOffset2;
            long jM2518unboximpl = this.f7666q0.getValue().m2518unboximpl();
            float f10 = this.f7667r0;
            StrokeCap.Companion companion = StrokeCap.INSTANCE;
            long j12 = j11;
            long j13 = j10;
            a1.b.C(Canvas, jM2518unboximpl, j10, j11, f10, companion.m2809getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            float fM2275getXimpl = Offset.m2275getXimpl(j13);
            float fM2275getXimpl2 = Offset.m2275getXimpl(j12) - Offset.m2275getXimpl(j13);
            float f11 = this.f7668s0;
            long jOffset3 = OffsetKt.Offset((fM2275getXimpl2 * f11) + fM2275getXimpl, Offset.m2276getYimpl(Canvas.mo2908getCenterF1C5BW0()));
            float fM2275getXimpl3 = Offset.m2275getXimpl(j13);
            float fM2275getXimpl4 = Offset.m2275getXimpl(j12) - Offset.m2275getXimpl(j13);
            float f12 = this.f7669t0;
            a1.b.C(Canvas, this.f7670u0.getValue().m2518unboximpl(), OffsetKt.Offset((fM2275getXimpl4 * f12) + fM2275getXimpl3, Offset.m2276getYimpl(Canvas.mo2908getCenterF1C5BW0())), jOffset3, this.f7667r0, companion.m2809getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            List<Float> list = this.v0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : list) {
                float fFloatValue = ((Number) obj).floatValue();
                Boolean boolValueOf = Boolean.valueOf(fFloatValue > f11 || fFloatValue < f12);
                Object arrayList = linkedHashMap.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(boolValueOf, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            float f13 = this.f7667r0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                List list2 = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Offset.m2264boximpl(OffsetKt.Offset(Offset.m2275getXimpl(OffsetKt.m2298lerpWko1d7g(j13, j12, ((Number) it.next()).floatValue())), Offset.m2276getYimpl(Canvas.mo2908getCenterF1C5BW0()))));
                }
                long j14 = j13;
                long j15 = j12;
                a1.b.H(Canvas, arrayList2, PointMode.INSTANCE.m2771getPointsr_lszbg(), (zBooleanValue ? this.f7671w0 : this.f7672x0).getValue().m2518unboximpl(), f13, StrokeCap.INSTANCE.m2809getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                j13 = j14;
                j12 = j15;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7673p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SliderColors f7674q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f7675r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f7676s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ float f7677t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ List<Float> f7678u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f7679w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f7680x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Modifier modifier, SliderColors sliderColors, boolean z10, float f6, float f10, List<Float> list, float f11, float f12, int i10) {
            super(2);
            this.f7673p0 = modifier;
            this.f7674q0 = sliderColors;
            this.f7675r0 = z10;
            this.f7676s0 = f6;
            this.f7677t0 = f10;
            this.f7678u0 = list;
            this.v0 = f11;
            this.f7679w0 = f12;
            this.f7680x0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SliderKt.b(this.f7673p0, this.f7674q0, this.f7675r0, this.f7676s0, this.f7677t0, this.f7678u0, this.v0, this.f7679w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7680x0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    public static final class i extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ boolean f7681p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ClosedFloatingPointRange<Float> f7682q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f7683r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f7684s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Float, Unit> f7685t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f7686u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(boolean z10, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, float f6, Function1<? super Float, Unit> function1, Function0<Unit> function0) {
            super(1);
            this.f7681p0 = z10;
            this.f7682q0 = closedFloatingPointRange;
            this.f7683r0 = i10;
            this.f7684s0 = f6;
            this.f7685t0 = function1;
            this.f7686u0 = function0;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            if (!this.f7681p0) {
                SemanticsPropertiesKt.disabled(semantics);
            }
            SemanticsPropertiesKt.setProgress$default(semantics, null, new h2(this.f7682q0, this.f7683r0, this.f7684s0, this.f7685t0, this.f7686u0), 1, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0159 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x015b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0160  */
    /* JADX WARN: Code duplicated, block: B:113:0x0165  */
    /* JADX WARN: Code duplicated, block: B:115:0x0171  */
    /* JADX WARN: Code duplicated, block: B:117:0x0175  */
    /* JADX WARN: Code duplicated, block: B:118:0x0177  */
    /* JADX WARN: Code duplicated, block: B:121:0x017d  */
    /* JADX WARN: Code duplicated, block: B:125:0x01af  */
    /* JADX WARN: Code duplicated, block: B:128:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:136:0x020f  */
    /* JADX WARN: Code duplicated, block: B:138:0x0215  */
    /* JADX WARN: Code duplicated, block: B:141:0x027e  */
    /* JADX WARN: Code duplicated, block: B:146:0x0294  */
    /* JADX WARN: Code duplicated, block: B:148:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0125  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    public static final void RangeSlider(@NotNull ClosedFloatingPointRange<Float> value, @NotNull Function1<? super ClosedFloatingPointRange<Float>, Unit> onValueChange, @Nullable Modifier modifier, boolean z10, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, @Nullable Function0<Unit> function0, @Nullable SliderColors sliderColors, @Nullable Composer composer, int i11, int i12) {
        int i13;
        Modifier modifier2;
        int i14;
        boolean z11;
        int i15;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        SliderColors sliderColorsM814colorsq0g_0yA;
        Function0<Unit> function1;
        Function0<Unit> function2;
        SliderColors sliderColors2;
        Modifier modifier3;
        boolean z12;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i21;
        int i22;
        Object objRememberedValue;
        Composer.Companion companion;
        MutableInteractionSource mutableInteractionSource;
        Object objRememberedValue2;
        MutableInteractionSource mutableInteractionSource2;
        boolean zChanged;
        Object objRememberedValue3;
        Composer composer2;
        Modifier modifier4;
        boolean z13;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        int i23;
        Function0<Unit> function3;
        SliderColors sliderColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1556183027);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i24 = i12 & 4;
        if (i24 == 0) {
            if ((i11 & 896) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((57344 & i11) == 0) {
                    if ((i12 & 16) == 0) {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                        int i25 = composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo) ? 16384 : 8192;
                        i13 |= i25;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    }
                    i13 |= i25;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((458752 & i11) == 0) {
                        i17 = i10;
                        if (composerStartRestartGroup.changed(i17)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 64;
                    if (i19 != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                    if ((i11 & 29360128) == 0) {
                        if ((i12 & 128) == 0) {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            int i26 = composerStartRestartGroup.changed(sliderColorsM814colorsq0g_0yA) ? 8388608 : 4194304;
                            i13 |= i26;
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                        }
                        i13 |= i26;
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                    }
                    if ((i13 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            }
                            if (i16 != 0) {
                                i17 = 0;
                            }
                            if (i19 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if ((i12 & 128) != 0) {
                                sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                                i13 &= -29360129;
                            }
                            function2 = function1;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                            }
                            if ((i12 & 128) != 0) {
                                function2 = function0;
                                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                                modifier3 = modifier2;
                                z12 = z11;
                                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                                i21 = i17;
                                i22 = (-29360129) & i13;
                            } else {
                                function2 = function0;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                            if (i21 >= 0) {
                                throw new IllegalArgumentException("steps should be >= 0".toString());
                            }
                            State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                            Integer numValueOf = Integer.valueOf(i21);
                            composerStartRestartGroup.startReplaceableGroup(1157296644);
                            zChanged = composerStartRestartGroup.changed(numValueOf);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = access$stepsToTickFractions(i21);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            List list = (List) objRememberedValue3;
                            Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                            float f6 = f7612a;
                            composer2 = composerStartRestartGroup;
                            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize, Dp.m4389constructorimpl(4 * f6), Dp.m4389constructorimpl(f6 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list, sliderColors2)), composer2, 3072, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            z13 = z12;
                            closedFloatingPointRange3 = closedFloatingPointRange2;
                            i23 = i21;
                            function3 = function2;
                            sliderColors3 = sliderColors2;
                        }
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                        }
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                        if (i21 >= 0) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                        Integer numValueOf2 = Integer.valueOf(i21);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf2);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = access$stepsToTickFractions(i21);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = access$stepsToTickFractions(i21);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list2 = (List) objRememberedValue3;
                        Modifier modifierMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                        float f10 = f7612a;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize2, Dp.m4389constructorimpl(4 * f10), Dp.m4389constructorimpl(f10 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState2, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list2, sliderColors2)), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        z13 = z12;
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        i23 = i21;
                        function3 = function2;
                        sliderColors3 = sliderColors2;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        z13 = z11;
                        i23 = i17;
                        composer2 = composerStartRestartGroup;
                        function3 = function0;
                        ClosedFloatingPointRange<Float> closedFloatingPointRange4 = closedFloatingPointRangeRangeTo;
                        sliderColors3 = sliderColorsM814colorsq0g_0yA;
                        modifier4 = modifier2;
                        closedFloatingPointRange3 = closedFloatingPointRange4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(value, onValueChange, modifier4, z13, closedFloatingPointRange3, i23, function3, sliderColors3, i11, i12));
                }
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i17 = i10;
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i11 & 29360128) == 0) {
                    if ((i12 & 128) == 0) {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColorsM814colorsq0g_0yA)) {
                        }
                        i13 |= i26;
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                    }
                    i13 |= i26;
                } else {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                }
                if ((i13 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (i21 >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                    Integer numValueOf3 = Integer.valueOf(i21);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf3);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list3 = (List) objRememberedValue3;
                    Modifier modifierMinimumInteractiveComponentSize3 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f11 = f7612a;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize3, Dp.m4389constructorimpl(4 * f11), Dp.m4389constructorimpl(f11 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState3, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list3, sliderColors2)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i23 = i21;
                    function3 = function2;
                    sliderColors3 = sliderColors2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (i21 >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                    Integer numValueOf4 = Integer.valueOf(i21);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf4);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list4 = (List) objRememberedValue3;
                    Modifier modifierMinimumInteractiveComponentSize4 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f12 = f7612a;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize4, Dp.m4389constructorimpl(4 * f12), Dp.m4389constructorimpl(f12 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState4, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list4, sliderColors2)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i23 = i21;
                    function3 = function2;
                    sliderColors3 = sliderColors2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(value, onValueChange, modifier4, z13, closedFloatingPointRange3, i23, function3, sliderColors3, i11, i12));
            }
            i13 |= 3072;
            z11 = z10;
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) {
                    }
                    i13 |= i25;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                }
                i13 |= i25;
            } else {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    i17 = i10;
                    if (composerStartRestartGroup.changed(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i11 & 29360128) == 0) {
                    if ((i12 & 128) == 0) {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColorsM814colorsq0g_0yA)) {
                        }
                        i13 |= i26;
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                    }
                    i13 |= i26;
                } else {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                }
                if ((i13 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (i21 >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                    Integer numValueOf5 = Integer.valueOf(i21);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf5);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list5 = (List) objRememberedValue3;
                    Modifier modifierMinimumInteractiveComponentSize5 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f13 = f7612a;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize5, Dp.m4389constructorimpl(4 * f13), Dp.m4389constructorimpl(f13 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState5, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list5, sliderColors2)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i23 = i21;
                    function3 = function2;
                    sliderColors3 = sliderColors2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (i21 >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                    Integer numValueOf6 = Integer.valueOf(i21);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list6 = (List) objRememberedValue3;
                    Modifier modifierMinimumInteractiveComponentSize6 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f14 = f7612a;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize6, Dp.m4389constructorimpl(4 * f14), Dp.m4389constructorimpl(f14 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState6, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list6, sliderColors2)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i23 = i21;
                    function3 = function2;
                    sliderColors3 = sliderColors2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(value, onValueChange, modifier4, z13, closedFloatingPointRange3, i23, function3, sliderColors3, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i17 = i10;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            if ((i11 & 29360128) == 0) {
                if ((i12 & 128) == 0) {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColorsM814colorsq0g_0yA)) {
                    }
                    i13 |= i26;
                } else {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                }
                i13 |= i26;
            } else {
                sliderColorsM814colorsq0g_0yA = sliderColors;
            }
            if ((i13 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (i21 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                Integer numValueOf7 = Integer.valueOf(i21);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf7);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list7 = (List) objRememberedValue3;
                Modifier modifierMinimumInteractiveComponentSize7 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f15 = f7612a;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize7, Dp.m4389constructorimpl(4 * f15), Dp.m4389constructorimpl(f15 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState7, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list7, sliderColors2)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i23 = i21;
                function3 = function2;
                sliderColors3 = sliderColors2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (i21 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState8 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                Integer numValueOf8 = Integer.valueOf(i21);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf8);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list8 = (List) objRememberedValue3;
                Modifier modifierMinimumInteractiveComponentSize8 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f16 = f7612a;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize8, Dp.m4389constructorimpl(4 * f16), Dp.m4389constructorimpl(f16 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState8, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list8, sliderColors2)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i23 = i21;
                function3 = function2;
                sliderColors3 = sliderColors2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(value, onValueChange, modifier4, z13, closedFloatingPointRange3, i23, function3, sliderColors3, i11, i12));
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) {
                    }
                    i13 |= i25;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                }
                i13 |= i25;
            } else {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    i17 = i10;
                    if (composerStartRestartGroup.changed(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                if ((i11 & 29360128) == 0) {
                    if ((i12 & 128) == 0) {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        if (composerStartRestartGroup.changed(sliderColorsM814colorsq0g_0yA)) {
                        }
                        i13 |= i26;
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                    }
                    i13 |= i26;
                } else {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                }
                if ((i13 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (i21 >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState9 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                    Integer numValueOf9 = Integer.valueOf(i21);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf9);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list9 = (List) objRememberedValue3;
                    Modifier modifierMinimumInteractiveComponentSize9 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f17 = f7612a;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize9, Dp.m4389constructorimpl(4 * f17), Dp.m4389constructorimpl(f17 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState9, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list9, sliderColors2)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i23 = i21;
                    function3 = function2;
                    sliderColors3 = sliderColors2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        }
                        if (i16 != 0) {
                            i17 = 0;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if ((i12 & 128) != 0) {
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            i13 &= -29360129;
                        }
                        function2 = function1;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                        i21 = i17;
                        i22 = i13;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                    if (i21 >= 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState10 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                    Integer numValueOf10 = Integer.valueOf(i21);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf10);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = access$stepsToTickFractions(i21);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list10 = (List) objRememberedValue3;
                    Modifier modifierMinimumInteractiveComponentSize10 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                    float f18 = f7612a;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize10, Dp.m4389constructorimpl(4 * f18), Dp.m4389constructorimpl(f18 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState10, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list10, sliderColors2)), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    z13 = z12;
                    closedFloatingPointRange3 = closedFloatingPointRange2;
                    i23 = i21;
                    function3 = function2;
                    sliderColors3 = sliderColors2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(value, onValueChange, modifier4, z13, closedFloatingPointRange3, i23, function3, sliderColors3, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i17 = i10;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            if ((i11 & 29360128) == 0) {
                if ((i12 & 128) == 0) {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColorsM814colorsq0g_0yA)) {
                    }
                    i13 |= i26;
                } else {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                }
                i13 |= i26;
            } else {
                sliderColorsM814colorsq0g_0yA = sliderColors;
            }
            if ((i13 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (i21 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState11 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                Integer numValueOf11 = Integer.valueOf(i21);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf11);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list11 = (List) objRememberedValue3;
                Modifier modifierMinimumInteractiveComponentSize11 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f19 = f7612a;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize11, Dp.m4389constructorimpl(4 * f19), Dp.m4389constructorimpl(f19 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState11, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list11, sliderColors2)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i23 = i21;
                function3 = function2;
                sliderColors3 = sliderColors2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (i21 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState12 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                Integer numValueOf12 = Integer.valueOf(i21);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf12);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list12 = (List) objRememberedValue3;
                Modifier modifierMinimumInteractiveComponentSize12 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f110 = f7612a;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize12, Dp.m4389constructorimpl(4 * f110), Dp.m4389constructorimpl(f110 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState12, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list12, sliderColors2)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i23 = i21;
                function3 = function2;
                sliderColors3 = sliderColors2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(value, onValueChange, modifier4, z13, closedFloatingPointRange3, i23, function3, sliderColors3, i11, i12));
        }
        i13 |= 3072;
        z11 = z10;
        if ((57344 & i11) == 0) {
            if ((i12 & 16) == 0) {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange;
                if (composerStartRestartGroup.changed(closedFloatingPointRangeRangeTo)) {
                }
                i13 |= i25;
            } else {
                closedFloatingPointRangeRangeTo = closedFloatingPointRange;
            }
            i13 |= i25;
        } else {
            closedFloatingPointRangeRangeTo = closedFloatingPointRange;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((458752 & i11) == 0) {
                i17 = i10;
                if (composerStartRestartGroup.changed(i17)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            if ((i11 & 29360128) == 0) {
                if ((i12 & 128) == 0) {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                    if (composerStartRestartGroup.changed(sliderColorsM814colorsq0g_0yA)) {
                    }
                    i13 |= i26;
                } else {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                }
                i13 |= i26;
            } else {
                sliderColorsM814colorsq0g_0yA = sliderColors;
            }
            if ((i13 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (i21 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState13 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                Integer numValueOf13 = Integer.valueOf(i21);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf13);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list13 = (List) objRememberedValue3;
                Modifier modifierMinimumInteractiveComponentSize13 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f111 = f7612a;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize13, Dp.m4389constructorimpl(4 * f111), Dp.m4389constructorimpl(f111 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState13, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list13, sliderColors2)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i23 = i21;
                function3 = function2;
                sliderColors3 = sliderColors2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    }
                    if (i16 != 0) {
                        i17 = 0;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if ((i12 & 128) != 0) {
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        i13 &= -29360129;
                    }
                    function2 = function1;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    modifier3 = modifier2;
                    z12 = z11;
                    closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                    i21 = i17;
                    i22 = i13;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
                if (i21 >= 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState14 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
                Integer numValueOf14 = Integer.valueOf(i21);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf14);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = access$stepsToTickFractions(i21);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list14 = (List) objRememberedValue3;
                Modifier modifierMinimumInteractiveComponentSize14 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
                float f112 = f7612a;
                composer2 = composerStartRestartGroup;
                BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize14, Dp.m4389constructorimpl(4 * f112), Dp.m4389constructorimpl(f112 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState14, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list14, sliderColors2)), composer2, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                z13 = z12;
                closedFloatingPointRange3 = closedFloatingPointRange2;
                i23 = i21;
                function3 = function2;
                sliderColors3 = sliderColors2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(value, onValueChange, modifier4, z13, closedFloatingPointRange3, i23, function3, sliderColors3, i11, i12));
        }
        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i17 = i10;
        i19 = i12 & 64;
        if (i19 != 0) {
            i13 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i13 |= i20;
        }
        if ((i11 & 29360128) == 0) {
            if ((i12 & 128) == 0) {
                sliderColorsM814colorsq0g_0yA = sliderColors;
                if (composerStartRestartGroup.changed(sliderColorsM814colorsq0g_0yA)) {
                }
                i13 |= i26;
            } else {
                sliderColorsM814colorsq0g_0yA = sliderColors;
            }
            i13 |= i26;
        } else {
            sliderColorsM814colorsq0g_0yA = sliderColors;
        }
        if ((i13 & 23967451) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                if (i19 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if ((i12 & 128) != 0) {
                    sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i13 &= -29360129;
                }
                function2 = function1;
                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                modifier3 = modifier2;
                z12 = z11;
                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                i21 = i17;
                i22 = i13;
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                if (i19 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if ((i12 & 128) != 0) {
                    sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i13 &= -29360129;
                }
                function2 = function1;
                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                modifier3 = modifier2;
                z12 = z11;
                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                i21 = i17;
                i22 = i13;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
            if (i21 >= 0) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState15 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
            Integer numValueOf15 = Integer.valueOf(i21);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf15);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = access$stepsToTickFractions(i21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = access$stepsToTickFractions(i21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list15 = (List) objRememberedValue3;
            Modifier modifierMinimumInteractiveComponentSize15 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
            float f113 = f7612a;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize15, Dp.m4389constructorimpl(4 * f113), Dp.m4389constructorimpl(f113 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState15, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list15, sliderColors2)), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z13 = z12;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            i23 = i21;
            function3 = function2;
            sliderColors3 = sliderColors2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                if (i19 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if ((i12 & 128) != 0) {
                    sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i13 &= -29360129;
                }
                function2 = function1;
                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                modifier3 = modifier2;
                z12 = z11;
                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                i21 = i17;
                i22 = i13;
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                }
                if (i16 != 0) {
                    i17 = 0;
                }
                if (i19 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if ((i12 & 128) != 0) {
                    sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    i13 &= -29360129;
                }
                function2 = function1;
                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                modifier3 = modifier2;
                z12 = z11;
                closedFloatingPointRange2 = closedFloatingPointRangeRangeTo;
                i21 = i17;
                i22 = i13;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1556183027, i22, -1, "androidx.compose.material.RangeSlider (Slider.kt:290)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue2;
            if (i21 >= 0) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState16 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i22 >> 3) & 14);
            Integer numValueOf16 = Integer.valueOf(i21);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf16);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = access$stepsToTickFractions(i21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = access$stepsToTickFractions(i21);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list16 = (List) objRememberedValue3;
            Modifier modifierMinimumInteractiveComponentSize16 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier3);
            float f114 = f7612a;
            composer2 = composerStartRestartGroup;
            BoxWithConstraintsKt.BoxWithConstraints(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize16, Dp.m4389constructorimpl(4 * f114), Dp.m4389constructorimpl(f114 * 2), 0.0f, 0.0f, 12, null), null, false, ComposableLambdaKt.composableLambda(composer2, 652589923, true, new a(closedFloatingPointRange2, value, i22, stateRememberUpdatedState16, mutableInteractionSource, mutableInteractionSource2, z12, i21, function2, list16, sliderColors2)), composer2, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            z13 = z12;
            closedFloatingPointRange3 = closedFloatingPointRange2;
            i23 = i21;
            function3 = function2;
            sliderColors3 = sliderColors2;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(value, onValueChange, modifier4, z13, closedFloatingPointRange3, i23, function3, sliderColors3, i11, i12));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x0137  */
    /* JADX WARN: Code duplicated, block: B:106:0x0145  */
    /* JADX WARN: Code duplicated, block: B:116:0x0173 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0175  */
    /* JADX WARN: Code duplicated, block: B:119:0x017a  */
    /* JADX WARN: Code duplicated, block: B:122:0x017f  */
    /* JADX WARN: Code duplicated, block: B:123:0x0189  */
    /* JADX WARN: Code duplicated, block: B:125:0x018c  */
    /* JADX WARN: Code duplicated, block: B:126:0x018e  */
    /* JADX WARN: Code duplicated, block: B:128:0x0192  */
    /* JADX WARN: Code duplicated, block: B:129:0x0194  */
    /* JADX WARN: Code duplicated, block: B:131:0x0198  */
    /* JADX WARN: Code duplicated, block: B:133:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:135:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:138:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:146:0x0215  */
    /* JADX WARN: Code duplicated, block: B:148:0x021d  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:156:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:158:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:51:0x0091  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x010e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0115  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void Slider(float f6, @NotNull Function1<? super Float, Unit> onValueChange, @Nullable Modifier modifier, boolean z10, @Nullable ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10, @Nullable Function0<Unit> function0, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable SliderColors sliderColors, @Nullable Composer composer, int i11, int i12) {
        int i13;
        Modifier modifier2;
        int i14;
        boolean z11;
        int i15;
        ClosedFloatingPointRange<Float> closedFloatingPointRange2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        ClosedFloatingPointRange<Float> closedFloatingPointRangeRangeTo;
        int i23;
        Function0<Unit> function1;
        MutableInteractionSource mutableInteractionSource2;
        SliderColors sliderColorsM814colorsq0g_0yA;
        int i24;
        Object objRememberedValue;
        boolean zChanged;
        Object objRememberedValue2;
        ClosedFloatingPointRange<Float> closedFloatingPointRange3;
        Modifier modifier3;
        Function0<Unit> function2;
        MutableInteractionSource mutableInteractionSource3;
        SliderColors sliderColors2;
        boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1962335196);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(f6) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        int i25 = i12 & 4;
        if (i25 == 0) {
            if ((i11 & 896) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((57344 & i11) == 0) {
                    if ((i12 & 16) == 0) {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                        int i26 = composerStartRestartGroup.changed(closedFloatingPointRange2) ? 16384 : 8192;
                        i13 |= i26;
                    } else {
                        closedFloatingPointRange2 = closedFloatingPointRange;
                    }
                    i13 |= i26;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((458752 & i11) == 0) {
                        i17 = i10;
                        if (composerStartRestartGroup.changed(i17)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    i19 = i12 & 64;
                    if (i19 != 0) {
                        i13 |= 1572864;
                    } else if ((i11 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i13 |= i20;
                    }
                    i21 = i12 & 128;
                    if (i21 != 0) {
                        i13 |= 12582912;
                    } else if ((i11 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i22 = 8388608;
                        } else {
                            i22 = 4194304;
                        }
                        i13 |= i22;
                    }
                    if ((i11 & 234881024) != 0) {
                        i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if ((i13 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i25 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i14 != 0) {
                                z11 = true;
                            }
                            if ((i12 & 16) != 0) {
                                closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                                i13 &= -57345;
                            } else {
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                            if (i16 != 0) {
                                i23 = 0;
                            } else {
                                i23 = i10;
                            }
                            if (i19 != 0) {
                                function1 = null;
                            } else {
                                function1 = function0;
                            }
                            if (i21 != 0) {
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
                                i24 = (-234881025) & i13;
                                sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                            } else {
                                sliderColorsM814colorsq0g_0yA = sliderColors;
                                i24 = i13;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                            }
                            if ((i12 & 256) != 0) {
                                i23 = i10;
                                function1 = function0;
                                sliderColorsM814colorsq0g_0yA = sliderColors;
                                i24 = i13 & (-234881025);
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                                mutableInteractionSource2 = mutableInteractionSource;
                            } else {
                                i23 = i10;
                                function1 = function0;
                                mutableInteractionSource2 = mutableInteractionSource;
                                sliderColorsM814colorsq0g_0yA = sliderColors;
                                i24 = i13;
                                closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                        }
                        if (i23 < 0) {
                            throw new IllegalArgumentException("steps should be >= 0".toString());
                        }
                        State stateRememberUpdatedState = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                        Integer numValueOf = Integer.valueOf(i23);
                        composerStartRestartGroup.startReplaceableGroup(1157296644);
                        zChanged = composerStartRestartGroup.changed(numValueOf);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = access$stepsToTickFractions(i23);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        List list = (List) objRememberedValue2;
                        Modifier modifierMinimumInteractiveComponentSize = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                        float f10 = 2;
                        float f11 = f7612a;
                        BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize, Dp.m4389constructorimpl(f11 * f10), Dp.m4389constructorimpl(f11 * f10), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState, function1)), composerStartRestartGroup, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                        modifier3 = modifier2;
                        function2 = function1;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        boolean z13 = z11;
                        sliderColors2 = sliderColorsM814colorsq0g_0yA;
                        z12 = z13;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        mutableInteractionSource3 = mutableInteractionSource;
                        modifier3 = modifier2;
                        z12 = z11;
                        closedFloatingPointRange3 = closedFloatingPointRange2;
                        i23 = i17;
                        function2 = function0;
                        sliderColors2 = sliderColors;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(f6, onValueChange, modifier3, z12, closedFloatingPointRange3, i23, function2, mutableInteractionSource3, sliderColors2, i11, i12));
                }
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                i17 = i10;
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
                if ((i11 & 234881024) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i13 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i23 < 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                    Integer numValueOf2 = Integer.valueOf(i23);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf2);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list2 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize2 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f12 = 2;
                    float f13 = f7612a;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize2, Dp.m4389constructorimpl(f13 * f12), Dp.m4389constructorimpl(f13 * f12), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list2, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState2, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    boolean z14 = z11;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    z12 = z14;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i23 < 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState3 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                    Integer numValueOf3 = Integer.valueOf(i23);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf3);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list3 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize3 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f14 = 2;
                    float f15 = f7612a;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize3, Dp.m4389constructorimpl(f15 * f14), Dp.m4389constructorimpl(f15 * f14), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list3, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState3, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    boolean z15 = z11;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    z12 = z15;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(f6, onValueChange, modifier3, z12, closedFloatingPointRange3, i23, function2, mutableInteractionSource3, sliderColors2, i11, i12));
            }
            i13 |= 3072;
            z11 = z10;
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                    }
                    i13 |= i26;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i13 |= i26;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    i17 = i10;
                    if (composerStartRestartGroup.changed(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
                if ((i11 & 234881024) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i13 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i23 < 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState4 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                    Integer numValueOf4 = Integer.valueOf(i23);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf4);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list4 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize4 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f16 = 2;
                    float f17 = f7612a;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize4, Dp.m4389constructorimpl(f17 * f16), Dp.m4389constructorimpl(f17 * f16), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list4, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState4, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    boolean z16 = z11;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    z12 = z16;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i23 < 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState5 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                    Integer numValueOf5 = Integer.valueOf(i23);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf5);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list5 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize5 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f18 = 2;
                    float f19 = f7612a;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize5, Dp.m4389constructorimpl(f19 * f18), Dp.m4389constructorimpl(f19 * f18), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list5, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState5, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    boolean z17 = z11;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    z12 = z17;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(f6, onValueChange, modifier3, z12, closedFloatingPointRange3, i23, function2, mutableInteractionSource3, sliderColors2, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i17 = i10;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i13 |= i22;
            }
            if ((i11 & 234881024) != 0) {
                i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i13 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i23 < 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState6 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                Integer numValueOf6 = Integer.valueOf(i23);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf6);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list6 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize6 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f110 = 2;
                float f111 = f7612a;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize6, Dp.m4389constructorimpl(f111 * f110), Dp.m4389constructorimpl(f111 * f110), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list6, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState6, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
                boolean z18 = z11;
                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                z12 = z18;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i23 < 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState7 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                Integer numValueOf7 = Integer.valueOf(i23);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf7);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list7 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize7 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f112 = 2;
                float f113 = f7612a;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize7, Dp.m4389constructorimpl(f113 * f112), Dp.m4389constructorimpl(f113 * f112), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list7, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState7, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
                boolean z19 = z11;
                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                z12 = z19;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(f6, onValueChange, modifier3, z12, closedFloatingPointRange3, i23, function2, mutableInteractionSource3, sliderColors2, i11, i12));
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((57344 & i11) == 0) {
                if ((i12 & 16) == 0) {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                    if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                    }
                    i13 |= i26;
                } else {
                    closedFloatingPointRange2 = closedFloatingPointRange;
                }
                i13 |= i26;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((458752 & i11) == 0) {
                    i17 = i10;
                    if (composerStartRestartGroup.changed(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                i19 = i12 & 64;
                if (i19 != 0) {
                    i13 |= 1572864;
                } else if ((i11 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i13 |= i20;
                }
                i21 = i12 & 128;
                if (i21 != 0) {
                    i13 |= 12582912;
                } else if ((i11 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i22 = 8388608;
                    } else {
                        i22 = 4194304;
                    }
                    i13 |= i22;
                }
                if ((i11 & 234881024) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i13 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i23 < 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState8 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                    Integer numValueOf8 = Integer.valueOf(i23);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf8);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list8 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize8 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f114 = 2;
                    float f115 = f7612a;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize8, Dp.m4389constructorimpl(f115 * f114), Dp.m4389constructorimpl(f115 * f114), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list8, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState8, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    boolean z110 = z11;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    z12 = z110;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i14 != 0) {
                            z11 = true;
                        }
                        if ((i12 & 16) != 0) {
                            closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                            i13 &= -57345;
                        } else {
                            closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                        }
                        if (i16 != 0) {
                            i23 = 0;
                        } else {
                            i23 = i10;
                        }
                        if (i19 != 0) {
                            function1 = null;
                        } else {
                            function1 = function0;
                        }
                        if (i21 != 0) {
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
                            i24 = (-234881025) & i13;
                            sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                        } else {
                            sliderColorsM814colorsq0g_0yA = sliderColors;
                            i24 = i13;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                    }
                    if (i23 < 0) {
                        throw new IllegalArgumentException("steps should be >= 0".toString());
                    }
                    State stateRememberUpdatedState9 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                    Integer numValueOf9 = Integer.valueOf(i23);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(numValueOf9);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    } else {
                        objRememberedValue2 = access$stepsToTickFractions(i23);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    List list9 = (List) objRememberedValue2;
                    Modifier modifierMinimumInteractiveComponentSize9 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                    float f116 = 2;
                    float f117 = f7612a;
                    BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize9, Dp.m4389constructorimpl(f117 * f116), Dp.m4389constructorimpl(f117 * f116), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list9, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState9, function1)), composerStartRestartGroup, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                    modifier3 = modifier2;
                    function2 = function1;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    boolean z111 = z11;
                    sliderColors2 = sliderColorsM814colorsq0g_0yA;
                    z12 = z111;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new d(f6, onValueChange, modifier3, z12, closedFloatingPointRange3, i23, function2, mutableInteractionSource3, sliderColors2, i11, i12));
            }
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            i17 = i10;
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i13 |= i22;
            }
            if ((i11 & 234881024) != 0) {
                i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i13 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i23 < 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState10 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                Integer numValueOf10 = Integer.valueOf(i23);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf10);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list10 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize10 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f118 = 2;
                float f119 = f7612a;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize10, Dp.m4389constructorimpl(f119 * f118), Dp.m4389constructorimpl(f119 * f118), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list10, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState10, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
                boolean z112 = z11;
                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                z12 = z112;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i23 < 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState11 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                Integer numValueOf11 = Integer.valueOf(i23);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf11);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list11 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize11 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f1110 = 2;
                float f1111 = f7612a;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize11, Dp.m4389constructorimpl(f1111 * f1110), Dp.m4389constructorimpl(f1111 * f1110), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list11, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState11, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
                boolean z113 = z11;
                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                z12 = z113;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(f6, onValueChange, modifier3, z12, closedFloatingPointRange3, i23, function2, mutableInteractionSource3, sliderColors2, i11, i12));
        }
        i13 |= 3072;
        z11 = z10;
        if ((57344 & i11) == 0) {
            if ((i12 & 16) == 0) {
                closedFloatingPointRange2 = closedFloatingPointRange;
                if (composerStartRestartGroup.changed(closedFloatingPointRange2)) {
                }
                i13 |= i26;
            } else {
                closedFloatingPointRange2 = closedFloatingPointRange;
            }
            i13 |= i26;
        } else {
            closedFloatingPointRange2 = closedFloatingPointRange;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((458752 & i11) == 0) {
                i17 = i10;
                if (composerStartRestartGroup.changed(i17)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            i19 = i12 & 64;
            if (i19 != 0) {
                i13 |= 1572864;
            } else if ((i11 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i13 |= i20;
            }
            i21 = i12 & 128;
            if (i21 != 0) {
                i13 |= 12582912;
            } else if ((i11 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i22 = 8388608;
                } else {
                    i22 = 4194304;
                }
                i13 |= i22;
            }
            if ((i11 & 234881024) != 0) {
                i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i13 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i23 < 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState12 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                Integer numValueOf12 = Integer.valueOf(i23);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf12);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list12 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize12 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f1112 = 2;
                float f1113 = f7612a;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize12, Dp.m4389constructorimpl(f1113 * f1112), Dp.m4389constructorimpl(f1113 * f1112), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list12, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState12, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
                boolean z114 = z11;
                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                z12 = z114;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                } else {
                    if (i25 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i14 != 0) {
                        z11 = true;
                    }
                    if ((i12 & 16) != 0) {
                        closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                        i13 &= -57345;
                    } else {
                        closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                    }
                    if (i16 != 0) {
                        i23 = 0;
                    } else {
                        i23 = i10;
                    }
                    if (i19 != 0) {
                        function1 = null;
                    } else {
                        function1 = function0;
                    }
                    if (i21 != 0) {
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
                        i24 = (-234881025) & i13;
                        sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                    } else {
                        sliderColorsM814colorsq0g_0yA = sliderColors;
                        i24 = i13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
                }
                if (i23 < 0) {
                    throw new IllegalArgumentException("steps should be >= 0".toString());
                }
                State stateRememberUpdatedState13 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
                Integer numValueOf13 = Integer.valueOf(i23);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(numValueOf13);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = access$stepsToTickFractions(i23);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                List list13 = (List) objRememberedValue2;
                Modifier modifierMinimumInteractiveComponentSize13 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
                float f1114 = 2;
                float f1115 = f7612a;
                BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize13, Dp.m4389constructorimpl(f1115 * f1114), Dp.m4389constructorimpl(f1115 * f1114), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list13, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState13, function1)), composerStartRestartGroup, 3072, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
                modifier3 = modifier2;
                function2 = function1;
                mutableInteractionSource3 = mutableInteractionSource2;
                boolean z115 = z11;
                sliderColors2 = sliderColorsM814colorsq0g_0yA;
                z12 = z115;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new d(f6, onValueChange, modifier3, z12, closedFloatingPointRange3, i23, function2, mutableInteractionSource3, sliderColors2, i11, i12));
        }
        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        i17 = i10;
        i19 = i12 & 64;
        if (i19 != 0) {
            i13 |= 1572864;
        } else if ((i11 & 3670016) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i13 |= i20;
        }
        i21 = i12 & 128;
        if (i21 != 0) {
            i13 |= 12582912;
        } else if ((i11 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i22 = 8388608;
            } else {
                i22 = 4194304;
            }
            i13 |= i22;
        }
        if ((i11 & 234881024) != 0) {
            i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(sliderColors)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        if ((i13 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i25 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i16 != 0) {
                    i23 = 0;
                } else {
                    i23 = i10;
                }
                if (i19 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (i21 != 0) {
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
                    i24 = (-234881025) & i13;
                    sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                } else {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                    i24 = i13;
                }
            } else {
                if (i25 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i16 != 0) {
                    i23 = 0;
                } else {
                    i23 = i10;
                }
                if (i19 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (i21 != 0) {
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
                    i24 = (-234881025) & i13;
                    sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                } else {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                    i24 = i13;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
            }
            if (i23 < 0) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState14 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
            Integer numValueOf14 = Integer.valueOf(i23);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf14);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = access$stepsToTickFractions(i23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = access$stepsToTickFractions(i23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list14 = (List) objRememberedValue2;
            Modifier modifierMinimumInteractiveComponentSize14 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
            float f1116 = 2;
            float f1117 = f7612a;
            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize14, Dp.m4389constructorimpl(f1117 * f1116), Dp.m4389constructorimpl(f1117 * f1116), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list14, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState14, function1)), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
            modifier3 = modifier2;
            function2 = function1;
            mutableInteractionSource3 = mutableInteractionSource2;
            boolean z116 = z11;
            sliderColors2 = sliderColorsM814colorsq0g_0yA;
            z12 = z116;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i25 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i16 != 0) {
                    i23 = 0;
                } else {
                    i23 = i10;
                }
                if (i19 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (i21 != 0) {
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
                    i24 = (-234881025) & i13;
                    sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                } else {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                    i24 = i13;
                }
            } else {
                if (i25 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i14 != 0) {
                    z11 = true;
                }
                if ((i12 & 16) != 0) {
                    closedFloatingPointRangeRangeTo = ok.e.rangeTo(0.0f, 1.0f);
                    i13 &= -57345;
                } else {
                    closedFloatingPointRangeRangeTo = closedFloatingPointRange2;
                }
                if (i16 != 0) {
                    i23 = 0;
                } else {
                    i23 = i10;
                }
                if (i19 != 0) {
                    function1 = null;
                } else {
                    function1 = function0;
                }
                if (i21 != 0) {
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
                    i24 = (-234881025) & i13;
                    sliderColorsM814colorsq0g_0yA = SliderDefaults.INSTANCE.m814colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 6, 1023);
                } else {
                    sliderColorsM814colorsq0g_0yA = sliderColors;
                    i24 = i13;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1962335196, i24, -1, "androidx.compose.material.Slider (Slider.kt:145)");
            }
            if (i23 < 0) {
                throw new IllegalArgumentException("steps should be >= 0".toString());
            }
            State stateRememberUpdatedState15 = SnapshotStateKt.rememberUpdatedState(onValueChange, composerStartRestartGroup, (i24 >> 3) & 14);
            Integer numValueOf15 = Integer.valueOf(i23);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(numValueOf15);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = access$stepsToTickFractions(i23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = access$stepsToTickFractions(i23);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            List list15 = (List) objRememberedValue2;
            Modifier modifierMinimumInteractiveComponentSize15 = InteractiveComponentSizeKt.minimumInteractiveComponentSize(modifier2);
            float f1118 = 2;
            float f1119 = f7612a;
            BoxWithConstraintsKt.BoxWithConstraints(FocusableKt.focusable(c(SizeKt.m331requiredSizeInqDBjuR0$default(modifierMinimumInteractiveComponentSize15, Dp.m4389constructorimpl(f1119 * f1118), Dp.m4389constructorimpl(f1119 * f1118), 0.0f, 0.0f, 12, null), f6, z11, onValueChange, function1, closedFloatingPointRangeRangeTo, i23), z11, mutableInteractionSource2), null, false, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 2085116814, true, new c(closedFloatingPointRangeRangeTo, i24, f6, mutableInteractionSource2, z11, list15, sliderColorsM814colorsq0g_0yA, stateRememberUpdatedState15, function1)), composerStartRestartGroup, 3072, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            closedFloatingPointRange3 = closedFloatingPointRangeRangeTo;
            modifier3 = modifier2;
            function2 = function1;
            mutableInteractionSource3 = mutableInteractionSource2;
            boolean z117 = z11;
            sliderColors2 = sliderColorsM814colorsq0g_0yA;
            z12 = z117;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new d(f6, onValueChange, modifier3, z12, closedFloatingPointRange3, i23, function2, mutableInteractionSource3, sliderColors2, i11, i12));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(BoxScope boxScope, Modifier modifier, float f6, MutableInteractionSource mutableInteractionSource, SliderColors sliderColors, boolean z10, float f10, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(428907178);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(f6) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(mutableInteractionSource) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(sliderColors) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(z10) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 1048576 : 524288;
        }
        int i12 = i11;
        if ((2995931 & i12) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(428907178, i12, -1, "androidx.compose.material.SliderThumb (Slider.kt:684)");
            }
            Modifier modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(Modifier.INSTANCE, f6, 0.0f, 0.0f, 0.0f, 14, null);
            Alignment.Companion companion = Alignment.INSTANCE;
            Modifier modifierAlign = boxScope.align(modifierM300paddingqDBjuR0$default, companion.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion, false, composerStartRestartGroup, 0, -1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierAlign);
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
            Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
            if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
            }
            ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue == companion3.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            SnapshotStateList snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i13 = i12 >> 9;
            int i14 = i13 & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(mutableInteractionSource) | composerStartRestartGroup.changed(snapshotStateList);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new e(mutableInteractionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i14 | 64);
            SpacerKt.Spacer(BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m337sizeVpY3zN4(modifier, f10, f10), mutableInteractionSource, RippleKt.m900rememberRipple9IZ8Weo(false, f7613b, 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null), z10 ? snapshotStateList.isEmpty() ^ true ? f7615d : f7614c : Dp.m4389constructorimpl(0), RoundedCornerShapeKt.getCircleShape(), false, 0L, 0L, 24, null), sliderColors.thumbColor(z10, composerStartRestartGroup, ((i12 >> 15) & 14) | (i13 & 112)).getValue().m2518unboximpl(), RoundedCornerShapeKt.getCircleShape()), composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(boxScope, modifier, f6, mutableInteractionSource, sliderColors, z10, f10, i10));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 1, list:
          (r14v0 ?? I:java.lang.Object) from 0x00cc: INVOKE (r11v0 ?? I:androidx.compose.runtime.Composer), (r14v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:205)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public static final void access$CorrectValueSideEffect(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v0 ??, still in use, count: 1, list:
          (r14v0 ?? I:java.lang.Object) from 0x00cc: INVOKE (r11v0 ?? I:androidx.compose.runtime.Composer), (r14v0 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:205)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r15v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    public static final void access$RangeSliderImpl(boolean z10, float f6, float f10, List list, SliderColors sliderColors, float f11, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, Modifier modifier, Modifier modifier2, Modifier modifier3, Composer composer, int i10, int i11) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-278895713);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-278895713, i10, i11, "androidx.compose.material.RangeSliderImpl (Slider.kt:616)");
        }
        Strings.Companion companion = Strings.INSTANCE;
        String strM832getString4foXLRw = Strings_androidKt.m832getString4foXLRw(companion.m831getSliderRangeStartUdPEhr4(), composerStartRestartGroup, 6);
        String strM832getString4foXLRw2 = Strings_androidKt.m832getString4foXLRw(companion.m830getSliderRangeEndUdPEhr4(), composerStartRestartGroup, 6);
        Modifier modifierThen = modifier.then(f7617f);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        Alignment.Companion companion2 = Alignment.INSTANCE;
        MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion3, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo415toPx0680j_4 = density.mo415toPx0680j_4(f7616e);
        float f12 = f7612a;
        float fMo415toPx0680j_5 = density.mo415toPx0680j_4(f12);
        float fMo405toDpu2uoSUM = density.mo405toDpu2uoSUM(f11);
        float fM4389constructorimpl = Dp.m4389constructorimpl(f12 * 2);
        float fM4389constructorimpl2 = Dp.m4389constructorimpl(fMo405toDpu2uoSUM * f6);
        float fM4389constructorimpl3 = Dp.m4389constructorimpl(fMo405toDpu2uoSUM * f10);
        Modifier.Companion companion4 = Modifier.INSTANCE;
        int i12 = i10 >> 9;
        int i13 = i10 << 6;
        b(SizeKt.fillMaxSize$default(boxScopeInstance.align(companion4, companion2.getCenterStart()), 0.0f, 1, null), sliderColors, z10, f6, f10, list, fMo415toPx0680j_5, fMo415toPx0680j_4, composerStartRestartGroup, (i12 & 112) | 262144 | (i13 & 896) | (i13 & 7168) | (i13 & 57344));
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged = composerStartRestartGroup.changed(strM832getString4foXLRw);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new h0.p2(strM832getString4foXLRw);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        int i14 = i10 & 57344;
        int i15 = (i10 << 15) & 458752;
        a(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) objRememberedValue), true, mutableInteractionSource).then(modifier2), fM4389constructorimpl2, mutableInteractionSource, sliderColors, z10, fM4389constructorimpl, composerStartRestartGroup, 1572870 | (i12 & 7168) | i14 | i15);
        composerStartRestartGroup.startReplaceableGroup(1157296644);
        boolean zChanged2 = composerStartRestartGroup.changed(strM832getString4foXLRw2);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new h0.q2(strM832getString4foXLRw2);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        composerStartRestartGroup.endReplaceableGroup();
        a(boxScopeInstance, FocusableKt.focusable(SemanticsModifierKt.semantics(companion4, true, (Function1) objRememberedValue2), true, mutableInteractionSource2).then(modifier3), fM4389constructorimpl3, mutableInteractionSource2, sliderColors, z10, fM4389constructorimpl, composerStartRestartGroup, 1572870 | ((i10 >> 12) & 7168) | i14 | i15);
        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.r2(z10, f6, f10, list, sliderColors, f11, mutableInteractionSource, mutableInteractionSource2, modifier, modifier2, modifier3, i10, i11));
    }

    public static final void access$SliderImpl(boolean z10, float f6, List list, SliderColors sliderColors, float f10, MutableInteractionSource mutableInteractionSource, Modifier modifier, Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1679682785);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1679682785, i10, -1, "androidx.compose.material.SliderImpl (Slider.kt:579)");
        }
        Modifier modifierThen = modifier.then(f7617f);
        composerStartRestartGroup.startReplaceableGroup(733328855);
        MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierThen);
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
        Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
        if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
        }
        ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 2058660585);
        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
        float fMo415toPx0680j_4 = density.mo415toPx0680j_4(f7616e);
        float f11 = f7612a;
        float fMo415toPx0680j_5 = density.mo415toPx0680j_4(f11);
        float fMo405toDpu2uoSUM = density.mo405toDpu2uoSUM(f10);
        float fM4389constructorimpl = Dp.m4389constructorimpl(f11 * 2);
        float fM4389constructorimpl2 = Dp.m4389constructorimpl(fMo405toDpu2uoSUM * f6);
        Modifier.Companion companion2 = Modifier.INSTANCE;
        int i11 = i10 >> 6;
        b(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), sliderColors, z10, 0.0f, f6, list, fMo415toPx0680j_5, fMo415toPx0680j_4, composerStartRestartGroup, (i11 & 112) | 265222 | ((i10 << 6) & 896) | ((i10 << 9) & 57344));
        a(boxScopeInstance, companion2, fM4389constructorimpl2, mutableInteractionSource, sliderColors, z10, fM4389constructorimpl, composerStartRestartGroup, (i11 & 7168) | 1572918 | ((i10 << 3) & 57344) | ((i10 << 15) & 458752));
        if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h0.s2(z10, f6, list, sliderColors, f10, mutableInteractionSource, modifier, i10));
    }

    public static final Object access$animateToTarget(DraggableState draggableState, float f6, float f10, float f11, Continuation continuation) {
        Object objA = u.e.a(draggableState, null, new h0.t2(f6, f10, f11, null), continuation, 1, null);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: access$awaitSlop-8vUncbI, reason: not valid java name */
    public static final Object m816access$awaitSlop8vUncbI(AwaitPointerEventScope awaitPointerEventScope, long j10, int i10, Continuation continuation) {
        h0.u2 u2Var;
        Ref.FloatRef floatRef;
        if (continuation instanceof h0.u2) {
            u2Var = (h0.u2) continuation;
            int i11 = u2Var.f69130r0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                u2Var.f69130r0 = i11 - Integer.MIN_VALUE;
            } else {
                u2Var = new h0.u2(continuation);
            }
        } else {
            u2Var = new h0.u2(continuation);
        }
        h0.u2 u2Var2 = u2Var;
        Object obj = u2Var2.f69129q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i12 = u2Var2.f69130r0;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            Ref.FloatRef floatRef2 = new Ref.FloatRef();
            h0.v2 v2Var = new h0.v2(floatRef2);
            u2Var2.f69128p0 = floatRef2;
            u2Var2.f69130r0 = 1;
            Object objM747awaitHorizontalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorCopyKt.m747awaitHorizontalPointerSlopOrCancellationgDDlDlE(awaitPointerEventScope, j10, i10, v2Var, u2Var2);
            if (objM747awaitHorizontalPointerSlopOrCancellationgDDlDlE == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objM747awaitHorizontalPointerSlopOrCancellationgDDlDlE;
            floatRef = floatRef2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            floatRef = u2Var2.f69128p0;
            ResultKt.throwOnFailure(obj);
        }
        PointerInputChange pointerInputChange = (PointerInputChange) obj;
        return pointerInputChange != null ? TuplesKt.to(pointerInputChange, Boxing.boxFloat(floatRef.element)) : null;
    }

    public static final float access$calcFraction(float f6, float f10, float f11) {
        float f12 = f10 - f6;
        return kotlin.ranges.c.coerceIn(f12 == 0.0f ? 0.0f : (f11 - f6) / f12, 0.0f, 1.0f);
    }

    public static final Modifier access$rangeSliderPressDragModifier(Modifier modifier, MutableInteractionSource mutableInteractionSource, MutableInteractionSource mutableInteractionSource2, State state, State state2, boolean z10, boolean z11, float f6, ClosedFloatingPointRange closedFloatingPointRange, State state3, State state4) {
        return z10 ? SuspendingPointerInputFilterKt.pointerInput(modifier, new Object[]{mutableInteractionSource, mutableInteractionSource2, Float.valueOf(f6), Boolean.valueOf(z11), closedFloatingPointRange}, (Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object>) new h0.w2(mutableInteractionSource, mutableInteractionSource2, state, state2, state4, z11, f6, state3, null)) : modifier;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ClosedFloatingPointRange access$scale(float f6, float f10, ClosedFloatingPointRange closedFloatingPointRange, float f11, float f12) {
        float f13 = f10 - f6;
        return ok.e.rangeTo(MathHelpersKt.lerp(f11, f12, kotlin.ranges.c.coerceIn(f13 == 0.0f ? 0.0f : (((Number) closedFloatingPointRange.getStart()).floatValue() - f6) / f13, 0.0f, 1.0f)), MathHelpersKt.lerp(f11, f12, kotlin.ranges.c.coerceIn(f13 == 0.0f ? 0.0f : (((Number) closedFloatingPointRange.getEndInclusive()).floatValue() - f6) / f13, 0.0f, 1.0f)));
    }

    public static final Modifier access$sliderTapModifier(Modifier modifier, final DraggableState draggableState, final MutableInteractionSource mutableInteractionSource, final float f6, final boolean z10, final State state, final State state2, final MutableState mutableState, final boolean z11) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "sliderTapModifier").set("draggableState", draggableState);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("interactionSource", mutableInteractionSource);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("maxPx", Float.valueOf(f6));
                com.google.android.gms.internal.mlkit_vision_barcode_bundled.a.b(z10, inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String(), "isRtl", inspectorInfo).set("rawOffset", state);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("gestureEndAction", state2);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("pressOffset", mutableState);
                inspectorInfo.getCom.bbva.glomohybrid.logs.LogKeysKt.PROPERTIES java.lang.String().set("enabled", Boolean.valueOf(z11));
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new h0.z2(draggableState, mutableInteractionSource, f6, z11, state, state2, mutableState, z10));
    }

    public static final float access$snapValueToTick(float f6, List list, float f10, float f11) {
        Object obj;
        Iterator it = list.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(MathHelpersKt.lerp(f10, f11, ((Number) next).floatValue()) - f6);
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(MathHelpersKt.lerp(f10, f11, ((Number) next2).floatValue()) - f6);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        Float f12 = (Float) obj;
        return f12 != null ? MathHelpersKt.lerp(f10, f11, f12.floatValue()) : f6;
    }

    public static final List access$stepsToTickFractions(int i10) {
        if (i10 == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        int i11 = i10 + 2;
        ArrayList arrayList = new ArrayList(i11);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(Float.valueOf(i12 / (i10 + 1)));
        }
        return arrayList;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void b(Modifier modifier, SliderColors sliderColors, boolean z10, float f6, float f10, List<Float> list, float f11, float f12, Composer composer, int i10) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1833126050);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1833126050, i10, -1, "androidx.compose.material.Track (Slider.kt:730)");
        }
        int i11 = ((i10 >> 6) & 14) | 48 | ((i10 << 3) & 896);
        CanvasKt.Canvas(modifier, new g(f11, sliderColors.trackColor(z10, false, composerStartRestartGroup, i11), f12, f10, f6, sliderColors.trackColor(z10, true, composerStartRestartGroup, i11), list, sliderColors.tickColor(z10, false, composerStartRestartGroup, i11), sliderColors.tickColor(z10, true, composerStartRestartGroup, i11)), composerStartRestartGroup, i10 & 14);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(modifier, sliderColors, z10, f6, f10, list, f11, f12, i10));
    }

    public static final Modifier c(Modifier modifier, float f6, boolean z10, Function1<? super Float, Unit> function1, Function0<Unit> function0, ClosedFloatingPointRange<Float> closedFloatingPointRange, int i10) {
        return ProgressSemanticsKt.progressSemantics(SemanticsModifierKt.semantics$default(modifier, false, new i(z10, closedFloatingPointRange, i10, kotlin.ranges.c.coerceIn(f6, closedFloatingPointRange.getStart().floatValue(), closedFloatingPointRange.getEndInclusive().floatValue()), function1, function0), 1, null), f6, closedFloatingPointRange, i10);
    }

    public static final float getThumbRadius() {
        return f7612a;
    }

    public static final float getTrackHeight() {
        return f7616e;
    }

    public static final float access$scale(float f6, float f10, float f11, float f12, float f13) {
        float f14 = f10 - f6;
        return MathHelpersKt.lerp(f12, f13, kotlin.ranges.c.coerceIn(f14 == 0.0f ? 0.0f : (f11 - f6) / f14, 0.0f, 1.0f));
    }
}
