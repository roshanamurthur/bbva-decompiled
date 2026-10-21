package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CompoundButtonCompat;

/* JADX INFO: compiled from: AppCompatCompoundButtonHelper.java */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final CompoundButton f1687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f1688b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1689c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1690d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f1691e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1692f;

    public w(@NonNull CompoundButton compoundButton) {
        this.f1687a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f1687a;
        Drawable buttonDrawable = CompoundButtonCompat.getButtonDrawable(compoundButton);
        if (buttonDrawable != null) {
            if (this.f1690d || this.f1691e) {
                Drawable drawableMutate = DrawableCompat.wrap(buttonDrawable).mutate();
                if (this.f1690d) {
                    DrawableCompat.setTintList(drawableMutate, this.f1688b);
                }
                if (this.f1691e) {
                    DrawableCompat.setTintMode(drawableMutate, this.f1689c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(@Nullable AttributeSet attributeSet, int i10) {
        int i11;
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f1687a;
        Context context = compoundButton.getContext();
        int[] iArr = R.styleable.CompoundButton;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton2 = this.f1687a;
        ViewCompat.saveAttributeDataForStyleable(compoundButton2, compoundButton2.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            int i12 = R.styleable.CompoundButton_buttonCompat;
            if (!tintTypedArrayObtainStyledAttributes.hasValue(i12) || (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(i12, 0)) == 0) {
                i11 = R.styleable.CompoundButton_android_button;
                if (tintTypedArrayObtainStyledAttributes.hasValue(i11) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(i11, 0)) != 0) {
                    compoundButton.setButtonDrawable(AppCompatResources.getDrawable(compoundButton.getContext(), resourceId));
                }
            } else {
                try {
                    compoundButton.setButtonDrawable(AppCompatResources.getDrawable(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    i11 = R.styleable.CompoundButton_android_button;
                    if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
                        compoundButton.setButtonDrawable(AppCompatResources.getDrawable(compoundButton.getContext(), resourceId));
                    }
                }
            }
            int i13 = R.styleable.CompoundButton_buttonTint;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
                CompoundButtonCompat.setButtonTintList(compoundButton, tintTypedArrayObtainStyledAttributes.getColorStateList(i13));
            }
            int i14 = R.styleable.CompoundButton_buttonTintMode;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
                CompoundButtonCompat.setButtonTintMode(compoundButton, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i14, -1), null));
            }
        } finally {
            tintTypedArrayObtainStyledAttributes.recycle();
        }
    }
}
