package okio;

import ai.a;
import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.tokencompat.storage.local.UUIDPreferences;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GzipSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"Lokio/GzipSource;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "", HearingDisabilitiesConstants.CLOSE_MODAL, "source", "<init>", "(Lokio/Source;)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGzipSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 RealBufferedSource.kt\nokio/RealBufferedSource\n+ 4 GzipSource.kt\nokio/-GzipSourceExtensions\n+ 5 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,220:1\n1#2:221\n62#3:222\n62#3:224\n62#3:226\n62#3:227\n62#3:228\n62#3:230\n62#3:232\n202#4:223\n202#4:225\n202#4:229\n202#4:231\n89#5:233\n*S KotlinDebug\n*F\n+ 1 GzipSource.kt\nokio/GzipSource\n*L\n105#1:222\n107#1:224\n119#1:226\n120#1:227\n122#1:228\n133#1:230\n144#1:232\n106#1:223\n117#1:225\n130#1:229\n141#1:231\n187#1:233\n*E\n"})
public final class GzipSource implements Source {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public byte f86383p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final RealBufferedSource f86384q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Inflater f86385r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final InflaterSource f86386s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final CRC32 f86387t0;

    public GzipSource(@NotNull Source source) {
        Intrinsics.checkNotNullParameter(source, "source");
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.f86384q0 = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.f86385r0 = inflater;
        this.f86386s0 = new InflaterSource((BufferedSource) realBufferedSource, inflater);
        this.f86387t0 = new CRC32();
    }

    public static void a(int i10, int i11, String str) throws IOException {
        if (i11 != i10) {
            throw new IOException(a.i(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3, "%s: actual 0x%08x != expected 0x%08x", "format(this, *args)"));
        }
    }

    public final void b(long j10, Buffer buffer, long j11) {
        Segment segment = buffer.head;
        Intrinsics.checkNotNull(segment);
        while (true) {
            int i10 = segment.limit;
            int i11 = segment.pos;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) segment.pos) + j10);
            int iMin = (int) Math.min(segment.limit - i12, j11);
            this.f86387t0.update(segment.data, i12, iMin);
            j11 -= (long) iMin;
            segment = segment.next;
            Intrinsics.checkNotNull(segment);
            j10 = 0;
        }
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f86386s0.close();
    }

    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: okio.RealBufferedSource
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r14v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 ??, new type: okio.RealBufferedSource
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v0 okio.RealBufferedSource, new type: okio.RealBufferedSource
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 5 more
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // okio.Source
    public long read(@NotNull Buffer sink, long byteCount) throws IOException {
        long j10;
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(v.c("byteCount < 0: ", byteCount).toString());
        }
        if (byteCount == 0) {
            return 0L;
        }
        byte b10 = this.f86383p0;
        CRC32 crc32 = this.f86387t0;
        RealBufferedSource realBufferedSource = this.f86384q0;
        if (b10 == 0) {
            realBufferedSource.require(10L);
            byte b11 = realBufferedSource.bufferField.getByte(3L);
            boolean z10 = ((b11 >> 1) & 1) == 1;
            if (z10) {
                b(0L, realBufferedSource.bufferField, 10L);
            }
            a(8075, realBufferedSource.readShort(), "ID1ID2");
            realBufferedSource.skip(8L);
            if (((b11 >> 2) & 1) == 1) {
                realBufferedSource.require(2L);
                if (z10) {
                    b(0L, realBufferedSource.bufferField, 2L);
                }
                long shortLe = realBufferedSource.bufferField.readShortLe() & UShort.MAX_VALUE;
                realBufferedSource.require(shortLe);
                if (z10) {
                    b(0L, realBufferedSource.bufferField, shortLe);
                    j10 = shortLe;
                } else {
                    j10 = shortLe;
                }
                realBufferedSource.skip(j10);
            }
            if (((b11 >> 3) & 1) == 1) {
                long jIndexOf = realBufferedSource.indexOf((byte) 0);
                if (jIndexOf == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    b(0L, realBufferedSource.bufferField, jIndexOf + 1);
                }
                realBufferedSource.skip(jIndexOf + 1);
            }
            if (((b11 >> 4) & 1) == 1) {
                long jIndexOf2 = realBufferedSource.indexOf((byte) r4);
                if (jIndexOf2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    b(0L, realBufferedSource.bufferField, jIndexOf2 + 1);
                }
                realBufferedSource.skip(jIndexOf2 + 1);
            }
            if (z10) {
                a(realBufferedSource.readShortLe(), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            this.f86383p0 = (byte) 1;
        }
        if (this.f86383p0 == 1) {
            long size = sink.size();
            long j11 = this.f86386s0.read(sink, byteCount);
            if (j11 != -1) {
                b(size, sink, j11);
                return j11;
            }
            this.f86383p0 = (byte) 2;
        }
        if (this.f86383p0 != 2) {
            return -1L;
        }
        a(realBufferedSource.readIntLe(), (int) crc32.getValue(), UUIDPreferences.CRC_KEY);
        a(realBufferedSource.readIntLe(), (int) this.f86385r0.getBytesWritten(), "ISIZE");
        this.f86383p0 = (byte) 3;
        if (realBufferedSource.exhausted()) {
            return -1L;
        }
        throw new IOException("gzip finished without exhausting source");
    }

    @Override // okio.Source
    @NotNull
    public Timeout timeout() {
        return this.f86384q0.timeout();
    }
}
