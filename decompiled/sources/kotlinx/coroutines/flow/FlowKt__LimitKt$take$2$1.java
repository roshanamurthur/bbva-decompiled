package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Limit.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {
    final /* synthetic */ Ref.IntRef $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ FlowCollector<T> $this_unsafeFlow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1(Ref.IntRef intRef, int i10, FlowCollector<? super T> flowCollector) {
        this.$consumed = intRef;
        this.$count = i10;
        this.$this_unsafeFlow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    @Nullable
    public final Object emit(T t10, @NotNull Continuation<? super Unit> continuation) {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) continuation;
            int i10 = flowKt__LimitKt$take$2$1$emit$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.label = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
        }
        Object obj = flowKt__LimitKt$take$2$1$emit$1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = flowKt__LimitKt$take$2$1$emit$1.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Ref.IntRef intRef = this.$consumed;
        int i12 = intRef.element + 1;
        intRef.element = i12;
        if (i12 < this.$count) {
            FlowCollector<T> flowCollector = this.$this_unsafeFlow;
            flowKt__LimitKt$take$2$1$emit$1.label = 1;
            if (flowCollector.emit(t10, flowKt__LimitKt$take$2$1$emit$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        FlowCollector<T> flowCollector2 = this.$this_unsafeFlow;
        flowKt__LimitKt$take$2$1$emit$1.label = 2;
        if (FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(flowCollector2, t10, flowKt__LimitKt$take$2$1$emit$1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
