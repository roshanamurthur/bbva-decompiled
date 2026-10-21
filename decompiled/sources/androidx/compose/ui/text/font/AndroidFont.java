package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidFont.kt */
/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b'\u0018\u00002\u00020\u0001:\u0001\u0017B\"\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u0013\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015B\u001c\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\bø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0016R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFont;", "Landroidx/compose/ui/text/font/Font;", "Landroidx/compose/ui/text/font/FontLoadingStrategy;", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLoadingStrategy-PKNRLFQ", "()I", "loadingStrategy", "Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "b", "Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "getTypefaceLoader", "()Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "typefaceLoader", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "c", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "getVariationSettings", "()Landroidx/compose/ui/text/font/FontVariation$Settings;", "variationSettings", "<init>", "(ILandroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;Landroidx/compose/ui/text/font/FontVariation$Settings;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "(ILandroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "TypefaceLoader", "ui-text_release"}, k = 1, mv = {1, 8, 0})
public abstract class AndroidFont implements Font {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int loadingStrategy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TypefaceLoader typefaceLoader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FontVariation.Settings variationSettings;

    /* JADX INFO: compiled from: AndroidFont.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0002\u0010\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/AndroidFont$TypefaceLoader;", "", "awaitLoad", "Landroid/graphics/Typeface;", "context", "Landroid/content/Context;", "font", "Landroidx/compose/ui/text/font/AndroidFont;", "(Landroid/content/Context;Landroidx/compose/ui/text/font/AndroidFont;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadBlocking", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface TypefaceLoader {
        @Nullable
        Object awaitLoad(@NotNull Context context, @NotNull AndroidFont androidFont, @NotNull Continuation<? super android.graphics.Typeface> continuation);

        @Nullable
        android.graphics.Typeface loadBlocking(@NotNull Context context, @NotNull AndroidFont font);
    }

    public AndroidFont(int i10, TypefaceLoader typefaceLoader, FontVariation.Settings variationSettings, DefaultConstructorMarker defaultConstructorMarker) {
        Intrinsics.checkNotNullParameter(typefaceLoader, "typefaceLoader");
        Intrinsics.checkNotNullParameter(variationSettings, "variationSettings");
        this.loadingStrategy = i10;
        this.typefaceLoader = typefaceLoader;
        this.variationSettings = variationSettings;
    }

    @Override // androidx.compose.ui.text.font.Font
    /* JADX INFO: renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name and from getter */
    public final int getLoadingStrategy() {
        return this.loadingStrategy;
    }

    @NotNull
    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    @NotNull
    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Replaced with fontVariation constructor", replaceWith = @ReplaceWith(expression = "AndroidFont(loadingStrategy, typefaceLoader, FontVariation.Settings())", imports = {}))
    public AndroidFont(int i10, TypefaceLoader typefaceLoader, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, typefaceLoader, new FontVariation.Settings(new FontVariation.Setting[0]), null);
        Intrinsics.checkNotNullParameter(typefaceLoader, "typefaceLoader");
    }
}
