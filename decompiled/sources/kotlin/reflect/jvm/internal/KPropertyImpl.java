package kotlin.reflect.jvm.internal;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KMutableProperty;
import kotlin.reflect.KProperty;
import kotlin.reflect.full.IllegalPropertyDelegateAccessException;
import kotlin.reflect.jvm.KCallablesJvm;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyAccessorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.load.java.DescriptorsJvmAbiUtil;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorFactory;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KPropertyImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000 @*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0004A@BCB\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u00109\u001a\u000206¢\u0006\u0004\b:\u0010;B5\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u0010<\u001a\u0004\u0018\u000106\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b:\u0010>B+\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0012\u0012\u0006\u0010\u001c\u001a\u00020\u0010\u0012\u0006\u0010\u001f\u001a\u00020\u0010\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b:\u0010?J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0004J(\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0004J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0013\u0010\"\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010(\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000)8&X¦\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0006\u0012\u0002\b\u00030-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u001a\u00102\u001a\b\u0012\u0002\b\u0003\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0014\u00103\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010$R\u0014\u00104\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u0010$R\u0014\u00105\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010$R\u0014\u00109\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006D"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty;", "Ljava/lang/reflect/Member;", "computeDelegateSource", "fieldOrMethod", "", "receiver1", "receiver2", "getDelegateImpl", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "v0", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "w0", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "x0", "getSignature", "signature", "getBoundReceiver", "()Ljava/lang/Object;", "boundReceiver", "isBound", "()Z", "Ljava/lang/reflect/Field;", "getJavaField", "()Ljava/lang/reflect/Field;", "javaField", "Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getGetter", "()Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", "getter", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getDefaultCaller", "defaultCaller", "isLateinit", "isConst", "isSuspend", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;)V", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;Ljava/lang/Object;)V", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Companion", "Accessor", "Getter", "Setter", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nKPropertyImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KPropertyImpl.kt\nkotlin/reflect/jvm/internal/KPropertyImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
public abstract class KPropertyImpl<V> extends KCallableImpl<V> implements KProperty<V> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Object G0 = new Object();

    @NotNull
    public final Lazy<Field> E0;

    @NotNull
    public final ReflectProperties.LazySoftVal<PropertyDescriptor> F0;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final KDeclarationContainerImpl container;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String signature;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public final Object f80001y0;

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u0001*\u0006\b\u0002\u0010\u0002 \u00012\b\u0012\u0004\u0012\u0002H\u00020\u00032\b\u0012\u0004\u0012\u0002H\u00010\u00042\b\u0012\u0004\u0012\u0002H\u00020\u0005B\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015R\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "PropertyType", "ReturnType", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "Lkotlin/reflect/KProperty$Accessor;", "Lkotlin/reflect/KFunction;", "()V", "container", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "defaultCaller", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getDefaultCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "descriptor", "Lkotlin/reflect/jvm/internal/impl/descriptors/PropertyAccessorDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/PropertyAccessorDescriptor;", "isBound", "", "()Z", "isExternal", "isInfix", "isInline", "isOperator", "isSuspend", "property", "Lkotlin/reflect/jvm/internal/KPropertyImpl;", "getProperty", "()Lkotlin/reflect/jvm/internal/KPropertyImpl;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Accessor<PropertyType, ReturnType> extends KCallableImpl<ReturnType> implements KFunction<ReturnType>, KProperty.Accessor<PropertyType> {
        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        public KDeclarationContainerImpl getContainer() {
            return getProperty().getContainer();
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @Nullable
        public Caller<?> getDefaultCaller() {
            return null;
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        public abstract PropertyAccessorDescriptor getDescriptor();

        @NotNull
        public abstract KPropertyImpl<PropertyType> getProperty();

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        public boolean isBound() {
            return getProperty().isBound();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isExternal() {
            return getDescriptor().isExternal();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInfix() {
            return getDescriptor().isInfix();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isInline() {
            return getDescriptor().isInline();
        }

        @Override // kotlin.reflect.KFunction
        public boolean isOperator() {
            return getDescriptor().isOperator();
        }

        @Override // kotlin.reflect.KCallable
        public boolean isSuspend() {
            return getDescriptor().isSuspend();
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Companion;", "", "()V", "EXTENSION_PROPERTY_DELEGATE", "getEXTENSION_PROPERTY_DELEGATE", "()Ljava/lang/Object;", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Object getEXTENSION_PROPERTY_DELEGATE() {
            return KPropertyImpl.G0;
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    public static final class a extends Lambda implements Function0<PropertyDescriptor> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KPropertyImpl<V> f80010p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(KPropertyImpl<? extends V> kPropertyImpl) {
            super(0);
            this.f80010p0 = kPropertyImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final PropertyDescriptor invoke() {
            KPropertyImpl<V> kPropertyImpl = this.f80010p0;
            return kPropertyImpl.getContainer().findPropertyDescriptor(kPropertyImpl.getName(), kPropertyImpl.getSignature());
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    public static final class b extends Lambda implements Function0<Field> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KPropertyImpl<V> f80011p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(KPropertyImpl<? extends V> kPropertyImpl) {
            super(0);
            this.f80011p0 = kPropertyImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Field invoke() {
            Class<?> enclosingClass;
            RuntimeTypeMapper runtimeTypeMapper = RuntimeTypeMapper.INSTANCE;
            KPropertyImpl<V> kPropertyImpl = this.f80011p0;
            JvmPropertySignature jvmPropertySignatureMapPropertySignature = runtimeTypeMapper.mapPropertySignature(kPropertyImpl.getDescriptor());
            if (!(jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.KotlinProperty)) {
                if (jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.JavaField) {
                    return ((JvmPropertySignature.JavaField) jvmPropertySignatureMapPropertySignature).getField();
                }
                if ((jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.JavaMethodProperty) || (jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.MappedKotlinProperty)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureMapPropertySignature;
            PropertyDescriptor f79869a = kotlinProperty.getF79869a();
            JvmMemberSignature.Field jvmFieldSignature$default = JvmProtoBufUtil.getJvmFieldSignature$default(JvmProtoBufUtil.INSTANCE, kotlinProperty.getF79870b(), kotlinProperty.getF79872d(), kotlinProperty.getF79873e(), false, 8, null);
            if (jvmFieldSignature$default == null) {
                return null;
            }
            if (DescriptorsJvmAbiUtil.isPropertyWithBackingFieldInOuterClass(f79869a) || JvmProtoBufUtil.isMovedFromInterfaceCompanion(kotlinProperty.getF79870b())) {
                enclosingClass = kPropertyImpl.getContainer().getJClass().getEnclosingClass();
            } else {
                DeclarationDescriptor containingDeclaration = f79869a.getContainingDeclaration();
                enclosingClass = containingDeclaration instanceof ClassDescriptor ? UtilKt.toJavaClass((ClassDescriptor) containingDeclaration) : kPropertyImpl.getContainer().getJClass();
            }
            if (enclosingClass == null) {
                return null;
            }
            try {
                return enclosingClass.getDeclaredField(jvmFieldSignature$default.getName());
            } catch (NoSuchFieldException unused) {
                return null;
            }
        }
    }

    public KPropertyImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, PropertyDescriptor propertyDescriptor, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.name = str;
        this.signature = str2;
        this.f80001y0 = obj;
        this.E0 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new b(this));
        ReflectProperties.LazySoftVal<PropertyDescriptor> lazySoftValLazySoft = ReflectProperties.lazySoft(propertyDescriptor, new a(this));
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft, "lazySoft(...)");
        this.F0 = lazySoftValLazySoft;
    }

    @Nullable
    public final Member computeDelegateSource() {
        if (!getDescriptor().isDelegated()) {
            return null;
        }
        JvmPropertySignature jvmPropertySignatureMapPropertySignature = RuntimeTypeMapper.INSTANCE.mapPropertySignature(getDescriptor());
        if (jvmPropertySignatureMapPropertySignature instanceof JvmPropertySignature.KotlinProperty) {
            JvmPropertySignature.KotlinProperty kotlinProperty = (JvmPropertySignature.KotlinProperty) jvmPropertySignatureMapPropertySignature;
            if (kotlinProperty.getF79871c().hasDelegateMethod()) {
                JvmProtoBuf.JvmMethodSignature delegateMethod = kotlinProperty.getF79871c().getDelegateMethod();
                if (!delegateMethod.hasName() || !delegateMethod.hasDesc()) {
                    return null;
                }
                return getContainer().findMethodBySignature(kotlinProperty.getF79872d().getString(delegateMethod.getName()), kotlinProperty.getF79872d().getString(delegateMethod.getDesc()));
            }
        }
        return getJavaField();
    }

    public boolean equals(@Nullable Object other) {
        KPropertyImpl<?> kPropertyImplAsKPropertyImpl = UtilKt.asKPropertyImpl(other);
        return kPropertyImplAsKPropertyImpl != null && Intrinsics.areEqual(getContainer(), kPropertyImplAsKPropertyImpl.getContainer()) && Intrinsics.areEqual(getName(), kPropertyImplAsKPropertyImpl.getName()) && Intrinsics.areEqual(this.signature, kPropertyImplAsKPropertyImpl.signature) && Intrinsics.areEqual(this.f80001y0, kPropertyImplAsKPropertyImpl.f80001y0);
    }

    @Nullable
    public final Object getBoundReceiver() {
        return ValueClassAwareCallerKt.coerceToExpectedReceiverType(this.f80001y0, getDescriptor());
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    public Caller<?> getCaller() {
        return getGetter().getCaller();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @Nullable
    public Caller<?> getDefaultCaller() {
        return getGetter().getDefaultCaller();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object getDelegateImpl(@Nullable Member fieldOrMethod, @Nullable Object receiver1, @Nullable Object receiver2) throws IllegalPropertyDelegateAccessException {
        try {
            Object obj = G0;
            if ((receiver1 == obj || receiver2 == obj) && getDescriptor().getExtensionReceiverParameter() == null) {
                throw new RuntimeException("'" + this + "' is not an extension property and thus getExtensionDelegate() is not going to work, use getDelegate() instead");
            }
            Object boundReceiver = isBound() ? getBoundReceiver() : receiver1;
            if (boundReceiver == obj) {
                boundReceiver = null;
            }
            if (!isBound()) {
                receiver1 = receiver2;
            }
            if (receiver1 == obj) {
                receiver1 = null;
            }
            AccessibleObject accessibleObject = fieldOrMethod instanceof AccessibleObject ? (AccessibleObject) fieldOrMethod : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(KCallablesJvm.isAccessible(this));
            }
            if (fieldOrMethod == 0) {
                return null;
            }
            if (fieldOrMethod instanceof Field) {
                return ((Field) fieldOrMethod).get(boundReceiver);
            }
            if (!(fieldOrMethod instanceof Method)) {
                throw new AssertionError("delegate field/method " + fieldOrMethod + " neither field nor method");
            }
            int length = ((Method) fieldOrMethod).getParameterTypes().length;
            if (length == 0) {
                return ((Method) fieldOrMethod).invoke(null, new Object[0]);
            }
            if (length == 1) {
                Method method = (Method) fieldOrMethod;
                Object[] objArr = new Object[1];
                if (boundReceiver == null) {
                    Class<?> cls = ((Method) fieldOrMethod).getParameterTypes()[0];
                    Intrinsics.checkNotNullExpressionValue(cls, "get(...)");
                    boundReceiver = UtilKt.defaultPrimitiveValue(cls);
                }
                objArr[0] = boundReceiver;
                return method.invoke(null, objArr);
            }
            if (length != 2) {
                throw new AssertionError("delegate method " + fieldOrMethod + " should take 0, 1, or 2 parameters");
            }
            Method method2 = (Method) fieldOrMethod;
            Object[] objArr2 = new Object[2];
            objArr2[0] = boundReceiver;
            if (receiver1 == null) {
                Class<?> cls2 = ((Method) fieldOrMethod).getParameterTypes()[1];
                Intrinsics.checkNotNullExpressionValue(cls2, "get(...)");
                receiver1 = UtilKt.defaultPrimitiveValue(cls2);
            }
            objArr2[1] = receiver1;
            return method2.invoke(null, objArr2);
        } catch (IllegalAccessException e5) {
            throw new IllegalPropertyDelegateAccessException(e5);
        }
    }

    @NotNull
    public abstract Getter<V> getGetter();

    @Nullable
    public final Field getJavaField() {
        return this.E0.getValue();
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public String getName() {
        return this.name;
    }

    @NotNull
    public final String getSignature() {
        return this.signature;
    }

    public int hashCode() {
        return this.signature.hashCode() + ((getName().hashCode() + (getContainer().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean isBound() {
        return !Intrinsics.areEqual(this.f80001y0, CallableReference.NO_RECEIVER);
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return getDescriptor().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return getDescriptor().isLateInit();
    }

    @Override // kotlin.reflect.KCallable
    public boolean isSuspend() {
        return false;
    }

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderProperty(getDescriptor());
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0006\b\u0001\u0010\u0001 \u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001f\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\f8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Getter;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "Lkotlin/reflect/KProperty$Getter;", "", "toString", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Lkotlin/reflect/jvm/internal/calls/Caller;", "w0", "Lkotlin/Lazy;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static abstract class Getter<V> extends Accessor<V, V> implements KProperty.Getter<V> {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final /* synthetic */ KProperty<Object>[] f80002x0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Getter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;"))};

        @NotNull
        public final ReflectProperties.LazySoftVal v0 = ReflectProperties.lazySoft(new b(this));

        /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Lazy caller = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new a(this));

        /* JADX INFO: compiled from: KPropertyImpl.kt */
        public static final class a extends Lambda implements Function0<Caller<?>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Getter<V> f80004p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(Getter<? extends V> getter) {
                super(0);
                this.f80004p0 = getter;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Caller<?> invoke() {
                return KPropertyImplKt.access$computeCallerForAccessor(this.f80004p0, true);
            }
        }

        /* JADX INFO: compiled from: KPropertyImpl.kt */
        public static final class b extends Lambda implements Function0<PropertyGetterDescriptor> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Getter<V> f80005p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(Getter<? extends V> getter) {
                super(0);
                this.f80005p0 = getter;
            }

            @Override // kotlin.jvm.functions.Function0
            public final PropertyGetterDescriptor invoke() {
                Getter<V> getter = this.f80005p0;
                PropertyGetterDescriptor getter2 = getter.getProperty().getDescriptor().getGetter();
                return getter2 == null ? DescriptorFactory.createDefaultGetter(getter.getProperty().getDescriptor(), Annotations.Companion.getEMPTY()) : getter2;
            }
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof Getter) && Intrinsics.areEqual(getProperty(), ((Getter) other).getProperty());
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        public Caller<?> getCaller() {
            return (Caller) this.caller.getValue();
        }

        @Override // kotlin.reflect.KCallable
        @NotNull
        public String getName() {
            return "<get-" + getProperty().getName() + Typography.greater;
        }

        public int hashCode() {
            return getProperty().hashCode();
        }

        @NotNull
        public String toString() {
            return "getter of " + getProperty();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor, kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        public PropertyGetterDescriptor getDescriptor() {
            T value = this.v0.getValue(this, f80002x0[0]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (PropertyGetterDescriptor) value;
        }
    }

    /* JADX INFO: compiled from: KPropertyImpl.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00028\u00010\u0004B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001f\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lkotlin/reflect/jvm/internal/KPropertyImpl$Setter;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lkotlin/reflect/jvm/internal/KPropertyImpl$Accessor;", "", "Lkotlin/reflect/KMutableProperty$Setter;", "", "toString", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "Lkotlin/reflect/jvm/internal/calls/Caller;", "w0", "Lkotlin/Lazy;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getName", "()Ljava/lang/String;", "name", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    public static abstract class Setter<V> extends Accessor<V, Unit> implements KMutableProperty.Setter<V> {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static final /* synthetic */ KProperty<Object>[] f80006x0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Setter.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertySetterDescriptor;"))};

        @NotNull
        public final ReflectProperties.LazySoftVal v0 = ReflectProperties.lazySoft(new b(this));

        /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Lazy caller = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new a(this));

        /* JADX INFO: compiled from: KPropertyImpl.kt */
        public static final class a extends Lambda implements Function0<Caller<?>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Setter<V> f80008p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Setter<V> setter) {
                super(0);
                this.f80008p0 = setter;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Caller<?> invoke() {
                return KPropertyImplKt.access$computeCallerForAccessor(this.f80008p0, false);
            }
        }

        /* JADX INFO: compiled from: KPropertyImpl.kt */
        public static final class b extends Lambda implements Function0<PropertySetterDescriptor> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ Setter<V> f80009p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Setter<V> setter) {
                super(0);
                this.f80009p0 = setter;
            }

            @Override // kotlin.jvm.functions.Function0
            public final PropertySetterDescriptor invoke() {
                Setter<V> setter = this.f80009p0;
                PropertySetterDescriptor setter2 = setter.getProperty().getDescriptor().getSetter();
                if (setter2 != null) {
                    return setter2;
                }
                PropertyDescriptor descriptor = setter.getProperty().getDescriptor();
                Annotations.Companion companion = Annotations.Companion;
                return DescriptorFactory.createDefaultSetter(descriptor, companion.getEMPTY(), companion.getEMPTY());
            }
        }

        public boolean equals(@Nullable Object other) {
            return (other instanceof Setter) && Intrinsics.areEqual(getProperty(), ((Setter) other).getProperty());
        }

        @Override // kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        public Caller<?> getCaller() {
            return (Caller) this.caller.getValue();
        }

        @Override // kotlin.reflect.KCallable
        @NotNull
        public String getName() {
            return "<set-" + getProperty().getName() + Typography.greater;
        }

        public int hashCode() {
            return getProperty().hashCode();
        }

        @NotNull
        public String toString() {
            return "setter of " + getProperty();
        }

        @Override // kotlin.reflect.jvm.internal.KPropertyImpl.Accessor, kotlin.reflect.jvm.internal.KCallableImpl
        @NotNull
        public PropertySetterDescriptor getDescriptor() {
            T value = this.v0.getValue(this, f80006x0[0]);
            Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
            return (PropertySetterDescriptor) value;
        }
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    public PropertyDescriptor getDescriptor() {
        PropertyDescriptor propertyDescriptorInvoke = this.F0.invoke();
        Intrinsics.checkNotNullExpressionValue(propertyDescriptorInvoke, "invoke(...)");
        return propertyDescriptorInvoke;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KPropertyImpl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KPropertyImpl(@NotNull KDeclarationContainerImpl container, @NotNull PropertyDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strAsString = descriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        this(container, strAsString, RuntimeTypeMapper.INSTANCE.mapPropertySignature(descriptor).getF79874f(), descriptor, CallableReference.NO_RECEIVER);
    }
}
