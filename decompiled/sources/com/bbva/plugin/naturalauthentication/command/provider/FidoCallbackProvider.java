package com.bbva.plugin.naturalauthentication.command.provider;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoAuthenticateDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoCheckAuthenticateDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoCheckRegistrationDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoDeleteDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoDiscoverBiometricCapabilitiesDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoDiscoverCapabilitiesDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoHasSuitableAuthenticatorDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoInitializeDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoListAuthenticatorsDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoOobAuthenticateDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoOobRegisterDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoOperationDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoQuickAuthDataDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoRegisterDecorator;
import com.bbva.plugin.naturalauthentication.command.decorator.FidoSignDecorator;
import com.bbva.sl.ar.android.secsdk.fido.FidoSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FidoCallbackProvider.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010#\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006%"}, d2 = {"Lcom/bbva/plugin/naturalauthentication/command/provider/FidoCallbackProvider;", "", "<init>", "()V", "getFidoInitializeCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoInitializeCallback;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "getFidoRegisterCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoRegisterCallback;", "getFidoOobRegisterCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoOobRegisterCallback;", "getFidoCheckRegisterCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoCheckRegisterCallback;", "getFidoDeleteCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoDeleteCallback;", "getFidoSignCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoSignCallback;", "getFidoListingCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoListingCallback;", "getFidoAuthenticateCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoAuthenticateCallback;", "getFidoOobAuthenticateCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoOobAuthenticateCallback;", "getFidoCheckAuthenticateCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoCheckAuthenticateCallback;", "getFidoCreateAuthMessageCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoOperationListener;", "getFidoProcessAuthMessageCallback", "getFidoDiscoverCapabilitiesCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoDiscoverCapabilitiesCallback;", "getFidoDiscoverBiometricCapabilitiesCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoDiscoverBiometricCapabilitiesCallback;", "getFidoHasSuitableAuthenticatorCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoCheckLocalAuthCallback;", "getFidoQuickAuthDataCallback", "Lcom/bbva/sl/ar/android/secsdk/fido/FidoSdk$FidoQuickAuthDataCallback;", "naturalauthentication-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class FidoCallbackProvider {
    @NotNull
    public final FidoSdk.FidoAuthenticateCallback getFidoAuthenticateCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoAuthenticateDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoCheckAuthenticateCallback getFidoCheckAuthenticateCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoCheckAuthenticateDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoCheckRegisterCallback getFidoCheckRegisterCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoCheckRegistrationDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoOperationListener getFidoCreateAuthMessageCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoOperationDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoDeleteCallback getFidoDeleteCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoDeleteDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoDiscoverBiometricCapabilitiesCallback getFidoDiscoverBiometricCapabilitiesCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoDiscoverBiometricCapabilitiesDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoDiscoverCapabilitiesCallback getFidoDiscoverCapabilitiesCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoDiscoverCapabilitiesDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoCheckLocalAuthCallback getFidoHasSuitableAuthenticatorCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoHasSuitableAuthenticatorDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoInitializeCallback getFidoInitializeCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoInitializeDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoListingCallback getFidoListingCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoListAuthenticatorsDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoOobAuthenticateCallback getFidoOobAuthenticateCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoOobAuthenticateDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoOobRegisterCallback getFidoOobRegisterCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoOobRegisterDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoOperationListener getFidoProcessAuthMessageCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoOperationDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoQuickAuthDataCallback getFidoQuickAuthDataCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoQuickAuthDataDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoRegisterCallback getFidoRegisterCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoRegisterDecorator(callback);
    }

    @NotNull
    public final FidoSdk.FidoSignCallback getFidoSignCallback(@NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new FidoSignDecorator(callback);
    }
}
