package androidx.appcompat.app;

import androidx.compose.ui.layout.Placeable;
import com.bbva.ethermobile.help.kit.result.Result;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty1;
import org.koin.core.definition.BeanDefinition;
import org.koin.core.instance.FactoryInstanceFactory;
import org.koin.core.module.Module;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i {
    public static int a(Placeable placeable, int i10, int i11) {
        return (i10 - placeable.getHeight()) / i11;
    }

    public static String b(StringBuilder sb2, char c10, String str) {
        sb2.append(c10);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, str);
        return string;
    }

    public static String c(StringBuilder sb2, boolean z10, String str) {
        sb2.append(z10);
        sb2.append(str);
        return sb2.toString();
    }

    public static KProperty1 d(Class cls, String str, String str2, int i10) {
        return Reflection.property1(new PropertyReference1Impl(cls, str, str2, i10));
    }

    public static FactoryInstanceFactory e(BeanDefinition beanDefinition, Module module) {
        FactoryInstanceFactory factoryInstanceFactory = new FactoryInstanceFactory(beanDefinition);
        module.indexPrimaryType(factoryInstanceFactory);
        return factoryInstanceFactory;
    }

    public static void f(int i10, HashMap map, String str, int i11, String str2) {
        map.put(Integer.valueOf(i10), str);
        map.put(Integer.valueOf(i11), str2);
    }

    public static void g(StringBuilder sb2, Result result, String str, Result result2, String str2) {
        sb2.append(result);
        sb2.append(str);
        sb2.append(result2);
        sb2.append(str2);
    }
}
