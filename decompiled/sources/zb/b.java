package zb;

import com.bbva.showinfo.nativemodal.modal.NativeListModalState;
import com.bbva.showinfo.nativemodal.view.NativeListModalView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NativeListModalView.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.showinfo.nativemodal.view.NativeListModalView$observeState$1", f = "NativeListModalView.kt", i = {}, l = {84}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f95018p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ NativeListModalView f95019q0;

    /* JADX INFO: compiled from: NativeListModalView.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ NativeListModalView f95020p0;

        public a(NativeListModalView nativeListModalView) {
            this.f95020p0 = nativeListModalView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            NativeListModalView.access$updateView(this.f95020p0, (NativeListModalState) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(NativeListModalView nativeListModalView, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f95019q0 = nativeListModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f95019q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f95018p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            NativeListModalView nativeListModalView = this.f95019q0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(nativeListModalView.getViewModel().getOnModel());
            a aVar = new a(nativeListModalView);
            this.f95018p0 = 1;
            if (flowDistinctUntilChanged.collect(aVar, this) == coroutine_suspended) {
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
