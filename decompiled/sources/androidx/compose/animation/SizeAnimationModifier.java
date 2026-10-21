package androidx.compose.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimationModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nAnimationModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifier\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,162:1\n81#2:163\n107#2,2:164\n56#3,4:166\n*S KotlinDebug\n*F\n+ 1 AnimationModifier.kt\nandroidx/compose/animation/SizeAnimationModifier\n*L\n102#1:163\n102#1:164,2\n113#1:166,4\n*E\n"})
public final class SizeAnimationModifier extends LayoutModifierWithPassThroughIntrinsics {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final AnimationSpec<IntSize> f2801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f2802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public Function2<? super IntSize, ? super IntSize, Unit> f2803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final MutableState f2804d;

    /* JADX INFO: compiled from: AnimationModifier.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B&\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\n\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002HÆ\u0003ø\u0001\u0000J\u0019\u0010\b\u001a\u00020\u0003HÆ\u0003ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\u001d\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/animation/core/AnimationVector2D;", "component1", "component2-YbymL2g", "()J", "component2", "anim", "startSize", "copy-O0kMr_c", "(Landroidx/compose/animation/core/Animatable;J)Landroidx/compose/animation/SizeAnimationModifier$AnimData;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Landroidx/compose/animation/core/Animatable;", "getAnim", "()Landroidx/compose/animation/core/Animatable;", "b", "J", "getStartSize-YbymL2g", "setStartSize-ozmzZPI", "(J)V", "<init>", "(Landroidx/compose/animation/core/Animatable;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class AnimData {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Animatable<IntSize, AnimationVector2D> anim;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public long startSize;

        public AnimData() {
            throw null;
        }

        public AnimData(Animatable anim, long j10, DefaultConstructorMarker defaultConstructorMarker) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            this.anim = anim;
            this.startSize = j10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: copy-O0kMr_c$default, reason: not valid java name */
        public static /* synthetic */ AnimData m59copyO0kMr_c$default(AnimData animData, Animatable animatable, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                animatable = animData.anim;
            }
            if ((i10 & 2) != 0) {
                j10 = animData.startSize;
            }
            return animData.m61copyO0kMr_c(animatable, j10);
        }

        @NotNull
        public final Animatable<IntSize, AnimationVector2D> component1() {
            return this.anim;
        }

        /* JADX INFO: renamed from: component2-YbymL2g, reason: not valid java name and from getter */
        public final long getStartSize() {
            return this.startSize;
        }

        @NotNull
        /* JADX INFO: renamed from: copy-O0kMr_c, reason: not valid java name */
        public final AnimData m61copyO0kMr_c(@NotNull Animatable<IntSize, AnimationVector2D> anim, long startSize) {
            Intrinsics.checkNotNullParameter(anim, "anim");
            return new AnimData(anim, startSize, null);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AnimData)) {
                return false;
            }
            AnimData animData = (AnimData) other;
            return Intrinsics.areEqual(this.anim, animData.anim) && IntSize.m4547equalsimpl0(this.startSize, animData.startSize);
        }

        @NotNull
        public final Animatable<IntSize, AnimationVector2D> getAnim() {
            return this.anim;
        }

        /* JADX INFO: renamed from: getStartSize-YbymL2g, reason: not valid java name */
        public final long m62getStartSizeYbymL2g() {
            return this.startSize;
        }

        public int hashCode() {
            return IntSize.m4550hashCodeimpl(this.startSize) + (this.anim.hashCode() * 31);
        }

        /* JADX INFO: renamed from: setStartSize-ozmzZPI, reason: not valid java name */
        public final void m63setStartSizeozmzZPI(long j10) {
            this.startSize = j10;
        }

        @NotNull
        public String toString() {
            return "AnimData(anim=" + this.anim + ", startSize=" + ((Object) IntSize.m4552toStringimpl(this.startSize)) + RootService.CLOSE_BRACKET;
        }
    }

    /* JADX INFO: compiled from: AnimationModifier.kt */
    public static final class a extends Lambda implements Function1<Placeable.PlacementScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Placeable f2807p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Placeable placeable) {
            super(1);
            this.f2807p0 = placeable;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Placeable.PlacementScope placementScope) {
            Placeable.PlacementScope layout = placementScope;
            Intrinsics.checkNotNullParameter(layout, "$this$layout");
            Placeable.PlacementScope.placeRelative$default(layout, this.f2807p0, 0, 0, 0.0f, 4, null);
            return Unit.INSTANCE;
        }
    }

    public SizeAnimationModifier(@NotNull FiniteAnimationSpec animSpec, @NotNull CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(animSpec, "animSpec");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f2801a = animSpec;
        this.f2802b = scope;
        this.f2804d = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.LayoutModifier
    @NotNull
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final MeasureResult mo47measure3p2s80s(@NotNull MeasureScope measure, @NotNull Measurable measurable, long j10) {
        Intrinsics.checkNotNullParameter(measure, "$this$measure");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        Placeable placeableMo3575measureBRTryo0 = measurable.mo3575measureBRTryo0(j10);
        long jIntSize = IntSizeKt.IntSize(placeableMo3575measureBRTryo0.getWidth(), placeableMo3575measureBRTryo0.getHeight());
        MutableState mutableState = this.f2804d;
        AnimData animData = (AnimData) mutableState.getValue();
        if (animData == null) {
            animData = new AnimData(new Animatable(IntSize.m4541boximpl(jIntSize), VectorConvertersKt.getVectorConverter(IntSize.INSTANCE), IntSize.m4541boximpl(IntSizeKt.IntSize(1, 1)), null, 8, null), jIntSize, null);
        } else if (!IntSize.m4547equalsimpl0(jIntSize, animData.getAnim().getTargetValue().getF18319a())) {
            animData.m63setStartSizeozmzZPI(animData.getAnim().getValue().getF18319a());
            BuildersKt__Builders_commonKt.launch$default(this.f2802b, null, null, new l(animData, jIntSize, this, null), 3, null);
        }
        mutableState.setValue(animData);
        long f18319a = animData.getAnim().getValue().getF18319a();
        return MeasureScope.CC.q(measure, IntSize.m4549getWidthimpl(f18319a), IntSize.m4548getHeightimpl(f18319a), null, new a(placeableMo3575measureBRTryo0), 4, null);
    }
}
