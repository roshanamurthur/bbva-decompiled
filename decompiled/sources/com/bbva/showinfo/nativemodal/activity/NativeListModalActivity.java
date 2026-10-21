package com.bbva.showinfo.nativemodal.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.AppCompatActivity;
import com.bbva.showinfo.ShowInfoKt;
import com.bbva.showinfo.databinding.ActivityNativeListModalBinding;
import com.bbva.showinfo.nativemodal.ConstantsKt;
import com.bbva.showinfo.nativemodal.modal.NativeListModalConfiguration;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xb.d;

/* JADX INFO: compiled from: NativeListModalActivity.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/bbva/showinfo/nativemodal/activity/NativeListModalActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "bundle", "", "onCreate", "<init>", "()V", "showinfo_release"}, k = 1, mv = {1, 9, 0})
public final class NativeListModalActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f36544p0 = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: compiled from: NativeListModalActivity.kt */
    @SourceDebugExtension({"SMAP\nNativeListModalActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NativeListModalActivity.kt\ncom/bbva/showinfo/nativemodal/activity/NativeListModalActivity$nativeListModalConfig$2\n+ 2 Parcelable.kt\ncom/bbva/showinfo/nativemodal/utils/ParcelableKt\n*L\n1#1,52:1\n7#2,4:53\n*S KotlinDebug\n*F\n+ 1 NativeListModalActivity.kt\ncom/bbva/showinfo/nativemodal/activity/NativeListModalActivity$nativeListModalConfig$2\n*L\n20#1:53,4\n*E\n"})
    public static final class a extends Lambda implements Function0<NativeListModalConfiguration> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NativeListModalConfiguration invoke() {
            Parcelable parcelable;
            Intent intent = NativeListModalActivity.this.getIntent();
            if (intent == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) intent.getParcelableExtra(ConstantsKt.NATIVE_MODAL_CONFIG, NativeListModalConfiguration.class);
            } else {
                Parcelable parcelableExtra = intent.getParcelableExtra(ConstantsKt.NATIVE_MODAL_CONFIG);
                parcelable = (NativeListModalConfiguration) (parcelableExtra instanceof NativeListModalConfiguration ? parcelableExtra : null);
            }
            return (NativeListModalConfiguration) parcelable;
        }
    }

    public static final NativeListModalConfiguration access$getNativeListModalConfig(NativeListModalActivity nativeListModalActivity) {
        return (NativeListModalConfiguration) nativeListModalActivity.f36544p0.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        ActivityNativeListModalBinding activityNativeListModalBindingInflate = ActivityNativeListModalBinding.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(activityNativeListModalBindingInflate, "inflate(...)");
        if (activityNativeListModalBindingInflate == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            activityNativeListModalBindingInflate = null;
        }
        setContentView(activityNativeListModalBindingInflate.getRoot());
        ShowInfoKt.show(this, new d(this));
    }
}
