package com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv;

import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public class DolValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f50781a = new HashMap();

    public DolValues(DolRequestList dolRequestList, byte[] bArr) {
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
            this.f50781a.put(dolItem.getTag(), bArr2);
        }
    }

    public static DolValues of(DolRequestList dolRequestList, byte[] bArr) {
        return new DolValues(dolRequestList, bArr);
    }

    public byte[] getValueByTag(String str) {
        return (byte[]) this.f50781a.get(str);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry entry : this.f50781a.entrySet()) {
            sb2.append(Constant.BRACKET_OPEN);
            sb2.append((String) entry.getKey());
            sb2.append("|");
            sb2.append(McmLiteUtils.byteArrayToHexString((byte[]) entry.getValue()));
            sb2.append("] ");
        }
        return sb2.toString();
    }
}
