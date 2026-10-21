package com.vierge.pinpadsdk.message.base;

import androidx.core.graphics.b;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes6.dex */
public class MessageSendBase extends MessageBase {
    public ArrayList<Byte> dateToFormattedData(Date date) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        StringBuilder sbD = b.d((byte) Integer.decode("0x" + new SimpleDateFormat("yy").format(date)).intValue(), arrayList, "0x");
        sbD.append(new SimpleDateFormat("MM").format(date));
        StringBuilder sbD2 = b.d((byte) Integer.decode(sbD.toString()).intValue(), arrayList, "0x");
        sbD2.append(new SimpleDateFormat("dd").format(date));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sbD2.toString()).intValue()));
        return arrayList;
    }

    public ArrayList<Byte> dateToFormattedTime(Date date) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        StringBuilder sbD = b.d((byte) Integer.decode("0x" + new SimpleDateFormat("HH").format(new Date())).intValue(), arrayList, "0x");
        sbD.append(new SimpleDateFormat("mm").format(new Date()));
        StringBuilder sbD2 = b.d((byte) Integer.decode(sbD.toString()).intValue(), arrayList, "0x");
        sbD2.append(new SimpleDateFormat("ss").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sbD2.toString()).intValue()));
        return arrayList;
    }

    public byte[] encapsulate(ArrayList<Byte> arrayList) {
        arrayList.add(0, (byte) 2);
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(arrayList)));
        return getByteArray(arrayList);
    }

    public ArrayList<Byte> paramToSeparatorLengthValue(byte b10, String str) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add(Byte.valueOf(b10));
        ArrayList<Byte> arrayListStringToArrayList = stringToArrayList(str);
        arrayList.add(Byte.valueOf((byte) arrayListStringToArrayList.size()));
        arrayList.addAll(arrayListStringToArrayList);
        return arrayList;
    }

    public ArrayList<Byte> paramToValueFixedLength(String str, int i10, char c10) {
        ArrayList<Byte> arrayListStringToArrayList = stringToArrayList(str);
        if (arrayListStringToArrayList.size() > i10) {
            while (arrayListStringToArrayList.size() > i10) {
                arrayListStringToArrayList.remove(arrayListStringToArrayList.size() - 1);
            }
        } else {
            while (arrayListStringToArrayList.size() < i10) {
                arrayListStringToArrayList.add(Byte.valueOf((byte) c10));
            }
        }
        return arrayListStringToArrayList;
    }

    public ArrayList<Byte> paramToSeparatorLengthValue(byte b10, ArrayList arrayList) {
        ArrayList<Byte> arrayList2 = new ArrayList<>();
        arrayList2.add(Byte.valueOf(b10));
        arrayList2.add(Byte.valueOf((byte) arrayList.size()));
        arrayList2.addAll(arrayList);
        return arrayList2;
    }

    public ArrayList<Byte> paramToSeparatorLengthValue(byte b10, int i10) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add(Byte.valueOf(b10));
        arrayList.add((byte) 1);
        arrayList.add(Byte.valueOf((byte) i10));
        return arrayList;
    }
}
