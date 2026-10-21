package com.vierge.pinpadsdk.message.eglobal;

import androidx.core.graphics.b;
import androidx.room.a;
import com.vierge.pinpadsdk.message.base.MessageSendBase;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import com.vierge.pinpadsdk.params.ExceptionParam;
import com.vierge.pinpadsdk.params.Param;
import com.vierge.pinpadsdk.utils.Binary;
import com.vierge.pinpadsdk.utils.Utils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import mx.openpay.library.data.util.CommandConstants;

/* JADX INFO: loaded from: classes6.dex */
public class MessageSendEglobal extends MessageSendBase {
    public byte[] getSendMessage72() {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_7));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_2));
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageC12(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.addAll(stringToArrayList("C12"));
        arrayList.addAll(stringToArrayList(strArr[0]));
        return encapsulate(arrayList);
    }

    public byte[] getSendMessageC25(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.addAll(stringToArrayList(CommandConstants.COMMAND_C25));
        arrayList.addAll(stringToArrayList(strArr[0]));
        arrayList.addAll(stringToArrayList(strArr[1]));
        arrayList.addAll(stringToArrayList(strArr[2]));
        ArrayList<Byte> arrayListStringToArrayList = stringToArrayList(strArr[3]);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(stringToArrayList(String.format("%d", Integer.valueOf(arrayListStringToArrayList.size() / 2))));
        while (arrayList2.size() < 3) {
            arrayList2.add(0, (byte) 48);
        }
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayListStringToArrayList);
        return encapsulate(arrayList);
    }

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
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 3);
        StringBuilder sbD = b.d((byte) Integer.decode("0x" + new SimpleDateFormat("yy").format(new Date())).intValue(), arrayList2, "0x");
        sbD.append(new SimpleDateFormat("MM").format(new Date()));
        StringBuilder sbD2 = b.d((byte) Integer.decode(sbD.toString()).intValue(), arrayList2, "0x");
        sbD2.append(new SimpleDateFormat("dd").format(new Date()));
        arrayList2.add(Byte.valueOf((byte) Integer.decode(sbD2.toString()).intValue()));
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 3);
        StringBuilder sbD3 = b.d((byte) Integer.decode("0x" + new SimpleDateFormat("HH").format(new Date())).intValue(), arrayList2, "0x");
        sbD3.append(new SimpleDateFormat("mm").format(new Date()));
        StringBuilder sbD4 = b.d((byte) Integer.decode(sbD3.toString()).intValue(), arrayList2, "0x");
        sbD4.append(new SimpleDateFormat("ss").format(new Date()));
        arrayList2.add(Byte.valueOf((byte) Integer.decode(sbD4.toString()).intValue()));
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 1);
        arrayList2.add((byte) 7);
        String str2 = String.format("%08X", Integer.valueOf(Integer.parseInt(strArr[1])));
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 4);
        int iA = 0;
        while (iA < 4) {
            int i10 = iA * 2;
            iA = a.a((byte) Integer.decode("0x" + str2.substring(i10, i10 + 2)).intValue(), arrayList2, iA, 1);
        }
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 4);
        arrayList2.add((byte) 0);
        arrayList2.add((byte) 0);
        arrayList2.add((byte) 0);
        arrayList2.add((byte) 0);
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 2);
        String str3 = strArr[2];
        if (str3 == null || str3.isEmpty()) {
            arrayList2.add((byte) 4);
            arrayList2.add((byte) -124);
        } else if (strArr[2].length() == 3) {
            StringBuilder sbD5 = b.d((byte) Integer.decode("0x0" + strArr[2].substring(0, 1)).intValue(), arrayList2, "0x");
            sbD5.append(strArr[2].substring(1, 3));
            arrayList2.add(Byte.valueOf((byte) Integer.decode(sbD5.toString()).intValue()));
        } else {
            StringBuilder sbD6 = b.d((byte) Integer.decode("0x" + strArr[2].substring(0, 2)).intValue(), arrayList2, "0x");
            sbD6.append(strArr[2].substring(2, 4));
            arrayList2.add(Byte.valueOf((byte) Integer.decode(sbD6.toString()).intValue()));
        }
        arrayList2.add((byte) -63);
        arrayList2.add((byte) 1);
        arrayList2.add((byte) 0);
        arrayList2.addAll(paramToSeparatorLengthValue(MessageUtils.COMMAND_E1, Utils.hexadecimalStringToString(strArr[3])));
        arrayList.addAll(Binary.IntegerToArrayBinary(Integer.valueOf(arrayList2.size()), 2));
        arrayList.addAll(arrayList2);
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageC54(String[] strArr) throws ExceptionParam {
        ArrayList<Byte> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_C));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_5));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_4));
        arrayList2.addAll(paramToSeparatorLengthValue(MessageUtils.COMMAND_C1, Integer.parseInt(strArr[0])));
        arrayList2.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        char[] charArray = strArr[1].toCharArray();
        arrayList2.add(Byte.valueOf((byte) charArray.length));
        for (int iA = 0; iA < charArray.length; iA = a.a((byte) charArray[iA], arrayList2, iA, 1)) {
        }
        arrayList2.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        char[] charArray2 = strArr[2].toCharArray();
        arrayList2.add(Byte.valueOf((byte) charArray2.length));
        for (int iA2 = 0; iA2 < charArray2.length; iA2 = a.a((byte) charArray2[iA2], arrayList2, iA2, 1)) {
        }
        new Param(strArr[3], "Issuer authentication");
        arrayList2.addAll(stringToArrayList(Utils.hexadecimalStringToString(strArr[3])));
        Date date = new Date();
        arrayList2.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        arrayList2.add((byte) 3);
        StringBuilder sbD = b.d((byte) Integer.decode("0x" + new SimpleDateFormat("yy").format(date)).intValue(), arrayList2, "0x");
        sbD.append(new SimpleDateFormat("MM").format(date));
        StringBuilder sbD2 = b.d((byte) Integer.decode(sbD.toString()).intValue(), arrayList2, "0x");
        sbD2.append(new SimpleDateFormat("dd").format(date));
        arrayList2.add(Byte.valueOf((byte) Integer.decode(sbD2.toString()).intValue()));
        arrayList2.add(Byte.valueOf(MessageUtils.COMMAND_C1));
        arrayList2.add((byte) 3);
        StringBuilder sbD3 = b.d((byte) Integer.decode("0x" + new SimpleDateFormat("HH").format(date)).intValue(), arrayList2, "0x");
        sbD3.append(new SimpleDateFormat("mm").format(date));
        StringBuilder sbD4 = b.d((byte) Integer.decode(sbD3.toString()).intValue(), arrayList2, "0x");
        sbD4.append(new SimpleDateFormat("ss").format(date));
        arrayList2.add(Byte.valueOf((byte) Integer.decode(sbD4.toString()).intValue()));
        arrayList2.addAll(paramToSeparatorLengthValue(MessageUtils.COMMAND_E2, Utils.hexadecimalStringToString(strArr[4])));
        arrayList.addAll(Binary.IntegerToArrayBinary(Integer.valueOf(arrayList2.size()), 2));
        arrayList.addAll(arrayList2);
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageQ7(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList();
        arrayList.addAll(stringToArrayList(CommandConstants.COMMAND_Q7));
        arrayList2.addAll(stringToArrayList(strArr[0]));
        arrayList.addAll(Binary.IntegerToArrayBinary(Integer.valueOf(arrayList2.size()), 2));
        arrayList.addAll(arrayList2);
        return encapsulate(arrayList);
    }

    public byte[] getSendMessageQ8() {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_Q));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_8));
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ10() {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_1));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_0));
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ11(String[] strArr) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_1));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_1));
        int length = strArr[0].length() / 2;
        char[] charArray = strArr[0].toCharArray();
        for (int iA = 0; iA < charArray.length; iA = a.a((byte) charArray[iA], arrayList, iA, 1)) {
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ2(String str) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_2));
        arrayList.add(Byte.valueOf(MessageUtils.MESSAGE_26_SUB));
        char[] charArray = str.toCharArray();
        for (int iA = 0; iA < charArray.length; iA = a.a((byte) charArray[iA], arrayList, iA, 1)) {
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }

    public byte[] getSendMessageZ3(String str) {
        ArrayList<Byte> arrayList = new ArrayList<>();
        arrayList.add((byte) 2);
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_Z));
        arrayList.add(Byte.valueOf(MessageUtils.COMMAND_3));
        arrayList.add(Byte.valueOf(MessageUtils.MESSAGE_26_SUB));
        char[] charArray = str.toCharArray();
        for (int iA = 0; iA < charArray.length; iA = a.a((byte) charArray[iA], arrayList, iA, 1)) {
        }
        arrayList.add((byte) 3);
        arrayList.add(Byte.valueOf(MessageUtils.checkSum(getByteArray(arrayList))));
        return getByteArray(arrayList);
    }
}
