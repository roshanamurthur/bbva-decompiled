package nb;

import com.bbva.push.bus.PushBus;
import com.bbva.push.model.Push;
import com.bbva.push.source.PushSource;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PushManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.push.PushManager$configureExternalPushSources$1$1", f = "PushManager.kt", i = {}, l = {173}, m = "invokeSuspend", n = {}, s = {})
public final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f84486p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PushSource f84487q0;

    /* JADX INFO: renamed from: nb.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PushManager.kt */
    public static final class C0470a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final C0470a<T> f84488p0 = new C0470a<>();

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            PushBus.INSTANCE.onNewPush((Push) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PushSource pushSource, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f84487q0 = pushSource;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new a(this.f84487q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f84486p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Push> pushes = this.f84487q0.getPushes();
            FlowCollector<? super Push> flowCollector = C0470a.f84488p0;
            this.f84486p0 = 1;
            if (pushes.collect(flowCollector, this) == coroutine_suspended) {
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
