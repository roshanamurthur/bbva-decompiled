package androidx.camera.core.impl;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.layout.MeasurePolicy;
import com.noknok.android.client.asm.sdk.IAuthenticatorDescriptor;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v {
    public static MeasurePolicy a(Alignment.Companion companion, Arrangement.Vertical vertical, Composer composer, int i10, int i11) {
        MeasurePolicy measurePolicyColumnMeasurePolicy = ColumnKt.columnMeasurePolicy(vertical, companion.getStart(), composer, i10);
        composer.startReplaceableGroup(i11);
        return measurePolicyColumnMeasurePolicy;
    }

    public static IAuthenticatorDescriptor.AAIDInfo b(Map map, String str, IAuthenticatorDescriptor.AAIDInfo aAIDInfo) {
        map.put(str, aAIDInfo);
        return new IAuthenticatorDescriptor.AAIDInfo();
    }

    public static String c(String str, long j10) {
        return str + j10;
    }

    public static String d(StringBuilder sb2, Object obj, char c10) {
        sb2.append(obj);
        sb2.append(c10);
        return sb2.toString();
    }

    public static StringBuilder e(String str, int i10, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i10);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static void f(StringBuilder sb2, String str, double d2, String str2) {
        sb2.append(str);
        sb2.append(d2);
        sb2.append(str2);
    }
}
