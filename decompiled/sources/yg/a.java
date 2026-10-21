package yg;

import com.google.zxing.client.result.ResultParser;

/* JADX INFO: compiled from: AbstractDoCoMoResultParser.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a extends ResultParser {
    public static String c(String str, String str2, boolean z10) {
        String[] strArrA = ResultParser.a(str, str2, ';', z10);
        if (strArrA == null) {
            return null;
        }
        return strArrA[0];
    }
}
