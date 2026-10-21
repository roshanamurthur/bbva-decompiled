package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CoreTextField.kt */
/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$focusModifier$1$1$1", f = "CoreTextField.kt", i = {}, l = {TypedValues.AttributesType.TYPE_PIVOT_TARGET}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f6131p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ BringIntoViewRequester f6132q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ TextFieldValue f6133r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ TextFieldState f6134s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ TextLayoutResultProxy f6135t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ OffsetMapping f6136u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BringIntoViewRequester bringIntoViewRequester, TextFieldValue textFieldValue, TextFieldState textFieldState, TextLayoutResultProxy textLayoutResultProxy, OffsetMapping offsetMapping, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f6132q0 = bringIntoViewRequester;
        this.f6133r0 = textFieldValue;
        this.f6134s0 = textFieldState;
        this.f6135t0 = textLayoutResultProxy;
        this.f6136u0 = offsetMapping;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new f(this.f6132q0, this.f6133r0, this.f6134s0, this.f6135t0, this.f6136u0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f6131p0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            BringIntoViewRequester bringIntoViewRequester = this.f6132q0;
            TextFieldValue textFieldValue = this.f6133r0;
            TextDelegate textDelegate = this.f6134s0.getTextDelegate();
            TextLayoutResult value = this.f6135t0.getValue();
            OffsetMapping offsetMapping = this.f6136u0;
            this.f6131p0 = 1;
            if (CoreTextFieldKt.bringSelectionEndIntoView(bringIntoViewRequester, textFieldValue, textDelegate, value, offsetMapping, this) == coroutine_suspended) {
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
