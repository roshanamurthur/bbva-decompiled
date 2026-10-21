package com.bbva.glomohybrid.infoscreen.scratchCard.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.bridge.dispatcher.MessageDispatcher;
import com.bbva.glomohybrid.base.activity.BaseActivity;
import com.bbva.glomohybrid.base.activityConfigurators.ScratchcardConfiguration;
import com.bbva.glomohybrid.infoscreen.databinding.ActivityScratchcardBinding;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardViewModel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.androidx.viewmodel.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: ScratchcardActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/scratchCard/activity/ScratchcardActivity;", "Lcom/bbva/glomohybrid/base/activity/BaseActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "Companion", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nScratchcardActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScratchcardActivity.kt\ncom/bbva/glomohybrid/infoscreen/scratchCard/activity/ScratchcardActivity\n+ 2 ComponentCallbackExt.kt\norg/koin/android/ext/android/ComponentCallbackExtKt\n+ 3 ActivityVM.kt\norg/koin/androidx/viewmodel/ext/android/ActivityVMKt\n*L\n1#1,85:1\n40#2,5:86\n41#3,6:91\n*S KotlinDebug\n*F\n+ 1 ScratchcardActivity.kt\ncom/bbva/glomohybrid/infoscreen/scratchCard/activity/ScratchcardActivity\n*L\n31#1:86,5\n32#1:91,6\n*E\n"})
public final class ScratchcardActivity extends BaseActivity {

    @NotNull
    public static final String CHANNEL_RESULT_ID = "scratch_result_channel";

    @NotNull
    public static final String SCRATCHCARD_RESULT_CANCELED = "Canceled";

    @NotNull
    public static final String SCRATCHCARD_RESULT_CONFIRMED = "Confirmed";

    @NotNull
    public static final String SCRATCHCARD_RESULT_SCRATCHED = "Scratched";

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public ActivityScratchcardBinding f32463s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public final Lazy f32464t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public final Lazy f32465u0;

    @NotNull
    public final Lazy v0;

    /* JADX INFO: compiled from: ScratchcardActivity.kt */
    public static final class a extends Lambda implements Function0<ScratchcardConfiguration> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ScratchcardConfiguration invoke() {
            int i10 = Build.VERSION.SDK_INT;
            ScratchcardActivity scratchcardActivity = ScratchcardActivity.this;
            if (i10 >= 33) {
                Intent intent = scratchcardActivity.getIntent();
                if (intent != null) {
                    return (ScratchcardConfiguration) intent.getParcelableExtra(ScratchcardConfiguration.SCRATCHCARD_CONFIG_KEY, ScratchcardConfiguration.class);
                }
                return null;
            }
            Intent intent2 = scratchcardActivity.getIntent();
            if (intent2 != null) {
                return (ScratchcardConfiguration) intent2.getParcelableExtra(ScratchcardConfiguration.SCRATCHCARD_CONFIG_KEY);
            }
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ScratchcardActivity() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.f32464t0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<MessageDispatcher>() { // from class: com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.bbva.bridge.dispatcher.MessageDispatcher, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final MessageDispatcher invoke() {
                return AndroidKoinScopeExtKt.getKoinScope(this).get(Reflection.getOrCreateKotlinClass(MessageDispatcher.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode2 = LazyThreadSafetyMode.NONE;
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        final Object[] objArr4 = 0 == true ? 1 : 0;
        this.f32465u0 = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode2, (Function0) new Function0<ScratchcardViewModel>() { // from class: com.bbva.glomohybrid.infoscreen.scratchCard.activity.ScratchcardActivity$special$$inlined$viewModel$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            /* JADX WARN: Type inference failed for: r0v3, types: [androidx.lifecycle.ViewModel, com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardViewModel] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final ScratchcardViewModel invoke() {
                CreationExtras defaultViewModelCreationExtras;
                Qualifier qualifier2 = objArr2;
                Function0 function0 = objArr4;
                ComponentActivity componentActivity = this;
                ViewModelStore viewModelStore = componentActivity.getViewModelStore();
                Function0 function1 = objArr3;
                if (function1 == null || (defaultViewModelCreationExtras = (CreationExtras) function1.invoke()) == null) {
                    defaultViewModelCreationExtras = componentActivity.getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
                }
                CreationExtras creationExtras = defaultViewModelCreationExtras;
                Scope koinScope = AndroidKoinScopeExtKt.getKoinScope(componentActivity);
                KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ScratchcardViewModel.class);
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
                return GetViewModelKt.resolveViewModel(orCreateKotlinClass, viewModelStore, (4 & 4) != 0 ? null : null, creationExtras, (4 & 16) != 0 ? null : qualifier2, koinScope, (4 & 64) != 0 ? null : function0);
            }
        });
        this.v0 = LazyKt__LazyJVMKt.lazy(new a());
    }

    public static final ScratchcardViewModel access$getViewModel(ScratchcardActivity scratchcardActivity) {
        return (ScratchcardViewModel) scratchcardActivity.f32465u0.getValue();
    }

    @Override // com.bbva.glomohybrid.base.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityScratchcardBinding activityScratchcardBindingInflate = ActivityScratchcardBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(activityScratchcardBindingInflate, "inflate(...)");
        this.f32463s0 = activityScratchcardBindingInflate;
        if (activityScratchcardBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityScratchcardBindingInflate = null;
        }
        setContentView(activityScratchcardBindingInflate.getRoot());
        Lazy lazy = this.f32465u0;
        ScratchcardViewModel scratchcardViewModel = (ScratchcardViewModel) lazy.getValue();
        ScratchcardConfiguration scratchcardConfiguration = (ScratchcardConfiguration) this.v0.getValue();
        if (scratchcardConfiguration == null) {
            scratchcardConfiguration = new ScratchcardConfiguration((String) null, (String) null, false, (String) null, (String) null, (String) null, (Double) null, (String) null, (String) null, 511, (DefaultConstructorMarker) null);
        }
        scratchcardViewModel.setConfiguration(scratchcardConfiguration);
        ActivityScratchcardBinding activityScratchcardBinding = this.f32463s0;
        if (activityScratchcardBinding == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityScratchcardBinding = null;
        }
        activityScratchcardBinding.scratchcardView.setup((ScratchcardViewModel) lazy.getValue());
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e9.a(this, null), 3, null);
    }
}
