package com.mastercard.mpsdk.mcbp.mcmlite.utils;

import c2.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public class TlvEditor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f51025a = new ArrayList();

    public class Field {
        public final byte[] mTag;
        public final byte[] mValue;

        public Field(TlvEditor tlvEditor, byte[] bArr, byte[] bArr2) {
            this.mTag = bArr;
            this.mValue = bArr2;
        }
    }

    public TlvEditor(byte[] bArr) {
        int i10;
        int i11;
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
            byte[] bArr3 = new byte[i11];
            System.arraycopy(bArr, i14 + iA, bArr3, 0, i11);
            this.f51025a.add(new Field(this, bArr2, bArr3));
            i12 += i10 + iA + i11;
        }
    }

    public static int a(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            throw new IllegalArgumentException("Invalid offset or data");
        }
        byte b10 = bArr[i10];
        return ((b10 & 128) == 128 ? b10 & 127 : 0) + 1;
    }

    public static TlvEditor of(byte[] bArr) {
        try {
            return new TlvEditor(bArr);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e5) {
            e5.printStackTrace();
            return null;
        }
    }

    public void addTlv(byte[] bArr, byte[] bArr2) {
        ArrayList arrayList;
        int i10 = 0;
        while (true) {
            arrayList = this.f51025a;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (Arrays.equals(((Field) arrayList.get(i10)).mTag, bArr)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 == -1) {
            arrayList.add(new Field(this, bArr, bArr2));
        } else {
            arrayList.set(i10, new Field(this, bArr, bArr2));
        }
    }

    public byte[] getValue(String str) {
        if (str == null) {
            return null;
        }
        return getValue(McmLiteUtils.byteArrayFromHexString(str));
    }

    public byte[] rebuildByteArray() {
        ArrayList<byte[]> arrayList = new ArrayList();
        for (Field field : this.f51025a) {
            arrayList.add(Tlv.create(field.mTag, field.mValue));
        }
        Iterator it = arrayList.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (byte[] bArr2 : arrayList) {
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001f  */
    /* JADX WARN: Code duplicated, block: B:12:0x0022 A[RETURN] */
    public byte[] getValue(byte[] bArr) {
        for (Field field : this.f51025a) {
            if (Arrays.equals(bArr, field.mTag)) {
                if (field != null) {
                    return field.mValue;
                }
                return null;
            }
        }
        field = null;
        if (field != null) {
            return field.mValue;
        }
        return null;
    }
}
