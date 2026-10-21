package org.bouncycastle.jcajce.provider.util;

import java.util.HashMap;
import java.util.HashSet;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class DigestFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f90241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f90242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f90243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final HashSet f90244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashSet f90245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashSet f90246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final HashSet f90247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashSet f90248h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final HashSet f90249i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f90250j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final HashSet f90251k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashSet f90252l;
    public static final HashMap m;

    static {
        HashSet hashSet = new HashSet();
        f90241a = hashSet;
        HashSet hashSet2 = new HashSet();
        f90242b = hashSet2;
        HashSet hashSet3 = new HashSet();
        f90243c = hashSet3;
        HashSet hashSet4 = new HashSet();
        f90244d = hashSet4;
        HashSet hashSet5 = new HashSet();
        f90245e = hashSet5;
        HashSet hashSet6 = new HashSet();
        f90246f = hashSet6;
        HashSet hashSet7 = new HashSet();
        f90247g = hashSet7;
        HashSet hashSet8 = new HashSet();
        f90248h = hashSet8;
        HashSet hashSet9 = new HashSet();
        f90249i = hashSet9;
        HashSet hashSet10 = new HashSet();
        f90250j = hashSet10;
        HashSet hashSet11 = new HashSet();
        f90251k = hashSet11;
        HashSet hashSet12 = new HashSet();
        f90252l = hashSet12;
        HashMap map = new HashMap();
        m = map;
        hashSet.add("MD5");
        ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.md5;
        hashSet.add(aSN1ObjectIdentifier.getId());
        hashSet2.add("SHA1");
        hashSet2.add(McElieceCCA2KeyGenParameterSpec.SHA1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = OIWObjectIdentifiers.idSHA1;
        hashSet2.add(aSN1ObjectIdentifier2.getId());
        hashSet3.add("SHA224");
        hashSet3.add(McElieceCCA2KeyGenParameterSpec.SHA224);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_sha224;
        hashSet3.add(aSN1ObjectIdentifier3.getId());
        hashSet4.add("SHA256");
        hashSet4.add("SHA-256");
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_sha256;
        hashSet4.add(aSN1ObjectIdentifier4.getId());
        hashSet5.add("SHA384");
        hashSet5.add(McElieceCCA2KeyGenParameterSpec.SHA384);
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_sha384;
        hashSet5.add(aSN1ObjectIdentifier5.getId());
        hashSet6.add("SHA512");
        hashSet6.add("SHA-512");
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_sha512;
        hashSet6.add(aSN1ObjectIdentifier6.getId());
        hashSet7.add("SHA512(224)");
        hashSet7.add("SHA-512(224)");
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_sha512_224;
        hashSet7.add(aSN1ObjectIdentifier7.getId());
        hashSet8.add("SHA512(256)");
        hashSet8.add("SHA-512(256)");
        ASN1ObjectIdentifier aSN1ObjectIdentifier8 = NISTObjectIdentifiers.id_sha512_256;
        hashSet8.add(aSN1ObjectIdentifier8.getId());
        hashSet9.add("SHA3-224");
        ASN1ObjectIdentifier aSN1ObjectIdentifier9 = NISTObjectIdentifiers.id_sha3_224;
        hashSet9.add(aSN1ObjectIdentifier9.getId());
        hashSet10.add("SHA3-256");
        ASN1ObjectIdentifier aSN1ObjectIdentifier10 = NISTObjectIdentifiers.id_sha3_256;
        hashSet10.add(aSN1ObjectIdentifier10.getId());
        hashSet11.add("SHA3-384");
        ASN1ObjectIdentifier aSN1ObjectIdentifier11 = NISTObjectIdentifiers.id_sha3_384;
        hashSet11.add(aSN1ObjectIdentifier11.getId());
        hashSet12.add("SHA3-512");
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = NISTObjectIdentifiers.id_sha3_512;
        hashSet12.add(aSN1ObjectIdentifier12.getId());
        map.put("MD5", aSN1ObjectIdentifier);
        map.put(aSN1ObjectIdentifier.getId(), aSN1ObjectIdentifier);
        map.put("SHA1", aSN1ObjectIdentifier2);
        map.put(McElieceCCA2KeyGenParameterSpec.SHA1, aSN1ObjectIdentifier2);
        map.put(aSN1ObjectIdentifier2.getId(), aSN1ObjectIdentifier2);
        map.put("SHA224", aSN1ObjectIdentifier3);
        map.put(McElieceCCA2KeyGenParameterSpec.SHA224, aSN1ObjectIdentifier3);
        map.put(aSN1ObjectIdentifier3.getId(), aSN1ObjectIdentifier3);
        map.put("SHA256", aSN1ObjectIdentifier4);
        map.put("SHA-256", aSN1ObjectIdentifier4);
        map.put(aSN1ObjectIdentifier4.getId(), aSN1ObjectIdentifier4);
        map.put("SHA384", aSN1ObjectIdentifier5);
        map.put(McElieceCCA2KeyGenParameterSpec.SHA384, aSN1ObjectIdentifier5);
        map.put(aSN1ObjectIdentifier5.getId(), aSN1ObjectIdentifier5);
        map.put("SHA512", aSN1ObjectIdentifier6);
        map.put("SHA-512", aSN1ObjectIdentifier6);
        map.put(aSN1ObjectIdentifier6.getId(), aSN1ObjectIdentifier6);
        map.put("SHA512(224)", aSN1ObjectIdentifier7);
        map.put("SHA-512(224)", aSN1ObjectIdentifier7);
        map.put(aSN1ObjectIdentifier7.getId(), aSN1ObjectIdentifier7);
        map.put("SHA512(256)", aSN1ObjectIdentifier8);
        map.put("SHA-512(256)", aSN1ObjectIdentifier8);
        map.put(aSN1ObjectIdentifier8.getId(), aSN1ObjectIdentifier8);
        map.put("SHA3-224", aSN1ObjectIdentifier9);
        map.put(aSN1ObjectIdentifier9.getId(), aSN1ObjectIdentifier9);
        map.put("SHA3-256", aSN1ObjectIdentifier10);
        map.put(aSN1ObjectIdentifier10.getId(), aSN1ObjectIdentifier10);
        map.put("SHA3-384", aSN1ObjectIdentifier11);
        map.put(aSN1ObjectIdentifier11.getId(), aSN1ObjectIdentifier11);
        map.put("SHA3-512", aSN1ObjectIdentifier12);
        map.put(aSN1ObjectIdentifier12.getId(), aSN1ObjectIdentifier12);
    }

    public static Digest getDigest(String str) {
        String upperCase = Strings.toUpperCase(str);
        if (f90242b.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA1();
        }
        if (f90241a.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createMD5();
        }
        if (f90243c.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA224();
        }
        if (f90244d.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA256();
        }
        if (f90245e.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA384();
        }
        if (f90246f.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA512();
        }
        if (f90247g.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA512_224();
        }
        if (f90248h.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA512_256();
        }
        if (f90249i.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_224();
        }
        if (f90250j.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_256();
        }
        if (f90251k.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_384();
        }
        if (f90252l.contains(upperCase)) {
            return org.bouncycastle.crypto.util.DigestFactory.createSHA3_512();
        }
        return null;
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) m.get(str);
    }

    public static boolean isSameDigest(String str, String str2) {
        HashSet hashSet = f90242b;
        if (!hashSet.contains(str) || !hashSet.contains(str2)) {
            HashSet hashSet2 = f90243c;
            if (!hashSet2.contains(str) || !hashSet2.contains(str2)) {
                HashSet hashSet3 = f90244d;
                if (!hashSet3.contains(str) || !hashSet3.contains(str2)) {
                    HashSet hashSet4 = f90245e;
                    if (!hashSet4.contains(str) || !hashSet4.contains(str2)) {
                        HashSet hashSet5 = f90246f;
                        if (!hashSet5.contains(str) || !hashSet5.contains(str2)) {
                            HashSet hashSet6 = f90247g;
                            if (!hashSet6.contains(str) || !hashSet6.contains(str2)) {
                                HashSet hashSet7 = f90248h;
                                if (!hashSet7.contains(str) || !hashSet7.contains(str2)) {
                                    HashSet hashSet8 = f90249i;
                                    if (!hashSet8.contains(str) || !hashSet8.contains(str2)) {
                                        HashSet hashSet9 = f90250j;
                                        if (!hashSet9.contains(str) || !hashSet9.contains(str2)) {
                                            HashSet hashSet10 = f90251k;
                                            if (!hashSet10.contains(str) || !hashSet10.contains(str2)) {
                                                HashSet hashSet11 = f90252l;
                                                if (!hashSet11.contains(str) || !hashSet11.contains(str2)) {
                                                    HashSet hashSet12 = f90241a;
                                                    if (!hashSet12.contains(str) || !hashSet12.contains(str2)) {
                                                        return false;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }
}
