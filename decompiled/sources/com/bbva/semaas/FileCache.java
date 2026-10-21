package com.bbva.semaas;

import androidx.core.util.AtomicFile;
import androidx.exifinterface.media.ExifInterface;
import bk.q;
import com.bbva.semaas.cache.MapCacheEntrySerializer;
import com.bbva.semaas.cache.MapCacheEntrySerializerKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileCache.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u001a\u0010\u0018\u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u001bJ\u0006\u0010\u001c\u001a\u00020\u0019J\b\u0010\u001d\u001a\u00020\u0019H\u0002J\u0006\u0010\u001e\u001a\u00020\u0019J\u0006\u0010\u001f\u001a\u00020\u0019J\u001a\u0010 \u001a\u00020\u00192\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u001bR \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0082\u0004¢\u0006\u0002\n\u0000R#\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r0\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/bbva/semaas/FileCache;", ExifInterface.GPS_DIRECTION_TRUE, "", "file", "Ljava/io/File;", "cipher", "Lcom/bbva/semaas/Cipher;", "typeSerializer", "Lkotlinx/serialization/KSerializer;", "(Ljava/io/File;Lcom/bbva/semaas/Cipher;Lkotlinx/serialization/KSerializer;)V", "_values", "", "", "Lcom/bbva/semaas/CacheEntry;", "Landroidx/core/util/AtomicFile;", "json", "Lkotlinx/serialization/json/Json;", "lock", "mapSerializer", "Lcom/bbva/semaas/cache/MapCacheEntrySerializer;", "values", "", "getValues", "()Ljava/util/Map;", "addEntries", "", "entries", "", "delete", "flush", "load", "removeAll", "removeEntry", "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFileCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileCache.kt\ncom/bbva/semaas/FileCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1#2:80\n1855#3,2:81\n1855#3,2:83\n*S KotlinDebug\n*F\n+ 1 FileCache.kt\ncom/bbva/semaas/FileCache\n*L\n45#1:81,2\n52#1:83,2\n*E\n"})
public final class FileCache<T> {

    @NotNull
    private Map<String, CacheEntry<T>> _values;

    @NotNull
    private final Cipher cipher;

    @NotNull
    private final AtomicFile file;

    @NotNull
    private final Json json;

    @NotNull
    private final Object lock;

    @NotNull
    private final MapCacheEntrySerializer<T> mapSerializer;

    @NotNull
    private final KSerializer<T> typeSerializer;

    public FileCache(@NotNull File file, @NotNull Cipher cipher, @NotNull KSerializer<T> typeSerializer) {
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        Intrinsics.checkNotNullParameter(typeSerializer, "typeSerializer");
        this.cipher = cipher;
        this.typeSerializer = typeSerializer;
        this.lock = new Object();
        this._values = new LinkedHashMap();
        this.file = new AtomicFile(file);
        this.json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.bbva.semaas.FileCache$json$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
                invoke2(jsonBuilder);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull JsonBuilder Json) {
                Intrinsics.checkNotNullParameter(Json, "$this$Json");
                Json.setIgnoreUnknownKeys(true);
            }
        }, 1, null);
        this.mapSerializer = MapCacheEntrySerializerKt.mapCacheEntrySerializer(typeSerializer);
    }

    private final void flush() throws IOException {
        FileOutputStream fileOutputStreamStartWrite = this.file.startWrite();
        String strEncrypt = this.cipher.encrypt(this.json.encodeToString(this.mapSerializer, this._values));
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = strEncrypt.getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        fileOutputStreamStartWrite.write(bytes);
        this.file.finishWrite(fileOutputStreamStartWrite);
    }

    public final void addEntries(@NotNull List<CacheEntry<T>> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        synchronized (this.lock) {
            try {
                for (CacheEntry<T> cacheEntry : entries) {
                    this._values.put(cacheEntry.getId(), cacheEntry);
                }
                flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void delete() {
        synchronized (this.lock) {
            this.file.delete();
            Unit unit = Unit.INSTANCE;
        }
    }

    @NotNull
    public final Map<String, CacheEntry<T>> getValues() {
        Map<String, CacheEntry<T>> map;
        synchronized (this.lock) {
            map = q.toMap(this._values);
        }
        return map;
    }

    public final void load() {
        synchronized (this.lock) {
            try {
                if (this.file.getBaseFile().exists()) {
                    FileInputStream fileInputStreamOpenRead = this.file.openRead();
                    Intrinsics.checkNotNullExpressionValue(fileInputStreamOpenRead, "file.openRead()");
                    byte[] bytes = ByteStreamsKt.readBytes(fileInputStreamOpenRead);
                    Charset UTF_8 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
                    this._values = q.toMutableMap((Map) this.json.decodeFromString(this.mapSerializer, this.cipher.decrypt(new String(bytes, UTF_8))));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void removeAll() {
        synchronized (this.lock) {
            this._values = new LinkedHashMap();
            flush();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void removeEntry(@NotNull List<CacheEntry<T>> entries) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        synchronized (this.lock) {
            try {
                Iterator<T> it = entries.iterator();
                while (it.hasNext()) {
                    this._values.remove(((CacheEntry) it.next()).getId());
                }
                flush();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
