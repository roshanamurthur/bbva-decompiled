package com.vierge.pinpadsdk.message.base;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import com.bbva.notifications.constants.PushConstants;
import com.esotericsoftware.asm.Opcodes;
import com.google.gson.JsonObject;
import com.vierge.pinpadsdk.utils.Logs;
import com.vierge.pinpadsdk.utils.Utils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes6.dex */
public class MessageResponseBase extends MessageBase {
    protected byte[] data;
    public boolean isNewCommand;
    protected JsonObject retorno;
    protected String nextCommand = "";
    protected String stateStr = "";
    protected int stateInt = -1;
    protected boolean terminado = false;
    protected ArrayList<Short> list = new ArrayList<>();
    protected ArrayList<Integer> list2 = new ArrayList<>();
    protected String strResponse = "";

    public String _getTokenES() {
        if (!this.strResponse.contains("! ES")) {
            return CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN;
        }
        try {
            String str = this.strResponse;
            String strSubstring = str.substring(str.indexOf("! ES"));
            return strSubstring.substring(0, Integer.parseInt(("" + strSubstring).replace("! ES", "").substring(0, 5)) + 10);
        } catch (Exception e5) {
            String localizedMessage = e5.getLocalizedMessage();
            Logs.write(e5.getLocalizedMessage());
            return localizedMessage;
        }
    }

    public String _getTokenEW() {
        if (!this.strResponse.contains("! EW")) {
            return CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN;
        }
        try {
            String str = this.strResponse;
            String strSubstring = str.substring(str.indexOf("! EW"));
            return strSubstring.substring(0, Integer.parseInt(("" + strSubstring).replace("! EW", "").substring(0, 5)) + 10);
        } catch (Exception e5) {
            String localizedMessage = e5.getLocalizedMessage();
            Logs.write(e5.getLocalizedMessage());
            return localizedMessage;
        }
    }

    public String[] _parserTokenEs(String str) {
        String[] strArr = {"N/D", "N/D", "N/D"};
        try {
            String[] strArrSplit = str.split(" ");
            String str2 = strArrSplit[2];
            String strSubstring = str2.substring(0, str2.indexOf(SharedPrefsStorage.VERSION_KEY));
            String str3 = strArrSplit[2];
            Logs.write("Modelo : " + strSubstring);
            String str4 = strArrSplit[2];
            strArr[0] = str4.substring(str4.indexOf(SharedPrefsStorage.VERSION_KEY) + 1, strArrSplit[2].length()).replace(PushConstants.GE_PARAMS_SEPARATOR, Constant.DOT_STRING);
            String strReplaceAll = strArrSplit[3].replaceAll("PX0+", "0").replaceAll("0+$", "");
            String str5 = strArrSplit[2];
            strArr[2] = str5.substring(0, str5.indexOf(SharedPrefsStorage.VERSION_KEY));
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

    public String[] _parserTokenEsZ10(String str) {
        String[] strArr = {"N/D", "N/D", "N/D"};
        try {
            String[] strArrSplit = str.substring(10).split(" ");
            String str2 = strArrSplit[0];
            String strSubstring = str2.substring(0, str2.indexOf(SharedPrefsStorage.VERSION_KEY));
            Logs.write("Modelo : " + strSubstring);
            String str3 = strArrSplit[0];
            strArr[0] = str3.substring(str3.indexOf(SharedPrefsStorage.VERSION_KEY) + 1, strArrSplit[0].length()).replace(PushConstants.GE_PARAMS_SEPARATOR, Constant.DOT_STRING);
            String strReplaceAll = strArrSplit[1].replaceAll("PX0+", "0").replaceAll("0+$", "");
            String str4 = strArrSplit[0];
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

    public ArrayList<Short> arrayListRemoveFirstNElements(ArrayList<Short> arrayList, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.remove(0);
        }
        return arrayList;
    }

    public void cleanAcknowledge() {
        if (this.list.isEmpty()) {
            return;
        }
        this.list.remove(0);
        this.list.trimToSize();
    }

    public void cleanBuffer() {
        while (this.list.isEmpty()) {
            this.list.remove(0);
            this.list.trimToSize();
        }
    }

    public String disassemblySeparatorLengthValue(ArrayList<Short> arrayList, Short sh2) {
        if (arrayList.get(0).shortValue() != sh2.shortValue()) {
            return u.h("%X", new Object[]{sh2}, new StringBuilder("Error "));
        }
        List<Short> listSubList = arrayList.subList(2, arrayList.get(1).shortValue() + 2);
        String strH = "";
        for (int i10 = 0; i10 < listSubList.size(); i10++) {
            strH = u.h("%02x", new Object[]{listSubList.get(i10)}, c.d(strH));
        }
        return strH;
    }

    public int findMessageState() {
        if ((this.code.equalsIgnoreCase(CommandConstants.COMMAND_C51) || this.code.equalsIgnoreCase(CommandConstants.COMMAND_C54) || this.code.equalsIgnoreCase("C55") || this.code.equalsIgnoreCase("C56") || this.code.equalsIgnoreCase("Q9") || this.code.equalsIgnoreCase(CommandConstants.COMMAND_Z12) || this.code.equalsIgnoreCase(CommandConstants.COMMAND_Z13) || this.code.equalsIgnoreCase(CommandConstants.COMMAND_Z10) || this.code.equalsIgnoreCase(CommandConstants.COMMAND_Z11) || this.code.equalsIgnoreCase("C50") || this.code.equalsIgnoreCase(CommandConstants.COMMAND_C25) || this.code.equalsIgnoreCase("C12")) && this.list.size() > 2) {
            for (Map.Entry<String, Integer> entry : MessageUtils.estados.entrySet()) {
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (this.strResponse.contains(key)) {
                    this.stateInt = value.intValue();
                    this.stateStr = key;
                }
            }
        }
        return this.stateInt;
    }

    public ArrayList<Short> getList() {
        return this.list;
    }

    public int getMessageCode() {
        if (this.list.size() > 2) {
            for (Map.Entry<Integer, String> entry : MessageUtils.msgStatusCode.entrySet()) {
                String value = entry.getValue();
                Integer key = entry.getKey();
                if (this.strResponse.contains(this.code.concat(value))) {
                    this.stateInt = key.intValue();
                    this.stateStr = this.code.concat(value);
                }
            }
        }
        return this.stateInt;
    }

    public String getNextCommand() {
        return this.nextCommand;
    }

    public String[] getSeparadorLongitudData(String str) {
        String strSubstring;
        char c10;
        String[] strArr = new String[2];
        if (str.substring(0, 1).equals(String.format("%c", Integer.valueOf(Opcodes.INSTANCEOF)))) {
            c10 = str.substring(1, 2).toCharArray()[0];
            strSubstring = str.substring(2, c10 + 2);
        } else {
            strSubstring = "Error TLV";
            c10 = 0;
        }
        strArr[0] = str.substring(c10 + 2);
        strArr[1] = strSubstring;
        return strArr;
    }

    public int getStateInt() {
        return this.stateInt;
    }

    public String[] getStatus(String str, String str2) {
        return new String[]{str2.substring(7), str2.substring(this.strResponse.indexOf(CommandConstants.COMMAND_Z13)).substring(3, 5)};
    }

    public boolean isAcknowledgeType() {
        if (this.list.isEmpty()) {
            return false;
        }
        short sShortValue = this.list.get(0).shortValue();
        return sShortValue == 6 || sShortValue == 21;
    }

    public boolean isEndOfMessage() {
        if (this.list.size() > 2) {
            for (int size = this.list.size() - 1; size > 2; size--) {
                if (this.list.get(size).shortValue() == 3) {
                    try {
                        return this.list.get(size).shortValue() != -999;
                    } catch (IndexOutOfBoundsException unused) {
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public int isEndOfMessage2() {
        short sShortValue;
        Logs.write("isEndOfMessage2");
        try {
            if (this.list.size() > 9) {
                String strConcat = String.format("%02X", Integer.valueOf(this.list.get(7).shortValue())).concat(String.format("%02X", Integer.valueOf(this.list.get(8).shortValue())));
                int i10 = Integer.parseInt(strConcat, 16);
                Logs.write("long mensaje = " + strConcat + " => " + i10 + "longitud recibida " + this.list.size());
                if (this.list.size() > i10 + 8) {
                    if (this.list.get(i10 + 9).shortValue() == 3) {
                        Logs.write("Recibido ETX");
                        try {
                            sShortValue = this.list.get(i10 + 10).shortValue();
                            try {
                                Logs.write("Recibido lrc " + String.valueOf((int) sShortValue));
                            } catch (IndexOutOfBoundsException e5) {
                                e = e5;
                                Logs.write("Exception 2 : " + e.getMessage());
                            }
                        } catch (IndexOutOfBoundsException e7) {
                            e = e7;
                            sShortValue = -999;
                        }
                        if (sShortValue != -999) {
                            return 0;
                        }
                    }
                    return 2;
                }
            }
        } catch (Exception e10) {
            Logs.write("Exception 3 : " + e10.getLocalizedMessage());
        }
        return 1;
    }

    public boolean isFinished() {
        return this.terminado;
    }

    public boolean isOK() {
        return !this.list2.isEmpty() && this.list2.get(0).intValue() == 6;
    }

    public boolean isPositiveAcknowledge() {
        return !this.list.isEmpty() && this.list.get(0).shortValue() == 6;
    }

    public boolean isValidMessage() {
        short sShortValue;
        if (this.list.isEmpty()) {
            return false;
        }
        int size = this.list.size() - 1;
        while (true) {
            if (size <= 2) {
                size = 0;
                sShortValue = 0;
                break;
            }
            if (this.list.get(size).shortValue() == 3) {
                try {
                    sShortValue = this.list.get(size + 1).shortValue();
                    break;
                } catch (IndexOutOfBoundsException e5) {
                    System.out.println("IndexOutOfBoundsException 4 : " + e5.getLocalizedMessage());
                    sShortValue = (short) 0;
                }
            } else {
                size--;
            }
        }
        if (size == 0 || sShortValue == 0) {
            return false;
        }
        ArrayList<Short> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 <= size; i10++) {
            arrayList.add(this.list.get(i10));
        }
        short sCheckSum = MessageUtils.checkSum(getShortArray(arrayList));
        Logs.write(sCheckSum == sShortValue);
        return sCheckSum == sShortValue;
    }

    public void setData(short[] sArr) {
        this.list.addAll(getArrayList(sArr));
        int[] iArr = new int[sArr.length];
        for (int i10 = 0; i10 < sArr.length; i10++) {
            short s4 = sArr[i10];
            iArr[i10] = s4;
            if (MessageUtils.specialCodes.containsKey(Integer.valueOf(s4))) {
                this.strResponse = this.strResponse.concat(MessageUtils.specialCodes.get(Integer.valueOf(sArr[i10])));
            } else {
                try {
                    this.strResponse = this.strResponse.concat(String.format("%c", Integer.valueOf(sArr[i10])));
                } catch (Exception unused) {
                    this.strResponse = this.strResponse.concat(String.format("%c", 63));
                }
            }
        }
        setData(iArr);
    }

    public void setFinished(boolean z10) {
        this.terminado = z10;
    }

    public void setNextCommand(String str) {
        this.nextCommand = str;
    }

    public void setData(int[] iArr) {
        this.list2.addAll(getArrayList(iArr));
    }
}
