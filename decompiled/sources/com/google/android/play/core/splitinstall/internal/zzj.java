package com.google.android.play.core.splitinstall.internal;

import android.util.Pair;
import androidx.camera.core.impl.v;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzj {
    public static Pair a(RandomAccessFile randomAccessFile, int i10) throws IOException {
        int i11;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(i10, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        b(byteBufferAllocate);
        int iCapacity = byteBufferAllocate.capacity();
        if (iCapacity >= 22) {
            int i12 = iCapacity - 22;
            int iMin = Math.min(i12, 65535);
            int i13 = 0;
            while (true) {
                if (i13 >= iMin) {
                    i11 = -1;
                    break;
                }
                i11 = i12 - i13;
                if (byteBufferAllocate.getInt(i11) == 101010256 && ((char) byteBufferAllocate.getShort(i11 + 20)) == i13) {
                    break;
                }
                i13++;
            }
        } else {
            i11 = -1;
            break;
        }
        if (i11 == -1) {
            return null;
        }
        byteBufferAllocate.position(i11);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) i11)));
    }

    public static void b(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }

    public static long zza(ByteBuffer byteBuffer) {
        b(byteBuffer);
        return ((long) byteBuffer.getInt(byteBuffer.position() + 16)) & 4294967295L;
    }

    public static long zzb(ByteBuffer byteBuffer) {
        b(byteBuffer);
        return ((long) byteBuffer.getInt(byteBuffer.position() + 12)) & 4294967295L;
    }

    public static void zzd(ByteBuffer byteBuffer, long j10) {
        b(byteBuffer);
        int iPosition = byteBuffer.position() + 16;
        if (j10 < 0 || j10 > 4294967295L) {
            throw new IllegalArgumentException(v.c("uint32 value of out range: ", j10));
        }
        byteBuffer.putInt(byteBuffer.position() + iPosition, (int) j10);
    }
}
