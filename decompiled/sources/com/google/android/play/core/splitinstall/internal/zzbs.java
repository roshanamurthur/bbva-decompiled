package com.google.android.play.core.splitinstall.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import com.bbva.notifications.constants.PushConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46310a;

    public zzbs(Context context) {
        this.f46310a = context;
    }

    public static String a(Locale locale) {
        return String.valueOf(locale.getLanguage()).concat(locale.getCountry().isEmpty() ? "" : PushConstants.GE_PARAMS_SEPARATOR.concat(String.valueOf(locale.getCountry())));
    }

    public final List zza() {
        Configuration configuration = this.f46310a.getResources().getConfiguration();
        if (Build.VERSION.SDK_INT < 24) {
            return Collections.singletonList(a(configuration.locale));
        }
        LocaleList locales = configuration.getLocales();
        ArrayList arrayList = new ArrayList(locales.size());
        for (int i10 = 0; i10 < locales.size(); i10++) {
            arrayList.add(a(locales.get(i10)));
        }
        return arrayList;
    }
}
