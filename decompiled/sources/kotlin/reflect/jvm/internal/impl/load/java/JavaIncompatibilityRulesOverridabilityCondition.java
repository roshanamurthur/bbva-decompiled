package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class JavaIncompatibilityRulesOverridabilityCondition implements ExternalOverridabilityCondition {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x005b, code lost:
        
            if (kotlin.jvm.internal.Intrinsics.areEqual(kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r0), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r3)) == false) goto L23;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType a(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r5) {
            /*
                boolean r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.forceSingleValueParameterBoxing(r4)
                java.lang.String r1 = "getType(...)"
                if (r0 != 0) goto L6a
                java.util.List r0 = r4.getValueParameters()
                int r0 = r0.size()
                r2 = 1
                if (r0 == r2) goto L14
                goto L5e
            L14:
                kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor r0 = r4.getContainingDeclaration()
                boolean r2 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                r3 = 0
                if (r2 == 0) goto L20
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r0
                goto L21
            L20:
                r0 = r3
            L21:
                if (r0 != 0) goto L24
                goto L5e
            L24:
                java.util.List r4 = r4.getValueParameters()
                java.lang.String r2 = "getValueParameters(...)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
                java.lang.Object r4 = kotlin.collections.CollectionsKt___CollectionsKt.single(r4)
                kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor) r4
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r4.getType()
                kotlin.reflect.jvm.internal.impl.types.TypeConstructor r4 = r4.getConstructor()
                kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r4 = r4.mo5778getDeclarationDescriptor()
                boolean r2 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor
                if (r2 == 0) goto L46
                r3 = r4
                kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r3 = (kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor) r3
            L46:
                if (r3 != 0) goto L49
                goto L5e
            L49:
                boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isPrimitiveClass(r0)
                if (r4 == 0) goto L5e
                kotlin.reflect.jvm.internal.impl.name.FqName r4 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r0)
                kotlin.reflect.jvm.internal.impl.name.FqName r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getFqNameSafe(r3)
                boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r4, r0)
                if (r4 == 0) goto L5e
                goto L6a
            L5e:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r5.getType()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.mapToJvmType(r4)
                goto L79
            L6a:
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = r5.getType()
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r1)
                kotlin.reflect.jvm.internal.impl.types.KotlinType r4 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.makeNullable(r4)
                kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType r4 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.mapToJvmType(r4)
            L79:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion.a(kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor):kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType");
        }

        public final boolean doesJavaOverrideHaveIncompatibleValueParameterKinds(@NotNull CallableDescriptor superDescriptor, @NotNull CallableDescriptor subDescriptor) {
            Intrinsics.checkNotNullParameter(superDescriptor, "superDescriptor");
            Intrinsics.checkNotNullParameter(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof JavaMethodDescriptor) && (superDescriptor instanceof FunctionDescriptor)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
                javaMethodDescriptor.getValueParameters().size();
                FunctionDescriptor functionDescriptor = (FunctionDescriptor) superDescriptor;
                functionDescriptor.getValueParameters().size();
                List<ValueParameterDescriptor> valueParameters = javaMethodDescriptor.getOriginal().getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                List<ValueParameterDescriptor> valueParameters2 = functionDescriptor.getOriginal().getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
                for (Pair pair : CollectionsKt___CollectionsKt.zip(valueParameters, valueParameters2)) {
                    ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) pair.component1();
                    ValueParameterDescriptor valueParameterDescriptor2 = (ValueParameterDescriptor) pair.component2();
                    Intrinsics.checkNotNull(valueParameterDescriptor);
                    boolean z10 = a((FunctionDescriptor) subDescriptor, valueParameterDescriptor) instanceof JvmType.Primitive;
                    Intrinsics.checkNotNull(valueParameterDescriptor2);
                    if (z10 != (a(functionDescriptor, valueParameterDescriptor2) instanceof JvmType.Primitive)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @NotNull
    public ExternalOverridabilityCondition.Contract getContract() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x004f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a8, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0, kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r1, false, false, 2, null)) != false) goto L49;
     */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result isOverridable(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r11) {
        /*
            r8 = this;
            java.lang.String r0 = "superDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "subDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            boolean r0 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r0 == 0) goto Lae
            boolean r0 = r10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r0 == 0) goto Lae
            boolean r0 = kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.isBuiltIn(r10)
            if (r0 == 0) goto L1a
            goto Lae
        L1a:
            kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature r0 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.INSTANCE
            r1 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r1
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r1.getName()
            java.lang.String r3 = "getName(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r0 = r0.getSameAsBuiltinMethodWithErasedValueParameters(r2)
            if (r0 != 0) goto L3f
            kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures$Companion r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures.Companion
            kotlin.reflect.jvm.internal.impl.name.Name r2 = r1.getName()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            boolean r0 = r0.getSameAsRenamedInJvmBuiltin(r2)
            if (r0 != 0) goto L3f
            goto Lae
        L3f:
            r0 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.getOverriddenSpecialBuiltin(r0)
            boolean r2 = r9 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            r3 = 0
            if (r2 == 0) goto L4f
            r4 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r4
            goto L50
        L4f:
            r4 = r3
        L50:
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L60
            boolean r7 = r1.isHiddenToOvercomeSignatureClash()
            boolean r4 = r4.isHiddenToOvercomeSignatureClash()
            if (r7 != r4) goto L60
            r4 = r6
            goto L61
        L60:
            r4 = r5
        L61:
            r4 = r4 ^ r6
            if (r4 == 0) goto L6d
            if (r0 == 0) goto Lab
            boolean r4 = r1.isHiddenToOvercomeSignatureClash()
            if (r4 != 0) goto L6d
            goto Lab
        L6d:
            boolean r4 = r11 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassDescriptor
            if (r4 == 0) goto Lae
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r4 = r1.getInitialSignatureDescriptor()
            if (r4 == 0) goto L78
            goto Lae
        L78:
            if (r0 == 0) goto Lae
            boolean r11 = kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers.hasRealKotlinSuperClassWithOverrideOf(r11, r0)
            if (r11 == 0) goto L81
            goto Lae
        L81:
            boolean r11 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor
            if (r11 == 0) goto Lab
            if (r2 == 0) goto Lab
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r11 = kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(r0)
            if (r11 == 0) goto Lab
            r11 = 2
            java.lang.String r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r1, r5, r5, r11, r3)
            r1 = r9
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = (kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor) r1
            kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor r1 = r1.getOriginal()
            java.lang.String r2 = "getOriginal(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r11 = kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt.computeJvmDescriptor$default(r1, r5, r5, r11, r3)
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r11)
            if (r11 == 0) goto Lab
            goto Lae
        Lab:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r9 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r9
        Lae:
            kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition$Companion r11 = kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.Companion
            boolean r9 = r11.doesJavaOverrideHaveIncompatibleValueParameterKinds(r9, r10)
            if (r9 == 0) goto Lb9
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r9 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.INCOMPATIBLE
            return r9
        Lb9:
            kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result r9 = kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition.Result.UNKNOWN
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition.isOverridable(kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor):kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition$Result");
    }
}
