package com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.pojo;

import c2.b;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.utils.HexUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class DolRequestList {
    public int dolItemsLength = 0;
    private List<DolItem> mDolItems = new ArrayList();

    public static class DolItem {
        private final int mLength;
        private final String mTag;

        public DolItem(String str, int i10) {
            this.mTag = str;
            this.mLength = i10;
        }

        public int getLength() {
            return this.mLength;
        }

        public String getTag() {
            return this.mTag;
        }
    }

    private static int getDataLength(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            throw new IllegalArgumentException("Invalid offset or data");
        }
        int numberOfBytesInLength = getNumberOfBytesInLength(bArr, i10);
        if (bArr.length < i10 + numberOfBytesInLength) {
            throw new IllegalArgumentException("Invalid length");
        }
        if (numberOfBytesInLength == 1) {
            return bArr[i10];
        }
        int iE = 0;
        for (int i11 = 1; i11 < numberOfBytesInLength; i11++) {
            iE += (bArr[i11 + i10] & 255) << b.e(numberOfBytesInLength, i11, 1, 8);
        }
        return iE;
    }

    private static int getNumberOfBytesInLength(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            throw new IllegalArgumentException("Invalid offset or data");
        }
        byte b10 = bArr[i10];
        return ((b10 & 128) == 128 ? b10 & 127 : 0) + 1;
    }

    private static int getTagLength(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            throw new IllegalArgumentException("Invalid offset or data");
        }
        if ((bArr[i10] & 31) != 31) {
            return 1;
        }
        int i11 = 1;
        for (int i12 = 1; i12 < bArr.length; i12++) {
            i11++;
            if ((bArr[i10 + i12] & 128) != 128) {
                break;
            }
        }
        return i11;
    }

    private static byte[] readNextTag(byte[] bArr, int i10) throws IllegalArgumentException {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            throw new IllegalArgumentException("Invalid TLV: " + HexUtils.byteArrayToHexString(bArr));
        }
        int tagLength = getTagLength(bArr, i10);
        byte[] bArr2 = new byte[tagLength];
        System.arraycopy(bArr, i10, bArr2, 0, tagLength);
        return bArr2;
    }

    public void createDolRequestList(byte[] bArr) {
        int length = 0;
        while (length < bArr.length) {
            byte[] nextTag = readNextTag(bArr, length);
            String strByteArrayToHexString = HexUtils.byteArrayToHexString(nextTag);
            int length2 = nextTag.length + length;
            int numberOfBytesInLength = getNumberOfBytesInLength(bArr, length2);
            int dataLength = getDataLength(bArr, length2);
            length += nextTag.length + numberOfBytesInLength;
            this.mDolItems.add(new DolItem(strByteArrayToHexString, dataLength));
            this.dolItemsLength += dataLength;
        }
    }

    public final List<DolItem> getRequestList() {
        return this.mDolItems;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (DolItem dolItem : this.mDolItems) {
            sb2.append(dolItem.mTag);
            sb2.append(", ");
            sb2.append(dolItem.mLength);
            sb2.append(RootService.LINE_BREAK);
        }
        return sb2.toString();
    }
}
