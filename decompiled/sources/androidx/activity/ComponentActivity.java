package androidx.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.contextaware.ContextAware;
import androidx.activity.contextaware.ContextAwareHelper;
import androidx.activity.contextaware.OnContextAvailableListener;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.CallSuper;
import androidx.annotation.ContentView;
import androidx.annotation.DoNotInline;
import androidx.annotation.LayoutRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnNewIntentProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuHostHelper;
import androidx.core.view.MenuProvider;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ReportFragment;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import androidx.tracing.Trace;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.ComponentActivity implements ContextAware, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, OnBackPressedDispatcherOwner, ActivityResultRegistryOwner, ActivityResultCaller, OnConfigurationChangedProvider, OnTrimMemoryProvider, OnNewIntentProvider, OnMultiWindowModeChangedProvider, OnPictureInPictureModeChangedProvider, MenuHost, FullyDrawnReporterOwner {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;

    @LayoutRes
    private int mContentLayoutId;
    final ContextAwareHelper mContextAwareHelper;
    private ViewModelProvider.Factory mDefaultFactory;
    private boolean mDispatchingOnMultiWindowModeChanged;
    private boolean mDispatchingOnPictureInPictureModeChanged;

    @NonNull
    final FullyDrawnReporter mFullyDrawnReporter;
    private final LifecycleRegistry mLifecycleRegistry;
    private final MenuHostHelper mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final CopyOnWriteArrayList<Consumer<Configuration>> mOnConfigurationChangedListeners;
    private final CopyOnWriteArrayList<Consumer<MultiWindowModeChangedInfo>> mOnMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Intent>> mOnNewIntentListeners;
    private final CopyOnWriteArrayList<Consumer<PictureInPictureModeChangedInfo>> mOnPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<Consumer<Integer>> mOnTrimMemoryListeners;
    final i mReportFullyDrawnExecutor;
    final SavedStateRegistryController mSavedStateRegistryController;
    private ViewModelStore mViewModelStore;

    public class a extends ActivityResultRegistry {

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0001a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ int f295p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ ActivityResultContract.SynchronousResult f296q0;

            public RunnableC0001a(int i10, ActivityResultContract.SynchronousResult synchronousResult) {
                this.f295p0 = i10;
                this.f296q0 = synchronousResult;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.dispatchResult(this.f295p0, this.f296q0.getValue());
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ int f298p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ IntentSender.SendIntentException f299q0;

            public b(int i10, IntentSender.SendIntentException sendIntentException) {
                this.f298p0 = i10;
                this.f299q0 = sendIntentException;
            }

            @Override // java.lang.Runnable
            public final void run() {
                a.this.dispatchResult(this.f298p0, 0, new Intent().setAction(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST).putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_SEND_INTENT_EXCEPTION, this.f299q0));
            }
        }

        public a() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public final <I, O> void onLaunch(int i10, @NonNull ActivityResultContract<I, O> activityResultContract, I i11, @Nullable ActivityOptionsCompat activityOptionsCompat) {
            Bundle bundle;
            ComponentActivity componentActivity = ComponentActivity.this;
            ActivityResultContract.SynchronousResult<O> synchronousResult = activityResultContract.getSynchronousResult(componentActivity, i11);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0001a(i10, synchronousResult));
                return;
            }
            Intent intentCreateIntent = activityResultContract.createIntent(componentActivity, i11);
            if (intentCreateIntent.getExtras() != null && intentCreateIntent.getExtras().getClassLoader() == null) {
                intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentCreateIntent.hasExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) {
                Bundle bundleExtra = intentCreateIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                intentCreateIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                bundle = bundleExtra;
            } else {
                bundle = activityOptionsCompat != null ? activityOptionsCompat.toBundle() : null;
            }
            if (ActivityResultContracts.RequestMultiplePermissions.ACTION_REQUEST_PERMISSIONS.equals(intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                ActivityCompat.requestPermissions(componentActivity, stringArrayExtra, i10);
                return;
            }
            if (!ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST.equals(intentCreateIntent.getAction())) {
                ActivityCompat.startActivityForResult(componentActivity, intentCreateIntent, i10, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST);
            try {
                ActivityCompat.startIntentSenderForResult(componentActivity, intentSenderRequest.getIntentSender(), i10, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
            } catch (IntentSender.SendIntentException e5) {
                new Handler(Looper.getMainLooper()).post(new b(i10, e5));
            }
        }
    }

    public class b implements LifecycleEventObserver {
        public b() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_STOP) {
                Window window = ComponentActivity.this.getWindow();
                View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                if (viewPeekDecorView != null) {
                    viewPeekDecorView.cancelPendingInputEvents();
                }
            }
        }
    }

    public class c implements LifecycleEventObserver {
        public c() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_DESTROY) {
                ComponentActivity componentActivity = ComponentActivity.this;
                componentActivity.mContextAwareHelper.clearAvailableContext();
                if (!componentActivity.isChangingConfigurations()) {
                    componentActivity.getViewModelStore().clear();
                }
                componentActivity.mReportFullyDrawnExecutor.b();
            }
        }
    }

    public class d implements LifecycleEventObserver {
        public d() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.ensureViewModelStore();
            componentActivity.getLifecycle().removeObserver(this);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e5) {
                if (!TextUtils.equals(e5.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e5;
                }
            } catch (NullPointerException e7) {
                if (!TextUtils.equals(e7.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                    throw e7;
                }
            }
        }
    }

    public class f implements LifecycleEventObserver {
        public f() {
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            if (event != Lifecycle.Event.ON_CREATE || Build.VERSION.SDK_INT < 33) {
                return;
            }
            ComponentActivity.this.mOnBackPressedDispatcher.setOnBackInvokedDispatcher(g.a((ComponentActivity) lifecycleOwner));
        }
    }

    @RequiresApi(33)
    public static class g {
        @DoNotInline
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f306a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewModelStore f307b;
    }

    public interface i extends Executor {
        void b();

        void c(@NonNull View view);
    }

    @RequiresApi(16)
    public class j implements i, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Runnable f309q0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final long f308p0 = SystemClock.uptimeMillis() + 10000;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f310r0 = false;

        public j() {
        }

        @Override // androidx.activity.ComponentActivity.i
        public final void b() {
            ComponentActivity componentActivity = ComponentActivity.this;
            componentActivity.getWindow().getDecorView().removeCallbacks(this);
            componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.i
        public final void c(@NonNull View view) {
            if (this.f310r0) {
                return;
            }
            this.f310r0 = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f309q0 = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            if (!this.f310r0) {
                decorView.postOnAnimation(new androidx.activity.f(this, 0));
            } else if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public final void onDraw() {
            Runnable runnable = this.f309q0;
            ComponentActivity componentActivity = ComponentActivity.this;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.f308p0) {
                    this.f310r0 = false;
                    componentActivity.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.f309q0 = null;
            if (componentActivity.mFullyDrawnReporter.isFullyDrawnReported()) {
                this.f310r0 = false;
                componentActivity.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new ContextAwareHelper();
        int i10 = 0;
        this.mMenuHostHelper = new MenuHostHelper(new androidx.activity.b(this, i10));
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        SavedStateRegistryController savedStateRegistryControllerCreate = SavedStateRegistryController.create(this);
        this.mSavedStateRegistryController = savedStateRegistryControllerCreate;
        this.mOnBackPressedDispatcher = null;
        i iVarCreateFullyDrawnExecutor = createFullyDrawnExecutor();
        this.mReportFullyDrawnExecutor = iVarCreateFullyDrawnExecutor;
        this.mFullyDrawnReporter = new FullyDrawnReporter(iVarCreateFullyDrawnExecutor, new androidx.activity.c(this, i10));
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new a();
        this.mOnConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.mOnNewIntentListeners = new CopyOnWriteArrayList<>();
        this.mOnMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mOnPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.mDispatchingOnMultiWindowModeChanged = false;
        this.mDispatchingOnPictureInPictureModeChanged = false;
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        int i11 = Build.VERSION.SDK_INT;
        getLifecycle().addObserver(new b());
        getLifecycle().addObserver(new c());
        getLifecycle().addObserver(new d());
        savedStateRegistryControllerCreate.performAttach();
        SavedStateHandleSupport.enableSavedStateHandles(this);
        if (i11 <= 23) {
            Lifecycle lifecycle = getLifecycle();
            p pVar = new p();
            pVar.f458p0 = this;
            lifecycle.addObserver(pVar);
        }
        getSavedStateRegistry().registerSavedStateProvider(ACTIVITY_RESULT_TAG, new SavedStateRegistry.SavedStateProvider() { // from class: androidx.activity.d
            @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
            public final Bundle saveState() {
                return this.f446a.lambda$new$1();
            }
        });
        addOnContextAvailableListener(new OnContextAvailableListener() { // from class: androidx.activity.e
            @Override // androidx.activity.contextaware.OnContextAvailableListener
            public final void onContextAvailable(Context context) {
                this.f447a.lambda$new$2(context);
            }
        });
    }

    private i createFullyDrawnExecutor() {
        return new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$new$0() {
        reportFullyDrawn();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bundle lambda$new$1() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.onSaveInstanceState(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$2(Context context) {
        Bundle bundleConsumeRestoredStateForKey = getSavedStateRegistry().consumeRestoredStateForKey(ACTIVITY_RESULT_TAG);
        if (bundleConsumeRestoredStateForKey != null) {
            this.mActivityResultRegistry.onRestoreInstanceState(bundleConsumeRestoredStateForKey);
        }
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c(getWindow().getDecorView());
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuHostHelper.addMenuProvider(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void addOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer) {
        this.mOnConfigurationChangedListeners.add(consumer);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void addOnContextAvailableListener(@NonNull OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.addOnContextAvailableListener(onContextAvailableListener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void addOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> consumer) {
        this.mOnMultiWindowModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void addOnNewIntentListener(@NonNull Consumer<Intent> consumer) {
        this.mOnNewIntentListeners.add(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void addOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> consumer) {
        this.mOnPictureInPictureModeChangedListeners.add(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void addOnTrimMemoryListener(@NonNull Consumer<Integer> consumer) {
        this.mOnTrimMemoryListeners.add(consumer);
    }

    public void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            h hVar = (h) getLastNonConfigurationInstance();
            if (hVar != null) {
                this.mViewModelStore = hVar.f307b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new ViewModelStore();
            }
        }
    }

    @Override // androidx.activity.result.ActivityResultRegistryOwner
    @NonNull
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    @CallSuper
    public CreationExtras getDefaultViewModelCreationExtras() {
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras();
        if (getApplication() != null) {
            mutableCreationExtras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, getApplication());
        }
        mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getIntent() != null && getIntent().getExtras() != null) {
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getIntent().getExtras());
        }
        return mutableCreationExtras;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new SavedStateViewModelFactory(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Override // androidx.activity.FullyDrawnReporterOwner
    @NonNull
    public FullyDrawnReporter getFullyDrawnReporter() {
        return this.mFullyDrawnReporter;
    }

    @Nullable
    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        h hVar = (h) getLastNonConfigurationInstance();
        if (hVar != null) {
            return hVar.f306a;
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, androidx.lifecycle.LifecycleOwner
    @NonNull
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.OnBackPressedDispatcherOwner
    @NonNull
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        if (this.mOnBackPressedDispatcher == null) {
            this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new e());
            getLifecycle().addObserver(new f());
        }
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.SavedStateRegistryOwner
    @NonNull
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    @NonNull
    public ViewModelStore getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @CallSuper
    public void initializeViewTreeOwners() {
        ViewTreeLifecycleOwner.set(getWindow().getDecorView(), this);
        ViewTreeViewModelStoreOwner.set(getWindow().getDecorView(), this);
        ViewTreeSavedStateRegistryOwner.set(getWindow().getDecorView(), this);
        ViewTreeOnBackPressedDispatcherOwner.set(getWindow().getDecorView(), this);
        ViewTreeFullyDrawnReporterOwner.set(getWindow().getDecorView(), this);
    }

    @Override // androidx.core.view.MenuHost
    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onActivityResult(int i10, int i11, @Nullable Intent intent) {
        if (this.mActivityResultRegistry.dispatchResult(i10, i11, intent)) {
            return;
        }
        super.onActivityResult(i10, i11, intent);
    }

    @Override // android.app.Activity
    @CallSuper
    @MainThread
    @Deprecated
    public void onBackPressed() {
        getOnBackPressedDispatcher().onBackPressed();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Iterator<Consumer<Configuration>> it = this.mOnConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(configuration);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        this.mSavedStateRegistryController.performRestore(bundle);
        this.mContextAwareHelper.dispatchOnContextAvailable(this);
        super.onCreate(bundle);
        ReportFragment.injectIfNeededIn(this);
        int i10 = this.mContentLayoutId;
        if (i10 != 0) {
            setContentView(i10);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i10, @NonNull Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onCreatePanelMenu(i10, menu);
        this.mMenuHostHelper.onCreateMenu(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i10, @NonNull MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 0) {
            return this.mMenuHostHelper.onMenuItemSelected(menuItem);
        }
        return false;
    }

    @Override // android.app.Activity
    @CallSuper
    public void onMultiWindowModeChanged(boolean z10) {
        if (this.mDispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new MultiWindowModeChangedInfo(z10));
        }
    }

    @Override // android.app.Activity
    @CallSuper
    public void onNewIntent(@SuppressLint({"UnknownNullness", "MissingNullability"}) Intent intent) {
        super.onNewIntent(intent);
        Iterator<Consumer<Intent>> it = this.mOnNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i10, @NonNull Menu menu) {
        this.mMenuHostHelper.onMenuClosed(menu);
        super.onPanelClosed(i10, menu);
    }

    @Override // android.app.Activity
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z10) {
        if (this.mDispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new PictureInPictureModeChangedInfo(z10));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i10, @Nullable View view, @NonNull Menu menu) {
        if (i10 != 0) {
            return true;
        }
        super.onPreparePanel(i10, view, menu);
        this.mMenuHostHelper.onPrepareMenu(menu);
        return true;
    }

    @Override // android.app.Activity
    @CallSuper
    @Deprecated
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        if (this.mActivityResultRegistry.dispatchResult(i10, -1, new Intent().putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSIONS, strArr).putExtra(ActivityResultContracts.RequestMultiplePermissions.EXTRA_PERMISSION_GRANT_RESULTS, iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Nullable
    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @Nullable
    public final Object onRetainNonConfigurationInstance() {
        h hVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        ViewModelStore viewModelStore = this.mViewModelStore;
        if (viewModelStore == null && (hVar = (h) getLastNonConfigurationInstance()) != null) {
            viewModelStore = hVar.f307b;
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        h hVar2 = new h();
        hVar2.f306a = objOnRetainCustomNonConfigurationInstance;
        hVar2.f307b = viewModelStore;
        return hVar2;
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    @CallSuper
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        Lifecycle lifecycle = getLifecycle();
        if (lifecycle instanceof LifecycleRegistry) {
            ((LifecycleRegistry) lifecycle).setCurrentState(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.performSave(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    @CallSuper
    public void onTrimMemory(int i10) {
        super.onTrimMemory(i10);
        Iterator<Consumer<Integer>> it = this.mOnTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(i10));
        }
    }

    @Override // androidx.activity.contextaware.ContextAware
    @Nullable
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.getF441b();
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @NonNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultRegistry activityResultRegistry, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return activityResultRegistry.register("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, activityResultContract, activityResultCallback);
    }

    @Override // androidx.core.view.MenuHost
    public void removeMenuProvider(@NonNull MenuProvider menuProvider) {
        this.mMenuHostHelper.removeMenuProvider(menuProvider);
    }

    @Override // androidx.core.content.OnConfigurationChangedProvider
    public final void removeOnConfigurationChangedListener(@NonNull Consumer<Configuration> consumer) {
        this.mOnConfigurationChangedListeners.remove(consumer);
    }

    @Override // androidx.activity.contextaware.ContextAware
    public final void removeOnContextAvailableListener(@NonNull OnContextAvailableListener onContextAvailableListener) {
        this.mContextAwareHelper.removeOnContextAvailableListener(onContextAvailableListener);
    }

    @Override // androidx.core.app.OnMultiWindowModeChangedProvider
    public final void removeOnMultiWindowModeChangedListener(@NonNull Consumer<MultiWindowModeChangedInfo> consumer) {
        this.mOnMultiWindowModeChangedListeners.remove(consumer);
    }

    @Override // androidx.core.app.OnNewIntentProvider
    public final void removeOnNewIntentListener(@NonNull Consumer<Intent> consumer) {
        this.mOnNewIntentListeners.remove(consumer);
    }

    @Override // androidx.core.app.OnPictureInPictureModeChangedProvider
    public final void removeOnPictureInPictureModeChangedListener(@NonNull Consumer<PictureInPictureModeChangedInfo> consumer) {
        this.mOnPictureInPictureModeChangedListeners.remove(consumer);
    }

    @Override // androidx.core.content.OnTrimMemoryProvider
    public final void removeOnTrimMemoryListener(@NonNull Consumer<Integer> consumer) {
        this.mOnTrimMemoryListeners.remove(consumer);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (Trace.isEnabled()) {
                Trace.beginSection("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            this.mFullyDrawnReporter.fullyDrawnReported();
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@LayoutRes int i10) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c(getWindow().getDecorView());
        super.setContentView(i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10) {
        super.startActivityForResult(intent, i10);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13);
    }

    @Override // androidx.core.view.MenuHost
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@NonNull Intent intent, int i10, @Nullable Bundle bundle) {
        super.startActivityForResult(intent, i10, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@NonNull IntentSender intentSender, int i10, @Nullable Intent intent, int i11, int i12, int i13, @Nullable Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i10, intent, i11, i12, i13, bundle);
    }

    @Override // androidx.core.view.MenuHost
    @SuppressLint({"LambdaLast"})
    public void addMenuProvider(@NonNull MenuProvider menuProvider, @NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.State state) {
        this.mMenuHostHelper.addMenuProvider(menuProvider, lifecycleOwner, state);
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onMultiWindowModeChanged(boolean z10, @NonNull Configuration configuration) {
        this.mDispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(z10, configuration);
            this.mDispatchingOnMultiWindowModeChanged = false;
            Iterator<Consumer<MultiWindowModeChangedInfo>> it = this.mOnMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new MultiWindowModeChangedInfo(z10, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnMultiWindowModeChanged = false;
            throw th2;
        }
    }

    @Override // android.app.Activity
    @RequiresApi(api = 26)
    @CallSuper
    public void onPictureInPictureModeChanged(boolean z10, @NonNull Configuration configuration) {
        this.mDispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(z10, configuration);
            this.mDispatchingOnPictureInPictureModeChanged = false;
            Iterator<Consumer<PictureInPictureModeChangedInfo>> it = this.mOnPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new PictureInPictureModeChangedInfo(z10, configuration));
            }
        } catch (Throwable th2) {
            this.mDispatchingOnPictureInPictureModeChanged = false;
            throw th2;
        }
    }

    @Override // androidx.activity.result.ActivityResultCaller
    @NonNull
    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(@NonNull ActivityResultContract<I, O> activityResultContract, @NonNull ActivityResultCallback<O> activityResultCallback) {
        return registerForActivityResult(activityResultContract, this.mActivityResultRegistry, activityResultCallback);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        this.mReportFullyDrawnExecutor.c(getWindow().getDecorView());
        super.setContentView(view, layoutParams);
    }

    @ContentView
    public ComponentActivity(@LayoutRes int i10) {
        this();
        this.mContentLayoutId = i10;
    }
}
