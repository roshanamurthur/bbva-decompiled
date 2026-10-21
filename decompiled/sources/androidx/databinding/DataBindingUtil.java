package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.library.R;
import com.bbva.androidtoolkit.utils.PluginUtils;

/* JADX INFO: loaded from: classes2.dex */
public class DataBindingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DataBinderMapper f20522a = new DataBinderMapperImpl();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static DataBindingComponent f20523b = null;

    public static <T extends ViewDataBinding> T a(DataBindingComponent dataBindingComponent, ViewGroup viewGroup, int i10, int i11) {
        int childCount = viewGroup.getChildCount();
        int i12 = childCount - i10;
        DataBinderMapper dataBinderMapper = f20522a;
        if (i12 == 1) {
            return (T) dataBinderMapper.getDataBinder(dataBindingComponent, viewGroup.getChildAt(childCount - 1), i11);
        }
        View[] viewArr = new View[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            viewArr[i13] = viewGroup.getChildAt(i13 + i10);
        }
        return (T) dataBinderMapper.getDataBinder(dataBindingComponent, viewArr, i11);
    }

    @Nullable
    public static <T extends ViewDataBinding> T bind(@NonNull View view) {
        return (T) bind(view, f20523b);
    }

    @Nullable
    public static String convertBrIdToString(int i10) {
        return f20522a.convertBrIdToString(i10);
    }

    @Nullable
    public static <T extends ViewDataBinding> T findBinding(@NonNull View view) {
        while (view != null) {
            int i10 = ViewDataBinding.J0;
            T t10 = (T) view.getTag(R.id.dataBinding);
            if (t10 != null) {
                return t10;
            }
            Object tag = view.getTag();
            if (tag instanceof String) {
                String str = (String) tag;
                if (str.startsWith(PluginUtils.IDENTIFIER_LAYOUT) && str.endsWith("_0")) {
                    char cCharAt = str.charAt(6);
                    int iIndexOf = str.indexOf(47, 7);
                    if (cCharAt == '/') {
                        if (iIndexOf == -1) {
                            return null;
                        }
                    } else if (cCharAt == '-' && iIndexOf != -1 && str.indexOf(47, iIndexOf + 1) == -1) {
                        return null;
                    }
                }
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    @Nullable
    public static <T extends ViewDataBinding> T getBinding(@NonNull View view) {
        int i10 = ViewDataBinding.J0;
        if (view != null) {
            return (T) view.getTag(R.id.dataBinding);
        }
        return null;
    }

    @Nullable
    public static DataBindingComponent getDefaultComponent() {
        return f20523b;
    }

    public static <T extends ViewDataBinding> T inflate(@NonNull LayoutInflater layoutInflater, int i10, @Nullable ViewGroup viewGroup, boolean z10) {
        return (T) inflate(layoutInflater, i10, viewGroup, z10, f20523b);
    }

    public static <T extends ViewDataBinding> T setContentView(@NonNull Activity activity, int i10) {
        return (T) setContentView(activity, i10, f20523b);
    }

    public static void setDefaultComponent(@Nullable DataBindingComponent dataBindingComponent) {
        f20523b = dataBindingComponent;
    }

    @Nullable
    public static <T extends ViewDataBinding> T bind(@NonNull View view, DataBindingComponent dataBindingComponent) {
        T t10 = (T) getBinding(view);
        if (t10 != null) {
            return t10;
        }
        Object tag = view.getTag();
        if (!(tag instanceof String)) {
            throw new IllegalArgumentException("View is not a binding layout");
        }
        DataBinderMapper dataBinderMapper = f20522a;
        int layoutId = dataBinderMapper.getLayoutId((String) tag);
        if (layoutId != 0) {
            return (T) dataBinderMapper.getDataBinder(dataBindingComponent, view, layoutId);
        }
        throw new IllegalArgumentException(c.c("View is not a binding layout. Tag: ", tag));
    }

    public static <T extends ViewDataBinding> T inflate(@NonNull LayoutInflater layoutInflater, int i10, @Nullable ViewGroup viewGroup, boolean z10, @Nullable DataBindingComponent dataBindingComponent) {
        boolean z11 = viewGroup != null && z10;
        return z11 ? (T) a(dataBindingComponent, viewGroup, z11 ? viewGroup.getChildCount() : 0, i10) : (T) f20522a.getDataBinder(dataBindingComponent, layoutInflater.inflate(i10, viewGroup, z10), i10);
    }

    public static <T extends ViewDataBinding> T setContentView(@NonNull Activity activity, int i10, @Nullable DataBindingComponent dataBindingComponent) {
        activity.setContentView(i10);
        return (T) a(dataBindingComponent, (ViewGroup) activity.getWindow().getDecorView().findViewById(android.R.id.content), 0, i10);
    }
}
