package mx.openpay.library.ui.signature;

import android.graphics.Bitmap;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes12.dex */
public final class c extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bitmap f84356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DigitalSignatureViewModel f84357b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Bitmap bitmap, DigitalSignatureViewModel digitalSignatureViewModel, Continuation continuation) {
        super(2, continuation);
        this.f84356a = bitmap;
        this.f84357b = digitalSignatureViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new c(this.f84356a, this.f84357b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.f84356a, this.f84357b, (Continuation) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DigitalSignatureViewModel digitalSignatureViewModel;
        String strAccess$encodeImage;
        ek.a.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Bitmap bitmap = this.f84356a;
        if (bitmap != null && (strAccess$encodeImage = DigitalSignatureViewModel.access$encodeImage((digitalSignatureViewModel = this.f84357b), bitmap)) != null) {
            digitalSignatureViewModel.f84352a.postValue(new DigitalSignatureViewModel.SignatureUiState.DrawingFinished(strAccess$encodeImage));
        }
        return Unit.INSTANCE;
    }
}
