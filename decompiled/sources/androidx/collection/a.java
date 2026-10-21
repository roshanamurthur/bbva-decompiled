package androidx.collection;

import androidx.compose.ui.layout.Placeable;
import androidx.fragment.app.Fragment;
import java.lang.reflect.Array;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a {
    public static int a(Placeable placeable, int i10, int i11) {
        return (i10 - placeable.getWidth()) / i11;
    }

    public static Object b(Object[] objArr, int i10) {
        return Array.newInstance(objArr.getClass().getComponentType(), i10);
    }

    public static String c(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static StringBuilder d(String str, String str2, ConfigurableProvider configurableProvider, String str3, String str4) {
        configurableProvider.addAlgorithm(str3, str.concat(str2));
        return new StringBuilder(str4);
    }
}
