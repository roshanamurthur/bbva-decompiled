package androidx.compose.ui.platform;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.ui.MotionDurationScale;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WindowRecomposer.android.kt */
/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nWindowRecomposer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,442:1\n75#2:443\n108#2,2:444\n*S KotlinDebug\n*F\n+ 1 WindowRecomposer.android.kt\nandroidx/compose/ui/platform/MotionDurationScaleImpl\n*L\n440#1:443\n440#1:444,2\n*E\n"})
public final class q0 implements MotionDurationScale {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final MutableFloatState f17435p0 = PrimitiveSnapshotStateKt.mutableFloatStateOf(1.0f);

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r3, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) MotionDurationScale.DefaultImpls.fold(this, r3, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.Key<E> key) {
        return (E) MotionDurationScale.DefaultImpls.get(this, key);
    }

    @Override // androidx.compose.ui.MotionDurationScale, kotlin.coroutines.CoroutineContext.Element
    public final /* synthetic */ CoroutineContext.Key getKey() {
        return u0.h.a(this);
    }

    @Override // androidx.compose.ui.MotionDurationScale
    public final float getScaleFactor() {
        return this.f17435p0.getFloatValue();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.Key<?> key) {
        return MotionDurationScale.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return MotionDurationScale.DefaultImpls.plus(this, coroutineContext);
    }
}
