package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.TwoWayConverter;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SelectionMagnifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aF\u0010\t\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012'\u0010\b\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u00000\u0004H\u0000ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b²\u0006\f\u0010\u0007\u001a\u00020\u00028\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Landroidx/compose/ui/Modifier;", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Offset;", "magnifierCenter", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animatedCenter", "platformMagnifier", "animatedSelectionMagnifier", "targetValue", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,110:1\n25#2:111\n25#2:118\n1097#3,6:112\n1097#3,6:119\n81#4:125\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt\n*L\n79#1:111\n80#1:118\n79#1:112,6\n80#1:119,6\n79#1:125\n*E\n"})
public final class SelectionMagnifierKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final AnimationVector2D f6345a = new AnimationVector2D(Float.NaN, Float.NaN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final TwoWayConverter<Offset, AnimationVector2D> f6346b = VectorConvertersKt.TwoWayConverter(a.f6349p0, b.f6350p0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f6347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public static final SpringSpec<Offset> f6348d;

    /* JADX INFO: compiled from: SelectionMagnifier.kt */
    public static final class a extends Lambda implements Function1<Offset, AnimationVector2D> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f6349p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final AnimationVector2D invoke(Offset offset) {
            long f15533a = offset.getF15533a();
            return OffsetKt.m2294isSpecifiedk4lQ0M(f15533a) ? new AnimationVector2D(Offset.m2275getXimpl(f15533a), Offset.m2276getYimpl(f15533a)) : SelectionMagnifierKt.f6345a;
        }
    }

    /* JADX INFO: compiled from: SelectionMagnifier.kt */
    public static final class b extends Lambda implements Function1<AnimationVector2D, Offset> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f6350p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Offset invoke(AnimationVector2D animationVector2D) {
            AnimationVector2D it = animationVector2D;
            Intrinsics.checkNotNullParameter(it, "it");
            return Offset.m2264boximpl(OffsetKt.Offset(it.getCom.bbva.glomoconfig.constants.ConfigConstantsKt.CUSTOMERS_API_VERSION java.lang.String(), it.getV2()));
        }
    }

    /* JADX INFO: compiled from: SelectionMagnifier.kt */
    @SourceDebugExtension({"SMAP\nSelectionMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,110:1\n36#2:111\n1097#3,6:112\n81#4:118\n*S KotlinDebug\n*F\n+ 1 SelectionMagnifier.kt\nandroidx/compose/foundation/text/selection/SelectionMagnifierKt$animatedSelectionMagnifier$1\n*L\n68#1:111\n68#1:112,6\n67#1:118\n*E\n"})
    public static final class c extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Offset> f6351p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1<Function0<Offset>, Modifier> f6352q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function0<Offset> function0, Function1<? super Function0<Offset>, ? extends Modifier> function1) {
            super(3);
            this.f6351p0 = function0;
            this.f6352q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            Composer composer2 = composer;
            int iA = ci.a.a(num, modifier, "$this$composed", composer2, 759876635);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(759876635, iA, -1, "androidx.compose.foundation.text.selection.animatedSelectionMagnifier.<anonymous> (SelectionMagnifier.kt:65)");
            }
            State stateAccess$rememberAnimatedMagnifierPosition = SelectionMagnifierKt.access$rememberAnimatedMagnifierPosition(this.f6351p0, composer2, 0);
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged = composer2.changed(stateAccess$rememberAnimatedMagnifierPosition);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new f(stateAccess$rememberAnimatedMagnifierPosition);
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceableGroup();
            Modifier modifierInvoke = this.f6352q0.invoke((Function0<Offset>) objRememberedValue);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer2.endReplaceableGroup();
            return modifierInvoke;
        }
    }

    static {
        long jOffset = OffsetKt.Offset(0.01f, 0.01f);
        f6347c = jOffset;
        f6348d = new SpringSpec<>(0.0f, 0.0f, Offset.m2264boximpl(jOffset), 3, null);
    }

    public static final State access$rememberAnimatedMagnifierPosition(Function0 function0, Composer composer, int i10) {
        composer.startReplaceableGroup(-1589795249);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1589795249, i10, -1, "androidx.compose.foundation.text.selection.rememberAnimatedMagnifierPosition (SelectionMagnifier.kt:75)");
        }
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotStateKt.derivedStateOf(function0);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        State state = (State) objRememberedValue;
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Animatable(Offset.m2264boximpl(access$rememberAnimatedMagnifierPosition$lambda$1(state)), f6346b, Offset.m2264boximpl(f6347c), null, 8, null);
            composer.updateRememberedValue(objRememberedValue2);
        }
        composer.endReplaceableGroup();
        Animatable animatable = (Animatable) objRememberedValue2;
        EffectsKt.LaunchedEffect(Unit.INSTANCE, new g0.d(state, animatable, null), composer, 70);
        State stateAsState = animatable.asState();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateAsState;
    }

    public static final long access$rememberAnimatedMagnifierPosition$lambda$1(State state) {
        return ((Offset) state.getValue()).getF15533a();
    }

    @NotNull
    public static final Modifier animatedSelectionMagnifier(@NotNull Modifier modifier, @NotNull Function0<Offset> magnifierCenter, @NotNull Function1<? super Function0<Offset>, ? extends Modifier> platformMagnifier) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(magnifierCenter, "magnifierCenter");
        Intrinsics.checkNotNullParameter(platformMagnifier, "platformMagnifier");
        return ComposedModifierKt.composed$default(modifier, null, new c(magnifierCenter, platformMagnifier), 1, null);
    }
}
