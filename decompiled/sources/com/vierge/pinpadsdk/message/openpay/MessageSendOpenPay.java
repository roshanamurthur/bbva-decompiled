package com.vierge.pinpadsdk.message.openpay;

import androidx.core.graphics.b;
import androidx.room.a;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import com.vierge.pinpadsdk.message.eglobal.MessageSendEglobal;
import com.vierge.pinpadsdk.params.ExceptionParam;
import com.vierge.pinpadsdk.params.PARAM_FORMAT;
import com.vierge.pinpadsdk.params.Param;
import com.vierge.pinpadsdk.utils.Binary;
import com.vierge.pinpadsdk.utils.Logs;
import com.vierge.pinpadsdk.utils.Utils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import mx.openpay.library.data.util.CommandConstants;

/* JADX INFO: loaded from: classes6.dex */
public class MessageSendOpenPay extends MessageSendEglobal {
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

    public byte[] getSendMessageC50(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_C));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_5));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_0));
        int iA = 0;
        arrayList.add((byte) 0);
        arrayList.add((byte) 22);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        String str = strArr[0];
        if (str == null || str.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            arrayList.add(Byte.valueOf((byte) Integer.decode("0x" + strArr[0]).intValue()));
        }
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        arrayList.add((byte) 3);
        StringBuilder sbD = b.d((byte) Integer.decode("0x" + new SimpleDateFormat("yy").format(new Date())).intValue(), arrayList, "0x");
        sbD.append(new SimpleDateFormat("MM").format(new Date()));
        StringBuilder sbD2 = b.d((byte) Integer.decode(sbD.toString()).intValue(), arrayList, "0x");
        sbD2.append(new SimpleDateFormat("dd").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sbD2.toString()).intValue()));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        arrayList.add((byte) 3);
        StringBuilder sbD3 = b.d((byte) Integer.decode("0x" + new SimpleDateFormat("HH").format(new Date())).intValue(), arrayList, "0x");
        sbD3.append(new SimpleDateFormat("mm").format(new Date()));
        StringBuilder sbD4 = b.d((byte) Integer.decode(sbD3.toString()).intValue(), arrayList, "0x");
        sbD4.append(new SimpleDateFormat("ss").format(new Date()));
        arrayList.add(Byte.valueOf((byte) Integer.decode(sbD4.toString()).intValue()));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        arrayList.add((byte) 7);
        String str2 = String.format("%08X", Integer.valueOf(Integer.parseInt(strArr[1])));
        arrayList.add((byte) -63);
        arrayList.add((byte) 4);
        while (iA < 4) {
            int i10 = iA * 2;
            iA = a.a((byte) Integer.decode("0x" + str2.substring(i10, i10 + 2)).intValue(), arrayList, iA, 1);
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    @Override // com.vierge.pinpadsdk.message.eglobal.MessageSendEglobal
    public byte[] getSendMessageC51(String[] strArr) throws ExceptionParam {
        ArrayList<Byte> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_C));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_5));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_1));
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 1);
        String str = strArr[0];
        if (str == null || str.isEmpty()) {
            arrayList2.add((byte) 16);
        } else {
            arrayList2.add(Byte.valueOf((byte) Integer.decode("0x" + strArr[0]).intValue()));
        }
        ArrayList<Byte> arrayListDateToFormattedData = dateToFormattedData(new Date());
        arrayList2.add((byte) -63);
        arrayList2.add(Byte.valueOf((byte) arrayListDateToFormattedData.size()));
        arrayList2.addAll(arrayListDateToFormattedData);
        ArrayList<Byte> arrayListDateToFormattedTime = dateToFormattedTime(new Date());
        arrayList2.add((byte) -63);
        arrayList2.add(Byte.valueOf((byte) arrayListDateToFormattedTime.size()));
        arrayList2.addAll(arrayListDateToFormattedTime);
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 1);
        String str2 = strArr[6];
        if (str2 == null || str2.isEmpty()) {
            arrayList2.add((byte) 7);
        } else {
            arrayList2.add(Byte.valueOf((byte) Integer.decode("0x" + strArr[6]).intValue()));
        }
        String str3 = String.format("%08X", Integer.valueOf(Integer.parseInt(strArr[1])));
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 4);
        int iA = 0;
        while (iA < 4) {
            int i10 = iA * 2;
            iA = a.a((byte) Integer.decode("0x" + str3.substring(i10, i10 + 2)).intValue(), arrayList2, iA, 1);
        }
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 4);
        arrayList2.add((byte) 0);
        arrayList2.add((byte) 0);
        arrayList2.add((byte) 0);
        arrayList2.add((byte) 0);
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 2);
        String str4 = strArr[2];
        if (str4 == null || str4.isEmpty()) {
            arrayList2.add((byte) 4);
            arrayList2.add((byte) -124);
        } else if (strArr[2].length() == 3) {
            StringBuilder sbD = b.d((byte) Integer.decode("0x0" + strArr[2].substring(0, 1)).intValue(), arrayList2, "0x");
            sbD.append(strArr[2].substring(1, 3));
            arrayList2.add(Byte.valueOf((byte) Integer.decode(sbD.toString()).intValue()));
        } else {
            StringBuilder sbD2 = b.d((byte) Integer.decode("0x" + strArr[2].substring(0, 2)).intValue(), arrayList2, "0x");
            sbD2.append(strArr[2].substring(2, 4));
            arrayList2.add(Byte.valueOf((byte) Integer.decode(sbD2.toString()).intValue()));
        }
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 1);
        arrayList2.add((byte) 0);
        ArrayList arrayList3 = new ArrayList();
        if (strArr[4].length() > 0) {
            arrayList3 = paramToValueFixedLength(strArr[4].toUpperCase(), 10, ' ');
        }
        arrayList2.addAll(paramToSeparatorLengthValue((byte) -63, arrayList3));
        ArrayList arrayList4 = new ArrayList();
        if (strArr[5].length() > 0) {
            arrayList4 = paramToValueFixedLength(strArr[5].toUpperCase(), 10, ' ');
        }
        arrayList2.addAll(paramToSeparatorLengthValue((byte) -63, arrayList4));
        ArrayList arrayList5 = new ArrayList();
        new Param(strArr[7], "Order ID").isValidMaxLen(100);
        if (strArr[7].length() > 0) {
            arrayList5 = stringToArrayList(strArr[7]);
        }
        arrayList2.addAll(paramToSeparatorLengthValue((byte) -63, arrayList5));
        ArrayList arrayList6 = new ArrayList();
        new Param(strArr[8], "Merchant ID").isValidMaxLen(45);
        if (strArr[8].length() > 0) {
            arrayList6 = stringToArrayList(strArr[8]);
        }
        arrayList2.addAll(paramToSeparatorLengthValue((byte) -63, arrayList6));
        arrayList2.addAll(paramToSeparatorLengthValue(MessageUtils.COMMAND_E1, Utils.hexadecimalStringToString(strArr[3])));
        arrayList.addAll(Binary.IntegerToArrayBinary(Integer.valueOf(arrayList2.size()), 2));
        arrayList.addAll(arrayList2);
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageC55(String[] strArr) {
        String strValueOf;
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_C));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_5));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_5));
        arrayList.add((byte) 0);
        arrayList.add((byte) 76);
        arrayList.add((byte) -63);
        int length = strArr[0].length() / 2;
        arrayList.add(Byte.valueOf((byte) Integer.decode("0x" + Integer.toHexString(length)).intValue()));
        int iA = 0;
        while (iA < length) {
            int i10 = iA * 2;
            iA = a.a((byte) Integer.decode("0x" + strArr[0].substring(i10, i10 + 2)).intValue(), arrayList, iA, 1);
        }
        arrayList.add((byte) -63);
        arrayList.add((byte) 1);
        String str = strArr[1];
        if (str == null || str.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            arrayList.add(Byte.valueOf((byte) Integer.decode("0x" + strArr[1]).intValue()));
        }
        char[] charArray = strArr[4].toCharArray();
        for (int iA2 = 0; iA2 < charArray.length; iA2 = a.a((byte) charArray[iA2], arrayList, iA2, 1)) {
        }
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        arrayList.add((byte) 1);
        String str2 = strArr[2];
        if (str2 == null || str2.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            arrayList.add(Byte.valueOf((byte) Integer.decode("0x" + a(strArr[2])).intValue()));
        }
        arrayList.add((byte) -63);
        arrayList.add((byte) 1);
        String str3 = strArr[3];
        if (str3 == null || str3.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            StringBuilder sb2 = new StringBuilder("0x");
            String strA = a(strArr[2]);
            String strA2 = a(strArr[3]);
            int i11 = Integer.parseInt(strA);
            int i12 = Integer.parseInt(strA2);
            if (i12 >= i11) {
                strValueOf = String.valueOf(i12);
            } else if (i12 < i11) {
                while (i12 != i11) {
                    i12++;
                }
                strValueOf = String.valueOf(i12);
            } else {
                strValueOf = null;
            }
            Logs.write("Convertido a Int_maximo:" + strValueOf);
            sb2.append(strValueOf);
            arrayList.add(Byte.valueOf((byte) Integer.decode(sb2.toString()).intValue()));
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageC56(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_C));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_5));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_6));
        arrayList.add((byte) 0);
        arrayList.add((byte) 76);
        arrayList.add((byte) -63);
        int length = strArr[0].length() / 2;
        arrayList.add(Byte.valueOf((byte) Integer.decode("0x" + Integer.toHexString(length)).intValue()));
        int iA = 0;
        while (iA < length) {
            int i10 = iA * 2;
            iA = a.a((byte) Integer.decode("0x" + strArr[0].substring(i10, i10 + 2)).intValue(), arrayList, iA, 1);
        }
        arrayList.add((byte) -63);
        arrayList.add((byte) 1);
        String str = strArr[1];
        if (str == null || str.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            arrayList.add(Byte.valueOf((byte) Integer.decode("0x" + strArr[1]).intValue()));
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageQ9(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_Q));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_9));
        String str = strArr[0];
        if (str == null || str.isEmpty()) {
            arrayList.add((byte) 16);
        } else {
            arrayList.add(Byte.valueOf((byte) Integer.decode("0x" + strArr[0]).intValue()));
        }
        char[] charArray = strArr[1].toCharArray();
        for (int iA = 0; iA < charArray.length; iA = a.a((byte) charArray[iA], arrayList, iA, 1)) {
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ10(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_1));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_0));
        arrayList.addAll(paramToSeparatorLengthValue((byte) -63, paramToValueFixedLength(strArr[0], 10, ' ')));
        return encapsulate(arrayList);
    }

    @Override // com.vierge.pinpadsdk.message.eglobal.MessageSendEglobal
    public byte[] getSendMessageZ11(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_1));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_1));
        arrayList.addAll(paramToValueFixedLength(strArr[0], 10, ' '));
        arrayList.addAll(stringToArrayList(strArr[1]));
        return encapsulate(arrayList);
    }

    public byte[] getSendMessageZ12(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_1));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_2));
        arrayList2.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        int length = strArr[0].length() / 2;
        arrayList2.add(Byte.valueOf((byte) Integer.decode("0x" + Integer.toHexString(length)).intValue()));
        int iA = 0;
        while (iA < length) {
            int i10 = iA * 2;
            iA = a.a((byte) Integer.decode("0x" + strArr[0].substring(i10, i10 + 2)).intValue(), arrayList2, iA, 1);
        }
        arrayList2.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        arrayList2.add((byte) 1);
        arrayList2.add(Byte.valueOf((byte) Integer.decode("0x" + strArr[1].substring(0, 2)).intValue()));
        arrayList2.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        int length2 = strArr[2].length() / 2;
        arrayList2.add(Byte.valueOf((byte) Integer.decode("0x" + Integer.toHexString(length2)).intValue()));
        int iA2 = 0;
        while (iA2 < length2) {
            int i11 = iA2 * 2;
            iA2 = a.a((byte) Integer.decode("0x" + strArr[2].substring(i11, i11 + 2)).intValue(), arrayList2, iA2, 1);
        }
        arrayList2.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        int length3 = strArr[3].length() / 2;
        arrayList2.add(Byte.valueOf((byte) Integer.decode("0x" + Integer.toHexString(length3)).intValue()));
        int iA3 = 0;
        while (iA3 < length3) {
            int i12 = iA3 * 2;
            iA3 = a.a((byte) Integer.decode("0x" + strArr[3].substring(i12, i12 + 2)).intValue(), arrayList2, iA3, 1);
        }
        arrayList2.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        arrayList2.add((byte) 1);
        arrayList2.add(Byte.valueOf((byte) Integer.decode("0x" + strArr[4].substring(0, 2)).intValue()));
        arrayList.addAll(Binary.IntegerToArrayBinary(Integer.valueOf(arrayList2.size()), 2));
        arrayList.addAll(arrayList2);
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ13(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_1));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_3));
        arrayList2.addAll(paramToSeparatorLengthValue(MessageUtils.COMMAND_C1, paramToValueFixedLength(strArr[0], 10, ' ')));
        arrayList.addAll(Binary.IntegerToArrayBinary(Integer.valueOf(arrayList2.size()), 2));
        arrayList.addAll(arrayList2);
        return encapsulate(arrayList);
    }

    public byte[] getSendMessageZ14(String[] strArr) throws ExceptionParam {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 90);
        arrayList.add((byte) 49);
        arrayList.add((byte) 52);
        new Param(strArr[0], "KeyName").isValidFormat(PARAM_FORMAT.ALFANUMERIC);
        String str = strArr[0];
        str.getClass();
        if (str.equals("OPENPRIVAD")) {
            arrayList.addAll(paramToValueFixedLength(strArr[0], 10, ' '));
            arrayList.addAll(stringHexToArrayList(strArr[1]));
            return encapsulate(arrayList);
        }
        if (str.equals(CommandConstants.C51_KEY_NAME1)) {
            arrayList.addAll(paramToValueFixedLength(strArr[0], 10, ' '));
            arrayList.addAll(stringHexToArrayList(strArr[1]));
            return encapsulate(arrayList);
        }
        arrayList.addAll(paramToValueFixedLength(strArr[0], 10, ' '));
        Param param = new Param(strArr[1], "Key module");
        PARAM_FORMAT param_format = PARAM_FORMAT.HEXADECIMAL;
        param.isValidFormat(param_format);
        arrayList.addAll(stringToArrayList(strArr[1]));
        new Param(strArr[2], "Key exponent").isValidFormat(param_format);
        arrayList.addAll(stringToArrayList(strArr[2]));
        Param param2 = new Param(strArr[3], "Slot");
        PARAM_FORMAT param_format2 = PARAM_FORMAT.NUMERIC;
        param2.isValidFormat(param_format2);
        arrayList.addAll(stringToArrayList(strArr[3]));
        new Param(strArr[4], "Working key").isValidFormat(param_format2);
        arrayList.addAll(stringToArrayList(strArr[4]));
        new Param(strArr[5], "Padding").isValidFormat(param_format2);
        arrayList.addAll(stringToArrayList(strArr[5]));
        return encapsulate(arrayList);
    }
}
