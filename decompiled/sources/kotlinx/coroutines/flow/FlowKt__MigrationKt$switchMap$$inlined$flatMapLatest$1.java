package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import com.esotericsoftware.asm.Opcodes;
import ek.a;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Add missing generic type declarations: [R, T] */
/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "R", "Lkotlinx/coroutines/flow/FlowCollector;", "it", "", "kotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1", "<anonymous>"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1", f = "Migration.kt", i = {}, l = {Opcodes.INSTANCEOF, Opcodes.INSTANCEOF}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n*L\n1#1,218:1\n*E\n"})
public final class FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1<R, T> extends SuspendLambda implements Function3<FlowCollector<? super R>, T, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(Function2 function2, Continuation continuation) {
        super(3, continuation);
        this.$transform = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        FlowCollector flowCollector;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                flowCollector = (FlowCollector) this.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        flowCollector = (FlowCollector) this.L$0;
        Object obj2 = this.L$1;
        Function2 function2 = this.$transform;
        this.L$0 = flowCollector;
        this.label = 1;
        obj = function2.invoke(obj2, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        this.L$0 = null;
        this.label = 2;
        if (FlowKt.emitAll(flowCollector, (Flow) obj, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public final Object invoke(@NotNull FlowCollector<? super R> flowCollector, T t10, @Nullable Continuation<? super Unit> continuation) {
        FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1 = new FlowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1(this.$transform, continuation);
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$0 = flowCollector;
        flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.L$1 = t10;
        return flowKt__MigrationKt$switchMap$$inlined$flatMapLatest$1.invokeSuspend(Unit.INSTANCE);
    }
}
