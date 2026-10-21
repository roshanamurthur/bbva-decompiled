package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
import com.bbva.glomoutils.usecase.SuspendUseCaseWithParams;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: StoreRememberedUserUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/SuspendStoreRememberedUserUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCaseWithParams;", "Lcom/bbva/glomo/user/domain/usecase/RememberedUserParams;", "", "params", "execute", "(Lcom/bbva/glomo/user/domain/usecase/RememberedUserParams;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class SuspendStoreRememberedUserUseCase implements SuspendUseCaseWithParams<RememberedUserParams, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f30869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f30870b;

    /* JADX INFO: compiled from: StoreRememberedUserUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.domain.usecase.SuspendStoreRememberedUserUseCase", f = "StoreRememberedUserUseCase.kt", i = {}, l = {27}, m = "execute", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f30871p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f30873r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30871p0 = obj;
            this.f30873r0 |= Integer.MIN_VALUE;
            return SuspendStoreRememberedUserUseCase.this.execute((RememberedUserParams) null, (Continuation<? super Unit>) this);
        }
    }

    /* JADX INFO: compiled from: StoreRememberedUserUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.domain.usecase.SuspendStoreRememberedUserUseCase$execute$2", f = "StoreRememberedUserUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ RememberedUserParams f30875q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RememberedUserParams rememberedUserParams, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f30875q0 = rememberedUserParams;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SuspendStoreRememberedUserUseCase.this.new b(this.f30875q0, continuation);
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
            RememberedUserDataSource rememberedUserDataSource = SuspendStoreRememberedUserUseCase.this.f30869a;
            RememberedUserParams rememberedUserParams = this.f30875q0;
            rememberedUserDataSource.storeRememberedUser(rememberedUserParams.getAndroidx.autofill.HintConstants.AUTOFILL_HINT_USERNAME java.lang.String(), rememberedUserParams.getDocument(), rememberedUserParams.getCom.bbva.glomo.localstorage.LocalStorageConstantsKt.IS_BUSINESS_USER_KEY java.lang.String());
            return Unit.INSTANCE;
        }
    }

    public SuspendStoreRememberedUserUseCase(@NotNull RememberedUserDataSource rememberedUserDataSource, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f30869a = rememberedUserDataSource;
        this.f30870b = dispatcher;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCaseWithParams
    @Nullable
    public Object execute(@NotNull RememberedUserParams rememberedUserParams, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30873r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30873r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f30871p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30873r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            b bVar = new b(rememberedUserParams, null);
            aVar.f30873r0 = 1;
            if (BuildersKt.withContext(this.f30870b, bVar, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SuspendStoreRememberedUserUseCase(RememberedUserDataSource rememberedUserDataSource, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rememberedUserDataSource, (i10 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
