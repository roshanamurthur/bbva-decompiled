package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.message;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MessageBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f67769a;
    protected String code = "";
    public boolean debug = false;

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

    public short[] getShortArray(ArrayList<Short> arrayList) {
        short[] sArr = new short[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            sArr[i10] = arrayList.get(i10).shortValue();
        }
        return sArr;
    }

    public int getType() {
        return this.f67769a;
    }

    public void setCommandString(String str) {
        this.code = str;
    }

    public void setDebug(boolean z10) {
        this.debug = z10;
    }

    public void setTypeMessage(int i10) {
        this.f67769a = i10;
    }

    public ArrayList<Integer> getArrayList(int[] iArr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return arrayList;
    }
}
