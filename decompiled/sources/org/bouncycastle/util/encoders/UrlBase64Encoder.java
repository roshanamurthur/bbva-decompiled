package org.bouncycastle.util.encoders;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;

/* JADX INFO: loaded from: classes13.dex */
public class UrlBase64Encoder extends Base64Encoder {
    public UrlBase64Encoder() {
        byte[] bArr = this.encodingTable;
        bArr[bArr.length - 2] = 45;
        bArr[bArr.length - 1] = Constants.STATE_ERROR;
        this.padding = (byte) 46;
        initialiseDecodingTable();
    }
}
