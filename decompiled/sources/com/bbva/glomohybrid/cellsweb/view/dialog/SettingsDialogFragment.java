package com.bbva.glomohybrid.cellsweb.view.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.cellsweb.view.dialog.SettingsDialogComponent;
import com.bbva.glomohybrid.cellsweb.view.dialog.SettingsDialogFragment;
import com.bbva.glomohybrid.cellsweb.view.dialog.SettingsDialogType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SettingsDialogFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/view/dialog/SettingsDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/app/Dialog;", "onCreateDialog", "<init>", "()V", "Companion", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class SettingsDialogFragment extends DialogFragment {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TYPE_DIALOG_KEY = "settings_dialog_type";

    @NotNull
    public static final String TYPE_OBJECT_KEY = "settings_dialog_object";

    /* JADX INFO: compiled from: SettingsDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/view/dialog/SettingsDialogFragment$Companion;", "", "()V", "TYPE_DIALOG_KEY", "", "TYPE_OBJECT_KEY", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    @Override // androidx.fragment.app.DialogFragment
    @NotNull
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        final String string;
        SettingsDialogType settingsDialogType;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(TYPE_DIALOG_KEY)) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            Parcelable parcelable = arguments2.getParcelable(TYPE_OBJECT_KEY);
            settingsDialogType = parcelable instanceof SettingsDialogType ? (SettingsDialogType) parcelable : null;
            if (settingsDialogType == null) {
                settingsDialogType = SettingsDialogTypeKt.toSettingsDialogType(SettingsDialogType.CALENDAR);
            }
        } else {
            settingsDialogType = SettingsDialogTypeKt.toSettingsDialogType(SettingsDialogType.CALENDAR);
        }
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        AlertDialog alertDialogCreate = new AlertDialog.Builder(activity).setTitle(settingsDialogType.getResTitleId()).setMessage(settingsDialogType.getResMessageId()).setPositiveButton(settingsDialogType.getResPositiveBtnId(), new DialogInterface.OnClickListener() { // from class: m8.a
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SettingsDialogFragment.Companion companion = SettingsDialogFragment.INSTANCE;
                SettingsDialogFragment this$0 = this.f83366p0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                String dialogType = string;
                Intrinsics.checkNotNullParameter(dialogType, "$dialogType");
                this$0.getClass();
                if (Intrinsics.areEqual(dialogType, SettingsDialogType.LOCATION_SERVICE)) {
                    CellsReactor.fire$default(SettingsDialogComponent.ID, SettingsDialogComponent.Companion.getACTION_OPEN_LOCATION_SYSTEM_SETTINGS(), null, 4, null);
                } else {
                    CellsReactor.fire$default(SettingsDialogComponent.ID, SettingsDialogComponent.Companion.getACTION_OPEN_SETTINGS(), null, 4, null);
                }
                this$0.dismiss();
            }
        }).setNegativeButton(settingsDialogType.getResNegativeBtnId(), new DialogInterface.OnClickListener(this) { // from class: m8.b

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ SettingsDialogFragment f83369q0;

            {
                this.f83369q0 = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                SettingsDialogFragment.Companion companion = SettingsDialogFragment.INSTANCE;
                String dialogType = string;
                Intrinsics.checkNotNullParameter(dialogType, "$dialogType");
                SettingsDialogFragment this$0 = this.f83369q0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                CellsReactor.fire(SettingsDialogComponent.ID, SettingsDialogComponent.Companion.getACTION_CANCEL_DIALOG(), dialogType);
                this$0.dismiss();
            }
        }).create();
        Intrinsics.checkNotNullExpressionValue(alertDialogCreate, "create(...)");
        return alertDialogCreate;
    }
}
