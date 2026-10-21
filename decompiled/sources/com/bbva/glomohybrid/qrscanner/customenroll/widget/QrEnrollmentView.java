package com.bbva.glomohybrid.qrscanner.customenroll.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.camera.core.imagecapture.a;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.c;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.glomohybrid.base.models.common.Event;
import com.bbva.glomohybrid.qrscanner.customenroll.model.QRReaderEvent;
import com.bbva.glomohybrid.qrscanner.customenroll.viewmodel.QrReaderViewModel;
import com.bbva.glomohybrid.qrscanner.databinding.QrEnrollmentViewBinding;
import com.bbva.qr.view.Configurable;
import com.google.android.material.tabs.TabLayout;
import java.util.Map;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;
import w5.f;

/* JADX INFO: compiled from: QrEnrollmentView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B'\b\u0007\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/customenroll/widget/QrEnrollmentView;", "Landroid/widget/RelativeLayout;", "Lorg/koin/core/component/KoinComponent;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lkotlinx/coroutines/CoroutineScope;", "Lcom/bbva/qr/view/Configurable;", "", "", "options", "", "configureAttributes", "Lcom/bbva/glomohybrid/qrscanner/customenroll/viewmodel/QrReaderViewModel;", "q0", "Lkotlin/Lazy;", "getQrReaderViewModel", "()Lcom/bbva/glomohybrid/qrscanner/customenroll/viewmodel/QrReaderViewModel;", "qrReaderViewModel", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nQrEnrollmentView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QrEnrollmentView.kt\ncom/bbva/glomohybrid/qrscanner/customenroll/widget/QrEnrollmentView\n+ 2 KoinComponent.kt\norg/koin/core/component/KoinComponentKt\n*L\n1#1,94:1\n56#2,6:95\n*S KotlinDebug\n*F\n+ 1 QrEnrollmentView.kt\ncom/bbva/glomohybrid/qrscanner/customenroll/widget/QrEnrollmentView\n*L\n28#1:95,6\n*E\n"})
public final class QrEnrollmentView extends RelativeLayout implements KoinComponent, DefaultLifecycleObserver, CoroutineScope, Configurable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f34402p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy qrReaderViewModel;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final QrEnrollmentViewBinding f34404r0;

    /* JADX INFO: compiled from: QrEnrollmentView.kt */
    public static final class a implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f34405a;

        public a(ca.a function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f34405a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f34405a, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f34405a;
        }

        public final int hashCode() {
            return this.f34405a.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f34405a.invoke(obj);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QrEnrollmentView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(QrEnrollmentView this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Activity activity = this$0.getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Activity getActivity() {
        Context context = getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QrReaderViewModel getQrReaderViewModel() {
        return (QrReaderViewModel) this.qrReaderViewModel.getValue();
    }

    @Override // com.bbva.qr.view.Configurable
    public void configureAttributes(@NotNull Map<String, String> options) {
        Intrinsics.checkNotNullParameter(options, "options");
        Configurable.DefaultImpls.configureAttributes(this, options);
        String str = options.get("title");
        QrEnrollmentViewBinding qrEnrollmentViewBinding = this.f34404r0;
        if (str != null) {
            qrEnrollmentViewBinding.toolbarTitle.setText(str);
        }
        String str2 = options.get("firstButton");
        if (str2 != null) {
            TabLayout tabLayout = qrEnrollmentViewBinding.tabLayout;
            tabLayout.addTab(tabLayout.newTab().setText(str2));
        }
        String str3 = options.get("secondButton");
        if (str3 != null) {
            TabLayout tabLayout2 = qrEnrollmentViewBinding.tabLayout;
            tabLayout2.addTab(tabLayout2.newTab().setText(str3));
        }
        if (qrEnrollmentViewBinding.tabLayout.getTabCount() > 0) {
            qrEnrollmentViewBinding.tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: com.bbva.glomohybrid.qrscanner.customenroll.widget.QrEnrollmentView.configureAttributes.4
                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                public void onTabSelected(@Nullable TabLayout.Tab tab) {
                    if (tab != null) {
                        QrEnrollmentView.this.getQrReaderViewModel().tabSelected(tab.getPosition());
                    }
                }

                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                public void onTabReselected(@Nullable TabLayout.Tab tab) {
                }

                @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
                public void onTabUnselected(@Nullable TabLayout.Tab tab) {
                }
            });
        }
        String str4 = options.get("firstFooterLabel");
        if (str4 != null) {
            qrEnrollmentViewBinding.qrMessage.setText(str4);
        }
        String str5 = options.get("secondFooterLabel");
        if (str5 != null) {
            TextView textView = qrEnrollmentViewBinding.qrMessage;
            String str6 = qrEnrollmentViewBinding.qrMessage.getText() + "\n\n" + str5;
            Intrinsics.checkNotNullExpressionValue(str6, "StringBuilder().apply(builderAction).toString()");
            textView.setText(str6);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f34402p0.getCoroutineContext();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        c.a(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        c.b(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        c.c(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        c.d(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        c.e(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        c.f(this, lifecycleOwner);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public QrEnrollmentView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ QrEnrollmentView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public QrEnrollmentView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34402p0 = CoroutineScopeKt.MainScope();
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.qrReaderViewModel = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<QrReaderViewModel>() { // from class: com.bbva.glomohybrid.qrscanner.customenroll.widget.QrEnrollmentView$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.bbva.glomohybrid.qrscanner.customenroll.viewmodel.QrReaderViewModel, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final QrReaderViewModel invoke() {
                KoinComponent koinComponent = this;
                boolean z10 = koinComponent instanceof KoinScopeComponent;
                return (z10 ? ((KoinScopeComponent) koinComponent).getScope() : a.e(koinComponent)).get(Reflection.getOrCreateKotlinClass(QrReaderViewModel.class), qualifier, objArr);
            }
        });
        QrEnrollmentViewBinding qrEnrollmentViewBindingInflate = QrEnrollmentViewBinding.inflate(LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(qrEnrollmentViewBindingInflate, "inflate(...)");
        this.f34404r0 = qrEnrollmentViewBindingInflate;
        addView(qrEnrollmentViewBindingInflate.getRoot());
        qrEnrollmentViewBindingInflate.toolbarStartButton.setOnClickListener(new f(this, 2));
        LiveData<Event<QRReaderEvent>> event$QRScanner_mexicoRelease = getQrReaderViewModel().getEvent$QRScanner_mexicoRelease();
        Activity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        event$QRScanner_mexicoRelease.observe((LifecycleOwner) activity, new a(new ca.a(this)));
    }
}
