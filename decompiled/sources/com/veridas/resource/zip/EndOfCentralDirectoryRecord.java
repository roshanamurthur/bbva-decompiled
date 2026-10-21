package com.veridas.resource.zip;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EndOfCentralDirectoryRecord.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b#\b\u0086\b\u0018\u0000 >2\u00020\u0001:\u0001>BO\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\b\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b<\u0010=J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\n\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\bHÆ\u0003J\t\u0010\f\u001a\u00020\bHÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\bHÆ\u0003J\t\u0010\u0011\u001a\u00020\u0010HÆ\u0003Jc\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\b2\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u0010HÆ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0012\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0013\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0014\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u0017\u0010\u0015\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b*\u0010#\u001a\u0004\b+\u0010%R\u0017\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010!R\u0017\u0010\u0018\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b.\u0010\u001f\u001a\u0004\b/\u0010!R\u0017\u0010\u0019\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b1\u0010%R\u0017\u0010\u001a\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u00108\u001a\u00020\u00058\u0006X\u0086D¢\u0006\f\n\u0004\b6\u0010\u001f\u001a\u0004\b7\u0010!R\u0017\u0010;\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010!¨\u0006?"}, d2 = {"Lcom/veridas/resource/zip/EndOfCentralDirectoryRecord;", "", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "component1", "", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "", "component9", "offSet", "diskNumber", "startDiskNumber", "numberOfRecordsInDisk", "totalNumberOfRecords", "sizeOfDirectoryRecords", "offsetToFirstDirectoryRecord", "commentLength", "comment", "copy", "", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getOffSet", "()I", "b", ExifInterface.LATITUDE_SOUTH, "getDiskNumber", "()S", "c", "getStartDiskNumber", "d", "getNumberOfRecordsInDisk", "e", "getTotalNumberOfRecords", "f", "getSizeOfDirectoryRecords", "g", "getOffsetToFirstDirectoryRecord", "h", "getCommentLength", "i", "[B", "getComment", "()[B", "j", "getSignature", "signature", "k", "getSize", "size", "<init>", "(ISSSSIIS[B)V", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class EndOfCentralDirectoryRecord {
    public static final int EOCD_COMMENT_LENGTH_OFFSET = 20;
    public static final int EOCD_COMMENT_OFFSET = 22;
    public static final int EOCD_DISK_NUMBER_OFFSET = 4;
    public static final int EOCD_MINIMUM_SIZE = 22;
    public static final int EOCD_NUMBER_OF_RECORDS_IN_DISK_OFFSET = 8;
    public static final int EOCD_OFFSET_TO_FIRST_DIRECTORY_RECORD_OFFSET = 16;
    public static final int EOCD_SIGNATURE = 101010256;
    public static final int EOCD_SIZE_OF_DIRECTORY_RECORDS_OFFSET = 12;
    public static final int EOCD_START_DISK_NUMBER_OFFSET = 6;
    public static final int EOCD_TOTAL_NUMBER_OF_RECORDS_OFFSET = 10;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int offSet;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final short diskNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final short startDiskNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final short numberOfRecordsInDisk;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final short totalNumberOfRecords;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int sizeOfDirectoryRecords;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int offsetToFirstDirectoryRecord;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final short commentLength;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] comment;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public final int signature;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final int size;

    public EndOfCentralDirectoryRecord(int i10, short s4, short s7, short s9, short s10, int i11, int i12, short s11, @NotNull byte[] comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        this.offSet = i10;
        this.diskNumber = s4;
        this.startDiskNumber = s7;
        this.numberOfRecordsInDisk = s9;
        this.totalNumberOfRecords = s10;
        this.sizeOfDirectoryRecords = i11;
        this.offsetToFirstDirectoryRecord = i12;
        this.commentLength = s11;
        this.comment = comment;
        this.signature = EOCD_SIGNATURE;
        this.size = s11 + 22;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getOffSet() {
        return this.offSet;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final short getDiskNumber() {
        return this.diskNumber;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final short getStartDiskNumber() {
        return this.startDiskNumber;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final short getNumberOfRecordsInDisk() {
        return this.numberOfRecordsInDisk;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final short getTotalNumberOfRecords() {
        return this.totalNumberOfRecords;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getSizeOfDirectoryRecords() {
        return this.sizeOfDirectoryRecords;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getOffsetToFirstDirectoryRecord() {
        return this.offsetToFirstDirectoryRecord;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final short getCommentLength() {
        return this.commentLength;
    }

    @NotNull
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final byte[] getComment() {
        return this.comment;
    }

    @NotNull
    public final EndOfCentralDirectoryRecord copy(int offSet, short diskNumber, short startDiskNumber, short numberOfRecordsInDisk, short totalNumberOfRecords, int sizeOfDirectoryRecords, int offsetToFirstDirectoryRecord, short commentLength, @NotNull byte[] comment) {
        Intrinsics.checkNotNullParameter(comment, "comment");
        return new EndOfCentralDirectoryRecord(offSet, diskNumber, startDiskNumber, numberOfRecordsInDisk, totalNumberOfRecords, sizeOfDirectoryRecords, offsetToFirstDirectoryRecord, commentLength, comment);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(EndOfCentralDirectoryRecord.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.veridas.resource.zip.EndOfCentralDirectoryRecord");
        EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = (EndOfCentralDirectoryRecord) other;
        return this.offSet == endOfCentralDirectoryRecord.offSet && this.diskNumber == endOfCentralDirectoryRecord.diskNumber && this.startDiskNumber == endOfCentralDirectoryRecord.startDiskNumber && this.numberOfRecordsInDisk == endOfCentralDirectoryRecord.numberOfRecordsInDisk && this.totalNumberOfRecords == endOfCentralDirectoryRecord.totalNumberOfRecords && this.sizeOfDirectoryRecords == endOfCentralDirectoryRecord.sizeOfDirectoryRecords && this.offsetToFirstDirectoryRecord == endOfCentralDirectoryRecord.offsetToFirstDirectoryRecord && this.commentLength == endOfCentralDirectoryRecord.commentLength && Arrays.equals(this.comment, endOfCentralDirectoryRecord.comment) && this.size == endOfCentralDirectoryRecord.size;
    }

    @NotNull
    public final byte[] getComment() {
        return this.comment;
    }

    public final short getCommentLength() {
        return this.commentLength;
    }

    public final short getDiskNumber() {
        return this.diskNumber;
    }

    public final short getNumberOfRecordsInDisk() {
        return this.numberOfRecordsInDisk;
    }

    public final int getOffSet() {
        return this.offSet;
    }

    public final int getOffsetToFirstDirectoryRecord() {
        return this.offsetToFirstDirectoryRecord;
    }

    public final int getSignature() {
        return this.signature;
    }

    public final int getSize() {
        return this.size;
    }

    public final int getSizeOfDirectoryRecords() {
        return this.sizeOfDirectoryRecords;
    }

    public final short getStartDiskNumber() {
        return this.startDiskNumber;
    }

    public final short getTotalNumberOfRecords() {
        return this.totalNumberOfRecords;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.comment) + (((((((((((((((this.offSet * 31) + this.diskNumber) * 31) + this.startDiskNumber) * 31) + this.numberOfRecordsInDisk) * 31) + this.totalNumberOfRecords) * 31) + this.sizeOfDirectoryRecords) * 31) + this.offsetToFirstDirectoryRecord) * 31) + this.commentLength) * 31)) * 31) + this.signature) * 31) + this.size;
    }

    @NotNull
    public String toString() {
        return "EndOfCentralDirectoryRecord(offSet=" + this.offSet + ", diskNumber=" + ((int) this.diskNumber) + ", startDiskNumber=" + ((int) this.startDiskNumber) + ", numberOfRecordsInDisk=" + ((int) this.numberOfRecordsInDisk) + ", totalNumberOfRecords=" + ((int) this.totalNumberOfRecords) + ", sizeOfDirectoryRecords=" + this.sizeOfDirectoryRecords + ", offsetToFirstDirectoryRecord=" + this.offsetToFirstDirectoryRecord + ", commentLength=" + ((int) this.commentLength) + ", comment=" + Arrays.toString(this.comment) + ")";
    }
}
