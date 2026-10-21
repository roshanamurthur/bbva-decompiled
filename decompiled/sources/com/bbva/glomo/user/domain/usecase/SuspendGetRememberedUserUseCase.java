package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.domain.model.RememberedUser;
import com.bbva.glomo.user.repository.datasource.RememberedUserDataSource;
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

/* JADX INFO: compiled from: GetRememberedUserUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/SuspendGetRememberedUserUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "Lcom/bbva/glomo/user/domain/model/RememberedUser;", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;", "rememberedUserDataSource", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/bbva/glomo/user/repository/datasource/RememberedUserDataSource;Lkotlinx/coroutines/CoroutineDispatcher;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class SuspendGetRememberedUserUseCase implements SuspendUseCase<RememberedUser> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final RememberedUserDataSource f30866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineDispatcher f30867b;

    /* JADX INFO: compiled from: GetRememberedUserUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.domain.usecase.SuspendGetRememberedUserUseCase$execute$2", f = "GetRememberedUserUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super RememberedUser>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SuspendGetRememberedUserUseCase.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super RememberedUser> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return SuspendGetRememberedUserUseCase.this.f30866a.get();
        }
    }

    public SuspendGetRememberedUserUseCase(@NotNull RememberedUserDataSource rememberedUserDataSource, @NotNull CoroutineDispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(rememberedUserDataSource, "rememberedUserDataSource");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f30866a = rememberedUserDataSource;
        this.f30867b = dispatcher;
    }

    @Override // com.bbva.glomoutils.usecase.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Continuation<? super RememberedUser> continuation) {
        return BuildersKt.withContext(this.f30867b, new a(null), continuation);
    }

    public /* synthetic */ SuspendGetRememberedUserUseCase(RememberedUserDataSource rememberedUserDataSource, CoroutineDispatcher coroutineDispatcher, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(rememberedUserDataSource, (i10 & 2) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
