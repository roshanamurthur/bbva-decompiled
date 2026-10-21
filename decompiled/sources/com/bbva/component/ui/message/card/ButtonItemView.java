package com.bbva.component.ui.message.card;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Button;
import android.widget.RelativeLayout;
import androidx.annotation.StyleRes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t5.a;

/* JADX INFO: compiled from: ButtonItemView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0003\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0014\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/ui/message/card/ButtonItemView;", "Landroid/widget/RelativeLayout;", "", "applyMarginTop", "applyLinkAlignment", "Lkotlin/Function0;", "onClick", "setOnClickListener", "", "value", "q0", "Ljava/lang/String;", "getText$component_ui_message_card_release", "()Ljava/lang/String;", "setText$component_ui_message_card_release", "(Ljava/lang/String;)V", "text", "Landroid/content/Context;", "context", "", "style", "<init>", "(Landroid/content/Context;I)V", "component-ui-message-card_release"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"ViewConstructor"})
public final class ButtonItemView extends RelativeLayout {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f28613r0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Button f28614p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String text;

    public /* synthetic */ ButtonItemView(Context context, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? R.style.MessageCard_PrimaryButton : i10);
    }

    public final void applyLinkAlignment() {
        this.f28614p0.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
    }

    public final void applyMarginTop() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, getContext().getResources().getDimensionPixelSize(R.dimen.message_card_component_margin_m), 0, 0);
        setLayoutParams(layoutParams);
    }

    @Nullable
    /* JADX INFO: renamed from: getText$component_ui_message_card_release, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final void setOnClickListener(@NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.f28614p0.setOnClickListener(new a(onClick, 0));
    }

    public final void setText$component_ui_message_card_release(@Nullable String str) {
        this.text = str;
        if (str == null || l.isBlank(str)) {
            return;
        }
        Button button = this.f28614p0;
        button.setText(str);
        button.setContentDescription(str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonItemView(@NotNull Context context, @StyleRes int i10) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Button button = new Button(context, null, 0, i10);
        button.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        this.f28614p0 = button;
        addView(button);
    }
}
