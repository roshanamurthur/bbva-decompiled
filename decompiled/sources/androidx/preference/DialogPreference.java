package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.content.res.TypedArrayUtils;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DialogPreference extends Preference {

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public CharSequence f22254l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public CharSequence f22255m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public Drawable f22256n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public CharSequence f22257o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public CharSequence f22258p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public int f22259q1;

    public interface TargetFragment {
        @Nullable
        <T extends Preference> T findPreference(@NonNull CharSequence charSequence);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.DialogPreference, i10, i11);
        String string = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.DialogPreference_dialogTitle, R.styleable.DialogPreference_android_dialogTitle);
        this.f22254l1 = string;
        if (string == null) {
            this.f22254l1 = getTitle();
        }
        this.f22255m1 = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.DialogPreference_dialogMessage, R.styleable.DialogPreference_android_dialogMessage);
        this.f22256n1 = TypedArrayUtils.getDrawable(typedArrayObtainStyledAttributes, R.styleable.DialogPreference_dialogIcon, R.styleable.DialogPreference_android_dialogIcon);
        this.f22257o1 = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.DialogPreference_positiveButtonText, R.styleable.DialogPreference_android_positiveButtonText);
        this.f22258p1 = TypedArrayUtils.getString(typedArrayObtainStyledAttributes, R.styleable.DialogPreference_negativeButtonText, R.styleable.DialogPreference_android_negativeButtonText);
        this.f22259q1 = TypedArrayUtils.getResourceId(typedArrayObtainStyledAttributes, R.styleable.DialogPreference_dialogLayout, R.styleable.DialogPreference_android_dialogLayout, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Nullable
    public Drawable getDialogIcon() {
        return this.f22256n1;
    }

    public int getDialogLayoutResource() {
        return this.f22259q1;
    }

    @Nullable
    public CharSequence getDialogMessage() {
        return this.f22255m1;
    }

    @Nullable
    public CharSequence getDialogTitle() {
        return this.f22254l1;
    }

    @Nullable
    public CharSequence getNegativeButtonText() {
        return this.f22258p1;
    }

    @Nullable
    public CharSequence getPositiveButtonText() {
        return this.f22257o1;
    }

    @Override // androidx.preference.Preference
    public void onClick() {
        getPreferenceManager().showDialog(this);
    }

    public void setDialogIcon(@Nullable Drawable drawable) {
        this.f22256n1 = drawable;
    }

    public void setDialogLayoutResource(int i10) {
        this.f22259q1 = i10;
    }

    public void setDialogMessage(@Nullable CharSequence charSequence) {
        this.f22255m1 = charSequence;
    }

    public void setDialogTitle(@Nullable CharSequence charSequence) {
        this.f22254l1 = charSequence;
    }

    public void setNegativeButtonText(@Nullable CharSequence charSequence) {
        this.f22258p1 = charSequence;
    }

    public void setPositiveButtonText(@Nullable CharSequence charSequence) {
        this.f22257o1 = charSequence;
    }

    public void setDialogIcon(int i10) {
        this.f22256n1 = AppCompatResources.getDrawable(getContext(), i10);
    }

    public void setDialogMessage(int i10) {
        setDialogMessage(getContext().getString(i10));
    }

    public void setDialogTitle(int i10) {
        setDialogTitle(getContext().getString(i10));
    }

    public void setNegativeButtonText(int i10) {
        setNegativeButtonText(getContext().getString(i10));
    }

    public void setPositiveButtonText(int i10) {
        setPositiveButtonText(getContext().getString(i10));
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DialogPreference(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, TypedArrayUtils.getAttr(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(@NonNull Context context) {
        this(context, null);
    }
}
