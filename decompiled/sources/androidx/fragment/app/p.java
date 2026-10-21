package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.camera2.internal.h0;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public final class p implements LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final FragmentManager f21740p0;

    public p(FragmentManager fragmentManager) {
        this.f21740p0 = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    @Nullable
    public final View onCreateView(@NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    @Nullable
    public final View onCreateView(@Nullable View view, @NonNull String str, @NonNull Context context, @NonNull AttributeSet attributeSet) {
        u uVarF;
        boolean zEquals = FragmentContainerView.class.getName().equals(str);
        FragmentManager fragmentManager = this.f21740p0;
        if (zEquals) {
            return new FragmentContainerView(context, attributeSet, fragmentManager);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, Name.LABEL);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Fragment);
        if (attributeValue == null) {
            attributeValue = typedArrayObtainStyledAttributes.getString(R.styleable.Fragment_android_name);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Fragment_android_id, -1);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.Fragment_android_tag);
        typedArrayObtainStyledAttributes.recycle();
        if (attributeValue != null) {
            try {
                if (Fragment.class.isAssignableFrom(FragmentFactory.a(context.getClassLoader(), attributeValue))) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    Fragment fragmentFindFragmentById = resourceId != -1 ? fragmentManager.findFragmentById(resourceId) : null;
                    if (fragmentFindFragmentById == null && string != null) {
                        fragmentFindFragmentById = fragmentManager.findFragmentByTag(string);
                    }
                    if (fragmentFindFragmentById == null && id != -1) {
                        fragmentFindFragmentById = fragmentManager.findFragmentById(id);
                    }
                    if (fragmentFindFragmentById == null) {
                        fragmentFindFragmentById = fragmentManager.getFragmentFactory().instantiate(context.getClassLoader(), attributeValue);
                        fragmentFindFragmentById.mFromLayout = true;
                        fragmentFindFragmentById.mFragmentId = resourceId != 0 ? resourceId : id;
                        fragmentFindFragmentById.mContainerId = id;
                        fragmentFindFragmentById.mTag = string;
                        fragmentFindFragmentById.mInLayout = true;
                        fragmentFindFragmentById.mFragmentManager = fragmentManager;
                        fragmentFindFragmentById.mHost = fragmentManager.getHost();
                        fragmentFindFragmentById.onInflate(fragmentManager.getHost().f21522q0, attributeSet, fragmentFindFragmentById.mSavedFragmentState);
                        uVarF = fragmentManager.a(fragmentFindFragmentById);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            fragmentFindFragmentById.toString();
                            Integer.toHexString(resourceId);
                        }
                    } else {
                        if (fragmentFindFragmentById.mInLayout) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        fragmentFindFragmentById.mInLayout = true;
                        fragmentFindFragmentById.mFragmentManager = fragmentManager;
                        fragmentFindFragmentById.mHost = fragmentManager.getHost();
                        fragmentFindFragmentById.onInflate(fragmentManager.getHost().f21522q0, attributeSet, fragmentFindFragmentById.mSavedFragmentState);
                        uVarF = fragmentManager.f(fragmentFindFragmentById);
                        if (FragmentManager.isLoggingEnabled(2)) {
                            fragmentFindFragmentById.toString();
                            Integer.toHexString(resourceId);
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    FragmentStrictMode.onFragmentTagUsage(fragmentFindFragmentById, viewGroup);
                    fragmentFindFragmentById.mContainer = viewGroup;
                    uVarF.i();
                    uVarF.h();
                    View view2 = fragmentFindFragmentById.mView;
                    if (view2 == null) {
                        throw new IllegalStateException(h0.b("Fragment ", attributeValue, " did not create a view."));
                    }
                    if (resourceId != 0) {
                        view2.setId(resourceId);
                    }
                    if (fragmentFindFragmentById.mView.getTag() == null) {
                        fragmentFindFragmentById.mView.setTag(string);
                    }
                    fragmentFindFragmentById.mView.addOnAttachStateChangeListener(new a(uVarF));
                    return fragmentFindFragmentById.mView;
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        return null;
    }

    /* JADX INFO: compiled from: FragmentLayoutInflaterFactory.java */
    public class a implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ u f21741p0;

        public a(u uVar) {
            this.f21741p0 = uVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            u uVar = this.f21741p0;
            Fragment fragment = uVar.f21771c;
            uVar.i();
            b0.f((ViewGroup) fragment.mView.getParent(), p.this.f21740p0).e();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
