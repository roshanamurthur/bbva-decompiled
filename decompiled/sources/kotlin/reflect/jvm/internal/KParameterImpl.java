package kotlin.reflect.jvm.internal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.KotlinReflectionNotSupportedError;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KParameterImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00011B1\u0012\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u0006\u0010\u001a\u001a\u00020\u0015\u0012\f\u0010.\u001a\b\u0012\u0004\u0012\u00020-0,¢\u0006\u0004\b/\u00100J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u001b\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u001a\u001a\u00020\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R!\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010*¨\u00062"}, d2 = {"Lkotlin/reflect/jvm/internal/KParameterImpl;", "Lkotlin/reflect/KParameter;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "p0", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "getCallable", "()Lkotlin/reflect/jvm/internal/KCallableImpl;", "callable", "q0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIndex", "()I", FirebaseAnalytics.Param.INDEX, "Lkotlin/reflect/KParameter$Kind;", "r0", "Lkotlin/reflect/KParameter$Kind;", "getKind", "()Lkotlin/reflect/KParameter$Kind;", "kind", "", "", "t0", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getAnnotations", "()Ljava/util/List;", "annotations", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/KType;", "getType", "()Lkotlin/reflect/KType;", "type", "isOptional", "()Z", "isVararg", "Lkotlin/Function0;", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "computeDescriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KCallableImpl;ILkotlin/reflect/KParameter$Kind;Lkotlin/jvm/functions/Function0;)V", "a", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nKParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class KParameterImpl implements KParameter {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f79980u0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KParameterImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ParameterDescriptor;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KParameterImpl.class), "annotations", "getAnnotations()Ljava/util/List;"))};

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KCallableImpl<?> callable;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int index;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KParameter.Kind kind;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ReflectProperties.LazySoftVal f79984s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal annotations;

    /* JADX INFO: compiled from: KParameterImpl.kt */
    public static final class a implements Type {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Type[] f79986p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final int f79987q0;

        public a(@NotNull Type[] types) {
            Intrinsics.checkNotNullParameter(types, "types");
            this.f79986p0 = types;
            this.f79987q0 = Arrays.hashCode(types);
        }

        public boolean equals(@Nullable Object obj) {
            if (obj instanceof a) {
                if (Arrays.equals(this.f79986p0, ((a) obj).f79986p0)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.Type
        @NotNull
        public String getTypeName() {
            return ArraysKt___ArraysKt.joinToString$default(this.f79986p0, ", ", Constant.BRACKET_OPEN, Constant.BRACKET_CLOSE, 0, (CharSequence) null, (Function1) null, 56, (Object) null);
        }

        public int hashCode() {
            return this.f79987q0;
        }

        @NotNull
        public String toString() {
            return getTypeName();
        }
    }

    /* JADX INFO: compiled from: KParameterImpl.kt */
    public static final class b extends Lambda implements Function0<List<? extends Annotation>> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Annotation> invoke() {
            return UtilKt.computeAnnotations(KParameterImpl.this.a());
        }
    }

    /* JADX INFO: compiled from: KParameterImpl.kt */
    @SourceDebugExtension({"SMAP\nKParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl$type$1\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,107:1\n37#2,2:108\n37#2,2:110\n*S KotlinDebug\n*F\n+ 1 KParameterImpl.kt\nkotlin/reflect/jvm/internal/KParameterImpl$type$1\n*L\n83#1:108,2\n86#1:110,2\n*E\n"})
    public static final class c extends Lambda implements Function0<Type> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Type invoke() {
            KParameterImpl kParameterImpl = KParameterImpl.this;
            ParameterDescriptor parameterDescriptorA = kParameterImpl.a();
            if ((parameterDescriptorA instanceof ReceiverParameterDescriptor) && Intrinsics.areEqual(UtilKt.getInstanceReceiverParameter(kParameterImpl.getCallable().getDescriptor()), parameterDescriptorA) && kParameterImpl.getCallable().getDescriptor().getKind() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
                DeclarationDescriptor containingDeclaration = kParameterImpl.getCallable().getDescriptor().getContainingDeclaration();
                Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) containingDeclaration);
                if (javaClass != null) {
                    return javaClass;
                }
                throw new KotlinReflectionInternalError("Cannot determine receiver Java type of inherited declaration: " + parameterDescriptorA);
            }
            Caller<?> caller = kParameterImpl.getCallable().getCaller();
            if (caller instanceof ValueClassAwareCaller) {
                Type[] typeArr = (Type[]) CollectionsKt___CollectionsKt.slice((List) caller.getParameterTypes(), ((ValueClassAwareCaller) caller).getRealSlicesOfParameters(kParameterImpl.getIndex())).toArray(new Type[0]);
                return KParameterImpl.access$compoundType(kParameterImpl, (Type[]) Arrays.copyOf(typeArr, typeArr.length));
            }
            if (!(caller instanceof ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller)) {
                return caller.getParameterTypes().get(kParameterImpl.getIndex());
            }
            Class[] clsArr = (Class[]) ((ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller) caller).getOriginalParametersGroups().get(kParameterImpl.getIndex()).toArray(new Class[0]);
            return KParameterImpl.access$compoundType(kParameterImpl, (Type[]) Arrays.copyOf(clsArr, clsArr.length));
        }
    }

    public KParameterImpl(@NotNull KCallableImpl<?> callable, int i10, @NotNull KParameter.Kind kind, @NotNull Function0<? extends ParameterDescriptor> computeDescriptor) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(computeDescriptor, "computeDescriptor");
        this.callable = callable;
        this.index = i10;
        this.kind = kind;
        this.f79984s0 = ReflectProperties.lazySoft(computeDescriptor);
        this.annotations = ReflectProperties.lazySoft(new b());
    }

    public static final Type access$compoundType(KParameterImpl kParameterImpl, Type... typeArr) {
        kParameterImpl.getClass();
        int length = typeArr.length;
        if (length != 0) {
            return length != 1 ? new a(typeArr) : (Type) ArraysKt___ArraysKt.single(typeArr);
        }
        throw new KotlinReflectionNotSupportedError("Expected at least 1 type for compound type");
    }

    public final ParameterDescriptor a() {
        T value = this.f79984s0.getValue(this, f79980u0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ParameterDescriptor) value;
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof KParameterImpl) {
            KParameterImpl kParameterImpl = (KParameterImpl) other;
            if (Intrinsics.areEqual(this.callable, kParameterImpl.callable) && getIndex() == kParameterImpl.getIndex()) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        T value = this.annotations.getValue(this, f79980u0[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (List) value;
    }

    @NotNull
    public final KCallableImpl<?> getCallable() {
        return this.callable;
    }

    @Override // kotlin.reflect.KParameter
    public int getIndex() {
        return this.index;
    }

    @Override // kotlin.reflect.KParameter
    @NotNull
    public KParameter.Kind getKind() {
        return this.kind;
    }

    @Override // kotlin.reflect.KParameter
    @Nullable
    public String getName() {
        ParameterDescriptor parameterDescriptorA = a();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorA instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorA : null;
        if (valueParameterDescriptor == null || valueParameterDescriptor.getContainingDeclaration().hasSynthesizedParameterNames()) {
            return null;
        }
        Name name = valueParameterDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (name.isSpecial()) {
            return null;
        }
        return name.asString();
    }

    @Override // kotlin.reflect.KParameter
    @NotNull
    public KType getType() {
        KotlinType type = a().getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return new KTypeImpl(type, new c());
    }

    public int hashCode() {
        return getIndex() + (this.callable.hashCode() * 31);
    }

    @Override // kotlin.reflect.KParameter
    public boolean isOptional() {
        ParameterDescriptor parameterDescriptorA = a();
        ValueParameterDescriptor valueParameterDescriptor = parameterDescriptorA instanceof ValueParameterDescriptor ? (ValueParameterDescriptor) parameterDescriptorA : null;
        if (valueParameterDescriptor != null) {
            return DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor);
        }
        return false;
    }

    @Override // kotlin.reflect.KParameter
    public boolean isVararg() {
        ParameterDescriptor parameterDescriptorA = a();
        return (parameterDescriptorA instanceof ValueParameterDescriptor) && ((ValueParameterDescriptor) parameterDescriptorA).getVarargElementType() != null;
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderParameter(this);
    }
}
