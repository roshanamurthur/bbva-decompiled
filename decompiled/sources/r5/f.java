package r5;

import com.bbva.cells.componentkit.dsl.ViewKt;
import com.bbva.component.ui.login.remembereduser.RememberedUserView;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RememberedUserView.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.ui.login.remembereduser.RememberedUserView$observeState$2", f = "RememberedUserView.kt", i = {}, l = {135}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f92932p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RememberedUserView f92933q0;

    /* JADX INFO: compiled from: RememberedUserView.kt */
    public static final class a<T> implements FlowCollector {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RememberedUserView f92934p0;

        public a(RememberedUserView rememberedUserView) {
            this.f92934p0 = rememberedUserView;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            RememberedUserView rememberedUserView = this.f92934p0;
            if (zBooleanValue) {
                rememberedUserView.getViewModel().onButtonLoginEnabled();
            }
            ViewKt.enable(rememberedUserView.getPrimaryButton(), Boxing.boxBoolean(zBooleanValue));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(RememberedUserView rememberedUserView, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f92933q0 = rememberedUserView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f(this.f92933q0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f92932p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            RememberedUserView rememberedUserView = this.f92933q0;
            StateFlow<Boolean> stateFlowIsFormValid = rememberedUserView.getViewModel().isFormValid();
            a aVar = new a(rememberedUserView);
            this.f92932p0 = 1;
            if (stateFlowIsFormValid.collect(aVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        throw new KotlinNothingValueException();
    }
}
