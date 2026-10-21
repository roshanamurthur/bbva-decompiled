package com.bbva.glomohybrid.ui.options.view.render;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.glomohybrid.ui.options.model.Option;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectedItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Renderer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J,\u0010\u0004\u001a\u00020\u00052\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH&J%\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\fH&¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/view/render/Renderer;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/glomohybrid/ui/options/model/Option;", "", "addItemClicked", "", "action", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectedItem;", "doAfterAction", "Lkotlin/Function0;", "getLayoutId", "", "viewType", "render", "container", "Landroid/view/View;", AnalyticsConstants.Key.ITEM, "position", "(Landroid/view/View;Lcom/bbva/glomohybrid/ui/options/model/Option;I)V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface Renderer<T extends Option> {
    void addItemClicked(@Nullable Function1<? super ProfileSelectedItem, Unit> action, @NotNull Function0<Unit> doAfterAction);

    int getLayoutId(int viewType);

    void render(@NotNull View container, @NotNull T item, int position);
}
