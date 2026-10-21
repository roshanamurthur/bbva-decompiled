package ib;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.plugin.naturalauthentication.command.DeleteAction;
import com.bbva.plugin.naturalauthentication.command.DeleteCommand;
import com.bbva.plugin.naturalauthentication.command.FidoCommand;
import com.bbva.plugin.naturalauthentication.command.RegisterAction;
import com.bbva.plugin.naturalauthentication.command.RegisterCommand;
import com.bbva.plugin.naturalauthentication.domain.model.DeleteParams;
import com.bbva.plugin.naturalauthentication.domain.model.RegisterParams;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function3 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69541p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f69542q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69543r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ FidoCommand f69544s0;

    public /* synthetic */ c(Object obj, FidoCommand fidoCommand, CommandCallback commandCallback, int i10) {
        this.f69541p0 = i10;
        this.f69543r0 = obj;
        this.f69544s0 = fidoCommand;
        this.f69542q0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f69541p0;
        CommandCallback callback = this.f69542q0;
        FidoCommand fidoCommand = this.f69544s0;
        Object obj4 = this.f69543r0;
        switch (i10) {
            case 0:
                DeleteParams deleteParams = (DeleteParams) obj4;
                DeleteCommand this$0 = (DeleteCommand) fidoCommand;
                NaturalAuthentication naturalAuthentication = (NaturalAuthentication) obj;
                Activity activity = (Activity) obj2;
                FidoSession fidoSession = (FidoSession) obj3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(fidoSession, "fidoSession");
                String action = deleteParams.getAction();
                if (Intrinsics.areEqual(action, DeleteAction.ONE.getAction())) {
                    if (naturalAuthentication != null) {
                        naturalAuthentication.deleteAuthenticator(deleteParams.getAuthHandler(), deleteParams.getDeviceId(), activity, fidoSession, this$0.f35862r0.getFidoDeleteCallback(callback));
                    }
                } else if (Intrinsics.areEqual(action, DeleteAction.LOCALLY.getAction())) {
                    if (naturalAuthentication != null) {
                        naturalAuthentication.deleteAuthenticatorLocally(deleteParams.getAuthHandler(), activity, fidoSession, this$0.f35862r0.getFidoDeleteCallback(callback));
                    }
                } else if (Intrinsics.areEqual(action, DeleteAction.ALL.getAction())) {
                    if (naturalAuthentication != null) {
                        naturalAuthentication.deleteAllAuthenticators(activity, fidoSession, this$0.f35862r0.getFidoDeleteCallback(callback));
                    }
                } else if (Intrinsics.areEqual(action, DeleteAction.ALL_LOCALLY.getAction())) {
                    if (naturalAuthentication != null) {
                        naturalAuthentication.deleteAllAuthenticatorsLocally(activity, fidoSession, this$0.f35862r0.getFidoDeleteCallback(callback));
                    }
                } else if (Intrinsics.areEqual(action, DeleteAction.ALL_FROM_DEVICE.getAction()) && naturalAuthentication != null) {
                    naturalAuthentication.deleteAllAuthenticatorsFromDevice(deleteParams.getDeviceId(), activity, fidoSession, this$0.f35862r0.getFidoDeleteCallback(callback));
                }
                break;
            default:
                RegisterParams registerParams = (RegisterParams) obj4;
                RegisterCommand this$1 = (RegisterCommand) fidoCommand;
                NaturalAuthentication naturalAuthentication2 = (NaturalAuthentication) obj;
                Activity activity2 = (Activity) obj2;
                FidoSession fidoSession2 = (FidoSession) obj3;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(activity2, "activity");
                Intrinsics.checkNotNullParameter(fidoSession2, "fidoSession");
                String action2 = registerParams.getAction();
                if (Intrinsics.areEqual(action2, RegisterAction.CHECK.getAction())) {
                    if (naturalAuthentication2 != null) {
                        naturalAuthentication2.checkRegistrationPossible(activity2, fidoSession2, this$1.f35879r0.getFidoCheckRegisterCallback(callback));
                    }
                } else if (Intrinsics.areEqual(action2, RegisterAction.REGISTER.getAction()) && naturalAuthentication2 != null) {
                    FidoSdk.FidoRegisterCallback fidoRegisterCallback = this$1.f35879r0.getFidoRegisterCallback(callback);
                    Boolean confirmationRequired = registerParams.getConfirmationRequired();
                    naturalAuthentication2.registerAuthenticator(activity2, fidoSession2, fidoRegisterCallback, confirmationRequired != null ? confirmationRequired.booleanValue() : false);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
