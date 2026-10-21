package androidx.compose.ui.text.intl;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidLocaleDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocale;", "Landroidx/compose/ui/text/intl/PlatformLocale;", "", "toLanguageTag", "Ljava/util/Locale;", "a", "Ljava/util/Locale;", "getJavaLocale", "()Ljava/util/Locale;", "javaLocale", "getLanguage", "()Ljava/lang/String;", "language", "getScript", "script", "getRegion", "region", "<init>", "(Ljava/util/Locale;)V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidLocale implements PlatformLocale {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final java.util.Locale javaLocale;

    public AndroidLocale(@NotNull java.util.Locale javaLocale) {
        Intrinsics.checkNotNullParameter(javaLocale, "javaLocale");
        this.javaLocale = javaLocale;
    }

    @NotNull
    public final java.util.Locale getJavaLocale() {
        return this.javaLocale;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String getLanguage() {
        String language = this.javaLocale.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "javaLocale.language");
        return language;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String getRegion() {
        String country = this.javaLocale.getCountry();
        Intrinsics.checkNotNullExpressionValue(country, "javaLocale.country");
        return country;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String getScript() {
        String script = this.javaLocale.getScript();
        Intrinsics.checkNotNullExpressionValue(script, "javaLocale.script");
        return script;
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocale
    @NotNull
    public String toLanguageTag() {
        String languageTag = this.javaLocale.toLanguageTag();
        Intrinsics.checkNotNullExpressionValue(languageTag, "javaLocale.toLanguageTag()");
        return languageTag;
    }
}
