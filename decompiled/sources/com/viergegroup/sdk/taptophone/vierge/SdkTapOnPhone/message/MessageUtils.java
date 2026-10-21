package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.message;

import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.PinPadSdk;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: loaded from: classes7.dex */
public class MessageUtils {
    public static int COMMAND_0 = 48;
    public static int COMMAND_1 = 49;
    public static int COMMAND_2 = 50;
    public static int COMMAND_3 = 51;
    public static int COMMAND_4 = 52;
    public static int COMMAND_5 = 53;
    public static int COMMAND_6 = 54;
    public static int COMMAND_7 = 55;
    public static int COMMAND_8 = 56;
    public static int COMMAND_9 = 57;
    public static int COMMAND_C = 67;
    public static int COMMAND_C1 = 193;
    public static int COMMAND_Q = 81;
    public static int COMMAND_Z = 90;
    public static final int MESSAGE_00_NULL = 0;
    public static final int MESSAGE_01_SOH = 1;
    public static final int MESSAGE_02_INIT = 2;
    public static final int MESSAGE_03_END = 3;
    public static final int MESSAGE_04_EOT = 4;
    public static final int MESSAGE_05_ENQ = 5;
    public static final int MESSAGE_06_ACK = 6;
    public static final int MESSAGE_07_BEL = 7;
    public static final int MESSAGE_08_BS = 8;
    public static final int MESSAGE_09_HT = 9;
    public static final int MESSAGE_10_LF = 10;
    public static final int MESSAGE_13_CR = 13;
    public static final int MESSAGE_16_ESC = 16;
    public static final int MESSAGE_18_DC2 = 18;
    public static final int MESSAGE_21_NAK = 21;
    public static final int MESSAGE_26_SUB = 26;
    public static final int MESSAGE_30_RS = 30;
    public static final int MESSAGE_COMPOUND = 2;
    public static final int MESSAGE_SIMPLE = 1;
    public static final int STATE_CARD_DIGITED = 20;
    public static final int STATE_CARD_EXPIRED = 29;
    public static final int STATE_CARD_NOT_SUPPORTED = 25;
    public static final int STATE_CARD_REMOVED = 23;
    public static final int STATE_CHIP_ERROR = 10;
    public static final int STATE_CONTACTLESS = 22;
    public static final int STATE_ENCRYP_LIMIT_EXCEEDED = 54;
    public static final int STATE_ERROR_NOT_DEFINED = 99;
    public static final int STATE_FORBIDDEN_COMMAND = 60;
    public static final int STATE_INVALID_APPLICATION = 26;
    public static final int STATE_INVALID_DATA = 2;
    public static final int STATE_INVALID_MESSAGE = 1;
    public static final int STATE_INVALID_OPERATOR = 27;
    public static final int STATE_MAGTIC_BAND_REQUIRED = 21;
    public static final int STATE_NOT_INIT_KEYS = 62;
    public static final int STATE_PINPAD_NOT_RESPOND = -1;
    public static final int STATE_READ_ERROR = 63;
    public static final int STATE_SUCCESS = 0;
    public static final int STATE_TIMEOUT = 6;
    public static final int STATE_WRONG_CARD = 64;
    public static final int STATE_WRONG_CHECK_VALUE = 51;
    public static final int STATE_WRONG_COMMAND = 61;
    public static final int STATE_WRONG_CRC = 50;
    public static final int STATE_WRONG_CRYPTO_HSM = 53;
    public static final int STATE_WRONG_DATE = 30;
    public static final int STATE_WRONG_KEY = 52;
    public static final int STATE_WRONG_LENGHT = 56;
    public static final int STATE_WRONG_SIGN = 55;
    public static HashMap<String, Integer> estados;
    public static HashMap<Integer, String> msgStatusCode;
    public static HashMap<Integer, String> msgStatusDescription;
    public static HashMap<Integer, String> specialCodes;

    static {
        HashMap<String, Integer> map = new HashMap<>();
        estados = map;
        map.put("C5300", 0);
        estados.put("C5321", 21);
        estados.put("C5325", 25);
        estados.put("C5400", 0);
        estados.put("C5406", 6);
        estados.put("C5410", 10);
        estados.put("C5421", 21);
        estados.put("C5401", 1);
        estados.put("C5423", 23);
        estados.put("C5425", 25);
        estados.put("C5426", 26);
        estados.put("C5427", 27);
        estados.put("C5429", 29);
        estados.put("C5430", 30);
        estados.put("C5451", 51);
        estados.put("C5452", 52);
        estados.put("C5454", 54);
        estados.put("C5455", 55);
        estados.put("C5460", 60);
        estados.put("C5461", 61);
        estados.put("C5462", 62);
        estados.put("C5463", 63);
        estados.put("C5499", 99);
        estados.put("C5500", 0);
        estados.put("C5506", 6);
        estados.put("C5562", 62);
        estados.put("C5563", 63);
        estados.put("C5599", 99);
        estados.put("C5600", 0);
        estados.put("Q900", 0);
        estados.put("Q9", 52);
        estados.put("Q906", 6);
        estados.put("Z1200", 55);
        estados.put("Z1253", 53);
        estados.put("Z1262", 62);
        estados.put("Z1299", 99);
        estados.put("Z1300", 0);
        estados.put("Z1352", 52);
        estados.put("Z1353", 53);
        estados.put("Z1399", 99);
        estados.put("Z1000", 0);
        estados.put("Z1001", 1);
        estados.put("Z1002", 2);
        estados.put("Z1006", 6);
        estados.put("Z1051", 51);
        estados.put("Z1052", 52);
        estados.put("Z1053", 53);
        estados.put("Z1054", 54);
        estados.put("Z1061", 60);
        estados.put("Z1062", 62);
        estados.put("Z1099", 99);
        estados.put("Z1100", 0);
        estados.put("Z1101", 1);
        estados.put("Z1102", 2);
        estados.put("Z1106", 6);
        estados.put("Z1151", 51);
        estados.put("Z1152", 52);
        estados.put("Z1153", 53);
        estados.put("Z1154", 54);
        estados.put("Z1161", 60);
        estados.put("Z1162", 62);
        estados.put("Z1199", 99);
        estados.put("C5000", 0);
        estados.put("C5006", 6);
        estados.put("C5062", 62);
        estados.put("C5099", 99);
        HashMap<Integer, String> map2 = new HashMap<>();
        specialCodes = map2;
        map2.put(2, "<STX>");
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
        HashMap<Integer, String> map3 = new HashMap<>();
        msgStatusCode = map3;
        map3.put(0, "00");
        msgStatusCode.put(1, "01");
        msgStatusCode.put(2, "02");
        msgStatusCode.put(6, EglobalUtils.KEY_DERIVATION_FAILED_TIMEOUT);
        msgStatusCode.put(10, "10");
        msgStatusCode.put(21, "21");
        msgStatusCode.put(23, EglobalUtils.CARD_REMOVED);
        msgStatusCode.put(25, "25");
        msgStatusCode.put(26, "26");
        msgStatusCode.put(27, "27");
        msgStatusCode.put(29, EglobalUtils.CARD_EXPIRED);
        msgStatusCode.put(30, "30");
        msgStatusCode.put(51, "51");
        msgStatusCode.put(52, "52");
        msgStatusCode.put(53, "53");
        msgStatusCode.put(54, "54");
        msgStatusCode.put(55, "55");
        msgStatusCode.put(60, "60");
        msgStatusCode.put(61, EglobalUtils.INITIALIZED_KEYS_WRONG_COMMAND);
        msgStatusCode.put(62, EglobalUtils.NOT_INIT_KEYS);
        msgStatusCode.put(63, EglobalUtils.READ_CARD_ERROR);
        msgStatusCode.put(99, "99");
        HashMap<Integer, String> map4 = new HashMap<>();
        msgStatusDescription = map4;
        map4.put(-1, "Pinpad does not respond");
        msgStatusDescription.put(0, "Response successful");
        msgStatusDescription.put(6, "Timeout");
        msgStatusDescription.put(10, "Chip error");
        msgStatusDescription.put(21, "Magnetic card required");
        msgStatusDescription.put(1, "Error message");
        msgStatusDescription.put(23, "Card removed");
        msgStatusDescription.put(25, "Card not supported");
        msgStatusDescription.put(26, "Invalid application");
        msgStatusDescription.put(27, "Invalid operator");
        msgStatusDescription.put(2, "Invalid data");
        msgStatusDescription.put(29, "Card expired");
        msgStatusDescription.put(30, "Wrong date");
        msgStatusDescription.put(51, "Wrong check value");
        msgStatusDescription.put(52, "Wrong keys");
        msgStatusDescription.put(53, "Wrong crypto HDM");
        msgStatusDescription.put(54, "Limite cifrado excedido");
        msgStatusDescription.put(55, "Init keys failed");
        msgStatusDescription.put(60, "Wrong command");
        msgStatusDescription.put(62, "Not init keys");
        msgStatusDescription.put(63, "Read card error");
        msgStatusDescription.put(99, "Error not defined. Cancel from PinPad");
        msgStatusDescription.put(61, "Initialized keys. Wrong command");
    }

    public static short checkSum(short[] sArr) {
        short s4 = 0;
        for (int i10 = 1; i10 < sArr.length; i10++) {
            s4 = (short) (s4 ^ sArr[i10]);
        }
        return s4;
    }

    public static String getMessageDescription(int i10) {
        String str = msgStatusDescription.get(99);
        for (Map.Entry<Integer, String> entry : msgStatusDescription.entrySet()) {
            String value = entry.getValue();
            if (i10 == entry.getKey().intValue()) {
                str = value;
            }
        }
        if (PinPadSdk.debug2) {
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder("[PinPadLibrary.Utils]getStateMessage() Estado : ");
            sb2.append(i10);
            sb2.append(" Mensaje : ");
            sb2.append(str);
            printStream.println(sb2.toString());
        }
        return str;
    }

    public static String getMessageStatusCode(int i10) {
        return msgStatusCode.get(Integer.valueOf(i10));
    }

    public static String getMessageStatusDescription(int i10) {
        return msgStatusDescription.get(Integer.valueOf(i10));
    }

    public static HashMap<Integer, String> getSpecialCodes() {
        return specialCodes;
    }

    public static byte checkSum(byte[] bArr) {
        byte b10 = 0;
        for (int i10 = 1; i10 < bArr.length; i10++) {
            b10 = (byte) (b10 ^ bArr[i10]);
        }
        return b10;
    }
}
