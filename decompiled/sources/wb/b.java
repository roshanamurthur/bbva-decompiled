package wb;

import android.view.ViewGroup;
import com.bbva.showinfo.nativemodal.modal.Item;
import com.bbva.showinfo.nativemodal.view.NativeListModalView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: NativeListModalGenerator.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.showinfo.generator.NativeListModalGenerator$observeEvents$1", f = "NativeListModalGenerator.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f94194p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ NativeListModalView f94195q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function1<Item, Unit> f94196r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f94197s0;

    /* JADX INFO: compiled from: NativeListModalGenerator.kt */
    @SourceDebugExtension({"SMAP\nNativeListModalGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeListModalGenerator.kt\ncom/bbva/showinfo/generator/NativeListModalGenerator$observeEvents$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,40:1\n1#2:41\n*E\n"})
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Item, Unit> f94198p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f94199q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ NativeListModalView f94200r0;

        public a(ViewGroup viewGroup, NativeListModalView nativeListModalView, Function1 function1) {
            this.f94198p0 = function1;
            this.f94199q0 = viewGroup;
            this.f94200r0 = nativeListModalView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Item item = (Item) obj;
            Function1<Item, Unit> function1 = this.f94198p0;
            if (function1 != null) {
                function1.invoke(item);
            }
            this.f94199q0.removeView(this.f94200r0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(NativeListModalView nativeListModalView, Function1<? super Item, Unit> function1, ViewGroup viewGroup, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f94195q0 = nativeListModalView;
        this.f94196r0 = function1;
        this.f94197s0 = viewGroup;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new b(this.f94195q0, this.f94196r0, this.f94197s0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f94194p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            NativeListModalView nativeListModalView = this.f94195q0;
            Flow<Item> onTapEvents = nativeListModalView.getViewModel().getOnTapEvents();
            a aVar = new a(this.f94197s0, nativeListModalView, this.f94196r0);
            this.f94194p0 = 1;
            if (onTapEvents.collect(aVar, this) == coroutine_suspended) {
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
