package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
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

/* JADX INFO: compiled from: ShowUserTypeSelectorUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/ShowUserTypeSelectorUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;", "userTypeDataSource", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "threadDispatchers", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/UserTypeDataSource;Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class ShowUserTypeSelectorUseCase implements SuspendUseCase<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final UserTypeDataSource f30848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f30849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f30850c;

    /* JADX INFO: compiled from: ShowUserTypeSelectorUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.domain.usecase.ShowUserTypeSelectorUseCase$execute$2", f = "ShowUserTypeSelectorUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return ShowUserTypeSelectorUseCase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z10;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            ShowUserTypeSelectorUseCase showUserTypeSelectorUseCase = ShowUserTypeSelectorUseCase.this;
            RememberedUser rememberedUser = showUserTypeSelectorUseCase.f30849b.get();
            if (showUserTypeSelectorUseCase.f30848a.isSelectorActive() && rememberedUser != null) {
                z10 = rememberedUser.isBusinessUser();
            }
            return Boxing.boxBoolean(z10);
        }
    }

    public ShowUserTypeSelectorUseCase(@NotNull UserTypeDataSource userTypeDataSource, @NotNull RememberedUserDataSource rememberedUserDataSource, @NotNull ThreadDispatchers threadDispatchers) {
        Intrinsics.checkNotNullParameter(userTypeDataSource, "userTypeDataSource");
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        Intrinsics.checkNotNullParameter(threadDispatchers, "threadDispatchers");
        this.f30848a = userTypeDataSource;
        this.f30849b = rememberedUserDataSource;
        this.f30850c = threadDispatchers;
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.f30850c.io(), new a(null), continuation);
    }

    public /* synthetic */ ShowUserTypeSelectorUseCase(UserTypeDataSource userTypeDataSource, RememberedUserDataSource rememberedUserDataSource, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(userTypeDataSource, rememberedUserDataSource, (i10 & 4) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
