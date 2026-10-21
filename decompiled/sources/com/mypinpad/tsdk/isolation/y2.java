package com.mypinpad.tsdk.isolation;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import java.util.HashMap;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class y2 {
    public static Object a(Composer composer, int i10) {
        composer.startReplaceableGroup(i10);
        return composer.consume(CompositionLocalsKt.getLocalDensity());
    }

    public static String b(StringBuilder sb2, String str, char c10) {
        sb2.append(str);
        sb2.append(c10);
        return sb2.toString();
    }

    public static void c(int i10, String str, HashMap map, String str2) {
        map.put(str2, new bah(i10, str));
    }

    public static boolean d(Composer composer) {
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return ComposerKt.isTraceInProgress();
    }
}
