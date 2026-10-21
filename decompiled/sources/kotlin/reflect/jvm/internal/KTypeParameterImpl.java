package kotlin.reflect.jvm.internal;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeParameterReference;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KTypeParameterImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R!\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lkotlin/reflect/jvm/internal/KTypeParameterImpl;", "Lkotlin/reflect/KTypeParameter;", "Lkotlin/reflect/jvm/internal/KClassifierImpl;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "", "Lkotlin/reflect/KType;", "q0", "Lkotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal;", "getUpperBounds", "()Ljava/util/List;", "upperBounds", "getName", "()Ljava/lang/String;", "name", "Lkotlin/reflect/KVariance;", "getVariance", "()Lkotlin/reflect/KVariance;", "variance", "isReified", "()Z", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "container", "Lkotlin/reflect/jvm/internal/impl/descriptors/TypeParameterDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;Lorg/jetbrains/kotlin/descriptors/TypeParameterDescriptor;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
public final class KTypeParameterImpl implements KTypeParameter, KClassifierImpl {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f80024s0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KTypeParameterImpl.class), "upperBounds", "getUpperBounds()Ljava/util/List;"))};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final TypeParameterDescriptor f80025p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReflectProperties.LazySoftVal upperBounds;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final KTypeParameterOwnerImpl f80027r0;

    /* JADX INFO: compiled from: KTypeParameterImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.INVARIANT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Variance.OUT_VARIANCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: KTypeParameterImpl.kt */
    @SourceDebugExtension({"SMAP\nKTypeParameterImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KTypeParameterImpl.kt\nkotlin/reflect/jvm/internal/KTypeParameterImpl$upperBounds$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,91:1\n1549#2:92\n1620#2,3:93\n*S KotlinDebug\n*F\n+ 1 KTypeParameterImpl.kt\nkotlin/reflect/jvm/internal/KTypeParameterImpl$upperBounds$2\n*L\n38#1:92\n38#1:93,3\n*E\n"})
    public static final class a extends Lambda implements Function0<List<? extends KTypeImpl>> {
        public a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeImpl> invoke() {
            List<KotlinType> upperBounds = KTypeParameterImpl.this.getF80025p0().getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            List<KotlinType> list = upperBounds;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new KTypeImpl((KotlinType) it.next(), null, 2, 0 == true ? 1 : 0));
            }
            return arrayList;
        }
    }

    public KTypeParameterImpl(@Nullable KTypeParameterOwnerImpl kTypeParameterOwnerImpl, @NotNull TypeParameterDescriptor descriptor) {
        Class<?> klass;
        KClassImpl kClassImplA;
        Object objAccept;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f80025p0 = descriptor;
        this.upperBounds = ReflectProperties.lazySoft(new a());
        if (kTypeParameterOwnerImpl == null) {
            DeclarationDescriptor containingDeclaration = getF80025p0().getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
            if (containingDeclaration instanceof ClassDescriptor) {
                objAccept = a((ClassDescriptor) containingDeclaration);
            } else {
                if (!(containingDeclaration instanceof CallableMemberDescriptor)) {
                    throw new KotlinReflectionInternalError("Unknown type parameter container: " + containingDeclaration);
                }
                DeclarationDescriptor containingDeclaration2 = ((CallableMemberDescriptor) containingDeclaration).getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
                if (containingDeclaration2 instanceof ClassDescriptor) {
                    kClassImplA = a((ClassDescriptor) containingDeclaration2);
                } else {
                    DeserializedMemberDescriptor deserializedMemberDescriptor = containingDeclaration instanceof DeserializedMemberDescriptor ? (DeserializedMemberDescriptor) containingDeclaration : null;
                    if (deserializedMemberDescriptor == null) {
                        throw new KotlinReflectionInternalError("Non-class callable descriptor must be deserialized: " + containingDeclaration);
                    }
                    DeserializedContainerSource containerSource = deserializedMemberDescriptor.getContainerSource();
                    JvmPackagePartSource jvmPackagePartSource = containerSource instanceof JvmPackagePartSource ? (JvmPackagePartSource) containerSource : null;
                    KotlinJvmBinaryClass knownJvmBinaryClass = jvmPackagePartSource != null ? jvmPackagePartSource.getKnownJvmBinaryClass() : null;
                    ReflectKotlinClass reflectKotlinClass = knownJvmBinaryClass instanceof ReflectKotlinClass ? (ReflectKotlinClass) knownJvmBinaryClass : null;
                    if (reflectKotlinClass == null || (klass = reflectKotlinClass.getKlass()) == null) {
                        throw new KotlinReflectionInternalError("Container of deserialized member is not resolved: " + deserializedMemberDescriptor);
                    }
                    KClass kotlinClass = JvmClassMappingKt.getKotlinClass(klass);
                    Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
                    kClassImplA = (KClassImpl) kotlinClass;
                }
                objAccept = containingDeclaration.accept(new CreateKCallableVisitor(kClassImplA), Unit.INSTANCE);
            }
            Intrinsics.checkNotNull(objAccept);
            kTypeParameterOwnerImpl = (KTypeParameterOwnerImpl) objAccept;
        }
        this.f80027r0 = kTypeParameterOwnerImpl;
    }

    public static KClassImpl a(ClassDescriptor classDescriptor) {
        Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
        KClassImpl kClassImpl = (KClassImpl) (javaClass != null ? JvmClassMappingKt.getKotlinClass(javaClass) : null);
        if (kClassImpl != null) {
            return kClassImpl;
        }
        throw new KotlinReflectionInternalError("Type parameter container is not resolved: " + classDescriptor.getContainingDeclaration());
    }

    public boolean equals(@Nullable Object other) {
        if (other instanceof KTypeParameterImpl) {
            KTypeParameterImpl kTypeParameterImpl = (KTypeParameterImpl) other;
            if (Intrinsics.areEqual(this.f80027r0, kTypeParameterImpl.f80027r0) && Intrinsics.areEqual(getName(), kTypeParameterImpl.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public String getName() {
        String strAsString = getF80025p0().getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return strAsString;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public List<KType> getUpperBounds() {
        T value = this.upperBounds.getValue(this, f80024s0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (List) value;
    }

    @Override // kotlin.reflect.KTypeParameter
    @NotNull
    public KVariance getVariance() {
        int i10 = WhenMappings.$EnumSwitchMapping$0[getF80025p0().getVariance().ordinal()];
        if (i10 == 1) {
            return KVariance.INVARIANT;
        }
        if (i10 == 2) {
            return KVariance.IN;
        }
        if (i10 == 3) {
            return KVariance.OUT;
        }
        throw new NoWhenBranchMatchedException();
    }

    public int hashCode() {
        return getName().hashCode() + (this.f80027r0.hashCode() * 31);
    }

    @Override // kotlin.reflect.KTypeParameter
    /* JADX INFO: renamed from: isReified */
    public boolean getIsReified() {
        return getF80025p0().isReified();
    }

    @NotNull
    public String toString() {
        return TypeParameterReference.INSTANCE.toString(this);
    }

    @Override // kotlin.reflect.jvm.internal.KClassifierImpl
    @NotNull
    /* JADX INFO: renamed from: getDescriptor, reason: from getter */
    public TypeParameterDescriptor getF80025p0() {
        return this.f80025p0;
    }
}
