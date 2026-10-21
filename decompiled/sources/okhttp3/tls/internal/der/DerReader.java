package okhttp3.tls.internal.der;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.io.IOException;
import java.math.BigInteger;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DerReader.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0002,-B\u000f\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000f\u0010\b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\fH\u0080\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0002J\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0018\u001a\u00020\u0017J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\nJ\u0006\u0010\u001e\u001a\u00020\nJ\u0006\u0010\u001f\u001a\u00020\nJ\u0006\u0010 \u001a\u00020\u001bJ\b\u0010!\u001a\u00020\nH\u0016R(\u0010'\u001a\u0004\u0018\u00010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u00018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006."}, d2 = {"Lokhttp3/tls/internal/der/DerReader;", "", "", "hasNext", "Lokhttp3/tls/internal/der/DerHeader;", "peekHeader", "readHeader$okhttp_tls", "()Lokhttp3/tls/internal/der/DerHeader;", "readHeader", ExifInterface.GPS_DIRECTION_TRUE, "", "name", "Lkotlin/Function1;", "block", "read$okhttp_tls", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "read", "Lkotlin/Function0;", "withTypeHint", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "readBoolean", "Ljava/math/BigInteger;", "readBigInteger", "", "readLong", "Lokhttp3/tls/internal/der/BitString;", "readBitString", "Lokio/ByteString;", "readOctetString", "readUtf8String", "readObjectIdentifier", "readRelativeObjectIdentifier", "readUnknown", "toString", "value", "getTypeHint", "()Ljava/lang/Object;", "setTypeHint", "(Ljava/lang/Object;)V", "typeHint", "Lokio/Source;", "source", "<init>", "(Lokio/Source;)V", "Companion", "a", "okhttp-tls"}, k = 1, mv = {1, 4, 0})
public final class DerReader {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final DerHeader f86284h = new DerHeader(0, 0, false, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f86285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BufferedSource f86286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f86287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f86288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f86289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f86290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public DerHeader f86291g;

    /* JADX INFO: compiled from: DerReader.kt */
    public static final class a extends ForwardingSource {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f86292q0;

        @Override // okio.ForwardingSource, okio.Source
        public final long read(@NotNull Buffer sink, long j10) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j11 = delegate().read(sink, j10);
            if (j11 == -1) {
                return -1L;
            }
            this.f86292q0 += j11;
            return j11;
        }
    }

    public DerReader(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(source, "source");
        a aVar = new a(source);
        this.f86285a = aVar;
        this.f86286b = Okio.buffer(aVar);
        this.f86287c = -1L;
        this.f86288d = new ArrayList();
        this.f86289e = new ArrayList();
    }

    public final long a() {
        return this.f86285a.f86292q0 - this.f86286b.getBuffer().size();
    }

    public final long b() {
        long j10 = this.f86287c;
        if (j10 == -1) {
            return -1L;
        }
        return j10 - a();
    }

    public final long c() {
        long j10 = 0;
        while (true) {
            long j11 = this.f86286b.readByte();
            long j12 = 255 & j11;
            if ((j11 & 128) != 128) {
                return j10 + j12;
            }
            j10 = (j10 + (j11 & 127)) << 7;
        }
    }

    @Nullable
    public final Object getTypeHint() {
        return CollectionsKt___CollectionsKt.lastOrNull((List) this.f86288d);
    }

    public final boolean hasNext() {
        return peekHeader() != null;
    }

    @Nullable
    public final DerHeader peekHeader() throws IOException {
        DerHeader header$okhttp_tls = this.f86291g;
        if (header$okhttp_tls == null) {
            header$okhttp_tls = readHeader$okhttp_tls();
            this.f86291g = header$okhttp_tls;
        }
        if (header$okhttp_tls.isEndOfData()) {
            return null;
        }
        return header$okhttp_tls;
    }

    public final <T> T read$okhttp_tls(@Nullable String name, @NotNull Function1<? super DerHeader, ? extends T> block) throws ProtocolException {
        long length;
        Intrinsics.checkNotNullParameter(block, "block");
        if (!hasNext()) {
            throw new ProtocolException("expected a value");
        }
        DerHeader derHeader = this.f86291g;
        Intrinsics.checkNotNull(derHeader);
        this.f86291g = null;
        long j10 = this.f86287c;
        boolean z10 = this.f86290f;
        if (derHeader.getLength() != -1) {
            length = derHeader.getLength() + a();
        } else {
            length = -1;
        }
        if (j10 != -1 && length > j10) {
            throw new ProtocolException("enclosed object too large");
        }
        this.f86287c = length;
        this.f86290f = derHeader.getConstructed();
        if (name != null) {
            this.f86289e.add(name);
        }
        try {
            T tInvoke = block.invoke(derHeader);
            if (length != -1 && a() > length) {
                throw new ProtocolException("unexpected byte count at " + this);
            }
            InlineMarker.finallyStart(1);
            this.f86291g = null;
            this.f86287c = j10;
            this.f86290f = z10;
            if (name != null) {
                this.f86289e.remove(this.f86289e.size() - 1);
            }
            InlineMarker.finallyEnd(1);
            return tInvoke;
        } catch (Throwable th2) {
            InlineMarker.finallyStart(1);
            this.f86291g = null;
            this.f86287c = j10;
            this.f86290f = z10;
            if (name != null) {
                this.f86289e.remove(this.f86289e.size() - 1);
            }
            InlineMarker.finallyEnd(1);
            throw th2;
        }
    }

    @NotNull
    public final BigInteger readBigInteger() throws ProtocolException {
        if (b() != 0) {
            return new BigInteger(this.f86286b.readByteArray(b()));
        }
        throw new ProtocolException("unexpected length: " + b() + " at " + this);
    }

    @NotNull
    public final BitString readBitString() throws ProtocolException {
        if (b() == -1 || this.f86290f) {
            throw new ProtocolException("constructed bit strings not supported for DER");
        }
        if (b() < 1) {
            throw new ProtocolException("malformed bit string");
        }
        BufferedSource bufferedSource = this.f86286b;
        return new BitString(bufferedSource.readByteString(b()), bufferedSource.readByte() & 255);
    }

    public final boolean readBoolean() throws ProtocolException {
        if (b() == 1) {
            return this.f86286b.readByte() != 0;
        }
        throw new ProtocolException("unexpected length: " + b() + " at " + this);
    }

    @NotNull
    public final DerHeader readHeader$okhttp_tls() throws IOException {
        long j10;
        if (!(this.f86291g == null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        long jA = a();
        long j11 = this.f86287c;
        DerHeader derHeader = f86284h;
        if (jA == j11) {
            return derHeader;
        }
        BufferedSource bufferedSource = this.f86286b;
        if (j11 == -1 && bufferedSource.exhausted()) {
            return derHeader;
        }
        byte b10 = bufferedSource.readByte();
        int i10 = b10 & Constants.CVR_B2b87_11_RFU;
        boolean z10 = (b10 & 32) == 32;
        int i11 = b10 & 31;
        long jC = i11 != 31 ? i11 : c();
        byte b11 = bufferedSource.readByte();
        if ((b11 & 255) == 128) {
            throw new ProtocolException("indefinite length not permitted for DER");
        }
        if ((b11 & 128) == 128) {
            int i12 = b11 & 127;
            if (i12 > 8) {
                throw new ProtocolException("length encoded with more than 8 bytes is not supported");
            }
            long j12 = bufferedSource.readByte();
            long j13 = 255 & j12;
            if (j13 == 0 || (i12 == 1 && (j12 & 128) == 0)) {
                throw new ProtocolException("invalid encoding for length");
            }
            for (int i13 = 1; i13 < i12; i13++) {
                j13 = ((long) (bufferedSource.readByte() & 255)) + (j13 << 8);
            }
            if (j13 < 0) {
                throw new ProtocolException("length > Long.MAX_VALUE");
            }
            j10 = j13;
        } else {
            j10 = b11 & 127;
        }
        return new DerHeader(i10, jC, z10, j10);
    }

    public final long readLong() throws ProtocolException {
        long j10 = 8;
        long jB = b();
        if (1 > jB || j10 < jB) {
            throw new ProtocolException("unexpected length: " + b() + " at " + this);
        }
        BufferedSource bufferedSource = this.f86286b;
        long j11 = bufferedSource.readByte();
        while (a() < this.f86287c) {
            j11 = (j11 << 8) + ((long) (bufferedSource.readByte() & 255));
        }
        return j11;
    }

    @NotNull
    public final String readObjectIdentifier() {
        Buffer buffer = new Buffer();
        byte b10 = (byte) 46;
        long jC = c();
        if (0 <= jC && 40 > jC) {
            buffer.writeDecimalLong(0L);
            buffer.writeByte((int) b10);
            buffer.writeDecimalLong(jC);
        } else if (40 <= jC && 80 > jC) {
            buffer.writeDecimalLong(1L);
            buffer.writeByte((int) b10);
            buffer.writeDecimalLong(jC - 40);
        } else {
            buffer.writeDecimalLong(2L);
            buffer.writeByte((int) b10);
            buffer.writeDecimalLong(jC - 80);
        }
        while (a() < this.f86287c) {
            buffer.writeByte((int) b10);
            buffer.writeDecimalLong(c());
        }
        return buffer.readUtf8();
    }

    @NotNull
    public final ByteString readOctetString() throws ProtocolException {
        if (b() == -1 || this.f86290f) {
            throw new ProtocolException("constructed octet strings not supported for DER");
        }
        return this.f86286b.readByteString(b());
    }

    @NotNull
    public final String readRelativeObjectIdentifier() {
        Buffer buffer = new Buffer();
        byte b10 = (byte) 46;
        while (a() < this.f86287c) {
            if (buffer.size() > 0) {
                buffer.writeByte((int) b10);
            }
            buffer.writeDecimalLong(c());
        }
        return buffer.readUtf8();
    }

    @NotNull
    public final ByteString readUnknown() {
        return this.f86286b.readByteString(b());
    }

    @NotNull
    public final String readUtf8String() throws ProtocolException {
        if (b() == -1 || this.f86290f) {
            throw new ProtocolException("constructed strings not supported for DER");
        }
        return this.f86286b.readUtf8(b());
    }

    public final void setTypeHint(@Nullable Object obj) {
        ArrayList arrayList = this.f86288d;
        arrayList.set(arrayList.size() - 1, obj);
    }

    @NotNull
    public String toString() {
        return CollectionsKt___CollectionsKt.joinToString$default(this.f86289e, " / ", null, null, 0, null, null, 62, null);
    }

    public final <T> T withTypeHint(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        ArrayList arrayList = this.f86288d;
        arrayList.add(null);
        try {
            return block.invoke();
        } finally {
            arrayList.remove(arrayList.size() - 1);
        }
    }
}
