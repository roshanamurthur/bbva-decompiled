package com.bbva.component.ui.shortcuts;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.cells.componentkit.dsl.ImageViewKt;
import com.bbva.cells.componentkit.dsl.TextViewKt;
import com.bbva.cells.componentkit.dsl.ViewKt;
import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.TextSettings;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.component.ui.shortcuts.databinding.ViewShortcutBinding;
import com.bbva.ui.widget.BbvaTextView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import z5.a;

/* JADX INFO: compiled from: ShortcutItemView.kt */
/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 )2\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0018\u001a\u0004\u0018\u00010\u00112\b\u0010\t\u001a\u0004\u0018\u00010\u00118\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R.\u0010 \u001a\u0004\u0018\u00010\u00192\b\u0010\t\u001a\u0004\u0018\u00010\u00198\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006*"}, d2 = {"Lcom/bbva/component/ui/shortcuts/ShortcutItemView;", "Landroid/widget/LinearLayout;", "", "getAccessibilityClassName", "Lkotlin/Function0;", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnTapListener", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "value", "q0", "Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "getSettings$component_ui_shortcuts_release", "()Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;", "setSettings$component_ui_shortcuts_release", "(Lcom/bbva/cells/componentkit/model/dsl/ViewSettings;)V", "settings", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "r0", "Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "getIcon$component_ui_shortcuts_release", "()Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;", "setIcon$component_ui_shortcuts_release", "(Lcom/bbva/cells/componentkit/model/dsl/ImageSettings;)V", "icon", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "s0", "Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "getText$component_ui_shortcuts_release", "()Lcom/bbva/cells/componentkit/model/dsl/TextSettings;", "setText$component_ui_shortcuts_release", "(Lcom/bbva/cells/componentkit/model/dsl/TextSettings;)V", "text", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nShortcutItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ShortcutItemView.kt\ncom/bbva/component/ui/shortcuts/ShortcutItemView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"})
public final class ShortcutItemView extends LinearLayout {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final ViewShortcutBinding f28737p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ViewSettings settings;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public ImageSettings icon;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public TextSettings text;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: ShortcutItemView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/bbva/component/ui/shortcuts/ShortcutItemView$Companion;", "", "()V", "LAYOUT_WEIGHT", "", "PREVENT_CLICK_DELAY", "", "component-ui-shortcuts_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShortcutItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setOnTapListener$lambda$2$lambda$1(ShortcutItemView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setClickable(true);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        String name = Button.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return name;
    }

    @Nullable
    /* JADX INFO: renamed from: getIcon$component_ui_shortcuts_release, reason: from getter */
    public final ImageSettings getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: getSettings$component_ui_shortcuts_release, reason: from getter */
    public final ViewSettings getSettings() {
        return this.settings;
    }

    @Nullable
    /* JADX INFO: renamed from: getText$component_ui_shortcuts_release, reason: from getter */
    public final TextSettings getText() {
        return this.text;
    }

    public final void setIcon$component_ui_shortcuts_release(@Nullable ImageSettings imageSettings) {
        this.icon = imageSettings;
        AppCompatImageView shortcutImage = this.f28737p0.shortcutImage;
        Intrinsics.checkNotNullExpressionValue(shortcutImage, "shortcutImage");
        ImageViewKt.settings(shortcutImage, imageSettings);
    }

    public final void setOnTapListener(@NotNull Function0<Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        setOnClickListener(new a(this, listener, 0));
    }

    public final void setSettings$component_ui_shortcuts_release(@Nullable ViewSettings viewSettings) {
        CharSequence text;
        this.settings = viewSettings;
        ViewKt.settings(this, viewSettings);
        if (viewSettings == null || (text = viewSettings.getAccessibilityLabel()) == null) {
            text = this.f28737p0.shortcutLabel.getText();
        }
        setContentDescription(text);
    }

    public final void setText$component_ui_shortcuts_release(@Nullable TextSettings textSettings) {
        this.text = textSettings;
        ViewShortcutBinding viewShortcutBinding = this.f28737p0;
        BbvaTextView shortcutLabel = viewShortcutBinding.shortcutLabel;
        Intrinsics.checkNotNullExpressionValue(shortcutLabel, "shortcutLabel");
        TextViewKt.settings(shortcutLabel, textSettings);
        CharSequence contentDescription = getContentDescription();
        if (contentDescription == null) {
            contentDescription = null;
        }
        if (contentDescription == null) {
            contentDescription = viewShortcutBinding.shortcutLabel.getText();
        }
        setContentDescription(contentDescription);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShortcutItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ShortcutItemView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ShortcutItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewShortcutBinding viewShortcutBindingInflate = ViewShortcutBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(viewShortcutBindingInflate, "inflate(...)");
        this.f28737p0 = viewShortcutBindingInflate;
        setOrientation(1);
        setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1, 1.0f);
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.shortcuts_padding_s);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setLayoutParams(layoutParams);
        viewShortcutBindingInflate.shortcutLabel.setHyphenationFrequency(2);
    }
}
