package kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.CloneableClassScope;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaConstructor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaField;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMethod;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.sources.JavaSourceElement;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaElement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.protobuf.MessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006J\u0012\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u0006\u0012\u0002\b\u00030\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lkotlin/reflect/jvm/internal/RuntimeTypeMapper;", "", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "possiblySubstitutedFunction", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature;", "mapSignature", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "possiblyOverriddenProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "mapPropertySignature", "Ljava/lang/Class;", "klass", "Lkotlin/reflect/jvm/internal/impl/name/ClassId;", "mapJvmClassToKotlinClassId", "Lkotlin/reflect/jvm/internal/impl/builtins/PrimitiveType;", "getPrimitiveType", "(Ljava/lang/Class;)Lorg/jetbrains/kotlin/builtins/PrimitiveType;", "primitiveType", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/RuntimeTypeMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
public final class RuntimeTypeMapper {

    @NotNull
    public static final RuntimeTypeMapper INSTANCE = new RuntimeTypeMapper();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ClassId f80036a;

    static {
        ClassId classId = ClassId.topLevel(new FqName("java.lang.Void"));
        Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
        f80036a = classId;
    }

    public static JvmFunctionSignature.KotlinFunction a(FunctionDescriptor functionDescriptor) {
        String jvmMethodNameIfSpecial = SpecialBuiltinMembers.getJvmMethodNameIfSpecial(functionDescriptor);
        if (jvmMethodNameIfSpecial == null) {
            if (functionDescriptor instanceof PropertyGetterDescriptor) {
                String strAsString = DescriptorUtilsKt.getPropertyIfAccessor(functionDescriptor).getName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
                jvmMethodNameIfSpecial = JvmAbi.getterName(strAsString);
            } else if (functionDescriptor instanceof PropertySetterDescriptor) {
                String strAsString2 = DescriptorUtilsKt.getPropertyIfAccessor(functionDescriptor).getName().asString();
                Intrinsics.checkNotNullExpressionValue(strAsString2, "asString(...)");
                jvmMethodNameIfSpecial = JvmAbi.setterName(strAsString2);
            } else {
                jvmMethodNameIfSpecial = functionDescriptor.getName().asString();
                Intrinsics.checkNotNullExpressionValue(jvmMethodNameIfSpecial, "asString(...)");
            }
        }
        return new JvmFunctionSignature.KotlinFunction(new JvmMemberSignature.Method(jvmMethodNameIfSpecial, MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 1, null)));
    }

    @NotNull
    public final ClassId mapJvmClassToKotlinClassId(@NotNull Class<?> klass) {
        PrimitiveType primitiveType;
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            primitiveType = componentType.isPrimitive() ? JvmPrimitiveType.get(componentType.getSimpleName()).getPrimitiveType() : null;
            if (primitiveType != null) {
                return new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getArrayTypeName());
            }
            ClassId classId = ClassId.topLevel(StandardNames.FqNames.array.toSafe());
            Intrinsics.checkNotNullExpressionValue(classId, "topLevel(...)");
            return classId;
        }
        if (Intrinsics.areEqual(klass, Void.TYPE)) {
            return f80036a;
        }
        primitiveType = klass.isPrimitive() ? JvmPrimitiveType.get(klass.getSimpleName()).getPrimitiveType() : null;
        if (primitiveType != null) {
            return new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getTypeName());
        }
        ClassId classId2 = ReflectClassUtilKt.getClassId(klass);
        if (!classId2.isLocal()) {
            JavaToKotlinClassMap javaToKotlinClassMap = JavaToKotlinClassMap.INSTANCE;
            FqName fqNameAsSingleFqName = classId2.asSingleFqName();
            Intrinsics.checkNotNullExpressionValue(fqNameAsSingleFqName, "asSingleFqName(...)");
            ClassId classIdMapJavaToKotlin = javaToKotlinClassMap.mapJavaToKotlin(fqNameAsSingleFqName);
            if (classIdMapJavaToKotlin != null) {
                return classIdMapJavaToKotlin;
            }
        }
        return classId2;
    }

    @NotNull
    public final JvmPropertySignature mapPropertySignature(@NotNull PropertyDescriptor possiblyOverriddenProperty) {
        Intrinsics.checkNotNullParameter(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        PropertyDescriptor original = ((PropertyDescriptor) DescriptorUtils.unwrapFakeOverride(possiblyOverriddenProperty)).getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
        if (original instanceof DeserializedPropertyDescriptor) {
            DeserializedPropertyDescriptor deserializedPropertyDescriptor = (DeserializedPropertyDescriptor) original;
            ProtoBuf.Property proto = deserializedPropertyDescriptor.getProto();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.propertySignature;
            Intrinsics.checkNotNullExpressionValue(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) ProtoBufUtilKt.getExtensionOrNull(proto, propertySignature);
            if (jvmPropertySignature != null) {
                return new JvmPropertySignature.KotlinProperty(original, proto, jvmPropertySignature, deserializedPropertyDescriptor.getNameResolver(), deserializedPropertyDescriptor.getTypeTable());
            }
        } else if (original instanceof JavaPropertyDescriptor) {
            SourceElement source = ((JavaPropertyDescriptor) original).getSource();
            JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
            JavaElement javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
            if (javaElement instanceof ReflectJavaField) {
                return new JvmPropertySignature.JavaField(((ReflectJavaField) javaElement).getMember());
            }
            if (!(javaElement instanceof ReflectJavaMethod)) {
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + original + " (source = " + javaElement + RootService.CLOSE_BRACKET);
            }
            Method member = ((ReflectJavaMethod) javaElement).getMember();
            PropertySetterDescriptor setter = original.getSetter();
            SourceElement source2 = setter != null ? setter.getSource() : null;
            JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
            JavaElement javaElement2 = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
            ReflectJavaMethod reflectJavaMethod = javaElement2 instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElement2 : null;
            return new JvmPropertySignature.JavaMethodProperty(member, reflectJavaMethod != null ? reflectJavaMethod.getMember() : null);
        }
        PropertyGetterDescriptor getter = original.getGetter();
        Intrinsics.checkNotNull(getter);
        JvmFunctionSignature.KotlinFunction kotlinFunctionA = a(getter);
        PropertySetterDescriptor setter2 = original.getSetter();
        return new JvmPropertySignature.MappedKotlinProperty(kotlinFunctionA, setter2 != null ? a(setter2) : null);
    }

    @NotNull
    public final JvmFunctionSignature mapSignature(@NotNull FunctionDescriptor possiblySubstitutedFunction) {
        Method member;
        JvmMemberSignature.Method jvmConstructorSignature;
        JvmMemberSignature.Method jvmMethodSignature;
        Intrinsics.checkNotNullParameter(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        FunctionDescriptor original = ((FunctionDescriptor) DescriptorUtils.unwrapFakeOverride(possiblySubstitutedFunction)).getOriginal();
        Intrinsics.checkNotNullExpressionValue(original, "getOriginal(...)");
        if (!(original instanceof DeserializedCallableMemberDescriptor)) {
            if (original instanceof JavaMethodDescriptor) {
                SourceElement source = ((JavaMethodDescriptor) original).getSource();
                JavaSourceElement javaSourceElement = source instanceof JavaSourceElement ? (JavaSourceElement) source : null;
                JavaElement javaElement = javaSourceElement != null ? javaSourceElement.getJavaElement() : null;
                ReflectJavaMethod reflectJavaMethod = javaElement instanceof ReflectJavaMethod ? (ReflectJavaMethod) javaElement : null;
                if (reflectJavaMethod != null && (member = reflectJavaMethod.getMember()) != null) {
                    return new JvmFunctionSignature.JavaMethod(member);
                }
                throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + original);
            }
            if (!(original instanceof JavaClassConstructorDescriptor)) {
                if (DescriptorFactory.isEnumValueOfMethod(original) || DescriptorFactory.isEnumValuesMethod(original) || (Intrinsics.areEqual(original.getName(), CloneableClassScope.Companion.getCLONE_NAME()) && original.getValueParameters().isEmpty())) {
                    return a(original);
                }
                throw new KotlinReflectionInternalError("Unknown origin of " + original + " (" + original.getClass() + RootService.CLOSE_BRACKET);
            }
            SourceElement source2 = ((JavaClassConstructorDescriptor) original).getSource();
            JavaSourceElement javaSourceElement2 = source2 instanceof JavaSourceElement ? (JavaSourceElement) source2 : null;
            JavaElement javaElement2 = javaSourceElement2 != null ? javaSourceElement2.getJavaElement() : null;
            if (javaElement2 instanceof ReflectJavaConstructor) {
                return new JvmFunctionSignature.JavaConstructor(((ReflectJavaConstructor) javaElement2).getMember());
            }
            if (javaElement2 instanceof ReflectJavaClass) {
                ReflectJavaClass reflectJavaClass = (ReflectJavaClass) javaElement2;
                if (reflectJavaClass.isAnnotationType()) {
                    return new JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.getElement());
                }
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + original + " (" + javaElement2 + RootService.CLOSE_BRACKET);
        }
        DeserializedCallableMemberDescriptor deserializedCallableMemberDescriptor = (DeserializedCallableMemberDescriptor) original;
        MessageLite proto = deserializedCallableMemberDescriptor.getProto();
        if ((proto instanceof ProtoBuf.Function) && (jvmMethodSignature = JvmProtoBufUtil.INSTANCE.getJvmMethodSignature((ProtoBuf.Function) proto, deserializedCallableMemberDescriptor.getNameResolver(), deserializedCallableMemberDescriptor.getTypeTable())) != null) {
            return new JvmFunctionSignature.KotlinFunction(jvmMethodSignature);
        }
        if (!(proto instanceof ProtoBuf.Constructor) || (jvmConstructorSignature = JvmProtoBufUtil.INSTANCE.getJvmConstructorSignature((ProtoBuf.Constructor) proto, deserializedCallableMemberDescriptor.getNameResolver(), deserializedCallableMemberDescriptor.getTypeTable())) == null) {
            return a(original);
        }
        DeclarationDescriptor containingDeclaration = possiblySubstitutedFunction.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
        if (InlineClassesUtilsKt.isInlineClass(containingDeclaration)) {
            return new JvmFunctionSignature.KotlinFunction(jvmConstructorSignature);
        }
        DeclarationDescriptor containingDeclaration2 = possiblySubstitutedFunction.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration2, "getContainingDeclaration(...)");
        if (!InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration2)) {
            return new JvmFunctionSignature.KotlinConstructor(jvmConstructorSignature);
        }
        ConstructorDescriptor constructorDescriptor = (ConstructorDescriptor) possiblySubstitutedFunction;
        if (constructorDescriptor.isPrimary()) {
            if (!Intrinsics.areEqual(jvmConstructorSignature.getName(), "constructor-impl") || !l.endsWith$default(jvmConstructorSignature.getDesc(), ")V", false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
            }
        } else {
            if (!Intrinsics.areEqual(jvmConstructorSignature.getName(), "constructor-impl")) {
                throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
            }
            ClassDescriptor constructedClass = constructorDescriptor.getConstructedClass();
            Intrinsics.checkNotNullExpressionValue(constructedClass, "getConstructedClass(...)");
            String jvmDescriptor = ValueClassAwareCallerKt.toJvmDescriptor(constructedClass);
            if (l.endsWith$default(jvmConstructorSignature.getDesc(), ")V", false, 2, null)) {
                jvmConstructorSignature = JvmMemberSignature.Method.copy$default(jvmConstructorSignature, null, StringsKt__StringsKt.removeSuffix(jvmConstructorSignature.getDesc(), (CharSequence) ExifInterface.GPS_MEASUREMENT_INTERRUPTED) + jvmDescriptor, 1, null);
            } else if (!l.endsWith$default(jvmConstructorSignature.getDesc(), jvmDescriptor, false, 2, null)) {
                throw new IllegalArgumentException(("Invalid signature: " + jvmConstructorSignature).toString());
            }
        }
        return new JvmFunctionSignature.KotlinFunction(jvmConstructorSignature);
    }
}
