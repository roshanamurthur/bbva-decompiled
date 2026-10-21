package com.bbva.ethermobilesdk.securesharing.storage;

import android.content.Context;
import androidx.datastore.preferences.protobuf.q;
import com.bbva.ethermobilesdk.securesharing.cipher.Cipher;
import com.bbva.ethermobilesdk.securesharing.config.Configuration;
import com.bbva.ethermobilesdk.securesharing.extension.ContextKt;
import com.bbva.ethermobilesdk.securesharing.extension.ExceptionKt;
import com.bbva.ethermobilesdk.securesharing.extension.LoggerKt;
import com.bbva.ethermobilesdk.securesharing.model.Entry;
import com.bbva.ethermobilesdk.securesharing.storage.connector.EntryConnector;
import com.bbva.ethermobilesdk.securesharing.storage.connector.ProviderInfoConnector;
import com.bbva.networkplugin.command.impl.PutCommand;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.bbva.sl.ar.android.storage.pss.provider.SharedProvider;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Storage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u000b\u001a\u00020\u0006J\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fJ\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/securesharing/storage/Storage;", "", "", "key", "get", "value", "", PutCommand.ID, "", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, RemoveCommand.ID, "clean", "", "keys", "Landroid/content/Context;", "context", "reset", "<init>", "(Landroid/content/Context;)V", "Companion", "securesharing_release"}, k = 1, mv = {1, 5, 1})
public final class Storage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29972a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Cipher f29973b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final EntryConnector f29974c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final ProviderInfoConnector f29975d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Object f29976e;

    public Storage(@NotNull Context context) throws Exception {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29972a = context;
        this.f29973b = new Cipher(context);
        this.f29976e = new Object();
        LoggerKt.log(Intrinsics.stringPlus("Starting ", SharedProvider.class.getName()));
        Configuration configuration = Configuration.INSTANCE;
        String name = SharedProvider.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "SharedProvider::class.java.name");
        configuration.init(context, name);
        try {
            String packageName = context.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
            ContextKt.verifyApp(context, packageName, configuration.getSharedConfiguration().getFingerprints());
            String strAuthority = ContextKt.authority(context);
            if (strAuthority == null) {
                throw q.d("Could not find required provider authority", null, 2, null);
            }
            EntryConnector entryConnector = new EntryConnector(context, strAuthority);
            this.f29974c = entryConnector;
            ProviderInfoConnector providerInfoConnector = new ProviderInfoConnector(context, strAuthority);
            this.f29975d = providerInfoConnector;
            if (providerInfoConnector.hasProvider()) {
                try {
                    get("__lastProviderInstalled");
                    return;
                } catch (Exception e5) {
                    LoggerKt.logError("Corrupted stated detected, clearing data...", e5);
                    reset(this.f29972a);
                    return;
                }
            }
            providerInfoConnector.initPartners();
            Entry entry = (Entry) CollectionsKt___CollectionsKt.firstOrNull((List) entryConnector.copyFrom(providerInfoConnector.findMaster()));
            if (entry != null) {
                try {
                    get(entry.getKey());
                } catch (Exception e7) {
                    LoggerKt.logError("Corrupted stated detected, clearing data...", e7);
                    reset(this.f29972a);
                }
            }
        } catch (Exception e10) {
            ExceptionKt.throwError("Could not init storage: Security failure", e10);
            throw new KotlinNothingValueException();
        }
    }

    public final void clean() {
        LoggerKt.log("Removing all keys");
        synchronized (this.f29976e) {
            try {
                if (!ProviderConnector.getAll$default(this.f29974c, null, 1, null).isEmpty()) {
                    this.f29974c.deleteAll(this.f29975d.findMaster());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f29974c.contains(key);
    }

    @Nullable
    public final String get(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LoggerKt.log("Getting key [" + key + AbstractJsonLexerKt.END_LIST);
        Entry entry = (Entry) ProviderConnector.get$default(this.f29974c, key, null, 2, null);
        if (entry == null) {
            return null;
        }
        return this.f29973b.decrypt(entry.getValue());
    }

    @NotNull
    public final Set<String> keys() {
        LoggerKt.log("Getting all keys");
        return this.f29974c.keys();
    }

    public final void put(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        LoggerKt.log("Saving key [" + key + AbstractJsonLexerKt.END_LIST);
        String strEncrypt = this.f29973b.encrypt(value);
        synchronized (this.f29976e) {
            try {
                Entry entry = (Entry) ProviderConnector.get$default(this.f29974c, key, null, 2, null);
                String strFindMaster = this.f29975d.findMaster();
                if (entry != null) {
                    this.f29974c.update(Entry.copy$default(entry, null, strEncrypt, 0L, 0L, 13, null), strFindMaster);
                } else {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.f29974c.create(new Entry(key, strEncrypt, jCurrentTimeMillis, jCurrentTimeMillis), strFindMaster);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void remove(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        LoggerKt.log("Deleting key [" + key + AbstractJsonLexerKt.END_LIST);
        synchronized (this.f29976e) {
            try {
                if (this.f29974c.contains(key)) {
                    this.f29974c.delete(key, this.f29975d.findMaster());
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void reset(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LoggerKt.log(Intrinsics.stringPlus("Doing repository hard reset from: ", ContextKt.authority(context)));
        LoggerKt.log("Removing shared data");
        this.f29975d.deleteAllFromMaster();
    }
}
