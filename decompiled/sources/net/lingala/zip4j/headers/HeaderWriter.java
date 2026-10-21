package net.lingala.zip4j.headers;

import androidx.camera.core.impl.utils.b;
import androidx.camera.core.impl.utils.c;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.io.outputstream.CountingOutputStream;
import net.lingala.zip4j.io.outputstream.OutputStreamWithSplitZipSupport;
import net.lingala.zip4j.io.outputstream.SplitOutputStream;
import net.lingala.zip4j.model.AESExtraDataRecord;
import net.lingala.zip4j.model.ExtraDataRecord;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.Zip64EndOfCentralDirectoryLocator;
import net.lingala.zip4j.model.Zip64EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.RawIO;
import net.lingala.zip4j.util.Zip4jUtil;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes12.dex */
public class HeaderWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RawIO f84938a = new RawIO();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f84939b = new byte[8];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f84940c = new byte[4];

    public static Zip64EndOfCentralDirectoryRecord a(ZipModel zipModel, int i10, long j10) throws ZipException {
        long jB;
        Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecord = new Zip64EndOfCentralDirectoryRecord();
        zip64EndOfCentralDirectoryRecord.setSignature(HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_RECORD);
        zip64EndOfCentralDirectoryRecord.setSizeOfZip64EndCentralDirectoryRecord(44L);
        if (zipModel.getCentralDirectory() != null && zipModel.getCentralDirectory().getFileHeaders() != null && zipModel.getCentralDirectory().getFileHeaders().size() > 0) {
            FileHeader fileHeader = zipModel.getCentralDirectory().getFileHeaders().get(0);
            zip64EndOfCentralDirectoryRecord.setVersionMadeBy(fileHeader.getVersionMadeBy());
            zip64EndOfCentralDirectoryRecord.setVersionNeededToExtract(fileHeader.getVersionNeededToExtract());
        }
        zip64EndOfCentralDirectoryRecord.setNumberOfThisDisk(zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk());
        zip64EndOfCentralDirectoryRecord.setNumberOfThisDiskStartOfCentralDirectory(zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDiskStartOfCentralDir());
        long size = zipModel.getCentralDirectory().getFileHeaders().size();
        if (zipModel.isSplitArchive()) {
            jB = b(zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk(), zipModel.getCentralDirectory().getFileHeaders());
        } else {
            jB = size;
        }
        zip64EndOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(jB);
        zip64EndOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectory(size);
        zip64EndOfCentralDirectoryRecord.setSizeOfCentralDirectory(i10);
        zip64EndOfCentralDirectoryRecord.setOffsetStartCentralDirectoryWRTStartDiskNumber(j10);
        return zip64EndOfCentralDirectoryRecord;
    }

    public static long b(int i10, List list) throws ZipException {
        if (list == null) {
            throw new ZipException("file headers are null, cannot calculate number of entries on this disk");
        }
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((FileHeader) it.next()).getDiskNumberStart() == i10) {
                i11++;
            }
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void c(ZipModel zipModel, OutputStream outputStream) throws IOException {
        int currentSplitFileCounter;
        if (outputStream instanceof OutputStreamWithSplitZipSupport) {
            OutputStreamWithSplitZipSupport outputStreamWithSplitZipSupport = (OutputStreamWithSplitZipSupport) outputStream;
            zipModel.getEndOfCentralDirectoryRecord().setOffsetOfStartOfCentralDirectory(outputStreamWithSplitZipSupport.getFilePointer());
            currentSplitFileCounter = outputStreamWithSplitZipSupport.getCurrentSplitFileCounter();
        } else {
            currentSplitFileCounter = 0;
        }
        if (zipModel.isZip64Format()) {
            if (zipModel.getZip64EndOfCentralDirectoryRecord() == null) {
                zipModel.setZip64EndOfCentralDirectoryRecord(new Zip64EndOfCentralDirectoryRecord());
            }
            if (zipModel.getZip64EndOfCentralDirectoryLocator() == null) {
                zipModel.setZip64EndOfCentralDirectoryLocator(new Zip64EndOfCentralDirectoryLocator());
            }
            zipModel.getZip64EndOfCentralDirectoryRecord().setOffsetStartCentralDirectoryWRTStartDiskNumber(zipModel.getEndOfCentralDirectoryRecord().getOffsetOfStartOfCentralDirectory());
            zipModel.getZip64EndOfCentralDirectoryLocator().setNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord(currentSplitFileCounter);
            zipModel.getZip64EndOfCentralDirectoryLocator().setTotalNumberOfDiscs(currentSplitFileCounter + 1);
        }
        zipModel.getEndOfCentralDirectoryRecord().setNumberOfThisDisk(currentSplitFileCounter);
        zipModel.getEndOfCentralDirectoryRecord().setNumberOfThisDiskStartOfCentralDir(currentSplitFileCounter);
    }

    public static void e(ZipModel zipModel, int i10, long j10, ByteArrayOutputStream byteArrayOutputStream, RawIO rawIO, Charset charset) throws IOException {
        long jB;
        byte[] bArr = new byte[8];
        rawIO.writeIntLittleEndian(byteArrayOutputStream, (int) HeaderSignature.END_OF_CENTRAL_DIRECTORY.getValue());
        rawIO.writeShortLittleEndian(byteArrayOutputStream, zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk());
        rawIO.writeShortLittleEndian(byteArrayOutputStream, zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDiskStartOfCentralDir());
        long size = zipModel.getCentralDirectory().getFileHeaders().size();
        if (zipModel.isSplitArchive()) {
            jB = b(zipModel.getEndOfCentralDirectoryRecord().getNumberOfThisDisk(), zipModel.getCentralDirectory().getFileHeaders());
        } else {
            jB = size;
        }
        if (jB > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            jB = 65535;
        }
        rawIO.writeShortLittleEndian(byteArrayOutputStream, (int) jB);
        if (size > WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            size = 65535;
        }
        rawIO.writeShortLittleEndian(byteArrayOutputStream, (int) size);
        rawIO.writeIntLittleEndian(byteArrayOutputStream, i10);
        if (j10 > 4294967295L) {
            rawIO.writeLongLittleEndian(bArr, 0, 4294967295L);
            byteArrayOutputStream.write(bArr, 0, 4);
        } else {
            rawIO.writeLongLittleEndian(bArr, 0, j10);
            byteArrayOutputStream.write(bArr, 0, 4);
        }
        String comment = zipModel.getEndOfCentralDirectoryRecord().getComment();
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(comment)) {
            rawIO.writeShortLittleEndian(byteArrayOutputStream, 0);
            return;
        }
        byte[] bytesFromString = HeaderUtil.getBytesFromString(comment, charset);
        rawIO.writeShortLittleEndian(byteArrayOutputStream, bytesFromString.length);
        byteArrayOutputStream.write(bytesFromString);
    }

    public static void g(Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecord, ByteArrayOutputStream byteArrayOutputStream, RawIO rawIO) throws IOException {
        rawIO.writeIntLittleEndian(byteArrayOutputStream, (int) zip64EndOfCentralDirectoryRecord.getSignature().getValue());
        rawIO.writeLongLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryRecord.getSizeOfZip64EndCentralDirectoryRecord());
        rawIO.writeShortLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryRecord.getVersionMadeBy());
        rawIO.writeShortLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryRecord.getVersionNeededToExtract());
        rawIO.writeIntLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryRecord.getNumberOfThisDisk());
        rawIO.writeIntLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryRecord.getNumberOfThisDiskStartOfCentralDirectory());
        rawIO.writeLongLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryRecord.getTotalNumberOfEntriesInCentralDirectoryOnThisDisk());
        rawIO.writeLongLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryRecord.getTotalNumberOfEntriesInCentralDirectory());
        rawIO.writeLongLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryRecord.getSizeOfCentralDirectory());
        rawIO.writeLongLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryRecord.getOffsetStartCentralDirectoryWRTStartDiskNumber());
    }

    public final void d(ZipModel zipModel, ByteArrayOutputStream byteArrayOutputStream, RawIO rawIO, Charset charset) throws ZipException {
        if (zipModel.getCentralDirectory() == null || zipModel.getCentralDirectory().getFileHeaders() == null || zipModel.getCentralDirectory().getFileHeaders().size() <= 0) {
            return;
        }
        for (FileHeader fileHeader : zipModel.getCentralDirectory().getFileHeaders()) {
            byte[] bArr = this.f84940c;
            byte[] bArr2 = this.f84939b;
            if (fileHeader == null) {
                throw new ZipException("input parameters is null, cannot write local file header");
            }
            try {
                byte[] bArr3 = {0, 0};
                boolean z10 = fileHeader.getCompressedSize() >= 4294967295L || fileHeader.getUncompressedSize() >= 4294967295L || fileHeader.getOffsetLocalHeader() >= 4294967295L || fileHeader.getDiskNumberStart() >= 65535;
                rawIO.writeIntLittleEndian(byteArrayOutputStream, (int) fileHeader.getSignature().getValue());
                rawIO.writeShortLittleEndian(byteArrayOutputStream, fileHeader.getVersionMadeBy());
                rawIO.writeShortLittleEndian(byteArrayOutputStream, fileHeader.getVersionNeededToExtract());
                byteArrayOutputStream.write(fileHeader.getGeneralPurposeFlag());
                rawIO.writeShortLittleEndian(byteArrayOutputStream, fileHeader.getCompressionMethod().getCode());
                rawIO.writeLongLittleEndian(bArr2, 0, fileHeader.getLastModifiedTime());
                byteArrayOutputStream.write(bArr2, 0, 4);
                rawIO.writeLongLittleEndian(bArr2, 0, fileHeader.getCrc());
                byteArrayOutputStream.write(bArr2, 0, 4);
                if (z10) {
                    rawIO.writeLongLittleEndian(bArr2, 0, 4294967295L);
                    byteArrayOutputStream.write(bArr2, 0, 4);
                    byteArrayOutputStream.write(bArr2, 0, 4);
                    zipModel.setZip64Format(true);
                } else {
                    rawIO.writeLongLittleEndian(bArr2, 0, fileHeader.getCompressedSize());
                    byteArrayOutputStream.write(bArr2, 0, 4);
                    rawIO.writeLongLittleEndian(bArr2, 0, fileHeader.getUncompressedSize());
                    byteArrayOutputStream.write(bArr2, 0, 4);
                }
                byte[] bytesFromString = new byte[0];
                if (Zip4jUtil.isStringNotNullAndNotEmpty(fileHeader.getFileName())) {
                    bytesFromString = HeaderUtil.getBytesFromString(fileHeader.getFileName(), charset);
                }
                rawIO.writeShortLittleEndian(byteArrayOutputStream, bytesFromString.length);
                byte[] bArr4 = new byte[4];
                if (z10) {
                    rawIO.writeLongLittleEndian(bArr2, 0, 4294967295L);
                    System.arraycopy(bArr2, 0, bArr4, 0, 4);
                } else {
                    rawIO.writeLongLittleEndian(bArr2, 0, fileHeader.getOffsetLocalHeader());
                    System.arraycopy(bArr2, 0, bArr4, 0, 4);
                }
                int sizeOfData = z10 ? 32 : 0;
                if (fileHeader.getAesExtraDataRecord() != null) {
                    sizeOfData += 11;
                }
                if (fileHeader.getExtraDataRecords() != null) {
                    for (ExtraDataRecord extraDataRecord : fileHeader.getExtraDataRecords()) {
                        if (extraDataRecord.getHeader() != HeaderSignature.AES_EXTRA_DATA_RECORD.getValue() && extraDataRecord.getHeader() != HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue()) {
                            sizeOfData += extraDataRecord.getSizeOfData() + 4;
                        }
                    }
                }
                rawIO.writeShortLittleEndian(byteArrayOutputStream, sizeOfData);
                String fileComment = fileHeader.getFileComment();
                byte[] bytesFromString2 = new byte[0];
                if (Zip4jUtil.isStringNotNullAndNotEmpty(fileComment)) {
                    bytesFromString2 = HeaderUtil.getBytesFromString(fileComment, charset);
                }
                rawIO.writeShortLittleEndian(byteArrayOutputStream, bytesFromString2.length);
                if (z10) {
                    rawIO.writeIntLittleEndian(bArr, 0, 65535);
                    byteArrayOutputStream.write(bArr, 0, 2);
                } else {
                    rawIO.writeShortLittleEndian(byteArrayOutputStream, fileHeader.getDiskNumberStart());
                }
                byteArrayOutputStream.write(bArr3);
                byteArrayOutputStream.write(fileHeader.getExternalFileAttributes());
                byteArrayOutputStream.write(bArr4);
                byte[] bArr5 = bytesFromString;
                if (bArr5.length > 0) {
                    byteArrayOutputStream.write(bArr5);
                }
                if (z10) {
                    zipModel.setZip64Format(true);
                    rawIO.writeShortLittleEndian(byteArrayOutputStream, (int) HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue());
                    rawIO.writeShortLittleEndian(byteArrayOutputStream, 28);
                    rawIO.writeLongLittleEndian(byteArrayOutputStream, fileHeader.getUncompressedSize());
                    rawIO.writeLongLittleEndian(byteArrayOutputStream, fileHeader.getCompressedSize());
                    rawIO.writeLongLittleEndian(byteArrayOutputStream, fileHeader.getOffsetLocalHeader());
                    rawIO.writeIntLittleEndian(byteArrayOutputStream, fileHeader.getDiskNumberStart());
                }
                if (fileHeader.getAesExtraDataRecord() != null) {
                    AESExtraDataRecord aesExtraDataRecord = fileHeader.getAesExtraDataRecord();
                    rawIO.writeShortLittleEndian(byteArrayOutputStream, (int) aesExtraDataRecord.getSignature().getValue());
                    rawIO.writeShortLittleEndian(byteArrayOutputStream, aesExtraDataRecord.getDataSize());
                    rawIO.writeShortLittleEndian(byteArrayOutputStream, aesExtraDataRecord.getAesVersion().getVersionNumber());
                    byteArrayOutputStream.write(aesExtraDataRecord.getVendorID().getBytes());
                    byteArrayOutputStream.write(new byte[]{(byte) aesExtraDataRecord.getAesKeyStrength().getRawCode()});
                    rawIO.writeShortLittleEndian(byteArrayOutputStream, aesExtraDataRecord.getCompressionMethod().getCode());
                }
                f(fileHeader, byteArrayOutputStream);
                if (bytesFromString2.length > 0) {
                    byteArrayOutputStream.write(bytesFromString2);
                }
            } catch (Exception e5) {
                throw new ZipException(e5);
            }
        }
    }

    public final void f(FileHeader fileHeader, ByteArrayOutputStream byteArrayOutputStream) throws IOException {
        if (fileHeader.getExtraDataRecords() == null || fileHeader.getExtraDataRecords().size() == 0) {
            return;
        }
        for (ExtraDataRecord extraDataRecord : fileHeader.getExtraDataRecords()) {
            if (extraDataRecord.getHeader() != HeaderSignature.AES_EXTRA_DATA_RECORD.getValue() && extraDataRecord.getHeader() != HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue()) {
                int header = (int) extraDataRecord.getHeader();
                RawIO rawIO = this.f84938a;
                rawIO.writeShortLittleEndian(byteArrayOutputStream, header);
                rawIO.writeShortLittleEndian(byteArrayOutputStream, extraDataRecord.getSizeOfData());
                if (extraDataRecord.getSizeOfData() > 0 && extraDataRecord.getData() != null) {
                    byteArrayOutputStream.write(extraDataRecord.getData());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c8 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:6:0x000b, B:8:0x0014, B:10:0x001a, B:12:0x0028, B:15:0x003b, B:19:0x0051, B:44:0x0104, B:24:0x0066, B:26:0x006c, B:27:0x0074, B:29:0x007a, B:30:0x0082, B:32:0x0090, B:37:0x00a5, B:39:0x00a9, B:41:0x00b8, B:43:0x00d7, B:40:0x00b1, B:42:0x00c8, B:33:0x0098, B:35:0x009c, B:14:0x0032), top: B:56:0x000b }] */
    public void finalizeZipFile(ZipModel zipModel, OutputStream outputStream, Charset charset) throws IOException {
        boolean zIsSplitZipFile;
        RawIO rawIO = this.f84938a;
        if (zipModel == null || outputStream == null) {
            throw new ZipException("input parameters is null, cannot finalize zip file");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c(zipModel, outputStream);
            long offsetOfStartOfCentralDirectory = (!zipModel.isZip64Format() || zipModel.getZip64EndOfCentralDirectoryRecord() == null || zipModel.getZip64EndOfCentralDirectoryRecord().getOffsetStartCentralDirectoryWRTStartDiskNumber() == -1) ? zipModel.getEndOfCentralDirectoryRecord().getOffsetOfStartOfCentralDirectory() : zipModel.getZip64EndOfCentralDirectoryRecord().getOffsetStartCentralDirectoryWRTStartDiskNumber();
            d(zipModel, byteArrayOutputStream, rawIO, charset);
            int size = byteArrayOutputStream.size();
            if (zipModel.isZip64Format() || offsetOfStartOfCentralDirectory >= 4294967295L || zipModel.getCentralDirectory().getFileHeaders().size() >= 65535) {
                if (zipModel.getZip64EndOfCentralDirectoryRecord() == null) {
                    zipModel.setZip64EndOfCentralDirectoryRecord(new Zip64EndOfCentralDirectoryRecord());
                }
                if (zipModel.getZip64EndOfCentralDirectoryLocator() == null) {
                    zipModel.setZip64EndOfCentralDirectoryLocator(new Zip64EndOfCentralDirectoryLocator());
                }
                zipModel.getZip64EndOfCentralDirectoryLocator().setOffsetZip64EndOfCentralDirectoryRecord(((long) size) + offsetOfStartOfCentralDirectory);
                if (outputStream instanceof SplitOutputStream) {
                    zIsSplitZipFile = ((SplitOutputStream) outputStream).isSplitZipFile();
                } else {
                    if (outputStream instanceof CountingOutputStream) {
                        zIsSplitZipFile = ((CountingOutputStream) outputStream).isSplitZipFile();
                    } else {
                        zipModel.getZip64EndOfCentralDirectoryLocator().setNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord(0);
                        zipModel.getZip64EndOfCentralDirectoryLocator().setTotalNumberOfDiscs(1);
                    }
                    Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecordA = a(zipModel, size, offsetOfStartOfCentralDirectory);
                    zipModel.setZip64EndOfCentralDirectoryRecord(zip64EndOfCentralDirectoryRecordA);
                    g(zip64EndOfCentralDirectoryRecordA, byteArrayOutputStream, rawIO);
                    Zip64EndOfCentralDirectoryLocator zip64EndOfCentralDirectoryLocator = zipModel.getZip64EndOfCentralDirectoryLocator();
                    rawIO.writeIntLittleEndian(byteArrayOutputStream, (int) HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_LOCATOR.getValue());
                    rawIO.writeIntLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryLocator.getNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord());
                    rawIO.writeLongLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryLocator.getOffsetZip64EndOfCentralDirectoryRecord());
                    rawIO.writeIntLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryLocator.getTotalNumberOfDiscs());
                }
                if (zIsSplitZipFile) {
                    int currentSplitFileCounter = outputStream instanceof SplitOutputStream ? ((SplitOutputStream) outputStream).getCurrentSplitFileCounter() : ((CountingOutputStream) outputStream).getCurrentSplitFileCounter();
                    zipModel.getZip64EndOfCentralDirectoryLocator().setNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord(currentSplitFileCounter);
                    zipModel.getZip64EndOfCentralDirectoryLocator().setTotalNumberOfDiscs(currentSplitFileCounter + 1);
                } else {
                    zipModel.getZip64EndOfCentralDirectoryLocator().setNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord(0);
                    zipModel.getZip64EndOfCentralDirectoryLocator().setTotalNumberOfDiscs(1);
                }
                Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecordA2 = a(zipModel, size, offsetOfStartOfCentralDirectory);
                zipModel.setZip64EndOfCentralDirectoryRecord(zip64EndOfCentralDirectoryRecordA2);
                g(zip64EndOfCentralDirectoryRecordA2, byteArrayOutputStream, rawIO);
                Zip64EndOfCentralDirectoryLocator zip64EndOfCentralDirectoryLocator2 = zipModel.getZip64EndOfCentralDirectoryLocator();
                rawIO.writeIntLittleEndian(byteArrayOutputStream, (int) HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_LOCATOR.getValue());
                rawIO.writeIntLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryLocator2.getNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord());
                rawIO.writeLongLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryLocator2.getOffsetZip64EndOfCentralDirectoryRecord());
                rawIO.writeIntLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryLocator2.getTotalNumberOfDiscs());
            }
            e(zipModel, size, offsetOfStartOfCentralDirectory, byteArrayOutputStream, this.f84938a, charset);
            h(zipModel, outputStream, byteArrayOutputStream.toByteArray(), charset);
            byteArrayOutputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public void finalizeZipFileWithoutValidations(ZipModel zipModel, OutputStream outputStream, Charset charset) throws IOException {
        RawIO rawIO = this.f84938a;
        if (zipModel == null || outputStream == null) {
            throw new ZipException("input parameters is null, cannot finalize zip file without validations");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            long offsetOfStartOfCentralDirectory = zipModel.getEndOfCentralDirectoryRecord().getOffsetOfStartOfCentralDirectory();
            d(zipModel, byteArrayOutputStream, rawIO, charset);
            int size = byteArrayOutputStream.size();
            if (zipModel.isZip64Format() || offsetOfStartOfCentralDirectory >= 4294967295L || zipModel.getCentralDirectory().getFileHeaders().size() >= 65535) {
                if (zipModel.getZip64EndOfCentralDirectoryRecord() == null) {
                    zipModel.setZip64EndOfCentralDirectoryRecord(new Zip64EndOfCentralDirectoryRecord());
                }
                if (zipModel.getZip64EndOfCentralDirectoryLocator() == null) {
                    zipModel.setZip64EndOfCentralDirectoryLocator(new Zip64EndOfCentralDirectoryLocator());
                }
                zipModel.getZip64EndOfCentralDirectoryLocator().setOffsetZip64EndOfCentralDirectoryRecord(((long) size) + offsetOfStartOfCentralDirectory);
                Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecordA = a(zipModel, size, offsetOfStartOfCentralDirectory);
                zipModel.setZip64EndOfCentralDirectoryRecord(zip64EndOfCentralDirectoryRecordA);
                g(zip64EndOfCentralDirectoryRecordA, byteArrayOutputStream, rawIO);
                Zip64EndOfCentralDirectoryLocator zip64EndOfCentralDirectoryLocator = zipModel.getZip64EndOfCentralDirectoryLocator();
                rawIO.writeIntLittleEndian(byteArrayOutputStream, (int) HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_LOCATOR.getValue());
                rawIO.writeIntLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryLocator.getNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord());
                rawIO.writeLongLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryLocator.getOffsetZip64EndOfCentralDirectoryRecord());
                rawIO.writeIntLittleEndian(byteArrayOutputStream, zip64EndOfCentralDirectoryLocator.getTotalNumberOfDiscs());
            }
            e(zipModel, size, offsetOfStartOfCentralDirectory, byteArrayOutputStream, this.f84938a, charset);
            h(zipModel, outputStream, byteArrayOutputStream.toByteArray(), charset);
            byteArrayOutputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public final void h(ZipModel zipModel, OutputStream outputStream, byte[] bArr, Charset charset) throws IOException {
        if (bArr == null) {
            throw new ZipException("invalid buff to write as zip headers");
        }
        if ((outputStream instanceof CountingOutputStream) && ((CountingOutputStream) outputStream).checkBuffSizeAndStartNextSplitFile(bArr.length)) {
            finalizeZipFile(zipModel, outputStream, charset);
        } else {
            outputStream.write(bArr);
        }
    }

    public void updateLocalFileHeader(FileHeader fileHeader, ZipModel zipModel, SplitOutputStream splitOutputStream) throws IOException {
        SplitOutputStream splitOutputStream2;
        boolean z10;
        String string;
        String str;
        if (fileHeader == null || zipModel == null) {
            throw new ZipException("invalid input parameters, cannot update local file header");
        }
        if (fileHeader.getDiskNumberStart() != splitOutputStream.getCurrentSplitFileCounter()) {
            String parent = zipModel.getZipFile().getParent();
            String zipFileNameWithoutExtension = FileUtils.getZipFileNameWithoutExtension(zipModel.getZipFile().getName());
            if (parent != null) {
                StringBuilder sbD = c.d(parent);
                sbD.append(System.getProperty("file.separator"));
                string = sbD.toString();
            } else {
                string = "";
            }
            z10 = true;
            if (fileHeader.getDiskNumberStart() < 9) {
                str = string + zipFileNameWithoutExtension + ".z0" + (fileHeader.getDiskNumberStart() + 1);
            } else {
                str = string + zipFileNameWithoutExtension + ".z" + (fileHeader.getDiskNumberStart() + 1);
            }
            splitOutputStream2 = new SplitOutputStream(new File(str));
        } else {
            splitOutputStream2 = splitOutputStream;
            z10 = false;
        }
        long filePointer = splitOutputStream2.getFilePointer();
        splitOutputStream2.seek(fileHeader.getOffsetLocalHeader() + 14);
        long crc = fileHeader.getCrc();
        RawIO rawIO = this.f84938a;
        byte[] bArr = this.f84939b;
        rawIO.writeLongLittleEndian(bArr, 0, crc);
        splitOutputStream2.write(bArr, 0, 4);
        if (fileHeader.getUncompressedSize() >= 4294967295L) {
            rawIO.writeLongLittleEndian(bArr, 0, 4294967295L);
            splitOutputStream2.write(bArr, 0, 4);
            splitOutputStream2.write(bArr, 0, 4);
            int fileNameLength = fileHeader.getFileNameLength() + 8;
            if (splitOutputStream2.skipBytes(fileNameLength) != fileNameLength) {
                throw new ZipException(b.a("Unable to skip ", fileNameLength, " bytes to update LFH"));
            }
            rawIO.writeLongLittleEndian(splitOutputStream2, fileHeader.getUncompressedSize());
            rawIO.writeLongLittleEndian(splitOutputStream2, fileHeader.getCompressedSize());
        } else {
            rawIO.writeLongLittleEndian(bArr, 0, fileHeader.getCompressedSize());
            splitOutputStream2.write(bArr, 0, 4);
            rawIO.writeLongLittleEndian(bArr, 0, fileHeader.getUncompressedSize());
            splitOutputStream2.write(bArr, 0, 4);
        }
        if (z10) {
            splitOutputStream2.close();
        } else {
            splitOutputStream.seek(filePointer);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void writeExtendedLocalHeader(LocalFileHeader localFileHeader, OutputStream outputStream) throws IOException {
        byte[] bArr = this.f84939b;
        RawIO rawIO = this.f84938a;
        if (localFileHeader == null || outputStream == null) {
            throw new ZipException("input parameters is null, cannot write extended local header");
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            rawIO.writeIntLittleEndian(byteArrayOutputStream, (int) HeaderSignature.EXTRA_DATA_RECORD.getValue());
            rawIO.writeLongLittleEndian(bArr, 0, localFileHeader.getCrc());
            byteArrayOutputStream.write(bArr, 0, 4);
            if (localFileHeader.isWriteCompressedSizeInZip64ExtraRecord()) {
                rawIO.writeLongLittleEndian(byteArrayOutputStream, localFileHeader.getCompressedSize());
                rawIO.writeLongLittleEndian(byteArrayOutputStream, localFileHeader.getUncompressedSize());
            } else {
                rawIO.writeLongLittleEndian(bArr, 0, localFileHeader.getCompressedSize());
                byteArrayOutputStream.write(bArr, 0, 4);
                rawIO.writeLongLittleEndian(bArr, 0, localFileHeader.getUncompressedSize());
                byteArrayOutputStream.write(bArr, 0, 4);
            }
            outputStream.write(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void writeLocalFileHeader(ZipModel zipModel, LocalFileHeader localFileHeader, OutputStream outputStream, Charset charset) throws IOException {
        byte[] bArr = this.f84939b;
        RawIO rawIO = this.f84938a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            rawIO.writeIntLittleEndian(byteArrayOutputStream, (int) localFileHeader.getSignature().getValue());
            rawIO.writeShortLittleEndian(byteArrayOutputStream, localFileHeader.getVersionNeededToExtract());
            byteArrayOutputStream.write(localFileHeader.getGeneralPurposeFlag());
            rawIO.writeShortLittleEndian(byteArrayOutputStream, localFileHeader.getCompressionMethod().getCode());
            rawIO.writeLongLittleEndian(bArr, 0, localFileHeader.getLastModifiedTime());
            byteArrayOutputStream.write(bArr, 0, 4);
            rawIO.writeLongLittleEndian(bArr, 0, localFileHeader.getCrc());
            byteArrayOutputStream.write(bArr, 0, 4);
            boolean z10 = localFileHeader.getCompressedSize() >= 4294967295L || localFileHeader.getUncompressedSize() >= 4294967295L;
            if (z10) {
                rawIO.writeLongLittleEndian(bArr, 0, 4294967295L);
                byteArrayOutputStream.write(bArr, 0, 4);
                byteArrayOutputStream.write(bArr, 0, 4);
                zipModel.setZip64Format(true);
                localFileHeader.setWriteCompressedSizeInZip64ExtraRecord(true);
            } else {
                rawIO.writeLongLittleEndian(bArr, 0, localFileHeader.getCompressedSize());
                byteArrayOutputStream.write(bArr, 0, 4);
                rawIO.writeLongLittleEndian(bArr, 0, localFileHeader.getUncompressedSize());
                byteArrayOutputStream.write(bArr, 0, 4);
                localFileHeader.setWriteCompressedSizeInZip64ExtraRecord(false);
            }
            byte[] bytesFromString = new byte[0];
            if (Zip4jUtil.isStringNotNullAndNotEmpty(localFileHeader.getFileName())) {
                bytesFromString = HeaderUtil.getBytesFromString(localFileHeader.getFileName(), charset);
            }
            rawIO.writeShortLittleEndian(byteArrayOutputStream, bytesFromString.length);
            int i10 = z10 ? 20 : 0;
            if (localFileHeader.getAesExtraDataRecord() != null) {
                i10 += 11;
            }
            rawIO.writeShortLittleEndian(byteArrayOutputStream, i10);
            if (bytesFromString.length > 0) {
                byteArrayOutputStream.write(bytesFromString);
            }
            if (z10) {
                rawIO.writeShortLittleEndian(byteArrayOutputStream, (int) HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue());
                rawIO.writeShortLittleEndian(byteArrayOutputStream, 16);
                rawIO.writeLongLittleEndian(byteArrayOutputStream, localFileHeader.getUncompressedSize());
                rawIO.writeLongLittleEndian(byteArrayOutputStream, localFileHeader.getCompressedSize());
            }
            if (localFileHeader.getAesExtraDataRecord() != null) {
                AESExtraDataRecord aesExtraDataRecord = localFileHeader.getAesExtraDataRecord();
                rawIO.writeShortLittleEndian(byteArrayOutputStream, (int) aesExtraDataRecord.getSignature().getValue());
                rawIO.writeShortLittleEndian(byteArrayOutputStream, aesExtraDataRecord.getDataSize());
                rawIO.writeShortLittleEndian(byteArrayOutputStream, aesExtraDataRecord.getAesVersion().getVersionNumber());
                byteArrayOutputStream.write(aesExtraDataRecord.getVendorID().getBytes());
                byteArrayOutputStream.write(new byte[]{(byte) aesExtraDataRecord.getAesKeyStrength().getRawCode()});
                rawIO.writeShortLittleEndian(byteArrayOutputStream, aesExtraDataRecord.getCompressionMethod().getCode());
            }
            outputStream.write(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.close();
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                    throw th3;
                } catch (Throwable th4) {
                    th2.addSuppressed(th4);
                    throw th3;
                }
            }
        }
    }
}
