package com.bbva.glomohybrid.base.datasource;

import android.content.Context;
import androidx.camera.core.impl.utils.c;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.localstorage.LocalStorage;
import com.bbva.localstorage.delegate.Delegate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AppVersionDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0002J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\tR+\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R+\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/bbva/glomohybrid/base/datasource/AppVersionDataSource;", "", "", "versionCode", "", "storeVersionCode", "getCurrentAppVersionCode", "", "getCurrentAppVersionName", "", "isUpdated", "<set-?>", "b", "Lcom/bbva/localstorage/delegate/Delegate;", "getStoredVersionName", "()Ljava/lang/String;", "setStoredVersionName", "(Ljava/lang/String;)V", "storedVersionName", "c", "getStoredVersionCode", "()J", "setStoredVersionCode", "(J)V", "storedVersionCode", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAppVersionDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppVersionDataSource.kt\ncom/bbva/glomohybrid/base/datasource/AppVersionDataSource\n+ 2 LocalStorage.kt\ncom/bbva/localstorage/LocalStorageKt\n*L\n1#1,40:1\n31#2,6:41\n31#2,6:47\n*S KotlinDebug\n*F\n+ 1 AppVersionDataSource.kt\ncom/bbva/glomohybrid/base/datasource/AppVersionDataSource\n*L\n12#1:41,6\n15#1:47,6\n*E\n"})
public final class AppVersionDataSource {

    @NotNull
    public static final String ID = "remembered-version-name-datasource";
    public static final long NO_VERSION_CODE_STORED = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f31226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Delegate storedVersionName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Delegate storedVersionCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f31225d = {c.e(AppVersionDataSource.class, "storedVersionName", "getStoredVersionName()Ljava/lang/String;", 0), c.e(AppVersionDataSource.class, "storedVersionCode", "getStoredVersionCode()J", 0)};

    public AppVersionDataSource(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f31226a = context;
        LocalStorage localStorage = LocalStorage.INSTANCE;
        Delegate<?> delegate = localStorage.get(Reflection.getOrCreateKotlinClass(String.class), LocalStorageConstantsKt.KEY_REMEMBERED_VERSION_NAME, "0.0.0", false);
        Intrinsics.checkNotNull(delegate, "null cannot be cast to non-null type com.bbva.localstorage.delegate.Delegate<T of com.bbva.localstorage.LocalStorageKt.pref>");
        this.storedVersionName = delegate;
        Delegate<?> delegate2 = localStorage.get(Reflection.getOrCreateKotlinClass(Long.class), LocalStorageConstantsKt.KEY_REMEMBERED_VERSION_CODE, 0L, false);
        Intrinsics.checkNotNull(delegate2, "null cannot be cast to non-null type com.bbva.localstorage.delegate.Delegate<T of com.bbva.localstorage.LocalStorageKt.pref>");
        this.storedVersionCode = delegate2;
    }

    public final long getCurrentAppVersionCode() {
        return ContextExtensionKt.getVersionCode(this.f31226a);
    }

    @NotNull
    public final String getCurrentAppVersionName() {
        return ContextExtensionKt.getVersionName(this.f31226a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getStoredVersionCode() {
        return ((Number) this.storedVersionCode.getValue(this, f31225d[1])).longValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final String getStoredVersionName() {
        return (String) this.storedVersionName.getValue(this, f31225d[0]);
    }

    public final boolean isUpdated() {
        return getCurrentAppVersionName().compareTo(getStoredVersionName()) > 0;
    }

    public final void setStoredVersionCode(long j10) {
        this.storedVersionCode.setValue(this, f31225d[1], Long.valueOf(j10));
    }

    public final void setStoredVersionName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.storedVersionName.setValue(this, f31225d[0], str);
    }

    public final void storeVersionCode(long versionCode) {
        setStoredVersionCode(versionCode);
    }
}
