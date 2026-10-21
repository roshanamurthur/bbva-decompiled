package com.veridas.resource.zip;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalFileHeader.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\f\u0018\u0000 =2\u00020\u0001:\u0001=Bg\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0014\u0012\u0006\u0010\u001c\u001a\u00020\u0014\u0012\u0006\u0010\u001f\u001a\u00020\u0014\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020&\u0012\u0006\u0010.\u001a\u00020&¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R\u0017\u0010\u0019\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R\u0017\u0010+\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010.\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b,\u0010(\u001a\u0004\b-\u0010*R\u001a\u00101\u001a\u00020\u00148\u0006X\u0086D¢\u0006\f\n\u0004\b/\u0010\u0016\u001a\u0004\b0\u0010\u0018R\u0017\u00107\u001a\u0002028\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010:\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b8\u0010\u0016\u001a\u0004\b9\u0010\u0018¨\u0006>"}, d2 = {"Lcom/veridas/resource/zip/LocalFileHeader;", "", "", "a", ExifInterface.LATITUDE_SOUTH, "getVersionNeeded", "()S", "versionNeeded", "b", "getGeneralPurposeBitFlag", "generalPurposeBitFlag", "c", "getCompressionMethod", "compressionMethod", "d", "getLastModificationTime", "lastModificationTime", "e", "getLastModificationDate", "lastModificationDate", "", "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCrc32", "()I", "crc32", "g", "getCompressedSize", "compressedSize", "h", "getUncompressedSize", "uncompressedSize", "i", "getFileNameLength", "fileNameLength", "j", "getExtraFieldLength", "extraFieldLength", "", "k", "[B", "getFileName", "()[B", "fileName", "l", "getExtraField", "extraField", "m", "getSignature", "signature", "", "n", "Ljava/lang/String;", "getFileNameString", "()Ljava/lang/String;", "fileNameString", "o", "getSize", "size", "<init>", "(SSSSSIIISS[B[B)V", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class LocalFileHeader {
    public static final int LFH_COMPRESSED_SIZE_OFFSET = 18;
    public static final int LFH_COMPRESSION_METHOD_OFFSET = 8;
    public static final int LFH_CRC32_OFFSET = 14;
    public static final int LFH_EXTRA_FIELD_LENGTH_OFFSET = 28;
    public static final int LFH_FILENAME_OFFSET = 30;
    public static final int LFH_FILE_NAME_LENGTH_OFFSET = 26;
    public static final int LFH_GENERAL_PURPOSE_BIT_FLAG_OFFSET = 6;
    public static final int LFH_LAST_MODIFICATION_DATE_OFFSET = 12;
    public static final int LFH_LAST_MODIFICATION_TIME_OFFSET = 10;
    public static final int LFH_SIGNATURE = 67324752;
    public static final int LFH_UNCOMPRESSED_SIZE_OFFSET = 22;
    public static final int LFH_VERSION_NEEDED_OFFSET = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final short versionNeeded;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final short generalPurposeBitFlag;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final short compressionMethod;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final short lastModificationTime;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final short lastModificationDate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int crc32;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int compressedSize;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int uncompressedSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final short fileNameLength;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final short extraFieldLength;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] fileName;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] extraField;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final int signature;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fileNameString;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int size;

    public LocalFileHeader(short s4, short s7, short s9, short s10, short s11, int i10, int i11, int i12, short s12, short s13, @NotNull byte[] fileName, @NotNull byte[] extraField) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(extraField, "extraField");
        this.versionNeeded = s4;
        this.generalPurposeBitFlag = s7;
        this.compressionMethod = s9;
        this.lastModificationTime = s10;
        this.lastModificationDate = s11;
        this.crc32 = i10;
        this.compressedSize = i11;
        this.uncompressedSize = i12;
        this.fileNameLength = s12;
        this.extraFieldLength = s13;
        this.fileName = fileName;
        this.extraField = extraField;
        this.signature = LFH_SIGNATURE;
        this.fileNameString = new String(fileName, Charsets.UTF_8);
        this.size = s12 + 30 + s13;
    }

    public final int getCompressedSize() {
        return this.compressedSize;
    }

    public final short getCompressionMethod() {
        return this.compressionMethod;
    }

    public final int getCrc32() {
        return this.crc32;
    }

    @NotNull
    public final byte[] getExtraField() {
        return this.extraField;
    }

    public final short getExtraFieldLength() {
        return this.extraFieldLength;
    }

    @NotNull
    public final byte[] getFileName() {
        return this.fileName;
    }

    public final short getFileNameLength() {
        return this.fileNameLength;
    }

    @NotNull
    public final String getFileNameString() {
        return this.fileNameString;
    }

    public final short getGeneralPurposeBitFlag() {
        return this.generalPurposeBitFlag;
    }

    public final short getLastModificationDate() {
        return this.lastModificationDate;
    }

    public final short getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final int getSignature() {
        return this.signature;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getUncompressedSize() {
        return this.uncompressedSize;
    }

    public final short getVersionNeeded() {
        return this.versionNeeded;
    }
}
