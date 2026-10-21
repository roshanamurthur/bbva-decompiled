package q8;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.google.pay.command.GetCardStatusCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f92776p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f92777q0;

    public /* synthetic */ b(int i10, CommandCallback commandCallback) {
        this.f92776p0 = i10;
        this.f92777q0 = commandCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f92776p0;
        CommandCallback callback = this.f92777q0;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.sendError(Errors.ErrorNotAvailable);
                break;
            default:
                GetCardStatusCommand.Companion companion = GetCardStatusCommand.Companion;
                Intrinsics.checkNotNullParameter(callback, "$commandCallback");
                callback.sendError(Errors.ErrorDefault);
                break;
        }
    }
}
