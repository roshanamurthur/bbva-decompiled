package com.bbva.sl.ar.android.libmcrypt.impl;

import android.content.Context;
import android.util.Log;
import com.bbva.sl.ar.android.libmcrypt.tools.AndroidPropertiesManager;
import com.bbva.sl.ar.core.libmcrypt.HostData;
import com.bbva.sl.ar.core.libmcrypt.KpubData;
import com.bbva.sl.ar.core.libmcrypt.LibMCrypt;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.sl.ar.core.libmcrypt.exception.LibMCryptException;
import com.bbva.sl.ar.core.libmcrypt.impl.HostDataByte;
import com.bbva.sl.ar.core.libmcrypt.impl.LibMCryptConstants;
import com.bbva.sl.ar.core.libmcrypt.tools.CryptoTools;
import com.bbva.sl.ar.core.libmcrypt.tools.VarTools;
import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes8.dex */
public class LibMCryptAndroid implements LibMCrypt {

    /* JADX INFO: renamed from: pm, reason: collision with root package name */
    private AndroidPropertiesManager f36584pm;
    private RSAPrivateKey priK;

    public LibMCryptAndroid(Context context) throws LibMCryptException {
        this.f36584pm = new AndroidPropertiesManager(context);
    }

    @Override // com.bbva.sl.ar.core.libmcrypt.LibMCrypt
    public String decryptHostData(String str) throws LibMCryptException {
        if (str.length() != 1028) {
            Log.w(LibMCryptConstants.DECRYPT_HOST_DATA, "Error code 203: Incorrect length of the encrypted data");
            throw new LibMCryptException(203, ErrorCodes.ERR_CRY_BAD_RSA_DATA_LEN_MSG);
        }
        RSAPrivateKey rSAPrivateKey = this.priK;
        try {
            HostDataByte hostDataByte = new HostDataByte(str);
            if (Arrays.equals(hostDataByte.getVersion(), VarTools.hexStr2Bytes("01"))) {
                return VarTools.bytes2HexStr(CryptoTools.decrypt(CryptoTools.generateKeyDESEDE(CryptoTools.rsaDecrypt(hostDataByte.getSegmento1(), rSAPrivateKey)), CryptoTools.rsaDecrypt(hostDataByte.getSegmento2(), rSAPrivateKey)));
            }
            throw new LibMCryptException(ErrorCodes.ERR_CRY_BAD_PROTO, ErrorCodes.ERR_CRY_BAD_PROTO_MSG);
        } catch (LibMCryptException e5) {
            Log.w(LibMCryptConstants.DECRYPT_HOST_DATA, "Error code " + e5.getErrCode() + ": " + e5.getErrMsg());
            throw new LibMCryptException(e5.getErrCode(), e5.getErrMsg());
        }
    }

    @Override // com.bbva.sl.ar.core.libmcrypt.LibMCrypt
    public HostData encryptHostData(String str, String str2, String str3) throws LibMCryptException {
        if (str == null) {
            Log.w(LibMCryptConstants.ENCRYPT_HOST_DATA, "Error code 211: Incorrect types conversion");
            throw new LibMCryptException(211, ErrorCodes.ERR_CRY_BAD_TYPES_CONV_MSG);
        }
        if (str.length() > 480 || str.length() % 16 != 0) {
            Log.w(LibMCryptConstants.ENCRYPT_HOST_DATA, "Error code 213: Incorrect data length");
            throw new LibMCryptException(ErrorCodes.ERR_CRY_BAD_PIN_SIZE, ErrorCodes.ERR_CRY_BAD_PIN_SIZE_MSG);
        }
        try {
            String property = this.f36584pm.getProperty(CryptoTools.getPublicKeyByTag("keyIndex", str3, this.f36584pm.getProperties()));
            byte[] bArrHexStr2Bytes = VarTools.hexStr2Bytes(str);
            RSAPublicKey rSAPublicKeyGeneratePublicKey = CryptoTools.generatePublicKey(this.f36584pm, str3);
            SecretKey secretKeyGenerateRandomKeyDESEDE = CryptoTools.generateRandomKeyDESEDE();
            byte[] bArrRsaEncrypt = CryptoTools.rsaEncrypt(CryptoTools.encrypt(secretKeyGenerateRandomKeyDESEDE, bArrHexStr2Bytes), rSAPublicKeyGeneratePublicKey);
            byte[] bArrRsaEncrypt2 = CryptoTools.rsaEncrypt(Arrays.copyOfRange(secretKeyGenerateRandomKeyDESEDE.getEncoded(), 0, 16), rSAPublicKeyGeneratePublicKey);
            String strBytes2HexStr = VarTools.bytes2HexStr(bArrRsaEncrypt);
            return new HostData(property + "01" + VarTools.bytes2HexStr(bArrRsaEncrypt2) + strBytes2HexStr, null);
        } catch (LibMCryptException e5) {
            Log.w(LibMCryptConstants.ENCRYPT_HOST_DATA, "Error code " + e5.getErrCode() + ": " + e5.getErrMsg());
            throw new LibMCryptException(e5.getErrCode(), e5.getMessage());
        }
    }

    @Override // com.bbva.sl.ar.core.libmcrypt.LibMCrypt
    public KpubData generateKpub(String str) throws LibMCryptException {
        KeyPair keyPairGenerateKeyPair = CryptoTools.generateKeyPair();
        KpubData kpubData = new KpubData(((RSAPublicKey) keyPairGenerateKeyPair.getPublic()).getModulus().toString(16), null);
        this.priK = (RSAPrivateKey) keyPairGenerateKeyPair.getPrivate();
        return kpubData;
    }

    @Override // com.bbva.sl.ar.core.libmcrypt.LibMCrypt
    public HostData encryptHostData(String str, String str2) throws LibMCryptException {
        return encryptHostData(str, str2, "default");
    }
}
