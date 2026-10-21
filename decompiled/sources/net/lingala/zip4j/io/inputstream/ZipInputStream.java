package net.lingala.zip4j.io.inputstream;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.zip.CRC32;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.headers.HeaderReader;
import net.lingala.zip4j.headers.HeaderSignature;
import net.lingala.zip4j.model.DataDescriptor;
import net.lingala.zip4j.model.ExtraDataRecord;
import net.lingala.zip4j.model.FileHeader;
import net.lingala.zip4j.model.LocalFileHeader;
import net.lingala.zip4j.model.Zip4jConfig;
import net.lingala.zip4j.model.enums.AesVersion;
import net.lingala.zip4j.model.enums.CompressionMethod;
import net.lingala.zip4j.model.enums.EncryptionMethod;
import net.lingala.zip4j.util.PasswordCallback;
import net.lingala.zip4j.util.Zip4jUtil;

/* JADX INFO: loaded from: classes12.dex */
public class ZipInputStream extends InputStream {
    public boolean E0;
    public boolean F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final PushbackInputStream f84954p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public c f84955q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final HeaderReader f84956r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public char[] f84957s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final PasswordCallback f84958t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public LocalFileHeader f84959u0;
    public final CRC32 v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public byte[] f84960w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f84961x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Zip4jConfig f84962y0;

    public ZipInputStream(InputStream inputStream) {
        this(inputStream, (char[]) null, (Charset) null);
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        if (this.E0) {
            throw new IOException("Stream closed");
        }
        return !this.F0 ? 1 : 0;
    }

    public final void b() throws IOException {
        c cVar = this.f84955q0;
        PushbackInputStream pushbackInputStream = this.f84954p0;
        cVar.pushBackInputStreamIfNecessary(pushbackInputStream);
        this.f84955q0.endOfEntryReached(pushbackInputStream);
        if (this.f84959u0.isDataDescriptorExists() && !this.f84961x0) {
            List<ExtraDataRecord> extraDataRecords = this.f84959u0.getExtraDataRecords();
            boolean z10 = false;
            if (extraDataRecords != null) {
                Iterator<ExtraDataRecord> it = extraDataRecords.iterator();
                while (it.hasNext()) {
                    if (it.next().getHeader() == HeaderSignature.ZIP64_EXTRA_FIELD_SIGNATURE.getValue()) {
                        z10 = true;
                        break;
                    }
                }
            }
            DataDescriptor dataDescriptor = this.f84956r0.readDataDescriptor(pushbackInputStream, z10);
            this.f84959u0.setCompressedSize(dataDescriptor.getCompressedSize());
            this.f84959u0.setUncompressedSize(dataDescriptor.getUncompressedSize());
            this.f84959u0.setCrc(dataDescriptor.getCrc());
        }
        EncryptionMethod encryptionMethod = this.f84959u0.getEncryptionMethod();
        EncryptionMethod encryptionMethod2 = EncryptionMethod.AES;
        CRC32 crc32 = this.v0;
        if ((encryptionMethod == encryptionMethod2 && this.f84959u0.getAesExtraDataRecord().getAesVersion().equals(AesVersion.TWO)) || this.f84959u0.getCrc() == crc32.getValue()) {
            this.f84959u0 = null;
            crc32.reset();
            this.F0 = true;
            return;
        }
        ZipException.Type type = ZipException.Type.CHECKSUM_MISMATCH;
        LocalFileHeader localFileHeader = this.f84959u0;
        if (localFileHeader.isEncrypted() && EncryptionMethod.ZIP_STANDARD.equals(localFileHeader.getEncryptionMethod())) {
            type = ZipException.Type.WRONG_PASSWORD;
        }
        throw new ZipException("Reached end of entry, but crc verification failed for " + this.f84959u0.getFileName(), type);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.E0) {
            return;
        }
        c cVar = this.f84955q0;
        if (cVar != null) {
            cVar.close();
        }
        this.E0 = true;
    }

    public LocalFileHeader getNextEntry() throws IOException {
        return getNextEntry(null, true);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    public void setPassword(char[] cArr) {
        this.f84957s0 = cArr;
    }

    public ZipInputStream(InputStream inputStream, Charset charset) {
        this(inputStream, (char[]) null, charset);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0103  */
    public LocalFileHeader getNextEntry(FileHeader fileHeader, boolean z10) throws IOException {
        int saltLength;
        long uncompressedSize;
        b gVar;
        PasswordCallback passwordCallback;
        LocalFileHeader localFileHeader = this.f84959u0;
        if (localFileHeader != null && z10 && ((!localFileHeader.isDirectory() && this.f84959u0.getCompressedSize() != 0) || this.f84959u0.isDataDescriptorExists())) {
            if (this.f84960w0 == null) {
                this.f84960w0 = new byte[512];
            }
            while (read(this.f84960w0) != -1) {
            }
            this.F0 = true;
        }
        PushbackInputStream pushbackInputStream = this.f84954p0;
        Zip4jConfig zip4jConfig = this.f84962y0;
        LocalFileHeader localFileHeader2 = this.f84956r0.readLocalFileHeader(pushbackInputStream, zip4jConfig.getCharset());
        this.f84959u0 = localFileHeader2;
        if (localFileHeader2 == null) {
            return null;
        }
        if (localFileHeader2.isEncrypted() && this.f84957s0 == null && (passwordCallback = this.f84958t0) != null) {
            setPassword(passwordCallback.getPassword());
        }
        LocalFileHeader localFileHeader3 = this.f84959u0;
        String fileName = localFileHeader3.getFileName();
        if (!fileName.endsWith("/") && !fileName.endsWith("\\") && localFileHeader3.getCompressionMethod() == CompressionMethod.STORE && localFileHeader3.getUncompressedSize() < 0) {
            throw new IOException("Invalid local file header for: " + localFileHeader3.getFileName() + ". Uncompressed size has to be set for entry of compression type store which is not a directory");
        }
        this.v0.reset();
        if (fileHeader != null) {
            this.f84959u0.setCrc(fileHeader.getCrc());
            this.f84959u0.setCompressedSize(fileHeader.getCompressedSize());
            this.f84959u0.setUncompressedSize(fileHeader.getUncompressedSize());
            this.f84959u0.setDirectory(fileHeader.isDirectory());
            this.f84961x0 = true;
        } else {
            this.f84961x0 = false;
        }
        LocalFileHeader localFileHeader4 = this.f84959u0;
        if (Zip4jUtil.getCompressionMethod(localFileHeader4).equals(CompressionMethod.STORE)) {
            uncompressedSize = localFileHeader4.getUncompressedSize();
        } else if (!localFileHeader4.isDataDescriptorExists() || this.f84961x0) {
            long compressedSize = localFileHeader4.getCompressedSize();
            if (localFileHeader4.isEncrypted()) {
                saltLength = 12;
                if (localFileHeader4.getEncryptionMethod().equals(EncryptionMethod.AES)) {
                    saltLength = 12 + localFileHeader4.getAesExtraDataRecord().getAesKeyStrength().getSaltLength();
                } else if (!localFileHeader4.getEncryptionMethod().equals(EncryptionMethod.ZIP_STANDARD)) {
                    saltLength = 0;
                }
            } else {
                saltLength = 0;
            }
            uncompressedSize = compressedSize - ((long) saltLength);
        } else {
            uncompressedSize = -1;
        }
        f fVar = new f();
        fVar.f84975q0 = 0L;
        fVar.f84976r0 = new byte[1];
        fVar.f84974p0 = pushbackInputStream;
        fVar.f84977s0 = uncompressedSize;
        if (!localFileHeader4.isEncrypted()) {
            gVar = new d(fVar, localFileHeader4, this.f84957s0, zip4jConfig.getBufferSize());
        } else if (localFileHeader4.getEncryptionMethod() == EncryptionMethod.AES) {
            a aVar = new a(fVar, localFileHeader4, this.f84957s0, zip4jConfig.getBufferSize());
            aVar.f84964u0 = new byte[1];
            aVar.v0 = new byte[16];
            aVar.f84965w0 = 0;
            aVar.f84966x0 = 0;
            aVar.f84967y0 = 0;
            aVar.E0 = 0;
            aVar.F0 = 0;
            aVar.G0 = 0;
            gVar = aVar;
        } else {
            if (localFileHeader4.getEncryptionMethod() != EncryptionMethod.ZIP_STANDARD) {
                throw new ZipException(String.format("Entry [%s] Strong Encryption not supported", localFileHeader4.getFileName()), ZipException.Type.UNSUPPORTED_ENCRYPTION);
            }
            gVar = new g(fVar, localFileHeader4, this.f84957s0, zip4jConfig.getBufferSize());
        }
        this.f84955q0 = Zip4jUtil.getCompressionMethod(localFileHeader4) == CompressionMethod.DEFLATE ? new InflaterInputStream(gVar, zip4jConfig.getBufferSize()) : new e(gVar);
        this.F0 = false;
        return this.f84959u0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public ZipInputStream(InputStream inputStream, char[] cArr) {
        this(inputStream, cArr, (Charset) null);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.E0) {
            throw new IOException("Stream closed");
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Negative read length");
        }
        if (i11 == 0) {
            return 0;
        }
        if (this.f84959u0 == null) {
            return -1;
        }
        try {
            int i12 = this.f84955q0.read(bArr, i10, i11);
            if (i12 == -1) {
                b();
            } else {
                this.v0.update(bArr, i10, i12);
            }
            return i12;
        } catch (IOException e5) {
            LocalFileHeader localFileHeader = this.f84959u0;
            if (localFileHeader.isEncrypted() && EncryptionMethod.ZIP_STANDARD.equals(localFileHeader.getEncryptionMethod())) {
                throw new ZipException(e5.getMessage(), e5.getCause(), ZipException.Type.WRONG_PASSWORD);
            }
            throw e5;
        }
    }

    public ZipInputStream(InputStream inputStream, PasswordCallback passwordCallback) {
        this(inputStream, passwordCallback, (Charset) null);
    }

    public ZipInputStream(InputStream inputStream, char[] cArr, Charset charset) {
        this(inputStream, cArr, new Zip4jConfig(charset, 4096));
    }

    public ZipInputStream(InputStream inputStream, PasswordCallback passwordCallback, Charset charset) {
        this(inputStream, passwordCallback, new Zip4jConfig(charset, 4096));
    }

    public ZipInputStream(InputStream inputStream, char[] cArr, Zip4jConfig zip4jConfig) {
        this(inputStream, cArr, null, zip4jConfig);
    }

    public ZipInputStream(InputStream inputStream, PasswordCallback passwordCallback, Zip4jConfig zip4jConfig) {
        this(inputStream, null, passwordCallback, zip4jConfig);
    }

    public ZipInputStream(InputStream inputStream, char[] cArr, PasswordCallback passwordCallback, Zip4jConfig zip4jConfig) {
        this.f84956r0 = new HeaderReader();
        this.v0 = new CRC32();
        this.f84961x0 = false;
        this.E0 = false;
        this.F0 = false;
        if (zip4jConfig.getBufferSize() >= 512) {
            this.f84954p0 = new PushbackInputStream(inputStream, zip4jConfig.getBufferSize());
            this.f84957s0 = cArr;
            this.f84958t0 = passwordCallback;
            this.f84962y0 = zip4jConfig;
            return;
        }
        throw new IllegalArgumentException("Buffer size cannot be less than 512 bytes");
    }
}
