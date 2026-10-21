package com.bbva.plugin.naturalauthentication.command.decorator;

import bk.p;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoHasSuitableAuthenticatorDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoHasSuitableAuthenticatorDecorator;", "Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoCallbackDecorator;", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoCheckLocalAuthCallback;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "<init>", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "checkCompleted", "", "isAuthPossible", "", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FidoHasSuitableAuthenticatorDecorator extends FidoCallbackDecorator implements FidoSdk.FidoCheckLocalAuthCallback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidoHasSuitableAuthenticatorDecorator(@NotNull CommandCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoCheckLocalAuthCallback
    public void checkCompleted(boolean isAuthPossible) {
        onSuccess(p.mapOf(TuplesKt.to("isAuthPossible", Boolean.valueOf(isAuthPossible))));
    }
}
