package com.bbva.plugin.naturalauthentication.command.decorator;

import bk.q;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.naturalauthentication.command.CommandError;
import com.bbva.sl.ar.android.secsdk.fido.BiometricCapability;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoDiscoverBiometricCapabilitiesDecorator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016¨\u0006\u000f"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoDiscoverBiometricCapabilitiesDecorator;", "Lcom/bbva/plugin/naturalauthentication/command/decorator/FidoCallbackDecorator;", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoDiscoverBiometricCapabilitiesCallback;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "<init>", "(Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;)V", "success", "", "biometricCapabilities", "", "Lcom/bbva/sl/ar/android/secsdk/fido/BiometricCapability;", "failure", "error", "Lcom/bbva/sl/ar/android/secsdk/fido/exception/FidoException;", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FidoDiscoverBiometricCapabilitiesDecorator extends FidoCallbackDecorator implements FidoSdk.FidoDiscoverBiometricCapabilitiesCallback {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FidoDiscoverBiometricCapabilitiesDecorator(@NotNull CommandCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoDiscoverBiometricCapabilitiesCallback
    public void failure(@NotNull FidoException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        onFail(CommandError.ErrorDiscoverBiometricCapabilities);
    }

    @Override // com.bbva.sl.ar.android.secsdk.fido.FidoSdk.FidoDiscoverBiometricCapabilitiesCallback
    public void success(@NotNull Set<? extends BiometricCapability> biometricCapabilities) {
        Intrinsics.checkNotNullParameter(biometricCapabilities, "biometricCapabilities");
        onSuccess(q.mapOf(TuplesKt.to("biometricStrong", Boolean.valueOf(biometricCapabilities.contains(BiometricCapability.BIOMETRIC_STRONG))), TuplesKt.to("biometricWeak", Boolean.valueOf(biometricCapabilities.contains(BiometricCapability.BIOMETRIC_WEAK)))));
    }
}
