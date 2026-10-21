package com.vierge.pinpadsdk.message.openpay;

import androidx.webkit.ProxyConfig;
import com.bbva.glomoconfig.constants.CountryRouteConstants;
import com.bbva.google.pay.GoogleTapAndPay;
import com.google.gson.JsonObject;
import com.sun.mail.imap.IMAPStore;
import com.vierge.pinpadsdk.PinPadSdk;
import com.vierge.pinpadsdk.message.eglobal.MessageResponseEglobal;
import com.vierge.pinpadsdk.utils.Categories;
import com.vierge.pinpadsdk.utils.Logs;
import com.vierge.pinpadsdk.utils.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: loaded from: classes6.dex */
public class MessageResponseOpenPlay extends MessageResponseEglobal {
    @Override // com.vierge.pinpadsdk.message.eglobal.MessageResponseEglobal
    public String[] _parserQ8Response() {
        String[] strArr = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
        try {
            String str = this.strResponse;
            String strReplace = str.substring(0, str.length() - 1).replaceAll("\\s+", " ").replace("<ACK>", "").replace("<STX>", "").replace("<ETX>", "");
            String str2 = getSeparadorLongitudData(strReplace.substring(strReplace.indexOf(CommandConstants.COMMAND_Q8) + 2))[1];
            strArr[0] = str2;
            try {
                byte b10 = (byte) str2.toCharArray()[0];
                if (b10 > 100) {
                    strArr[0] = "100";
                } else {
                    strArr[0] = String.format("%d", Byte.valueOf(b10));
                }
            } catch (Exception e5) {
                Logs.write(e5.getLocalizedMessage());
                strArr[0] = "Error C1" + e5.getMessage();
            }
            String[] strArr_parserTokenEs = _parserTokenEs(strReplace);
            strArr[1] = strArr_parserTokenEs[0];
            strArr[2] = strArr_parserTokenEs[1];
            strArr[3] = strArr_parserTokenEs[2];
        } catch (Exception e7) {
            strArr[1] = "Exception parserQ8Response() " + e7.getLocalizedMessage();
            strArr[2] = "Exception parserQ8Response() " + e7.getLocalizedMessage();
            strArr[3] = "Exception parserQ8Response() " + e7.getLocalizedMessage();
        }
        return strArr;
    }

    public final String[] a() {
        short sShortValue;
        String[] strArr = new String[11];
        for (int i10 = 0; i10 < 11; i10++) {
            strArr[i10] = "TODO";
        }
        try {
            new ArrayList();
            ArrayList<Short> arrayList = this.list;
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
                String[] strArr_parserTokenEs = _parserTokenEs(strConcat9.replaceAll("\\s+", " "));
                strArr[9] = strArr_parserTokenEs[0];
                strArr[10] = strArr_parserTokenEs[1];
            } else {
                strArr[9] = "Error ES";
                strArr[10] = "Error ES";
            }
        } catch (Exception e5) {
            System.out.println("Ex (C56): " + e5.getLocalizedMessage());
        }
        return strArr;
    }

    public void printData() {
        Logs.write(" ", this.list, Categories.communication);
    }

    @Override // com.vierge.pinpadsdk.message.eglobal.MessageResponseEglobal
    public JsonObject responseToJson() {
        char c10;
        char c11;
        char c12;
        String strReplaceAll;
        char c13;
        char c14;
        char c15;
        int i10;
        int i11;
        String str;
        short sShortValue;
        JsonObject jsonObject = this.retorno;
        if (jsonObject != null) {
            return jsonObject;
        }
        this.retorno = new JsonObject();
        if (this.code.equalsIgnoreCase(CommandConstants.COMMAND_C51)) {
            C51Response c51Response_parserC51Response = _parserC51Response();
            String serial = c51Response_parserC51Response.getSerial();
            String status = c51Response_parserC51Response.getStatus();
            serial.contentEquals("Error Serial");
            status.contentEquals("99");
            if (serial.contentEquals("Error Serial") && status.contentEquals("99")) {
                this.retorno.addProperty("status", c51Response_parserC51Response.getStatus());
                this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
            } else {
                this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                this.retorno.addProperty("res_proc", c51Response_parserC51Response.getStatus());
                this.retorno.addProperty(GoogleTapAndPay.KEY_PAN, c51Response_parserC51Response.getPan().replace("2a", ProxyConfig.MATCH_ALL_SCHEMES));
                this.retorno.addProperty("cardholder", c51Response_parserC51Response.getCardholder());
                this.retorno.addProperty("cardbin", c51Response_parserC51Response.getCardBin());
                this.retorno.addProperty("track3", c51Response_parserC51Response.getTrackIII());
                this.retorno.addProperty(EglobalUtils.TRACK2, c51Response_parserC51Response.getTrackII());
                this.retorno.addProperty("track1", c51Response_parserC51Response.getTrackI());
                this.retorno.addProperty("ccv", c51Response_parserC51Response.getCvv());
                this.retorno.addProperty("read_mode", c51Response_parserC51Response.getReadMode());
                this.retorno.addProperty("pinstatus", c51Response_parserC51Response.getPinStatus());
                this.retorno.addProperty("e1", c51Response_parserC51Response.getE1());
                this.retorno.addProperty("e2", c51Response_parserC51Response.getE2());
                this.retorno.addProperty("serial", c51Response_parserC51Response.getSerial());
                this.retorno.addProperty("version", c51Response_parserC51Response.getVersion());
                this.retorno.addProperty("modelo", c51Response_parserC51Response.getModel());
                this.retorno.addProperty("tokenES", c51Response_parserC51Response.getTokenES());
                this.retorno.addProperty("tokenR1", c51Response_parserC51Response.getTokenR1());
                this.retorno.addProperty("tokenEZ", c51Response_parserC51Response.getTokenEZ());
                this.retorno.addProperty("tokenEY", c51Response_parserC51Response.getTokenEY());
                String tokenCZ = c51Response_parserC51Response.getTokenCZ();
                if (tokenCZ != null) {
                    this.retorno.addProperty("tokenCZ", tokenCZ);
                }
                String tokenEZ2 = c51Response_parserC51Response.getTokenEZ2();
                if (tokenEZ2 != null) {
                    this.retorno.addProperty("tokenEZ2", tokenEZ2);
                }
                String tokenEY2 = c51Response_parserC51Response.getTokenEY2();
                if (tokenEY2 != null) {
                    this.retorno.addProperty("tokenEY2", tokenEY2);
                }
                String keyStatus = c51Response_parserC51Response.getKeyStatus();
                if (keyStatus != null) {
                    this.retorno.addProperty("keyStatus", keyStatus);
                }
            }
        } else {
            int i12 = 1;
            if (this.code.equalsIgnoreCase(CommandConstants.COMMAND_Q8)) {
                this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                String[] strArr_parserQ8Response = _parserQ8Response();
                this.retorno.addProperty("batery_check", strArr_parserQ8Response[0]);
                this.retorno.addProperty("app_ver", strArr_parserQ8Response[1]);
                this.retorno.addProperty("serial", strArr_parserQ8Response[2]);
                this.retorno.addProperty("modelo", strArr_parserQ8Response[3]);
            } else if (this.code.equalsIgnoreCase(CommandConstants.COMMAND_C25)) {
                String[] strArr_parserC25Response = _parserC25Response();
                this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                this.retorno.addProperty("status", strArr_parserC25Response[0]);
            } else if (this.code.equalsIgnoreCase(CommandConstants.COMMAND_C54)) {
                this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                String[] strArr_parserC54Response = _parserC54Response();
                this.retorno.addProperty("status", strArr_parserC54Response[0]);
                this.retorno.addProperty("E2", strArr_parserC54Response[1]);
            } else {
                String str2 = "";
                if (this.code.equalsIgnoreCase("C55")) {
                    this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                    String[] strArr = new String[7];
                    for (int i13 = 0; i13 < 7; i13++) {
                        strArr[i13] = "TODO";
                    }
                    try {
                        new ArrayList();
                        ArrayList<Short> arrayList = this.list;
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
                        if (arrayList.get(0).shortValue() == 193) {
                            short sShortValue2 = arrayList.get(1).shortValue();
                            arrayList.remove(0);
                            arrayList.remove(0);
                            String strConcat = "";
                            int i14 = 0;
                            while (i14 < sShortValue2) {
                                Object[] objArr = new Object[i12];
                                objArr[0] = Integer.valueOf(arrayList.get(i14).shortValue());
                                strConcat = strConcat.concat(String.format("%02X", objArr));
                                i14++;
                                i12 = 1;
                            }
                            String str3 = strConcat;
                            for (int i15 = 0; i15 < sShortValue2; i15++) {
                                arrayList.remove(0);
                            }
                            strArr[1] = str3;
                            i11 = 0;
                            i10 = 1;
                        } else {
                            i10 = 1;
                            strArr[1] = "Error PAN";
                            i11 = 0;
                        }
                        if (arrayList.get(i11).shortValue() == 193) {
                            short sShortValue3 = arrayList.get(i10).shortValue();
                            arrayList.remove(0);
                            arrayList.remove(0);
                            String strConcat2 = "";
                            int i16 = 0;
                            while (i16 < sShortValue3) {
                                strConcat2 = strConcat2.concat(String.format("%02X", Integer.valueOf(arrayList.get(i16).shortValue())));
                                i16++;
                                str2 = str2;
                            }
                            str = str2;
                            for (int i17 = 0; i17 < sShortValue3; i17++) {
                                arrayList.remove(0);
                            }
                            strArr[2] = strConcat2;
                        } else {
                            str = "";
                            strArr[2] = "Error PinBlock";
                        }
                        if (arrayList.get(0).shortValue() == 193) {
                            short sShortValue4 = arrayList.get(1).shortValue();
                            arrayList.remove(0);
                            arrayList.remove(0);
                            String strConcat3 = str;
                            for (int i18 = 0; i18 < sShortValue4; i18++) {
                                strConcat3 = strConcat3.concat(String.format("%02X", Integer.valueOf(arrayList.get(i18).shortValue())));
                            }
                            for (int i19 = 0; i19 < sShortValue4; i19++) {
                                arrayList.remove(0);
                            }
                            strArr[3] = strConcat3;
                        } else {
                            strArr[3] = "Error KSN";
                        }
                        if (arrayList.get(0).shortValue() == 193) {
                            short sShortValue5 = arrayList.get(1).shortValue();
                            arrayList.remove(0);
                            arrayList.remove(0);
                            String strConcat4 = str;
                            for (int i20 = 0; i20 < sShortValue5; i20++) {
                                strConcat4 = strConcat4.concat(String.format("%c", Integer.valueOf(arrayList.get(i20).shortValue())));
                            }
                            for (int i21 = 0; i21 < sShortValue5; i21++) {
                                arrayList.remove(0);
                            }
                            strArr[4] = strConcat4;
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
                            String[] strArr_parserTokenEs = _parserTokenEs(strConcat5.replaceAll("\\s+", " "));
                            strArr[5] = strArr_parserTokenEs[0];
                            strArr[6] = strArr_parserTokenEs[1];
                        } else {
                            strArr[5] = "Error ES";
                            strArr[6] = "Error ES";
                        }
                    } catch (Exception e5) {
                        System.out.println(" (C55) Exception : " + e5.getLocalizedMessage());
                    }
                    this.retorno.addProperty("status", strArr[0]);
                    this.retorno.addProperty(GoogleTapAndPay.KEY_PAN, strArr[1]);
                    this.retorno.addProperty("pinblock", strArr[2]);
                    this.retorno.addProperty("ksn", strArr[3]);
                    this.retorno.addProperty("cardtype", strArr[4]);
                    this.retorno.addProperty("version", strArr[5]);
                    this.retorno.addProperty("serial", strArr[6]);
                } else if (this.code.equalsIgnoreCase("Q9")) {
                    this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                    String[] strArr2 = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
                    try {
                        new ArrayList();
                        ArrayList<Short> arrayList2 = this.list;
                        arrayList2.remove(0);
                        arrayList2.remove(0);
                        arrayList2.remove(0);
                        strArr2[0] = "".concat(String.format("%c", Integer.valueOf(arrayList2.get(0).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList2.get(1).shortValue())));
                        arrayList2.remove(0);
                        arrayList2.remove(0);
                        strArr2[1] = String.format("%c", Integer.valueOf(arrayList2.get(0).shortValue()));
                        c14 = 0;
                        c15 = 1;
                    } catch (Exception unused) {
                        c14 = 0;
                        strArr2[0] = "Error parserQ9Response()";
                        c15 = 1;
                        strArr2[1] = "Error parserQ9Response()";
                    }
                    this.retorno.addProperty("status", strArr2[c14]);
                    this.retorno.addProperty("key", strArr2[c15]);
                } else if (this.code.equalsIgnoreCase("z12")) {
                    this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                    String[] strArr3 = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
                    try {
                        new ArrayList();
                        ArrayList<Short> arrayList3 = this.list;
                        arrayList3.remove(0);
                        arrayList3.remove(0);
                        arrayList3.remove(0);
                        arrayList3.remove(0);
                        arrayList3.remove(0);
                        strArr3[0] = "".concat(String.format("%c", Integer.valueOf(arrayList3.get(0).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList3.get(1).shortValue())));
                        c13 = 0;
                    } catch (Exception unused2) {
                        c13 = 0;
                        strArr3[0] = "Error parserZ12 Response()";
                        strArr3[1] = "Error parserZ12 Response()";
                    }
                    this.retorno.addProperty("status", strArr3[c13]);
                } else if (this.code.equalsIgnoreCase("z14")) {
                    this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                    String str4 = this.strResponse;
                    this.retorno.addProperty("status", str4.substring(str4.indexOf(CommandConstants.COMMAND_Z14)).substring(3, 5));
                } else if (this.code.equalsIgnoreCase("z13")) {
                    this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                    String str5 = "Error Status";
                    String strReplaceAll2 = "Error Hash RSA";
                    try {
                        String[] status2 = getStatus(CommandConstants.COMMAND_Z13, this.strResponse);
                        str5 = status2[1];
                        String[] separadorLongitudData = getSeparadorLongitudData(status2[0]);
                        strReplaceAll2 = Utils.stringToHexadecimalString(separadorLongitudData[1]).replaceAll(" ", "");
                        strReplaceAll = Utils.stringToHexadecimalString(getSeparadorLongitudData(separadorLongitudData[0])[1]).replaceAll(" ", "");
                    } catch (Exception e7) {
                        Logs.write(e7.getMessage());
                        strReplaceAll = "Error Key WorkingKCV";
                    }
                    ResponseZ13 responseZ13 = new ResponseZ13(str5, strReplaceAll2, strReplaceAll);
                    this.retorno.addProperty("status", ResponseZ13.status);
                    String str6 = PinPadSdk.keyName;
                    str6.getClass();
                    if (str6.equals("OPENPRIVAD") || str6.equals(CommandConstants.C51_KEY_NAME1)) {
                        this.retorno.addProperty("hashrsapub", responseZ13.f67564a);
                        this.retorno.addProperty("hashrsapri", responseZ13.f67565b);
                    } else {
                        this.retorno.addProperty("hash_rsa", responseZ13.f67564a);
                        this.retorno.addProperty("working_kcv", responseZ13.f67565b);
                    }
                } else if (this.code.equalsIgnoreCase("C56")) {
                    this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                    String[] strArrA = a();
                    this.retorno.addProperty("status", strArrA[0]);
                    this.retorno.addProperty(GoogleTapAndPay.KEY_PAN, strArrA[1]);
                    this.retorno.addProperty("actual_pinblock", strArrA[2]);
                    this.retorno.addProperty("actual_ksn", strArrA[3]);
                    this.retorno.addProperty("new_pinblock", strArrA[4]);
                    this.retorno.addProperty("new_ksn", strArrA[5]);
                    this.retorno.addProperty("renew_pinblock", strArrA[6]);
                    this.retorno.addProperty("renew_ksn", strArrA[7]);
                    this.retorno.addProperty("read_mod", strArrA[8]);
                    this.retorno.addProperty("app_ver", strArrA[9]);
                    this.retorno.addProperty("serial", strArrA[10]);
                } else if (this.code.equalsIgnoreCase("z10")) {
                    this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                    String[] strArr_parserZ10Response = _parserZ10Response();
                    this.retorno.addProperty("status", strArr_parserZ10Response[0]);
                    this.retorno.addProperty("tokenew", strArr_parserZ10Response[1]);
                    this.retorno.addProperty("tokenes", strArr_parserZ10Response[2]);
                    this.retorno.addProperty("app_ver", strArr_parserZ10Response[3]);
                    this.retorno.addProperty("serial", strArr_parserZ10Response[4]);
                } else if (this.code.equalsIgnoreCase("z11")) {
                    this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                    this.retorno.addProperty("status", _parserZ11Response()[0]);
                } else if (this.code.equalsIgnoreCase("C50")) {
                    this.retorno.addProperty(IMAPStore.ID_COMMAND, this.code);
                    String[] strArr4 = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
                    try {
                        new ArrayList();
                        ArrayList<Short> arrayList4 = this.list;
                        arrayList4.remove(0);
                        arrayList4.remove(0);
                        arrayList4.remove(0);
                        arrayList4.remove(0);
                        arrayList4.remove(0);
                        strArr4[0] = "".concat(String.format("%c", Integer.valueOf(arrayList4.get(0).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList4.get(1).shortValue())));
                        arrayList4.remove(0);
                        arrayList4.remove(0);
                        "".concat(String.format("%c", Integer.valueOf(arrayList4.get(0).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList4.get(1).shortValue())));
                        arrayList4.remove(0);
                        arrayList4.remove(0);
                        String strDisassemblySeparatorLengthValue = disassemblySeparatorLengthValue(arrayList4, (short) 193);
                        strArr4[1] = strDisassemblySeparatorLengthValue;
                        strArr4[2] = disassemblySeparatorLengthValue(arrayListRemoveFirstNElements(arrayList4, (strDisassemblySeparatorLengthValue.length() / 2) + 2), (short) 193);
                        c10 = 0;
                        c11 = 1;
                        c12 = 2;
                    } catch (Exception unused3) {
                        c10 = 0;
                        strArr4[0] = "Error parserC50 Response()";
                        c11 = 1;
                        strArr4[1] = "Error parserC50 Response()";
                        c12 = 2;
                        strArr4[2] = "Error parserC50 Response()";
                    }
                    this.retorno.addProperty("status", strArr4[c10]);
                    this.retorno.addProperty("bin", strArr4[c11]);
                    this.retorno.addProperty("span_route_number", strArr4[c12]);
                }
            }
        }
        return this.retorno;
    }
}
