package kotlin.reflect.jvm.internal;

import androidx.collection.f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.load.java.JvmAbi;
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmPackagePartSource;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.name.NameUtils;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerSource;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedPropertyDescriptor;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0005\u0006\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u0082\u0001\u0004\t\n\u000b\f¨\u0006\r"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "()V", "asString", "", "JavaField", "JavaMethodProperty", "KotlinProperty", "MappedKotlinProperty", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class JvmPropertySignature {

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaField;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "asString", "Ljava/lang/reflect/Field;", "a", "Ljava/lang/reflect/Field;", "getField", "()Ljava/lang/reflect/Field;", "field", "<init>", "(Ljava/lang/reflect/Field;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class JavaField extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Field field;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaField(@NotNull Field field) {
            super(null);
            Intrinsics.checkNotNullParameter(field, "field");
            this.field = field;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* JADX INFO: renamed from: asString */
        public String getF79874f() {
            StringBuilder sb2 = new StringBuilder();
            Field field = this.field;
            String name = field.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb2.append(JvmAbi.getterName(name));
            sb2.append("()");
            Class<?> type = field.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(ReflectClassUtilKt.getDesc(type));
            return sb2.toString();
        }

        @NotNull
        public final Field getField() {
            return this.field;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$JavaMethodProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "asString", "Ljava/lang/reflect/Method;", "a", "Ljava/lang/reflect/Method;", "getGetterMethod", "()Ljava/lang/reflect/Method;", "getterMethod", "b", "getSetterMethod", "setterMethod", "<init>", "(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class JavaMethodProperty extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Method getterMethod;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final Method setterMethod;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public JavaMethodProperty(@NotNull Method getterMethod, @Nullable Method method) {
            super(null);
            Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
            this.getterMethod = getterMethod;
            this.setterMethod = method;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* JADX INFO: renamed from: asString */
        public String getF79874f() {
            return RuntimeTypeMapperKt.access$getSignature(this.getterMethod);
        }

        @NotNull
        public final Method getGetterMethod() {
            return this.getterMethod;
        }

        @Nullable
        public final Method getSetterMethod() {
            return this.setterMethod;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "asString", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/metadata/ProtoBuf$Property;", "proto", "Lkotlin/reflect/jvm/internal/impl/metadata/jvm/JvmProtoBuf$JvmPropertySignature;", "signature", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/NameResolver;", "nameResolver", "Lkotlin/reflect/jvm/internal/impl/metadata/deserialization/TypeTable;", "typeTable", "<init>", "(Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;Lorg/jetbrains/kotlin/metadata/jvm/JvmProtoBuf$JvmPropertySignature;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nRuntimeTypeMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RuntimeTypeMapper.kt\nkotlin/reflect/jvm/internal/JvmPropertySignature$KotlinProperty\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    public static final class KotlinProperty extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final PropertyDescriptor f79869a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final ProtoBuf.Property f79870b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final JvmProtoBuf.JvmPropertySignature f79871c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final NameResolver f79872d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        public final TypeTable f79873e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NotNull
        public final String f79874f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Code duplicated, block: B:26:0x0102  */
        public KotlinProperty(@NotNull PropertyDescriptor descriptor, @NotNull ProtoBuf.Property proto, @NotNull JvmProtoBuf.JvmPropertySignature signature, @NotNull NameResolver nameResolver, @NotNull TypeTable typeTable) {
            String str;
            String strC;
            String string;
            super(null);
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.f79869a = descriptor;
            this.f79870b = proto;
            this.f79871c = signature;
            this.f79872d = nameResolver;
            this.f79873e = typeTable;
            if (signature.hasGetter()) {
                strC = nameResolver.getString(signature.getGetter().getName()) + nameResolver.getString(signature.getGetter().getDesc());
            } else {
                JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, proto, nameResolver, typeTable, false, 8, null);
                if (jvmFieldSignature$default == null) {
                    throw new KotlinReflectionInternalError("No field signature for property: " + descriptor);
                }
                String strComponent1 = jvmFieldSignature$default.component1();
                String strComponent2 = jvmFieldSignature$default.component2();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(JvmAbi.getterName(strComponent1));
                DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                if (Intrinsics.areEqual(descriptor.getVisibility(), DescriptorVisibilities.INTERNAL) && (containingDeclaration instanceof DeserializedClassDescriptor)) {
                    ProtoBuf.Class classProto = ((DeserializedClassDescriptor) containingDeclaration).getClassProto();
                    GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, Integer> classModuleName = JvmProtoBuf.classModuleName;
                    Intrinsics.checkNotNullExpressionValue(classModuleName, "classModuleName");
                    Integer num = (Integer) ProtoBufUtilKt.getExtensionOrNull(classProto, classModuleName);
                    str = Constant.MXN_SYMBOL + NameUtils.sanitizeAsJavaIdentifier((num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string);
                } else if (Intrinsics.areEqual(descriptor.getVisibility(), DescriptorVisibilities.PRIVATE) && (containingDeclaration instanceof PackageFragmentDescriptor)) {
                    Intrinsics.checkNotNull(descriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.serialization.deserialization.descriptors.DeserializedPropertyDescriptor");
                    DeserializedContainerSource containerSource = ((DeserializedPropertyDescriptor) descriptor).getContainerSource();
                    if (containerSource instanceof JvmPackagePartSource) {
                        JvmPackagePartSource jvmPackagePartSource = (JvmPackagePartSource) containerSource;
                        if (jvmPackagePartSource.getFacadeClassName() != null) {
                            str = Constant.MXN_SYMBOL + jvmPackagePartSource.getSimpleName().asString();
                        } else {
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                } else {
                    str = "";
                }
                strC = f.c(sb2, str, "()", strComponent2);
            }
            this.f79874f = strC;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* JADX INFO: renamed from: asString, reason: from getter */
        public String getF79874f() {
            return this.f79874f;
        }

        @NotNull
        /* JADX INFO: renamed from: getDescriptor, reason: from getter */
        public final PropertyDescriptor getF79869a() {
            return this.f79869a;
        }

        @NotNull
        /* JADX INFO: renamed from: getNameResolver, reason: from getter */
        public final NameResolver getF79872d() {
            return this.f79872d;
        }

        @NotNull
        /* JADX INFO: renamed from: getProto, reason: from getter */
        public final ProtoBuf.Property getF79870b() {
            return this.f79870b;
        }

        @NotNull
        /* JADX INFO: renamed from: getSignature, reason: from getter */
        public final JvmProtoBuf.JvmPropertySignature getF79871c() {
            return this.f79871c;
        }

        @NotNull
        /* JADX INFO: renamed from: getTypeTable, reason: from getter */
        public final TypeTable getF79873e() {
            return this.f79873e;
        }
    }

    /* JADX INFO: compiled from: RuntimeTypeMapper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u000f"}, d2 = {"Lkotlin/reflect/jvm/internal/JvmPropertySignature$MappedKotlinProperty;", "Lkotlin/reflect/jvm/internal/JvmPropertySignature;", "", "asString", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "a", "Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getGetterSignature", "()Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;", "getterSignature", "b", "getSetterSignature", "setterSignature", "<init>", "(Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;Lkotlin/reflect/jvm/internal/JvmFunctionSignature$KotlinFunction;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static final class MappedKotlinProperty extends JvmPropertySignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final JvmFunctionSignature.KotlinFunction getterSignature;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final JvmFunctionSignature.KotlinFunction setterSignature;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MappedKotlinProperty(@NotNull JvmFunctionSignature.KotlinFunction getterSignature, @Nullable JvmFunctionSignature.KotlinFunction kotlinFunction) {
            super(null);
            Intrinsics.checkNotNullParameter(getterSignature, "getterSignature");
            this.getterSignature = getterSignature;
            this.setterSignature = kotlinFunction;
        }

        @Override // kotlin.reflect.jvm.internal.JvmPropertySignature
        @NotNull
        /* JADX INFO: renamed from: asString */
        public String getF79874f() {
            return this.getterSignature.getF79865b();
        }

        @NotNull
        public final JvmFunctionSignature.KotlinFunction getGetterSignature() {
            return this.getterSignature;
        }

        @Nullable
        public final JvmFunctionSignature.KotlinFunction getSetterSignature() {
            return this.setterSignature;
        }
    }

    public JvmPropertySignature() {
    }

    public /* synthetic */ JvmPropertySignature(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @NotNull
    /* JADX INFO: renamed from: asString */
    public abstract String getF79874f();
}
