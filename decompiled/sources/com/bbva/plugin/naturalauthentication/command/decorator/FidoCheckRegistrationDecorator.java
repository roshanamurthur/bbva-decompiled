package com.bbva.plugin.naturalauthentication.command.decorator;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoSession;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FidoCheckRegistrationDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoCheckRegistrationDecorator;", "Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoCallbackDecorator;", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoCheckRegisterCallback;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "<init>", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "checkCompleted", "", "fidoSession", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoSession;", "authIsPossible", "", "checkFailed", "p0", "fidoException", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FidoCheckRegistrationDecorator extends FidoCallbackDecorator implements FidoSdk.FidoCheckRegisterCallback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidoCheckRegistrationDecorator(@NotNull CommandCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoCheckRegisterCallback
    public void checkCompleted(@Nullable FidoSession fidoSession, boolean authIsPossible) {
        if (fidoSession != null) {
            onSuccess(FidoCallbackDecoratorKt.toMapWith(fidoSession, TuplesKt.to("regIsPossible", Boolean.valueOf(authIsPossible))));
        } else {
            onFail(Errors.ErrorDefault);
        }
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoCheckRegisterCallback
    public void checkFailed(@Nullable FidoSession p4, @Nullable FidoException fidoException) {
        onFail(fidoException);
    }
}
