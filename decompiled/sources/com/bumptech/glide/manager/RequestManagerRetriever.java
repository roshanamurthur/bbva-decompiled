package com.bumptech.glide.manager;

import android.R;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.z;
import androidx.collection.ArrayMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;
import com.bumptech.glide.load.resource.bitmap.HardwareConfigState;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public class RequestManagerRetriever implements Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f38694f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile RequestManager f38695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RequestManagerFactory f38696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayMap<View, Fragment> f38697c = new ArrayMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zc.d f38698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f38699e;

    public interface RequestManagerFactory {
        @NonNull
        RequestManager build(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context);
    }

    public class a implements RequestManagerFactory {
        @Override // com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory
        @NonNull
        public final RequestManager build(@NonNull Glide glide, @NonNull Lifecycle lifecycle, @NonNull RequestManagerTreeNode requestManagerTreeNode, @NonNull Context context) {
            return new RequestManager(glide, lifecycle, requestManagerTreeNode, context);
        }
    }

    public RequestManagerRetriever(@Nullable RequestManagerFactory requestManagerFactory) {
        requestManagerFactory = requestManagerFactory == null ? f38694f : requestManagerFactory;
        this.f38696b = requestManagerFactory;
        this.f38699e = new b(requestManagerFactory);
        this.f38698d = (HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED && HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED) ? new zc.c() : new z();
    }

    @Nullable
    public static Activity a(@NonNull Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return a(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static void b(@NonNull ArrayMap arrayMap, @Nullable List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Fragment fragment = (Fragment) it.next();
            if (fragment != null && fragment.getView() != null) {
                arrayMap.put(fragment.getView(), fragment);
                b(arrayMap, fragment.getChildFragmentManager().getFragments());
            }
        }
    }

    @NonNull
    public RequestManager get(@NonNull Context context) {
        if (context == null) {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (Util.isOnMainThread() && !(context instanceof Application)) {
            if (context instanceof FragmentActivity) {
                return get((FragmentActivity) context);
            }
            if (context instanceof ContextWrapper) {
                ContextWrapper contextWrapper = (ContextWrapper) context;
                if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                    return get(contextWrapper.getBaseContext());
                }
            }
        }
        if (this.f38695a == null) {
            synchronized (this) {
                try {
                    if (this.f38695a == null) {
                        this.f38695a = this.f38696b.build(Glide.get(context.getApplicationContext()), new zc.a(), new zc.b(), context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f38695a;
    }

    @Override // android.os.Handler.Callback
    @Deprecated
    public boolean handleMessage(Message message) {
        return false;
    }

    @NonNull
    public RequestManager get(@NonNull FragmentActivity fragmentActivity) {
        if (Util.isOnBackgroundThread()) {
            return get(fragmentActivity.getApplicationContext());
        }
        if (!fragmentActivity.isDestroyed()) {
            this.f38698d.a(fragmentActivity);
            Activity activityA = a(fragmentActivity);
            return this.f38699e.a(fragmentActivity, Glide.get(fragmentActivity.getApplicationContext()), fragmentActivity.getLifecycle(), fragmentActivity.getSupportFragmentManager(), activityA == null || !activityA.isFinishing());
        }
        throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
    }

    @NonNull
    public RequestManager get(@NonNull Fragment fragment) {
        Preconditions.checkNotNull(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (Util.isOnBackgroundThread()) {
            return get(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f38698d.a(fragment.getActivity());
        }
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f38699e.a(context, Glide.get(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    @NonNull
    @Deprecated
    public RequestManager get(@NonNull Activity activity) {
        return get(activity.getApplicationContext());
    }

    @NonNull
    public RequestManager get(@NonNull View view) {
        if (Util.isOnBackgroundThread()) {
            return get(view.getContext().getApplicationContext());
        }
        Preconditions.checkNotNull(view);
        Preconditions.checkNotNull(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = a(view.getContext());
        if (activityA == null) {
            return get(view.getContext().getApplicationContext());
        }
        if (activityA instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activityA;
            ArrayMap<View, Fragment> arrayMap = this.f38697c;
            arrayMap.clear();
            b(arrayMap, fragmentActivity.getSupportFragmentManager().getFragments());
            View viewFindViewById = fragmentActivity.findViewById(R.id.content);
            Fragment fragment = null;
            while (!view.equals(viewFindViewById) && (fragment = arrayMap.get(view)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            arrayMap.clear();
            return fragment != null ? get(fragment) : get(fragmentActivity);
        }
        return get(view.getContext().getApplicationContext());
    }

    @NonNull
    @TargetApi(17)
    @Deprecated
    public RequestManager get(@NonNull android.app.Fragment fragment) {
        if (fragment.getActivity() != null) {
            return get(fragment.getActivity().getApplicationContext());
        }
        throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
    }
}
