package com.bbva.plugin.biometrics;

import com.bbva.biometrics.authenticator.Biometrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiometricsFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/plugin/biometrics/BiometricsFactory;", "", "()V", "createBiometricsBuilder", "Lcom/bbva/biometrics/authenticator/Biometrics$Builder;", "biometrics-plugin_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class BiometricsFactory {
    @NotNull
    public final Biometrics.Builder createBiometricsBuilder() {
        return new Biometrics.Builder();
    }
}
