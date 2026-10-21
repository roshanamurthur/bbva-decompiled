package okhttp3.internal.http2;

import androidx.core.view.PointerIconCompat;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Huffman.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002J\u001e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/Huffman;", "", "Lokio/ByteString;", "source", "Lokio/BufferedSink;", "sink", "", "encode", "bytes", "", "encodedLength", "Lokio/BufferedSource;", "", "byteCount", "decode", "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Huffman {

    @NotNull
    public static final Huffman INSTANCE = new Huffman();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final int[] f86025a = {8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, PointerIconCompat.TYPE_TOP_RIGHT_DIAGONAL_DOUBLE_ARROW, PointerIconCompat.TYPE_TOP_LEFT_DIAGONAL_DOUBLE_ARROW, 4090, 8185, 21, 248, 2042, PointerIconCompat.TYPE_ZOOM_IN, PointerIconCompat.TYPE_ZOOM_OUT, 249, 2043, 250, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, PointerIconCompat.TYPE_GRAB, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final byte[] f86026b = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, MessageUtils.MESSAGE_30_RS, 28, 28, MessageUtils.MESSAGE_30_RS, 28, 28, 28, 28, 28, 28, 28, 28, MessageUtils.MESSAGE_30_RS, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, Constants.CVR_B1b41_1110_ONLINE_PIN, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, Constants.CVR_B1b41_1110_ONLINE_PIN, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, MessageUtils.MESSAGE_21_NAK, 22, 23, 22, 23, 23, 24, 22, MessageUtils.MESSAGE_21_NAK, 20, 22, 22, 23, 23, MessageUtils.MESSAGE_21_NAK, 23, 22, 22, 24, MessageUtils.MESSAGE_21_NAK, 22, 23, 23, MessageUtils.MESSAGE_21_NAK, MessageUtils.MESSAGE_21_NAK, 22, MessageUtils.MESSAGE_21_NAK, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_26_SUB, 20, 19, 22, 23, 22, 25, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_26_SUB, 27, 27, MessageUtils.MESSAGE_26_SUB, 24, 25, 19, MessageUtils.MESSAGE_21_NAK, MessageUtils.MESSAGE_26_SUB, 27, 27, MessageUtils.MESSAGE_26_SUB, 27, 24, MessageUtils.MESSAGE_21_NAK, MessageUtils.MESSAGE_21_NAK, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_26_SUB, 28, 27, 27, 27, 20, 24, 20, MessageUtils.MESSAGE_21_NAK, 22, MessageUtils.MESSAGE_21_NAK, MessageUtils.MESSAGE_21_NAK, 23, 22, 22, 25, 25, 24, 24, MessageUtils.MESSAGE_26_SUB, 23, MessageUtils.MESSAGE_26_SUB, 27, MessageUtils.MESSAGE_26_SUB, MessageUtils.MESSAGE_26_SUB, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, MessageUtils.MESSAGE_26_SUB};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final a f86027c = new a();

    static {
        for (int i10 = 0; i10 < 256; i10++) {
            Huffman huffman = INSTANCE;
            int i11 = f86025a[i10];
            byte b10 = f86026b[i10];
            huffman.getClass();
            a(i10, i11, b10);
        }
    }

    public static void a(int i10, int i11, int i12) {
        a aVar = new a(i10, i12);
        a aVar2 = f86027c;
        while (i12 > 8) {
            i12 -= 8;
            int i13 = (i11 >>> i12) & 255;
            a[] aVarArr = aVar2.f86028a;
            Intrinsics.checkNotNull(aVarArr);
            a aVar3 = aVarArr[i13];
            if (aVar3 == null) {
                aVar3 = new a();
                aVarArr[i13] = aVar3;
            }
            aVar2 = aVar3;
        }
        int i14 = 8 - i12;
        int i15 = (i11 << i14) & 255;
        a[] aVarArr2 = aVar2.f86028a;
        Intrinsics.checkNotNull(aVarArr2);
        ArraysKt___ArraysJvmKt.fill(aVarArr2, aVar, i15, (1 << i14) + i15);
    }

    public final void decode(@NotNull BufferedSource source, long byteCount, @NotNull BufferedSink sink) throws IOException {
        int i10;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        a aVar = f86027c;
        int iAnd = 0;
        a aVar2 = aVar;
        int i11 = 0;
        for (long j10 = 0; j10 < byteCount; j10++) {
            iAnd = (iAnd << 8) | Util.and(source.readByte(), 255);
            i11 += 8;
            while (i11 >= 8) {
                a[] aVarArr = aVar2.f86028a;
                Intrinsics.checkNotNull(aVarArr);
                aVar2 = aVarArr[(iAnd >>> (i11 - 8)) & 255];
                Intrinsics.checkNotNull(aVar2);
                if (aVar2.f86028a == null) {
                    sink.writeByte(aVar2.f86029b);
                    i11 -= aVar2.f86030c;
                    aVar2 = aVar;
                } else {
                    i11 -= 8;
                }
            }
        }
        while (i11 > 0) {
            a[] aVarArr2 = aVar2.f86028a;
            Intrinsics.checkNotNull(aVarArr2);
            a aVar3 = aVarArr2[(iAnd << (8 - i11)) & 255];
            Intrinsics.checkNotNull(aVar3);
            if (aVar3.f86028a != null || (i10 = aVar3.f86030c) > i11) {
                return;
            }
            sink.writeByte(aVar3.f86029b);
            i11 -= i10;
            aVar2 = aVar;
        }
    }

    public final void encode(@NotNull ByteString source, @NotNull BufferedSink sink) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(sink, "sink");
        int size = source.size();
        long j10 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            int iAnd = Util.and(source.getByte(i11), 255);
            int i12 = f86025a[iAnd];
            byte b10 = f86026b[iAnd];
            j10 = (j10 << b10) | ((long) i12);
            i10 += b10;
            while (i10 >= 8) {
                i10 -= 8;
                sink.writeByte((int) (j10 >> i10));
            }
        }
        if (i10 > 0) {
            sink.writeByte((int) ((j10 << (8 - i10)) | (255 >>> i10)));
        }
    }

    public final int encodedLength(@NotNull ByteString bytes) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        int size = bytes.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            j10 += (long) f86026b[Util.and(bytes.getByte(i10), 255)];
        }
        return (int) ((j10 + ((long) 7)) >> 3);
    }

    /* JADX INFO: compiled from: Huffman.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final a[] f86028a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f86029b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f86030c;

        public a() {
            this.f86028a = new a[256];
            this.f86029b = 0;
            this.f86030c = 0;
        }

        public a(int i10, int i11) {
            this.f86028a = null;
            this.f86029b = i10;
            int i12 = i11 & 7;
            this.f86030c = i12 == 0 ? 8 : i12;
        }
    }
}
