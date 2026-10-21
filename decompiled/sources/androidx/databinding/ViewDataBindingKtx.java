package androidx.databinding;

import androidx.annotation.RestrictTo;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ViewDataBindingKtx.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006H\u0007¨\u0006\r"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx;", "", "Landroidx/databinding/ViewDataBinding;", "viewDataBinding", "", "localFieldId", "Lkotlinx/coroutines/flow/Flow;", "observable", "", "updateStateFlowRegistration", "<init>", "()V", "StateFlowListener", "databindingKtx_release"}, k = 1, mv = {1, 9, 0})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ViewDataBindingKtx {

    @NotNull
    public static final ViewDataBindingKtx INSTANCE = new ViewDataBindingKtx();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final f f20561a = new f();

    /* JADX INFO: compiled from: ViewDataBindingKtx.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001B'\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u001a\u0010\t\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002H\u0016J\u0012\u0010\f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¨\u0006\u0015"}, d2 = {"Landroidx/databinding/ViewDataBindingKtx$StateFlowListener;", "Landroidx/databinding/d;", "Lkotlinx/coroutines/flow/Flow;", "", "Landroidx/databinding/h;", "getListener", "target", "", "addListener", "removeListener", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "setLifecycleOwner", "Landroidx/databinding/ViewDataBinding;", "binder", "", "localFieldId", "Ljava/lang/ref/ReferenceQueue;", "referenceQueue", "<init>", "(Landroidx/databinding/ViewDataBinding;ILjava/lang/ref/ReferenceQueue;)V", "databindingKtx_release"}, k = 1, mv = {1, 9, 0})
    public static final class StateFlowListener implements d<Flow<? extends Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public WeakReference<LifecycleOwner> f20562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Job f20563b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        public final h<Flow<Object>> f20564c;

        public StateFlowListener(@Nullable ViewDataBinding viewDataBinding, int i10, @NotNull ReferenceQueue<ViewDataBinding> referenceQueue) {
            Intrinsics.checkNotNullParameter(referenceQueue, "referenceQueue");
            this.f20564c = new h<>(viewDataBinding, i10, this, referenceQueue);
        }

        @NotNull
        public h<Flow<Object>> getListener() {
            return this.f20564c;
        }

        @Override // androidx.databinding.d
        public void setLifecycleOwner(@Nullable LifecycleOwner lifecycleOwner) {
            WeakReference<LifecycleOwner> weakReference = this.f20562a;
            if ((weakReference != null ? weakReference.get() : null) == lifecycleOwner) {
                return;
            }
            Job job = this.f20563b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            if (lifecycleOwner == null) {
                this.f20562a = null;
                return;
            }
            this.f20562a = new WeakReference<>(lifecycleOwner);
            Flow<Object> flow = this.f20564c.f20628c;
            if (flow != null) {
                Job job2 = this.f20563b;
                if (job2 != null) {
                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                }
                this.f20563b = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new g(lifecycleOwner, flow, this, null), 3, null);
            }
        }

        @Override // androidx.databinding.d
        public void addListener(@Nullable Flow<? extends Object> target) {
            LifecycleOwner lifecycleOwner;
            WeakReference<LifecycleOwner> weakReference = this.f20562a;
            if (weakReference == null || (lifecycleOwner = weakReference.get()) == null || target == null) {
                return;
            }
            Job job = this.f20563b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f20563b = BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), null, null, new g(lifecycleOwner, target, this, null), 3, null);
        }

        @Override // androidx.databinding.d
        public void removeListener(@Nullable Flow<? extends Object> target) {
            Job job = this.f20563b;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            this.f20563b = null;
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final boolean updateStateFlowRegistration(@NotNull ViewDataBinding viewDataBinding, int localFieldId, @Nullable Flow<?> observable) {
        Intrinsics.checkNotNullParameter(viewDataBinding, "viewDataBinding");
        viewDataBinding.mInStateFlowRegisterObserver = true;
        try {
            return viewDataBinding.updateRegistration(localFieldId, observable, f20561a);
        } finally {
            viewDataBinding.mInStateFlowRegisterObserver = false;
        }
    }
}
