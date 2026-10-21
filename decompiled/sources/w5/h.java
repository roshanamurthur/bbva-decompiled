package w5;

import com.bbva.component.ui.modal.halfmodal.HalfModalContract;
import com.bbva.component.ui.modal.halfmodal.views.GenderHalfModalView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GenderHalfModalView.kt */
/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.bbva.component.ui.modal.halfmodal.views.GenderHalfModalView$observeEvents$1$1", f = "GenderHalfModalView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ GenderHalfModalView f94170p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(GenderHalfModalView genderHalfModalView, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f94170p0 = genderHalfModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new h(this.f94170p0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        GenderHalfModalView genderHalfModalView = this.f94170p0;
        genderHalfModalView.getViewModel().buttonTapped(HalfModalContract.ButtonType.CLOSE);
        genderHalfModalView.dismiss();
        return Unit.INSTANCE;
    }
}
