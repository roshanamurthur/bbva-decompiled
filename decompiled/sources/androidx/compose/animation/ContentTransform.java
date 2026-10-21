package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AnimatedContent.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR+\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\u0010\u000f\u001a\u0004\u0018\u00010\u00178\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Landroidx/compose/animation/ContentTransform;", "", "Landroidx/compose/animation/EnterTransition;", "a", "Landroidx/compose/animation/EnterTransition;", "getTargetContentEnter", "()Landroidx/compose/animation/EnterTransition;", "targetContentEnter", "Landroidx/compose/animation/ExitTransition;", "b", "Landroidx/compose/animation/ExitTransition;", "getInitialContentExit", "()Landroidx/compose/animation/ExitTransition;", "initialContentExit", "", "<set-?>", "c", "Landroidx/compose/runtime/MutableFloatState;", "getTargetContentZIndex", "()F", "setTargetContentZIndex", "(F)V", "targetContentZIndex", "Landroidx/compose/animation/SizeTransform;", "d", "Landroidx/compose/animation/SizeTransform;", "getSizeTransform", "()Landroidx/compose/animation/SizeTransform;", "setSizeTransform$animation_release", "(Landroidx/compose/animation/SizeTransform;)V", "sizeTransform", "<init>", "(Landroidx/compose/animation/EnterTransition;Landroidx/compose/animation/ExitTransition;FLandroidx/compose/animation/SizeTransform;)V", "animation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAnimatedContent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,862:1\n75#2:863\n108#2,2:864\n*S KotlinDebug\n*F\n+ 1 AnimatedContent.kt\nandroidx/compose/animation/ContentTransform\n*L\n200#1:863\n200#1:864,2\n*E\n"})
public final class ContentTransform {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EnterTransition targetContentEnter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ExitTransition initialContentExit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableFloatState targetContentZIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public SizeTransform sizeTransform;

    public ContentTransform(@NotNull EnterTransition targetContentEnter, @NotNull ExitTransition initialContentExit, float f6, @Nullable SizeTransform sizeTransform) {
        Intrinsics.checkNotNullParameter(targetContentEnter, "targetContentEnter");
        Intrinsics.checkNotNullParameter(initialContentExit, "initialContentExit");
        this.targetContentEnter = targetContentEnter;
        this.initialContentExit = initialContentExit;
        this.targetContentZIndex = PrimitiveSnapshotStateKt.mutableFloatStateOf(f6);
        this.sizeTransform = sizeTransform;
    }

    @NotNull
    public final ExitTransition getInitialContentExit() {
        return this.initialContentExit;
    }

    @Nullable
    public final SizeTransform getSizeTransform() {
        return this.sizeTransform;
    }

    @NotNull
    public final EnterTransition getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float getTargetContentZIndex() {
        return this.targetContentZIndex.getFloatValue();
    }

    public final void setSizeTransform$animation_release(@Nullable SizeTransform sizeTransform) {
        this.sizeTransform = sizeTransform;
    }

    public final void setTargetContentZIndex(float f6) {
        this.targetContentZIndex.setFloatValue(f6);
    }

    public /* synthetic */ ContentTransform(EnterTransition enterTransition, ExitTransition exitTransition, float f6, SizeTransform sizeTransform, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(enterTransition, exitTransition, (i10 & 4) != 0 ? 0.0f : f6, (i10 & 8) != 0 ? AnimatedContentKt.SizeTransform$default(false, null, 3, null) : sizeTransform);
    }
}
