package com.bbva.ethermobilesdk.devicemanager.di;

import android.content.Context;
import com.bbva.ethermobilesdk.devicemanager.data.permission.repository.PermissionRepository;
import com.bbva.ethermobilesdk.devicemanager.data.permission.repository.PermissionRepositoryImpl;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PermissionModule.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/devicemanager/di/PermissionModule;", "", "Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;", "providePermissionRepository$devicemanager_release", "()Lcom/bbva/ethermobilesdk/devicemanager/data/permission/repository/PermissionRepository;", "providePermissionRepository", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "devicemanager_release"}, k = 1, mv = {2, 0, 0})
public final class PermissionModule {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29668a;

    public PermissionModule(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29668a = context;
    }

    @NotNull
    public final PermissionRepository providePermissionRepository$devicemanager_release() {
        return new PermissionRepositoryImpl(this.f29668a);
    }
}
