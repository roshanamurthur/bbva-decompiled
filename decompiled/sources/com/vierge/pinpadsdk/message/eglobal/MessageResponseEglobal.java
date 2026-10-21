package com.vierge.pinpadsdk.message.eglobal;

import com.bbva.glomoconfig.constants.CountryRouteConstants;
import com.bbva.google.pay.GoogleTapAndPay;
import com.google.gson.JsonObject;
import com.vierge.pinpadsdk.message.base.MessageResponseBase;
import com.vierge.pinpadsdk.message.base.SeparatorLengthValue;
import com.vierge.pinpadsdk.message.base.SeparatorLengthValueDecoder;
import com.vierge.pinpadsdk.message.openpay.C51Response;
import com.vierge.pinpadsdk.tokens.TokenDisassemble;
import com.vierge.pinpadsdk.utils.Categories;
import com.vierge.pinpadsdk.utils.Logs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import mx.openpay.library.data.util.CommandConstants;
import mx.openpay.library.data.util.EglobalUtils;

/* JADX INFO: loaded from: classes6.dex */
public class MessageResponseEglobal extends MessageResponseBase {
    public String[] _parserC25Response() {
        return new String[]{String.format("%c%c", this.list.get(4), this.list.get(5))};
    }

    public C51Response _parserC51Response() {
        short sShortValue;
        short sShortValue2;
        String str = this.strResponse;
        str.substring(0, str.length() - 1).replaceAll("\\s+", " ");
        new ArrayList();
        Logs.write(" ", this.list, Categories.communication);
        ArrayList<Short> arrayListArrayListRemoveFirstNElements = arrayListRemoveFirstNElements(this.list, 4);
        C51Response c51Response = new C51Response();
        c51Response.setStatus(String.format("%c", Integer.valueOf(arrayListArrayListRemoveFirstNElements.get(0).shortValue())).concat(String.format("%c", Integer.valueOf(arrayListArrayListRemoveFirstNElements.get(1).shortValue()))));
        c51Response.getStatus();
        SeparatorLengthValueDecoder separatorLengthValueDecoder = new SeparatorLengthValueDecoder(arrayListRemoveFirstNElements(arrayListArrayListRemoveFirstNElements, 4));
        try {
            ArrayList<SeparatorLengthValue> slv = separatorLengthValueDecoder.getSLV();
            if (slv.size() == 11) {
                new ArrayList();
                try {
                    if (slv.size() > 0) {
                        c51Response.setPan(slv.get(0), "%02x");
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
                try {
                    if (slv.size() > 1) {
                        c51Response.setCardholder(slv.get(1), "%c");
                    }
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                try {
                    if (slv.size() > 2) {
                        c51Response.setCardBin(slv.get(2), "%02x");
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                try {
                    if (slv.size() > 3) {
                        c51Response.setTrackIII(slv.get(3), "%c");
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                try {
                    if (slv.size() > 4) {
                        c51Response.setTrackII(slv.get(4), "%c");
                    }
                } catch (Exception e12) {
                    e12.printStackTrace();
                }
                try {
                    if (slv.size() > 5) {
                        c51Response.setTrackI(slv.get(5), "%c");
                    }
                } catch (Exception e13) {
                    e13.printStackTrace();
                }
                try {
                    if (slv.size() > 6) {
                        c51Response.setCVV(slv.get(6), "%c");
                    }
                } catch (Exception e14) {
                    e14.printStackTrace();
                }
                try {
                    if (slv.size() > 7) {
                        c51Response.setReadMode(slv.get(7), "%c");
                    }
                } catch (Exception e15) {
                    e15.printStackTrace();
                }
                try {
                    if (slv.size() > 8) {
                        c51Response.setPinStatus(slv.get(8), "%02x");
                    }
                } catch (Exception e16) {
                    e16.printStackTrace();
                }
                c51Response.setKeyStatus("");
                try {
                    if (slv.size() > 9) {
                        c51Response.setE1(slv.get(9), "%02x");
                    }
                } catch (Exception e17) {
                    e17.printStackTrace();
                }
                try {
                    if (slv.size() > 10) {
                        c51Response.setE2(slv.get(10), "%02x");
                    }
                } catch (Exception e18) {
                    e18.printStackTrace();
                }
                ArrayList<Short> recoveredOjects = separatorLengthValueDecoder.getRecoveredOjects();
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < recoveredOjects.size(); i10++) {
                    arrayList.add(recoveredOjects.get(i10));
                }
                recoveredOjects.remove(0);
                if (recoveredOjects.get(0).shortValue() == 32) {
                    recoveredOjects.remove(0);
                    String strConcat = "ES ";
                    for (Iterator<Short> it = recoveredOjects.iterator(); it.hasNext() && (sShortValue2 = it.next().shortValue()) != 3; it = it) {
                        strConcat = strConcat.concat(String.format("%c", Integer.valueOf(sShortValue2)));
                    }
                    String[] strArr_parserTokenEs = _parserTokenEs(strConcat.replaceAll("\\s+", " "));
                    c51Response.setVersion(strArr_parserTokenEs[0]);
                    c51Response.setSerial(strArr_parserTokenEs[1]);
                    c51Response.setModel(strArr_parserTokenEs[2]);
                }
                HashMap map = new HashMap();
                TokenDisassemble.getTokenFromMessage(arrayList, map);
                if (map.containsKey("ES")) {
                    c51Response.setTokenES((String) map.get("ES"));
                }
                if (map.containsKey("R1")) {
                    c51Response.setTokenR1((String) map.get("R1"));
                }
                if (map.containsKey("EZ")) {
                    c51Response.setTokenEZ((String) map.get("EZ"));
                }
                if (map.containsKey("EY")) {
                    c51Response.setTokenEY((String) map.get("EY"));
                }
                if (map.containsKey("CZ")) {
                    c51Response.setTokenCZ((String) map.get("CZ"));
                }
                c51Response.setTokenEZ2("");
                c51Response.setTokenEY2("");
                return c51Response;
            }
            try {
                if (slv.size() > 0) {
                    c51Response.setPan(slv.get(0), "%02x");
                }
            } catch (Exception e19) {
                e19.printStackTrace();
            }
            try {
                if (slv.size() > 1) {
                    c51Response.setCardholder(slv.get(1), "%c");
                }
            } catch (Exception e20) {
                e20.printStackTrace();
            }
            try {
                if (slv.size() > 2) {
                    c51Response.setCardBin(slv.get(2), "%02x");
                }
            } catch (Exception e21) {
                e21.printStackTrace();
            }
            try {
                if (slv.size() > 3) {
                    c51Response.setTrackIII(slv.get(3), "%c");
                }
            } catch (Exception e22) {
                e22.printStackTrace();
            }
            try {
                if (slv.size() > 4) {
                    c51Response.setTrackII(slv.get(4), "%c");
                }
            } catch (Exception e23) {
                e23.printStackTrace();
            }
            try {
                if (slv.size() > 5) {
                    c51Response.setTrackI(slv.get(5), "%c");
                }
            } catch (Exception e24) {
                e24.printStackTrace();
            }
            try {
                if (slv.size() > 6) {
                    c51Response.setCVV(slv.get(6), "%c");
                }
            } catch (Exception e25) {
                e25.printStackTrace();
            }
            try {
                if (slv.size() > 7) {
                    c51Response.setReadMode(slv.get(7), "%c");
                }
            } catch (Exception e26) {
                e26.printStackTrace();
            }
            try {
                if (slv.size() > 8) {
                    c51Response.setPinStatus(slv.get(8), "%02x");
                }
            } catch (Exception e27) {
                e27.printStackTrace();
            }
            try {
                if (slv.size() > 9) {
                    c51Response.setKeyStatus(slv.get(9), "%c");
                }
            } catch (Exception e28) {
                e28.printStackTrace();
            }
            try {
                if (slv.size() > 10) {
                    c51Response.setE1(slv.get(10), "%02x");
                }
            } catch (Exception e29) {
                e29.printStackTrace();
            }
            try {
                if (slv.size() > 11) {
                    c51Response.setE2(slv.get(11), "%02x");
                }
            } catch (Exception e30) {
                e30.printStackTrace();
            }
            ArrayList<Short> recoveredOjects2 = separatorLengthValueDecoder.getRecoveredOjects();
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < recoveredOjects2.size(); i11++) {
                arrayList2.add(recoveredOjects2.get(i11));
            }
            recoveredOjects2.remove(0);
            if (recoveredOjects2.get(0).shortValue() == 32) {
                recoveredOjects2.remove(0);
                Iterator<Short> it2 = recoveredOjects2.iterator();
                String strConcat2 = "ES ";
                while (it2.hasNext() && (sShortValue = it2.next().shortValue()) != 3) {
                    strConcat2 = strConcat2.concat(String.format("%c", Integer.valueOf(sShortValue)));
                }
                String[] strArr_parserTokenEs2 = _parserTokenEs(strConcat2.replaceAll("\\s+", " "));
                c51Response.setVersion(strArr_parserTokenEs2[0]);
                c51Response.setSerial(strArr_parserTokenEs2[1]);
                c51Response.setModel(strArr_parserTokenEs2[2]);
            }
            HashMap map2 = new HashMap();
            TokenDisassemble.getTokenFromMessage(arrayList2, map2);
            if (map2.containsKey("ES")) {
                c51Response.setTokenES((String) map2.get("ES"));
            }
            if (map2.containsKey("R1")) {
                c51Response.setTokenR1((String) map2.get("R1"));
            }
            if (map2.containsKey("EZ")) {
                c51Response.setTokenEZ((String) map2.get("EZ"));
            }
            if (map2.containsKey("EY")) {
                c51Response.setTokenEY((String) map2.get("EY"));
            }
            if (map2.containsKey("EZ2")) {
                c51Response.setTokenEZ2((String) map2.get("EZ2"));
            }
            if (map2.containsKey("EY2")) {
                c51Response.setTokenEY2((String) map2.get("EY2"));
            }
            if (map2.containsKey("CZ")) {
                c51Response.setTokenCZ((String) map2.get("CZ"));
            }
            return c51Response;
        } catch (Exception e31) {
            e31.printStackTrace();
            return c51Response;
        }
    }

    public String[] _parserC54Response() {
        String[] strArr = new String[2];
        strArr[0] = CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN;
        new ArrayList();
        ArrayList<Short> arrayList = this.list;
        arrayList.remove(0);
        arrayList.remove(0);
        if (arrayList.get(0).shortValue() == 67) {
            strArr[0] = "".concat(String.format("%c", Integer.valueOf(arrayList.get(3).shortValue()))).concat(String.format("%c", Integer.valueOf(arrayList.get(4).shortValue())));
        } else {
            strArr[0] = "Error status";
        }
        for (int i10 = 0; i10 < 7; i10++) {
            arrayList.remove(0);
        }
        strArr[1] = disassemblySeparatorLengthValue(arrayList, (short) 226);
        return strArr;
    }

    public String[] _parserQ8Response() {
        String[] strArr = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN, CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
        try {
            String str = this.strResponse;
            String[] strArr_parserTokenEs = _parserTokenEs(str.substring(0, str.length() - 1).replaceAll("\\s+", " ").replace("<ACK>", "").replace("<STX>", "").replace("<ETX>", ""));
            strArr[0] = strArr_parserTokenEs[0];
            strArr[1] = strArr_parserTokenEs[1];
            strArr[2] = strArr_parserTokenEs[2];
        } catch (Exception e5) {
            strArr[0] = "Exception parserQ8Response() " + e5.getLocalizedMessage();
            strArr[1] = "Exception parserQ8Response() " + e5.getLocalizedMessage();
            strArr[2] = "Exception parserQ8Response() " + e5.getLocalizedMessage();
        }
        return strArr;
    }

    public String[] _parserZ10Response() {
        String[] strArr = new String[5];
        for (int i10 = 0; i10 < 5; i10++) {
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
            strArr[1] = _getTokenEW();
            String str_getTokenES = _getTokenES();
            strArr[2] = str_getTokenES;
            if (str_getTokenES.equalsIgnoreCase(CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN)) {
                strArr[3] = "Error ES";
                strArr[4] = "Error ES";
            } else {
                String[] strArr_parserTokenEsZ10 = _parserTokenEsZ10(str_getTokenES.replaceAll("\\s+", " "));
                strArr[3] = strArr_parserTokenEsZ10[0];
                strArr[4] = strArr_parserTokenEsZ10[1];
            }
        } catch (Exception e5) {
            System.out.println(" (Z10) Exception : " + e5.getLocalizedMessage());
        }
        return strArr;
    }

    public String[] _parserZ11Response() {
        String[] strArr = {CountryRouteConstants.ROUTE_MENU_SOFT_TOKEN};
        try {
            new ArrayList();
            ArrayList<Short> arrayList = this.list;
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

    public JsonObject responseToJson() {
        JsonObject jsonObject = this.retorno;
        if (jsonObject != null) {
            return jsonObject;
        }
        this.retorno = new JsonObject();
        if (this.code.equalsIgnoreCase(CommandConstants.COMMAND_C51)) {
            C51Response c51Response_parserC51Response = _parserC51Response();
            this.retorno.addProperty("res_proc", c51Response_parserC51Response.getStatus());
            this.retorno.addProperty(GoogleTapAndPay.KEY_PAN, c51Response_parserC51Response.getPan());
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
        } else if (this.code.equalsIgnoreCase(CommandConstants.COMMAND_Q8)) {
            String[] strArr_parserQ8Response = _parserQ8Response();
            this.retorno.addProperty("app_ver", strArr_parserQ8Response[0]);
            this.retorno.addProperty("serial", strArr_parserQ8Response[1]);
            this.retorno.addProperty("modelo", strArr_parserQ8Response[2]);
        } else if (this.code.equalsIgnoreCase(CommandConstants.COMMAND_C25)) {
            this.retorno.addProperty("status", _parserC25Response()[0]);
        } else if (this.code.equalsIgnoreCase(CommandConstants.COMMAND_C54)) {
            String[] strArr_parserC54Response = _parserC54Response();
            this.retorno.addProperty("status", strArr_parserC54Response[0]);
            this.retorno.addProperty("E2", strArr_parserC54Response[1]);
        } else if (this.code.equalsIgnoreCase("z10")) {
            String[] strArr_parserZ10Response = _parserZ10Response();
            this.retorno.addProperty("status", strArr_parserZ10Response[0]);
            this.retorno.addProperty("tokenew", strArr_parserZ10Response[1]);
            this.retorno.addProperty("tokenes", strArr_parserZ10Response[2]);
            this.retorno.addProperty("app_ver", strArr_parserZ10Response[3]);
            this.retorno.addProperty("serial", strArr_parserZ10Response[4]);
        } else if (this.code.equalsIgnoreCase("z11")) {
            this.retorno.addProperty("status", _parserZ11Response()[0]);
        }
        return this.retorno;
    }
}
