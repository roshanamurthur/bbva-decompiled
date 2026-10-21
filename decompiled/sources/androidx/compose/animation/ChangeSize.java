package androidx.compose.animation;

import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EnterExitTransition.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\b\u0081\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b)\u0010*J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003ø\u0001\u0000J\u0012\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003ø\u0001\u0000J\t\u0010\r\u001a\u00020\fHÆ\u0003JU\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u000e\u001a\u00020\u00022#\b\u0002\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u0011\u001a\u00020\fHÆ\u0001ø\u0001\u0000J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0015HÖ\u0001J\u0013\u0010\u0018\u001a\u00020\f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR5\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Landroidx/compose/animation/ChangeSize;", "", "Landroidx/compose/ui/Alignment;", "component1", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", "name", "fullSize", "component2", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "component3", "", "component4", "alignment", "size", "animationSpec", "clip", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "b", "Lkotlin/jvm/functions/Function1;", "getSize", "()Lkotlin/jvm/functions/Function1;", "c", "Landroidx/compose/animation/core/FiniteAnimationSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/FiniteAnimationSpec;", "d", "Z", "getClip", "()Z", "<init>", "(Landroidx/compose/ui/Alignment;Lkotlin/jvm/functions/Function1;Landroidx/compose/animation/core/FiniteAnimationSpec;Z)V", "animation_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ChangeSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Alignment alignment;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<IntSize, IntSize> size;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FiniteAnimationSpec<IntSize> animationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean clip;

    /* JADX INFO: compiled from: EnterExitTransition.kt */
    public static final class a extends Lambda implements Function1<IntSize, IntSize> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f2705p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final IntSize invoke(IntSize intSize) {
            intSize.getF18319a();
            return IntSize.m4541boximpl(IntSizeKt.IntSize(0, 0));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChangeSize(@NotNull Alignment alignment, @NotNull Function1<? super IntSize, IntSize> size, @NotNull FiniteAnimationSpec<IntSize> animationSpec, boolean z10) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        this.alignment = alignment;
        this.size = size;
        this.animationSpec = animationSpec;
        this.clip = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChangeSize copy$default(ChangeSize changeSize, Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            alignment = changeSize.alignment;
        }
        if ((i10 & 2) != 0) {
            function1 = changeSize.size;
        }
        if ((i10 & 4) != 0) {
            finiteAnimationSpec = changeSize.animationSpec;
        }
        if ((i10 & 8) != 0) {
            z10 = changeSize.clip;
        }
        return changeSize.copy(alignment, function1, finiteAnimationSpec, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final Function1<IntSize, IntSize> component2() {
        return this.size;
    }

    @NotNull
    public final FiniteAnimationSpec<IntSize> component3() {
        return this.animationSpec;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    @NotNull
    public final ChangeSize copy(@NotNull Alignment alignment, @NotNull Function1<? super IntSize, IntSize> size, @NotNull FiniteAnimationSpec<IntSize> animationSpec, boolean clip) {
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(size, "size");
        Intrinsics.checkNotNullParameter(animationSpec, "animationSpec");
        return new ChangeSize(alignment, size, animationSpec, clip);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeSize)) {
            return false;
        }
        ChangeSize changeSize = (ChangeSize) other;
        return Intrinsics.areEqual(this.alignment, changeSize.alignment) && Intrinsics.areEqual(this.size, changeSize.size) && Intrinsics.areEqual(this.animationSpec, changeSize.animationSpec) && this.clip == changeSize.clip;
    }

    @NotNull
    public final Alignment getAlignment() {
        return this.alignment;
    }

    @NotNull
    public final FiniteAnimationSpec<IntSize> getAnimationSpec() {
        return this.animationSpec;
    }

    public final boolean getClip() {
        return this.clip;
    }

    @NotNull
    public final Function1<IntSize, IntSize> getSize() {
        return this.size;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = (this.animationSpec.hashCode() + ((this.size.hashCode() + (this.alignment.hashCode() * 31)) * 31)) * 31;
        boolean z10 = this.clip;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChangeSize(alignment=");
        sb2.append(this.alignment);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", animationSpec=");
        sb2.append(this.animationSpec);
        sb2.append(", clip=");
        return bc.org.bouncycastle.math.ec.custom.sec.a.d(sb2, this.clip, RootService.CLOSE_BRACKET);
    }

    public /* synthetic */ ChangeSize(Alignment alignment, Function1 function1, FiniteAnimationSpec finiteAnimationSpec, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(alignment, (i10 & 2) != 0 ? a.f2705p0 : function1, finiteAnimationSpec, (i10 & 8) != 0 ? true : z10);
    }
}
