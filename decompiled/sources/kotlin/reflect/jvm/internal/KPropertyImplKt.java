package kotlin.reflect.jvm.internal;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.InternalUnderlyingValOfInlineClass;
import kotlin.reflect.jvm.internal.calls.ThrowingCaller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KPropertyImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\"\"\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "getBoundReceiver", "(Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;)Ljava/lang/Object;", "boundReceiver", "kotlin-reflection"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nKPropertyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPropertyImpl.kt\nkotlin/reflect/jvm/internal/KPropertyImplKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
public final class KPropertyImplKt {
    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0093  */
    /* JADX WARN: Code duplicated, block: B:30:0x0099  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c8  */
    public static final CallerImpl<Field> a(KPropertyImpl.Accessor<?, ?> accessor, boolean z10, Field field) {
        CallerImpl<Field> jvmStaticInObject;
        PropertyDescriptor descriptor = accessor.getProperty().getDescriptor();
        DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
        Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
        if (DescriptorUtils.isCompanionObject(containingDeclaration)) {
            DeclarationDescriptor containingDeclaration2 = containingDeclaration.getContainingDeclaration();
            if ((DescriptorUtils.isInterface(containingDeclaration2) || DescriptorUtils.isAnnotationClass(containingDeclaration2)) && (!(descriptor instanceof DeserializedPropertyDescriptor) || !JvmProtoBufUtil.isMovedFromInterfaceCompanion(((DeserializedPropertyDescriptor) descriptor).getProto()))) {
                if (Modifier.isStatic(field.getModifiers())) {
                    if (accessor.getProperty().getDescriptor().getAnnotations().hasAnnotation(UtilKt.getJVM_STATIC())) {
                        if (z10) {
                        }
                    }
                    if (z10) {
                        if (accessor.isBound()) {
                        }
                    }
                    if (accessor.isBound()) {
                        jvmStaticInObject = new CallerImpl.FieldGetter.BoundJvmStaticInObject(field);
                    } else {
                        jvmStaticInObject = new CallerImpl.FieldGetter.JvmStaticInObject(field);
                    }
                    return jvmStaticInObject;
                }
            }
        } else if (Modifier.isStatic(field.getModifiers())) {
            if (accessor.getProperty().getDescriptor().getAnnotations().hasAnnotation(UtilKt.getJVM_STATIC())) {
                return z10 ? new CallerImpl.FieldGetter.Static(field) : new CallerImpl.FieldSetter.Static(field, b(accessor));
            }
            if (z10) {
                return accessor.isBound() ? new CallerImpl.FieldSetter.BoundJvmStaticInObject(field, b(accessor)) : new CallerImpl.FieldSetter.JvmStaticInObject(field, b(accessor));
            }
            if (accessor.isBound()) {
                jvmStaticInObject = new CallerImpl.FieldGetter.BoundJvmStaticInObject(field);
            } else {
                jvmStaticInObject = new CallerImpl.FieldGetter.JvmStaticInObject(field);
            }
            return jvmStaticInObject;
        }
        if (z10) {
            return accessor.isBound() ? new CallerImpl.FieldGetter.BoundInstance(field, getBoundReceiver(accessor)) : new CallerImpl.FieldGetter.Instance(field);
        }
        return accessor.isBound() ? new CallerImpl.FieldSetter.BoundInstance(field, b(accessor), getBoundReceiver(accessor)) : new CallerImpl.FieldSetter.Instance(field, b(accessor));
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    public static final Caller access$computeCallerForAccessor(KPropertyImpl.Accessor accessor, boolean z10) throws ClassNotFoundException {
        JvmFunctionSignature.KotlinFunction setterSignature;
        Method setterMethod;
        Caller boundInstance;
        JvmProtoBuf.JvmMethodSignature setter;
        Caller boundStatic;
        Method inlineClassUnboxMethod;
        if (KDeclarationContainerImpl.INSTANCE.getLOCAL_PROPERTY_SIGNATURE$kotlin_reflection().matches(accessor.getProperty().getSignature())) {
            return ThrowingCaller.INSTANCE;
        }
        JvmPropertySignature jvmPropertySignatureMapPropertySignature = RuntimeTypeMapper.INSTANCE.mapPropertySignature(accessor.getProperty().getDescriptor());
        if (jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureMapPropertySignature;
            JvmProtoBuf.JvmPropertySignature f79871c = kotlinProperty.getF79871c();
            if (z10) {
                if (f79871c.hasGetter()) {
                    setter = f79871c.getGetter();
                } else {
                    setter = null;
                }
            } else if (f79871c.hasSetter()) {
                setter = f79871c.getSetter();
            } else {
                setter = null;
            }
            Method methodFindMethodBySignature = setter != null ? accessor.getProperty().getContainer().findMethodBySignature(kotlinProperty.getF79872d().getString(setter.getName()), kotlinProperty.getF79872d().getString(setter.getDesc())) : null;
            if (methodFindMethodBySignature != null) {
                if (!Modifier.isStatic(methodFindMethodBySignature.getModifiers())) {
                    boundStatic = accessor.isBound() ? new CallerImpl.Method.BoundInstance(methodFindMethodBySignature, getBoundReceiver(accessor)) : new CallerImpl.Method.Instance(methodFindMethodBySignature);
                } else if (accessor.getProperty().getDescriptor().getAnnotations().hasAnnotation(UtilKt.getJVM_STATIC())) {
                    boundStatic = accessor.isBound() ? new CallerImpl.Method.BoundJvmStaticInObject(methodFindMethodBySignature) : new CallerImpl.Method.JvmStaticInObject(methodFindMethodBySignature);
                } else {
                    boundStatic = accessor.isBound() ? new CallerImpl.Method.BoundStatic(methodFindMethodBySignature, getBoundReceiver(accessor)) : new CallerImpl.Method.Static(methodFindMethodBySignature);
                }
                boundInstance = boundStatic;
            } else if (InlineClassesUtilsKt.isUnderlyingPropertyOfInlineClass(accessor.getProperty().getDescriptor()) && Intrinsics.areEqual(accessor.getProperty().getDescriptor().getVisibility(), DescriptorVisibilities.INTERNAL)) {
                Class<?> inlineClass = ValueClassAwareCallerKt.toInlineClass(accessor.getProperty().getDescriptor().getContainingDeclaration());
                if (inlineClass == null || (inlineClassUnboxMethod = ValueClassAwareCallerKt.getInlineClassUnboxMethod(inlineClass, accessor.getProperty().getDescriptor())) == null) {
                    throw new KotlinReflectionInternalError("Underlying property of inline class " + accessor.getProperty() + " should have a field");
                }
                boundInstance = accessor.isBound() ? new InternalUnderlyingValOfInlineClass.Bound(inlineClassUnboxMethod, getBoundReceiver(accessor)) : new InternalUnderlyingValOfInlineClass.Unbound(inlineClassUnboxMethod);
            } else {
                Field javaField = accessor.getProperty().getJavaField();
                if (javaField == null) {
                    throw new KotlinReflectionInternalError("No accessors or field is found for property " + accessor.getProperty());
                }
                boundInstance = a(accessor, z10, javaField);
            }
        } else if (jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.JavaField) {
            boundInstance = a(accessor, z10, ((JvmPropertySignature.JavaField) jvmPropertySignatureMapPropertySignature).getField());
        } else {
            if (!(jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.JavaMethodProperty)) {
                if (!(jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.MappedKotlinProperty)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (z10) {
                    setterSignature = ((JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureMapPropertySignature).getGetterSignature();
                } else {
                    setterSignature = ((JvmPropertySignature.MappedKotlinProperty) jvmPropertySignatureMapPropertySignature).getSetterSignature();
                    if (setterSignature == null) {
                        throw new KotlinReflectionInternalError("No setter found for property " + accessor.getProperty());
                    }
                }
                Method methodFindMethodBySignature2 = accessor.getProperty().getContainer().findMethodBySignature(setterSignature.getMethodName(), setterSignature.getMethodDesc());
                if (methodFindMethodBySignature2 != null) {
                    Modifier.isStatic(methodFindMethodBySignature2.getModifiers());
                    return accessor.isBound() ? new CallerImpl.Method.BoundInstance(methodFindMethodBySignature2, getBoundReceiver(accessor)) : new CallerImpl.Method.Instance(methodFindMethodBySignature2);
                }
                throw new KotlinReflectionInternalError("No accessor found for property " + accessor.getProperty());
            }
            if (z10) {
                setterMethod = ((JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureMapPropertySignature).getGetterMethod();
            } else {
                JvmPropertySignature.JavaMethodProperty javaMethodProperty = (JvmPropertySignature.JavaMethodProperty) jvmPropertySignatureMapPropertySignature;
                setterMethod = javaMethodProperty.getSetterMethod();
                if (setterMethod == null) {
                    throw new KotlinReflectionInternalError("No source found for setter of Java method property: " + javaMethodProperty.getGetterMethod());
                }
            }
            boundInstance = accessor.isBound() ? new CallerImpl.Method.BoundInstance(setterMethod, getBoundReceiver(accessor)) : new CallerImpl.Method.Instance(setterMethod);
        }
        return ValueClassAwareCallerKt.createValueClassAwareCallerIfNeeded$default(boundInstance, accessor.getDescriptor(), false, 2, null);
    }

    public static final boolean b(KPropertyImpl.Accessor<?, ?> accessor) {
        return !TypeUtils.isNullableType(accessor.getProperty().getDescriptor().getType());
    }

    @Nullable
    public static final Object getBoundReceiver(@NotNull KPropertyImpl.Accessor<?, ?> accessor) {
        Intrinsics.checkNotNullParameter(accessor, "<this>");
        return accessor.getProperty().getBoundReceiver();
    }
}
