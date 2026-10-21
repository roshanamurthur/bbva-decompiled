package e0;

import androidx.compose.ui.MotionDurationScale;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextFieldCursor.kt */
/* JADX INFO: loaded from: classes.dex */
public final class d implements MotionDurationScale {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final d f68222p0 = new d();

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
        return 1.0f;
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
