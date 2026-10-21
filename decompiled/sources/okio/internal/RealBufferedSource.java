package okio.internal;

import androidx.camera.core.impl.v;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.EOFException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlin.text.Typography;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.PeekSource;
import okio.SegmentedByteString;
import okio.Sink;
import okio.Timeout;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSource, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0080\b\u001a\r\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0080\b\u001a%\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\u001d\u0010\r\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u000f\u001a\u00020\u0010*\u00020\u0002H\u0080\b\u001a-\u0010\u0011\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a%\u0010\u0016\u001a\u00020\u0014*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0080\b\u001a\u001d\u0010\u0016\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010\u001a\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u001bH\u0080\b\u001a\r\u0010\u001c\u001a\u00020\b*\u00020\u0002H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u0018*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001d\u001a\u00020\u0018*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001e\u001a\u00020\f*\u00020\u0002H\u0080\b\u001a\u0015\u0010\u001e\u001a\u00020\f*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010\u001f\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\u0015\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a\u001d\u0010 \u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010!\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010\"\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010#\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\r\u0010$\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010%\u001a\u00020\u0006*\u00020\u0002H\u0080\b\u001a\r\u0010&\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010(\u001a\u00020'*\u00020\u0002H\u0080\b\u001a\r\u0010)\u001a\u00020**\u00020\u0002H\u0080\b\u001a\u0015\u0010)\u001a\u00020**\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u0010+\u001a\u00020\u0014*\u00020\u0002H\u0080\b\u001a\u000f\u0010,\u001a\u0004\u0018\u00010**\u00020\u0002H\u0080\b\u001a\u0015\u0010-\u001a\u00020**\u00020\u00022\u0006\u0010.\u001a\u00020\u0006H\u0080\b\u001a\u0015\u0010/\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00100\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\u0015\u00101\u001a\u00020\u0014*\u00020\u00022\u0006\u00102\u001a\u000203H\u0080\b\u001a\u0015\u00104\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0006H\u0080\b\u001a\r\u00105\u001a\u000206*\u00020\u0002H\u0080\b\u001a\r\u00107\u001a\u00020**\u00020\u0002H\u0080\b¨\u00068"}, d2 = {"commonClose", "", "Lokio/RealBufferedSource;", "commonExhausted", "", "commonIndexOf", "", "b", "", "fromIndex", "toIndex", "bytes", "Lokio/ByteString;", "commonIndexOfElement", "targetBytes", "commonPeek", "Lokio/BufferedSource;", "commonRangeEquals", TypedValues.CycleType.S_WAVE_OFFSET, "bytesOffset", "", "byteCount", "commonRead", "sink", "", "Lokio/Buffer;", "commonReadAll", "Lokio/Sink;", "commonReadByte", "commonReadByteArray", "commonReadByteString", "commonReadDecimalLong", "commonReadFully", "commonReadHexadecimalUnsignedLong", "commonReadInt", "commonReadIntLe", "commonReadLong", "commonReadLongLe", "commonReadShort", "", "commonReadShortLe", "commonReadUtf8", "", "commonReadUtf8CodePoint", "commonReadUtf8Line", "commonReadUtf8LineStrict", "limit", "commonRequest", "commonRequire", "commonSelect", "options", "Lokio/Options;", "commonSkip", "commonTimeout", "Lokio/Timeout;", "commonToString", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "-RealBufferedSource")
@SourceDebugExtension({"SMAP\nRealBufferedSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,402:1\n1#2:403\n62#3:404\n62#3:405\n62#3:406\n62#3:407\n62#3:408\n62#3:409\n62#3:410\n62#3:411\n62#3:412\n62#3:413\n62#3:414\n62#3:415\n62#3:416\n62#3:417\n62#3:418\n62#3:419\n62#3:420\n62#3:421\n62#3:422\n62#3:423\n62#3:424\n62#3:425\n62#3:426\n62#3:428\n62#3:429\n62#3:430\n62#3:431\n62#3:432\n62#3:433\n62#3:434\n62#3:435\n62#3:436\n62#3:437\n62#3:438\n62#3:439\n62#3:440\n62#3:441\n62#3:442\n62#3:443\n62#3:444\n62#3:445\n62#3:446\n62#3:447\n62#3:449\n62#3:450\n62#3:451\n62#3:452\n62#3:453\n62#3:454\n62#3:455\n62#3:456\n62#3:457\n62#3:458\n62#3:459\n62#3:460\n62#3:461\n62#3:462\n62#3:463\n62#3:464\n62#3:465\n62#3:466\n62#3:467\n62#3:468\n62#3:469\n62#3:470\n62#3:471\n62#3:472\n62#3:473\n62#3:474\n62#3:475\n89#4:427\n89#4:448\n*S KotlinDebug\n*F\n+ 1 RealBufferedSource.kt\nokio/internal/-RealBufferedSource\n*L\n41#1:404\n42#1:405\n46#1:406\n47#1:407\n52#1:408\n62#1:409\n63#1:410\n70#1:411\n74#1:412\n75#1:413\n80#1:414\n87#1:415\n94#1:416\n99#1:417\n107#1:418\n108#1:419\n113#1:420\n122#1:421\n123#1:422\n130#1:423\n136#1:424\n137#1:425\n141#1:426\n142#1:428\n150#1:429\n154#1:430\n159#1:431\n160#1:432\n163#1:433\n166#1:434\n167#1:435\n168#1:436\n174#1:437\n175#1:438\n180#1:439\n187#1:440\n188#1:441\n193#1:442\n201#1:443\n203#1:444\n204#1:445\n206#1:446\n209#1:447\n211#1:449\n219#1:450\n226#1:451\n231#1:452\n236#1:453\n241#1:454\n246#1:455\n251#1:456\n256#1:457\n264#1:458\n275#1:459\n283#1:460\n297#1:461\n304#1:462\n307#1:463\n308#1:464\n319#1:465\n324#1:466\n325#1:467\n338#1:468\n341#1:469\n342#1:470\n354#1:471\n357#1:472\n358#1:473\n383#1:474\n396#1:475\n141#1:427\n209#1:448\n*E\n"})
public final class RealBufferedSource {
    public static final void commonClose(@NotNull okio.RealBufferedSource realBufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (realBufferedSource.closed) {
            return;
        }
        realBufferedSource.closed = true;
        realBufferedSource.source.close();
        realBufferedSource.bufferField.clear();
    }

    public static final boolean commonExhausted(@NotNull okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!realBufferedSource.closed) {
            return realBufferedSource.bufferField.exhausted() && realBufferedSource.source.read(realBufferedSource.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1;
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final long commonIndexOf(@NotNull okio.RealBufferedSource realBufferedSource, byte b10, long j10, long j11) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (0 > j10 || j10 > j11) {
            throw new IllegalArgumentException(("fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        while (j10 < j11) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(b10, j10, j11);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (size >= j11 || realBufferedSource.source.read(realBufferedSource.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                break;
            }
            j10 = Math.max(j10, size);
        }
        return -1L;
    }

    public static final long commonIndexOfElement(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull ByteString targetBytes, long j10) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(targetBytes, "targetBytes");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOfElement = realBufferedSource.bufferField.indexOfElement(targetBytes, j10);
            if (jIndexOfElement != -1) {
                return jIndexOfElement;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, size);
        }
    }

    @NotNull
    public static final BufferedSource commonPeek(@NotNull okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        return Okio.buffer(new PeekSource(realBufferedSource));
    }

    public static final boolean commonRangeEquals(@NotNull okio.RealBufferedSource realBufferedSource, long j10, @NotNull ByteString bytes, int i10, int i11) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (j10 < 0 || i10 < 0 || i11 < 0 || bytes.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            long j11 = ((long) i12) + j10;
            if (!realBufferedSource.request(1 + j11) || realBufferedSource.bufferField.getByte(j11) != bytes.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public static final long commonRead(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull Buffer sink, long j10) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (j10 < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", j10).toString());
        }
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
            return -1L;
        }
        return realBufferedSource.bufferField.read(sink, Math.min(j10, realBufferedSource.bufferField.size()));
    }

    public static final long commonReadAll(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull Sink sink) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = 0;
        while (realBufferedSource.source.read(realBufferedSource.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY) != -1) {
            long jCompleteSegmentByteCount = realBufferedSource.bufferField.completeSegmentByteCount();
            if (jCompleteSegmentByteCount > 0) {
                j10 += jCompleteSegmentByteCount;
                sink.write(realBufferedSource.bufferField, jCompleteSegmentByteCount);
            }
        }
        if (realBufferedSource.bufferField.size() <= 0) {
            return j10;
        }
        long size = j10 + realBufferedSource.bufferField.size();
        Buffer buffer = realBufferedSource.bufferField;
        sink.write(buffer, buffer.size());
        return size;
    }

    public static final byte commonReadByte(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        return realBufferedSource.bufferField.readByte();
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readByteArray(j10);
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readByteString(j10);
    }

    public static final long commonReadDecimalLong(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        long j10 = 0;
        while (true) {
            long j11 = j10 + 1;
            if (!realBufferedSource.request(j11)) {
                break;
            }
            byte b10 = realBufferedSource.bufferField.getByte(j10);
            if ((b10 < 48 || b10 > 57) && !(j10 == 0 && b10 == 45)) {
                if (j10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder("Expected a digit or '-' but was 0x");
                String string = Integer.toString(b10, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            j10 = j11;
        }
        return realBufferedSource.bufferField.readDecimalLong();
    }

    public static final void commonReadFully(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull byte[] sink) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            realBufferedSource.require(sink.length);
            realBufferedSource.bufferField.readFully(sink);
        } catch (EOFException e5) {
            int i10 = 0;
            while (realBufferedSource.bufferField.size() > 0) {
                Buffer buffer = realBufferedSource.bufferField;
                int i11 = buffer.read(sink, i10, (int) buffer.size());
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
            throw e5;
        }
    }

    public static final long commonReadHexadecimalUnsignedLong(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!realBufferedSource.request(i11)) {
                break;
            }
            byte b10 = realBufferedSource.bufferField.getByte(i10);
            if ((b10 < 48 || b10 > 57) && ((b10 < 97 || b10 > 102) && (b10 < 65 || b10 > 70))) {
                if (i10 != 0) {
                    break;
                }
                StringBuilder sb2 = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                String string = Integer.toString(b10, CharsKt.checkRadix(CharsKt.checkRadix(16)));
                Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
                sb2.append(string);
                throw new NumberFormatException(sb2.toString());
            }
            i10 = i11;
        }
        return realBufferedSource.bufferField.readHexadecimalUnsignedLong();
    }

    public static final int commonReadInt(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readInt();
    }

    public static final int commonReadIntLe(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(4L);
        return realBufferedSource.bufferField.readIntLe();
    }

    public static final long commonReadLong(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLong();
    }

    public static final long commonReadLongLe(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(8L);
        return realBufferedSource.bufferField.readLongLe();
    }

    public static final short commonReadShort(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShort();
    }

    public static final short commonReadShortLe(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(2L);
        return realBufferedSource.bufferField.readShortLe();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(j10);
        return realBufferedSource.bufferField.readUtf8(j10);
    }

    public static final int commonReadUtf8CodePoint(@NotNull okio.RealBufferedSource realBufferedSource) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.require(1L);
        byte b10 = realBufferedSource.bufferField.getByte(0L);
        if ((b10 & 224) == 192) {
            realBufferedSource.require(2L);
        } else if ((b10 & Constants.CVR_B2b8765_1111_APP_DISABLED) == 224) {
            realBufferedSource.require(3L);
        } else if ((b10 & 248) == 240) {
            realBufferedSource.require(4L);
        }
        return realBufferedSource.bufferField.readUtf8CodePoint();
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        long jIndexOf = realBufferedSource.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (realBufferedSource.bufferField.size() != 0) {
            return realBufferedSource.readUtf8(realBufferedSource.bufferField.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(v.c("limit < 0: ", j10).toString());
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jIndexOf = realBufferedSource.indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, jIndexOf);
        }
        if (j11 < Long.MAX_VALUE && realBufferedSource.request(j11) && realBufferedSource.bufferField.getByte(j11 - 1) == 13 && realBufferedSource.request(1 + j11) && realBufferedSource.bufferField.getByte(j11) == 10) {
            return Buffer.readUtf8Line(realBufferedSource.bufferField, j11);
        }
        Buffer buffer = new Buffer();
        Buffer buffer2 = realBufferedSource.bufferField;
        buffer2.copyTo(buffer, 0L, Math.min(32, buffer2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(realBufferedSource.bufferField.size(), j10) + " content=" + buffer.readByteString().hex() + Typography.ellipsis);
    }

    public static final boolean commonRequest(@NotNull okio.RealBufferedSource realBufferedSource, long j10) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (j10 < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", j10).toString());
        }
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (realBufferedSource.bufferField.size() < j10) {
            if (realBufferedSource.source.read(realBufferedSource.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                return false;
            }
        }
        return true;
    }

    public static final void commonRequire(@NotNull okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!realBufferedSource.request(j10)) {
            throw new EOFException();
        }
    }

    public static final int commonSelect(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull Options options) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(options, "options");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        do {
            int iSelectPrefix = Buffer.selectPrefix(realBufferedSource.bufferField, options, true);
            if (iSelectPrefix != -2) {
                if (iSelectPrefix == -1) {
                    return -1;
                }
                realBufferedSource.bufferField.skip(options.getByteStrings()[iSelectPrefix].size());
                return iSelectPrefix;
            }
        } while (realBufferedSource.source.read(realBufferedSource.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY) != -1);
        return -1;
    }

    public static final void commonSkip(@NotNull okio.RealBufferedSource realBufferedSource, long j10) throws EOFException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (j10 > 0) {
            if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, realBufferedSource.bufferField.size());
            realBufferedSource.bufferField.skip(jMin);
            j10 -= jMin;
        }
    }

    @NotNull
    public static final Timeout commonTimeout(@NotNull okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        return realBufferedSource.source.getF85757p0();
    }

    @NotNull
    public static final String commonToString(@NotNull okio.RealBufferedSource realBufferedSource) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        return "buffer(" + realBufferedSource.source + RootService.CLOSE_BRACKET;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull okio.RealBufferedSource realBufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteArray();
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull okio.RealBufferedSource realBufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readByteString();
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull okio.RealBufferedSource realBufferedSource) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        realBufferedSource.bufferField.writeAll(realBufferedSource.source);
        return realBufferedSource.bufferField.readUtf8();
    }

    public static final void commonReadFully(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull Buffer sink, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        try {
            realBufferedSource.require(j10);
            realBufferedSource.bufferField.readFully(sink, j10);
        } catch (EOFException e5) {
            sink.writeAll(realBufferedSource.bufferField);
            throw e5;
        }
    }

    public static final long commonIndexOf(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull ByteString bytes, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (!(!realBufferedSource.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        while (true) {
            long jIndexOf = realBufferedSource.bufferField.indexOf(bytes, j10);
            if (jIndexOf != -1) {
                return jIndexOf;
            }
            long size = realBufferedSource.bufferField.size();
            if (realBufferedSource.source.read(realBufferedSource.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
                return -1L;
            }
            j10 = Math.max(j10, (size - ((long) bytes.size())) + 1);
        }
    }

    public static final int commonRead(@NotNull okio.RealBufferedSource realBufferedSource, @NotNull byte[] sink, int i10, int i11) {
        Intrinsics.checkNotNullParameter(realBufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(sink, "sink");
        long j10 = i11;
        SegmentedByteString.checkOffsetAndCount(sink.length, i10, j10);
        if (realBufferedSource.bufferField.size() == 0 && realBufferedSource.source.read(realBufferedSource.bufferField, SvgConstantsKt.SPECIFIED_FONT_FAMILY) == -1) {
            return -1;
        }
        return realBufferedSource.bufferField.read(sink, i10, (int) Math.min(j10, realBufferedSource.bufferField.size()));
    }
}
