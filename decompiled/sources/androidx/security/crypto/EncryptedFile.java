package androidx.security.crypto;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import com.google.crypto.tink.KeyTemplate;
import com.google.crypto.tink.KeyTemplates;
import com.google.crypto.tink.StreamingAead;
import com.google.crypto.tink.integration.android.AndroidKeysetManager;
import com.google.crypto.tink.integration.android.AndroidKeystoreKmsClient;
import com.google.crypto.tink.streamingaead.StreamingAeadConfig;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public final class EncryptedFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f23413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StreamingAead f23414b;

    public enum FileEncryptionScheme {
        AES256_GCM_HKDF_4KB;

        private final String mKeyTemplateName = "AES256_GCM_HKDF_4KB";

        public final KeyTemplate a() throws GeneralSecurityException {
            return KeyTemplates.get(this.mKeyTemplateName);
        }
    }

    public static final class a extends FileInputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final InputStream f23422p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final Object f23423q0;

        public a(FileDescriptor fileDescriptor, InputStream inputStream) {
            super(fileDescriptor);
            this.f23423q0 = new Object();
            this.f23422p0 = inputStream;
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int available() throws IOException {
            return this.f23422p0.available();
        }

        @Override // java.io.FileInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f23422p0.close();
        }

        @Override // java.io.FileInputStream
        public final FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.InputStream
        public final void mark(int i10) {
            synchronized (this.f23423q0) {
                this.f23422p0.mark(i10);
            }
        }

        @Override // java.io.InputStream
        public final boolean markSupported() {
            return this.f23422p0.markSupported();
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read() throws IOException {
            return this.f23422p0.read();
        }

        @Override // java.io.InputStream
        public final void reset() throws IOException {
            synchronized (this.f23423q0) {
                this.f23422p0.reset();
            }
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final long skip(long j10) throws IOException {
            return this.f23422p0.skip(j10);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read(@NonNull byte[] bArr) throws IOException {
            return this.f23422p0.read(bArr);
        }

        @Override // java.io.FileInputStream, java.io.InputStream
        public final int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
            return this.f23422p0.read(bArr, i10, i11);
        }
    }

    public static final class b extends FileOutputStream {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final OutputStream f23424p0;

        public b(FileDescriptor fileDescriptor, OutputStream outputStream) {
            super(fileDescriptor);
            this.f23424p0 = outputStream;
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.f23424p0.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() throws IOException {
            this.f23424p0.flush();
        }

        @Override // java.io.FileOutputStream
        @NonNull
        public final FileChannel getChannel() {
            throw new UnsupportedOperationException("For encrypted files, please open the relevant FileInput/FileOutputStream.");
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(@NonNull byte[] bArr) throws IOException {
            this.f23424p0.write(bArr);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(int i10) throws IOException {
            this.f23424p0.write(i10);
        }

        @Override // java.io.FileOutputStream, java.io.OutputStream
        public final void write(@NonNull byte[] bArr, int i10, int i11) throws IOException {
            this.f23424p0.write(bArr, i10, i11);
        }
    }

    public EncryptedFile(@NonNull File file, @NonNull StreamingAead streamingAead) {
        this.f23413a = file;
        this.f23414b = streamingAead;
    }

    @NonNull
    public FileInputStream openFileInput() throws GeneralSecurityException, IOException {
        File file = this.f23413a;
        if (!file.exists()) {
            throw new FileNotFoundException("file doesn't exist: " + file.getName());
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        return new a(fileInputStream.getFD(), this.f23414b.newDecryptingStream(fileInputStream, file.getName().getBytes(StandardCharsets.UTF_8)));
    }

    @NonNull
    public FileOutputStream openFileOutput() throws GeneralSecurityException, IOException {
        File file = this.f23413a;
        if (file.exists()) {
            throw new IOException("output file already exists, please use a new file: " + file.getName());
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        return new b(fileOutputStream.getFD(), this.f23414b.newEncryptingStream(fileOutputStream, file.getName().getBytes(StandardCharsets.UTF_8)));
    }

    public static final class Builder {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final Object f23415g = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f23416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FileEncryptionScheme f23417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f23418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f23419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f23420e = "__androidx_security_crypto_encrypted_file_pref__";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f23421f = "__androidx_security_crypto_encrypted_file_keyset__";

        @Deprecated
        public Builder(@NonNull File file, @NonNull Context context, @NonNull String str, @NonNull FileEncryptionScheme fileEncryptionScheme) {
            this.f23416a = file;
            this.f23417b = fileEncryptionScheme;
            this.f23418c = context.getApplicationContext();
            this.f23419d = str;
        }

        @NonNull
        public EncryptedFile build() throws GeneralSecurityException, IOException {
            AndroidKeysetManager androidKeysetManagerBuild;
            StreamingAeadConfig.register();
            AndroidKeysetManager.Builder builderWithMasterKeyUri = new AndroidKeysetManager.Builder().withKeyTemplate(this.f23417b.a()).withSharedPref(this.f23418c, this.f23421f, this.f23420e).withMasterKeyUri(AndroidKeystoreKmsClient.PREFIX + this.f23419d);
            synchronized (f23415g) {
                androidKeysetManagerBuild = builderWithMasterKeyUri.build();
            }
            return new EncryptedFile(this.f23416a, (StreamingAead) androidKeysetManagerBuild.getKeysetHandle().getPrimitive(StreamingAead.class));
        }

        @NonNull
        public Builder setKeysetAlias(@NonNull String str) {
            this.f23421f = str;
            return this;
        }

        @NonNull
        public Builder setKeysetPrefName(@NonNull String str) {
            this.f23420e = str;
            return this;
        }

        @SuppressLint({"StreamFiles"})
        public Builder(@NonNull Context context, @NonNull File file, @NonNull MasterKey masterKey, @NonNull FileEncryptionScheme fileEncryptionScheme) {
            this.f23416a = file;
            this.f23417b = fileEncryptionScheme;
            this.f23418c = context.getApplicationContext();
            this.f23419d = masterKey.f23436a;
        }
    }
}
