package com.bbva.glomohybrid.base.extensions;

import com.bbva.localstorage.LocalStorage;
import com.bbva.localstorage.storage.Storage;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalStorageExtensions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n¨\u0006\u000b"}, d2 = {"getAsJson", "Lcom/google/gson/JsonObject;", "Lcom/bbva/localstorage/storage/Storage;", "key", "", "getJsonObject", "removeList", "", "Lcom/bbva/localstorage/LocalStorage;", "keyList", "", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocalStorageExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalStorageExtensions.kt\ncom/bbva/glomohybrid/base/extensions/LocalStorageExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,22:1\n1855#2,2:23\n1#3:25\n*S KotlinDebug\n*F\n+ 1 LocalStorageExtensions.kt\ncom/bbva/glomohybrid/base/extensions/LocalStorageExtensionsKt\n*L\n9#1:23,2\n*E\n"})
public final class LocalStorageExtensionsKt {
    @NotNull
    public static final JsonObject getAsJson(@NotNull Storage storage, @NotNull String key) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(storage, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(JsonParser.parseString(Storage.DefaultImpls.getString$default(storage, key, null, false, 4, null)).getAsJsonObject());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            objM5535constructorimpl = new JsonObject();
        }
        return (JsonObject) objM5535constructorimpl;
    }

    @NotNull
    public static final JsonObject getJsonObject(@NotNull JsonObject jsonObject, @NotNull String key) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        JsonObject asJsonObject = jsonObject.getAsJsonObject(key);
        return asJsonObject == null ? new JsonObject() : asJsonObject;
    }

    public static final void removeList(@NotNull LocalStorage localStorage, @NotNull List<String> keyList) {
        Intrinsics.checkNotNullParameter(localStorage, "<this>");
        Intrinsics.checkNotNullParameter(keyList, "keyList");
        Iterator<T> it = keyList.iterator();
        while (it.hasNext()) {
            localStorage.getStorage().remove((String) it.next());
        }
    }
}
