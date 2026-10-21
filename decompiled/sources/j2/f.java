package j2;

import android.os.LocaleList;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.m;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleListPlatformWrapper.java */
/* JADX INFO: loaded from: classes2.dex */
@RequiresApi(24)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocaleList f78765a;

    public f(Object obj) {
        this.f78765a = m.c(obj);
    }

    @Override // j2.e
    public final int a(Locale locale) {
        return this.f78765a.indexOf(locale);
    }

    @Override // j2.e
    public final String b() {
        return this.f78765a.toLanguageTags();
    }

    @Override // j2.e
    public final Object c() {
        return this.f78765a;
    }

    @Override // j2.e
    @Nullable
    public final Locale d(@NonNull String[] strArr) {
        return this.f78765a.getFirstMatch(strArr);
    }

    public final boolean equals(Object obj) {
        return this.f78765a.equals(((e) obj).c());
    }

    @Override // j2.e
    public final Locale get(int i10) {
        return this.f78765a.get(i10);
    }

    public final int hashCode() {
        return this.f78765a.hashCode();
    }

    @Override // j2.e
    public final boolean isEmpty() {
        return this.f78765a.isEmpty();
    }

    @Override // j2.e
    public final int size() {
        return this.f78765a.size();
    }

    public final String toString() {
        return this.f78765a.toString();
    }
}
