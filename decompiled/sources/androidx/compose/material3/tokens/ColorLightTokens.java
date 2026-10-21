package androidx.compose.material3.tokens;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ColorLightTokens.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\\\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\\\u0010]R \u0010\u0007\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R \u0010\n\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R \u0010\r\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R \u0010\u0010\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0006R \u0010\u0013\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0004\u001a\u0004\b\u0012\u0010\u0006R \u0010\u0016\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R \u0010\u0019\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0006R \u0010\u001c\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R \u0010\u001f\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0004\u001a\u0004\b\u001e\u0010\u0006R \u0010\"\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b \u0010\u0004\u001a\u0004\b!\u0010\u0006R \u0010%\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b#\u0010\u0004\u001a\u0004\b$\u0010\u0006R \u0010(\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b&\u0010\u0004\u001a\u0004\b'\u0010\u0006R \u0010+\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b)\u0010\u0004\u001a\u0004\b*\u0010\u0006R \u0010.\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b,\u0010\u0004\u001a\u0004\b-\u0010\u0006R \u00101\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b/\u0010\u0004\u001a\u0004\b0\u0010\u0006R \u00104\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b2\u0010\u0004\u001a\u0004\b3\u0010\u0006R \u00107\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b5\u0010\u0004\u001a\u0004\b6\u0010\u0006R \u0010:\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b8\u0010\u0004\u001a\u0004\b9\u0010\u0006R \u0010=\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b;\u0010\u0004\u001a\u0004\b<\u0010\u0006R \u0010@\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b>\u0010\u0004\u001a\u0004\b?\u0010\u0006R \u0010C\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bA\u0010\u0004\u001a\u0004\bB\u0010\u0006R \u0010F\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bD\u0010\u0004\u001a\u0004\bE\u0010\u0006R \u0010I\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bG\u0010\u0004\u001a\u0004\bH\u0010\u0006R \u0010L\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bJ\u0010\u0004\u001a\u0004\bK\u0010\u0006R \u0010O\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bM\u0010\u0004\u001a\u0004\bN\u0010\u0006R \u0010R\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bP\u0010\u0004\u001a\u0004\bQ\u0010\u0006R \u0010U\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bS\u0010\u0004\u001a\u0004\bT\u0010\u0006R \u0010X\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bV\u0010\u0004\u001a\u0004\bW\u0010\u0006R \u0010[\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\bY\u0010\u0004\u001a\u0004\bZ\u0010\u0006\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006^"}, d2 = {"Landroidx/compose/material3/tokens/ColorLightTokens;", "", "Landroidx/compose/ui/graphics/Color;", "a", "J", "getBackground-0d7_KjU", "()J", "Background", "b", "getError-0d7_KjU", "Error", "c", "getErrorContainer-0d7_KjU", "ErrorContainer", "d", "getInverseOnSurface-0d7_KjU", "InverseOnSurface", "e", "getInversePrimary-0d7_KjU", "InversePrimary", "f", "getInverseSurface-0d7_KjU", "InverseSurface", "g", "getOnBackground-0d7_KjU", "OnBackground", "h", "getOnError-0d7_KjU", "OnError", "i", "getOnErrorContainer-0d7_KjU", "OnErrorContainer", "j", "getOnPrimary-0d7_KjU", "OnPrimary", "k", "getOnPrimaryContainer-0d7_KjU", "OnPrimaryContainer", "l", "getOnSecondary-0d7_KjU", "OnSecondary", "m", "getOnSecondaryContainer-0d7_KjU", "OnSecondaryContainer", "n", "getOnSurface-0d7_KjU", "OnSurface", "o", "getOnSurfaceVariant-0d7_KjU", "OnSurfaceVariant", "p", "getOnTertiary-0d7_KjU", "OnTertiary", "q", "getOnTertiaryContainer-0d7_KjU", "OnTertiaryContainer", "r", "getOutline-0d7_KjU", "Outline", "s", "getOutlineVariant-0d7_KjU", "OutlineVariant", "t", "getPrimary-0d7_KjU", "Primary", "u", "getPrimaryContainer-0d7_KjU", "PrimaryContainer", SharedPrefsStorage.VERSION_KEY, "getScrim-0d7_KjU", "Scrim", "w", "getSecondary-0d7_KjU", "Secondary", "x", "getSecondaryContainer-0d7_KjU", "SecondaryContainer", "y", "getSurface-0d7_KjU", "Surface", "z", "getSurfaceTint-0d7_KjU", "SurfaceTint", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "getSurfaceVariant-0d7_KjU", "SurfaceVariant", "B", "getTertiary-0d7_KjU", "Tertiary", "C", "getTertiaryContainer-0d7_KjU", "TertiaryContainer", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class ColorLightTokens {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public static final long SurfaceVariant;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public static final long Tertiary;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public static final long TertiaryContainer;

    @NotNull
    public static final ColorLightTokens INSTANCE = new ColorLightTokens();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final long Background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final long Error;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final long ErrorContainer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final long InverseOnSurface;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final long InversePrimary;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final long InverseSurface;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final long OnBackground;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final long OnError;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final long OnErrorContainer;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final long OnPrimary;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final long OnPrimaryContainer;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final long OnSecondary;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public static final long OnSecondaryContainer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final long OnSurface;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final long OnSurfaceVariant;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final long OnTertiary;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public static final long OnTertiaryContainer;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public static final long Outline;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public static final long OutlineVariant;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final long Primary;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public static final long PrimaryContainer;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    public static final long Scrim;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    public static final long Secondary;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    public static final long SecondaryContainer;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final long Surface;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    public static final long SurfaceTint;

    static {
        PaletteTokens paletteTokens = PaletteTokens.INSTANCE;
        Background = paletteTokens.m1859getNeutral990d7_KjU();
        Error = paletteTokens.m1839getError400d7_KjU();
        ErrorContainer = paletteTokens.m1844getError900d7_KjU();
        InverseOnSurface = paletteTokens.m1858getNeutral950d7_KjU();
        InversePrimary = paletteTokens.m1882getPrimary800d7_KjU();
        InverseSurface = paletteTokens.m1850getNeutral200d7_KjU();
        OnBackground = paletteTokens.m1848getNeutral100d7_KjU();
        OnError = paletteTokens.m1836getError1000d7_KjU();
        OnErrorContainer = paletteTokens.m1835getError100d7_KjU();
        OnPrimary = paletteTokens.m1875getPrimary1000d7_KjU();
        OnPrimaryContainer = paletteTokens.m1874getPrimary100d7_KjU();
        OnSecondary = paletteTokens.m1888getSecondary1000d7_KjU();
        OnSecondaryContainer = paletteTokens.m1887getSecondary100d7_KjU();
        OnSurface = paletteTokens.m1848getNeutral100d7_KjU();
        OnSurfaceVariant = paletteTokens.m1864getNeutralVariant300d7_KjU();
        OnTertiary = paletteTokens.m1901getTertiary1000d7_KjU();
        OnTertiaryContainer = paletteTokens.m1900getTertiary100d7_KjU();
        Outline = paletteTokens.m1866getNeutralVariant500d7_KjU();
        OutlineVariant = paletteTokens.m1869getNeutralVariant800d7_KjU();
        long jM1878getPrimary400d7_KjU = paletteTokens.m1878getPrimary400d7_KjU();
        Primary = jM1878getPrimary400d7_KjU;
        PrimaryContainer = paletteTokens.m1883getPrimary900d7_KjU();
        Scrim = paletteTokens.m1847getNeutral00d7_KjU();
        Secondary = paletteTokens.m1891getSecondary400d7_KjU();
        SecondaryContainer = paletteTokens.m1896getSecondary900d7_KjU();
        Surface = paletteTokens.m1859getNeutral990d7_KjU();
        SurfaceTint = jM1878getPrimary400d7_KjU;
        SurfaceVariant = paletteTokens.m1870getNeutralVariant900d7_KjU();
        Tertiary = paletteTokens.m1904getTertiary400d7_KjU();
        TertiaryContainer = paletteTokens.m1909getTertiary900d7_KjU();
    }

    /* JADX INFO: renamed from: getBackground-0d7_KjU, reason: not valid java name */
    public final long m1568getBackground0d7_KjU() {
        return Background;
    }

    /* JADX INFO: renamed from: getError-0d7_KjU, reason: not valid java name */
    public final long m1569getError0d7_KjU() {
        return Error;
    }

    /* JADX INFO: renamed from: getErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m1570getErrorContainer0d7_KjU() {
        return ErrorContainer;
    }

    /* JADX INFO: renamed from: getInverseOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1571getInverseOnSurface0d7_KjU() {
        return InverseOnSurface;
    }

    /* JADX INFO: renamed from: getInversePrimary-0d7_KjU, reason: not valid java name */
    public final long m1572getInversePrimary0d7_KjU() {
        return InversePrimary;
    }

    /* JADX INFO: renamed from: getInverseSurface-0d7_KjU, reason: not valid java name */
    public final long m1573getInverseSurface0d7_KjU() {
        return InverseSurface;
    }

    /* JADX INFO: renamed from: getOnBackground-0d7_KjU, reason: not valid java name */
    public final long m1574getOnBackground0d7_KjU() {
        return OnBackground;
    }

    /* JADX INFO: renamed from: getOnError-0d7_KjU, reason: not valid java name */
    public final long m1575getOnError0d7_KjU() {
        return OnError;
    }

    /* JADX INFO: renamed from: getOnErrorContainer-0d7_KjU, reason: not valid java name */
    public final long m1576getOnErrorContainer0d7_KjU() {
        return OnErrorContainer;
    }

    /* JADX INFO: renamed from: getOnPrimary-0d7_KjU, reason: not valid java name */
    public final long m1577getOnPrimary0d7_KjU() {
        return OnPrimary;
    }

    /* JADX INFO: renamed from: getOnPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1578getOnPrimaryContainer0d7_KjU() {
        return OnPrimaryContainer;
    }

    /* JADX INFO: renamed from: getOnSecondary-0d7_KjU, reason: not valid java name */
    public final long m1579getOnSecondary0d7_KjU() {
        return OnSecondary;
    }

    /* JADX INFO: renamed from: getOnSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1580getOnSecondaryContainer0d7_KjU() {
        return OnSecondaryContainer;
    }

    /* JADX INFO: renamed from: getOnSurface-0d7_KjU, reason: not valid java name */
    public final long m1581getOnSurface0d7_KjU() {
        return OnSurface;
    }

    /* JADX INFO: renamed from: getOnSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m1582getOnSurfaceVariant0d7_KjU() {
        return OnSurfaceVariant;
    }

    /* JADX INFO: renamed from: getOnTertiary-0d7_KjU, reason: not valid java name */
    public final long m1583getOnTertiary0d7_KjU() {
        return OnTertiary;
    }

    /* JADX INFO: renamed from: getOnTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1584getOnTertiaryContainer0d7_KjU() {
        return OnTertiaryContainer;
    }

    /* JADX INFO: renamed from: getOutline-0d7_KjU, reason: not valid java name */
    public final long m1585getOutline0d7_KjU() {
        return Outline;
    }

    /* JADX INFO: renamed from: getOutlineVariant-0d7_KjU, reason: not valid java name */
    public final long m1586getOutlineVariant0d7_KjU() {
        return OutlineVariant;
    }

    /* JADX INFO: renamed from: getPrimary-0d7_KjU, reason: not valid java name */
    public final long m1587getPrimary0d7_KjU() {
        return Primary;
    }

    /* JADX INFO: renamed from: getPrimaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1588getPrimaryContainer0d7_KjU() {
        return PrimaryContainer;
    }

    /* JADX INFO: renamed from: getScrim-0d7_KjU, reason: not valid java name */
    public final long m1589getScrim0d7_KjU() {
        return Scrim;
    }

    /* JADX INFO: renamed from: getSecondary-0d7_KjU, reason: not valid java name */
    public final long m1590getSecondary0d7_KjU() {
        return Secondary;
    }

    /* JADX INFO: renamed from: getSecondaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1591getSecondaryContainer0d7_KjU() {
        return SecondaryContainer;
    }

    /* JADX INFO: renamed from: getSurface-0d7_KjU, reason: not valid java name */
    public final long m1592getSurface0d7_KjU() {
        return Surface;
    }

    /* JADX INFO: renamed from: getSurfaceTint-0d7_KjU, reason: not valid java name */
    public final long m1593getSurfaceTint0d7_KjU() {
        return SurfaceTint;
    }

    /* JADX INFO: renamed from: getSurfaceVariant-0d7_KjU, reason: not valid java name */
    public final long m1594getSurfaceVariant0d7_KjU() {
        return SurfaceVariant;
    }

    /* JADX INFO: renamed from: getTertiary-0d7_KjU, reason: not valid java name */
    public final long m1595getTertiary0d7_KjU() {
        return Tertiary;
    }

    /* JADX INFO: renamed from: getTertiaryContainer-0d7_KjU, reason: not valid java name */
    public final long m1596getTertiaryContainer0d7_KjU() {
        return TertiaryContainer;
    }
}
