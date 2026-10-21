package eb;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.geolocation.command.ClearWatchLocationCommand;
import com.bbva.plugin.geolocation.command.response.GeolocationErrors;
import com.bbva.plugin.geolocation.manager.Locator;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.ResponseData;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.SdkTapOnPhoneVierge;
import com.viergegroup.sdk.taptophone.vierge.models.BackendViergeResponseData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f68293p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f68294q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f68293p0 = i10;
        this.f68294q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f68293p0;
        Object obj2 = this.f68294q0;
        switch (i10) {
            case 0:
                CommandCallback commandCallback = (CommandCallback) obj2;
                Locator it = (Locator) obj;
                ClearWatchLocationCommand.Companion companion = ClearWatchLocationCommand.INSTANCE;
                Intrinsics.checkNotNullParameter(it, "it");
                try {
                    it.stopWatcher();
                    commandCallback.sendEvent();
                    break;
                } catch (Exception unused) {
                    commandCallback.sendError(GeolocationErrors.ErrorStopWatchLocation);
                }
                return Unit.INSTANCE;
            default:
                return SdkTapOnPhoneVierge.lambda$initializeTerminal$0((ResponseData) obj2, (BackendViergeResponseData) obj);
        }
    }
}
