package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes6.dex */
public class DolValues {
    private final Map<String, byte[]> mDolValues = new HashMap();

    public byte[] getValueByTag(String str) {
        return this.mDolValues.get(str);
    }

    public void processTerminalDol(DolRequestList dolRequestList, byte[] bArr) {
        if (dolRequestList == null || bArr == null) {
            return;
        }
        int length = 0;
        for (DolRequestList.DolItem dolItem : dolRequestList.getRequestList()) {
            if (dolItem.getLength() + length > bArr.length) {
                return;
            }
            byte[] bArr2 = new byte[dolItem.getLength()];
            System.arraycopy(bArr, length, bArr2, 0, dolItem.getLength());
            length += dolItem.getLength();
            this.mDolValues.put(dolItem.getTag(), bArr2);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, byte[]> entry : this.mDolValues.entrySet()) {
            sb2.append(Constant.BRACKET_OPEN);
            sb2.append(entry.getKey());
            sb2.append("|");
            sb2.append(HexUtils.byteArrayToHexString(entry.getValue()));
            sb2.append("] ");
        }
        return sb2.toString();
    }
}
