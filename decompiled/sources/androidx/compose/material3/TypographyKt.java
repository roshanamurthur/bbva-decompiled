package androidx.compose.material3;

import androidx.compose.material3.tokens.TypographyKeyTokens;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.ui.text.TextStyle;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\" \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00000\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/Typography;", "Landroidx/compose/material3/tokens/TypographyKeyTokens;", "value", "Landroidx/compose/ui/text/TextStyle;", "fromToken", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalTypography", "material3_release"}, k = 2, mv = {1, 8, 0})
public final class TypographyKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<Typography> f12652a = CompositionLocalKt.staticCompositionLocalOf(a.f12653p0);

    /* JADX INFO: compiled from: Typography.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TypographyKeyTokens.values().length];
            try {
                iArr[TypographyKeyTokens.DisplayLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TypographyKeyTokens.DisplayMedium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TypographyKeyTokens.DisplaySmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineLarge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineMedium.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TypographyKeyTokens.HeadlineSmall.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TypographyKeyTokens.TitleLarge.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TypographyKeyTokens.TitleMedium.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TypographyKeyTokens.TitleSmall.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TypographyKeyTokens.BodyLarge.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TypographyKeyTokens.BodyMedium.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TypographyKeyTokens.BodySmall.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TypographyKeyTokens.LabelLarge.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TypographyKeyTokens.LabelMedium.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[TypographyKeyTokens.LabelSmall.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: Typography.kt */
    public static final class a extends Lambda implements Function0<Typography> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f12653p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
    }

    @NotNull
    public static final TextStyle fromToken(@NotNull Typography typography, @NotNull TypographyKeyTokens value) {
        Intrinsics.checkNotNullParameter(typography, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        switch (WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case 1:
                return typography.getDisplayLarge();
            case 2:
                return typography.getDisplayMedium();
            case 3:
                return typography.getDisplaySmall();
            case 4:
                return typography.getHeadlineLarge();
            case 5:
                return typography.getHeadlineMedium();
            case 6:
                return typography.getHeadlineSmall();
            case 7:
                return typography.getTitleLarge();
            case 8:
                return typography.getTitleMedium();
            case 9:
                return typography.getTitleSmall();
            case 10:
                return typography.getBodyLarge();
            case 11:
                return typography.getBodyMedium();
            case 12:
                return typography.getBodySmall();
            case 13:
                return typography.getLabelLarge();
            case 14:
                return typography.getLabelMedium();
            case 15:
                return typography.getLabelSmall();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @NotNull
    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return f12652a;
    }
}
