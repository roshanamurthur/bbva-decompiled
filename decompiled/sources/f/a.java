package f;

import androidx.activity.OnBackPressedCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import mx.openpay.library.core.bluetooth.BluetoothController;
import mx.openpay.library.ui.signature.DigitalSignatureComponentActivity;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DigitalSignatureComponentActivity f68368a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(DigitalSignatureComponentActivity digitalSignatureComponentActivity) {
        super(1);
        this.f68368a = digitalSignatureComponentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OnBackPressedCallback addCallback = (OnBackPressedCallback) obj;
        Intrinsics.checkNotNullParameter(addCallback, "$this$addCallback");
        BluetoothController.INSTANCE.onSignatureRecorded("");
        this.f68368a.finish();
        return Unit.INSTANCE;
    }
}
