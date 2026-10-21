package kotlin.reflect.jvm.internal.calls;

import bk.d;
import bk.g;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.MultiFieldValueClassRepresentation;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.VariableDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.ClassMapperLite;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ValueClassAwareCaller.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u001a\u0018\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001a6\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\n\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\b*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000\u001a\u0018\u0010\u0011\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001a\u0014\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u0004\u0018\u00010\u0012H\u0000\u001a\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0000\"\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u0016*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lkotlin/reflect/jvm/internal/impl/descriptors/ClassifierDescriptor;", "", "toJvmDescriptor", "Lkotlin/reflect/jvm/internal/impl/types/SimpleType;", "type", "", "Ljava/lang/reflect/Method;", "getMfvcUnboxMethods", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "", "isDefault", "createValueClassAwareCallerIfNeeded", "Ljava/lang/Class;", "getInlineClassUnboxMethod", "Lkotlin/reflect/jvm/internal/impl/descriptors/DeclarationDescriptor;", "toInlineClass", "", "coerceToExpectedReceiverType", "Lkotlin/reflect/jvm/internal/impl/types/KotlinType;", "getExpectedReceiverType", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;)Lorg/jetbrains/kotlin/types/KotlinType;", "expectedReceiverType", "kotlin-reflection"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,363:1\n1#2:364\n1549#3:365\n1620#3,3:366\n1549#3:369\n1620#3,3:370\n1620#3,3:373\n1747#3,3:376\n1747#3,3:379\n1360#3:382\n1446#3,2:383\n1549#3:385\n1620#3,3:386\n1448#3,3:389\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCallerKt\n*L\n252#1:365\n252#1:366,3\n254#1:369\n254#1:370,3\n290#1:373,3\n299#1:376,3\n300#1:379,3\n247#1:382\n247#1:383,2\n248#1:385\n248#1:386,3\n247#1:389,3\n*E\n"})
public final class ValueClassAwareCallerKt {
    public static final KotlinType a(CallableMemberDescriptor callableMemberDescriptor) {
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        ReceiverParameterDescriptor dispatchReceiverParameter = callableMemberDescriptor.getDispatchReceiverParameter();
        if (extensionReceiverParameter != null) {
            return extensionReceiverParameter.getType();
        }
        if (dispatchReceiverParameter != null) {
            if (callableMemberDescriptor instanceof ConstructorDescriptor) {
                return dispatchReceiverParameter.getType();
            }
            DeclarationDescriptor containingDeclaration = callableMemberDescriptor.getContainingDeclaration();
            ClassDescriptor classDescriptor = containingDeclaration instanceof ClassDescriptor ? (ClassDescriptor) containingDeclaration : null;
            if (classDescriptor != null) {
                return classDescriptor.getDefaultType();
            }
        }
        return null;
    }

    public static final void access$checkParametersSize(Caller caller, int i10, CallableMemberDescriptor callableMemberDescriptor, boolean z10) {
        if (CallerKt.getArity(caller) == i10) {
            return;
        }
        throw new KotlinReflectionInternalError("Inconsistent number of parameters in the descriptor and Java reflection object: " + CallerKt.getArity(caller) + " != " + i10 + "\nCalling: " + callableMemberDescriptor + "\nParameter types: " + caller.getParameterTypes() + ")\nDefault: " + z10);
    }

    public static final Method access$getBoxMethod(Class cls, CallableMemberDescriptor callableMemberDescriptor) {
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", getInlineClassUnboxMethod(cls, callableMemberDescriptor).getReturnType());
            Intrinsics.checkNotNull(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + callableMemberDescriptor + RootService.CLOSE_BRACKET);
        }
    }

    public static final List access$getValueClassUnboxMethods(SimpleType simpleType, CallableMemberDescriptor callableMemberDescriptor) {
        Method inlineClassUnboxMethod;
        List<Method> mfvcUnboxMethods = getMfvcUnboxMethods(simpleType);
        if (mfvcUnboxMethods != null) {
            return mfvcUnboxMethods;
        }
        Class<?> clsC = c(simpleType);
        if (clsC == null || (inlineClassUnboxMethod = getInlineClassUnboxMethod(clsC, callableMemberDescriptor)) == null) {
            return null;
        }
        return d.listOf(inlineClassUnboxMethod);
    }

    public static final List access$makeKotlinParameterTypes(CallableMemberDescriptor callableMemberDescriptor, Function1 function1) {
        ArrayList arrayList = new ArrayList();
        ReceiverParameterDescriptor extensionReceiverParameter = callableMemberDescriptor.getExtensionReceiverParameter();
        KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
        if (type != null) {
            arrayList.add(type);
        } else if (callableMemberDescriptor instanceof ConstructorDescriptor) {
            ClassDescriptor constructedClass = ((ConstructorDescriptor) callableMemberDescriptor).getConstructedClass();
            Intrinsics.checkNotNullExpressionValue(constructedClass, "getConstructedClass(...)");
            if (constructedClass.isInner()) {
                DeclarationDescriptor containingDeclaration = constructedClass.getContainingDeclaration();
                Intrinsics.checkNotNull(containingDeclaration, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                arrayList.add(((ClassDescriptor) containingDeclaration).getDefaultType());
            }
        } else {
            DeclarationDescriptor containingDeclaration2 = callableMemberDescriptor.getContainingDeclaration();
            Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
            if ((containingDeclaration2 instanceof ClassDescriptor) && ((Boolean) function1.invoke(containingDeclaration2)).booleanValue()) {
                arrayList.add(((ClassDescriptor) containingDeclaration2).getDefaultType());
            }
        }
        List<ValueParameterDescriptor> valueParameters = callableMemberDescriptor.getValueParameters();
        Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
        Iterator<T> it = valueParameters.iterator();
        while (it.hasNext()) {
            arrayList.add(((ValueParameterDescriptor) it.next()).getType());
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public static final ArrayList b(SimpleType simpleType) {
        ?? ListOf;
        if (!InlineClassesUtilsKt.needsMfvcFlattening(simpleType)) {
            return null;
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = simpleType.getConstructor().mo5778getDeclarationDescriptor();
        Intrinsics.checkNotNull(classifierDescriptorMo5778getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        MultiFieldValueClassRepresentation<SimpleType> multiFieldValueClassRepresentation = DescriptorUtilsKt.getMultiFieldValueClassRepresentation((ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
        Intrinsics.checkNotNull(multiFieldValueClassRepresentation);
        Iterable<Pair> underlyingPropertyNamesToTypes = multiFieldValueClassRepresentation.getUnderlyingPropertyNamesToTypes();
        ArrayList arrayList = new ArrayList();
        for (Pair pair : underlyingPropertyNamesToTypes) {
            Name name = (Name) pair.component1();
            ArrayList arrayListB = b((SimpleType) pair.component2());
            if (arrayListB != null) {
                ListOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayListB, 10));
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    ListOf.add(name.getIdentifier() + '-' + ((String) it.next()));
                }
            } else {
                ListOf = d.listOf(name.getIdentifier());
            }
            g.addAll(arrayList, (Iterable) ListOf);
        }
        return arrayList;
    }

    public static final Class<?> c(KotlinType kotlinType) {
        Class<?> inlineClass = toInlineClass(kotlinType.getConstructor().mo5778getDeclarationDescriptor());
        if (inlineClass == null) {
            return null;
        }
        if (!TypeUtils.isNullableType(kotlinType)) {
            return inlineClass;
        }
        KotlinType kotlinTypeUnsubstitutedUnderlyingType = InlineClassesUtilsKt.unsubstitutedUnderlyingType(kotlinType);
        if (kotlinTypeUnsubstitutedUnderlyingType == null || TypeUtils.isNullableType(kotlinTypeUnsubstitutedUnderlyingType) || KotlinBuiltIns.isPrimitiveType(kotlinTypeUnsubstitutedUnderlyingType)) {
            return null;
        }
        return inlineClass;
    }

    @Nullable
    public static final Object coerceToExpectedReceiverType(@Nullable Object obj, @NotNull CallableMemberDescriptor descriptor) {
        KotlinType kotlinTypeA;
        Class<?> clsC;
        Method inlineClassUnboxMethod;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return (((descriptor instanceof PropertyDescriptor) && InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass((VariableDescriptor) descriptor)) || (kotlinTypeA = a(descriptor)) == null || (clsC = c(kotlinTypeA)) == null || (inlineClassUnboxMethod = getInlineClassUnboxMethod(clsC, descriptor)) == null) ? obj : inlineClassUnboxMethod.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:23:0x006c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0087  */
    /* JADX WARN: Code duplicated, block: B:31:0x008e  */
    /* JADX WARN: Code duplicated, block: B:38:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:? A[LOOP:0: B:21:0x0066->B:39:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <M extends Member> Caller<M> createValueClassAwareCallerIfNeeded(@NotNull Caller<? extends M> caller, @NotNull CallableMemberDescriptor descriptor, boolean z10) {
        List<ValueParameterDescriptor> list;
        Iterator<T> it;
        KotlinType type;
        KotlinType returnType;
        KotlinType kotlinTypeA;
        Intrinsics.checkNotNullParameter(caller, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(descriptor)) {
            List<ReceiverParameterDescriptor> contextReceiverParameters = descriptor.getContextReceiverParameters();
            Intrinsics.checkNotNullExpressionValue(contextReceiverParameters, "getContextReceiverParameters(...)");
            List<ReceiverParameterDescriptor> list2 = contextReceiverParameters;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                List<ValueParameterDescriptor> valueParameters = descriptor.getValueParameters();
                Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                list = valueParameters;
                if (!(list instanceof Collection)) {
                    it = list.iterator();
                    while (it.hasNext()) {
                        type = ((ValueParameterDescriptor) it.next()).getType();
                        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                        if (InlineClassesUtilsKt.isValueClassType(type)) {
                        }
                    }
                    returnType = descriptor.getReturnType();
                    if (returnType != null) {
                    }
                }
                it = list.iterator();
                while (it.hasNext()) {
                    type = ((ValueParameterDescriptor) it.next()).getType();
                    Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                    if (InlineClassesUtilsKt.isValueClassType(type)) {
                    }
                }
                returnType = descriptor.getReturnType();
                if (returnType != null) {
                }
            }
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                KotlinType type2 = ((ReceiverParameterDescriptor) it2.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                if (InlineClassesUtilsKt.isValueClassType(type2)) {
                }
            }
            List<ValueParameterDescriptor> valueParameters2 = descriptor.getValueParameters();
            Intrinsics.checkNotNullExpressionValue(valueParameters2, "getValueParameters(...)");
            list = valueParameters2;
            if (!(list instanceof Collection) && list.isEmpty()) {
                returnType = descriptor.getReturnType();
                return returnType != null ? caller : caller;
            }
            it = list.iterator();
            while (it.hasNext()) {
                type = ((ValueParameterDescriptor) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                if (InlineClassesUtilsKt.isValueClassType(type)) {
                }
            }
            returnType = descriptor.getReturnType();
            if ((returnType != null || !InlineClassesUtilsKt.isInlineClassType(returnType)) && ((kotlinTypeA = a(descriptor)) == null || !InlineClassesUtilsKt.isValueClassType(kotlinTypeA))) {
                return caller;
            }
        }
        return new ValueClassAwareCaller(descriptor, caller, z10);
    }

    public static /* synthetic */ Caller createValueClassAwareCallerIfNeeded$default(Caller caller, CallableMemberDescriptor callableMemberDescriptor, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return createValueClassAwareCallerIfNeeded(caller, callableMemberDescriptor, z10);
    }

    @NotNull
    public static final Method getInlineClassUnboxMethod(@NotNull Class<?> cls, @NotNull CallableMemberDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            Intrinsics.checkNotNull(declaredMethod);
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + RootService.CLOSE_BRACKET);
        }
    }

    @Nullable
    public static final List<Method> getMfvcUnboxMethods(@NotNull SimpleType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        ArrayList arrayListB = b(TypeSubstitutionKt.asSimpleType(type));
        if (arrayListB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayListB, 10));
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            arrayList.add("unbox-impl-" + ((String) it.next()));
        }
        ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = type.getConstructor().mo5778getDeclarationDescriptor();
        Intrinsics.checkNotNull(classifierDescriptorMo5778getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        Class<?> javaClass = UtilKt.toJavaClass((ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor);
        Intrinsics.checkNotNull(javaClass);
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(javaClass.getDeclaredMethod((String) it2.next(), new Class[0]));
        }
        return arrayList2;
    }

    @Nullable
    public static final Class<?> toInlineClass(@Nullable DeclarationDescriptor declarationDescriptor) {
        if (!(declarationDescriptor instanceof ClassDescriptor) || !InlineClassesUtilsKt.isInlineClass(declarationDescriptor)) {
            return null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) declarationDescriptor;
        Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
        if (javaClass != null) {
            return javaClass;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + classDescriptor.getName() + " cannot be found (classId=" + DescriptorUtilsKt.getClassId((ClassifierDescriptor) declarationDescriptor) + RootService.CLOSE_BRACKET);
    }

    @NotNull
    public static final String toJvmDescriptor(@NotNull ClassifierDescriptor classifierDescriptor) {
        Intrinsics.checkNotNullParameter(classifierDescriptor, "<this>");
        ClassId classId = DescriptorUtilsKt.getClassId(classifierDescriptor);
        Intrinsics.checkNotNull(classId);
        String strAsString = classId.asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return ClassMapperLite.mapClass(strAsString);
    }
}
