package com.bbva.cells.componentkit.usecase;

import androidx.core.app.NotificationCompat;
import com.bbva.cells.componentkit.dispatcher.IODispatcherKt;
import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UseCase.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0005¢\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u0000H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\t2\u0006\u0010\u0006\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/bbva/cells/componentkit/usecase/UseCase;", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "O", "", "()V", NotificationCompat.CATEGORY_CALL, "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", FetchCommand.ID, "Lcom/bbva/cells/componentkit/model/FetchResult;", "componentkit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class UseCase<I, O> {

    /* JADX INFO: compiled from: UseCase.kt */
    @DebugMetadata(c = "com.bbva.cells.componentkit.usecase.UseCase$fetch$2", f = "UseCase.kt", i = {}, l = {13}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super FetchResult<O>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f26777p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ UseCase<I, O> f26778q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ I f26779r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(UseCase<? super I, O> useCase, I i10, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f26778q0 = useCase;
            this.f26779r0 = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f26778q0, this.f26779r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Object obj) {
            return ((a) create(coroutineScope, (Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f26777p0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    UseCase<I, O> useCase = this.f26778q0;
                    I i11 = this.f26779r0;
                    this.f26777p0 = 1;
                    obj = useCase.call(i11, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return new FetchResult.Success(obj);
            } catch (Throwable th2) {
                return new FetchResult.Error(th2);
            }
        }
    }

    @Nullable
    public abstract Object call(I i10, @NotNull Continuation<? super O> continuation);

    @Nullable
    public final Object fetch(I i10, @NotNull Continuation<? super FetchResult<O>> continuation) {
        return BuildersKt.withContext(IODispatcherKt.getIoDispatcher(), new a(this, i10, null), continuation);
    }
}
