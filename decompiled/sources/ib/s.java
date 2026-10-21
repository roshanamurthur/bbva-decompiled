package ib;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.plugin.naturalauthentication.command.HasSuitableAuthenticatorCommand;
import com.bbva.plugin.naturalauthentication.domain.model.HasSuitableAuthenticatorParam;
import com.bbva.sdkcatalog.openpay.plugin.OpenPayManager;
import com.bbva.sdkcatalog.openpay.plugin.command.ConnectToBluetoothDeviceCommand;
import com.google.gson.JsonElement;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class s implements Function2 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69564p0 = 0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f69565q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69566r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f69567s0;

    public /* synthetic */ s(HasSuitableAuthenticatorParam hasSuitableAuthenticatorParam, HasSuitableAuthenticatorCommand hasSuitableAuthenticatorCommand, CommandCallback commandCallback) {
        this.f69566r0 = hasSuitableAuthenticatorParam;
        this.f69567s0 = hasSuitableAuthenticatorCommand;
        this.f69565q0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f69564p0;
        CommandCallback callback = this.f69565q0;
        Object obj3 = this.f69567s0;
        Object obj4 = this.f69566r0;
        switch (i10) {
            case 0:
                HasSuitableAuthenticatorParam hasSuitableAuthenticatorParam = (HasSuitableAuthenticatorParam) obj4;
                HasSuitableAuthenticatorCommand this$0 = (HasSuitableAuthenticatorCommand) obj3;
                NaturalAuthentication naturalAuthentication = (NaturalAuthentication) obj;
                Activity activity = (Activity) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(activity, "activity");
                if (naturalAuthentication != null) {
                    naturalAuthentication.hasSuitableAuthenticator(activity, hasSuitableAuthenticatorParam.getAaids(), this$0.f35871r0.getFidoHasSuitableAuthenticatorCallback(callback));
                }
                return Unit.INSTANCE;
            default:
                return ConnectToBluetoothDeviceCommand.execute$lambda$1((ConnectToBluetoothDeviceCommand) obj4, callback, (JsonElement) obj3, (OpenPayManager) obj, (Activity) obj2);
        }
    }

    public /* synthetic */ s(ConnectToBluetoothDeviceCommand connectToBluetoothDeviceCommand, CommandCallback commandCallback, JsonElement jsonElement) {
        this.f69566r0 = connectToBluetoothDeviceCommand;
        this.f69565q0 = commandCallback;
        this.f69567s0 = jsonElement;
    }
}
