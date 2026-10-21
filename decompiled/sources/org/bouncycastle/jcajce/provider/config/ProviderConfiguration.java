package org.bouncycastle.jcajce.provider.config;

import java.security.spec.DSAParameterSpec;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public interface ProviderConfiguration {
    Set getAcceptableNamedCurves();

    Map getAdditionalECParameters();

    DHParameterSpec getDHDefaultParameters(int i10);

    DSAParameterSpec getDSADefaultParameters(int i10);

    ECParameterSpec getEcImplicitlyCa();
}
