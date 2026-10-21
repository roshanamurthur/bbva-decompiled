package com.vierge.pinpadsdk.utils;

import ad.d;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.data.util.CommandConstants;

/* JADX INFO: loaded from: classes6.dex */
public class Utils {
    public static int COMMAND_SCRIPT = 987654015;
    public static int COMMAND_SENDFILE = 987654019;
    public static int COMMAND_STRING_72 = 987654001;
    public static int COMMAND_STRING_ACK = 987654004;
    public static int COMMAND_STRING_C12 = 987654017;
    public static int COMMAND_STRING_C25 = 987654016;
    public static int COMMAND_STRING_C50 = 987654010;
    public static int COMMAND_STRING_C51 = 987654007;
    public static int COMMAND_STRING_C53 = 987654008;
    public static int COMMAND_STRING_C54 = 987654009;
    public static int COMMAND_STRING_EOT = 987654006;
    public static int COMMAND_STRING_NAK = 987654005;
    public static int COMMAND_STRING_Q7 = 987654018;
    public static int COMMAND_STRING_Q8 = 987654003;
    public static int COMMAND_STRING_Z10 = 987654013;
    public static int COMMAND_STRING_Z11 = 987654014;
    public static int COMMAND_STRING_Z12 = 987654011;
    public static int COMMAND_STRING_Z13 = 987654012;
    public static int COMMAND_STRING_Z14 = 987654020;
    public static int COMMAND_STRING_Z2 = 987654002;
    public static String PINPAD_MODEL_A60 = "PX_A60";
    public static String PINPAD_MODEL_A920 = "PXA920";
    public static String PINPAD_MODEL_D170 = "PXD170";
    public static String PINPAD_MODEL_D180 = "PXD180";
    public static String PINPAD_MODEL_PX7A = "PXPX7A";
    public static String PINPAD_MODEL_PXD190 = "D190";
    public static String PINPAD_MODEL_PXSP2H = "SP200";
    public static String PINPAD_MODEL_PX_PX5 = "PX5";
    public static String PINPAD_MODEL_PX_PX7 = "PX7";
    public static String PINPAD_MODEL_S300 = "PXS300";
    public static String PINPAD_MODEL_SP30 = "PXSP30";
    public static String PINPAD_MODEL_UNKNOW = "PX";
    public static int RESPONSE_ERROR = -1;
    public static int RESPONSE_NOTDEFINED = 99;
    public static int RESPONSE_OK;
    public static HashMap<Integer, String> msgApp;
    public static HashMap<Integer, String> msgAppStatus;
    public static HashMap<Integer, String> stringCommands;

    static {
        HashMap<Integer, String> map = new HashMap<>();
        stringCommands = map;
        map.put(Integer.valueOf(COMMAND_STRING_72), "72");
        stringCommands.put(Integer.valueOf(COMMAND_STRING_Z2), CommandConstants.COMMAND_Z2);
        stringCommands.put(Integer.valueOf(COMMAND_STRING_Q8), CommandConstants.COMMAND_Q8);
        stringCommands.put(Integer.valueOf(COMMAND_STRING_ACK), CommandConstants.COMMAND_ACK);
        stringCommands.put(Integer.valueOf(COMMAND_STRING_NAK), "NAK");
        stringCommands.put(Integer.valueOf(COMMAND_STRING_EOT), "EOT");
        stringCommands.put(Integer.valueOf(COMMAND_STRING_C51), CommandConstants.COMMAND_C51);
        stringCommands.put(Integer.valueOf(COMMAND_STRING_C25), CommandConstants.COMMAND_C25);
        stringCommands.put(Integer.valueOf(COMMAND_STRING_C12), "C12");
        stringCommands.put(Integer.valueOf(COMMAND_STRING_C53), "C53");
        stringCommands.put(Integer.valueOf(COMMAND_STRING_C54), CommandConstants.COMMAND_C54);
        stringCommands.put(Integer.valueOf(COMMAND_STRING_C50), "C50");
        stringCommands.put(Integer.valueOf(COMMAND_STRING_Z12), CommandConstants.COMMAND_Z12);
        stringCommands.put(Integer.valueOf(COMMAND_STRING_Z13), CommandConstants.COMMAND_Z13);
        stringCommands.put(Integer.valueOf(COMMAND_STRING_Z10), CommandConstants.COMMAND_Z10);
        stringCommands.put(Integer.valueOf(COMMAND_STRING_Z11), CommandConstants.COMMAND_Z11);
        stringCommands.put(Integer.valueOf(COMMAND_SCRIPT), "SCRIPT");
        HashMap<Integer, String> map2 = new HashMap<>();
        msgApp = map2;
        map2.put(Integer.valueOf(RESPONSE_OK), "Message was successful");
        msgApp.put(Integer.valueOf(RESPONSE_ERROR), "Message has errors");
        msgApp.put(Integer.valueOf(RESPONSE_NOTDEFINED), "Not defined");
        HashMap<Integer, String> map3 = new HashMap<>();
        msgAppStatus = map3;
        map3.put(Integer.valueOf(RESPONSE_OK), "Ok");
        msgAppStatus.put(Integer.valueOf(RESPONSE_ERROR), "Error");
        msgAppStatus.put(Integer.valueOf(RESPONSE_NOTDEFINED), "ND");
    }

    public static short[] arrayByteToArrayShort(byte[] bArr) {
        short[] sArr = new short[bArr.length];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            if (b10 < 0) {
                sArr[i10] = (short) (b10 & 255);
            } else {
                sArr[i10] = b10;
            }
        }
        return sArr;
    }

    public static String arrayToHexadecimalString(byte[] bArr) {
        String strH = "";
        for (byte b10 : bArr) {
            strH = u.h(" %02x", new Object[]{Byte.valueOf(b10)}, c.d(strH));
        }
        return strH;
    }

    public static String getAppTextDescription(int i10) {
        String str = msgApp.get(99);
        for (Map.Entry<Integer, String> entry : msgApp.entrySet()) {
            String value = entry.getValue();
            if (i10 == entry.getKey().intValue()) {
                str = value;
            }
        }
        return str;
    }

    public static HashMap<String, String> getAvailableCommandsNameDescription() {
        HashMap<String, String> map = new HashMap<>();
        map.put(CommandConstants.COMMAND_Z2, "Send messagge");
        map.put("72", "Cancel pending");
        map.put(CommandConstants.COMMAND_Q8, "Get serial and version");
        map.put(CommandConstants.COMMAND_C51, "Card reading");
        map.put(CommandConstants.COMMAND_C25, "Send script");
        map.put("C12", "Run script");
        map.put("C55", "PIN reading");
        map.put(CommandConstants.COMMAND_ACK, CommandConstants.COMMAND_ACK);
        map.put("Q9", "Poll");
        map.put(CommandConstants.COMMAND_Z12, "Key injection");
        map.put(CommandConstants.COMMAND_Z13, "Key verification");
        map.put("C56", "Change PIN");
        map.put("SEQ1", "Test (Bancomer sequence)");
        map.put("Z3", "Save message (pendiente)");
        map.put(CommandConstants.COMMAND_Z10, "Get random key");
        map.put(CommandConstants.COMMAND_Z11, "Send DUKPT key");
        map.put("C50", "Get BIN");
        map.put("EOT", "End of transmission");
        map.put("NAK", "NACK");
        return map;
    }

    public static ArrayList<String[]> getAvailableCommandsNameDescription2() {
        ArrayList<String[]> arrayList = new ArrayList<>();
        for (Map.Entry<String, String> entry : getAvailableCommandsNameDescription().entrySet()) {
            arrayList.add(new String[]{entry.getKey(), entry.getValue()});
        }
        return arrayList;
    }

    public static String getCommandDescription(String str) {
        for (Map.Entry<String, String> entry : getAvailableCommandsNameDescription().entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (str.equalsIgnoreCase(key)) {
                return value;
            }
        }
        return "Not implemented";
    }

    public static int getIntCommand(String str) {
        int iIntValue = COMMAND_STRING_72;
        for (Map.Entry<Integer, String> entry : stringCommands.entrySet()) {
            String value = entry.getValue();
            Integer key = entry.getKey();
            if (str.equalsIgnoreCase(value)) {
                iIntValue = key.intValue();
            }
        }
        return iIntValue;
    }

    public static String getLogDataToStringHexaFormat(short[] sArr) {
        HashMap<Byte, String> specialCodes = MessageUtils.getSpecialCodes();
        String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("(" + str + ") ");
        for (int i10 = 0; i10 < sArr.length; i10++) {
            stringBuffer.append(String.format("%02X", Integer.valueOf(sArr[i10])));
            if (specialCodes.containsKey(Integer.valueOf(sArr[i10]))) {
                stringBuffer.append(specialCodes.get(Integer.valueOf(sArr[i10])));
            } else {
                short s4 = sArr[i10];
                if (s4 >= 127 || s4 <= 0) {
                    stringBuffer.append("(-)");
                } else {
                    stringBuffer.append(String.format("%c", Integer.valueOf(s4)));
                }
            }
            stringBuffer.append(" ");
        }
        stringBuffer.append(RootService.LINE_BREAK);
        return stringBuffer.toString();
    }

    public static String getStringCommand(int i10) {
        String str = "Not Know";
        for (Map.Entry<Integer, String> entry : stringCommands.entrySet()) {
            String value = entry.getValue();
            if (i10 == entry.getKey().intValue()) {
                str = value;
            }
        }
        return str;
    }

    public static byte[] hexStrToAsciiArray(String str) {
        byte[] bArr = new byte[str.length() / 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < str.length()) {
            int i12 = i10 + 2;
            try {
                bArr[i11] = (byte) Integer.parseInt(str.substring(i10, i12), 16);
                i11++;
            } catch (Exception e5) {
                e5.printStackTrace();
            }
            i10 = i12;
        }
        return bArr;
    }

    public static String hexadecimalStringToString(String str) {
        String str2 = "";
        String strReplaceAll = str.replaceAll(" ", "");
        int i10 = 0;
        while (i10 < strReplaceAll.length()) {
            try {
                int i11 = i10 + 2;
                str2 = str2 + String.format("%c", Integer.valueOf(Integer.parseInt(strReplaceAll.substring(i10, i11), 16)));
                i10 = i11;
            } catch (Exception e5) {
                Logs.write(e5.getMessage());
            }
        }
        return str2;
    }

    public static String paramsToString(String[] strArr) {
        String string = "{";
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr.length - 1 == i10) {
                string = d.f(c.d(string), strArr[i10], "}");
            } else {
                StringBuilder sbD = c.d(string);
                sbD.append(strArr[i10]);
                string = sbD.toString();
            }
        }
        return string;
    }

    public static String stringToHexadecimalString(String str) {
        char[] charArray = str.toCharArray();
        String strH = "";
        for (int i10 = 0; i10 < str.length(); i10++) {
            strH = u.h(" %02x", new Object[]{Byte.valueOf((byte) charArray[i10])}, c.d(strH));
        }
        return strH;
    }

    public static String arrayToHexadecimalString(short[] sArr) {
        String strH = "";
        for (short s4 : sArr) {
            strH = u.h(" %02x", new Object[]{Short.valueOf(s4)}, c.d(strH));
        }
        return strH;
    }

    public static String arrayToHexadecimalString(ArrayList<Short> arrayList) {
        String strH = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            strH = u.h(" %02x", new Object[]{arrayList.get(i10)}, c.d(strH));
        }
        return strH;
    }
}
