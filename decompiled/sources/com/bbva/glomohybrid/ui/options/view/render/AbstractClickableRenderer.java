package com.bbva.glomohybrid.ui.options.view.render;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.glomohybrid.ui.options.model.Option;
import com.bbva.glomohybrid.ui.options.profileselector.model.ProfileSelectedItem;
import com.bbva.glomohybrid.ui.options.view.render.AbstractClickableRenderer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AbstractClickableRenderer.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ,\u0010\u0012\u001a\u00020\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t\u0018\u00010\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0016¨\u0006\u0015"}, d2 = {"Lcom/bbva/glomohybrid/ui/options/view/render/AbstractClickableRenderer;", "Lcom/bbva/glomohybrid/ui/options/model/Option;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/bbva/glomohybrid/ui/options/view/render/Renderer;", "Landroid/view/View;", "container", AnalyticsConstants.Key.ITEM, "", "position", "", "internalRender", "(Landroid/view/View;Lcom/bbva/glomohybrid/ui/options/model/Option;I)V", "render", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/ui/options/profileselector/model/ProfileSelectedItem;", "action", "Lkotlin/Function0;", "doAfterAction", "addItemClicked", "<init>", "()V", "gl-ui_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public abstract class AbstractClickableRenderer<T extends Option> implements Renderer<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public Function1<? super ProfileSelectedItem, Unit> f34714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Function0<Unit> f34715b;

    @Override // com.bbva.glomohybrid.ui.options.view.render.Renderer
    public void addItemClicked(@Nullable Function1<? super ProfileSelectedItem, Unit> action, @NotNull Function0<Unit> doAfterAction) {
        Intrinsics.checkNotNullParameter(doAfterAction, "doAfterAction");
        this.f34714a = action;
        this.f34715b = doAfterAction;
    }

    public abstract void internalRender(@NotNull View container, @NotNull T item, int position);

    @Override // com.bbva.glomohybrid.ui.options.view.render.Renderer
    public void render(@NotNull View container, @NotNull final T item, final int position) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(item, "item");
        internalRender(container, item, position);
        container.setOnClickListener(new View.OnClickListener() { // from class: ia.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Option option = item;
                Intrinsics.checkNotNullParameter(option, "$option");
                AbstractClickableRenderer this$0 = this;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (option.isSelected()) {
                    return;
                }
                Function1<? super ProfileSelectedItem, Unit> function1 = this$0.f34714a;
                if (function1 != null) {
                    function1.invoke(new ProfileSelectedItem(position, option.getTitle()));
                }
                Function0<Unit> function0 = this$0.f34715b;
                if (function0 != null) {
                    function0.invoke();
                }
            }
        });
    }
}
