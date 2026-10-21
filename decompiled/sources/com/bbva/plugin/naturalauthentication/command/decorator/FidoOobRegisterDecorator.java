package com.bbva.plugin.naturalauthentication.command.decorator;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FidoOobRegisterDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016J\u001c\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoOobRegisterDecorator;", "Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoCallbackDecorator;", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoOobRegisterCallback;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "<init>", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "registerCompleted", "", "fidoSession", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "registerFailed", "p0", "fidoException", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FidoOobRegisterDecorator extends FidoCallbackDecorator implements FidoSdk.FidoOobRegisterCallback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidoOobRegisterDecorator(@NotNull CommandCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoOobRegisterCallback, com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoRegisterCallback
    public void registerCompleted(@Nullable FidoSession fidoSession) {
        if (fidoSession != null) {
            onSuccess(FidoCallbackDecoratorKt.toMapWith(fidoSession, new Pair[0]));
        } else {
            onFail(Errors.ErrorDefault);
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoOobRegisterCallback, com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoRegisterCallback
    public void registerFailed(@Nullable FidoSession p4, @Nullable FidoException fidoException) {
        onFail(fidoException);
    }
}
