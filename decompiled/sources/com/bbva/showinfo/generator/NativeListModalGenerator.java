package com.bbva.showinfo.generator;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.bbva.showinfo.model.InfoNativeListModal;
import com.bbva.showinfo.nativemodal.modal.Item;
import com.bbva.showinfo.nativemodal.modal.NativeListModalConfiguration;
import com.bbva.showinfo.nativemodal.modal.NativeListModalState;
import com.bbva.showinfo.nativemodal.view.NativeListModalView;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import wb.b;

/* JADX INFO: compiled from: NativeListModalGenerator.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/bbva/showinfo/generator/NativeListModalGenerator;", "Lcom/bbva/showinfo/generator/ElementInfoable;", "Lcom/bbva/showinfo/model/InfoNativeListModal;", "Landroid/content/Context;", "context", "element", "", "create", "<init>", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class NativeListModalGenerator implements ElementInfoable<InfoNativeListModal> {

    @NotNull
    public static final NativeListModalGenerator INSTANCE = new NativeListModalGenerator();

    @Override // com.bbva.showinfo.generator.ElementInfoable
    public void hide(@NotNull Context context, @NotNull InfoNativeListModal infoNativeListModal) throws IllegalArgumentException {
        ElementInfoable.DefaultImpls.hide(this, context, infoNativeListModal);
    }

    @Override // com.bbva.showinfo.generator.ElementInfoable
    public void create(@NotNull Context context, @NotNull InfoNativeListModal element) throws IllegalArgumentException {
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(element, "element");
        NativeListModalConfiguration config = element.getConfig();
        List<Item> values = config != null ? config.getValues() : null;
        if (values == null || values.isEmpty()) {
            throw new IllegalArgumentException();
        }
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null || (viewGroup = (ViewGroup) activity.findViewById(R.id.content)) == null) {
            throw new IllegalArgumentException();
        }
        Context context2 = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        NativeListModalView nativeListModalView = new NativeListModalView(context2, null, 0, 6, null);
        viewGroup.addView(nativeListModalView);
        nativeListModalView.getViewModel().updateModel(NativeListModalState.Loading.INSTANCE);
        NativeListModalGenerator nativeListModalGenerator = INSTANCE;
        Function1<Item, Unit> onActionClickListener = element.getOnActionClickListener();
        nativeListModalGenerator.getClass();
        BuildersKt__Builders_commonKt.launch$default(nativeListModalView, null, null, new b(nativeListModalView, onActionClickListener, viewGroup, null), 3, null);
        nativeListModalView.getViewModel().updateModel(new NativeListModalState.Ready(element.getConfig()));
    }
}
