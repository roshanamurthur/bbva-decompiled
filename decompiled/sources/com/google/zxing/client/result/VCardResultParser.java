package com.google.zxing.client.result;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.tohu.android.product.valkyria.sdk.logic.ReplenishLogic;
import com.google.zxing.Result;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class VCardResultParser extends ResultParser {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f49778e = Pattern.compile("BEGIN:VCARD", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Pattern f49779f = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f49780g = Pattern.compile("\r\n[ \t]");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Pattern f49781h = Pattern.compile("\\\\[nN]");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Pattern f49782i = Pattern.compile("\\\\([,;\\\\])");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Pattern f49783j = Pattern.compile("=");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Pattern f49784k = Pattern.compile(ReplenishLogic.ID_SEPARATOR);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Pattern f49785l = Pattern.compile("(?<!\\\\);+");
    public static final Pattern m = Pattern.compile(",");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Pattern f49786n = Pattern.compile("[;,]");

    public static List c(String str, String str2, boolean z10, boolean z11) {
        ArrayList arrayListD = d(str, str2, z10, z11);
        if (arrayListD == null || arrayListD.isEmpty()) {
            return null;
        }
        return (List) arrayListD.get(0);
    }

    public static ArrayList d(String str, String str2, boolean z10, boolean z11) {
        ArrayList arrayList;
        int i10;
        String str3;
        String str4;
        char c10;
        int iIndexOf;
        String strReplaceAll;
        char cCharAt;
        String str5 = str2;
        int length = str2.length();
        int i11 = 0;
        int i12 = 0;
        ArrayList arrayList2 = null;
        while (i12 < length) {
            int i13 = 2;
            Matcher matcher = Pattern.compile("(?:^|\n)" + ((Object) str) + "(?:;([^:]*))?:", 2).matcher(str5);
            if (i12 > 0) {
                i12--;
            }
            if (!matcher.find(i12)) {
                break;
            }
            int iEnd = matcher.end(i11);
            String strGroup = matcher.group(1);
            if (strGroup != null) {
                String[] strArrSplit = f49784k.split(strGroup);
                int length2 = strArrSplit.length;
                int i14 = i11;
                i10 = i14;
                arrayList = null;
                str3 = null;
                str4 = null;
                while (i14 < length2) {
                    String str6 = strArrSplit[i14];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(str6);
                    String[] strArrSplit2 = f49783j.split(str6, i13);
                    if (strArrSplit2.length > 1) {
                        String str7 = strArrSplit2[0];
                        String str8 = strArrSplit2[1];
                        if ("ENCODING".equalsIgnoreCase(str7) && "QUOTED-PRINTABLE".equalsIgnoreCase(str8)) {
                            i10 = 1;
                        } else if ("CHARSET".equalsIgnoreCase(str7)) {
                            str3 = str8;
                        } else if ("VALUE".equalsIgnoreCase(str7)) {
                            str4 = str8;
                        }
                    }
                    i14++;
                    i13 = 2;
                }
            } else {
                arrayList = null;
                i10 = 0;
                str3 = null;
                str4 = null;
            }
            int i15 = iEnd;
            while (true) {
                c10 = '\n';
                iIndexOf = str5.indexOf(10, i15);
                if (iIndexOf < 0) {
                    break;
                }
                if (iIndexOf < str2.length() - 1) {
                    int i16 = iIndexOf + 1;
                    if (str5.charAt(i16) == ' ' || str5.charAt(i16) == '\t') {
                        i15 = iIndexOf + 2;
                    }
                }
                if (i10 == 0 || ((iIndexOf <= 0 || str5.charAt(iIndexOf - 1) != '=') && (iIndexOf < 2 || str5.charAt(iIndexOf - 2) != '='))) {
                    break;
                }
                i15 = iIndexOf + 1;
            }
            if (iIndexOf < 0) {
                i12 = length;
                i11 = 0;
            } else {
                if (iIndexOf <= iEnd) {
                    i11 = 0;
                } else {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                    }
                    if (iIndexOf > 0 && str5.charAt(iIndexOf - 1) == '\r') {
                        iIndexOf--;
                    }
                    String strSubstring = str5.substring(iEnd, iIndexOf);
                    if (z10) {
                        strSubstring = strSubstring.trim();
                    }
                    Pattern pattern = f49785l;
                    if (i10 != 0) {
                        int length3 = strSubstring.length();
                        StringBuilder sb2 = new StringBuilder(length3);
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int i17 = 0;
                        while (i17 < length3) {
                            char cCharAt2 = strSubstring.charAt(i17);
                            if (cCharAt2 != c10) {
                                if (cCharAt2 == '\r') {
                                    c10 = '\n';
                                } else {
                                    if (cCharAt2 != '=') {
                                        f(byteArrayOutputStream, str3, sb2);
                                        sb2.append(cCharAt2);
                                    } else if (i17 < length3 - 2 && (cCharAt = strSubstring.charAt(i17 + 1)) != '\r') {
                                        c10 = '\n';
                                        if (cCharAt != '\n') {
                                            i17 += 2;
                                            char cCharAt3 = strSubstring.charAt(i17);
                                            int hexDigit = ResultParser.parseHexDigit(cCharAt);
                                            int hexDigit2 = ResultParser.parseHexDigit(cCharAt3);
                                            if (hexDigit >= 0 && hexDigit2 >= 0) {
                                                byteArrayOutputStream.write((hexDigit << 4) + hexDigit2);
                                            }
                                        }
                                    }
                                    c10 = '\n';
                                }
                            }
                            i17++;
                        }
                        f(byteArrayOutputStream, str3, sb2);
                        strReplaceAll = sb2.toString();
                        if (z11) {
                            strReplaceAll = pattern.matcher(strReplaceAll).replaceAll(RootService.LINE_BREAK).trim();
                        }
                    } else {
                        if (z11) {
                            strSubstring = pattern.matcher(strSubstring).replaceAll(RootService.LINE_BREAK).trim();
                        }
                        strReplaceAll = f49782i.matcher(f49781h.matcher(f49780g.matcher(strSubstring).replaceAll("")).replaceAll(RootService.LINE_BREAK)).replaceAll("$1");
                    }
                    if ("uri".equals(str4)) {
                        try {
                            strReplaceAll = URI.create(strReplaceAll).getSchemeSpecificPart();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(strReplaceAll);
                        arrayList2.add(arrayList3);
                        i11 = 0;
                    } else {
                        i11 = 0;
                        arrayList.add(0, strReplaceAll);
                        arrayList2.add(arrayList);
                    }
                }
                i12 = iIndexOf + 1;
                str5 = str2;
            }
        }
        return arrayList2;
    }

    public static void e(String[] strArr, int i10, StringBuilder sb2) {
        String str = strArr[i10];
        if (str == null || str.isEmpty()) {
            return;
        }
        if (sb2.length() > 0) {
            sb2.append(' ');
        }
        sb2.append(strArr[i10]);
    }

    public static void f(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb2) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb2.append(str2);
        }
    }

    public static String g(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static String[] h(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) ((List) it.next()).get(0);
            if (str != null && !str.isEmpty()) {
                arrayList2.add(str);
            }
        }
        return (String[]) arrayList2.toArray(new String[arrayList2.size()]);
    }

    public static String[] i(ArrayList arrayList) {
        String strSubstring;
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list = (List) it.next();
            String str = (String) list.get(0);
            if (str != null && !str.isEmpty()) {
                int i10 = 1;
                while (true) {
                    if (i10 >= list.size()) {
                        strSubstring = null;
                        break;
                    }
                    strSubstring = (String) list.get(i10);
                    int iIndexOf = strSubstring.indexOf(61);
                    if (iIndexOf < 0) {
                        break;
                    }
                    if (ConstantsKt.TYPE.equalsIgnoreCase(strSubstring.substring(0, iIndexOf))) {
                        strSubstring = strSubstring.substring(iIndexOf + 1);
                        break;
                    }
                    i10++;
                }
                arrayList2.add(strSubstring);
            }
        }
        return (String[]) arrayList2.toArray(new String[arrayList2.size()]);
    }

    @Override // com.google.zxing.client.result.ResultParser
    public AddressBookParsedResult parse(Result result) {
        CharSequence charSequence;
        int iIndexOf;
        String massagedText = ResultParser.getMassagedText(result);
        Matcher matcher = f49778e.matcher(massagedText);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        ArrayList<List> arrayListD = d("FN", massagedText, true, false);
        if (arrayListD == null && (arrayListD = d("N", massagedText, true, false)) != null) {
            for (List list : arrayListD) {
                String str = (String) list.get(0);
                String[] strArr = new String[5];
                int i10 = 0;
                int i11 = 0;
                while (i10 < 4 && (iIndexOf = str.indexOf(59, i11)) >= 0) {
                    strArr[i10] = str.substring(i11, iIndexOf);
                    i10++;
                    i11 = iIndexOf + 1;
                }
                strArr[i10] = str.substring(i11);
                StringBuilder sb2 = new StringBuilder(100);
                e(strArr, 3, sb2);
                e(strArr, 1, sb2);
                e(strArr, 2, sb2);
                e(strArr, 0, sb2);
                e(strArr, 4, sb2);
                list.set(0, sb2.toString().trim());
            }
        }
        List listC = c("NICKNAME", massagedText, true, false);
        String[] strArrSplit = listC == null ? null : m.split((CharSequence) listC.get(0));
        ArrayList arrayListD2 = d("TEL", massagedText, true, false);
        ArrayList arrayListD3 = d("EMAIL", massagedText, true, false);
        List listC2 = c("NOTE", massagedText, false, false);
        ArrayList arrayListD4 = d("ADR", massagedText, true, true);
        List listC3 = c("ORG", massagedText, true, true);
        List listC4 = c("BDAY", massagedText, true, false);
        List list2 = (listC4 == null || (charSequence = (CharSequence) listC4.get(0)) == null || f49779f.matcher(charSequence).matches()) ? listC4 : null;
        List listC5 = c("TITLE", massagedText, true, false);
        ArrayList arrayListD5 = d("URL", massagedText, true, false);
        List listC6 = c("IMPP", massagedText, true, false);
        List listC7 = c("GEO", massagedText, true, false);
        String[] strArrSplit2 = listC7 == null ? null : f49786n.split((CharSequence) listC7.get(0));
        return new AddressBookParsedResult(h(arrayListD), strArrSplit, null, h(arrayListD2), i(arrayListD2), h(arrayListD3), i(arrayListD3), g(listC6), g(listC2), h(arrayListD4), i(arrayListD4), g(listC3), g(list2), g(listC5), h(arrayListD5), (strArrSplit2 == null || strArrSplit2.length == 2) ? strArrSplit2 : null);
    }
}
