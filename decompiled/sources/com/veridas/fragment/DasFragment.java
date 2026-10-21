package com.veridas.fragment;

import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.budiyev.android.codescanner.BarcodeUtils;
import com.veridas.config.Configuration;
import com.veridas.dialog.ConcreteDialogRegistry;
import com.veridas.dialog.ConcretePopupWindowRegistry;
import com.veridas.dialog.DialogRegistry;
import com.veridas.dialog.PopupWindowRegistry;
import com.veridas.display.DisplayUtils;
import com.veridas.lifecycle.DasSavedStateViewModelFactory;
import com.veridas.lifecycle.DasViewModel;
import com.veridas.lifecycle.VeridasPackageBroadcastHelper;
import com.veridas.log.Log;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes11.dex */
public abstract class DasFragment<C extends Configuration, V extends DasViewModel<C>> extends Fragment {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C f67130p0;
    protected V viewModel;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final LinkedList<FragmentExceptionListener> f67131q0 = new LinkedList<>();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LinkedList<FragmentLifecycleListener> f67132r0 = new LinkedList<>();
    protected DialogRegistry dialogRegistry = new ConcreteDialogRegistry();
    protected PopupWindowRegistry popupWindowRegistry = new ConcretePopupWindowRegistry();

    public void addExceptionListener(FragmentExceptionListener fragmentExceptionListener) {
        this.f67131q0.push(fragmentExceptionListener);
    }

    public void addLifecycleListener(FragmentLifecycleListener fragmentLifecycleListener) {
        this.f67132r0.push(fragmentLifecycleListener);
    }

    public void broadcastIntent(@NonNull Intent intent) {
        broadcastIntent(intent, null);
    }

    public void fireOnException(Throwable th2) {
        Object[] array = this.f67131q0.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((FragmentExceptionListener) array[length]).onException(this, th2);
        }
    }

    public C getConfiguration() {
        C c10 = this.f67130p0;
        if (c10 != null) {
            return c10;
        }
        throw new NullPointerException("The configuration is null and not available before the onCreate and after onDestroy lifecycle events.");
    }

    public abstract Class<C> getConfigurationClass();

    public Point getDisplaySize() {
        return DisplayUtils.getSize(DisplayUtils.getDefaultDisplay(getActivity().getApplicationContext()), this.viewModel.getDisplayOrientation());
    }

    public int getNavBarHeight() {
        return DisplayUtils.getNavBarHeight(DisplayUtils.getDefaultDisplay(getActivity().getApplicationContext()));
    }

    public int getSurfaceRotation() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            throw new NullPointerException("Activity is null.");
        }
        WindowManager windowManager = activity.getWindowManager();
        if (windowManager == null) {
            throw new NullPointerException("Window manager is null.");
        }
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay != null) {
            return defaultDisplay.getRotation();
        }
        throw new NullPointerException("Display is null.");
    }

    public int getSurfaceRotationInDegrees() {
        int surfaceRotation = getSurfaceRotation();
        if (surfaceRotation == 0) {
            return 0;
        }
        if (surfaceRotation == 1) {
            return 90;
        }
        if (surfaceRotation == 2) {
            return 180;
        }
        if (surfaceRotation != 3) {
            return 0;
        }
        return BarcodeUtils.ROTATION_270;
    }

    public abstract Class<V> getViewModelClass();

    @Override // androidx.fragment.app.Fragment
    @Deprecated
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        Object[] array = this.f67132r0.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((FragmentLifecycleListener) array[length]).onActivityCreated(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Object[] array = this.f67132r0.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((FragmentLifecycleListener) array[length]).onAttached(this, context);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        V v3 = (V) new ViewModelProvider(fragmentActivityRequireActivity, new DasSavedStateViewModelFactory(fragmentActivityRequireActivity, new Bundle(), getConfigurationClass(), getResources())).get(getViewModelClass());
        this.viewModel = v3;
        this.f67130p0 = (C) v3.getConfiguration();
        this.f67130p0.load(getActivity().getIntent());
        this.viewModel.setConfiguration(this.f67130p0);
        LinkedList<FragmentLifecycleListener> linkedList = this.f67132r0;
        Object[] array = linkedList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((FragmentLifecycleListener) array[length]).onBeforeCreated(this, bundle);
        }
        Object[] array2 = linkedList.toArray();
        for (int length2 = array2.length - 1; length2 >= 0; length2--) {
            ((FragmentLifecycleListener) array2[length2]).onCreated(this, bundle);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        LinkedList<FragmentLifecycleListener> linkedList = this.f67132r0;
        Object[] array = linkedList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((FragmentLifecycleListener) array[length]).onBeforeDestroyed(this);
        }
        super.onDestroy();
        Object[] array2 = linkedList.toArray();
        for (int length2 = array2.length - 1; length2 >= 0; length2--) {
            ((FragmentLifecycleListener) array2[length2]).onDestroyed(this);
        }
        linkedList.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        Object[] array = this.f67132r0.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((FragmentLifecycleListener) array[length]).onDetached(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        this.dialogRegistry.discard();
        this.popupWindowRegistry.discard();
        super.onPause();
        LinkedList<FragmentLifecycleListener> linkedList = this.f67132r0;
        Object[] array = linkedList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((FragmentLifecycleListener) array[length]).onBeforePaused(this);
        }
        Object[] array2 = linkedList.toArray();
        for (int length2 = array2.length - 1; length2 >= 0; length2--) {
            ((FragmentLifecycleListener) array2[length2]).onPaused(this);
        }
        Object[] array3 = linkedList.toArray();
        for (int length3 = array3.length - 1; length3 >= 0; length3--) {
            ((FragmentLifecycleListener) array3[length3]).onAfterPaused(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        LinkedList<FragmentLifecycleListener> linkedList = this.f67132r0;
        Object[] array = linkedList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((FragmentLifecycleListener) array[length]).onBeforeResumed(this);
        }
        Object[] array2 = linkedList.toArray();
        for (int length2 = array2.length - 1; length2 >= 0; length2--) {
            ((FragmentLifecycleListener) array2[length2]).onResumed(this);
        }
        Object[] array3 = linkedList.toArray();
        for (int length3 = array3.length - 1; length3 >= 0; length3--) {
            ((FragmentLifecycleListener) array3[length3]).onAfterResumed(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        Object[] array = this.f67132r0.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((FragmentLifecycleListener) array[length]).onStarted(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        LinkedList<FragmentLifecycleListener> linkedList = this.f67132r0;
        Object[] array = linkedList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((FragmentLifecycleListener) array[length]).onBeforeStopped(this);
        }
        super.onStop();
        Object[] array2 = linkedList.toArray();
        for (int length2 = array2.length - 1; length2 >= 0; length2--) {
            ((FragmentLifecycleListener) array2[length2]).onStopped(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }

    public void removeExceptionListener(FragmentExceptionListener fragmentExceptionListener) {
        this.f67131q0.remove(fragmentExceptionListener);
    }

    public void removeLifecycleListener(FragmentLifecycleListener fragmentLifecycleListener) {
        this.f67132r0.remove(fragmentLifecycleListener);
    }

    public final void runOnUiThread(Runnable runnable) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else {
            Log.w("DasFragment", "Intent to run a runnable on the activity while the activity does (no longer) exist.");
        }
    }

    public void broadcastIntent(@NonNull Intent intent, @Nullable Runnable runnable) {
        VeridasPackageBroadcastHelper.INSTANCE.send(requireActivity(), intent, runnable);
    }
}
