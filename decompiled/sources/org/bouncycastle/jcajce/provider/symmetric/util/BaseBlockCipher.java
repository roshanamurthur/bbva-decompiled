package org.bouncycastle.jcajce.provider.symmetric.util;

import ad.d;
import androidx.camera.camera2.internal.h0;
import androidx.camera.core.processing.f;
import com.google.android.gms.stats.CodePackage;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import mx.openpay.library.domain.util.Constant;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.GCMParameters;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.engines.DSTU7624Engine;
import org.bouncycastle.crypto.modes.AEADBlockCipher;
import org.bouncycastle.crypto.modes.AEADCipher;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.crypto.modes.CCMBlockCipher;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.crypto.modes.CTSBlockCipher;
import org.bouncycastle.crypto.modes.EAXBlockCipher;
import org.bouncycastle.crypto.modes.GCFBBlockCipher;
import org.bouncycastle.crypto.modes.GCMBlockCipher;
import org.bouncycastle.crypto.modes.GOFBBlockCipher;
import org.bouncycastle.crypto.modes.KCCMBlockCipher;
import org.bouncycastle.crypto.modes.KCTRBlockCipher;
import org.bouncycastle.crypto.modes.KGCMBlockCipher;
import org.bouncycastle.crypto.modes.OCBBlockCipher;
import org.bouncycastle.crypto.modes.OFBBlockCipher;
import org.bouncycastle.crypto.modes.OpenPGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.PGPCFBBlockCipher;
import org.bouncycastle.crypto.modes.SICBlockCipher;
import org.bouncycastle.crypto.paddings.BlockCipherPadding;
import org.bouncycastle.crypto.paddings.ISO10126d2Padding;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;
import org.bouncycastle.crypto.paddings.PaddedBufferedBlockCipher;
import org.bouncycastle.crypto.paddings.TBCPadding;
import org.bouncycastle.crypto.paddings.X923Padding;
import org.bouncycastle.crypto.paddings.ZeroBytePadding;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSBox;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.RC5Parameters;
import org.bouncycastle.jcajce.PBKDF1Key;
import org.bouncycastle.jcajce.PBKDF1KeyWithParameters;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.RepeatedSecretKeySpec;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes8.dex */
public class BaseBlockCipher extends BaseWrapCipher {
    public static final Class P0 = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.spec.GCMParameterSpec");
    public ParametersWithIV E0;
    public AEADParameters F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public int J0;
    public boolean K0;
    public boolean L0;
    public PBEParameterSpec M0;
    public String N0;
    public String O0;
    public final Class[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final BlockCipher f90215w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final BlockCipherProvider f90216x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public c f90217y0;

    public static class a implements c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Constructor f90218b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AEADCipher f90219a;

        static {
            Class clsLoadClass = ClassUtil.loadClass(BaseBlockCipher.class, "javax.crypto.AEADBadTagException");
            Constructor constructor = null;
            if (clsLoadClass != null) {
                try {
                    constructor = clsLoadClass.getConstructor(String.class);
                } catch (Exception unused) {
                }
            }
            f90218b = constructor;
        }

        public a(AEADCipher aEADCipher) {
            this.f90219a = aEADCipher;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final boolean a() {
            return false;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final void b(int i10, int i11, byte[] bArr) {
            this.f90219a.processAADBytes(bArr, i10, i11);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final int doFinal(byte[] bArr, int i10) throws IllegalStateException, BadPaddingException {
            BadPaddingException badPaddingException;
            try {
                return this.f90219a.doFinal(bArr, i10);
            } catch (InvalidCipherTextException e5) {
                Constructor constructor = f90218b;
                if (constructor != null) {
                    try {
                        badPaddingException = (BadPaddingException) constructor.newInstance(e5.getMessage());
                    } catch (Exception unused) {
                        badPaddingException = null;
                    }
                    if (badPaddingException != null) {
                        throw badPaddingException;
                    }
                }
                throw new BadPaddingException(e5.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final String getAlgorithmName() {
            AEADCipher aEADCipher = this.f90219a;
            return aEADCipher instanceof AEADBlockCipher ? ((AEADBlockCipher) aEADCipher).getUnderlyingCipher().getAlgorithmName() : aEADCipher.getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final int getOutputSize(int i10) {
            return this.f90219a.getOutputSize(i10);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final BlockCipher getUnderlyingCipher() {
            AEADCipher aEADCipher = this.f90219a;
            if (aEADCipher instanceof AEADBlockCipher) {
                return ((AEADBlockCipher) aEADCipher).getUnderlyingCipher();
            }
            return null;
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final int getUpdateOutputSize(int i10) {
            return this.f90219a.getUpdateOutputSize(i10);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.f90219a.init(z10, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
            return this.f90219a.processBytes(bArr, i10, i11, bArr2, i12);
        }
    }

    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BufferedBlockCipher f90220a;

        public b(BlockCipher blockCipher) {
            this.f90220a = new PaddedBufferedBlockCipher(blockCipher);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final boolean a() {
            return !(this.f90220a instanceof CTSBlockCipher);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final void b(int i10, int i11, byte[] bArr) {
            throw new UnsupportedOperationException("AAD is not supported in the current mode.");
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final int doFinal(byte[] bArr, int i10) throws IllegalStateException, BadPaddingException {
            try {
                return this.f90220a.doFinal(bArr, i10);
            } catch (InvalidCipherTextException e5) {
                throw new BadPaddingException(e5.getMessage());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final String getAlgorithmName() {
            return this.f90220a.getUnderlyingCipher().getAlgorithmName();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final int getOutputSize(int i10) {
            return this.f90220a.getOutputSize(i10);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final BlockCipher getUnderlyingCipher() {
            return this.f90220a.getUnderlyingCipher();
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final int getUpdateOutputSize(int i10) {
            return this.f90220a.getUpdateOutputSize(i10);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException {
            this.f90220a.init(z10, cipherParameters);
        }

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher.c
        public final int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException {
            return this.f90220a.processBytes(bArr, i10, i11, bArr2, i12);
        }

        public b(BlockCipher blockCipher, BlockCipherPadding blockCipherPadding) {
            this.f90220a = new PaddedBufferedBlockCipher(blockCipher, blockCipherPadding);
        }

        public b(BufferedBlockCipher bufferedBlockCipher) {
            this.f90220a = bufferedBlockCipher;
        }
    }

    public interface c {
        boolean a();

        void b(int i10, int i11, byte[] bArr);

        int doFinal(byte[] bArr, int i10) throws IllegalStateException, BadPaddingException;

        String getAlgorithmName();

        int getOutputSize(int i10);

        BlockCipher getUnderlyingCipher();

        int getUpdateOutputSize(int i10);

        void init(boolean z10, CipherParameters cipherParameters) throws IllegalArgumentException;

        int processBytes(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws DataLengthException;
    }

    public BaseBlockCipher(BlockCipher blockCipher) {
        this.v0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, P0, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.H0 = -1;
        this.J0 = 0;
        this.L0 = true;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.f90215w0 = blockCipher;
        this.f90217y0 = new b(blockCipher);
    }

    public static boolean a(String str) {
        return "CCM".equals(str) || "EAX".equals(str) || CodePackage.GCM.equals(str) || "OCB".equals(str);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int iProcessBytes;
        if (engineGetOutputSize(i11) + i12 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i11 != 0) {
            try {
                iProcessBytes = this.f90217y0.processBytes(bArr, i10, i11, bArr2, i12);
            } catch (OutputLengthException e5) {
                throw new IllegalBlockSizeException(e5.getMessage());
            } catch (DataLengthException e7) {
                throw new IllegalBlockSizeException(e7.getMessage());
            }
        } else {
            iProcessBytes = 0;
        }
        return iProcessBytes + this.f90217y0.doFinal(bArr2, i12 + iProcessBytes);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        BlockCipher blockCipher = this.f90215w0;
        if (blockCipher == null) {
            return -1;
        }
        return blockCipher.getBlockSize();
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        AEADParameters aEADParameters = this.F0;
        if (aEADParameters != null) {
            return aEADParameters.getNonce();
        }
        ParametersWithIV parametersWithIV = this.E0;
        if (parametersWithIV != null) {
            return parametersWithIV.getIV();
        }
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return key.getEncoded().length * 8;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        return this.f90217y0.getOutputSize(i10);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.M0 != null) {
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(this.N0);
                    this.engineParams = algorithmParametersCreateParametersInstance;
                    algorithmParametersCreateParametersInstance.init(this.M0);
                } catch (Exception unused) {
                    return null;
                }
            } else if (this.F0 != null) {
                if (this.f90215w0 == null) {
                    try {
                        AlgorithmParameters algorithmParametersCreateParametersInstance2 = createParametersInstance(PKCSObjectIdentifiers.id_alg_AEADChaCha20Poly1305.getId());
                        this.engineParams = algorithmParametersCreateParametersInstance2;
                        algorithmParametersCreateParametersInstance2.init(new DEROctetString(this.F0.getNonce()).getEncoded());
                    } catch (Exception e5) {
                        throw new RuntimeException(e5.toString());
                    }
                } else {
                    try {
                        AlgorithmParameters algorithmParametersCreateParametersInstance3 = createParametersInstance(CodePackage.GCM);
                        this.engineParams = algorithmParametersCreateParametersInstance3;
                        algorithmParametersCreateParametersInstance3.init(new GCMParameters(this.F0.getNonce(), this.F0.getMacSize() / 8).getEncoded());
                    } catch (Exception e7) {
                        throw new RuntimeException(e7.toString());
                    }
                }
            } else if (this.E0 != null) {
                String algorithmName = this.f90217y0.getUnderlyingCipher().getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance4 = createParametersInstance(algorithmName);
                    this.engineParams = algorithmParametersCreateParametersInstance4;
                    algorithmParametersCreateParametersInstance4.init(new IvParameterSpec(this.E0.getIV()));
                } catch (Exception e10) {
                    throw new RuntimeException(e10.toString());
                }
            }
        }
        return this.engineParams;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec parameterSpec = null;
        if (algorithmParameters != null) {
            int i11 = 0;
            while (true) {
                Class[] clsArr = this.v0;
                if (i11 == clsArr.length) {
                    break;
                }
                Class cls = clsArr[i11];
                if (cls != null) {
                    try {
                        parameterSpec = algorithmParameters.getParameterSpec(cls);
                        break;
                    } catch (Exception unused) {
                        continue;
                        i11++;
                    }
                }
                i11++;
            }
            if (parameterSpec == null) {
                throw new InvalidAlgorithmParameterException("can't handle parameter " + algorithmParameters.toString());
            }
        }
        engineInit(i10, key, parameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        a aVar;
        c aVar2;
        b bVar;
        BlockCipher blockCipher = this.f90215w0;
        if (blockCipher == null) {
            throw new NoSuchAlgorithmException("no mode supported for this algorithm");
        }
        String upperCase = Strings.toUpperCase(str);
        this.O0 = upperCase;
        if (upperCase.equals("ECB")) {
            this.J0 = 0;
            aVar2 = new b(blockCipher);
        } else if (this.O0.equals("CBC")) {
            this.J0 = blockCipher.getBlockSize();
            aVar2 = new b(new CBCBlockCipher(blockCipher));
        } else if (this.O0.startsWith("OFB")) {
            this.J0 = blockCipher.getBlockSize();
            if (this.O0.length() != 3) {
                bVar = new b(new OFBBlockCipher(blockCipher, Integer.parseInt(this.O0.substring(3))));
                this.f90217y0 = bVar;
                return;
            }
            aVar2 = new b(new OFBBlockCipher(blockCipher, blockCipher.getBlockSize() * 8));
        } else if (this.O0.startsWith("CFB")) {
            this.J0 = blockCipher.getBlockSize();
            if (this.O0.length() != 3) {
                bVar = new b(new CFBBlockCipher(blockCipher, Integer.parseInt(this.O0.substring(3))));
                this.f90217y0 = bVar;
                return;
            }
            aVar2 = new b(new CFBBlockCipher(blockCipher, blockCipher.getBlockSize() * 8));
        } else {
            if (this.O0.startsWith("PGP")) {
                boolean zEqualsIgnoreCase = this.O0.equalsIgnoreCase("PGPCFBwithIV");
                this.J0 = blockCipher.getBlockSize();
                bVar = new b(new PGPCFBBlockCipher(blockCipher, zEqualsIgnoreCase));
                this.f90217y0 = bVar;
                return;
            }
            if (this.O0.equalsIgnoreCase("OpenPGPCFB")) {
                this.J0 = 0;
                aVar2 = new b(new OpenPGPCFBBlockCipher(blockCipher));
            } else if (this.O0.startsWith("SIC")) {
                int blockSize = blockCipher.getBlockSize();
                this.J0 = blockSize;
                if (blockSize < 16) {
                    throw new IllegalArgumentException("Warning: SIC-Mode can become a twotime-pad if the blocksize of the cipher is too small. Use a cipher with a block size of at least 128 bits (e.g. AES)");
                }
                this.L0 = false;
                aVar2 = new b(new BufferedBlockCipher(new SICBlockCipher(blockCipher)));
            } else if (this.O0.startsWith("CTR")) {
                this.J0 = blockCipher.getBlockSize();
                this.L0 = false;
                aVar2 = blockCipher instanceof DSTU7624Engine ? new b(new BufferedBlockCipher(new KCTRBlockCipher(blockCipher))) : new b(new BufferedBlockCipher(new SICBlockCipher(blockCipher)));
            } else if (this.O0.startsWith("GOFB")) {
                this.J0 = blockCipher.getBlockSize();
                aVar2 = new b(new BufferedBlockCipher(new GOFBBlockCipher(blockCipher)));
            } else if (this.O0.startsWith("GCFB")) {
                this.J0 = blockCipher.getBlockSize();
                aVar2 = new b(new BufferedBlockCipher(new GCFBBlockCipher(blockCipher)));
            } else if (this.O0.startsWith("CTS")) {
                this.J0 = blockCipher.getBlockSize();
                aVar2 = new b(new CTSBlockCipher(new CBCBlockCipher(blockCipher)));
            } else if (this.O0.startsWith("CCM")) {
                this.J0 = 12;
                aVar2 = blockCipher instanceof DSTU7624Engine ? new a(new KCCMBlockCipher(blockCipher)) : new a(new CCMBlockCipher(blockCipher));
            } else {
                if (!this.O0.startsWith("OCB")) {
                    if (this.O0.startsWith("EAX")) {
                        this.J0 = blockCipher.getBlockSize();
                        aVar = new a(new EAXBlockCipher(blockCipher));
                    } else {
                        if (!this.O0.startsWith(CodePackage.GCM)) {
                            throw new NoSuchAlgorithmException(f.d("can't support mode ", str));
                        }
                        this.J0 = blockCipher.getBlockSize();
                        aVar = blockCipher instanceof DSTU7624Engine ? new a(new KGCMBlockCipher(blockCipher)) : new a(new GCMBlockCipher(blockCipher));
                    }
                    this.f90217y0 = aVar;
                    return;
                }
                BlockCipherProvider blockCipherProvider = this.f90216x0;
                if (blockCipherProvider == null) {
                    throw new NoSuchAlgorithmException(f.d("can't support mode ", str));
                }
                this.J0 = 15;
                aVar2 = new a(new OCBBlockCipher(blockCipher, blockCipherProvider.get()));
            }
        }
        this.f90217y0 = aVar2;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        b bVar;
        b bVar2;
        if (this.f90215w0 == null) {
            throw new NoSuchPaddingException("no padding supported for this algorithm");
        }
        String upperCase = Strings.toUpperCase(str);
        if (!upperCase.equals("NOPADDING")) {
            if (upperCase.equals("WITHCTS") || upperCase.equals("CTSPADDING") || upperCase.equals("CS3PADDING")) {
                bVar = new b(new CTSBlockCipher(this.f90217y0.getUnderlyingCipher()));
            } else {
                this.K0 = true;
                if (a(this.O0)) {
                    throw new NoSuchPaddingException("Only NoPadding can be used with AEAD modes.");
                }
                if (upperCase.equals("PKCS5PADDING") || upperCase.equals("PKCS7PADDING")) {
                    bVar = new b(this.f90217y0.getUnderlyingCipher());
                } else if (upperCase.equals("ZEROBYTEPADDING")) {
                    bVar2 = new b(this.f90217y0.getUnderlyingCipher(), new ZeroBytePadding());
                } else if (upperCase.equals("ISO10126PADDING") || upperCase.equals("ISO10126-2PADDING")) {
                    bVar = new b(this.f90217y0.getUnderlyingCipher(), new ISO10126d2Padding());
                } else if (upperCase.equals("X9.23PADDING") || upperCase.equals("X923PADDING")) {
                    bVar = new b(this.f90217y0.getUnderlyingCipher(), new X923Padding());
                } else if (upperCase.equals("ISO7816-4PADDING") || upperCase.equals("ISO9797-1PADDING")) {
                    bVar = new b(this.f90217y0.getUnderlyingCipher(), new ISO7816d4Padding());
                } else {
                    if (!upperCase.equals("TBCPADDING")) {
                        throw new NoSuchPaddingException(h0.b("Padding ", str, " unknown."));
                    }
                    bVar2 = new b(this.f90217y0.getUnderlyingCipher(), new TBCPadding());
                }
            }
            this.f90217y0 = bVar;
            return;
        }
        if (!this.f90217y0.a()) {
            return;
        } else {
            bVar2 = new b(new BufferedBlockCipher(this.f90217y0.getUnderlyingCipher()));
        }
        this.f90217y0 = bVar2;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws ShortBufferException {
        if (this.f90217y0.getUpdateOutputSize(i11) + i12 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            return this.f90217y0.processBytes(bArr, i10, i11, bArr2, i12);
        } catch (DataLengthException e5) {
            throw new IllegalStateException(e5.toString());
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        if (iRemaining < 1) {
            return;
        }
        if (byteBuffer.hasArray()) {
            engineUpdateAAD(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), iRemaining);
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        if (iRemaining <= 512) {
            byte[] bArr = new byte[iRemaining];
            byteBuffer.get(bArr);
            engineUpdateAAD(bArr, 0, iRemaining);
            Arrays.fill(bArr, (byte) 0);
            return;
        }
        byte[] bArr2 = new byte[512];
        do {
            int iMin = Math.min(512, iRemaining);
            byteBuffer.get(bArr2, 0, iMin);
            engineUpdateAAD(bArr2, 0, iMin);
            iRemaining -= iMin;
        } while (iRemaining > 0);
        Arrays.fill(bArr2, (byte) 0);
    }

    public BaseBlockCipher(BlockCipher blockCipher, int i10) {
        this(blockCipher, true, i10);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        int iEngineGetOutputSize = engineGetOutputSize(i11);
        byte[] bArr2 = new byte[iEngineGetOutputSize];
        int iProcessBytes = i11 != 0 ? this.f90217y0.processBytes(bArr, i10, i11, bArr2, 0) : 0;
        try {
            int iDoFinal = iProcessBytes + this.f90217y0.doFinal(bArr2, iProcessBytes);
            if (iDoFinal == iEngineGetOutputSize) {
                return bArr2;
            }
            byte[] bArr3 = new byte[iDoFinal];
            System.arraycopy(bArr2, 0, bArr3, 0, iDoFinal);
            return bArr3;
        } catch (DataLengthException e5) {
            throw new IllegalBlockSizeException(e5.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, SecureRandom secureRandom) throws InvalidKeyException {
        try {
            engineInit(i10, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i10, int i11) {
        int updateOutputSize = this.f90217y0.getUpdateOutputSize(i11);
        if (updateOutputSize <= 0) {
            this.f90217y0.processBytes(bArr, i10, i11, null, 0);
            return null;
        }
        byte[] bArr2 = new byte[updateOutputSize];
        int iProcessBytes = this.f90217y0.processBytes(bArr, i10, i11, bArr2, 0);
        if (iProcessBytes == 0) {
            return null;
        }
        if (iProcessBytes == updateOutputSize) {
            return bArr2;
        }
        byte[] bArr3 = new byte[iProcessBytes];
        System.arraycopy(bArr2, 0, bArr3, 0, iProcessBytes);
        return bArr3;
    }

    @Override // javax.crypto.CipherSpi
    public void engineUpdateAAD(byte[] bArr, int i10, int i11) {
        this.f90217y0.b(i10, i11, bArr);
    }

    public BaseBlockCipher(BlockCipher blockCipher, int i10, int i11, int i12, int i13) {
        this.v0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, P0, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.L0 = true;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.f90215w0 = blockCipher;
        this.H0 = i10;
        this.I0 = i11;
        this.G0 = i12;
        this.J0 = i13;
        this.f90217y0 = new b(blockCipher);
    }

    /* JADX WARN: Code duplicated, block: B:277:0x0550 A[Catch: Exception -> 0x0546, IllegalArgumentException -> 0x0548, TryCatch #4 {IllegalArgumentException -> 0x0548, Exception -> 0x0546, blocks: (B:270:0x052f, B:271:0x0545, B:276:0x054a, B:278:0x0555, B:280:0x055b, B:282:0x055f, B:277:0x0550), top: B:294:0x0525 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa A[PHI: r6
      0x00aa: PHI (r6v34 org.bouncycastle.crypto.CipherParameters) = 
      (r6v64 org.bouncycastle.crypto.CipherParameters)
      (r6v65 org.bouncycastle.crypto.CipherParameters)
      (r6v66 org.bouncycastle.crypto.CipherParameters)
      (r6v67 org.bouncycastle.crypto.CipherParameters)
     binds: [B:127:0x027f, B:84:0x01bf, B:73:0x016e, B:33:0x00a8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$c] */
    /* JADX WARN: Type inference failed for: r0v22, types: [org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher$c] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v14, types: [org.bouncycastle.crypto.CipherParameters, org.bouncycastle.crypto.params.RC5Parameters] */
    /* JADX WARN: Type inference failed for: r6v17, types: [org.bouncycastle.crypto.CipherParameters, org.bouncycastle.crypto.params.RC2Parameters] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [org.bouncycastle.crypto.CipherParameters, org.bouncycastle.crypto.params.ParametersWithSBox] */
    /* JADX WARN: Type inference failed for: r6v24, types: [org.bouncycastle.crypto.params.ParametersWithIV] */
    /* JADX WARN: Type inference failed for: r6v27, types: [org.bouncycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r6v28, types: [org.bouncycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r6v29, types: [org.bouncycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v32, types: [org.bouncycastle.crypto.params.AEADParameters] */
    /* JADX WARN: Type inference failed for: r6v68 */
    /* JADX WARN: Type inference failed for: r6v69 */
    /* JADX WARN: Type inference failed for: r6v70 */
    /* JADX WARN: Type inference failed for: r6v71 */
    /* JADX WARN: Type inference failed for: r6v72 */
    /* JADX WARN: Type inference failed for: r6v73 */
    /* JADX WARN: Type inference failed for: r6v74 */
    /* JADX WARN: Type inference failed for: r6v75 */
    /* JADX WARN: Type inference failed for: r6v76 */
    /* JADX WARN: Type inference failed for: r6v77 */
    /* JADX WARN: Type inference failed for: r6v78 */
    /* JADX WARN: Type inference failed for: r6v79 */
    /* JADX WARN: Type inference failed for: r6v8, types: [org.bouncycastle.crypto.CipherParameters] */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters cipherParametersMakePBEParameters;
        ParametersWithIV parametersWithIV;
        CipherParameters cipherParameters;
        CipherParameters cipherParametersMakePBEParameters2;
        CipherParameters param;
        ParametersWithSBox parametersWithSBox;
        CipherParameters cipherParameters2;
        ParametersWithIV parametersWithIV2;
        ?? rC5Parameters = 0;
        this.M0 = null;
        this.N0 = null;
        this.engineParams = null;
        this.F0 = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException(d.f(new StringBuilder("Key for algorithm "), key != null ? key.getAlgorithm() : null, " not suitable for symmetric enryption."));
        }
        BlockCipher blockCipher = this.f90215w0;
        if (algorithmParameterSpec == null && blockCipher != null && blockCipher.getAlgorithmName().startsWith("RC5-64")) {
            throw new InvalidAlgorithmParameterException("RC5 requires an RC5ParametersSpec to be passed in.");
        }
        int i11 = this.H0;
        if (i11 == 2 || (key instanceof PKCS12Key)) {
            try {
                SecretKey secretKey = (SecretKey) key;
                if (algorithmParameterSpec instanceof PBEParameterSpec) {
                    this.M0 = (PBEParameterSpec) algorithmParameterSpec;
                }
                boolean z10 = secretKey instanceof PBEKey;
                if (z10 && this.M0 == null) {
                    PBEKey pBEKey = (PBEKey) secretKey;
                    if (pBEKey.getSalt() == null) {
                        throw new InvalidAlgorithmParameterException("PBEKey requires parameters to specify salt");
                    }
                    this.M0 = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                }
                if (this.M0 == null && !z10) {
                    throw new InvalidKeyException("Algorithm requires a PBE key");
                }
                if (key instanceof BCPBEKey) {
                    CipherParameters param2 = ((BCPBEKey) key).getParam();
                    if (!(param2 instanceof ParametersWithIV)) {
                        if (param2 != null) {
                            throw new InvalidKeyException("Algorithm requires a PBE key suitable for PKCS12");
                        }
                        param2 = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.I0, this.G0, this.J0 * 8, this.M0, this.f90217y0.getAlgorithmName());
                    }
                    cipherParametersMakePBEParameters = param2;
                } else {
                    cipherParametersMakePBEParameters = PBE.Util.makePBEParameters(secretKey.getEncoded(), 2, this.I0, this.G0, this.J0 * 8, this.M0, this.f90217y0.getAlgorithmName());
                }
                boolean z11 = cipherParametersMakePBEParameters instanceof ParametersWithIV;
                cipherParameters = cipherParametersMakePBEParameters;
                rC5Parameters = cipherParametersMakePBEParameters;
                if (z11) {
                    this.E0 = (ParametersWithIV) cipherParameters;
                    rC5Parameters = cipherParameters;
                }
            } catch (Exception unused) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof PBKDF1Key) {
            PBKDF1Key pBKDF1Key = (PBKDF1Key) key;
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                this.M0 = (PBEParameterSpec) algorithmParameterSpec;
            }
            if ((pBKDF1Key instanceof PBKDF1KeyWithParameters) && this.M0 == null) {
                PBKDF1KeyWithParameters pBKDF1KeyWithParameters = (PBKDF1KeyWithParameters) pBKDF1Key;
                this.M0 = new PBEParameterSpec(pBKDF1KeyWithParameters.getSalt(), pBKDF1KeyWithParameters.getIterationCount());
            }
            CipherParameters cipherParametersMakePBEParameters3 = PBE.Util.makePBEParameters(pBKDF1Key.getEncoded(), 0, this.I0, this.G0, this.J0 * 8, this.M0, this.f90217y0.getAlgorithmName());
            boolean z12 = cipherParametersMakePBEParameters3 instanceof ParametersWithIV;
            cipherParameters = cipherParametersMakePBEParameters3;
            rC5Parameters = cipherParametersMakePBEParameters3;
            if (z12) {
                this.E0 = (ParametersWithIV) cipherParameters;
                rC5Parameters = cipherParameters;
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            this.N0 = bCPBEKey.getOID() != null ? bCPBEKey.getOID().getId() : bCPBEKey.getAlgorithm();
            if (bCPBEKey.getParam() != null) {
                param = bCPBEKey.getParam();
                if (param instanceof ParametersWithIV) {
                    CipherParameters parameters = ((ParametersWithIV) param).getParameters();
                    if (algorithmParameterSpec instanceof IvParameterSpec) {
                        parametersWithIV2 = new ParametersWithIV(parameters, ((IvParameterSpec) algorithmParameterSpec).getIV());
                        this.E0 = parametersWithIV2;
                        cipherParameters2 = parametersWithIV2;
                        cipherParametersMakePBEParameters2 = param;
                        cipherParameters2 = parametersWithSBox;
                        cipherParameters2 = parametersWithSBox;
                        cipherParametersMakePBEParameters2 = param;
                        cipherParameters2 = parametersWithSBox;
                        cipherParametersMakePBEParameters2 = cipherParameters2;
                    } else if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                        GOST28147ParameterSpec gOST28147ParameterSpec = (GOST28147ParameterSpec) algorithmParameterSpec;
                        ParametersWithSBox parametersWithSBox2 = new ParametersWithSBox(param, gOST28147ParameterSpec.getSbox());
                        if (gOST28147ParameterSpec.getIV() == null || this.J0 == 0) {
                            cipherParametersMakePBEParameters2 = param;
                            cipherParametersMakePBEParameters2 = param;
                            cipherParametersMakePBEParameters2 = parametersWithSBox2;
                        } else {
                            cipherParametersMakePBEParameters2 = param;
                            ParametersWithIV parametersWithIV3 = new ParametersWithIV(parameters, gOST28147ParameterSpec.getIV());
                            this.E0 = parametersWithIV3;
                            cipherParametersMakePBEParameters2 = parametersWithIV3;
                        }
                    }
                } else if (algorithmParameterSpec instanceof IvParameterSpec) {
                    parametersWithIV2 = new ParametersWithIV(param, ((IvParameterSpec) algorithmParameterSpec).getIV());
                    this.E0 = parametersWithIV2;
                    cipherParameters2 = parametersWithIV2;
                    cipherParametersMakePBEParameters2 = param;
                    cipherParameters2 = parametersWithSBox;
                    cipherParameters2 = parametersWithSBox;
                    cipherParametersMakePBEParameters2 = param;
                    cipherParameters2 = parametersWithSBox;
                    cipherParametersMakePBEParameters2 = cipherParameters2;
                } else if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
                    GOST28147ParameterSpec gOST28147ParameterSpec2 = (GOST28147ParameterSpec) algorithmParameterSpec;
                    parametersWithSBox = new ParametersWithSBox(param, gOST28147ParameterSpec2.getSbox());
                    if (gOST28147ParameterSpec2.getIV() == null || this.J0 == 0) {
                        cipherParametersMakePBEParameters2 = param;
                        cipherParameters2 = parametersWithSBox;
                        cipherParameters2 = parametersWithSBox;
                        cipherParametersMakePBEParameters2 = param;
                        cipherParameters2 = parametersWithSBox;
                        cipherParametersMakePBEParameters2 = cipherParameters2;
                    } else {
                        cipherParametersMakePBEParameters2 = param;
                        cipherParameters2 = parametersWithSBox;
                        cipherParameters2 = parametersWithSBox;
                        cipherParametersMakePBEParameters2 = new ParametersWithIV(parametersWithSBox, gOST28147ParameterSpec2.getIV());
                    }
                }
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                this.M0 = (PBEParameterSpec) algorithmParameterSpec;
                cipherParametersMakePBEParameters2 = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, this.f90217y0.getUnderlyingCipher().getAlgorithmName());
            }
            cipherParametersMakePBEParameters2 = param;
            cipherParametersMakePBEParameters2 = param;
            boolean z13 = cipherParametersMakePBEParameters2 instanceof ParametersWithIV;
            cipherParameters = cipherParametersMakePBEParameters2;
            rC5Parameters = cipherParametersMakePBEParameters2;
            if (z13) {
                this.E0 = (ParametersWithIV) cipherParameters;
                rC5Parameters = cipherParameters;
            }
        } else if (key instanceof PBEKey) {
            PBEKey pBEKey2 = (PBEKey) key;
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.M0 = pBEParameterSpec;
            if ((pBEKey2 instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                this.M0 = new PBEParameterSpec(pBEKey2.getSalt(), pBEKey2.getIterationCount());
            }
            CipherParameters cipherParametersMakePBEParameters4 = PBE.Util.makePBEParameters(pBEKey2.getEncoded(), this.H0, this.I0, this.G0, this.J0 * 8, this.M0, this.f90217y0.getAlgorithmName());
            boolean z14 = cipherParametersMakePBEParameters4 instanceof ParametersWithIV;
            cipherParameters = cipherParametersMakePBEParameters4;
            rC5Parameters = cipherParametersMakePBEParameters4;
            if (z14) {
                this.E0 = (ParametersWithIV) cipherParameters;
                rC5Parameters = cipherParameters;
            }
        } else if (!(key instanceof RepeatedSecretKeySpec)) {
            if (i11 == 0 || i11 == 4 || i11 == 1 || i11 == 5) {
                throw new InvalidKeyException("Algorithm requires a PBE key");
            }
            rC5Parameters = new KeyParameter(key.getEncoded());
        }
        if (algorithmParameterSpec instanceof AEADParameterSpec) {
            if (!a(this.O0) && !(this.f90217y0 instanceof a)) {
                throw new InvalidAlgorithmParameterException("AEADParameterSpec can only be used with AEAD modes.");
            }
            AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
            rC5Parameters = new AEADParameters(rC5Parameters instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) rC5Parameters).getParameters() : (KeyParameter) rC5Parameters, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
            this.F0 = rC5Parameters;
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            if (this.J0 != 0) {
                IvParameterSpec ivParameterSpec = (IvParameterSpec) algorithmParameterSpec;
                if (ivParameterSpec.getIV().length != this.J0 && !(this.f90217y0 instanceof a) && this.L0) {
                    throw new InvalidAlgorithmParameterException(androidx.appcompat.widget.a.c(new StringBuilder("IV must be "), this.J0, " bytes long."));
                }
                rC5Parameters = rC5Parameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) rC5Parameters).getParameters(), ivParameterSpec.getIV()) : new ParametersWithIV(rC5Parameters, ivParameterSpec.getIV());
                this.E0 = rC5Parameters;
            } else {
                String str = this.O0;
                if (str != null && str.equals("ECB")) {
                    throw new InvalidAlgorithmParameterException("ECB mode does not use an IV");
                }
            }
        } else if (algorithmParameterSpec instanceof GOST28147ParameterSpec) {
            GOST28147ParameterSpec gOST28147ParameterSpec3 = (GOST28147ParameterSpec) algorithmParameterSpec;
            rC5Parameters = new ParametersWithSBox(new KeyParameter(key.getEncoded()), gOST28147ParameterSpec3.getSbox());
            if (gOST28147ParameterSpec3.getIV() != null && this.J0 != 0) {
                parametersWithIV = rC5Parameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) rC5Parameters).getParameters(), gOST28147ParameterSpec3.getIV()) : new ParametersWithIV(rC5Parameters, gOST28147ParameterSpec3.getIV());
                this.E0 = parametersWithIV;
                rC5Parameters = parametersWithIV;
            }
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            rC5Parameters = new RC2Parameters(key.getEncoded(), rC2ParameterSpec.getEffectiveKeyBits());
            if (rC2ParameterSpec.getIV() != null && this.J0 != 0) {
                parametersWithIV = rC5Parameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) rC5Parameters).getParameters(), rC2ParameterSpec.getIV()) : new ParametersWithIV(rC5Parameters, rC2ParameterSpec.getIV());
                this.E0 = parametersWithIV;
                rC5Parameters = parametersWithIV;
            }
        } else if (algorithmParameterSpec instanceof RC5ParameterSpec) {
            RC5ParameterSpec rC5ParameterSpec = (RC5ParameterSpec) algorithmParameterSpec;
            rC5Parameters = new RC5Parameters(key.getEncoded(), rC5ParameterSpec.getRounds());
            if (!blockCipher.getAlgorithmName().startsWith("RC5")) {
                throw new InvalidAlgorithmParameterException("RC5 parameters passed to a cipher that is not RC5.");
            }
            if (blockCipher.getAlgorithmName().equals("RC5-32")) {
                if (rC5ParameterSpec.getWordSize() != 32) {
                    throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 32 not " + rC5ParameterSpec.getWordSize() + Constant.DOT_STRING);
                }
            } else if (blockCipher.getAlgorithmName().equals("RC5-64") && rC5ParameterSpec.getWordSize() != 64) {
                throw new InvalidAlgorithmParameterException("RC5 already set up for a word size of 64 not " + rC5ParameterSpec.getWordSize() + Constant.DOT_STRING);
            }
            if (rC5ParameterSpec.getIV() != null && this.J0 != 0) {
                parametersWithIV = rC5Parameters instanceof ParametersWithIV ? new ParametersWithIV(((ParametersWithIV) rC5Parameters).getParameters(), rC5ParameterSpec.getIV()) : new ParametersWithIV(rC5Parameters, rC5ParameterSpec.getIV());
                this.E0 = parametersWithIV;
                rC5Parameters = parametersWithIV;
            }
        } else {
            Class cls = P0;
            if (cls == null || !cls.isInstance(algorithmParameterSpec)) {
                if (algorithmParameterSpec != null && !(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                }
            } else {
                if (!a(this.O0) && !(this.f90217y0 instanceof a)) {
                    throw new InvalidAlgorithmParameterException("GCMParameterSpec can only be used with AEAD modes.");
                }
                try {
                    Method declaredMethod = cls.getDeclaredMethod("getTLen", new Class[0]);
                    Method declaredMethod2 = cls.getDeclaredMethod("getIV", new Class[0]);
                    boolean z15 = rC5Parameters instanceof ParametersWithIV;
                    ?? parameters2 = rC5Parameters;
                    if (z15) {
                        parameters2 = ((ParametersWithIV) rC5Parameters).getParameters();
                    }
                    AEADParameters aEADParameters = new AEADParameters((KeyParameter) parameters2, ((Integer) declaredMethod.invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) declaredMethod2.invoke(algorithmParameterSpec, new Object[0]));
                    this.F0 = aEADParameters;
                    rC5Parameters = aEADParameters;
                } catch (Exception unused2) {
                    throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
                }
            }
        }
        ?? parametersWithRandom = rC5Parameters;
        if (this.J0 != 0 && !(rC5Parameters instanceof ParametersWithIV) && !(rC5Parameters instanceof AEADParameters)) {
            SecureRandom secureRandom2 = secureRandom == null ? CryptoServicesRegistrar.getSecureRandom() : secureRandom;
            if (i10 == 1 || i10 == 3) {
                byte[] bArr = new byte[this.J0];
                secureRandom2.nextBytes(bArr);
                ParametersWithIV parametersWithIV4 = new ParametersWithIV(rC5Parameters, bArr);
                this.E0 = parametersWithIV4;
                parametersWithRandom = parametersWithIV4;
            } else if (this.f90217y0.getUnderlyingCipher().getAlgorithmName().indexOf("PGPCFB") < 0) {
                parametersWithRandom = rC5Parameters;
                throw new InvalidAlgorithmParameterException("no IV set when one expected");
            }
        }
        if (secureRandom != null && this.K0) {
            parametersWithRandom = new ParametersWithRandom(parametersWithRandom, secureRandom);
        }
        try {
            if (i10 == 1) {
                this.f90217y0.init(true, parametersWithRandom);
            } else {
                if (i10 != 2) {
                    if (i10 == 3) {
                        this.f90217y0.init(true, parametersWithRandom);
                    } else if (i10 != 4) {
                        throw new InvalidParameterException("unknown opmode " + i10 + " passed");
                    }
                }
                this.f90217y0.init(false, parametersWithRandom);
            }
            c cVar = this.f90217y0;
            if ((cVar instanceof a) && this.F0 == null) {
                this.F0 = new AEADParameters((KeyParameter) this.E0.getParameters(), ((a) cVar).f90219a.getMac().length * 8, this.E0.getIV());
            }
        } catch (IllegalArgumentException e5) {
            throw new InvalidAlgorithmParameterException(e5.getMessage(), e5);
        } catch (Exception e7) {
            throw new BaseWrapCipher.InvalidKeyOrParametersException(e7.getMessage(), e7);
        }
    }

    public BaseBlockCipher(BlockCipher blockCipher, boolean z10, int i10) {
        this.v0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, P0, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.H0 = -1;
        this.J0 = 0;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.f90215w0 = blockCipher;
        this.L0 = z10;
        this.f90217y0 = new b(blockCipher);
        this.J0 = i10 / 8;
    }

    public BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, int i10) {
        this(bufferedBlockCipher, true, i10);
    }

    public BaseBlockCipher(BufferedBlockCipher bufferedBlockCipher, boolean z10, int i10) {
        this.v0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, P0, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.H0 = -1;
        this.J0 = 0;
        this.L0 = true;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.f90215w0 = bufferedBlockCipher.getUnderlyingCipher();
        this.f90217y0 = new b(bufferedBlockCipher);
        this.L0 = z10;
        this.J0 = i10 / 8;
    }

    public BaseBlockCipher(AEADBlockCipher aEADBlockCipher) {
        this.v0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, P0, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.H0 = -1;
        this.J0 = 0;
        this.L0 = true;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        BlockCipher underlyingCipher = aEADBlockCipher.getUnderlyingCipher();
        this.f90215w0 = underlyingCipher;
        this.J0 = underlyingCipher.getBlockSize();
        this.f90217y0 = new a(aEADBlockCipher);
    }

    public BaseBlockCipher(AEADBlockCipher aEADBlockCipher, boolean z10, int i10) {
        this.v0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, P0, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.H0 = -1;
        this.J0 = 0;
        this.L0 = true;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.f90215w0 = aEADBlockCipher.getUnderlyingCipher();
        this.L0 = z10;
        this.J0 = i10;
        this.f90217y0 = new a(aEADBlockCipher);
    }

    public BaseBlockCipher(AEADCipher aEADCipher, boolean z10, int i10) {
        this.v0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, P0, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.H0 = -1;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.f90215w0 = null;
        this.L0 = z10;
        this.J0 = i10;
        this.f90217y0 = new a(aEADCipher);
    }

    public BaseBlockCipher(BlockCipherProvider blockCipherProvider) {
        this.v0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, P0, GOST28147ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.H0 = -1;
        this.J0 = 0;
        this.L0 = true;
        this.M0 = null;
        this.N0 = null;
        this.O0 = null;
        this.f90215w0 = blockCipherProvider.get();
        this.f90216x0 = blockCipherProvider;
        this.f90217y0 = new b(blockCipherProvider.get());
    }
}
