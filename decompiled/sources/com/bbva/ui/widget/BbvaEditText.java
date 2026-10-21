package com.bbva.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bbva.ui.utils.TypefaceManager;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BbvaEditText.kt */
/* JADX INFO: loaded from: classes9.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015B!\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\u000e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/bbva/ui/widget/BbvaEditText;", "Landroidx/appcompat/widget/AppCompatEditText;", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyPreIme", "v0", "Z", "getMustClearFocusOnBackKey", "()Z", "setMustClearFocusOnBackKey", "(Z)V", "mustClearFocusOnBackKey", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ui_release"}, k = 1, mv = {1, 9, 0})
public class BbvaEditText extends AppCompatEditText {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public boolean mustClearFocusOnBackKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaEditText(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void b(BbvaEditText bbvaEditText, Context context, AttributeSet attributeSet, int i10, int i11) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        bbvaEditText.getClass();
        Resources.Theme theme = context.getTheme();
        TypefaceManager.Companion companion = TypefaceManager.INSTANCE;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, companion.getATTRS(), i10, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (!bbvaEditText.isInEditMode()) {
            companion.applyTypeface(bbvaEditText, typedArrayObtainStyledAttributes);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final boolean getMustClearFocusOnBackKey() {
        return this.mustClearFocusOnBackKey;
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onKeyPreIme(int keyCode, @NotNull KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (keyCode != 4 || event.getAction() != 1) {
            return super.dispatchKeyEvent(event);
        }
        if (!this.mustClearFocusOnBackKey) {
            return false;
        }
        clearFocus();
        return false;
    }

    public final void setMustClearFocusOnBackKey(boolean z10) {
        this.mustClearFocusOnBackKey = z10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaEditText(@NotNull Context context, @NotNull AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        b(this, context, attrs, 0, 12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BbvaEditText(@NotNull Context context, @NotNull AttributeSet attrs, int i10) {
        super(context, attrs, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        b(this, context, attrs, i10, 8);
    }
}
