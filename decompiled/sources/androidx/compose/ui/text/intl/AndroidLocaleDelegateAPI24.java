package androidx.compose.ui.text.intl;

import androidx.annotation.RequiresApi;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidLocaleDelegate.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(api = 24)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/intl/AndroidLocaleDelegateAPI24;", "Landroidx/compose/ui/text/intl/PlatformLocaleDelegate;", "", "languageTag", "Landroidx/compose/ui/text/intl/PlatformLocale;", "parseLanguageTag", "Landroidx/compose/ui/text/intl/LocaleList;", "getCurrent", "()Landroidx/compose/ui/text/intl/LocaleList;", "current", "<init>", "()V", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public final class AndroidLocaleDelegateAPI24 implements PlatformLocaleDelegate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public android.os.LocaleList f18172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public LocaleList f18173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SynchronizedObject f18174c = Synchronization_jvmKt.createSynchronizedObject();

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public LocaleList getCurrent() {
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        Intrinsics.checkNotNullExpressionValue(localeList, "getDefault()");
        synchronized (this.f18174c) {
            LocaleList localeList2 = this.f18173b;
            if (localeList2 != null && localeList == this.f18172a) {
                return localeList2;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                java.util.Locale locale = localeList.get(i10);
                Intrinsics.checkNotNullExpressionValue(locale, "platformLocaleList[position]");
                arrayList.add(new Locale(new AndroidLocale(locale)));
            }
            LocaleList localeList3 = new LocaleList(arrayList);
            this.f18172a = localeList;
            this.f18173b = localeList3;
            return localeList3;
        }
    }

    @Override // androidx.compose.ui.text.intl.PlatformLocaleDelegate
    @NotNull
    public PlatformLocale parseLanguageTag(@NotNull String languageTag) {
        Intrinsics.checkNotNullParameter(languageTag, "languageTag");
        java.util.Locale localeForLanguageTag = java.util.Locale.forLanguageTag(languageTag);
        Intrinsics.checkNotNullExpressionValue(localeForLanguageTag, "forLanguageTag(languageTag)");
        return new AndroidLocale(localeForLanguageTag);
    }
}
