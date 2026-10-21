package com.bbva.component.ui.login.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import com.bbva.component.ui.login.databinding.ViewSpinnerBinding;
import com.bbva.component.ui.login.model.DocumentSelector;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DocumentSelectorView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0014\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tR\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/ui/login/view/DocumentSelectorView;", "Landroid/widget/RelativeLayout;", "Lcom/bbva/component/ui/login/model/DocumentSelector;", "documentSelector", "", "setConfig", "", "text", "setText", "Lkotlin/Function0;", "onClick", "setOnClickListener", "Lcom/bbva/component/ui/login/databinding/ViewSpinnerBinding;", "p0", "Lkotlin/Lazy;", "getSpinnerLayoutBinding", "()Lcom/bbva/component/ui/login/databinding/ViewSpinnerBinding;", "spinnerLayoutBinding", "Landroid/content/Context;", "context", "formInputData", "<init>", "(Landroid/content/Context;Lcom/bbva/component/ui/login/model/DocumentSelector;)V", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
public final class DocumentSelectorView extends RelativeLayout {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f28607q0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy spinnerLayoutBinding;

    /* JADX INFO: compiled from: DocumentSelectorView.kt */
    public static final class a extends Lambda implements Function0<ViewSpinnerBinding> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f28609p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DocumentSelectorView f28610q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, DocumentSelectorView documentSelectorView) {
            super(0);
            this.f28609p0 = context;
            this.f28610q0 = documentSelectorView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewSpinnerBinding invoke() {
            ViewSpinnerBinding viewSpinnerBindingInflate = ViewSpinnerBinding.inflate(LayoutInflater.from(this.f28609p0), this.f28610q0, false);
            Intrinsics.checkNotNullExpressionValue(viewSpinnerBindingInflate, "inflate(...)");
            return viewSpinnerBindingInflate;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DocumentSelectorView(@NotNull Context context, @NotNull DocumentSelector formInputData) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formInputData, "formInputData");
        this.spinnerLayoutBinding = LazyKt__LazyJVMKt.lazy(new a(context, this));
        addView(getSpinnerLayoutBinding().getRoot());
        setConfig(formInputData);
    }

    private final ViewSpinnerBinding getSpinnerLayoutBinding() {
        return (ViewSpinnerBinding) this.spinnerLayoutBinding.getValue();
    }

    private final void setConfig(DocumentSelector documentSelector) {
        getSpinnerLayoutBinding().textInputLayoutSpinner.setHint(documentSelector.getTitle().getValue());
    }

    public final void setOnClickListener(@NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        getSpinnerLayoutBinding().editTexLayoutSpinner.setOnClickListener(new s5.a(onClick, 0));
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        if (text.length() == 0) {
            return;
        }
        getSpinnerLayoutBinding().editTexLayoutSpinner.setText(text);
    }
}
