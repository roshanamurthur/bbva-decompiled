package kotlin.reflect.jvm.internal;

import androidx.core.app.NotificationCompat;
import bk.f;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import dk.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KCallable;
import kotlin.reflect.KClass;
import kotlin.reflect.KParameter;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KVisibility;
import kotlin.reflect.full.IllegalCallableAccessException;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.ReflectJvmMapping;
import kotlin.reflect.jvm.internal.calls.Caller;
import kotlin.reflect.jvm.internal.calls.ValueClassAwareCallerKt;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibility;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaCallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KCallableImpl.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b9\u0010:J'\u0010\u0007\u001a\u00028\u00002\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\u000b\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ3\u0010\u0011\u001a\u00028\u00002\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\t2\f\u0010\u000e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020 0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020*0\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\"R\u0016\u00100\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00101\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u001eR\u0014\u00102\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u001eR\u0014\u00103\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u001eR\u0014\u00104\u001a\u00020\u001c8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001eR\u0014\u00108\u001a\u0002058&X¦\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u0006;"}, d2 = {"Lkotlin/reflect/jvm/internal/KCallableImpl;", "R", "Lkotlin/reflect/KCallable;", "Lkotlin/reflect/jvm/internal/KTypeParameterOwnerImpl;", "", "", "args", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/reflect/KParameter;", "callBy", "(Ljava/util/Map;)Ljava/lang/Object;", "Lkotlin/coroutines/Continuation;", "continuationArgument", "callDefaultMethod$kotlin_reflection", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callDefaultMethod", "Lkotlin/reflect/jvm/internal/calls/Caller;", "getCaller", "()Lkotlin/reflect/jvm/internal/calls/Caller;", "caller", "getDefaultCaller", "defaultCaller", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "getContainer", "()Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "isBound", "()Z", "", "", "getAnnotations", "()Ljava/util/List;", "annotations", "getParameters", "parameters", "Lkotlin/reflect/KType;", "getReturnType", "()Lkotlin/reflect/KType;", "returnType", "Lkotlin/reflect/KTypeParameter;", "getTypeParameters", "typeParameters", "Lkotlin/reflect/KVisibility;", "getVisibility", "()Lkotlin/reflect/KVisibility;", "visibility", "isFinal", "isOpen", "isAbstract", "isAnnotationConstructor", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "getDescriptor", "()Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;", "descriptor", "<init>", "()V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n+ 2 util.kt\nkotlin/reflect/jvm/internal/UtilKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,276:1\n227#2,5:277\n227#2,2:282\n229#2,3:285\n227#2,5:288\n227#2,5:293\n227#2,2:303\n229#2,3:307\n26#3:284\n1#4:298\n1549#5:299\n1620#5,3:300\n37#6,2:305\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl\n*L\n107#1:277,5\n158#1:282,2\n158#1:285,3\n206#1:288,5\n214#1:293,5\n248#1:303,2\n248#1:307,3\n159#1:284\n234#1:299\n234#1:300,3\n249#1:305,2\n*E\n"})
public abstract class KCallableImpl<R> implements KCallable<R>, KTypeParameterOwnerImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ReflectProperties.LazySoftVal<List<Annotation>> f79877p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ReflectProperties.LazySoftVal<ArrayList<KParameter>> f79878q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ReflectProperties.LazySoftVal<KTypeImpl> f79879r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> f79880s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final ReflectProperties.LazySoftVal<Object[]> f79881t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy<Boolean> f79882u0;

    /* JADX INFO: compiled from: KCallableImpl.kt */
    @SourceDebugExtension({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_absentArguments$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1774#2,4:277\n1855#2,2:281\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_absentArguments$1\n*L\n124#1:277,4\n132#1:281,2\n*E\n"})
    public static final class a extends Lambda implements Function0<Object[]> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KCallableImpl<R> f79888p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f79888p0 = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object[] invoke() {
            int iB;
            KCallableImpl<R> kCallableImpl = this.f79888p0;
            List<KParameter> parameters = kCallableImpl.getParameters();
            int size = (kCallableImpl.isSuspend() ? 1 : 0) + parameters.size();
            if (((Boolean) kCallableImpl.f79882u0.getValue()).booleanValue()) {
                iB = 0;
                for (KParameter kParameter : parameters) {
                    iB += kParameter.getKind() == KParameter.Kind.VALUE ? kCallableImpl.b(kParameter) : 0;
                }
            } else {
                List<KParameter> list = parameters;
                if ((list instanceof Collection) && list.isEmpty()) {
                    iB = 0;
                } else {
                    Iterator<T> it = list.iterator();
                    iB = 0;
                    while (it.hasNext()) {
                        if (((KParameter) it.next()).getKind() == KParameter.Kind.VALUE && (iB = iB + 1) < 0) {
                            CollectionsKt__CollectionsKt.throwCountOverflow();
                        }
                    }
                }
            }
            int i10 = (iB + 31) / 32;
            Object[] objArr = new Object[size + i10 + 1];
            for (KParameter kParameter2 : parameters) {
                if (kParameter2.isOptional() && !UtilKt.isInlineClassType(kParameter2.getType())) {
                    objArr[kParameter2.getIndex()] = UtilKt.defaultPrimitiveValue(ReflectJvmMapping.getJavaType(kParameter2.getType()));
                } else if (kParameter2.isVararg()) {
                    objArr[kParameter2.getIndex()] = KCallableImpl.access$defaultEmptyArray(kCallableImpl, kParameter2.getType());
                }
            }
            for (int i11 = 0; i11 < i10; i11++) {
                objArr[size + i11] = 0;
            }
            return objArr;
        }
    }

    /* JADX INFO: compiled from: KCallableImpl.kt */
    public static final class b extends Lambda implements Function0<List<? extends Annotation>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KCallableImpl<R> f79889p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f79889p0 = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends Annotation> invoke() {
            return UtilKt.computeAnnotations(this.f79889p0.getDescriptor());
        }
    }

    /* JADX INFO: compiled from: KCallableImpl.kt */
    public static final class c extends Lambda implements Function0<KTypeImpl> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KCallableImpl<R> f79890p0;

        /* JADX INFO: compiled from: KCallableImpl.kt */
        public static final class a extends Lambda implements Function0<Type> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KCallableImpl<R> f79891p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(KCallableImpl<? extends R> kCallableImpl) {
                super(0);
                this.f79891p0 = kCallableImpl;
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Type invoke() {
                KCallableImpl<R> kCallableImpl = this.f79891p0;
                Type typeAccess$extractContinuationArgument = KCallableImpl.access$extractContinuationArgument(kCallableImpl);
                return typeAccess$extractContinuationArgument == null ? kCallableImpl.getCaller().getReturnType() : typeAccess$extractContinuationArgument;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f79890p0 = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final KTypeImpl invoke() {
            KCallableImpl<R> kCallableImpl = this.f79890p0;
            KotlinType returnType = kCallableImpl.getDescriptor().getReturnType();
            Intrinsics.checkNotNull(returnType);
            return new KTypeImpl(returnType, new a(kCallableImpl));
        }
    }

    /* JADX INFO: compiled from: KCallableImpl.kt */
    @SourceDebugExtension({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_typeParameters$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1549#2:277\n1620#2,3:278\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$_typeParameters$1\n*L\n85#1:277\n85#1:278,3\n*E\n"})
    public static final class d extends Lambda implements Function0<List<? extends KTypeParameterImpl>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KCallableImpl<R> f79892p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f79892p0 = kCallableImpl;
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends KTypeParameterImpl> invoke() {
            KCallableImpl<R> kCallableImpl = this.f79892p0;
            List<TypeParameterDescriptor> typeParameters = kCallableImpl.getDescriptor().getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            List<TypeParameterDescriptor> list = typeParameters;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            for (TypeParameterDescriptor typeParameterDescriptor : list) {
                Intrinsics.checkNotNull(typeParameterDescriptor);
                arrayList.add(new KTypeParameterImpl(kCallableImpl, typeParameterDescriptor));
            }
            return arrayList;
        }
    }

    /* JADX INFO: compiled from: KCallableImpl.kt */
    @SourceDebugExtension({"SMAP\nKCallableImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$parametersNeedMFVCFlattening$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,276:1\n1747#2,3:277\n*S KotlinDebug\n*F\n+ 1 KCallableImpl.kt\nkotlin/reflect/jvm/internal/KCallableImpl$parametersNeedMFVCFlattening$1\n*L\n220#1:277,3\n*E\n"})
    public static final class e extends Lambda implements Function0<Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ KCallableImpl<R> f79893p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(KCallableImpl<? extends R> kCallableImpl) {
            super(0);
            this.f79893p0 = kCallableImpl;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Boolean invoke() {
            List<KParameter> parameters = this.f79893p0.getParameters();
            boolean z10 = false;
            if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                Iterator<T> it = parameters.iterator();
                while (it.hasNext()) {
                    if (UtilKt.getNeedsMultiFieldValueClassFlattening(((KParameter) it.next()).getType())) {
                        z10 = true;
                        break;
                    }
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    public KCallableImpl() {
        ReflectProperties.LazySoftVal<List<Annotation>> lazySoftValLazySoft = ReflectProperties.lazySoft(new b(this));
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft, "lazySoft(...)");
        this.f79877p0 = lazySoftValLazySoft;
        ReflectProperties.LazySoftVal<ArrayList<KParameter>> lazySoftValLazySoft2 = ReflectProperties.lazySoft(new Function0<ArrayList<KParameter>>(this) { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ KCallableImpl<R> f79883p0;

            /* JADX INFO: compiled from: KCallableImpl.kt */
            public static final class a extends Lambda implements Function0<ParameterDescriptor> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ ReceiverParameterDescriptor f79884p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ReceiverParameterDescriptor receiverParameterDescriptor) {
                    super(0);
                    this.f79884p0 = receiverParameterDescriptor;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ParameterDescriptor invoke() {
                    return this.f79884p0;
                }
            }

            /* JADX INFO: compiled from: KCallableImpl.kt */
            public static final class b extends Lambda implements Function0<ParameterDescriptor> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ ReceiverParameterDescriptor f79885p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ReceiverParameterDescriptor receiverParameterDescriptor) {
                    super(0);
                    this.f79885p0 = receiverParameterDescriptor;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ParameterDescriptor invoke() {
                    return this.f79885p0;
                }
            }

            /* JADX INFO: compiled from: KCallableImpl.kt */
            public static final class c extends Lambda implements Function0<ParameterDescriptor> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ CallableMemberDescriptor f79886p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ int f79887q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(CallableMemberDescriptor callableMemberDescriptor, int i10) {
                    super(0);
                    this.f79886p0 = callableMemberDescriptor;
                    this.f79887q0 = i10;
                }

                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final ParameterDescriptor invoke() {
                    ValueParameterDescriptor valueParameterDescriptor = this.f79886p0.getValueParameters().get(this.f79887q0);
                    Intrinsics.checkNotNullExpressionValue(valueParameterDescriptor, "get(...)");
                    return valueParameterDescriptor;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
                this.f79883p0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final ArrayList<KParameter> invoke() {
                int i10;
                KCallableImpl<R> kCallableImpl = this.f79883p0;
                CallableMemberDescriptor descriptor = kCallableImpl.getDescriptor();
                ArrayList<KParameter> arrayList = new ArrayList<>();
                int i11 = 0;
                if (kCallableImpl.isBound()) {
                    i10 = 0;
                } else {
                    ReceiverParameterDescriptor instanceReceiverParameter = UtilKt.getInstanceReceiverParameter(descriptor);
                    if (instanceReceiverParameter != null) {
                        arrayList.add(new KParameterImpl(kCallableImpl, 0, KParameter.Kind.INSTANCE, new a(instanceReceiverParameter)));
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
                    if (extensionReceiverParameter != null) {
                        arrayList.add(new KParameterImpl(kCallableImpl, i10, KParameter.Kind.EXTENSION_RECEIVER, new b(extensionReceiverParameter)));
                        i10++;
                    }
                }
                int size = descriptor.getValueParameters().size();
                while (i11 < size) {
                    arrayList.add(new KParameterImpl(kCallableImpl, i10, KParameter.Kind.VALUE, new c(descriptor, i11)));
                    i11++;
                    i10++;
                }
                if (kCallableImpl.isAnnotationConstructor() && (descriptor instanceof JavaCallableMemberDescriptor) && arrayList.size() > 1) {
                    f.sortWith(arrayList, new Comparator() { // from class: kotlin.reflect.jvm.internal.KCallableImpl$_parameters$1$invoke$$inlined$sortBy$1
                        @Override // java.util.Comparator
                        public final int compare(T t10, T t11) {
                            return e.compareValues(((KParameter) t10).getName(), ((KParameter) t11).getName());
                        }
                    });
                }
                arrayList.trimToSize();
                return arrayList;
            }
        });
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft2, "lazySoft(...)");
        this.f79878q0 = lazySoftValLazySoft2;
        ReflectProperties.LazySoftVal<KTypeImpl> lazySoftValLazySoft3 = ReflectProperties.lazySoft(new c(this));
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft3, "lazySoft(...)");
        this.f79879r0 = lazySoftValLazySoft3;
        ReflectProperties.LazySoftVal<List<KTypeParameterImpl>> lazySoftValLazySoft4 = ReflectProperties.lazySoft(new d(this));
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft4, "lazySoft(...)");
        this.f79880s0 = lazySoftValLazySoft4;
        ReflectProperties.LazySoftVal<Object[]> lazySoftValLazySoft5 = ReflectProperties.lazySoft(new a(this));
        Intrinsics.checkNotNullExpressionValue(lazySoftValLazySoft5, "lazySoft(...)");
        this.f79881t0 = lazySoftValLazySoft5;
        this.f79882u0 = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) new e(this));
    }

    public static Object a(KType kType) {
        Class javaClass = JvmClassMappingKt.getJavaClass((KClass) KTypesJvm.getJvmErasure(kType));
        if (javaClass.isArray()) {
            Object objNewInstance = Array.newInstance(javaClass.getComponentType(), 0);
            Intrinsics.checkNotNullExpressionValue(objNewInstance, "run(...)");
            return objNewInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + javaClass.getSimpleName() + ", because it is not an array type");
    }

    public static final /* synthetic */ Object access$defaultEmptyArray(KCallableImpl kCallableImpl, KType kType) {
        kCallableImpl.getClass();
        return a(kType);
    }

    public static final Type access$extractContinuationArgument(KCallableImpl kCallableImpl) {
        Type[] lowerBounds;
        if (!kCallableImpl.isSuspend()) {
            return null;
        }
        Object objLastOrNull = CollectionsKt___CollectionsKt.lastOrNull((List<? extends Object>) kCallableImpl.getCaller().getParameterTypes());
        ParameterizedType parameterizedType = objLastOrNull instanceof ParameterizedType ? (ParameterizedType) objLastOrNull : null;
        if (!Intrinsics.areEqual(parameterizedType != null ? parameterizedType.getRawType() : null, Continuation.class)) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Intrinsics.checkNotNullExpressionValue(actualTypeArguments, "getActualTypeArguments(...)");
        Object objSingle = ArraysKt___ArraysKt.single(actualTypeArguments);
        WildcardType wildcardType = objSingle instanceof WildcardType ? (WildcardType) objSingle : null;
        if (wildcardType == null || (lowerBounds = wildcardType.getLowerBounds()) == null) {
            return null;
        }
        return (Type) ArraysKt___ArraysKt.first(lowerBounds);
    }

    public final int b(KParameter kParameter) {
        if (!this.f79882u0.getValue().booleanValue()) {
            throw new IllegalArgumentException("Check if parametersNeedMFVCFlattening is true before".toString());
        }
        if (!UtilKt.getNeedsMultiFieldValueClassFlattening(kParameter.getType())) {
            return 1;
        }
        KType type = kParameter.getType();
        Intrinsics.checkNotNull(type, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        List<Method> mfvcUnboxMethods = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(((KTypeImpl) type).getF80013p0()));
        Intrinsics.checkNotNull(mfvcUnboxMethods);
        return mfvcUnboxMethods.size();
    }

    @Override // kotlin.reflect.KCallable
    public R call(@NotNull Object... args) throws IllegalCallableAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        try {
            return (R) getCaller().call(args);
        } catch (IllegalAccessException e5) {
            throw new IllegalCallableAccessException(e5);
        }
    }

    @Override // kotlin.reflect.KCallable
    public R callBy(@NotNull Map<KParameter, ? extends Object> args) throws IllegalCallableAccessException {
        Object objA;
        Intrinsics.checkNotNullParameter(args, "args");
        if (!isAnnotationConstructor()) {
            return callDefaultMethod$kotlin_reflection(args, null);
        }
        List<KParameter> parameters = getParameters();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(parameters, 10));
        for (KParameter kParameter : parameters) {
            if (args.containsKey(kParameter)) {
                objA = args.get(kParameter);
                if (objA == null) {
                    throw new IllegalArgumentException("Annotation argument value cannot be null (" + kParameter + RootService.CLOSE_BRACKET);
                }
            } else if (kParameter.isOptional()) {
                objA = null;
            } else {
                if (!kParameter.isVararg()) {
                    throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
                }
                objA = a(kParameter.getType());
            }
            arrayList.add(objA);
        }
        Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller != null) {
            try {
                return (R) defaultCaller.call(arrayList.toArray(new Object[0]));
            } catch (IllegalAccessException e5) {
                throw new IllegalCallableAccessException(e5);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
    }

    public final R callDefaultMethod$kotlin_reflection(@NotNull Map<KParameter, ? extends Object> args, @Nullable Continuation<?> continuationArgument) throws IllegalCallableAccessException {
        Intrinsics.checkNotNullParameter(args, "args");
        List<KParameter> parameters = getParameters();
        boolean z10 = false;
        if (parameters.isEmpty()) {
            try {
                return (R) getCaller().call(isSuspend() ? new Continuation[]{continuationArgument} : new Continuation[0]);
            } catch (IllegalAccessException e5) {
                throw new IllegalCallableAccessException(e5);
            }
        }
        int size = (isSuspend() ? 1 : 0) + parameters.size();
        Object[] objArr = (Object[]) this.f79881t0.invoke().clone();
        if (isSuspend()) {
            objArr[parameters.size()] = continuationArgument;
        }
        boolean zBooleanValue = this.f79882u0.getValue().booleanValue();
        int i10 = 0;
        for (KParameter kParameter : parameters) {
            int iB = zBooleanValue ? b(kParameter) : 1;
            if (args.containsKey(kParameter)) {
                objArr[kParameter.getIndex()] = args.get(kParameter);
            } else if (kParameter.isOptional()) {
                if (zBooleanValue) {
                    int i11 = i10 + iB;
                    for (int i12 = i10; i12 < i11; i12++) {
                        int i13 = (i12 / 32) + size;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                        objArr[i13] = Integer.valueOf(((Integer) obj).intValue() | (1 << (i12 % 32)));
                    }
                } else {
                    int i14 = (i10 / 32) + size;
                    Object obj2 = objArr[i14];
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                    objArr[i14] = Integer.valueOf(((Integer) obj2).intValue() | (1 << (i10 % 32)));
                }
                z10 = true;
            } else if (!kParameter.isVararg()) {
                throw new IllegalArgumentException("No argument provided for a required parameter: " + kParameter);
            }
            if (kParameter.getKind() == KParameter.Kind.VALUE) {
                i10 += iB;
            }
        }
        if (!z10) {
            try {
                Caller<?> caller = getCaller();
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                return (R) caller.call(objArrCopyOf);
            } catch (IllegalAccessException e7) {
                throw new IllegalCallableAccessException(e7);
            }
        }
        Caller<?> defaultCaller = getDefaultCaller();
        if (defaultCaller != null) {
            try {
                return (R) defaultCaller.call(objArr);
            } catch (IllegalAccessException e10) {
                throw new IllegalCallableAccessException(e10);
            }
        }
        throw new KotlinReflectionInternalError("This callable does not support a default call: " + getDescriptor());
    }

    @Override // kotlin.reflect.KAnnotatedElement
    @NotNull
    public List<Annotation> getAnnotations() {
        List<Annotation> listInvoke = this.f79877p0.invoke();
        Intrinsics.checkNotNullExpressionValue(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @NotNull
    public abstract Caller<?> getCaller();

    @NotNull
    public abstract KDeclarationContainerImpl getContainer();

    @Nullable
    public abstract Caller<?> getDefaultCaller();

    @NotNull
    public abstract CallableMemberDescriptor getDescriptor();

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KParameter> getParameters() {
        ArrayList<KParameter> arrayListInvoke = this.f79878q0.invoke();
        Intrinsics.checkNotNullExpressionValue(arrayListInvoke, "invoke(...)");
        return arrayListInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public KType getReturnType() {
        KTypeImpl kTypeImplInvoke = this.f79879r0.invoke();
        Intrinsics.checkNotNullExpressionValue(kTypeImplInvoke, "invoke(...)");
        return kTypeImplInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @NotNull
    public List<KTypeParameter> getTypeParameters() {
        List<KTypeParameterImpl> listInvoke = this.f79880s0.invoke();
        Intrinsics.checkNotNullExpressionValue(listInvoke, "invoke(...)");
        return listInvoke;
    }

    @Override // kotlin.reflect.KCallable
    @Nullable
    public KVisibility getVisibility() {
        DescriptorVisibility visibility = getDescriptor().getVisibility();
        Intrinsics.checkNotNullExpressionValue(visibility, "getVisibility(...)");
        return UtilKt.toKVisibility(visibility);
    }

    @Override // kotlin.reflect.KCallable
    public boolean isAbstract() {
        return getDescriptor().getModality() == Modality.ABSTRACT;
    }

    public final boolean isAnnotationConstructor() {
        return Intrinsics.areEqual(getName(), "<init>") && getContainer().getJClass().isAnnotation();
    }

    public abstract boolean isBound();

    @Override // kotlin.reflect.KCallable
    public boolean isFinal() {
        return getDescriptor().getModality() == Modality.FINAL;
    }

    @Override // kotlin.reflect.KCallable
    public boolean isOpen() {
        return getDescriptor().getModality() == Modality.OPEN;
    }
}
