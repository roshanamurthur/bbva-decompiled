package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.NonNull;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import com.bumptech.glide.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f38546a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f38547b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public interface Reader {

        public static final class EndOfFileException extends IOException {
            public EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }

        int a() throws IOException;

        int b(int i10, byte[] bArr) throws IOException;

        short c() throws IOException;

        long skip(long j10) throws IOException;
    }

    public static final class a implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f38548a;

        public a(ByteBuffer byteBuffer) {
            this.f38548a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() throws Reader.EndOfFileException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b(int i10, byte[] bArr) {
            ByteBuffer byteBuffer = this.f38548a;
            int iMin = Math.min(i10, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short c() throws Reader.EndOfFileException {
            ByteBuffer byteBuffer = this.f38548a;
            if (byteBuffer.remaining() >= 1) {
                return (short) (byteBuffer.get() & 255);
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j10) {
            ByteBuffer byteBuffer = this.f38548a;
            int iMin = (int) Math.min(byteBuffer.remaining(), j10);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ByteBuffer f38549a;

        public b(byte[] bArr, int i10) {
            this.f38549a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i10);
        }

        public final short a(int i10) {
            ByteBuffer byteBuffer = this.f38549a;
            if (byteBuffer.remaining() - i10 >= 2) {
                return byteBuffer.getShort(i10);
            }
            return (short) -1;
        }
    }

    public static final class c implements Reader {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f38550a;

        public c(InputStream inputStream) {
            this.f38550a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a() throws IOException {
            return (c() << 8) | c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b(int i10, byte[] bArr) throws IOException {
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10 && (i12 = this.f38550a.read(bArr, i11, i10 - i11)) != -1) {
                i11 += i12;
            }
            if (i11 == 0 && i12 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i11;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short c() throws IOException {
            int i10 = this.f38550a.read();
            if (i10 != -1) {
                return (short) i10;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long skip(long j10) throws IOException {
            if (j10 < 0) {
                return 0L;
            }
            long j11 = j10;
            while (j11 > 0) {
                InputStream inputStream = this.f38550a;
                long jSkip = inputStream.skip(j11);
                if (jSkip > 0) {
                    j11 -= jSkip;
                } else {
                    if (inputStream.read() == -1) {
                        break;
                    }
                    j11--;
                }
            }
            return j10 - j11;
        }
    }

    public static int a(Reader reader, ArrayPool arrayPool) throws IOException {
        int iA;
        short sC;
        try {
            int iA2 = reader.a();
            if ((iA2 & 65496) != 65496 && iA2 != 19789 && iA2 != 18761) {
                return -1;
            }
            while (true) {
                if (reader.c() == 255 && (sC = reader.c()) != 218 && sC != 217) {
                    iA = reader.a() - 2;
                    if (sC == 225) {
                        break;
                    }
                    long j10 = iA;
                    if (reader.skip(j10) != j10) {
                        iA = -1;
                        break;
                    }
                } else {
                    iA = -1;
                    break;
                }
            }
            if (iA == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) arrayPool.get(iA, byte[].class);
            try {
                return c(reader, bArr, iA);
            } finally {
                arrayPool.put(bArr);
            }
        } catch (Reader.EndOfFileException unused) {
            return -1;
        }
    }

    @NonNull
    public static ImageHeaderParser.ImageType b(Reader reader) throws IOException {
        try {
            int iA = reader.a();
            if (iA == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iC = (iA << 8) | reader.c();
            if (iC == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iC2 = (iC << 8) | reader.c();
            if (iC2 == -1991225785) {
                reader.skip(21L);
                try {
                    return reader.c() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iC2 == 1380533830) {
                reader.skip(4L);
                if (((reader.a() << 16) | reader.a()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int iA2 = (reader.a() << 16) | reader.a();
                if ((iA2 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i10 = iA2 & 255;
                if (i10 != 88) {
                    if (i10 != 76) {
                        return ImageHeaderParser.ImageType.WEBP;
                    }
                    reader.skip(4L);
                    return (reader.c() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                reader.skip(4L);
                short sC = reader.c();
                if ((sC & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                return (sC & 16) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
            }
            if (((reader.a() << 16) | reader.a()) != 1718909296) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iA3 = (reader.a() << 16) | reader.a();
            if (iA3 == 1635150195) {
                return ImageHeaderParser.ImageType.ANIMATED_AVIF;
            }
            int i11 = 0;
            boolean z10 = iA3 == 1635150182;
            reader.skip(4L);
            int i12 = iC2 - 16;
            if (i12 % 4 == 0) {
                while (i11 < 5 && i12 > 0) {
                    int iA4 = (reader.a() << 16) | reader.a();
                    if (iA4 == 1635150195) {
                        return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                    }
                    if (iA4 == 1635150182) {
                        z10 = true;
                    }
                    i11++;
                    i12 -= 4;
                }
            }
            return z10 ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    public static int c(Reader reader, byte[] bArr, int i10) throws IOException {
        short sA;
        int i11;
        int i12;
        if (reader.b(i10, bArr) != i10) {
            return -1;
        }
        byte[] bArr2 = f38546a;
        boolean z10 = bArr != null && i10 > bArr2.length;
        if (z10) {
            for (int i13 = 0; i13 < bArr2.length; i13++) {
                if (bArr[i13] != bArr2[i13]) {
                    return -1;
                }
            }
        }
        if (!z10) {
            return -1;
        }
        b bVar = new b(bArr, i10);
        short sA2 = bVar.a(6);
        ByteOrder byteOrder = sA2 != 18761 ? sA2 != 19789 ? ByteOrder.BIG_ENDIAN : ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN;
        ByteBuffer byteBuffer = bVar.f38549a;
        byteBuffer.order(byteOrder);
        int i14 = byteBuffer.remaining() - 10 >= 4 ? byteBuffer.getInt(10) : -1;
        short sA3 = bVar.a(i14 + 6);
        for (int i15 = 0; i15 < sA3; i15++) {
            int i16 = (i15 * 12) + i14 + 8;
            if (bVar.a(i16) == 274 && (sA = bVar.a(i16 + 2)) >= 1 && sA <= 12) {
                int i17 = i16 + 4;
                int i18 = byteBuffer.remaining() - i17 >= 4 ? byteBuffer.getInt(i17) : -1;
                if (i18 >= 0 && (i11 = i18 + f38547b[sA]) <= 4 && (i12 = i16 + 8) >= 0 && i12 <= byteBuffer.remaining() && i11 >= 0 && i11 + i12 <= byteBuffer.remaining()) {
                    return bVar.a(i12);
                }
            }
        }
        return -1;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull InputStream inputStream, @NonNull ArrayPool arrayPool) throws IOException {
        return a(new c((InputStream) Preconditions.checkNotNull(inputStream)), (ArrayPool) Preconditions.checkNotNull(arrayPool));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType getType(@NonNull InputStream inputStream) throws IOException {
        return b(new c((InputStream) Preconditions.checkNotNull(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @NonNull
    public ImageHeaderParser.ImageType getType(@NonNull ByteBuffer byteBuffer) throws IOException {
        return b(new a((ByteBuffer) Preconditions.checkNotNull(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int getOrientation(@NonNull ByteBuffer byteBuffer, @NonNull ArrayPool arrayPool) throws IOException {
        return a(new a((ByteBuffer) Preconditions.checkNotNull(byteBuffer)), (ArrayPool) Preconditions.checkNotNull(arrayPool));
    }
}
