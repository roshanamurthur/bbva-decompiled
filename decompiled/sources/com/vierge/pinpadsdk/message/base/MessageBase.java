package com.vierge.pinpadsdk.message.base;

import androidx.room.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
public abstract class MessageBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67537a;
    protected String code = "";

    public ArrayList<Short> getArrayList(short[] sArr) {
        ArrayList<Short> arrayList = new ArrayList<>();
        for (short s4 : sArr) {
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    public byte[] getByteArray(ArrayList<Byte> arrayList) {
        byte[] bArr = new byte[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            bArr[i10] = arrayList.get(i10).byteValue();
        }
        return bArr;
    }

    public String getCode() {
        return this.code;
    }

    public byte[] getSendMessageACK() {
        return new byte[]{6};
    }

    public byte[] getSendMessageEOT() {
        return new byte[]{4};
    }

    public byte[] getSendMessageNAK() {
        return new byte[]{MessageUtils.MESSAGE_21_NAK};
    }

    public short[] getShortArray(ArrayList<Short> arrayList) {
        short[] sArr = new short[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            sArr[i10] = arrayList.get(i10).shortValue();
        }
        return sArr;
    }

    public int getType() {
        return this.f67537a;
    }

    public void setCommandString(String str) {
        this.code = str;
    }

    public void setTypeMessage(int i10) {
        this.f67537a = i10;
    }

    public ArrayList<Byte> stringHexToArrayList(String str) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        int iA = 0;
        while (iA < str.length() / 2) {
            int i10 = iA * 2;
            iA = a.a((byte) Integer.parseInt(str.substring(i10, i10 + 2), 16), arrayList, iA, 1);
        }
        return arrayList;
    }

    public ArrayList<Byte> stringToArrayList(String str) {
        char[] charArray = str.toCharArray();
        ArrayList<Byte> arrayList = new ArrayList<>();
        for (int iA = 0; iA < charArray.length; iA = a.a((byte) charArray[iA], arrayList, iA, 1)) {
        }
        return arrayList;
    }

    public ArrayList<Integer> getArrayList(int[] iArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }
}
