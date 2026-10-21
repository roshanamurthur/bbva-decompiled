package kotlin.reflect.jvm.internal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KTypeBase;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KProperty;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.FlexibleTypesKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KTypeImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0018¨\u0006*²\u0006\u0012\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00148\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeImpl;", "Lkotlin/jvm/internal/KTypeBase;", "", "nullable", "makeNullableAsSpecified$kotlin_reflection", "(Z)Lkotlin/reflect/jvm/internal/KTypeImpl;", "makeNullableAsSpecified", "", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Lkotlin/reflect/KClassifier;", "r0", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getClassifier", "()Lkotlin/reflect/KClassifier;", "classifier", "", "Lkotlin/reflect/KTypeProjection;", "s0", "getArguments", "()Ljava/util/List;", "arguments", "Ljava/lang/reflect/Type;", "getJavaType", "()Ljava/lang/reflect/Type;", "javaType", "isMarkedNullable", "()Z", "", "getAnnotations", "annotations", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "type", "Lkotlin/Function0;", "computeJavaType", "<init>", "(Lorg/jetbrains/kotlin/types/KotlinType;Lkotlin/jvm/functions/Function0;)V", "parameterizedTypeArguments", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nKTypeImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeImpl.kt\nkotlin/reflect/jvm/internal/KTypeImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class KTypeImpl implements KTypeBase {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80012t0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KTypeImpl.class), "classifier", "getClassifier()Lkotlin/reflect/KClassifier;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KTypeImpl.class), "arguments", "getArguments()Ljava/util/List;"))};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final KotlinType f80013p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final ReflectProperties.LazySoftVal<Type> f80014q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal classifier;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal arguments;

    /* JADX INFO: compiled from: KTypeImpl.kt */
    public static final class a extends Lambda implements Function0<KClassifier> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final KClassifier invoke() {
            KTypeImpl kTypeImpl = KTypeImpl.this;
            return kTypeImpl.a(kTypeImpl.getF80013p0());
        }
    }

    public KTypeImpl(@NotNull KotlinType type, @Nullable Function0<? extends Type> function0) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f80013p0 = type;
        ReflectProperties.LazySoftVal<Type> lazySoftValLazySoft = null;
        ReflectProperties.LazySoftVal<Type> lazySoftVal = function0 instanceof ReflectProperties.LazySoftVal ? (ReflectProperties.LazySoftVal) function0 : null;
        if (lazySoftVal != null) {
            lazySoftValLazySoft = lazySoftVal;
        } else if (function0 != null) {
            lazySoftValLazySoft = ReflectProperties.lazySoft(function0);
        }
        this.f80014q0 = lazySoftValLazySoft;
        this.classifier = ReflectProperties.lazySoft(new a());
        this.arguments = ReflectProperties.lazySoft(new KTypeImpl$arguments$2(this, function0));
    }

    public final KClassifier a(KotlinType kotlinType) {
        KotlinType type;
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = kotlinType.getConstructor().mo5778getDeclarationDescriptor();
        if (!(classifierDescriptorMo5778getDeclarationDescriptor instanceof ClassDescriptor)) {
            if (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeParameterDescriptor) {
                return new KTypeParameterImpl(null, (TypeParameterDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
            }
            if (classifierDescriptorMo5778getDeclarationDescriptor instanceof TypeAliasDescriptor) {
                throw new NotImplementedError("An operation is not implemented: Type alias classifiers are not yet supported");
            }
            return null;
        }
        Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
        if (javaClass == null) {
            return null;
        }
        if (!javaClass.isArray()) {
            if (TypeUtils.isNullableType(kotlinType)) {
                return new KClassImpl(javaClass);
            }
            Class<?> primitiveByWrapper = ReflectClassUtilKt.getPrimitiveByWrapper(javaClass);
            if (primitiveByWrapper != null) {
                javaClass = primitiveByWrapper;
            }
            return new KClassImpl(javaClass);
        }
        TypeProjection typeProjection = (TypeProjection) CollectionsKt___CollectionsKt.singleOrNull((List) kotlinType.getArguments());
        if (typeProjection == null || (type = typeProjection.getType()) == null) {
            return new KClassImpl(javaClass);
        }
        KClassifier kClassifierA = a(type);
        if (kClassifierA != null) {
            return new KClassImpl(UtilKt.createArrayType(JvmClassMappingKt.getJavaClass((KClass) KTypesJvm.getJvmErasure(kClassifierA))));
        }
        throw new KotlinReflectionInternalError("Cannot determine classifier for array element type: " + this);
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof KTypeImpl) {
            KTypeImpl kTypeImpl = (KTypeImpl) other;
            if (Intrinsics.areEqual(this.f80013p0, kTypeImpl.f80013p0) && Intrinsics.areEqual(getClassifier(), kTypeImpl.getClassifier()) && Intrinsics.areEqual(getArguments(), kTypeImpl.getArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        return UtilKt.computeAnnotations(this.f80013p0);
    }

    @Override // kotlin.reflect.KType
    @NotNull
    public List<KTypeProjection> getArguments() {
        T value = this.arguments.getValue(this, f80012t0[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (List) value;
    }

    @Override // kotlin.reflect.KType
    @Nullable
    public KClassifier getClassifier() {
        return (KClassifier) this.classifier.getValue(this, f80012t0[0]);
    }

    @Override // kotlin.jvm.internal.KTypeBase
    @Nullable
    public Type getJavaType() {
        ReflectProperties.LazySoftVal<Type> lazySoftVal = this.f80014q0;
        if (lazySoftVal != null) {
            return lazySoftVal.invoke();
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getType, reason: from getter */
    public final KotlinType getF80013p0() {
        return this.f80013p0;
    }

    public int hashCode() {
        int iHashCode = this.f80013p0.hashCode() * 31;
        KClassifier classifier = getClassifier();
        return getArguments().hashCode() + ((iHashCode + (classifier != null ? classifier.hashCode() : 0)) * 31);
    }

    @Override // kotlin.reflect.KType
    public boolean isMarkedNullable() {
        return this.f80013p0.isMarkedNullable();
    }

    @NotNull
    public final KTypeImpl makeNullableAsSpecified$kotlin_reflection(boolean nullable) {
        KotlinType kotlinType = this.f80013p0;
        if (!FlexibleTypesKt.isFlexible(kotlinType) && isMarkedNullable() == nullable) {
            return this;
        }
        KotlinType kotlinTypeMakeNullableAsSpecified = TypeUtils.makeNullableAsSpecified(kotlinType, nullable);
        Intrinsics.checkNotNullExpressionValue(kotlinTypeMakeNullableAsSpecified, "makeNullableAsSpecified(...)");
        return new KTypeImpl(kotlinTypeMakeNullableAsSpecified, this.f80014q0);
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderType(this.f80013p0);
    }

    public /* synthetic */ KTypeImpl(KotlinType kotlinType, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(kotlinType, (i10 & 2) != 0 ? null : function0);
    }
}
