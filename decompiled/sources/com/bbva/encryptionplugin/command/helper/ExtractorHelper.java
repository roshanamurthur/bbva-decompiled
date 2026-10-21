package com.bbva.encryptionplugin.command.helper;

import com.bbva.cellswidgets.MaskTextWatcher;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ExtractorHelper.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\f\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/encryptionplugin/command/helper/ExtractorHelper;", "", "()V", "findOccurrences", "", "key", "mask", "wildcard", "", "encryption_plugin_release"}, k = 1, mv = {1, 1, 16})
public final class ExtractorHelper {
    public static final ExtractorHelper INSTANCE = new ExtractorHelper();

    public static /* synthetic */ String findOccurrences$default(ExtractorHelper extractorHelper, String str, String str2, char c10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            c10 = MaskTextWatcher.WILDCARD;
        }
        return extractorHelper.findOccurrences(str, str2, c10);
    }

    @NotNull
    public final String findOccurrences(@NotNull String key, @NotNull String mask, char wildcard) throws IOException {
        if (l.isBlank(mask)) {
            return key;
        }
        int i10 = 0;
        String strSubstring = key.substring(0, Math.min(key.length(), mask.length()));
        Intrinsics.checkExpressionValueIsNotNull(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (i10 < strSubstring.length()) {
            char cCharAt = strSubstring.charAt(i10);
            int i12 = i11 + 1;
            if (mask.charAt(i11) == wildcard) {
                sb2.append(cCharAt);
            }
            i10++;
            i11 = i12;
        }
        String string = sb2.toString();
        Intrinsics.checkExpressionValueIsNotNull(string, "filterIndexedTo(StringBu…(), predicate).toString()");
        return string;
    }
}
