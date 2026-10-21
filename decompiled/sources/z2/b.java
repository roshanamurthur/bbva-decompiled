package z2;

import ad.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

/* JADX INFO: compiled from: MultiDexExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final File f94938p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final long f94939q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final File f94940r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final RandomAccessFile f94941s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final FileChannel f94942t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final FileLock f94943u0;

    /* JADX INFO: compiled from: MultiDexExtractor.java */
    public static class a extends File {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public long f94944p0;

        public a(File file, String str) {
            super(file, str);
            this.f94944p0 = -1L;
        }
    }

    public b(File file, File file2) throws Throwable {
        file.getPath();
        file2.getPath();
        this.f94938p0 = file;
        this.f94940r0 = file2;
        this.f94939q0 = c(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, RootService.RW);
        this.f94941s0 = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f94942t0 = channel;
            try {
                file3.getPath();
                this.f94943u0 = channel.lock();
                file3.getPath();
            } catch (IOException e5) {
                e = e5;
                a(this.f94942t0);
                throw e;
            } catch (Error e7) {
                e = e7;
                a(this.f94942t0);
                throw e;
            } catch (RuntimeException e10) {
                e = e10;
                a(this.f94942t0);
                throw e;
            }
        } catch (IOException e11) {
            e = e11;
            a(this.f94941s0);
            throw e;
        } catch (Error e12) {
            e = e12;
            a(this.f94941s0);
            throw e;
        } catch (RuntimeException e13) {
            e = e13;
            a(this.f94941s0);
            throw e;
        }
    }

    public static void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e5) {
            Log.w("MultiDex", "Failed to close resource", e5);
        }
    }

    public static void b(ZipFile zipFile, ZipEntry zipEntry, a aVar, String str) throws IOException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File fileCreateTempFile = File.createTempFile(f.d("tmp-", str), ".zip", aVar.getParentFile());
        fileCreateTempFile.getPath();
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(fileCreateTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int i10 = inputStream.read(bArr); i10 != -1; i10 = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, i10);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!fileCreateTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + fileCreateTempFile.getAbsolutePath() + "\" (tmp of \"" + aVar.getAbsolutePath() + "\")");
                }
                aVar.getPath();
                if (fileCreateTempFile.renameTo(aVar)) {
                    a(inputStream);
                    fileCreateTempFile.delete();
                    return;
                }
                throw new IOException("Failed to rename \"" + fileCreateTempFile.getAbsolutePath() + "\" to \"" + aVar.getAbsolutePath() + "\"");
            } catch (Throwable th2) {
                zipOutputStream.close();
                throw th2;
            }
        } catch (Throwable th3) {
            a(inputStream);
            fileCreateTempFile.delete();
            throw th3;
        }
    }

    public static long c(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            c.a aVarA = c.a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j10 = aVarA.f94946b;
            randomAccessFile.seek(aVarA.f94945a);
            byte[] bArr = new byte[16384];
            int i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
            while (i10 != -1) {
                crc32.update(bArr, 0, i10);
                j10 -= (long) i10;
                if (j10 == 0) {
                    break;
                }
                i10 = randomAccessFile.read(bArr, 0, (int) Math.min(16384L, j10));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th2) {
            randomAccessFile.close();
            throw th2;
        }
    }

    public static void m(Context context, String str, long j10, long j11, ArrayList arrayList) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("multidex.version", 4).edit();
        editorEdit.putLong(str + "timestamp", j10);
        editorEdit.putLong(d.f(new StringBuilder(), str, "crc"), j11);
        editorEdit.putInt(str + "dex.number", arrayList.size() + 1);
        Iterator it = arrayList.iterator();
        int i10 = 2;
        while (it.hasNext()) {
            a aVar = (a) it.next();
            editorEdit.putLong(str + "dex.crc." + i10, aVar.f94944p0);
            editorEdit.putLong(str + "dex.time." + i10, aVar.lastModified());
            i10++;
        }
        editorEdit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f94943u0.release();
        this.f94942t0.close();
        this.f94941s0.close();
    }

    public final ArrayList d(Context context, String str, boolean z10) throws Throwable {
        ArrayList arrayListL;
        File file = this.f94938p0;
        file.getPath();
        if (!this.f94943u0.isValid()) {
            throw new IllegalStateException("MultiDexExtractor was closed");
        }
        if (!z10) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
            long j10 = sharedPreferences.getLong(str + "timestamp", -1L);
            long jLastModified = file.lastModified();
            if (jLastModified == -1) {
                jLastModified--;
            }
            if (j10 == jLastModified) {
                if (sharedPreferences.getLong(str + "crc", -1L) == this.f94939q0) {
                    try {
                        arrayListL = e(context, str);
                    } catch (IOException e5) {
                        Log.w("MultiDex", "Failed to reload existing extracted secondary dex files, falling back to fresh extraction", e5);
                        arrayListL = l();
                        long jLastModified2 = file.lastModified();
                        if (jLastModified2 == -1) {
                            jLastModified2--;
                        }
                        m(context, str, jLastModified2, this.f94939q0, arrayListL);
                    }
                }
            }
            arrayListL.size();
            return arrayListL;
        }
        arrayListL = l();
        long jLastModified3 = file.lastModified();
        if (jLastModified3 == -1) {
            jLastModified3--;
        }
        m(context, str, jLastModified3, this.f94939q0, arrayListL);
        arrayListL.size();
        return arrayListL;
    }

    public final ArrayList e(Context context, String str) throws IOException {
        String str2 = this.f94938p0.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i10 = sharedPreferences.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i10 + (-1));
        int i11 = 2;
        while (i11 <= i10) {
            a aVar = new a(this.f94940r0, str2 + i11 + ".zip");
            if (!aVar.isFile()) {
                throw new IOException("Missing extracted secondary dex file '" + aVar.getPath() + "'");
            }
            aVar.f94944p0 = c(aVar);
            long j10 = sharedPreferences.getLong(str + "dex.crc." + i11, -1L);
            long j11 = sharedPreferences.getLong(str + "dex.time." + i11, -1L);
            long jLastModified = aVar.lastModified();
            if (j11 == jLastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (j10 == aVar.f94944p0) {
                    arrayList.add(aVar);
                    i11++;
                    sharedPreferences = sharedPreferences2;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + aVar + " (key \"" + str + "\"), expected modification time: " + j11 + ", modification time: " + jLastModified + ", expected crc: " + j10 + ", file crc: " + aVar.f94944p0);
        }
        return arrayList;
    }

    public final ArrayList l() throws Throwable {
        Throwable th2;
        boolean z10;
        StringBuilder sb2 = new StringBuilder();
        File file = this.f94938p0;
        sb2.append(file.getName());
        sb2.append(".classes");
        String string = sb2.toString();
        z2.a aVar = new z2.a();
        File file2 = this.f94940r0;
        File[] fileArrListFiles = file2.listFiles(aVar);
        String str = "MultiDex";
        if (fileArrListFiles == null) {
            Log.w("MultiDex", "Failed to list secondary dex dir content (" + file2.getPath() + ").");
        } else {
            for (File file3 : fileArrListFiles) {
                file3.getPath();
                file3.length();
                if (file3.delete()) {
                    file3.getPath();
                } else {
                    Log.w("MultiDex", "Failed to delete old file " + file3.getPath());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(file);
        try {
            int i10 = 2;
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                a aVar2 = new a(file2, string + i10 + ".zip");
                arrayList.add(aVar2);
                aVar2.toString();
                int i11 = 0;
                boolean z11 = false;
                while (i11 < 3 && !z11) {
                    int i12 = i11 + 1;
                    b(zipFile, entry, aVar2, string);
                    String str2 = str;
                    try {
                        aVar2.f94944p0 = c(aVar2);
                        z10 = true;
                        str = str2;
                    } catch (IOException e5) {
                        try {
                            str = str2;
                            Log.w(str, "Failed to read crc from " + aVar2.getAbsolutePath(), e5);
                            z10 = false;
                        } catch (Throwable th3) {
                            th = th3;
                            str = str2;
                        }
                    } catch (Throwable th4) {
                        th2 = th4;
                        str = str2;
                    }
                    aVar2.getAbsolutePath();
                    aVar2.length();
                    if (!z10) {
                        aVar2.delete();
                        if (aVar2.exists()) {
                            Log.w(str, "Failed to delete corrupted secondary dex '" + aVar2.getPath() + "'");
                        }
                    }
                    z11 = z10;
                    i11 = i12;
                }
                if (!z11) {
                    throw new IOException("Could not create zip file " + aVar2.getAbsolutePath() + " for secondary dex (" + i10 + ")");
                }
                i10++;
                entry = zipFile.getEntry("classes" + i10 + ".dex");
                th2 = th;
                try {
                    zipFile.close();
                    throw th2;
                } catch (IOException e7) {
                    Log.w(str, "Failed to close resource", e7);
                    throw th2;
                }
            }
            try {
                zipFile.close();
            } catch (IOException e10) {
                Log.w(str, "Failed to close resource", e10);
            }
            return arrayList;
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
