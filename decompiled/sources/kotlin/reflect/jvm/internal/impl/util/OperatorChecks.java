package kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeAliasDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ImplicitClassReceiver;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.ReceiverValue;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: modifierChecks.kt */
/* JADX INFO: loaded from: classes12.dex */
public final class OperatorChecks extends AbstractModifierChecks {

    @NotNull
    public static final OperatorChecks INSTANCE = new OperatorChecks();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final List<Checks> f82080a;

    /* JADX INFO: compiled from: modifierChecks.kt */
    @SourceDebugExtension({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 modifierChecks.kt\norg/jetbrains/kotlin/util/AbstractModifierChecks\n*L\n1#1,264:1\n1#2:265\n171#3:266\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$1\n*L\n189#1:266\n*E\n"})
    public static final class a extends Lambda implements Function1<FunctionDescriptor, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f82081p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final String invoke(@NotNull FunctionDescriptor $receiver) {
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            List<ValueParameterDescriptor> valueParameters = $receiver.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
            ValueParameterDescriptor valueParameterDescriptor = (ValueParameterDescriptor) CollectionsKt___CollectionsKt.lastOrNull((List) valueParameters);
            boolean z10 = false;
            if (valueParameterDescriptor != null && !DescriptorUtilsKt.declaresOrInheritsDefaultValue(valueParameterDescriptor) && valueParameterDescriptor.getVarargElementType() == null) {
                z10 = true;
            }
            OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
            if (z10) {
                return null;
            }
            return "last parameter should not have a default value or be a vararg";
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    @SourceDebugExtension({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 modifierChecks.kt\norg/jetbrains/kotlin/util/AbstractModifierChecks\n*L\n1#1,264:1\n1747#2,3:265\n171#3:268\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$2\n*L\n203#1:265,3\n203#1:268\n*E\n"})
    public static final class b extends Lambda implements Function1<FunctionDescriptor, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f82082p0 = new b(1);

        /* JADX WARN: Code duplicated, block: B:21:0x005e  */
        /* JADX WARN: Code duplicated, block: B:23:0x0072  */
        /* JADX WARN: Instruction removed from duplicated block: B:23:0x0072, please report this as an issue */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final String invoke(@NotNull FunctionDescriptor $receiver) {
            StringBuilder sb2;
            DeclarationDescriptor containingDeclaration;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
            DeclarationDescriptor containingDeclaration2 = $receiver.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
            if (!(containingDeclaration2 instanceof ClassDescriptor) || !KotlinBuiltIns.isAny((ClassDescriptor) containingDeclaration2)) {
                Collection<? extends FunctionDescriptor> overriddenDescriptors = $receiver.getOverriddenDescriptors();
                Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
                Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                if (!collection.isEmpty()) {
                    Iterator<T> it = collection.iterator();
                    while (it.hasNext()) {
                        DeclarationDescriptor containingDeclaration3 = ((FunctionDescriptor) it.next()).getContainingDeclaration();
                        Intrinsics.checkNotNullExpressionValue(containingDeclaration3, "getContainingDeclaration(...)");
                        if (!(containingDeclaration3 instanceof ClassDescriptor) || !KotlinBuiltIns.isAny((ClassDescriptor) containingDeclaration3)) {
                        }
                    }
                    if (!DescriptorUtilKt.isTypedEqualsInValueClass($receiver)) {
                        sb2 = new StringBuilder("must override ''equals()'' in Any");
                        containingDeclaration = $receiver.getContainingDeclaration();
                        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                        if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                            DescriptorRenderer descriptorRenderer = DescriptorRenderer.SHORT_NAMES_IN_TYPES;
                            DeclarationDescriptor containingDeclaration4 = $receiver.getContainingDeclaration();
                            Intrinsics.checkNotNull(containingDeclaration4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                            SimpleType defaultType = ((ClassDescriptor) containingDeclaration4).getDefaultType();
                            Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
                            sb2.append(" or define ''equals(other: " + descriptorRenderer.renderType(TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType)) + "): Boolean''");
                        }
                        String string = sb2.toString();
                        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                        return string;
                    }
                } else if (!DescriptorUtilKt.isTypedEqualsInValueClass($receiver)) {
                    sb2 = new StringBuilder("must override ''equals()'' in Any");
                    containingDeclaration = $receiver.getContainingDeclaration();
                    Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                        DescriptorRenderer descriptorRenderer2 = DescriptorRenderer.SHORT_NAMES_IN_TYPES;
                        DeclarationDescriptor containingDeclaration5 = $receiver.getContainingDeclaration();
                        Intrinsics.checkNotNull(containingDeclaration5, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                        SimpleType defaultType2 = ((ClassDescriptor) containingDeclaration5).getDefaultType();
                        Intrinsics.checkNotNullExpressionValue(defaultType2, "getDefaultType(...)");
                        sb2.append(" or define ''equals(other: " + descriptorRenderer2.renderType(TypeUtilsKt.replaceArgumentsWithStarProjections(defaultType2)) + "): Boolean''");
                    }
                    String string2 = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    return string2;
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: modifierChecks.kt */
    @SourceDebugExtension({"SMAP\nmodifierChecks.kt\nKotlin\n*S Kotlin\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$3\n+ 2 modifierChecks.kt\norg/jetbrains/kotlin/util/AbstractModifierChecks\n*L\n1#1,264:1\n171#2:265\n*S KotlinDebug\n*F\n+ 1 modifierChecks.kt\norg/jetbrains/kotlin/util/OperatorChecks$checks$3\n*L\n220#1:265\n*E\n"})
    public static final class c extends Lambda implements Function1<FunctionDescriptor, String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f82083p0 = new c(1);

        /* JADX WARN: Code duplicated, block: B:11:0x0028  */
        /* JADX WARN: Code duplicated, block: B:14:0x0030  */
        @Override // kotlin.jvm.functions.Function1
        @Nullable
        public final String invoke(@NotNull FunctionDescriptor $receiver) {
            boolean z10;
            Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
            ReceiverParameterDescriptor dispatchReceiverParameter = $receiver.getDispatchReceiverParameter();
            if (dispatchReceiverParameter == null) {
                dispatchReceiverParameter = $receiver.getExtensionReceiverParameter();
            }
            OperatorChecks operatorChecks = OperatorChecks.INSTANCE;
            if (dispatchReceiverParameter == null) {
                z10 = false;
            } else {
                KotlinType returnType = $receiver.getReturnType();
                if (returnType != null) {
                    KotlinType type = dispatchReceiverParameter.getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (!TypeUtilsKt.isSubtypeOf(returnType, type)) {
                        if (OperatorChecks.access$incDecCheckForExpectClass(operatorChecks, $receiver, dispatchReceiverParameter)) {
                            z10 = false;
                        }
                    }
                } else if (OperatorChecks.access$incDecCheckForExpectClass(operatorChecks, $receiver, dispatchReceiverParameter)) {
                    z10 = false;
                }
                z10 = true;
            }
            if (z10) {
                return null;
            }
            return "receiver must be a supertype of the return type";
        }
    }

    static {
        Name name = OperatorNameConventions.GET;
        MemberKindCheck.MemberOrExtension memberOrExtension = MemberKindCheck.MemberOrExtension.INSTANCE;
        Check[] checkArr = {memberOrExtension, new ValueParameterCountCheck.AtLeast(1)};
        Name name2 = OperatorNameConventions.SET;
        Check[] checkArr2 = {memberOrExtension, new ValueParameterCountCheck.AtLeast(2)};
        Name name3 = OperatorNameConventions.GET_VALUE;
        kotlin.reflect.jvm.internal.impl.util.b bVar = kotlin.reflect.jvm.internal.impl.util.b.f82096a;
        kotlin.reflect.jvm.internal.impl.util.a aVar = kotlin.reflect.jvm.internal.impl.util.a.f82095a;
        Name name4 = OperatorNameConventions.CONTAINS;
        ValueParameterCountCheck.SingleValueParameter singleValueParameter = ValueParameterCountCheck.SingleValueParameter.INSTANCE;
        ReturnsCheck.ReturnsBoolean returnsBoolean = ReturnsCheck.ReturnsBoolean.INSTANCE;
        Name name5 = OperatorNameConventions.ITERATOR;
        ValueParameterCountCheck.NoValueParameters noValueParameters = ValueParameterCountCheck.NoValueParameters.INSTANCE;
        f82080a = CollectionsKt__CollectionsKt.listOf((Object[]) new Checks[]{new Checks(name, checkArr, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name2, checkArr2, a.f82081p0), new Checks(name3, new Check[]{memberOrExtension, bVar, new ValueParameterCountCheck.AtLeast(2), aVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.SET_VALUE, new Check[]{memberOrExtension, bVar, new ValueParameterCountCheck.AtLeast(3), aVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.PROVIDE_DELEGATE, new Check[]{memberOrExtension, bVar, new ValueParameterCountCheck.Equals(2), aVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.INVOKE, new Check[]{memberOrExtension}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name4, new Check[]{memberOrExtension, singleValueParameter, bVar, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(name5, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.NEXT, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.HAS_NEXT, new Check[]{memberOrExtension, noValueParameters, returnsBoolean}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.RANGE_TO, new Check[]{memberOrExtension, singleValueParameter, bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.RANGE_UNTIL, new Check[]{memberOrExtension, singleValueParameter, bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.EQUALS, new Check[]{MemberKindCheck.Member.INSTANCE}, b.f82082p0), new Checks(OperatorNameConventions.COMPARE_TO, new Check[]{memberOrExtension, ReturnsCheck.ReturnsInt.INSTANCE, singleValueParameter, bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.BINARY_OPERATION_NAMES, new Check[]{memberOrExtension, singleValueParameter, bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.SIMPLE_UNARY_OPERATION_NAMES, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(CollectionsKt__CollectionsKt.listOf((Object[]) new Name[]{OperatorNameConventions.INC, OperatorNameConventions.DEC}), new Check[]{memberOrExtension}, c.f82083p0), new Checks(OperatorNameConventions.ASSIGNMENT_OPERATIONS, new Check[]{memberOrExtension, ReturnsCheck.ReturnsUnit.INSTANCE, singleValueParameter, bVar}, (Function1) null, 4, (DefaultConstructorMarker) null), new Checks(OperatorNameConventions.COMPONENT_REGEX, new Check[]{memberOrExtension, noValueParameters}, (Function1) null, 4, (DefaultConstructorMarker) null)});
    }

    public static final boolean access$incDecCheckForExpectClass(OperatorChecks operatorChecks, FunctionDescriptor functionDescriptor, ReceiverParameterDescriptor receiverParameterDescriptor) {
        ClassId classId;
        KotlinType returnType;
        operatorChecks.getClass();
        ReceiverValue value = receiverParameterDescriptor.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        if (!(value instanceof ImplicitClassReceiver)) {
            return false;
        }
        ClassDescriptor classDescriptor = ((ImplicitClassReceiver) value).getClassDescriptor();
        if (!classDescriptor.isExpect() || (classId = DescriptorUtilsKt.getClassId(classDescriptor)) == null) {
            return false;
        }
        ClassifierDescriptor classifierDescriptorFindClassifierAcrossModuleDependencies = FindClassInModuleKt.findClassifierAcrossModuleDependencies(DescriptorUtilsKt.getModule(classDescriptor), classId);
        TypeAliasDescriptor typeAliasDescriptor = classifierDescriptorFindClassifierAcrossModuleDependencies instanceof TypeAliasDescriptor ? (TypeAliasDescriptor) classifierDescriptorFindClassifierAcrossModuleDependencies : null;
        if (typeAliasDescriptor == null || (returnType = functionDescriptor.getReturnType()) == null) {
            return false;
        }
        return TypeUtilsKt.isSubtypeOf(returnType, typeAliasDescriptor.getExpandedType());
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.AbstractModifierChecks
    @NotNull
    public List<Checks> getChecks$descriptors() {
        return f82080a;
    }
}
