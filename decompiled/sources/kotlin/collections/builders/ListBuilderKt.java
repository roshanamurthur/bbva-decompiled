package kotlin.collections.builders;

import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListBuilder.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a#\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a-\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0010\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {ExifInterface.LONGITUDE_EAST, "", "size", "", "arrayOfUninitializedElements", "(I)[Ljava/lang/Object;", ExifInterface.GPS_DIRECTION_TRUE, "newSize", "copyOfUninitializedElements", "([Ljava/lang/Object;I)[Ljava/lang/Object;", FirebaseAnalytics.Param.INDEX, "", "resetAt", "([Ljava/lang/Object;I)V", "fromIndex", "toIndex", "resetRange", "([Ljava/lang/Object;II)V", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilderKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,487:1\n1#2:488\n*E\n"})
public final class ListBuilderKt {
    public static final boolean access$subarrayContentEquals(Object[] objArr, int i10, int i11, List list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!Intrinsics.areEqual(objArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public static final int access$subarrayContentHashCode(Object[] objArr, int i10, int i11) {
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i10 + i12];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final String access$subarrayContentToString(Object[] objArr, int i10, int i11, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append(Constant.BRACKET_OPEN);
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append(Constant.BRACKET_CLOSE);
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @NotNull
    public static final <E> E[] arrayOfUninitializedElements(int i10) {
        if (i10 >= 0) {
            return (E[]) new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    @NotNull
    public static final <T> T[] copyOfUninitializedElements(@NotNull T[] tArr, int i10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, i10);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        return tArr2;
    }

    public static final <E> void resetAt(@NotNull E[] eArr, int i10) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        eArr[i10] = null;
    }

    public static final <E> void resetRange(@NotNull E[] eArr, int i10, int i11) {
        Intrinsics.checkNotNullParameter(eArr, "<this>");
        while (i10 < i11) {
            resetAt(eArr, i10);
            i10++;
        }
    }
}
