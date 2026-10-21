package com.bbva.plugin.naturalauthentication.command.decorator;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.plugin.naturalauthentication.command.CommandError;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoAuthenticatorType;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoQuickAuthData;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FidoQuickAuthDataDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\u000e"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoQuickAuthDataDecorator;", "Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoCallbackDecorator;", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoQuickAuthDataCallback;", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoQuickAuthData;", "fidoQuickAuthData", "", "success", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "error", "failure", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "<init>", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class FidoQuickAuthDataDecorator extends FidoCallbackDecorator implements FidoSdk.FidoQuickAuthDataCallback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidoQuickAuthDataDecorator(@NotNull CommandCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoQuickAuthDataCallback
    public void failure(@NotNull FidoException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        onFail(CommandError.ErrorGettingQuickAuthData);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x002b  */
    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoQuickAuthDataCallback
    public void success(@Nullable FidoQuickAuthData fidoQuickAuthData) {
        String lowerCase;
        String strName;
        if (fidoQuickAuthData == null) {
            onFail(CommandError.ErrorGettingQuickAuthDataEmpty);
            return;
        }
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.to("aaid", fidoQuickAuthData.getAaid());
        FidoAuthenticatorType fidoAuthenticatorType = fidoQuickAuthData.getFidoAuthenticatorType();
        if (fidoAuthenticatorType == null || (strName = fidoAuthenticatorType.name()) == null) {
            lowerCase = "undefined";
        } else {
            lowerCase = strName.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            if (lowerCase == null) {
                lowerCase = "undefined";
            }
        }
        pairArr[1] = TuplesKt.to("authenticatorType", lowerCase);
        pairArr[2] = TuplesKt.to("tenant", fidoQuickAuthData.getTenant());
        pairArr[3] = TuplesKt.to(Constants.backendRequestUserId, fidoQuickAuthData.getUserId());
        onSuccess(q.mapOf(pairArr));
    }
}
