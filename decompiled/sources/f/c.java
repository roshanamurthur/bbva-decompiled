package f;

import android.content.Intent;
import androidx.activity.OnBackPressedCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.ui.signature.DigitalSignatureTopActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DigitalSignatureTopActivity f68370a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(DigitalSignatureTopActivity digitalSignatureTopActivity) {
        super(1);
        this.f68370a = digitalSignatureTopActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        Intent intent = new Intent();
        intent.putExtra(DigitalSignatureTopActivity.ENCODED_IMAGE, "");
        this.f68370a.setResult(-1, intent);
        this.f68370a.finish();
        return Unit.INSTANCE;
    }
}
