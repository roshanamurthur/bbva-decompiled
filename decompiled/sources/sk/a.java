package sk;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f93228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f93229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f93230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f93231d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f93232e;

    public a(Class cls, Map map, Lazy lazy, Lazy lazy2, List list) {
        this.f93228a = cls;
        this.f93229b = map;
        this.f93230c = lazy;
        this.f93231d = lazy2;
        this.f93232e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zAreEqual;
        KClass annotationClass;
        Class annotationClass2 = this.f93228a;
        Intrinsics.checkNotNullParameter(annotationClass2, "$annotationClass");
        Map values = this.f93229b;
        Intrinsics.checkNotNullParameter(values, "$values");
        Lazy toString$delegate = this.f93230c;
        Intrinsics.checkNotNullParameter(toString$delegate, "$toString$delegate");
        Lazy hashCode$delegate = this.f93231d;
        Intrinsics.checkNotNullParameter(hashCode$delegate, "$hashCode$delegate");
        List methods = this.f93232e;
        Intrinsics.checkNotNullParameter(methods, "$methods");
        String name = method.getName();
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return annotationClass2;
                    }
                } else if (name.equals(GenerateActivationFormCommand.HASH_CODE)) {
                    return Integer.valueOf(((Number) hashCode$delegate.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) toString$delegate.getValue();
            }
        }
        boolean z10 = false;
        if (!Intrinsics.areEqual(name, "equals") || objArr == null || objArr.length != 1) {
            if (values.containsKey(name)) {
                return values.get(name);
            }
            StringBuilder sb2 = new StringBuilder("Method is not supported: ");
            sb2.append(method);
            sb2.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb2.append(ArraysKt___ArraysKt.toList(objArr));
            sb2.append(RootService.CLOSE_BRACKET);
            throw new KotlinReflectionInternalError(sb2.toString());
        }
        Intrinsics.checkNotNull(objArr);
        Object objSingle = ArraysKt___ArraysKt.single(objArr);
        Class javaClass = null;
        Annotation annotation = objSingle instanceof Annotation ? (Annotation) objSingle : null;
        if (annotation != null && (annotationClass = JvmClassMappingKt.getAnnotationClass(annotation)) != null) {
            javaClass = JvmClassMappingKt.getJavaClass(annotationClass);
        }
        if (Intrinsics.areEqual(javaClass, annotationClass2)) {
            List<Method> list = methods;
            if ((list instanceof Collection) && list.isEmpty()) {
                z10 = true;
            } else {
                for (Method method2 : list) {
                    Object obj2 = values.get(method2.getName());
                    Object objInvoke = method2.invoke(objSingle, new Object[0]);
                    if (obj2 instanceof boolean[]) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.BooleanArray");
                        zAreEqual = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.CharArray");
                        zAreEqual = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.ByteArray");
                        zAreEqual = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.ShortArray");
                        zAreEqual = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.IntArray");
                        zAreEqual = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.FloatArray");
                        zAreEqual = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.LongArray");
                        zAreEqual = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.DoubleArray");
                        zAreEqual = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else if (obj2 instanceof Object[]) {
                        Intrinsics.checkNotNull(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
                        zAreEqual = Arrays.equals((Object[]) obj2, (Object[]) objInvoke);
                    } else {
                        zAreEqual = Intrinsics.areEqual(obj2, objInvoke);
                    }
                    if (!zAreEqual) {
                    }
                }
                z10 = true;
            }
        }
        return Boolean.valueOf(z10);
    }
}
