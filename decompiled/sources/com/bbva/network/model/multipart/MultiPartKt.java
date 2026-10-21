package com.bbva.network.model.multipart;

import bk.p;
import com.bbva.network.constant.ConstantsKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;

/* JADX INFO: compiled from: MultiPart.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"network_release"}, k = 2, mv = {1, 8, 0})
public final class MultiPartKt {
    public static final void a(String str, StringBuilder sb2) {
        sb2.append('\"');
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == '\n') {
                sb2.append(ConstantsKt.ENTER);
            } else if (cCharAt == '\r') {
                sb2.append(ConstantsKt.RETURN);
            } else if (cCharAt == '\"') {
                sb2.append(ConstantsKt.QUOTATION);
            } else {
                sb2.append(cCharAt);
            }
        }
        sb2.append('\"');
    }

    public static final Map access$headersFromFilename(String str, String str2) {
        StringBuilder sb2 = new StringBuilder(ConstantsKt.FORM_DATA_NAME);
        a(str, sb2);
        if (str2 != null) {
            sb2.append(ConstantsKt.FILENAME);
            a(str2, sb2);
        }
        return p.mapOf(TuplesKt.to(ConstantsKt.CONTENT_DISPOSITION, sb2.toString()));
    }
}
