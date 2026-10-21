package com.bbva.ethermobilesdk.pinning.provider.site.storage;

import android.content.Context;
import androidx.camera.core.impl.utils.c;
import com.bbva.ethermobilesdk.pinning.logger.LoggerKt;
import com.bbva.localstorage.delegate.IntDelegate;
import com.bbva.localstorage.delegate.LongDelegate;
import com.bbva.localstorage.delegate.StringDelegate;
import com.bbva.localstorage.storage.SharedPreferencesStorage;
import com.bbva.plugin.localstorage.command.ClearCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SharedPropertyStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010)\u001a\u00020*H\u0016R/\u0010\b\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00058V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u000f8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00178V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R/\u0010!\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00058V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b$\u0010\u000e\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\fR/\u0010%\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00058V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u000e\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\f¨\u0006,"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/provider/site/storage/SharedPropertyStorage;", "Lcom/bbva/ethermobilesdk/pinning/provider/site/storage/PropertyStorage;", "context", "Landroid/content/Context;", "filename", "", "(Landroid/content/Context;Ljava/lang/String;)V", "<set-?>", "lastModified", "getLastModified", "()Ljava/lang/String;", "setLastModified", "(Ljava/lang/String;)V", "lastModified$delegate", "Lcom/bbva/localstorage/delegate/StringDelegate;", "", "lastUpdate", "getLastUpdate", "()J", "setLastUpdate", "(J)V", "lastUpdate$delegate", "Lcom/bbva/localstorage/delegate/LongDelegate;", "", "revision", "getRevision", "()I", "setRevision", "(I)V", "revision$delegate", "Lcom/bbva/localstorage/delegate/IntDelegate;", "storage", "Lcom/bbva/localstorage/storage/SharedPreferencesStorage;", "updateThreshold", "getUpdateThreshold", "setUpdateThreshold", "updateThreshold$delegate", "updateUrls", "getUpdateUrls", "setUpdateUrls", "updateUrls$delegate", ClearCommand.ID, "", "Companion", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SharedPropertyStorage implements PropertyStorage {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {c.e(SharedPropertyStorage.class, "updateUrls", "getUpdateUrls()Ljava/lang/String;", 0), c.e(SharedPropertyStorage.class, "updateThreshold", "getUpdateThreshold()Ljava/lang/String;", 0), c.e(SharedPropertyStorage.class, "revision", "getRevision()I", 0), c.e(SharedPropertyStorage.class, "lastModified", "getLastModified()Ljava/lang/String;", 0), c.e(SharedPropertyStorage.class, "lastUpdate", "getLastUpdate()J", 0)};

    @NotNull
    private static final String DEFAULT_EPOCH = "Thu, 01 Jan 1970 00:00:00 GMT";

    /* JADX INFO: renamed from: lastModified$delegate, reason: from kotlin metadata */
    @NotNull
    private final StringDelegate lastModified;

    /* JADX INFO: renamed from: lastUpdate$delegate, reason: from kotlin metadata */
    @NotNull
    private final LongDelegate lastUpdate;

    /* JADX INFO: renamed from: revision$delegate, reason: from kotlin metadata */
    @NotNull
    private final IntDelegate revision;

    @NotNull
    private final SharedPreferencesStorage storage;

    /* JADX INFO: renamed from: updateThreshold$delegate, reason: from kotlin metadata */
    @NotNull
    private final StringDelegate updateThreshold;

    /* JADX INFO: renamed from: updateUrls$delegate, reason: from kotlin metadata */
    @NotNull
    private final StringDelegate updateUrls;

    public SharedPropertyStorage(@NotNull Context context, @NotNull String filename) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(filename, "filename");
        SharedPreferencesStorage sharedPreferencesStorage = new SharedPreferencesStorage(context, filename, false, null, true, 12, null);
        this.storage = sharedPreferencesStorage;
        this.updateUrls = new StringDelegate(sharedPreferencesStorage, "update.url", null, false, 12, null);
        this.updateThreshold = new StringDelegate(sharedPreferencesStorage, "update.threshold", null, false, 12, null);
        this.revision = new IntDelegate(sharedPreferencesStorage, "revision", -1, false, 8, null);
        this.lastModified = new StringDelegate(sharedPreferencesStorage, "last_modified", DEFAULT_EPOCH, false, 8, null);
        this.lastUpdate = new LongDelegate(sharedPreferencesStorage, "last_update", 0L, false, 8, null);
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    public void clear() {
        this.storage.clear(true);
        LoggerKt.log$default(null, "sharedpropertystorage did clear", 1, null);
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    @Nullable
    public String getLastModified() {
        return this.lastModified.getValue((Object) this, $$delegatedProperties[3]);
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    public long getLastUpdate() {
        return this.lastUpdate.getValue((Object) this, $$delegatedProperties[4]).longValue();
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    public int getRevision() {
        return this.revision.getValue((Object) this, $$delegatedProperties[2]).intValue();
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    @Nullable
    public String getUpdateThreshold() {
        return this.updateThreshold.getValue((Object) this, $$delegatedProperties[1]);
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    @Nullable
    public String getUpdateUrls() {
        return this.updateUrls.getValue((Object) this, $$delegatedProperties[0]);
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    public void setLastModified(@Nullable String str) {
        this.lastModified.setValue((Object) this, $$delegatedProperties[3], str);
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    public void setLastUpdate(long j10) {
        this.lastUpdate.setValue(this, $$delegatedProperties[4], j10);
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    public void setRevision(int i10) {
        this.revision.setValue(this, $$delegatedProperties[2], i10);
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    public void setUpdateThreshold(@Nullable String str) {
        this.updateThreshold.setValue((Object) this, $$delegatedProperties[1], str);
    }

    @Override // com.bbva.ethermobilesdk.pinning.provider.site.storage.PropertyStorage
    public void setUpdateUrls(@Nullable String str) {
        this.updateUrls.setValue((Object) this, $$delegatedProperties[0], str);
    }
}
