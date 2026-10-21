package com.bbva.cells.componentkit.model.dsl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Settings.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u00072\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005\u001a\u001f\u0010\b\u001a\u00020\t2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005¨\u0006\n"}, d2 = {"imageSettings", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "textSettings", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "viewSettings", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "componentkit_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
public final class SettingsKt {
    @NotNull
    public static final ImageSettings imageSettings(@NotNull Function1<? super ImageSettings, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ImageSettings imageSettings = new ImageSettings((ViewSettings) null, (Scale) null, (ResourceId) null, (String) null, 15, (DefaultConstructorMarker) null);
        init.invoke(imageSettings);
        return imageSettings;
    }

    @NotNull
    public static final TextSettings textSettings(@NotNull Function1<? super TextSettings, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        TextSettings textSettings = new TextSettings((ViewSettings) null, (Resource) null, (Resource) null, (InputType) null, (Resource) null, (ResourceId) null, (ResourceId) null, (Resource) null, (ResourceId) null, (Dimension) null, 1023, (DefaultConstructorMarker) null);
        init.invoke(textSettings);
        return textSettings;
    }

    @NotNull
    public static final ViewSettings viewSettings(@NotNull Function1<? super ViewSettings, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ViewSettings viewSettings = new ViewSettings((Resource) null, (ResourceId) null, (Boolean) null, (Visibility) null, (String) null, 31, (DefaultConstructorMarker) null);
        init.invoke(viewSettings);
        return viewSettings;
    }
}
