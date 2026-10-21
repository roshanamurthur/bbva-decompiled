package com.google.accompanist.themeadapter.material;

import androidx.compose.material.Typography;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.core.view.ViewCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Typography.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a\u008e\u0001\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u00012\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u00012\b\b\u0002\u0010\r\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u0001H\u0000¨\u0006\u0010"}, d2 = {"Landroidx/compose/material/Typography;", "Landroidx/compose/ui/text/TextStyle;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "merge", "themeadapter-material_release"}, k = 2, mv = {1, 9, 0})
public final class TypographyKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final TextStyle f43568a = new TextStyle(0, 0, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, ViewCompat.MEASURED_SIZE_MASK, (DefaultConstructorMarker) null);

    @NotNull
    public static final Typography merge(@NotNull Typography typography, @NotNull TextStyle h4, @NotNull TextStyle h7, @NotNull TextStyle h10, @NotNull TextStyle h11, @NotNull TextStyle h12, @NotNull TextStyle h13, @NotNull TextStyle subtitle1, @NotNull TextStyle subtitle2, @NotNull TextStyle body1, @NotNull TextStyle body2, @NotNull TextStyle button, @NotNull TextStyle caption, @NotNull TextStyle overline) {
        Intrinsics.checkNotNullParameter(typography, "<this>");
        Intrinsics.checkNotNullParameter(h4, "h1");
        Intrinsics.checkNotNullParameter(h7, "h2");
        Intrinsics.checkNotNullParameter(h10, "h3");
        Intrinsics.checkNotNullParameter(h11, "h4");
        Intrinsics.checkNotNullParameter(h12, "h5");
        Intrinsics.checkNotNullParameter(h13, "h6");
        Intrinsics.checkNotNullParameter(subtitle1, "subtitle1");
        Intrinsics.checkNotNullParameter(subtitle2, "subtitle2");
        Intrinsics.checkNotNullParameter(body1, "body1");
        Intrinsics.checkNotNullParameter(body2, "body2");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(overline, "overline");
        return typography.copy(typography.getH1().merge(h4), typography.getH2().merge(h7), typography.getH3().merge(h10), typography.getH4().merge(h11), typography.getH5().merge(h12), typography.getH6().merge(h13), typography.getSubtitle1().merge(subtitle1), typography.getSubtitle2().merge(subtitle2), typography.getBody1().merge(body1), typography.getBody2().merge(body2), typography.getButton().merge(button), typography.getCaption().merge(caption), typography.getOverline().merge(overline));
    }

    public static /* synthetic */ Typography merge$default(Typography typography, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i10, Object obj) {
        int i11 = i10 & 1;
        TextStyle textStyle14 = f43568a;
        TextStyle textStyle15 = i11 != 0 ? textStyle14 : textStyle;
        TextStyle textStyle16 = (i10 & 2) != 0 ? textStyle14 : textStyle2;
        TextStyle textStyle17 = (i10 & 4) != 0 ? textStyle14 : textStyle3;
        TextStyle textStyle18 = (i10 & 8) != 0 ? textStyle14 : textStyle4;
        TextStyle textStyle19 = (i10 & 16) != 0 ? textStyle14 : textStyle5;
        TextStyle textStyle20 = (i10 & 32) != 0 ? textStyle14 : textStyle6;
        TextStyle textStyle21 = (i10 & 64) != 0 ? textStyle14 : textStyle7;
        TextStyle textStyle22 = (i10 & 128) != 0 ? textStyle14 : textStyle8;
        TextStyle textStyle23 = (i10 & 256) != 0 ? textStyle14 : textStyle9;
        TextStyle textStyle24 = (i10 & 512) != 0 ? textStyle14 : textStyle10;
        TextStyle textStyle25 = (i10 & 1024) != 0 ? textStyle14 : textStyle11;
        TextStyle textStyle26 = (i10 & 2048) != 0 ? textStyle14 : textStyle12;
        if ((i10 & 4096) == 0) {
            textStyle14 = textStyle13;
        }
        return merge(typography, textStyle15, textStyle16, textStyle17, textStyle18, textStyle19, textStyle20, textStyle21, textStyle22, textStyle23, textStyle24, textStyle25, textStyle26, textStyle14);
    }
}
