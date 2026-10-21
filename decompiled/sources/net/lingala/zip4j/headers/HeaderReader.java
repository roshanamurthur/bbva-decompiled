package net.lingala.zip4j.headers;

import com.mastercard.sonic.androidsvg.SvgConstantsKt;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.io.inputstream.NumberedSplitRandomAccessFile;
import net.lingala.zip4j.model.AESExtraDataRecord;
import net.lingala.zip4j.model.CentralDirectory;
import net.lingala.zip4j.model.DataDescriptor;
import net.lingala.zip4j.model.DigitalSignature;
import net.lingala.zip4j.model.EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.ExtraDataRecord;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.Zip64EndOfCentralDirectoryLocator;
import net.lingala.zip4j.model.Zip64EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.Zip64ExtendedInfo;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import net.lingala.zip4j.util.BitUtils;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.RawIO;
import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: loaded from: classes12.dex */
public class HeaderReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ZipModel f84935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RawIO f84936b = new RawIO();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f84937c = new byte[4];

    public static AESExtraDataRecord b(List list, RawIO rawIO) throws ZipException {
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExtraDataRecord extraDataRecord = (ExtraDataRecord) it.next();
            if (extraDataRecord != null) {
                long header = extraDataRecord.getHeader();
                HeaderSignature headerSignature = HeaderSignature.AES_EXTRA_DATA_RECORD;
                if (header == headerSignature.getValue()) {
                    if (extraDataRecord.getData() == null) {
                        throw new ZipException("corrupt AES extra data records");
                    }
                    AESExtraDataRecord aESExtraDataRecord = new AESExtraDataRecord();
                    aESExtraDataRecord.setSignature(headerSignature);
                    aESExtraDataRecord.setDataSize(extraDataRecord.getSizeOfData());
                    byte[] data = extraDataRecord.getData();
                    aESExtraDataRecord.setAesVersion(AesVersion.getFromVersionNumber(rawIO.readShortLittleEndian(data, 0)));
                    byte[] bArr = new byte[2];
                    System.arraycopy(data, 2, bArr, 0, 2);
                    aESExtraDataRecord.setVendorID(new String(bArr));
                    aESExtraDataRecord.setAesKeyStrength(AesKeyStrength.getAesKeyStrengthFromRawCode(data[4] & 255));
                    aESExtraDataRecord.setCompressionMethod(CompressionMethod.getCompressionMethodFromCode(rawIO.readShortLittleEndian(data, 5)));
                    return aESExtraDataRecord;
                }
            }
        }
        return null;
    }

    public static Zip64ExtendedInfo d(List list, RawIO rawIO, long j10, long j11, long j12, int i10) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ExtraDataRecord extraDataRecord = (ExtraDataRecord) it.next();
            if (extraDataRecord != null && HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue() == extraDataRecord.getHeader()) {
                Zip64ExtendedInfo zip64ExtendedInfo = new Zip64ExtendedInfo();
                byte[] data = extraDataRecord.getData();
                if (extraDataRecord.getSizeOfData() <= 0) {
                    return null;
                }
                int i11 = 0;
                if (extraDataRecord.getSizeOfData() > 0 && j10 == 4294967295L) {
                    zip64ExtendedInfo.setUncompressedSize(rawIO.readLongLittleEndian(data, 0));
                    i11 = 8;
                }
                if (i11 < extraDataRecord.getSizeOfData() && j11 == 4294967295L) {
                    zip64ExtendedInfo.setCompressedSize(rawIO.readLongLittleEndian(data, i11));
                    i11 += 8;
                }
                if (i11 < extraDataRecord.getSizeOfData() && j12 == 4294967295L) {
                    zip64ExtendedInfo.setOffsetLocalHeader(rawIO.readLongLittleEndian(data, i11));
                    i11 += 8;
                }
                if (i11 < extraDataRecord.getSizeOfData() && i10 == 65535) {
                    zip64ExtendedInfo.setDiskNumberStart(rawIO.readIntLittleEndian(data, i11));
                }
                return zip64ExtendedInfo;
            }
        }
        return null;
    }

    public static void e(RandomAccessFile randomAccessFile, long j10) throws IOException {
        if (randomAccessFile instanceof NumberedSplitRandomAccessFile) {
            ((NumberedSplitRandomAccessFile) randomAccessFile).seekInCurrentPart(j10);
        } else {
            randomAccessFile.seek(j10);
        }
    }

    public final ArrayList a(int i10, byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (i11 < i10) {
            ExtraDataRecord extraDataRecord = new ExtraDataRecord();
            RawIO rawIO = this.f84936b;
            extraDataRecord.setHeader(rawIO.readShortLittleEndian(bArr, i11));
            int shortLittleEndian = rawIO.readShortLittleEndian(bArr, i11 + 2);
            extraDataRecord.setSizeOfData(shortLittleEndian);
            int i12 = i11 + 4;
            if (shortLittleEndian > 0) {
                byte[] bArr2 = new byte[shortLittleEndian];
                System.arraycopy(bArr, i12, bArr2, 0, shortLittleEndian);
                extraDataRecord.setData(bArr2);
            }
            i11 = i12 + shortLittleEndian;
            arrayList.add(extraDataRecord);
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    public final EndOfCentralDirectoryRecord c(RandomAccessFile randomAccessFile, RawIO rawIO, Zip4jConfig zip4jConfig) throws IOException {
        long length = randomAccessFile.length();
        if (length < 22) {
            throw new ZipException("Zip file size less than size of zip headers. Probably not a zip file.");
        }
        long length2 = length - 22;
        e(randomAccessFile, length2);
        RawIO rawIO2 = this.f84936b;
        if (rawIO2.readIntLittleEndian(randomAccessFile) != HeaderSignature.END_OF_CENTRAL_DIRECTORY.getValue()) {
            length2 = randomAccessFile.length() - 22;
            long length3 = randomAccessFile.length();
            long length4 = SvgConstantsKt.SPECIFIED_FONT_STYLE;
            if (length3 < SvgConstantsKt.SPECIFIED_FONT_STYLE) {
                length4 = randomAccessFile.length();
            }
            while (true) {
                if (length4 <= 0 || length2 <= 0) {
                    throw new ZipException("Zip headers not found. Probably not a zip file");
                }
                length2--;
                e(randomAccessFile, length2);
                if (rawIO2.readIntLittleEndian(randomAccessFile) == HeaderSignature.END_OF_CENTRAL_DIRECTORY.getValue()) {
                    break;
                }
                length4--;
            }
        }
        e(randomAccessFile, 4 + length2);
        EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = new EndOfCentralDirectoryRecord();
        endOfCentralDirectoryRecord.setSignature(HeaderSignature.END_OF_CENTRAL_DIRECTORY);
        endOfCentralDirectoryRecord.setNumberOfThisDisk(rawIO.readShortLittleEndian(randomAccessFile));
        endOfCentralDirectoryRecord.setNumberOfThisDiskStartOfCentralDir(rawIO.readShortLittleEndian(randomAccessFile));
        endOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(rawIO.readShortLittleEndian(randomAccessFile));
        endOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectory(rawIO.readShortLittleEndian(randomAccessFile));
        endOfCentralDirectoryRecord.setSizeOfCentralDirectory(rawIO.readIntLittleEndian(randomAccessFile));
        endOfCentralDirectoryRecord.setOffsetOfEndOfCentralDirectory(length2);
        byte[] bArr = this.f84937c;
        randomAccessFile.readFully(bArr);
        endOfCentralDirectoryRecord.setOffsetOfStartOfCentralDirectory(rawIO.readLongLittleEndian(bArr, 0));
        int shortLittleEndian = rawIO.readShortLittleEndian(randomAccessFile);
        Charset charset = zip4jConfig.getCharset();
        String strDecodeStringWithCharset = null;
        if (shortLittleEndian > 0) {
            try {
                byte[] bArr2 = new byte[shortLittleEndian];
                randomAccessFile.readFully(bArr2);
                if (charset == null) {
                    charset = InternalZipConstants.ZIP4J_DEFAULT_CHARSET;
                }
                strDecodeStringWithCharset = HeaderUtil.decodeStringWithCharset(bArr2, false, charset);
            } catch (IOException unused) {
            }
        }
        endOfCentralDirectoryRecord.setComment(strDecodeStringWithCharset);
        this.f84935a.setSplitArchive(endOfCentralDirectoryRecord.getNumberOfThisDisk() > 0);
        return endOfCentralDirectoryRecord;
    }

    public boolean isDirectory(byte[] bArr, String str) {
        byte b10 = bArr[0];
        if (b10 != 0 && BitUtils.isBitSet(b10, 4)) {
            return true;
        }
        byte b11 = bArr[3];
        if (b11 != 0 && BitUtils.isBitSet(b11, 6)) {
            return true;
        }
        if (str != null) {
            return str.endsWith("/") || str.endsWith("\\");
        }
        return false;
    }

    public ZipModel readAllHeaders(RandomAccessFile randomAccessFile, Zip4jConfig zip4jConfig) throws IOException {
        List<ExtraDataRecord> list;
        char c10;
        List<ExtraDataRecord> listEmptyList;
        int i10;
        FileHeader fileHeader;
        byte[] bArr;
        CentralDirectory centralDirectory;
        ArrayList arrayList;
        ZipModel zipModel;
        byte[] bArr2;
        int i11;
        Charset charset;
        AESExtraDataRecord aESExtraDataRecordB;
        HeaderReader headerReader = this;
        RawIO rawIO = headerReader.f84936b;
        if (randomAccessFile.length() < 22) {
            throw new ZipException("Zip file size less than minimum expected zip file size. Probably not a zip file or a corrupted zip file");
        }
        ZipModel zipModel2 = new ZipModel();
        headerReader.f84935a = zipModel2;
        try {
            zipModel2.setEndOfCentralDirectoryRecord(headerReader.c(randomAccessFile, rawIO, zip4jConfig));
            if (headerReader.f84935a.getEndOfCentralDirectoryRecord().getTotalNumberOfEntriesInCentralDirectory() == 0) {
                return headerReader.f84935a;
            }
            ZipModel zipModel3 = headerReader.f84935a;
            long offsetOfEndOfCentralDirectory = zipModel3.getEndOfCentralDirectoryRecord().getOffsetOfEndOfCentralDirectory();
            Zip64EndOfCentralDirectoryLocator zip64EndOfCentralDirectoryLocator = new Zip64EndOfCentralDirectoryLocator();
            e(randomAccessFile, offsetOfEndOfCentralDirectory - 20);
            long intLittleEndian = rawIO.readIntLittleEndian(randomAccessFile);
            HeaderSignature headerSignature = HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_LOCATOR;
            int i12 = 0;
            if (intLittleEndian == headerSignature.getValue()) {
                headerReader.f84935a.setZip64Format(true);
                zip64EndOfCentralDirectoryLocator.setSignature(headerSignature);
                zip64EndOfCentralDirectoryLocator.setNumberOfDiskStartOfZip64EndOfCentralDirectoryRecord(rawIO.readIntLittleEndian(randomAccessFile));
                zip64EndOfCentralDirectoryLocator.setOffsetZip64EndOfCentralDirectoryRecord(rawIO.readLongLittleEndian(randomAccessFile));
                zip64EndOfCentralDirectoryLocator.setTotalNumberOfDiscs(rawIO.readIntLittleEndian(randomAccessFile));
            } else {
                headerReader.f84935a.setZip64Format(false);
                zip64EndOfCentralDirectoryLocator = null;
            }
            zipModel3.setZip64EndOfCentralDirectoryLocator(zip64EndOfCentralDirectoryLocator);
            if (headerReader.f84935a.isZip64Format()) {
                ZipModel zipModel4 = headerReader.f84935a;
                if (zipModel4.getZip64EndOfCentralDirectoryLocator() == null) {
                    throw new ZipException("invalid zip64 end of central directory locator");
                }
                long offsetZip64EndOfCentralDirectoryRecord = headerReader.f84935a.getZip64EndOfCentralDirectoryLocator().getOffsetZip64EndOfCentralDirectoryRecord();
                if (offsetZip64EndOfCentralDirectoryRecord < 0) {
                    throw new ZipException("invalid offset for start of end of central directory record");
                }
                randomAccessFile.seek(offsetZip64EndOfCentralDirectoryRecord);
                Zip64EndOfCentralDirectoryRecord zip64EndOfCentralDirectoryRecord = new Zip64EndOfCentralDirectoryRecord();
                long intLittleEndian2 = rawIO.readIntLittleEndian(randomAccessFile);
                HeaderSignature headerSignature2 = HeaderSignature.ZIP64_END_CENTRAL_DIRECTORY_RECORD;
                if (intLittleEndian2 != headerSignature2.getValue()) {
                    throw new ZipException("invalid signature for zip64 end of central directory record");
                }
                zip64EndOfCentralDirectoryRecord.setSignature(headerSignature2);
                zip64EndOfCentralDirectoryRecord.setSizeOfZip64EndCentralDirectoryRecord(rawIO.readLongLittleEndian(randomAccessFile));
                zip64EndOfCentralDirectoryRecord.setVersionMadeBy(rawIO.readShortLittleEndian(randomAccessFile));
                zip64EndOfCentralDirectoryRecord.setVersionNeededToExtract(rawIO.readShortLittleEndian(randomAccessFile));
                zip64EndOfCentralDirectoryRecord.setNumberOfThisDisk(rawIO.readIntLittleEndian(randomAccessFile));
                zip64EndOfCentralDirectoryRecord.setNumberOfThisDiskStartOfCentralDirectory(rawIO.readIntLittleEndian(randomAccessFile));
                zip64EndOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectoryOnThisDisk(rawIO.readLongLittleEndian(randomAccessFile));
                zip64EndOfCentralDirectoryRecord.setTotalNumberOfEntriesInCentralDirectory(rawIO.readLongLittleEndian(randomAccessFile));
                zip64EndOfCentralDirectoryRecord.setSizeOfCentralDirectory(rawIO.readLongLittleEndian(randomAccessFile));
                zip64EndOfCentralDirectoryRecord.setOffsetStartCentralDirectoryWRTStartDiskNumber(rawIO.readLongLittleEndian(randomAccessFile));
                long sizeOfZip64EndCentralDirectoryRecord = zip64EndOfCentralDirectoryRecord.getSizeOfZip64EndCentralDirectoryRecord() - 44;
                if (sizeOfZip64EndCentralDirectoryRecord > 0) {
                    byte[] bArr3 = new byte[(int) sizeOfZip64EndCentralDirectoryRecord];
                    randomAccessFile.readFully(bArr3);
                    zip64EndOfCentralDirectoryRecord.setExtensibleDataSector(bArr3);
                }
                zipModel4.setZip64EndOfCentralDirectoryRecord(zip64EndOfCentralDirectoryRecord);
                if (headerReader.f84935a.getZip64EndOfCentralDirectoryRecord() == null || headerReader.f84935a.getZip64EndOfCentralDirectoryRecord().getNumberOfThisDisk() <= 0) {
                    headerReader.f84935a.setSplitArchive(false);
                } else {
                    headerReader.f84935a.setSplitArchive(true);
                }
            }
            ZipModel zipModel5 = headerReader.f84935a;
            Charset charset2 = zip4jConfig.getCharset();
            CentralDirectory centralDirectory2 = new CentralDirectory();
            ArrayList arrayList2 = new ArrayList();
            long offsetStartOfCentralDirectory = HeaderUtil.getOffsetStartOfCentralDirectory(headerReader.f84935a);
            ZipModel zipModel6 = headerReader.f84935a;
            long totalNumberOfEntriesInCentralDirectory = zipModel6.isZip64Format() ? zipModel6.getZip64EndOfCentralDirectoryRecord().getTotalNumberOfEntriesInCentralDirectory() : zipModel6.getEndOfCentralDirectoryRecord().getTotalNumberOfEntriesInCentralDirectory();
            randomAccessFile.seek(offsetStartOfCentralDirectory);
            int i13 = 2;
            byte[] bArr4 = new byte[2];
            byte[] bArr5 = new byte[4];
            int i14 = 0;
            while (i14 < totalNumberOfEntriesInCentralDirectory) {
                FileHeader fileHeader2 = new FileHeader();
                long intLittleEndian3 = rawIO.readIntLittleEndian(randomAccessFile);
                HeaderSignature headerSignature3 = HeaderSignature.CENTRAL_DIRECTORY;
                if (intLittleEndian3 != headerSignature3.getValue()) {
                    throw new ZipException("Expected central directory entry not found (#" + (i14 + 1) + ")");
                }
                fileHeader2.setSignature(headerSignature3);
                fileHeader2.setVersionMadeBy(rawIO.readShortLittleEndian(randomAccessFile));
                fileHeader2.setVersionNeededToExtract(rawIO.readShortLittleEndian(randomAccessFile));
                byte[] bArr6 = new byte[i13];
                randomAccessFile.readFully(bArr6);
                fileHeader2.setEncrypted(BitUtils.isBitSet(bArr6[i12], i12));
                fileHeader2.setDataDescriptorExists(BitUtils.isBitSet(bArr6[i12], 3));
                fileHeader2.setFileNameUTF8Encoded(BitUtils.isBitSet(bArr6[1], 3));
                fileHeader2.setGeneralPurposeFlag((byte[]) bArr6.clone());
                fileHeader2.setCompressionMethod(CompressionMethod.getCompressionMethodFromCode(rawIO.readShortLittleEndian(randomAccessFile)));
                fileHeader2.setLastModifiedTime(rawIO.readIntLittleEndian(randomAccessFile));
                byte[] bArr7 = bArr5;
                randomAccessFile.readFully(bArr7);
                fileHeader2.setCrc(rawIO.readLongLittleEndian(bArr7, i12));
                fileHeader2.setCompressedSize(rawIO.readLongLittleEndian(randomAccessFile, 4));
                fileHeader2.setUncompressedSize(rawIO.readLongLittleEndian(randomAccessFile, 4));
                int shortLittleEndian = rawIO.readShortLittleEndian(randomAccessFile);
                fileHeader2.setFileNameLength(shortLittleEndian);
                fileHeader2.setExtraFieldLength(rawIO.readShortLittleEndian(randomAccessFile));
                int shortLittleEndian2 = rawIO.readShortLittleEndian(randomAccessFile);
                fileHeader2.setFileCommentLength(shortLittleEndian2);
                fileHeader2.setDiskNumberStart(rawIO.readShortLittleEndian(randomAccessFile));
                randomAccessFile.readFully(bArr4);
                fileHeader2.setInternalFileAttributes((byte[]) bArr4.clone());
                randomAccessFile.readFully(bArr7);
                fileHeader2.setExternalFileAttributes((byte[]) bArr7.clone());
                randomAccessFile.readFully(bArr7);
                byte[] bArr8 = bArr4;
                fileHeader2.setOffsetLocalHeader(rawIO.readLongLittleEndian(bArr7, i12));
                if (shortLittleEndian > 0) {
                    byte[] bArr9 = new byte[shortLittleEndian];
                    randomAccessFile.readFully(bArr9);
                    fileHeader2.setFileName(HeaderUtil.decodeStringWithCharset(bArr9, fileHeader2.isFileNameUTF8Encoded(), charset2));
                    list = null;
                } else {
                    list = null;
                    fileHeader2.setFileName(null);
                }
                fileHeader2.setDirectory(headerReader.isDirectory(fileHeader2.getExternalFileAttributes(), fileHeader2.getFileName()));
                int extraFieldLength = fileHeader2.getExtraFieldLength();
                if (extraFieldLength <= 0) {
                    c10 = 4;
                } else {
                    c10 = 4;
                    if (extraFieldLength < 4) {
                        if (extraFieldLength > 0) {
                            randomAccessFile.skipBytes(extraFieldLength);
                        }
                        listEmptyList = list;
                    } else {
                        byte[] bArr10 = new byte[extraFieldLength];
                        randomAccessFile.read(bArr10);
                        try {
                            listEmptyList = headerReader.a(extraFieldLength, bArr10);
                        } catch (Exception unused) {
                            listEmptyList = Collections.emptyList();
                        }
                    }
                    fileHeader2.setExtraDataRecords(listEmptyList);
                }
                if (fileHeader2.getExtraDataRecords() == null || fileHeader2.getExtraDataRecords().size() <= 0) {
                    i10 = i14;
                    fileHeader = fileHeader2;
                    bArr = bArr7;
                    centralDirectory = centralDirectory2;
                    arrayList = arrayList2;
                    zipModel = zipModel5;
                    bArr2 = bArr8;
                    i11 = 2;
                    charset = charset2;
                } else {
                    i10 = i14;
                    bArr = bArr7;
                    fileHeader = fileHeader2;
                    bArr2 = bArr8;
                    i11 = 2;
                    centralDirectory = centralDirectory2;
                    arrayList = arrayList2;
                    zipModel = zipModel5;
                    charset = charset2;
                    Zip64ExtendedInfo zip64ExtendedInfoD = d(fileHeader2.getExtraDataRecords(), rawIO, fileHeader2.getUncompressedSize(), fileHeader2.getCompressedSize(), fileHeader2.getOffsetLocalHeader(), fileHeader2.getDiskNumberStart());
                    if (zip64ExtendedInfoD != null) {
                        fileHeader.setZip64ExtendedInfo(zip64ExtendedInfoD);
                        if (zip64ExtendedInfoD.getUncompressedSize() != -1) {
                            fileHeader.setUncompressedSize(zip64ExtendedInfoD.getUncompressedSize());
                        }
                        if (zip64ExtendedInfoD.getCompressedSize() != -1) {
                            fileHeader.setCompressedSize(zip64ExtendedInfoD.getCompressedSize());
                        }
                        if (zip64ExtendedInfoD.getOffsetLocalHeader() != -1) {
                            fileHeader.setOffsetLocalHeader(zip64ExtendedInfoD.getOffsetLocalHeader());
                        }
                        if (zip64ExtendedInfoD.getDiskNumberStart() != -1) {
                            fileHeader.setDiskNumberStart(zip64ExtendedInfoD.getDiskNumberStart());
                        }
                    }
                }
                if (fileHeader.getExtraDataRecords() != null && fileHeader.getExtraDataRecords().size() > 0 && (aESExtraDataRecordB = b(fileHeader.getExtraDataRecords(), rawIO)) != null) {
                    fileHeader.setAesExtraDataRecord(aESExtraDataRecordB);
                    fileHeader.setEncryptionMethod(EncryptionMethod.AES);
                }
                if (shortLittleEndian2 > 0) {
                    byte[] bArr11 = new byte[shortLittleEndian2];
                    randomAccessFile.readFully(bArr11);
                    fileHeader.setFileComment(HeaderUtil.decodeStringWithCharset(bArr11, fileHeader.isFileNameUTF8Encoded(), charset));
                }
                if (fileHeader.isEncrypted()) {
                    if (fileHeader.getAesExtraDataRecord() != null) {
                        fileHeader.setEncryptionMethod(EncryptionMethod.AES);
                    } else {
                        fileHeader.setEncryptionMethod(EncryptionMethod.ZIP_STANDARD);
                    }
                }
                arrayList.add(fileHeader);
                i14 = i10 + 1;
                arrayList2 = arrayList;
                centralDirectory2 = centralDirectory;
                charset2 = charset;
                i13 = i11;
                bArr4 = bArr2;
                zipModel5 = zipModel;
                bArr5 = bArr;
                i12 = 0;
                headerReader = this;
            }
            CentralDirectory centralDirectory3 = centralDirectory2;
            ZipModel zipModel7 = zipModel5;
            centralDirectory3.setFileHeaders(arrayList2);
            DigitalSignature digitalSignature = new DigitalSignature();
            long intLittleEndian4 = rawIO.readIntLittleEndian(randomAccessFile);
            HeaderSignature headerSignature4 = HeaderSignature.DIGITAL_SIGNATURE;
            if (intLittleEndian4 == headerSignature4.getValue()) {
                digitalSignature.setSignature(headerSignature4);
                digitalSignature.setSizeOfData(rawIO.readShortLittleEndian(randomAccessFile));
                if (digitalSignature.getSizeOfData() > 0) {
                    byte[] bArr12 = new byte[digitalSignature.getSizeOfData()];
                    randomAccessFile.readFully(bArr12);
                    digitalSignature.setSignatureData(new String(bArr12));
                }
            }
            zipModel7.setCentralDirectory(centralDirectory3);
            return this.f84935a;
        } catch (ZipException e5) {
            throw e5;
        } catch (IOException e7) {
            e7.printStackTrace();
            throw new ZipException("Zip headers not found. Probably not a zip file or a corrupted zip file", e7);
        }
    }

    public DataDescriptor readDataDescriptor(InputStream inputStream, boolean z10) throws IOException {
        DataDescriptor dataDescriptor = new DataDescriptor();
        byte[] bArr = new byte[4];
        Zip4jUtil.readFully(inputStream, bArr);
        RawIO rawIO = this.f84936b;
        long longLittleEndian = rawIO.readLongLittleEndian(bArr, 0);
        HeaderSignature headerSignature = HeaderSignature.EXTRA_DATA_RECORD;
        if (longLittleEndian == headerSignature.getValue()) {
            dataDescriptor.setSignature(headerSignature);
            Zip4jUtil.readFully(inputStream, bArr);
            dataDescriptor.setCrc(rawIO.readLongLittleEndian(bArr, 0));
        } else {
            dataDescriptor.setCrc(longLittleEndian);
        }
        if (z10) {
            dataDescriptor.setCompressedSize(rawIO.readLongLittleEndian(inputStream));
            dataDescriptor.setUncompressedSize(rawIO.readLongLittleEndian(inputStream));
        } else {
            dataDescriptor.setCompressedSize(rawIO.readIntLittleEndian(inputStream));
            dataDescriptor.setUncompressedSize(rawIO.readIntLittleEndian(inputStream));
        }
        return dataDescriptor;
    }

    public LocalFileHeader readLocalFileHeader(InputStream inputStream, Charset charset) throws IOException {
        AESExtraDataRecord aESExtraDataRecordB;
        Zip64ExtendedInfo zip64ExtendedInfoD;
        LocalFileHeader localFileHeader = new LocalFileHeader();
        byte[] bArr = new byte[4];
        RawIO rawIO = this.f84936b;
        int intLittleEndian = rawIO.readIntLittleEndian(inputStream);
        if (intLittleEndian == HeaderSignature.TEMPORARY_SPANNING_MARKER.getValue()) {
            intLittleEndian = rawIO.readIntLittleEndian(inputStream);
        }
        long j10 = intLittleEndian;
        HeaderSignature headerSignature = HeaderSignature.LOCAL_FILE_HEADER;
        List<ExtraDataRecord> listEmptyList = null;
        if (j10 != headerSignature.getValue()) {
            return null;
        }
        localFileHeader.setSignature(headerSignature);
        localFileHeader.setVersionNeededToExtract(rawIO.readShortLittleEndian(inputStream));
        byte[] bArr2 = new byte[2];
        if (Zip4jUtil.readFully(inputStream, bArr2) != 2) {
            throw new ZipException("Could not read enough bytes for generalPurposeFlags");
        }
        localFileHeader.setEncrypted(BitUtils.isBitSet(bArr2[0], 0));
        localFileHeader.setDataDescriptorExists(BitUtils.isBitSet(bArr2[0], 3));
        boolean z10 = true;
        localFileHeader.setFileNameUTF8Encoded(BitUtils.isBitSet(bArr2[1], 3));
        localFileHeader.setGeneralPurposeFlag((byte[]) bArr2.clone());
        localFileHeader.setCompressionMethod(CompressionMethod.getCompressionMethodFromCode(rawIO.readShortLittleEndian(inputStream)));
        localFileHeader.setLastModifiedTime(rawIO.readIntLittleEndian(inputStream));
        Zip4jUtil.readFully(inputStream, bArr);
        localFileHeader.setCrc(rawIO.readLongLittleEndian(bArr, 0));
        localFileHeader.setCompressedSize(rawIO.readLongLittleEndian(inputStream, 4));
        localFileHeader.setUncompressedSize(rawIO.readLongLittleEndian(inputStream, 4));
        int shortLittleEndian = rawIO.readShortLittleEndian(inputStream);
        localFileHeader.setFileNameLength(shortLittleEndian);
        localFileHeader.setExtraFieldLength(rawIO.readShortLittleEndian(inputStream));
        if (shortLittleEndian > 0) {
            byte[] bArr3 = new byte[shortLittleEndian];
            Zip4jUtil.readFully(inputStream, bArr3);
            String strDecodeStringWithCharset = HeaderUtil.decodeStringWithCharset(bArr3, localFileHeader.isFileNameUTF8Encoded(), charset);
            localFileHeader.setFileName(strDecodeStringWithCharset);
            if (!strDecodeStringWithCharset.endsWith("/") && !strDecodeStringWithCharset.endsWith("\\")) {
                z10 = false;
            }
            localFileHeader.setDirectory(z10);
        } else {
            localFileHeader.setFileName(null);
        }
        int extraFieldLength = localFileHeader.getExtraFieldLength();
        if (extraFieldLength > 0) {
            if (extraFieldLength >= 4) {
                byte[] bArr4 = new byte[extraFieldLength];
                Zip4jUtil.readFully(inputStream, bArr4);
                try {
                    listEmptyList = a(extraFieldLength, bArr4);
                } catch (Exception unused) {
                    listEmptyList = Collections.emptyList();
                }
            } else if (extraFieldLength > 0) {
                inputStream.skip(extraFieldLength);
            }
            localFileHeader.setExtraDataRecords(listEmptyList);
        }
        RawIO rawIO2 = this.f84936b;
        if (localFileHeader.getExtraDataRecords() != null && localFileHeader.getExtraDataRecords().size() > 0 && (zip64ExtendedInfoD = d(localFileHeader.getExtraDataRecords(), rawIO2, localFileHeader.getUncompressedSize(), localFileHeader.getCompressedSize(), 0L, 0)) != null) {
            localFileHeader.setZip64ExtendedInfo(zip64ExtendedInfoD);
            if (zip64ExtendedInfoD.getUncompressedSize() != -1) {
                localFileHeader.setUncompressedSize(zip64ExtendedInfoD.getUncompressedSize());
            }
            if (zip64ExtendedInfoD.getCompressedSize() != -1) {
                localFileHeader.setCompressedSize(zip64ExtendedInfoD.getCompressedSize());
            }
        }
        if (localFileHeader.getExtraDataRecords() != null && localFileHeader.getExtraDataRecords().size() > 0 && (aESExtraDataRecordB = b(localFileHeader.getExtraDataRecords(), rawIO)) != null) {
            localFileHeader.setAesExtraDataRecord(aESExtraDataRecordB);
            localFileHeader.setEncryptionMethod(EncryptionMethod.AES);
        }
        if (localFileHeader.isEncrypted() && localFileHeader.getEncryptionMethod() != EncryptionMethod.AES) {
            if (BitUtils.isBitSet(localFileHeader.getGeneralPurposeFlag()[0], 6)) {
                localFileHeader.setEncryptionMethod(EncryptionMethod.ZIP_STANDARD_VARIANT_STRONG);
            } else {
                localFileHeader.setEncryptionMethod(EncryptionMethod.ZIP_STANDARD);
            }
        }
        return localFileHeader;
    }
}
