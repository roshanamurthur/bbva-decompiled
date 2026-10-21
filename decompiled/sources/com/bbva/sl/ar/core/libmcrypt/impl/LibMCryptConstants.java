package com.bbva.sl.ar.core.libmcrypt.impl;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.math.BigInteger;
import java.security.spec.RSAKeyGenParameterSpec;

/* JADX INFO: loaded from: classes8.dex */
public class LibMCryptConstants {
    public static final String DECRYPT_HOST_DATA = "decryptHostData";
    public static final String ENCRYPT_HOST_DATA = "encryptHostData";
    public static final String GENERATE_K_PUB = "generateKpub";
    public static final int IND_HEX_INDICE = 0;
    public static final int IND_HEX_SEGMENTO1 = 4;
    public static final int IND_HEX_SEGMENTO2 = 516;
    public static final int IND_HEX_VERSION = 2;
    public static final int KEY_FIN = 16;
    public static final int KEY_INICIO = 0;
    public static final String PROTO_VERSION = "01";
    public static final int PUBPRIVKEY_BITLEN = 2048;
    public static final byte[] PUBPRIVKEY_KEYTYPE = {82, 83, 65};
    public static final byte[] PUBPRIVKEY_ALGORITHM = {82, 83, 65, 47, 69, 67, 66, 47, Constants.CVR_B1b85_0101_MOBILE_APP, 75, 67, 83, 49, Constants.CVR_B1b85_0101_MOBILE_APP, Constants.DIRECTORY_ENTRY, 100, 100, 105, 110, 103};
    public static final byte[] CIPHER_KEYTYPE = {68, 69, 83, 101, 100, 101};
    public static final byte[] CIPHER_ALGORITHM = {68, 69, 83, 101, 100, 101, 47, 67, 66, 67, 47, 78, Constants.FCI_TEMPLATE, Constants.CVR_B1b85_0101_MOBILE_APP, Constants.DIRECTORY_ENTRY, 100, 100, 105, 110, 103};
    public static final byte[] IV = {0, 0, 0, 0, 0, 0, 0, 0};
    public static final BigInteger PUBPRIVKEY_EXP = RSAKeyGenParameterSpec.F4;
}
