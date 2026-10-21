package mx.openpay.library.ui.signature;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DigitalSignatureComponentActivity f84354a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DigitalSignatureComponentActivity digitalSignatureComponentActivity) {
        super(1);
        this.f84354a = digitalSignatureComponentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DigitalSignatureViewModel.SignatureUiState it = (DigitalSignatureViewModel.SignatureUiState) obj;
        DigitalSignatureComponentActivity digitalSignatureComponentActivity = this.f84354a;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        DigitalSignatureComponentActivity.access$updateUI(digitalSignatureComponentActivity, it);
        return Unit.INSTANCE;
    }
}
