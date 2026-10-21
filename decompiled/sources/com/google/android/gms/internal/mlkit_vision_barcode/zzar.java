package com.google.android.gms.internal.mlkit_vision_barcode;

import androidx.collection.k;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-mlkit-barcode-scanning@@18.0.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzar {
    public static String zza(@CheckForNull String str, @CheckForNull Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            length = objArr.length;
            if (i11 >= length) {
                break;
            }
            Object obj = objArr[i11];
            if (obj == null) {
                string = AbstractJsonLexerKt.NULL;
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e5) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    StringBuilder sb2 = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
                    sb2.append(name);
                    sb2.append('@');
                    sb2.append(hexString);
                    String string2 = sb2.toString();
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", string2.length() != 0 ? "Exception during lenientFormat for ".concat(string2) : new String("Exception during lenientFormat for "), (Throwable) e5);
                    String name2 = e5.getClass().getName();
                    StringBuilder sb3 = new StringBuilder(string2.length() + 9 + name2.length());
                    k.e(sb3, "<", string2, " threw ", name2);
                    sb3.append(">");
                    string = sb3.toString();
                }
            }
            objArr[i11] = string;
            i11++;
        }
        StringBuilder sb4 = new StringBuilder((length * 16) + str.length());
        int i12 = 0;
        while (true) {
            length2 = objArr.length;
            if (i10 >= length2 || (iIndexOf = str.indexOf("%s", i12)) == -1) {
                break;
            }
            sb4.append((CharSequence) str, i12, iIndexOf);
            sb4.append(objArr[i10]);
            i12 = iIndexOf + 2;
            i10++;
        }
        sb4.append((CharSequence) str, i12, str.length());
        if (i10 < length2) {
            sb4.append(" [");
            sb4.append(objArr[i10]);
            for (int i13 = i10 + 1; i13 < objArr.length; i13++) {
                sb4.append(", ");
                sb4.append(objArr[i13]);
            }
            sb4.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb4.toString();
    }

    public static boolean zzb(@CheckForNull String str) {
        return zzap.zza(str);
    }
}
