package com.bbva.glomo;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StorageExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a&\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b\u001a\u001c\u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\n"}, d2 = {"getAsJson", "Lcom/google/gson/JsonObject;", "Lcom/bbva/glomo/storage/MainStorage;", "key", "", "decrypt", "", "target", "Lcom/bbva/glomo/storage/TargetStorage;", "getSecureJson", "gl-local-storage_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nStorageExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StorageExtensions.kt\ncom/bbva/glomo/StorageExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,25:1\n1#2:26\n*E\n"})
public final class StorageExtensionsKt {
    @NotNull
    public static final JsonObject getAsJson(@NotNull MainStorage mainStorage, @NotNull String key, boolean z10, @NotNull TargetStorage target) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(mainStorage, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(target, "target");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(JsonParser.parseString(mainStorage.getString(key, null, z10, target)).getAsJsonObject());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = new JsonObject();
        }
        return (JsonObject) objM5535constructorimpl;
    }

    public static /* synthetic */ JsonObject getAsJson$default(MainStorage mainStorage, String str, boolean z10, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            targetStorage = TargetStorage.Local;
        }
        return getAsJson(mainStorage, str, z10, targetStorage);
    }

    @NotNull
    public static final JsonObject getSecureJson(@NotNull MainStorage mainStorage, @NotNull String key, @NotNull TargetStorage target) {
        Intrinsics.checkNotNullParameter(mainStorage, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(target, "target");
        return mainStorage.getJson(key, true, target);
    }

    public static /* synthetic */ JsonObject getSecureJson$default(MainStorage mainStorage, String str, TargetStorage targetStorage, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            targetStorage = TargetStorage.Local;
        }
        return getSecureJson(mainStorage, str, targetStorage);
    }
}
