package androidx.collection;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.graphics.Color;
import java.util.List;
import javax.mail.internet.InternetHeaders;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j {
    public static int a(long j10, int i10, int i11) {
        return (Color.m2515hashCodeimpl(j10) + i10) * i11;
    }

    public static String b(String str, Object obj, String str2) {
        return str + obj + str2;
    }

    public static void c(String str, String str2, List list) {
        list.add(new InternetHeaders.InternetHeader(str, str2));
    }

    public static boolean d(WindowInsets.Companion companion, String str, Composer composer, int i10) {
        Intrinsics.checkNotNullParameter(companion, str);
        composer.startReplaceableGroup(i10);
        return ComposerKt.isTraceInProgress();
    }
}
