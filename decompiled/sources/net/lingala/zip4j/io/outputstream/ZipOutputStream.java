package net.lingala.zip4j.io.outputstream;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.FileHeaderFactory;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.headers.HeaderWriter;
import net.lingala.zip4j.model.EndOfCentralDirectoryRecord;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.ZipModel;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionLevel;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import net.lingala.zip4j.util.FileUtils;
import net.lingala.zip4j.util.RawIO;
import wl.a;
import wl.b;
import wl.c;
import wl.d;
import wl.e;
import wl.f;
import wl.g;
import wl.h;

/* JADX INFO: loaded from: classes12.dex */
public class ZipOutputStream extends OutputStream {
    public long E0;
    public final Zip4jConfig F0;
    public boolean G0;
    public boolean H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CountingOutputStream f84986p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final char[] f84987q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final ZipModel f84988r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public c f84989s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public FileHeader f84990t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public LocalFileHeader f84991u0;
    public final FileHeaderFactory v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final HeaderWriter f84992w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final CRC32 f84993x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final RawIO f84994y0;

    public ZipOutputStream(OutputStream outputStream) throws IOException {
        this(outputStream, null, null);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.H0) {
            closeEntry();
        }
        ZipModel zipModel = this.f84988r0;
        EndOfCentralDirectoryRecord endOfCentralDirectoryRecord = zipModel.getEndOfCentralDirectoryRecord();
        CountingOutputStream countingOutputStream = this.f84986p0;
        endOfCentralDirectoryRecord.setOffsetOfStartOfCentralDirectory(countingOutputStream.getNumberOfBytesWritten());
        this.f84992w0.finalizeZipFile(zipModel, countingOutputStream, this.F0.getCharset());
        countingOutputStream.close();
        this.G0 = true;
    }

    public FileHeader closeEntry() throws IOException {
        this.f84989s0.b();
        long j10 = this.f84989s0.f94289p0.f94287p0.f94292p0;
        this.f84990t0.setCompressedSize(j10);
        this.f84991u0.setCompressedSize(j10);
        this.f84990t0.setUncompressedSize(this.E0);
        this.f84991u0.setUncompressedSize(this.E0);
        FileHeader fileHeader = this.f84990t0;
        boolean zIsEncrypted = fileHeader.isEncrypted();
        CRC32 crc32 = this.f84993x0;
        if (!zIsEncrypted || !fileHeader.getEncryptionMethod().equals(EncryptionMethod.AES) || fileHeader.getAesExtraDataRecord().getAesVersion().equals(AesVersion.ONE)) {
            this.f84990t0.setCrc(crc32.getValue());
            this.f84991u0.setCrc(crc32.getValue());
        }
        ZipModel zipModel = this.f84988r0;
        zipModel.getLocalFileHeaders().add(this.f84991u0);
        zipModel.getCentralDirectory().getFileHeaders().add(this.f84990t0);
        if (this.f84991u0.isDataDescriptorExists()) {
            this.f84992w0.writeExtendedLocalHeader(this.f84991u0, this.f84986p0);
        }
        this.E0 = 0L;
        crc32.reset();
        this.f84989s0.close();
        this.H0 = true;
        return this.f84990t0;
    }

    public void putNextEntry(ZipParameters zipParameters) throws IOException {
        b hVar;
        b eVar;
        c fVar;
        CompressionMethod compressionMethod = zipParameters.getCompressionMethod();
        CompressionMethod compressionMethod2 = CompressionMethod.STORE;
        if (compressionMethod == compressionMethod2 && zipParameters.getEntrySize() < 0 && !FileUtils.isZipEntryDirectory(zipParameters.getFileNameInZip()) && zipParameters.isWriteExtendedLocalFileHeader()) {
            throw new IllegalArgumentException("uncompressed size should be set for zip entries of compression type store");
        }
        ZipParameters zipParameters2 = new ZipParameters(zipParameters);
        if (FileUtils.isZipEntryDirectory(zipParameters.getFileNameInZip())) {
            zipParameters2.setWriteExtendedLocalFileHeader(false);
            zipParameters2.setCompressionMethod(compressionMethod2);
            zipParameters2.setEncryptFiles(false);
        }
        FileHeaderFactory fileHeaderFactory = this.v0;
        CountingOutputStream countingOutputStream = this.f84986p0;
        boolean zIsSplitZipFile = countingOutputStream.isSplitZipFile();
        int currentSplitFileCounter = countingOutputStream.getCurrentSplitFileCounter();
        Zip4jConfig zip4jConfig = this.F0;
        FileHeader fileHeaderGenerateFileHeader = fileHeaderFactory.generateFileHeader(zipParameters2, zIsSplitZipFile, currentSplitFileCounter, zip4jConfig.getCharset(), this.f84994y0);
        this.f84990t0 = fileHeaderGenerateFileHeader;
        fileHeaderGenerateFileHeader.setOffsetLocalHeader(countingOutputStream.getOffsetForNextEntry());
        LocalFileHeader localFileHeaderGenerateLocalFileHeader = this.v0.generateLocalFileHeader(this.f84990t0);
        this.f84991u0 = localFileHeaderGenerateLocalFileHeader;
        this.f84992w0.writeLocalFileHeader(this.f84988r0, localFileHeaderGenerateLocalFileHeader, countingOutputStream, zip4jConfig.getCharset());
        g gVar = new g();
        gVar.f94292p0 = 0L;
        gVar.f94293q0 = countingOutputStream;
        gVar.f94294r0 = false;
        if (zipParameters2.isEncryptFiles()) {
            char[] cArr = this.f84987q0;
            if (cArr == null || cArr.length == 0) {
                throw new ZipException("password not set");
            }
            if (zipParameters2.getEncryptionMethod() == EncryptionMethod.AES) {
                a aVar = new a(gVar, zipParameters2, cArr);
                aVar.f94285r0 = new byte[16];
                aVar.f94286s0 = 0;
                hVar = aVar;
            } else {
                if (zipParameters2.getEncryptionMethod() != EncryptionMethod.ZIP_STANDARD) {
                    EncryptionMethod encryptionMethod = zipParameters2.getEncryptionMethod();
                    EncryptionMethod encryptionMethod2 = EncryptionMethod.ZIP_STANDARD_VARIANT_STRONG;
                    if (encryptionMethod != encryptionMethod2) {
                        throw new ZipException("Invalid encryption method");
                    }
                    throw new ZipException(encryptionMethod2 + " encryption method is not supported");
                }
                hVar = new h(gVar, zipParameters2, cArr);
            }
            eVar = hVar;
        } else {
            eVar = new e(gVar, zipParameters2, null);
        }
        if (zipParameters2.getCompressionMethod() == CompressionMethod.DEFLATE) {
            CompressionLevel compressionLevel = zipParameters2.getCompressionLevel();
            int bufferSize = zip4jConfig.getBufferSize();
            d dVar = new d(eVar);
            dVar.f94291r0 = new Deflater(compressionLevel.getLevel(), true);
            dVar.f94290q0 = new byte[bufferSize];
            fVar = dVar;
        } else {
            fVar = new f(eVar);
        }
        this.f84989s0 = fVar;
        this.H0 = false;
    }

    public void setComment(String str) throws IOException {
        if (this.G0) {
            throw new IOException("Stream is closed");
        }
        this.f84988r0.getEndOfCentralDirectoryRecord().setComment(str);
    }

    @Override // java.io.OutputStream
    public void write(int i10) throws IOException {
        write(new byte[]{(byte) i10});
    }

    public ZipOutputStream(OutputStream outputStream, Charset charset) throws IOException {
        this(outputStream, null, charset);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public ZipOutputStream(OutputStream outputStream, char[] cArr) throws IOException {
        this(outputStream, cArr, null);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.G0) {
            this.f84993x0.update(bArr, i10, i11);
            this.f84989s0.write(bArr, i10, i11);
            this.E0 += (long) i11;
            return;
        }
        throw new IOException("Stream is closed");
    }

    public ZipOutputStream(OutputStream outputStream, char[] cArr, Charset charset) throws IOException {
        this(outputStream, cArr, new Zip4jConfig(charset, 4096), new ZipModel());
    }

    public ZipOutputStream(OutputStream outputStream, char[] cArr, Zip4jConfig zip4jConfig, ZipModel zipModel) throws IOException {
        this.v0 = new FileHeaderFactory();
        this.f84992w0 = new HeaderWriter();
        this.f84993x0 = new CRC32();
        RawIO rawIO = new RawIO();
        this.f84994y0 = rawIO;
        this.E0 = 0L;
        this.H0 = true;
        if (zip4jConfig.getBufferSize() >= 512) {
            CountingOutputStream countingOutputStream = new CountingOutputStream(outputStream);
            this.f84986p0 = countingOutputStream;
            this.f84987q0 = cArr;
            this.F0 = zip4jConfig;
            zipModel = zipModel == null ? new ZipModel() : zipModel;
            if (countingOutputStream.isSplitZipFile()) {
                zipModel.setSplitArchive(true);
                zipModel.setSplitLength(countingOutputStream.getSplitLength());
            }
            this.f84988r0 = zipModel;
            this.G0 = false;
            if (countingOutputStream.isSplitZipFile()) {
                rawIO.writeIntLittleEndian(countingOutputStream, (int) HeaderSignature.SPLIT_ZIP.getValue());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
    }
}
