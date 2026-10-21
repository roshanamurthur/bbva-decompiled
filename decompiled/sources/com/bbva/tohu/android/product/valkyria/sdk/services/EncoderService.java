package com.bbva.tohu.android.product.valkyria.sdk.services;

/* JADX INFO: loaded from: classes6.dex */
public interface EncoderService {
    byte[] base64ToBytes(String str);

    String base64urlFromBytes(byte[] bArr);

    byte[] base64urlToBytes(String str);

    byte[] bytesFromHexString(String str);

    String decodeBase64url(String str);

    String hexStringFromBytes(byte[] bArr);
}
