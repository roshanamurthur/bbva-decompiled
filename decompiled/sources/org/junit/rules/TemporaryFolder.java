package org.junit.rules;

import androidx.camera.camera2.internal.h0;
import androidx.databinding.e;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import org.junit.Assert;

/* JADX INFO: loaded from: classes13.dex */
public class TemporaryFolder extends ExternalResource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f91942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f91943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public File f91944c;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f91945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f91946b;

        public Builder assureDeletion() {
            this.f91946b = true;
            return this;
        }

        public TemporaryFolder build() {
            return new TemporaryFolder(this);
        }

        public Builder parentFolder(File file) {
            this.f91945a = file;
            return this;
        }
    }

    public TemporaryFolder() {
        this((File) null);
    }

    public static File a(File file) throws IOException {
        try {
            return b(file);
        } catch (ClassNotFoundException unused) {
            File file2 = null;
            int i10 = 0;
            while (i10 < 10000) {
                File fileCreateTempFile = File.createTempFile("junit", ".tmp", file);
                File file3 = new File(e.c(fileCreateTempFile.toString(), 4, 0));
                if (file3.mkdir()) {
                    fileCreateTempFile.delete();
                    return file3;
                }
                fileCreateTempFile.delete();
                i10++;
                file2 = file3;
            }
            throw new IOException("Unable to create temporary directory in: " + file.toString() + ". Tried 10000 times. Last attempted to create: " + file2.toString());
        } catch (InvocationTargetException e5) {
            Throwable cause = e5.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            IOException iOException = new IOException("Failed to create temporary folder in " + file);
            iOException.initCause(cause);
            throw iOException;
        } catch (Exception e7) {
            throw new RuntimeException("Failed to create temporary folder in " + file, e7);
        }
    }

    public static File b(File file) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        Class<?> cls = Class.forName("java.nio.file.Files");
        Object objNewInstance = Array.newInstance(Class.forName("java.nio.file.attribute.FileAttribute"), 0);
        Class<?> cls2 = Class.forName("java.nio.file.Path");
        return (File) cls2.getDeclaredMethod("toFile", new Class[0]).invoke(file != null ? cls.getDeclaredMethod("createTempDirectory", cls2, String.class, objNewInstance.getClass()).invoke(null, File.class.getDeclaredMethod("toPath", new Class[0]).invoke(file, new Object[0]), "junit", objNewInstance) : cls.getDeclaredMethod("createTempDirectory", String.class, objNewInstance.getClass()).invoke(null, "junit", objNewInstance), new Object[0]);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static boolean c(File file) {
        if (file.delete()) {
            return true;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (!c(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    @Override // org.junit.rules.ExternalResource
    public void after() {
        delete();
    }

    @Override // org.junit.rules.ExternalResource
    public void before() throws Throwable {
        create();
    }

    public void create() throws IOException {
        this.f91944c = a(this.f91942a);
    }

    public void delete() {
        File file = this.f91944c;
        if (file == null || c(file) || !this.f91943b) {
            return;
        }
        Assert.fail("Unable to clean up temporary folder " + this.f91944c);
    }

    public File getRoot() {
        File file = this.f91944c;
        if (file != null) {
            return file;
        }
        throw new IllegalStateException("the temporary folder has not yet been created");
    }

    public File newFile(String str) throws IOException {
        File file = new File(getRoot(), str);
        if (file.createNewFile()) {
            return file;
        }
        throw new IOException(h0.b("a file with the name '", str, "' already exists in the test folder"));
    }

    public File newFolder(String str) throws IOException {
        return newFolder(str);
    }

    public TemporaryFolder(File file) {
        this.f91942a = file;
        this.f91943b = false;
    }

    public File newFolder(String... strArr) throws IOException {
        if (strArr.length == 0) {
            throw new IllegalArgumentException("must pass at least one path");
        }
        File root = getRoot();
        int i10 = 0;
        for (String str : strArr) {
            if (new File(str).isAbsolute()) {
                throw new IOException(h0.b("folder path '", str, "' is not a relative path"));
            }
        }
        int length = strArr.length;
        boolean z10 = true;
        File file = null;
        File file2 = root;
        while (i10 < length) {
            File file3 = new File(file, strArr[i10]);
            File file4 = new File(root, file3.getPath());
            boolean zMkdirs = file4.mkdirs();
            if (!zMkdirs && !file4.isDirectory()) {
                if (file4.exists()) {
                    throw new IOException("a file with the path '" + file3.getPath() + "' exists");
                }
                throw new IOException("could not create a folder with the path '" + file3.getPath() + "'");
            }
            i10++;
            file2 = file4;
            z10 = zMkdirs;
            file = file3;
        }
        if (z10) {
            return file2;
        }
        throw new IOException("a folder with the path '" + file.getPath() + "' already exists");
    }

    public TemporaryFolder(Builder builder) {
        this.f91942a = builder.f91945a;
        this.f91943b = builder.f91946b;
    }

    public File newFile() throws IOException {
        return File.createTempFile("junit", null, getRoot());
    }

    public File newFolder() throws IOException {
        return a(getRoot());
    }
}
