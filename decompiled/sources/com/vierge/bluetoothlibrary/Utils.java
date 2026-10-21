package com.vierge.bluetoothlibrary;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class Utils {
    public static HashMap<Integer, String> specialCodes;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        specialCodes = map;
        map.put(2, "<STX>");
        specialCodes.put(3, "<ETX>");
        specialCodes.put(4, "<EOT>");
        specialCodes.put(21, "<NAK>");
        specialCodes.put(6, "<ACK>");
        specialCodes.put(5, "<ENQ>");
        specialCodes.put(13, "<CR>");
        specialCodes.put(10, "<LF>");
        specialCodes.put(26, "<SUB>");
        specialCodes.put(9, "<HT>");
        specialCodes.put(8, "<BS>");
        specialCodes.put(7, "<BEL>");
        specialCodes.put(1, "<SOH>");
        specialCodes.put(0, "<NUL>");
        specialCodes.put(16, "<DLE>");
        specialCodes.put(18, "<DC2>");
        specialCodes.put(30, "<RS>");
    }

    public static ArrayList<Short> getArrayList(short[] sArr) {
        ArrayList<Short> arrayList = new ArrayList<>();
        for (short s4 : sArr) {
            arrayList.add(Short.valueOf(s4));
        }
        return arrayList;
    }

    public static String printData3(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (specialCodes.containsKey(Byte.valueOf(bArr[i10]))) {
                stringBuffer.append(specialCodes.get(Integer.valueOf(bArr[i10])));
                stringBuffer.append(" - ");
            } else {
                stringBuffer.append(String.format("0x%04X", Integer.valueOf(bArr[i10])));
                stringBuffer.append(" - ");
            }
        }
        return stringBuffer.toString();
    }

    public static ArrayList setData(short[] sArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(getArrayList(sArr));
        return arrayList;
    }
}
