package org.bouncycastle.crypto;

import com.vierge.bluetoothlibrary.BluetoothState;
import java.math.BigInteger;
import java.security.AccessController;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHValidationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAValidationParameters;
import org.bouncycastle.util.encoders.Hex;

/* JADX INFO: loaded from: classes2.dex */
public final class CryptoServicesRegistrar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CryptoServicesPermission f87856a = new CryptoServicesPermission(CryptoServicesPermission.GLOBAL_CONFIG);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final CryptoServicesPermission f87857b = new CryptoServicesPermission(CryptoServicesPermission.THREAD_LOCAL_CONFIG);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CryptoServicesPermission f87858c = new CryptoServicesPermission(CryptoServicesPermission.DEFAULT_RANDOM);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ThreadLocal<Map<String, Object[]>> f87859d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map<String, Object[]> f87860e = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f87861f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static SecureRandom f87862g;

    public static final class Property {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f87864b;
        public static final Property EC_IMPLICITLY_CA = new Property("ecImplicitlyCA", X9ECParameters.class);
        public static final Property DH_DEFAULT_PARAMS = new Property("dhDefaultParams", DHParameters.class);
        public static final Property DSA_DEFAULT_PARAMS = new Property("dsaDefaultParams", DSAParameters.class);

        public Property(String str, Class cls) {
            this.f87863a = str;
            this.f87864b = cls;
        }
    }

    static {
        DSAParameters dSAParameters = new DSAParameters(new BigInteger("fca682ce8e12caba26efccf7110e526db078b05edecbcd1eb4a208f3ae1617ae01f35b91a47e6df63413c5e12ed0899bcd132acd50d99151bdc43ee737592e17", 16), new BigInteger("962eddcc369cba8ebb260ee6b6a126d9346e38c5", 16), new BigInteger("678471b27a9cf44ee91a49c5147db1a9aaf244f05a434d6486931d2d14271b9e35030b71fd73da179069b32e2935630e1c2062354d0da20a6c416e50be794ca4", 16), new DSAValidationParameters(Hex.decodeStrict("b869c82b35d70e1b1ff91b28e37a62ecdc34409b"), 123));
        DSAParameters dSAParameters2 = new DSAParameters(new BigInteger("e9e642599d355f37c97ffd3567120b8e25c9cd43e927b3a9670fbec5d890141922d2c3b3ad2480093799869d1e846aab49fab0ad26d2ce6a22219d470bce7d777d4a21fbe9c270b57f607002f3cef8393694cf45ee3688c11a8c56ab127a3daf", 16), new BigInteger("9cdbd84c9f1ac2f38d0f80f42ab952e7338bf511", 16), new BigInteger("30470ad5a005fb14ce2d9dcd87e38bc7d1b1c5facbaecbe95f190aa7a31d23c4dbbcbe06174544401a5b2c020965d8c2bd2171d3668445771f74ba084d2029d83c1c158547f3a9f1a2715be23d51ae4d3e5a1f6a7064f316933a346d3f529252", 16), new DSAValidationParameters(Hex.decodeStrict("77d0f8c4dad15eb8c4f2f8d6726cefd96d5bb399"), 263));
        DSAParameters dSAParameters3 = new DSAParameters(new BigInteger("fd7f53811d75122952df4a9c2eece4e7f611b7523cef4400c31e3f80b6512669455d402251fb593d8d58fabfc5f5ba30f6cb9b556cd7813b801d346ff26660b76b9950a5a49f9fe8047b1022c24fbba9d7feb7c61bf83b57e7c6a8a6150f04fb83f6d3c51ec3023554135a169132f675f3ae2b61d72aeff22203199dd14801c7", 16), new BigInteger("9760508f15230bccb292b982a2eb840bf0581cf5", 16), new BigInteger("f7e1a085d69b3ddecbbcab5c36b857b97994afbbfa3aea82f9574c0b3d0782675159578ebad4594fe67107108180b449167123e84c281613b7cf09328cc8a6e13c167a8b547c8d28e0a3ae1e2bb3a675916ea37f0bfa213562f1fb627a01243bcca4f1bea8519089a883dfe15ae59f06928b665e807b552564014c3bfecf492a", 16), new DSAValidationParameters(Hex.decodeStrict("8d5155894229d5e689ee01e6018a237e2cae64cd"), 92));
        DSAParameters dSAParameters4 = new DSAParameters(new BigInteger("95475cf5d93e596c3fcd1d902add02f427f5f3c7210313bb45fb4d5bb2e5fe1cbd678cd4bbdd84c9836be1f31c0777725aeb6c2fc38b85f48076fa76bcd8146cc89a6fb2f706dd719898c2083dc8d896f84062e2c9c94d137b054a8d8096adb8d51952398eeca852a0af12df83e475aa65d4ec0c38a9560d5661186ff98b9fc9eb60eee8b030376b236bc73be3acdbd74fd61c1d2475fa3077b8f080467881ff7e1ca56fee066d79506ade51edbb5443a563927dbc4ba520086746175c8885925ebc64c6147906773496990cb714ec667304e261faee33b3cbdf008e0c3fa90650d97d3909c9275bf4ac86ffcb3d03e6dfc8ada5934242dd6d3bcca2a406cb0b", 16), new BigInteger("f8183668ba5fc5bb06b5981e6d8b795d30b8978d43ca0ec572e37e09939a9773", 16), new BigInteger("42debb9da5b3d88cc956e08787ec3f3a09bba5f48b889a74aaf53174aa0fbe7e3c5b8fcd7a53bef563b0e98560328960a9517f4014d3325fc7962bf1e049370d76d1314a76137e792f3f0db859d095e4a5b932024f079ecf2ef09c797452b0770e1350782ed57ddf794979dcef23cb96f183061965c4ebc93c9c71c56b925955a75f94cccf1449ac43d586d0beee43251b0b2287349d68de0d144403f13e802f4146d882e057af19b6f6275c6676c8fa0e3ca2713a3257fd1b27d0639f695e347d8d1cf9ac819a26ca9b04cb0eb9b7b035988d15bbac65212a55239cfc7e58fae38d7250ab9991ffbc97134025fe8ce04c4399ad96569be91a546f4978693c7a", 16), new DSAValidationParameters(Hex.decodeStrict("b0b4417601b59cbc9d8ac8f935cadaec4f5fbb2f23785609ae466748d9b5a536"), 497));
        b(Property.DSA_DEFAULT_PARAMS, dSAParameters, dSAParameters2, dSAParameters3, dSAParameters4);
        b(Property.DH_DEFAULT_PARAMS, d(dSAParameters), d(dSAParameters2), d(dSAParameters3), d(dSAParameters4));
    }

    public static void a(CryptoServicesPermission cryptoServicesPermission) {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            AccessController.doPrivileged(new a(securityManager, cryptoServicesPermission));
        }
    }

    public static <T> void b(Property property, T... tArr) {
        if (!property.f87864b.isAssignableFrom(tArr[0].getClass())) {
            throw new IllegalArgumentException("Bad property value passed");
        }
        ThreadLocal<Map<String, Object[]>> threadLocal = f87859d;
        Map<String, Object[]> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        String str = property.f87863a;
        map.put(str, tArr);
        f87860e.put(str, tArr);
    }

    public static Object[] c(Property property) {
        String str;
        Map<String, Object[]> map = f87859d.get();
        if (map == null || !map.containsKey(property.f87863a)) {
            str = property.f87863a;
            map = f87860e;
        } else {
            str = property.f87863a;
        }
        return map.get(str);
    }

    public static <T> T[] clearGlobalProperty(Property property) {
        a(f87856a);
        ThreadLocal<Map<String, Object[]>> threadLocal = f87859d;
        Map<String, Object[]> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        map.remove(property.f87863a);
        return (T[]) f87860e.remove(property.f87863a);
    }

    public static <T> T[] clearThreadProperty(Property property) {
        a(f87857b);
        ThreadLocal<Map<String, Object[]>> threadLocal = f87859d;
        Map<String, Object[]> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        return (T[]) map.remove(property.f87863a);
    }

    public static DHParameters d(DSAParameters dSAParameters) {
        int i10;
        int iBitLength = dSAParameters.getP().bitLength();
        if (iBitLength <= 1024) {
            i10 = 160;
        } else if (iBitLength <= 2048) {
            i10 = 224;
        } else if (iBitLength <= 3072) {
            i10 = 256;
        } else {
            i10 = iBitLength <= 7680 ? BluetoothState.REQUEST_CONNECT_DEVICE : 512;
        }
        return new DHParameters(dSAParameters.getP(), dSAParameters.getG(), dSAParameters.getQ(), i10, 0, null, new DHValidationParameters(dSAParameters.getValidationParameters().getSeed(), dSAParameters.getValidationParameters().getCounter()));
    }

    public static <T> T getProperty(Property property) {
        Object[] objArrC = c(property);
        if (objArrC != null) {
            return (T) objArrC[0];
        }
        return null;
    }

    public static SecureRandom getSecureRandom() {
        SecureRandom secureRandom;
        Object obj = f87861f;
        synchronized (obj) {
            try {
                SecureRandom secureRandom2 = f87862g;
                if (secureRandom2 != null) {
                    return secureRandom2;
                }
                SecureRandom secureRandom3 = new SecureRandom();
                synchronized (obj) {
                    try {
                        if (f87862g == null) {
                            f87862g = secureRandom3;
                        }
                        secureRandom = f87862g;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return secureRandom;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v5, types: [T, org.bouncycastle.crypto.params.DSAParameters] */
    /* JADX WARN: Type inference failed for: r4v8, types: [T, org.bouncycastle.crypto.params.DHParameters] */
    public static <T> T getSizedProperty(Property property, int i10) {
        Object[] objArrC = c(property);
        if (objArrC == null) {
            return null;
        }
        Class cls = property.f87864b;
        int i11 = 0;
        if (cls.isAssignableFrom(DHParameters.class)) {
            while (i11 != objArrC.length) {
                ?? r4 = (T) ((DHParameters) objArrC[i11]);
                if (r4.getP().bitLength() == i10) {
                    return r4;
                }
                i11++;
            }
        } else if (cls.isAssignableFrom(DSAParameters.class)) {
            while (i11 != objArrC.length) {
                ?? r10 = (T) ((DSAParameters) objArrC[i11]);
                if (r10.getP().bitLength() == i10) {
                    return r10;
                }
                i11++;
            }
        }
        return null;
    }

    public static <T> void setGlobalProperty(Property property, T... tArr) {
        a(f87856a);
        b(property, (Object[]) tArr.clone());
    }

    public static void setSecureRandom(SecureRandom secureRandom) {
        a(f87858c);
        synchronized (f87861f) {
            f87862g = secureRandom;
        }
    }

    public static <T> void setThreadProperty(Property property, T... tArr) {
        a(f87857b);
        if (!property.f87864b.isAssignableFrom(tArr[0].getClass())) {
            throw new IllegalArgumentException("Bad property value passed");
        }
        Object[] objArr = (Object[]) tArr.clone();
        ThreadLocal<Map<String, Object[]>> threadLocal = f87859d;
        Map<String, Object[]> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<>();
            threadLocal.set(map);
        }
        map.put(property.f87863a, objArr);
    }

    public static <T> T[] getSizedProperty(Property property) {
        Object[] objArrC = c(property);
        if (objArrC == null) {
            return null;
        }
        return (T[]) ((Object[]) objArrC.clone());
    }
}
