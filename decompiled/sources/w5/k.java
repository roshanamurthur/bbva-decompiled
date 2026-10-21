package w5;

import com.bbva.component.ui.modal.halfmodal.PrimaryButtonState;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GenderHalfModalView.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.ui.modal.halfmodal.views.GenderHalfModalView$observeState$2", f = "GenderHalfModalView.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
public final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f94175p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ GenderHalfModalView f94176q0;

    /* JADX INFO: compiled from: GenderHalfModalView.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ GenderHalfModalView f94177p0;

        public a(GenderHalfModalView genderHalfModalView) {
            this.f94177p0 = genderHalfModalView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            GenderHalfModalView.access$enableButton(this.f94177p0, (PrimaryButtonState) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(GenderHalfModalView genderHalfModalView, Continuation<? super k> continuation) {
        super(2, continuation);
        this.f94176q0 = genderHalfModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new k(this.f94176q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f94175p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            GenderHalfModalView genderHalfModalView = this.f94176q0;
            Flow<PrimaryButtonState> buttonState$component_ui_modal_release = genderHalfModalView.getViewModel().getButtonState$component_ui_modal_release();
            a aVar = new a(genderHalfModalView);
            this.f94175p0 = 1;
            if (buttonState$component_ui_modal_release.collect(aVar, this) == coroutine_suspended) {
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
