package com.bbva.glomo.storage;

import com.bbva.glomo.storage.shared.SharedStorage;
import com.bbva.localstorage.storage.Storage;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.ClearCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.j;
import kotlin.text.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MainStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J0\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007J\"\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007J*\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007J \u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0007J*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00102\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007J*\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00122\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007J,\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007J \u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0007J \u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0007J \u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u0007J)\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u00072\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u001a\"\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\u0007J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\b\b\u0002\u0010\u000e\u001a\u00020\u0007¨\u0006&"}, d2 = {"Lcom/bbva/glomo/storage/MainStorage;", "", "", "key", "default", "", "ciphered", "Lcom/bbva/glomo/storage/TargetStorage;", "target", "getString", "Lcom/google/gson/JsonObject;", "getJson", "", "getInt", "targetStorage", "getBoolean", "", "getLong", "", "getFloat", "value", "", PutCommand.ID, "putBoolean", "putInt", "putFloat", "", RemoveCommand.ID, "(Lcom/bbva/glomo/storage/TargetStorage;[Ljava/lang/String;)V", ClearCommand.ID, "", "keys", "Lcom/bbva/localstorage/storage/Storage;", "storage", "Lcom/bbva/glomo/storage/shared/SharedStorage;", "sharedStorage", "<init>", "(Lcom/bbva/localstorage/storage/Storage;Lcom/bbva/glomo/storage/shared/SharedStorage;)V", "gl-local-storage_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainStorage.kt\ncom/bbva/glomo/storage/MainStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,162:1\n1#2:163\n13309#3,2:164\n*S KotlinDebug\n*F\n+ 1 MainStorage.kt\ncom/bbva/glomo/storage/MainStorage\n*L\n130#1:164,2\n*E\n"})
public final class MainStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Storage f30768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SharedStorage f30769b;

    /* JADX INFO: compiled from: MainStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TargetStorage.values().length];
            try {
                iArr[TargetStorage.Local.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TargetStorage.Shared.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public MainStorage(@NotNull Storage storage, @NotNull SharedStorage sharedStorage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(sharedStorage, "sharedStorage");
        this.f30768a = storage;
        this.f30769b = sharedStorage;
    }

    public static /* synthetic */ boolean getBoolean$default(MainStorage mainStorage, String str, boolean z10, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            targetStorage = TargetStorage.Local;
        }
        return mainStorage.getBoolean(str, z10, targetStorage);
    }

    public static /* synthetic */ float getFloat$default(MainStorage mainStorage, String str, float f6, boolean z10, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            targetStorage = TargetStorage.Local;
        }
        return mainStorage.getFloat(str, f6, z10, targetStorage);
    }

    public static /* synthetic */ int getInt$default(MainStorage mainStorage, String str, int i10, boolean z10, TargetStorage targetStorage, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        if ((i11 & 8) != 0) {
            targetStorage = TargetStorage.Local;
        }
        return mainStorage.getInt(str, i10, z10, targetStorage);
    }

    public static /* synthetic */ JsonObject getJson$default(MainStorage mainStorage, String str, boolean z10, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            targetStorage = TargetStorage.Local;
        }
        return mainStorage.getJson(str, z10, targetStorage);
    }

    public static /* synthetic */ long getLong$default(MainStorage mainStorage, String str, long j10, boolean z10, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            targetStorage = TargetStorage.Local;
        }
        return mainStorage.getLong(str, j10, z11, targetStorage);
    }

    public static /* synthetic */ String getString$default(MainStorage mainStorage, String str, String str2, boolean z10, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            targetStorage = TargetStorage.Local;
        }
        return mainStorage.getString(str, str2, z10, targetStorage);
    }

    public static /* synthetic */ List keys$default(MainStorage mainStorage, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            targetStorage = TargetStorage.Local;
        }
        return mainStorage.keys(targetStorage);
    }

    public static /* synthetic */ void put$default(MainStorage mainStorage, String str, String str2, boolean z10, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        if ((i10 & 8) != 0) {
            targetStorage = TargetStorage.Local;
        }
        mainStorage.put(str, str2, z10, targetStorage);
    }

    public static /* synthetic */ void putBoolean$default(MainStorage mainStorage, String str, boolean z10, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            targetStorage = TargetStorage.Local;
        }
        mainStorage.putBoolean(str, z10, targetStorage);
    }

    public static /* synthetic */ void putFloat$default(MainStorage mainStorage, String str, float f6, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            targetStorage = TargetStorage.Local;
        }
        mainStorage.putFloat(str, f6, targetStorage);
    }

    public static /* synthetic */ void putInt$default(MainStorage mainStorage, String str, int i10, TargetStorage targetStorage, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            targetStorage = TargetStorage.Local;
        }
        mainStorage.putInt(str, i10, targetStorage);
    }

    public final void clear(@NotNull TargetStorage targetStorage) {
        Intrinsics.checkNotNullParameter(targetStorage, "targetStorage");
        int i10 = WhenMappings.$EnumSwitchMapping$0[targetStorage.ordinal()];
        Storage storage = this.f30768a;
        if (i10 == 1) {
            Storage.DefaultImpls.clear$default(storage, false, 1, null);
            return;
        }
        SharedStorage sharedStorage = this.f30769b;
        if (i10 == 2) {
            sharedStorage.cleanAll();
        } else {
            Storage.DefaultImpls.clear$default(storage, false, 1, null);
            sharedStorage.cleanAll();
        }
    }

    public final boolean getBoolean(@NotNull String key, boolean z10, @NotNull TargetStorage targetStorage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(targetStorage, "targetStorage");
        if (WhenMappings.$EnumSwitchMapping$0[targetStorage.ordinal()] == 1) {
            Boolean boolean$default = Storage.DefaultImpls.getBoolean$default(this.f30768a, key, z10, false, 4, null);
            return boolean$default != null ? boolean$default.booleanValue() : z10;
        }
        String value = this.f30769b.getValue(key);
        return value != null ? Boolean.parseBoolean(value) : z10;
    }

    public final float getFloat(@NotNull String key, float f6, boolean ciphered, @NotNull TargetStorage target) {
        Float floatOrNull;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(target, "target");
        if (WhenMappings.$EnumSwitchMapping$0[target.ordinal()] == 1) {
            Float f10 = this.f30768a.getFloat(key, f6, ciphered);
            return f10 != null ? f10.floatValue() : f6;
        }
        String value = this.f30769b.getValue(key);
        return (value == null || (floatOrNull = j.toFloatOrNull(value)) == null) ? f6 : floatOrNull.floatValue();
    }

    public final int getInt(@NotNull String key, int i10, boolean ciphered, @NotNull TargetStorage target) {
        Integer intOrNull;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(target, "target");
        if (WhenMappings.$EnumSwitchMapping$0[target.ordinal()] == 1) {
            Integer num = this.f30768a.getInt(key, i10, ciphered);
            return num != null ? num.intValue() : i10;
        }
        String value = this.f30769b.getValue(key);
        return (value == null || (intOrNull = k.toIntOrNull(value)) == null) ? i10 : intOrNull.intValue();
    }

    @NotNull
    public final JsonObject getJson(@NotNull String key, boolean ciphered, @NotNull TargetStorage target) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(target, "target");
        String string = WhenMappings.$EnumSwitchMapping$0[target.ordinal()] == 1 ? this.f30768a.getString(key, null, ciphered) : this.f30769b.getValue(key);
        JsonObject asJsonObject = string != null ? JsonParser.parseString(string).getAsJsonObject() : null;
        return asJsonObject == null ? new JsonObject() : asJsonObject;
    }

    public final long getLong(@NotNull String key, long j10, boolean ciphered, @NotNull TargetStorage target) {
        Long longOrNull;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(target, "target");
        if (WhenMappings.$EnumSwitchMapping$0[target.ordinal()] == 1) {
            Long l6 = this.f30768a.getLong(key, j10, ciphered);
            return l6 != null ? l6.longValue() : j10;
        }
        String value = this.f30769b.getValue(key);
        return (value == null || (longOrNull = k.toLongOrNull(value)) == null) ? j10 : longOrNull.longValue();
    }

    @Nullable
    public final String getString(@NotNull String key, @Nullable String str, boolean ciphered, @NotNull TargetStorage target) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(target, "target");
        if (WhenMappings.$EnumSwitchMapping$0[target.ordinal()] == 1) {
            return this.f30768a.getString(key, str, ciphered);
        }
        String value = this.f30769b.getValue(key);
        return value == null ? str : value;
    }

    @NotNull
    public final List<String> keys(@NotNull TargetStorage targetStorage) {
        Intrinsics.checkNotNullParameter(targetStorage, "targetStorage");
        return WhenMappings.$EnumSwitchMapping$0[targetStorage.ordinal()] == 1 ? CollectionsKt___CollectionsKt.toList(this.f30768a.keys()) : CollectionsKt__CollectionsKt.emptyList();
    }

    public final void put(@NotNull String key, @Nullable String value, boolean ciphered, @NotNull TargetStorage target) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(target, "target");
        int i10 = WhenMappings.$EnumSwitchMapping$0[target.ordinal()];
        Storage storage = this.f30768a;
        if (i10 == 1) {
            storage.set(key, value, ciphered);
            return;
        }
        SharedStorage sharedStorage = this.f30769b;
        if (i10 == 2) {
            sharedStorage.put(key, value);
        } else {
            storage.set(key, value, ciphered);
            sharedStorage.put(key, value);
        }
    }

    public final void putBoolean(@NotNull String key, boolean value, @NotNull TargetStorage targetStorage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(targetStorage, "targetStorage");
        if (WhenMappings.$EnumSwitchMapping$0[targetStorage.ordinal()] == 1) {
            Storage.DefaultImpls.set$default(this.f30768a, key, value, false, 4, (Object) null);
        } else {
            this.f30769b.put(key, String.valueOf(value));
        }
    }

    public final void putFloat(@NotNull String key, float value, @NotNull TargetStorage targetStorage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(targetStorage, "targetStorage");
        if (WhenMappings.$EnumSwitchMapping$0[targetStorage.ordinal()] == 1) {
            Storage.DefaultImpls.set$default(this.f30768a, key, value, false, 4, (Object) null);
        } else {
            this.f30769b.put(key, String.valueOf(value));
        }
    }

    public final void putInt(@NotNull String key, int value, @NotNull TargetStorage targetStorage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(targetStorage, "targetStorage");
        if (WhenMappings.$EnumSwitchMapping$0[targetStorage.ordinal()] == 1) {
            Storage.DefaultImpls.set$default(this.f30768a, key, value, false, 4, (Object) null);
        } else {
            this.f30769b.put(key, String.valueOf(value));
        }
    }

    public final void remove(@NotNull TargetStorage targetStorage, @NotNull String... key) {
        Intrinsics.checkNotNullParameter(targetStorage, "targetStorage");
        Intrinsics.checkNotNullParameter(key, "key");
        for (String str : key) {
            int i10 = WhenMappings.$EnumSwitchMapping$0[targetStorage.ordinal()];
            Storage storage = this.f30768a;
            if (i10 != 1) {
                SharedStorage sharedStorage = this.f30769b;
                if (i10 != 2) {
                    storage.remove(str);
                    sharedStorage.removeKey(str);
                } else {
                    sharedStorage.removeKey(str);
                }
            } else {
                storage.remove(str);
            }
        }
    }
}
