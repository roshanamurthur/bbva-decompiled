package w5;

import com.bbva.component.ui.modal.halfmodal.model.HalfModalState;
import com.bbva.component.ui.modal.halfmodal.views.GenderHalfModalView;
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

/* JADX INFO: compiled from: GenderHalfModalView.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.ui.modal.halfmodal.views.GenderHalfModalView$observeState$1", f = "GenderHalfModalView.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
public final class j extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f94172p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ GenderHalfModalView f94173q0;

    /* JADX INFO: compiled from: GenderHalfModalView.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ GenderHalfModalView f94174p0;

        public a(GenderHalfModalView genderHalfModalView) {
            this.f94174p0 = genderHalfModalView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            GenderHalfModalView.access$updateView(this.f94174p0, (HalfModalState) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(GenderHalfModalView genderHalfModalView, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f94173q0 = genderHalfModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new j(this.f94173q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f94172p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            GenderHalfModalView genderHalfModalView = this.f94173q0;
            Flow flowDistinctUntilChanged = FlowKt.distinctUntilChanged(genderHalfModalView.getViewModel().getOnModel());
            a aVar = new a(genderHalfModalView);
            this.f94172p0 = 1;
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
