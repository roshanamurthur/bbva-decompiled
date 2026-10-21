package ib;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.plugin.naturalauthentication.command.AuthenticateAction;
import com.bbva.plugin.naturalauthentication.command.AuthenticateCommand;
import com.bbva.plugin.naturalauthentication.command.CommandError;
import com.bbva.plugin.naturalauthentication.command.FidoCommand;
import com.bbva.plugin.naturalauthentication.command.ProcessAuthMessageCommand;
import com.bbva.plugin.naturalauthentication.domain.model.AuthenticateParams;
import com.bbva.plugin.naturalauthentication.domain.model.ProcessAuthMessageParams;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements Function3 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69534p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f69535q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69536r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ FidoCommand f69537s0;

    public /* synthetic */ a(Object obj, FidoCommand fidoCommand, CommandCallback commandCallback, int i10) {
        this.f69534p0 = i10;
        this.f69536r0 = obj;
        this.f69537s0 = fidoCommand;
        this.f69535q0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f69534p0;
        CommandCallback callback = this.f69535q0;
        FidoCommand fidoCommand = this.f69537s0;
        Object obj4 = this.f69536r0;
        switch (i10) {
            case 0:
                AuthenticateParams authenticateParams = (AuthenticateParams) obj4;
                AuthenticateCommand this$0 = (AuthenticateCommand) fidoCommand;
                NaturalAuthentication naturalAuthentication = (NaturalAuthentication) obj;
                Activity activity = (Activity) obj2;
                FidoSession fidoSession = (FidoSession) obj3;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(fidoSession, "fidoSession");
                String action = authenticateParams.getAction();
                if (Intrinsics.areEqual(action, AuthenticateAction.CHECK.getAction())) {
                    if (naturalAuthentication != null) {
                        naturalAuthentication.checkAuthenticationPossible(activity, fidoSession, this$0.f35860r0.getFidoCheckAuthenticateCallback(callback));
                    }
                } else if (Intrinsics.areEqual(action, AuthenticateAction.AUTHENTICATE.getAction()) && naturalAuthentication != null) {
                    FidoSdk.FidoAuthenticateCallback fidoAuthenticateCallback = this$0.f35860r0.getFidoAuthenticateCallback(callback);
                    Boolean confirmationRequired = authenticateParams.getConfirmationRequired();
                    naturalAuthentication.authenticate(activity, fidoSession, fidoAuthenticateCallback, confirmationRequired != null ? confirmationRequired.booleanValue() : false);
                }
                break;
            default:
                ProcessAuthMessageParams processAuthMessageParams = (ProcessAuthMessageParams) obj4;
                ProcessAuthMessageCommand this$1 = (ProcessAuthMessageCommand) fidoCommand;
                NaturalAuthentication naturalAuthentication2 = (NaturalAuthentication) obj;
                Activity activity2 = (Activity) obj2;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(activity2, "activity");
                Intrinsics.checkNotNullParameter((FidoSession) obj3, "<unused var>");
                if (naturalAuthentication2 != null) {
                    naturalAuthentication2.processAuthMessage(activity2, processAuthMessageParams.getMessage(), this$1.f35877r0.getFidoCreateAuthMessageCallback(callback));
                } else {
                    callback.sendError(CommandError.ErrorProcessAuthMessage);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
