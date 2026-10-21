package com.bbva.glomo.user.domain.usecase;

import com.bbva.glomo.user.domain.handler.MigratorHandler;
import com.bbva.glomoutils.scheduler.DefaultThreadDispatchers;
import com.bbva.glomoutils.scheduler.ThreadDispatchers;
import com.bbva.glomoutils.usecase.SuspendUseCase;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MigrateRememberedUserUseCase.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Lcom/bbva/glomo/user/domain/usecase/MigrateRememberedUserUseCase;", "Lcom/bbva/glomoutils/usecase/SuspendUseCase;", "", "execute", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/bbva/glomo/user/domain/handler/MigratorHandler;", "migrations", "Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;", "dispatchers", "<init>", "(Ljava/util/List;Lcom/bbva/glomoutils/scheduler/ThreadDispatchers;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class MigrateRememberedUserUseCase implements SuspendUseCase<Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<MigratorHandler> f30830a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ThreadDispatchers f30831b;

    /* JADX INFO: compiled from: MigrateRememberedUserUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.domain.usecase.MigrateRememberedUserUseCase", f = "MigrateRememberedUserUseCase.kt", i = {}, l = {15}, m = "execute", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f30832p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f30834r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30832p0 = obj;
            this.f30834r0 |= Integer.MIN_VALUE;
            return MigrateRememberedUserUseCase.this.execute(this);
        }
    }

    /* JADX INFO: compiled from: MigrateRememberedUserUseCase.kt */
    @DebugMetadata(c = "com.bbva.glomo.user.domain.usecase.MigrateRememberedUserUseCase$execute$2", f = "MigrateRememberedUserUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nMigrateRememberedUserUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MigrateRememberedUserUseCase.kt\ncom/bbva/glomo/user/domain/usecase/MigrateRememberedUserUseCase$execute$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,22:1\n1855#2,2:23\n*S KotlinDebug\n*F\n+ 1 MigrateRememberedUserUseCase.kt\ncom/bbva/glomo/user/domain/usecase/MigrateRememberedUserUseCase$execute$2\n*L\n16#1:23,2\n*E\n"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MigrateRememberedUserUseCase.this.new b(continuation);
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
            Iterator it = MigrateRememberedUserUseCase.this.f30830a.iterator();
            while (it.hasNext()) {
                ((MigratorHandler) it.next()).execute();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MigrateRememberedUserUseCase(@NotNull List<? extends MigratorHandler> migrations, @NotNull ThreadDispatchers dispatchers) {
        Intrinsics.checkNotNullParameter(migrations, "migrations");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        this.f30830a = migrations;
        this.f30831b = dispatchers;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.glomoutils.usecase.SuspendUseCase
    @Nullable
    public Object execute(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30834r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30834r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f30832p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30834r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineDispatcher coroutineDispatcherIo = this.f30831b.io();
            b bVar = new b(null);
            aVar.f30834r0 = 1;
            if (BuildersKt.withContext(coroutineDispatcherIo, bVar, aVar) == coroutine_suspended) {
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

    public /* synthetic */ MigrateRememberedUserUseCase(List list, ThreadDispatchers threadDispatchers, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i10 & 2) != 0 ? new DefaultThreadDispatchers() : threadDispatchers);
    }
}
