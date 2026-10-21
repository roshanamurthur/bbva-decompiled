package org.bouncycastle.jce.provider;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.h0;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.PBEParametersGenerator;
import org.bouncycastle.crypto.digests.MD5Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.crypto.generators.PKCS12ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S1ParametersGenerator;
import org.bouncycastle.crypto.generators.PKCS5S2ParametersGenerator;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.RC5Parameters;
import org.bouncycastle.jcajce.provider.symmetric.util.BCPBEKey;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class BrokenJCEBlockCipher implements BrokenPBE {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class[] f90382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BufferedBlockCipher f90383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ParametersWithIV f90384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f90385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f90386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f90387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f90388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f90389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public AlgorithmParameters f90390i;

    public static class BrokePBEWithMD5AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithMD5AndDES() {
            super(new CBCBlockCipher(new DESEngine()), 0, 0, 64, 64);
        }
    }

    public static class BrokePBEWithSHA1AndDES extends BrokenJCEBlockCipher {
        public BrokePBEWithSHA1AndDES() {
            super(new CBCBlockCipher(new DESEngine()), 0, 1, 64, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES2Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES2Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 128, 64);
        }
    }

    public static class BrokePBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public BrokePBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndDES3Key extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndDES3Key() {
            super(new CBCBlockCipher(new DESedeEngine()), 3, 1, 192, 64);
        }
    }

    public static class OldPBEWithSHAAndTwofish extends BrokenJCEBlockCipher {
        public OldPBEWithSHAAndTwofish() {
            super(new CBCBlockCipher(new TwofishEngine()), 3, 1, 256, 128);
        }
    }

    public BrokenJCEBlockCipher(BlockCipher blockCipher) {
        this.f90382a = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.f90385d = 2;
        this.f90386e = 1;
        this.f90389h = 0;
        this.f90390i = null;
        this.f90383b = new PaddedBufferedBlockCipher(blockCipher);
    }

    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException {
        int iProcessBytes = i11 != 0 ? this.f90383b.processBytes(bArr, i10, i11, bArr2, i12) : 0;
        try {
            return iProcessBytes + this.f90383b.doFinal(bArr2, i12 + iProcessBytes);
        } catch (DataLengthException e5) {
            throw new IllegalBlockSizeException(e5.getMessage());
        } catch (InvalidCipherTextException e7) {
            throw new BadPaddingException(e7.getMessage());
        }
    }

    public int engineGetBlockSize() {
        return this.f90383b.getBlockSize();
    }

    public byte[] engineGetIV() {
        ParametersWithIV parametersWithIV = this.f90384c;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    public int engineGetKeySize(Key key) {
        return key.getEncoded().length;
    }

    public int engineGetOutputSize(int i10) {
        return this.f90383b.getOutputSize(i10);
    }

    public AlgorithmParameters engineGetParameters() {
        if (this.f90390i == null && this.f90384c != null) {
            String algorithmName = this.f90383b.getUnderlyingCipher().getAlgorithmName();
            if (algorithmName.indexOf(47) >= 0) {
                algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
            }
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithmName, BouncyCastleProvider.PROVIDER_NAME);
                this.f90390i = algorithmParameters;
                algorithmParameters.init(this.f90384c.getIV());
            } catch (Exception e5) {
                throw new RuntimeException(e5.toString());
            }
        }
        return this.f90390i;
    }

    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            int i11 = 0;
            while (true) {
                Class[] clsArr = this.f90382a;
                if (i11 == clsArr.length) {
                    break;
                }
                try {
                    parameterSpec = algorithmParameters.getParameterSpec(clsArr[i11]);
                    break;
                } catch (Exception unused) {
                    i11++;
                }
            }
            if (parameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        this.f90390i = algorithmParameters;
        engineInit(i10, key, parameterSpec, secureRandom);
    }

    public void engineSetMode(String str) {
        PaddedBufferedBlockCipher paddedBufferedBlockCipher;
        PaddedBufferedBlockCipher paddedBufferedBlockCipher2;
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("ECB")) {
            this.f90389h = 0;
            paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(this.f90383b.getUnderlyingCipher());
        } else if (upperCase.equals("CBC")) {
            this.f90389h = this.f90383b.getUnderlyingCipher().getBlockSize();
            paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new CBCBlockCipher(this.f90383b.getUnderlyingCipher()));
        } else if (upperCase.startsWith("OFB")) {
            this.f90389h = this.f90383b.getUnderlyingCipher().getBlockSize();
            if (upperCase.length() != 3) {
                paddedBufferedBlockCipher2 = new PaddedBufferedBlockCipher(new OFBBlockCipher(this.f90383b.getUnderlyingCipher(), Integer.parseInt(upperCase.substring(3))));
                this.f90383b = paddedBufferedBlockCipher2;
                return;
            }
            paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new OFBBlockCipher(this.f90383b.getUnderlyingCipher(), this.f90383b.getBlockSize() * 8));
        } else {
            if (!upperCase.startsWith("CFB")) {
                throw new IllegalArgumentException(androidx.camera.core.processing.f.d("can't support mode ", str));
            }
            this.f90389h = this.f90383b.getUnderlyingCipher().getBlockSize();
            if (upperCase.length() != 3) {
                paddedBufferedBlockCipher2 = new PaddedBufferedBlockCipher(new CFBBlockCipher(this.f90383b.getUnderlyingCipher(), Integer.parseInt(upperCase.substring(3))));
                this.f90383b = paddedBufferedBlockCipher2;
                return;
            }
            paddedBufferedBlockCipher = new PaddedBufferedBlockCipher(new CFBBlockCipher(this.f90383b.getUnderlyingCipher(), this.f90383b.getBlockSize() * 8));
        }
        this.f90383b = paddedBufferedBlockCipher;
    }

    public void engineSetPadding(String str) throws NoSuchPaddingException {
        BufferedBlockCipher cTSBlockCipher;
        String upperCase = Strings.toUpperCase(str);
        if (upperCase.equals("NOPADDING")) {
            cTSBlockCipher = new BufferedBlockCipher(this.f90383b.getUnderlyingCipher());
        } else if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING") || upperCase.equals("ISO10126PADDING")) {
            this.f90383b = new PaddedBufferedBlockCipher(this.f90383b.getUnderlyingCipher());
            return;
        } else {
            if (!upperCase.equals("WITHCTS")) {
                throw new NoSuchPaddingException(h0.b("Padding ", str, " unknown."));
            }
            cTSBlockCipher = new CTSBlockCipher(this.f90383b.getUnderlyingCipher());
        }
        this.f90383b = cTSBlockCipher;
    }

    public Key engineUnwrap(byte[] bArr, String str, int i10) throws InvalidKeyException {
        try {
            byte[] bArrEngineDoFinal = engineDoFinal(bArr, 0, bArr.length);
            if (i10 == 3) {
                return new SecretKeySpec(bArrEngineDoFinal, str);
            }
            try {
                KeyFactory keyFactory = KeyFactory.getInstance(str, BouncyCastleProvider.PROVIDER_NAME);
                if (i10 == 1) {
                    return keyFactory.generatePublic(new X509EncodedKeySpec(bArrEngineDoFinal));
                }
                if (i10 == 2) {
                    return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(bArrEngineDoFinal));
                }
                throw new InvalidKeyException(g0.c("Unknown key type ", i10));
            } catch (NoSuchAlgorithmException e5) {
                throw new InvalidKeyException("Unknown key type " + e5.getMessage());
            } catch (NoSuchProviderException e7) {
                throw new InvalidKeyException("Unknown key type " + e7.getMessage());
            } catch (InvalidKeySpecException e10) {
                throw new InvalidKeyException("Unknown key type " + e10.getMessage());
            }
        } catch (BadPaddingException e11) {
            throw new InvalidKeyException(e11.getMessage());
        } catch (IllegalBlockSizeException e12) {
            throw new InvalidKeyException(e12.getMessage());
        }
    }

    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        return this.f90383b.processBytes(bArr, i10, i11, bArr2, i12);
    }

    public byte[] engineWrap(Key key) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] encoded = key.getEncoded();
        if (encoded == null) {
            throw new InvalidKeyException("Cannot wrap key, null encoding.");
        }
        try {
            return engineDoFinal(encoded, 0, encoded.length);
        } catch (BadPaddingException e5) {
            throw new IllegalBlockSizeException(e5.getMessage());
        }
    }

    public BrokenJCEBlockCipher(BlockCipher blockCipher, int i10, int i11, int i12, int i13) {
        this.f90382a = new Class[]{IvParameterSpec.class, PBEParameterSpec.class, RC2ParameterSpec.class, RC5ParameterSpec.class};
        this.f90385d = 2;
        this.f90386e = 1;
        this.f90389h = 0;
        this.f90390i = null;
        this.f90383b = new PaddedBufferedBlockCipher(blockCipher);
        this.f90385d = i10;
        this.f90386e = i11;
        this.f90387f = i12;
        this.f90388g = i13;
    }

    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        byte[] bArr2 = new byte[engineGetOutputSize(i11)];
        int iProcessBytes = i11 != 0 ? this.f90383b.processBytes(bArr, i10, i11, bArr2, 0) : 0;
        try {
            int iDoFinal = iProcessBytes + this.f90383b.doFinal(bArr2, iProcessBytes);
            byte[] bArr3 = new byte[iDoFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, iDoFinal);
            return bArr3;
        } catch (DataLengthException e5) {
            throw new IllegalBlockSizeException(e5.getMessage());
        } catch (InvalidCipherTextException e7) {
            throw new BadPaddingException(e7.getMessage());
        }
    }

    public void engineInit(int i10, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new IllegalArgumentException(e5.getMessage());
        }
    }

    public byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        int updateOutputSize = this.f90383b.getUpdateOutputSize(i11);
        if (updateOutputSize <= 0) {
            this.f90383b.processBytes(bArr, i10, i11, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        this.f90383b.processBytes(bArr, i10, i11, bArr2, 0);
        return bArr2;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0169 A[PHI: r0
      0x0169: PHI (r0v5 org.bouncycastle.crypto.CipherParameters) = 
      (r0v4 org.bouncycastle.crypto.CipherParameters)
      (r0v4 org.bouncycastle.crypto.CipherParameters)
      (r0v6 org.bouncycastle.crypto.CipherParameters)
      (r0v6 org.bouncycastle.crypto.CipherParameters)
     binds: [B:76:0x018a, B:78:0x018e, B:65:0x0156, B:67:0x015a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [org.bouncycastle.crypto.params.KeyParameter] */
    /* JADX WARN: Type inference failed for: r5v6, types: [org.bouncycastle.crypto.params.ParametersWithIV] */
    /* JADX WARN: Type inference failed for: r5v7, types: [org.bouncycastle.crypto.params.KeyParameter] */
    /* JADX WARN: Type inference failed for: r5v8, types: [org.bouncycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r5v9, types: [org.bouncycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r9v3, types: [org.bouncycastle.crypto.BufferedBlockCipher] */
    /* JADX WARN: Type inference failed for: r9v4, types: [org.bouncycastle.crypto.BufferedBlockCipher] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters rC5Parameters;
        ParametersWithIV parametersWithIV;
        ?? keyParameter;
        PBEParametersGenerator pKCS12ParametersGenerator;
        if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            String algorithmName = this.f90383b.getUnderlyingCipher().getAlgorithmName();
            if (algorithmParameterSpec != null && (algorithmParameterSpec instanceof PBEParameterSpec)) {
                PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                int i11 = this.f90385d;
                int i12 = this.f90386e;
                if (i11 == 0) {
                    if (i12 == 0) {
                        pKCS12ParametersGenerator = new PKCS5S1ParametersGenerator(new MD5Digest());
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("PKCS5 scheme 1 only supports only MD5 and SHA1.");
                        }
                        pKCS12ParametersGenerator = new PKCS5S1ParametersGenerator(new SHA1Digest());
                    }
                } else if (i11 == 1) {
                    pKCS12ParametersGenerator = new PKCS5S2ParametersGenerator();
                } else if (i11 == 3) {
                    if (i12 == 0) {
                        pKCS12ParametersGenerator = new e(new MD5Digest());
                    } else if (i12 == 1) {
                        pKCS12ParametersGenerator = new e(new SHA1Digest());
                    } else {
                        if (i12 != 2) {
                            throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                        }
                        pKCS12ParametersGenerator = new e(new RIPEMD160Digest());
                    }
                } else if (i12 == 0) {
                    pKCS12ParametersGenerator = new PKCS12ParametersGenerator(new MD5Digest());
                } else if (i12 == 1) {
                    pKCS12ParametersGenerator = new PKCS12ParametersGenerator(new SHA1Digest());
                } else {
                    if (i12 != 2) {
                        throw new IllegalStateException("unknown digest scheme for PBE encryption.");
                    }
                    pKCS12ParametersGenerator = new PKCS12ParametersGenerator(new RIPEMD160Digest());
                }
                byte[] encoded = bCPBEKey.getEncoded();
                pKCS12ParametersGenerator.init(encoded, pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
                int i13 = this.f90388g;
                int i14 = this.f90387f;
                keyParameter = i13 != 0 ? pKCS12ParametersGenerator.generateDerivedParameters(i14, i13) : pKCS12ParametersGenerator.generateDerivedParameters(i14);
                if (algorithmName.startsWith("DES")) {
                    if (keyParameter instanceof ParametersWithIV) {
                        BrokenPBE.Util.a(((KeyParameter) ((ParametersWithIV) keyParameter).getParameters()).getKey());
                    } else {
                        BrokenPBE.Util.a(((KeyParameter) keyParameter).getKey());
                    }
                }
                for (int i15 = 0; i15 != encoded.length; i15++) {
                    encoded[i15] = 0;
                }
                if (i13 != 0) {
                    this.f90384c = (ParametersWithIV) keyParameter;
                }
            } else {
                throw new IllegalArgumentException("Need a PBEParameter spec with a PBE key.");
            }
        } else if (algorithmParameterSpec == null) {
            keyParameter = new KeyParameter(key.getEncoded());
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            if (this.f90389h != 0) {
                keyParameter = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.f90384c = keyParameter;
            } else {
                keyParameter = new KeyParameter(key.getEncoded());
            }
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            rC5Parameters = new RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
            if (rC2ParameterSpec.getIV() == null || this.f90389h == 0) {
                keyParameter = rC5Parameters;
            } else {
                parametersWithIV = new ParametersWithIV(rC5Parameters, rC2ParameterSpec.getIV());
                this.f90384c = parametersWithIV;
                keyParameter = parametersWithIV;
            }
        } else {
            if (!(algorithmParameterSpec instanceof RC5ParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown parameter type.");
            }
            RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
            rC5Parameters = new RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
            if (rC5ParameterSpec.getWordSize() != 32) {
                throw new IllegalArgumentException("can only accept RC5 word size 32 (at the moment...)");
            }
            if (rC5ParameterSpec.getIV() == null || this.f90389h == 0) {
                keyParameter = rC5Parameters;
            } else {
                parametersWithIV = new ParametersWithIV(rC5Parameters, rC5ParameterSpec.getIV());
                this.f90384c = parametersWithIV;
                keyParameter = parametersWithIV;
            }
        }
        ?? r10 = keyParameter;
        if (this.f90389h != 0 && !(keyParameter instanceof ParametersWithIV)) {
            if (secureRandom == null) {
                secureRandom = CryptoServicesRegistrar.getSecureRandom();
            }
            if (i10 != 1 && i10 != 3) {
                throw new InvalidAlgorithmParameterException("no IV set when one expected");
            }
            byte[] bArr = new byte[this.f90389h];
            secureRandom.nextBytes(bArr);
            ParametersWithIV parametersWithIV2 = new ParametersWithIV(keyParameter, bArr);
            this.f90384c = parametersWithIV2;
            r10 = parametersWithIV2;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        System.out.println("eeek!");
                        return;
                    }
                }
            }
            this.f90383b.init(false, r10);
            return;
        }
        this.f90383b.init(true, r10);
    }
}
