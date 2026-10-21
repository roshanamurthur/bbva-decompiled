package v2;

import androidx.annotation.AnyThread;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.emoji2.text.flatbuffer.MetadataList;
import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.UShort;

/* JADX INFO: compiled from: MetadataListReader.java */
/* JADX INFO: loaded from: classes2.dex */
@AnyThread
@RequiresApi(19)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class h {

    /* JADX INFO: compiled from: MetadataListReader.java */
    public static class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f93959a;

        public a(@NonNull ByteBuffer byteBuffer) {
            this.f93959a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // v2.h.d
        public final int a() throws IOException {
            return this.f93959a.getInt();
        }

        @Override // v2.h.d
        public final void b(int i10) throws IOException {
            ByteBuffer byteBuffer = this.f93959a;
            byteBuffer.position(byteBuffer.position() + i10);
        }

        @Override // v2.h.d
        public final long c() throws IOException {
            return ((long) this.f93959a.getInt()) & 4294967295L;
        }

        @Override // v2.h.d
        public final long getPosition() {
            return this.f93959a.position();
        }

        @Override // v2.h.d
        public final int readUnsignedShort() throws IOException {
            return this.f93959a.getShort() & UShort.MAX_VALUE;
        }
    }

    /* JADX INFO: compiled from: MetadataListReader.java */
    public static class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final byte[] f93960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final ByteBuffer f93961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final InputStream f93962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f93963d = 0;

        public b(@NonNull InputStream inputStream) {
            this.f93962c = inputStream;
            byte[] bArr = new byte[4];
            this.f93960a = bArr;
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
            this.f93961b = byteBufferWrap;
            byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // v2.h.d
        public final int a() throws IOException {
            ByteBuffer byteBuffer = this.f93961b;
            byteBuffer.position(0);
            d(4);
            return byteBuffer.getInt();
        }

        @Override // v2.h.d
        public final void b(int i10) throws IOException {
            while (i10 > 0) {
                int iSkip = (int) this.f93962c.skip(i10);
                if (iSkip < 1) {
                    throw new IOException("Skip didn't move at least 1 byte forward");
                }
                i10 -= iSkip;
                this.f93963d += (long) iSkip;
            }
        }

        @Override // v2.h.d
        public final long c() throws IOException {
            ByteBuffer byteBuffer = this.f93961b;
            byteBuffer.position(0);
            d(4);
            return ((long) byteBuffer.getInt()) & 4294967295L;
        }

        public final void d(@IntRange(from = 0, to = SvgConstantsKt.SPECIFIED_FILL_OPACITY) int i10) throws IOException {
            if (this.f93962c.read(this.f93960a, 0, i10) != i10) {
                throw new IOException("read failed");
            }
            this.f93963d += (long) i10;
        }

        @Override // v2.h.d
        public final long getPosition() {
            return this.f93963d;
        }

        @Override // v2.h.d
        public final int readUnsignedShort() throws IOException {
            ByteBuffer byteBuffer = this.f93961b;
            byteBuffer.position(0);
            d(2);
            return byteBuffer.getShort() & UShort.MAX_VALUE;
        }
    }

    /* JADX INFO: compiled from: MetadataListReader.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f93964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f93965b;

        public c(long j10, long j11) {
            this.f93964a = j10;
            this.f93965b = j11;
        }
    }

    /* JADX INFO: compiled from: MetadataListReader.java */
    public interface d {
        int a() throws IOException;

        void b(int i10) throws IOException;

        long c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    public static c a(d dVar) throws IOException {
        long jC;
        dVar.b(4);
        int unsignedShort = dVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        dVar.b(6);
        int i10 = 0;
        while (true) {
            if (i10 >= unsignedShort) {
                jC = -1;
                break;
            }
            int iA = dVar.a();
            dVar.b(4);
            jC = dVar.c();
            dVar.b(4);
            if (1835365473 == iA) {
                break;
            }
            i10++;
        }
        if (jC != -1) {
            dVar.b((int) (jC - dVar.getPosition()));
            dVar.b(12);
            long jC2 = dVar.c();
            for (int i11 = 0; i11 < jC2; i11++) {
                int iA2 = dVar.a();
                long jC3 = dVar.c();
                long jC4 = dVar.c();
                if (1164798569 == iA2 || 1701669481 == iA2) {
                    return new c(jC3 + jC, jC4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    public static MetadataList b(InputStream inputStream) throws IOException {
        b bVar = new b(inputStream);
        c cVarA = a(bVar);
        bVar.b((int) (cVarA.f93964a - bVar.f93963d));
        long j10 = cVarA.f93965b;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate((int) j10);
        int i10 = inputStream.read(byteBufferAllocate.array());
        if (i10 == j10) {
            return MetadataList.getRootAsMetadataList(byteBufferAllocate);
        }
        throw new IOException("Needed " + j10 + " bytes, got " + i10);
    }
}
