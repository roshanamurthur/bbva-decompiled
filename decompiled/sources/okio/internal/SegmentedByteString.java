package okio.internal;

import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.utils.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.C0780SegmentedByteString;
import okio.Segment;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: SegmentedByteString.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a$\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a]\u0010\u0012\u001a\u00020\u0010*\u00020\u00062K\u0010\u0011\u001aG\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\r\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00100\tH\u0080\bø\u0001\u0000\u001a\u001d\u0010\u0016\u001a\u00020\u0015*\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0001H\u0080\b\u001a\u0015\u0010\u0018\u001a\u00020\u0017*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u0019\u001a\u00020\u0001*\u00020\u0006H\u0080\b\u001a\r\u0010\u001a\u001a\u00020\n*\u00020\u0006H\u0080\b\u001a%\u0010\u001d\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010!\u001a\u00020 *\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010!\u001a\u00020 *\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a-\u0010$\u001a\u00020\u0010*\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\"\u001a\u00020\n2\u0006\u0010#\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010&\u001a\u00020 *\u00020\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010%H\u0080\b\u001a\r\u0010'\u001a\u00020\u0001*\u00020\u0006H\u0080\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"", "", "value", "fromIndex", "toIndex", "binarySearch", "Lokio/SegmentedByteString;", "pos", "segment", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "data", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "", "action", "forEachSegment", "beginIndex", "endIndex", "Lokio/ByteString;", "commonSubstring", "", "commonInternalGet", "commonGetSize", "commonToByteArray", "Lokio/Buffer;", "buffer", "commonWrite", "other", "otherOffset", "", "commonRangeEquals", "target", "targetOffset", "commonCopyInto", "", "commonEquals", "commonHashCode", "okio"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
public final class SegmentedByteString {
    public static final int binarySearch(@NotNull int[] iArr, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final void commonCopyInto(@NotNull C0780SegmentedByteString c0780SegmentedByteString, int i10, @NotNull byte[] target, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j10 = i12;
        okio.SegmentedByteString.checkOffsetAndCount(c0780SegmentedByteString.size(), i10, j10);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i11, j10);
        int i13 = i12 + i10;
        int iSegment = segment(c0780SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0780SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c0780SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c0780SegmentedByteString.getDirectory()[c0780SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            int i17 = (i10 - i14) + i16;
            ArraysKt___ArraysJvmKt.copyInto(c0780SegmentedByteString.getSegments()[iSegment], target, i11, i17, i17 + iMin);
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(@NotNull C0780SegmentedByteString c0780SegmentedByteString, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        if (obj == c0780SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c0780SegmentedByteString.size() && c0780SegmentedByteString.rangeEquals(0, byteString, 0, c0780SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(@NotNull C0780SegmentedByteString c0780SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        return c0780SegmentedByteString.getDirectory()[c0780SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(@NotNull C0780SegmentedByteString c0780SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        int hashCode = c0780SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c0780SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c0780SegmentedByteString.getDirectory()[length + i10];
            int i14 = c0780SegmentedByteString.getDirectory()[i10];
            byte[] bArr = c0780SegmentedByteString.getSegments()[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        c0780SegmentedByteString.setHashCode$okio(i11);
        return i11;
    }

    public static final byte commonInternalGet(@NotNull C0780SegmentedByteString c0780SegmentedByteString, int i10) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c0780SegmentedByteString.getDirectory()[c0780SegmentedByteString.getSegments().length - 1], i10, 1L);
        int iSegment = segment(c0780SegmentedByteString, i10);
        return c0780SegmentedByteString.getSegments()[iSegment][(i10 - (iSegment == 0 ? 0 : c0780SegmentedByteString.getDirectory()[iSegment - 1])) + c0780SegmentedByteString.getDirectory()[c0780SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final boolean commonRangeEquals(@NotNull C0780SegmentedByteString c0780SegmentedByteString, int i10, @NotNull ByteString other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > c0780SegmentedByteString.size() - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c0780SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0780SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c0780SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c0780SegmentedByteString.getDirectory()[c0780SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!other.rangeEquals(i11, c0780SegmentedByteString.getSegments()[iSegment], (i10 - i14) + i16, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull C0780SegmentedByteString c0780SegmentedByteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c0780SegmentedByteString, i11);
        if (i10 < 0) {
            throw new IllegalArgumentException(b.a("beginIndex=", i10, " < 0").toString());
        }
        if (iResolveDefaultParameter > c0780SegmentedByteString.size()) {
            StringBuilder sbC = o1.c("endIndex=", iResolveDefaultParameter, " > length(");
            sbC.append(c0780SegmentedByteString.size());
            sbC.append(RootService.CLOSE_BRACKET);
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        int i12 = iResolveDefaultParameter - i10;
        if (i12 < 0) {
            throw new IllegalArgumentException(n1.e("endIndex=", iResolveDefaultParameter, " < beginIndex=", i10).toString());
        }
        if (i10 == 0 && iResolveDefaultParameter == c0780SegmentedByteString.size()) {
            return c0780SegmentedByteString;
        }
        if (i10 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c0780SegmentedByteString, i10);
        int iSegment2 = segment(c0780SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt___ArraysJvmKt.copyOfRange(c0780SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i13 = iSegment;
            int i14 = 0;
            while (true) {
                iArr[i14] = Math.min(c0780SegmentedByteString.getDirectory()[i13] - i10, i12);
                int i15 = i14 + 1;
                iArr[i14 + bArr.length] = c0780SegmentedByteString.getDirectory()[c0780SegmentedByteString.getSegments().length + i13];
                if (i13 == iSegment2) {
                    break;
                }
                i13++;
                i14 = i15;
            }
        }
        int i16 = iSegment != 0 ? c0780SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = (i10 - i16) + iArr[length];
        return new C0780SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull C0780SegmentedByteString c0780SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        byte[] bArr = new byte[c0780SegmentedByteString.size()];
        int length = c0780SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < length) {
            int i13 = c0780SegmentedByteString.getDirectory()[length + i10];
            int i14 = c0780SegmentedByteString.getDirectory()[i10];
            int i15 = i14 - i11;
            ArraysKt___ArraysJvmKt.copyInto(c0780SegmentedByteString.getSegments()[i10], bArr, i12, i13, i13 + i15);
            i12 += i15;
            i10++;
            i11 = i14;
        }
        return bArr;
    }

    public static final void commonWrite(@NotNull C0780SegmentedByteString c0780SegmentedByteString, @NotNull Buffer buffer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i12 = i10 + i11;
        int iSegment = segment(c0780SegmentedByteString, i10);
        while (i10 < i12) {
            int i13 = iSegment == 0 ? 0 : c0780SegmentedByteString.getDirectory()[iSegment - 1];
            int i14 = c0780SegmentedByteString.getDirectory()[iSegment] - i13;
            int i15 = c0780SegmentedByteString.getDirectory()[c0780SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i12, i14 + i13) - i10;
            int i16 = (i10 - i13) + i15;
            Segment segment = new Segment(c0780SegmentedByteString.getSegments()[iSegment], i16, i16 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segment);
            }
            i10 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i11));
    }

    public static final void forEachSegment(@NotNull C0780SegmentedByteString c0780SegmentedByteString, @NotNull Function3<? super byte[], ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = c0780SegmentedByteString.getSegments().length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = c0780SegmentedByteString.getDirectory()[length + i10];
            int i13 = c0780SegmentedByteString.getDirectory()[i10];
            action.invoke(c0780SegmentedByteString.getSegments()[i10], Integer.valueOf(i12), Integer.valueOf(i13 - i11));
            i10++;
            i11 = i13;
        }
    }

    public static final int segment(@NotNull C0780SegmentedByteString c0780SegmentedByteString, int i10) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c0780SegmentedByteString.getDirectory(), i10 + 1, 0, c0780SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    public static final boolean commonRangeEquals(@NotNull C0780SegmentedByteString c0780SegmentedByteString, int i10, @NotNull byte[] other, int i11, int i12) {
        Intrinsics.checkNotNullParameter(c0780SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i10 < 0 || i10 > c0780SegmentedByteString.size() - i12 || i11 < 0 || i11 > other.length - i12) {
            return false;
        }
        int i13 = i12 + i10;
        int iSegment = segment(c0780SegmentedByteString, i10);
        while (i10 < i13) {
            int i14 = iSegment == 0 ? 0 : c0780SegmentedByteString.getDirectory()[iSegment - 1];
            int i15 = c0780SegmentedByteString.getDirectory()[iSegment] - i14;
            int i16 = c0780SegmentedByteString.getDirectory()[c0780SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i13, i15 + i14) - i10;
            if (!okio.SegmentedByteString.arrayRangeEquals(c0780SegmentedByteString.getSegments()[iSegment], (i10 - i14) + i16, other, i11, iMin)) {
                return false;
            }
            i11 += iMin;
            i10 += iMin;
            iSegment++;
        }
        return true;
    }
}
