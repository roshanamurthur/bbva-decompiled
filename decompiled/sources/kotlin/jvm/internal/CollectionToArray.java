package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Deprecated;
import kotlin.DeprecatedSinceKotlin;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CollectionToArray.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a#\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\u0010\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\b¨\u0006\t"}, d2 = {"", "collection", "", "", "toArray", "(Ljava/util/Collection;)[Ljava/lang/Object;", "collectionToArray", "a", "(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "CollectionToArray")
@SourceDebugExtension({"SMAP\nCollectionToArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n+ 2 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,88:1\n63#1,22:89\n63#1,22:111\n26#2:133\n*S KotlinDebug\n*F\n+ 1 CollectionToArray.kt\nkotlin/jvm/internal/CollectionToArray\n*L\n22#1:89,22\n37#1:111,22\n14#1:133\n*E\n"})
public final class CollectionToArray {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Object[] f79721a = new Object[0];

    @JvmName(name = "toArray")
    @NotNull
    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince = "1.9")
    public static final Object[] toArray(@NotNull Collection<?> collection, @Nullable Object[] objArr) {
        Object[] objArrCopyOf;
        Intrinsics.checkNotNullParameter(collection, "collection");
        objArr.getClass();
        int size = collection.size();
        int i10 = 0;
        if (size == 0) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            if (objArr.length <= 0) {
                return objArr;
            }
            objArr[0] = null;
            return objArr;
        }
        if (size <= objArr.length) {
            objArrCopyOf = objArr;
        } else {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrCopyOf = (Object[]) objNewInstance;
        }
        while (true) {
            int i11 = i10 + 1;
            objArrCopyOf[i10] = it.next();
            if (i11 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                if (objArrCopyOf == objArr) {
                    objArr[i11] = null;
                    return objArr;
                }
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i10 = i11;
        }
    }

    @JvmName(name = "toArray")
    @NotNull
    @Deprecated(message = "This function will be made internal in a future release")
    @DeprecatedSinceKotlin(warningSince = "1.9")
    public static final Object[] toArray(@NotNull Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        int size = collection.size();
        Object[] objArr = f79721a;
        if (size == 0) {
            return objArr;
        }
        Iterator<?> it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            objArrCopyOf[i10] = it.next();
            if (i11 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i12 = ((i11 * 3) + 1) >>> 1;
                if (i12 <= i11) {
                    i12 = 2147483645;
                    if (i11 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            } else if (!it.hasNext()) {
                Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, i11);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
                return objArrCopyOf2;
            }
            i10 = i11;
        }
    }
}
