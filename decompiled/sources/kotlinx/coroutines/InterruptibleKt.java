package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Interruptible.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a+\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function0;", "block", "runInterruptible", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coroutineContext", "runInterruptibleInExpectedContext", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0})
public final class InterruptibleKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.InterruptibleKt$runInterruptible$2, reason: invalid class name */
    /* JADX INFO: compiled from: Interruptible.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    @DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2<T> extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super T>, Object> {
        final /* synthetic */ Function0<T> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Function0<? extends T> function0, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$block, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InterruptibleKt.runInterruptibleInExpectedContext(((CoroutineScope) this.L$0).getCoroutineContext(), this.$block);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super T> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Nullable
    public static final <T> Object runInterruptible(@NotNull CoroutineContext coroutineContext, @NotNull Function0<? extends T> function0, @NotNull Continuation<? super T> continuation) {
        return BuildersKt.withContext(coroutineContext, new AnonymousClass2(function0, null), continuation);
    }

    public static /* synthetic */ Object runInterruptible$default(CoroutineContext coroutineContext, Function0 function0, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return runInterruptible(coroutineContext, function0, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> T runInterruptibleInExpectedContext(CoroutineContext coroutineContext, Function0<? extends T> function0) throws Throwable {
        try {
            ThreadState threadState = new ThreadState(JobKt.getJob(coroutineContext));
            threadState.setup();
            try {
                return function0.invoke();
            } finally {
                threadState.clearInterrupt();
            }
        } catch (InterruptedException e5) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e5);
        }
    }
}
