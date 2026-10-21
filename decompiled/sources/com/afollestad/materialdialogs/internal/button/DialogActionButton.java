package com.afollestad.materialdialogs.internal.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.appcompat.widget.AppCompatButton;
import com.afollestad.materialdialogs.R;
import com.afollestad.materialdialogs.ThemeKt;
import com.afollestad.materialdialogs.utils.ColorsKt;
import com.afollestad.materialdialogs.utils.MDUtil;
import com.afollestad.materialdialogs.utils.ViewsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DialogActionButton.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u001b\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005H\u0016¨\u0006\u0016"}, d2 = {"Lcom/afollestad/materialdialogs/internal/button/DialogActionButton;", "Landroidx/appcompat/widget/AppCompatButton;", "Landroid/content/Context;", "baseContext", "appContext", "", "stacked", "", "update$com_afollestad_material_dialogs_core", "(Landroid/content/Context;Landroid/content/Context;Z)V", "update", "", "color", "updateTextColor", "enabled", "setEnabled", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Companion", "com.afollestad.material-dialogs.core"}, k = 1, mv = {1, 4, 0})
public final class DialogActionButton extends AppCompatButton {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f25482p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f25483q0;

    /* JADX INFO: compiled from: DialogActionButton.kt */
    public static final class a extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f25484p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(0);
            this.f25484p0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(MDUtil.resolveColor$default(MDUtil.INSTANCE, this.f25484p0, null, Integer.valueOf(R.attr.colorPrimary), null, 10, null));
        }
    }

    /* JADX INFO: compiled from: DialogActionButton.kt */
    public static final class b extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f25485p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context) {
            super(0);
            this.f25485p0 = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(ColorsKt.adjustAlpha(MDUtil.resolveColor$default(MDUtil.INSTANCE, this.f25485p0, null, Integer.valueOf(R.attr.colorPrimary), null, 10, null), 0.12f));
        }
    }

    public /* synthetic */ DialogActionButton(Context context, AttributeSet attributeSet, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? null : attributeSet);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        setTextColor(enabled ? this.f25482p0 : this.f25483q0);
    }

    public final void update$com_afollestad_material_dialogs_core(@NotNull Context baseContext, @NotNull Context appContext, boolean stacked) {
        int iResolveColor$default;
        MDUtil mDUtil = MDUtil.INSTANCE;
        setSupportAllCaps(mDUtil.resolveInt(appContext, R.attr.md_button_casing, 1) == 1);
        boolean zInferThemeIsLight = ThemeKt.inferThemeIsLight(appContext);
        this.f25482p0 = MDUtil.resolveColor$default(mDUtil, appContext, null, Integer.valueOf(R.attr.md_color_button_text), new a(appContext), 2, null);
        this.f25483q0 = MDUtil.resolveColor$default(mDUtil, baseContext, Integer.valueOf(zInferThemeIsLight ? R.color.md_disabled_text_light_theme : R.color.md_disabled_text_dark_theme), null, null, 12, null);
        setTextColor(this.f25482p0);
        Drawable drawableResolveDrawable$default = MDUtil.resolveDrawable$default(mDUtil, baseContext, null, Integer.valueOf(R.attr.md_button_selector), null, 10, null);
        if ((drawableResolveDrawable$default instanceof RippleDrawable) && (iResolveColor$default = MDUtil.resolveColor$default(mDUtil, baseContext, null, Integer.valueOf(R.attr.md_ripple_color), new b(appContext), 2, null)) != 0) {
            ((RippleDrawable) drawableResolveDrawable$default).setColor(ColorStateList.valueOf(iResolveColor$default));
        }
        setBackground(drawableResolveDrawable$default);
        if (stacked) {
            ViewsKt.setGravityEndCompat(this);
        } else {
            setGravity(17);
        }
        setEnabled(isEnabled());
    }

    public final void updateTextColor(@ColorInt int color) {
        this.f25482p0 = color;
        setEnabled(isEnabled());
    }

    public DialogActionButton(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setClickable(true);
        setFocusable(true);
    }
}
