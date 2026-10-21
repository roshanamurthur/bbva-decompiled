package kotlin.reflect.jvm;

import androidx.exifinterface.media.ExifInterface;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ReflectJvmMapping.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0002\"\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001b\u0010\b\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001b\u0010\f\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u0006\u0012\u0002\b\u00030\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\"/\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0012\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u00028\u00000\r8F¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0015\u0010\u001c\u001a\u00020\u0019*\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001b\u0010\u001f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000*\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u001b\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b \u0010!\"-\u0010\"\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\b\b\u0000\u0010\u0011*\u00020#*\b\u0012\u0004\u0012\u00028\u00000\u00128F¢\u0006\u0006\u001a\u0004\b \u0010$¨\u0006%"}, d2 = {"Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Field;", "getJavaField", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "getJavaGetter", "(Lkotlin/reflect/KProperty;)Ljava/lang/reflect/Method;", "javaGetter", "Lkotlin/reflect/KMutableProperty;", "getJavaSetter", "(Lkotlin/reflect/KMutableProperty;)Ljava/lang/reflect/Method;", "javaSetter", "Lkotlin/reflect/KFunction;", "getJavaMethod", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Method;", "javaMethod", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/reflect/Constructor;", "getJavaConstructor", "(Lkotlin/reflect/KFunction;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Lkotlin/reflect/KFunction;)V", "javaConstructor", "Lkotlin/reflect/KType;", "Ljava/lang/reflect/Type;", "getJavaType", "(Lkotlin/reflect/KType;)Ljava/lang/reflect/Type;", "javaType", "getKotlinProperty", "(Ljava/lang/reflect/Field;)Lkotlin/reflect/KProperty;", "kotlinProperty", "getKotlinFunction", "(Ljava/lang/reflect/Method;)Lkotlin/reflect/KFunction;", "kotlinFunction", "", "(Ljava/lang/reflect/Constructor;)Lkotlin/reflect/KFunction;", "kotlin-reflection"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "ReflectJvmMapping")
@SourceDebugExtension({"SMAP\nReflectJvmMapping.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJvmMapping.kt\nkotlin/reflect/jvm/ReflectJvmMapping\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1#2:180\n288#3,2:181\n*S KotlinDebug\n*F\n+ 1 ReflectJvmMapping.kt\nkotlin/reflect/jvm/ReflectJvmMapping\n*L\n177#1:181,2\n*E\n"})
public final class ReflectJvmMapping {

    /* JADX INFO: compiled from: ReflectJvmMapping.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final KFunction<?> a(Collection<? extends KCallable<?>> collection, Method method) {
        for (KCallable<?> kCallable : collection) {
            if ((kCallable instanceof KFunction) && Intrinsics.areEqual(kCallable.getName(), method.getName())) {
                KFunction<?> kFunction = (KFunction) kCallable;
                if (Intrinsics.areEqual(getJavaMethod(kFunction), method)) {
                    return kFunction;
                }
            }
        }
        for (KCallable<?> kCallable2 : collection) {
            if ((kCallable2 instanceof KFunction) && !Intrinsics.areEqual(kCallable2.getName(), method.getName())) {
                KFunction<?> kFunction2 = (KFunction) kCallable2;
                if (Intrinsics.areEqual(getJavaMethod(kFunction2), method)) {
                    return kFunction2;
                }
            }
        }
        return null;
    }

    public static final KProperty<?> b(Collection<? extends KCallable<?>> collection, Field field) {
        for (KCallable<?> kCallable : collection) {
            if ((kCallable instanceof KProperty) && Intrinsics.areEqual(kCallable.getName(), field.getName())) {
                KProperty<?> kProperty = (KProperty) kCallable;
                if (Intrinsics.areEqual(getJavaField(kProperty), field)) {
                    return kProperty;
                }
            }
        }
        for (KCallable<?> kCallable2 : collection) {
            if ((kCallable2 instanceof KProperty) && !Intrinsics.areEqual(kCallable2.getName(), field.getName())) {
                KProperty<?> kProperty2 = (KProperty) kCallable2;
                if (Intrinsics.areEqual(getJavaField(kProperty2), field)) {
                    return kProperty2;
                }
            }
        }
        return null;
    }

    public static final KPackageImpl c(Member member) {
        KotlinClassHeader classHeader;
        ReflectKotlinClass.Factory factory = ReflectKotlinClass.Factory;
        Class<?> declaringClass = member.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        ReflectKotlinClass reflectKotlinClassCreate = factory.create(declaringClass);
        KotlinClassHeader.Kind kind = (reflectKotlinClassCreate == null || (classHeader = reflectKotlinClassCreate.getClassHeader()) == null) ? null : classHeader.getKind();
        int i10 = kind == null ? -1 : WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            return null;
        }
        Class<?> declaringClass2 = member.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass2, "getDeclaringClass(...)");
        return new KPackageImpl(declaringClass2);
    }

    @Nullable
    public static final <T> Constructor<T> getJavaConstructor(@NotNull KFunction<? extends T> kFunction) {
        Caller<?> caller;
        Intrinsics.checkNotNullParameter(kFunction, "<this>");
        KCallableImpl<?> kCallableImplAsKCallableImpl = UtilKt.asKCallableImpl(kFunction);
        Member memberMo5770getMember = (kCallableImplAsKCallableImpl == null || (caller = kCallableImplAsKCallableImpl.getCaller()) == null) ? null : caller.mo5770getMember();
        if (memberMo5770getMember instanceof Constructor) {
            return (Constructor) memberMo5770getMember;
        }
        return null;
    }

    @Nullable
    public static final Field getJavaField(@NotNull KProperty<?> kProperty) {
        Intrinsics.checkNotNullParameter(kProperty, "<this>");
        KPropertyImpl<?> kPropertyImplAsKPropertyImpl = UtilKt.asKPropertyImpl(kProperty);
        if (kPropertyImplAsKPropertyImpl != null) {
            return kPropertyImplAsKPropertyImpl.getJavaField();
        }
        return null;
    }

    @Nullable
    public static final Method getJavaGetter(@NotNull KProperty<?> kProperty) {
        Intrinsics.checkNotNullParameter(kProperty, "<this>");
        return getJavaMethod(kProperty.getGetter());
    }

    @Nullable
    public static final Method getJavaMethod(@NotNull KFunction<?> kFunction) {
        Caller<?> caller;
        Intrinsics.checkNotNullParameter(kFunction, "<this>");
        KCallableImpl<?> kCallableImplAsKCallableImpl = UtilKt.asKCallableImpl(kFunction);
        Member memberMo5770getMember = (kCallableImplAsKCallableImpl == null || (caller = kCallableImplAsKCallableImpl.getCaller()) == null) ? null : caller.mo5770getMember();
        if (memberMo5770getMember instanceof Method) {
            return (Method) memberMo5770getMember;
        }
        return null;
    }

    @Nullable
    public static final Method getJavaSetter(@NotNull KMutableProperty<?> kMutableProperty) {
        Intrinsics.checkNotNullParameter(kMutableProperty, "<this>");
        return getJavaMethod(kMutableProperty.getSetter());
    }

    @NotNull
    public static final Type getJavaType(@NotNull KType kType) {
        Intrinsics.checkNotNullParameter(kType, "<this>");
        Type javaType = ((KTypeImpl) kType).getJavaType();
        return javaType == null ? TypesJVMKt.getJavaType(kType) : javaType;
    }

    @Nullable
    public static final KFunction<?> getKotlinFunction(@NotNull Method method) {
        KFunction<?> kFunctionA;
        Intrinsics.checkNotNullParameter(method, "<this>");
        if (Modifier.isStatic(method.getModifiers())) {
            KPackageImpl kPackageImplC = c(method);
            if (kPackageImplC != null) {
                return a(kPackageImplC.getMembers(), method);
            }
            Class<?> declaringClass = method.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            KClass<?> companionObject = KClasses.getCompanionObject(JvmClassMappingKt.getKotlinClass(declaringClass));
            if (companionObject != null) {
                Class javaClass = JvmClassMappingKt.getJavaClass((KClass) companionObject);
                String name = method.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Class<?>[] parameterTypes = method.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                Method declaredMethodOrNull = UtilKt.getDeclaredMethodOrNull(javaClass, name, (Class[]) Arrays.copyOf(parameterTypes, parameterTypes.length));
                if (declaredMethodOrNull != null && (kFunctionA = a(KClasses.getFunctions(companionObject), declaredMethodOrNull)) != null) {
                    return kFunctionA;
                }
            }
        }
        Class<?> declaringClass2 = method.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass2, "getDeclaringClass(...)");
        return a(KClasses.getFunctions(JvmClassMappingKt.getKotlinClass(declaringClass2)), method);
    }

    @Nullable
    public static final KProperty<?> getKotlinProperty(@NotNull Field field) {
        KProperty<?> kPropertyB;
        Intrinsics.checkNotNullParameter(field, "<this>");
        if (field.isSynthetic()) {
            return null;
        }
        if (Modifier.isStatic(field.getModifiers())) {
            KPackageImpl kPackageImplC = c(field);
            if (kPackageImplC != null) {
                return b(kPackageImplC.getMembers(), field);
            }
            Class<?> declaringClass = field.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
            KClass<?> companionObject = KClasses.getCompanionObject(JvmClassMappingKt.getKotlinClass(declaringClass));
            if (companionObject != null) {
                Class<?> declaringClass2 = field.getDeclaringClass();
                Intrinsics.checkNotNullExpressionValue(declaringClass2, "getDeclaringClass(...)");
                String name = field.getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                Field declaredFieldOrNull = UtilKt.getDeclaredFieldOrNull(declaringClass2, name);
                if (declaredFieldOrNull != null && (kPropertyB = b(KClasses.getMemberProperties(companionObject), declaredFieldOrNull)) != null) {
                    return kPropertyB;
                }
            }
        }
        Class<?> declaringClass3 = field.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass3, "getDeclaringClass(...)");
        return b(KClasses.getMemberProperties(JvmClassMappingKt.getKotlinClass(declaringClass3)), field);
    }

    @Nullable
    public static final <T> KFunction<T> getKotlinFunction(@NotNull Constructor<T> constructor) {
        T next;
        Intrinsics.checkNotNullParameter(constructor, "<this>");
        Class<T> declaringClass = constructor.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        Iterator<T> it = JvmClassMappingKt.getKotlinClass(declaringClass).getConstructors().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (Intrinsics.areEqual(getJavaConstructor((KFunction) next), constructor)) {
                return (KFunction) next;
            }
        }
        next = null;
        return (KFunction) next;
    }

    public static /* synthetic */ void getJavaConstructor$annotations(KFunction kFunction) {
    }
}
