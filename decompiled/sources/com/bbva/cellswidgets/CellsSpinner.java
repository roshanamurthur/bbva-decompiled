package com.bbva.cellswidgets;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Spinner;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cellswidgets.databinding.ContentSpinnerBinding;
import com.bbva.cellswidgets.databinding.ContentSpinnerDefaultBinding;
import com.bbva.cellswidgets.extension.DefaultCellsSpinnerKt;
import com.bbva.cellswidgets.model.CellsSpinnerConfig;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CellsSpinner.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b5\u00106B+\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b5\u00107J,\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006J\b\u0010\u000b\u001a\u00020\tH\u0014J\u001c\u0010\u0010\u001a\u00020\t2\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\fJ\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001f\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR/\u0010'\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b\u0010\u0010&R$\u0010.\u001a\u00020(2\u0006\u0010)\u001a\u00020(8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R$\u00101\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R$\u00104\u001a\u00020(2\u0006\u0010)\u001a\u00020(8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b2\u0010+\"\u0004\b3\u0010-¨\u00068"}, d2 = {"Lcom/bbva/cellswidgets/CellsSpinner;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "initAttrs", "onAttachedToWindow", "", "", "", "map", "setConfig", "Landroid/view/accessibility/AccessibilityEvent;", "event", "onInitializeAccessibilityEvent", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "Lcom/bbva/cellswidgets/CellsTextView;", "s0", "Lkotlin/Lazy;", "getSelectedOption", "()Lcom/bbva/cellswidgets/CellsTextView;", "selectedOption", "t0", "getTitleTextView", "titleTextView", "Lcom/bbva/cellswidgets/model/CellsSpinnerConfig;", "<set-?>", "u0", "Lkotlin/properties/ReadWriteProperty;", "getConfig", "()Lcom/bbva/cellswidgets/model/CellsSpinnerConfig;", "(Lcom/bbva/cellswidgets/model/CellsSpinnerConfig;)V", "config", "", "value", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "title", "getText", "setText", "text", "getTextContentDescription", "setTextContentDescription", "textContentDescription", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "cells-widgets_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nCellsSpinner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CellsSpinner.kt\ncom/bbva/cellswidgets/CellsSpinner\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,136:1\n33#2,3:137\n*S KotlinDebug\n*F\n+ 1 CellsSpinner.kt\ncom/bbva/cellswidgets/CellsSpinner\n*L\n54#1:137,3\n*E\n"})
public final class CellsSpinner extends ConstraintLayout {
    public static final /* synthetic */ KProperty<Object>[] v0 = {c.e(CellsSpinner.class, "config", "getConfig()Lcom/bbva/cellswidgets/model/CellsSpinnerConfig;", 0)};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f27257p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public final ContentSpinnerBinding f27258q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public final ContentSpinnerDefaultBinding f27259r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy selectedOption;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy titleTextView;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final CellsSpinner$special$$inlined$observable$1 f27262u0;

    /* JADX INFO: compiled from: CellsSpinner.kt */
    public static final class a extends Lambda implements Function0<CellsTextView> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CellsTextView invoke() {
            CellsTextView cellsTextView;
            CellsSpinner cellsSpinner = CellsSpinner.this;
            ContentSpinnerBinding contentSpinnerBinding = cellsSpinner.f27258q0;
            if (contentSpinnerBinding == null || (cellsTextView = contentSpinnerBinding.selectedOption) == null) {
                ContentSpinnerDefaultBinding contentSpinnerDefaultBinding = cellsSpinner.f27259r0;
                cellsTextView = contentSpinnerDefaultBinding != null ? contentSpinnerDefaultBinding.selectedOption : null;
                Intrinsics.checkNotNull(cellsTextView);
            }
            return cellsTextView;
        }
    }

    /* JADX INFO: compiled from: CellsSpinner.kt */
    public static final class b extends Lambda implements Function0<CellsTextView> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CellsTextView invoke() {
            CellsTextView cellsTextView;
            CellsSpinner cellsSpinner = CellsSpinner.this;
            ContentSpinnerBinding contentSpinnerBinding = cellsSpinner.f27258q0;
            if (contentSpinnerBinding == null || (cellsTextView = contentSpinnerBinding.titleTextView) == null) {
                ContentSpinnerDefaultBinding contentSpinnerDefaultBinding = cellsSpinner.f27259r0;
                cellsTextView = contentSpinnerDefaultBinding != null ? contentSpinnerDefaultBinding.titleTextView : null;
                Intrinsics.checkNotNull(cellsTextView);
            }
            return cellsTextView;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsSpinner(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$evaluateConfig(CellsSpinner cellsSpinner) {
        CellsSpinnerConfig config = cellsSpinner.getConfig();
        if (config == null) {
            return;
        }
        PropertiesHelper.Property title = config.getTitle();
        String strLoadString = title != null ? PropertiesHelper.loadString(cellsSpinner.getContext(), title) : null;
        if (strLoadString == null) {
            strLoadString = "";
        }
        cellsSpinner.setTitle(strLoadString);
        PropertiesHelper.Property visibility = config.getVisibility();
        String value = visibility != null ? visibility.getValue() : null;
        int i10 = 0;
        if (value != null) {
            int iHashCode = value.hashCode();
            if (iHashCode != -1901805651) {
                if (iHashCode != 3178655) {
                    if (iHashCode == 466743410) {
                        value.equals("visible");
                    }
                } else if (value.equals("gone")) {
                    i10 = 8;
                }
            } else if (value.equals("invisible")) {
                i10 = 4;
            }
        }
        cellsSpinner.setVisibility(i10);
    }

    private final CellsSpinnerConfig getConfig() {
        return getValue(this, v0[0]);
    }

    private final CellsTextView getSelectedOption() {
        return (CellsTextView) this.selectedOption.getValue();
    }

    private final CharSequence getTitle() {
        CharSequence text = getTitleTextView().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    private final CellsTextView getTitleTextView() {
        return (CellsTextView) this.titleTextView.getValue();
    }

    public static /* synthetic */ void initAttrs$default(CellsSpinner cellsSpinner, Context context, AttributeSet attributeSet, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        cellsSpinner.initAttrs(context, attributeSet, i10, i11);
    }

    private final void setConfig(CellsSpinnerConfig cellsSpinnerConfig) {
        setValue(this, v0[0], cellsSpinnerConfig);
    }

    private final void setTitle(CharSequence charSequence) {
        getTitleTextView().setText(charSequence);
    }

    @NotNull
    public final CharSequence getText() {
        CharSequence text = getSelectedOption().getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    @NotNull
    public final CharSequence getTextContentDescription() {
        CharSequence contentDescription = getSelectedOption().getContentDescription();
        Intrinsics.checkNotNullExpressionValue(contentDescription, "getContentDescription(...)");
        return contentDescription;
    }

    public final void initAttrs(@NotNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.CellsSpinner, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        setBackground(typedArrayObtainStyledAttributes.getDrawable(R.styleable.CellsSpinner_cellsSpinner_background));
        this.f27257p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.CellsSpinner_cellsSpinner_height, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getLayoutParams().height = this.f27257p0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(@NotNull AccessibilityEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.onInitializeAccessibilityEvent(event);
        event.setClassName(Spinner.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NotNull AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        info.setClassName(Spinner.class.getName());
    }

    public final void setText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getSelectedOption().setText(value);
    }

    public final void setTextContentDescription(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getSelectedOption().setContentDescription(value);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CellsSpinner(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setConfig(@NotNull Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        setConfig(new CellsSpinnerConfig(map));
    }

    public /* synthetic */ CellsSpinner(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v6, types: [com.bbva.cellswidgets.CellsSpinner$special$$inlined$observable$1] */
    @JvmOverloads
    public CellsSpinner(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.selectedOption = LazyKt__LazyJVMKt.lazy(new a());
        this.titleTextView = LazyKt__LazyJVMKt.lazy(new b());
        Delegates delegates = Delegates.INSTANCE;
        final Object obj = null;
        this.f27262u0 = new ObservableProperty<CellsSpinnerConfig>(obj) { // from class: com.bbva.cellswidgets.CellsSpinner$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, CellsSpinnerConfig oldValue, CellsSpinnerConfig newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                CellsSpinner.access$evaluateConfig(this);
            }
        };
        try {
            this.f27258q0 = ContentSpinnerBinding.inflate(LayoutInflater.from(context), this);
        } catch (Exception unused) {
            this.f27259r0 = ContentSpinnerDefaultBinding.inflate(LayoutInflater.from(context), this);
            DefaultCellsSpinnerKt.applyDefaultAttributes$default(this, attributeSet, i10, 0, 4, null);
        }
        initAttrs$default(this, context, attributeSet, i10, 0, 8, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @TargetApi(21)
    public CellsSpinner(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        this(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
