package com.bbva.glomohybrid.cellsweb.view.dialog;

import com.bbva.glomohybrid.cellsweb.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SettingsDialogType.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toSettingsDialogType", "Lcom/bbva/glomohybrid/cellsweb/view/dialog/SettingsDialogType;", "", "CellsWeb_mexicoRelease"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SettingsDialogTypeKt {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @NotNull
    public static final SettingsDialogType toSettingsDialogType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -178324674:
                if (str.equals(SettingsDialogType.CALENDAR)) {
                    return new SettingsDialogType(R.string.dialog_settings_calendar_title, R.string.dialog_settings_calendar_message, R.string.dialog_settings_calendar_ok, R.string.dialog_settings_calendar_cancel);
                }
                break;
            case 3452698:
                if (str.equals("push")) {
                    return new SettingsDialogType(R.string.dialog_settings_push_title, R.string.dialog_settings_push_message, R.string.dialog_settings_push_ok, R.string.dialog_settings_push_cancel);
                }
                break;
            case 66670086:
                if (str.equals("geolocation")) {
                    return new SettingsDialogType(R.string.dialog_settings_location_title, R.string.dialog_settings_location_message, R.string.dialog_settings_location_ok, R.string.dialog_settings_location_cancel);
                }
                break;
            case 1259325083:
                if (str.equals(SettingsDialogType.LOCATION_AND_PUSH)) {
                    return new SettingsDialogType(R.string.dialog_settings_location_and_push_title, R.string.dialog_settings_location_and_push_message, R.string.dialog_settings_location_and_push_ok, R.string.dialog_settings_location_and_push_cancel);
                }
                break;
            case 1362711932:
                if (str.equals(SettingsDialogType.LOCATION_SERVICE)) {
                    return new SettingsDialogType(R.string.dialog_settings_location_title, R.string.dialog_settings_location_service_message, R.string.dialog_settings_location_ok, R.string.dialog_settings_location_cancel);
                }
                break;
        }
        throw new IllegalArgumentException("Invalid settings type");
    }
}
