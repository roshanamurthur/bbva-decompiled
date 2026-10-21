package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppStatusConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/AppStatus;", "", "Lcom/bbva/component/dm/settings/domain/model/AndroidAppStatus;", "component1", "android", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lcom/bbva/component/dm/settings/domain/model/AndroidAppStatus;", "getAndroid", "()Lcom/bbva/component/dm/settings/domain/model/AndroidAppStatus;", "<init>", "(Lcom/bbva/component/dm/settings/domain/model/AndroidAppStatus;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AppStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final AndroidAppStatus android;

    public AppStatus(@Nullable AndroidAppStatus androidAppStatus) {
        this.android = androidAppStatus;
    }

    public static /* synthetic */ AppStatus copy$default(AppStatus appStatus, AndroidAppStatus androidAppStatus, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            androidAppStatus = appStatus.android;
        }
        return appStatus.copy(androidAppStatus);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AndroidAppStatus getAndroid() {
        return this.android;
    }

    @NotNull
    public final AppStatus copy(@Nullable AndroidAppStatus android2) {
        return new AppStatus(android2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppStatus) && Intrinsics.areEqual(this.android, ((AppStatus) other).android);
    }

    @Nullable
    public final AndroidAppStatus getAndroid() {
        return this.android;
    }

    public int hashCode() {
        AndroidAppStatus androidAppStatus = this.android;
        if (androidAppStatus == null) {
            return 0;
        }
        return androidAppStatus.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppStatus(android=" + this.android + ")";
    }
}
