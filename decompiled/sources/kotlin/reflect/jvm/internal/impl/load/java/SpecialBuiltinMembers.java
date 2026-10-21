package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.TypeCheckingProcedure;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes12.dex */
@JvmName(name = "SpecialBuiltinMembers")
@SourceDebugExtension({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/SpecialBuiltinMembers\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class SpecialBuiltinMembers {

    /* JADX INFO: compiled from: specialBuiltinMembers.kt */
    public static final class a extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80547p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull CallableMemberDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(DescriptorUtilsKt.getPropertyIfAccessor(it)));
        }
    }

    /* JADX INFO: compiled from: specialBuiltinMembers.kt */
    public static final class b extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f80548p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull CallableMemberDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.INSTANCE.isBuiltinFunctionWithDifferentNameInJvm((SimpleFunctionDescriptor) it));
        }
    }

    /* JADX INFO: compiled from: specialBuiltinMembers.kt */
    public static final class c extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f80549p0 = new c(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull CallableMemberDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(KotlinBuiltIns.isBuiltIn(it) && BuiltinMethodsWithSpecialGenericSignature.getSpecialSignatureInfo(it) != null);
        }
    }

    public static final boolean doesOverrideBuiltinWithDifferentJvmName(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        return getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor) != null;
    }

    @Nullable
    public static final String getJvmMethodNameIfSpecial(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor propertyIfAccessor;
        Name jvmName;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        CallableMemberDescriptor overriddenBuiltinWithDifferentJvmName = KotlinBuiltIns.isBuiltIn(callableMemberDescriptor) ? getOverriddenBuiltinWithDifferentJvmName(callableMemberDescriptor) : null;
        if (overriddenBuiltinWithDifferentJvmName == null || (propertyIfAccessor = DescriptorUtilsKt.getPropertyIfAccessor(overriddenBuiltinWithDifferentJvmName)) == null) {
            return null;
        }
        if (propertyIfAccessor instanceof PropertyDescriptor) {
            return ClassicBuiltinSpecialProperties.INSTANCE.getBuiltinSpecialPropertyGetterName(propertyIfAccessor);
        }
        if (!(propertyIfAccessor instanceof SimpleFunctionDescriptor) || (jvmName = BuiltinMethodsWithDifferentJvmName.INSTANCE.getJvmName((SimpleFunctionDescriptor) propertyIfAccessor)) == null) {
            return null;
        }
        return jvmName.asString();
    }

    @Nullable
    public static final <T extends CallableMemberDescriptor> T getOverriddenBuiltinWithDifferentJvmName(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        if (!SpecialGenericSignatures.Companion.getORIGINAL_SHORT_NAMES().contains(t10.getName()) && !BuiltinSpecialProperties.INSTANCE.getSPECIAL_SHORT_NAMES().contains(DescriptorUtilsKt.getPropertyIfAccessor(t10).getName())) {
            return null;
        }
        if ((t10 instanceof PropertyDescriptor) || (t10 instanceof PropertyAccessorDescriptor)) {
            return (T) DescriptorUtilsKt.firstOverridden$default(t10, false, a.f80547p0, 1, null);
        }
        if (t10 instanceof SimpleFunctionDescriptor) {
            return (T) DescriptorUtilsKt.firstOverridden$default(t10, false, b.f80548p0, 1, null);
        }
        return null;
    }

    @Nullable
    public static final <T extends CallableMemberDescriptor> T getOverriddenSpecialBuiltin(@NotNull T t10) {
        Intrinsics.checkNotNullParameter(t10, "<this>");
        T t11 = (T) getOverriddenBuiltinWithDifferentJvmName(t10);
        if (t11 != null) {
            return t11;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.INSTANCE;
        Name name = t10.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (T) DescriptorUtilsKt.firstOverridden$default(t10, false, c.f80549p0, 1, null);
        }
        return null;
    }

    public static final boolean hasRealKotlinSuperClassWithOverrideOf(@NotNull ClassDescriptor classDescriptor, @NotNull CallableDescriptor specialCallableDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        Intrinsics.checkNotNullParameter(specialCallableDescriptor, "specialCallableDescriptor");
        DeclarationDescriptor containingDeclaration = specialCallableDescriptor.getContainingDeclaration();
        Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        SimpleType defaultType = ((ClassDescriptor) containingDeclaration).getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        for (ClassDescriptor superClassDescriptor = DescriptorUtils.getSuperClassDescriptor(classDescriptor); superClassDescriptor != null; superClassDescriptor = DescriptorUtils.getSuperClassDescriptor(superClassDescriptor)) {
            if (!(superClassDescriptor instanceof JavaClassDescriptor) && TypeCheckingProcedure.findCorrespondingSupertype(superClassDescriptor.getDefaultType(), defaultType) != null) {
                return !KotlinBuiltIns.isBuiltIn(superClassDescriptor);
            }
        }
        return false;
    }

    public static final boolean isFromJava(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        return DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor).getContainingDeclaration() instanceof JavaClassDescriptor;
    }

    public static final boolean isFromJavaOrBuiltins(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        return isFromJava(callableMemberDescriptor) || KotlinBuiltIns.isBuiltIn(callableMemberDescriptor);
    }
}
