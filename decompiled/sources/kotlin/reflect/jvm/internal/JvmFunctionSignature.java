package kotlin.reflect.jvm.internal;

import dk.e;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b\tB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "()V", "asString", "", "FakeJavaAnnotationConstructor", "JavaConstructor", "JavaMethod", "KotlinConstructor", "KotlinFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class JvmFunctionSignature {

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R%\u0010\u000b\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "asString", "", "Ljava/lang/reflect/Method;", "kotlin.jvm.PlatformType", "a", "Ljava/util/List;", "getMethods", "()Ljava/util/List;", "methods", "Ljava/lang/Class;", "jClass", "<init>", "(Ljava/lang/Class;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,302:1\n6442#2:303\n*S KotlinDebug\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmFunctionSignature$FakeJavaAnnotationConstructor\n*L\n88#1:303\n*E\n"})
    public static final class FakeJavaAnnotationConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Method> methods;

        /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
        public static final class a extends Lambda implements Function1<Method, CharSequence> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f79858p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(Method method) {
                Class<?> returnType = method.getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                return ReflectClassUtilKt.getDesc(returnType);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeJavaAnnotationConstructor(@NotNull Class<?> jClass) {
            super(null);
            Intrinsics.checkNotNullParameter(jClass, "jClass");
            Method[] declaredMethods = jClass.getDeclaredMethods();
            Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
            this.methods = ArraysKt___ArraysKt.sortedWith(declaredMethods, new Comparator() { // from class: kotlin.reflect.jvm.internal.JvmFunctionSignature$FakeJavaAnnotationConstructor$special$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    return e.compareValues(((Method) t10).getName(), ((Method) t11).getName());
                }
            });
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: asString */
        public String getF79865b() {
            return CollectionsKt___CollectionsKt.joinToString$default(this.methods, "", "<init>(", ")V", 0, null, a.f79858p0, 24, null);
        }

        @NotNull
        public final List<Method> getMethods() {
            return this.methods;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "asString", "Ljava/lang/reflect/Constructor;", "a", "Ljava/lang/reflect/Constructor;", "getConstructor", "()Ljava/lang/reflect/Constructor;", "constructor", "<init>", "(Ljava/lang/reflect/Constructor;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class JavaConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Constructor<?> constructor;

        /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
        public static final class a extends Lambda implements Function1<Class<?>, CharSequence> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f79860p0 = new a(1);

            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(Class<?> cls) {
                Intrinsics.checkNotNull(cls);
                return ReflectClassUtilKt.getDesc(cls);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaConstructor(@NotNull Constructor<?> constructor) {
            super(null);
            Intrinsics.checkNotNullParameter(constructor, "constructor");
            this.constructor = constructor;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: asString */
        public String getF79865b() {
            Class<?>[] parameterTypes = this.constructor.getParameterTypes();
            Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
            return ArraysKt___ArraysKt.joinToString$default(parameterTypes, "", "<init>(", ")V", 0, (CharSequence) null, a.f79860p0, 24, (Object) null);
        }

        @NotNull
        public final Constructor<?> getConstructor() {
            return this.constructor;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$JavaMethod;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "asString", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "getMethod", "()Ljava/lang/reflect/Method;", "method", "<init>", "(Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class JavaMethod extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Method method;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethod(@NotNull Method method) {
            super(null);
            Intrinsics.checkNotNullParameter(method, "method");
            this.method = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: asString */
        public String getF79865b() {
            return RuntimeTypeMapperKt.access$getSignature(this.method);
        }

        @NotNull
        public final Method getMethod() {
            return this.method;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000b"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinConstructor;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "asString", "getConstructorDesc", "()Ljava/lang/String;", "constructorDesc", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class KotlinConstructor extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JvmMemberSignature.Method f79862a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f79863b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinConstructor(@NotNull JvmMemberSignature.Method signature) {
            super(null);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f79862a = signature;
            this.f79863b = signature.asString();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: asString, reason: from getter */
        public String getF79865b() {
            return this.f79863b;
        }

        @NotNull
        public final String getConstructorDesc() {
            return this.f79862a.getDesc();
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0011\u0010\u0006\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0011\u0010\b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "", "asString", "getMethodName", "()Ljava/lang/String;", "methodName", "getMethodDesc", "methodDesc", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/JvmMemberSignature$Method;", "signature", "<init>", "(Lorg/jetbrains/kotlin/metadata/jvm/deserialization/JvmMemberSignature$Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class KotlinFunction extends JvmFunctionSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final JvmMemberSignature.Method f79864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final String f79865b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KotlinFunction(@NotNull JvmMemberSignature.Method signature) {
            super(null);
            Intrinsics.checkNotNullParameter(signature, "signature");
            this.f79864a = signature;
            this.f79865b = signature.asString();
        }

        @Override // kotlin.reflect.jvm.internal.JvmFunctionSignature
        @NotNull
        /* JADX INFO: renamed from: asString, reason: from getter */
        public String getF79865b() {
            return this.f79865b;
        }

        @NotNull
        public final String getMethodDesc() {
            return this.f79864a.getDesc();
        }

        @NotNull
        public final String getMethodName() {
            return this.f79864a.getName();
        }
    }

    public JvmFunctionSignature() {
    }

    public /* synthetic */ JvmFunctionSignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: asString */
    public abstract String getF79865b();
}
