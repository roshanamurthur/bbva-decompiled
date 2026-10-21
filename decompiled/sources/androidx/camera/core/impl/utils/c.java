package androidx.camera.core.impl.utils;

import com.bbva.glomohybrid.base.viewmodel.ViewModelComponentsProviders;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KMutableProperty1;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c {
    public static String a(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String b(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static StringBuilder c(CharSequence charSequence, String str, Function2 function2, String str2, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, str);
        Intrinsics.checkNotNullParameter(function2, str2);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence2);
        return sb2;
    }

    public static StringBuilder d(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        return sb2;
    }

    public static KMutableProperty1 e(Class cls, String str, String str2, int i10) {
        return Reflection.mutableProperty1(new MutablePropertyReference1Impl(cls, str, str2, i10));
    }

    public static Scope f(ViewModelComponentsProviders viewModelComponentsProviders) {
        return viewModelComponentsProviders.getKoin().getScopeRegistry().getRootScope();
    }
}
