package com.bbva.component.ui.carousel.view.compose.theme;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Colors.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bbva/component/ui/carousel/view/compose/theme/Colors;", "", "Lcom/bbva/component/ui/carousel/view/compose/theme/PrimaryColors;", "a", "Lcom/bbva/component/ui/carousel/view/compose/theme/PrimaryColors;", "getPrimaryLight", "()Lcom/bbva/component/ui/carousel/view/compose/theme/PrimaryColors;", "primaryLight", "b", "getPrimaryDark", "primaryDark", "<init>", "()V", "component-ui-carousel_release"}, k = 1, mv = {1, 8, 0})
public final class Colors {

    @NotNull
    public static final Colors INSTANCE = new Colors();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PrimaryColors primaryLight;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final PrimaryColors primaryDark;

    static {
        Palette palette = Palette.INSTANCE;
        primaryLight = new PrimaryColors(palette.m4868getNeutralGrey700d7_KjU(), new PrimaryColors.Link(new Selector(palette.m4864getCoreBlue400d7_KjU(), palette.m4865getCoreBlue600d7_KjU(), null)), null);
        primaryDark = new PrimaryColors(palette.m4867getNeutralGrey500d7_KjU(), new PrimaryColors.Link(new Selector(palette.m4869getSky400d7_KjU(), palette.m4863getBlue400d7_KjU(), null)), null);
    }

    @NotNull
    public final PrimaryColors getPrimaryDark() {
        return primaryDark;
    }

    @NotNull
    public final PrimaryColors getPrimaryLight() {
        return primaryLight;
    }
}
