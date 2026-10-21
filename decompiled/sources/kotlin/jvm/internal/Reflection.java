package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KDeclarationContainer;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty0;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.KMutableProperty2;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.ReflectionFactoryImpl;

/* JADX INFO: loaded from: classes12.dex */
public class Reflection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReflectionFactory f79731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KClass[] f79732b;

    static {
        ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (ReflectionFactory) ReflectionFactoryImpl.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new ReflectionFactory();
        }
        f79731a = reflectionFactory;
        f79732b = new KClass[0];
    }

    public static KClass createKotlinClass(Class cls) {
        return f79731a.createKotlinClass(cls);
    }

    public static KFunction function(FunctionReference functionReference) {
        return f79731a.function(functionReference);
    }

    public static KClass getOrCreateKotlinClass(Class cls) {
        return f79731a.getOrCreateKotlinClass(cls);
    }

    public static KClass[] getOrCreateKotlinClasses(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f79732b;
        }
        KClass[] kClassArr = new KClass[length];
        for (int i10 = 0; i10 < length; i10++) {
            kClassArr[i10] = getOrCreateKotlinClass(clsArr[i10]);
        }
        return kClassArr;
    }

    @SinceKotlin(version = "1.4")
    public static KDeclarationContainer getOrCreateKotlinPackage(Class cls) {
        return f79731a.getOrCreateKotlinPackage(cls, "");
    }

    @SinceKotlin(version = "1.6")
    public static KType mutableCollectionType(KType kType) {
        return f79731a.mutableCollectionType(kType);
    }

    public static KMutableProperty0 mutableProperty0(MutablePropertyReference0 mutablePropertyReference0) {
        return f79731a.mutableProperty0(mutablePropertyReference0);
    }

    public static KMutableProperty1 mutableProperty1(MutablePropertyReference1 mutablePropertyReference1) {
        return f79731a.mutableProperty1(mutablePropertyReference1);
    }

    public static KMutableProperty2 mutableProperty2(MutablePropertyReference2 mutablePropertyReference2) {
        return f79731a.mutableProperty2(mutablePropertyReference2);
    }

    @SinceKotlin(version = "1.6")
    public static KType nothingType(KType kType) {
        return f79731a.nothingType(kType);
    }

    @SinceKotlin(version = "1.4")
    public static KType nullableTypeOf(KClassifier kClassifier) {
        return f79731a.typeOf(kClassifier, Collections.emptyList(), true);
    }

    @SinceKotlin(version = "1.6")
    public static KType platformType(KType kType, KType kType2) {
        return f79731a.platformType(kType, kType2);
    }

    public static KProperty0 property0(PropertyReference0 propertyReference0) {
        return f79731a.property0(propertyReference0);
    }

    public static KProperty1 property1(PropertyReference1 propertyReference1) {
        return f79731a.property1(propertyReference1);
    }

    public static KProperty2 property2(PropertyReference2 propertyReference2) {
        return f79731a.property2(propertyReference2);
    }

    @SinceKotlin(version = "1.1")
    public static String renderLambdaToString(Lambda lambda) {
        return f79731a.renderLambdaToString(lambda);
    }

    @SinceKotlin(version = "1.4")
    public static void setUpperBounds(KTypeParameter kTypeParameter, KType kType) {
        f79731a.setUpperBounds(kTypeParameter, Collections.singletonList(kType));
    }

    @SinceKotlin(version = "1.4")
    public static KType typeOf(KClassifier kClassifier) {
        return f79731a.typeOf(kClassifier, Collections.emptyList(), false);
    }

    @SinceKotlin(version = "1.4")
    public static KTypeParameter typeParameter(Object obj, String str, KVariance kVariance, boolean z10) {
        return f79731a.typeParameter(obj, str, kVariance, z10);
    }

    public static KClass createKotlinClass(Class cls, String str) {
        return f79731a.createKotlinClass(cls, str);
    }

    public static KClass getOrCreateKotlinClass(Class cls, String str) {
        return f79731a.getOrCreateKotlinClass(cls, str);
    }

    public static KDeclarationContainer getOrCreateKotlinPackage(Class cls, String str) {
        return f79731a.getOrCreateKotlinPackage(cls, str);
    }

    @SinceKotlin(version = "1.4")
    public static KType nullableTypeOf(Class cls) {
        return f79731a.typeOf(getOrCreateKotlinClass(cls), Collections.emptyList(), true);
    }

    @SinceKotlin(version = "1.3")
    public static String renderLambdaToString(FunctionBase functionBase) {
        return f79731a.renderLambdaToString(functionBase);
    }

    @SinceKotlin(version = "1.4")
    public static void setUpperBounds(KTypeParameter kTypeParameter, KType... kTypeArr) {
        f79731a.setUpperBounds(kTypeParameter, ArraysKt___ArraysKt.toList(kTypeArr));
    }

    @SinceKotlin(version = "1.4")
    public static KType typeOf(Class cls) {
        return f79731a.typeOf(getOrCreateKotlinClass(cls), Collections.emptyList(), false);
    }

    @SinceKotlin(version = "1.4")
    public static KType nullableTypeOf(Class cls, KTypeProjection kTypeProjection) {
        return f79731a.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), true);
    }

    @SinceKotlin(version = "1.4")
    public static KType typeOf(Class cls, KTypeProjection kTypeProjection) {
        return f79731a.typeOf(getOrCreateKotlinClass(cls), Collections.singletonList(kTypeProjection), false);
    }

    @SinceKotlin(version = "1.4")
    public static KType nullableTypeOf(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f79731a.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(kTypeProjection, kTypeProjection2), true);
    }

    @SinceKotlin(version = "1.4")
    public static KType typeOf(Class cls, KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        return f79731a.typeOf(getOrCreateKotlinClass(cls), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }

    @SinceKotlin(version = "1.4")
    public static KType nullableTypeOf(Class cls, KTypeProjection... kTypeProjectionArr) {
        return f79731a.typeOf(getOrCreateKotlinClass(cls), ArraysKt___ArraysKt.toList(kTypeProjectionArr), true);
    }

    @SinceKotlin(version = "1.4")
    public static KType typeOf(Class cls, KTypeProjection... kTypeProjectionArr) {
        return f79731a.typeOf(getOrCreateKotlinClass(cls), ArraysKt___ArraysKt.toList(kTypeProjectionArr), false);
    }
}
