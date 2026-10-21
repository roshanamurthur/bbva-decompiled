package androidx.compose.material;

import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\b\u001a\u0004\u0018\u00010\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0014\u001a\u00020\u000f8\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/material/SwipeableDefaults;", "", "", "", "anchors", "factorAtMin", "factorAtMax", "Landroidx/compose/material/ResistanceConfig;", "resistanceConfig", "Landroidx/compose/animation/core/SpringSpec;", "a", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec", "()Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getVelocityThreshold-D9Ej5fM", "()F", "VelocityThreshold", "StiffResistanceFactor", "StandardResistanceFactor", "<init>", "()V", "material_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,890:1\n154#2:891\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material/SwipeableDefaults\n*L\n812#1:891\n*E\n"})
public final class SwipeableDefaults {
    public static final int $stable = 0;
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;

    @NotNull
    public static final SwipeableDefaults INSTANCE = new SwipeableDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float VelocityThreshold = Dp.m4389constructorimpl(125);

    public static /* synthetic */ ResistanceConfig resistanceConfig$default(SwipeableDefaults swipeableDefaults, Set set, float f6, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f6 = 10.0f;
        }
        if ((i10 & 4) != 0) {
            f10 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig(set, f6, f10);
    }

    @NotNull
    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM, reason: not valid java name */
    public final float m840getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    @Nullable
    public final ResistanceConfig resistanceConfig(@NotNull Set<Float> anchors, float factorAtMin, float factorAtMax) {
        Intrinsics.checkNotNullParameter(anchors, "anchors");
        if (anchors.size() <= 1) {
            return null;
        }
        Set<Float> set = anchors;
        Float fM5653maxOrNull = CollectionsKt___CollectionsKt.m5653maxOrNull((Iterable<Float>) set);
        Intrinsics.checkNotNull(fM5653maxOrNull);
        float fFloatValue = fM5653maxOrNull.floatValue();
        Float fM5661minOrNull = CollectionsKt___CollectionsKt.m5661minOrNull((Iterable<Float>) set);
        Intrinsics.checkNotNull(fM5661minOrNull);
        return new ResistanceConfig(fFloatValue - fM5661minOrNull.floatValue(), factorAtMin, factorAtMax);
    }
}
