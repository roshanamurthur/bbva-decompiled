package org.bouncycastle.jcajce.provider.symmetric;

import androidx.camera.camera2.internal.h0;
import androidx.collection.a;
import androidx.databinding.e;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.KeySpec;
import java.util.HashMap;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.PasswordConverter;
import org.bouncycastle.jcajce.PBKDF2Key;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory;
import org.bouncycastle.jcajce.provider.symmetric.util.PBE;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes8.dex */
public class PBEPBKDF2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f90169a;

    public static class AlgParams extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PBKDF2Params f90170a;

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded() {
            try {
                return this.f90170a.getEncoded(ASN1Encoding.DER);
            } catch (IOException e5) {
                throw new RuntimeException("Oooops! " + e5.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF2 PBE parameters algorithm parameters object");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.f90170a = new PBKDF2Params(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        }

        @Override // java.security.AlgorithmParametersSpi
        public String engineToString() {
            return "PBKDF2 Parameters";
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        public AlgorithmParameterSpec localEngineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class) {
                return new PBEParameterSpec(this.f90170a.getSalt(), this.f90170a.getIterationCount().intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF2 PBE parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        public byte[] engineGetEncoded(String str) {
            if (isASN1FormatString(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr) throws IOException {
            this.f90170a = PBKDF2Params.getInstance(ASN1Primitive.fromByteArray(bArr));
        }

        @Override // java.security.AlgorithmParametersSpi
        public void engineInit(byte[] bArr, String str) throws IOException {
            if (!isASN1FormatString(str)) {
                throw new IOException("Unknown parameters format in PBKDF2 parameters object");
            }
            engineInit(bArr);
        }
    }

    public static class BasePBKDF2 extends BaseSecretKeyFactory {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final int f90171p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f90172q0;

        public BasePBKDF2(String str, int i10) {
            this(str, i10, 1);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseSecretKeyFactory, javax.crypto.SecretKeyFactorySpi
        public SecretKey engineGenerateSecret(KeySpec keySpec) throws InvalidKeySpecException {
            if (!(keySpec instanceof PBEKeySpec)) {
                throw new InvalidKeySpecException("Invalid KeySpec");
            }
            PBEKeySpec pBEKeySpec = (PBEKeySpec) keySpec;
            byte[] salt = pBEKeySpec.getSalt();
            int i10 = this.f90171p0;
            if (salt == null) {
                return new PBKDF2Key(pBEKeySpec.getPassword(), i10 == 1 ? PasswordConverter.ASCII : PasswordConverter.UTF8);
            }
            if (pBEKeySpec.getIterationCount() <= 0) {
                throw new InvalidKeySpecException("positive iteration count required: " + pBEKeySpec.getIterationCount());
            }
            if (pBEKeySpec.getKeyLength() <= 0) {
                throw new InvalidKeySpecException("positive key length required: " + pBEKeySpec.getKeyLength());
            }
            if (pBEKeySpec.getPassword().length == 0) {
                throw new IllegalArgumentException("password empty");
            }
            if (!(pBEKeySpec instanceof PBKDF2KeySpec)) {
                int i11 = this.f90172q0;
                int keyLength = pBEKeySpec.getKeyLength();
                return new BCPBEKey(this.algName, this.algOid, this.f90171p0, i11, keyLength, -1, pBEKeySpec, PBE.Util.makePBEMacParameters(pBEKeySpec, i10, i11, keyLength));
            }
            ASN1ObjectIdentifier algorithm = ((PBKDF2KeySpec) pBEKeySpec).getPrf().getAlgorithm();
            Integer num = (Integer) PBEPBKDF2.f90169a.get(algorithm);
            if (num != null) {
                int iIntValue = num.intValue();
                int keyLength2 = pBEKeySpec.getKeyLength();
                return new BCPBEKey(this.algName, this.algOid, this.f90171p0, iIntValue, keyLength2, -1, pBEKeySpec, PBE.Util.makePBEMacParameters(pBEKeySpec, i10, iIntValue, keyLength2));
            }
            throw new InvalidKeySpecException("Invalid KeySpec: unknown PRF algorithm " + algorithm);
        }

        public BasePBKDF2(String str, int i10, int i11) {
            super(str, PKCSObjectIdentifiers.id_PBKDF2);
            this.f90171p0 = i10;
            this.f90172q0 = i11;
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f90173a = PBEPBKDF2.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            String str = f90173a;
            StringBuilder sbD = a.d(str, "$AlgParams", configurableProvider, "AlgorithmParameters.PBKDF2", "Alg.Alias.AlgorithmParameters.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.id_PBKDF2;
            h0.c(sbD, aSN1ObjectIdentifier, configurableProvider, "PBKDF2");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2", str.concat("$PBKDF2withUTF8"));
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1", "PBKDF2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1ANDUTF8", "PBKDF2");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory." + aSN1ObjectIdentifier, "PBKDF2");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHASCII", str.concat("$PBKDF2with8BIT"));
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITH8BIT", "PBKDF2WITHASCII");
            configurableProvider.addAlgorithm("Alg.Alias.SecretKeyFactory.PBKDF2WITHHMACSHA1AND8BIT", "PBKDF2WITHASCII");
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA256", e.d(str, "$PBKDF2withSHA224", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA224", "$PBKDF2withSHA256"));
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA512", e.d(str, "$PBKDF2withSHA384", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA384", "$PBKDF2withSHA512"));
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA3-256", e.d(str, "$PBKDF2withSHA3_224", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA3-224", "$PBKDF2withSHA3_256"));
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSHA3-512", e.d(str, "$PBKDF2withSHA3_384", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACSHA3-384", "$PBKDF2withSHA3_512"));
            configurableProvider.addAlgorithm("SecretKeyFactory.PBKDF2WITHHMACSM3", e.d(str, "$PBKDF2withGOST3411", configurableProvider, "SecretKeyFactory.PBKDF2WITHHMACGOST3411", "$PBKDF2withSM3"));
        }
    }

    public static class PBKDF2with8BIT extends BasePBKDF2 {
        public PBKDF2with8BIT() {
            super("PBKDF2", 1);
        }
    }

    public static class PBKDF2withGOST3411 extends BasePBKDF2 {
        public PBKDF2withGOST3411() {
            super("PBKDF2", 5, 6);
        }
    }

    public static class PBKDF2withSHA224 extends BasePBKDF2 {
        public PBKDF2withSHA224() {
            super("PBKDF2", 5, 7);
        }
    }

    public static class PBKDF2withSHA256 extends BasePBKDF2 {
        public PBKDF2withSHA256() {
            super("PBKDF2", 5, 4);
        }
    }

    public static class PBKDF2withSHA384 extends BasePBKDF2 {
        public PBKDF2withSHA384() {
            super("PBKDF2", 5, 8);
        }
    }

    public static class PBKDF2withSHA3_224 extends BasePBKDF2 {
        public PBKDF2withSHA3_224() {
            super("PBKDF2", 5, 10);
        }
    }

    public static class PBKDF2withSHA3_256 extends BasePBKDF2 {
        public PBKDF2withSHA3_256() {
            super("PBKDF2", 5, 11);
        }
    }

    public static class PBKDF2withSHA3_384 extends BasePBKDF2 {
        public PBKDF2withSHA3_384() {
            super("PBKDF2", 5, 12);
        }
    }

    public static class PBKDF2withSHA3_512 extends BasePBKDF2 {
        public PBKDF2withSHA3_512() {
            super("PBKDF2", 5, 13);
        }
    }

    public static class PBKDF2withSHA512 extends BasePBKDF2 {
        public PBKDF2withSHA512() {
            super("PBKDF2", 5, 9);
        }
    }

    public static class PBKDF2withSM3 extends BasePBKDF2 {
        public PBKDF2withSM3() {
            super("PBKDF2", 5, 14);
        }
    }

    public static class PBKDF2withUTF8 extends BasePBKDF2 {
        public PBKDF2withUTF8() {
            super("PBKDF2", 5);
        }
    }

    static {
        HashMap map = new HashMap();
        f90169a = map;
        map.put(CryptoProObjectIdentifiers.gostR3411Hmac, Integers.valueOf(6));
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA1, Integers.valueOf(1));
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA256, Integers.valueOf(4));
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA224, Integers.valueOf(7));
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA384, Integers.valueOf(8));
        map.put(PKCSObjectIdentifiers.id_hmacWithSHA512, Integers.valueOf(9));
        map.put(NISTObjectIdentifiers.id_hmacWithSHA3_256, Integers.valueOf(11));
        map.put(NISTObjectIdentifiers.id_hmacWithSHA3_224, Integers.valueOf(10));
        map.put(NISTObjectIdentifiers.id_hmacWithSHA3_384, Integers.valueOf(12));
        map.put(NISTObjectIdentifiers.id_hmacWithSHA3_512, Integers.valueOf(13));
        map.put(GMObjectIdentifiers.hmac_sm3, Integers.valueOf(14));
    }
}
