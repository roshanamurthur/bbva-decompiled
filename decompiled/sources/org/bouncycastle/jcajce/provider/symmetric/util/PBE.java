package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.GOST3411Digest;
import org.bouncycastle.crypto.digests.MD2Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.crypto.digests.TigerDigest;
import org.bouncycastle.crypto.generators.OpenSSLPBEParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.params.DESParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.DigestFactory;

/* JADX INFO: loaded from: classes8.dex */
public interface PBE {
    public static final int GOST3411 = 6;
    public static final int MD2 = 5;
    public static final int MD5 = 0;
    public static final int OPENSSL = 3;
    public static final int PKCS12 = 2;
    public static final int PKCS5S1 = 0;
    public static final int PKCS5S1_UTF8 = 4;
    public static final int PKCS5S2 = 1;
    public static final int PKCS5S2_UTF8 = 5;
    public static final int RIPEMD160 = 2;
    public static final int SHA1 = 1;
    public static final int SHA224 = 7;
    public static final int SHA256 = 4;
    public static final int SHA384 = 8;
    public static final int SHA3_224 = 10;
    public static final int SHA3_256 = 11;
    public static final int SHA3_384 = 12;
    public static final int SHA3_512 = 13;
    public static final int SHA512 = 9;
    public static final int SM3 = 14;
    public static final int TIGER = 3;

    public static class Util {
        public static byte[] a(int i10, PBEKeySpec pBEKeySpec) {
            if (i10 == 2) {
                return PBEParametersGenerator.PKCS12PasswordToBytes(pBEKeySpec.getPassword());
            }
            return (i10 == 5 || i10 == 4) ? PBEParametersGenerator.PKCS5PasswordToUTF8Bytes(pBEKeySpec.getPassword()) : PBEParametersGenerator.PKCS5PasswordToBytes(pBEKeySpec.getPassword());
        }

        public static PBEParametersGenerator b(int i10, int i11) {
            if (i10 == 0 || i10 == 4) {
                if (i11 == 0) {
                    return new PKCS5S1ParametersGenerator(DigestFactory.createMD5());
                }
                if (i11 == 1) {
                    return new PKCS5S1ParametersGenerator(DigestFactory.createSHA1());
                }
                if (i11 == 5) {
                    return new PKCS5S1ParametersGenerator(new MD2Digest());
                }
                throw new IllegalStateException("PKCS5 scheme 1 only supports MD2, MD5 and SHA1.");
            }
            if (i10 != 1 && i10 != 5) {
                if (i10 != 2) {
                    return new OpenSSLPBEParametersGenerator();
                }
                switch (i11) {
                    case 0:
                        return new PKCS12ParametersGenerator(DigestFactory.createMD5());
                    case 1:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA1());
                    case 2:
                        return new PKCS12ParametersGenerator(new RIPEMD160Digest());
                    case 3:
                        return new PKCS12ParametersGenerator(new TigerDigest());
                    case 4:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA256());
                    case 5:
                        return new PKCS12ParametersGenerator(new MD2Digest());
                    case 6:
                        return new PKCS12ParametersGenerator(new GOST3411Digest());
                    case 7:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA224());
                    case 8:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA384());
                    case 9:
                        return new PKCS12ParametersGenerator(DigestFactory.createSHA512());
                    default:
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                }
            }
            switch (i11) {
                case 0:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createMD5());
                case 1:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA1());
                case 2:
                    return new PKCS5S2ParametersGenerator(new RIPEMD160Digest());
                case 3:
                    return new PKCS5S2ParametersGenerator(new TigerDigest());
                case 4:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA256());
                case 5:
                    return new PKCS5S2ParametersGenerator(new MD2Digest());
                case 6:
                    return new PKCS5S2ParametersGenerator(new GOST3411Digest());
                case 7:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA224());
                case 8:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA384());
                case 9:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA512());
                case 10:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_224());
                case 11:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_256());
                case 12:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_384());
                case 13:
                    return new PKCS5S2ParametersGenerator(DigestFactory.createSHA3_512());
                case 14:
                    return new PKCS5S2ParametersGenerator(new SM3Digest());
                default:
                    throw new IllegalStateException("unknown digest scheme for PBE PKCS5S2 encryption.");
            }
        }

        public static CipherParameters makePBEMacParameters(SecretKey secretKey, int i10, int i11, int i12, PBEParameterSpec pBEParameterSpec) {
            PBEParametersGenerator pBEParametersGeneratorB = b(i10, i11);
            byte[] encoded = secretKey.getEncoded();
            pBEParametersGeneratorB.init(secretKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedMacParameters = pBEParametersGeneratorB.generateDerivedMacParameters(i12);
            for (int i13 = 0; i13 != encoded.length; i13++) {
                encoded[i13] = 0;
            }
            return cipherParametersGenerateDerivedMacParameters;
        }

        public static CipherParameters makePBEParameters(PBEKeySpec pBEKeySpec, int i10, int i11, int i12, int i13) {
            PBEParametersGenerator pBEParametersGeneratorB = b(i10, i11);
            byte[] bArrA = a(i10, pBEKeySpec);
            pBEParametersGeneratorB.init(bArrA, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedParameters = i13 != 0 ? pBEParametersGeneratorB.generateDerivedParameters(i12, i13) : pBEParametersGeneratorB.generateDerivedParameters(i12);
            for (int i14 = 0; i14 != bArrA.length; i14++) {
                bArrA[i14] = 0;
            }
            return cipherParametersGenerateDerivedParameters;
        }

        public static CipherParameters makePBEMacParameters(PBEKeySpec pBEKeySpec, int i10, int i11, int i12) {
            PBEParametersGenerator pBEParametersGeneratorB = b(i10, i11);
            byte[] bArrA = a(i10, pBEKeySpec);
            pBEParametersGeneratorB.init(bArrA, pBEKeySpec.getSalt(), pBEKeySpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedMacParameters = pBEParametersGeneratorB.generateDerivedMacParameters(i12);
            for (int i13 = 0; i13 != bArrA.length; i13++) {
                bArrA[i13] = 0;
            }
            return cipherParametersGenerateDerivedMacParameters;
        }

        public static CipherParameters makePBEParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec, String str) {
            CipherParameters cipherParametersGenerateDerivedParameters;
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            bCPBEKey.getClass();
            BCPBEKey.a(bCPBEKey);
            BCPBEKey.a(bCPBEKey);
            PBEParametersGenerator pBEParametersGeneratorB = b(bCPBEKey.f90208s0, bCPBEKey.f90209t0);
            byte[] encoded = bCPBEKey.getEncoded();
            if (bCPBEKey.F0) {
                encoded = new byte[2];
            }
            pBEParametersGeneratorB.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            int ivSize = bCPBEKey.getIvSize();
            int i10 = bCPBEKey.f90210u0;
            if (ivSize != 0) {
                BCPBEKey.a(bCPBEKey);
                cipherParametersGenerateDerivedParameters = pBEParametersGeneratorB.generateDerivedParameters(i10, bCPBEKey.getIvSize());
            } else {
                BCPBEKey.a(bCPBEKey);
                cipherParametersGenerateDerivedParameters = pBEParametersGeneratorB.generateDerivedParameters(i10);
            }
            if (str.startsWith("DES")) {
                if (cipherParametersGenerateDerivedParameters instanceof ParametersWithIV) {
                    DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) cipherParametersGenerateDerivedParameters).getParameters()).getKey());
                } else {
                    DESParameters.setOddParity(((KeyParameter) cipherParametersGenerateDerivedParameters).getKey());
                }
            }
            return cipherParametersGenerateDerivedParameters;
        }

        public static CipherParameters makePBEMacParameters(BCPBEKey bCPBEKey, AlgorithmParameterSpec algorithmParameterSpec) {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            bCPBEKey.getClass();
            BCPBEKey.a(bCPBEKey);
            BCPBEKey.a(bCPBEKey);
            PBEParametersGenerator pBEParametersGeneratorB = b(bCPBEKey.f90208s0, bCPBEKey.f90209t0);
            pBEParametersGeneratorB.init(bCPBEKey.getEncoded(), pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            BCPBEKey.a(bCPBEKey);
            return pBEParametersGeneratorB.generateDerivedMacParameters(bCPBEKey.f90210u0);
        }

        public static CipherParameters makePBEParameters(byte[] bArr, int i10, int i11, int i12, int i13, AlgorithmParameterSpec algorithmParameterSpec, String str) throws InvalidAlgorithmParameterException {
            if (algorithmParameterSpec == null || !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("Need a PBEParameter spec with a PBE key.");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            PBEParametersGenerator pBEParametersGeneratorB = b(i10, i11);
            pBEParametersGeneratorB.init(bArr, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
            CipherParameters cipherParametersGenerateDerivedParameters = i13 != 0 ? pBEParametersGeneratorB.generateDerivedParameters(i12, i13) : pBEParametersGeneratorB.generateDerivedParameters(i12);
            if (str.startsWith("DES")) {
                if (cipherParametersGenerateDerivedParameters instanceof ParametersWithIV) {
                    DESParameters.setOddParity(((KeyParameter) ((ParametersWithIV) cipherParametersGenerateDerivedParameters).getParameters()).getKey());
                } else {
                    DESParameters.setOddParity(((KeyParameter) cipherParametersGenerateDerivedParameters).getKey());
                }
            }
            return cipherParametersGenerateDerivedParameters;
        }
    }
}
