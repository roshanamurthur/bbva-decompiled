package com.google.zxing.client.result;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public final class ExpandedProductResultParser extends ResultParser {
    public static String c(int i10, String str) {
        if (str.charAt(i10) != '(') {
            return null;
        }
        String strSubstring = str.substring(i10 + 1);
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < strSubstring.length(); i11++) {
            char cCharAt = strSubstring.charAt(i11);
            if (cCharAt == ')') {
                return sb2.toString();
            }
            if (cCharAt < '0' || cCharAt > '9') {
                return null;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    @Override // com.google.zxing.client.result.ResultParser
    public ExpandedProductParsedResult parse(Result result) {
        String str;
        ExpandedProductParsedResult expandedProductParsedResult;
        String str2;
        ExpandedProductParsedResult expandedProductParsedResult2;
        ExpandedProductParsedResult expandedProductParsedResult3 = null;
        if (result.getBarcodeFormat() != BarcodeFormat.RSS_EXPANDED) {
            return null;
        }
        String massagedText = ResultParser.getMassagedText(result);
        HashMap map = new HashMap();
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String strSubstring = null;
        String strSubstring2 = null;
        String strSubstring3 = null;
        String strSubstring4 = null;
        int length = 0;
        while (length < massagedText.length()) {
            String strC = c(length, massagedText);
            if (strC == null) {
                return expandedProductParsedResult3;
            }
            byte b10 = 2;
            int length2 = strC.length() + 2 + length;
            StringBuilder sb2 = new StringBuilder();
            String str12 = strSubstring2;
            String strSubstring5 = massagedText.substring(length2);
            String str13 = str11;
            String str14 = strSubstring;
            int i10 = 0;
            while (true) {
                if (i10 < strSubstring5.length()) {
                    char cCharAt = strSubstring5.charAt(i10);
                    str = str10;
                    if (cCharAt != '(') {
                        sb2.append(cCharAt);
                    } else if (c(i10, strSubstring5) == null) {
                        sb2.append(RootService.OPEN_BRACKET);
                    }
                    i10++;
                    str10 = str;
                } else {
                    str = str10;
                }
            }
            String string = sb2.toString();
            length = length2 + string.length();
            switch (strC.hashCode()) {
                case 1536:
                    b10 = !strC.equals("00") ? (byte) -1 : (byte) 0;
                    break;
                case 1537:
                    b10 = !strC.equals("01") ? (byte) -1 : (byte) 1;
                    break;
                case 1567:
                    if (!strC.equals("10")) {
                        b10 = -1;
                    }
                    break;
                case 1568:
                    b10 = !strC.equals("11") ? (byte) -1 : (byte) 3;
                    break;
                case 1570:
                    b10 = !strC.equals("13") ? (byte) -1 : (byte) 4;
                    break;
                case 1572:
                    b10 = !strC.equals("15") ? (byte) -1 : (byte) 5;
                    break;
                case 1574:
                    b10 = !strC.equals("17") ? (byte) -1 : (byte) 6;
                    break;
                case 1567966:
                    b10 = !strC.equals("3100") ? (byte) -1 : (byte) 7;
                    break;
                case 1567967:
                    b10 = !strC.equals("3101") ? (byte) -1 : (byte) 8;
                    break;
                case 1567968:
                    b10 = !strC.equals("3102") ? (byte) -1 : (byte) 9;
                    break;
                case 1567969:
                    b10 = !strC.equals("3103") ? (byte) -1 : (byte) 10;
                    break;
                case 1567970:
                    b10 = !strC.equals("3104") ? (byte) -1 : (byte) 11;
                    break;
                case 1567971:
                    b10 = !strC.equals("3105") ? (byte) -1 : (byte) 12;
                    break;
                case 1567972:
                    b10 = !strC.equals("3106") ? (byte) -1 : (byte) 13;
                    break;
                case 1567973:
                    b10 = !strC.equals("3107") ? (byte) -1 : Constants.CVR_B1b41_1110_ONLINE_PIN;
                    break;
                case 1567974:
                    b10 = !strC.equals("3108") ? (byte) -1 : (byte) 15;
                    break;
                case 1567975:
                    b10 = !strC.equals("3109") ? (byte) -1 : (byte) 16;
                    break;
                case 1568927:
                    b10 = !strC.equals("3200") ? (byte) -1 : (byte) 17;
                    break;
                case 1568928:
                    b10 = !strC.equals("3201") ? (byte) -1 : MessageUtils.MESSAGE_18_DC2;
                    break;
                case 1568929:
                    b10 = !strC.equals("3202") ? (byte) -1 : (byte) 19;
                    break;
                case 1568930:
                    b10 = !strC.equals("3203") ? (byte) -1 : (byte) 20;
                    break;
                case 1568931:
                    b10 = !strC.equals("3204") ? (byte) -1 : MessageUtils.MESSAGE_21_NAK;
                    break;
                case 1568932:
                    b10 = !strC.equals("3205") ? (byte) -1 : (byte) 22;
                    break;
                case 1568933:
                    b10 = !strC.equals("3206") ? (byte) -1 : (byte) 23;
                    break;
                case 1568934:
                    b10 = !strC.equals("3207") ? (byte) -1 : (byte) 24;
                    break;
                case 1568935:
                    b10 = !strC.equals("3208") ? (byte) -1 : (byte) 25;
                    break;
                case 1568936:
                    b10 = !strC.equals("3209") ? (byte) -1 : MessageUtils.MESSAGE_26_SUB;
                    break;
                case 1575716:
                    b10 = !strC.equals("3920") ? (byte) -1 : (byte) 27;
                    break;
                case 1575717:
                    b10 = !strC.equals("3921") ? (byte) -1 : (byte) 28;
                    break;
                case 1575718:
                    b10 = !strC.equals("3922") ? (byte) -1 : (byte) 29;
                    break;
                case 1575719:
                    b10 = !strC.equals("3923") ? (byte) -1 : MessageUtils.MESSAGE_30_RS;
                    break;
                case 1575747:
                    b10 = !strC.equals("3930") ? (byte) -1 : (byte) 31;
                    break;
                case 1575748:
                    b10 = !strC.equals("3931") ? (byte) -1 : (byte) 32;
                    break;
                case 1575749:
                    b10 = !strC.equals("3932") ? (byte) -1 : (byte) 33;
                    break;
                case 1575750:
                    b10 = !strC.equals("3933") ? (byte) -1 : (byte) 34;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                    str4 = string;
                    strSubstring2 = str12;
                    strSubstring = str14;
                    str11 = str13;
                    str10 = str;
                    expandedProductParsedResult3 = null;
                    break;
                case 1:
                    str3 = string;
                    strSubstring2 = str12;
                    strSubstring = str14;
                    str11 = str13;
                    str10 = str;
                    expandedProductParsedResult3 = null;
                    break;
                case 2:
                    str5 = string;
                    strSubstring2 = str12;
                    strSubstring = str14;
                    str11 = str13;
                    str10 = str;
                    expandedProductParsedResult3 = null;
                    break;
                case 3:
                    str6 = string;
                    strSubstring2 = str12;
                    strSubstring = str14;
                    str11 = str13;
                    str10 = str;
                    expandedProductParsedResult3 = null;
                    break;
                case 4:
                    str7 = string;
                    strSubstring2 = str12;
                    strSubstring = str14;
                    str11 = str13;
                    str10 = str;
                    expandedProductParsedResult3 = null;
                    break;
                case 5:
                    str8 = string;
                    strSubstring2 = str12;
                    strSubstring = str14;
                    str11 = str13;
                    str10 = str;
                    expandedProductParsedResult3 = null;
                    break;
                case 6:
                    str9 = string;
                    strSubstring2 = str12;
                    strSubstring = str14;
                    str11 = str13;
                    str10 = str;
                    expandedProductParsedResult3 = null;
                    break;
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    expandedProductParsedResult = null;
                    strSubstring = strC.substring(3);
                    str2 = ExpandedProductParsedResult.KILOGRAM;
                    str11 = str2;
                    strSubstring2 = str12;
                    ExpandedProductParsedResult expandedProductParsedResult4 = expandedProductParsedResult;
                    str10 = string;
                    expandedProductParsedResult3 = expandedProductParsedResult4;
                    break;
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    expandedProductParsedResult = null;
                    strSubstring = strC.substring(3);
                    str2 = ExpandedProductParsedResult.POUND;
                    str11 = str2;
                    strSubstring2 = str12;
                    ExpandedProductParsedResult expandedProductParsedResult5 = expandedProductParsedResult;
                    str10 = string;
                    expandedProductParsedResult3 = expandedProductParsedResult5;
                    break;
                case 27:
                case 28:
                case 29:
                case 30:
                    expandedProductParsedResult2 = null;
                    strSubstring3 = strC.substring(3);
                    strSubstring2 = string;
                    expandedProductParsedResult3 = expandedProductParsedResult2;
                    strSubstring = str14;
                    str11 = str13;
                    str10 = str;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    if (string.length() < 4) {
                        return null;
                    }
                    expandedProductParsedResult2 = null;
                    strSubstring2 = string.substring(3);
                    strSubstring4 = string.substring(0, 3);
                    strSubstring3 = strC.substring(3);
                    expandedProductParsedResult3 = expandedProductParsedResult2;
                    strSubstring = str14;
                    str11 = str13;
                    str10 = str;
                    break;
                default:
                    map.put(strC, string);
                    strSubstring2 = str12;
                    strSubstring = str14;
                    str11 = str13;
                    str10 = str;
                    expandedProductParsedResult3 = null;
                    break;
            }
        }
        return new ExpandedProductParsedResult(massagedText, str3, str4, str5, str6, str7, str8, str9, str10, str11, strSubstring, strSubstring2, strSubstring3, strSubstring4, map);
    }
}
