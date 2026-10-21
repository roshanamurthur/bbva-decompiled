package ue;

import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.ktx.AppUpdateManagerKtxKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements InstallStateUpdatedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final InstallStateUpdatedListener f93793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Function1<a, Unit> f93794b;

    public a(@NotNull AppUpdateManagerKtxKt.b.d listener, @NotNull AppUpdateManagerKtxKt.b.e disposeAction) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(disposeAction, "disposeAction");
        this.f93793a = listener;
        this.f93794b = disposeAction;
    }

    @Override // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(InstallState installState) {
        InstallState state = installState;
        Intrinsics.checkNotNullParameter(state, "state");
        this.f93793a.onStateUpdate(state);
        int iInstallStatus = state.installStatus();
        if (iInstallStatus == 0 || iInstallStatus == 11 || iInstallStatus == 5 || iInstallStatus == 6) {
            this.f93794b.invoke(this);
        }
    }
}
