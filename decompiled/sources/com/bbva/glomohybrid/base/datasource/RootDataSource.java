package com.bbva.glomohybrid.base.datasource;

import androidx.camera.core.impl.utils.c;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.localstorage.LocalStorage;
import com.bbva.localstorage.delegate.Delegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RootDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R+\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR+\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\b\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/base/datasource/RootDataSource;", "", "", "value", "", "setRoot", "<set-?>", "b", "Lcom/bbva/localstorage/delegate/Delegate;", "getShowRootScreen", "()Z", "setShowRootScreen", "(Z)V", "showRootScreen", "c", "getDeviceRooted", "setDeviceRooted", "deviceRooted", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRootDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RootDataSource.kt\ncom/bbva/glomohybrid/base/datasource/RootDataSource\n+ 2 LocalStorage.kt\ncom/bbva/localstorage/LocalStorageKt\n*L\n1#1,28:1\n31#2,6:29\n31#2,6:35\n*S KotlinDebug\n*F\n+ 1 RootDataSource.kt\ncom/bbva/glomohybrid/base/datasource/RootDataSource\n*L\n11#1:29,6\n13#1:35,6\n*E\n"})
public final class RootDataSource {

    @NotNull
    public static final String ID = "root-datasource";

    @NotNull
    public static final String KEY_CHECK = "check_root";

    @NotNull
    public static final String KEY_DEVICE_ROOTED = "key_device_rooted";

    @NotNull
    public static final String KEY_SHOW_ROOT_SCREEN = "key_show_root_screen";

    @NotNull
    public static final String PREFERENCES_NAME = "prefs_root";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f31233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Delegate showRootScreen;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Delegate deviceRooted;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f31232d = {c.e(RootDataSource.class, "showRootScreen", "getShowRootScreen()Z", 0), c.e(RootDataSource.class, "deviceRooted", "getDeviceRooted()Z", 0)};

    public RootDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f31233a = storage;
        Boolean bool = Boolean.TRUE;
        LocalStorage localStorage = LocalStorage.INSTANCE;
        Delegate<?> delegate = localStorage.get(Reflection.getOrCreateKotlinClass(Boolean.class), KEY_SHOW_ROOT_SCREEN, bool, false);
        Intrinsics.checkNotNull(delegate, "null cannot be cast to non-null type com.bbva.localstorage.delegate.Delegate<T of com.bbva.localstorage.LocalStorageKt.pref>");
        this.showRootScreen = delegate;
        Delegate<?> delegate2 = localStorage.get(Reflection.getOrCreateKotlinClass(Boolean.class), KEY_DEVICE_ROOTED, Boolean.FALSE, false);
        Intrinsics.checkNotNull(delegate2, "null cannot be cast to non-null type com.bbva.localstorage.delegate.Delegate<T of com.bbva.localstorage.LocalStorageKt.pref>");
        this.deviceRooted = delegate2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getDeviceRooted() {
        return ((Boolean) this.deviceRooted.getValue(this, f31232d[1])).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowRootScreen() {
        return ((Boolean) this.showRootScreen.getValue(this, f31232d[0])).booleanValue();
    }

    public final void setDeviceRooted(boolean z10) {
        this.deviceRooted.setValue(this, f31232d[1], Boolean.valueOf(z10));
    }

    public final void setRoot(boolean value) {
        setDeviceRooted(value);
        MainStorage.put$default(this.f31233a, LocalStorageConstantsKt.KEY_IS_ROOT_ENABLED, "{\"value\": " + value + "}", false, null, 12, null);
    }

    public final void setShowRootScreen(boolean z10) {
        this.showRootScreen.setValue(this, f31232d[0], Boolean.valueOf(z10));
    }
}
