package kotlin.reflect.jvm.internal;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.calls.AnnotationConstructorCaller;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.CallerImpl;
import kotlin.reflect.jvm.internal.calls.CallerKt;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCaller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.InlineClassManglingRulesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KFunctionImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00032\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00042\u00020\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,B7\b\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\b\u0010.\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u00100B+\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\u0006\u0010-\u001a\u00020\u000b\u0012\b\u00101\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u00102J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001f\u0010\u0018\u001a\u0006\u0012\u0002\b\u00030\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R!\u0010\u001b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00138VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u001dR\u0014\u0010%\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\u001dR\u0014\u0010&\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u001dR\u0014\u0010'\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001dR\u0014\u0010(\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001d¨\u00063"}, d2 = {"Lkotlin/reflect/jvm/internal/KFunctionImpl;", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "", "Lkotlin/reflect/KFunction;", "Lkotlin/jvm/internal/FunctionBase;", "Lkotlin/reflect/jvm/internal/FunctionWithAllInvokes;", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "", "toString", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "v0", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "Lkotlin/reflect/jvm/internal/calls/Caller;", "E0", "Lkotlin/Lazy;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "F0", "getDefaultCaller", "defaultCaller", "isBound", "()Z", "getName", "()Ljava/lang/String;", "name", "getArity", "()I", "arity", "isInline", "isExternal", "isOperator", "isInfix", "isSuspend", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "<init>", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;)V", "signature", "descriptorInitialValue", "rawBoundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Ljava/lang/Object;)V", "boundReceiver", "(Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
public final class KFunctionImpl extends KCallableImpl<Object> implements FunctionBase<Object>, KFunction<Object>, FunctionWithAllInvokes {
    public static final /* synthetic */ KProperty<Object>[] G0 = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(KFunctionImpl.class), "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;"))};

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    @NotNull
    public final Lazy caller;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    @NotNull
    public final Lazy defaultCaller;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final KDeclarationContainerImpl container;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public final String f79950w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public final Object f79951x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @NotNull
    public final ReflectProperties.LazySoftVal f79952y0;

    /* JADX INFO: compiled from: KFunctionImpl.kt */
    @SourceDebugExtension({"SMAP\nKFunctionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl$caller$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1549#2:201\n1620#2,3:202\n1549#2:206\n1620#2,3:207\n1#3:205\n*S KotlinDebug\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl$caller$2\n*L\n68#1:201\n68#1:202,3\n83#1:206\n83#1:207,3\n*E\n"})
    public static final class a extends Lambda implements Function0<Caller<? extends Executable>> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Caller<? extends Executable> invoke() throws ClassNotFoundException {
            Object constructor;
            Caller callerAccess$createJvmStaticInObjectCaller;
            RuntimeTypeMapper runtimeTypeMapper = RuntimeTypeMapper.INSTANCE;
            KFunctionImpl kFunctionImpl = KFunctionImpl.this;
            JvmFunctionSignature jvmFunctionSignatureMapSignature = runtimeTypeMapper.mapSignature(kFunctionImpl.getDescriptor());
            if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.KotlinConstructor) {
                if (kFunctionImpl.isAnnotationConstructor()) {
                    Class<?> jClass = kFunctionImpl.getContainer().getJClass();
                    List<KParameter> parameters = kFunctionImpl.getParameters();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        String name = ((KParameter) it.next()).getName();
                        Intrinsics.checkNotNull(name);
                        arrayList.add(name);
                    }
                    return new AnnotationConstructorCaller(jClass, arrayList, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
                }
                constructor = kFunctionImpl.getContainer().findConstructorBySignature(((JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureMapSignature).getConstructorDesc());
            } else if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.KotlinFunction) {
                FunctionDescriptor descriptor = kFunctionImpl.getDescriptor();
                DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration) && (descriptor instanceof ConstructorDescriptor) && ((ConstructorDescriptor) descriptor).isPrimary()) {
                    FunctionDescriptor descriptor2 = kFunctionImpl.getDescriptor();
                    KDeclarationContainerImpl container = kFunctionImpl.getContainer();
                    String methodDesc = ((JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureMapSignature).getMethodDesc();
                    List<ValueParameterDescriptor> valueParameters = kFunctionImpl.getDescriptor().getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    return new ValueClassAwareCaller.MultiFieldValueClassPrimaryConstructorCaller(descriptor2, container, methodDesc, valueParameters);
                }
                JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureMapSignature;
                constructor = kFunctionImpl.getContainer().findMethodBySignature(kotlinFunction.getMethodName(), kotlinFunction.getMethodDesc());
            } else if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.JavaMethod) {
                constructor = ((JvmFunctionSignature.JavaMethod) jvmFunctionSignatureMapSignature).getMethod();
            } else {
                if (!(jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.JavaConstructor)) {
                    if (!(jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    List<Method> methods = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureMapSignature).getMethods();
                    Class<?> jClass2 = kFunctionImpl.getContainer().getJClass();
                    List<Method> list = methods;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new AnnotationConstructorCaller(jClass2, arrayList2, AnnotationConstructorCaller.CallMode.POSITIONAL_CALL, AnnotationConstructorCaller.Origin.JAVA, methods);
                }
                constructor = ((JvmFunctionSignature.JavaConstructor) jvmFunctionSignatureMapSignature).getConstructor();
            }
            if (constructor instanceof Constructor) {
                callerAccess$createJvmStaticInObjectCaller = KFunctionImpl.access$createConstructorCaller(kFunctionImpl, (Constructor) constructor, kFunctionImpl.getDescriptor(), false);
            } else {
                if (!(constructor instanceof Method)) {
                    throw new KotlinReflectionInternalError("Could not compute caller for function: " + kFunctionImpl.getDescriptor() + " (member = " + constructor + RootService.CLOSE_BRACKET);
                }
                Method method = (Method) constructor;
                if (Modifier.isStatic(method.getModifiers())) {
                    callerAccess$createJvmStaticInObjectCaller = kFunctionImpl.getDescriptor().getAnnotations().mo5773findAnnotation(UtilKt.getJVM_STATIC()) != null ? KFunctionImpl.access$createJvmStaticInObjectCaller(kFunctionImpl, method) : KFunctionImpl.access$createStaticMethodCaller(kFunctionImpl, method);
                } else {
                    callerAccess$createJvmStaticInObjectCaller = KFunctionImpl.access$createInstanceMethodCaller(kFunctionImpl, method);
                }
            }
            return ValueClassAwareCallerKt.createValueClassAwareCallerIfNeeded$default(callerAccess$createJvmStaticInObjectCaller, kFunctionImpl.getDescriptor(), false, 2, null);
        }
    }

    /* JADX INFO: compiled from: KFunctionImpl.kt */
    @SourceDebugExtension({"SMAP\nKFunctionImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl$defaultCaller$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,200:1\n1#2:201\n1549#3:202\n1620#3,3:203\n1549#3:206\n1620#3,3:207\n*S KotlinDebug\n*F\n+ 1 KFunctionImpl.kt\nkotlin/reflect/jvm/internal/KFunctionImpl$defaultCaller$2\n*L\n113#1:202\n113#1:203,3\n118#1:206\n118#1:207,3\n*E\n"})
    public static final class b extends Lambda implements Function0<Caller<? extends Executable>> {
        public b() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:44:0x0158  */
        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Caller<? extends Executable> invoke() {
            GenericDeclaration genericDeclarationFindDefaultConstructor;
            Caller callerAccess$createStaticMethodCaller;
            RuntimeTypeMapper runtimeTypeMapper = RuntimeTypeMapper.INSTANCE;
            KFunctionImpl kFunctionImpl = KFunctionImpl.this;
            JvmFunctionSignature jvmFunctionSignatureMapSignature = runtimeTypeMapper.mapSignature(kFunctionImpl.getDescriptor());
            if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.KotlinFunction) {
                FunctionDescriptor descriptor = kFunctionImpl.getDescriptor();
                DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                if (InlineClassesUtilsKt.isMultiFieldValueClass(containingDeclaration) && (descriptor instanceof ConstructorDescriptor) && ((ConstructorDescriptor) descriptor).isPrimary()) {
                    throw new KotlinReflectionInternalError(kFunctionImpl.getDescriptor().getContainingDeclaration() + " cannot have default arguments");
                }
                KDeclarationContainerImpl container = kFunctionImpl.getContainer();
                JvmFunctionSignature.KotlinFunction kotlinFunction = (JvmFunctionSignature.KotlinFunction) jvmFunctionSignatureMapSignature;
                String methodName = kotlinFunction.getMethodName();
                String methodDesc = kotlinFunction.getMethodDesc();
                Member memberMo5770getMember = kFunctionImpl.getCaller().mo5770getMember();
                Intrinsics.checkNotNull(memberMo5770getMember);
                genericDeclarationFindDefaultConstructor = container.findDefaultMethod(methodName, methodDesc, !Modifier.isStatic(memberMo5770getMember.getModifiers()));
            } else if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.KotlinConstructor) {
                if (kFunctionImpl.isAnnotationConstructor()) {
                    Class<?> jClass = kFunctionImpl.getContainer().getJClass();
                    List<KParameter> parameters = kFunctionImpl.getParameters();
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
                    Iterator<T> it = parameters.iterator();
                    while (it.hasNext()) {
                        String name = ((KParameter) it.next()).getName();
                        Intrinsics.checkNotNull(name);
                        arrayList.add(name);
                    }
                    return new AnnotationConstructorCaller(jClass, arrayList, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.KOTLIN, null, 16, null);
                }
                genericDeclarationFindDefaultConstructor = kFunctionImpl.getContainer().findDefaultConstructor(((JvmFunctionSignature.KotlinConstructor) jvmFunctionSignatureMapSignature).getConstructorDesc());
            } else {
                if (jvmFunctionSignatureMapSignature instanceof JvmFunctionSignature.FakeJavaAnnotationConstructor) {
                    List<Method> methods = ((JvmFunctionSignature.FakeJavaAnnotationConstructor) jvmFunctionSignatureMapSignature).getMethods();
                    Class<?> jClass2 = kFunctionImpl.getContainer().getJClass();
                    List<Method> list = methods;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((Method) it2.next()).getName());
                    }
                    return new AnnotationConstructorCaller(jClass2, arrayList2, AnnotationConstructorCaller.CallMode.CALL_BY_NAME, AnnotationConstructorCaller.Origin.JAVA, methods);
                }
                genericDeclarationFindDefaultConstructor = null;
            }
            if (genericDeclarationFindDefaultConstructor instanceof Constructor) {
                callerAccess$createStaticMethodCaller = KFunctionImpl.access$createConstructorCaller(kFunctionImpl, (Constructor) genericDeclarationFindDefaultConstructor, kFunctionImpl.getDescriptor(), true);
            } else if (!(genericDeclarationFindDefaultConstructor instanceof Method)) {
                callerAccess$createStaticMethodCaller = null;
            } else if (kFunctionImpl.getDescriptor().getAnnotations().mo5773findAnnotation(UtilKt.getJVM_STATIC()) != null) {
                DeclarationDescriptor containingDeclaration2 = kFunctionImpl.getDescriptor().getContainingDeclaration();
                Intrinsics.checkNotNull(containingDeclaration2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                if (((ClassDescriptor) containingDeclaration2).isCompanionObject()) {
                    callerAccess$createStaticMethodCaller = KFunctionImpl.access$createStaticMethodCaller(kFunctionImpl, (Method) genericDeclarationFindDefaultConstructor);
                } else {
                    callerAccess$createStaticMethodCaller = KFunctionImpl.access$createJvmStaticInObjectCaller(kFunctionImpl, (Method) genericDeclarationFindDefaultConstructor);
                }
            } else {
                callerAccess$createStaticMethodCaller = KFunctionImpl.access$createStaticMethodCaller(kFunctionImpl, (Method) genericDeclarationFindDefaultConstructor);
            }
            if (callerAccess$createStaticMethodCaller != null) {
                return ValueClassAwareCallerKt.createValueClassAwareCallerIfNeeded(callerAccess$createStaticMethodCaller, kFunctionImpl.getDescriptor(), true);
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: KFunctionImpl.kt */
    public static final class c extends Lambda implements Function0<FunctionDescriptor> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f79956q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(0);
            this.f79956q0 = str;
        }

        @Override // kotlin.jvm.functions.Function0
        public final FunctionDescriptor invoke() {
            KFunctionImpl kFunctionImpl = KFunctionImpl.this;
            return kFunctionImpl.getContainer().findFunctionDescriptor(this.f79956q0, kFunctionImpl.f79950w0);
        }
    }

    public KFunctionImpl(KDeclarationContainerImpl kDeclarationContainerImpl, String str, String str2, FunctionDescriptor functionDescriptor, Object obj) {
        this.container = kDeclarationContainerImpl;
        this.f79950w0 = str2;
        this.f79951x0 = obj;
        this.f79952y0 = ReflectProperties.lazySoft(functionDescriptor, new c(str));
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.caller = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new a());
        this.defaultCaller = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new b());
    }

    public static final CallerImpl access$createConstructorCaller(KFunctionImpl kFunctionImpl, Constructor constructor, FunctionDescriptor functionDescriptor, boolean z10) {
        if (!z10) {
            kFunctionImpl.getClass();
            if (InlineClassManglingRulesKt.shouldHideConstructorDueToValueClassTypeValueParameters(functionDescriptor)) {
                return kFunctionImpl.isBound() ? new CallerImpl.AccessorForHiddenBoundConstructor(constructor, ValueClassAwareCallerKt.coerceToExpectedReceiverType(kFunctionImpl.f79951x0, kFunctionImpl.getDescriptor())) : new CallerImpl.AccessorForHiddenConstructor(constructor);
            }
        }
        return kFunctionImpl.isBound() ? new CallerImpl.BoundConstructor(constructor, ValueClassAwareCallerKt.coerceToExpectedReceiverType(kFunctionImpl.f79951x0, kFunctionImpl.getDescriptor())) : new CallerImpl.Constructor(constructor);
    }

    public static final CallerImpl.Method access$createInstanceMethodCaller(KFunctionImpl kFunctionImpl, Method method) {
        return kFunctionImpl.isBound() ? new CallerImpl.Method.BoundInstance(method, ValueClassAwareCallerKt.coerceToExpectedReceiverType(kFunctionImpl.f79951x0, kFunctionImpl.getDescriptor())) : new CallerImpl.Method.Instance(method);
    }

    public static final CallerImpl.Method access$createJvmStaticInObjectCaller(KFunctionImpl kFunctionImpl, Method method) {
        return kFunctionImpl.isBound() ? new CallerImpl.Method.BoundJvmStaticInObject(method) : new CallerImpl.Method.JvmStaticInObject(method);
    }

    public static final CallerImpl.Method access$createStaticMethodCaller(KFunctionImpl kFunctionImpl, Method method) {
        return kFunctionImpl.isBound() ? new CallerImpl.Method.BoundStatic(method, ValueClassAwareCallerKt.coerceToExpectedReceiverType(kFunctionImpl.f79951x0, kFunctionImpl.getDescriptor())) : new CallerImpl.Method.Static(method);
    }

    public boolean equals(@Nullable Object other) {
        KFunctionImpl kFunctionImplAsKFunctionImpl = UtilKt.asKFunctionImpl(other);
        return kFunctionImplAsKFunctionImpl != null && Intrinsics.areEqual(getContainer(), kFunctionImplAsKFunctionImpl.getContainer()) && Intrinsics.areEqual(getName(), kFunctionImplAsKFunctionImpl.getName()) && Intrinsics.areEqual(this.f79950w0, kFunctionImplAsKFunctionImpl.f79950w0) && Intrinsics.areEqual(this.f79951x0, kFunctionImplAsKFunctionImpl.f79951x0);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return CallerKt.getArity(getCaller());
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    public Caller<?> getCaller() {
        return (Caller) this.caller.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    public KDeclarationContainerImpl getContainer() {
        return this.container;
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @Nullable
    public Caller<?> getDefaultCaller() {
        return (Caller) this.defaultCaller.getValue();
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public String getName() {
        String strAsString = getDescriptor().getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        return strAsString;
    }

    public int hashCode() {
        return this.f79950w0.hashCode() + ((getName().hashCode() + (getContainer().hashCode() * 31)) * 31);
    }

    @Override // kotlin.jvm.functions.Function0
    @Nullable
    public Object invoke() {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this);
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    public boolean isBound() {
        return !Intrinsics.areEqual(this.f79951x0, CallableReference.NO_RECEIVER);
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

    @NotNull
    public String toString() {
        return ReflectionObjectRenderer.INSTANCE.renderFunction(getDescriptor());
    }

    @Override // kotlin.reflect.jvm.internal.KCallableImpl
    @NotNull
    public FunctionDescriptor getDescriptor() {
        T value = this.f79952y0.getValue(this, G0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FunctionDescriptor) value;
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public Object invoke(@Nullable Object obj) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2);
    }

    @Override // kotlin.jvm.functions.Function3
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3);
    }

    @Override // kotlin.jvm.functions.Function4
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4);
    }

    @Override // kotlin.jvm.functions.Function5
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5);
    }

    @Override // kotlin.jvm.functions.Function6
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KFunctionImpl(@NotNull KDeclarationContainerImpl container, @NotNull String name, @NotNull String signature, @Nullable Object obj) {
        this(container, name, signature, null, obj);
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(signature, "signature");
    }

    @Override // kotlin.jvm.functions.Function7
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public KFunctionImpl(@NotNull KDeclarationContainerImpl container, @NotNull FunctionDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strAsString = descriptor.getName().asString();
        Intrinsics.checkNotNullExpressionValue(strAsString, "asString(...)");
        this(container, strAsString, RuntimeTypeMapper.INSTANCE.mapSignature(descriptor).getF79865b(), descriptor, CallableReference.NO_RECEIVER);
    }

    @Override // kotlin.jvm.functions.Function8
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8);
    }

    @Override // kotlin.jvm.functions.Function9
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9);
    }

    @Override // kotlin.jvm.functions.Function10
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10);
    }

    @Override // kotlin.jvm.functions.Function11
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11);
    }

    @Override // kotlin.jvm.functions.Function12
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12);
    }

    @Override // kotlin.jvm.functions.Function13
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12, @Nullable Object obj13) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13);
    }

    @Override // kotlin.jvm.functions.Function14
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12, @Nullable Object obj13, @Nullable Object obj14) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14);
    }

    @Override // kotlin.jvm.functions.Function15
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12, @Nullable Object obj13, @Nullable Object obj14, @Nullable Object obj15) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15);
    }

    @Override // kotlin.jvm.functions.Function16
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12, @Nullable Object obj13, @Nullable Object obj14, @Nullable Object obj15, @Nullable Object obj16) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16);
    }

    @Override // kotlin.jvm.functions.Function17
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12, @Nullable Object obj13, @Nullable Object obj14, @Nullable Object obj15, @Nullable Object obj16, @Nullable Object obj17) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17);
    }

    @Override // kotlin.jvm.functions.Function18
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12, @Nullable Object obj13, @Nullable Object obj14, @Nullable Object obj15, @Nullable Object obj16, @Nullable Object obj17, @Nullable Object obj18) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18);
    }

    @Override // kotlin.jvm.functions.Function19
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12, @Nullable Object obj13, @Nullable Object obj14, @Nullable Object obj15, @Nullable Object obj16, @Nullable Object obj17, @Nullable Object obj18, @Nullable Object obj19) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19);
    }

    @Override // kotlin.jvm.functions.Function20
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12, @Nullable Object obj13, @Nullable Object obj14, @Nullable Object obj15, @Nullable Object obj16, @Nullable Object obj17, @Nullable Object obj18, @Nullable Object obj19, @Nullable Object obj20) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20);
    }

    @Override // kotlin.jvm.functions.Function21
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12, @Nullable Object obj13, @Nullable Object obj14, @Nullable Object obj15, @Nullable Object obj16, @Nullable Object obj17, @Nullable Object obj18, @Nullable Object obj19, @Nullable Object obj20, @Nullable Object obj21) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21);
    }

    @Override // kotlin.jvm.functions.Function22
    @Nullable
    public Object invoke(@Nullable Object obj, @Nullable Object obj2, @Nullable Object obj3, @Nullable Object obj4, @Nullable Object obj5, @Nullable Object obj6, @Nullable Object obj7, @Nullable Object obj8, @Nullable Object obj9, @Nullable Object obj10, @Nullable Object obj11, @Nullable Object obj12, @Nullable Object obj13, @Nullable Object obj14, @Nullable Object obj15, @Nullable Object obj16, @Nullable Object obj17, @Nullable Object obj18, @Nullable Object obj19, @Nullable Object obj20, @Nullable Object obj21, @Nullable Object obj22) {
        return FunctionWithAllInvokes.DefaultImpls.invoke(this, obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, obj11, obj12, obj13, obj14, obj15, obj16, obj17, obj18, obj19, obj20, obj21, obj22);
    }
}
