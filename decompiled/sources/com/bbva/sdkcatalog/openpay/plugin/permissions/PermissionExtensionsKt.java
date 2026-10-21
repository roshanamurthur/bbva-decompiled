package com.bbva.sdkcatalog.openpay.plugin.permissions;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Intent;
import androidx.exifinterface.media.ExifInterface;
import c7.q;
import c7.s;
import c7.w;
import c7.y;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.nativesettings.common.Constants;
import com.bbva.sdkcatalog.openpay.plugin.data.error.OpenPayError;
import com.sun.mail.imap.IMAPStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PermissionExtensions.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a,\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u001a \u0010\t\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u001a \u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u001a8\u0010\u000b\u001a\u00020\u0001\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u00022\u000e\b\b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u000e\b\b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0086\bø\u0001\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0011"}, d2 = {"launchBluetoothPermissions", "", "Landroid/app/Activity;", "callback", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "error", "Lcom/bbva/sdkcatalog/openpay/plugin/data/error/OpenPayError;", IMAPStore.ID_COMMAND, "Lkotlin/Function0;", "launchLocationPermissions", "launchStoragePermissions", "launchPermissions", ExifInterface.GPS_DIRECTION_TRUE, "grantedAction", "notGrantedAction", "launchBluetoothSettings", "onResult", "openpay-plugin_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPermissionExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionExtensions.kt\ncom/bbva/sdkcatalog/openpay/plugin/permissions/PermissionExtensionsKt\n*L\n1#1,84:1\n63#1,10:85\n63#1,10:95\n63#1,10:105\n*S KotlinDebug\n*F\n+ 1 PermissionExtensions.kt\ncom/bbva/sdkcatalog/openpay/plugin/permissions/PermissionExtensionsKt\n*L\n19#1:85,10\n43#1:95,10\n53#1:105,10\n*E\n"})
public final class PermissionExtensionsKt {

    /* JADX INFO: renamed from: com.bbva.sdkcatalog.openpay.plugin.permissions.PermissionExtensionsKt$launchPermissions$1, reason: invalid class name */
    /* JADX INFO: compiled from: PermissionExtensions.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
    public static final class AnonymousClass1 implements PermissionCallback {
        final /* synthetic */ Function0<Unit> $grantedAction;
        final /* synthetic */ Function0<Unit> $notGrantedAction;

        public AnonymousClass1(Function0<Unit> function0, Function0<Unit> function1) {
            this.$grantedAction = function0;
            this.$notGrantedAction = function1;
        }

        @Override // com.bbva.sdkcatalog.openpay.plugin.permissions.PermissionCallback
        public final void onPermissionResult(boolean z10) {
            (z10 ? this.$grantedAction : this.$notGrantedAction).invoke();
        }
    }

    public static final void launchBluetoothPermissions(@NotNull final Activity activity, @NotNull final CommandCallback callback, @Nullable final OpenPayError openPayError, @NotNull final Function0<Unit> command) {
        final BluetoothAdapter adapter;
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(command, "command");
        Object systemService = activity.getSystemService(Constants.BLUETOOTH);
        BluetoothManager bluetoothManager = systemService instanceof BluetoothManager ? (BluetoothManager) systemService : null;
        if (bluetoothManager == null || (adapter = bluetoothManager.getAdapter()) == null) {
            return;
        }
        if (!adapter.isEnabled()) {
            launchBluetoothSettings(activity, new Function0() { // from class: com.bbva.sdkcatalog.openpay.plugin.permissions.c
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionExtensionsKt.launchBluetoothPermissions$lambda$4$lambda$3(adapter, activity, callback, openPayError, command);
                }
            });
        } else {
            PermissionManager.INSTANCE.setCallback(new AnonymousClass1(new q(command, 1), new Function0() { // from class: com.bbva.sdkcatalog.openpay.plugin.permissions.b
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PermissionExtensionsKt.launchBluetoothPermissions$lambda$4$lambda$1(callback, openPayError);
                }
            }));
            activity.startActivity(new Intent(activity, (Class<?>) PermissionBluetoothActivity.class));
        }
    }

    public static /* synthetic */ void launchBluetoothPermissions$default(Activity activity, CommandCallback commandCallback, OpenPayError openPayError, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            openPayError = null;
        }
        launchBluetoothPermissions(activity, commandCallback, openPayError, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchBluetoothPermissions$lambda$4$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchBluetoothPermissions$lambda$4$lambda$1(CommandCallback commandCallback, OpenPayError openPayError) {
        commandCallback.sendError(openPayError);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchBluetoothPermissions$lambda$4$lambda$3(BluetoothAdapter bluetoothAdapter, Activity activity, CommandCallback commandCallback, OpenPayError openPayError, Function0 function0) {
        if (bluetoothAdapter.isEnabled()) {
            launchBluetoothPermissions(activity, commandCallback, openPayError, new y(function0, 2));
        } else {
            commandCallback.sendError(OpenPayError.ErrorBluetoothOff);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchBluetoothPermissions$lambda$4$lambda$3$lambda$2(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final void launchBluetoothSettings(@NotNull Activity activity, @NotNull final Function0<Unit> onResult) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        new ActivityLauncher().create(new d()).listen(new Function1() { // from class: com.bbva.sdkcatalog.openpay.plugin.permissions.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PermissionExtensionsKt.launchBluetoothSettings$lambda$10(onResult, (ActivityResult) obj);
            }
        }).launch(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchBluetoothSettings$lambda$10(Function0 function0, ActivityResult it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchBluetoothSettings$lambda$9(ActivityResultRequest.Builder create) {
        Intrinsics.checkNotNullParameter(create, "$this$create");
        create.setAction("android.settings.BLUETOOTH_SETTINGS");
        return Unit.INSTANCE;
    }

    public static final void launchLocationPermissions(@NotNull Activity activity, @NotNull CommandCallback callback, @NotNull Function0<Unit> command) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(command, "command");
        PermissionManager.INSTANCE.setCallback(new AnonymousClass1(new w(command, 2), new na.d(callback, 1)));
        activity.startActivity(new Intent(activity, (Class<?>) PermissionLocationActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchLocationPermissions$lambda$5(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchLocationPermissions$lambda$6(CommandCallback commandCallback) {
        commandCallback.sendError(OpenPayError.ErrorLocationDisabled);
        return Unit.INSTANCE;
    }

    public static final /* synthetic */ <T> void launchPermissions(Activity activity, Function0<Unit> grantedAction, Function0<Unit> notGrantedAction) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(grantedAction, "grantedAction");
        Intrinsics.checkNotNullParameter(notGrantedAction, "notGrantedAction");
        PermissionManager.INSTANCE.setCallback(new AnonymousClass1(grantedAction, notGrantedAction));
        Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
        activity.startActivity(new Intent(activity, (Class<?>) Object.class));
    }

    public static final void launchStoragePermissions(@NotNull Activity activity, @NotNull CommandCallback callback, @NotNull Function0<Unit> command) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(command, "command");
        int i10 = 1;
        PermissionManager.INSTANCE.setCallback(new AnonymousClass1(new s(command, i10), new c5.c(callback, i10)));
        activity.startActivity(new Intent(activity, (Class<?>) PermissionStorageActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchStoragePermissions$lambda$7(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchStoragePermissions$lambda$8(CommandCallback commandCallback) {
        commandCallback.sendError(OpenPayError.ErrorStoragePermission);
        return Unit.INSTANCE;
    }
}
