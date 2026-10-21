package androidx.compose.ui.text.intl;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Locale.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0000\u0012\u0006\u0010\u000f\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016R\u001a\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0016\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u001c"}, d2 = {"Landroidx/compose/ui/text/intl/Locale;", "", "", "toLanguageTag", "other", "", "equals", "", GenerateActivationFormCommand.HASH_CODE, "toString", "Landroidx/compose/ui/text/intl/PlatformLocale;", "a", "Landroidx/compose/ui/text/intl/PlatformLocale;", "getPlatformLocale$ui_text_release", "()Landroidx/compose/ui/text/intl/PlatformLocale;", "platformLocale", "getLanguage", "()Ljava/lang/String;", "language", "getScript", "script", "getRegion", "region", "<init>", "(Landroidx/compose/ui/text/intl/PlatformLocale;)V", "languageTag", "(Ljava/lang/String;)V", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class Locale {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PlatformLocale platformLocale;

    /* JADX INFO: compiled from: Locale.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/intl/Locale$Companion;", "", "()V", "current", "Landroidx/compose/ui/text/intl/Locale;", "getCurrent", "()Landroidx/compose/ui/text/intl/Locale;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Locale getCurrent() {
            return PlatformLocaleKt.getPlatformLocaleDelegate().getCurrent().get(0);
        }
    }

    public Locale(@NotNull PlatformLocale platformLocale) {
        Intrinsics.checkNotNullParameter(platformLocale, "platformLocale");
        this.platformLocale = platformLocale;
    }

    public boolean equals(@Nullable Object other) {
        if (other == null || !(other instanceof Locale)) {
            return false;
        }
        if (this == other) {
            return true;
        }
        return Intrinsics.areEqual(toLanguageTag(), ((Locale) other).toLanguageTag());
    }

    @NotNull
    public final String getLanguage() {
        return this.platformLocale.getLanguage();
    }

    @NotNull
    /* JADX INFO: renamed from: getPlatformLocale$ui_text_release, reason: from getter */
    public final PlatformLocale getPlatformLocale() {
        return this.platformLocale;
    }

    @NotNull
    public final String getRegion() {
        return this.platformLocale.getRegion();
    }

    @NotNull
    public final String getScript() {
        return this.platformLocale.getScript();
    }

    public int hashCode() {
        return toLanguageTag().hashCode();
    }

    @NotNull
    public final String toLanguageTag() {
        return this.platformLocale.toLanguageTag();
    }

    @NotNull
    public String toString() {
        return toLanguageTag();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Locale(@NotNull String languageTag) {
        this(PlatformLocaleKt.getPlatformLocaleDelegate().parseLanguageTag(languageTag));
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
    }
}
