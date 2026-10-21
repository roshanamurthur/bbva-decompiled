package net.lingala.zip4j.headers;

import java.nio.charset.Charset;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.AESExtraDataRecord;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.AesKeyStrength;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import net.lingala.zip4j.util.BitUtils;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.InternalZipConstants;
import net.lingala.zip4j.util.RawIO;
import net.lingala.zip4j.util.Zip4jUtil;
import net.lingala.zip4j.util.ZipVersionUtils;

/* JADX INFO: loaded from: classes12.dex */
public class FileHeaderFactory {
    public FileHeader generateFileHeader(ZipParameters zipParameters, boolean z10, int i10, Charset charset, RawIO rawIO) throws ZipException {
        FileHeader fileHeader = new FileHeader();
        fileHeader.setSignature(HeaderSignature.CENTRAL_DIRECTORY);
        fileHeader.setVersionMadeBy(ZipVersionUtils.determineVersionMadeBy(zipParameters, rawIO));
        fileHeader.setVersionNeededToExtract(ZipVersionUtils.determineVersionNeededToExtract(zipParameters).getCode());
        if (zipParameters.isEncryptFiles() && zipParameters.getEncryptionMethod() == EncryptionMethod.AES) {
            fileHeader.setCompressionMethod(CompressionMethod.AES_INTERNAL_ONLY);
            AESExtraDataRecord aESExtraDataRecord = new AESExtraDataRecord();
            if (zipParameters.getAesVersion() != null) {
                aESExtraDataRecord.setAesVersion(zipParameters.getAesVersion());
            }
            AesKeyStrength aesKeyStrength = zipParameters.getAesKeyStrength();
            AesKeyStrength aesKeyStrength2 = AesKeyStrength.KEY_STRENGTH_128;
            if (aesKeyStrength == aesKeyStrength2) {
                aESExtraDataRecord.setAesKeyStrength(aesKeyStrength2);
            } else {
                AesKeyStrength aesKeyStrength3 = zipParameters.getAesKeyStrength();
                AesKeyStrength aesKeyStrength4 = AesKeyStrength.KEY_STRENGTH_192;
                if (aesKeyStrength3 == aesKeyStrength4) {
                    aESExtraDataRecord.setAesKeyStrength(aesKeyStrength4);
                } else {
                    AesKeyStrength aesKeyStrength5 = zipParameters.getAesKeyStrength();
                    AesKeyStrength aesKeyStrength6 = AesKeyStrength.KEY_STRENGTH_256;
                    if (aesKeyStrength5 != aesKeyStrength6) {
                        throw new ZipException("invalid AES key strength");
                    }
                    aESExtraDataRecord.setAesKeyStrength(aesKeyStrength6);
                }
            }
            aESExtraDataRecord.setCompressionMethod(zipParameters.getCompressionMethod());
            fileHeader.setAesExtraDataRecord(aESExtraDataRecord);
            fileHeader.setExtraFieldLength(fileHeader.getExtraFieldLength() + 11);
        } else {
            fileHeader.setCompressionMethod(zipParameters.getCompressionMethod());
        }
        if (zipParameters.isEncryptFiles()) {
            if (zipParameters.getEncryptionMethod() == null || zipParameters.getEncryptionMethod() == EncryptionMethod.NONE) {
                throw new ZipException("Encryption method has to be set when encryptFiles flag is set in zip parameters");
            }
            fileHeader.setEncrypted(true);
            fileHeader.setEncryptionMethod(zipParameters.getEncryptionMethod());
        }
        String fileNameInZip = zipParameters.getFileNameInZip();
        if (!Zip4jUtil.isStringNotNullAndNotEmpty(fileNameInZip)) {
            throw new ZipException("fileNameInZip is null or empty");
        }
        fileHeader.setFileName(fileNameInZip);
        fileHeader.setFileNameLength(HeaderUtil.getBytesFromString(fileNameInZip, charset).length);
        if (!z10) {
            i10 = 0;
        }
        fileHeader.setDiskNumberStart(i10);
        if (zipParameters.getLastModifiedFileTime() > 0) {
            fileHeader.setLastModifiedTime(Zip4jUtil.epochToExtendedDosTime(zipParameters.getLastModifiedFileTime()));
        } else {
            fileHeader.setLastModifiedTime(Zip4jUtil.epochToExtendedDosTime(System.currentTimeMillis()));
        }
        boolean zIsZipEntryDirectory = FileUtils.isZipEntryDirectory(fileNameInZip);
        fileHeader.setDirectory(zIsZipEntryDirectory);
        fileHeader.setExternalFileAttributes(FileUtils.getDefaultFileAttributes(zIsZipEntryDirectory));
        if (zipParameters.isWriteExtendedLocalFileHeader() && zipParameters.getEntrySize() == -1) {
            fileHeader.setUncompressedSize(0L);
        } else {
            fileHeader.setUncompressedSize(zipParameters.getEntrySize());
        }
        if (zipParameters.isEncryptFiles() && zipParameters.getEncryptionMethod() == EncryptionMethod.ZIP_STANDARD) {
            fileHeader.setCrc(zipParameters.getEntryCRC());
        }
        byte[] bArr = new byte[2];
        byte bit = fileHeader.isEncrypted() ? BitUtils.setBit((byte) 0, 0) : (byte) 0;
        if (CompressionMethod.DEFLATE.equals(zipParameters.getCompressionMethod())) {
            if (CompressionLevel.NORMAL.equals(zipParameters.getCompressionLevel())) {
                bit = BitUtils.unsetBit(BitUtils.unsetBit(bit, 1), 2);
            } else if (CompressionLevel.MAXIMUM.equals(zipParameters.getCompressionLevel())) {
                bit = BitUtils.unsetBit(BitUtils.setBit(bit, 1), 2);
            } else if (CompressionLevel.FAST.equals(zipParameters.getCompressionLevel())) {
                bit = BitUtils.setBit(BitUtils.unsetBit(bit, 1), 2);
            } else if (CompressionLevel.FASTEST.equals(zipParameters.getCompressionLevel()) || CompressionLevel.ULTRA.equals(zipParameters.getCompressionLevel())) {
                bit = BitUtils.setBit(BitUtils.setBit(bit, 1), 2);
            }
        }
        if (zipParameters.isWriteExtendedLocalFileHeader()) {
            bit = BitUtils.setBit(bit, 3);
        }
        bArr[0] = bit;
        if (charset == null || InternalZipConstants.CHARSET_UTF_8.equals(charset)) {
            bArr[1] = BitUtils.setBit(bArr[1], 3);
        }
        fileHeader.setGeneralPurposeFlag(bArr);
        fileHeader.setDataDescriptorExists(zipParameters.isWriteExtendedLocalFileHeader());
        fileHeader.setFileComment(zipParameters.getFileComment());
        return fileHeader;
    }

    public LocalFileHeader generateLocalFileHeader(FileHeader fileHeader) {
        LocalFileHeader localFileHeader = new LocalFileHeader();
        localFileHeader.setSignature(HeaderSignature.LOCAL_FILE_HEADER);
        localFileHeader.setVersionNeededToExtract(fileHeader.getVersionNeededToExtract());
        localFileHeader.setCompressionMethod(fileHeader.getCompressionMethod());
        localFileHeader.setLastModifiedTime(fileHeader.getLastModifiedTime());
        localFileHeader.setUncompressedSize(fileHeader.getUncompressedSize());
        localFileHeader.setFileNameLength(fileHeader.getFileNameLength());
        localFileHeader.setFileName(fileHeader.getFileName());
        localFileHeader.setEncrypted(fileHeader.isEncrypted());
        localFileHeader.setEncryptionMethod(fileHeader.getEncryptionMethod());
        localFileHeader.setAesExtraDataRecord(fileHeader.getAesExtraDataRecord());
        localFileHeader.setCrc(fileHeader.getCrc());
        localFileHeader.setCompressedSize(fileHeader.getCompressedSize());
        localFileHeader.setGeneralPurposeFlag((byte[]) fileHeader.getGeneralPurposeFlag().clone());
        localFileHeader.setDataDescriptorExists(fileHeader.isDataDescriptorExists());
        localFileHeader.setExtraFieldLength(fileHeader.getExtraFieldLength());
        return localFileHeader;
    }
}
