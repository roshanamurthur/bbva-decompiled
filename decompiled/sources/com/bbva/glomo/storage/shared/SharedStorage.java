package com.bbva.glomo.storage.shared;

import com.bbva.ethermobilesdk.securesharing.SecureSharing;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0005¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomo/storage/shared/SharedStorage;", "", "", "key", "value", "", PutCommand.ID, "getValue", "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "removeKey", "cleanAll", "Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;", "secureSharing", "<init>", "(Lcom/bbva/ethermobilesdk/securesharing/SecureSharing;)V", "gl-local-storage_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSharedStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedStorage.kt\ncom/bbva/glomo/storage/shared/SharedStorage\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class SharedStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SecureSharing f30772a;

    public SharedStorage(@NotNull SecureSharing secureSharing) {
        Intrinsics.checkNotNullParameter(secureSharing, "secureSharing");
        this.f30772a = secureSharing;
    }

    public final void cleanAll() {
        this.f30772a.cleanAll();
    }

    public final boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f30772a.contains(key);
    }

    @Nullable
    public final String getValue(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f30772a.getValue(key);
    }

    public final void put(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value != null) {
            this.f30772a.putValue(key, value);
        }
    }

    public final void removeKey(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30772a.removeKey(key);
    }
}
