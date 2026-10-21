package com.bbva.component.dm.storage.data;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.storage.Mappable;
import com.bbva.component.dm.storage.data.datasource.SharedPreferencesDataSource;
import com.bbva.component.dm.storage.domain.model.Entry;
import com.bbva.component.dm.storage.domain.model.EntryKey;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPreferencesRepository.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\b\u001a\u00020\u00052\u0016\u0010\u0004\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t0\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0007J+\u0010\b\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000b0\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0007J5\u0010\b\u001a\u00020\u00052$\u0010\u0004\u001a \u0012\u001c\u0012\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b\u0018\u00010\t0\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\f0\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0007J#\u0010\b\u001a\u00020\u00052\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00100\u0002H\u0007¢\u0006\u0004\b\u0011\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002H\u0007¢\u0006\u0004\b\u0013\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00140\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00160\u0002H\u0007¢\u0006\u0004\b\u0017\u0010\u0007J\u001d\u0010\b\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00180\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u0007J'\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001a*\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ(\u0010\u001f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\t\"\b\b\u0000\u0010\u001a*\u00020\u00032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u001e\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b2\u0006\u0010 \u001a\u00020\fJ&\u0010\"\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b\u0018\u00010\t2\u0006\u0010 \u001a\u00020\fJ\u001d\u0010#\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u001a2\u0006\u0010 \u001a\u00020\f¢\u0006\u0004\b#\u0010$J\u000e\u0010%\u001a\u00020\u00052\u0006\u0010 \u001a\u00020\f¨\u0006*"}, d2 = {"Lcom/bbva/component/dm/storage/data/SharedPreferencesRepository;", "", "Lcom/bbva/component/dm/storage/domain/model/Entry;", "Lcom/bbva/component/dm/storage/Mappable;", "entry", "", "saveMappable", "(Lcom/bbva/component/dm/storage/domain/model/Entry;)V", "save", "", "saveListMappable", "", "", "saveMap", "saveListMap", "saveString", "", "saveStringSet", "", "saveInt", "", "saveLong", "", "saveFloat", "", "saveBoolean", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/component/dm/storage/domain/model/EntryKey;", "entryKey", "getObject", "(Lcom/bbva/component/dm/storage/domain/model/EntryKey;)Lcom/bbva/component/dm/storage/Mappable;", "getList", "key", "getMap", "getMapList", "get", "(Ljava/lang/String;)Ljava/lang/Object;", RemoveCommand.ID, "Lcom/bbva/component/dm/storage/data/datasource/SharedPreferencesDataSource;", "dataSource", "<init>", "(Lcom/bbva/component/dm/storage/data/datasource/SharedPreferencesDataSource;)V", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final class SharedPreferencesRepository {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferencesDataSource f28142a;

    public SharedPreferencesRepository(@NotNull SharedPreferencesDataSource sharedPreferencesDataSource) {
        this.f28142a = sharedPreferencesDataSource;
    }

    @Nullable
    public final <T> T get(@NotNull String key) {
        return (T) this.f28142a.get(key);
    }

    @Nullable
    public final <T extends Mappable> List<T> getList(@NotNull EntryKey<T> entryKey) {
        return this.f28142a.getList(entryKey.getKey(), entryKey.getClazz());
    }

    @Nullable
    public final Map<String, Object> getMap(@NotNull String key) {
        return this.f28142a.getMap(key);
    }

    @Nullable
    public final List<Map<String, Object>> getMapList(@NotNull String key) {
        return this.f28142a.getMapList(key);
    }

    @Nullable
    public final <T extends Mappable> T getObject(@NotNull EntryKey<T> entryKey) {
        return (T) this.f28142a.getObject(entryKey.getKey(), entryKey.getClazz());
    }

    public final void remove(@NotNull String key) {
        this.f28142a.remove(key);
    }

    @JvmName(name = "saveBoolean")
    public final void saveBoolean(@NotNull Entry<Boolean> entry) {
        this.f28142a.save(entry.getKey(), entry.getValue());
    }

    @JvmName(name = "saveFloat")
    public final void saveFloat(@NotNull Entry<Float> entry) {
        this.f28142a.save(entry.getKey(), entry.getValue());
    }

    @JvmName(name = "saveInt")
    public final void saveInt(@NotNull Entry<Integer> entry) {
        this.f28142a.save(entry.getKey(), entry.getValue());
    }

    @JvmName(name = "saveListMap")
    public final void saveListMap(@NotNull Entry<? extends List<? extends Map<String, ? extends Object>>> entry) {
        this.f28142a.saveMapList(entry.getKey(), entry.getValue());
    }

    @JvmName(name = "saveListMappable")
    public final void saveListMappable(@NotNull Entry<? extends List<? extends Mappable>> entry) {
        this.f28142a.save(entry.getKey(), entry.getValue());
    }

    @JvmName(name = "saveLong")
    public final void saveLong(@NotNull Entry<Long> entry) {
        this.f28142a.save(entry.getKey(), entry.getValue());
    }

    @JvmName(name = "saveMap")
    public final void saveMap(@NotNull Entry<? extends Map<String, ? extends Object>> entry) {
        this.f28142a.save(entry.getKey(), entry.getValue());
    }

    @JvmName(name = "saveMappable")
    public final void saveMappable(@NotNull Entry<? extends Mappable> entry) {
        this.f28142a.save(entry.getKey(), entry.getValue());
    }

    @JvmName(name = "saveString")
    public final void saveString(@NotNull Entry<String> entry) {
        this.f28142a.save(entry.getKey(), entry.getValue());
    }

    @JvmName(name = "saveStringSet")
    public final void saveStringSet(@NotNull Entry<? extends Set<String>> entry) {
        this.f28142a.save(entry.getKey(), entry.getValue());
    }
}
