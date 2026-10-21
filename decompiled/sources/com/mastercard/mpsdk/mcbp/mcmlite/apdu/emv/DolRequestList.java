package com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv;

import c2.b;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mastercard.mpsdk.mcbp.mcmlite.utils.McmLiteUtils;
import com.noknok.android.client.asm.authenticator.KSUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class DolRequestList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f50778a = new ArrayList();

    public static class DolItem {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f50779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50780b;

        public DolItem(String str, int i10) {
            this.f50779a = str;
            this.f50780b = i10;
        }

        public int getLength() {
            return this.f50780b;
        }

        public String getTag() {
            return this.f50779a;
        }
    }

    public DolRequestList(byte[] bArr) {
        int i10;
        int i11;
        if (bArr == 0) {
            return;
        }
        int i12 = 0;
        while (i12 < bArr.length) {
            if (i12 < 0 || i12 >= bArr.length) {
                throw new IllegalArgumentException("Invalid TLV: " + McmLiteUtils.byteArrayToHexString(bArr));
            }
            if (i12 < 0 || i12 >= bArr.length) {
                throw new IllegalArgumentException("Invalid offset or data");
            }
            if ((bArr[i12] & 31) == 31) {
                i10 = 1;
                for (int i13 = 1; i13 < bArr.length; i13++) {
                    i10++;
                    if ((bArr[i12 + i13] & 128) != 128) {
                        break;
                    }
                }
            } else {
                i10 = 1;
            }
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i12, bArr2, 0, i10);
            String strByteArrayToHexString = McmLiteUtils.byteArrayToHexString(bArr2);
            int i14 = i12 + i10;
            int iA = a(bArr, i14);
            if (i14 < 0 || i14 >= bArr.length) {
                throw new IllegalArgumentException("Invalid offset or data");
            }
            int iA2 = a(bArr, i14);
            if (bArr.length < i14 + iA2) {
                throw new IllegalArgumentException("Invalid length");
            }
            if (iA2 == 1) {
                i11 = bArr[i14];
            } else {
                int iE = 0;
                for (int i15 = 1; i15 < iA2; i15++) {
                    iE += (bArr[i15 + i14] & 255) << b.e(iA2, i15, 1, 8);
                }
                i11 = iE;
            }
            i12 += i10 + iA;
            this.f50778a.add(new DolItem(strByteArrayToHexString, i11));
        }
    }

    public static int a(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            throw new IllegalArgumentException("Invalid offset or data");
        }
        byte b10 = bArr[i10];
        return ((b10 & 128) == 128 ? b10 & 127 : 0) + 1;
    }

    public static DolRequestList of(byte[] bArr) {
        return new DolRequestList(bArr);
    }

    public boolean addTag(String str, int i10) {
        ArrayList arrayList = this.f50778a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((DolItem) it.next()).f50779a.equalsIgnoreCase(str)) {
                return false;
            }
        }
        arrayList.add(new DolItem(str, i10));
        return true;
    }

    public byte[] getBytes() {
        ArrayList<DolItem> arrayList = this.f50778a;
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            int i11 = 1;
            if (!it.hasNext()) {
                break;
            }
            DolItem dolItem = (DolItem) it.next();
            int length = dolItem.f50779a.length() / 2;
            if (dolItem.f50780b > 127) {
                i11 = 2;
            }
            i10 += length + i11;
        }
        byte[] bArr = new byte[i10];
        int i12 = 0;
        for (DolItem dolItem2 : arrayList) {
            byte[] bArrByteArrayFromHexString = McmLiteUtils.byteArrayFromHexString(dolItem2.f50779a);
            System.arraycopy(bArrByteArrayFromHexString, 0, bArr, i12, bArrByteArrayFromHexString.length);
            int length2 = i12 + bArrByteArrayFromHexString.length;
            int i13 = dolItem2.f50780b;
            if (i13 <= 127) {
                bArr[length2] = (byte) i13;
            } else {
                bArr[length2] = KSUtils.PLAIN_BUFFER;
                length2++;
                bArr[length2] = (byte) i13;
            }
            i12 = length2 + 1;
        }
        return bArr;
    }

    public int getExpectedDolLength() {
        Iterator it = this.f50778a.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((DolItem) it.next()).f50780b;
        }
        return i10;
    }

    public final List<DolItem> getRequestList() {
        return this.f50778a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (DolItem dolItem : this.f50778a) {
            sb2.append(dolItem.f50779a);
            sb2.append(", ");
            sb2.append(dolItem.f50780b);
            sb2.append(RootService.LINE_BREAK);
        }
        return sb2.toString();
    }
}
