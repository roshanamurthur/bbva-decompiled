package com.veridas.resource.zip;

import java.io.ByteArrayOutputStream;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ZippedBytesReader.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u0003R\u0017\u0010\r\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/veridas/resource/zip/ZippedBytesReader;", "", "", "", "getAllFileNames", "", "getFirstEntryBytes", "entryName", "getEntryBytes", "a", "[B", "getBytes", "()[B", "bytes", "<init>", "([B)V", "Companion", "common-image-processing_release"}, k = 1, mv = {1, 9, 0})
public final class ZippedBytesReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final byte[] bytes;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f67456b;

    public ZippedBytesReader(@NotNull byte[] bytes) {
        ZippedBytesReader zippedBytesReader = this;
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        zippedBytesReader.bytes = bytes;
        for (int length = bytes.length - 22; length >= 0; length--) {
            if (c(bytes, length) == 101010256) {
                short sD = d(bytes, length + 4);
                short sD2 = d(bytes, length + 6);
                short sD3 = d(bytes, length + 8);
                short sD4 = d(bytes, length + 10);
                int iC = c(bytes, length + 12);
                int iC2 = c(bytes, length + 16);
                short sD5 = d(bytes, length + 20);
                int i10 = length + 22;
                EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = new EndOfCentralDirectoryRecord(length, sD, sD2, sD3, sD4, iC, iC2, sD5, ArraysKt___ArraysJvmKt.copyOfRange(bytes, i10, i10 + sD5));
                byte[] bArr = zippedBytesReader.bytes;
                int offsetToFirstDirectoryRecord = endOfCentralDirectoryRecord.getOffsetToFirstDirectoryRecord();
                short totalNumberOfRecords = endOfCentralDirectoryRecord.getTotalNumberOfRecords();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i11 = 0;
                while (i11 < totalNumberOfRecords) {
                    if (c(bArr, offsetToFirstDirectoryRecord) != 33639248) {
                        throw new IllegalArgumentException("Central directory file header signature not found".toString());
                    }
                    short sD6 = d(bArr, offsetToFirstDirectoryRecord + 4);
                    short sD7 = d(bArr, offsetToFirstDirectoryRecord + 6);
                    short sD8 = d(bArr, offsetToFirstDirectoryRecord + 8);
                    short sD9 = d(bArr, offsetToFirstDirectoryRecord + 10);
                    short sD10 = d(bArr, offsetToFirstDirectoryRecord + 12);
                    short sD11 = d(bArr, offsetToFirstDirectoryRecord + 14);
                    int iC3 = c(bArr, offsetToFirstDirectoryRecord + 16);
                    int iC4 = c(bArr, offsetToFirstDirectoryRecord + 20);
                    int iC5 = c(bArr, offsetToFirstDirectoryRecord + 24);
                    short sD12 = d(bArr, offsetToFirstDirectoryRecord + 28);
                    short sD13 = d(bArr, offsetToFirstDirectoryRecord + 30);
                    short s4 = totalNumberOfRecords;
                    short sD14 = d(bArr, offsetToFirstDirectoryRecord + 32);
                    int i12 = offsetToFirstDirectoryRecord + 46;
                    int i13 = sD12 + i12;
                    int i14 = sD13 + i13;
                    CentralDirectoryFileHeader centralDirectoryFileHeader = new CentralDirectoryFileHeader(sD6, sD7, sD8, sD9, sD10, sD11, iC3, iC4, iC5, sD12, sD13, sD14, d(bArr, offsetToFirstDirectoryRecord + 34), d(bArr, offsetToFirstDirectoryRecord + 36), c(bArr, offsetToFirstDirectoryRecord + 38), c(bArr, offsetToFirstDirectoryRecord + 42), ArraysKt___ArraysJvmKt.copyOfRange(bArr, i12, i13), ArraysKt___ArraysJvmKt.copyOfRange(bArr, i13, i14), ArraysKt___ArraysJvmKt.copyOfRange(bArr, i14, sD14 + i14));
                    linkedHashMap.put(centralDirectoryFileHeader.getFileNameString(), centralDirectoryFileHeader);
                    offsetToFirstDirectoryRecord += centralDirectoryFileHeader.getSize();
                    i11++;
                    zippedBytesReader = this;
                    totalNumberOfRecords = s4;
                }
                zippedBytesReader.f67456b = linkedHashMap;
                return;
            }
        }
        throw new IllegalStateException("End Of Central Directory signature not found".toString());
    }

    public static byte[] a(int i10, byte[] bArr) {
        Inflater inflater = new Inflater(true);
        inflater.setInput(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        try {
            byte[] bArr2 = new byte[1024];
            while (!inflater.finished()) {
                byteArrayOutputStream.write(bArr2, 0, inflater.inflate(bArr2));
            }
            Unit unit = Unit.INSTANCE;
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            inflater.end();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            return byteArray;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                CloseableKt.closeFinally(byteArrayOutputStream, th2);
                throw th3;
            }
        }
    }

    public static LocalFileHeader b(int i10, byte[] bArr) {
        if (c(bArr, i10) != 67324752) {
            throw new IllegalArgumentException("Local file header signature not found".toString());
        }
        short sD = d(bArr, i10 + 4);
        short sD2 = d(bArr, i10 + 6);
        short sD3 = d(bArr, i10 + 8);
        short sD4 = d(bArr, i10 + 10);
        short sD5 = d(bArr, i10 + 12);
        int iC = c(bArr, i10 + 14);
        int iC2 = c(bArr, i10 + 18);
        int iC3 = c(bArr, i10 + 22);
        short sD6 = d(bArr, i10 + 26);
        short sD7 = d(bArr, i10 + 28);
        int i11 = i10 + 30;
        int i12 = i11 + sD6;
        return new LocalFileHeader(sD, sD2, sD3, sD4, sD5, iC, iC2, iC3, sD6, sD7, ArraysKt___ArraysJvmKt.copyOfRange(bArr, i11, i12), ArraysKt___ArraysJvmKt.copyOfRange(bArr, i12, i12 + sD7));
    }

    public static int c(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | ((bArr[i10 + 2] & 255) << 16) | ((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255);
    }

    public static short d(byte[] bArr, int i10) {
        return (short) (((bArr[i10 + 1] & 255) << 8) | (bArr[i10] & 255));
    }

    @NotNull
    public final List<String> getAllFileNames() {
        return CollectionsKt___CollectionsKt.toList(this.f67456b.keySet());
    }

    @NotNull
    public final byte[] getBytes() {
        return this.bytes;
    }

    @Nullable
    public final byte[] getEntryBytes(@NotNull String entryName) {
        Intrinsics.checkNotNullParameter(entryName, "entryName");
        CentralDirectoryFileHeader centralDirectoryFileHeader = (CentralDirectoryFileHeader) this.f67456b.get(entryName);
        if (centralDirectoryFileHeader == null) {
            return null;
        }
        int relativeOffsetOfLocalHeader = centralDirectoryFileHeader.getRelativeOffsetOfLocalHeader();
        byte[] bArr = this.bytes;
        LocalFileHeader localFileHeaderB = b(relativeOffsetOfLocalHeader, bArr);
        return a(centralDirectoryFileHeader.getUncompressedSize(), ArraysKt___ArraysJvmKt.copyOfRange(bArr, localFileHeaderB.getSize() + relativeOffsetOfLocalHeader, localFileHeaderB.getSize() + relativeOffsetOfLocalHeader + centralDirectoryFileHeader.getCompressedSize()));
    }

    @NotNull
    public final byte[] getFirstEntryBytes() {
        CentralDirectoryFileHeader centralDirectoryFileHeader = (CentralDirectoryFileHeader) CollectionsKt___CollectionsKt.first(this.f67456b.values());
        int relativeOffsetOfLocalHeader = centralDirectoryFileHeader.getRelativeOffsetOfLocalHeader();
        byte[] bArr = this.bytes;
        LocalFileHeader localFileHeaderB = b(relativeOffsetOfLocalHeader, bArr);
        return a(centralDirectoryFileHeader.getUncompressedSize(), ArraysKt___ArraysJvmKt.copyOfRange(bArr, localFileHeaderB.getSize() + relativeOffsetOfLocalHeader, localFileHeaderB.getSize() + relativeOffsetOfLocalHeader + centralDirectoryFileHeader.getCompressedSize()));
    }
}
