package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.repository.datasource.PnnUserDataSource;
import com.bbva.glomo.user.repository.datasource.UserTypeDataSource;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: IsSelectorActiveUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/IsSelectorActiveUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;", "userTypeDataSource", "Lcom/bbva/glomo/user/repository/datasource/PnnUserDataSource;", "pnnUserDataSource", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "threadDispatchers", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;Lcom/bbva/glomo/user/repository/datasource/PnnUserDataSource;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class IsSelectorActiveUseCase implements SuspendUseCase<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UserTypeDataSource f30823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final PnnUserDataSource f30824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f30825c;

    /* JADX INFO: compiled from: IsSelectorActiveUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.domain.usecase.IsSelectorActiveUseCase$execute$2", f = "IsSelectorActiveUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return IsSelectorActiveUseCase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            IsSelectorActiveUseCase isSelectorActiveUseCase = IsSelectorActiveUseCase.this;
            return Boxing.boxBoolean(isSelectorActiveUseCase.f30824b.isPnnCustomer() && isSelectorActiveUseCase.f30823a.isSelectorActive());
        }
    }

    public IsSelectorActiveUseCase(@NotNull UserTypeDataSource userTypeDataSource, @NotNull PnnUserDataSource pnnUserDataSource, @NotNull ThreadDispatchers threadDispatchers) {
        Intrinsics.checkNotNullParameter(userTypeDataSource, "userTypeDataSource");
        Intrinsics.checkNotNullParameter(pnnUserDataSource, "pnnUserDataSource");
        Intrinsics.checkNotNullParameter(threadDispatchers, "threadDispatchers");
        this.f30823a = userTypeDataSource;
        this.f30824b = pnnUserDataSource;
        this.f30825c = threadDispatchers;
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.f30825c.io(), new a(null), continuation);
    }

    public /* synthetic */ IsSelectorActiveUseCase(UserTypeDataSource userTypeDataSource, PnnUserDataSource pnnUserDataSource, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(userTypeDataSource, pnnUserDataSource, (i10 & 4) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
