package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.util.Preconditions;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;
import kotlin.UShort;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class ExifOutputStream extends FilterOutputStream {
    private static final short BYTE_ALIGN_II = 18761;
    private static final short BYTE_ALIGN_MM = 19789;
    private static final boolean DEBUG = false;
    private static final byte[] IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(ExifAttribute.ASCII);
    private static final int IFD_OFFSET = 8;
    private static final byte START_CODE = 42;
    private static final int STATE_FRAME_HEADER = 1;
    private static final int STATE_JPEG_DATA = 2;
    private static final int STATE_SOI = 0;
    private static final int STREAMBUFFER_SIZE = 65536;
    private static final String TAG = "ExifOutputStream";
    private final ByteBuffer mBuffer;
    private int mByteToCopy;
    private int mByteToSkip;
    private final ExifData mExifData;
    private final byte[] mSingleByteArray;
    private int mState;

    public static final class JpegHeader {
        public static final short APP1 = -31;
        public static final short DAC = -52;
        public static final short DHT = -60;
        public static final short EOI = -39;
        public static final short JPG = -56;
        public static final short SOF0 = -64;
        public static final short SOF15 = -49;
        public static final short SOI = -40;

        private JpegHeader() {
        }

        public static boolean isSofMarker(short s4) {
            return (s4 < -64 || s4 > -49 || s4 == -60 || s4 == -56 || s4 == -52) ? false : true;
        }
    }

    public ExifOutputStream(@NonNull OutputStream outputStream, @NonNull ExifData exifData) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.mSingleByteArray = new byte[1];
        this.mBuffer = ByteBuffer.allocate(4);
        this.mState = 0;
        this.mExifData = exifData;
    }

    private int requestByteToBuffer(int i10, byte[] bArr, int i11, int i12) {
        int iMin = Math.min(i12, i10 - this.mBuffer.position());
        this.mBuffer.put(bArr, i11, iMin);
        return iMin;
    }

    private void writeExifSegment(@NonNull ByteOrderedDataOutputStream byteOrderedDataOutputStream) throws IOException {
        ExifTag[][] exifTagArr = ExifData.EXIF_TAGS;
        int[] iArr = new int[exifTagArr.length];
        int[] iArr2 = new int[exifTagArr.length];
        for (ExifTag exifTag : ExifData.EXIF_POINTER_TAGS) {
            for (int i10 = 0; i10 < ExifData.EXIF_TAGS.length; i10++) {
                this.mExifData.getAttributes(i10).remove(exifTag.name);
            }
        }
        if (!this.mExifData.getAttributes(1).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(2).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(3).isEmpty()) {
            this.mExifData.getAttributes(1).put(ExifData.EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(0L, this.mExifData.getByteOrder()));
        }
        for (int i11 = 0; i11 < ExifData.EXIF_TAGS.length; i11++) {
            Iterator<Map.Entry<String, ExifAttribute>> it = this.mExifData.getAttributes(i11).entrySet().iterator();
            int i12 = 0;
            while (it.hasNext()) {
                int size = it.next().getValue().size();
                if (size > 4) {
                    i12 += size;
                }
            }
            iArr2[i11] = iArr2[i11] + i12;
        }
        int size2 = 8;
        for (int i13 = 0; i13 < ExifData.EXIF_TAGS.length; i13++) {
            if (!this.mExifData.getAttributes(i13).isEmpty()) {
                iArr[i13] = size2;
                size2 += (this.mExifData.getAttributes(i13).size() * 12) + 6 + iArr2[i13];
            }
        }
        int i14 = size2 + 8;
        if (!this.mExifData.getAttributes(1).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[1].name, ExifAttribute.createULong(iArr[1], this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(2).isEmpty()) {
            this.mExifData.getAttributes(0).put(ExifData.EXIF_POINTER_TAGS[2].name, ExifAttribute.createULong(iArr[2], this.mExifData.getByteOrder()));
        }
        if (!this.mExifData.getAttributes(3).isEmpty()) {
            this.mExifData.getAttributes(1).put(ExifData.EXIF_POINTER_TAGS[3].name, ExifAttribute.createULong(iArr[3], this.mExifData.getByteOrder()));
        }
        byteOrderedDataOutputStream.writeUnsignedShort(i14);
        byteOrderedDataOutputStream.write(IDENTIFIER_EXIF_APP1);
        byteOrderedDataOutputStream.writeShort(this.mExifData.getByteOrder() == ByteOrder.BIG_ENDIAN ? BYTE_ALIGN_MM : BYTE_ALIGN_II);
        byteOrderedDataOutputStream.setByteOrder(this.mExifData.getByteOrder());
        byteOrderedDataOutputStream.writeUnsignedShort(42);
        byteOrderedDataOutputStream.writeUnsignedInt(8L);
        for (int i15 = 0; i15 < ExifData.EXIF_TAGS.length; i15++) {
            if (!this.mExifData.getAttributes(i15).isEmpty()) {
                byteOrderedDataOutputStream.writeUnsignedShort(this.mExifData.getAttributes(i15).size());
                int size3 = (this.mExifData.getAttributes(i15).size() * 12) + iArr[i15] + 2 + 4;
                for (Map.Entry<String, ExifAttribute> entry : this.mExifData.getAttributes(i15).entrySet()) {
                    int i16 = ((ExifTag) Preconditions.checkNotNull(ExifData.Builder.sExifTagMapsForWriting.get(i15).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).number;
                    ExifAttribute value = entry.getValue();
                    int size4 = value.size();
                    byteOrderedDataOutputStream.writeUnsignedShort(i16);
                    byteOrderedDataOutputStream.writeUnsignedShort(value.format);
                    byteOrderedDataOutputStream.writeInt(value.numberOfComponents);
                    if (size4 > 4) {
                        byteOrderedDataOutputStream.writeUnsignedInt(size3);
                        size3 += size4;
                    } else {
                        byteOrderedDataOutputStream.write(value.bytes);
                        if (size4 < 4) {
                            while (size4 < 4) {
                                byteOrderedDataOutputStream.writeByte(0);
                                size4++;
                            }
                        }
                    }
                }
                byteOrderedDataOutputStream.writeUnsignedInt(0L);
                Iterator<Map.Entry<String, ExifAttribute>> it2 = this.mExifData.getAttributes(i15).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().bytes;
                    if (bArr.length > 4) {
                        byteOrderedDataOutputStream.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        byteOrderedDataOutputStream.setByteOrder(ByteOrder.BIG_ENDIAN);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        while (true) {
            int i12 = this.mByteToSkip;
            if ((i12 <= 0 && this.mByteToCopy <= 0 && this.mState == 2) || i11 <= 0) {
                break;
            }
            if (i12 > 0) {
                int iMin = Math.min(i11, i12);
                i11 -= iMin;
                this.mByteToSkip -= iMin;
                i10 += iMin;
            }
            int i13 = this.mByteToCopy;
            if (i13 > 0) {
                int iMin2 = Math.min(i11, i13);
                ((FilterOutputStream) this).out.write(bArr, i10, iMin2);
                i11 -= iMin2;
                this.mByteToCopy -= iMin2;
                i10 += iMin2;
            }
            if (i11 == 0) {
                return;
            }
            int i14 = this.mState;
            if (i14 == 0) {
                int iRequestByteToBuffer = requestByteToBuffer(2, bArr, i10, i11);
                i10 += iRequestByteToBuffer;
                i11 -= iRequestByteToBuffer;
                if (this.mBuffer.position() < 2) {
                    return;
                }
                this.mBuffer.rewind();
                if (this.mBuffer.getShort() != -40) {
                    throw new IOException("Not a valid jpeg image, cannot write exif");
                }
                ((FilterOutputStream) this).out.write(this.mBuffer.array(), 0, 2);
                this.mState = 1;
                this.mBuffer.rewind();
                ByteOrderedDataOutputStream byteOrderedDataOutputStream = new ByteOrderedDataOutputStream(((FilterOutputStream) this).out, ByteOrder.BIG_ENDIAN);
                byteOrderedDataOutputStream.writeShort((short) -31);
                writeExifSegment(byteOrderedDataOutputStream);
            } else if (i14 != 1) {
                continue;
            } else {
                int iRequestByteToBuffer2 = requestByteToBuffer(4, bArr, i10, i11);
                i10 += iRequestByteToBuffer2;
                i11 -= iRequestByteToBuffer2;
                if (this.mBuffer.position() == 2 && this.mBuffer.getShort() == -39) {
                    ((FilterOutputStream) this).out.write(this.mBuffer.array(), 0, 2);
                    this.mBuffer.rewind();
                }
                if (this.mBuffer.position() < 4) {
                    return;
                }
                this.mBuffer.rewind();
                short s4 = this.mBuffer.getShort();
                if (s4 == -31) {
                    this.mByteToSkip = (this.mBuffer.getShort() & UShort.MAX_VALUE) - 2;
                    this.mState = 2;
                } else if (JpegHeader.isSofMarker(s4)) {
                    ((FilterOutputStream) this).out.write(this.mBuffer.array(), 0, 4);
                    this.mState = 2;
                } else {
                    ((FilterOutputStream) this).out.write(this.mBuffer.array(), 0, 4);
                    this.mByteToCopy = (this.mBuffer.getShort() & UShort.MAX_VALUE) - 2;
                }
                this.mBuffer.rewind();
            }
        }
        if (i11 > 0) {
            ((FilterOutputStream) this).out.write(bArr, i10, i11);
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i10) throws IOException {
        byte[] bArr = this.mSingleByteArray;
        bArr[0] = (byte) (i10 & 255);
        write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(@NonNull byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
