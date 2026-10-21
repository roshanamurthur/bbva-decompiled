package com.bbva.glomohybrid.base;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.androidtoolkit.helper.LazyGetter;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Helpers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\b\u0004\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0005"}, d2 = {"lazyGetter", "Lcom/bbva/androidtoolkit/helper/LazyGetter;", ExifInterface.GPS_DIRECTION_TRUE, "provider", "Lkotlin/Function0;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class HelpersKt {
    @NotNull
    public static final <T> LazyGetter<T> lazyGetter(@NotNull final Function0<? extends T> provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        return new LazyGetter<T>() { // from class: com.bbva.glomohybrid.base.HelpersKt.lazyGetter.1
            @Override // com.bbva.androidtoolkit.helper.LazyGetter
            public T initialValue() {
                return provider.invoke();
            }
        };
    }
}
