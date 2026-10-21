package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatMultiAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatRatingBar;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.AppCompatToggleButton;
import androidx.appcompat.widget.TintContextWrapper;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatViewInflater {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f633b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f634c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f635d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f636e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f637f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f638g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleArrayMap<String, Constructor<? extends View>> f639h = new SimpleArrayMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f640a = new Object[2];

    public static class a implements View.OnClickListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final View f641p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final String f642q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Method f643r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Context f644s0;

        public a(@NonNull View view, @NonNull String str) {
            this.f641p0 = view;
            this.f642q0 = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(@NonNull View view) {
            String str;
            Method method;
            if (this.f643r0 != null) {
                break;
            }
            View view2 = this.f641p0;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f642q0;
                if (context == null) {
                    int id = view2.getId();
                    if (id == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    StringBuilder sbD = ci.a.d("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbD.append(view2.getClass());
                    sbD.append(str);
                    throw new IllegalStateException(sbD.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f643r0 = method;
                        this.f644s0 = context;
                        break;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            try {
                this.f643r0.invoke(this.f644s0, view);
            } catch (IllegalAccessException e5) {
                throw new IllegalStateException("Could not execute non-public method for android:onClick", e5);
            } catch (InvocationTargetException e7) {
                throw new IllegalStateException("Could not execute method for android:onClick", e7);
            }
        }
    }

    public final View a(Context context, String str, String str2) throws InflateException, ClassNotFoundException {
        String strConcat;
        SimpleArrayMap<String, Constructor<? extends View>> simpleArrayMap = f639h;
        Constructor<? extends View> constructor = simpleArrayMap.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f633b);
            simpleArrayMap.put(str, constructor);
        }
        constructor.setAccessible(true);
        return constructor.newInstance(this.f640a);
    }

    public final void b(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }

    @NonNull
    public AppCompatAutoCompleteTextView createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatAutoCompleteTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    @NonNull
    public AppCompatCheckBox createCheckBox(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    @NonNull
    public AppCompatCheckedTextView createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckedTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatEditText createEditText(Context context, AttributeSet attributeSet) {
        return new AppCompatEditText(context, attributeSet);
    }

    @NonNull
    public AppCompatImageButton createImageButton(Context context, AttributeSet attributeSet) {
        return new AppCompatImageButton(context, attributeSet);
    }

    @NonNull
    public AppCompatImageView createImageView(Context context, AttributeSet attributeSet) {
        return new AppCompatImageView(context, attributeSet);
    }

    @NonNull
    public AppCompatMultiAutoCompleteTextView createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatMultiAutoCompleteTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatRadioButton createRadioButton(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    @NonNull
    public AppCompatRatingBar createRatingBar(Context context, AttributeSet attributeSet) {
        return new AppCompatRatingBar(context, attributeSet);
    }

    @NonNull
    public AppCompatSeekBar createSeekBar(Context context, AttributeSet attributeSet) {
        return new AppCompatSeekBar(context, attributeSet);
    }

    @NonNull
    public AppCompatSpinner createSpinner(Context context, AttributeSet attributeSet) {
        return new AppCompatSpinner(context, attributeSet);
    }

    @NonNull
    public AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    @NonNull
    public AppCompatToggleButton createToggleButton(Context context, AttributeSet attributeSet) {
        return new AppCompatToggleButton(context, attributeSet);
    }

    @Nullable
    public View createView(Context context, String str, AttributeSet attributeSet) {
        return null;
    }

    @Nullable
    public final View createView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet, boolean z10, boolean z11, boolean z12, boolean z13) {
        View viewCreateRatingBar;
        Context context2 = (!z10 || view == null) ? context : view.getContext();
        if (z11 || z12) {
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, androidx.appcompat.R.styleable.View, 0, 0);
            int resourceId = z11 ? typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.View_android_theme, 0) : 0;
            if (z12 && resourceId == 0) {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.appcompat.R.styleable.View_theme, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
            if (resourceId != 0 && (!(context2 instanceof ContextThemeWrapper) || ((ContextThemeWrapper) context2).getThemeResId() != resourceId)) {
                context2 = new ContextThemeWrapper(context2, resourceId);
            }
        }
        if (z13) {
            context2 = TintContextWrapper.wrap(context2);
        }
        str.getClass();
        switch (str) {
            case "RatingBar":
                viewCreateRatingBar = createRatingBar(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "CheckedTextView":
                viewCreateRatingBar = createCheckedTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "MultiAutoCompleteTextView":
                viewCreateRatingBar = createMultiAutoCompleteTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "TextView":
                viewCreateRatingBar = createTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "ImageButton":
                viewCreateRatingBar = createImageButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "SeekBar":
                viewCreateRatingBar = createSeekBar(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "Spinner":
                viewCreateRatingBar = createSpinner(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "RadioButton":
                viewCreateRatingBar = createRadioButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "ToggleButton":
                viewCreateRatingBar = createToggleButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "ImageView":
                viewCreateRatingBar = createImageView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "AutoCompleteTextView":
                viewCreateRatingBar = createAutoCompleteTextView(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "CheckBox":
                viewCreateRatingBar = createCheckBox(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "EditText":
                viewCreateRatingBar = createEditText(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            case "Button":
                viewCreateRatingBar = createButton(context2, attributeSet);
                b(viewCreateRatingBar, str);
                break;
            default:
                viewCreateRatingBar = createView(context2, str, attributeSet);
                break;
        }
        if (viewCreateRatingBar == null && context != context2) {
            Object[] objArr = this.f640a;
            if (str.equals("view")) {
                str = attributeSet.getAttributeValue(null, Name.LABEL);
            }
            try {
                objArr[0] = context2;
                objArr[1] = attributeSet;
                if (-1 == str.indexOf(46)) {
                    int i10 = 0;
                    while (true) {
                        String[] strArr = f638g;
                        if (i10 < 3) {
                            View viewA = a(context2, str, strArr[i10]);
                            if (viewA != null) {
                                objArr[0] = null;
                                objArr[1] = null;
                                viewCreateRatingBar = viewA;
                            } else {
                                i10++;
                            }
                        } else {
                            objArr[0] = null;
                            objArr[1] = null;
                            viewCreateRatingBar = null;
                        }
                    }
                } else {
                    View viewA2 = a(context2, str, null);
                    objArr[0] = null;
                    objArr[1] = null;
                    viewCreateRatingBar = viewA2;
                }
            } catch (Exception unused) {
                objArr[0] = null;
                objArr[1] = null;
            } catch (Throwable th2) {
                objArr[0] = null;
                objArr[1] = null;
                throw th2;
            }
        }
        if (viewCreateRatingBar != null) {
            Context context3 = viewCreateRatingBar.getContext();
            if ((context3 instanceof ContextWrapper) && viewCreateRatingBar.hasOnClickListeners()) {
                TypedArray typedArrayObtainStyledAttributes2 = context3.obtainStyledAttributes(attributeSet, f634c);
                String string = typedArrayObtainStyledAttributes2.getString(0);
                if (string != null) {
                    viewCreateRatingBar.setOnClickListener(new a(viewCreateRatingBar, string));
                }
                typedArrayObtainStyledAttributes2.recycle();
            }
            if (Build.VERSION.SDK_INT <= 28) {
                TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, f635d);
                if (typedArrayObtainStyledAttributes3.hasValue(0)) {
                    ViewCompat.setAccessibilityHeading(viewCreateRatingBar, typedArrayObtainStyledAttributes3.getBoolean(0, false));
                }
                typedArrayObtainStyledAttributes3.recycle();
                TypedArray typedArrayObtainStyledAttributes4 = context2.obtainStyledAttributes(attributeSet, f636e);
                if (typedArrayObtainStyledAttributes4.hasValue(0)) {
                    ViewCompat.setAccessibilityPaneTitle(viewCreateRatingBar, typedArrayObtainStyledAttributes4.getString(0));
                }
                typedArrayObtainStyledAttributes4.recycle();
                TypedArray typedArrayObtainStyledAttributes5 = context2.obtainStyledAttributes(attributeSet, f637f);
                if (typedArrayObtainStyledAttributes5.hasValue(0)) {
                    ViewCompat.setScreenReaderFocusable(viewCreateRatingBar, typedArrayObtainStyledAttributes5.getBoolean(0, false));
                }
                typedArrayObtainStyledAttributes5.recycle();
            }
        }
        return viewCreateRatingBar;
    }
}
