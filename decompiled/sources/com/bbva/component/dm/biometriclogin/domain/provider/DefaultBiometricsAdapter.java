package com.bbva.component.dm.biometriclogin.domain.provider;

import android.content.Context;
import com.bbva.biometrics.authenticator.Biometrics;
import com.bbva.biometrics.authenticator.data.AuthenticateResult;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultBiometricsAdapter.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/biometriclogin/domain/provider/DefaultBiometricsAdapter;", "Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricsAdapter;", "", "deviceBiometricType", "Lcom/bbva/component/dm/biometriclogin/domain/provider/BiometricAvailability;", "isBiometricsAvailable", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "BiometricAuthentication_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class DefaultBiometricsAdapter implements BiometricsAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f27492a;

    /* JADX INFO: compiled from: DefaultBiometricsAdapter.kt */
    public static final class a extends Lambda implements Function1<Biometrics, String> {
        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(Biometrics biometrics) {
            Biometrics it = biometrics;
            Intrinsics.checkNotNullParameter(it, "it");
            return it.getBiometricSystemType(DefaultBiometricsAdapter.this.f27492a).getValue();
        }
    }

    /* JADX INFO: compiled from: DefaultBiometricsAdapter.kt */
    public static final class b extends Lambda implements Function1<Biometrics, BiometricAvailability> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final BiometricAvailability invoke(Biometrics biometrics) {
            Biometrics it = biometrics;
            Intrinsics.checkNotNullParameter(it, "it");
            AuthenticateResult authenticateResultCanAuthenticate = it.canAuthenticate(DefaultBiometricsAdapter.this.f27492a);
            return authenticateResultCanAuthenticate instanceof AuthenticateResult.Success ? new BiometricAvailability.Success(authenticateResultCanAuthenticate.getCom.bbva.component.dm.biometriclogin.presentation.reactions.BiometricLoginAnalyticsReactions.BIOMETRIC_TYPE java.lang.String()) : BiometricAvailability.Unavailable.INSTANCE;
        }
    }

    public DefaultBiometricsAdapter(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f27492a = context;
    }

    @Override // com.bbva.component.dm.biometriclogin.domain.provider.BiometricsAdapter
    @NotNull
    public String deviceBiometricType() {
        return (String) new a().invoke(new Biometrics.Builder().build());
    }

    @Override // com.bbva.component.dm.biometriclogin.domain.provider.BiometricsAdapter
    @NotNull
    public BiometricAvailability isBiometricsAvailable() {
        return (BiometricAvailability) new b().invoke(new Biometrics.Builder().build());
    }
}
