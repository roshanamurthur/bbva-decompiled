package androidx.compose.ui.semantics;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SemanticsConfiguration.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a%\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00010\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"getOrNull", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "key", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SemanticsConfigurationKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: SemanticsConfiguration.kt */
    public static final class a<T> extends Lambda implements Function0<T> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f17518p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final T invoke() {
            return null;
        }
    }

    @Nullable
    public static final <T> T getOrNull(@NotNull SemanticsConfiguration semanticsConfiguration, @NotNull SemanticsPropertyKey<T> key) {
        Intrinsics.checkNotNullParameter(semanticsConfiguration, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) semanticsConfiguration.getOrElseNullable(key, a.f17518p0);
    }
}
