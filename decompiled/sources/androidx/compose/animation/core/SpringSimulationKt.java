package androidx.compose.animation.core;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: SpringSimulation.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\"\u001a\u0010\u0006\u001a\u00020\u00008\u0000X\u0080D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"", "value", "velocity", "Landroidx/compose/animation/core/Motion;", TypedValues.MotionType.NAME, "(FF)J", "UNSET", "F", "getUNSET", "()F", "animation-core_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSpringSimulation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,243:1\n25#2,3:244\n*S KotlinDebug\n*F\n+ 1 SpringSimulation.kt\nandroidx/compose/animation/core/SpringSimulationKt\n*L\n58#1:244,3\n*E\n"})
public final class SpringSimulationKt {
    public static final long Motion(float f6, float f10) {
        return Motion.m83constructorimpl((((long) Float.floatToIntBits(f10)) & 4294967295L) | (Float.floatToIntBits(f6) << 32));
    }

    public static final float getUNSET() {
        return Float.MAX_VALUE;
    }
}
