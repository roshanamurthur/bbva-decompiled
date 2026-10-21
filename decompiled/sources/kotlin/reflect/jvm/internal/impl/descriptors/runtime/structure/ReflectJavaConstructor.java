package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaValueParameter;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ReflectJavaConstructor.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nReflectJavaConstructor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,51:1\n11065#2:52\n11400#2,3:53\n*S KotlinDebug\n*F\n+ 1 ReflectJavaConstructor.kt\norg/jetbrains/kotlin/descriptors/runtime/structure/ReflectJavaConstructor\n*L\n49#1:52\n49#1:53,3\n*E\n"})
public final class ReflectJavaConstructor extends ReflectJavaMember implements JavaConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Constructor<?> f80455a;

    public ReflectJavaConstructor(@NotNull Constructor<?> member) {
        Intrinsics.checkNotNullParameter(member, "member");
        this.f80455a = member;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    public Constructor<?> getMember() {
        return this.f80455a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaTypeParameterListOwner
    @NotNull
    public List<ReflectJavaTypeParameter> getTypeParameters() {
        TypeVariable<Constructor<?>>[] typeParameters = getMember().getTypeParameters();
        Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable<Constructor<?>> typeVariable : typeParameters) {
            arrayList.add(new ReflectJavaTypeParameter(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaConstructor
    @NotNull
    public List<JavaValueParameter> getValueParameters() {
        Type[] genericParameterTypes = getMember().getGenericParameterTypes();
        Intrinsics.checkNotNull(genericParameterTypes);
        if (genericParameterTypes.length == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        Class<?> declaringClass = getMember().getDeclaringClass();
        if (declaringClass.getDeclaringClass() != null && !Modifier.isStatic(declaringClass.getModifiers())) {
            genericParameterTypes = (Type[]) ArraysKt___ArraysJvmKt.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
        }
        Annotation[][] parameterAnnotations = getMember().getParameterAnnotations();
        if (parameterAnnotations.length < genericParameterTypes.length) {
            throw new IllegalStateException("Illegal generic signature: " + getMember());
        }
        if (parameterAnnotations.length > genericParameterTypes.length) {
            Intrinsics.checkNotNull(parameterAnnotations);
            parameterAnnotations = (Annotation[][]) ArraysKt___ArraysJvmKt.copyOfRange(parameterAnnotations, parameterAnnotations.length - genericParameterTypes.length, parameterAnnotations.length);
        }
        Intrinsics.checkNotNull(genericParameterTypes);
        Intrinsics.checkNotNull(parameterAnnotations);
        return getValueParameters(genericParameterTypes, parameterAnnotations, getMember().isVarArgs());
    }
}
