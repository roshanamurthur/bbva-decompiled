package org.bouncycastle.jcajce.provider.symmetric.util;

import androidx.camera.camera2.internal.h0;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.StreamCipher;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12KeyWithParameters;

/* JADX INFO: loaded from: classes8.dex */
public class BaseStreamCipher extends BaseWrapCipher {
    public ParametersWithIV E0;
    public final int F0;
    public PBEParameterSpec G0;
    public String H0;
    public final Class[] v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final StreamCipher f90223w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f90224x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final int f90225y0;

    public BaseStreamCipher(StreamCipher streamCipher, int i10) {
        this(streamCipher, i10, -1, -1);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws ShortBufferException {
        if (i12 + i11 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        if (i11 != 0) {
            this.f90223w0.processBytes(bArr, i10, i11, bArr2, i12);
        }
        this.f90223w0.reset();
        return i11;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineGetIV() {
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
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            if (this.G0 != null) {
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance = createParametersInstance(this.H0);
                    algorithmParametersCreateParametersInstance.init(this.G0);
                    return algorithmParametersCreateParametersInstance;
                } catch (Exception unused) {
                    return null;
                }
            }
            if (this.E0 != null) {
                String algorithmName = this.f90223w0.getAlgorithmName();
                if (algorithmName.indexOf(47) >= 0) {
                    algorithmName = algorithmName.substring(0, algorithmName.indexOf(47));
                }
                if (algorithmName.startsWith("ChaCha7539")) {
                    algorithmName = "ChaCha7539";
                } else if (algorithmName.startsWith("Grain")) {
                    algorithmName = "Grainv1";
                } else if (algorithmName.startsWith("HC")) {
                    int iIndexOf = algorithmName.indexOf(45);
                    algorithmName = algorithmName.substring(0, iIndexOf) + algorithmName.substring(iIndexOf + 1);
                }
                try {
                    AlgorithmParameters algorithmParametersCreateParametersInstance2 = createParametersInstance(algorithmName);
                    this.engineParams = algorithmParametersCreateParametersInstance2;
                    algorithmParametersCreateParametersInstance2.init(new IvParameterSpec(this.E0.getIV()));
                } catch (Exception e5) {
                    throw new RuntimeException(e5.toString());
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
        engineInit(i10, key, parameterSpec, secureRandom);
        this.engineParams = algorithmParameters;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetMode(String str) throws NoSuchAlgorithmException {
        if (!str.equalsIgnoreCase("ECB") && !str.equals(ExpectedUserActionOnPoiTypes.NONE)) {
            throw new NoSuchAlgorithmException("can't support mode ".concat(str));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineSetPadding(String str) throws NoSuchPaddingException {
        if (!str.equalsIgnoreCase("NoPadding")) {
            throw new NoSuchPaddingException(h0.b("Padding ", str, " unknown."));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) throws ShortBufferException {
        if (i12 + i11 > bArr2.length) {
            throw new ShortBufferException("output buffer too short for input.");
        }
        try {
            this.f90223w0.processBytes(bArr, i10, i11, bArr2, i12);
            return i11;
        } catch (DataLengthException e5) {
            throw new IllegalStateException(e5.getMessage());
        }
    }

    public BaseStreamCipher(StreamCipher streamCipher, int i10, int i11) {
        this(streamCipher, i10, i11, -1);
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i10, int i11) {
        StreamCipher streamCipher = this.f90223w0;
        if (i11 == 0) {
            streamCipher.reset();
            return new byte[0];
        }
        byte[] bArrEngineUpdate = engineUpdate(bArr, i10, i11);
        streamCipher.reset();
        return bArrEngineUpdate;
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
        byte[] bArr2 = new byte[i11];
        this.f90223w0.processBytes(bArr, i10, i11, bArr2, 0);
        return bArr2;
    }

    public BaseStreamCipher(StreamCipher streamCipher, int i10, int i11, int i12) {
        this.v0 = new Class[]{RC2ParameterSpec.class, RC5ParameterSpec.class, IvParameterSpec.class, PBEParameterSpec.class};
        this.G0 = null;
        this.H0 = null;
        this.f90223w0 = streamCipher;
        this.F0 = i10;
        this.f90224x0 = i11;
        this.f90225y0 = i12;
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public void engineInit(int i10, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        CipherParameters cipherParametersMakePBEParameters;
        CipherParameters keyParameter;
        this.G0 = null;
        this.H0 = null;
        this.engineParams = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException("Key for algorithm " + key.getAlgorithm() + " not suitable for symmetric enryption.");
        }
        boolean z10 = key instanceof PKCS12Key;
        int i11 = this.F0;
        StreamCipher streamCipher = this.f90223w0;
        if (z10) {
            PKCS12Key pKCS12Key = (PKCS12Key) key;
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.G0 = pBEParameterSpec;
            if ((pKCS12Key instanceof PKCS12KeyWithParameters) && pBEParameterSpec == null) {
                PKCS12KeyWithParameters pKCS12KeyWithParameters = (PKCS12KeyWithParameters) pKCS12Key;
                this.G0 = new PBEParameterSpec(pKCS12KeyWithParameters.getSalt(), pKCS12KeyWithParameters.getIterationCount());
            }
            cipherParametersMakePBEParameters = PBE.Util.makePBEParameters(pKCS12Key.getEncoded(), 2, this.f90225y0, this.f90224x0, i11 * 8, this.G0, streamCipher.getAlgorithmName());
        } else {
            if (key instanceof BCPBEKey) {
                BCPBEKey bCPBEKey = (BCPBEKey) key;
                this.H0 = bCPBEKey.getOID() != null ? bCPBEKey.getOID().getId() : bCPBEKey.getAlgorithm();
                if (bCPBEKey.getParam() != null) {
                    keyParameter = bCPBEKey.getParam();
                    this.G0 = new PBEParameterSpec(bCPBEKey.getSalt(), bCPBEKey.getIterationCount());
                } else {
                    if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                        throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                    }
                    CipherParameters cipherParametersMakePBEParameters2 = PBE.Util.makePBEParameters(bCPBEKey, algorithmParameterSpec, streamCipher.getAlgorithmName());
                    this.G0 = (PBEParameterSpec) algorithmParameterSpec;
                    keyParameter = cipherParametersMakePBEParameters2;
                }
                if (bCPBEKey.getIvSize() != 0) {
                    this.E0 = (ParametersWithIV) keyParameter;
                }
            } else if (algorithmParameterSpec == null) {
                if (this.f90225y0 > 0) {
                    throw new InvalidKeyException("Algorithm requires a PBE key");
                }
                keyParameter = new KeyParameter(key.getEncoded());
            } else {
                if (!(algorithmParameterSpec instanceof IvParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("unknown parameter type.");
                }
                ParametersWithIV parametersWithIV = new ParametersWithIV(new KeyParameter(key.getEncoded()), ((IvParameterSpec) algorithmParameterSpec).getIV());
                this.E0 = parametersWithIV;
                cipherParametersMakePBEParameters = parametersWithIV;
            }
            cipherParametersMakePBEParameters = keyParameter;
        }
        if (i11 != 0 && !(cipherParametersMakePBEParameters instanceof ParametersWithIV)) {
            SecureRandom secureRandom2 = secureRandom == null ? CryptoServicesRegistrar.getSecureRandom() : secureRandom;
            if (i10 != 1 && i10 != 3) {
                throw new InvalidAlgorithmParameterException("no IV set when one expected");
            }
            byte[] bArr = new byte[i11];
            secureRandom2.nextBytes(bArr);
            ParametersWithIV parametersWithIV2 = new ParametersWithIV(cipherParametersMakePBEParameters, bArr);
            this.E0 = parametersWithIV2;
            cipherParametersMakePBEParameters = parametersWithIV2;
        }
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new InvalidParameterException("unknown opmode " + i10 + " passed");
                        }
                    }
                }
                streamCipher.init(false, cipherParametersMakePBEParameters);
                return;
            }
            streamCipher.init(true, cipherParametersMakePBEParameters);
        } catch (Exception e5) {
            throw new InvalidKeyException(e5.getMessage());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher, javax.crypto.CipherSpi
    public int engineGetOutputSize(int i10) {
        return i10;
    }
}
