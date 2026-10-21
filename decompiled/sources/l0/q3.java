package l0;

import androidx.compose.material3.SliderKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.material3.SliderKt", f = "Slider.kt", i = {0}, l = {1095}, m = "awaitSlop-8vUncbI", n = {"initialDelta"}, s = {"L$0"})
public final class q3 extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Ref.FloatRef f82822p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f82823q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f82824r0;

    public q3() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f82823q0 = obj;
        this.f82824r0 |= Integer.MIN_VALUE;
        return SliderKt.m1245access$awaitSlop8vUncbI(null, 0L, 0, this);
    }
}
