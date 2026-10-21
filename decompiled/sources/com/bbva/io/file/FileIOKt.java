package com.bbva.io.file;

import androidx.exifinterface.media.ExifInterface;
import ik.c;
import ik.e;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileIO.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a*\u0010\t\u001a\u00028\u0000\"\u0006\b\u0000\u0010\u0006\u0018\u00012\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000\u001a\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000¨\u0006\u000e"}, d2 = {"Ljava/io/File;", "file", "Lcom/bbva/io/file/Source;", "source", "", "write", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/nio/charset/Charset;", "charset", "read", "(Ljava/io/File;Ljava/nio/charset/Charset;)Ljava/lang/Object;", "", "delete", "deleteFilesIn", "io_release"}, k = 2, mv = {1, 6, 0})
@JvmName(name = "FileIOKt")
public final class FileIOKt {

    /* JADX INFO: compiled from: FileIO.kt */
    public static final class a extends Lambda implements Function1<File, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ File f34912p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Source f34913q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, Source source) {
            super(1);
            this.f34912p0 = file;
            this.f34913q0 = source;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(File file) {
            File it = file;
            Intrinsics.checkNotNullParameter(it, "it");
            SourceKt.writeSource(this.f34912p0, this.f34913q0);
            return Unit.INSTANCE;
        }
    }

    public static final boolean delete(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return file.isFile() ? file.delete() : e.deleteRecursively(file);
    }

    public static final boolean deleteFilesIn(@NotNull File file) {
        Intrinsics.checkNotNullParameter(file, "file");
        if (file.isFile()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "file.listFiles()");
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File it : fileArrListFiles) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
            arrayList.add(Boolean.valueOf(e.deleteRecursively(it)));
        }
        Iterator it2 = arrayList.iterator();
        if (!it2.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it2.next();
        while (it2.hasNext()) {
            boolean zBooleanValue = ((Boolean) it2.next()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) next).booleanValue();
            if (!zBooleanValue2) {
                zBooleanValue = zBooleanValue2;
            }
            next = Boolean.valueOf(zBooleanValue);
        }
        return ((Boolean) next).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ <T> T read(File file, Charset charset) {
        T t10;
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(BufferedReader.class))) {
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
            t10 = inputStreamReader instanceof BufferedReader ? (T) ((BufferedReader) inputStreamReader) : (T) new BufferedReader(inputStreamReader, 8192);
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(InputStreamReader.class))) {
            t10 = (T) new InputStreamReader(new FileInputStream(file), charset);
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            t10 = (T) c.readText(file, charset);
        } else {
            if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(byte[].class))) {
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                throw new UnsupportedOperationException(Object.class.getSimpleName().concat(" not supported"));
            }
            t10 = (T) c.readBytes(file);
        }
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return t10;
    }

    public static /* synthetic */ Object read$default(File file, Charset charset, int i10, Object obj) {
        Object bytes;
        if ((i10 & 2) != 0) {
            charset = Charsets.UTF_8;
        }
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(BufferedReader.class))) {
            Reader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
            bytes = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(InputStreamReader.class))) {
            bytes = new InputStreamReader(new FileInputStream(file), charset);
        } else if (Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(String.class))) {
            bytes = c.readText(file, charset);
        } else {
            if (!Intrinsics.areEqual(orCreateKotlinClass, Reflection.getOrCreateKotlinClass(byte[].class))) {
                Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
                throw new UnsupportedOperationException(Object.class.getSimpleName().concat(" not supported"));
            }
            bytes = c.readBytes(file);
        }
        Intrinsics.reifiedOperationMarker(1, ExifInterface.GPS_DIRECTION_TRUE);
        return bytes;
    }

    public static final void write(@NotNull File file, @NotNull Source source) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(source, "source");
        a aVar = new a(file, source);
        if (file.exists()) {
            file.delete();
        } else {
            file.getParentFile().mkdirs();
        }
        aVar.invoke(file);
    }
}
