package mx.openpay.library.ui.signature;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DigitalSignatureTopActivity f84355a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(DigitalSignatureTopActivity digitalSignatureTopActivity) {
        super(1);
        this.f84355a = digitalSignatureTopActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DigitalSignatureViewModel.SignatureUiState it = (DigitalSignatureViewModel.SignatureUiState) obj;
        DigitalSignatureTopActivity digitalSignatureTopActivity = this.f84355a;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        DigitalSignatureTopActivity.access$updateUI(digitalSignatureTopActivity, it);
        return Unit.INSTANCE;
    }
}
