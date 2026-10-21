package kotlin.reflect.jvm;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.calls.Caller;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: KCallablesJvm.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\",\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u0000\u001a\u00020\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0002\u0010\u0004\"\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"value", "", "isAccessible", "Lkotlin/reflect/KCallable;", "(Lkotlin/reflect/KCallable;)Z", "setAccessible", "(Lkotlin/reflect/KCallable;Z)V", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "KCallablesJvm")
public final class KCallablesJvm {
    public static final boolean isAccessible(@NotNull KCallable<?> kCallable) {
        Caller<?> defaultCaller;
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field javaField = ReflectJvmMapping.getJavaField(kProperty);
            if (javaField != null && !javaField.isAccessible()) {
                return false;
            }
            Method javaGetter = ReflectJvmMapping.getJavaGetter(kProperty);
            if (javaGetter != null && !javaGetter.isAccessible()) {
                return false;
            }
            Method javaSetter = ReflectJvmMapping.getJavaSetter((KMutableProperty) kCallable);
            if (javaSetter != null && !javaSetter.isAccessible()) {
                return false;
            }
        } else if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field javaField2 = ReflectJvmMapping.getJavaField(kProperty2);
            if (javaField2 != null && !javaField2.isAccessible()) {
                return false;
            }
            Method javaGetter2 = ReflectJvmMapping.getJavaGetter(kProperty2);
            if (javaGetter2 != null && !javaGetter2.isAccessible()) {
                return false;
            }
        } else if (kCallable instanceof KProperty.Getter) {
            Field javaField3 = ReflectJvmMapping.getJavaField(((KProperty.Getter) kCallable).getProperty());
            if (javaField3 != null && !javaField3.isAccessible()) {
                return false;
            }
            Method javaMethod = ReflectJvmMapping.getJavaMethod((KFunction) kCallable);
            if (javaMethod != null && !javaMethod.isAccessible()) {
                return false;
            }
        } else if (kCallable instanceof KMutableProperty.Setter) {
            Field javaField4 = ReflectJvmMapping.getJavaField(((KMutableProperty.Setter) kCallable).getProperty());
            if (javaField4 != null && !javaField4.isAccessible()) {
                return false;
            }
            Method javaMethod2 = ReflectJvmMapping.getJavaMethod((KFunction) kCallable);
            if (javaMethod2 != null && !javaMethod2.isAccessible()) {
                return false;
            }
        } else {
            if (!(kCallable instanceof KFunction)) {
                throw new UnsupportedOperationException("Unknown callable: " + kCallable + " (" + kCallable.getClass() + RootService.CLOSE_BRACKET);
            }
            KFunction kFunction = (KFunction) kCallable;
            Method javaMethod3 = ReflectJvmMapping.getJavaMethod(kFunction);
            if (javaMethod3 != null && !javaMethod3.isAccessible()) {
                return false;
            }
            KCallableImpl<?> kCallableImplAsKCallableImpl = UtilKt.asKCallableImpl(kCallable);
            Member memberMo5770getMember = (kCallableImplAsKCallableImpl == null || (defaultCaller = kCallableImplAsKCallableImpl.getDefaultCaller()) == null) ? null : defaultCaller.mo5770getMember();
            AccessibleObject accessibleObject = memberMo5770getMember instanceof AccessibleObject ? (AccessibleObject) memberMo5770getMember : null;
            if (accessibleObject != null && !accessibleObject.isAccessible()) {
                return false;
            }
            Constructor javaConstructor = ReflectJvmMapping.getJavaConstructor(kFunction);
            if (javaConstructor != null && !javaConstructor.isAccessible()) {
                return false;
            }
        }
        return true;
    }

    public static final void setAccessible(@NotNull KCallable<?> kCallable, boolean z10) {
        Caller<?> defaultCaller;
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        if (kCallable instanceof KMutableProperty) {
            KProperty kProperty = (KProperty) kCallable;
            Field javaField = ReflectJvmMapping.getJavaField(kProperty);
            if (javaField != null) {
                javaField.setAccessible(z10);
            }
            Method javaGetter = ReflectJvmMapping.getJavaGetter(kProperty);
            if (javaGetter != null) {
                javaGetter.setAccessible(z10);
            }
            Method javaSetter = ReflectJvmMapping.getJavaSetter((KMutableProperty) kCallable);
            if (javaSetter == null) {
                return;
            }
            javaSetter.setAccessible(z10);
            return;
        }
        if (kCallable instanceof KProperty) {
            KProperty kProperty2 = (KProperty) kCallable;
            Field javaField2 = ReflectJvmMapping.getJavaField(kProperty2);
            if (javaField2 != null) {
                javaField2.setAccessible(z10);
            }
            Method javaGetter2 = ReflectJvmMapping.getJavaGetter(kProperty2);
            if (javaGetter2 == null) {
                return;
            }
            javaGetter2.setAccessible(z10);
            return;
        }
        if (kCallable instanceof KProperty.Getter) {
            Field javaField3 = ReflectJvmMapping.getJavaField(((KProperty.Getter) kCallable).getProperty());
            if (javaField3 != null) {
                javaField3.setAccessible(z10);
            }
            Method javaMethod = ReflectJvmMapping.getJavaMethod((KFunction) kCallable);
            if (javaMethod == null) {
                return;
            }
            javaMethod.setAccessible(z10);
            return;
        }
        if (kCallable instanceof KMutableProperty.Setter) {
            Field javaField4 = ReflectJvmMapping.getJavaField(((KMutableProperty.Setter) kCallable).getProperty());
            if (javaField4 != null) {
                javaField4.setAccessible(z10);
            }
            Method javaMethod2 = ReflectJvmMapping.getJavaMethod((KFunction) kCallable);
            if (javaMethod2 == null) {
                return;
            }
            javaMethod2.setAccessible(z10);
            return;
        }
        if (!(kCallable instanceof KFunction)) {
            throw new UnsupportedOperationException("Unknown callable: " + kCallable + " (" + kCallable.getClass() + RootService.CLOSE_BRACKET);
        }
        KFunction kFunction = (KFunction) kCallable;
        Method javaMethod3 = ReflectJvmMapping.getJavaMethod(kFunction);
        if (javaMethod3 != null) {
            javaMethod3.setAccessible(z10);
        }
        KCallableImpl<?> kCallableImplAsKCallableImpl = UtilKt.asKCallableImpl(kCallable);
        Member memberMo5770getMember = (kCallableImplAsKCallableImpl == null || (defaultCaller = kCallableImplAsKCallableImpl.getDefaultCaller()) == null) ? null : defaultCaller.mo5770getMember();
        AccessibleObject accessibleObject = memberMo5770getMember instanceof AccessibleObject ? (AccessibleObject) memberMo5770getMember : null;
        if (accessibleObject != null) {
            accessibleObject.setAccessible(true);
        }
        Constructor javaConstructor = ReflectJvmMapping.getJavaConstructor(kFunction);
        if (javaConstructor == null) {
            return;
        }
        javaConstructor.setAccessible(z10);
    }
}
