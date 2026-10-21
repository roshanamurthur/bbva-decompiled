package m0;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.Recomposer;
import com.google.zxing.pdf417.PDF417Common;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.runtime.Recomposer", f = "Recomposer.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {921, PDF417Common.MAX_CODEWORDS_IN_BARCODE}, m = "runFrameLoop", n = {"this", "parentFrameClock", "frameSignal", "toRecompose", "toApply", "this", "parentFrameClock", "frameSignal", "toRecompose", "toApply"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4"})
public final class b0 extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Recomposer f83231p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public MonotonicFrameClock f83232q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public x f83233r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public List f83234s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public List f83235t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public /* synthetic */ Object f83236u0;
    public final /* synthetic */ Recomposer v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f83237w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Recomposer recomposer, Continuation<? super b0> continuation) {
        super(continuation);
        this.v0 = recomposer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f83236u0 = obj;
        this.f83237w0 |= Integer.MIN_VALUE;
        return Recomposer.access$runFrameLoop(this.v0, null, null, this);
    }
}
