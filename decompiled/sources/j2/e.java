package j2;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Locale;

/* JADX INFO: compiled from: LocaleListInterface.java */
/* JADX INFO: loaded from: classes2.dex */
public interface e {
    @IntRange(from = -1)
    int a(Locale locale);

    String b();

    Object c();

    @Nullable
    Locale d(@NonNull String[] strArr);

    Locale get(int i10);

    boolean isEmpty();

    @IntRange(from = 0)
    int size();
}
