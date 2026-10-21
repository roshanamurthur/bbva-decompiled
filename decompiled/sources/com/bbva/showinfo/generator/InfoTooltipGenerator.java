package com.bbva.showinfo.generator;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import bk.q;
import com.bbva.showinfo.databinding.LayoutTooltipBinding;
import com.bbva.showinfo.model.InfoTooltip;
import com.bbva.showinfo.model.TooltipArrowPosition;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

/* JADX INFO: compiled from: InfoTooltipGenerator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016J\u0014\u0010\n\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¨\u0006\r"}, d2 = {"Lcom/bbva/showinfo/generator/InfoTooltipGenerator;", "Lcom/bbva/showinfo/generator/ElementInfoable;", "Lcom/bbva/showinfo/model/InfoTooltip;", "Landroid/content/Context;", "context", "element", "", "create", "Lkotlin/Function0;", "callback", "setPositiveButtonCallback", "<init>", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nInfoTooltipGenerator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoTooltipGenerator.kt\ncom/bbva/showinfo/generator/InfoTooltipGenerator\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,101:1\n526#2:102\n511#2,6:103\n215#3,2:109\n*S KotlinDebug\n*F\n+ 1 InfoTooltipGenerator.kt\ncom/bbva/showinfo/generator/InfoTooltipGenerator\n*L\n73#1:102\n73#1:103,6\n73#1:109,2\n*E\n"})
public final class InfoTooltipGenerator implements ElementInfoable<InfoTooltip> {

    @NotNull
    public static final InfoTooltipGenerator INSTANCE = new InfoTooltipGenerator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Function0<Unit> f36478a;

    @Override // com.bbva.showinfo.generator.ElementInfoable
    public void hide(@NotNull Context context, @NotNull InfoTooltip infoTooltip) throws IllegalArgumentException {
        ElementInfoable.DefaultImpls.hide(this, context, infoTooltip);
    }

    public final void setPositiveButtonCallback(@NotNull Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        f36478a = callback;
    }

    @Override // com.bbva.showinfo.generator.ElementInfoable
    public void create(@NotNull Context context, @NotNull InfoTooltip element) {
        ViewGroup viewGroup;
        ImageView imageView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        Unit unit = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null && (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) != null) {
            LayoutTooltipBinding layoutTooltipBindingInflate = LayoutTooltipBinding.inflate(((Activity) context).getLayoutInflater());
            layoutTooltipBindingInflate.tooltipTitle.setText(element.getTitle());
            layoutTooltipBindingInflate.tooltipBody.setText(element.getSupportingText());
            layoutTooltipBindingInflate.tooltipPositiveButton.setText(element.getPositiveButtonText());
            InfoTooltipGenerator infoTooltipGenerator = INSTANCE;
            Intrinsics.checkNotNull(layoutTooltipBindingInflate);
            Integer themeId = element.getThemeId();
            infoTooltipGenerator.getClass();
            if (themeId != null) {
                int iIntValue = themeId.intValue();
                TypedValue typedValue = new TypedValue();
                if (context.getTheme().resolveAttribute(iIntValue, typedValue, true)) {
                    layoutTooltipBindingInflate.getRoot().setBackgroundResource(typedValue.resourceId);
                }
            }
            infoTooltipGenerator.getClass();
            Map mapMapOf = q.mapOf(TuplesKt.to(TooltipArrowPosition.TOP, layoutTooltipBindingInflate.tooltipTopArrow), TuplesKt.to(TooltipArrowPosition.RIGHT, layoutTooltipBindingInflate.tooltipRightArrow), TuplesKt.to(TooltipArrowPosition.BOTTOM, layoutTooltipBindingInflate.tooltipBottomArrow), TuplesKt.to(TooltipArrowPosition.LEFT, layoutTooltipBindingInflate.tooltipLeftArrow), TuplesKt.to(TooltipArrowPosition.NE, layoutTooltipBindingInflate.tooltipNeArrow), TuplesKt.to(TooltipArrowPosition.NI, layoutTooltipBindingInflate.tooltipNiArrow), TuplesKt.to(TooltipArrowPosition.IZ, layoutTooltipBindingInflate.tooltipIzArrow), TuplesKt.to(TooltipArrowPosition.IZA, layoutTooltipBindingInflate.tooltipIzaArrow));
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapMapOf.entrySet()) {
                if (((TooltipArrowPosition) entry.getKey()) != element.getPosition()) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                ((ImageView) ((Map.Entry) it.next()).getValue()).setVisibility(8);
            }
            Context context2 = layoutTooltipBindingInflate.getRoot().getContext();
            TypedValue typedValue2 = new TypedValue();
            if (context2.getTheme().resolveAttribute(com.bbva.showinfo.R.attr.tooltipBackground, typedValue2, true) && (imageView = (ImageView) mapMapOf.get(element.getPosition())) != null) {
                imageView.setColorFilter(context2.getColor(typedValue2.resourceId), PorterDuff.Mode.SRC_IN);
            }
            Intrinsics.checkNotNullExpressionValue(layoutTooltipBindingInflate, "apply(...)");
            PopupWindow popupWindow = new PopupWindow((View) layoutTooltipBindingInflate.getRoot(), -2, -2, true);
            layoutTooltipBindingInflate.getRoot().setAlpha(0.0f);
            layoutTooltipBindingInflate.getRoot().animate().alpha(1.0f).setDuration(300L).setListener(null);
            layoutTooltipBindingInflate.tooltipPositiveButton.setOnClickListener(new a(layoutTooltipBindingInflate, popupWindow, 0));
            popupWindow.showAtLocation(viewGroup.getRootView(), 0, element.getX(), element.getY());
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            throw new IllegalArgumentException();
        }
    }
}
