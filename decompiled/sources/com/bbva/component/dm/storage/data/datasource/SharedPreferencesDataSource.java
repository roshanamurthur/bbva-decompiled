package com.bbva.component.dm.storage.data.datasource;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.storage.Mappable;
import com.bbva.component.dm.storage.PrefsStorageDataManager;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: SharedPreferencesDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J)\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ*\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\nJ&\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000bJ7\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u001e\u0010\u0006\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000eJ\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\b\u0010\u0010J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\b\u0010\u0012J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\b\u0010\u0014J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\b\u0010\u0016J1\u0010\u0019\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ2\u0010\u001b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\n\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017J\u001e\u0010\u001c\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b2\u0006\u0010\u0005\u001a\u00020\u0004J&\u0010\u001d\u001a\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u0004J\u001d\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006%"}, d2 = {"Lcom/bbva/component/dm/storage/data/datasource/SharedPreferencesDataSource;", "", "Lcom/bbva/component/dm/storage/Mappable;", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "value", "", "save", "(Ljava/lang/String;Lcom/bbva/component/dm/storage/Mappable;)V", "", "", "saveMapList", "(Ljava/lang/String;Ljava/util/List;)V", "", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "", "(Ljava/lang/String;Ljava/lang/Long;)V", "", "(Ljava/lang/String;Ljava/lang/Float;)V", "", "(Ljava/lang/String;Ljava/lang/Boolean;)V", "Ljava/lang/Class;", "clazz", "getObject", "(Ljava/lang/String;Ljava/lang/Class;)Lcom/bbva/component/dm/storage/Mappable;", "getList", "getMap", "getMapList", "get", "(Ljava/lang/String;)Ljava/lang/Object;", RemoveCommand.ID, "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "component-dm-storage_release"}, k = 1, mv = {1, 4, 0})
public final class SharedPreferencesDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f28143a;

    public SharedPreferencesDataSource(@NotNull Context context) {
        this.f28143a = context.getApplicationContext();
    }

    public static ArrayList b(@NotNull JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object objC = jSONArray.get(i10);
            if (objC instanceof JSONArray) {
                objC = b((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            arrayList.add(objC);
        }
        return arrayList;
    }

    public static LinkedHashMap c(@NotNull JSONObject jSONObject) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String key = itKeys.next();
            Object objC = jSONObject.get(key);
            if (objC instanceof JSONArray) {
                objC = b((JSONArray) objC);
            } else if (objC instanceof JSONObject) {
                objC = c((JSONObject) objC);
            }
            Intrinsics.checkExpressionValueIsNotNull(key, "key");
            linkedHashMap.put(key, objC);
        }
        return linkedHashMap;
    }

    public final SharedPreferences a() {
        return this.f28143a.getSharedPreferences(PrefsStorageDataManager.ID, 0);
    }

    @Nullable
    public final <T> T get(@NotNull String key) {
        SharedPreferences sharedPreferences = a();
        Intrinsics.checkExpressionValueIsNotNull(sharedPreferences, "sharedPreferences");
        return (T) sharedPreferences.getAll().get(key);
    }

    @Nullable
    public final <T extends Mappable> List<T> getList(@NotNull String key, @NotNull Class<T> clazz) throws NoSuchMethodException {
        Constructor<T> constructor = clazz.getConstructor(Map.class);
        Set<String> stringSet = a().getStringSet(key, null);
        if (stringSet == null) {
            return null;
        }
        Set<String> set = stringSet;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new JSONObject((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((JSONObject) it2.next()));
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            arrayList3.add(constructor.newInstance((Map) it3.next()));
        }
        return arrayList3;
    }

    @Nullable
    public final Map<String, Object> getMap(@NotNull String key) {
        String string = a().getString(key, null);
        if (string != null) {
            return c(new JSONObject(string));
        }
        return null;
    }

    @Nullable
    public final List<Map<String, Object>> getMapList(@NotNull String key) {
        Set<String> stringSet = a().getStringSet(key, null);
        if (stringSet == null) {
            return null;
        }
        Set<String> set = stringSet;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new JSONObject((String) it.next()));
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(c((JSONObject) it2.next()));
        }
        return arrayList2;
    }

    @Nullable
    public final <T extends Mappable> T getObject(@NotNull String key, @NotNull Class<T> clazz) throws NoSuchMethodException {
        Constructor<T> constructor = clazz.getConstructor(Map.class);
        String string = a().getString(key, null);
        if (string != null) {
            return constructor.newInstance(c(new JSONObject(string)));
        }
        return null;
    }

    public final void remove(@NotNull String key) {
        a().edit().remove(key).apply();
    }

    public final <T extends Mappable> void save(@NotNull String key, @Nullable T value) {
        save(key, (Map<String, ? extends Object>) (value != null ? value.toMap() : null));
    }

    @JvmName(name = "saveMapList")
    public final void saveMapList(@NotNull String key, @Nullable List<? extends Map<String, ? extends Object>> value) {
        Set<String> set;
        if (value != null) {
            List<? extends Map<String, ? extends Object>> list = value;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new JSONObject((Map) it.next()).toString());
            }
            set = CollectionsKt___CollectionsKt.toSet(arrayList);
        } else {
            set = null;
        }
        save(key, set);
    }

    public final <T extends Mappable> void save(@NotNull String key, @Nullable List<? extends T> value) {
        ArrayList arrayList = null;
        if (value != null) {
            List<? extends T> list = value;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Mappable mappable = (Mappable) it.next();
                arrayList2.add(mappable != null ? mappable.toMap() : null);
            }
            arrayList = arrayList2;
        }
        saveMapList(key, arrayList);
    }

    public final void save(@NotNull String key, @Nullable Map<String, ? extends Object> value) {
        save(key, value != null ? new JSONObject(value).toString() : null);
    }

    public final void save(@NotNull String key, @Nullable String value) {
        a().edit().putString(key, value).apply();
    }

    public final void save(@NotNull String key, @Nullable Set<String> value) {
        a().edit().putStringSet(key, value).apply();
    }

    public final void save(@NotNull String key, @Nullable Integer value) {
        SharedPreferences.Editor editorEdit = a().edit();
        if (value != null) {
            editorEdit.putInt(key, value.intValue());
        } else {
            editorEdit.remove(key);
        }
        editorEdit.apply();
    }

    public final void save(@NotNull String key, @Nullable Long value) {
        SharedPreferences.Editor editorEdit = a().edit();
        if (value != null) {
            editorEdit.putLong(key, value.longValue());
        } else {
            editorEdit.remove(key);
        }
        editorEdit.apply();
    }

    public final void save(@NotNull String key, @Nullable Float value) {
        SharedPreferences.Editor editorEdit = a().edit();
        if (value != null) {
            editorEdit.putFloat(key, value.floatValue());
        } else {
            editorEdit.remove(key);
        }
        editorEdit.apply();
    }

    public final void save(@NotNull String key, @Nullable Boolean value) {
        SharedPreferences.Editor editorEdit = a().edit();
        if (value != null) {
            editorEdit.putBoolean(key, value.booleanValue());
        } else {
            editorEdit.remove(key);
        }
        editorEdit.apply();
    }
}
