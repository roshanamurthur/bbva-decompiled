package ib;

import android.app.Activity;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.ethermobilesdk.naturalauthentication.NaturalAuthentication;
import com.bbva.plugin.naturalauthentication.command.CommandError;
import com.bbva.plugin.naturalauthentication.command.CreateAuthMessageCommand;
import com.bbva.plugin.naturalauthentication.command.FidoCommand;
import com.bbva.plugin.naturalauthentication.command.QuickAuthDataCommand;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class b implements Function3 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69538p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f69539q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ FidoCommand f69540r0;

    public /* synthetic */ b(FidoCommand fidoCommand, CommandCallback commandCallback, int i10) {
        this.f69538p0 = i10;
        this.f69540r0 = fidoCommand;
        this.f69539q0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i10 = this.f69538p0;
        CommandCallback callback = this.f69539q0;
        FidoCommand fidoCommand = this.f69540r0;
        switch (i10) {
            case 0:
                CreateAuthMessageCommand this$0 = (CreateAuthMessageCommand) fidoCommand;
                NaturalAuthentication naturalAuthentication = (NaturalAuthentication) obj;
                Activity activity = (Activity) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter((FidoSession) obj3, "<unused var>");
                if (naturalAuthentication != null) {
                    naturalAuthentication.createAuthMessage(activity, this$0.f35861r0.getFidoCreateAuthMessageCallback(callback));
                } else {
                    callback.sendError(CommandError.ErrorCreateAuthMessage);
                }
                break;
            default:
                QuickAuthDataCommand this$1 = (QuickAuthDataCommand) fidoCommand;
                NaturalAuthentication naturalAuthentication2 = (NaturalAuthentication) obj;
                FidoSession fidoSession = (FidoSession) obj3;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                Intrinsics.checkNotNullParameter(callback, "$callback");
                Intrinsics.checkNotNullParameter((Activity) obj2, "<unused var>");
                Intrinsics.checkNotNullParameter(fidoSession, "fidoSession");
                if (naturalAuthentication2 != null) {
                    naturalAuthentication2.quickAuthData(fidoSession, this$1.f35878r0.getFidoQuickAuthDataCallback(callback));
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
