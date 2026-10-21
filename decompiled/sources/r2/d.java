package r2;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.CompletableDeferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "androidx.datastore.core.SingleProcessDataStore", f = "SingleProcessDataStore.kt", i = {1, 1}, l = {276, 281, 284}, m = "handleUpdate", n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, s = {"L$0", "L$1"})
public final class d extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Object f92907p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public SingleProcessDataStore f92908q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public CompletableDeferred f92909r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public /* synthetic */ Object f92910s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ SingleProcessDataStore<Object> f92911t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f92912u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(SingleProcessDataStore<Object> singleProcessDataStore, Continuation<? super d> continuation) {
        super(continuation);
        this.f92911t0 = singleProcessDataStore;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f92910s0 = obj;
        this.f92912u0 |= Integer.MIN_VALUE;
        return SingleProcessDataStore.access$handleUpdate(this.f92911t0, null, this);
    }
}
