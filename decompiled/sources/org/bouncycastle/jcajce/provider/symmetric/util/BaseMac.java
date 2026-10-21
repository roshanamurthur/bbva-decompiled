package org.bouncycastle.jcajce.provider.symmetric.util;

import ci.a;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Hashtable;
import java.util.Map;
import javax.crypto.MacSpi;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.PBEKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.HMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.params.RC2Parameters;
import org.bouncycastle.crypto.params.SkeinParameters;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.spec.AEADParameterSpec;
import org.bouncycastle.jcajce.spec.SkeinParameterSpec;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class BaseMac extends MacSpi implements PBE {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final Class f90221q0 = ClassUtil.loadClass(BaseMac.class, "javax.crypto.spec.GCMParameterSpec");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Mac f90222p0;

    public BaseMac(Mac mac) {
        this.f90222p0 = mac;
    }

    @Override // javax.crypto.MacSpi
    public byte[] engineDoFinal() {
        byte[] bArr = new byte[engineGetMacLength()];
        this.f90222p0.doFinal(bArr, 0);
        return bArr;
    }

    @Override // javax.crypto.MacSpi
    public int engineGetMacLength() {
        return this.f90222p0.getMacSize();
    }

    @Override // javax.crypto.MacSpi
    public void engineInit(Key key, AlgorithmParameterSpec algorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException {
        int i10;
        CipherParameters cipherParametersMakePBEMacParameters;
        if (key == null) {
            throw new InvalidKeyException("key is null");
        }
        boolean z10 = key instanceof PKCS12Key;
        Mac mac = this.f90222p0;
        if (z10) {
            try {
                SecretKey secretKey = (SecretKey) key;
                try {
                    PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
                    if ((secretKey instanceof PBEKey) && pBEParameterSpec == null) {
                        PBEKey pBEKey = (PBEKey) secretKey;
                        pBEParameterSpec = new PBEParameterSpec(pBEKey.getSalt(), pBEKey.getIterationCount());
                    }
                    int i11 = 256;
                    if (mac.getAlgorithmName().startsWith("GOST")) {
                        i10 = 6;
                    } else {
                        if (!(mac instanceof HMac) || mac.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA1)) {
                            i10 = 1;
                        } else if (mac.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA224)) {
                            i10 = 7;
                            i11 = 224;
                        } else if (mac.getAlgorithmName().startsWith("SHA-256")) {
                            i10 = 4;
                        } else if (mac.getAlgorithmName().startsWith(McElieceCCA2KeyGenParameterSpec.SHA384)) {
                            i10 = 8;
                            i11 = BluetoothState.REQUEST_CONNECT_DEVICE;
                        } else if (mac.getAlgorithmName().startsWith("SHA-512")) {
                            i10 = 9;
                            i11 = 512;
                        } else {
                            if (!mac.getAlgorithmName().startsWith("RIPEMD160")) {
                                throw new InvalidAlgorithmParameterException("no PKCS12 mapping for HMAC: " + mac.getAlgorithmName());
                            }
                            i10 = 2;
                        }
                        i11 = 160;
                    }
                    cipherParametersMakePBEMacParameters = PBE.Util.makePBEMacParameters(secretKey, 2, i10, i11, pBEParameterSpec);
                } catch (Exception unused) {
                    throw new InvalidAlgorithmParameterException("PKCS12 requires a PBEParameterSpec");
                }
            } catch (Exception unused2) {
                throw new InvalidKeyException("PKCS12 requires a SecretKey/PBEKey");
            }
        } else if (key instanceof BCPBEKey) {
            BCPBEKey bCPBEKey = (BCPBEKey) key;
            if (bCPBEKey.getParam() != null) {
                cipherParametersMakePBEMacParameters = bCPBEKey.getParam();
            } else {
                if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                    throw new InvalidAlgorithmParameterException("PBE requires PBE parameters to be set.");
                }
                cipherParametersMakePBEMacParameters = PBE.Util.makePBEMacParameters(bCPBEKey, algorithmParameterSpec);
            }
        } else {
            if (algorithmParameterSpec instanceof PBEParameterSpec) {
                throw new InvalidAlgorithmParameterException("inappropriate parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
            }
            cipherParametersMakePBEMacParameters = new KeyParameter(key.getEncoded());
        }
        KeyParameter keyParameter = cipherParametersMakePBEMacParameters instanceof ParametersWithIV ? (KeyParameter) ((ParametersWithIV) cipherParametersMakePBEMacParameters).getParameters() : (KeyParameter) cipherParametersMakePBEMacParameters;
        if (algorithmParameterSpec instanceof AEADParameterSpec) {
            AEADParameterSpec aEADParameterSpec = (AEADParameterSpec) algorithmParameterSpec;
            cipherParametersMakePBEMacParameters = new AEADParameters(keyParameter, aEADParameterSpec.getMacSizeInBits(), aEADParameterSpec.getNonce(), aEADParameterSpec.getAssociatedData());
        } else if (algorithmParameterSpec instanceof IvParameterSpec) {
            cipherParametersMakePBEMacParameters = new ParametersWithIV(keyParameter, ((IvParameterSpec) algorithmParameterSpec).getIV());
        } else if (algorithmParameterSpec instanceof RC2ParameterSpec) {
            RC2ParameterSpec rC2ParameterSpec = (RC2ParameterSpec) algorithmParameterSpec;
            cipherParametersMakePBEMacParameters = new ParametersWithIV(new RC2Parameters(keyParameter.getKey(), rC2ParameterSpec.getEffectiveKeyBits()), rC2ParameterSpec.getIV());
        } else if (algorithmParameterSpec instanceof SkeinParameterSpec) {
            Map parameters = ((SkeinParameterSpec) algorithmParameterSpec).getParameters();
            Hashtable hashtable = new Hashtable();
            for (Object obj : parameters.keySet()) {
                hashtable.put(obj, parameters.get(obj));
            }
            cipherParametersMakePBEMacParameters = new SkeinParameters.Builder(hashtable).setKey(keyParameter.getKey()).build();
        } else if (algorithmParameterSpec == null) {
            cipherParametersMakePBEMacParameters = new KeyParameter(key.getEncoded());
        } else {
            Class cls = f90221q0;
            if (cls != null && cls.isAssignableFrom(algorithmParameterSpec.getClass())) {
                try {
                    cipherParametersMakePBEMacParameters = new AEADParameters(keyParameter, ((Integer) cls.getDeclaredMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue(), (byte[]) cls.getDeclaredMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]));
                } catch (Exception unused3) {
                    throw new InvalidAlgorithmParameterException("Cannot process GCMParameterSpec.");
                }
            } else if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidAlgorithmParameterException("unknown parameter type: ".concat(algorithmParameterSpec.getClass().getName()));
            }
        }
        try {
            mac.init(cipherParametersMakePBEMacParameters);
        } catch (Exception e5) {
            throw new InvalidAlgorithmParameterException(a.b(e5, new StringBuilder("cannot initialize MAC: ")));
        }
    }

    @Override // javax.crypto.MacSpi
    public void engineReset() {
        this.f90222p0.reset();
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte b10) {
        this.f90222p0.update(b10);
    }

    public BaseMac(Mac mac, int i10, int i11, int i12) {
        this.f90222p0 = mac;
    }

    @Override // javax.crypto.MacSpi
    public void engineUpdate(byte[] bArr, int i10, int i11) {
        this.f90222p0.update(bArr, i10, i11);
    }
}
