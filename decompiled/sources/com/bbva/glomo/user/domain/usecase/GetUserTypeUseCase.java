package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.domain.model.UserType;
import com.bbva.glomo.user.repository.datasource.UserTypeDataSource;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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

/* JADX INFO: compiled from: GetUserTypeUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/GetUserTypeUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "Lcom/bbva/glomo/user/domain/model/UserType;", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;", "dataSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class GetUserTypeUseCase implements SuspendUseCase<UserType> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UserTypeDataSource f30816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f30817b;

    /* JADX INFO: compiled from: GetUserTypeUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.domain.usecase.GetUserTypeUseCase$execute$2", f = "GetUserTypeUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UserType>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return GetUserTypeUseCase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UserType> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return GetUserTypeUseCase.this.f30816a.getUserType();
        }
    }

    public GetUserTypeUseCase(@NotNull UserTypeDataSource dataSource, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f30816a = dataSource;
        this.f30817b = dispatcher;
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Continuation<? super UserType> continuation) {
        return BuildersKt.withContext(this.f30817b, new a(null), continuation);
    }

    public /* synthetic */ GetUserTypeUseCase(UserTypeDataSource userTypeDataSource, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(userTypeDataSource, (i10 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
