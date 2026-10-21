package com.bbva.ethermobilesdk.tokencompat.extension;

import android.content.Context;
import android.content.Intent;
import androidx.camera.camera2.internal.compat.u;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Intent.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0001H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a$\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u000b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\f"}, d2 = {"getKey", "", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getValue", "putKey", "key", "putValue", "value", "toPair", "Lkotlin/Pair;", "ethertoken-compat_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class IntentKt {
    @Nullable
    public static final String getKey(@NotNull Intent intent, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String stringExtra = intent.getStringExtra(context.getPackageName() + ".X19rX18");
        if (stringExtra != null) {
            return StringKt.unwrapped(stringExtra);
        }
        return null;
    }

    @Nullable
    public static final String getValue(@NotNull Intent intent, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String stringExtra = intent.getStringExtra(context.getPackageName() + ".X192X18");
        if (stringExtra != null) {
            return StringKt.unwrapped(stringExtra);
        }
        return null;
    }

    @NotNull
    public static final Intent putKey(@NotNull Intent intent, @NotNull Context context, @NotNull String key) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(key, "key");
        Intent intentPutExtra = intent.putExtra(u.f(context.getPackageName(), ".X19rX18"), StringKt.wrapped(key));
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(\"${context.pack…me}.$KEY\", key.wrapped())");
        return intentPutExtra;
    }

    @NotNull
    public static final Intent putValue(@NotNull Intent intent, @NotNull Context context, @NotNull String value) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(value, "value");
        Intent intentPutExtra = intent.putExtra(u.f(context.getPackageName(), ".X192X18"), StringKt.wrapped(value));
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(\"${context.pack…$VALUE\", value.wrapped())");
        return intentPutExtra;
    }

    @Nullable
    public static final Pair<String, String> toPair(@NotNull Intent intent, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        String key = getKey(intent, context);
        if (key != null) {
            return TuplesKt.to(key, getValue(intent, context));
        }
        return null;
    }
}
