package j9;

import com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
/* JADX INFO: loaded from: classes6.dex */
@DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$unrollNotifications$2", f = "RemoveUserDataUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f78816p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RemoveUserDataUseCase f78817q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f78818r0;

    /* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$unrollNotifications$2$1", f = "RemoveUserDataUseCase.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f78819p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RemoveUserDataUseCase f78820q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f78821r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(RemoveUserDataUseCase removeUserDataUseCase, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f78820q0 = removeUserDataUseCase;
            this.f78821r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f78820q0, this.f78821r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f78819p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f78819p0 = 1;
                if (RemoveUserDataUseCase.access$unrollNonCommercialNotification(this.f78820q0, this.f78821r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$unrollNotifications$2$2", f = "RemoveUserDataUseCase.kt", i = {}, l = {70}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f78822p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RemoveUserDataUseCase f78823q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RemoveUserDataUseCase removeUserDataUseCase, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f78823q0 = removeUserDataUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f78823q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f78822p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f78822p0 = 1;
                if (RemoveUserDataUseCase.access$unrollCommercialNotification(this.f78823q0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: RemoveUserDataUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.landing.domain.usecase.RemoveUserDataUseCase$unrollNotifications$2$3", f = "RemoveUserDataUseCase.kt", i = {}, l = {71}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f78824p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RemoveUserDataUseCase f78825q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RemoveUserDataUseCase removeUserDataUseCase, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f78825q0 = removeUserDataUseCase;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f78825q0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f78824p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f78824p0 = 1;
                if (RemoveUserDataUseCase.access$unrollManualFirebaseNotification(this.f78825q0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(RemoveUserDataUseCase removeUserDataUseCase, String str, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f78817q0 = removeUserDataUseCase;
        this.f78818r0 = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        d dVar = new d(this.f78817q0, this.f78818r0, continuation);
        dVar.f78816p0 = obj;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Job> continuation) {
        return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        CoroutineScope coroutineScope = (CoroutineScope) this.f78816p0;
        RemoveUserDataUseCase removeUserDataUseCase = this.f78817q0;
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, removeUserDataUseCase.f32891b.io(), null, new a(removeUserDataUseCase, this.f78818r0, null), 2, null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, removeUserDataUseCase.f32891b.io(), null, new b(removeUserDataUseCase, null), 2, null);
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, removeUserDataUseCase.f32891b.io(), null, new c(removeUserDataUseCase, null), 2, null);
    }
}
