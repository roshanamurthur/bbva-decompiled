package com.bbva.glomohybrid.cellsweb.view.dialog;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SettingsDialogComponent.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/view/dialog/SettingsDialogComponent;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "()V", "getId", "", "show", "", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroidx/fragment/app/FragmentActivity;", "type", "Lcom/bbva/glomohybrid/cellsweb/view/dialog/SettingsDialogType;", "dialogType", "Companion", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SettingsDialogComponent extends ReactiveComponent {

    @NotNull
    public static final String ID = "settings-dialog-component";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Void> f32012p0 = new ActionSpec<>("open-settings");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Void> f32013q0 = new ActionSpec<>("open-location-system-settings");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<String> f32014r0 = new ActionSpec<>("cancel-dialog");

    /* JADX INFO: compiled from: SettingsDialogComponent.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0007R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/view/dialog/SettingsDialogComponent$Companion;", "", "()V", "ACTION_CANCEL_DIALOG", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", "getACTION_CANCEL_DIALOG", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_OPEN_LOCATION_SYSTEM_SETTINGS", "Ljava/lang/Void;", "getACTION_OPEN_LOCATION_SYSTEM_SETTINGS", "ACTION_OPEN_SETTINGS", "getACTION_OPEN_SETTINGS", "ID", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<String> getACTION_CANCEL_DIALOG() {
            return SettingsDialogComponent.f32014r0;
        }

        @NotNull
        public final ActionSpec<Void> getACTION_OPEN_LOCATION_SYSTEM_SETTINGS() {
            return SettingsDialogComponent.f32013q0;
        }

        @NotNull
        public final ActionSpec<Void> getACTION_OPEN_SETTINGS() {
            return SettingsDialogComponent.f32012p0;
        }
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF28076q0() {
        return ID;
    }

    public final void show(@NotNull FragmentActivity activity, @NotNull SettingsDialogType type, @NotNull String dialogType) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(dialogType, "dialogType");
        SettingsDialogFragment settingsDialogFragment = new SettingsDialogFragment();
        settingsDialogFragment.setCancelable(false);
        Bundle bundle = new Bundle();
        bundle.putParcelable(SettingsDialogFragment.TYPE_OBJECT_KEY, type);
        bundle.putString(SettingsDialogFragment.TYPE_DIALOG_KEY, dialogType);
        settingsDialogFragment.setArguments(bundle);
        settingsDialogFragment.show(activity.getSupportFragmentManager(), (String) null);
    }
}
