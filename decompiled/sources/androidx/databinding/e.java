package androidx.databinding;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.mypinpad.tsdk.isolation.apk;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e {
    public static int a(CharSequence charSequence, String str, Function1 function1, String str2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function1, str2);
        return charSequence.length();
    }

    public static apk b(apk apkVar, apk apkVar2, apk apkVar3) {
        return apkVar.setX().setOnFocusChangeListener(apkVar2).setOnFocusChangeListener(apkVar3);
    }

    public static String c(String str, int i10, int i11) {
        return str.substring(i11, str.length() - i10);
    }

    public static String d(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str3, str.concat(str2));
        return str.concat(str4);
    }

    public static boolean e(Composer composer) {
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
        return ComposerKt.isTraceInProgress();
    }
}
