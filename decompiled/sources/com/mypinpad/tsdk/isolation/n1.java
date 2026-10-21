package com.mypinpad.tsdk.isolation;

import java.util.HashMap;
import java.util.HashSet;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes10.dex */
public final class n1 {
    static {
        new aov(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA);
        new aov(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.EC_IMPLICITLY_CA);
        new aov(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS);
        new aov(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.DH_DEFAULT_PARAMS);
        new aov(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.ACCEPTABLE_EC_CURVES);
        new aov(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.ADDITIONAL_EC_PARAMETERS);
        int i10 = (((~0) & 33) - (~(-(-0)))) - 1;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
    }

    public n1() {
        new ThreadLocal();
        new ThreadLocal();
        new HashSet();
        new HashMap();
    }
}
