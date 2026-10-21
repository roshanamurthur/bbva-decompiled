package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.graphics.TransformOrigin;
import com.bbva.cells.component.kit.ui.property.impl.image.ImageScaleTypeHandler;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B(\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\bø\u0001\u0002¢\u0006\u0004\b\"\u0010#J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0019\u0010\u0007\u001a\u00020\u0004HÆ\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0003J:\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\bHÆ\u0001ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0012HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR \u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0006R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, d2 = {"Landroidx/compose/animation/Scale;", "", "", "component1", "Landroidx/compose/ui/graphics/TransformOrigin;", "component2-SzJe1aQ", "()J", "component2", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "component3", ImageScaleTypeHandler.ID, "transformOrigin", "animationSpec", "copy-bnNdC4k", "(FJLandroidx/compose/animation/core/FiniteAnimationSpec;)Landroidx/compose/animation/Scale;", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "F", "getScale", "()F", "b", "J", "getTransformOrigin-SzJe1aQ", "c", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "<init>", "(FJLandroidx/compose/animation/core/FiniteAnimationSpec;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class Scale {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final float scale;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final long transformOrigin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FiniteAnimationSpec<Float> animationSpec;

    public Scale() {
        throw null;
    }

    public Scale(float f6, long j10, FiniteAnimationSpec animationSpec, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.scale = f6;
        this.transformOrigin = j10;
        this.animationSpec = animationSpec;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: copy-bnNdC4k$default, reason: not valid java name */
    public static /* synthetic */ Scale m52copybnNdC4k$default(Scale scale, float f6, long j10, FiniteAnimationSpec finiteAnimationSpec, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f6 = scale.scale;
        }
        if ((i10 & 2) != 0) {
            j10 = scale.transformOrigin;
        }
        if ((i10 & 4) != 0) {
            finiteAnimationSpec = scale.animationSpec;
        }
        return scale.m54copybnNdC4k(f6, j10, finiteAnimationSpec);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: component2-SzJe1aQ, reason: not valid java name and from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    @NotNull
    public final FiniteAnimationSpec<Float> component3() {
        return this.animationSpec;
    }

    @NotNull
    /* JADX INFO: renamed from: copy-bnNdC4k, reason: not valid java name */
    public final Scale m54copybnNdC4k(float scale, long transformOrigin, @NotNull FiniteAnimationSpec<Float> animationSpec) {
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new Scale(scale, transformOrigin, animationSpec, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Scale)) {
            return false;
        }
        Scale scale = (Scale) other;
        return Float.compare(this.scale, scale.scale) == 0 && TransformOrigin.m2839equalsimpl0(this.transformOrigin, scale.transformOrigin) && Intrinsics.areEqual(this.animationSpec, scale.animationSpec);
    }

    @NotNull
    public final FiniteAnimationSpec<Float> getAnimationSpec() {
        return this.animationSpec;
    }

    public final float getScale() {
        return this.scale;
    }

    /* JADX INFO: renamed from: getTransformOrigin-SzJe1aQ, reason: not valid java name */
    public final long m55getTransformOriginSzJe1aQ() {
        return this.transformOrigin;
    }

    public int hashCode() {
        return this.animationSpec.hashCode() + ((TransformOrigin.m2842hashCodeimpl(this.transformOrigin) + (Float.floatToIntBits(this.scale) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "Scale(scale=" + this.scale + ", transformOrigin=" + ((Object) TransformOrigin.m2843toStringimpl(this.transformOrigin)) + ", animationSpec=" + this.animationSpec + RootService.CLOSE_BRACKET;
    }
}
