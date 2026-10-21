package com.mastercard.sonic.network;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NetworkManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@DebugMetadata(c = "com.mastercard.sonic.network.NetworkManager$performAsyncRequest$1", f = "NetworkManager.kt", i = {}, l = {44, 48}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f51525p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f51526q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f51527r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ String f51528s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ NetworkManager.RequestCallback f51529t0;

    /* JADX INFO: renamed from: com.mastercard.sonic.network.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NetworkManager.kt */
    @DebugMetadata(c = "com.mastercard.sonic.network.NetworkManager$performAsyncRequest$1$1", f = "NetworkManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C0231a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NetworkManager.RequestCallback f51530p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f51531q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0231a(NetworkManager.RequestCallback requestCallback, String str, Continuation<? super C0231a> continuation) {
            super(2, continuation);
            this.f51530p0 = requestCallback;
            this.f51531q0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new C0231a(this.f51530p0, this.f51531q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C0231a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f51530p0.onSuccess(this.f51531q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: NetworkManager.kt */
    @DebugMetadata(c = "com.mastercard.sonic.network.NetworkManager$performAsyncRequest$1$2", f = "NetworkManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NetworkManager.RequestCallback f51532p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Exception f51533q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NetworkManager.RequestCallback requestCallback, Exception exc, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f51532p0 = requestCallback;
            this.f51533q0 = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f51532p0, this.f51533q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            this.f51532p0.onError("Error: " + this.f51533q0.getMessage());
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, String str2, String str3, NetworkManager.RequestCallback requestCallback, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f51526q0 = str;
        this.f51527r0 = str2;
        this.f51528s0 = str3;
        this.f51529t0 = requestCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f51526q0, this.f51527r0, this.f51528s0, this.f51529t0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f51525p0;
        NetworkManager.RequestCallback requestCallback = this.f51529t0;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            String strAccess$executeRequest = NetworkManager.access$executeRequest(NetworkManager.INSTANCE, this.f51526q0, this.f51527r0, this.f51528s0);
            MainCoroutineDispatcher main = Dispatchers.getMain();
            C0231a c0231a = new C0231a(requestCallback, strAccess$executeRequest, null);
            this.f51525p0 = 1;
            if (BuildersKt.withContext(main, c0231a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } catch (Exception e5) {
            MainCoroutineDispatcher main2 = Dispatchers.getMain();
            b bVar = new b(requestCallback, e5, null);
            this.f51525p0 = 2;
            if (BuildersKt.withContext(main2, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
