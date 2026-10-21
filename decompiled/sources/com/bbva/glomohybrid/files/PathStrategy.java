package com.bbva.glomohybrid.files;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PathStrategy.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/files/PathStrategy;", "", "getLength", "", "uri", "Landroid/net/Uri;", "(Landroid/net/Uri;)Ljava/lang/Long;", "getName", "", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface PathStrategy {

    /* JADX INFO: compiled from: PathStrategy.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        @Nullable
        public static Long getLength(@NotNull PathStrategy pathStrategy, @NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return null;
        }

        @Nullable
        public static String getName(@NotNull PathStrategy pathStrategy, @NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            return null;
        }
    }

    @Nullable
    Long getLength(@NotNull Uri uri);

    @Nullable
    String getName(@NotNull Uri uri);
}
