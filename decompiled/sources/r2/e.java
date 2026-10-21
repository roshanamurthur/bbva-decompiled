package r2;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {0, 0, 0}, l = {402, 410}, m = "transformAndWrite", n = {"this", "curDataAndHash", "curData"}, s = {"L$0", "L$1", "L$2"})
public final class e extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public SingleProcessDataStore f92913p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Object f92914q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Object f92915r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public /* synthetic */ Object f92916s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<Object> f92917t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f92918u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SingleProcessDataStore<Object> singleProcessDataStore, Continuation<? super e> continuation) {
        super(continuation);
        this.f92917t0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f92916s0 = obj;
        this.f92918u0 |= Integer.MIN_VALUE;
        return this.f92917t0.g(null, null, this);
    }
}
