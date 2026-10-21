package androidx.databinding;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.databinding.library.R;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.viewbinding.ViewBinding;
import com.bbva.androidtoolkit.utils.PluginUtils;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewDataBinding extends BaseObservable implements ViewBinding {
    public static final String BINDING_TAG_PREFIX = "binding_";
    public static final boolean K0 = true;
    public final Handler E0;
    public ViewDataBinding F0;
    public LifecycleOwner G0;
    public j H0;
    public boolean I0;
    protected final DataBindingComponent mBindingComponent;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected boolean mInStateFlowRegisterObserver;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final g f20544q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f20545r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f20546s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final androidx.databinding.h[] f20547t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final View f20548u0;
    public CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f20549w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Choreographer f20550x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final h f20551y0;
    public static final int J0 = Build.VERSION.SDK_INT;
    public static final a L0 = new a();
    public static final b M0 = new b();
    public static final c N0 = new c();
    public static final d O0 = new d();
    public static final e P0 = new e();
    public static final ReferenceQueue<ViewDataBinding> Q0 = new ReferenceQueue<>();
    public static final f R0 = new f();

    public static class IncludedLayouts {
        public final int[][] indexes;
        public final int[][] layoutIds;
        public final String[][] layouts;

        public IncludedLayouts(int i10) {
            this.layouts = new String[i10][];
            this.indexes = new int[i10][];
            this.layoutIds = new int[i10][];
        }

        public void setIncludes(int i10, String[] strArr, int[] iArr, int[] iArr2) {
            this.layouts[i10] = strArr;
            this.indexes[i10] = iArr;
            this.layoutIds[i10] = iArr2;
        }
    }

    public static abstract class PropertyChangedInverseListener extends Observable.OnPropertyChangedCallback implements InverseBindingListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20552a;

        public PropertyChangedInverseListener(int i10) {
            this.f20552a = i10;
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(Observable observable, int i10) {
            if (i10 == this.f20552a || i10 == 0) {
                onChange();
            }
        }
    }

    public class a implements androidx.databinding.b {
        @Override // androidx.databinding.b
        public final androidx.databinding.h a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new m(viewDataBinding, i10, referenceQueue).f20560a;
        }
    }

    public class b implements androidx.databinding.b {
        @Override // androidx.databinding.b
        public final androidx.databinding.h a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new k(viewDataBinding, i10, referenceQueue).f20558a;
        }
    }

    public class c implements androidx.databinding.b {
        @Override // androidx.databinding.b
        public final androidx.databinding.h a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new l(viewDataBinding, i10, referenceQueue).f20559a;
        }
    }

    public class d implements androidx.databinding.b {
        @Override // androidx.databinding.b
        public final androidx.databinding.h a(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            return new i(viewDataBinding, i10, referenceQueue).f20555a;
        }
    }

    public class e extends CallbackRegistry.NotifierCallback<OnRebindCallback, ViewDataBinding, Void> {
        @Override // androidx.databinding.CallbackRegistry.NotifierCallback
        public final void onNotifyCallback(OnRebindCallback onRebindCallback, ViewDataBinding viewDataBinding, int i10, Void r4) {
            OnRebindCallback onRebindCallback2 = onRebindCallback;
            ViewDataBinding viewDataBinding2 = viewDataBinding;
            if (i10 == 1) {
                if (onRebindCallback2.onPreBind(viewDataBinding2)) {
                    return;
                }
                viewDataBinding2.f20546s0 = true;
            } else if (i10 == 2) {
                onRebindCallback2.onCanceled(viewDataBinding2);
            } else {
                if (i10 != 3) {
                    return;
                }
                onRebindCallback2.onBound(viewDataBinding2);
            }
        }
    }

    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this) {
                ViewDataBinding.this.f20545r0 = false;
            }
            while (true) {
                Reference<? extends ViewDataBinding> referencePoll = ViewDataBinding.Q0.poll();
                if (referencePoll == null) {
                    break;
                } else if (referencePoll instanceof androidx.databinding.h) {
                    ((androidx.databinding.h) referencePoll).b();
                }
            }
            if (ViewDataBinding.this.f20548u0.isAttachedToWindow()) {
                ViewDataBinding.this.executePendingBindings();
                return;
            }
            View view = ViewDataBinding.this.f20548u0;
            f fVar = ViewDataBinding.R0;
            view.removeOnAttachStateChangeListener(fVar);
            ViewDataBinding.this.f20548u0.addOnAttachStateChangeListener(fVar);
        }
    }

    public class h implements Choreographer.FrameCallback {
        public h() {
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j10) {
            ViewDataBinding.this.f20544q0.run();
        }
    }

    public static class i implements Observer, androidx.databinding.d<LiveData<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.databinding.h<LiveData<?>> f20555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public WeakReference<LifecycleOwner> f20556b = null;

        public i(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f20555a = new androidx.databinding.h<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.d
        public final void addListener(LiveData<?> liveData) {
            LiveData<?> liveData2 = liveData;
            WeakReference<LifecycleOwner> weakReference = this.f20556b;
            LifecycleOwner lifecycleOwner = weakReference == null ? null : weakReference.get();
            if (lifecycleOwner != null) {
                liveData2.observe(lifecycleOwner, this);
            }
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(@Nullable Object obj) {
            androidx.databinding.h<LiveData<?>> hVar = this.f20555a;
            ViewDataBinding viewDataBindingA = hVar.a();
            if (viewDataBindingA != null) {
                viewDataBindingA.handleFieldChange(hVar.f20627b, hVar.f20628c, 0);
            }
        }

        @Override // androidx.databinding.d
        public final void removeListener(LiveData<?> liveData) {
            liveData.removeObserver(this);
        }

        @Override // androidx.databinding.d
        public final void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
            WeakReference<LifecycleOwner> weakReference = this.f20556b;
            LifecycleOwner lifecycleOwner2 = weakReference == null ? null : weakReference.get();
            LiveData<?> liveData = this.f20555a.f20628c;
            if (liveData != null) {
                if (lifecycleOwner2 != null) {
                    liveData.removeObserver(this);
                }
                if (lifecycleOwner != null) {
                    liveData.observe(lifecycleOwner, this);
                }
            }
            if (lifecycleOwner != null) {
                this.f20556b = new WeakReference<>(lifecycleOwner);
            }
        }
    }

    public static class j implements LifecycleObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final WeakReference<ViewDataBinding> f20557p0;

        public j(ViewDataBinding viewDataBinding) {
            this.f20557p0 = new WeakReference<>(viewDataBinding);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public void onStart() {
            ViewDataBinding viewDataBinding = this.f20557p0.get();
            if (viewDataBinding != null) {
                viewDataBinding.executePendingBindings();
            }
        }
    }

    public ViewDataBinding(DataBindingComponent dataBindingComponent, View view, int i10) {
        this.f20544q0 = new g();
        this.f20545r0 = false;
        this.f20546s0 = false;
        this.mBindingComponent = dataBindingComponent;
        this.f20547t0 = new androidx.databinding.h[i10];
        this.f20548u0 = view;
        if (Looper.myLooper() == null) {
            throw new IllegalStateException("DataBinding must be created in view's UI Thread");
        }
        if (K0) {
            this.f20550x0 = Choreographer.getInstance();
            this.f20551y0 = new h();
        } else {
            this.f20551y0 = null;
            this.E0 = new Handler(Looper.myLooper());
        }
    }

    public static DataBindingComponent a(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof DataBindingComponent) {
            return (DataBindingComponent) obj;
        }
        throw new IllegalArgumentException("The provided bindingComponent parameter must be an instance of DataBindingComponent. See  https://issuetracker.google.com/issues/116541301 for details of why this parameter is not defined as DataBindingComponent");
    }

    public static ViewDataBinding bind(Object obj, View view, int i10) {
        return DataBindingUtil.f20522a.getDataBinder(a(obj), view, i10);
    }

    /* JADX WARN: Code duplicated, block: B:117:0x01d0  */
    public static void c(DataBindingComponent dataBindingComponent, View view, Object[] objArr, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        boolean z12;
        int i13;
        int id;
        int i14;
        int iCharAt;
        int i15;
        int length;
        IncludedLayouts includedLayouts2 = includedLayouts;
        if ((view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null) != null) {
            return;
        }
        Object tag = view.getTag();
        String str = tag instanceof String ? (String) tag : null;
        int i16 = 1;
        if (z10 && str != null && str.startsWith(PluginUtils.IDENTIFIER_LAYOUT)) {
            int iLastIndexOf = str.lastIndexOf(95);
            if (iLastIndexOf <= 0 || (length = str.length()) == (i15 = iLastIndexOf + 1)) {
                iCharAt = -1;
                z11 = false;
                break;
            }
            int i17 = i15;
            while (true) {
                if (i17 >= length) {
                    int length2 = str.length();
                    iCharAt = 0;
                    while (i15 < length2) {
                        iCharAt = (iCharAt * 10) + (str.charAt(i15) - '0');
                        i15++;
                    }
                    if (objArr[iCharAt] == null) {
                        objArr[iCharAt] = view;
                    }
                    if (includedLayouts2 == null) {
                        iCharAt = -1;
                    }
                    z11 = true;
                    break;
                }
                if (!Character.isDigit(str.charAt(i17))) {
                    iCharAt = -1;
                    z11 = false;
                    break;
                }
                i17++;
            }
            i10 = iCharAt;
        } else if (str == null || !str.startsWith(BINDING_TAG_PREFIX)) {
            i10 = -1;
            z11 = false;
        } else {
            int length3 = str.length();
            int iCharAt2 = 0;
            for (int i18 = 8; i18 < length3; i18++) {
                iCharAt2 = (iCharAt2 * 10) + (str.charAt(i18) - '0');
            }
            if (objArr[iCharAt2] == null) {
                objArr[iCharAt2] = view;
            }
            if (includedLayouts2 == null) {
                iCharAt2 = -1;
            }
            i10 = iCharAt2;
            z11 = true;
        }
        if (!z11 && (id = view.getId()) > 0 && sparseIntArray != null && (i14 = sparseIntArray.get(id, -1)) >= 0 && objArr[i14] == null) {
            objArr[i14] = view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            int i19 = 0;
            int i20 = 0;
            while (i19 < childCount) {
                View childAt = viewGroup.getChildAt(i19);
                if (i10 < 0 || !(childAt.getTag() instanceof String)) {
                    i11 = i19;
                    i12 = i20;
                    z12 = false;
                } else {
                    String str2 = (String) childAt.getTag();
                    if (str2.endsWith("_0") && str2.startsWith(PluginUtils.IDENTIFIER_LAYOUT) && str2.indexOf(47) > 0) {
                        CharSequence charSequenceSubSequence = str2.subSequence(str2.indexOf(47) + i16, str2.length() - 2);
                        String[] strArr = includedLayouts2.layouts[i10];
                        int length4 = strArr.length;
                        int i21 = i20;
                        while (true) {
                            if (i21 >= length4) {
                                i21 = -1;
                                break;
                            } else if (TextUtils.equals(charSequenceSubSequence, strArr[i21])) {
                                break;
                            } else {
                                i21++;
                            }
                        }
                        if (i21 >= 0) {
                            int i22 = i21 + 1;
                            int i23 = includedLayouts2.indexes[i10][i21];
                            int i24 = includedLayouts2.layoutIds[i10][i21];
                            String str3 = (String) viewGroup.getChildAt(i19).getTag();
                            String strC = androidx.databinding.e.c(str3, i16, 0);
                            int length5 = strC.length();
                            int childCount2 = viewGroup.getChildCount();
                            int i25 = i19 + 1;
                            int i26 = i19;
                            while (i25 < childCount2) {
                                View childAt2 = viewGroup.getChildAt(i25);
                                String str4 = childAt2.getTag() instanceof String ? (String) childAt2.getTag() : null;
                                if (str4 != null && str4.startsWith(strC)) {
                                    i13 = childCount2;
                                    if (str4.length() == str3.length() && str4.charAt(str4.length() - 1) == '0') {
                                        break;
                                    }
                                    int length6 = str4.length();
                                    if (length6 != length5) {
                                        int i27 = length5;
                                        while (true) {
                                            if (i27 >= length6) {
                                                i26 = i25;
                                                break;
                                            } else if (!Character.isDigit(str4.charAt(i27))) {
                                                break;
                                            } else {
                                                i27++;
                                            }
                                        }
                                    }
                                } else {
                                    i13 = childCount2;
                                }
                                i25++;
                                childCount2 = i13;
                            }
                            if (i26 == i19) {
                                objArr[i23] = DataBindingUtil.f20522a.getDataBinder(dataBindingComponent, childAt, i24);
                            } else {
                                int i28 = i26 - i19;
                                int i29 = i28 + 1;
                                View[] viewArr = new View[i29];
                                for (int i30 = 0; i30 < i29; i30++) {
                                    viewArr[i30] = viewGroup.getChildAt(i19 + i30);
                                }
                                objArr[i23] = DataBindingUtil.f20522a.getDataBinder(dataBindingComponent, viewArr, i24);
                                i19 += i28;
                            }
                            i12 = i22;
                            i11 = i19;
                            z12 = true;
                        } else {
                            i11 = i19;
                            i12 = i20;
                            z12 = false;
                        }
                    } else {
                        i11 = i19;
                        i12 = i20;
                        z12 = false;
                    }
                }
                if (!z12) {
                    c(dataBindingComponent, childAt, objArr, includedLayouts, sparseIntArray, false);
                }
                int i31 = i11 + 1;
                includedLayouts2 = includedLayouts;
                i16 = 1;
                i19 = i31;
                i20 = i12;
                childCount = childCount;
                viewGroup = viewGroup;
            }
        }
    }

    public static void executeBindingsOn(ViewDataBinding viewDataBinding) {
        viewDataBinding.b();
    }

    public static int getBuildSdkInt() {
        return J0;
    }

    public static int getColorFromResource(View view, int i10) {
        return view.getContext().getColor(i10);
    }

    public static ColorStateList getColorStateListFromResource(View view, int i10) {
        return view.getContext().getColorStateList(i10);
    }

    public static Drawable getDrawableFromResource(View view, int i10) {
        return view.getContext().getDrawable(i10);
    }

    public static <K, T> T getFrom(Map<K, T> map, K k10) {
        if (map == null) {
            return null;
        }
        return map.get(k10);
    }

    public static <T> T getFromArray(T[] tArr, int i10) {
        if (tArr == null || i10 < 0 || i10 >= tArr.length) {
            return null;
        }
        return tArr[i10];
    }

    public static <T> T getFromList(List<T> list, int i10) {
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return null;
        }
        return list.get(i10);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static <T extends ViewDataBinding> T inflateInternal(@NonNull LayoutInflater layoutInflater, int i10, @Nullable ViewGroup viewGroup, boolean z10, @Nullable Object obj) {
        return (T) DataBindingUtil.inflate(layoutInflater, i10, viewGroup, z10, a(obj));
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View view, int i10, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        c(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        return objArr;
    }

    public static boolean parse(String str, boolean z10) {
        return str == null ? z10 : Boolean.parseBoolean(str);
    }

    public static int safeUnbox(Integer num) {
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public static void setBindingInverseListener(ViewDataBinding viewDataBinding, InverseBindingListener inverseBindingListener, PropertyChangedInverseListener propertyChangedInverseListener) {
        if (inverseBindingListener != propertyChangedInverseListener) {
            if (inverseBindingListener != null) {
                viewDataBinding.removeOnPropertyChangedCallback((PropertyChangedInverseListener) inverseBindingListener);
            }
            if (propertyChangedInverseListener != null) {
                viewDataBinding.addOnPropertyChangedCallback(propertyChangedInverseListener);
            }
        }
    }

    public static <T> void setTo(T[] tArr, int i10, T t10) {
        if (tArr == null || i10 < 0 || i10 >= tArr.length) {
            return;
        }
        tArr[i10] = t10;
    }

    public void addOnRebindCallback(@NonNull OnRebindCallback onRebindCallback) {
        if (this.v0 == null) {
            this.v0 = new CallbackRegistry<>(P0);
        }
        this.v0.add(onRebindCallback);
    }

    public final void b() {
        if (this.f20549w0) {
            requestRebind();
            return;
        }
        if (hasPendingBindings()) {
            this.f20549w0 = true;
            this.f20546s0 = false;
            CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.v0;
            if (callbackRegistry != null) {
                callbackRegistry.notifyCallbacks(this, 1, null);
                if (this.f20546s0) {
                    this.v0.notifyCallbacks(this, 2, null);
                }
            }
            if (!this.f20546s0) {
                executeBindings();
                CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry2 = this.v0;
                if (callbackRegistry2 != null) {
                    callbackRegistry2.notifyCallbacks(this, 3, null);
                }
            }
            this.f20549w0 = false;
        }
    }

    public void ensureBindingComponentIsNotNull(Class<?> cls) {
        if (this.mBindingComponent != null) {
            return;
        }
        throw new IllegalStateException("Required DataBindingComponent is null in class " + getClass().getSimpleName() + ". A BindingAdapter in " + cls.getCanonicalName() + " is not static and requires an object to use, retrieved from the DataBindingComponent. If you don't use an inflation method taking a DataBindingComponent, use DataBindingUtil.setDefaultComponent or make all BindingAdapter methods static.");
    }

    public abstract void executeBindings();

    public void executePendingBindings() {
        ViewDataBinding viewDataBinding = this.F0;
        if (viewDataBinding == null) {
            b();
        } else {
            viewDataBinding.executePendingBindings();
        }
    }

    @Nullable
    public LifecycleOwner getLifecycleOwner() {
        return this.G0;
    }

    public Object getObservedField(int i10) {
        androidx.databinding.h hVar = this.f20547t0[i10];
        if (hVar == null) {
            return null;
        }
        return hVar.f20628c;
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public View getRoot() {
        return this.f20548u0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void handleFieldChange(int i10, Object obj, int i11) {
        if (this.I0 || this.mInStateFlowRegisterObserver || !onFieldChange(i10, obj, i11)) {
            return;
        }
        requestRebind();
    }

    public abstract boolean hasPendingBindings();

    public abstract void invalidateAll();

    public abstract boolean onFieldChange(int i10, Object obj, int i11);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void registerTo(int i10, Object obj, androidx.databinding.b bVar) {
        if (obj == 0) {
            return;
        }
        androidx.databinding.h[] hVarArr = this.f20547t0;
        androidx.databinding.h hVarA = hVarArr[i10];
        if (hVarA == null) {
            hVarA = bVar.a(this, i10, Q0);
            hVarArr[i10] = hVarA;
            LifecycleOwner lifecycleOwner = this.G0;
            if (lifecycleOwner != null) {
                hVarA.f20626a.setLifecycleOwner(lifecycleOwner);
            }
        }
        hVarA.b();
        hVarA.f20628c = obj;
        hVarA.f20626a.addListener(obj);
    }

    public void removeOnRebindCallback(@NonNull OnRebindCallback onRebindCallback) {
        CallbackRegistry<OnRebindCallback, ViewDataBinding, Void> callbackRegistry = this.v0;
        if (callbackRegistry != null) {
            callbackRegistry.remove(onRebindCallback);
        }
    }

    public void requestRebind() {
        ViewDataBinding viewDataBinding = this.F0;
        if (viewDataBinding != null) {
            viewDataBinding.requestRebind();
            return;
        }
        LifecycleOwner lifecycleOwner = this.G0;
        if (lifecycleOwner == null || lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            synchronized (this) {
                try {
                    if (this.f20545r0) {
                        return;
                    }
                    this.f20545r0 = true;
                    if (K0) {
                        this.f20550x0.postFrameCallback(this.f20551y0);
                    } else {
                        this.E0.post(this.f20544q0);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void setContainedBinding(ViewDataBinding viewDataBinding) {
        if (viewDataBinding != null) {
            viewDataBinding.F0 = this;
        }
    }

    @MainThread
    public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner instanceof Fragment) {
            Log.w("DataBinding", "Setting the fragment as the LifecycleOwner might cause memory leaks because views lives shorter than the Fragment. Consider using Fragment's view lifecycle");
        }
        LifecycleOwner lifecycleOwner2 = this.G0;
        if (lifecycleOwner2 == lifecycleOwner) {
            return;
        }
        if (lifecycleOwner2 != null) {
            lifecycleOwner2.getLifecycle().removeObserver(this.H0);
        }
        this.G0 = lifecycleOwner;
        if (lifecycleOwner != null) {
            if (this.H0 == null) {
                this.H0 = new j(this);
            }
            lifecycleOwner.getLifecycle().addObserver(this.H0);
        }
        for (androidx.databinding.h hVar : this.f20547t0) {
            if (hVar != null) {
                hVar.f20626a.setLifecycleOwner(lifecycleOwner);
            }
        }
    }

    public void setRootTag(View view) {
        view.setTag(R.id.dataBinding, this);
    }

    public abstract boolean setVariable(int i10, @Nullable Object obj);

    public void unbind() {
        for (androidx.databinding.h hVar : this.f20547t0) {
            if (hVar != null) {
                hVar.b();
            }
        }
    }

    public boolean unregisterFrom(int i10) {
        androidx.databinding.h hVar = this.f20547t0[i10];
        if (hVar != null) {
            return hVar.b();
        }
        return false;
    }

    public boolean updateLiveDataRegistration(int i10, LiveData<?> liveData) {
        this.I0 = true;
        try {
            return updateRegistration(i10, liveData, O0);
        } finally {
            this.I0 = false;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean updateRegistration(int i10, Object obj, androidx.databinding.b bVar) {
        if (obj == null) {
            return unregisterFrom(i10);
        }
        androidx.databinding.h hVar = this.f20547t0[i10];
        if (hVar == null) {
            registerTo(i10, obj, bVar);
            return true;
        }
        if (hVar.f20628c == obj) {
            return false;
        }
        unregisterFrom(i10);
        registerTo(i10, obj, bVar);
        return true;
    }

    public static byte parse(String str, byte b10) {
        try {
            return Byte.parseByte(str);
        } catch (NumberFormatException unused) {
            return b10;
        }
    }

    public static long safeUnbox(Long l6) {
        if (l6 == null) {
            return 0L;
        }
        return l6.longValue();
    }

    public void setRootTag(View[] viewArr) {
        for (View view : viewArr) {
            view.setTag(R.id.dataBinding, this);
        }
    }

    public static boolean getFromArray(boolean[] zArr, int i10) {
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return false;
        }
        return zArr[i10];
    }

    public static <T> T getFromList(SparseArray<T> sparseArray, int i10) {
        if (sparseArray == null || i10 < 0) {
            return null;
        }
        return sparseArray.get(i10);
    }

    public static Object[] mapBindings(DataBindingComponent dataBindingComponent, View[] viewArr, int i10, IncludedLayouts includedLayouts, SparseIntArray sparseIntArray) {
        Object[] objArr = new Object[i10];
        for (View view : viewArr) {
            c(dataBindingComponent, view, objArr, includedLayouts, sparseIntArray, true);
        }
        return objArr;
    }

    public static short parse(String str, short s4) {
        try {
            return Short.parseShort(str);
        } catch (NumberFormatException unused) {
            return s4;
        }
    }

    public static short safeUnbox(Short sh2) {
        if (sh2 == null) {
            return (short) 0;
        }
        return sh2.shortValue();
    }

    public static void setTo(boolean[] zArr, int i10, boolean z10) {
        if (zArr == null || i10 < 0 || i10 >= zArr.length) {
            return;
        }
        zArr[i10] = z10;
    }

    @TargetApi(16)
    public static <T> T getFromList(LongSparseArray<T> longSparseArray, int i10) {
        if (longSparseArray == null || i10 < 0) {
            return null;
        }
        return longSparseArray.get(i10);
    }

    public static int parse(String str, int i10) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    public static byte safeUnbox(Byte b10) {
        if (b10 == null) {
            return (byte) 0;
        }
        return b10.byteValue();
    }

    public static byte getFromArray(byte[] bArr, int i10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            return (byte) 0;
        }
        return bArr[i10];
    }

    public static <T> T getFromList(androidx.collection.LongSparseArray<T> longSparseArray, int i10) {
        if (longSparseArray == null || i10 < 0) {
            return null;
        }
        return longSparseArray.get(i10);
    }

    public static long parse(String str, long j10) {
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static char safeUnbox(Character ch2) {
        if (ch2 == null) {
            return (char) 0;
        }
        return ch2.charValue();
    }

    public static void setTo(byte[] bArr, int i10, byte b10) {
        if (bArr == null || i10 < 0 || i10 >= bArr.length) {
            return;
        }
        bArr[i10] = b10;
    }

    public static boolean getFromList(SparseBooleanArray sparseBooleanArray, int i10) {
        if (sparseBooleanArray == null || i10 < 0) {
            return false;
        }
        return sparseBooleanArray.get(i10);
    }

    public static float parse(String str, float f6) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return f6;
        }
    }

    public static double safeUnbox(Double d2) {
        if (d2 == null) {
            return 0.0d;
        }
        return d2.doubleValue();
    }

    public static short getFromArray(short[] sArr, int i10) {
        if (sArr == null || i10 < 0 || i10 >= sArr.length) {
            return (short) 0;
        }
        return sArr[i10];
    }

    public static int getFromList(SparseIntArray sparseIntArray, int i10) {
        if (sparseIntArray == null || i10 < 0) {
            return 0;
        }
        return sparseIntArray.get(i10);
    }

    public static double parse(String str, double d2) {
        try {
            return Double.parseDouble(str);
        } catch (NumberFormatException unused) {
            return d2;
        }
    }

    public static float safeUnbox(Float f6) {
        if (f6 == null) {
            return 0.0f;
        }
        return f6.floatValue();
    }

    public static void setTo(short[] sArr, int i10, short s4) {
        if (sArr == null || i10 < 0 || i10 >= sArr.length) {
            return;
        }
        sArr[i10] = s4;
    }

    public boolean updateRegistration(int i10, Observable observable) {
        return updateRegistration(i10, observable, L0);
    }

    @TargetApi(18)
    public static long getFromList(SparseLongArray sparseLongArray, int i10) {
        if (sparseLongArray == null || i10 < 0) {
            return 0L;
        }
        return sparseLongArray.get(i10);
    }

    public static char parse(String str, char c10) {
        return (str == null || str.isEmpty()) ? c10 : str.charAt(0);
    }

    public static boolean safeUnbox(Boolean bool) {
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public boolean updateRegistration(int i10, ObservableList observableList) {
        return updateRegistration(i10, observableList, M0);
    }

    public static char getFromArray(char[] cArr, int i10) {
        if (cArr == null || i10 < 0 || i10 >= cArr.length) {
            return (char) 0;
        }
        return cArr[i10];
    }

    public static void setTo(char[] cArr, int i10, char c10) {
        if (cArr == null || i10 < 0 || i10 >= cArr.length) {
            return;
        }
        cArr[i10] = c10;
    }

    public boolean updateRegistration(int i10, ObservableMap observableMap) {
        return updateRegistration(i10, observableMap, N0);
    }

    public static int getFromArray(int[] iArr, int i10) {
        if (iArr == null || i10 < 0 || i10 >= iArr.length) {
            return 0;
        }
        return iArr[i10];
    }

    public static void setTo(int[] iArr, int i10, int i11) {
        if (iArr == null || i10 < 0 || i10 >= iArr.length) {
            return;
        }
        iArr[i10] = i11;
    }

    public static long getFromArray(long[] jArr, int i10) {
        if (jArr == null || i10 < 0 || i10 >= jArr.length) {
            return 0L;
        }
        return jArr[i10];
    }

    public static void setTo(long[] jArr, int i10, long j10) {
        if (jArr == null || i10 < 0 || i10 >= jArr.length) {
            return;
        }
        jArr[i10] = j10;
    }

    public ViewDataBinding(Object obj, View view, int i10) {
        this(a(obj), view, i10);
    }

    public static float getFromArray(float[] fArr, int i10) {
        if (fArr == null || i10 < 0 || i10 >= fArr.length) {
            return 0.0f;
        }
        return fArr[i10];
    }

    public static void setTo(float[] fArr, int i10, float f6) {
        if (fArr == null || i10 < 0 || i10 >= fArr.length) {
            return;
        }
        fArr[i10] = f6;
    }

    public static double getFromArray(double[] dArr, int i10) {
        if (dArr == null || i10 < 0 || i10 >= dArr.length) {
            return 0.0d;
        }
        return dArr[i10];
    }

    public static void setTo(double[] dArr, int i10, double d2) {
        if (dArr == null || i10 < 0 || i10 >= dArr.length) {
            return;
        }
        dArr[i10] = d2;
    }

    public static <T> void setTo(List<T> list, int i10, T t10) {
        if (list == null || i10 < 0 || i10 >= list.size()) {
            return;
        }
        list.set(i10, t10);
    }

    public static <T> void setTo(SparseArray<T> sparseArray, int i10, T t10) {
        if (sparseArray == null || i10 < 0 || i10 >= sparseArray.size()) {
            return;
        }
        sparseArray.put(i10, t10);
    }

    @TargetApi(16)
    public static <T> void setTo(LongSparseArray<T> longSparseArray, int i10, T t10) {
        if (longSparseArray == null || i10 < 0 || i10 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i10, t10);
    }

    public static <T> void setTo(androidx.collection.LongSparseArray<T> longSparseArray, int i10, T t10) {
        if (longSparseArray == null || i10 < 0 || i10 >= longSparseArray.size()) {
            return;
        }
        longSparseArray.put(i10, t10);
    }

    public static void setTo(SparseBooleanArray sparseBooleanArray, int i10, boolean z10) {
        if (sparseBooleanArray == null || i10 < 0 || i10 >= sparseBooleanArray.size()) {
            return;
        }
        sparseBooleanArray.put(i10, z10);
    }

    public static void setTo(SparseIntArray sparseIntArray, int i10, int i11) {
        if (sparseIntArray == null || i10 < 0 || i10 >= sparseIntArray.size()) {
            return;
        }
        sparseIntArray.put(i10, i11);
    }

    @TargetApi(18)
    public static void setTo(SparseLongArray sparseLongArray, int i10, long j10) {
        if (sparseLongArray == null || i10 < 0 || i10 >= sparseLongArray.size()) {
            return;
        }
        sparseLongArray.put(i10, j10);
    }

    public class f implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        @TargetApi(19)
        public final void onViewAttachedToWindow(View view) {
            int i10 = ViewDataBinding.J0;
            (view != null ? (ViewDataBinding) view.getTag(R.id.dataBinding) : null).f20544q0.run();
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public static class k extends ObservableList.OnListChangedCallback implements androidx.databinding.d<ObservableList> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.databinding.h<ObservableList> f20558a;

        public k(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f20558a = new androidx.databinding.h<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.d
        public final void addListener(ObservableList observableList) {
            observableList.addOnListChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void onChanged(ObservableList observableList) {
            ObservableList observableList2;
            androidx.databinding.h<ObservableList> hVar = this.f20558a;
            ViewDataBinding viewDataBindingA = hVar.a();
            if (viewDataBindingA != null && (observableList2 = hVar.f20628c) == observableList) {
                viewDataBindingA.handleFieldChange(hVar.f20627b, observableList2, 0);
            }
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void onItemRangeChanged(ObservableList observableList, int i10, int i11) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void onItemRangeInserted(ObservableList observableList, int i10, int i11) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void onItemRangeMoved(ObservableList observableList, int i10, int i11, int i12) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.ObservableList.OnListChangedCallback
        public final void onItemRangeRemoved(ObservableList observableList, int i10, int i11) {
            onChanged(observableList);
        }

        @Override // androidx.databinding.d
        public final void removeListener(ObservableList observableList) {
            observableList.removeOnListChangedCallback(this);
        }

        @Override // androidx.databinding.d
        public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    public static class l extends ObservableMap.OnMapChangedCallback implements androidx.databinding.d<ObservableMap> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.databinding.h<ObservableMap> f20559a;

        public l(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f20559a = new androidx.databinding.h<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.d
        public final void addListener(ObservableMap observableMap) {
            observableMap.addOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.ObservableMap.OnMapChangedCallback
        public final void onMapChanged(ObservableMap observableMap, Object obj) {
            androidx.databinding.h<ObservableMap> hVar = this.f20559a;
            ViewDataBinding viewDataBindingA = hVar.a();
            if (viewDataBindingA == null || observableMap != hVar.f20628c) {
                return;
            }
            viewDataBindingA.handleFieldChange(hVar.f20627b, observableMap, 0);
        }

        @Override // androidx.databinding.d
        public final void removeListener(ObservableMap observableMap) {
            observableMap.removeOnMapChangedCallback(this);
        }

        @Override // androidx.databinding.d
        public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    public static class m extends Observable.OnPropertyChangedCallback implements androidx.databinding.d<Observable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.databinding.h<Observable> f20560a;

        public m(ViewDataBinding viewDataBinding, int i10, ReferenceQueue<ViewDataBinding> referenceQueue) {
            this.f20560a = new androidx.databinding.h<>(viewDataBinding, i10, this, referenceQueue);
        }

        @Override // androidx.databinding.d
        public final void addListener(Observable observable) {
            observable.addOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public final void onPropertyChanged(Observable observable, int i10) {
            androidx.databinding.h<Observable> hVar = this.f20560a;
            ViewDataBinding viewDataBindingA = hVar.a();
            if (viewDataBindingA != null && hVar.f20628c == observable) {
                viewDataBindingA.handleFieldChange(hVar.f20627b, observable, i10);
            }
        }

        @Override // androidx.databinding.d
        public final void removeListener(Observable observable) {
            observable.removeOnPropertyChangedCallback(this);
        }

        @Override // androidx.databinding.d
        public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        }
    }

    public static <K, T> void setTo(Map<K, T> map, K k10, T t10) {
        if (map == null) {
            return;
        }
        map.put(k10, t10);
    }
}
