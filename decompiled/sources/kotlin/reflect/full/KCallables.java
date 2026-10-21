package kotlin.reflect.full;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.UtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: KCallables.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u001a6\u0010\u000f\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u00022\u0016\u0010\u0011\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00130\u0012\"\u0004\u0018\u00010\u0013H\u0087@¢\u0006\u0002\u0010\u0014\u001a4\u0010\u0015\u001a\u0002H\u0010\"\u0004\b\u0000\u0010\u0010*\b\u0012\u0004\u0012\u0002H\u00100\u00022\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0016H\u0087@¢\u0006\u0002\u0010\u0017\u001a\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0019\u001a\u00020\u001aH\u0007\"$\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"$\u0010\u0007\u001a\u0004\u0018\u00010\u0001*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\"(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b*\u0006\u0012\u0002\b\u00030\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0004\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, d2 = {"extensionReceiverParameter", "Lkotlin/reflect/KParameter;", "Lkotlin/reflect/KCallable;", "getExtensionReceiverParameter$annotations", "(Lkotlin/reflect/KCallable;)V", "getExtensionReceiverParameter", "(Lkotlin/reflect/KCallable;)Lkotlin/reflect/KParameter;", "instanceParameter", "getInstanceParameter$annotations", "getInstanceParameter", "valueParameters", "", "getValueParameters$annotations", "getValueParameters", "(Lkotlin/reflect/KCallable;)Ljava/util/List;", "callSuspend", "R", "args", "", "", "(Lkotlin/reflect/KCallable;[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callSuspendBy", "", "(Lkotlin/reflect/KCallable;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findParameterByName", "name", "", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "KCallables")
@SourceDebugExtension({"SMAP\nKCallables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,82:1\n661#2,11:83\n661#2,11:94\n766#2:105\n857#2,2:106\n661#2,11:108\n1#3:119\n*S KotlinDebug\n*F\n+ 1 KCallables.kt\nkotlin/reflect/full/KCallables\n*L\n23#1:83,11\n31#1:94,11\n38#1:105\n38#1:106,2\n45#1:108,11\n*E\n"})
public final class KCallables {

    /* JADX INFO: compiled from: KCallables.kt */
    @DebugMetadata(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", i = {0, 0}, l = {56}, m = "callSuspend", n = {"$this$callSuspend", "args"}, s = {"L$0", "L$1"})
    public static final class a<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public KCallable f79834p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Object[] f79835q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f79836r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f79837s0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f79836r0 = obj;
            this.f79837s0 |= Integer.MIN_VALUE;
            return KCallables.callSuspend(null, null, this);
        }
    }

    /* JADX INFO: compiled from: KCallables.kt */
    @DebugMetadata(c = "kotlin.reflect.full.KCallables", f = "KCallables.kt", i = {0, 0, 0}, l = {74}, m = "callSuspendBy", n = {"$this$callSuspendBy", "args", "kCallable"}, s = {"L$0", "L$1", "L$2"})
    public static final class b<R> extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public KCallable f79838p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Map f79839q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f79840r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f79841s0;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f79840r0 = obj;
            this.f79841s0 |= Integer.MIN_VALUE;
            return KCallables.callSuspendBy(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final <R> Object callSuspend(@NotNull KCallable<? extends R> kCallable, @NotNull Object[] objArr, @NotNull Continuation<? super R> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f79837s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f79837s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objCall = aVar.f79836r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f79837s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objCall);
            if (!kCallable.isSuspend()) {
                return kCallable.call(Arrays.copyOf(objArr, objArr.length));
            }
            if (!(kCallable instanceof KFunction)) {
                throw new IllegalArgumentException("Cannot callSuspend on a property " + kCallable + ": suspend properties are not supported yet");
            }
            aVar.f79834p0 = kCallable;
            aVar.f79835q0 = objArr;
            aVar.f79837s0 = 1;
            SpreadBuilder spreadBuilder = new SpreadBuilder(2);
            spreadBuilder.addSpread(objArr);
            spreadBuilder.add(aVar);
            objCall = kCallable.call(spreadBuilder.toArray(new Object[spreadBuilder.size()]));
            if (objCall == ek.a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(aVar);
            }
            if (objCall == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kCallable = aVar.f79834p0;
            ResultKt.throwOnFailure(objCall);
        }
        return (!Intrinsics.areEqual(kCallable.getReturnType().getClassifier(), Reflection.getOrCreateKotlinClass(Unit.class)) || kCallable.getReturnType().isMarkedNullable()) ? objCall : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @SinceKotlin(version = "1.3")
    @Nullable
    public static final <R> Object callSuspendBy(@NotNull KCallable<? extends R> kCallable, @NotNull Map<KParameter, ? extends Object> map, @NotNull Continuation<? super R> continuation) throws IllegalCallableAccessException {
        b bVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f79841s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f79841s0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objCallDefaultMethod$kotlin_reflection = bVar.f79840r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f79841s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objCallDefaultMethod$kotlin_reflection);
            if (!kCallable.isSuspend()) {
                return kCallable.callBy(map);
            }
            if (!(kCallable instanceof KFunction)) {
                throw new IllegalArgumentException("Cannot callSuspendBy on a property " + kCallable + ": suspend properties are not supported yet");
            }
            KCallableImpl<?> kCallableImplAsKCallableImpl = UtilKt.asKCallableImpl(kCallable);
            if (kCallableImplAsKCallableImpl == null) {
                throw new KotlinReflectionInternalError("This callable does not support a default call: " + kCallable);
            }
            bVar.f79838p0 = kCallable;
            bVar.f79839q0 = map;
            bVar.getClass();
            bVar.f79841s0 = 1;
            objCallDefaultMethod$kotlin_reflection = kCallableImplAsKCallableImpl.callDefaultMethod$kotlin_reflection(map, bVar);
            if (objCallDefaultMethod$kotlin_reflection == ek.a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(bVar);
            }
            if (objCallDefaultMethod$kotlin_reflection == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Map map2 = bVar.f79839q0;
            kCallable = bVar.f79838p0;
            ResultKt.throwOnFailure(objCallDefaultMethod$kotlin_reflection);
        }
        return (!Intrinsics.areEqual(kCallable.getReturnType().getClassifier(), Reflection.getOrCreateKotlinClass(Unit.class)) || kCallable.getReturnType().isMarkedNullable()) ? objCallDefaultMethod$kotlin_reflection : Unit.INSTANCE;
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final KParameter findParameterByName(@NotNull KCallable<?> kCallable, @NotNull String name) {
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Object obj = null;
        boolean z10 = false;
        Object obj2 = null;
        for (Object obj3 : kCallable.getParameters()) {
            if (Intrinsics.areEqual(((KParameter) obj3).getName(), name)) {
                if (z10) {
                    return (KParameter) obj;
                }
                z10 = true;
                obj2 = obj3;
            }
        }
        if (z10) {
            obj = obj2;
        }
        return (KParameter) obj;
    }

    @Nullable
    public static final KParameter getExtensionReceiverParameter(@NotNull KCallable<?> kCallable) {
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        Object obj = null;
        boolean z10 = false;
        Object obj2 = null;
        for (Object obj3 : kCallable.getParameters()) {
            if (((KParameter) obj3).getKind() == KParameter.Kind.EXTENSION_RECEIVER) {
                if (z10) {
                    return (KParameter) obj;
                }
                z10 = true;
                obj2 = obj3;
            }
        }
        if (z10) {
            obj = obj2;
        }
        return (KParameter) obj;
    }

    @Nullable
    public static final KParameter getInstanceParameter(@NotNull KCallable<?> kCallable) {
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        Object obj = null;
        boolean z10 = false;
        Object obj2 = null;
        for (Object obj3 : kCallable.getParameters()) {
            if (((KParameter) obj3).getKind() == KParameter.Kind.INSTANCE) {
                if (z10) {
                    return (KParameter) obj;
                }
                z10 = true;
                obj2 = obj3;
            }
        }
        if (z10) {
            obj = obj2;
        }
        return (KParameter) obj;
    }

    @NotNull
    public static final List<KParameter> getValueParameters(@NotNull KCallable<?> kCallable) {
        Intrinsics.checkNotNullParameter(kCallable, "<this>");
        List<KParameter> parameters = kCallable.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((KParameter) obj).getKind() == KParameter.Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getExtensionReceiverParameter$annotations(KCallable kCallable) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getInstanceParameter$annotations(KCallable kCallable) {
    }

    @SinceKotlin(version = "1.1")
    public static /* synthetic */ void getValueParameters$annotations(KCallable kCallable) {
    }
}
