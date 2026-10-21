package okio;

import com.bbva.glomohybrid.cellsweb.presentation.verishow.constants.HearingDisabilitiesConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PeekSource.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000f"}, d2 = {"Lokio/PeekSource;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", "timeout", "", HearingDisabilitiesConstants.CLOSE_MODAL, "Lokio/BufferedSource;", "upstream", "<init>", "(Lokio/BufferedSource;)V", "okio"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPeekSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PeekSource.kt\nokio/PeekSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1#2:75\n*E\n"})
public final class PeekSource implements Source {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final BufferedSource f86402p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Buffer f86403q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Segment f86404r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f86405s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f86406t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public long f86407u0;

    public PeekSource(@NotNull BufferedSource upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        this.f86402p0 = upstream;
        Buffer buffer = upstream.getBuffer();
        this.f86403q0 = buffer;
        Segment segment = buffer.head;
        this.f86404r0 = segment;
        this.f86405s0 = segment != null ? segment.pos : -1;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f86406t0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r3 == r5.pos) goto L15;
     */
    @Override // okio.Source
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long read(@org.jetbrains.annotations.NotNull okio.Buffer r9, long r10) {
        /*
            r8 = this;
            java.lang.String r0 = "sink"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L7b
            boolean r3 = r8.f86406t0
            r3 = r3 ^ 1
            if (r3 == 0) goto L6f
            okio.Segment r3 = r8.f86404r0
            okio.Buffer r4 = r8.f86403q0
            if (r3 == 0) goto L31
            okio.Segment r5 = r4.head
            if (r3 != r5) goto L25
            int r3 = r8.f86405s0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            int r5 = r5.pos
            if (r3 != r5) goto L25
            goto L31
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Peek source is invalid because upstream source was used"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L31:
            if (r2 != 0) goto L34
            return r0
        L34:
            long r0 = r8.f86407u0
            r2 = 1
            long r0 = r0 + r2
            okio.BufferedSource r2 = r8.f86402p0
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L44
            r9 = -1
            return r9
        L44:
            okio.Segment r0 = r8.f86404r0
            if (r0 != 0) goto L55
            okio.Segment r0 = r4.head
            if (r0 == 0) goto L55
            r8.f86404r0 = r0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            int r0 = r0.pos
            r8.f86405s0 = r0
        L55:
            long r0 = r4.size()
            long r2 = r8.f86407u0
            long r0 = r0 - r2
            long r10 = java.lang.Math.min(r10, r0)
            okio.Buffer r2 = r8.f86403q0
            long r4 = r8.f86407u0
            r3 = r9
            r6 = r10
            r2.copyTo(r3, r4, r6)
            long r0 = r8.f86407u0
            long r0 = r0 + r10
            r8.f86407u0 = r0
            return r10
        L6f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "closed"
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L7b:
            java.lang.String r9 = "byteCount < 0: "
            java.lang.String r9 = androidx.camera.core.impl.v.c(r9, r10)
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r9 = r9.toString()
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.PeekSource.read(okio.Buffer, long):long");
    }

    @Override // okio.Source
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public Timeout getF86333p0() {
        return this.f86402p0.getF86333p0();
    }
}
