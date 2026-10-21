package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.IdRes;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.h0;
import androidx.fragment.R;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryOwner;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public abstract class FragmentManager implements FragmentResultOwner {
    public static boolean M = false;
    public static final int POP_BACK_STACK_INCLUSIVE = 1;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String TAG = "FragmentManager";
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public ArrayList<androidx.fragment.app.b> G;
    public ArrayList<Boolean> H;
    public ArrayList<Fragment> I;
    public t J;
    public FragmentStrictMode.Policy K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f21527b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ArrayList<androidx.fragment.app.b> f21529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList<Fragment> f21530e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public OnBackPressedDispatcher f21532g;
    public ArrayList<OnBackStackChangedListener> m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public FragmentHostCallback<?> f21541q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public FragmentContainer f21542r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Fragment f21543s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public Fragment f21544t;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ActivityResultLauncher<Intent> f21548x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ActivityResultLauncher<IntentSenderRequest> f21549y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ActivityResultLauncher<String[]> f21550z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<m> f21526a = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f21528c = new v();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.fragment.app.p f21531f = new androidx.fragment.app.p(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a f21533h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicInteger f21534i = new AtomicInteger();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map<String, BackStackState> f21535j = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map<String, Bundle> f21536k = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Map<String, l> f21537l = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final q f21538n = new q(this);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CopyOnWriteArrayList<FragmentOnAttachListener> f21539o = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21540p = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public FragmentFactory f21545u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final b f21546v = new b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final c f21547w = new c();
    public ArrayDeque<LaunchedFragmentInfo> A = new ArrayDeque<>();
    public final d L = new d();

    public interface BackStackEntry {
        @Nullable
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @StringRes
        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Nullable
        @Deprecated
        CharSequence getBreadCrumbTitle();

        @StringRes
        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @Nullable
        String getName();
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f21551p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f21552q0;

        public class a implements Parcelable.Creator<LaunchedFragmentInfo> {
            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                LaunchedFragmentInfo launchedFragmentInfo = new LaunchedFragmentInfo();
                launchedFragmentInfo.f21551p0 = parcel.readString();
                launchedFragmentInfo.f21552q0 = parcel.readInt();
                return launchedFragmentInfo;
            }

            @Override // android.os.Parcelable.Creator
            public final LaunchedFragmentInfo[] newArray(int i10) {
                return new LaunchedFragmentInfo[i10];
            }
        }

        public LaunchedFragmentInfo(@NonNull String str, int i10) {
            this.f21551p0 = str;
            this.f21552q0 = i10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f21551p0);
            parcel.writeInt(this.f21552q0);
        }
    }

    public interface OnBackStackChangedListener {
        @MainThread
        void onBackStackChanged();
    }

    public class a extends OnBackPressedCallback {
        public a() {
            super(false);
        }

        @Override // androidx.activity.OnBackPressedCallback
        public final void handleOnBackPressed() {
            FragmentManager fragmentManager = FragmentManager.this;
            fragmentManager.s(true);
            if (fragmentManager.f21533h.getIsEnabled()) {
                fragmentManager.popBackStackImmediate();
            } else {
                fragmentManager.f21532g.onBackPressed();
            }
        }
    }

    public class b extends FragmentFactory {
        public b() {
        }

        @Override // androidx.fragment.app.FragmentFactory
        @NonNull
        public final Fragment instantiate(@NonNull ClassLoader classLoader, @NonNull String str) {
            FragmentManager fragmentManager = FragmentManager.this;
            return fragmentManager.getHost().instantiate(fragmentManager.getHost().f21522q0, str, null);
        }
    }

    public class c implements c0 {
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            FragmentManager.this.s(true);
        }
    }

    public class e implements LifecycleEventObserver {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f21556p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ FragmentResultListener f21557q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f21558r0;

        public e(String str, FragmentResultListener fragmentResultListener, Lifecycle lifecycle) {
            this.f21556p0 = str;
            this.f21557q0 = fragmentResultListener;
            this.f21558r0 = lifecycle;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
            Bundle bundle;
            Lifecycle.Event event2 = Lifecycle.Event.ON_START;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.f21556p0;
            if (event == event2 && (bundle = fragmentManager.f21536k.get(str)) != null) {
                this.f21557q0.onFragmentResult(str, bundle);
                fragmentManager.clearFragmentResult(str);
            }
            if (event == Lifecycle.Event.ON_DESTROY) {
                this.f21558r0.removeObserver(this);
                fragmentManager.f21537l.remove(str);
            }
        }
    }

    public class f implements FragmentOnAttachListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Fragment f21560p0;

        public f(Fragment fragment) {
            this.f21560p0 = fragment;
        }

        @Override // androidx.fragment.app.FragmentOnAttachListener
        public final void onAttachFragment(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
            this.f21560p0.onAttachFragment(fragment);
        }
    }

    public class g implements ActivityResultCallback<ActivityResult> {
        public g() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.A.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w(FragmentManager.TAG, "No Activities were started for result for " + this);
                return;
            }
            v vVar = fragmentManager.f21528c;
            String str = launchedFragmentInfoPollFirst.f21551p0;
            Fragment fragmentC = vVar.c(str);
            if (fragmentC == null) {
                Log.w(FragmentManager.TAG, "Activity result delivered for unknown Fragment " + str);
            } else {
                fragmentC.onActivityResult(launchedFragmentInfoPollFirst.f21552q0, activityResult2.getResultCode(), activityResult2.getData());
            }
        }
    }

    public class h implements ActivityResultCallback<ActivityResult> {
        public h() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final void onActivityResult(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.A.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w(FragmentManager.TAG, "No IntentSenders were started for " + this);
                return;
            }
            v vVar = fragmentManager.f21528c;
            String str = launchedFragmentInfoPollFirst.f21551p0;
            Fragment fragmentC = vVar.c(str);
            if (fragmentC == null) {
                Log.w(FragmentManager.TAG, "Intent Sender result delivered for unknown Fragment " + str);
            } else {
                fragmentC.onActivityResult(launchedFragmentInfoPollFirst.f21552q0, activityResult2.getResultCode(), activityResult2.getData());
            }
        }
    }

    public class i implements ActivityResultCallback<Map<String, Boolean>> {
        public i() {
        }

        @Override // androidx.activity.result.ActivityResultCallback
        @SuppressLint({"SyntheticAccessor"})
        public final void onActivityResult(Map<String, Boolean> map) {
            Map<String, Boolean> map2 = map;
            String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map2.values());
            int[] iArr = new int[arrayList.size()];
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
            }
            FragmentManager fragmentManager = FragmentManager.this;
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = fragmentManager.A.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w(FragmentManager.TAG, "No permissions were requested for " + this);
                return;
            }
            v vVar = fragmentManager.f21528c;
            String str = launchedFragmentInfoPollFirst.f21551p0;
            Fragment fragmentC = vVar.c(str);
            if (fragmentC != null) {
                fragmentC.onRequestPermissionsResult(launchedFragmentInfoPollFirst.f21552q0, strArr, iArr);
                return;
            }
            Log.w(FragmentManager.TAG, "Permission request result delivered for unknown Fragment " + str);
        }
    }

    public class j implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21564a;

        public j(String str) {
            this.f21564a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final boolean a(@NonNull ArrayList<androidx.fragment.app.b> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            String str = this.f21564a;
            FragmentManager fragmentManager = FragmentManager.this;
            if (fragmentManager.I(arrayList, arrayList2, str)) {
                return fragmentManager.F(arrayList, arrayList2, str, -1, 1);
            }
            return false;
        }
    }

    public static class k extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public final Intent createIntent(@NonNull Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            IntentSenderRequest intentSenderRequestBuild = intentSenderRequest;
            Intent intent = new Intent(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST);
            Intent fillInIntent = intentSenderRequestBuild.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) != null) {
                intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundleExtra);
                fillInIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                if (fillInIntent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                    intentSenderRequestBuild = new IntentSenderRequest.Builder(intentSenderRequestBuild.getIntentSender()).setFillInIntent(null).setFlags(intentSenderRequestBuild.getFlagsValues(), intentSenderRequestBuild.getFlagsMask()).build();
                }
            }
            intent.putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, intentSenderRequestBuild);
            if (FragmentManager.isLoggingEnabled(2)) {
                intent.toString();
            }
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        @NonNull
        public final ActivityResult parseResult(int i10, @Nullable Intent intent) {
            return new ActivityResult(i10, intent);
        }
    }

    public static class l implements FragmentResultListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final Lifecycle f21566p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final FragmentResultListener f21567q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final LifecycleEventObserver f21568r0;

        public l(@NonNull Lifecycle lifecycle, @NonNull FragmentResultListener fragmentResultListener, @NonNull e eVar) {
            this.f21566p0 = lifecycle;
            this.f21567q0 = fragmentResultListener;
            this.f21568r0 = eVar;
        }

        @Override // androidx.fragment.app.FragmentResultListener
        public final void onFragmentResult(@NonNull String str, @NonNull Bundle bundle) {
            this.f21567q0.onFragmentResult(str, bundle);
        }
    }

    public interface m {
        boolean a(@NonNull ArrayList<androidx.fragment.app.b> arrayList, @NonNull ArrayList<Boolean> arrayList2);
    }

    public class n implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f21570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f21571c;

        public n(String str, int i10, int i11) {
            this.f21569a = str;
            this.f21570b = i10;
            this.f21571c = i11;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final boolean a(@NonNull ArrayList<androidx.fragment.app.b> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f21544t;
            if (fragment == null || this.f21570b >= 0 || this.f21569a != null || !fragment.getChildFragmentManager().popBackStackImmediate()) {
                return FragmentManager.this.F(arrayList, arrayList2, this.f21569a, this.f21570b, this.f21571c);
            }
            return false;
        }
    }

    public class o implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21573a;

        public o(String str) {
            this.f21573a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final boolean a(@NonNull ArrayList<androidx.fragment.app.b> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            return FragmentManager.this.I(arrayList, arrayList2, this.f21573a);
        }
    }

    public class p implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f21575a;

        public p(String str) {
            this.f21575a = str;
        }

        @Override // androidx.fragment.app.FragmentManager.m
        public final boolean a(@NonNull ArrayList<androidx.fragment.app.b> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
            int i10;
            FragmentManager fragmentManager = FragmentManager.this;
            String str = this.f21575a;
            int iV = fragmentManager.v(-1, str, true);
            if (iV < 0) {
                return false;
            }
            for (int i11 = iV; i11 < fragmentManager.f21529d.size(); i11++) {
                androidx.fragment.app.b bVar = fragmentManager.f21529d.get(i11);
                if (!bVar.f21639r) {
                    fragmentManager.Q(new IllegalArgumentException("saveBackStack(\"" + str + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + bVar + " that did not use setReorderingAllowed(true)."));
                    throw null;
                }
            }
            HashSet hashSet = new HashSet();
            int i12 = iV;
            while (true) {
                int i13 = 2;
                if (i12 >= fragmentManager.f21529d.size()) {
                    ArrayDeque arrayDeque = new ArrayDeque(hashSet);
                    while (!arrayDeque.isEmpty()) {
                        Fragment fragment = (Fragment) arrayDeque.removeFirst();
                        if (fragment.mRetainInstance) {
                            StringBuilder sbD = ci.a.d("saveBackStack(\"", str, "\") must not contain retained fragments. Found ");
                            sbD.append(hashSet.contains(fragment) ? "direct reference to retained " : "retained child ");
                            sbD.append("fragment ");
                            sbD.append(fragment);
                            fragmentManager.Q(new IllegalArgumentException(sbD.toString()));
                            throw null;
                        }
                        for (Fragment fragment2 : fragment.mChildFragmentManager.f21528c.e()) {
                            if (fragment2 != null) {
                                arrayDeque.addLast(fragment2);
                            }
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((Fragment) it.next()).mWho);
                    }
                    ArrayList arrayList4 = new ArrayList(fragmentManager.f21529d.size() - iV);
                    for (int i14 = iV; i14 < fragmentManager.f21529d.size(); i14++) {
                        arrayList4.add(null);
                    }
                    BackStackState backStackState = new BackStackState(arrayList3, arrayList4);
                    for (int size = fragmentManager.f21529d.size() - 1; size >= iV; size--) {
                        androidx.fragment.app.b bVarRemove = fragmentManager.f21529d.remove(size);
                        androidx.fragment.app.b bVar2 = new androidx.fragment.app.b(bVarRemove);
                        ArrayList<FragmentTransaction.a> arrayList5 = bVar2.f21625c;
                        int size2 = arrayList5.size() - 1;
                        while (size2 >= 0) {
                            FragmentTransaction.a aVar = arrayList5.get(size2);
                            if (aVar.f21643c) {
                                if (aVar.f21641a == 8) {
                                    aVar.f21643c = false;
                                    arrayList5.remove(size2 - 1);
                                    size2--;
                                } else {
                                    int i15 = aVar.f21642b.mContainerId;
                                    aVar.f21641a = 2;
                                    aVar.f21643c = false;
                                    for (int i16 = size2 - 1; i16 >= 0; i16--) {
                                        FragmentTransaction.a aVar2 = arrayList5.get(i16);
                                        if (aVar2.f21643c && aVar2.f21642b.mContainerId == i15) {
                                            arrayList5.remove(i16);
                                            size2--;
                                        }
                                    }
                                }
                            }
                            size2--;
                        }
                        arrayList4.set(size - iV, new BackStackRecordState(bVar2));
                        bVarRemove.f21672w = true;
                        arrayList.add(bVarRemove);
                        arrayList2.add(Boolean.TRUE);
                    }
                    fragmentManager.f21535j.put(str, backStackState);
                    return true;
                }
                androidx.fragment.app.b bVar3 = fragmentManager.f21529d.get(i12);
                HashSet hashSet2 = new HashSet();
                HashSet hashSet3 = new HashSet();
                for (FragmentTransaction.a aVar3 : bVar3.f21625c) {
                    Fragment fragment3 = aVar3.f21642b;
                    if (fragment3 != null) {
                        if (!aVar3.f21643c || (i10 = aVar3.f21641a) == 1 || i10 == i13 || i10 == 8) {
                            hashSet.add(fragment3);
                            hashSet2.add(fragment3);
                        }
                        int i17 = aVar3.f21641a;
                        if (i17 == 1 || i17 == 2) {
                            hashSet3.add(fragment3);
                        }
                        i13 = 2;
                    }
                }
                hashSet2.removeAll(hashSet3);
                if (!hashSet2.isEmpty()) {
                    StringBuilder sbD2 = ci.a.d("saveBackStack(\"", str, "\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                    sbD2.append(hashSet2.size() == 1 ? " " + hashSet2.iterator().next() : "s " + hashSet2);
                    sbD2.append(" in ");
                    sbD2.append(bVar3);
                    sbD2.append(" that were previously added to the FragmentManager through a separate FragmentTransaction.");
                    fragmentManager.Q(new IllegalArgumentException(sbD2.toString()));
                    throw null;
                }
                i12++;
            }
        }
    }

    public static boolean A(@Nullable Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.getPrimaryNavigationFragment()) && A(fragmentManager.f21543s);
    }

    @Deprecated
    public static void enableDebugLogging(boolean z10) {
        M = z10;
    }

    @NonNull
    public static <F extends Fragment> F findFragment(@NonNull View view) {
        F f6;
        View view2 = view;
        while (true) {
            f6 = null;
            if (view2 == null) {
                break;
            }
            Object tag = view2.getTag(R.id.fragment_container_view_tag);
            Fragment fragment = tag instanceof Fragment ? (Fragment) tag : null;
            if (fragment != null) {
                f6 = (F) fragment;
                break;
            }
            Object parent = view2.getParent();
            view2 = parent instanceof View ? (View) parent : null;
        }
        if (f6 != null) {
            return f6;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static boolean isLoggingEnabled(int i10) {
        return M || Log.isLoggable(TAG, i10);
    }

    public static boolean z(@NonNull Fragment fragment) {
        if (!fragment.mHasMenu || !fragment.mMenuVisible) {
            boolean z10 = false;
            for (Fragment fragment2 : fragment.mChildFragmentManager.f21528c.e()) {
                if (fragment2 != null) {
                    z10 = z(fragment2);
                }
                if (z10) {
                }
            }
            return false;
        }
        return true;
    }

    public final void B(int i10, boolean z10) {
        HashMap<String, u> map;
        FragmentHostCallback<?> fragmentHostCallback;
        if (this.f21541q == null && i10 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z10 || i10 != this.f21540p) {
            this.f21540p = i10;
            v vVar = this.f21528c;
            Iterator<Fragment> it = vVar.f21776a.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                map = vVar.f21777b;
                if (!zHasNext) {
                    break;
                }
                u uVar = map.get(it.next().mWho);
                if (uVar != null) {
                    uVar.i();
                }
            }
            for (u uVar2 : map.values()) {
                if (uVar2 != null) {
                    uVar2.i();
                    Fragment fragment = uVar2.f21771c;
                    if (fragment.mRemoving && !fragment.isInBackStack()) {
                        if (fragment.mBeingSaved && !vVar.f21778c.containsKey(fragment.mWho)) {
                            uVar2.m();
                        }
                        vVar.h(uVar2);
                    }
                }
            }
            for (u uVar3 : vVar.d()) {
                Fragment fragment2 = uVar3.f21771c;
                if (fragment2.mDeferStart) {
                    if (this.f21527b) {
                        this.F = true;
                    } else {
                        fragment2.mDeferStart = false;
                        uVar3.i();
                    }
                }
            }
            if (this.B && (fragmentHostCallback = this.f21541q) != null && this.f21540p == 7) {
                fragmentHostCallback.onSupportInvalidateOptionsMenu();
                this.B = false;
            }
        }
    }

    public final void C() {
        if (this.f21541q == null) {
            return;
        }
        this.C = false;
        this.D = false;
        this.J.v0 = false;
        for (Fragment fragment : this.f21528c.f()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    public final void D(int i10, int i11, boolean z10) {
        if (i10 < 0) {
            throw new IllegalArgumentException(g0.c("Bad id: ", i10));
        }
        q(new n(null, i10, i11), z10);
    }

    public final boolean E(int i10, int i11, @Nullable String str) {
        s(false);
        r(true);
        Fragment fragment = this.f21544t;
        if (fragment != null && i10 < 0 && str == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean zF = F(this.G, this.H, str, i10, i11);
        if (zF) {
            this.f21527b = true;
            try {
                H(this.G, this.H);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        R();
        boolean z10 = this.F;
        v vVar = this.f21528c;
        if (z10) {
            this.F = false;
            for (u uVar : vVar.d()) {
                Fragment fragment2 = uVar.f21771c;
                if (fragment2.mDeferStart) {
                    if (this.f21527b) {
                        this.F = true;
                    } else {
                        fragment2.mDeferStart = false;
                        uVar.i();
                    }
                }
            }
        }
        vVar.f21777b.values().removeAll(Collections.singleton(null));
        return zF;
    }

    public final boolean F(@NonNull ArrayList<androidx.fragment.app.b> arrayList, @NonNull ArrayList<Boolean> arrayList2, @Nullable String str, int i10, int i11) {
        int iV = v(i10, str, (i11 & 1) != 0);
        if (iV < 0) {
            return false;
        }
        for (int size = this.f21529d.size() - 1; size >= iV; size--) {
            arrayList.add(this.f21529d.remove(size));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void G(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Objects.toString(fragment);
        }
        boolean z10 = !fragment.isInBackStack();
        if (!fragment.mDetached || z10) {
            v vVar = this.f21528c;
            synchronized (vVar.f21776a) {
                vVar.f21776a.remove(fragment);
            }
            fragment.mAdded = false;
            if (z(fragment)) {
                this.B = true;
            }
            fragment.mRemoving = true;
            P(fragment);
        }
    }

    public final void H(@NonNull ArrayList<androidx.fragment.app.b> arrayList, @NonNull ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            if (!arrayList.get(i10).f21639r) {
                if (i11 != i10) {
                    u(arrayList, arrayList2, i11, i10);
                }
                i11 = i10 + 1;
                if (arrayList2.get(i10).booleanValue()) {
                    while (i11 < size && arrayList2.get(i11).booleanValue() && !arrayList.get(i11).f21639r) {
                        i11++;
                    }
                }
                u(arrayList, arrayList2, i10, i11);
                i10 = i11 - 1;
            }
            i10++;
        }
        if (i11 != size) {
            u(arrayList, arrayList2, i11, size);
        }
    }

    public final boolean I(@NonNull ArrayList<androidx.fragment.app.b> arrayList, @NonNull ArrayList<Boolean> arrayList2, @NonNull String str) {
        BackStackState backStackStateRemove = this.f21535j.remove(str);
        boolean z10 = false;
        if (backStackStateRemove == null) {
            return false;
        }
        HashMap map = new HashMap();
        for (androidx.fragment.app.b bVar : arrayList) {
            if (bVar.f21672w) {
                Iterator<FragmentTransaction.a> it = bVar.f21625c.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f21642b;
                    if (fragment != null) {
                        map.put(fragment.mWho, fragment);
                    }
                }
            }
        }
        List<String> list = backStackStateRemove.f21471p0;
        HashMap map2 = new HashMap(list.size());
        for (String str2 : list) {
            Fragment fragment2 = (Fragment) map.get(str2);
            if (fragment2 != null) {
                map2.put(fragment2.mWho, fragment2);
            } else {
                FragmentState fragmentStateI = this.f21528c.i(str2, null);
                if (fragmentStateI != null) {
                    Fragment fragmentA = fragmentStateI.a(getFragmentFactory(), getHost().f21522q0.getClassLoader());
                    map2.put(fragmentA.mWho, fragmentA);
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (BackStackRecordState backStackRecordState : backStackStateRemove.f21472q0) {
            backStackRecordState.getClass();
            androidx.fragment.app.b bVar2 = new androidx.fragment.app.b(this);
            backStackRecordState.a(bVar2);
            int i10 = 0;
            while (true) {
                ArrayList<String> arrayList4 = backStackRecordState.f21463q0;
                if (i10 < arrayList4.size()) {
                    String str3 = arrayList4.get(i10);
                    if (str3 != null) {
                        Fragment fragment3 = (Fragment) map2.get(str3);
                        if (fragment3 == null) {
                            throw new IllegalStateException(androidx.camera.core.impl.utils.c.b(new StringBuilder("Restoring FragmentTransaction "), backStackRecordState.f21467u0, " failed due to missing saved state for Fragment (", str3, ")"));
                        }
                        bVar2.f21625c.get(i10).f21642b = fragment3;
                    }
                    i10++;
                }
            }
            arrayList3.add(bVar2);
        }
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            ((androidx.fragment.app.b) it2.next()).a(arrayList, arrayList2);
            z10 = true;
        }
        return z10;
    }

    public final void J(@Nullable Parcelable parcelable) {
        FragmentManagerState fragmentManagerState;
        ArrayList<FragmentState> arrayList;
        q qVar;
        u uVar;
        if (parcelable == null || (arrayList = (fragmentManagerState = (FragmentManagerState) parcelable).f21580p0) == null) {
            return;
        }
        v vVar = this.f21528c;
        HashMap<String, FragmentState> map = vVar.f21778c;
        map.clear();
        for (FragmentState fragmentState : arrayList) {
            map.put(fragmentState.f21595q0, fragmentState);
        }
        HashMap<String, u> map2 = vVar.f21777b;
        map2.clear();
        Iterator<String> it = fragmentManagerState.f21581q0.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            qVar = this.f21538n;
            if (!zHasNext) {
                break;
            }
            FragmentState fragmentStateI = vVar.i(it.next(), null);
            if (fragmentStateI != null) {
                Fragment fragment = this.J.f21763p0.get(fragmentStateI.f21595q0);
                if (fragment != null) {
                    if (isLoggingEnabled(2)) {
                        fragment.toString();
                    }
                    uVar = new u(qVar, vVar, fragment, fragmentStateI);
                } else {
                    uVar = new u(this.f21538n, this.f21528c, this.f21541q.f21522q0.getClassLoader(), getFragmentFactory(), fragmentStateI);
                }
                Fragment fragment2 = uVar.f21771c;
                fragment2.mFragmentManager = this;
                if (isLoggingEnabled(2)) {
                    fragment2.toString();
                }
                uVar.j(this.f21541q.f21522q0.getClassLoader());
                vVar.g(uVar);
                uVar.f21773e = this.f21540p;
            }
        }
        t tVar = this.J;
        tVar.getClass();
        for (Fragment fragment3 : new ArrayList(tVar.f21763p0.values())) {
            if (map2.get(fragment3.mWho) == null) {
                if (isLoggingEnabled(2)) {
                    fragment3.toString();
                    Objects.toString(fragmentManagerState.f21581q0);
                }
                this.J.d(fragment3);
                fragment3.mFragmentManager = this;
                u uVar2 = new u(qVar, vVar, fragment3);
                uVar2.f21773e = 1;
                uVar2.i();
                fragment3.mRemoving = true;
                uVar2.i();
            }
        }
        ArrayList<String> arrayList2 = fragmentManagerState.f21582r0;
        vVar.f21776a.clear();
        if (arrayList2 != null) {
            for (String str : arrayList2) {
                Fragment fragmentB = vVar.b(str);
                if (fragmentB == null) {
                    throw new IllegalStateException(h0.b("No instantiated fragment for (", str, ")"));
                }
                if (isLoggingEnabled(2)) {
                    fragmentB.toString();
                }
                vVar.a(fragmentB);
            }
        }
        if (fragmentManagerState.f21583s0 != null) {
            this.f21529d = new ArrayList<>(fragmentManagerState.f21583s0.length);
            int i10 = 0;
            while (true) {
                BackStackRecordState[] backStackRecordStateArr = fragmentManagerState.f21583s0;
                if (i10 >= backStackRecordStateArr.length) {
                    break;
                }
                BackStackRecordState backStackRecordState = backStackRecordStateArr[i10];
                backStackRecordState.getClass();
                androidx.fragment.app.b bVar = new androidx.fragment.app.b(this);
                backStackRecordState.a(bVar);
                bVar.f21671v = backStackRecordState.v0;
                int i11 = 0;
                while (true) {
                    ArrayList<String> arrayList3 = backStackRecordState.f21463q0;
                    if (i11 >= arrayList3.size()) {
                        break;
                    }
                    String str2 = arrayList3.get(i11);
                    if (str2 != null) {
                        bVar.f21625c.get(i11).f21642b = vVar.b(str2);
                    }
                    i11++;
                }
                bVar.e(1);
                if (isLoggingEnabled(2)) {
                    bVar.toString();
                    PrintWriter printWriter = new PrintWriter(new a0());
                    bVar.g("  ", printWriter, false);
                    printWriter.close();
                }
                this.f21529d.add(bVar);
                i10++;
            }
        } else {
            this.f21529d = null;
        }
        this.f21534i.set(fragmentManagerState.f21584t0);
        String str3 = fragmentManagerState.f21585u0;
        if (str3 != null) {
            Fragment fragmentB2 = vVar.b(str3);
            this.f21544t = fragmentB2;
            n(fragmentB2);
        }
        ArrayList<String> arrayList4 = fragmentManagerState.v0;
        if (arrayList4 != null) {
            for (int i12 = 0; i12 < arrayList4.size(); i12++) {
                this.f21535j.put(arrayList4.get(i12), fragmentManagerState.f21586w0.get(i12));
            }
        }
        ArrayList<String> arrayList5 = fragmentManagerState.f21587x0;
        if (arrayList5 != null) {
            for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                Bundle bundle = fragmentManagerState.f21588y0.get(i13);
                bundle.setClassLoader(this.f21541q.f21522q0.getClassLoader());
                this.f21536k.put(arrayList5.get(i13), bundle);
            }
        }
        this.A = new ArrayDeque<>(fragmentManagerState.E0);
    }

    public final Parcelable K() {
        ArrayList<String> arrayList;
        int size;
        w();
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((b0) it.next()).e();
        }
        s(true);
        this.C = true;
        this.J.v0 = true;
        v vVar = this.f21528c;
        vVar.getClass();
        HashMap<String, u> map = vVar.f21777b;
        ArrayList<String> arrayList2 = new ArrayList<>(map.size());
        for (u uVar : map.values()) {
            if (uVar != null) {
                uVar.m();
                Fragment fragment = uVar.f21771c;
                arrayList2.add(fragment.mWho);
                if (isLoggingEnabled(2)) {
                    fragment.toString();
                    Objects.toString(fragment.mSavedFragmentState);
                }
            }
        }
        v vVar2 = this.f21528c;
        vVar2.getClass();
        ArrayList<FragmentState> arrayList3 = new ArrayList<>(vVar2.f21778c.values());
        BackStackRecordState[] backStackRecordStateArr = null;
        if (arrayList3.isEmpty()) {
            isLoggingEnabled(2);
            return null;
        }
        v vVar3 = this.f21528c;
        synchronized (vVar3.f21776a) {
            try {
                if (vVar3.f21776a.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList<>(vVar3.f21776a.size());
                    for (Fragment fragment2 : vVar3.f21776a) {
                        arrayList.add(fragment2.mWho);
                        if (isLoggingEnabled(2)) {
                            fragment2.toString();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList<androidx.fragment.app.b> arrayList4 = this.f21529d;
        if (arrayList4 != null && (size = arrayList4.size()) > 0) {
            backStackRecordStateArr = new BackStackRecordState[size];
            for (int i10 = 0; i10 < size; i10++) {
                backStackRecordStateArr[i10] = new BackStackRecordState(this.f21529d.get(i10));
                if (isLoggingEnabled(2)) {
                    Objects.toString(this.f21529d.get(i10));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f21580p0 = arrayList3;
        fragmentManagerState.f21581q0 = arrayList2;
        fragmentManagerState.f21582r0 = arrayList;
        fragmentManagerState.f21583s0 = backStackRecordStateArr;
        fragmentManagerState.f21584t0 = this.f21534i.get();
        Fragment fragment3 = this.f21544t;
        if (fragment3 != null) {
            fragmentManagerState.f21585u0 = fragment3.mWho;
        }
        fragmentManagerState.v0.addAll(this.f21535j.keySet());
        fragmentManagerState.f21586w0.addAll(this.f21535j.values());
        fragmentManagerState.f21587x0.addAll(this.f21536k.keySet());
        fragmentManagerState.f21588y0.addAll(this.f21536k.values());
        fragmentManagerState.E0 = new ArrayList<>(this.A);
        return fragmentManagerState;
    }

    public final void L() {
        synchronized (this.f21526a) {
            try {
                if (this.f21526a.size() == 1) {
                    this.f21541q.getHandler().removeCallbacks(this.L);
                    this.f21541q.getHandler().post(this.L);
                    R();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void M(@NonNull Fragment fragment, boolean z10) {
        ViewGroup viewGroupX = x(fragment);
        if (viewGroupX == null || !(viewGroupX instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupX).setDrawDisappearingViewsLast(!z10);
    }

    public final void N(@NonNull Fragment fragment, @NonNull Lifecycle.State state) {
        if (fragment.equals(this.f21528c.b(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = state;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    public final void O(@Nullable Fragment fragment) {
        if (fragment != null) {
            if (!fragment.equals(this.f21528c.b(fragment.mWho)) || (fragment.mHost != null && fragment.mFragmentManager != this)) {
                throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
            }
        }
        Fragment fragment2 = this.f21544t;
        this.f21544t = fragment;
        n(fragment2);
        n(this.f21544t);
    }

    public final void P(@NonNull Fragment fragment) {
        ViewGroup viewGroupX = x(fragment);
        if (viewGroupX != null) {
            if (fragment.getPopExitAnim() + fragment.getPopEnterAnim() + fragment.getExitAnim() + fragment.getEnterAnim() > 0) {
                int i10 = R.id.visible_removing_fragment_view_tag;
                if (viewGroupX.getTag(i10) == null) {
                    viewGroupX.setTag(i10, fragment);
                }
                ((Fragment) viewGroupX.getTag(i10)).setPopDirection(fragment.getPopDirection());
            }
        }
    }

    public final void Q(RuntimeException runtimeException) {
        runtimeException.getMessage();
        PrintWriter printWriter = new PrintWriter(new a0());
        FragmentHostCallback<?> fragmentHostCallback = this.f21541q;
        try {
            if (fragmentHostCallback != null) {
                fragmentHostCallback.onDump("  ", null, printWriter, new String[0]);
            } else {
                dump("  ", null, printWriter, new String[0]);
            }
            throw runtimeException;
        } catch (Exception unused) {
            throw runtimeException;
        }
    }

    public final void R() {
        synchronized (this.f21526a) {
            try {
                if (this.f21526a.isEmpty()) {
                    this.f21533h.setEnabled(getBackStackEntryCount() > 0 && A(this.f21543s));
                } else {
                    this.f21533h.setEnabled(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final u a(@NonNull Fragment fragment) {
        String str = fragment.mPreviousWho;
        if (str != null) {
            FragmentStrictMode.onFragmentReuse(fragment, str);
        }
        if (isLoggingEnabled(2)) {
            fragment.toString();
        }
        u uVarF = f(fragment);
        fragment.mFragmentManager = this;
        v vVar = this.f21528c;
        vVar.g(uVarF);
        if (!fragment.mDetached) {
            vVar.a(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (z(fragment)) {
                this.B = true;
            }
        }
        return uVarF;
    }

    public void addFragmentOnAttachListener(@NonNull FragmentOnAttachListener fragmentOnAttachListener) {
        this.f21539o.add(fragmentOnAttachListener);
    }

    public void addOnBackStackChangedListener(@NonNull OnBackStackChangedListener onBackStackChangedListener) {
        if (this.m == null) {
            this.m = new ArrayList<>();
        }
        this.m.add(onBackStackChangedListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    public final void b(@NonNull FragmentHostCallback<?> fragmentHostCallback, @NonNull FragmentContainer fragmentContainer, @Nullable Fragment fragment) {
        LifecycleOwner lifecycleOwner;
        if (this.f21541q != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f21541q = fragmentHostCallback;
        this.f21542r = fragmentContainer;
        this.f21543s = fragment;
        if (fragment != null) {
            addFragmentOnAttachListener(new f(fragment));
        } else if (fragmentHostCallback instanceof FragmentOnAttachListener) {
            addFragmentOnAttachListener((FragmentOnAttachListener) fragmentHostCallback);
        }
        if (this.f21543s != null) {
            R();
        }
        if (fragmentHostCallback instanceof OnBackPressedDispatcherOwner) {
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = (OnBackPressedDispatcherOwner) fragmentHostCallback;
            OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
            this.f21532g = onBackPressedDispatcher;
            if (fragment != null) {
                lifecycleOwner = onBackPressedDispatcherOwner;
                lifecycleOwner = fragment;
            }
            lifecycleOwner = onBackPressedDispatcherOwner;
            onBackPressedDispatcher.addCallback(lifecycleOwner, this.f21533h);
        }
        if (fragment != null) {
            t tVar = fragment.mFragmentManager.J;
            HashMap<String, t> map = tVar.f21764q0;
            t tVar2 = map.get(fragment.mWho);
            if (tVar2 == null) {
                tVar2 = new t(tVar.f21766s0);
                map.put(fragment.mWho, tVar2);
            }
            this.J = tVar2;
        } else if (fragmentHostCallback instanceof ViewModelStoreOwner) {
            this.J = (t) new ViewModelProvider(((ViewModelStoreOwner) fragmentHostCallback).getViewModelStore(), t.f21762w0).get(t.class);
        } else {
            this.J = new t(false);
        }
        this.J.v0 = isStateSaved();
        this.f21528c.f21779d = this.J;
        Object obj = this.f21541q;
        if ((obj instanceof SavedStateRegistryOwner) && fragment == null) {
            SavedStateRegistry savedStateRegistry = ((SavedStateRegistryOwner) obj).getSavedStateRegistry();
            savedStateRegistry.registerSavedStateProvider("android:support:fragments", new SavedStateRegistry.SavedStateProvider() { // from class: androidx.fragment.app.r
                @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
                public final Bundle saveState() {
                    FragmentManager fragmentManager = this.f21747a;
                    fragmentManager.getClass();
                    Bundle bundle = new Bundle();
                    Parcelable parcelableK = fragmentManager.K();
                    if (parcelableK != null) {
                        bundle.putParcelable("android:support:fragments", parcelableK);
                    }
                    return bundle;
                }
            });
            Bundle bundleConsumeRestoredStateForKey = savedStateRegistry.consumeRestoredStateForKey("android:support:fragments");
            if (bundleConsumeRestoredStateForKey != null) {
                J(bundleConsumeRestoredStateForKey.getParcelable("android:support:fragments"));
            }
        }
        Object obj2 = this.f21541q;
        if (obj2 instanceof ActivityResultRegistryOwner) {
            ActivityResultRegistry activityResultRegistry = ((ActivityResultRegistryOwner) obj2).getActivityResultRegistry();
            String strD = androidx.camera.core.processing.f.d("FragmentManager:", fragment != null ? ad.d.f(new StringBuilder(), fragment.mWho, DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER) : "");
            this.f21548x = activityResultRegistry.register(androidx.camera.camera2.internal.compat.u.f(strD, "StartActivityForResult"), new ActivityResultContracts.StartActivityForResult(), new g());
            this.f21549y = activityResultRegistry.register(androidx.camera.camera2.internal.compat.u.f(strD, "StartIntentSenderForResult"), new k(), new h());
            this.f21550z = activityResultRegistry.register(androidx.camera.camera2.internal.compat.u.f(strD, "RequestPermissions"), new ActivityResultContracts.RequestMultiplePermissions(), new i());
        }
    }

    @NonNull
    public FragmentTransaction beginTransaction() {
        return new androidx.fragment.app.b(this);
    }

    public final void c(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f21528c.a(fragment);
            if (isLoggingEnabled(2)) {
                fragment.toString();
            }
            if (z(fragment)) {
                this.B = true;
            }
        }
    }

    public void clearBackStack(@NonNull String str) {
        q(new j(str), false);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResult(@NonNull String str) {
        this.f21536k.remove(str);
        isLoggingEnabled(2);
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    public final void clearFragmentResultListener(@NonNull String str) {
        l lVarRemove = this.f21537l.remove(str);
        if (lVarRemove != null) {
            lVarRemove.f21566p0.removeObserver(lVarRemove.f21568r0);
        }
        isLoggingEnabled(2);
    }

    public final void d() {
        this.f21527b = false;
        this.H.clear();
        this.G.clear();
    }

    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
        int size;
        int size2;
        String strF = androidx.camera.camera2.internal.compat.u.f(str, "    ");
        v vVar = this.f21528c;
        vVar.getClass();
        String str2 = str + "    ";
        HashMap<String, u> map = vVar.f21777b;
        if (!map.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (u uVar : map.values()) {
                printWriter.print(str);
                if (uVar != null) {
                    Fragment fragment = uVar.f21771c;
                    printWriter.println(fragment);
                    fragment.dump(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println(AbstractJsonLexerKt.NULL);
                }
            }
        }
        ArrayList<Fragment> arrayList = vVar.f21776a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size3; i10++) {
                Fragment fragment2 = arrayList.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(fragment2.toString());
            }
        }
        ArrayList<Fragment> arrayList2 = this.f21530e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i11 = 0; i11 < size2; i11++) {
                Fragment fragment3 = this.f21530e.get(i11);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i11);
                printWriter.print(": ");
                printWriter.println(fragment3.toString());
            }
        }
        ArrayList<androidx.fragment.app.b> arrayList3 = this.f21529d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i12 = 0; i12 < size; i12++) {
                androidx.fragment.app.b bVar = this.f21529d.get(i12);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i12);
                printWriter.print(": ");
                printWriter.println(bVar.toString());
                bVar.g(strF, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f21534i.get());
        synchronized (this.f21526a) {
            try {
                int size4 = this.f21526a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i13 = 0; i13 < size4; i13++) {
                        Object obj = (m) this.f21526a.get(i13);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i13);
                        printWriter.print(": ");
                        printWriter.println(obj);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f21541q);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f21542r);
        if (this.f21543s != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f21543s);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f21540p);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.C);
        printWriter.print(" mStopped=");
        printWriter.print(this.D);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.E);
        if (this.B) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.B);
        }
    }

    public final HashSet e() {
        HashSet hashSet = new HashSet();
        Iterator it = this.f21528c.d().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((u) it.next()).f21771c.mContainer;
            if (viewGroup != null) {
                hashSet.add(b0.g(viewGroup, y()));
            }
        }
        return hashSet;
    }

    public boolean executePendingTransactions() {
        boolean zS = s(true);
        w();
        return zS;
    }

    @NonNull
    public final u f(@NonNull Fragment fragment) {
        String str = fragment.mWho;
        v vVar = this.f21528c;
        u uVar = vVar.f21777b.get(str);
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this.f21538n, vVar, fragment);
        uVar2.j(this.f21541q.f21522q0.getClassLoader());
        uVar2.f21773e = this.f21540p;
        return uVar2;
    }

    @Nullable
    public Fragment findFragmentById(@IdRes int i10) {
        v vVar = this.f21528c;
        ArrayList<Fragment> arrayList = vVar.f21776a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Fragment fragment = arrayList.get(size);
            if (fragment != null && fragment.mFragmentId == i10) {
                return fragment;
            }
        }
        for (u uVar : vVar.f21777b.values()) {
            if (uVar != null) {
                Fragment fragment2 = uVar.f21771c;
                if (fragment2.mFragmentId == i10) {
                    return fragment2;
                }
            }
        }
        return null;
    }

    @Nullable
    public Fragment findFragmentByTag(@Nullable String str) {
        v vVar = this.f21528c;
        if (str != null) {
            ArrayList<Fragment> arrayList = vVar.f21776a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                Fragment fragment = arrayList.get(size);
                if (fragment != null && str.equals(fragment.mTag)) {
                    return fragment;
                }
            }
        }
        if (str != null) {
            for (u uVar : vVar.f21777b.values()) {
                if (uVar != null) {
                    Fragment fragment2 = uVar.f21771c;
                    if (str.equals(fragment2.mTag)) {
                        return fragment2;
                    }
                }
            }
        } else {
            vVar.getClass();
        }
        return null;
    }

    public final void g(@NonNull Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Objects.toString(fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (isLoggingEnabled(2)) {
                fragment.toString();
            }
            v vVar = this.f21528c;
            synchronized (vVar.f21776a) {
                vVar.f21776a.remove(fragment);
            }
            fragment.mAdded = false;
            if (z(fragment)) {
                this.B = true;
            }
            P(fragment);
        }
    }

    @NonNull
    public BackStackEntry getBackStackEntryAt(int i10) {
        return this.f21529d.get(i10);
    }

    public int getBackStackEntryCount() {
        ArrayList<androidx.fragment.app.b> arrayList = this.f21529d;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    @Nullable
    public Fragment getFragment(@NonNull Bundle bundle, @NonNull String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentB = this.f21528c.b(string);
        if (fragmentB != null) {
            return fragmentB;
        }
        Q(new IllegalStateException(androidx.camera.core.impl.utils.c.a("Fragment no longer exists for key ", str, ": unique id ", string)));
        throw null;
    }

    @NonNull
    public FragmentFactory getFragmentFactory() {
        FragmentFactory fragmentFactory = this.f21545u;
        if (fragmentFactory != null) {
            return fragmentFactory;
        }
        Fragment fragment = this.f21543s;
        return fragment != null ? fragment.mFragmentManager.getFragmentFactory() : this.f21546v;
    }

    @NonNull
    public List<Fragment> getFragments() {
        return this.f21528c.f();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public FragmentHostCallback<?> getHost() {
        return this.f21541q;
    }

    @Nullable
    public Fragment getPrimaryNavigationFragment() {
        return this.f21544t;
    }

    @Nullable
    public FragmentStrictMode.Policy getStrictModePolicy() {
        return this.K;
    }

    public final boolean h(@NonNull MenuItem menuItem) {
        if (this.f21540p < 1) {
            return false;
        }
        for (Fragment fragment : this.f21528c.f()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean i(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (this.f21540p < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z10 = false;
        for (Fragment fragment : this.f21528c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z10 = true;
            }
        }
        if (this.f21530e != null) {
            for (int i10 = 0; i10 < this.f21530e.size(); i10++) {
                Fragment fragment2 = this.f21530e.get(i10);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f21530e = arrayList;
        return z10;
    }

    public boolean isDestroyed() {
        return this.E;
    }

    public boolean isStateSaved() {
        return this.C || this.D;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:16:0x004a  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c A[LOOP:2: B:17:0x0056->B:19:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:? A[RETURN, SYNTHETIC] */
    public final void j() {
        boolean zIsChangingConfigurations;
        ActivityResultLauncher<Intent> activityResultLauncher;
        Iterator<BackStackState> it;
        this.E = true;
        s(true);
        Iterator it2 = e().iterator();
        while (it2.hasNext()) {
            ((b0) it2.next()).e();
        }
        FragmentHostCallback<?> fragmentHostCallback = this.f21541q;
        boolean z10 = fragmentHostCallback instanceof ViewModelStoreOwner;
        v vVar = this.f21528c;
        if (!z10) {
            Context context = fragmentHostCallback.f21522q0;
            if (context instanceof Activity) {
                zIsChangingConfigurations = true ^ ((Activity) context).isChangingConfigurations();
            } else {
                it = this.f21535j.values().iterator();
                while (it.hasNext()) {
                    for (String str : it.next().f21471p0) {
                        t tVar = vVar.f21779d;
                        tVar.getClass();
                        isLoggingEnabled(3);
                        tVar.b(str);
                    }
                }
            }
            p(-1);
            this.f21541q = null;
            this.f21542r = null;
            this.f21543s = null;
            if (this.f21532g != null) {
                this.f21533h.remove();
                this.f21532g = null;
            }
            activityResultLauncher = this.f21548x;
            if (activityResultLauncher != null) {
                activityResultLauncher.unregister();
                this.f21549y.unregister();
                this.f21550z.unregister();
            }
        }
        zIsChangingConfigurations = vVar.f21779d.f21767t0;
        if (zIsChangingConfigurations) {
            it = this.f21535j.values().iterator();
            while (it.hasNext()) {
                while (r1.hasNext()) {
                    t tVar2 = vVar.f21779d;
                    tVar2.getClass();
                    isLoggingEnabled(3);
                    tVar2.b(str);
                }
            }
        }
        p(-1);
        this.f21541q = null;
        this.f21542r = null;
        this.f21543s = null;
        if (this.f21532g != null) {
            this.f21533h.remove();
            this.f21532g = null;
        }
        activityResultLauncher = this.f21548x;
        if (activityResultLauncher != null) {
            activityResultLauncher.unregister();
            this.f21549y.unregister();
            this.f21550z.unregister();
        }
    }

    public final void k() {
        for (Fragment fragment : this.f21528c.e()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.k();
            }
        }
    }

    public final boolean l(@NonNull MenuItem menuItem) {
        if (this.f21540p < 1) {
            return false;
        }
        for (Fragment fragment : this.f21528c.f()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void m(@NonNull Menu menu) {
        if (this.f21540p < 1) {
            return;
        }
        for (Fragment fragment : this.f21528c.f()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public final void n(@Nullable Fragment fragment) {
        if (fragment != null) {
            if (fragment.equals(this.f21528c.b(fragment.mWho))) {
                fragment.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final boolean o(@NonNull Menu menu) {
        boolean z10 = false;
        if (this.f21540p < 1) {
            return false;
        }
        for (Fragment fragment : this.f21528c.f()) {
            if (fragment != null && fragment.isMenuVisible() && fragment.performPrepareOptionsMenu(menu)) {
                z10 = true;
            }
        }
        return z10;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    public final void p(int i10) {
        try {
            this.f21527b = true;
            for (u uVar : this.f21528c.f21777b.values()) {
                if (uVar != null) {
                    uVar.f21773e = i10;
                }
            }
            B(i10, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((b0) it.next()).e();
            }
            this.f21527b = false;
            s(true);
        } catch (Throwable th2) {
            this.f21527b = false;
            throw th2;
        }
    }

    public void popBackStack() {
        q(new n(null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return E(-1, 0, null);
    }

    public void putFragment(@NonNull Bundle bundle, @NonNull String str, @NonNull Fragment fragment) {
        if (fragment.mFragmentManager == this) {
            bundle.putString(str, fragment.mWho);
        } else {
            Q(new IllegalStateException(androidx.collection.a.c("Fragment ", fragment, " is not currently in the FragmentManager")));
            throw null;
        }
    }

    public final void q(@NonNull m mVar, boolean z10) {
        if (!z10) {
            if (this.f21541q == null) {
                if (!this.E) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (isStateSaved()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f21526a) {
            try {
                if (this.f21541q == null) {
                    if (!z10) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f21526a.add(mVar);
                    L();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void r(boolean z10) {
        if (this.f21527b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f21541q == null) {
            if (!this.E) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f21541q.getHandler().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z10 && isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.G == null) {
            this.G = new ArrayList<>();
            this.H = new ArrayList<>();
        }
    }

    public void registerFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks, boolean z10) {
        this.f21538n.f21743a.add(new q.a(fragmentLifecycleCallbacks, z10));
    }

    public void removeFragmentOnAttachListener(@NonNull FragmentOnAttachListener fragmentOnAttachListener) {
        this.f21539o.remove(fragmentOnAttachListener);
    }

    public void removeOnBackStackChangedListener(@NonNull OnBackStackChangedListener onBackStackChangedListener) {
        ArrayList<OnBackStackChangedListener> arrayList = this.m;
        if (arrayList != null) {
            arrayList.remove(onBackStackChangedListener);
        }
    }

    public void restoreBackStack(@NonNull String str) {
        q(new o(str), false);
    }

    public final boolean s(boolean z10) {
        r(z10);
        boolean z11 = false;
        while (true) {
            ArrayList<androidx.fragment.app.b> arrayList = this.G;
            ArrayList<Boolean> arrayList2 = this.H;
            synchronized (this.f21526a) {
                if (this.f21526a.isEmpty()) {
                    break;
                }
                try {
                    int size = this.f21526a.size();
                    boolean zA = false;
                    for (int i10 = 0; i10 < size; i10++) {
                        zA |= this.f21526a.get(i10).a(arrayList, arrayList2);
                    }
                    this.f21526a.clear();
                    this.f21541q.getHandler().removeCallbacks(this.L);
                    if (!zA) {
                        break;
                    }
                    this.f21527b = true;
                    try {
                        H(this.G, this.H);
                        d();
                        z11 = true;
                    } catch (Throwable th2) {
                        d();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    this.f21526a.clear();
                    this.f21541q.getHandler().removeCallbacks(this.L);
                    throw th3;
                }
            }
        }
        R();
        if (this.F) {
            this.F = false;
            for (u uVar : this.f21528c.d()) {
                Fragment fragment = uVar.f21771c;
                if (fragment.mDeferStart) {
                    if (this.f21527b) {
                        this.F = true;
                    } else {
                        fragment.mDeferStart = false;
                        uVar.i();
                    }
                }
            }
        }
        this.f21528c.f21777b.values().removeAll(Collections.singleton(null));
        return z11;
    }

    public void saveBackStack(@NonNull String str) {
        q(new p(str), false);
    }

    @Nullable
    public Fragment.SavedState saveFragmentInstanceState(@NonNull Fragment fragment) {
        Bundle bundleL;
        u uVar = this.f21528c.f21777b.get(fragment.mWho);
        if (uVar != null) {
            Fragment fragment2 = uVar.f21771c;
            if (fragment2.equals(fragment)) {
                if (fragment2.mState <= -1 || (bundleL = uVar.l()) == null) {
                    return null;
                }
                return new Fragment.SavedState(bundleL);
            }
        }
        Q(new IllegalStateException(androidx.collection.a.c("Fragment ", fragment, " is not currently in the FragmentManager")));
        throw null;
    }

    public void setFragmentFactory(@NonNull FragmentFactory fragmentFactory) {
        this.f21545u = fragmentFactory;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    @Override // androidx.fragment.app.FragmentResultOwner
    public final void setFragmentResult(@NonNull String str, @NonNull Bundle bundle) {
        l lVar = this.f21537l.get(str);
        if (lVar != null) {
            if (lVar.f21566p0.getF21906d().isAtLeast(Lifecycle.State.STARTED)) {
                lVar.onFragmentResult(str, bundle);
            } else {
                this.f21536k.put(str, bundle);
            }
        } else {
            this.f21536k.put(str, bundle);
        }
        if (isLoggingEnabled(2)) {
            Objects.toString(bundle);
        }
    }

    @Override // androidx.fragment.app.FragmentResultOwner
    @SuppressLint({"SyntheticAccessor"})
    public final void setFragmentResultListener(@NonNull String str, @NonNull LifecycleOwner lifecycleOwner, @NonNull FragmentResultListener fragmentResultListener) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getF21906d() == Lifecycle.State.DESTROYED) {
            return;
        }
        e eVar = new e(str, fragmentResultListener, lifecycle);
        lifecycle.addObserver(eVar);
        l lVarPut = this.f21537l.put(str, new l(lifecycle, fragmentResultListener, eVar));
        if (lVarPut != null) {
            lVarPut.f21566p0.removeObserver(lVarPut.f21568r0);
        }
        if (isLoggingEnabled(2)) {
            lifecycle.toString();
            Objects.toString(fragmentResultListener);
        }
    }

    public void setStrictModePolicy(@Nullable FragmentStrictMode.Policy policy) {
        this.K = policy;
    }

    public final void t(@NonNull m mVar, boolean z10) {
        if (z10 && (this.f21541q == null || this.E)) {
            return;
        }
        r(z10);
        if (mVar.a(this.G, this.H)) {
            this.f21527b = true;
            try {
                H(this.G, this.H);
                d();
            } catch (Throwable th2) {
                d();
                throw th2;
            }
        }
        R();
        boolean z11 = this.F;
        v vVar = this.f21528c;
        if (z11) {
            this.F = false;
            for (u uVar : vVar.d()) {
                Fragment fragment = uVar.f21771c;
                if (fragment.mDeferStart) {
                    if (this.f21527b) {
                        this.F = true;
                    } else {
                        fragment.mDeferStart = false;
                        uVar.i();
                    }
                }
            }
        }
        vVar.f21777b.values().removeAll(Collections.singleton(null));
    }

    @NonNull
    public String toString() {
        StringBuilder sbA = androidx.fragment.app.a.a(128, "FragmentManager{");
        sbA.append(Integer.toHexString(System.identityHashCode(this)));
        sbA.append(" in ");
        Fragment fragment = this.f21543s;
        if (fragment != null) {
            sbA.append(fragment.getClass().getSimpleName());
            sbA.append("{");
            sbA.append(Integer.toHexString(System.identityHashCode(this.f21543s)));
            sbA.append("}");
        } else {
            FragmentHostCallback<?> fragmentHostCallback = this.f21541q;
            if (fragmentHostCallback != null) {
                sbA.append(fragmentHostCallback.getClass().getSimpleName());
                sbA.append("{");
                sbA.append(Integer.toHexString(System.identityHashCode(this.f21541q)));
                sbA.append("}");
            } else {
                sbA.append(AbstractJsonLexerKt.NULL);
            }
        }
        sbA.append("}}");
        return sbA.toString();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0227 A[PHI: r14
      0x0227: PHI (r14v10 int) = (r14v9 int), (r14v11 int) binds: [B:103:0x0217, B:108:0x0223] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:64:0x0166  */
    public final void u(@NonNull ArrayList<androidx.fragment.app.b> arrayList, @NonNull ArrayList<Boolean> arrayList2, int i10, int i11) {
        ViewGroup viewGroup;
        ArrayList<FragmentTransaction.a> arrayList3;
        v vVar;
        v vVar2;
        int i12;
        int i13;
        ArrayList<androidx.fragment.app.b> arrayList4 = arrayList;
        boolean z10 = arrayList4.get(i10).f21639r;
        ArrayList<Fragment> arrayList5 = this.I;
        if (arrayList5 == null) {
            this.I = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        ArrayList<Fragment> arrayList6 = this.I;
        v vVar3 = this.f21528c;
        arrayList6.addAll(vVar3.f());
        Fragment primaryNavigationFragment = getPrimaryNavigationFragment();
        int i14 = i10;
        boolean z11 = false;
        while (true) {
            int i15 = 1;
            if (i14 >= i11) {
                v vVar4 = vVar3;
                this.I.clear();
                if (!z10 && this.f21540p >= 1) {
                    for (int i16 = i10; i16 < i11; i16++) {
                        Iterator<FragmentTransaction.a> it = arrayList.get(i16).f21625c.iterator();
                        while (it.hasNext()) {
                            Fragment fragment = it.next().f21642b;
                            if (fragment == null || fragment.mFragmentManager == null) {
                                vVar = vVar4;
                            } else {
                                vVar = vVar4;
                                vVar.g(f(fragment));
                            }
                            vVar4 = vVar;
                        }
                    }
                }
                for (int i17 = i10; i17 < i11; i17++) {
                    androidx.fragment.app.b bVar = arrayList.get(i17);
                    if (arrayList2.get(i17).booleanValue()) {
                        bVar.e(-1);
                        ArrayList<FragmentTransaction.a> arrayList7 = bVar.f21625c;
                        boolean z12 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            FragmentTransaction.a aVar = arrayList7.get(size);
                            Fragment fragment2 = aVar.f21642b;
                            if (fragment2 != null) {
                                fragment2.mBeingSaved = bVar.f21672w;
                                fragment2.setPopDirection(z12);
                                int i18 = bVar.f21630h;
                                int i19 = 8194;
                                int i20 = FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
                                if (i18 != 4097) {
                                    if (i18 != 8194) {
                                        i19 = FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN;
                                        i20 = FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE;
                                        if (i18 != 8197) {
                                            if (i18 == 4099) {
                                                i19 = 4099;
                                            } else if (i18 != 4100) {
                                                i19 = 0;
                                            } else {
                                                i19 = i20;
                                            }
                                        }
                                    } else {
                                        i19 = i20;
                                    }
                                }
                                fragment2.setNextTransition(i19);
                                fragment2.setSharedElementNames(bVar.f21638q, bVar.f21637p);
                            }
                            int i21 = aVar.f21641a;
                            FragmentManager fragmentManager = bVar.f21669t;
                            switch (i21) {
                                case 1:
                                    fragment2.setAnimations(aVar.f21644d, aVar.f21645e, aVar.f21646f, aVar.f21647g);
                                    z12 = true;
                                    fragmentManager.M(fragment2, true);
                                    fragmentManager.G(fragment2);
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f21641a);
                                case 3:
                                    fragment2.setAnimations(aVar.f21644d, aVar.f21645e, aVar.f21646f, aVar.f21647g);
                                    fragmentManager.a(fragment2);
                                    z12 = true;
                                    break;
                                case 4:
                                    fragment2.setAnimations(aVar.f21644d, aVar.f21645e, aVar.f21646f, aVar.f21647g);
                                    fragmentManager.getClass();
                                    if (isLoggingEnabled(2)) {
                                        Objects.toString(fragment2);
                                    }
                                    if (fragment2.mHidden) {
                                        fragment2.mHidden = false;
                                        fragment2.mHiddenChanged = !fragment2.mHiddenChanged;
                                    }
                                    z12 = true;
                                    break;
                                case 5:
                                    fragment2.setAnimations(aVar.f21644d, aVar.f21645e, aVar.f21646f, aVar.f21647g);
                                    fragmentManager.M(fragment2, true);
                                    if (isLoggingEnabled(2)) {
                                        Objects.toString(fragment2);
                                    }
                                    if (!fragment2.mHidden) {
                                        fragment2.mHidden = true;
                                        fragment2.mHiddenChanged = !fragment2.mHiddenChanged;
                                        fragmentManager.P(fragment2);
                                    }
                                    z12 = true;
                                    break;
                                case 6:
                                    fragment2.setAnimations(aVar.f21644d, aVar.f21645e, aVar.f21646f, aVar.f21647g);
                                    fragmentManager.c(fragment2);
                                    z12 = true;
                                    break;
                                case 7:
                                    fragment2.setAnimations(aVar.f21644d, aVar.f21645e, aVar.f21646f, aVar.f21647g);
                                    fragmentManager.M(fragment2, true);
                                    fragmentManager.g(fragment2);
                                    z12 = true;
                                    break;
                                case 8:
                                    fragmentManager.O(null);
                                    z12 = true;
                                    break;
                                case 9:
                                    fragmentManager.O(fragment2);
                                    z12 = true;
                                    break;
                                case 10:
                                    fragmentManager.N(fragment2, aVar.f21648h);
                                    z12 = true;
                                    break;
                            }
                        }
                    } else {
                        bVar.e(1);
                        ArrayList<FragmentTransaction.a> arrayList8 = bVar.f21625c;
                        int size2 = arrayList8.size();
                        int i22 = 0;
                        while (i22 < size2) {
                            FragmentTransaction.a aVar2 = arrayList8.get(i22);
                            Fragment fragment3 = aVar2.f21642b;
                            if (fragment3 != null) {
                                fragment3.mBeingSaved = bVar.f21672w;
                                fragment3.setPopDirection(false);
                                fragment3.setNextTransition(bVar.f21630h);
                                fragment3.setSharedElementNames(bVar.f21637p, bVar.f21638q);
                            }
                            int i23 = aVar2.f21641a;
                            FragmentManager fragmentManager2 = bVar.f21669t;
                            switch (i23) {
                                case 1:
                                    arrayList3 = arrayList8;
                                    fragment3.setAnimations(aVar2.f21644d, aVar2.f21645e, aVar2.f21646f, aVar2.f21647g);
                                    fragmentManager2.M(fragment3, false);
                                    fragmentManager2.a(fragment3);
                                    i22++;
                                    arrayList8 = arrayList3;
                                    break;
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + aVar2.f21641a);
                                case 3:
                                    arrayList3 = arrayList8;
                                    fragment3.setAnimations(aVar2.f21644d, aVar2.f21645e, aVar2.f21646f, aVar2.f21647g);
                                    fragmentManager2.G(fragment3);
                                    i22++;
                                    arrayList8 = arrayList3;
                                    break;
                                case 4:
                                    arrayList3 = arrayList8;
                                    fragment3.setAnimations(aVar2.f21644d, aVar2.f21645e, aVar2.f21646f, aVar2.f21647g);
                                    fragmentManager2.getClass();
                                    if (isLoggingEnabled(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (!fragment3.mHidden) {
                                        fragment3.mHidden = true;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                        fragmentManager2.P(fragment3);
                                    }
                                    i22++;
                                    arrayList8 = arrayList3;
                                    break;
                                case 5:
                                    arrayList3 = arrayList8;
                                    fragment3.setAnimations(aVar2.f21644d, aVar2.f21645e, aVar2.f21646f, aVar2.f21647g);
                                    fragmentManager2.M(fragment3, false);
                                    if (isLoggingEnabled(2)) {
                                        Objects.toString(fragment3);
                                    }
                                    if (fragment3.mHidden) {
                                        fragment3.mHidden = false;
                                        fragment3.mHiddenChanged = !fragment3.mHiddenChanged;
                                    }
                                    i22++;
                                    arrayList8 = arrayList3;
                                    break;
                                case 6:
                                    arrayList3 = arrayList8;
                                    fragment3.setAnimations(aVar2.f21644d, aVar2.f21645e, aVar2.f21646f, aVar2.f21647g);
                                    fragmentManager2.g(fragment3);
                                    i22++;
                                    arrayList8 = arrayList3;
                                    break;
                                case 7:
                                    arrayList3 = arrayList8;
                                    fragment3.setAnimations(aVar2.f21644d, aVar2.f21645e, aVar2.f21646f, aVar2.f21647g);
                                    fragmentManager2.M(fragment3, false);
                                    fragmentManager2.c(fragment3);
                                    i22++;
                                    arrayList8 = arrayList3;
                                    break;
                                case 8:
                                    fragmentManager2.O(fragment3);
                                    arrayList3 = arrayList8;
                                    i22++;
                                    arrayList8 = arrayList3;
                                    break;
                                case 9:
                                    fragmentManager2.O(null);
                                    arrayList3 = arrayList8;
                                    i22++;
                                    arrayList8 = arrayList3;
                                    break;
                                case 10:
                                    fragmentManager2.N(fragment3, aVar2.f21649i);
                                    arrayList3 = arrayList8;
                                    i22++;
                                    arrayList8 = arrayList3;
                                    break;
                            }
                        }
                    }
                }
                boolean zBooleanValue = arrayList2.get(i11 - 1).booleanValue();
                for (int i24 = i10; i24 < i11; i24++) {
                    androidx.fragment.app.b bVar2 = arrayList.get(i24);
                    if (zBooleanValue) {
                        for (int size3 = bVar2.f21625c.size() - 1; size3 >= 0; size3--) {
                            Fragment fragment4 = bVar2.f21625c.get(size3).f21642b;
                            if (fragment4 != null) {
                                f(fragment4).i();
                            }
                        }
                    } else {
                        Iterator<FragmentTransaction.a> it2 = bVar2.f21625c.iterator();
                        while (it2.hasNext()) {
                            Fragment fragment5 = it2.next().f21642b;
                            if (fragment5 != null) {
                                f(fragment5).i();
                            }
                        }
                    }
                }
                B(this.f21540p, true);
                HashSet<b0> hashSet = new HashSet();
                for (int i25 = i10; i25 < i11; i25++) {
                    Iterator<FragmentTransaction.a> it3 = arrayList.get(i25).f21625c.iterator();
                    while (it3.hasNext()) {
                        Fragment fragment6 = it3.next().f21642b;
                        if (fragment6 != null && (viewGroup = fragment6.mContainer) != null) {
                            hashSet.add(b0.g(viewGroup, y()));
                        }
                    }
                }
                for (b0 b0Var : hashSet) {
                    b0Var.f21676d = zBooleanValue;
                    b0Var.h();
                    b0Var.c();
                }
                for (int i26 = i10; i26 < i11; i26++) {
                    androidx.fragment.app.b bVar3 = arrayList.get(i26);
                    if (arrayList2.get(i26).booleanValue() && bVar3.f21671v >= 0) {
                        bVar3.f21671v = -1;
                    }
                    if (bVar3.f21640s != null) {
                        for (int i27 = 0; i27 < bVar3.f21640s.size(); i27++) {
                            bVar3.f21640s.get(i27).run();
                        }
                        bVar3.f21640s = null;
                    }
                }
                if (!z11 || this.m == null) {
                    return;
                }
                for (int i28 = 0; i28 < this.m.size(); i28++) {
                    this.m.get(i28).onBackStackChanged();
                }
                return;
            }
            androidx.fragment.app.b bVar4 = arrayList4.get(i14);
            if (arrayList2.get(i14).booleanValue()) {
                vVar2 = vVar3;
                int i29 = 1;
                ArrayList<Fragment> arrayList9 = this.I;
                ArrayList<FragmentTransaction.a> arrayList10 = bVar4.f21625c;
                int size4 = arrayList10.size() - 1;
                while (size4 >= 0) {
                    FragmentTransaction.a aVar3 = arrayList10.get(size4);
                    int i30 = aVar3.f21641a;
                    if (i30 != i29) {
                        if (i30 != 3) {
                            switch (i30) {
                                case 6:
                                    arrayList9.add(aVar3.f21642b);
                                    break;
                                case 8:
                                    primaryNavigationFragment = null;
                                    break;
                                case 9:
                                    primaryNavigationFragment = aVar3.f21642b;
                                    break;
                                case 10:
                                    aVar3.f21649i = aVar3.f21648h;
                                    break;
                            }
                        } else {
                            arrayList9.add(aVar3.f21642b);
                        }
                        size4--;
                        i29 = 1;
                    }
                    arrayList9.remove(aVar3.f21642b);
                    size4--;
                    i29 = 1;
                }
            } else {
                ArrayList<Fragment> arrayList11 = this.I;
                int i31 = 0;
                while (true) {
                    ArrayList<FragmentTransaction.a> arrayList12 = bVar4.f21625c;
                    if (i31 < arrayList12.size()) {
                        FragmentTransaction.a aVar4 = arrayList12.get(i31);
                        int i32 = aVar4.f21641a;
                        if (i32 != i15) {
                            if (i32 != 2) {
                                if (i32 == 3 || i32 == 6) {
                                    arrayList11.remove(aVar4.f21642b);
                                    Fragment fragment7 = aVar4.f21642b;
                                    if (fragment7 == primaryNavigationFragment) {
                                        arrayList12.add(i31, new FragmentTransaction.a(9, fragment7));
                                        i31++;
                                        vVar3 = vVar3;
                                        i12 = 1;
                                        primaryNavigationFragment = null;
                                    }
                                } else if (i32 == 7) {
                                    i12 = 1;
                                } else if (i32 == 8) {
                                    arrayList12.add(i31, new FragmentTransaction.a(9, primaryNavigationFragment, 0));
                                    aVar4.f21643c = true;
                                    i31++;
                                    primaryNavigationFragment = aVar4.f21642b;
                                }
                                vVar3 = vVar3;
                                i12 = 1;
                            } else {
                                Fragment fragment8 = aVar4.f21642b;
                                int i33 = fragment8.mContainerId;
                                int size5 = arrayList11.size() - 1;
                                boolean z13 = false;
                                while (size5 >= 0) {
                                    v vVar5 = vVar3;
                                    Fragment fragment9 = arrayList11.get(size5);
                                    if (fragment9.mContainerId != i33) {
                                        i33 = i33;
                                    } else if (fragment9 == fragment8) {
                                        i33 = i33;
                                        z13 = true;
                                    } else {
                                        if (fragment9 == primaryNavigationFragment) {
                                            arrayList12.add(i31, new FragmentTransaction.a(9, fragment9, 0));
                                            i31++;
                                            i13 = 0;
                                            primaryNavigationFragment = null;
                                        } else {
                                            i13 = 0;
                                        }
                                        FragmentTransaction.a aVar5 = new FragmentTransaction.a(3, fragment9, i13);
                                        aVar5.f21644d = aVar4.f21644d;
                                        aVar5.f21646f = aVar4.f21646f;
                                        aVar5.f21645e = aVar4.f21645e;
                                        aVar5.f21647g = aVar4.f21647g;
                                        arrayList12.add(i31, aVar5);
                                        arrayList11.remove(fragment9);
                                        i31++;
                                        primaryNavigationFragment = primaryNavigationFragment;
                                    }
                                    size5--;
                                    i33 = i33;
                                    vVar3 = vVar5;
                                }
                                vVar3 = vVar3;
                                i12 = 1;
                                if (z13) {
                                    arrayList12.remove(i31);
                                    i31--;
                                } else {
                                    aVar4.f21641a = 1;
                                    aVar4.f21643c = true;
                                    arrayList11.add(fragment8);
                                }
                            }
                            i31 += i12;
                            i15 = i12;
                            vVar3 = vVar3;
                        } else {
                            i12 = i15;
                        }
                        arrayList11.add(aVar4.f21642b);
                        i31 += i12;
                        i15 = i12;
                        vVar3 = vVar3;
                    } else {
                        vVar2 = vVar3;
                    }
                }
            }
            z11 = z11 || bVar4.f21631i;
            i14++;
            arrayList4 = arrayList;
            vVar3 = vVar2;
        }
    }

    public void unregisterFragmentLifecycleCallbacks(@NonNull FragmentLifecycleCallbacks fragmentLifecycleCallbacks) {
        q qVar = this.f21538n;
        synchronized (qVar.f21743a) {
            try {
                int size = qVar.f21743a.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (qVar.f21743a.get(i10).f21745a == fragmentLifecycleCallbacks) {
                        qVar.f21743a.remove(i10);
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int v(int i10, @Nullable String str, boolean z10) {
        ArrayList<androidx.fragment.app.b> arrayList = this.f21529d;
        if (arrayList == null || arrayList.isEmpty()) {
            return -1;
        }
        if (str == null && i10 < 0) {
            if (z10) {
                return 0;
            }
            return this.f21529d.size() - 1;
        }
        int size = this.f21529d.size() - 1;
        while (size >= 0) {
            androidx.fragment.app.b bVar = this.f21529d.get(size);
            if ((str != null && str.equals(bVar.f21633k)) || (i10 >= 0 && i10 == bVar.f21671v)) {
                break;
            }
            size--;
        }
        if (size < 0) {
            return size;
        }
        if (!z10) {
            if (size == this.f21529d.size() - 1) {
                return -1;
            }
            return size + 1;
        }
        while (size > 0) {
            androidx.fragment.app.b bVar2 = this.f21529d.get(size - 1);
            if ((str == null || !str.equals(bVar2.f21633k)) && (i10 < 0 || i10 != bVar2.f21671v)) {
                return size;
            }
            size--;
        }
        return size;
    }

    public final void w() {
        for (b0 b0Var : e()) {
            if (b0Var.f21677e) {
                isLoggingEnabled(2);
                b0Var.f21677e = false;
                b0Var.c();
            }
        }
    }

    public final ViewGroup x(@NonNull Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f21542r.onHasView()) {
            View viewOnFindViewById = this.f21542r.onFindViewById(fragment.mContainerId);
            if (viewOnFindViewById instanceof ViewGroup) {
                return (ViewGroup) viewOnFindViewById;
            }
        }
        return null;
    }

    @NonNull
    public final c0 y() {
        Fragment fragment = this.f21543s;
        return fragment != null ? fragment.mFragmentManager.y() : this.f21547w;
    }

    public void popBackStack(@Nullable String str, int i10) {
        q(new n(str, -1, i10), false);
    }

    public boolean popBackStackImmediate(@Nullable String str, int i10) {
        return E(-1, i10, str);
    }

    public void popBackStack(int i10, int i11) {
        D(i10, i11, false);
    }

    public boolean popBackStackImmediate(int i10, int i11) {
        if (i10 >= 0) {
            return E(i10, i11, null);
        }
        throw new IllegalArgumentException(g0.c("Bad id: ", i10));
    }

    public static abstract class FragmentLifecycleCallbacks {
        public void onFragmentDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentDetached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentPaused(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentResumed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentStarted(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentStopped(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        public void onFragmentViewDestroyed(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment) {
        }

        @Deprecated
        public void onFragmentActivityCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentPreAttached(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Context context) {
        }

        public void onFragmentPreCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @Nullable Bundle bundle) {
        }

        public void onFragmentSaveInstanceState(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull Bundle bundle) {
        }

        public void onFragmentViewCreated(@NonNull FragmentManager fragmentManager, @NonNull Fragment fragment, @NonNull View view, @Nullable Bundle bundle) {
        }
    }
}
