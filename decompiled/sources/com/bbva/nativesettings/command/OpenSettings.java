package com.bbva.nativesettings.command;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.nfc.NfcAdapter;
import bk.q;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.nativesettings.command.exception.NotSupportedSettingException;
import com.bbva.nativesettings.common.Constants;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: OpenSettings.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/bbva/nativesettings/command/OpenSettings;", "", "Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "", "setting", "", "launchNativeSetting", "<init>", "()V", "nativesettings_release"}, k = 1, mv = {1, 4, 2})
public final class OpenSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Lazy f35051a = LazyKt__LazyJVMKt.lazy(a.f35052p0);

    /* JADX INFO: compiled from: OpenSettings.kt */
    public static final class a extends Lambda implements Function0<Map<String, ? extends String>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f35052p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Map<String, ? extends String> invoke() {
            return q.mapOf(TuplesKt.to(Constants.ACCESSIBILITY, "android.settings.ACCESSIBILITY_SETTINGS"), TuplesKt.to(Constants.ADD_ACCOUNT, "android.settings.ADD_ACCOUNT_SETTINGS"), TuplesKt.to(Constants.AIRPLANE_MODE, "android.settings.AIRPLANE_MODE_SETTINGS"), TuplesKt.to("apn", "android.settings.APN_SETTINGS"), TuplesKt.to(Constants.APPLICATION_DEVELOPMENT, "android.settings.APPLICATION_DEVELOPMENT_SETTINGS"), TuplesKt.to(Constants.APPLICATION, "android.settings.APPLICATION_SETTINGS"), TuplesKt.to(Constants.APPLICATION_SETTINGS, "android.settings.APPLICATION_DETAILS_SETTINGS"), TuplesKt.to(Constants.BLUETOOTH, "android.settings.BLUETOOTH_SETTINGS"), TuplesKt.to(Constants.CAPTIONING, "android.settings.CAPTIONING_SETTINGS"), TuplesKt.to(Constants.CAST, "android.settings.CAST_SETTINGS"), TuplesKt.to(Constants.DATA_ROAMING, "android.settings.DATA_ROAMING_SETTINGS"), TuplesKt.to("date", "android.settings.DATE_SETTINGS"), TuplesKt.to(Constants.DEVICE_INFO, "android.settings.DEVICE_INFO_SETTINGS"), TuplesKt.to("display", "android.settings.DISPLAY_SETTINGS"), TuplesKt.to(Constants.DREAM, "android.settings.DREAM_SETTINGS"), TuplesKt.to(Constants.HOME, "android.settings.HOME_SETTINGS"), TuplesKt.to(Constants.INPUT_METHOD, "android.settings.INPUT_METHOD_SETTINGS"), TuplesKt.to(Constants.INPUT_METHOD_SUBTYPE, "android.settings.INPUT_METHOD_SUBTYPE_SETTINGS"), TuplesKt.to(Constants.INTERNAL_STORAGE, "android.settings.INTERNAL_STORAGE_SETTINGS"), TuplesKt.to("locale", "android.settings.LOCALE_SETTINGS"), TuplesKt.to(Constants.LOCATION_SOURCE, "android.settings.LOCATION_SOURCE_SETTINGS"), TuplesKt.to(Constants.MANAGE_ALL_APPLICATIONS, "android.settings.MANAGE_ALL_APPLICATIONS_SETTINGS"), TuplesKt.to(Constants.MANAGE_APPLICATIONS, "android.settings.MANAGE_APPLICATIONS_SETTINGS"), TuplesKt.to(Constants.MEMORY_CARD, "android.settings.MEMORY_CARD_SETTINGS"), TuplesKt.to(Constants.NETWORK_OPERATOR, "android.settings.NETWORK_OPERATOR_SETTINGS"), TuplesKt.to(Constants.NFCSHARING, "android.settings.NFCSHARING_SETTINGS"), TuplesKt.to(Constants.NFC_PAYMENT, "android.settings.NFC_PAYMENT_SETTINGS"), TuplesKt.to(Constants.NFC_SETTINGS, "android.settings.NFC_SETTINGS"), TuplesKt.to(Constants.PRINT, "android.settings.ACTION_PRINT_SETTINGS"), TuplesKt.to(Constants.PRIVACY, "android.settings.PRIVACY_SETTINGS"), TuplesKt.to(Constants.QUICK_LAUNCH, "android.settings.QUICK_LAUNCH_SETTINGS"), TuplesKt.to("search", "android.search.action.SEARCH_SETTINGS"), TuplesKt.to(Constants.SECURITY, "android.settings.SECURITY_SETTINGS"), TuplesKt.to("settings", "android.settings.SETTINGS"), TuplesKt.to(Constants.SHOW_REGULATORY_INFO, "android.settings.SHOW_REGULATORY_INFO"), TuplesKt.to("sound", "android.settings.SOUND_SETTINGS"), TuplesKt.to(Constants.SYNC, "android.settings.SYNC_SETTINGS"), TuplesKt.to(Constants.USAGE_ACCESS, "android.settings.USAGE_ACCESS_SETTINGS"), TuplesKt.to(Constants.USER_DICTIONARY, "android.settings.USER_DICTIONARY_SETTINGS"), TuplesKt.to(Constants.VOICE_INPUT, "android.settings.VOICE_INPUT_SETTINGS"), TuplesKt.to(Constants.WIFI_IP, "android.settings.WIFI_IP_SETTINGS"), TuplesKt.to(Constants.WIFI, "android.settings.WIFI_SETTINGS"), TuplesKt.to(Constants.WIRELESS, "android.settings.WIRELESS_SETTINGS"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void launchNativeSetting(@NotNull Activity activity, @NotNull String setting) throws NotSupportedSettingException, IllegalArgumentException {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(setting, "setting");
        if (setting.length() <= 0) {
            throw new IllegalArgumentException();
        }
        int i10 = 1;
        boolean z10 = NfcAdapter.getDefaultAdapter(activity) != null;
        String str = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if ((Intrinsics.areEqual(setting, Constants.NFCSHARING) || Intrinsics.areEqual(setting, Constants.NFC_PAYMENT) || Intrinsics.areEqual(setting, Constants.NFC_SETTINGS)) && !z10) {
            throw new NotSupportedSettingException(objArr2 == true ? 1 : 0, i10, objArr == true ? 1 : 0);
        }
        try {
            String lowerCase = setting.toLowerCase();
            Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase()");
            Intent intent = new Intent((String) ((Map) this.f35051a.getValue()).get(lowerCase));
            if (Intrinsics.areEqual(lowerCase, Constants.APPLICATION_SETTINGS)) {
                intent.setData(Uri.fromParts("package", activity.getPackageName(), null));
            }
            activity.startActivity(intent);
        } catch (Throwable unused) {
            throw new NotSupportedSettingException(str, i10, objArr3 == true ? 1 : 0);
        }
    }
}
