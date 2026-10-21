package androidx.activity;

import androidx.annotation.MainThread;
import com.bbva.plugin.localstorage.command.RemoveCommand;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: OnBackPressedCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001e\u001a\u00020\u000e¢\u0006\u0004\b\u001f\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017J\b\u0010\b\u001a\u00020\u0002H'J\b\u0010\t\u001a\u00020\u0002H\u0017J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0001J\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0001R*\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8G@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R*\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "", RemoveCommand.ID, "Landroidx/activity/BackEventCompat;", "backEvent", "handleOnBackStarted", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "Landroidx/activity/Cancellable;", "cancellable", "addCancellable", "removeCancellable", "", "value", "a", "Z", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lkotlin/Function0;", "c", "Lkotlin/jvm/functions/Function0;", "getEnabledChangedCallback$activity_release", "()Lkotlin/jvm/functions/Function0;", "setEnabledChangedCallback$activity_release", "(Lkotlin/jvm/functions/Function0;)V", "enabledChangedCallback", "enabled", "<init>", "activity_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nOnBackPressedCallback.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,115:1\n1855#2,2:116\n*S KotlinDebug\n*F\n+ 1 OnBackPressedCallback.kt\nandroidx/activity/OnBackPressedCallback\n*L\n67#1:116,2\n*E\n"})
public abstract class OnBackPressedCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CopyOnWriteArrayList<Cancellable> f329b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> enabledChangedCallback;

    public OnBackPressedCallback(boolean z10) {
        this.isEnabled = z10;
    }

    @JvmName(name = "addCancellable")
    public final void addCancellable(@NotNull Cancellable cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f329b.add(cancellable);
    }

    @Nullable
    public final Function0<Unit> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    @MainThread
    public abstract void handleOnBackPressed();

    @MainThread
    public void handleOnBackProgressed(@NotNull BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    @MainThread
    public void handleOnBackStarted(@NotNull BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    @MainThread
    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    @MainThread
    public final void remove() {
        Iterator<T> it = this.f329b.iterator();
        while (it.hasNext()) {
            ((Cancellable) it.next()).cancel();
        }
    }

    @JvmName(name = "removeCancellable")
    public final void removeCancellable(@NotNull Cancellable cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f329b.remove(cancellable);
    }

    @MainThread
    public final void setEnabled(boolean z10) {
        this.isEnabled = z10;
        Function0<Unit> function0 = this.enabledChangedCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setEnabledChangedCallback$activity_release(@Nullable Function0<Unit> function0) {
        this.enabledChangedCallback = function0;
    }

    @MainThread
    public void handleOnBackCancelled() {
    }
}
