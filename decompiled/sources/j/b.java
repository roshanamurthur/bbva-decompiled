package j;

import androidx.activity.BackEventCompat;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PredictiveBackHandler.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Channel<BackEventCompat> f78717b = ChannelKt.Channel$default(-2, BufferOverflow.SUSPEND, null, 4, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Job f78718c;

    /* JADX INFO: compiled from: PredictiveBackHandler.kt */
    @DebugMetadata(c = "androidx.activity.compose.OnBackInstance$job$1", f = "PredictiveBackHandler.kt", i = {0}, l = {154}, m = "invokeSuspend", n = {"completed"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.BooleanRef f78719p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f78720q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Flow<BackEventCompat>, Continuation<? super Unit>, Object> f78721r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ b f78722s0;

        /* JADX INFO: renamed from: j.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PredictiveBackHandler.kt */
        @DebugMetadata(c = "androidx.activity.compose.OnBackInstance$job$1$1", f = "PredictiveBackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0429a extends SuspendLambda implements Function3<FlowCollector<? super BackEventCompat>, Throwable, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Ref.BooleanRef f78723p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0429a(Ref.BooleanRef booleanRef, Continuation<? super C0429a> continuation) {
                super(3, continuation);
                this.f78723p0 = booleanRef;
            }

            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(FlowCollector<? super BackEventCompat> flowCollector, Throwable th2, Continuation<? super Unit> continuation) {
                return new C0429a(this.f78723p0, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                this.f78723p0.element = true;
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function2<? super Flow<BackEventCompat>, ? super Continuation<? super Unit>, ? extends Object> function2, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f78721r0 = function2;
            this.f78722s0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f78721r0, this.f78722s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Ref.BooleanRef booleanRef;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f78720q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                Flow<BackEventCompat> flowOnCompletion = FlowKt.onCompletion(FlowKt.consumeAsFlow(this.f78722s0.f78717b), new C0429a(booleanRef2, null));
                this.f78719p0 = booleanRef2;
                this.f78720q0 = 1;
                if (this.f78721r0.invoke(flowOnCompletion, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                booleanRef = booleanRef2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                booleanRef = this.f78719p0;
                ResultKt.throwOnFailure(obj);
            }
            if (booleanRef.element) {
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("You must collect the progress flow".toString());
        }
    }

    public b(@NotNull CoroutineScope coroutineScope, boolean z10, @NotNull Function2<? super Flow<BackEventCompat>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f78716a = z10;
        this.f78718c = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new a(function2, this, null), 3, null);
    }

    public final void a() {
        this.f78717b.cancel(new CancellationException("onBack cancelled"));
        Job.DefaultImpls.cancel$default(this.f78718c, (CancellationException) null, 1, (Object) null);
    }
}
