package com.bbva.component.ui.message.link;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.camera.core.processing.f;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.PointerIconCompat;
import com.bbva.cells.componentkit.dsl.TextViewKt;
import com.bbva.cells.componentkit.model.dsl.Dimension;
import com.bbva.cells.componentkit.model.dsl.InputType;
import com.bbva.cells.componentkit.model.dsl.Resource;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.component.ui.message.link.databinding.ViewMessageLinkBinding;
import com.bbva.component.ui.message.link.model.MessageLinkBackground;
import com.bbva.component.ui.message.link.model.MessageLinkState;
import com.google.android.material.textview.MaterialTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u5.a;
import u5.b;

/* JADX INFO: compiled from: MessageLinkView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/bbva/component/ui/message/link/MessageLinkView;", "Landroid/widget/FrameLayout;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/component/ui/message/link/MessageLinkViewModel;", "q0", "Lcom/bbva/component/ui/message/link/MessageLinkViewModel;", "getViewModel", "()Lcom/bbva/component/ui/message/link/MessageLinkViewModel;", "viewModel", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "component-ui-message-link_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMessageLinkView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MessageLinkView.kt\ncom/bbva/component/ui/message/link/MessageLinkView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,107:1\n1#2:108\n*E\n"})
public final class MessageLinkView extends FrameLayout implements CoroutineScope {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final /* synthetic */ int f28654s0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f28655p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MessageLinkViewModel viewModel;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ViewMessageLinkBinding f28657r0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageLinkView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$updateView(MessageLinkView messageLinkView, MessageLinkState messageLinkState) {
        Drawable drawable;
        messageLinkView.getClass();
        ResourceId source = messageLinkState.getIcon().getSource();
        if (source != null) {
            Context context = messageLinkView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            drawable = ExtensionsKt.getDrawable(source, context);
        } else {
            drawable = null;
        }
        Resource text = messageLinkState.getLabel().getText();
        messageLinkView.a(drawable, text != null ? text.getValue() : null);
        ViewMessageLinkBinding viewMessageLinkBinding = messageLinkView.f28657r0;
        AppCompatButton appCompatButton = viewMessageLinkBinding.messageLinkButton;
        Intrinsics.checkNotNullExpressionValue(appCompatButton, "binding.messageLinkButton");
        TextViewKt.settings(appCompatButton, messageLinkState.getButton().getLabel());
        MessageLinkBackground background = messageLinkState.getBackground();
        if (background != null) {
            ResourceId color = background.getColor();
            Context context2 = messageLinkView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            Integer color2 = ExtensionsKt.getColor(color, context2);
            if (color2 != null) {
                messageLinkView.setBackgroundColor(color2.intValue());
            }
            ConstraintLayout constraintLayout = viewMessageLinkBinding.messageLinkBackground;
            ResourceId drawable2 = background.getDrawable();
            Context context3 = messageLinkView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            constraintLayout.setBackground(ExtensionsKt.getDrawable(drawable2, context3));
        }
    }

    public final void a(Drawable drawable, String str) {
        Unit unit;
        ViewMessageLinkBinding viewMessageLinkBinding = this.f28657r0;
        if (drawable != null) {
            SpannableString spannableString = new SpannableString(f.d("   ", str));
            int i10 = Build.VERSION.SDK_INT >= 29 ? 2 : 1;
            int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.message_link_icon_size);
            drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            spannableString.setSpan(new ImageSpan(drawable, i10), 0, 1, 17);
            viewMessageLinkBinding.messageLinkTextView.setText(spannableString);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            MaterialTextView materialTextView = viewMessageLinkBinding.messageLinkTextView;
            Intrinsics.checkNotNullExpressionValue(materialTextView, "binding.messageLinkTextView");
            TextViewKt.settings(materialTextView, new TextSettings((ViewSettings) null, new Resource(str, (ResourceId) null, 2, (DefaultConstructorMarker) null), (Resource) null, (InputType) null, (Resource) null, (ResourceId) null, (ResourceId) null, (Resource) null, (ResourceId) null, (Dimension) null, PointerIconCompat.TYPE_GRABBING, (DefaultConstructorMarker) null));
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f28655p0.getCoroutineContext();
    }

    @NotNull
    public final MessageLinkViewModel getViewModel() {
        return this.viewModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageLinkView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MessageLinkView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MessageLinkView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f28655p0 = CoroutineScopeKt.MainScope();
        this.viewModel = new MessageLinkViewModel();
        ViewMessageLinkBinding viewMessageLinkBindingInflate = ViewMessageLinkBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(viewMessageLinkBindingInflate, "inflate(LayoutInflater.from(context), this)");
        this.f28657r0 = viewMessageLinkBindingInflate;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.MessageLinkView, i10, 0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.message_link_component_lateral_padding);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setLayoutParams(layoutParams);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "this");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MessageLinkView_messageLinkView_backgroundColor, R.color.BBVA_CORE_BLUE);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.MessageLinkView_messageLinkView_backgroundDrawable);
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.MessageLinkView_messageLinkView_icon);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.MessageLinkView_messageLinkView_label);
        String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.MessageLinkView_messageLinkView_buttonText);
        ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R.styleable.MessageLinkView_messageLinkView_buttonTextColor);
        colorStateList = colorStateList == null ? ColorStateList.valueOf(ContextCompat.getColor(getContext(), R.color.selector_dark_sky_blue_to_medium_blue)) : colorStateList;
        Intrinsics.checkNotNullExpressionValue(colorStateList, "typedArray.getColorState…sky_blue_to_medium_blue))");
        if (resourceId != 0) {
            setBackgroundColor(ContextCompat.getColor(getContext(), resourceId));
        }
        if (drawable != null) {
            viewMessageLinkBindingInflate.messageLinkBackground.setBackground(drawable);
        }
        a(drawable2, string);
        viewMessageLinkBindingInflate.messageLinkButton.setText(string2);
        viewMessageLinkBindingInflate.messageLinkButton.setTextColor(colorStateList);
        viewMessageLinkBindingInflate.messageLinkButton.setOnClickListener(new a(this, 0));
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(this, null), 3, null);
        typedArrayObtainStyledAttributes.recycle();
    }
}
