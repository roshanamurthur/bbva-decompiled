package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.message;

import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
public class MessageSend extends MessageBase {
    public static String a(String str) {
        int i10;
        int[] iArr = {0, 4, 6, 12};
        int i11 = Integer.parseInt(str);
        boolean z10 = false;
        for (int i12 = 0; i12 < 4; i12++) {
            if (i11 == iArr[i12]) {
                z10 = true;
            }
        }
        if (z10) {
            return str;
        }
        if (i11 > iArr[0] && i11 < (i10 = iArr[1])) {
            return String.valueOf(i10);
        }
        int i13 = iArr[1];
        if (i11 > i13 && i11 < iArr[2]) {
            return String.valueOf(i13);
        }
        int i14 = iArr[2];
        if (i11 > i14 && i11 < iArr[3]) {
            return String.valueOf(i14);
        }
        int i15 = iArr[3];
        if (i11 > i15) {
            return String.valueOf(i15);
        }
        return null;
    }

    public byte[] getSendMessage72() {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_7));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_2));
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageACK() {
        return new byte[]{6};
    }

    public byte[] getSendMessageC50(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_5));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_0));
        arrayList.add((byte) 0);
        arrayList.add((byte) 22);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        String str = strArr[0];
        if (str == null || str.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            StringBuilder sb2 = new StringBuilder("0x");
            sb2.append(strArr[0]);
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb2.toString()).intValue()));
        }
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 3);
        StringBuilder sb3 = new StringBuilder("0x");
        sb3.append(new SimpleDateFormat("yy").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb3.toString()).intValue()));
        StringBuilder sb4 = new StringBuilder("0x");
        sb4.append(new SimpleDateFormat("MM").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb4.toString()).intValue()));
        StringBuilder sb5 = new StringBuilder("0x");
        sb5.append(new SimpleDateFormat("dd").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb5.toString()).intValue()));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 3);
        StringBuilder sb6 = new StringBuilder("0x");
        sb6.append(new SimpleDateFormat("HH").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb6.toString()).intValue()));
        StringBuilder sb7 = new StringBuilder("0x");
        sb7.append(new SimpleDateFormat("mm").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb7.toString()).intValue()));
        StringBuilder sb8 = new StringBuilder("0x");
        sb8.append(new SimpleDateFormat("ss").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb8.toString()).intValue()));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        arrayList.add((byte) 7);
        String str2 = String.format("%08X", Integer.valueOf(Integer.parseInt(strArr[1])));
        arrayList.add((byte) -63);
        arrayList.add((byte) 4);
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 << 1;
            StringBuilder sb9 = new StringBuilder("0x");
            sb9.append(str2.substring(i11, i11 + 2));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb9.toString()).intValue()));
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageC51(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_5));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_1));
        arrayList.add((byte) 0);
        arrayList.add((byte) 76);
        arrayList.add((byte) -63);
        arrayList.add((byte) 1);
        String str = strArr[0];
        if (str == null || str.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            StringBuilder sb2 = new StringBuilder("0x");
            sb2.append(strArr[0]);
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb2.toString()).intValue()));
        }
        arrayList.add((byte) -63);
        arrayList.add((byte) 3);
        StringBuilder sb3 = new StringBuilder("0x");
        sb3.append(new SimpleDateFormat("yy").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb3.toString()).intValue()));
        StringBuilder sb4 = new StringBuilder("0x");
        sb4.append(new SimpleDateFormat("MM").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb4.toString()).intValue()));
        StringBuilder sb5 = new StringBuilder("0x");
        sb5.append(new SimpleDateFormat("dd").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb5.toString()).intValue()));
        arrayList.add((byte) -63);
        arrayList.add((byte) 3);
        StringBuilder sb6 = new StringBuilder("0x");
        sb6.append(new SimpleDateFormat("HH").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb6.toString()).intValue()));
        StringBuilder sb7 = new StringBuilder("0x");
        sb7.append(new SimpleDateFormat("mm").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb7.toString()).intValue()));
        StringBuilder sb8 = new StringBuilder("0x");
        sb8.append(new SimpleDateFormat("ss").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb8.toString()).intValue()));
        arrayList.add((byte) -63);
        arrayList.add((byte) 1);
        arrayList.add((byte) 1);
        String str2 = String.format("%08X", Integer.valueOf(Integer.parseInt(strArr[3])));
        arrayList.add((byte) -63);
        arrayList.add((byte) 4);
        for (int i10 = 0; i10 < 4; i10++) {
            int i11 = i10 << 1;
            StringBuilder sb9 = new StringBuilder("0x");
            sb9.append(str2.substring(i11, i11 + 2));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb9.toString()).intValue()));
        }
        arrayList.add((byte) -63);
        arrayList.add((byte) 4);
        arrayList.add((byte) 0);
        arrayList.add((byte) 0);
        arrayList.add((byte) 0);
        arrayList.add((byte) 0);
        arrayList.add((byte) -63);
        arrayList.add((byte) 2);
        String str3 = strArr[2];
        if (str3 == null || str3.isEmpty()) {
            arrayList.add((byte) 4);
            arrayList.add((byte) -124);
        } else if (strArr[2].length() == 3) {
            StringBuilder sb10 = new StringBuilder("0x0");
            sb10.append(strArr[2].substring(0, 1));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb10.toString()).intValue()));
            StringBuilder sb11 = new StringBuilder("0x");
            sb11.append(strArr[2].substring(1, 3));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb11.toString()).intValue()));
        } else {
            StringBuilder sb12 = new StringBuilder("0x");
            sb12.append(strArr[2].substring(0, 2));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb12.toString()).intValue()));
            StringBuilder sb13 = new StringBuilder("0x");
            sb13.append(strArr[2].substring(2, 4));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb13.toString()).intValue()));
        }
        arrayList.add((byte) -63);
        arrayList.add((byte) 1);
        arrayList.add((byte) 0);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((byte) -31);
        arrayList2.add((byte) 39);
        arrayList2.add(Byte.valueOf(Constants.STATE_ERROR));
        arrayList2.add((byte) 42);
        arrayList2.add((byte) -126);
        arrayList2.add((byte) -124);
        arrayList2.add((byte) -107);
        arrayList2.add((byte) -102);
        arrayList2.add((byte) -100);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 2);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 3);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 9);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 16);
        arrayList2.add((byte) -97);
        arrayList2.add(Byte.valueOf(com.vierge.pinpadsdk.message.base.MessageUtils.MESSAGE_26_SUB));
        arrayList2.add((byte) -97);
        arrayList2.add(Byte.valueOf(com.vierge.pinpadsdk.message.base.MessageUtils.MESSAGE_30_RS));
        arrayList2.add((byte) -97);
        arrayList2.add(Byte.valueOf(GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH));
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 39);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 41);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 42);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 43);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 44);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 45);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 65);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 83);
        arrayList2.add((byte) -97);
        arrayList2.add((byte) 110);
        arrayList.addAll(arrayList2);
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageC54() {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_5));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_4));
        arrayList.add((byte) 0);
        arrayList.add((byte) 15);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 0);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 0);
        arrayList.add((byte) -111);
        arrayList.add((byte) 0);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 0);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 0);
        arrayList.add((byte) -30);
        arrayList.add((byte) 0);
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageC55(String[] strArr) {
        String strValueOf;
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_5));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_5));
        arrayList.add((byte) 0);
        arrayList.add((byte) 76);
        arrayList.add((byte) -63);
        int length = strArr[0].length() / 2;
        StringBuilder sb2 = new StringBuilder("0x");
        sb2.append(Integer.toHexString(length));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb2.toString()).intValue()));
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 << 1;
            StringBuilder sb3 = new StringBuilder("0x");
            sb3.append(strArr[0].substring(i11, i11 + 2));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb3.toString()).intValue()));
        }
        arrayList.add((byte) -63);
        arrayList.add((byte) 1);
        String str = strArr[1];
        if (str == null || str.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            StringBuilder sb4 = new StringBuilder("0x");
            sb4.append(strArr[1]);
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb4.toString()).intValue()));
        }
        for (char c10 : strArr[4].toCharArray()) {
            arrayList.add(Byte.valueOf((byte) c10));
        }
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        String str2 = strArr[2];
        if (str2 == null || str2.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            StringBuilder sb5 = new StringBuilder("0x");
            sb5.append(a(strArr[2]));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb5.toString()).intValue()));
        }
        arrayList.add((byte) -63);
        arrayList.add((byte) 1);
        String str3 = strArr[3];
        if (str3 == null || str3.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            StringBuilder sb6 = new StringBuilder("0x");
            String strA = a(strArr[2]);
            String strA2 = a(strArr[3]);
            int i12 = Integer.parseInt(strA);
            int i13 = Integer.parseInt(strA2);
            if (i13 >= i12) {
                strValueOf = String.valueOf(i13);
            } else if (i13 < i12) {
                while (i13 != i12) {
                    i13++;
                }
                strValueOf = String.valueOf(i13);
            } else {
                strValueOf = null;
            }
            if (this.debug) {
                System.out.println("Convertido a Int_maximo:".concat(String.valueOf(strValueOf)));
            }
            sb6.append(strValueOf);
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb6.toString()).intValue()));
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageC56(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_5));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_6));
        arrayList.add((byte) 0);
        arrayList.add((byte) 76);
        arrayList.add((byte) -63);
        int length = strArr[0].length() / 2;
        StringBuilder sb2 = new StringBuilder("0x");
        sb2.append(Integer.toHexString(length));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb2.toString()).intValue()));
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 << 1;
            StringBuilder sb3 = new StringBuilder("0x");
            sb3.append(strArr[0].substring(i11, i11 + 2));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb3.toString()).intValue()));
        }
        arrayList.add((byte) -63);
        arrayList.add((byte) 1);
        String str = strArr[1];
        if (str == null || str.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            StringBuilder sb4 = new StringBuilder("0x");
            sb4.append(strArr[1]);
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb4.toString()).intValue()));
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageEOT() {
        return new byte[]{4};
    }

    public byte[] getSendMessageNAK() {
        return new byte[]{com.vierge.pinpadsdk.message.base.MessageUtils.MESSAGE_21_NAK};
    }

    public byte[] getSendMessageQ8() {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_Q));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_8));
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageQ9(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_Q));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_9));
        String str = strArr[0];
        if (str == null || str.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            StringBuilder sb2 = new StringBuilder("0x");
            sb2.append(strArr[0]);
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb2.toString()).intValue()));
        }
        for (char c10 : strArr[1].toCharArray()) {
            arrayList.add(Byte.valueOf((byte) c10));
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ10() {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_1));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_0));
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ11(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_1));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_1));
        int length = strArr[0].length() / 2;
        for (char c10 : strArr[0].toCharArray()) {
            arrayList.add(Byte.valueOf((byte) c10));
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ12(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_1));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_2));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        int length = strArr[0].length() / 2;
        StringBuilder sb2 = new StringBuilder("0x");
        sb2.append(Integer.toHexString(length));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb2.toString()).intValue()));
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = i10 << 1;
            StringBuilder sb3 = new StringBuilder("0x");
            sb3.append(strArr[0].substring(i11, i11 + 2));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb3.toString()).intValue()));
        }
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        StringBuilder sb4 = new StringBuilder("0x");
        sb4.append(strArr[1].substring(0, 2));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb4.toString()).intValue()));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        int length2 = strArr[2].length() / 2;
        StringBuilder sb5 = new StringBuilder("0x");
        sb5.append(Integer.toHexString(length2));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb5.toString()).intValue()));
        for (int i12 = 0; i12 < length2; i12++) {
            int i13 = i12 << 1;
            StringBuilder sb6 = new StringBuilder("0x");
            sb6.append(strArr[2].substring(i13, i13 + 2));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb6.toString()).intValue()));
        }
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        int length3 = strArr[3].length() / 2;
        StringBuilder sb7 = new StringBuilder("0x");
        sb7.append(Integer.toHexString(length3));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb7.toString()).intValue()));
        for (int i14 = 0; i14 < length3; i14++) {
            int i15 = i14 << 1;
            StringBuilder sb8 = new StringBuilder("0x");
            sb8.append(strArr[3].substring(i15, i15 + 2));
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb8.toString()).intValue()));
        }
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        StringBuilder sb9 = new StringBuilder("0x");
        sb9.append(strArr[4].substring(0, 2));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb9.toString()).intValue()));
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ13(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_Z));
        arrayList.add((byte) 49);
        arrayList.add((byte) 51);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        StringBuilder sb2 = new StringBuilder("0x");
        sb2.append(strArr[0].substring(0, 2));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb2.toString()).intValue()));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        StringBuilder sb3 = new StringBuilder("0x");
        sb3.append(strArr[1].substring(0, 2));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sb3.toString()).intValue()));
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ2(String str) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_2));
        arrayList.add(Byte.valueOf(com.vierge.pinpadsdk.message.base.MessageUtils.MESSAGE_26_SUB));
        for (char c10 : str.toCharArray()) {
            arrayList.add(Byte.valueOf((byte) c10));
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ3(String str) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf((byte) MessageUtils.COMMAND_3));
        arrayList.add(Byte.valueOf(com.vierge.pinpadsdk.message.base.MessageUtils.MESSAGE_26_SUB));
        for (char c10 : str.toCharArray()) {
            arrayList.add(Byte.valueOf((byte) c10));
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }
}
