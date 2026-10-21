package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SparseArrayCompat.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a)\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a/\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a \u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a+\u0010\t\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0080\b\u001a!\u0010\u000e\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00020\u0002H\u0080\b\u001a)\u0010\u0010\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0002H\u0080\b\u001a2\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0007\u001a8\u0010\u0011\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0011\u0010\u0014\u001a0\u0010\u0015\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0015\u0010\u0016\u001a)\u0010\u0018\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001H\u0080\b\u001a2\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u0019\u0010\u0007\u001a\u0019\u0010\u001a\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a\u0019\u0010\u001b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a!\u0010\u001c\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00020\u0002H\u0080\b\u001a(\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\u001d\u0010\u0005\u001a0\u0010\u001e\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b\u001e\u0010\u0016\u001a!\u0010\u001f\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b\u001a(\u0010 \u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b \u0010!\u001a!\u0010\"\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0080\b\u001a(\u0010#\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b#\u0010$\u001a\u0019\u0010%\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b\u001a0\u0010&\u001a\u00020\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00028\u0000H\u0080\b¢\u0006\u0004\b&\u0010\u0016\u001a\u0019\u0010(\u001a\u00020'\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0080\b¨\u0006)"}, d2 = {ExifInterface.LONGITUDE_EAST, "Landroidx/collection/SparseArrayCompat;", "", "key", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "", "commonRemove", "", "value", "", FirebaseAnalytics.Param.INDEX, "commonRemoveAt", "size", "commonRemoveAtRange", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "commonPut", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "other", "commonPutAll", "commonPutIfAbsent", "commonSize", "commonIsEmpty", "commonKeyAt", "commonValueAt", "commonSetValueAt", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonContainsKey", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonClear", "commonAppend", "", "commonToString", "collection"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSparseArrayCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n1#1,535:1\n244#1,6:536\n244#1,6:542\n353#1,40:548\n353#1,40:588\n459#1,9:628\n*S KotlinDebug\n*F\n+ 1 SparseArrayCompat.kt\nandroidx/collection/SparseArrayCompatKt\n*L\n255#1:536,6\n260#1:542,6\n397#1:548,40\n405#1:588,40\n477#1:628,9\n*E\n"})
public final class SparseArrayCompatKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object f2528a = new Object();

    public static final void access$gc(SparseArrayCompat sparseArrayCompat) {
        int i10 = sparseArrayCompat.size;
        int[] iArr = sparseArrayCompat.keys;
        Object[] objArr = sparseArrayCompat.values;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != f2528a) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        sparseArrayCompat.garbage = false;
        sparseArrayCompat.size = i11;
    }

    public static final <E> void commonAppend(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10, E e5) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int i11 = sparseArrayCompat.size;
        if (i11 != 0 && i10 <= sparseArrayCompat.keys[i11 - 1]) {
            sparseArrayCompat.put(i10, e5);
            return;
        }
        if (sparseArrayCompat.garbage && i11 >= sparseArrayCompat.keys.length) {
            access$gc(sparseArrayCompat);
        }
        int i12 = sparseArrayCompat.size;
        if (i12 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        sparseArrayCompat.keys[i12] = i10;
        sparseArrayCompat.values[i12] = e5;
        sparseArrayCompat.size = i12 + 1;
    }

    public static final <E> void commonClear(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int i10 = sparseArrayCompat.size;
        Object[] objArr = sparseArrayCompat.values;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        sparseArrayCompat.size = 0;
        sparseArrayCompat.garbage = false;
    }

    public static final <E> boolean commonContainsKey(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.indexOfKey(i10) >= 0;
    }

    public static final <E> boolean commonContainsValue(@NotNull SparseArrayCompat<E> sparseArrayCompat, E e5) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        int i10 = sparseArrayCompat.size;
        int i11 = 0;
        while (i11 < i10) {
            if (sparseArrayCompat.values[i11] == e5) {
                return i11 >= 0;
            }
            i11++;
        }
        return false;
    }

    @Nullable
    public static final <E> E commonGet(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10) {
        E e5;
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        if (iBinarySearch < 0 || (e5 = (E) sparseArrayCompat.values[iBinarySearch]) == f2528a) {
            return null;
        }
        return e5;
    }

    public static final <E> int commonIndexOfKey(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        return ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
    }

    public static final <E> int commonIndexOfValue(@NotNull SparseArrayCompat<E> sparseArrayCompat, E e5) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        int i10 = sparseArrayCompat.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (sparseArrayCompat.values[i11] == e5) {
                return i11;
            }
        }
        return -1;
    }

    public static final <E> boolean commonIsEmpty(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        return sparseArrayCompat.size() == 0;
    }

    public static final <E> int commonKeyAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        return sparseArrayCompat.keys[i10];
    }

    public static final <E> void commonPut(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10, E e5) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        if (iBinarySearch >= 0) {
            sparseArrayCompat.values[iBinarySearch] = e5;
            return;
        }
        int i11 = ~iBinarySearch;
        if (i11 < sparseArrayCompat.size && sparseArrayCompat.values[i11] == f2528a) {
            sparseArrayCompat.keys[i11] = i10;
            sparseArrayCompat.values[i11] = e5;
            return;
        }
        if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
            access$gc(sparseArrayCompat);
            i11 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        }
        int i12 = sparseArrayCompat.size;
        if (i12 >= sparseArrayCompat.keys.length) {
            int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
            int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.keys = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            sparseArrayCompat.values = objArrCopyOf;
        }
        int i13 = sparseArrayCompat.size;
        if (i13 - i11 != 0) {
            int[] iArr = sparseArrayCompat.keys;
            int i14 = i11 + 1;
            ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i14, i11, i13);
            Object[] objArr = sparseArrayCompat.values;
            ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i14, i11, sparseArrayCompat.size);
        }
        sparseArrayCompat.keys[i11] = i10;
        sparseArrayCompat.values[i11] = e5;
        sparseArrayCompat.size++;
    }

    public static final <E> void commonPutAll(@NotNull SparseArrayCompat<E> sparseArrayCompat, @NotNull SparseArrayCompat<? extends E> other) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i10 = 0; i10 < size; i10++) {
            int iKeyAt = other.keyAt(i10);
            E eValueAt = other.valueAt(i10);
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = eValueAt;
            } else {
                int i11 = ~iBinarySearch;
                if (i11 >= sparseArrayCompat.size || sparseArrayCompat.values[i11] != f2528a) {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        access$gc(sparseArrayCompat);
                        i11 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, iKeyAt);
                    }
                    int i12 = sparseArrayCompat.size;
                    if (i12 >= sparseArrayCompat.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.values = objArrCopyOf;
                    }
                    int i13 = sparseArrayCompat.size;
                    if (i13 - i11 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i14 = i11 + 1;
                        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i14, i11, i13);
                        Object[] objArr = sparseArrayCompat.values;
                        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i14, i11, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i11] = iKeyAt;
                    sparseArrayCompat.values[i11] = eValueAt;
                    sparseArrayCompat.size++;
                } else {
                    sparseArrayCompat.keys[i11] = iKeyAt;
                    sparseArrayCompat.values[i11] = eValueAt;
                }
            }
        }
    }

    @Nullable
    public static final <E> E commonPutIfAbsent(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10, E e5) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        E e7 = (E) commonGet(sparseArrayCompat, i10);
        if (e7 == null) {
            int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
            if (iBinarySearch >= 0) {
                sparseArrayCompat.values[iBinarySearch] = e5;
            } else {
                int i11 = ~iBinarySearch;
                if (i11 >= sparseArrayCompat.size || sparseArrayCompat.values[i11] != f2528a) {
                    if (sparseArrayCompat.garbage && sparseArrayCompat.size >= sparseArrayCompat.keys.length) {
                        access$gc(sparseArrayCompat);
                        i11 = ~ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
                    }
                    int i12 = sparseArrayCompat.size;
                    if (i12 >= sparseArrayCompat.keys.length) {
                        int iIdealIntArraySize = ContainerHelpersKt.idealIntArraySize(i12 + 1);
                        int[] iArrCopyOf = Arrays.copyOf(sparseArrayCompat.keys, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.keys = iArrCopyOf;
                        Object[] objArrCopyOf = Arrays.copyOf(sparseArrayCompat.values, iIdealIntArraySize);
                        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
                        sparseArrayCompat.values = objArrCopyOf;
                    }
                    int i13 = sparseArrayCompat.size;
                    if (i13 - i11 != 0) {
                        int[] iArr = sparseArrayCompat.keys;
                        int i14 = i11 + 1;
                        ArraysKt___ArraysJvmKt.copyInto(iArr, iArr, i14, i11, i13);
                        Object[] objArr = sparseArrayCompat.values;
                        ArraysKt___ArraysJvmKt.copyInto(objArr, objArr, i14, i11, sparseArrayCompat.size);
                    }
                    sparseArrayCompat.keys[i11] = i10;
                    sparseArrayCompat.values[i11] = e5;
                    sparseArrayCompat.size++;
                } else {
                    sparseArrayCompat.keys[i11] = i10;
                    sparseArrayCompat.values[i11] = e5;
                }
            }
        }
        return e7;
    }

    public static final <E> void commonRemove(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        if (iBinarySearch >= 0) {
            Object[] objArr = sparseArrayCompat.values;
            Object obj = objArr[iBinarySearch];
            Object obj2 = f2528a;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                sparseArrayCompat.garbage = true;
            }
        }
    }

    public static final <E> void commonRemoveAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.values[i10] != f2528a) {
            sparseArrayCompat.values[i10] = f2528a;
            sparseArrayCompat.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10, int i11) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iMin = Math.min(i11, i10 + i11);
        while (i10 < iMin) {
            sparseArrayCompat.removeAt(i10);
            i10++;
        }
    }

    @Nullable
    public static final <E> E commonReplace(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10, E e5) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i10);
        if (iIndexOfKey < 0) {
            return null;
        }
        Object[] objArr = sparseArrayCompat.values;
        E e7 = (E) objArr[iIndexOfKey];
        objArr[iIndexOfKey] = e5;
        return e7;
    }

    public static final <E> void commonSetValueAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10, E e5) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        sparseArrayCompat.values[i10] = e5;
    }

    public static final <E> int commonSize(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        return sparseArrayCompat.size;
    }

    @NotNull
    public static final <E> String commonToString(@NotNull SparseArrayCompat<E> sparseArrayCompat) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.size() <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(sparseArrayCompat.size * 28);
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        int i10 = sparseArrayCompat.size;
        for (int i11 = 0; i11 < i10; i11++) {
            if (i11 > 0) {
                sb2.append(", ");
            }
            sb2.append(sparseArrayCompat.keyAt(i11));
            sb2.append('=');
            E eValueAt = sparseArrayCompat.valueAt(i11);
            if (eValueAt != sparseArrayCompat) {
                sb2.append(eValueAt);
            } else {
                sb2.append("(this Map)");
            }
        }
        return androidx.appcompat.app.i.b(sb2, AbstractJsonLexerKt.END_OBJ, "buffer.toString()");
    }

    public static final <E> E commonValueAt(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        if (sparseArrayCompat.garbage) {
            access$gc(sparseArrayCompat);
        }
        return (E) sparseArrayCompat.values[i10];
    }

    public static final <E> E commonGet(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10, E e5) {
        E e7;
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iBinarySearch = ContainerHelpersKt.binarySearch(sparseArrayCompat.keys, sparseArrayCompat.size, i10);
        return (iBinarySearch < 0 || (e7 = (E) sparseArrayCompat.values[iBinarySearch]) == f2528a) ? e5 : e7;
    }

    public static final <E> boolean commonReplace(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10, E e5, E e7) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i10);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(sparseArrayCompat.values[iIndexOfKey], e5)) {
            return false;
        }
        sparseArrayCompat.values[iIndexOfKey] = e7;
        return true;
    }

    public static final <E> boolean commonRemove(@NotNull SparseArrayCompat<E> sparseArrayCompat, int i10, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(sparseArrayCompat, "<this>");
        int iIndexOfKey = sparseArrayCompat.indexOfKey(i10);
        if (iIndexOfKey < 0 || !Intrinsics.areEqual(obj, sparseArrayCompat.valueAt(iIndexOfKey))) {
            return false;
        }
        sparseArrayCompat.removeAt(iIndexOfKey);
        return true;
    }
}
