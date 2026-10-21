package androidx.fragment.app.strictmode;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.app.h;
import androidx.camera.core.o1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bk.q;
import bk.w;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FragmentStrictMode.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003%&'B\t\b\u0002¢\u0006\u0004\b#\u0010$J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u001a\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0007J \u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0007J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0007R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006("}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "Landroidx/fragment/app/Fragment;", "fragment", "", "previousFragmentId", "", "onFragmentReuse", "Landroid/view/ViewGroup;", "container", "onFragmentTagUsage", "onSetRetainInstanceUsage", "onGetRetainInstanceUsage", "", "isVisibleToUser", "onSetUserVisibleHint", "violatingFragment", "targetFragment", "", "requestCode", "onSetTargetFragmentUsage", "onGetTargetFragmentUsage", "onGetTargetFragmentRequestCodeUsage", "onWrongFragmentContainer", "Landroidx/fragment/app/strictmode/Violation;", "violation", "onPolicyViolation", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "a", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "getDefaultPolicy", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "setDefaultPolicy", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;)V", "defaultPolicy", "<init>", "()V", "Flag", "OnViolationListener", "Policy", "fragment_release"}, k = 1, mv = {1, 5, 1})
public final class FragmentStrictMode {

    @NotNull
    public static final FragmentStrictMode INSTANCE = new FragmentStrictMode();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static Policy defaultPolicy = Policy.LAX;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 5, 1})
    public static final class Flag {
        private static final /* synthetic */ Flag[] $VALUES;
        public static final Flag DETECT_FRAGMENT_REUSE;
        public static final Flag DETECT_FRAGMENT_TAG_USAGE;
        public static final Flag DETECT_RETAIN_INSTANCE_USAGE;
        public static final Flag DETECT_SET_USER_VISIBLE_HINT;
        public static final Flag DETECT_TARGET_FRAGMENT_USAGE;
        public static final Flag DETECT_WRONG_FRAGMENT_CONTAINER;
        public static final Flag PENALTY_DEATH;
        public static final Flag PENALTY_LOG;

        static {
            Flag flag = new Flag("PENALTY_LOG", 0);
            PENALTY_LOG = flag;
            Flag flag2 = new Flag("PENALTY_DEATH", 1);
            PENALTY_DEATH = flag2;
            Flag flag3 = new Flag("DETECT_FRAGMENT_REUSE", 2);
            DETECT_FRAGMENT_REUSE = flag3;
            Flag flag4 = new Flag("DETECT_FRAGMENT_TAG_USAGE", 3);
            DETECT_FRAGMENT_TAG_USAGE = flag4;
            Flag flag5 = new Flag("DETECT_RETAIN_INSTANCE_USAGE", 4);
            DETECT_RETAIN_INSTANCE_USAGE = flag5;
            Flag flag6 = new Flag("DETECT_SET_USER_VISIBLE_HINT", 5);
            DETECT_SET_USER_VISIBLE_HINT = flag6;
            Flag flag7 = new Flag("DETECT_TARGET_FRAGMENT_USAGE", 6);
            DETECT_TARGET_FRAGMENT_USAGE = flag7;
            Flag flag8 = new Flag("DETECT_WRONG_FRAGMENT_CONTAINER", 7);
            DETECT_WRONG_FRAGMENT_CONTAINER = flag8;
            $VALUES = new Flag[]{flag, flag2, flag3, flag4, flag5, flag6, flag7, flag8};
        }

        public Flag() {
            throw null;
        }

        public static Flag valueOf(String str) {
            return (Flag) Enum.valueOf(Flag.class, str);
        }

        public static Flag[] values() {
            return (Flag[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "", "onViolation", "", "violation", "Landroidx/fragment/app/strictmode/Violation;", "fragment_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface OnViolationListener {
        void onViolation(@NotNull Violation violation);
    }

    /* JADX INFO: compiled from: FragmentStrictMode.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0006\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001d\u001cBK\b\u0000\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012(\u0010\u0019\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00100\u00180\u000f¢\u0006\u0004\b\u001a\u0010\u001bR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR<\u0010\u0017\u001a$\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00120\u00100\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "a", "Ljava/util/Set;", "getFlags$fragment_release", "()Ljava/util/Set;", "flags", "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "b", "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "getListener$fragment_release", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "Landroidx/fragment/app/strictmode/Violation;", "c", "Ljava/util/Map;", "getMAllowedViolations$fragment_release", "()Ljava/util/Map;", "mAllowedViolations", "", "allowedViolations", "<init>", "(Ljava/util/Set;Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;Ljava/util/Map;)V", "Companion", "Builder", "fragment_release"}, k = 1, mv = {1, 5, 1})
    public static final class Policy {

        @JvmField
        @NotNull
        public static final Policy LAX = new Policy(w.emptySet(), null, q.emptyMap());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Set<Flag> flags;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final OnViolationListener listener;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final LinkedHashMap f21752c;

        /* JADX INFO: compiled from: FragmentStrictMode.kt */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0002\u001a\u00020\u0000H\u0007J\b\u0010\u0003\u001a\u00020\u0000H\u0007J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0000H\u0007J\b\u0010\b\u001a\u00020\u0000H\u0007J\b\u0010\t\u001a\u00020\u0000H\u0007J\b\u0010\n\u001a\u00020\u0000H\u0007J\b\u0010\u000b\u001a\u00020\u0000H\u0007J\b\u0010\f\u001a\u00020\u0000H\u0007J(\u0010\u0012\u001a\u00020\u00002\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r2\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100\rH\u0007J\u0006\u0010\u0014\u001a\u00020\u0013¨\u0006\u0017"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "", "penaltyLog", "penaltyDeath", "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "penaltyListener", "detectFragmentReuse", "detectFragmentTagUsage", "detectRetainInstanceUsage", "detectSetUserVisibleHint", "detectTargetFragmentUsage", "detectWrongFragmentContainer", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "fragmentClass", "Landroidx/fragment/app/strictmode/Violation;", "violationClass", "allowViolation", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "<init>", "()V", "fragment_release"}, k = 1, mv = {1, 5, 1})
        public static final class Builder {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @Nullable
            public OnViolationListener f21754b;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @NotNull
            public final LinkedHashSet f21753a = new LinkedHashSet();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NotNull
            public final LinkedHashMap f21755c = new LinkedHashMap();

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder allowViolation(@NotNull Class<? extends Fragment> fragmentClass, @NotNull Class<? extends Violation> violationClass) {
                Intrinsics.checkNotNullParameter(fragmentClass, "fragmentClass");
                Intrinsics.checkNotNullParameter(violationClass, "violationClass");
                LinkedHashMap linkedHashMap = this.f21755c;
                Set linkedHashSet = (Set) linkedHashMap.get(fragmentClass);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.add(violationClass);
                linkedHashMap.put(fragmentClass, linkedHashSet);
                return this;
            }

            @NotNull
            public final Policy build() {
                OnViolationListener onViolationListener = this.f21754b;
                LinkedHashSet linkedHashSet = this.f21753a;
                if (onViolationListener == null && !linkedHashSet.contains(Flag.PENALTY_DEATH)) {
                    penaltyLog();
                }
                return new Policy(linkedHashSet, this.f21754b, this.f21755c);
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectFragmentReuse() {
                this.f21753a.add(Flag.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectFragmentTagUsage() {
                this.f21753a.add(Flag.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectRetainInstanceUsage() {
                this.f21753a.add(Flag.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectSetUserVisibleHint() {
                this.f21753a.add(Flag.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectTargetFragmentUsage() {
                this.f21753a.add(Flag.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectWrongFragmentContainer() {
                this.f21753a.add(Flag.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder penaltyDeath() {
                this.f21753a.add(Flag.PENALTY_DEATH);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder penaltyListener(@NotNull OnViolationListener listener) {
                Intrinsics.checkNotNullParameter(listener, "listener");
                this.f21754b = listener;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder penaltyLog() {
                this.f21753a.add(Flag.PENALTY_LOG);
                return this;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Policy(@NotNull Set<? extends Flag> flags, @Nullable OnViolationListener onViolationListener, @NotNull Map<Class<? extends Fragment>, ? extends Set<Class<? extends Violation>>> allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.flags = flags;
            this.listener = onViolationListener;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<Class<? extends Fragment>, ? extends Set<Class<? extends Violation>>> entry : allowedViolations.entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            this.f21752c = linkedHashMap;
        }

        @NotNull
        public final Set<Flag> getFlags$fragment_release() {
            return this.flags;
        }

        @Nullable
        /* JADX INFO: renamed from: getListener$fragment_release, reason: from getter */
        public final OnViolationListener getListener() {
            return this.listener;
        }

        @NotNull
        public final Map<Class<? extends Fragment>, Set<Class<? extends Violation>>> getMAllowedViolations$fragment_release() {
            return this.f21752c;
        }
    }

    public static Policy a(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                if (parentFragmentManager.getStrictModePolicy() != null) {
                    Policy strictModePolicy = parentFragmentManager.getStrictModePolicy();
                    Intrinsics.checkNotNull(strictModePolicy);
                    Intrinsics.checkNotNullExpressionValue(strictModePolicy, "fragmentManager.strictModePolicy!!");
                    return strictModePolicy;
                }
            }
            fragment = fragment.getParentFragment();
        }
        return defaultPolicy;
    }

    public static void b(Policy policy, Violation violation) {
        Fragment fragment = violation.getFragment();
        String name = fragment.getClass().getName();
        if (policy.getFlags$fragment_release().contains(Flag.PENALTY_LOG)) {
            Intrinsics.stringPlus("Policy violation in ", name);
        }
        if (policy.getListener() != null) {
            d(fragment, new h(policy, violation, 5));
        }
        if (policy.getFlags$fragment_release().contains(Flag.PENALTY_DEATH)) {
            d(fragment, new o1(name, violation, 3));
        }
    }

    public static void c(Violation violation) {
        if (FragmentManager.isLoggingEnabled(3)) {
            Intrinsics.stringPlus("StrictMode violation in ", violation.getFragment().getClass().getName());
        }
    }

    public static void d(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handler = fragment.getParentFragmentManager().getHost().getHandler();
        Intrinsics.checkNotNullExpressionValue(handler, "fragment.parentFragmentManager.host.handler");
        if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static boolean e(Policy policy, Class cls, Class cls2) {
        Set<Class<? extends Violation>> set = policy.getMAllowedViolations$fragment_release().get(cls);
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), Violation.class) || !CollectionsKt___CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onFragmentReuse(@NotNull Fragment fragment, @NotNull String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        INSTANCE.getClass();
        c(fragmentReuseViolation);
        Policy policyA = a(fragment);
        if (policyA.getFlags$fragment_release().contains(Flag.DETECT_FRAGMENT_REUSE) && e(policyA, fragment.getClass(), FragmentReuseViolation.class)) {
            b(policyA, fragmentReuseViolation);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onFragmentTagUsage(@NotNull Fragment fragment, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation = new FragmentTagUsageViolation(fragment, container);
        INSTANCE.getClass();
        c(fragmentTagUsageViolation);
        Policy policyA = a(fragment);
        if (policyA.getFlags$fragment_release().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && e(policyA, fragment.getClass(), FragmentTagUsageViolation.class)) {
            b(policyA, fragmentTagUsageViolation);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onGetRetainInstanceUsage(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation = new GetRetainInstanceUsageViolation(fragment);
        INSTANCE.getClass();
        c(getRetainInstanceUsageViolation);
        Policy policyA = a(fragment);
        if (policyA.getFlags$fragment_release().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && e(policyA, fragment.getClass(), GetRetainInstanceUsageViolation.class)) {
            b(policyA, getRetainInstanceUsageViolation);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onGetTargetFragmentRequestCodeUsage(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation = new GetTargetFragmentRequestCodeUsageViolation(fragment);
        INSTANCE.getClass();
        c(getTargetFragmentRequestCodeUsageViolation);
        Policy policyA = a(fragment);
        if (policyA.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && e(policyA, fragment.getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            b(policyA, getTargetFragmentRequestCodeUsageViolation);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onGetTargetFragmentUsage(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation = new GetTargetFragmentUsageViolation(fragment);
        INSTANCE.getClass();
        c(getTargetFragmentUsageViolation);
        Policy policyA = a(fragment);
        if (policyA.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && e(policyA, fragment.getClass(), GetTargetFragmentUsageViolation.class)) {
            b(policyA, getTargetFragmentUsageViolation);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onSetRetainInstanceUsage(@NotNull Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation = new SetRetainInstanceUsageViolation(fragment);
        INSTANCE.getClass();
        c(setRetainInstanceUsageViolation);
        Policy policyA = a(fragment);
        if (policyA.getFlags$fragment_release().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && e(policyA, fragment.getClass(), SetRetainInstanceUsageViolation.class)) {
            b(policyA, setRetainInstanceUsageViolation);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onSetTargetFragmentUsage(@NotNull Fragment violatingFragment, @NotNull Fragment targetFragment, int requestCode) {
        Intrinsics.checkNotNullParameter(violatingFragment, "violatingFragment");
        Intrinsics.checkNotNullParameter(targetFragment, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation = new SetTargetFragmentUsageViolation(violatingFragment, targetFragment, requestCode);
        INSTANCE.getClass();
        c(setTargetFragmentUsageViolation);
        Policy policyA = a(violatingFragment);
        if (policyA.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && e(policyA, violatingFragment.getClass(), SetTargetFragmentUsageViolation.class)) {
            b(policyA, setTargetFragmentUsageViolation);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onSetUserVisibleHint(@NotNull Fragment fragment, boolean isVisibleToUser) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation = new SetUserVisibleHintViolation(fragment, isVisibleToUser);
        INSTANCE.getClass();
        c(setUserVisibleHintViolation);
        Policy policyA = a(fragment);
        if (policyA.getFlags$fragment_release().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && e(policyA, fragment.getClass(), SetUserVisibleHintViolation.class)) {
            b(policyA, setUserVisibleHintViolation);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void onWrongFragmentContainer(@NotNull Fragment fragment, @NotNull ViewGroup container) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(container, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation = new WrongFragmentContainerViolation(fragment, container);
        INSTANCE.getClass();
        c(wrongFragmentContainerViolation);
        Policy policyA = a(fragment);
        if (policyA.getFlags$fragment_release().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && e(policyA, fragment.getClass(), WrongFragmentContainerViolation.class)) {
            b(policyA, wrongFragmentContainerViolation);
        }
    }

    @NotNull
    public final Policy getDefaultPolicy() {
        return defaultPolicy;
    }

    @VisibleForTesting
    public final void onPolicyViolation(@NotNull Violation violation) {
        Intrinsics.checkNotNullParameter(violation, "violation");
        c(violation);
        Fragment fragment = violation.getFragment();
        Policy policyA = a(fragment);
        if (e(policyA, fragment.getClass(), violation.getClass())) {
            b(policyA, violation);
        }
    }

    public final void setDefaultPolicy(@NotNull Policy policy) {
        Intrinsics.checkNotNullParameter(policy, "<set-?>");
        defaultPolicy = policy;
    }
}
