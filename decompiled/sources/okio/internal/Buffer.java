package okio.internal;

import androidx.appcompat.widget.g0;
import androidx.appcompat.widget.o1;
import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.v;
import androidx.camera.core.processing.f;
import androidx.compose.animation.core.AnimationKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Typography;
import okhttp3.internal.connection.RealConnection;
import okio.ByteString;
import okio.C0780SegmentedByteString;
import okio.Options;
import okio.Segment;
import okio.SegmentPool;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Source;
import okio.Utf8;
import okio._JvmPlatformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okio.internal.-Buffer, reason: invalid class name */
/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\u001a0\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aA\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f*\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000b2\u001a\u0010\u0012\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\u0011H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001e\u0010\u0018\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\bH\u0000\u001a%\u0010\u001c\u001a\u00020\n*\u00020\n2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u001e*\u00020\nH\u0080\b\u001a\r\u0010!\u001a\u00020 *\u00020\nH\u0080\b\u001a\r\u0010\"\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a\r\u0010#\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\u0015\u0010%\u001a\u00020\u001e*\u00020\n2\u0006\u0010$\u001a\u00020\u000bH\u0080\b\u001a\r\u0010'\u001a\u00020&*\u00020\nH\u0080\b\u001a\u0015\u0010(\u001a\u00020&*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a)\u0010+\u001a\u00020\n*\u00020\n2\u0006\u0010*\u001a\u00020)2\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010.\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00100\u001a\u00020\u0000*\u00020\n2\u0006\u0010/\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010+\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020\u0004H\u0080\b\u001a%\u0010+\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\r\u00102\u001a\u00020\u0004*\u00020\nH\u0080\b\u001a\u0015\u00102\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00104\u001a\u00020\u0002*\u00020\n2\u0006\u00103\u001a\u00020\u0004H\u0080\b\u001a\u0015\u00105\u001a\u00020&*\u00020\n2\u0006\u00103\u001a\u00020\u0004H\u0080\b\u001a%\u00104\u001a\u00020\u0002*\u00020\n2\u0006\u00103\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\r\u00106\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u00107\u001a\u00020\u000b*\u00020\nH\u0080\b\u001a\r\u00108\u001a\u00020)*\u00020\nH\u0080\b\u001a\u0015\u00108\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u00109\u001a\u00020\u0002*\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0080\b\u001a\u001d\u00105\u001a\u00020&*\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010;\u001a\u00020\u000b*\u00020\n2\u0006\u00103\u001a\u00020:H\u0080\b\u001a\u0015\u0010<\u001a\u00020\r*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u000f\u0010=\u001a\u0004\u0018\u00010\r*\u00020\nH\u0080\b\u001a\u0015\u0010?\u001a\u00020\r*\u00020\n2\u0006\u0010>\u001a\u00020\u000bH\u0080\b\u001a\r\u0010@\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a%\u0010D\u001a\u00020\n*\u00020\n2\u0006\u0010A\u001a\u00020\r2\u0006\u0010B\u001a\u00020\u00022\u0006\u0010C\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010F\u001a\u00020\n*\u00020\n2\u0006\u0010E\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010H\u001a\u00020\u000b*\u00020\n2\u0006\u00101\u001a\u00020GH\u0080\b\u001a\u001d\u0010+\u001a\u00020\n*\u00020\n2\u0006\u00101\u001a\u00020G2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010J\u001a\u00020\n*\u00020\n2\u0006\u0010I\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010L\u001a\u00020\n*\u00020\n2\u0006\u0010K\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010N\u001a\u00020\n*\u00020\n2\u0006\u0010M\u001a\u00020\u0002H\u0080\b\u001a\u0015\u0010O\u001a\u00020\n*\u00020\n2\u0006\u0010,\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010+\u001a\u00020&*\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a\u001d\u00104\u001a\u00020\u000b*\u00020\n2\u0006\u00103\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u000bH\u0080\b\u001a%\u0010Q\u001a\u00020\u000b*\u00020\n2\u0006\u0010I\u001a\u00020\u001e2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010P\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010Q\u001a\u00020\u000b*\u00020\n2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\u0080\b\u001a\u001d\u0010S\u001a\u00020\u000b*\u00020\n2\u0006\u0010R\u001a\u00020)2\u0006\u0010\u0010\u001a\u00020\u000bH\u0080\b\u001a-\u0010T\u001a\u00020\b*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020)2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0017\u0010W\u001a\u00020\b*\u00020\n2\b\u0010V\u001a\u0004\u0018\u00010UH\u0080\b\u001a\r\u0010X\u001a\u00020\u0002*\u00020\nH\u0080\b\u001a\r\u0010Y\u001a\u00020\n*\u00020\nH\u0080\b\u001a\r\u0010Z\u001a\u00020)*\u00020\nH\u0080\b\u001a\u0015\u0010Z\u001a\u00020)*\u00020\n2\u0006\u0010\u001b\u001a\u00020\u0002H\u0080\b\u001a\u0014\u0010]\u001a\u00020[*\u00020\n2\u0006\u0010\\\u001a\u00020[H\u0000\u001a\u0014\u0010^\u001a\u00020[*\u00020\n2\u0006\u0010\\\u001a\u00020[H\u0000\u001a\r\u0010_\u001a\u00020\u0002*\u00020[H\u0080\b\u001a\u0015\u0010`\u001a\u00020\u0002*\u00020[2\u0006\u0010\u001a\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010b\u001a\u00020\u000b*\u00020[2\u0006\u0010a\u001a\u00020\u000bH\u0080\b\u001a\u0015\u0010d\u001a\u00020\u000b*\u00020[2\u0006\u0010c\u001a\u00020\u0002H\u0080\b\u001a\r\u0010e\u001a\u00020&*\u00020[H\u0080\b\" \u0010l\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bf\u0010g\u0012\u0004\bj\u0010k\u001a\u0004\bh\u0010i\"\u0014\u0010m\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\bm\u0010n\"\u0014\u0010o\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\bo\u0010p\"\u0014\u0010q\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\bq\u0010p\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006r"}, d2 = {"Lokio/Segment;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "rangeEquals", "Lokio/Buffer;", "", "newline", "", "readUtf8Line", ExifInterface.GPS_DIRECTION_TRUE, "fromIndex", "Lkotlin/Function2;", "lambda", "seek", "(Lokio/Buffer;JLkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "Lokio/Options;", "options", "selectTruncated", "selectPrefix", "out", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "commonCopyTo", "commonCompleteSegmentByteCount", "", "commonReadByte", "", "commonReadShort", "commonReadInt", "commonReadLong", "pos", "commonGet", "", "commonClear", "commonSkip", "Lokio/ByteString;", "byteString", "commonWrite", SharedPrefsStorage.VERSION_KEY, "commonWriteDecimalLong", "commonWriteHexadecimalUnsignedLong", "minimumCapacity", "commonWritableSegment", "source", "commonReadByteArray", "sink", "commonRead", "commonReadFully", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "commonSelect", "Lokio/Sink;", "commonReadAll", "commonReadUtf8", "commonReadUtf8Line", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "string", "beginIndex", "endIndex", "commonWriteUtf8", "codePoint", "commonWriteUtf8CodePoint", "Lokio/Source;", "commonWriteAll", "b", "commonWriteByte", "s", "commonWriteShort", "i", "commonWriteInt", "commonWriteLong", "toIndex", "commonIndexOf", "targetBytes", "commonIndexOfElement", "commonRangeEquals", "", "other", "commonEquals", "commonHashCode", "commonCopy", "commonSnapshot", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "commonReadUnsafe", "commonReadAndWriteUnsafe", "commonNext", "commonSeek", "newSize", "commonResizeBuffer", "minByteCount", "commonExpandBuffer", "commonClose", "a", "[B", "getHEX_DIGIT_BYTES", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "HEX_DIGIT_BYTES", "SEGMENTING_THRESHOLD", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "OVERFLOW_ZONE", "J", "OVERFLOW_DIGIT_START", "okio"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "-Buffer")
@SourceDebugExtension({"SMAP\nBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1730:1\n112#1,20:1753\n112#1,20:1786\n112#1:1806\n114#1,18:1808\n112#1,20:1826\n74#2:1731\n74#2:1732\n74#2:1733\n74#2:1734\n74#2:1735\n74#2:1736\n74#2:1737\n74#2:1738\n74#2:1739\n74#2:1740\n74#2:1741\n74#2:1742\n83#2:1743\n83#2:1744\n77#2:1745\n77#2:1746\n77#2:1747\n77#2:1748\n77#2:1749\n77#2:1750\n77#2:1751\n77#2:1752\n86#2:1773\n89#2:1775\n74#2:1776\n74#2:1777\n74#2:1778\n74#2:1779\n74#2:1780\n74#2:1781\n74#2:1782\n74#2:1783\n74#2:1784\n74#2:1785\n89#2:1807\n86#2:1846\n1#3:1774\n*S KotlinDebug\n*F\n+ 1 Buffer.kt\nokio/internal/-Buffer\n*L\n415#1:1753,20\n1292#1:1786,20\n1323#1:1806\n1323#1:1808,18\n1357#1:1826,20\n178#1:1731\n202#1:1732\n321#1:1733\n326#1:1734\n349#1:1735\n350#1:1736\n351#1:1737\n352#1:1738\n358#1:1739\n359#1:1740\n360#1:1741\n361#1:1742\n385#1:1743\n386#1:1744\n392#1:1745\n393#1:1746\n394#1:1747\n395#1:1748\n396#1:1749\n397#1:1750\n398#1:1751\n399#1:1752\n427#1:1773\n888#1:1775\n906#1:1776\n908#1:1777\n912#1:1778\n914#1:1779\n918#1:1780\n920#1:1781\n924#1:1782\n926#1:1783\n946#1:1784\n949#1:1785\n1336#1:1807\n1676#1:1846\n*E\n"})
public final class Buffer {
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f86445a = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");

    public static final void commonClear(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(@NotNull okio.Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = segment.prev;
        Intrinsics.checkNotNull(segment2);
        int i10 = segment2.limit;
        return (i10 >= 8192 || !segment2.owner) ? size : size - ((long) (i10 - segment2.pos));
    }

    @NotNull
    public static final okio.Buffer commonCopy(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        okio.Buffer buffer2 = new okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            Intrinsics.checkNotNull(segment3);
            Intrinsics.checkNotNull(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    @NotNull
    public static final okio.Buffer commonCopyTo(@NotNull okio.Buffer buffer, @NotNull okio.Buffer out, long j10, long j11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j10, j11);
        if (j11 == 0) {
            return buffer;
        }
        out.setSize$okio(out.size() + j11);
        Segment segment = buffer.head;
        while (true) {
            Intrinsics.checkNotNull(segment);
            int i10 = segment.limit;
            int i11 = segment.pos;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            segment = segment.next;
        }
        while (j11 > 0) {
            Intrinsics.checkNotNull(segment);
            Segment segmentSharedCopy = segment.sharedCopy();
            int i12 = segmentSharedCopy.pos + ((int) j10);
            segmentSharedCopy.pos = i12;
            segmentSharedCopy.limit = Math.min(i12 + ((int) j11), segmentSharedCopy.limit);
            Segment segment2 = out.head;
            if (segment2 == null) {
                segmentSharedCopy.prev = segmentSharedCopy;
                segmentSharedCopy.next = segmentSharedCopy;
                out.head = segmentSharedCopy;
            } else {
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segmentSharedCopy);
            }
            j11 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
            segment = segment.next;
            j10 = 0;
        }
        return buffer;
    }

    public static final boolean commonEquals(@NotNull okio.Buffer buffer, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof okio.Buffer)) {
            return false;
        }
        okio.Buffer buffer2 = (okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        Segment segment2 = buffer2.head;
        Intrinsics.checkNotNull(segment2);
        int i10 = segment.pos;
        int i11 = segment2.pos;
        long j10 = 0;
        while (j10 < buffer.size()) {
            long jMin = Math.min(segment.limit - i10, segment2.limit - i11);
            long j11 = 0;
            while (j11 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (segment.data[i10] != segment2.data[i11]) {
                    return false;
                }
                j11++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == segment.limit) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                i10 = segment.pos;
            }
            if (i11 == segment2.limit) {
                segment2 = segment2.next;
                Intrinsics.checkNotNull(segment2);
                i11 = segment2.pos;
            }
            j10 += jMin;
        }
        return true;
    }

    public static final long commonExpandBuffer(@NotNull okio.Buffer.UnsafeCursor unsafeCursor, int i10) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        if (i10 <= 0) {
            throw new IllegalArgumentException(g0.c("minByteCount <= 0: ", i10).toString());
        }
        if (i10 > 8192) {
            throw new IllegalArgumentException(g0.c("minByteCount > Segment.SIZE: ", i10).toString());
        }
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
        int i11 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = 8192;
        long j10 = i11;
        buffer.setSize$okio(size + j10);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i11;
        unsafeCursor.end = 8192;
        return j10;
    }

    public static final byte commonGet(@NotNull okio.Buffer buffer, long j10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j10, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            Intrinsics.checkNotNull(null);
            throw null;
        }
        if (buffer.size() - j10 < j10) {
            long size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            Intrinsics.checkNotNull(segment);
            return segment.data[(int) ((((long) segment.pos) + j10) - size)];
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + j11;
            if (j12 > j10) {
                Intrinsics.checkNotNull(segment);
                return segment.data[(int) ((((long) segment.pos) + j10) - j11)];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j11 = j12;
        }
    }

    public static final int commonHashCode(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = segment.limit;
            for (int i12 = segment.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + segment.data[i12];
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        } while (segment != buffer.head);
        return i10;
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, byte b10, long j10, long j11) {
        Segment segment;
        int i10;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long size = 0;
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > buffer.size()) {
            j11 = buffer.size();
        }
        if (j10 == j11 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j10 < j10) {
            size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < j11) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j11) - size);
                i10 = (int) ((((long) segment.pos) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + size;
            if (j12 > j10) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j11) - size);
            i10 = (int) ((((long) segment.pos) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - segment.pos)) + size;
    }

    public static final long commonIndexOfElement(@NotNull okio.Buffer buffer, @NotNull ByteString targetBytes, long j10) {
        int i10;
        int i11;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        long size = 0;
        if (j10 < 0) {
            throw new IllegalArgumentException(v.c("fromIndex < 0: ", j10).toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j10 < j10) {
            size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (targetBytes.size() == 2) {
                byte b10 = targetBytes.getByte(0);
                byte b11 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i10 = (int) ((((long) segment.pos) + j10) - size);
                    int i12 = segment.limit;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            Intrinsics.checkNotNull(segment);
                            j10 = size;
                        } else {
                            byte b12 = bArr[i10];
                            if (b12 == b10 || b12 == b11) {
                                i11 = segment.pos;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i10 = (int) ((((long) segment.pos) + j10) - size);
                    int i13 = segment.limit;
                    while (true) {
                        if (i10 < i13) {
                            byte b13 = bArr2[i10];
                            int length = bArrInternalArray$okio.length;
                            int i14 = 0;
                            while (true) {
                                if (i14 >= length) {
                                    i10++;
                                } else if (b13 == bArrInternalArray$okio[i14]) {
                                    i11 = segment.pos;
                                } else {
                                    i14++;
                                }
                            }
                        } else {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            Intrinsics.checkNotNull(segment);
                            j10 = size;
                        }
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (segment.limit - segment.pos)) + size;
            if (j11 > j10) {
                break;
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            size = j11;
        }
        if (targetBytes.size() == 2) {
            byte b14 = targetBytes.getByte(0);
            byte b15 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i10 = (int) ((((long) segment.pos) + j10) - size);
                int i15 = segment.limit;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j10 = size;
                    } else {
                        byte b16 = bArr3[i10];
                        if (b16 == b14 || b16 == b15) {
                            i11 = segment.pos;
                        } else {
                            i10++;
                        }
                    }
                }
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i10 = (int) ((((long) segment.pos) + j10) - size);
                int i16 = segment.limit;
                while (true) {
                    if (i10 < i16) {
                        byte b17 = bArr4[i10];
                        int length2 = bArrInternalArray$okio2.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length2) {
                                i10++;
                            } else if (b17 == bArrInternalArray$okio2[i17]) {
                                i11 = segment.pos;
                            } else {
                                i17++;
                            }
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        Intrinsics.checkNotNull(segment);
                        j10 = size;
                    }
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    public static final int commonNext(@NotNull okio.Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        long j10 = unsafeCursor.offset;
        okio.Buffer buffer = unsafeCursor.buffer;
        Intrinsics.checkNotNull(buffer);
        if (j10 == buffer.size()) {
            throw new IllegalStateException("no more bytes".toString());
        }
        long j11 = unsafeCursor.offset;
        return unsafeCursor.seek(j11 == -1 ? 0L : j11 + ((long) (unsafeCursor.end - unsafeCursor.start)));
    }

    public static final boolean commonRangeEquals(@NotNull okio.Buffer buffer, long j10, @NotNull ByteString bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || buffer.size() - j10 < i11 || bytes.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (buffer.getByte(((long) i12) + j10) != bytes.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] sink) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(@NotNull okio.Buffer buffer, @NotNull Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    @NotNull
    public static final okio.Buffer.UnsafeCursor commonReadAndWriteUnsafe(@NotNull okio.Buffer buffer, @NotNull okio.Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        okio.Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final byte commonReadByte(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        int i12 = i10 + 1;
        byte b10 = segment.data[i10];
        buffer.setSize$okio(buffer.size() - 1);
        if (i12 == i11) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i12;
        }
        return b10;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    public static final long commonReadDecimalLong(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i10 = 0;
        boolean z10 = false;
        long j10 = 0;
        long j11 = -7;
        boolean z11 = false;
        do {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i11 = segment.pos;
            int i12 = segment.limit;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j10 < OVERFLOW_ZONE || (j10 == OVERFLOW_ZONE && i13 < j11)) {
                        okio.Buffer bufferWriteByte = new okio.Buffer().writeDecimalLong(j10).writeByte((int) b10);
                        if (!z10) {
                            bufferWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
                    }
                    j10 = (j10 * 10) + ((long) i13);
                } else {
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j11--;
                    z10 = true;
                }
                i11++;
                i10++;
            }
            if (i11 == i12) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i11;
            }
            if (z11) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - ((long) i10));
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j10 : -j10;
        }
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        StringBuilder sbE = f.e(z10 ? "Expected a digit" : "Expected a digit or '-'", " but was 0x");
        sbE.append(SegmentedByteString.toHexString(buffer.getByte(0L)));
        throw new NumberFormatException(sbE.toString());
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int i10 = 0;
        while (i10 < sink.length) {
            int i11 = buffer.read(sink, i10, sink.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(@NotNull okio.Buffer buffer) throws EOFException {
        int i10;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        int i11 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            Segment segment = buffer.head;
            Intrinsics.checkNotNull(segment);
            byte[] bArr = segment.data;
            int i12 = segment.pos;
            int i13 = segment.limit;
            while (i12 < i13) {
                byte b10 = bArr[i12];
                if (b10 >= 48 && b10 <= 57) {
                    i10 = b10 - 48;
                } else if (b10 >= 97 && b10 <= 102) {
                    i10 = b10 - 87;
                } else {
                    if (b10 < 65 || b10 > 70) {
                        if (i11 != 0) {
                            z10 = true;
                            break;
                        }
                        throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + SegmentedByteString.toHexString(b10));
                    }
                    i10 = b10 - 55;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new okio.Buffer().writeHexadecimalUnsignedLong(j10).writeByte((int) b10).readUtf8());
                }
                j10 = (j10 << 4) | ((long) i10);
                i12++;
                i11++;
            }
            if (i12 == i13) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            if (z10) {
                break;
            }
        } while (buffer.head != null);
        buffer.setSize$okio(buffer.size() - ((long) i11));
        return j10;
    }

    public static final int commonReadInt(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 4) {
            return (buffer.readByte() & 255) | ((buffer.readByte() & 255) << 24) | ((buffer.readByte() & 255) << 16) | ((buffer.readByte() & 255) << 8);
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        buffer.setSize$okio(buffer.size() - 4);
        if (i14 == i11) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i14;
        }
        return i15;
    }

    public static final long commonReadLong(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 8) {
            return ((((long) buffer.readInt()) & 4294967295L) << 32) | (4294967295L & ((long) buffer.readInt()));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 7;
        long j10 = ((((long) bArr[i10]) & 255) << 56) | ((((long) bArr[i10 + 1]) & 255) << 48) | ((((long) bArr[i10 + 2]) & 255) << 40) | ((((long) bArr[i10 + 3]) & 255) << 32) | ((((long) bArr[i10 + 4]) & 255) << 24) | ((((long) bArr[i10 + 5]) & 255) << 16) | ((((long) bArr[i10 + 6]) & 255) << 8);
        int i13 = i10 + 8;
        long j11 = j10 | (((long) bArr[i12]) & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i13 == i11) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return j11;
    }

    public static final short commonReadShort(@NotNull okio.Buffer buffer) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        int i11 = segment.limit;
        if (i11 - i10 < 2) {
            return (short) ((buffer.readByte() & 255) | ((buffer.readByte() & 255) << 8));
        }
        byte[] bArr = segment.data;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        buffer.setSize$okio(buffer.size() - 2);
        if (i14 == i11) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i14;
        }
        return (short) i15;
    }

    @NotNull
    public static final okio.Buffer.UnsafeCursor commonReadUnsafe(@NotNull okio.Buffer buffer, @NotNull okio.Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        okio.Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer".toString());
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(v.c("byteCount: ", j10).toString());
        }
        if (buffer.size() < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.pos;
        if (((long) i10) + j10 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j10), 0, 0, 3, null);
        }
        int i11 = (int) j10;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i10, i10 + i11);
        segment.pos += i11;
        buffer.setSize$okio(buffer.size() - j10);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(@NotNull okio.Buffer buffer) throws EOFException {
        int i10;
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b10 = buffer.getByte(0L);
        if ((b10 & 128) == 0) {
            i10 = b10 & 127;
            i12 = 0;
            i11 = 1;
        } else if ((b10 & 224) == 192) {
            i10 = b10 & 31;
            i11 = 2;
            i12 = 128;
        } else if ((b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) == 224) {
            i10 = b10 & 15;
            i11 = 3;
            i12 = 2048;
        } else {
            if ((b10 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = b10 & 7;
            i11 = 4;
            i12 = 65536;
        }
        long j10 = i11;
        if (buffer.size() < j10) {
            StringBuilder sbC = o1.c("size < ", i11, ": ");
            sbC.append(buffer.size());
            sbC.append(" (to read code point prefixed 0x");
            sbC.append(SegmentedByteString.toHexString(b10));
            sbC.append(RootService.CLOSE_BRACKET);
            throw new EOFException(sbC.toString());
        }
        for (int i13 = 1; i13 < i11; i13++) {
            long j11 = i13;
            byte b11 = buffer.getByte(j11);
            if ((b11 & Constants.CVR_B2b87_11_RFU) != 128) {
                buffer.skip(j11);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i10 = (i10 << 6) | (b11 & 63);
        }
        buffer.skip(j10);
        if (i10 > 1114111) {
            return Utf8.REPLACEMENT_CODE_POINT;
        }
        return ((55296 > i10 || i10 >= 57344) && i10 >= i12) ? i10 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(v.c("limit < 0: ", j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j11 < buffer.size() && buffer.getByte(j11 - 1) == 13 && buffer.getByte(j11) == 10) {
            return readUtf8Line(buffer, j11);
        }
        okio.Buffer buffer2 = new okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j10) + " content=" + buffer2.readByteString().hex() + Typography.ellipsis);
    }

    public static final long commonResizeBuffer(@NotNull okio.Buffer.UnsafeCursor unsafeCursor, long j10) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
        }
        long size = buffer.size();
        if (j10 <= size) {
            if (j10 < 0) {
                throw new IllegalArgumentException(v.c("newSize < 0: ", j10).toString());
            }
            long j11 = size - j10;
            while (j11 > 0) {
                Segment segment = buffer.head;
                Intrinsics.checkNotNull(segment);
                Segment segment2 = segment.prev;
                Intrinsics.checkNotNull(segment2);
                int i10 = segment2.limit;
                long j12 = i10 - segment2.pos;
                if (j12 > j11) {
                    segment2.limit = i10 - ((int) j11);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j11 -= j12;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j10;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j10 > size) {
            long j13 = j10 - size;
            boolean z10 = true;
            while (j13 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j13, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j13 -= (long) iMin;
                if (z10) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i11 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i11 - iMin;
                    unsafeCursor.end = i11;
                    z10 = false;
                }
            }
        }
        buffer.setSize$okio(j10);
        return size;
    }

    public static final int commonSeek(@NotNull okio.Buffer.UnsafeCursor unsafeCursor, long j10) {
        Segment segmentPush;
        Intrinsics.checkNotNullParameter(unsafeCursor, "<this>");
        okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer".toString());
        }
        if (j10 < -1 || j10 > buffer.size()) {
            throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + buffer.size());
        }
        if (j10 == -1 || j10 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j10;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment = buffer.head;
        long j11 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j12 = unsafeCursor.offset;
            int i10 = unsafeCursor.start;
            Segment segment2 = unsafeCursor.getSegment();
            Intrinsics.checkNotNull(segment2);
            long j13 = j12 - ((long) (i10 - segment2.pos));
            if (j13 > j10) {
                segmentPush = segment;
                segment = unsafeCursor.getSegment();
                size = j13;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j11 = j13;
            }
        } else {
            segmentPush = segment;
        }
        if (size - j10 > j10 - j11) {
            while (true) {
                Intrinsics.checkNotNull(segmentPush);
                int i11 = segmentPush.limit;
                int i12 = segmentPush.pos;
                if (j10 < ((long) (i11 - i12)) + j11) {
                    break;
                }
                j11 += (long) (i11 - i12);
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j10) {
                Intrinsics.checkNotNull(segment);
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            j11 = size;
            segmentPush = segment;
        }
        if (unsafeCursor.readWrite) {
            Intrinsics.checkNotNull(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment3 = segmentPush.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j10;
        Intrinsics.checkNotNull(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i13 = segmentPush.pos + ((int) (j10 - j11));
        unsafeCursor.start = i13;
        int i14 = segmentPush.limit;
        unsafeCursor.end = i14;
        return i14 - i13;
    }

    public static final int commonSelect(@NotNull okio.Buffer buffer, @NotNull Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(@NotNull okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        while (j10 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            long j11 = iMin;
            buffer.setSize$okio(buffer.size() - j11);
            j10 -= j11;
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = buffer.head;
        if (segment != null) {
            Intrinsics.checkNotNull(segment);
            Segment segment2 = segment.prev;
            Intrinsics.checkNotNull(segment2);
            return (segment2.limit + i10 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull ByteString byteString, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i10, i11);
        return buffer;
    }

    public static /* synthetic */ okio.Buffer commonWrite$default(okio.Buffer buffer, ByteString byteString, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = byteString.size();
        }
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(byteString, "byteString");
        byteString.write$okio(buffer, i10, i11);
        return buffer;
    }

    public static final long commonWriteAll(@NotNull okio.Buffer buffer, @NotNull Source source) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(buffer, SvgConstantsKt.SPECIFIED_FONT_FAMILY);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @NotNull
    public static final okio.Buffer commonWriteByte(@NotNull okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i11 + 1;
        bArr[i11] = (byte) i10;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteDecimalLong(@NotNull okio.Buffer buffer, long j10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 == 0) {
            return buffer.writeByte(48);
        }
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i10 = 2;
                }
            } else if (j10 < AnimationKt.MillisToNanos) {
                i10 = j10 < 100000 ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < RealConnection.IDLE_CONNECTION_HEALTHY_NS) {
                i10 = j10 < 1000000000 ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i10 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = getHEX_DIGIT_BYTES()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i10;
        buffer.setSize$okio(buffer.size() + ((long) i10));
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteHexadecimalUnsignedLong(@NotNull okio.Buffer buffer, long j10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 == 0) {
            return buffer.writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = getHEX_DIGIT_BYTES()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i10;
        buffer.setSize$okio(buffer.size() + ((long) i10));
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteInt(@NotNull okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i11 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteLong(@NotNull okio.Buffer buffer, long j10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        bArr[i10 + 1] = (byte) ((j10 >>> 48) & 255);
        bArr[i10 + 2] = (byte) ((j10 >>> 40) & 255);
        bArr[i10 + 3] = (byte) ((j10 >>> 32) & 255);
        bArr[i10 + 4] = (byte) ((j10 >>> 24) & 255);
        bArr[i10 + 5] = (byte) ((j10 >>> 16) & 255);
        bArr[i10 + 6] = (byte) ((j10 >>> 8) & 255);
        bArr[i10 + 7] = (byte) (j10 & 255);
        segmentWritableSegment$okio.limit = i10 + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteShort(@NotNull okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i11 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8(@NotNull okio.Buffer buffer, @NotNull String string, int i10, int i11) {
        char cCharAt;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(string, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("beginIndex < 0: ", i10).toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(n1.e("endIndex < beginIndex: ", i11, " < ", i10).toString());
        }
        if (i11 > string.length()) {
            StringBuilder sbC = o1.c("endIndex > string.length: ", i11, " > ");
            sbC.append(string.length());
            throw new IllegalArgumentException(sbC.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = string.charAt(i10);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i12 = segmentWritableSegment$okio.limit - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = string.charAt(i10)) >= 128) {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = segmentWritableSegment$okio.limit;
                int i15 = (i12 + i10) - i14;
                segmentWritableSegment$okio.limit = i14 + i15;
                buffer.setSize$okio(buffer.size() + ((long) i15));
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i16 = segmentWritableSegment$okio2.limit;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i16 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i17 = segmentWritableSegment$okio3.limit;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i17 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? string.charAt(i18) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i20 = segmentWritableSegment$okio4.limit;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i20 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
        return buffer;
    }

    @NotNull
    public static final okio.Buffer commonWriteUtf8CodePoint(@NotNull okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i10 < 128) {
            buffer.writeByte(i10);
        } else if (i10 < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i11 = segmentWritableSegment$okio.limit;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio.limit = i11 + 2;
            buffer.setSize$okio(buffer.size() + 2);
        } else if (55296 <= i10 && i10 < 57344) {
            buffer.writeByte(63);
        } else if (i10 < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i12 = segmentWritableSegment$okio2.limit;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio2.limit = i12 + 3;
            buffer.setSize$okio(buffer.size() + 3);
        } else {
            if (i10 > 1114111) {
                throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i10));
            }
            Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
            byte[] bArr3 = segmentWritableSegment$okio3.data;
            int i13 = segmentWritableSegment$okio3.limit;
            bArr3[i13] = (byte) ((i10 >> 18) | 240);
            bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
            bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
            bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio3.limit = i13 + 4;
            buffer.setSize$okio(buffer.size() + 4);
        }
        return buffer;
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return f86445a;
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i10, @NotNull byte[] bytes, int i11, int i12) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int i13 = segment.limit;
        byte[] bArr = segment.data;
        while (i11 < i12) {
            if (i10 == i13) {
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i10 = segment.pos;
                i13 = segment.limit;
            }
            if (bArr[i10] != bytes[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (buffer.getByte(j11) == 13) {
                String utf8 = buffer.readUtf8(j11);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf9 = buffer.readUtf8(j10);
        buffer.skip(1L);
        return utf9;
    }

    public static final <T> T seek(@NotNull okio.Buffer buffer, long j10, @NotNull Function2<? super Segment, ? super Long, ? extends T> lambda) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return lambda.invoke(null, -1L);
        }
        if (buffer.size() - j10 < j10) {
            long size = buffer.size();
            while (size > j10) {
                segment = segment.prev;
                Intrinsics.checkNotNull(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            return lambda.invoke(segment, Long.valueOf(size));
        }
        long j11 = 0;
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + j11;
            if (j12 > j10) {
                return lambda.invoke(segment, Long.valueOf(j11));
            }
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j11 = j12;
        }
    }

    public static final int selectPrefix(@NotNull okio.Buffer buffer, @NotNull Options options, boolean z10) {
        int i10;
        int i11;
        Segment segment;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        Segment segment2 = buffer.head;
        if (segment2 == null) {
            return z10 ? -2 : -1;
        }
        byte[] bArr = segment2.data;
        int i14 = segment2.pos;
        int i15 = segment2.limit;
        int[] trie$okio = options.getTrie();
        Segment segment3 = segment2;
        int i16 = -1;
        int i17 = 0;
        loop0: while (true) {
            int i18 = i17 + 1;
            int i19 = trie$okio[i17];
            int i20 = i17 + 2;
            int i21 = trie$okio[i18];
            if (i21 != -1) {
                i16 = i21;
            }
            if (segment3 == null) {
                break;
            }
            if (i19 >= 0) {
                i10 = i14 + 1;
                int i22 = bArr[i14] & 255;
                int i23 = i20 + i19;
                while (i20 != i23) {
                    if (i22 == trie$okio[i20]) {
                        i11 = trie$okio[i20 + i19];
                        if (i10 == i15) {
                            segment3 = segment3.next;
                            Intrinsics.checkNotNull(segment3);
                            i10 = segment3.pos;
                            bArr = segment3.data;
                            i15 = segment3.limit;
                            if (segment3 == segment2) {
                                segment3 = null;
                            }
                        }
                    } else {
                        i20++;
                    }
                }
                return i16;
            }
            int i24 = (i19 * (-1)) + i20;
            while (true) {
                int i25 = i14 + 1;
                int i26 = i20 + 1;
                if ((bArr[i14] & 255) != trie$okio[i20]) {
                    return i16;
                }
                boolean z11 = i26 == i24;
                if (i25 == i15) {
                    Intrinsics.checkNotNull(segment3);
                    Segment segment4 = segment3.next;
                    Intrinsics.checkNotNull(segment4);
                    i13 = segment4.pos;
                    byte[] bArr2 = segment4.data;
                    i12 = segment4.limit;
                    if (segment4 != segment2) {
                        segment = segment4;
                        bArr = bArr2;
                    } else {
                        if (!z11) {
                            break loop0;
                        }
                        bArr = bArr2;
                        segment = null;
                    }
                } else {
                    segment = segment3;
                    i12 = i15;
                    i13 = i25;
                }
                if (z11) {
                    i11 = trie$okio[i26];
                    i10 = i13;
                    i15 = i12;
                    segment3 = segment;
                    break;
                }
                i14 = i13;
                i15 = i12;
                segment3 = segment;
                i20 = i26;
            }
            if (i11 >= 0) {
                return i11;
            }
            i17 = -i11;
            i14 = i10;
        }
        if (z10) {
            return -2;
        }
        return i16;
    }

    public static /* synthetic */ int selectPrefix$default(okio.Buffer buffer, Options options, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return selectPrefix(buffer, options, z10);
    }

    public static final int commonRead(@NotNull okio.Buffer buffer, @NotNull byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i10, i11);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i11, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i12 = segment.pos;
        ArraysKt___ArraysJvmKt.copyInto(bArr, sink, i10, i12, i12 + iMin);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(v.c("byteCount: ", j10).toString());
        }
        if (buffer.size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        buffer.readFully(bArr);
        return bArr;
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.Buffer buffer, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (j10 < 0 || j10 > 2147483647L) {
            throw new IllegalArgumentException(v.c("byteCount: ", j10).toString());
        }
        if (buffer.size() < j10) {
            throw new EOFException();
        }
        if (j10 < SvgConstantsKt.SPECIFIED_COLOR) {
            return new ByteString(buffer.readByteArray(j10));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j10);
        buffer.skip(j10);
        return byteStringSnapshot;
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] source) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        return buffer.write(source, 0, source.length);
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull byte[] source, int i10, int i11) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        long j10 = i11;
        SegmentedByteString.checkOffsetAndCount(source.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i12 - i10, 8192 - segmentWritableSegment$okio.limit);
            int i13 = i10 + iMin;
            ArraysKt___ArraysJvmKt.copyInto(source, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i10, i13);
            segmentWritableSegment$okio.limit += iMin;
            i10 = i13;
        }
        buffer.setSize$okio(buffer.size() + j10);
        return buffer;
    }

    public static final void commonReadFully(@NotNull okio.Buffer buffer, @NotNull okio.Buffer sink, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (buffer.size() >= j10) {
            sink.write(buffer, j10);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull okio.Buffer buffer, int i10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        if (i10 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i10);
        Segment segment = buffer.head;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            Intrinsics.checkNotNull(segment);
            int i14 = segment.limit;
            int i15 = segment.pos;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        Segment segment2 = buffer.head;
        int i16 = 0;
        while (i11 < i10) {
            Intrinsics.checkNotNull(segment2);
            bArr[i16] = segment2.data;
            i11 += segment2.limit - segment2.pos;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = segment2.pos;
            segment2.shared = true;
            i16++;
            segment2 = segment2.next;
        }
        return new C0780SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final okio.Buffer commonWrite(@NotNull okio.Buffer buffer, @NotNull Source source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        while (j10 > 0) {
            long j11 = source.read(buffer, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return buffer;
    }

    public static final long commonRead(@NotNull okio.Buffer buffer, @NotNull okio.Buffer sink, long j10) {
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", j10).toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j10 > buffer.size()) {
            j10 = buffer.size();
        }
        sink.write(buffer, j10);
        return j10;
    }

    public static final void commonWrite(@NotNull okio.Buffer buffer, @NotNull okio.Buffer source, long j10) {
        Segment segment;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        if (source != buffer) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j10);
            while (j10 > 0) {
                Segment segment2 = source.head;
                Intrinsics.checkNotNull(segment2);
                int i10 = segment2.limit;
                Segment segment3 = source.head;
                Intrinsics.checkNotNull(segment3);
                if (j10 < i10 - segment3.pos) {
                    Segment segment4 = buffer.head;
                    if (segment4 != null) {
                        Intrinsics.checkNotNull(segment4);
                        segment = segment4.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((((long) segment.limit) + j10) - ((long) (segment.shared ? 0 : segment.pos)) <= SvgConstantsKt.SPECIFIED_FONT_FAMILY) {
                            Segment segment5 = source.head;
                            Intrinsics.checkNotNull(segment5);
                            segment5.writeTo(segment, (int) j10);
                            source.setSize$okio(source.size() - j10);
                            buffer.setSize$okio(buffer.size() + j10);
                            return;
                        }
                    }
                    Segment segment6 = source.head;
                    Intrinsics.checkNotNull(segment6);
                    source.head = segment6.split((int) j10);
                }
                Segment segment7 = source.head;
                Intrinsics.checkNotNull(segment7);
                long j11 = segment7.limit - segment7.pos;
                source.head = segment7.pop();
                Segment segment8 = buffer.head;
                if (segment8 == null) {
                    buffer.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    Intrinsics.checkNotNull(segment8);
                    Segment segment9 = segment8.prev;
                    Intrinsics.checkNotNull(segment9);
                    segment9.push(segment7).compact();
                }
                source.setSize$okio(source.size() - j11);
                buffer.setSize$okio(buffer.size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final long commonIndexOf(@NotNull okio.Buffer buffer, @NotNull ByteString bytes, long j10) {
        long size;
        int i10;
        long j11 = j10;
        Intrinsics.checkNotNullParameter(buffer, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j12 = 0;
        if (j11 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j11 < j11) {
                size = buffer.size();
                while (size > j11) {
                    segment = segment.prev;
                    Intrinsics.checkNotNull(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b10 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (buffer.size() - ((long) size2)) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                    i10 = (int) ((((long) segment.pos) + j11) - size);
                    while (i10 < iMin) {
                        if (bArr[i10] != b10 || !rangeEquals(segment, i10 + 1, bArrInternalArray$okio, 1, size2)) {
                            i10++;
                        }
                    }
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    Intrinsics.checkNotNull(segment);
                    j11 = size;
                }
                return -1L;
            }
            while (true) {
                long j13 = ((long) (segment.limit - segment.pos)) + j12;
                if (j13 > j11) {
                    break;
                }
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                j12 = j13;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b11 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (buffer.size() - ((long) size4)) + 1;
            size = j12;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j14 = size5;
                int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - size);
                i10 = (int) ((((long) segment.pos) + j11) - size);
                while (i10 < iMin2) {
                    if (bArr2[i10] == b11 && rangeEquals(segment, i10 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i10++;
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                Intrinsics.checkNotNull(segment);
                size5 = j14;
                j11 = size;
            }
            return -1L;
            return ((long) (i10 - segment.pos)) + size;
        }
        throw new IllegalArgumentException(v.c("fromIndex < 0: ", j11).toString());
    }
}
