package com.bbva.glomo.securesharing;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.networkplugin.command.impl.PutCommand;
import java.util.Arrays;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SecSdkDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Deprecated(message = "Use MainStorage directly instead")
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003J\u000e\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0003J\u0006\u0010\n\u001a\u00020\u0007¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomo/securesharing/SecSdkDataSource;", "", "", "", "countryKeys", "key", "value", "", PutCommand.ID, "deleteKey", "deleteCountryKeys", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "gl-secure-sharing_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSecSdkDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecSdkDataSource.kt\ncom/bbva/glomo/securesharing/SecSdkDataSource\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,27:1\n37#2,2:28\n*S KotlinDebug\n*F\n+ 1 SecSdkDataSource.kt\ncom/bbva/glomo/securesharing/SecSdkDataSource\n*L\n24#1:28,2\n*E\n"})
public abstract class SecSdkDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30731a;

    public SecSdkDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30731a = storage;
    }

    @NotNull
    public List<String> countryKeys() {
        return CollectionsKt__CollectionsKt.emptyList();
    }

    public final void deleteCountryKeys() {
        TargetStorage targetStorage = TargetStorage.Shared;
        String[] strArr = (String[]) countryKeys().toArray(new String[0]);
        this.f30731a.remove(targetStorage, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void deleteKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30731a.remove(TargetStorage.Shared, key);
    }

    public final void put(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        MainStorage.put$default(this.f30731a, key, value, false, null, 12, null);
    }
}
