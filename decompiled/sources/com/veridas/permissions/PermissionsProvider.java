package com.veridas.permissions;

import android.content.Context;
import androidx.core.content.ContextCompat;
import ek.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PermissionsProvider.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0016"}, d2 = {"Lcom/veridas/permissions/PermissionsProvider;", "Lcom/veridas/permissions/IPermissionsProvider;", "Lcom/veridas/permissions/IPermission;", "permission", "", "isPermissionGranted", "", "permissions", "arePermissionsGranted", "Lcom/veridas/permissions/PermissionStatus;", "getPermissionStatus", "getPermissionsStatus", "requestPermission", "(Lcom/veridas/permissions/IPermission;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestPermissions", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Companion", "IPermissionRequestResultListener", "common-core_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nPermissionsProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionsProvider.kt\ncom/veridas/permissions/PermissionsProvider\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n766#2:87\n857#2,2:88\n1549#2:90\n1620#2,3:91\n1549#2:94\n1620#2,3:95\n*S KotlinDebug\n*F\n+ 1 PermissionsProvider.kt\ncom/veridas/permissions/PermissionsProvider\n*L\n25#1:87\n25#1:88,2\n36#1:90\n36#1:91,3\n68#1:94\n68#1:95,3\n*E\n"})
public final class PermissionsProvider implements IPermissionsProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static IPermissionRequestResultListener f67275b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f67276a;

    /* JADX INFO: compiled from: PermissionsProvider.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/veridas/permissions/PermissionsProvider$Companion;", "", "()V", "currentPermissionRequestListener", "Lcom/veridas/permissions/PermissionsProvider$IPermissionRequestResultListener;", "getCurrentPermissionRequestListener", "()Lcom/veridas/permissions/PermissionsProvider$IPermissionRequestResultListener;", "setCurrentPermissionRequestListener", "(Lcom/veridas/permissions/PermissionsProvider$IPermissionRequestResultListener;)V", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final IPermissionRequestResultListener getCurrentPermissionRequestListener() {
            return PermissionsProvider.f67275b;
        }

        public final void setCurrentPermissionRequestListener(@Nullable IPermissionRequestResultListener iPermissionRequestResultListener) {
            PermissionsProvider.f67275b = iPermissionRequestResultListener;
        }
    }

    /* JADX INFO: compiled from: PermissionsProvider.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/veridas/permissions/PermissionsProvider$IPermissionRequestResultListener;", "", "onPermissionsResult", "", "statuses", "", "Lcom/veridas/permissions/PermissionStatus;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface IPermissionRequestResultListener {
        void onPermissionsResult(@NotNull List<? extends PermissionStatus> statuses);
    }

    public PermissionsProvider(@NotNull Context applicationContext) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f67276a = applicationContext;
    }

    @Override // com.veridas.permissions.IPermissionsProvider
    public boolean arePermissionsGranted(@NotNull List<? extends IPermission> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : permissions) {
            if (isPermissionGranted((IPermission) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() == permissions.size();
    }

    @Override // com.veridas.permissions.IPermissionsProvider
    @NotNull
    public PermissionStatus getPermissionStatus(@NotNull IPermission permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        boolean zIsPermissionGranted = isPermissionGranted(permission);
        if (zIsPermissionGranted) {
            return PermissionStatus.Granted.INSTANCE;
        }
        if (zIsPermissionGranted) {
            throw new NoWhenBranchMatchedException();
        }
        return PermissionStatus.NotGranted.INSTANCE;
    }

    @Override // com.veridas.permissions.IPermissionsProvider
    @NotNull
    public List<PermissionStatus> getPermissionsStatus(@NotNull List<? extends IPermission> permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        List<? extends IPermission> list = permissions;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(isPermissionGranted((IPermission) it.next()) ? PermissionStatus.Granted.INSTANCE : PermissionStatus.NotGranted.INSTANCE);
        }
        return arrayList;
    }

    @Override // com.veridas.permissions.IPermissionsProvider
    public boolean isPermissionGranted(@NotNull IPermission permission) {
        Intrinsics.checkNotNullParameter(permission, "permission");
        return ContextCompat.checkSelfPermission(this.f67276a, permission.getId()) == 0;
    }

    @Override // com.veridas.permissions.IPermissionsProvider
    @Nullable
    public Object requestPermission(@NotNull IPermission iPermission, @NotNull Continuation<? super PermissionStatus> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (isPermissionGranted(iPermission)) {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m5535constructorimpl(PermissionStatus.Granted.INSTANCE));
        } else {
            f67275b = new IPermissionRequestResultListener() { // from class: com.veridas.permissions.PermissionsProvider$requestPermission$2$1
                @Override // com.veridas.permissions.PermissionsProvider.IPermissionRequestResultListener
                public void onPermissionsResult(@NotNull List<? extends PermissionStatus> statuses) {
                    Intrinsics.checkNotNullParameter(statuses, "statuses");
                    Result.Companion companion2 = Result.INSTANCE;
                    safeContinuation.resumeWith(Result.m5535constructorimpl(CollectionsKt___CollectionsKt.first((List) statuses)));
                    PermissionsProvider.INSTANCE.setCurrentPermissionRequestListener(null);
                }
            };
            PermissionsActivity.INSTANCE.start(this.f67276a, iPermission);
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.veridas.permissions.IPermissionsProvider
    @Nullable
    public Object requestPermissions(@NotNull List<? extends IPermission> list, @NotNull Continuation<? super List<? extends PermissionStatus>> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        if (arePermissionsGranted(list)) {
            List<? extends IPermission> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (IPermission iPermission : list2) {
                arrayList.add(PermissionStatus.Granted.INSTANCE);
            }
            safeContinuation.resumeWith(Result.m5535constructorimpl(arrayList));
        } else {
            f67275b = new IPermissionRequestResultListener() { // from class: com.veridas.permissions.PermissionsProvider$requestPermissions$2$2
                @Override // com.veridas.permissions.PermissionsProvider.IPermissionRequestResultListener
                public void onPermissionsResult(@NotNull List<? extends PermissionStatus> statuses) {
                    Intrinsics.checkNotNullParameter(statuses, "statuses");
                    safeContinuation.resumeWith(Result.m5535constructorimpl(statuses));
                    PermissionsProvider.INSTANCE.setCurrentPermissionRequestListener(null);
                }
            };
            PermissionsActivity.INSTANCE.start(this.f67276a, list);
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
