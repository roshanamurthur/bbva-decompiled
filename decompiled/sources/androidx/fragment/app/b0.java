package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.g0;
import androidx.core.os.CancellationSignal;
import androidx.core.view.ViewCompat;
import androidx.fragment.R;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: SpecialEffectsController.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewGroup f21673a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList<e> f21674b = new ArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList<e> f21675c = new ArrayList<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f21676d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f21677e = false;

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ d f21678p0;

        public a(d dVar) {
            this.f21678p0 = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ArrayList<e> arrayList = b0.this.f21674b;
            d dVar = this.f21678p0;
            if (arrayList.contains(dVar)) {
                dVar.f21685a.a(dVar.f21687c.mView);
            }
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ d f21680p0;

        public b(d dVar) {
            this.f21680p0 = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            b0 b0Var = b0.this;
            ArrayList<e> arrayList = b0Var.f21674b;
            d dVar = this.f21680p0;
            arrayList.remove(dVar);
            b0Var.f21675c.remove(dVar);
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f21682a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f21683b;

        static {
            int[] iArr = new int[e.b.values().length];
            f21683b = iArr;
            try {
                iArr[e.b.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21683b[e.b.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21683b[e.b.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[e.c.values().length];
            f21682a = iArr2;
            try {
                iArr2[e.c.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21682a[e.c.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21682a[e.c.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21682a[e.c.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    public static class d extends e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public final u f21684h;

        public d(@NonNull e.c cVar, @NonNull e.b bVar, @NonNull u uVar, @NonNull CancellationSignal cancellationSignal) {
            super(cVar, bVar, uVar.f21771c, cancellationSignal);
            this.f21684h = uVar;
        }

        @Override // androidx.fragment.app.b0.e
        public final void b() {
            super.b();
            this.f21684h.i();
        }

        @Override // androidx.fragment.app.b0.e
        public final void d() {
            e.b bVar = this.f21686b;
            e.b bVar2 = e.b.ADDING;
            u uVar = this.f21684h;
            if (bVar != bVar2) {
                if (bVar == e.b.REMOVING) {
                    Fragment fragment = uVar.f21771c;
                    View viewRequireView = fragment.requireView();
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(viewRequireView.findFocus());
                        viewRequireView.toString();
                        fragment.toString();
                    }
                    viewRequireView.clearFocus();
                    return;
                }
                return;
            }
            Fragment fragment2 = uVar.f21771c;
            View viewFindFocus = fragment2.mView.findFocus();
            if (viewFindFocus != null) {
                fragment2.setFocusedView(viewFindFocus);
                if (FragmentManager.isLoggingEnabled(2)) {
                    viewFindFocus.toString();
                    fragment2.toString();
                }
            }
            View viewRequireView2 = this.f21687c.requireView();
            if (viewRequireView2.getParent() == null) {
                uVar.a();
                viewRequireView2.setAlpha(0.0f);
            }
            if (viewRequireView2.getAlpha() == 0.0f && viewRequireView2.getVisibility() == 0) {
                viewRequireView2.setVisibility(4);
            }
            viewRequireView2.setAlpha(fragment2.getPostOnViewCreatedAlpha());
        }
    }

    public b0(@NonNull ViewGroup viewGroup) {
        this.f21673a = viewGroup;
    }

    @NonNull
    public static b0 f(@NonNull ViewGroup viewGroup, @NonNull FragmentManager fragmentManager) {
        return g(viewGroup, fragmentManager.y());
    }

    @NonNull
    public static b0 g(@NonNull ViewGroup viewGroup, @NonNull c0 c0Var) {
        int i10 = R.id.special_effects_controller_view_tag;
        Object tag = viewGroup.getTag(i10);
        if (tag instanceof b0) {
            return (b0) tag;
        }
        ((FragmentManager.c) c0Var).getClass();
        androidx.fragment.app.c cVar = new androidx.fragment.app.c(viewGroup);
        viewGroup.setTag(i10, cVar);
        return cVar;
    }

    public final void a(@NonNull e.c cVar, @NonNull e.b bVar, @NonNull u uVar) {
        synchronized (this.f21674b) {
            try {
                CancellationSignal cancellationSignal = new CancellationSignal();
                e eVarD = d(uVar.f21771c);
                if (eVarD != null) {
                    eVarD.c(cVar, bVar);
                    return;
                }
                d dVar = new d(cVar, bVar, uVar, cancellationSignal);
                this.f21674b.add(dVar);
                dVar.f21688d.add(new a(dVar));
                dVar.f21688d.add(new b(dVar));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract void b(@NonNull ArrayList arrayList, boolean z10);

    public final void c() {
        if (this.f21677e) {
            return;
        }
        if (!ViewCompat.isAttachedToWindow(this.f21673a)) {
            e();
            this.f21676d = false;
            return;
        }
        synchronized (this.f21674b) {
            try {
                if (!this.f21674b.isEmpty()) {
                    ArrayList<e> arrayList = new ArrayList(this.f21675c);
                    this.f21675c.clear();
                    for (e eVar : arrayList) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            Objects.toString(eVar);
                        }
                        eVar.a();
                        if (!eVar.f21691g) {
                            this.f21675c.add(eVar);
                        }
                    }
                    i();
                    ArrayList arrayList2 = new ArrayList(this.f21674b);
                    this.f21674b.clear();
                    this.f21675c.addAll(arrayList2);
                    FragmentManager.isLoggingEnabled(2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((e) it.next()).d();
                    }
                    b(arrayList2, this.f21676d);
                    this.f21676d = false;
                    FragmentManager.isLoggingEnabled(2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Nullable
    public final e d(@NonNull Fragment fragment) {
        for (e eVar : this.f21674b) {
            if (eVar.f21687c.equals(fragment) && !eVar.f21690f) {
                return eVar;
            }
        }
        return null;
    }

    public final void e() {
        FragmentManager.isLoggingEnabled(2);
        boolean zIsAttachedToWindow = ViewCompat.isAttachedToWindow(this.f21673a);
        synchronized (this.f21674b) {
            try {
                i();
                Iterator<e> it = this.f21674b.iterator();
                while (it.hasNext()) {
                    it.next().d();
                }
                for (e eVar : new ArrayList(this.f21675c)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f21673a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(eVar);
                    }
                    eVar.a();
                }
                for (e eVar2 : new ArrayList(this.f21674b)) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        if (!zIsAttachedToWindow) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append("Container ");
                            sb3.append(this.f21673a);
                            sb3.append(" is not attached to window. ");
                        }
                        Objects.toString(eVar2);
                    }
                    eVar2.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.f21674b) {
            try {
                i();
                this.f21677e = false;
                for (int size = this.f21674b.size() - 1; size >= 0; size--) {
                    e eVar = this.f21674b.get(size);
                    e.c cVarC = e.c.c(eVar.f21687c.mView);
                    e.c cVar = eVar.f21685a;
                    e.c cVar2 = e.c.VISIBLE;
                    if (cVar == cVar2 && cVarC != cVar2) {
                        this.f21677e = eVar.f21687c.isPostponed();
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void i() {
        for (e eVar : this.f21674b) {
            if (eVar.f21686b == e.b.ADDING) {
                eVar.c(e.c.b(eVar.f21687c.requireView().getVisibility()), e.b.NONE);
            }
        }
    }

    /* JADX INFO: compiled from: SpecialEffectsController.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public c f21685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public b f21686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final Fragment f21687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        public final ArrayList f21688d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public final HashSet<CancellationSignal> f21689e = new HashSet<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f21690f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f21691g = false;

        /* JADX INFO: compiled from: SpecialEffectsController.java */
        public class a implements CancellationSignal.OnCancelListener {
            public a() {
            }

            @Override // androidx.core.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                e.this.a();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: SpecialEffectsController.java */
        public static final class b {
            private static final /* synthetic */ b[] $VALUES;
            public static final b ADDING;
            public static final b NONE;
            public static final b REMOVING;

            static {
                b bVar = new b(ExpectedUserActionOnPoiTypes.NONE, 0);
                NONE = bVar;
                b bVar2 = new b("ADDING", 1);
                ADDING = bVar2;
                b bVar3 = new b("REMOVING", 2);
                REMOVING = bVar3;
                $VALUES = new b[]{bVar, bVar2, bVar3};
            }

            public b() {
                throw null;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: compiled from: SpecialEffectsController.java */
        public static final class c {
            private static final /* synthetic */ c[] $VALUES;
            public static final c GONE;
            public static final c INVISIBLE;
            public static final c REMOVED;
            public static final c VISIBLE;

            static {
                c cVar = new c("REMOVED", 0);
                REMOVED = cVar;
                c cVar2 = new c("VISIBLE", 1);
                VISIBLE = cVar2;
                c cVar3 = new c("GONE", 2);
                GONE = cVar3;
                c cVar4 = new c("INVISIBLE", 3);
                INVISIBLE = cVar4;
                $VALUES = new c[]{cVar, cVar2, cVar3, cVar4};
            }

            public c() {
                throw null;
            }

            @NonNull
            public static c b(int i10) {
                if (i10 == 0) {
                    return VISIBLE;
                }
                if (i10 == 4) {
                    return INVISIBLE;
                }
                if (i10 == 8) {
                    return GONE;
                }
                throw new IllegalArgumentException(g0.c("Unknown visibility ", i10));
            }

            @NonNull
            public static c c(@NonNull View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : b(view.getVisibility());
            }

            public static c valueOf(String str) {
                return (c) Enum.valueOf(c.class, str);
            }

            public static c[] values() {
                return (c[]) $VALUES.clone();
            }

            public final void a(@NonNull View view) {
                int i10 = c.f21682a[ordinal()];
                if (i10 == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.isLoggingEnabled(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(0);
                } else if (i10 == 3) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i10 != 4) {
                        return;
                    }
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }
        }

        public e(@NonNull c cVar, @NonNull b bVar, @NonNull Fragment fragment, @NonNull CancellationSignal cancellationSignal) {
            this.f21685a = cVar;
            this.f21686b = bVar;
            this.f21687c = fragment;
            cancellationSignal.setOnCancelListener(new a());
        }

        public final void a() {
            if (this.f21690f) {
                return;
            }
            this.f21690f = true;
            HashSet<CancellationSignal> hashSet = this.f21689e;
            if (hashSet.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(hashSet).iterator();
            while (it.hasNext()) {
                ((CancellationSignal) it.next()).cancel();
            }
        }

        @CallSuper
        public void b() {
            if (this.f21691g) {
                return;
            }
            if (FragmentManager.isLoggingEnabled(2)) {
                toString();
            }
            this.f21691g = true;
            Iterator it = this.f21688d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }

        public final void c(@NonNull c cVar, @NonNull b bVar) {
            int i10 = c.f21683b[bVar.ordinal()];
            Fragment fragment = this.f21687c;
            if (i10 == 1) {
                if (this.f21685a == c.REMOVED) {
                    if (FragmentManager.isLoggingEnabled(2)) {
                        Objects.toString(fragment);
                        Objects.toString(this.f21686b);
                    }
                    this.f21685a = c.VISIBLE;
                    this.f21686b = b.ADDING;
                    return;
                }
                return;
            }
            if (i10 == 2) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.f21685a);
                    Objects.toString(this.f21686b);
                }
                this.f21685a = c.REMOVED;
                this.f21686b = b.REMOVING;
                return;
            }
            if (i10 == 3 && this.f21685a != c.REMOVED) {
                if (FragmentManager.isLoggingEnabled(2)) {
                    Objects.toString(fragment);
                    Objects.toString(this.f21685a);
                    Objects.toString(cVar);
                }
                this.f21685a = cVar;
            }
        }

        @NonNull
        public final String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f21685a + "} {mLifecycleImpact = " + this.f21686b + "} {mFragment = " + this.f21687c + "}";
        }

        public void d() {
        }
    }
}
