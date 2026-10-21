package com.bbva.component.ui.carousel.view.compose.theme;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.TextUnitKt;
import com.bbva.cellswidgets.R;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Font.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/component/ui/carousel/view/compose/theme/Fonts;", "", "Lcom/bbva/component/ui/carousel/view/compose/theme/Typography;", "a", "Lcom/bbva/component/ui/carousel/view/compose/theme/Typography;", "getTypography", "()Lcom/bbva/component/ui/carousel/view/compose/theme/Typography;", "typography", "<init>", "()V", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
public final class Fonts {

    @NotNull
    public static final Fonts INSTANCE = new Fonts();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Typography typography;

    static {
        int i10 = R.font.benton_sans_bbva_medium;
        FontWeight.Companion companion = FontWeight.INSTANCE;
        FontFamily FontFamily = FontFamilyKt.FontFamily(FontKt.m4046FontYpTlLL0$default(i10, companion.getMedium(), 0, 0, 12, null));
        typography = new Typography(new TextStyle(0L, TextUnitKt.getSp(15), companion.getMedium(), null, null, FontFamily, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194265, null), new TextStyle(0L, TextUnitKt.getSp(15), companion.getMedium(), null, null, FontFamily, null, 0L, null, null, null, 0L, null, null, null, null, 0L, null, null, null, null, null, 4194265, null));
    }

    @NotNull
    public final Typography getTypography() {
        return typography;
    }
}
