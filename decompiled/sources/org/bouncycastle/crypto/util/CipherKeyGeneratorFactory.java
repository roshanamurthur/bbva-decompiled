package org.bouncycastle.crypto.util;

import java.security.SecureRandom;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.generators.DESKeyGenerator;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;

/* JADX INFO: loaded from: classes5.dex */
public class CipherKeyGeneratorFactory {
    public static CipherKeyGenerator a(int i10, SecureRandom secureRandom) {
        CipherKeyGenerator cipherKeyGenerator = new CipherKeyGenerator();
        cipherKeyGenerator.init(new KeyGenerationParameters(secureRandom, i10));
        return cipherKeyGenerator;
    }

    public static CipherKeyGenerator createKeyGenerator(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecureRandom secureRandom) throws IllegalArgumentException {
        if (NISTObjectIdentifiers.id_aes128_CBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(128, secureRandom);
        }
        if (NISTObjectIdentifiers.id_aes192_CBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(192, secureRandom);
        }
        if (NISTObjectIdentifiers.id_aes256_CBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(256, secureRandom);
        }
        if (NISTObjectIdentifiers.id_aes128_GCM.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(128, secureRandom);
        }
        if (NISTObjectIdentifiers.id_aes192_GCM.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(192, secureRandom);
        }
        if (NISTObjectIdentifiers.id_aes256_GCM.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(256, secureRandom);
        }
        if (PKCSObjectIdentifiers.des_EDE3_CBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            DESedeKeyGenerator dESedeKeyGenerator = new DESedeKeyGenerator();
            dESedeKeyGenerator.init(new KeyGenerationParameters(secureRandom, 192));
            return dESedeKeyGenerator;
        }
        if (NTTObjectIdentifiers.id_camellia128_cbc.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(128, secureRandom);
        }
        if (NTTObjectIdentifiers.id_camellia192_cbc.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(192, secureRandom);
        }
        if (NTTObjectIdentifiers.id_camellia256_cbc.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(256, secureRandom);
        }
        if (KISAObjectIdentifiers.id_seedCBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(128, secureRandom);
        }
        if (AlgorithmIdentifierFactory.f89610b.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(128, secureRandom);
        }
        if (OIWObjectIdentifiers.desCBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            DESKeyGenerator dESKeyGenerator = new DESKeyGenerator();
            dESKeyGenerator.init(new KeyGenerationParameters(secureRandom, 64));
            return dESKeyGenerator;
        }
        if (PKCSObjectIdentifiers.rc4.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(128, secureRandom);
        }
        if (PKCSObjectIdentifiers.RC2_CBC.equals((ASN1Primitive) aSN1ObjectIdentifier)) {
            return a(128, secureRandom);
        }
        throw new IllegalArgumentException("cannot recognise cipher: " + aSN1ObjectIdentifier);
    }
}
