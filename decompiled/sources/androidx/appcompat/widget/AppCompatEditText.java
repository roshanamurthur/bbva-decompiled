package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.R;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.OnReceiveContentViewBehavior;
import androidx.core.view.TintableBackgroundView;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TextViewOnReceiveContentListener;
import androidx.core.widget.TintableCompoundDrawablesView;
import com.bbva.nativesettings.common.Constants;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatEditText extends EditText implements TintableBackgroundView, OnReceiveContentViewBehavior, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final k f1174p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final h0 f1175q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final f0 f1176r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TextViewOnReceiveContentListener f1177s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NonNull
    public final x f1178t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public a f1179u0;

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1180a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1184e;

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1181b = propertyMapper.mapObject("backgroundTint", R.attr.backgroundTint);
            this.f1182c = propertyMapper.mapObject("backgroundTintMode", R.attr.backgroundTintMode);
            this.f1183d = propertyMapper.mapObject("drawableTint", R.attr.drawableTint);
            this.f1184e = propertyMapper.mapObject("drawableTintMode", R.attr.drawableTintMode);
            this.f1180a = true;
        }

        public void readProperties(@NonNull AppCompatEditText appCompatEditText, @NonNull PropertyReader propertyReader) {
            if (!this.f1180a) {
                throw j.c();
            }
            propertyReader.readObject(this.f1181b, appCompatEditText.getBackgroundTintList());
            propertyReader.readObject(this.f1182c, appCompatEditText.getBackgroundTintMode());
            propertyReader.readObject(this.f1183d, appCompatEditText.getCompoundDrawableTintList());
            propertyReader.readObject(this.f1184e, appCompatEditText.getCompoundDrawableTintMode());
        }
    }

    @RequiresApi(api = 26)
    public class a {
        public a() {
        }
    }

    public AppCompatEditText(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    @RequiresApi(26)
    @UiThread
    private a getSuperCaller() {
        if (this.f1179u0 == null) {
            this.f1179u0 = new a();
        }
        return this.f1179u0;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        k kVar = this.f1174p0;
        if (kVar != null) {
            kVar.b();
        }
        h0 h0Var = this.f1175q0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.unwrapCustomSelectionActionModeCallback(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        k kVar = this.f1174p0;
        if (kVar != null) {
            return kVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.TintableBackgroundView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        k kVar = this.f1174p0;
        if (kVar != null) {
            return kVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1175q0.d();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1175q0.e();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi(api = 26)
    public TextClassifier getTextClassifier() {
        f0 f0Var;
        if (Build.VERSION.SDK_INT >= 28 || (f0Var = this.f1176r0) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = f0Var.f1599b;
        return textClassifier == null ? f0.a.a(f0Var.f1598a) : textClassifier;
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public boolean isEmojiCompatEnabled() {
        return this.f1178t0.f1696b.isEnabled();
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        String[] onReceiveContentMimeTypes;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1175q0.getClass();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 && inputConnectionOnCreateInputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, getText());
        }
        z.f(this, inputConnectionOnCreateInputConnection, editorInfo);
        if (inputConnectionOnCreateInputConnection != null && i10 <= 30 && (onReceiveContentMimeTypes = ViewCompat.getOnReceiveContentMimeTypes(this)) != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo, onReceiveContentMimeTypes);
            inputConnectionOnCreateInputConnection = InputConnectionCompat.createWrapper(this, inputConnectionOnCreateInputConnection, editorInfo);
        }
        return this.f1178t0.f1696b.onCreateInputConnection(inputConnectionOnCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30 || i10 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService(Constants.INPUT_METHOD)).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 31 && i10 >= 24 && dragEvent.getLocalState() == null && ViewCompat.getOnReceiveContentMimeTypes(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3 && d0.a(dragEvent, this, activity)) {
                return true;
            }
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.OnReceiveContentViewBehavior
    @Nullable
    public ContentInfoCompat onReceiveContent(@NonNull ContentInfoCompat contentInfoCompat) {
        return this.f1177s0.onReceiveContent(this, contentInfoCompat);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i10) {
        if (Build.VERSION.SDK_INT >= 31 || ViewCompat.getOnReceiveContentMimeTypes(this) == null || !(i10 == 16908322 || i10 == 16908337)) {
            return super.onTextContextMenuItem(i10);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            ViewCompat.performReceiveContent(this, new ContentInfoCompat.Builder(primaryClip, 1).setFlags(i10 == 16908322 ? 0 : 1).build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        k kVar = this.f1174p0;
        if (kVar != null) {
            kVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        super.setBackgroundResource(i10);
        k kVar = this.f1174p0;
        if (kVar != null) {
            kVar.g(i10);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.f1175q0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        h0 h0Var = this.f1175q0;
        if (h0Var != null) {
            h0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.wrapCustomSelectionActionModeCallback(this, callback));
    }

    @Override // androidx.appcompat.widget.EmojiCompatConfigurationView
    public void setEmojiCompatEnabled(boolean z10) {
        this.f1178t0.f1696b.setEnabled(z10);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f1178t0.a(keyListener));
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        k kVar = this.f1174p0;
        if (kVar != null) {
            kVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.TintableBackgroundView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        k kVar = this.f1174p0;
        if (kVar != null) {
            kVar.j(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        h0 h0Var = this.f1175q0;
        h0Var.k(colorStateList);
        h0Var.b();
    }

    @Override // androidx.core.widget.TintableCompoundDrawablesView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        h0 h0Var = this.f1175q0;
        h0Var.l(mode);
        h0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        h0 h0Var = this.f1175q0;
        if (h0Var != null) {
            h0Var.g(context, i10);
        }
    }

    @Override // android.widget.TextView
    @RequiresApi(api = 26)
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        f0 f0Var;
        if (Build.VERSION.SDK_INT >= 28 || (f0Var = this.f1176r0) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            f0Var.f1599b = textClassifier;
        }
    }

    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(TintContextWrapper.wrap(context), attributeSet, i10);
        ThemeUtils.checkAppCompatTheme(this, getContext());
        k kVar = new k(this);
        this.f1174p0 = kVar;
        kVar.e(attributeSet, i10);
        h0 h0Var = new h0(this);
        this.f1175q0 = h0Var;
        h0Var.f(attributeSet, i10);
        h0Var.b();
        this.f1176r0 = new f0(this);
        this.f1177s0 = new TextViewOnReceiveContentListener();
        x xVar = new x(this);
        this.f1178t0 = xVar;
        xVar.b(attributeSet, i10);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = xVar.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }
}
