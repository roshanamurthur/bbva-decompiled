package kotlin.reflect.jvm.internal.calls;

import androidx.core.app.NotificationCompat;
import androidx.exifinterface.media.ExifInterface;
import bk.d;
import bk.g;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.InlineClassesUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ValueClassAwareCaller.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002 \u0001*\u0004\u0018\u00010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0002!\"B%\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J\u001d\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00028\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller;", "Ljava/lang/reflect/Member;", "M", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", FirebaseAnalytics.Param.INDEX, "Lkotlin/ranges/IntRange;", "getRealSlicesOfParameters", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "c", "Ljava/lang/reflect/Member;", "getMember", "()Ljava/lang/reflect/Member;", "member", "Ljava/lang/reflect/Type;", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "", "getParameterTypes", "()Ljava/util/List;", "parameterTypes", "Lkotlin/reflect/jvm/internal/impl/descriptors/CallableMemberDescriptor;", "descriptor", "oldCaller", "", "isDefault", "<init>", "(Lorg/jetbrains/kotlin/descriptors/CallableMemberDescriptor;Lkotlin/reflect/jvm/internal/calls/Caller;Z)V", "a", "MultiFieldValueClassPrimaryConstructorCaller", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,363:1\n1549#2:364\n1620#2,3:365\n1747#2,3:374\n1620#2,3:377\n37#3,2:368\n37#3,2:372\n37#3,2:380\n1#4:370\n26#5:371\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller\n*L\n43#1:364\n43#1:365,3\n156#1:374,3\n174#1:377,3\n43#1:368,2\n145#1:372,2\n182#1:380,2\n79#1:371\n*E\n"})
public final class ValueClassAwareCaller<M extends Member> implements Caller<M> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f80066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Caller<M> f80067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final M member;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final a f80069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final IntRange[] f80070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f80071f;

    /* JADX INFO: compiled from: ValueClassAwareCaller.kt */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B-\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\b¢\u0006\u0004\b!\u0010\"J\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R'\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", "", "", "args", "", NotificationCompat.CATEGORY_CALL, "([Ljava/lang/Object;)Ljava/lang/Object;", "", "Ljava/lang/Class;", "d", "Ljava/util/List;", "getOriginalParametersGroups", "()Ljava/util/List;", "originalParametersGroups", "Ljava/lang/reflect/Type;", "e", "getParameterTypes", "parameterTypes", "getMember", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "Lkotlin/reflect/jvm/internal/impl/descriptors/FunctionDescriptor;", "descriptor", "Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;", "container", "", "constructorDesc", "Lkotlin/reflect/jvm/internal/impl/descriptors/ParameterDescriptor;", "originalParameters", "<init>", "(Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;Lkotlin/reflect/jvm/internal/KDeclarationContainerImpl;Ljava/lang/String;Ljava/util/List;)V", "kotlin-reflection"}, k = 1, mv = {1, 9, 0})
    @SourceDebugExtension({"SMAP\nValueClassAwareCaller.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,363:1\n1549#2:364\n1620#2,3:365\n1559#2:368\n1590#2,3:369\n1549#2:372\n1620#2,3:373\n1593#2:376\n1360#2:377\n1446#2,2:378\n1549#2:380\n1620#2,3:381\n1448#2,3:384\n37#3,2:387\n*S KotlinDebug\n*F\n+ 1 ValueClassAwareCaller.kt\nkotlin/reflect/jvm/internal/calls/ValueClassAwareCaller$MultiFieldValueClassPrimaryConstructorCaller\n*L\n214#1:364\n214#1:365,3\n222#1:368\n222#1:369,3\n224#1:372\n224#1:373,3\n222#1:376\n231#1:377\n231#1:378,2\n231#1:380\n231#1:381,3\n231#1:384,3\n231#1:387,2\n*E\n"})
    public static final class MultiFieldValueClassPrimaryConstructorCaller implements Caller {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Method f80072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Method f80073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList f80074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final ArrayList f80075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final List<Type> parameterTypes;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
        public MultiFieldValueClassPrimaryConstructorCaller(@NotNull FunctionDescriptor descriptor, @NotNull KDeclarationContainerImpl container, @NotNull String constructorDesc, @NotNull List<? extends ParameterDescriptor> originalParameters) throws ClassNotFoundException {
            ?? ListOf;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(constructorDesc, "constructorDesc");
            Intrinsics.checkNotNullParameter(originalParameters, "originalParameters");
            Method methodFindMethodBySignature = container.findMethodBySignature("constructor-impl", constructorDesc);
            Intrinsics.checkNotNull(methodFindMethodBySignature);
            this.f80072a = methodFindMethodBySignature;
            Method methodFindMethodBySignature2 = container.findMethodBySignature("box-impl", StringsKt__StringsKt.removeSuffix(constructorDesc, (CharSequence) ExifInterface.GPS_MEASUREMENT_INTERRUPTED) + ReflectClassUtilKt.getDesc(container.getJClass()));
            Intrinsics.checkNotNull(methodFindMethodBySignature2);
            this.f80073b = methodFindMethodBySignature2;
            List<? extends ParameterDescriptor> list = originalParameters;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KotlinType type = ((ParameterDescriptor) it.next()).getType();
                Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
                arrayList.add(ValueClassAwareCallerKt.access$getValueClassUnboxMethods(TypeSubstitutionKt.asSimpleType(type), descriptor));
            }
            this.f80074c = arrayList;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                ClassifierDescriptor classifierDescriptorMo5778getDeclarationDescriptor = ((ParameterDescriptor) obj).getType().getConstructor().mo5778getDeclarationDescriptor();
                Intrinsics.checkNotNull(classifierDescriptorMo5778getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo5778getDeclarationDescriptor;
                List list2 = (List) this.f80074c.get(i10);
                if (list2 != null) {
                    List list3 = list2;
                    ListOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        ListOf.add(((Method) it2.next()).getReturnType());
                    }
                } else {
                    Class<?> javaClass = UtilKt.toJavaClass(classDescriptor);
                    Intrinsics.checkNotNull(javaClass);
                    ListOf = d.listOf(javaClass);
                }
                arrayList2.add(ListOf);
                i10 = i11;
            }
            this.f80075d = arrayList2;
            this.parameterTypes = CollectionsKt__IterablesKt.flatten(arrayList2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v1 */
        /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @Nullable
        public Object call(@NotNull Object[] args) throws IllegalAccessException, InvocationTargetException {
            ?? ListOf;
            Intrinsics.checkNotNullParameter(args, "args");
            List<Pair> listZip = ArraysKt___ArraysKt.zip(args, this.f80074c);
            ArrayList arrayList = new ArrayList();
            for (Pair pair : listZip) {
                Object objComponent1 = pair.component1();
                List list = (List) pair.component2();
                if (list != null) {
                    List list2 = list;
                    ListOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        ListOf.add(((Method) it.next()).invoke(objComponent1, new Object[0]));
                    }
                } else {
                    ListOf = d.listOf(objComponent1);
                }
                g.addAll(arrayList, (Iterable) ListOf);
            }
            Object[] array = arrayList.toArray(new Object[0]);
            this.f80072a.invoke(null, Arrays.copyOf(array, array.length));
            return this.f80073b.invoke(null, Arrays.copyOf(array, array.length));
        }

        @Nullable
        public Void getMember() {
            return null;
        }

        @NotNull
        public final List<List<Class<?>>> getOriginalParametersGroups() {
            return this.f80075d;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @NotNull
        public List<Type> getParameterTypes() {
            return this.parameterTypes;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        @NotNull
        public Type getReturnType() {
            Class<?> returnType = this.f80073b.getReturnType();
            Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
            return returnType;
        }

        @Override // kotlin.reflect.jvm.internal.calls.Caller
        /* JADX INFO: renamed from: getMember */
        public /* bridge */ /* synthetic */ Member mo5770getMember() {
            return (Member) getMember();
        }
    }

    /* JADX INFO: compiled from: ValueClassAwareCaller.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final IntRange f80077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final List<Method>[] f80078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final Method f80079c;

        public a(@NotNull IntRange argumentRange, @NotNull List<Method>[] unboxParameters, @Nullable Method method) {
            Intrinsics.checkNotNullParameter(argumentRange, "argumentRange");
            Intrinsics.checkNotNullParameter(unboxParameters, "unboxParameters");
            this.f80077a = argumentRange;
            this.f80078b = unboxParameters;
            this.f80079c = method;
        }

        @NotNull
        public final IntRange getArgumentRange() {
            return this.f80077a;
        }

        @Nullable
        public final Method getBox() {
            return this.f80079c;
        }

        @NotNull
        public final List<Method>[] getUnboxParameters() {
            return this.f80078b;
        }
    }

    /* JADX INFO: compiled from: ValueClassAwareCaller.kt */
    public static final class b extends Lambda implements Function1<ClassDescriptor, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f80080p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        public final Boolean invoke(@NotNull ClassDescriptor makeKotlinParameterTypes) {
            Intrinsics.checkNotNullParameter(makeKotlinParameterTypes, "$this$makeKotlinParameterTypes");
            return Boolean.valueOf(InlineClassesUtilsKt.isValueClass(makeKotlinParameterTypes));
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00d9  */
    public ValueClassAwareCaller(@NotNull CallableMemberDescriptor descriptor, @NotNull Caller<? extends M> oldCaller, boolean z10) {
        Class clsC;
        int i10;
        a aVar;
        KotlinType kotlinTypeSubstitutedUnderlyingType;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(oldCaller, "oldCaller");
        this.f80066a = z10;
        boolean z11 = false;
        if (oldCaller instanceof CallerImpl.Method.BoundStatic) {
            ReceiverParameterDescriptor extensionReceiverParameter = descriptor.getExtensionReceiverParameter();
            extensionReceiverParameter = extensionReceiverParameter == null ? descriptor.getDispatchReceiverParameter() : extensionReceiverParameter;
            KotlinType type = extensionReceiverParameter != null ? extensionReceiverParameter.getType() : null;
            if (type != null && InlineClassesUtilsKt.needsMfvcFlattening(type)) {
                List<Method> mfvcUnboxMethods = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType(type));
                Intrinsics.checkNotNull(mfvcUnboxMethods);
                List<Method> list = mfvcUnboxMethods;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Method) it.next()).invoke(((CallerImpl.Method.BoundStatic) oldCaller).getBoundReceiver(), new Object[0]));
                }
                oldCaller = new CallerImpl.Method.BoundStaticMultiFieldValueClass(((CallerImpl.Method.BoundStatic) oldCaller).mo5770getMember(), arrayList.toArray(new Object[0]));
            }
        }
        this.f80067b = (Caller<M>) oldCaller;
        this.member = (M) oldCaller.mo5770getMember();
        KotlinType returnType = descriptor.getReturnType();
        Intrinsics.checkNotNull(returnType);
        boolean z12 = descriptor instanceof FunctionDescriptor;
        Method methodAccess$getBoxMethod = ((z12 && ((FunctionDescriptor) descriptor).isSuspend() && (kotlinTypeSubstitutedUnderlyingType = InlineClassesUtilsKt.substitutedUnderlyingType(returnType)) != null && KotlinBuiltIns.isPrimitiveType(kotlinTypeSubstitutedUnderlyingType)) || (clsC = ValueClassAwareCallerKt.c(returnType)) == null) ? null : ValueClassAwareCallerKt.access$getBoxMethod(clsC, descriptor);
        if (InlineClassesUtilsKt.isGetterOfUnderlyingPropertyOfValueClass(descriptor)) {
            aVar = new a(IntRange.INSTANCE.getEMPTY(), new List[0], methodAccess$getBoxMethod);
        } else {
            int i11 = -1;
            if (!(oldCaller instanceof CallerImpl.Method.BoundStatic) && !(oldCaller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass)) {
                if (descriptor instanceof ConstructorDescriptor) {
                    if (!(oldCaller instanceof BoundCaller)) {
                        i11 = 0;
                    }
                } else if (descriptor.getDispatchReceiverParameter() == null || (oldCaller instanceof BoundCaller)) {
                    i11 = 0;
                } else {
                    DeclarationDescriptor containingDeclaration = descriptor.getContainingDeclaration();
                    Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                    if (InlineClassesUtilsKt.isValueClass(containingDeclaration)) {
                        i11 = 0;
                    } else {
                        i11 = 1;
                    }
                }
            }
            int i12 = oldCaller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass ? -((CallerImpl.Method.BoundStaticMultiFieldValueClass) oldCaller).getReceiverComponentsCount() : i11;
            List listAccess$makeKotlinParameterTypes = ValueClassAwareCallerKt.access$makeKotlinParameterTypes(descriptor, b.f80080p0);
            if (this.f80066a) {
                Iterator it2 = listAccess$makeKotlinParameterTypes.iterator();
                int size = 0;
                while (it2.hasNext()) {
                    List<Method> mfvcUnboxMethods2 = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType((KotlinType) it2.next()));
                    size += mfvcUnboxMethods2 != null ? mfvcUnboxMethods2.size() : 1;
                }
                i10 = ((size + 31) / 32) + 1;
            } else {
                i10 = 0;
            }
            int i13 = i10 + ((z12 && ((FunctionDescriptor) descriptor).isSuspend()) ? 1 : 0);
            Iterator it3 = listAccess$makeKotlinParameterTypes.iterator();
            int size2 = 0;
            while (it3.hasNext()) {
                List<Method> mfvcUnboxMethods3 = ValueClassAwareCallerKt.getMfvcUnboxMethods(TypeSubstitutionKt.asSimpleType((KotlinType) it3.next()));
                size2 += mfvcUnboxMethods3 != null ? mfvcUnboxMethods3.size() : 1;
            }
            int i14 = size2 + i12 + i13;
            ValueClassAwareCallerKt.access$checkParametersSize(this, i14, descriptor, this.f80066a);
            IntRange intRangeUntil = c.until(Math.max(i11, 0), listAccess$makeKotlinParameterTypes.size() + i11);
            List[] listArr = new List[i14];
            int i15 = 0;
            while (i15 < i14) {
                listArr[i15] = (i15 > intRangeUntil.getLast() || intRangeUntil.getFirst() > i15) ? null : ValueClassAwareCallerKt.access$getValueClassUnboxMethods(TypeSubstitutionKt.asSimpleType((KotlinType) listAccess$makeKotlinParameterTypes.get(i15 - i11)), descriptor);
                i15++;
            }
            aVar = new a(intRangeUntil, listArr, methodAccess$getBoxMethod);
        }
        this.f80069d = aVar;
        List listCreateListBuilder = d.createListBuilder();
        Caller<M> caller = this.f80067b;
        int length = caller instanceof CallerImpl.Method.BoundStaticMultiFieldValueClass ? ((CallerImpl.Method.BoundStaticMultiFieldValueClass) caller).getBoundReceiverComponents().length : caller instanceof CallerImpl.Method.BoundStatic ? 1 : 0;
        if (length > 0) {
            listCreateListBuilder.add(c.until(0, length));
        }
        List<Method>[] unboxParameters = aVar.getUnboxParameters();
        int length2 = unboxParameters.length;
        int i16 = 0;
        while (i16 < length2) {
            List<Method> list2 = unboxParameters[i16];
            int size3 = (list2 != null ? list2.size() : 1) + length;
            listCreateListBuilder.add(c.until(length, size3));
            i16++;
            length = size3;
        }
        this.f80070e = (IntRange[]) d.build(listCreateListBuilder).toArray(new IntRange[0]);
        Iterable argumentRange = this.f80069d.getArgumentRange();
        if (!(argumentRange instanceof Collection) || !((Collection) argumentRange).isEmpty()) {
            Iterator it4 = argumentRange.iterator();
            while (it4.hasNext()) {
                List<Method> list3 = this.f80069d.getUnboxParameters()[((IntIterator) it4).nextInt()];
                if (list3 != null && list3.size() > 1) {
                    z11 = true;
                    break;
                }
            }
        }
        this.f80071f = z11;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @Nullable
    public Object call(@NotNull Object[] args) throws IllegalAccessException, InvocationTargetException {
        Object objInvoke;
        Object objDefaultPrimitiveValue;
        Object objDefaultPrimitiveValue2;
        Object[] args2 = args;
        Intrinsics.checkNotNullParameter(args2, "args");
        a aVar = this.f80069d;
        IntRange argumentRange = aVar.getArgumentRange();
        List<Method>[] unboxParameters = aVar.getUnboxParameters();
        Method box = aVar.getBox();
        if (!argumentRange.isEmpty()) {
            if (this.f80071f) {
                List listCreateListBuilder = d.createListBuilder(args2.length);
                int first = argumentRange.getFirst();
                for (int i10 = 0; i10 < first; i10++) {
                    listCreateListBuilder.add(args2[i10]);
                }
                int first2 = argumentRange.getFirst();
                int last = argumentRange.getLast();
                if (first2 <= last) {
                    while (true) {
                        List<Method> list = unboxParameters[first2];
                        Object obj = args2[first2];
                        if (list != null) {
                            for (Method method : list) {
                                List list2 = listCreateListBuilder;
                                if (obj != null) {
                                    objDefaultPrimitiveValue2 = method.invoke(obj, new Object[0]);
                                } else {
                                    Class<?> returnType = method.getReturnType();
                                    Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                                    objDefaultPrimitiveValue2 = UtilKt.defaultPrimitiveValue(returnType);
                                }
                                list2.add(objDefaultPrimitiveValue2);
                            }
                        } else {
                            listCreateListBuilder.add(obj);
                        }
                        if (first2 == last) {
                            break;
                        }
                        first2++;
                    }
                }
                int last2 = argumentRange.getLast() + 1;
                int lastIndex = ArraysKt___ArraysKt.getLastIndex(args);
                if (last2 <= lastIndex) {
                    while (true) {
                        listCreateListBuilder.add(args2[last2]);
                        if (last2 == lastIndex) {
                            break;
                        }
                        last2++;
                    }
                }
                args2 = d.build(listCreateListBuilder).toArray(new Object[0]);
            } else {
                int length = args2.length;
                Object[] objArr = new Object[length];
                for (int i11 = 0; i11 < length; i11++) {
                    int first3 = argumentRange.getFirst();
                    if (i11 > argumentRange.getLast() || first3 > i11) {
                        objDefaultPrimitiveValue = args2[i11];
                    } else {
                        List<Method> list3 = unboxParameters[i11];
                        Method method2 = list3 != null ? (Method) CollectionsKt___CollectionsKt.single((List) list3) : null;
                        objDefaultPrimitiveValue = args2[i11];
                        if (method2 != null) {
                            if (objDefaultPrimitiveValue != null) {
                                objDefaultPrimitiveValue = method2.invoke(objDefaultPrimitiveValue, new Object[0]);
                            } else {
                                Class<?> returnType2 = method2.getReturnType();
                                Intrinsics.checkNotNullExpressionValue(returnType2, "getReturnType(...)");
                                objDefaultPrimitiveValue = UtilKt.defaultPrimitiveValue(returnType2);
                            }
                        }
                    }
                    objArr[i11] = objDefaultPrimitiveValue;
                }
                args2 = objArr;
            }
        }
        Object objCall = this.f80067b.call(args2);
        return (objCall == ek.a.getCOROUTINE_SUSPENDED() || box == null || (objInvoke = box.invoke(null, objCall)) == null) ? objCall : objInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    /* JADX INFO: renamed from: getMember */
    public M mo5770getMember() {
        return this.member;
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public List<Type> getParameterTypes() {
        return this.f80067b.getParameterTypes();
    }

    @NotNull
    public final IntRange getRealSlicesOfParameters(int index) {
        IntRange[] intRangeArr = this.f80070e;
        if (index >= 0 && index < intRangeArr.length) {
            return intRangeArr[index];
        }
        if (intRangeArr.length == 0) {
            return new IntRange(index, index);
        }
        int last = ((IntRange) ArraysKt___ArraysKt.last(intRangeArr)).getLast() + 1 + (index - intRangeArr.length);
        return new IntRange(last, last);
    }

    @Override // kotlin.reflect.jvm.internal.calls.Caller
    @NotNull
    public Type getReturnType() {
        return this.f80067b.getReturnType();
    }
}
