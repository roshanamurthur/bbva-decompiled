package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nspecialBuiltinMembers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 specialBuiltinMembers.kt\norg/jetbrains/kotlin/load/java/BuiltinMethodsWithSpecialGenericSignature\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {

    @NotNull
    public static final BuiltinMethodsWithSpecialGenericSignature INSTANCE = new BuiltinMethodsWithSpecialGenericSignature();

    /* JADX INFO: compiled from: specialBuiltinMembers.kt */
    public static final class a extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f80486p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull CallableMemberDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(BuiltinMethodsWithSpecialGenericSignature.access$getHasErasedValueParametersInJava(BuiltinMethodsWithSpecialGenericSignature.INSTANCE, it));
        }
    }

    /* JADX INFO: compiled from: specialBuiltinMembers.kt */
    public static final class b extends Lambda implements Function1<CallableMemberDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f80487p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull CallableMemberDescriptor it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf((it instanceof FunctionDescriptor) && BuiltinMethodsWithSpecialGenericSignature.access$getHasErasedValueParametersInJava(BuiltinMethodsWithSpecialGenericSignature.INSTANCE, it));
        }
    }

    public static final boolean access$getHasErasedValueParametersInJava(BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature, CallableMemberDescriptor callableMemberDescriptor) {
        builtinMethodsWithSpecialGenericSignature.getClass();
        return CollectionsKt___CollectionsKt.contains(SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SIGNATURES(), MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptor));
    }

    @JvmStatic
    @Nullable
    public static final FunctionDescriptor getOverriddenBuiltinFunctionWithErasedValueParametersInJava(@NotNull FunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = INSTANCE;
        Name name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (builtinMethodsWithSpecialGenericSignature.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return (FunctionDescriptor) DescriptorUtilsKt.firstOverridden$default(functionDescriptor, false, a.f80486p0, 1, null);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final SpecialGenericSignatures.SpecialSignatureInfo getSpecialSignatureInfo(@NotNull CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorFirstOverridden$default;
        String strComputeJvmSignature;
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "<this>");
        SpecialGenericSignatures.Companion companion = SpecialGenericSignatures.Companion;
        if (!companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(callableMemberDescriptor.getName()) || (callableMemberDescriptorFirstOverridden$default = DescriptorUtilsKt.firstOverridden$default(callableMemberDescriptor, false, b.f80487p0, 1, null)) == null || (strComputeJvmSignature = MethodSignatureMappingKt.computeJvmSignature(callableMemberDescriptorFirstOverridden$default)) == null) {
            return null;
        }
        return companion.getSpecialSignatureInfo(strComputeJvmSignature);
    }

    public final boolean getSameAsBuiltinMethodWithErasedValueParameters(@NotNull Name name) {
        Intrinsics.checkNotNullParameter(name, "<this>");
        return SpecialGenericSignatures.Companion.getERASED_VALUE_PARAMETERS_SHORT_NAMES().contains(name);
    }
}
