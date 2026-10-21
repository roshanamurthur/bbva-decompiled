package com.bbva.glomohybrid.qrscanner.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.bbva.glomohybrid.qrscanner.R;
import com.bbva.glomohybrid.qrscanner.databinding.CustomQrViewBinding;
import com.bbva.glomohybrid.qrscanner.view.CustomQRRefundView;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CustomQRRefundView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00038\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u000f"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/view/CustomQRRefundView;", "Landroid/widget/RelativeLayout;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CustomQRRefundView extends RelativeLayout implements CoroutineScope {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final /* synthetic */ int f34430q0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f34431p0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomQRRefundView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f34431p0.getCoroutineContext();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomQRRefundView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CustomQRRefundView(Context context, AttributeSet attributeSet, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CustomQRRefundView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f34431p0 = CoroutineScopeKt.MainScope();
        CustomQrViewBinding customQrViewBindingInflate = CustomQrViewBinding.inflate(LayoutInflater.from(context), this, false);
        Intrinsics.checkNotNullExpressionValue(customQrViewBindingInflate, "inflate(...)");
        addView(customQrViewBindingInflate.getRoot());
        customQrViewBindingInflate.toolbarEndButton.setOnClickListener(new View.OnClickListener() { // from class: da.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = CustomQRRefundView.f34430q0;
                Context context2 = context;
                Intrinsics.checkNotNullParameter(context2, "$context");
                Activity activity = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity != null) {
                    activity.finish();
                }
            }
        });
        customQrViewBindingInflate.toolbarStartButton.setVisibility(8);
        customQrViewBindingInflate.toolbarTittle.setText(context.getText(R.string.qr_scanner_refund_title));
        customQrViewBindingInflate.qrMessage.setText(context.getText(R.string.qr_scanner_refund_message));
        customQrViewBindingInflate.bottomLinear.setVisibility(8);
    }
}
