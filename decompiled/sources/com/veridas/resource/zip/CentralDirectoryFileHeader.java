package com.veridas.resource.zip;

import androidx.appcompat.widget.c;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CentralDirectoryFileHeader.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0012\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b?\b\u0086\b\u0018\u0000 n2\u00020\u0001:\u0001nB\u009f\u0001\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\t\u0012\u0006\u0010\u001f\u001a\u00020\t\u0012\u0006\u0010 \u001a\u00020\t\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\t\u0012\u0006\u0010'\u001a\u00020\t\u0012\u0006\u0010(\u001a\u00020\u0014\u0012\u0006\u0010)\u001a\u00020\u0014\u0012\u0006\u0010*\u001a\u00020\u0014¢\u0006\u0004\bl\u0010mJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0002HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\t\u0010\u000b\u001a\u00020\tHÆ\u0003J\t\u0010\f\u001a\u00020\tHÆ\u0003J\t\u0010\r\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0002HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003J\t\u0010\u0015\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0014HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0014HÆ\u0003JÇ\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\t2\b\b\u0002\u0010\u001f\u001a\u00020\t2\b\b\u0002\u0010 \u001a\u00020\t2\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\t2\b\b\u0002\u0010'\u001a\u00020\t2\b\b\u0002\u0010(\u001a\u00020\u00142\b\b\u0002\u0010)\u001a\u00020\u00142\b\b\u0002\u0010*\u001a\u00020\u0014HÆ\u0001J\t\u0010-\u001a\u00020,HÖ\u0001J\t\u0010.\u001a\u00020\tHÖ\u0001J\u0013\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b9\u00105R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b;\u00105R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u00105R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u00103\u001a\u0004\b?\u00105R\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\u0017\u0010 \u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bF\u0010A\u001a\u0004\bG\u0010CR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u00103\u001a\u0004\bI\u00105R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u00103\u001a\u0004\bK\u00105R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u00103\u001a\u0004\bM\u00105R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u00103\u001a\u0004\bO\u00105R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u00103\u001a\u0004\bQ\u00105R\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bR\u0010A\u001a\u0004\bS\u0010CR\u0017\u0010'\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\bT\u0010A\u001a\u0004\bU\u0010CR\u0017\u0010(\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0017\u0010)\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\bZ\u0010W\u001a\u0004\b[\u0010YR\u0017\u0010*\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\\\u0010W\u001a\u0004\b]\u0010YR\u001a\u0010`\u001a\u00020\t8\u0006X\u0086D¢\u0006\f\n\u0004\b^\u0010A\u001a\u0004\b_\u0010CR\u0017\u0010c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\ba\u0010A\u001a\u0004\bb\u0010CR\u0017\u0010h\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0017\u0010k\u001a\u00020,8\u0006¢\u0006\f\n\u0004\bi\u0010e\u001a\u0004\bj\u0010g¨\u0006o"}, d2 = {"Lcom/veridas/resource/zip/CentralDirectoryFileHeader;", "", "", "component1", "component2", "component3", "component4", "component5", "component6", "", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "", "component17", "component18", "component19", "versionMadeBy", "versionNeeded", "generalPurposeBitFlag", "compressionMethod", "lastModificationTime", "lastModificationDate", "crc32", "compressedSize", "uncompressedSize", "fileNameLength", "extraFieldLength", "fileCommentLength", "diskNumberStart", "internalFileAttributes", "externalFileAttributes", "relativeOffsetOfLocalHeader", "fileName", "extraField", "fileComment", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", ExifInterface.LATITUDE_SOUTH, "getVersionMadeBy", "()S", "b", "getVersionNeeded", "c", "getGeneralPurposeBitFlag", "d", "getCompressionMethod", "e", "getLastModificationTime", "f", "getLastModificationDate", "g", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getCrc32", "()I", "h", "getCompressedSize", "i", "getUncompressedSize", "j", "getFileNameLength", "k", "getExtraFieldLength", "l", "getFileCommentLength", "m", "getDiskNumberStart", "n", "getInternalFileAttributes", "o", "getExternalFileAttributes", "p", "getRelativeOffsetOfLocalHeader", "q", "[B", "getFileName", "()[B", "r", "getExtraField", "s", "getFileComment", "t", "getSignature", "signature", "u", "getSize", "size", SharedPrefsStorage.VERSION_KEY, "Ljava/lang/String;", "getFileNameString", "()Ljava/lang/String;", "fileNameString", "w", "getFileCommentString", "fileCommentString", "<init>", "(SSSSSSIIISSSSSII[B[B[B)V", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class CentralDirectoryFileHeader {
    public static final int CDFH_COMPRESSED_SIZE_OFFSET = 20;
    public static final int CDFH_COMPRESSION_METHOD_OFFSET = 10;
    public static final int CDFH_CRC32_OFFSET = 16;
    public static final int CDFH_DISK_NUMBER_START_OFFSET = 34;
    public static final int CDFH_EXTERNAL_FILE_ATTRIBUTES_OFFSET = 38;
    public static final int CDFH_EXTRA_FIELD_LENGTH_OFFSET = 30;
    public static final int CDFH_FILENAME_OFFSET = 46;
    public static final int CDFH_FILE_COMMENT_LENGTH_OFFSET = 32;
    public static final int CDFH_FILE_NAME_LENGTH_OFFSET = 28;
    public static final int CDFH_GENERAL_PURPOSE_BIT_FLAG_OFFSET = 8;
    public static final int CDFH_INTERNAL_FILE_ATTRIBUTES_OFFSET = 36;
    public static final int CDFH_LAST_MODIFICATION_DATE_OFFSET = 14;
    public static final int CDFH_LAST_MODIFICATION_TIME_OFFSET = 12;
    public static final int CDFH_RELATIVE_OFFSET_OF_LOCAL_HEADER_OFFSET = 42;
    public static final int CDFH_SIGNATURE = 33639248;
    public static final int CDFH_UNCOMPRESSED_SIZE_OFFSET = 24;
    public static final int CDFH_VERSION_MADE_BY_OFFSET = 4;
    public static final int CDFH_VERSION_NEEDED_OFFSET = 6;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final short versionMadeBy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final short versionNeeded;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final short generalPurposeBitFlag;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final short compressionMethod;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final short lastModificationTime;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final short lastModificationDate;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int crc32;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final int compressedSize;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public final int uncompressedSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final short fileNameLength;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final short extraFieldLength;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final short fileCommentLength;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final short diskNumberStart;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final short internalFileAttributes;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int externalFileAttributes;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public final int relativeOffsetOfLocalHeader;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] fileName;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] extraField;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] fileComment;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final int signature;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fileNameString;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fileCommentString;

    public CentralDirectoryFileHeader(short s4, short s7, short s9, short s10, short s11, short s12, int i10, int i11, int i12, short s13, short s14, short s15, short s16, short s17, int i13, int i14, @NotNull byte[] fileName, @NotNull byte[] extraField, @NotNull byte[] fileComment) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(extraField, "extraField");
        Intrinsics.checkNotNullParameter(fileComment, "fileComment");
        this.versionMadeBy = s4;
        this.versionNeeded = s7;
        this.generalPurposeBitFlag = s9;
        this.compressionMethod = s10;
        this.lastModificationTime = s11;
        this.lastModificationDate = s12;
        this.crc32 = i10;
        this.compressedSize = i11;
        this.uncompressedSize = i12;
        this.fileNameLength = s13;
        this.extraFieldLength = s14;
        this.fileCommentLength = s15;
        this.diskNumberStart = s16;
        this.internalFileAttributes = s17;
        this.externalFileAttributes = i13;
        this.relativeOffsetOfLocalHeader = i14;
        this.fileName = fileName;
        this.extraField = extraField;
        this.fileComment = fileComment;
        this.signature = CDFH_SIGNATURE;
        this.size = c.a(s13, 46, s14, s15);
        Charset charset = Charsets.UTF_8;
        this.fileNameString = new String(fileName, charset);
        this.fileCommentString = new String(fileComment, charset);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final short getVersionMadeBy() {
        return this.versionMadeBy;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final short getFileNameLength() {
        return this.fileNameLength;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final short getExtraFieldLength() {
        return this.extraFieldLength;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final short getFileCommentLength() {
        return this.fileCommentLength;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final short getDiskNumberStart() {
        return this.diskNumberStart;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final short getInternalFileAttributes() {
        return this.internalFileAttributes;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final int getExternalFileAttributes() {
        return this.externalFileAttributes;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getRelativeOffsetOfLocalHeader() {
        return this.relativeOffsetOfLocalHeader;
    }

    @NotNull
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final byte[] getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final byte[] getExtraField() {
        return this.extraField;
    }

    @NotNull
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final byte[] getFileComment() {
        return this.fileComment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getVersionNeeded() {
        return this.versionNeeded;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getGeneralPurposeBitFlag() {
        return this.generalPurposeBitFlag;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final short getCompressionMethod() {
        return this.compressionMethod;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final short getLastModificationTime() {
        return this.lastModificationTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final short getLastModificationDate() {
        return this.lastModificationDate;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getCrc32() {
        return this.crc32;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCompressedSize() {
        return this.compressedSize;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getUncompressedSize() {
        return this.uncompressedSize;
    }

    @NotNull
    public final CentralDirectoryFileHeader copy(short versionMadeBy, short versionNeeded, short generalPurposeBitFlag, short compressionMethod, short lastModificationTime, short lastModificationDate, int crc32, int compressedSize, int uncompressedSize, short fileNameLength, short extraFieldLength, short fileCommentLength, short diskNumberStart, short internalFileAttributes, int externalFileAttributes, int relativeOffsetOfLocalHeader, @NotNull byte[] fileName, @NotNull byte[] extraField, @NotNull byte[] fileComment) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(extraField, "extraField");
        Intrinsics.checkNotNullParameter(fileComment, "fileComment");
        return new CentralDirectoryFileHeader(versionMadeBy, versionNeeded, generalPurposeBitFlag, compressionMethod, lastModificationTime, lastModificationDate, crc32, compressedSize, uncompressedSize, fileNameLength, extraFieldLength, fileCommentLength, diskNumberStart, internalFileAttributes, externalFileAttributes, relativeOffsetOfLocalHeader, fileName, extraField, fileComment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CentralDirectoryFileHeader)) {
            return false;
        }
        CentralDirectoryFileHeader centralDirectoryFileHeader = (CentralDirectoryFileHeader) other;
        return this.versionMadeBy == centralDirectoryFileHeader.versionMadeBy && this.versionNeeded == centralDirectoryFileHeader.versionNeeded && this.generalPurposeBitFlag == centralDirectoryFileHeader.generalPurposeBitFlag && this.compressionMethod == centralDirectoryFileHeader.compressionMethod && this.lastModificationTime == centralDirectoryFileHeader.lastModificationTime && this.lastModificationDate == centralDirectoryFileHeader.lastModificationDate && this.crc32 == centralDirectoryFileHeader.crc32 && this.compressedSize == centralDirectoryFileHeader.compressedSize && this.uncompressedSize == centralDirectoryFileHeader.uncompressedSize && this.fileNameLength == centralDirectoryFileHeader.fileNameLength && this.extraFieldLength == centralDirectoryFileHeader.extraFieldLength && this.fileCommentLength == centralDirectoryFileHeader.fileCommentLength && this.diskNumberStart == centralDirectoryFileHeader.diskNumberStart && this.internalFileAttributes == centralDirectoryFileHeader.internalFileAttributes && this.externalFileAttributes == centralDirectoryFileHeader.externalFileAttributes && this.relativeOffsetOfLocalHeader == centralDirectoryFileHeader.relativeOffsetOfLocalHeader && Intrinsics.areEqual(this.fileName, centralDirectoryFileHeader.fileName) && Intrinsics.areEqual(this.extraField, centralDirectoryFileHeader.extraField) && Intrinsics.areEqual(this.fileComment, centralDirectoryFileHeader.fileComment);
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

    public final short getDiskNumberStart() {
        return this.diskNumberStart;
    }

    public final int getExternalFileAttributes() {
        return this.externalFileAttributes;
    }

    @NotNull
    public final byte[] getExtraField() {
        return this.extraField;
    }

    public final short getExtraFieldLength() {
        return this.extraFieldLength;
    }

    @NotNull
    public final byte[] getFileComment() {
        return this.fileComment;
    }

    public final short getFileCommentLength() {
        return this.fileCommentLength;
    }

    @NotNull
    public final String getFileCommentString() {
        return this.fileCommentString;
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

    public final short getInternalFileAttributes() {
        return this.internalFileAttributes;
    }

    public final short getLastModificationDate() {
        return this.lastModificationDate;
    }

    public final short getLastModificationTime() {
        return this.lastModificationTime;
    }

    public final int getRelativeOffsetOfLocalHeader() {
        return this.relativeOffsetOfLocalHeader;
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

    public final short getVersionMadeBy() {
        return this.versionMadeBy;
    }

    public final short getVersionNeeded() {
        return this.versionNeeded;
    }

    public int hashCode() {
        return Arrays.hashCode(this.fileComment) + ((Arrays.hashCode(this.extraField) + ((Arrays.hashCode(this.fileName) + (((((((((((((((((((((((((((((((this.versionMadeBy * 31) + this.versionNeeded) * 31) + this.generalPurposeBitFlag) * 31) + this.compressionMethod) * 31) + this.lastModificationTime) * 31) + this.lastModificationDate) * 31) + this.crc32) * 31) + this.compressedSize) * 31) + this.uncompressedSize) * 31) + this.fileNameLength) * 31) + this.extraFieldLength) * 31) + this.fileCommentLength) * 31) + this.diskNumberStart) * 31) + this.internalFileAttributes) * 31) + this.externalFileAttributes) * 31) + this.relativeOffsetOfLocalHeader) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String string = Arrays.toString(this.fileName);
        String string2 = Arrays.toString(this.extraField);
        String string3 = Arrays.toString(this.fileComment);
        StringBuilder sb2 = new StringBuilder("CentralDirectoryFileHeader(versionMadeBy=");
        sb2.append((int) this.versionMadeBy);
        sb2.append(", versionNeeded=");
        sb2.append((int) this.versionNeeded);
        sb2.append(", generalPurposeBitFlag=");
        sb2.append((int) this.generalPurposeBitFlag);
        sb2.append(", compressionMethod=");
        sb2.append((int) this.compressionMethod);
        sb2.append(", lastModificationTime=");
        sb2.append((int) this.lastModificationTime);
        sb2.append(", lastModificationDate=");
        sb2.append((int) this.lastModificationDate);
        sb2.append(", crc32=");
        sb2.append(this.crc32);
        sb2.append(", compressedSize=");
        sb2.append(this.compressedSize);
        sb2.append(", uncompressedSize=");
        sb2.append(this.uncompressedSize);
        sb2.append(", fileNameLength=");
        sb2.append((int) this.fileNameLength);
        sb2.append(", extraFieldLength=");
        sb2.append((int) this.extraFieldLength);
        sb2.append(", fileCommentLength=");
        sb2.append((int) this.fileCommentLength);
        sb2.append(", diskNumberStart=");
        sb2.append((int) this.diskNumberStart);
        sb2.append(", internalFileAttributes=");
        sb2.append((int) this.internalFileAttributes);
        sb2.append(", externalFileAttributes=");
        sb2.append(this.externalFileAttributes);
        sb2.append(", relativeOffsetOfLocalHeader=");
        a.f(sb2, this.relativeOffsetOfLocalHeader, ", fileName=", string, ", extraField=");
        return androidx.camera.core.impl.utils.c.b(sb2, string2, ", fileComment=", string3, ")");
    }
}
