package com.bbva.ethermobilesdk.sharedstorage;

import android.content.Context;
import com.bbva.ethermobilesdk.sharedstorage.model.entry.DeviceUid;
import com.bbva.ethermobilesdk.sharedstorage.model.entry.EncryptionCert;
import com.bbva.ethermobilesdk.sharedstorage.model.entry.EtherToken;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SharedStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010!J\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/bbva/ethermobilesdk/sharedstorage/SharedStorage;", "", "", Constants.SYNC, "Landroid/content/Context;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/EtherToken;", "c", "Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/EtherToken;", "getEtherToken", "()Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/EtherToken;", "etherToken", "Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/EncryptionCert;", "d", "Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/EncryptionCert;", "getEncryptionCert", "()Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/EncryptionCert;", "encryptionCert", "Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/DeviceUid;", "e", "Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/DeviceUid;", "getDeviceUid", "()Lcom/bbva/ethermobilesdk/sharedstorage/model/entry/DeviceUid;", "deviceUid", "", "group", "scope", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/content/Context;Ljava/lang/String;)V", "shared-storage_release"}, k = 1, mv = {1, 9, 0})
public final class SharedStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UnboundedStoreChain f29990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EtherToken etherToken;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EncryptionCert encryptionCert;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeviceUid deviceUid;

    public SharedStorage(@NotNull Context context, @NotNull String group, @NotNull String scope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.context = context;
        UnboundedStoreChain unboundedStoreChain = new UnboundedStoreChain(context, group, scope);
        this.f29990b = unboundedStoreChain;
        this.etherToken = new EtherToken(unboundedStoreChain.getHead());
        this.encryptionCert = new EncryptionCert(unboundedStoreChain.getHead());
        this.deviceUid = new DeviceUid(unboundedStoreChain.getHead());
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final DeviceUid getDeviceUid() {
        return this.deviceUid;
    }

    @NotNull
    public final EncryptionCert getEncryptionCert() {
        return this.encryptionCert;
    }

    @NotNull
    public final EtherToken getEtherToken() {
        return this.etherToken;
    }

    public final void sync() {
        this.f29990b.sync(this.context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SharedStorage(@NotNull Context context, @NotNull String group) {
        this(context, group, ConstantsKt.SCOPE_DEFAULT);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(group, "group");
    }
}
