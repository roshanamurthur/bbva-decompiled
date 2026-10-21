package io.card.payment.i18n;

import android.content.Intent;
import io.card.payment.CardIOActivity;
import io.card.payment.i18n.locales.LocalizedStringsList;

/* JADX INFO: loaded from: classes7.dex */
public final class LocalizedStrings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final I18nManager<StringKey> f69799a = new I18nManager<>(StringKey.class, LocalizedStringsList.ALL_LOCALES);

    public static String getString(StringKey stringKey) {
        return f69799a.getString(stringKey);
    }

    public static void setLanguage(Intent intent) {
        f69799a.setLanguage(intent.getStringExtra(CardIOActivity.EXTRA_LANGUAGE_OR_LOCALE));
    }

    public static String getString(StringKey stringKey, String str) {
        I18nManager<StringKey> i18nManager = f69799a;
        return i18nManager.getString(stringKey, i18nManager.getLocaleFromSpecifier(str));
    }
}
