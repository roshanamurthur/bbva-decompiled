package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.platform.l1;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidView.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\u00020\u0004BC\b\u0016\u0012\u0006\u0010'\u001a\u00020&\u0012\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00028\u00000\u0012\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR(\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010RB\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019RB\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019RB\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00122\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00130\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u0014\u0010%\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00061"}, d2 = {"Landroidx/compose/ui/viewinterop/ViewFactoryHolder;", "Landroid/view/View;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/platform/ViewRootForInspector;", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Q0", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "getDispatcher", "()Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "value", "S0", "Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;", "setSavableRegistryEntry", "(Landroidx/compose/runtime/saveable/SaveableStateRegistry$Entry;)V", "savableRegistryEntry", "Lkotlin/Function1;", "", "T0", "Lkotlin/jvm/functions/Function1;", "getUpdateBlock", "()Lkotlin/jvm/functions/Function1;", "setUpdateBlock", "(Lkotlin/jvm/functions/Function1;)V", "updateBlock", "U0", "getResetBlock", "setResetBlock", "resetBlock", "V0", "getReleaseBlock", "setReleaseBlock", "releaseBlock", "getViewRoot", "()Landroid/view/View;", "viewRoot", "Landroid/content/Context;", "context", "factory", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/saveable/SaveableStateRegistry;", "saveStateRegistry", "", "compositeKeyHash", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/saveable/SaveableStateRegistry;I)V", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidView.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidView.android.kt\nandroidx/compose/ui/viewinterop/ViewFactoryHolder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1#2:399\n*E\n"})
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {

    @NotNull
    public final T P0;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    @NotNull
    public final NestedScrollDispatcher dispatcher;

    @Nullable
    public final SaveableStateRegistry R0;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    @Nullable
    public SaveableStateRegistry.Entry savableRegistryEntry;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    @NotNull
    public Function1<? super T, Unit> updateBlock;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    @NotNull
    public Function1<? super T, Unit> resetBlock;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    @NotNull
    public Function1<? super T, Unit> releaseBlock;

    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewFactoryHolder<T> f18393p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f18393p0 = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ViewFactoryHolder<T> viewFactoryHolder = this.f18393p0;
            viewFactoryHolder.getReleaseBlock().invoke(viewFactoryHolder.P0);
            viewFactoryHolder.setSavableRegistryEntry(null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class b extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewFactoryHolder<T> f18394p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f18394p0 = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ViewFactoryHolder<T> viewFactoryHolder = this.f18394p0;
            viewFactoryHolder.getResetBlock().invoke(viewFactoryHolder.P0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: AndroidView.android.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ ViewFactoryHolder<T> f18395p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewFactoryHolder<T> viewFactoryHolder) {
            super(0);
            this.f18395p0 = viewFactoryHolder;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ViewFactoryHolder<T> viewFactoryHolder = this.f18395p0;
            viewFactoryHolder.getUpdateBlock().invoke(viewFactoryHolder.P0);
            return Unit.INSTANCE;
        }
    }

    public ViewFactoryHolder() {
        throw null;
    }

    public /* synthetic */ ViewFactoryHolder(Context context, Function1 function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function1, (i11 & 4) != 0 ? null : compositionContext, saveableStateRegistry, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    @NotNull
    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    @NotNull
    public final Function1<T, Unit> getReleaseBlock() {
        return this.releaseBlock;
    }

    @NotNull
    public final Function1<T, Unit> getResetBlock() {
        return this.resetBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public final /* synthetic */ AbstractComposeView getSubCompositionView() {
        return l1.a(this);
    }

    @NotNull
    public final Function1<T, Unit> getUpdateBlock() {
        return this.updateBlock;
    }

    public final void setReleaseBlock(@NotNull Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.releaseBlock = value;
        setRelease(new a(this));
    }

    public final void setResetBlock(@NotNull Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.resetBlock = value;
        setReset(new b(this));
    }

    public final void setUpdateBlock(@NotNull Function1<? super T, Unit> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.updateBlock = value;
        setUpdate(new c(this));
    }

    public ViewFactoryHolder(@NotNull Context context, @NotNull Function1<? super Context, ? extends T> factory, @Nullable CompositionContext compositionContext, @Nullable SaveableStateRegistry saveableStateRegistry, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(factory, "factory");
        T tInvoke = factory.invoke(context);
        NestedScrollDispatcher nestedScrollDispatcher = new NestedScrollDispatcher();
        super(context, compositionContext, i10, nestedScrollDispatcher, tInvoke);
        this.P0 = tInvoke;
        this.dispatcher = nestedScrollDispatcher;
        this.R0 = saveableStateRegistry;
        setClipChildren(false);
        String strValueOf = String.valueOf(i10);
        Object objConsumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(strValueOf) : null;
        SparseArray<Parcelable> sparseArray = objConsumeRestored instanceof SparseArray ? (SparseArray) objConsumeRestored : null;
        if (sparseArray != null) {
            tInvoke.restoreHierarchyState(sparseArray);
        }
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.registerProvider(strValueOf, new y1.b(this)));
        }
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    @NotNull
    public View getViewRoot() {
        return this;
    }
}
