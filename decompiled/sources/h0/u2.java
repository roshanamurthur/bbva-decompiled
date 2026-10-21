package h0;

import androidx.compose.material.SliderKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material.SliderKt", f = "Slider.kt", i = {0}, l = {812}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
public final class u2 extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Ref.FloatRef f69128p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f69129q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f69130r0;

    public u2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f69129q0 = obj;
        this.f69130r0 |= Integer.MIN_VALUE;
        return SliderKt.m816access$awaitSlop8vUncbI(null, 0L, 0, this);
    }
}
