package org.bouncycastle.jcajce.util;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes8.dex */
public class BCJcaJceHelper extends ProviderJcaJceHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile BouncyCastleProvider f90313a;

    /* JADX WARN: Illegal instructions before constructor call */
    public BCJcaJceHelper() {
        Provider provider;
        synchronized (BCJcaJceHelper.class) {
            try {
                provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
                if (!(provider instanceof BouncyCastleProvider)) {
                    if (f90313a == null) {
                        f90313a = new BouncyCastleProvider();
                    }
                    provider = f90313a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        super(provider);
    }
}
