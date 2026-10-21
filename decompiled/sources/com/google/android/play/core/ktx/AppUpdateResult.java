package com.google.android.play.core.ktx;

import android.app.Activity;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.fragment.app.Fragment;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.install.InstallState;
import ek.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult;", "", "()V", "Available", "Downloaded", "InProgress", "NotAvailable", "Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class AppUpdateResult {

    /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Downloaded;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "", "completeUpdate", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateManager", "<init>", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;)V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0})
    public static final class Downloaded extends AppUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AppUpdateManager f46158a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Downloaded(@NotNull AppUpdateManager appUpdateManager) {
            super(null);
            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
            this.f46158a = appUpdateManager;
        }

        @Nullable
        public final Object completeUpdate(@NotNull Continuation<? super Unit> continuation) {
            Object objRequestCompleteUpdate = AppUpdateManagerKtxKt.requestCompleteUpdate(this.f46158a, continuation);
            return objRequestCompleteUpdate == a.getCOROUTINE_SUSPENDED() ? objRequestCompleteUpdate : Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$InProgress;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Lcom/google/android/play/core/install/InstallState;", "a", "Lcom/google/android/play/core/install/InstallState;", "getInstallState", "()Lcom/google/android/play/core/install/InstallState;", "installState", "<init>", "(Lcom/google/android/play/core/install/InstallState;)V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0})
    public static final class InProgress extends AppUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final InstallState installState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InProgress(@NotNull InstallState installState) {
            super(null);
            Intrinsics.checkNotNullParameter(installState, "installState");
            this.installState = installState;
        }

        @NotNull
        public final InstallState getInstallState() {
            return this.installState;
        }
    }

    /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$NotAvailable;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "()V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class NotAvailable extends AppUpdateResult {

        @NotNull
        public static final NotAvailable INSTANCE = new NotAvailable();

        public NotAvailable() {
            super(null);
        }
    }

    public AppUpdateResult() {
    }

    public /* synthetic */ AppUpdateResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tJ\u0014\u0010\r\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0018"}, d2 = {"Lcom/google/android/play/core/ktx/AppUpdateResult$Available;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/result/IntentSenderRequest;", "activityResultLauncher", "", "startFlexibleUpdate", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "requestCode", "Landroidx/fragment/app/Fragment;", "fragment", "startImmediateUpdate", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "b", "Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "getUpdateInfo", "()Lcom/google/android/play/core/appupdate/AppUpdateInfo;", "updateInfo", "Lcom/google/android/play/core/appupdate/AppUpdateManager;", "appUpdateManager", "<init>", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lcom/google/android/play/core/appupdate/AppUpdateInfo;)V", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, k = 1, mv = {1, 8, 0})
    public static final class Available extends AppUpdateResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final AppUpdateManager f46156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final AppUpdateInfo updateInfo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Available(@NotNull AppUpdateManager appUpdateManager, @NotNull AppUpdateInfo updateInfo) {
            super(null);
            Intrinsics.checkNotNullParameter(appUpdateManager, "appUpdateManager");
            Intrinsics.checkNotNullParameter(updateInfo, "updateInfo");
            this.f46156a = appUpdateManager;
            this.updateInfo = updateInfo;
        }

        @NotNull
        public final AppUpdateInfo getUpdateInfo() {
            return this.updateInfo;
        }

        public final boolean startFlexibleUpdate(@NotNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
            return this.f46156a.startUpdateFlowForResult(this.updateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(0).build());
        }

        public final boolean startImmediateUpdate(@NotNull ActivityResultLauncher<IntentSenderRequest> activityResultLauncher) {
            Intrinsics.checkNotNullParameter(activityResultLauncher, "activityResultLauncher");
            return this.f46156a.startUpdateFlowForResult(this.updateInfo, activityResultLauncher, AppUpdateOptions.newBuilder(1).build());
        }

        public final boolean startFlexibleUpdate(@NotNull Activity activity, int requestCode) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return this.f46156a.startUpdateFlowForResult(this.updateInfo, activity, AppUpdateOptions.newBuilder(0).build(), requestCode);
        }

        public final boolean startImmediateUpdate(@NotNull Activity activity, int requestCode) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            return this.f46156a.startUpdateFlowForResult(this.updateInfo, activity, AppUpdateOptions.newBuilder(1).build(), requestCode);
        }

        public final boolean startFlexibleUpdate(@NotNull Fragment fragment, int requestCode) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            AppUpdateOptions appUpdateOptionsBuild = AppUpdateOptions.newBuilder(0).build();
            Intrinsics.checkNotNullExpressionValue(appUpdateOptionsBuild, "newBuilder(AppUpdateType.FLEXIBLE).build()");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(this.f46156a, this.updateInfo, fragment, appUpdateOptionsBuild, requestCode);
        }

        public final boolean startImmediateUpdate(@NotNull Fragment fragment, int requestCode) {
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            AppUpdateOptions appUpdateOptionsBuild = AppUpdateOptions.newBuilder(1).build();
            Intrinsics.checkNotNullExpressionValue(appUpdateOptionsBuild, "newBuilder(AppUpdateType.IMMEDIATE).build()");
            return AppUpdateManagerKtxKt.startUpdateFlowForResult(this.f46156a, this.updateInfo, fragment, appUpdateOptionsBuild, requestCode);
        }
    }
}
