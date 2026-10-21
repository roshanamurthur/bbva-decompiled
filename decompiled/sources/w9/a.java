package w9;

import com.bbva.glomo.securesharing.SecureSharingConstantsKt;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomohybrid.observers.SessionStorageTokenObserver;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionStorageTokenObserver.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.observers.SessionStorageTokenObserver$putValue$2", f = "SessionStorageTokenObserver.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SessionStorageTokenObserver f94189p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f94190q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SessionStorageTokenObserver sessionStorageTokenObserver, String str, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f94189p0 = sessionStorageTokenObserver;
        this.f94190q0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f94189p0, this.f94190q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        this.f94189p0.f33812a.put(SecureSharingConstantsKt.KEY_CUSTOMER_BIOCATCH, this.f94190q0, true, TargetStorage.Shared);
        return Unit.INSTANCE;
    }
}
