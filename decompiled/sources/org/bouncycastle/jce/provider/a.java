package org.bouncycastle.jce.provider;

import java.security.spec.DSAParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.config.ProviderConfigurationPermission;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jce.spec.ECParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public final class a implements ProviderConfiguration {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ProviderConfigurationPermission f90477g = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ProviderConfigurationPermission f90478h = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.EC_IMPLICITLY_CA);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ProviderConfigurationPermission f90479i = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ProviderConfigurationPermission f90480j = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.DH_DEFAULT_PARAMS);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ProviderConfigurationPermission f90481k = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.ACCEPTABLE_EC_CURVES);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ProviderConfigurationPermission f90482l = new ProviderConfigurationPermission(BouncyCastleProvider.PROVIDER_NAME, ConfigurableProvider.ADDITIONAL_EC_PARAMETERS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile ECParameterSpec f90485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Object f90486d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f90483a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f90484b = new ThreadLocal();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Set f90487e = new HashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile Map f90488f = new HashMap();

    public final void a(String str, Object obj) {
        ThreadLocal threadLocal;
        SecurityManager securityManager = System.getSecurityManager();
        if (str.equals(ConfigurableProvider.THREAD_LOCAL_EC_IMPLICITLY_CA)) {
            if (securityManager != null) {
                securityManager.checkPermission(f90477g);
            }
            ECParameterSpec eCParameterSpecConvertSpec = ((obj instanceof ECParameterSpec) || obj == null) ? (ECParameterSpec) obj : EC5Util.convertSpec((java.security.spec.ECParameterSpec) obj);
            if (eCParameterSpecConvertSpec != null) {
                this.f90483a.set(eCParameterSpecConvertSpec);
                return;
            }
            threadLocal = this.f90483a;
        } else {
            if (str.equals(ConfigurableProvider.EC_IMPLICITLY_CA)) {
                if (securityManager != null) {
                    securityManager.checkPermission(f90478h);
                }
                if ((obj instanceof ECParameterSpec) || obj == null) {
                    this.f90485c = (ECParameterSpec) obj;
                    return;
                } else {
                    this.f90485c = EC5Util.convertSpec((java.security.spec.ECParameterSpec) obj);
                    return;
                }
            }
            if (!str.equals(ConfigurableProvider.THREAD_LOCAL_DH_DEFAULT_PARAMS)) {
                if (str.equals(ConfigurableProvider.DH_DEFAULT_PARAMS)) {
                    if (securityManager != null) {
                        securityManager.checkPermission(f90480j);
                    }
                    if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                        throw new IllegalArgumentException("not a valid DHParameterSpec or DHParameterSpec[]");
                    }
                    this.f90486d = obj;
                    return;
                }
                if (str.equals(ConfigurableProvider.ACCEPTABLE_EC_CURVES)) {
                    if (securityManager != null) {
                        securityManager.checkPermission(f90481k);
                    }
                    this.f90487e = (Set) obj;
                    return;
                } else {
                    if (str.equals(ConfigurableProvider.ADDITIONAL_EC_PARAMETERS)) {
                        if (securityManager != null) {
                            securityManager.checkPermission(f90482l);
                        }
                        this.f90488f = (Map) obj;
                        return;
                    }
                    return;
                }
            }
            if (securityManager != null) {
                securityManager.checkPermission(f90479i);
            }
            if (!(obj instanceof DHParameterSpec) && !(obj instanceof DHParameterSpec[]) && obj != null) {
                throw new IllegalArgumentException("not a valid DHParameterSpec");
            }
            threadLocal = this.f90484b;
            if (obj != null) {
                threadLocal.set(obj);
                return;
            }
        }
        threadLocal.remove();
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public final Set getAcceptableNamedCurves() {
        return Collections.unmodifiableSet(this.f90487e);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public final Map getAdditionalECParameters() {
        return Collections.unmodifiableMap(this.f90488f);
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public final DHParameterSpec getDHDefaultParameters(int i10) {
        Object obj = this.f90484b.get();
        if (obj == null) {
            obj = this.f90486d;
        }
        if (obj instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) obj;
            if (dHParameterSpec.getP().bitLength() == i10) {
                return dHParameterSpec;
            }
        } else if (obj instanceof DHParameterSpec[]) {
            DHParameterSpec[] dHParameterSpecArr = (DHParameterSpec[]) obj;
            for (int i11 = 0; i11 != dHParameterSpecArr.length; i11++) {
                if (dHParameterSpecArr[i11].getP().bitLength() == i10) {
                    return dHParameterSpecArr[i11];
                }
            }
        }
        DHParameters dHParameters = (DHParameters) CryptoServicesRegistrar.getSizedProperty(CryptoServicesRegistrar.Property.DH_DEFAULT_PARAMS, i10);
        if (dHParameters != null) {
            return new DHDomainParameterSpec(dHParameters);
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public final DSAParameterSpec getDSADefaultParameters(int i10) {
        DSAParameters dSAParameters = (DSAParameters) CryptoServicesRegistrar.getSizedProperty(CryptoServicesRegistrar.Property.DSA_DEFAULT_PARAMS, i10);
        if (dSAParameters != null) {
            return new DSAParameterSpec(dSAParameters.getP(), dSAParameters.getQ(), dSAParameters.getG());
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.config.ProviderConfiguration
    public final ECParameterSpec getEcImplicitlyCa() {
        ECParameterSpec eCParameterSpec = (ECParameterSpec) this.f90483a.get();
        return eCParameterSpec != null ? eCParameterSpec : this.f90485c;
    }
}
