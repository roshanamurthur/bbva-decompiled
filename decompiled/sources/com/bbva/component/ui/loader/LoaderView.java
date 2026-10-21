package com.bbva.component.ui.loader;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import com.bbva.cells.component.kit.ui.helper.ContextHelper;
import com.bbva.cells.component.kit.ui.helper.PropertiesHelper;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.cellscore.app.CellsViewModelProviders;
import com.bbva.component.ui.loader.behavior.LoaderBehavior;
import com.bbva.component.ui.loader.behavior.SpinnerBehavior;
import com.bbva.component.ui.loader.behavior.ViewBehavior;
import com.bbva.component.ui.loader.config.ViewConfiguration;
import com.bbva.component.ui.loader.databinding.LayoutLoaderviewBinding;
import com.bbva.component.ui.loader.extensions.AnimationExtensionsKt;
import com.bbva.component.ui.loader.extensions.EnumExtensionsKt;
import com.bbva.component.ui.loader.extensions.TypedArrayExtensionsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import l5.d;
import l5.e;
import l5.f;
import l5.g;
import l5.h;
import l5.i;
import l5.j;
import l5.k;
import l5.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LoaderView.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#B\u0011\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010$B\u001b\b\u0016\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b\"\u0010%J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0004J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0004J\"\u0010\u000b\u001a\u00020\u00042\u0018\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\n0\tH\u0004J\u001c\u0010\r\u001a\u00020\u00042\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\nH\u0004J\b\u0010\u000e\u001a\u00020\u0004H\u0014R+\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006&"}, d2 = {"Lcom/bbva/component/ui/loader/LoaderView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "type", "", "loaderType", "animationName", "enterAnimation", "exitAnimation", "", "", "messages", "message", "secondaryMessage", "onAttachedToWindow", "Lcom/bbva/component/ui/loader/behavior/ViewBehavior;", "<set-?>", "s0", "Lkotlin/properties/ReadWriteProperty;", "getBehavior", "()Lcom/bbva/component/ui/loader/behavior/ViewBehavior;", "setBehavior", "(Lcom/bbva/component/ui/loader/behavior/ViewBehavior;)V", "behavior", "Landroidx/lifecycle/LifecycleOwner;", "getLifecycleOwner", "()Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "component-ui-loader_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLoaderView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LoaderView.kt\ncom/bbva/component/ui/loader/LoaderView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1603#2,9:154\n1855#2:163\n1856#2:165\n1612#2:166\n766#2:167\n857#2,2:168\n1549#2:170\n1620#2,3:171\n1#3:164\n1#3:174\n*S KotlinDebug\n*F\n+ 1 LoaderView.kt\ncom/bbva/component/ui/loader/LoaderView\n*L\n119#1:154,9\n119#1:163\n119#1:165\n119#1:166\n120#1:167\n120#1:168,2\n121#1:170\n121#1:171,3\n119#1:164\n*E\n"})
public final class LoaderView extends ConstraintLayout {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f28431u0 = {c.e(LoaderView.class, "behavior", "getBehavior()Lcom/bbva/component/ui/loader/behavior/ViewBehavior;", 0)};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final LoaderViewModel f28432p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final LayoutLoaderviewBinding f28433q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public LoaderViewType f28434r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final ReadWriteProperty behavior;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public ViewConfiguration f28436t0;

    /* JADX INFO: compiled from: LoaderView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoaderViewType.values().length];
            try {
                iArr[LoaderViewType.Spinner.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoaderViewType.Loader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: LoaderView.kt */
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f28437a;

        public a(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28437a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28437a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28437a;
        }

        public final int hashCode() {
            return this.f28437a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28437a.invoke(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoaderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        ViewModel viewModelOf = CellsViewModelProviders.of(getId(), context, LoaderViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModelOf, "of(...)");
        LoaderViewModel loaderViewModel = (LoaderViewModel) viewModelOf;
        this.f28432p0 = loaderViewModel;
        this.behavior = Delegates.INSTANCE.notNull();
        this.f28436t0 = new ViewConfiguration(0, 0, 3, null);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.LoaderView, i10, R.style.LoaderView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f28434r0 = EnumExtensionsKt.toLoaderType(TypedArrayExtensionsKt.optInt(typedArrayObtainStyledAttributes, R.styleable.LoaderView_loaderView_type, LoaderViewType.Loader.ordinal()));
        a();
        this.f28436t0 = new ViewConfiguration(TypedArrayExtensionsKt.optResource(typedArrayObtainStyledAttributes, R.styleable.LoaderView_loaderView_enterAnimation), TypedArrayExtensionsKt.optResource(typedArrayObtainStyledAttributes, R.styleable.LoaderView_loaderView_exitAnimation));
        loaderViewModel.storeMessages$component_ui_loader_release(TypedArrayExtensionsKt.optTextArray(typedArrayObtainStyledAttributes, R.styleable.LoaderView_loaderView_messages));
        loaderViewModel.storeSecondaryMessage$component_ui_loader_release(TypedArrayExtensionsKt.optString(typedArrayObtainStyledAttributes, R.styleable.LoaderView_loaderView_secondaryMessage));
        typedArrayObtainStyledAttributes.recycle();
        loaderViewModel.newProperty("type").observe(ContextHelper.getOwner(getContext()), new i(0, this));
        loaderViewModel.newProperty("enterAnimation").observe(ContextHelper.getOwner(getContext()), new j(this, 0));
        loaderViewModel.newProperty("exitAnimation").observe(ContextHelper.getOwner(getContext()), new k(this, 0));
        loaderViewModel.newProperty("messages").observe(ContextHelper.getOwner(getContext()), new l(this, 0));
        loaderViewModel.newProperty("secondaryMessage").observe(ContextHelper.getOwner(getContext()), new Observer() { // from class: l5.m
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f83109a.secondaryMessage((Map) obj);
            }
        });
        LayoutLoaderviewBinding layoutLoaderviewBindingInflate = LayoutLoaderviewBinding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(layoutLoaderviewBindingInflate, "inflate(...)");
        this.f28433q0 = layoutLoaderviewBindingInflate;
        LifecycleOwner lifecycleOwner = getLifecycleOwner();
        if (lifecycleOwner != null) {
            loaderViewModel.getShowLiveData$component_ui_loader_release().observe(lifecycleOwner, new a(new l5.c(this)));
            loaderViewModel.getNextStepLiveData$component_ui_loader_release().observe(lifecycleOwner, new a(new d(this)));
            loaderViewModel.getLastStepLiveData$component_ui_loader_release().observe(lifecycleOwner, new a(new e(this)));
            loaderViewModel.getHideLiveData$component_ui_loader_release().observe(lifecycleOwner, new a(new f(this)));
            loaderViewModel.getShowSecondaryMessageLiveData$component_ui_loader_release().observe(lifecycleOwner, new a(new g(this)));
            loaderViewModel.getHideSecondaryMessageLiveData$component_ui_loader_release().observe(lifecycleOwner, new a(new h(this)));
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewBehavior getBehavior() {
        return (ViewBehavior) this.behavior.getValue(this, f28431u0[0]);
    }

    private final LifecycleOwner getLifecycleOwner() {
        return ContextHelper.getOwner(getContext());
    }

    private final void setBehavior(ViewBehavior viewBehavior) {
        this.behavior.setValue(this, f28431u0[0], viewBehavior);
    }

    public final void a() {
        ViewBehavior spinnerBehavior;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.f28434r0.ordinal()];
        LoaderViewModel loaderViewModel = this.f28432p0;
        if (i10 == 1) {
            spinnerBehavior = new SpinnerBehavior(loaderViewModel);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            spinnerBehavior = new LoaderBehavior(loaderViewModel);
        }
        setBehavior(spinnerBehavior);
    }

    public final void enterAnimation(@NotNull String animationName) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        ViewConfiguration viewConfiguration = this.f28436t0;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f28436t0 = ViewConfiguration.copy$default(viewConfiguration, AnimationExtensionsKt.loadAnimationId(animationName, context), 0, 2, null);
    }

    public final void exitAnimation(@NotNull String animationName) {
        Intrinsics.checkNotNullParameter(animationName, "animationName");
        ViewConfiguration viewConfiguration = this.f28436t0;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.f28436t0 = ViewConfiguration.copy$default(viewConfiguration, 0, AnimationExtensionsKt.loadAnimationId(animationName, context), 1, null);
    }

    public final void loaderType(@NotNull String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        LoaderViewType loaderType = EnumExtensionsKt.toLoaderType(type);
        if (loaderType != this.f28434r0) {
            this.f28434r0 = loaderType;
            a();
            invalidate();
        }
    }

    public final void messages(@NotNull List<? extends Map<String, String>> messages) {
        Intrinsics.checkNotNullParameter(messages, "messages");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = messages.iterator();
        while (it.hasNext()) {
            PropertiesHelper.Property propertyFrom = PropertiesHelper.Property.from((Map<String, String>) it.next());
            if (propertyFrom != null) {
                arrayList.add(propertyFrom);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((PropertiesHelper.Property) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(PropertiesHelper.loadString(getContext(), (PropertiesHelper.Property) it2.next()));
        }
        this.f28432p0.storeMessages$component_ui_loader_release(arrayList3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getBehavior().configure(this.f28433q0, this.f28436t0);
    }

    public final void secondaryMessage(@NotNull Map<String, String> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f28432p0.storeSecondaryMessage$component_ui_loader_release(PropertiesHelper.loadString(getContext(), PropertiesHelper.Property.from(message)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoaderView(@NotNull Context context) {
        this(context, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoaderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
