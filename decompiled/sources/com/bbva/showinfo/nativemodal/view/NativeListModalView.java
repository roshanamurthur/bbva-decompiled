package com.bbva.showinfo.nativemodal.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bbva.showinfo.R;
import com.bbva.showinfo.databinding.NativeListModalBinding;
import com.bbva.showinfo.nativemodal.modal.NativeListModalConfiguration;
import com.bbva.showinfo.nativemodal.modal.NativeListModalState;
import com.bbva.showinfo.nativemodal.view.adapter.NativeListModalAdapter;
import com.bbva.showinfo.nativemodal.view.decorator.DividerItemDecorator;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zb.a;
import zb.b;

/* JADX INFO: compiled from: NativeListModalView.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/bbva/showinfo/nativemodal/view/NativeListModalView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/showinfo/nativemodal/view/NativeListModalViewModel;", "q0", "Lcom/bbva/showinfo/nativemodal/view/NativeListModalViewModel;", "getViewModel", "()Lcom/bbva/showinfo/nativemodal/view/NativeListModalViewModel;", "viewModel", "Landroidx/recyclerview/widget/RecyclerView;", "getRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "showinfo_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nNativeListModalView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeListModalView.kt\ncom/bbva/showinfo/nativemodal/view/NativeListModalView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
public final class NativeListModalView extends ConstraintLayout implements CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f36553p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NativeListModalViewModel viewModel;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final NativeListModalBinding f36555r0;

    /* JADX INFO: compiled from: NativeListModalView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/bbva/showinfo/nativemodal/view/NativeListModalView$Companion;", "", "<init>", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Context access$getContextThemeWrapper(Companion companion, Context context) {
            companion.getClass();
            return new ContextThemeWrapper(context, R.style.NativeListModal);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NativeListModalView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final void access$updateView(NativeListModalView nativeListModalView, NativeListModalState nativeListModalState) {
        nativeListModalView.getClass();
        if (nativeListModalState instanceof NativeListModalState.Loading) {
            nativeListModalView.setVisibility(8);
            return;
        }
        if (nativeListModalState instanceof NativeListModalState.Ready) {
            NativeListModalConfiguration nativeListModalConfiguration = ((NativeListModalState.Ready) nativeListModalState).getNativeListModalConfiguration();
            nativeListModalView.setVisibility(0);
            NativeListModalViewModel nativeListModalViewModel = nativeListModalView.viewModel;
            if (nativeListModalConfiguration != null) {
                nativeListModalViewModel.setConfig(nativeListModalConfiguration);
            }
            nativeListModalView.getRecycler().setAdapter(new NativeListModalAdapter(nativeListModalViewModel));
        }
    }

    private final RecyclerView getRecycler() {
        RecyclerView nativeListModalList = this.f36555r0.nativeListModalList;
        Intrinsics.checkNotNullExpressionValue(nativeListModalList, "nativeListModalList");
        return nativeListModalList;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f36553p0.getCoroutineContext();
    }

    @NotNull
    public final NativeListModalViewModel getViewModel() {
        return this.viewModel;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NativeListModalView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ NativeListModalView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NativeListModalView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(Companion.access$getContextThemeWrapper(INSTANCE, context), attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f36553p0 = CoroutineScopeKt.MainScope();
        this.viewModel = new NativeListModalViewModel();
        NativeListModalBinding nativeListModalBindingInflate = NativeListModalBinding.inflate(LayoutInflater.from(getContext()), this);
        Intrinsics.checkNotNullExpressionValue(nativeListModalBindingInflate, "inflate(...)");
        this.f36555r0 = nativeListModalBindingInflate;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.NativeListModal, i10, 0);
        try {
            Intrinsics.checkNotNull(typedArrayObtainStyledAttributes);
            setBackgroundColor(typedArrayObtainStyledAttributes.getColor(R.styleable.NativeListModal_nativeListModal_dialogBackground, ContextCompat.getColor(getContext(), R.color.native_list_modal_dialog_background)));
            typedArrayObtainStyledAttributes.recycle();
            setOnClickListener(new a(this, 0));
            Drawable drawable = ContextCompat.getDrawable(getContext(), R.drawable.divider);
            DividerItemDecorator dividerItemDecorator = drawable != null ? new DividerItemDecorator(drawable) : null;
            if (dividerItemDecorator != null) {
                nativeListModalBindingInflate.nativeListModalList.addItemDecoration(dividerItemDecorator);
            }
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(this, null), 3, null);
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }
}
