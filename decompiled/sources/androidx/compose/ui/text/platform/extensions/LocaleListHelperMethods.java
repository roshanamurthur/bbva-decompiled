package androidx.compose.ui.text.platform.extensions;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.ui.platform.x;
import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.core.app.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LocaleExtensions.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(24)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods;", "", "()V", "localeSpan", "localeList", "Landroidx/compose/ui/text/intl/LocaleList;", "setTextLocales", "", "textPaint", "Landroidx/compose/ui/text/platform/AndroidTextPaint;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLocaleExtensions.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,50:1\n1549#2:51\n1620#2,3:52\n1549#2:57\n1620#2,3:58\n37#3,2:55\n37#3,2:61\n*S KotlinDebug\n*F\n+ 1 LocaleExtensions.android.kt\nandroidx/compose/ui/text/platform/extensions/LocaleListHelperMethods\n*L\n40#1:51\n40#1:52,3\n47#1:57\n47#1:58,3\n40#1:55,2\n47#1:61,2\n*E\n"})
public final class LocaleListHelperMethods {

    @NotNull
    public static final LocaleListHelperMethods INSTANCE = new LocaleListHelperMethods();

    @DoNotInline
    @RequiresApi(24)
    @NotNull
    public final Object localeSpan(@NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(LocaleExtensions_androidKt.toJavaLocale(it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        return x.b(n.a((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    @DoNotInline
    @RequiresApi(24)
    public final void setTextLocales(@NotNull AndroidTextPaint textPaint, @NotNull LocaleList localeList) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(localeList, "localeList");
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(localeList, 10));
        Iterator<Locale> it = localeList.iterator();
        while (it.hasNext()) {
            arrayList.add(LocaleExtensions_androidKt.toJavaLocale(it.next()));
        }
        java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
        textPaint.setTextLocales(n.a((java.util.Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
