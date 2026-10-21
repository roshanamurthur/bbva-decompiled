package com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.message;

import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import com.bbva.google.pay.GoogleTapAndPay;
import com.bbva.notifications.constants.PushConstants;
import com.google.gson.JsonObject;
import com.viergegroup.sdk.taptophone.vierge.SdkTapOnPhone.utils.Utils;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.data.util.EglobalUtils;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes7.dex */
public class MessageResponse extends MessageBase {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JsonObject f67775g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f67773e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f67774f = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f67776h = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<Short> f67770b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<Integer> f67771c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f67772d = "";

    public final String[] a() {
        String strConcat = "";
        String[] strArr = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
        try {
            new ArrayList();
            ArrayList<Short> arrayList = this.f67770b;
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            strArr[0] = "".concat(String.format("%c", Integer.valueOf(arrayList.get(0).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList.get(1).shortValue())));
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.get(0).shortValue();
            arrayList.get(1).shortValue();
            arrayList.remove(0);
            arrayList.remove(0);
            if (arrayList.get(0).shortValue() == MessageUtils.COMMAND_C1) {
                short sShortValue = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                for (int i10 = 0; i10 < sShortValue; i10++) {
                    strConcat = strConcat.concat(String.format("%02X", Integer.valueOf(arrayList.get(i10).shortValue())));
                }
                for (int i11 = 0; i11 < sShortValue; i11++) {
                    arrayList.remove(0);
                }
                strArr[1] = strConcat;
            } else {
                strArr[1] = "Error BIN";
            }
        } catch (Exception unused) {
            strArr[0] = "Error parserC50 Response()";
            strArr[1] = "Error parserC50 Response()";
        }
        return strArr;
    }

    public final String b() {
        if (!this.f67772d.contains("! ES")) {
            return CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN;
        }
        try {
            String str = this.f67772d;
            String strReplace = str.substring(str.indexOf("! ES")).replace("! ES", "");
            return strReplace.substring(6, Integer.parseInt(strReplace.substring(0, 5)) + 6);
        } catch (Exception e5) {
            String localizedMessage = e5.getLocalizedMessage();
            if (this.debug) {
                System.out.println(e5.getLocalizedMessage());
            }
            return localizedMessage;
        }
    }

    public final String[] c() {
        short sShortValue;
        String[] strArr = new String[11];
        for (int i10 = 0; i10 < 11; i10++) {
            strArr[i10] = "TODO";
        }
        try {
            new ArrayList();
            ArrayList<Short> arrayList = this.f67770b;
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            strArr[0] = String.format("%c", Integer.valueOf(arrayList.get(0).shortValue())).concat(String.format("%c", Integer.valueOf(arrayList.get(1).shortValue())));
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            String strConcat = "";
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue2 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat2 = "";
                for (int i11 = 0; i11 < sShortValue2; i11++) {
                    strConcat2 = strConcat2.concat(String.format("%02X", Integer.valueOf(arrayList.get(i11).shortValue())));
                }
                for (int i12 = 0; i12 < sShortValue2; i12++) {
                    arrayList.remove(0);
                }
                strArr[1] = strConcat2;
            } else {
                strArr[1] = "Error PAN";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue3 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat3 = "";
                for (int i13 = 0; i13 < sShortValue3; i13++) {
                    strConcat3 = strConcat3.concat(String.format("%02X", Integer.valueOf(arrayList.get(i13).shortValue())));
                }
                for (int i14 = 0; i14 < sShortValue3; i14++) {
                    arrayList.remove(0);
                }
                strArr[2] = strConcat3;
            } else {
                strArr[2] = "Error PinBlock Actual";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue4 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat4 = "";
                for (int i15 = 0; i15 < sShortValue4; i15++) {
                    strConcat4 = strConcat4.concat(String.format("%02X", Integer.valueOf(arrayList.get(i15).shortValue())));
                }
                for (int i16 = 0; i16 < sShortValue4; i16++) {
                    arrayList.remove(0);
                }
                strArr[3] = strConcat4;
            } else {
                strArr[3] = "Error KSN Actual";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue5 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat5 = "";
                for (int i17 = 0; i17 < sShortValue5; i17++) {
                    strConcat5 = strConcat5.concat(String.format("%02X", Integer.valueOf(arrayList.get(i17).shortValue())));
                }
                for (int i18 = 0; i18 < sShortValue5; i18++) {
                    arrayList.remove(0);
                }
                strArr[4] = strConcat5;
            } else {
                strArr[4] = "Error PinBlock Nuevo";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue6 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat6 = "";
                for (int i19 = 0; i19 < sShortValue6; i19++) {
                    strConcat6 = strConcat6.concat(String.format("%02X", Integer.valueOf(arrayList.get(i19).shortValue())));
                }
                for (int i20 = 0; i20 < sShortValue6; i20++) {
                    arrayList.remove(0);
                }
                strArr[5] = strConcat6;
            } else {
                strArr[5] = "Error KSN Nuevo";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue7 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat7 = "";
                for (int i21 = 0; i21 < sShortValue7; i21++) {
                    strConcat7 = strConcat7.concat(String.format("%02X", Integer.valueOf(arrayList.get(i21).shortValue())));
                }
                for (int i22 = 0; i22 < sShortValue7; i22++) {
                    arrayList.remove(0);
                }
                strArr[6] = strConcat7;
            } else {
                strArr[6] = "Error renew_pinblock";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue8 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat8 = "";
                for (int i23 = 0; i23 < sShortValue8; i23++) {
                    strConcat8 = strConcat8.concat(String.format("%02X", Integer.valueOf(arrayList.get(i23).shortValue())));
                }
                for (int i24 = 0; i24 < sShortValue8; i24++) {
                    arrayList.remove(0);
                }
                strArr[7] = strConcat8;
            } else {
                strArr[7] = "Error renew_ksn";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue9 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                for (int i25 = 0; i25 < sShortValue9; i25++) {
                    strConcat = strConcat.concat(String.format("%c", Integer.valueOf(arrayList.get(i25).shortValue())));
                }
                for (int i26 = 0; i26 < sShortValue9; i26++) {
                    arrayList.remove(0);
                }
                strArr[8] = strConcat;
            } else {
                strArr[8] = "Error read_mode";
            }
            if (arrayList.get(0).shortValue() == 32) {
                arrayList.remove(0);
                String strConcat9 = "ES ";
                Iterator<Short> it = arrayList.iterator();
                while (it.hasNext() && (sShortValue = it.next().shortValue()) != 33) {
                    strConcat9 = strConcat9.concat(String.format("%c", Integer.valueOf(sShortValue)));
                }
                String[] strArrD = d(strConcat9.replaceAll("\\s+", " "));
                strArr[9] = strArrD[0];
                strArr[10] = strArrD[1];
            } else {
                strArr[9] = "Error ES";
                strArr[10] = "Error ES";
            }
        } catch (Exception e5) {
            PrintStream printStream = System.out;
            StringBuilder sb2 = new StringBuilder("Ex (C56): ");
            sb2.append(e5.getLocalizedMessage());
            printStream.println(sb2.toString());
        }
        return strArr;
    }

    public void cleanAcknowledge() {
        ArrayList<Short> arrayList = this.f67770b;
        if (arrayList.isEmpty()) {
            return;
        }
        arrayList.remove(0);
        arrayList.trimToSize();
    }

    public final String[] d(String str) {
        String[] strArr = {"N/D", "N/D", "N/D"};
        try {
            String[] strArrSplit = str.split(" ");
            String str2 = strArrSplit[2];
            String strSubstring = str2.substring(0, str2.indexOf(SharedPrefsStorage.VERSION_KEY));
            if (this.debug) {
                "Modelo : ".concat(String.valueOf(strSubstring));
            }
            String str3 = strArrSplit[2];
            strArr[0] = str3.substring(str3.indexOf(SharedPrefsStorage.VERSION_KEY) + 1, strArrSplit[2].length()).replace(PushConstants.GE_PARAMS_SEPARATOR, Constant.DOT_STRING);
            String strReplaceAll = strArrSplit[3].replaceAll("PX0+", "0").replaceAll("0+$", "");
            String str4 = strArrSplit[2];
            strArr[2] = str4.substring(0, str4.indexOf(SharedPrefsStorage.VERSION_KEY));
            if (strSubstring.equals(Utils.PINPAD_MODEL_SP30) || strSubstring.equals(Utils.PINPAD_MODEL_PX_PX5) || strSubstring.equals(Utils.PINPAD_MODEL_PX_PX7) || strSubstring.equals(Utils.PINPAD_MODEL_D180) || strSubstring.equals(Utils.PINPAD_MODEL_S300)) {
                strArr[1] = strReplaceAll.substring(1, 9);
            } else if (strSubstring.equals(Utils.PINPAD_MODEL_A920) || strSubstring.equals(Utils.PINPAD_MODEL_D170) || strSubstring.equals(Utils.PINPAD_MODEL_PX7A)) {
                strArr[1] = strReplaceAll.substring(1, 11);
            } else {
                strArr[1] = strReplaceAll.substring(0, 10);
            }
        } catch (Exception e5) {
            strArr[0] = "Error parserTokenEs()";
            strArr[1] = "Error parserTokenEs()";
            System.out.println(e5.getMessage());
        }
        return strArr;
    }

    public final String[] e() {
        short sShortValue;
        String[] strArr = new String[7];
        for (int i10 = 0; i10 < 7; i10++) {
            strArr[i10] = "TODO";
        }
        try {
            new ArrayList();
            ArrayList<Short> arrayList = this.f67770b;
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            strArr[0] = String.format("%c", Integer.valueOf(arrayList.get(0).shortValue())).concat(String.format("%c", Integer.valueOf(arrayList.get(1).shortValue())));
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            String strConcat = "";
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue2 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat2 = "";
                for (int i11 = 0; i11 < sShortValue2; i11++) {
                    strConcat2 = strConcat2.concat(String.format("%02X", Integer.valueOf(arrayList.get(i11).shortValue())));
                }
                for (int i12 = 0; i12 < sShortValue2; i12++) {
                    arrayList.remove(0);
                }
                strArr[1] = strConcat2;
            } else {
                strArr[1] = "Error PAN";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue3 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat3 = "";
                for (int i13 = 0; i13 < sShortValue3; i13++) {
                    strConcat3 = strConcat3.concat(String.format("%02X", Integer.valueOf(arrayList.get(i13).shortValue())));
                }
                for (int i14 = 0; i14 < sShortValue3; i14++) {
                    arrayList.remove(0);
                }
                strArr[2] = strConcat3;
            } else {
                strArr[2] = "Error PinBlock";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue4 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat4 = "";
                for (int i15 = 0; i15 < sShortValue4; i15++) {
                    strConcat4 = strConcat4.concat(String.format("%02X", Integer.valueOf(arrayList.get(i15).shortValue())));
                }
                for (int i16 = 0; i16 < sShortValue4; i16++) {
                    arrayList.remove(0);
                }
                strArr[3] = strConcat4;
            } else {
                strArr[3] = "Error KSN";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue5 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                for (int i17 = 0; i17 < sShortValue5; i17++) {
                    strConcat = strConcat.concat(String.format("%c", Integer.valueOf(arrayList.get(i17).shortValue())));
                }
                for (int i18 = 0; i18 < sShortValue5; i18++) {
                    arrayList.remove(0);
                }
                strArr[4] = strConcat;
            } else {
                strArr[4] = "Error read_mode";
            }
            if (arrayList.get(0).shortValue() == 32) {
                arrayList.remove(0);
                String strConcat5 = "ES ";
                Iterator<Short> it = arrayList.iterator();
                while (it.hasNext() && (sShortValue = it.next().shortValue()) != 3) {
                    strConcat5 = strConcat5.concat(String.format("%c", Integer.valueOf(sShortValue)));
                }
                String[] strArrD = d(strConcat5.replaceAll("\\s+", " "));
                strArr[5] = strArrD[0];
                strArr[6] = strArrD[1];
            } else {
                strArr[5] = "Error ES";
                strArr[6] = "Error ES";
            }
        } catch (Exception e5) {
            e5.getLocalizedMessage();
        }
        return strArr;
    }

    public final String f() {
        if (!this.f67772d.contains("! EW")) {
            return CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN;
        }
        try {
            String str = this.f67772d;
            String strReplace = str.substring(str.indexOf("! EW")).replace("! EW", "");
            return strReplace.substring(6, Integer.parseInt(strReplace.substring(0, 5)) + 6);
        } catch (Exception e5) {
            String localizedMessage = e5.getLocalizedMessage();
            if (this.debug) {
                System.out.println(e5.getLocalizedMessage());
            }
            return localizedMessage;
        }
    }

    public int findMessageState() {
        if ((this.code.equalsIgnoreCase(CommandConstants.COMMAND_C51) || this.code.equalsIgnoreCase(CommandConstants.COMMAND_C54) || this.code.equalsIgnoreCase("C55") || this.code.equalsIgnoreCase("C56") || this.code.equalsIgnoreCase("Q9") || this.code.equalsIgnoreCase(CommandConstants.COMMAND_Z12) || this.code.equalsIgnoreCase(CommandConstants.COMMAND_Z13) || this.code.equalsIgnoreCase(CommandConstants.COMMAND_Z10) || this.code.equalsIgnoreCase(CommandConstants.COMMAND_Z11) || this.code.equalsIgnoreCase("C50")) && this.f67770b.size() > 2) {
            for (Map.Entry<String, Integer> entry : MessageUtils.estados.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (this.f67772d.contains(key)) {
                    this.f67774f = value.intValue();
                }
            }
        }
        return this.f67774f;
    }

    public final String[] g() {
        String[] strArr = new String[5];
        for (int i10 = 0; i10 < 5; i10++) {
            strArr[i10] = "TODO";
        }
        try {
            new ArrayList();
            ArrayList<Short> arrayList = this.f67770b;
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            strArr[0] = String.format("%c", Integer.valueOf(arrayList.get(0).shortValue())).concat(String.format("%c", Integer.valueOf(arrayList.get(1).shortValue())));
            arrayList.remove(0);
            arrayList.remove(0);
            strArr[1] = f();
            String strB = b();
            strArr[2] = strB;
            if (strB.equalsIgnoreCase(CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN)) {
                strArr[3] = "Error ES";
                strArr[4] = "Error ES";
            } else {
                String[] strArrD = d(strB.replaceAll("\\s+", " "));
                strArr[3] = strArrD[0];
                strArr[4] = strArrD[1];
            }
        } catch (Exception e5) {
            e5.getLocalizedMessage();
        }
        return strArr;
    }

    public ArrayList<Short> getList() {
        return this.f67770b;
    }

    public int getMessageCode() {
        if (this.f67770b.size() > 2) {
            for (Map.Entry<Integer, String> entry : MessageUtils.msgStatusCode.entrySet()) {
                String value = entry.getValue();
                Integer key = entry.getKey();
                if (this.f67772d.contains(this.code.concat(value))) {
                    this.f67774f = key.intValue();
                    this.code.concat(value);
                }
            }
        }
        return this.f67774f;
    }

    public String getNextCommand() {
        return this.f67773e;
    }

    public int getStateInt() {
        return this.f67774f;
    }

    public final String[] h() {
        String[] strArr = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
        try {
            new ArrayList();
            ArrayList<Short> arrayList = this.f67770b;
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            strArr[0] = "".concat(String.format("%c", Integer.valueOf(arrayList.get(0).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList.get(1).shortValue())));
        } catch (Exception unused) {
            strArr[0] = "Error parserZ11 Response()";
        }
        return strArr;
    }

    public boolean isAcknowledgeType() {
        ArrayList<Short> arrayList = this.f67770b;
        if (arrayList.isEmpty()) {
            return false;
        }
        short sShortValue = arrayList.get(0).shortValue();
        return sShortValue == 6 || sShortValue == 21;
    }

    public boolean isEndOfMessage() {
        ArrayList<Short> arrayList = this.f67770b;
        if (arrayList.size() > 2) {
            for (int size = arrayList.size() - 1; size > 2; size--) {
                if (arrayList.get(size).shortValue() == 3) {
                    try {
                        return arrayList.get(size).shortValue() != -999;
                    } catch (IndexOutOfBoundsException unused) {
                    }
                }
            }
        }
        return false;
    }

    public boolean isEndOfMessage2() {
        ArrayList<Short> arrayList = this.f67770b;
        try {
            if (arrayList.size() > 9 && arrayList.size() > Integer.parseInt(String.format("%02X", Integer.valueOf(arrayList.get(7).shortValue())).concat(String.format("%02X", Integer.valueOf(arrayList.get(8).shortValue()))), 16) + 5) {
                for (int size = arrayList.size() - 1; size > 2; size--) {
                    if (arrayList.get(size).shortValue() == 3) {
                        try {
                            return arrayList.get(size + 1).shortValue() != -999;
                        } catch (IndexOutOfBoundsException unused) {
                        }
                    }
                }
            }
        } catch (Exception e5) {
            e5.getLocalizedMessage();
        }
        return false;
    }

    public boolean isFinished() {
        return this.f67776h;
    }

    public boolean isOK() {
        ArrayList<Short> arrayList = this.f67770b;
        if (!arrayList.isEmpty()) {
            return arrayList.get(0).shortValue() == 6;
        }
        ArrayList<Integer> arrayList2 = this.f67771c;
        return !arrayList2.isEmpty() && arrayList2.get(0).intValue() == 6;
    }

    public boolean isPositiveAcknowledge() {
        ArrayList<Short> arrayList = this.f67770b;
        return !arrayList.isEmpty() && arrayList.get(0).shortValue() == 6;
    }

    public boolean isValidMessage() {
        short sShortValue;
        ArrayList<Short> arrayList = this.f67770b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size() - 1;
            while (true) {
                if (size <= 2) {
                    size = 0;
                    sShortValue = 0;
                    break;
                }
                if (arrayList.get(size).shortValue() == 3) {
                    try {
                        sShortValue = arrayList.get(size + 1).shortValue();
                        break;
                    } catch (IndexOutOfBoundsException e5) {
                        e5.getLocalizedMessage();
                        sShortValue = 0;
                        break;
                    }
                }
                size--;
            }
            if (size != 0 && sShortValue != 0) {
                ArrayList<Short> arrayList2 = new ArrayList<>();
                for (int i10 = 0; i10 <= size; i10++) {
                    arrayList2.add(arrayList.get(i10));
                }
                short sCheckSum = MessageUtils.checkSum(getShortArray(arrayList2));
                if (this.debug) {
                    System.out.println(sCheckSum == sShortValue);
                }
                if (sCheckSum == sShortValue) {
                    return true;
                }
            }
        }
        return false;
    }

    public void printData() {
        ArrayList<Short> arrayList;
        if (this.debug) {
            PrintStream printStream = System.out;
            printStream.println("[PinPadLibrary.ResponseMessage] - - - - - - - - - - - - - - - - - - - - - ");
            printStream.println("[PinPadLibrary.ResponseMessage] printData() - Imprimiendo en caracter el contenido del mensaje : ");
            int i10 = 0;
            while (true) {
                arrayList = this.f67770b;
                if (i10 >= arrayList.size()) {
                    break;
                }
                if (MessageUtils.specialCodes.containsKey(Integer.valueOf(arrayList.get(i10).shortValue()))) {
                    System.out.print(MessageUtils.specialCodes.get(Integer.valueOf(arrayList.get(i10).shortValue())));
                } else {
                    try {
                        System.out.print(String.format("%c", Integer.valueOf(arrayList.get(i10).shortValue())));
                    } catch (Exception unused) {
                        System.out.print(String.format("%c", 63));
                    }
                }
                i10++;
            }
            PrintStream printStream2 = System.out;
            printStream2.println();
            printStream2.println("[PinPadLibrary.ResponseMessage] printData() - Imprimiendo en hexa : ");
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (MessageUtils.specialCodes.containsKey(arrayList.get(i11))) {
                    PrintStream printStream3 = System.out;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(MessageUtils.specialCodes.get(arrayList.get(i11)));
                    sb2.append(" - ");
                    printStream3.print(sb2.toString());
                } else {
                    PrintStream printStream4 = System.out;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(String.format("0x%04X", Integer.valueOf(arrayList.get(i11).shortValue())));
                    sb3.append(" - ");
                    printStream4.print(sb3.toString());
                }
            }
            PrintStream printStream5 = System.out;
            printStream5.println();
            printStream5.println("[PinPadLibrary.ResponseMessage] printData() - Finalizando la impresion.");
            printStream5.println("[PinPadLibrary.ResponseMessage] - - - - - - - - - - - - - - - - - - - - - ");
        }
    }

    public JsonObject responseToJson() {
        char c10;
        short sShortValue;
        JsonObject jsonObject = this.f67775g;
        if (jsonObject != null) {
            return jsonObject;
        }
        this.f67775g = new JsonObject();
        boolean zEqualsIgnoreCase = this.code.equalsIgnoreCase(CommandConstants.COMMAND_C51);
        ArrayList<Short> arrayList = this.f67770b;
        String strConcat = "";
        if (zEqualsIgnoreCase) {
            String[] strArr = new String[14];
            for (int i10 = 0; i10 < 14; i10++) {
                strArr[i10] = CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN;
            }
            new ArrayList();
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            strArr[0] = String.format("%c", Integer.valueOf(arrayList.get(0).shortValue())).concat(String.format("%c", Integer.valueOf(arrayList.get(1).shortValue())));
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            arrayList.remove(0);
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue2 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat2 = "";
                for (int i11 = 0; i11 < sShortValue2; i11++) {
                    strConcat2 = strConcat2.concat(String.format("%02X", Integer.valueOf(arrayList.get(i11).shortValue())));
                }
                for (int i12 = 0; i12 < sShortValue2; i12++) {
                    arrayList.remove(0);
                }
                strArr[1] = strConcat2;
            } else {
                strArr[1] = "Error PAN";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue3 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat3 = "";
                for (int i13 = 0; i13 < sShortValue3; i13++) {
                    strConcat3 = strConcat3.concat(String.format("%c", Integer.valueOf(arrayList.get(i13).shortValue())));
                }
                for (int i14 = 0; i14 < sShortValue3; i14++) {
                    arrayList.remove(0);
                }
                strArr[2] = strConcat3.trim();
            } else {
                strArr[2] = "Error Cardholder";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue4 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat4 = "";
                for (int i15 = 0; i15 < sShortValue4; i15++) {
                    strConcat4 = strConcat4.concat(String.format("%02X", Integer.valueOf(arrayList.get(i15).shortValue())));
                }
                for (int i16 = 0; i16 < sShortValue4; i16++) {
                    arrayList.remove(0);
                }
                strArr[11] = strConcat4;
            } else {
                strArr[11] = "Error Track III";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue5 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat5 = "";
                for (int i17 = 0; i17 < sShortValue5; i17++) {
                    strConcat5 = strConcat5.concat(String.format("%02X", Integer.valueOf(arrayList.get(i17).shortValue())));
                }
                for (int i18 = 0; i18 < sShortValue5; i18++) {
                    arrayList.remove(0);
                }
                strArr[3] = strConcat5;
            } else {
                strArr[3] = "Error Track II";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue6 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat6 = "";
                for (int i19 = 0; i19 < sShortValue6; i19++) {
                    strConcat6 = strConcat6.concat(String.format("%02X", Integer.valueOf(arrayList.get(i19).shortValue())));
                }
                for (int i20 = 0; i20 < sShortValue6; i20++) {
                    arrayList.remove(0);
                }
                strArr[4] = strConcat6;
            } else {
                strArr[4] = "Error Track I";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue7 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat7 = "";
                for (int i21 = 0; i21 < sShortValue7; i21++) {
                    strConcat7 = strConcat7.concat(String.format("%02X", Integer.valueOf(arrayList.get(i21).shortValue())));
                }
                for (int i22 = 0; i22 < sShortValue7; i22++) {
                    arrayList.remove(0);
                }
                strArr[5] = strConcat7;
            } else {
                strArr[5] = "Error CCV";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue8 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat8 = "";
                for (int i23 = 0; i23 < sShortValue8; i23++) {
                    strConcat8 = strConcat8.concat(String.format("%c", Integer.valueOf(arrayList.get(i23).shortValue())));
                }
                for (int i24 = 0; i24 < sShortValue8; i24++) {
                    arrayList.remove(0);
                }
                strArr[6] = strConcat8;
            } else {
                strArr[6] = "Error read_mode";
            }
            if (arrayList.get(0).shortValue() == 193) {
                short sShortValue9 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat9 = "";
                for (int i25 = 0; i25 < sShortValue9; i25++) {
                    strConcat9 = strConcat9.concat(String.format("%02X", Integer.valueOf(arrayList.get(i25).shortValue())));
                }
                for (int i26 = 0; i26 < sShortValue9; i26++) {
                    arrayList.remove(0);
                }
                strArr[12] = strConcat9;
            } else {
                strArr[12] = CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN;
            }
            if (arrayList.get(0).shortValue() == 225) {
                short sShortValue10 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                String strConcat10 = "";
                for (int i27 = 0; i27 < sShortValue10; i27++) {
                    strConcat10 = strConcat10.concat(String.format("%02X", Integer.valueOf(arrayList.get(i27).shortValue())));
                }
                for (int i28 = 0; i28 < sShortValue10; i28++) {
                    arrayList.remove(0);
                }
                strArr[7] = strConcat10;
            } else {
                strArr[7] = "Error E1";
            }
            if (arrayList.get(0).shortValue() == 226) {
                short sShortValue11 = arrayList.get(1).shortValue();
                arrayList.remove(0);
                arrayList.remove(0);
                for (int i29 = 0; i29 < sShortValue11; i29++) {
                    strConcat = strConcat.concat(String.format("%02X", Integer.valueOf(arrayList.get(i29).shortValue())));
                }
                for (int i30 = 0; i30 < sShortValue11; i30++) {
                    arrayList.remove(0);
                }
                strArr[8] = strConcat;
            } else {
                strArr[8] = "Error E2";
            }
            if (arrayList.get(0).shortValue() == 32) {
                arrayList.remove(0);
                Iterator<Short> it = arrayList.iterator();
                String strConcat11 = "ES ";
                while (it.hasNext() && (sShortValue = it.next().shortValue()) != 3) {
                    strConcat11 = strConcat11.concat(String.format("%c", Integer.valueOf(sShortValue)));
                }
                String[] strArrD = d(strConcat11.replaceAll("\\s+", " "));
                strArr[10] = strArrD[0];
                strArr[9] = strArrD[1];
                strArr[13] = strArrD[2];
            } else {
                strArr[10] = "Error ES";
                strArr[9] = "Error ES";
                strArr[13] = "Error ES";
            }
            this.f67775g.addProperty("res_proc", strArr[0]);
            this.f67775g.addProperty(GoogleTapAndPay.KEY_PAN, strArr[1]);
            this.f67775g.addProperty("cardholder", strArr[2]);
            this.f67775g.addProperty(EglobalUtils.TRACK2, strArr[3]);
            this.f67775g.addProperty("track1", strArr[4]);
            this.f67775g.addProperty("ccv", strArr[5]);
            this.f67775g.addProperty("read_mode", strArr[6]);
            this.f67775g.addProperty("e1", strArr[7]);
            this.f67775g.addProperty("e2", strArr[8]);
            this.f67775g.addProperty("serial", strArr[9]);
            this.f67775g.addProperty("version", strArr[10]);
            this.f67775g.addProperty("track3", strArr[11]);
            this.f67775g.addProperty("pinstatus", strArr[12]);
            this.f67775g.addProperty("modelo", strArr[13]);
        } else if (this.code.equalsIgnoreCase(CommandConstants.COMMAND_Q8)) {
            String[] strArr2 = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
            try {
                String str = this.f67772d;
                String[] strArrD2 = d(str.substring(0, str.length() - 1).replaceAll("\\s+", " ").replace("<ACK>", "").replace("<STX>", "").replace("<ETX>", ""));
                strArr2[0] = strArrD2[0];
                strArr2[1] = strArrD2[1];
                strArr2[2] = strArrD2[2];
                c10 = 2;
            } catch (Exception e5) {
                StringBuilder sb2 = new StringBuilder("Exception parserQ8Response() ");
                sb2.append(e5.getLocalizedMessage());
                strArr2[0] = sb2.toString();
                StringBuilder sb3 = new StringBuilder("Exception parserQ8Response() ");
                sb3.append(e5.getLocalizedMessage());
                strArr2[1] = sb3.toString();
                StringBuilder sb4 = new StringBuilder("Exception parserQ8Response() ");
                sb4.append(e5.getLocalizedMessage());
                String string = sb4.toString();
                c10 = 2;
                strArr2[2] = string;
            }
            this.f67775g.addProperty("app_ver", strArr2[0]);
            this.f67775g.addProperty("serial", strArr2[1]);
            this.f67775g.addProperty("modelo", strArr2[c10]);
        } else if (this.code.equalsIgnoreCase(CommandConstants.COMMAND_C54)) {
            String[] strArr3 = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
            new ArrayList();
            arrayList.remove(0);
            arrayList.remove(0);
            if (arrayList.get(0).shortValue() == 67) {
                strArr3[0] = "".concat(String.format("%c", Integer.valueOf(arrayList.get(3).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList.get(4).shortValue())));
            } else {
                strArr3[0] = "Error";
            }
            this.f67775g.addProperty("status", strArr3[0]);
        } else if (this.code.equalsIgnoreCase("C55")) {
            String[] strArrE = e();
            this.f67775g.addProperty("status", strArrE[0]);
            this.f67775g.addProperty(GoogleTapAndPay.KEY_PAN, strArrE[1]);
            this.f67775g.addProperty("pinblock", strArrE[2]);
            this.f67775g.addProperty("ksn", strArrE[3]);
            this.f67775g.addProperty("cardtype", strArrE[4]);
            this.f67775g.addProperty("version", strArrE[5]);
            this.f67775g.addProperty("serial", strArrE[6]);
        } else if (this.code.equalsIgnoreCase("Q9")) {
            String[] strArr4 = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
            try {
                new ArrayList();
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                strArr4[0] = "".concat(String.format("%c", Integer.valueOf(arrayList.get(0).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList.get(1).shortValue())));
                arrayList.remove(0);
                arrayList.remove(0);
                strArr4[1] = String.format("%c", Integer.valueOf(arrayList.get(0).shortValue()));
            } catch (Exception unused) {
                strArr4[0] = "Error parserQ9Response()";
                strArr4[1] = "Error parserQ9Response()";
            }
            this.f67775g.addProperty("status", strArr4[0]);
            this.f67775g.addProperty("key", strArr4[1]);
        } else if (this.code.equalsIgnoreCase("z12")) {
            String[] strArr5 = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
            try {
                new ArrayList();
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                strArr5[0] = "".concat(String.format("%c", Integer.valueOf(arrayList.get(0).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList.get(1).shortValue())));
            } catch (Exception unused2) {
                strArr5[0] = "Error parserZ12 Response()";
                strArr5[1] = "Error parserZ12 Response()";
            }
            this.f67775g.addProperty("status", strArr5[0]);
        } else if (this.code.equalsIgnoreCase("z13")) {
            String[] strArr6 = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
            try {
                new ArrayList();
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                arrayList.remove(0);
                strArr6[0] = "".concat(String.format("%c", Integer.valueOf(arrayList.get(0).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList.get(1).shortValue())));
                arrayList.remove(0);
                arrayList.remove(0);
                strArr6[1] = String.format("%02X", Integer.valueOf(arrayList.get(0).shortValue())).concat(String.format("%02X", Integer.valueOf(arrayList.get(1).shortValue()))).concat(String.format("%02X", Integer.valueOf(arrayList.get(2).shortValue()))).concat(String.format("%02X", Integer.valueOf(arrayList.get(3).shortValue())));
            } catch (Exception unused3) {
                strArr6[0] = "Error parserZ13Response()";
                strArr6[1] = "Error parserZ13Response()";
            }
            this.f67775g.addProperty("status", strArr6[0]);
            this.f67775g.addProperty("kcv", strArr6[1]);
        } else if (this.code.equalsIgnoreCase("C56")) {
            String[] strArrC = c();
            this.f67775g.addProperty("status", strArrC[0]);
            this.f67775g.addProperty(GoogleTapAndPay.KEY_PAN, strArrC[1]);
            this.f67775g.addProperty("actual_pinblock", strArrC[2]);
            this.f67775g.addProperty("actual_ksn", strArrC[3]);
            this.f67775g.addProperty("new_pinblock", strArrC[4]);
            this.f67775g.addProperty("new_ksn", strArrC[5]);
            this.f67775g.addProperty("renew_pinblock", strArrC[6]);
            this.f67775g.addProperty("renew_ksn", strArrC[7]);
            this.f67775g.addProperty("read_mod", strArrC[8]);
            this.f67775g.addProperty("app_ver", strArrC[9]);
            this.f67775g.addProperty("serial", strArrC[10]);
        } else if (this.code.equalsIgnoreCase("z10")) {
            String[] strArrG = g();
            this.f67775g.addProperty("status", strArrG[0]);
            this.f67775g.addProperty("tokenew", strArrG[1]);
            this.f67775g.addProperty("tokenes", strArrG[2]);
            this.f67775g.addProperty("app_ver", strArrG[3]);
            this.f67775g.addProperty("serial", strArrG[4]);
        } else if (this.code.equalsIgnoreCase("z11")) {
            this.f67775g.addProperty("status", h()[0]);
        } else if (this.code.equalsIgnoreCase("C50")) {
            String[] strArrA = a();
            this.f67775g.addProperty("status", strArrA[0]);
            this.f67775g.addProperty("bin", strArrA[1]);
        }
        return this.f67775g;
    }

    public void setData(short[] sArr) {
        this.f67770b.addAll(getArrayList(sArr));
        int[] iArr = new int[sArr.length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            short s4 = sArr[i10];
            iArr[i10] = s4;
            if (MessageUtils.specialCodes.containsKey(Integer.valueOf(s4))) {
                this.f67772d = this.f67772d.concat(MessageUtils.specialCodes.get(Integer.valueOf(sArr[i10])));
            } else {
                try {
                    this.f67772d = this.f67772d.concat(String.format("%c", Integer.valueOf(sArr[i10])));
                } catch (Exception unused) {
                    this.f67772d = this.f67772d.concat(String.format("%c", 63));
                }
            }
        }
        setData(iArr);
    }

    public void setFinished(boolean z10) {
        this.f67776h = z10;
    }

    public void setNextCommand(String str) {
        this.f67773e = str;
    }

    public void setData(int[] iArr) {
        this.f67771c.addAll(getArrayList(iArr));
    }
}
