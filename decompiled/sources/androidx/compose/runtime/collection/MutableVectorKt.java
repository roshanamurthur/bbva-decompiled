package androidx.compose.runtime.collection;

import androidx.camera.core.impl.utils.b;
import androidx.collection.g;
import androidx.collection.k;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: MutableVector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a@\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0006\u0010\u0005\u001a\u00020\u00012\u0014\b\b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\b\u0082\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0002\u001a\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001H\u0086\b\u001a2\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u00012\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t\"\u00028\u0000H\u0086\b¢\u0006\u0004\b\b\u0010\u000b¨\u0006\f"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "", "capacity", "Landroidx/compose/runtime/collection/MutableVector;", "MutableVector", "size", "Lkotlin/Function1;", "init", "mutableVectorOf", "", "elements", "([Ljava/lang/Object;)Landroidx/compose/runtime/collection/MutableVector;", "runtime_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1220:1\n1187#1,2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1208#1:1221,2\n*E\n"})
public final class MutableVectorKt {
    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i10) {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector<>(new Object[i10], 0);
    }

    public static /* synthetic */ MutableVector MutableVector$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 16;
        }
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector(new Object[i10], 0);
    }

    public static final void access$checkIndex(List list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            throw new IndexOutOfBoundsException(k.c("Index ", i10, " is out of bounds. The list has ", size, " elements."));
        }
    }

    public static final void access$checkSubIndex(List list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            throw new IllegalArgumentException(k.c("Indices are out of order. fromIndex (", i10, ") is greater than toIndex (", i11, ")."));
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(b.a("fromIndex (", i10, ") is less than 0."));
        }
        if (i11 > size) {
            throw new IndexOutOfBoundsException(g.b("toIndex (", i11, ") is more than than the list size (", size, RootService.CLOSE_BRACKET));
        }
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf(T... tArr) {
        return new MutableVector<>(tArr, tArr.length);
    }

    public static final /* synthetic */ <T> MutableVector<T> MutableVector(int i10, Function1<? super Integer, ? extends T> function1) {
        Intrinsics.reifiedOperationMarker(0, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] objArr = new Object[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = function1.invoke(Integer.valueOf(i11));
        }
        return new MutableVector<>(objArr, i10);
    }

    public static final /* synthetic */ <T> MutableVector<T> mutableVectorOf() {
        Intrinsics.reifiedOperationMarker(0, "T?");
        return new MutableVector<>(new Object[16], 0);
    }
}
