package androidx.compose.material3;

import androidx.compose.animation.core.SpringSpec;
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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ3\u0010\n\u001a\u0004\u0018\u00010\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\b\u0010\tR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR#\u0010\u0016\u001a\u00020\u00118\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001b"}, d2 = {"Landroidx/compose/material3/SwipeableDefaults;", "", "", "", "anchors", "factorAtMin", "factorAtMax", "Landroidx/compose/material3/ResistanceConfig;", "resistanceConfig$material3_release", "(Ljava/util/Set;FF)Landroidx/compose/material3/ResistanceConfig;", "resistanceConfig", "Landroidx/compose/animation/core/SpringSpec;", "a", "Landroidx/compose/animation/core/SpringSpec;", "getAnimationSpec$material3_release", "()Landroidx/compose/animation/core/SpringSpec;", "AnimationSpec", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getVelocityThreshold-D9Ej5fM$material3_release", "()F", "VelocityThreshold", "StiffResistanceFactor", "StandardResistanceFactor", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSwipeable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,886:1\n154#2:887\n*S KotlinDebug\n*F\n+ 1 Swipeable.kt\nandroidx/compose/material3/SwipeableDefaults\n*L\n808#1:887\n*E\n"})
public final class SwipeableDefaults {
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;

    @NotNull
    public static final SwipeableDefaults INSTANCE = new SwipeableDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float VelocityThreshold = Dp.m4389constructorimpl(125);

    public static /* synthetic */ ResistanceConfig resistanceConfig$material3_release$default(SwipeableDefaults swipeableDefaults, Set set, float f6, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f6 = 10.0f;
        }
        if ((i10 & 4) != 0) {
            f10 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig$material3_release(set, f6, f10);
    }

    @NotNull
    public final SpringSpec<Float> getAnimationSpec$material3_release() {
        return AnimationSpec;
    }

    /* JADX INFO: renamed from: getVelocityThreshold-D9Ej5fM$material3_release, reason: not valid java name */
    public final float m1335getVelocityThresholdD9Ej5fM$material3_release() {
        return VelocityThreshold;
    }

    @Nullable
    public final ResistanceConfig resistanceConfig$material3_release(@NotNull Set<Float> anchors, float factorAtMin, float factorAtMax) {
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
