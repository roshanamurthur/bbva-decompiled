package com.bbva.nativesettings;

import android.app.Activity;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.nativesettings.command.OpenSettings;
import com.bbva.nativesettings.command.exception.NotSupportedSettingException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NativeSettings.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/bbva/nativesettings/NativeSettings;", "", "()V", "launchNativeSetting", "Lcom/bbva/nativesettings/command/OpenSettings;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "setting", "", "nativesettings_release"}, k = 1, mv = {1, 4, 2})
public final class NativeSettings {
    @NotNull
    public final OpenSettings launchNativeSetting(@NotNull Activity activity, @NotNull String setting) throws NotSupportedSettingException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(setting, "setting");
        OpenSettings openSettings = new OpenSettings();
        openSettings.launchNativeSetting(activity, setting);
        return openSettings;
    }
}
