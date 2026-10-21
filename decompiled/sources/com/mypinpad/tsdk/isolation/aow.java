package com.mypinpad.tsdk.isolation;

import java.security.Provider;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

/* JADX INFO: loaded from: classes10.dex */
public final class aow extends apf {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile apc f53439d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f53440e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f53441f = 1;

    /* JADX WARN: Illegal instructions before constructor call */
    public aow() {
        Provider provider;
        synchronized (aow.class) {
            int i10 = f53441f;
            int i11 = i10 & 41;
            int i12 = (i10 ^ 41) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            f53440e = i13 % 128;
            if (i13 % 2 != 0) {
                boolean z10 = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME) instanceof apc;
                throw null;
            }
            Provider provider2 = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
            if (provider2 instanceof apc) {
                int i14 = f53440e;
                int i15 = ((((i14 ^ 1) | (i14 & 1)) << 1) - (~(-(((~i14) & 1) | (i14 & (-2)))))) - 1;
                int i16 = i15 % 128;
                f53441f = i16;
                int i17 = i15 % 2;
                int i18 = ((((i16 ^ 39) | (i16 & 39)) << 1) - (~(-(((~i16) & 39) | (i16 & (-40)))))) - 1;
                f53440e = i18 % 128;
                int i19 = i18 % 2;
                provider = provider2;
            } else if (f53439d != null) {
                int i20 = (-2) - ((f53441f + 6) ^ (-1));
                f53440e = i20 % 128;
                int i21 = i20 % 2;
                apc apcVar = f53439d;
                int i22 = f53440e;
                int i23 = i22 & 1;
                int i24 = (i22 ^ 1) | i23;
                int i25 = (i23 ^ i24) + ((i24 & i23) << 1);
                f53441f = i25 % 128;
                if (i25 % 2 == 0) {
                    provider = apcVar;
                    int i26 = 21 / 0;
                    provider = apcVar;
                }
            } else {
                apc apcVar2 = new apc();
                f53439d = apcVar2;
                int i27 = f53440e;
                int i28 = i27 & 33;
                int i29 = i28 + ((i27 ^ 33) | i28);
                f53441f = i29 % 128;
                if (i29 % 2 == 0) {
                    provider = apcVar2;
                    int i30 = 94 / 0;
                    provider = apcVar2;
                }
            }
            throw th;
        }
        super(provider);
    }
}
