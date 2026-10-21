package androidx.compose.runtime.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ThreadMap.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/internal/ThreadMap;", "", "", "key", "get", "value", "", "trySet", "newWith", "", "size", "", "keys", "", "values", "<init>", "(I[J[Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nThreadMap.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,112:1\n12904#2,3:113\n*S KotlinDebug\n*F\n+ 1 ThreadMap.jvm.kt\nandroidx/compose/runtime/internal/ThreadMap\n*L\n42#1:113,3\n*E\n"})
public final class ThreadMap {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final long[] f15186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Object[] f15187c;

    public ThreadMap(int i10, @NotNull long[] jArr, @NotNull Object[] objArr) {
        this.f15185a = i10;
        this.f15186b = jArr;
        this.f15187c = objArr;
    }

    public final int a(long j10) {
        int i10 = this.f15185a - 1;
        if (i10 == -1) {
            return -1;
        }
        long[] jArr = this.f15186b;
        int i11 = 0;
        if (i10 == 0) {
            long j11 = jArr[0];
            if (j11 == j10) {
                return 0;
            }
            return j11 > j10 ? -2 : -1;
        }
        while (i11 <= i10) {
            int i12 = (i11 + i10) >>> 1;
            long j12 = jArr[i12] - j10;
            if (j12 < 0) {
                i11 = i12 + 1;
            } else {
                if (j12 <= 0) {
                    return i12;
                }
                i10 = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    @Nullable
    public final Object get(long key) {
        int iA = a(key);
        if (iA >= 0) {
            return this.f15187c[iA];
        }
        return null;
    }

    @NotNull
    public final ThreadMap newWith(long key, @Nullable Object value) {
        long[] jArr;
        int i10;
        Object[] objArr = this.f15187c;
        int i11 = 0;
        int i12 = 0;
        for (Object obj : objArr) {
            if (obj != null) {
                i12++;
            }
        }
        int i13 = i12 + 1;
        long[] jArr2 = new long[i13];
        Object[] objArr2 = new Object[i13];
        if (i13 > 1) {
            int i14 = 0;
            while (true) {
                jArr = this.f15186b;
                i10 = this.f15185a;
                if (i11 >= i13 || i14 >= i10) {
                    break;
                }
                long j10 = jArr[i14];
                Object obj2 = objArr[i14];
                if (j10 > key) {
                    jArr2[i11] = key;
                    objArr2[i11] = value;
                    i11++;
                    break;
                }
                if (obj2 != null) {
                    jArr2[i11] = j10;
                    objArr2[i11] = obj2;
                    i11++;
                }
                i14++;
            }
            if (i14 == i10) {
                jArr2[i12] = key;
                objArr2[i12] = value;
            } else {
                while (i11 < i13) {
                    long j11 = jArr[i14];
                    Object obj3 = objArr[i14];
                    if (obj3 != null) {
                        jArr2[i11] = j11;
                        objArr2[i11] = obj3;
                        i11++;
                    }
                    i14++;
                }
            }
        } else {
            jArr2[0] = key;
            objArr2[0] = value;
        }
        return new ThreadMap(i13, jArr2, objArr2);
    }

    public final boolean trySet(long key, @Nullable Object value) {
        int iA = a(key);
        if (iA < 0) {
            return false;
        }
        this.f15187c[iA] = value;
        return true;
    }
}
