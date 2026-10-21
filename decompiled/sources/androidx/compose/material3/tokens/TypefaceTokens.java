package androidx.compose.material3.tokens;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.GenericFontFamily;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: TypefaceTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000f¨\u0006\u0019"}, d2 = {"Landroidx/compose/material3/tokens/TypefaceTokens;", "", "Landroidx/compose/ui/text/font/GenericFontFamily;", "a", "Landroidx/compose/ui/text/font/GenericFontFamily;", "getBrand", "()Landroidx/compose/ui/text/font/GenericFontFamily;", "Brand", "b", "getPlain", "Plain", "Landroidx/compose/ui/text/font/FontWeight;", "c", "Landroidx/compose/ui/text/font/FontWeight;", "getWeightBold", "()Landroidx/compose/ui/text/font/FontWeight;", "WeightBold", "d", "getWeightMedium", "WeightMedium", "e", "getWeightRegular", "WeightRegular", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class TypefaceTokens {

    @NotNull
    public static final TypefaceTokens INSTANCE = new TypefaceTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final GenericFontFamily Brand;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final GenericFontFamily Plain;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight WeightBold;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight WeightMedium;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final FontWeight WeightRegular;

    static {
        FontFamily.Companion companion = FontFamily.INSTANCE;
        Brand = companion.getSansSerif();
        Plain = companion.getSansSerif();
        FontWeight.Companion companion2 = FontWeight.INSTANCE;
        WeightBold = companion2.getBold();
        WeightMedium = companion2.getMedium();
        WeightRegular = companion2.getNormal();
    }

    @NotNull
    public final GenericFontFamily getBrand() {
        return Brand;
    }

    @NotNull
    public final GenericFontFamily getPlain() {
        return Plain;
    }

    @NotNull
    public final FontWeight getWeightBold() {
        return WeightBold;
    }

    @NotNull
    public final FontWeight getWeightMedium() {
        return WeightMedium;
    }

    @NotNull
    public final FontWeight getWeightRegular() {
        return WeightRegular;
    }
}
