package androidx.compose.runtime.collection;

import androidx.collection.ScatterSet;
import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScatterSetWrapper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a'\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005H\u0080\b\u001a1\u0010\u0006\u001a\u00020\u0007\"\b\b\u0000\u0010\b*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\b0\u00022\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\b\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\b\u001a\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0002\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\nH\u0000¨\u0006\u000b"}, d2 = {"fastAny", "", "", "", "block", "Lkotlin/Function1;", "fastForEach", "", ExifInterface.GPS_DIRECTION_TRUE, "wrapIntoSet", "Landroidx/collection/ScatterSet;", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nScatterSetWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,63:1\n267#2,4:64\n237#2,7:68\n248#2,3:76\n251#2,2:80\n272#2,2:82\n254#2,6:84\n274#2:90\n296#2,2:93\n267#2,4:95\n237#2,7:99\n248#2,3:107\n251#2,2:111\n272#2:113\n298#2,2:114\n273#2:116\n254#2,6:117\n274#2:123\n300#2:124\n1810#3:75\n1672#3:79\n1810#3:106\n1672#3:110\n1855#4,2:91\n1747#4,3:125\n*S KotlinDebug\n*F\n+ 1 ScatterSetWrapper.kt\nandroidx/compose/runtime/collection/ScatterSetWrapperKt\n*L\n50#1:64,4\n50#1:68,7\n50#1:76,3\n50#1:80,2\n50#1:82,2\n50#1:84,6\n50#1:90\n59#1:93,2\n59#1:95,4\n59#1:99,7\n59#1:107,3\n59#1:111,2\n59#1:113\n59#1:114,2\n59#1:116\n59#1:117,6\n59#1:123\n59#1:124\n50#1:75\n50#1:79\n59#1:106\n59#1:110\n53#1:91,2\n61#1:125,3\n*E\n"})
public final class ScatterSetWrapperKt {
    /* JADX WARN: Code duplicated, block: B:18:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[LOOP:0: B:7:0x0016->B:19:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0058 A[SYNTHETIC] */
    public static final boolean fastAny(@NotNull Set<? extends Object> set, @NotNull Function1<Object, Boolean> function1) {
        if (set instanceof ScatterSetWrapper) {
            ScatterSet set$runtime_release = ((ScatterSetWrapper) set).getSet$runtime_release();
            Object[] objArr = set$runtime_release.elements;
            long[] jArr = set$runtime_release.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i10 = 0;
                while (true) {
                    long j10 = jArr[i10];
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i11 = 8 - ((~(i10 - length)) >>> 31);
                        for (int i12 = 0; i12 < i11; i12++) {
                            if ((255 & j10) < 128 && function1.invoke(objArr[(i10 << 3) + i12]).booleanValue()) {
                                return true;
                            }
                            j10 >>= 8;
                        }
                        if (i11 == 8) {
                            if (i10 != length) {
                                i10++;
                            }
                        }
                    } else if (i10 != length) {
                        i10++;
                    }
                }
            }
        } else {
            Set<? extends Object> set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator<T> it = set2.iterator();
                while (it.hasNext()) {
                    if (function1.invoke(it.next()).booleanValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final <T> void fastForEach(@NotNull Set<? extends T> set, @NotNull Function1<? super T, Unit> function1) {
        if (!(set instanceof ScatterSetWrapper)) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                function1.invoke(it.next());
            }
            return;
        }
        ScatterSet<T> set$runtime_release = ((ScatterSetWrapper) set).getSet$runtime_release();
        Object[] objArr = set$runtime_release.elements;
        long[] jArr = set$runtime_release.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        function1.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @NotNull
    public static final <T> Set<T> wrapIntoSet(@NotNull ScatterSet<T> scatterSet) {
        return new ScatterSetWrapper(scatterSet);
    }
}
