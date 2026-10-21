package org.bouncycastle.pqc.jcajce.provider;

import ad.d;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.camera2.internal.h0;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivateKey;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;

/* JADX INFO: loaded from: classes13.dex */
public class BouncyCastlePQCProvider extends Provider implements ConfigurableProvider {
    public static final ProviderConfiguration CONFIGURATION = null;
    public static String PROVIDER_NAME = "BCPQC";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final HashMap f91438p0 = new HashMap();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String[] f91439q0 = {"Rainbow", "McEliece", "SPHINCS", "LMS", "NH", "XMSS", "QTESLA"};

    public class a implements PrivilegedAction {
        public a() {
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            String str = BouncyCastlePQCProvider.PROVIDER_NAME;
            BouncyCastlePQCProvider bouncyCastlePQCProvider = BouncyCastlePQCProvider.this;
            bouncyCastlePQCProvider.getClass();
            int i10 = 0;
            while (true) {
                String[] strArr = BouncyCastlePQCProvider.f91439q0;
                Class<?> clsLoadClass = null;
                if (i10 == strArr.length) {
                    return null;
                }
                String strF = d.f(new StringBuilder("org.bouncycastle.pqc.jcajce.provider."), strArr[i10], "$Mappings");
                try {
                    ClassLoader classLoader = BouncyCastlePQCProvider.class.getClassLoader();
                    clsLoadClass = classLoader != null ? classLoader.loadClass(strF) : (Class) AccessController.doPrivileged(new an.a(strF));
                } catch (ClassNotFoundException unused) {
                }
                if (clsLoadClass != null) {
                    try {
                        ((AlgorithmProvider) clsLoadClass.newInstance()).configure(bouncyCastlePQCProvider);
                    } catch (Exception e5) {
                        throw new InternalError("cannot create instance of org.bouncycastle.pqc.jcajce.provider." + strArr[i10] + "$Mappings : " + e5);
                    }
                }
                i10++;
            }
        }
    }

    public BouncyCastlePQCProvider() {
        super(PROVIDER_NAME, 1.65d, "BouncyCastle Post-Quantum Security Provider v1.65");
        AccessController.doPrivileged(new a());
    }

    public static PrivateKey getPrivateKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        HashMap map = f91438p0;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(algorithm);
        }
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePrivate(privateKeyInfo);
    }

    public static PublicKey getPublicKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        AsymmetricKeyInfoConverter asymmetricKeyInfoConverter;
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        HashMap map = f91438p0;
        synchronized (map) {
            asymmetricKeyInfoConverter = (AsymmetricKeyInfoConverter) map.get(algorithm);
        }
        if (asymmetricKeyInfoConverter == null) {
            return null;
        }
        return asymmetricKeyInfoConverter.generatePublic(subjectPublicKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, String str2) {
        if (containsKey(str)) {
            throw new IllegalStateException(h0.b("duplicate provider key (", str, ") found"));
        }
        put(str, str2);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAttributes(String str, Map<String, String> map) {
        for (String str2 : map.keySet()) {
            String strB = androidx.camera.core.impl.utils.a.b(str, " ", str2);
            if (containsKey(strB)) {
                throw new IllegalStateException(h0.b("duplicate provider attribute key (", strB, ") found"));
            }
            put(strB, map.get(str2));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addKeyInfoConverter(ASN1ObjectIdentifier aSN1ObjectIdentifier, AsymmetricKeyInfoConverter asymmetricKeyInfoConverter) {
        HashMap map = f91438p0;
        synchronized (map) {
            map.put(aSN1ObjectIdentifier, asymmetricKeyInfoConverter);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public boolean hasAlgorithm(String str, String str2) {
        if (!containsKey(str + Constant.DOT_STRING + str2)) {
            if (!containsKey("Alg.Alias." + str + Constant.DOT_STRING + str2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void setParameter(String str, Object obj) {
        synchronized (CONFIGURATION) {
        }
    }

    @Override // org.bouncycastle.jcajce.provider.config.ConfigurableProvider
    public void addAlgorithm(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str2) {
        if (!containsKey(str + Constant.DOT_STRING + str2)) {
            throw new IllegalStateException(u.g("primary key (", str, Constant.DOT_STRING, str2, ") not found"));
        }
        addAlgorithm(str + Constant.DOT_STRING + aSN1ObjectIdentifier, str2);
        addAlgorithm(str + ".OID." + aSN1ObjectIdentifier, str2);
    }
}
