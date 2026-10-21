package okhttp3.internal.http2;

import androidx.appcompat.widget.g0;
import androidx.webkit.ProxyConfig;
import com.bbva.component.dm.headers.EtagInterceptor;
import com.bbva.tohu.android.core.response.Result;
import com.bbva.tohu.android.core.response.backend.aso.AsoResponse;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.google.firebase.dynamiclinks.DynamicLink;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.ipsoft.amelia.sdk.internal.c.c;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Hpack.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR#\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lokhttp3/internal/http2/Hpack;", "", "Lokio/ByteString;", "name", "checkLowercase", "", "Lokhttp3/internal/http2/Header;", "a", "[Lokhttp3/internal/http2/Header;", "getSTATIC_HEADER_TABLE", "()[Lokhttp3/internal/http2/Header;", "STATIC_HEADER_TABLE", "", "", "b", "Ljava/util/Map;", "getNAME_TO_FIRST_INDEX", "()Ljava/util/Map;", "NAME_TO_FIRST_INDEX", "<init>", "()V", "Reader", "Writer", "okhttp"}, k = 1, mv = {1, 8, 0})
public final class Hpack {

    @NotNull
    public static final Hpack INSTANCE = new Hpack();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Header[] STATIC_HEADER_TABLE;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Map<ByteString, Integer> NAME_TO_FIRST_INDEX;

    /* JADX INFO: compiled from: Hpack.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\fR\u001e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/http2/Hpack$Reader;", "", "", "Lokhttp3/internal/http2/Header;", "getAndResetHeaderList", "", "maxDynamicTableByteCount", "", "readHeaders", "firstByte", "prefixMask", "readInt", "Lokio/ByteString;", "readByteString", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "headerCount", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "dynamicTableByteCount", "Lokio/Source;", "source", "headerTableSizeSetting", "<init>", "(Lokio/Source;II)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f85912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f85913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final ArrayList f85914c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NotNull
        public final BufferedSource f85915d;

        @JvmField
        @NotNull
        public Header[] dynamicTable;

        @JvmField
        public int dynamicTableByteCount;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f85916e;

        @JvmField
        public int headerCount;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Reader(@NotNull Source source, int i10) {
            this(source, i10, 0, 4, null);
            Intrinsics.checkNotNullParameter(source, "source");
        }

        public final int a(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.dynamicTable.length;
                while (true) {
                    length--;
                    i11 = this.f85916e;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header);
                    int i13 = header.hpackSize;
                    i10 -= i13;
                    this.dynamicTableByteCount -= i13;
                    this.headerCount--;
                    i12++;
                }
                Header[] headerArr = this.dynamicTable;
                System.arraycopy(headerArr, i11 + 1, headerArr, i11 + 1 + i12, this.headerCount);
                this.f85916e += i12;
            }
            return i12;
        }

        public final ByteString b(int i10) throws IOException {
            if (i10 >= 0) {
                Hpack hpack = Hpack.INSTANCE;
                if (i10 <= hpack.getSTATIC_HEADER_TABLE().length - 1) {
                    return hpack.getSTATIC_HEADER_TABLE()[i10].name;
                }
            }
            int length = this.f85916e + 1 + (i10 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
            if (length >= 0) {
                Header[] headerArr = this.dynamicTable;
                if (length < headerArr.length) {
                    Header header = headerArr[length];
                    Intrinsics.checkNotNull(header);
                    return header.name;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        public final void c(Header header) {
            this.f85914c.add(header);
            int i10 = header.hpackSize;
            int i11 = this.f85913b;
            if (i10 > i11) {
                ArraysKt___ArraysJvmKt.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
                this.f85916e = this.dynamicTable.length - 1;
                this.headerCount = 0;
                this.dynamicTableByteCount = 0;
                return;
            }
            a((this.dynamicTableByteCount + i10) - i11);
            int i12 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f85916e = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i13 = this.f85916e;
            this.f85916e = i13 - 1;
            this.dynamicTable[i13] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i10;
        }

        @NotNull
        public final List<Header> getAndResetHeaderList() {
            ArrayList arrayList = this.f85914c;
            List<Header> list = CollectionsKt___CollectionsKt.toList(arrayList);
            arrayList.clear();
            return list;
        }

        /* JADX INFO: renamed from: maxDynamicTableByteCount, reason: from getter */
        public final int getF85913b() {
            return this.f85913b;
        }

        @NotNull
        public final ByteString readByteString() throws IOException {
            BufferedSource bufferedSource = this.f85915d;
            int iAnd = Util.and(bufferedSource.readByte(), 255);
            boolean z10 = (iAnd & 128) == 128;
            long j10 = readInt(iAnd, 127);
            if (!z10) {
                return bufferedSource.readByteString(j10);
            }
            Buffer buffer = new Buffer();
            Huffman.INSTANCE.decode(bufferedSource, j10, buffer);
            return buffer.readByteString();
        }

        public final void readHeaders() throws IOException {
            while (true) {
                BufferedSource bufferedSource = this.f85915d;
                if (bufferedSource.exhausted()) {
                    return;
                }
                int iAnd = Util.and(bufferedSource.readByte(), 255);
                if (iAnd == 128) {
                    throw new IOException("index == 0");
                }
                int i10 = iAnd & 128;
                ArrayList arrayList = this.f85914c;
                if (i10 == 128) {
                    int i11 = readInt(iAnd, 127);
                    int i12 = i11 - 1;
                    if (i12 >= 0) {
                        Hpack hpack = Hpack.INSTANCE;
                        if (i12 <= hpack.getSTATIC_HEADER_TABLE().length - 1) {
                            arrayList.add(hpack.getSTATIC_HEADER_TABLE()[i12]);
                        }
                    }
                    int length = this.f85916e + 1 + (i12 - Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length);
                    if (length >= 0) {
                        Header[] headerArr = this.dynamicTable;
                        if (length < headerArr.length) {
                            Header header = headerArr[length];
                            Intrinsics.checkNotNull(header);
                            arrayList.add(header);
                        }
                    }
                    throw new IOException(g0.c("Header index too large ", i11));
                }
                if (iAnd == 64) {
                    c(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
                } else if ((iAnd & 64) == 64) {
                    c(new Header(b(readInt(iAnd, 63) - 1), readByteString()));
                } else if ((iAnd & 32) == 32) {
                    int i13 = readInt(iAnd, 31);
                    this.f85913b = i13;
                    if (i13 < 0 || i13 > this.f85912a) {
                        throw new IOException("Invalid dynamic table size update " + this.f85913b);
                    }
                    int i14 = this.dynamicTableByteCount;
                    if (i13 < i14) {
                        if (i13 == 0) {
                            ArraysKt___ArraysJvmKt.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
                            this.f85916e = this.dynamicTable.length - 1;
                            this.headerCount = 0;
                            this.dynamicTableByteCount = 0;
                        } else {
                            a(i14 - i13);
                        }
                    }
                } else if (iAnd == 16 || iAnd == 0) {
                    arrayList.add(new Header(Hpack.INSTANCE.checkLowercase(readByteString()), readByteString()));
                } else {
                    arrayList.add(new Header(b(readInt(iAnd, 15) - 1), readByteString()));
                }
            }
        }

        public final int readInt(int firstByte, int prefixMask) throws IOException {
            int i10 = firstByte & prefixMask;
            if (i10 < prefixMask) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int iAnd = Util.and(this.f85915d.readByte(), 255);
                if ((iAnd & 128) == 0) {
                    return prefixMask + (iAnd << i11);
                }
                prefixMask += (iAnd & 127) << i11;
                i11 += 7;
            }
        }

        @JvmOverloads
        public Reader(@NotNull Source source, int i10, int i11) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f85912a = i10;
            this.f85913b = i11;
            this.f85914c = new ArrayList();
            this.f85915d = Okio.buffer(source);
            this.dynamicTable = new Header[8];
            this.f85916e = 7;
        }

        public /* synthetic */ Reader(Source source, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(source, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    /* JADX INFO: compiled from: Hpack.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0007R\u0016\u0010\u000f\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0011¨\u0006\u001e"}, d2 = {"Lokhttp3/internal/http2/Hpack$Writer;", "", "", "Lokhttp3/internal/http2/Header;", "headerBlock", "", "writeHeaders", "", "value", "prefixMask", "bits", "writeInt", "Lokio/ByteString;", "data", "writeByteString", "headerTableSizeSetting", "resizeHeaderTable", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "maxDynamicTableByteCount", "", "dynamicTable", "[Lokhttp3/internal/http2/Header;", "headerCount", "dynamicTableByteCount", "", "useCompression", "Lokio/Buffer;", "out", "<init>", "(IZLokio/Buffer;)V", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f85917a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Buffer f85918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f85919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f85920d;

        @JvmField
        @NotNull
        public Header[] dynamicTable;

        @JvmField
        public int dynamicTableByteCount;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f85921e;

        @JvmField
        public int headerCount;

        @JvmField
        public int headerTableSizeSetting;

        @JvmField
        public int maxDynamicTableByteCount;

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Writer(int i10, @NotNull Buffer out) {
            this(i10, false, out, 2, null);
            Intrinsics.checkNotNullParameter(out, "out");
        }

        public final void a(int i10) {
            int i11;
            if (i10 > 0) {
                int length = this.dynamicTable.length - 1;
                int i12 = 0;
                while (true) {
                    i11 = this.f85921e;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    Header header = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header);
                    i10 -= header.hpackSize;
                    int i13 = this.dynamicTableByteCount;
                    Header header2 = this.dynamicTable[length];
                    Intrinsics.checkNotNull(header2);
                    this.dynamicTableByteCount = i13 - header2.hpackSize;
                    this.headerCount--;
                    i12++;
                    length--;
                }
                Header[] headerArr = this.dynamicTable;
                int i14 = i11 + 1;
                System.arraycopy(headerArr, i14, headerArr, i14 + i12, this.headerCount);
                Header[] headerArr2 = this.dynamicTable;
                int i15 = this.f85921e + 1;
                Arrays.fill(headerArr2, i15, i15 + i12, (Object) null);
                this.f85921e += i12;
            }
        }

        public final void b(Header header) {
            int i10 = header.hpackSize;
            int i11 = this.maxDynamicTableByteCount;
            if (i10 > i11) {
                ArraysKt___ArraysJvmKt.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
                this.f85921e = this.dynamicTable.length - 1;
                this.headerCount = 0;
                this.dynamicTableByteCount = 0;
                return;
            }
            a((this.dynamicTableByteCount + i10) - i11);
            int i12 = this.headerCount + 1;
            Header[] headerArr = this.dynamicTable;
            if (i12 > headerArr.length) {
                Header[] headerArr2 = new Header[headerArr.length * 2];
                System.arraycopy(headerArr, 0, headerArr2, headerArr.length, headerArr.length);
                this.f85921e = this.dynamicTable.length - 1;
                this.dynamicTable = headerArr2;
            }
            int i13 = this.f85921e;
            this.f85921e = i13 - 1;
            this.dynamicTable[i13] = header;
            this.headerCount++;
            this.dynamicTableByteCount += i10;
        }

        public final void resizeHeaderTable(int headerTableSizeSetting) {
            this.headerTableSizeSetting = headerTableSizeSetting;
            int iMin = Math.min(headerTableSizeSetting, 16384);
            int i10 = this.maxDynamicTableByteCount;
            if (i10 == iMin) {
                return;
            }
            if (iMin < i10) {
                this.f85919c = Math.min(this.f85919c, iMin);
            }
            this.f85920d = true;
            this.maxDynamicTableByteCount = iMin;
            int i11 = this.dynamicTableByteCount;
            if (iMin < i11) {
                if (iMin != 0) {
                    a(i11 - iMin);
                    return;
                }
                ArraysKt___ArraysJvmKt.fill$default(this.dynamicTable, (Object) null, 0, 0, 6, (Object) null);
                this.f85921e = this.dynamicTable.length - 1;
                this.headerCount = 0;
                this.dynamicTableByteCount = 0;
            }
        }

        public final void writeByteString(@NotNull ByteString data) throws IOException {
            Intrinsics.checkNotNullParameter(data, "data");
            boolean z10 = this.f85917a;
            Buffer buffer = this.f85918b;
            if (z10) {
                Huffman huffman = Huffman.INSTANCE;
                if (huffman.encodedLength(data) < data.size()) {
                    Buffer buffer2 = new Buffer();
                    huffman.encode(data, buffer2);
                    ByteString byteString = buffer2.readByteString();
                    writeInt(byteString.size(), 127, 128);
                    buffer.write(byteString);
                    return;
                }
            }
            writeInt(data.size(), 127, 0);
            buffer.write(data);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0077  */
        public final void writeHeaders(@NotNull List<Header> headerBlock) throws IOException {
            int length;
            int length2;
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f85920d) {
                int i10 = this.f85919c;
                if (i10 < this.maxDynamicTableByteCount) {
                    writeInt(i10, 31, 32);
                }
                this.f85920d = false;
                this.f85919c = Integer.MAX_VALUE;
                writeInt(this.maxDynamicTableByteCount, 31, 32);
            }
            int size = headerBlock.size();
            for (int i11 = 0; i11 < size; i11++) {
                Header header = headerBlock.get(i11);
                ByteString asciiLowercase = header.name.toAsciiLowercase();
                ByteString byteString = header.value;
                Hpack hpack = Hpack.INSTANCE;
                Integer num = hpack.getNAME_TO_FIRST_INDEX().get(asciiLowercase);
                if (num != null) {
                    int iIntValue = num.intValue();
                    length2 = iIntValue + 1;
                    if (2 > length2 || length2 >= 8) {
                        length = length2;
                        length2 = -1;
                    } else if (Intrinsics.areEqual(hpack.getSTATIC_HEADER_TABLE()[iIntValue].value, byteString)) {
                        length = length2;
                    } else if (Intrinsics.areEqual(hpack.getSTATIC_HEADER_TABLE()[length2].value, byteString)) {
                        length = length2;
                        length2 = iIntValue + 2;
                    } else {
                        length = length2;
                        length2 = -1;
                    }
                } else {
                    length = -1;
                    length2 = -1;
                }
                if (length2 == -1) {
                    int length3 = this.dynamicTable.length;
                    for (int i12 = this.f85921e + 1; i12 < length3; i12++) {
                        Header header2 = this.dynamicTable[i12];
                        Intrinsics.checkNotNull(header2);
                        if (Intrinsics.areEqual(header2.name, asciiLowercase)) {
                            Header header3 = this.dynamicTable[i12];
                            Intrinsics.checkNotNull(header3);
                            if (Intrinsics.areEqual(header3.value, byteString)) {
                                length2 = Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length + (i12 - this.f85921e);
                                break;
                            } else if (length == -1) {
                                length = (i12 - this.f85921e) + Hpack.INSTANCE.getSTATIC_HEADER_TABLE().length;
                            }
                        }
                    }
                }
                if (length2 != -1) {
                    writeInt(length2, 127, 128);
                } else if (length == -1) {
                    this.f85918b.writeByte(64);
                    writeByteString(asciiLowercase);
                    writeByteString(byteString);
                    b(header);
                } else if (!asciiLowercase.startsWith(Header.PSEUDO_PREFIX) || Intrinsics.areEqual(Header.TARGET_AUTHORITY, asciiLowercase)) {
                    writeInt(length, 63, 64);
                    writeByteString(byteString);
                    b(header);
                } else {
                    writeInt(length, 15, 0);
                    writeByteString(byteString);
                }
            }
        }

        public final void writeInt(int value, int prefixMask, int bits) {
            Buffer buffer = this.f85918b;
            if (value < prefixMask) {
                buffer.writeByte(value | bits);
                return;
            }
            buffer.writeByte(bits | prefixMask);
            int i10 = value - prefixMask;
            while (i10 >= 128) {
                buffer.writeByte(128 | (i10 & 127));
                i10 >>>= 7;
            }
            buffer.writeByte(i10);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @JvmOverloads
        public Writer(@NotNull Buffer out) {
            this(0, false, out, 3, null);
            Intrinsics.checkNotNullParameter(out, "out");
        }

        @JvmOverloads
        public Writer(int i10, boolean z10, @NotNull Buffer out) {
            Intrinsics.checkNotNullParameter(out, "out");
            this.headerTableSizeSetting = i10;
            this.f85917a = z10;
            this.f85918b = out;
            this.f85919c = Integer.MAX_VALUE;
            this.maxDynamicTableByteCount = i10;
            Header[] headerArr = new Header[8];
            this.dynamicTable = headerArr;
            this.f85921e = headerArr.length - 1;
        }

        public /* synthetic */ Writer(int i10, boolean z10, Buffer buffer, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, buffer);
        }
    }

    static {
        Header header = new Header(Header.TARGET_AUTHORITY, "");
        ByteString byteString = Header.TARGET_METHOD;
        ByteString byteString2 = Header.TARGET_PATH;
        ByteString byteString3 = Header.TARGET_SCHEME;
        ByteString byteString4 = Header.RESPONSE_STATUS;
        Header[] headerArr = {header, new Header(byteString, "GET"), new Header(byteString, "POST"), new Header(byteString2, "/"), new Header(byteString2, "/index.html"), new Header(byteString3, ProxyConfig.MATCH_HTTP), new Header(byteString3, ProxyConfig.MATCH_HTTPS), new Header(byteString4, Result.OK_RESPONSE_CODE), new Header(byteString4, "204"), new Header(byteString4, "206"), new Header(byteString4, "304"), new Header(byteString4, "400"), new Header(byteString4, AsoResponse.ERROR_TYPE_TOKEN_INCORRECT), new Header(byteString4, Result.INTERNAL_ERROR_RESPONSE_CODE), new Header("accept-charset", ""), new Header("accept-encoding", "gzip, deflate"), new Header("accept-language", ""), new Header("accept-ranges", ""), new Header("accept", ""), new Header("access-control-allow-origin", ""), new Header("age", ""), new Header("allow", ""), new Header("authorization", ""), new Header("cache-control", ""), new Header("content-disposition", ""), new Header("content-encoding", ""), new Header("content-language", ""), new Header(c.f84797b, ""), new Header("content-location", ""), new Header("content-range", ""), new Header(c.f84798c, ""), new Header("cookie", ""), new Header("date", ""), new Header(EtagInterceptor.HEADER_ETAG, ""), new Header("expect", ""), new Header("expires", ""), new Header("from", ""), new Header("host", ""), new Header("if-match", ""), new Header("if-modified-since", ""), new Header("if-none-match", ""), new Header("if-range", ""), new Header("if-unmodified-since", ""), new Header("last-modified", ""), new Header(DynamicLink.Builder.KEY_LINK, ""), new Header("location", ""), new Header("max-forwards", ""), new Header("proxy-authenticate", ""), new Header("proxy-authorization", ""), new Header("range", ""), new Header("referer", ""), new Header("refresh", ""), new Header("retry-after", ""), new Header("server", ""), new Header("set-cookie", ""), new Header("strict-transport-security", ""), new Header("transfer-encoding", ""), new Header("user-agent", ""), new Header("vary", ""), new Header("via", ""), new Header("www-authenticate", "")};
        STATIC_HEADER_TABLE = headerArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(headerArr.length);
        int length = headerArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (!linkedHashMap.containsKey(headerArr[i10].name)) {
                linkedHashMap.put(headerArr[i10].name, Integer.valueOf(i10));
            }
        }
        Map<ByteString, Integer> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(result)");
        NAME_TO_FIRST_INDEX = mapUnmodifiableMap;
    }

    @NotNull
    public final ByteString checkLowercase(@NotNull ByteString name) throws IOException {
        Intrinsics.checkNotNullParameter(name, "name");
        int size = name.size();
        for (int i10 = 0; i10 < size; i10++) {
            byte b10 = name.getByte(i10);
            if (65 <= b10 && b10 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + name.utf8());
            }
        }
        return name;
    }

    @NotNull
    public final Map<ByteString, Integer> getNAME_TO_FIRST_INDEX() {
        return NAME_TO_FIRST_INDEX;
    }

    @NotNull
    public final Header[] getSTATIC_HEADER_TABLE() {
        return STATIC_HEADER_TABLE;
    }
}
