package mx.openpay.library.data.taponphone;

import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.PinPadSdk;
import kotlin.Metadata;
import mx.openpay.library.domain.taponphone.TapOnPhonePinPadController;

/* JADX INFO: compiled from: TapOnPhonePinPadControllerImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lmx/openpay/library/data/taponphone/TapOnPhonePinPadControllerImpl;", "Lmx/openpay/library/domain/taponphone/TapOnPhonePinPadController;", "()V", "isApplicationInitAllowed", "", "data_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TapOnPhonePinPadControllerImpl implements TapOnPhonePinPadController {
    @Override // mx.openpay.library.domain.taponphone.TapOnPhonePinPadController
    public boolean isApplicationInitAllowed() {
        return PinPadSdk.isApplicationInitAllowed();
    }
}
