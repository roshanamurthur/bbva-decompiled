package com.bbva.component.ui.login.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.RelativeLayout;
import androidx.appcompat.view.ContextThemeWrapper;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.cellswidgets.R;
import com.bbva.cellswidgets.model.ValidationRule;
import com.bbva.component.ui.login.extensions.ContextExtensionKt;
import com.bbva.component.ui.login.model.InputFieldConfig;
import com.bbva.component.ui.login.model.InputFieldIdentifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FormInputView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001a\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tJ(\u0010\u0010\u001a\u00020\u00042 \u0010\u000f\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00040\rJ\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f"}, d2 = {"Lcom/bbva/component/ui/login/view/FormInputView;", "Landroid/widget/RelativeLayout;", "Lcom/bbva/component/ui/login/model/InputFieldConfig;", "inputFieldConfig", "", "setConfig", "", "text", "setText", "Lkotlin/Function1;", "", "onTextChange", "onTextChangeListener", "Lkotlin/Function3;", "", "onTextLengthChange", "onTextLengthChangeListener", "", "Lcom/bbva/cellswidgets/model/ValidationRule;", "validations", "updateConfig", "p0", "Lcom/bbva/component/ui/login/model/InputFieldConfig;", "getFormInputData", "()Lcom/bbva/component/ui/login/model/InputFieldConfig;", "formInputData", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/bbva/component/ui/login/model/InputFieldConfig;)V", "Companion", "component-ui-login_release"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"ViewConstructor"})
public final class FormInputView extends RelativeLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final InputFieldConfig formInputData;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final CellsEditText f28612q0;

    /* JADX INFO: compiled from: FormInputView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/ui/login/view/FormInputView$Companion;", "", "()V", "getStyleForInput", "", "inputFieldIdentifier", "Lcom/bbva/component/ui/login/model/InputFieldIdentifier;", "component-ui-login_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: FormInputView.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[InputFieldIdentifier.values().length];
                try {
                    iArr[InputFieldIdentifier.PASSWORD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getStyleForInput(@NotNull InputFieldIdentifier inputFieldIdentifier) {
            Intrinsics.checkNotNullParameter(inputFieldIdentifier, "inputFieldIdentifier");
            return WhenMappings.$EnumSwitchMapping$0[inputFieldIdentifier.ordinal()] == 1 ? R.attr.cellsEditTextPasswordStyle : R.attr.cellsEditTextPlainStyle;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormInputView(@NotNull Context context, @NotNull InputFieldConfig formInputData) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(formInputData, "formInputData");
        this.formInputData = formInputData;
        CellsEditText cellsEditText = new CellsEditText(new ContextThemeWrapper(context, ContextExtensionKt.resolveThemeAttr(context, INSTANCE.getStyleForInput(formInputData.getInputFieldIdentifier()))), null, 0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = getContext().getResources().getDimensionPixelOffset(com.bbva.component.ui.login.R.dimen.remembered_user_margin_m);
        cellsEditText.setLayoutParams(layoutParams);
        this.f28612q0 = cellsEditText;
        addView(cellsEditText);
        setConfig(formInputData);
    }

    private final void setConfig(InputFieldConfig inputFieldConfig) {
        CellsEditText cellsEditText = this.f28612q0;
        cellsEditText.setText("");
        cellsEditText.setConfig(inputFieldConfig.toMap());
    }

    @NotNull
    public final InputFieldConfig getFormInputData() {
        return this.formInputData;
    }

    public final void onTextChangeListener(@NotNull Function1<? super CharSequence, Unit> onTextChange) {
        Intrinsics.checkNotNullParameter(onTextChange, "onTextChange");
        this.f28612q0.setOnTextChangeListener(onTextChange);
    }

    public final void onTextLengthChangeListener(@NotNull Function3<? super String, ? super Integer, ? super Integer, Unit> onTextLengthChange) {
        Intrinsics.checkNotNullParameter(onTextLengthChange, "onTextLengthChange");
        this.f28612q0.setOnTextChangedListener(onTextLengthChange);
    }

    public final void setText(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f28612q0.setText(text);
    }

    public final void updateConfig(@NotNull InputFieldConfig inputFieldConfig) {
        Intrinsics.checkNotNullParameter(inputFieldConfig, "inputFieldConfig");
        setConfig(inputFieldConfig);
    }

    @NotNull
    public final List<ValidationRule> validations() {
        return this.f28612q0.getValidations();
    }
}
