package com.bbva.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ui.utils.TypefaceManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BbvaButton.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/ui/widget/BbvaButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBbvaButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BbvaButton.kt\ncom/bbva/ui/widget/BbvaButton\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,48:1\n233#2,3:49\n*S KotlinDebug\n*F\n+ 1 BbvaButton.kt\ncom/bbva/ui/widget/BbvaButton\n*L\n41#1:49,3\n*E\n"})
public class BbvaButton extends AppCompatButton {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaButton(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(Context context, AttributeSet attributeSet, int i10) {
        Resources.Theme theme = context.getTheme();
        TypefaceManager.Companion companion = TypefaceManager.INSTANCE;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, companion.getATTRS(), i10, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (!isInEditMode()) {
            companion.applyTypeface(this, typedArrayObtainStyledAttributes);
        }
        Unit unit = Unit.INSTANCE;
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaButton(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        a(context, attrs, R.attr.buttonStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaButton(@NotNull Context context, @NotNull AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        a(context, attrs, i10);
    }
}
