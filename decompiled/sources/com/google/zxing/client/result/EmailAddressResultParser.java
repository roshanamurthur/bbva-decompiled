package com.google.zxing.client.result;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.net.MailTo;
import com.google.zxing.Result;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class EmailAddressResultParser extends ResultParser {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f49735e = Pattern.compile(",");

    @Override // com.google.zxing.client.result.ResultParser
    public EmailAddressParsedResult parse(Result result) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String str;
        String str2;
        String str3;
        String massagedText = ResultParser.getMassagedText(result);
        if (!massagedText.startsWith(MailTo.MAILTO_SCHEME) && !massagedText.startsWith("MAILTO:")) {
            if (!EmailDoCoMoResultParser.f49736e.matcher(massagedText).matches() || massagedText.indexOf(64) < 0) {
                return null;
            }
            return new EmailAddressParsedResult(new String[]{massagedText}, null, null, null, null);
        }
        String strSubstring = massagedText.substring(7);
        int iIndexOf = strSubstring.indexOf(63);
        if (iIndexOf >= 0) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        try {
            try {
                String strDecode = URLDecoder.decode(strSubstring, "UTF-8");
                boolean zIsEmpty = strDecode.isEmpty();
                Pattern pattern = f49735e;
                String[] strArrSplit = !zIsEmpty ? pattern.split(strDecode) : null;
                HashMap mapB = ResultParser.b(massagedText);
                if (mapB != null) {
                    if (strArrSplit == null && (str3 = (String) mapB.get(TypedValues.TransitionType.S_TO)) != null) {
                        strArrSplit = pattern.split(str3);
                    }
                    String str4 = (String) mapB.get("cc");
                    String[] strArrSplit2 = str4 != null ? pattern.split(str4) : null;
                    String str5 = (String) mapB.get("bcc");
                    String[] strArrSplit3 = str5 != null ? pattern.split(str5) : null;
                    String str6 = (String) mapB.get("subject");
                    str2 = (String) mapB.get("body");
                    strArr = strArrSplit;
                    strArr3 = strArrSplit3;
                    strArr2 = strArrSplit2;
                    str = str6;
                } else {
                    strArr = strArrSplit;
                    strArr2 = null;
                    strArr3 = null;
                    str = null;
                    str2 = null;
                }
                return new EmailAddressParsedResult(strArr, strArr2, strArr3, str, str2);
            } catch (UnsupportedEncodingException e5) {
                throw new IllegalStateException(e5);
            }
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
