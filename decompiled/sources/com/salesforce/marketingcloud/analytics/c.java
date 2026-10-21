package com.salesforce.marketingcloud.analytics;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"UnknownNullness"})
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class c {
    private c() {
    }

    public static String a(List<b> list) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (b bVar : list) {
            if (bVar != null) {
                if (z10) {
                    z10 = false;
                } else {
                    sb2.append(AbstractJsonLexerKt.COMMA);
                }
                sb2.append(bVar.d());
            }
        }
        return sb2.toString();
    }

    public static String[] a(@NonNull String str) {
        return str.split("\\s*,\\s*");
    }
}
