package com.bbva.plugin.localstorage;

import android.app.Application;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.component.PluginComponentContainer;
import com.bbva.localstorage.LocalStorage;
import com.bbva.localstorage.storage.Storage;
import com.bbva.plugin.localstorage.storage.SharedPreferencesStorage;
import com.bbva.plugin.localstorage.storage.SharedPreferencesStorageSecure;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocalStoragePlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/localstorage/LocalStoragePlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "()V", "createCommandFactory", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "getId", "", "initialize", "", "components", "Lcom/bbva/androidtoolkit/plugin/component/PluginComponentContainer;", "local-storage-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LocalStoragePlugin extends Plugin {

    /* JADX INFO: compiled from: LocalStoragePlugin.kt */
    public static final class a extends Lambda implements Function0<Storage> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f35766p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Storage invoke() {
            return LocalStorage.INSTANCE.getStorage();
        }
    }

    /* JADX INFO: compiled from: LocalStoragePlugin.kt */
    public static final class b extends Lambda implements Function0<Storage> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f35767p0 = new b(0);

        @Override // kotlin.jvm.functions.Function0
        public final Storage invoke() {
            return LocalStorage.INSTANCE.getStorageVolatile();
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new SecureStoragePluginCommandFactory();
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return "LocalStoragePlugin";
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    public void initialize(@NotNull PluginComponentContainer components) {
        Intrinsics.checkNotNullParameter(components, "components");
        super.initialize(components);
        LocalStorage localStorage = LocalStorage.INSTANCE;
        Application application = components.getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "components.application");
        localStorage.warmUp(application, (30 & 2) != 0 ? null : null, (30 & 4) != 0 ? false : false, (30 & 8) != 0 ? null : null, (30 & 16) != 0 ? false : false);
        Application application2 = components.getApplication();
        Intrinsics.checkNotNullExpressionValue(application2, "components.application");
        LocalStorage.warmUpVolatile$default(localStorage, application2, null, 2, null);
        Injector injector = Injector.INSTANCE;
        Injector.warmUp$local_storage_plugin_release$default(injector, new SharedPreferencesStorage(a.f35766p0), null, 2, null);
        Injector.warmUpSecure$local_storage_plugin_release$default(injector, new SharedPreferencesStorageSecure(), null, 2, null);
        Injector.warmUpVolatile$local_storage_plugin_release$default(injector, new SharedPreferencesStorage(b.f35767p0), null, 2, null);
    }
}
