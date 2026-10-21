package com.bbva.ethermobilesdk.deviceinfo.component;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import android.telephony.TelephonyManager;
import com.bbva.ethermobilesdk.deviceinfo.data.Language;
import com.bbva.ethermobilesdk.deviceinfo.data.Region;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Currency;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Locale.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000f\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/component/Locale;", "", "Lcom/bbva/ethermobilesdk/deviceinfo/data/Language;", "b", "Lkotlin/Lazy;", "getLanguage", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/Language;", "language", "", "getCountry", "()Ljava/lang/String;", "country", "Lcom/bbva/ethermobilesdk/deviceinfo/data/Region;", "getRegion", "()Lcom/bbva/ethermobilesdk/deviceinfo/data/Region;", "region", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "deviceinfo_release"}, k = 1, mv = {1, 8, 0})
public final class Locale {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f29532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy language;

    /* JADX INFO: compiled from: Locale.kt */
    public static final class a extends Lambda implements Function0<Language> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f29534p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Language invoke() {
            java.util.Locale locale = java.util.Locale.getDefault();
            String languageTag = locale.toLanguageTag();
            Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag()");
            String displayLanguage = locale.getDisplayLanguage();
            Intrinsics.checkNotNullExpressionValue(displayLanguage, "displayLanguage");
            return new Language(languageTag, displayLanguage);
        }
    }

    public Locale(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f29532a = context;
        this.language = LazyKt__LazyJVMKt.lazy(a.f29534p0);
    }

    @NotNull
    public final String getCountry() {
        String networkCountryIso;
        Configuration configuration;
        java.util.Locale locale;
        Configuration configuration2;
        LocaleList locales;
        java.util.Locale locale2;
        Context context = this.f29532a;
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null) {
            return "";
        }
        if (telephonyManager.getPhoneType() == 2) {
            networkCountryIso = "";
        } else if (telephonyManager.getSimCountryIso() != null) {
            networkCountryIso = telephonyManager.getSimCountryIso();
            Intrinsics.checkNotNullExpressionValue(networkCountryIso, "{\n                      …Iso\n                    }");
        } else {
            networkCountryIso = telephonyManager.getNetworkCountryIso();
            Intrinsics.checkNotNullExpressionValue(networkCountryIso, "{\n                      …Iso\n                    }");
        }
        if (networkCountryIso.length() == 2) {
            return networkCountryIso;
        }
        String country = null;
        if (Build.VERSION.SDK_INT >= 24) {
            Resources resources = context.getResources();
            if (resources != null && (configuration2 = resources.getConfiguration()) != null && (locales = configuration2.getLocales()) != null && (locale2 = locales.get(0)) != null) {
                country = locale2.getCountry();
            }
            if (country == null) {
                return "";
            }
            Intrinsics.checkNotNullExpressionValue(country, "context.resources?.confi…es?.get(0)?.country ?: \"\"");
        } else {
            Resources resources2 = context.getResources();
            if (resources2 != null && (configuration = resources2.getConfiguration()) != null && (locale = configuration.locale) != null) {
                country = locale.getCountry();
            }
            if (country == null) {
                return "";
            }
            Intrinsics.checkNotNullExpressionValue(country, "context.resources?.confi…on?.locale?.country ?: \"\"");
        }
        return country;
    }

    @NotNull
    public final Language getLanguage() {
        return (Language) this.language.getValue();
    }

    @NotNull
    public final Region getRegion() {
        java.util.Locale locale = java.util.Locale.getDefault();
        Context context = this.f29532a;
        Object systemService = context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        TelephonyManager telephonyManager = (TelephonyManager) systemService;
        Currency currency = Currency.getInstance(java.util.Locale.getDefault());
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(context);
        Intrinsics.checkNotNull(dateFormat, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) dateFormat;
        String country = telephonyManager.getSimCountryIso() == null ? locale.getCountry() : telephonyManager.getSimCountryIso();
        Intrinsics.checkNotNullExpressionValue(country, "if (manager.simCountryIs…lse manager.simCountryIso");
        String localizedPattern = simpleDateFormat.toLocalizedPattern();
        Intrinsics.checkNotNullExpressionValue(localizedPattern, "dateFormat.toLocalizedPattern()");
        String currencyCode = currency.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "currency.currencyCode");
        String displayCountry = locale.getDisplayCountry();
        Intrinsics.checkNotNullExpressionValue(displayCountry, "locale.displayCountry");
        String symbol = currency.getSymbol(locale);
        Intrinsics.checkNotNullExpressionValue(symbol, "currency.getSymbol(locale)");
        return new Region(country, localizedPattern, currencyCode, displayCountry, symbol);
    }
}
