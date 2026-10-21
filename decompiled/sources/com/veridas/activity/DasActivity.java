package com.veridas.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.veridas.config.Configuration;
import com.veridas.config.InvalidDisplayOrientationException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayOrientation;
import com.veridas.lifecycle.DasSavedStateViewModelFactory;
import com.veridas.lifecycle.DasViewModel;
import com.veridas.lifecycle.VeridasPackageBroadcastHelper;
import com.veridas.log.Log;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class DasActivity<C extends Configuration, V extends DasViewModel<C>> extends AppCompatActivity {
    protected static final String NFC_PERMISSION = "android.permission.NFC";
    protected LinkedList<ActivityLifecycleListener> lifecycleListenerList;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public C f66543p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ArrayList f66544q0;
    protected V viewModel;

    public DasActivity() {
        DisplayOrientation displayOrientation = DisplayOrientation.LANDSCAPE;
        this.f66544q0 = new ArrayList();
        this.lifecycleListenerList = new LinkedList<>();
    }

    public static void startActivity(@NonNull Context context, @NonNull Intent intent, @NonNull Configuration configuration) {
        intent.addFlags(268435456);
        configuration.store(intent);
        context.startActivity(intent);
    }

    public void addActivityLifecycleListener(ActivityLifecycleListener activityLifecycleListener) {
        this.lifecycleListenerList.push(activityLifecycleListener);
    }

    public void broadcastIntent(@NonNull Intent intent) {
        broadcastIntent(intent, null);
    }

    public boolean checkPermission(String str) {
        try {
            String[] strArr = getPackageManager().getPackageInfo(getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String str2 : strArr) {
                    if (str2.equals(str)) {
                        return true;
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e5) {
            Log.e("DasActivity", e5);
        }
        return false;
    }

    public C getConfiguration() {
        C c10 = this.f66543p0;
        if (c10 != null) {
            return c10;
        }
        throw new NullPointerException("The configuration is null and not available before the onCreate and after onDestroy lifecycle events.");
    }

    public abstract Class<?> getConfigurationClass();

    public String getDisplayOrientationConfigurationKey() {
        return null;
    }

    public abstract Class<?> getViewModelClass();

    public void inhibitNfcPopup() {
        NfcAdapter defaultAdapter;
        if (!checkPermission(NFC_PERMISSION) || (defaultAdapter = NfcAdapter.getDefaultAdapter(this)) == null) {
            return;
        }
        defaultAdapter.enableReaderMode(this, new a(), 256, null);
    }

    public void keepScreenAutoOff() {
        Window window = getWindow();
        window.clearFlags(128);
        window.clearFlags(524288);
        window.clearFlags(4194304);
    }

    public void keepScreenAutoOn() {
        Window window = getWindow();
        window.addFlags(128);
        window.addFlags(524288);
        window.addFlags(4194304);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        V v3 = (V) new ViewModelProvider(this, new DasSavedStateViewModelFactory(this, new Bundle(), getConfigurationClass(), getResources())).get(getViewModelClass());
        this.viewModel = v3;
        this.f66543p0 = (C) v3.getConfiguration();
        this.f66543p0.load(getIntent());
        this.viewModel.setConfiguration(this.f66543p0);
        String displayOrientationConfigurationKey = getDisplayOrientationConfigurationKey();
        if (displayOrientationConfigurationKey != null) {
            try {
                this.viewModel.setDisplayOrientation(this.f66543p0.getDisplayOrientation(displayOrientationConfigurationKey));
            } catch (InvalidDisplayOrientationException e5) {
                Log.e(getClass().getSimpleName(), e5);
            } catch (PropertyNameNotFoundException e7) {
                Log.e(getClass().getSimpleName(), e7);
            }
        }
        Object[] array = this.lifecycleListenerList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((ActivityLifecycleListener) array[length]).onBeforeCreated(this, bundle);
        }
        Object[] array2 = this.lifecycleListenerList.toArray();
        for (int length2 = array2.length - 1; length2 >= 0; length2--) {
            ((ActivityLifecycleListener) array2[length2]).onCreated(this, bundle);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        Object[] array = this.lifecycleListenerList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((ActivityLifecycleListener) array[length]).onBeforeDestroyed(this);
        }
        if (Build.VERSION.SDK_INT >= 27) {
            setRequestedOrientation(3);
        }
        Object[] array2 = this.lifecycleListenerList.toArray();
        for (int length2 = array2.length - 1; length2 >= 0; length2--) {
            ((ActivityLifecycleListener) array2[length2]).onDestroyed(this);
        }
        super.onDestroy();
        this.lifecycleListenerList.clear();
        this.f66543p0 = null;
        this.viewModel = null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        Object[] array = this.lifecycleListenerList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((ActivityLifecycleListener) array[length]).onPaused(this);
        }
        unregisterBroadcastReceiver(this.f66544q0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public final void onRestart() {
        super.onRestart();
        Object[] array = this.lifecycleListenerList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((ActivityLifecycleListener) array[length]).onRestarted(this);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Object[] array = this.lifecycleListenerList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((ActivityLifecycleListener) array[length]).onResumed(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        Object[] array = this.lifecycleListenerList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((ActivityLifecycleListener) array[length]).onStarted(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        Object[] array = this.lifecycleListenerList.toArray();
        for (int length = array.length - 1; length >= 0; length--) {
            ((ActivityLifecycleListener) array[length]).onBeforeStopped(this);
        }
        super.onStop();
        Object[] array2 = this.lifecycleListenerList.toArray();
        for (int length2 = array2.length - 1; length2 >= 0; length2--) {
            ((ActivityLifecycleListener) array2[length2]).onStopped(this);
        }
    }

    public void registerBroadcastReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull IntentFilter intentFilter) {
        this.f66544q0.add(broadcastReceiver);
        VeridasPackageBroadcastHelper.INSTANCE.register(getApplicationContext(), broadcastReceiver, intentFilter);
    }

    public void removeActivityLifecycleListener(ActivityLifecycleListener activityLifecycleListener) {
        this.lifecycleListenerList.remove(activityLifecycleListener);
    }

    public void startActivityForResult(Intent intent, int i10, Configuration configuration) {
        configuration.store(intent);
        startActivityForResult(intent, i10);
    }

    public void startFragment(int i10, Fragment fragment) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        String name = fragment.getClass().getName();
        if (supportFragmentManager.popBackStackImmediate(name, 0)) {
            return;
        }
        supportFragmentManager.beginTransaction().replace(i10, fragment).addToBackStack(name).commit();
    }

    public void unregisterBroadcastReceiver(@NonNull List<BroadcastReceiver> list) {
        VeridasPackageBroadcastHelper.INSTANCE.unregister(getApplicationContext(), list);
        this.f66544q0.removeAll(list);
    }

    public void broadcastIntent(@NonNull Intent intent, @Nullable Runnable runnable) {
        VeridasPackageBroadcastHelper.INSTANCE.send(this, intent, runnable);
    }

    public void registerBroadcastReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull List<String> list) {
        this.f66544q0.add(broadcastReceiver);
        VeridasPackageBroadcastHelper.INSTANCE.register(getApplicationContext(), broadcastReceiver, list);
    }

    public void unregisterBroadcastReceiver(@NonNull BroadcastReceiver broadcastReceiver) {
        VeridasPackageBroadcastHelper.INSTANCE.unregister(getApplicationContext(), broadcastReceiver);
        this.f66544q0.remove(broadcastReceiver);
    }

    public static void startActivity(@NonNull Context context, @NonNull Class<?> cls, @NonNull Configuration configuration) {
        startActivity(context, new Intent(context, cls), configuration);
    }

    public void registerBroadcastReceiver(@NonNull BroadcastReceiver broadcastReceiver, @NonNull String str) {
        this.f66544q0.add(broadcastReceiver);
        VeridasPackageBroadcastHelper.INSTANCE.register(getApplicationContext(), broadcastReceiver, str);
    }

    public class a implements NfcAdapter.ReaderCallback {
        @Override // android.nfc.NfcAdapter.ReaderCallback
        public final void onTagDiscovered(Tag tag) {
        }
    }
}
