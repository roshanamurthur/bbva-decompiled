package com.bbva.tohu.android.product.valkyria.sdk.services.impl;

import android.util.Base64;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;

/* JADX INFO: loaded from: classes6.dex */
public class EncoderServiceDefaultImpl implements EncoderService {
    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService
    public byte[] base64ToBytes(String str) {
        return HexUtils.byteArrayFromBase64String(str);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService
    public String base64urlFromBytes(byte[] bArr) {
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService
    public byte[] base64urlToBytes(String str) {
        return Base64.decode(str, 8);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService
    public byte[] bytesFromHexString(String str) {
        return McmLiteUtils.byteArrayFromHexString(str);
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService
    public String decodeBase64url(String str) {
        return new String(Base64.decode(str, 8));
    }

    @Override // com.bbva.tohu.android.product.valkyria.sdk.services.EncoderService
    public String hexStringFromBytes(byte[] bArr) {
        return McmLiteUtils.byteArrayToHexString(bArr);
    }
}
