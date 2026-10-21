package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: compiled from: Util.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a \u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000\u001a\f\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\bH\u0000\u001a\f\u0010\u0007\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a\u0015\u0010\n\u001a\u00020\b*\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000e\u001a\u00020\b*\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000f\u001a\u00020\b*\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\b*\u00020\f2\u0006\u0010\r\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\f2\u0006\u0010\r\u001a\u00020\u0000H\u0080\f\u001a\u0015\u0010\u0011\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\u0000*\u00020\b2\u0006\u0010\r\u001a\u00020\u0000H\u0080\f\u001a\u0019\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\bH\u0080\b\u001a\u0019\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0080\b\u001a0\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\bH\u0000\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\fH\u0000\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\bH\u0000\u001a\f\u0010\u001b\u001a\u00020\u001a*\u00020\u0000H\u0000\u001a\u0010\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000\u001a\u0014\u0010\u001e\u001a\u00020\b*\u00020\u001f2\u0006\u0010 \u001a\u00020\bH\u0000\u001a\u0014\u0010\u001e\u001a\u00020\b*\u00020\u00152\u0006\u0010!\u001a\u00020\bH\u0000\" \u0010'\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$\"\u001a\u0010+\u001a\u00020\b8\u0000X\u0080D¢\u0006\f\n\u0004\b\u0013\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, d2 = {"", "size", TypedValues.CycleType.S_WAVE_OFFSET, "byteCount", "", "checkOffsetAndCount", "", "reverseBytes", "", "bitCount", "leftRotate", "rightRotate", "", "other", "shr", "shl", "and", "xor", "a", "b", "minOf", "", "aOffset", "bOffset", "", "arrayRangeEquals", "", "toHexString", "Lokio/Buffer$UnsafeCursor;", "unsafeCursor", "resolveDefaultParameter", "Lokio/ByteString;", "position", "sizeParam", "Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor", "()Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor$annotations", "()V", "DEFAULT__new_UnsafeCursor", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDEFAULT__ByteString_size", "()I", "DEFAULT__ByteString_size", "okio"}, k = 2, mv = {1, 9, 0})
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,187:1\n68#1:188\n74#1:189\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n106#1:188\n107#1:189\n*E\n"})
public final class SegmentedByteString {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Buffer.UnsafeCursor f86321a = new Buffer.UnsafeCursor();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f86322b = -1234567890;

    public static final int and(byte b10, int i10) {
        return b10 & i10;
    }

    public static final boolean arrayRangeEquals(@NotNull byte[] a10, int i10, @NotNull byte[] b10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(a10, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        for (int i13 = 0; i13 < i12; i13++) {
            if (a10[i13 + i10] != b10[i13 + i11]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException("size=" + j10 + " offset=" + j11 + " byteCount=" + j12);
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return f86322b;
    }

    @NotNull
    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return f86321a;
    }

    public static final int leftRotate(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    public static final long minOf(long j10, int i10) {
        return Math.min(j10, i10);
    }

    @NotNull
    public static final Buffer.UnsafeCursor resolveDefaultParameter(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == f86321a ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i10) {
        return ((i10 & 255) << 24) | (((-16777216) & i10) >>> 24) | ((16711680 & i10) >>> 8) | ((65280 & i10) << 8);
    }

    public static final long rightRotate(long j10, int i10) {
        return (j10 << (64 - i10)) | (j10 >>> i10);
    }

    public static final int shl(byte b10, int i10) {
        return b10 << i10;
    }

    public static final int shr(byte b10, int i10) {
        return b10 >> i10;
    }

    @NotNull
    public static final String toHexString(byte b10) {
        return l.concatToString(new char[]{okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[b10 & 15]});
    }

    public static final byte xor(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    public static final long and(byte b10, long j10) {
        return ((long) b10) & j10;
    }

    public static final long minOf(int i10, long j10) {
        return Math.min(i10, j10);
    }

    public static final int resolveDefaultParameter(@NotNull ByteString byteString, int i10) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return i10 == f86322b ? byteString.size() : i10;
    }

    public static final long reverseBytes(long j10) {
        return ((j10 & 255) << 56) | (((-72057594037927936L) & j10) >>> 56) | ((71776119061217280L & j10) >>> 40) | ((280375465082880L & j10) >>> 24) | ((1095216660480L & j10) >>> 8) | ((4278190080L & j10) << 8) | ((16711680 & j10) << 24) | ((65280 & j10) << 40);
    }

    public static final long and(int i10, long j10) {
        return ((long) i10) & j10;
    }

    public static final int resolveDefaultParameter(@NotNull byte[] bArr, int i10) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i10 == f86322b ? bArr.length : i10;
    }

    public static final short reverseBytes(short s4) {
        return (short) (((s4 & 255) << 8) | ((65280 & s4) >>> 8));
    }

    @NotNull
    public static final String toHexString(int i10) {
        if (i10 == 0) {
            return "0";
        }
        int i11 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 28) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 24) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 20) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 16) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 12) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 8) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i10 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[i10 & 15]};
        while (i11 < 8 && cArr[i11] == '0') {
            i11++;
        }
        return l.concatToString(cArr, i11, 8);
    }

    @NotNull
    public static final String toHexString(long j10) {
        if (j10 == 0) {
            return "0";
        }
        int i10 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 60) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 56) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 52) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 48) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 44) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 40) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 36) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 32) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 28) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 24) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 20) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 16) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 12) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 8) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j10 >> 4) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j10 & 15)]};
        while (i10 < 16 && cArr[i10] == '0') {
            i10++;
        }
        return l.concatToString(cArr, i10, 16);
    }

    public static /* synthetic */ void getDEFAULT__new_UnsafeCursor$annotations() {
    }
}
