package androidx.compose.runtime.reflect;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ComposableMethod.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0006\u0010\u0003\u001a\u00020\u0002J<\u0010\t\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0016\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\u0007\"\u0004\u0018\u00010\u0001H\u0086\u0002¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016R\u0011\u0010\u0012\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00078F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u001a\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00170\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006 "}, d2 = {"Landroidx/compose/runtime/reflect/ComposableMethod;", "", "Ljava/lang/reflect/Method;", "asMethod", "Landroidx/compose/runtime/Composer;", "composer", "instance", "", "args", "invoke", "(Landroidx/compose/runtime/Composer;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "getParameterCount", "()I", "parameterCount", "Ljava/lang/reflect/Parameter;", "getParameters", "()[Ljava/lang/reflect/Parameter;", "parameters", "Ljava/lang/Class;", "getParameterTypes", "()[Ljava/lang/Class;", "parameterTypes", "method", "Landroidx/compose/runtime/reflect/ComposableInfo;", "composableInfo", "<init>", "(Ljava/lang/reflect/Method;Landroidx/compose/runtime/reflect/ComposableInfo;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,222:1\n1549#2:223\n1620#2,3:224\n1804#2,4:227\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethod\n*L\n145#1:223\n145#1:224,3\n146#1:227,4\n*E\n"})
public final class ComposableMethod {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Method f15193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ComposableInfo f15194b;

    public ComposableMethod(@NotNull Method method, @NotNull ComposableInfo composableInfo) {
        this.f15193a = method;
        this.f15194b = composableInfo;
    }

    @NotNull
    /* JADX INFO: renamed from: asMethod, reason: from getter */
    public final Method getF15193a() {
        return this.f15193a;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ComposableMethod)) {
            return false;
        }
        return Intrinsics.areEqual(this.f15193a, ((ComposableMethod) other).f15193a);
    }

    public final int getParameterCount() {
        return this.f15194b.getRealParamsCount();
    }

    @NotNull
    public final Class<?>[] getParameterTypes() {
        return (Class[]) ArraysKt___ArraysJvmKt.copyOfRange(this.f15193a.getParameterTypes(), 0, this.f15194b.getRealParamsCount());
    }

    @NotNull
    public final Parameter[] getParameters() {
        return (Parameter[]) ArraysKt___ArraysJvmKt.copyOfRange(this.f15193a.getParameters(), 0, this.f15194b.getRealParamsCount());
    }

    public int hashCode() {
        return this.f15193a.hashCode();
    }

    @Nullable
    public final Object invoke(@NotNull Composer composer, @Nullable Object instance, @NotNull Object... args) {
        Object objAccess$getDefaultValue;
        ComposableInfo composableInfo = this.f15194b;
        int realParamsCount = composableInfo.getRealParamsCount();
        int changedParams = composableInfo.getChangedParams();
        int defaultParams = composableInfo.getDefaultParams();
        Method method = this.f15193a;
        int length = method.getParameterTypes().length;
        int i10 = realParamsCount + 1;
        int i11 = changedParams + i10;
        Object[] objArr = new Integer[defaultParams];
        int i12 = 0;
        for (int i13 = 0; i13 < defaultParams; i13++) {
            int i14 = i13 * 31;
            IntRange intRangeUntil = c.until(i14, Math.min(i14 + 31, realParamsCount));
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(intRangeUntil, 10));
            Iterator<Integer> it = intRangeUntil.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                arrayList.add(Integer.valueOf((iNextInt >= args.length || args[iNextInt] == null) ? 1 : 0));
            }
            int iIntValue = 0;
            int i15 = 0;
            for (Object obj : arrayList) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                iIntValue |= ((Number) obj).intValue() << i15;
                i15 = i16;
            }
            objArr[i13] = Integer.valueOf(iIntValue);
        }
        Object[] objArr2 = new Object[length];
        while (i12 < length) {
            if (i12 >= 0 && i12 < realParamsCount) {
                objAccess$getDefaultValue = (i12 < 0 || i12 > ArraysKt___ArraysKt.getLastIndex(args)) ? ComposableMethodKt.access$getDefaultValue(method.getParameterTypes()[i12]) : args[i12];
            } else if (i12 == realParamsCount) {
                objAccess$getDefaultValue = composer;
            } else if (i12 == i10 || (realParamsCount + 2 <= i12 && i12 < i11)) {
                objAccess$getDefaultValue = 0;
            } else {
                if (i11 > i12 || i12 >= length) {
                    throw new IllegalStateException("Unexpected index".toString());
                }
                objAccess$getDefaultValue = objArr[i12 - i11];
            }
            objArr2[i12] = objAccess$getDefaultValue;
            i12++;
        }
        return method.invoke(instance, Arrays.copyOf(objArr2, length));
    }
}
