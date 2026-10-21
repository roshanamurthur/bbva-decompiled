package com.bbva.document.scanner.presentation.preview;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bbva.cellswidgets.CellsButton;
import com.bbva.document.scanner.PreviewOptions;
import com.bbva.documentscanner.R;
import com.bbva.documentscanner.databinding.ActivityPreviewDocumentBinding;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PreviewDocumentActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/bbva/document/scanner/presentation/preview/PreviewDocumentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "<init>", "()V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPreviewDocumentActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewDocumentActivity.kt\ncom/bbva/document/scanner/presentation/preview/PreviewDocumentActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,83:1\n321#2,4:84\n*S KotlinDebug\n*F\n+ 1 PreviewDocumentActivity.kt\ncom/bbva/document/scanner/presentation/preview/PreviewDocumentActivity\n*L\n45#1:84,4\n*E\n"})
public final class PreviewDocumentActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final /* synthetic */ int f29190r0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Lazy f29191p0 = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Lazy f29192q0 = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: compiled from: PreviewDocumentActivity.kt */
    public static final class a extends Lambda implements Function0<ActivityPreviewDocumentBinding> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ActivityPreviewDocumentBinding invoke() {
            ActivityPreviewDocumentBinding activityPreviewDocumentBindingInflate = ActivityPreviewDocumentBinding.inflate(PreviewDocumentActivity.this.getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(activityPreviewDocumentBindingInflate, "inflate(layoutInflater)");
            return activityPreviewDocumentBindingInflate;
        }
    }

    /* JADX INFO: compiled from: PreviewDocumentActivity.kt */
    public static final class b extends Lambda implements Function0<PreviewOptions> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PreviewOptions invoke() {
            Parcelable parcelableExtra = PreviewDocumentActivity.this.getIntent().getParcelableExtra("parameters");
            if (parcelableExtra != null) {
                return (PreviewOptions) parcelableExtra;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static final void access$sendResult(PreviewDocumentActivity previewDocumentActivity, PreviewResult previewResult) {
        previewDocumentActivity.getClass();
        Intent intent = new Intent();
        intent.putExtra("result", previewResult);
        previewDocumentActivity.setResult(-1, intent);
        previewDocumentActivity.finish();
    }

    public final ActivityPreviewDocumentBinding i() {
        return (ActivityPreviewDocumentBinding) this.f29191p0.getValue();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(i().getRoot());
        Lazy lazy = this.f29192q0;
        i().title.setText(((PreviewOptions) lazy.getValue()).getTitleText());
        PreviewOptions previewOptions = (PreviewOptions) lazy.getValue();
        FrameLayout frameLayout = i().imageContainer;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.imageContainer");
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        layoutParams2.dimensionRatio = String.valueOf(previewOptions.getRatio().aspectRatio());
        frameLayout.setLayoutParams(layoutParams2);
        i().image.setImageBitmap(BitmapFactory.decodeFile(previewOptions.getPath()));
        PreviewOptions previewOptions2 = (PreviewOptions) lazy.getValue();
        CellsButton configurePrimaryButton$lambda$1 = i().confirm;
        String primaryButtonText = previewOptions2.getPrimaryButtonText();
        if (primaryButtonText == null) {
            primaryButtonText = getString(R.string.take_picture_confirm);
        }
        configurePrimaryButton$lambda$1.setText(primaryButtonText);
        Intrinsics.checkNotNullExpressionValue(configurePrimaryButton$lambda$1, "configurePrimaryButton$lambda$1");
        CellsButton.setOnClickListenerBlocked$default(configurePrimaryButton$lambda$1, 0L, new com.bbva.document.scanner.presentation.preview.a(this, previewOptions2), 1, null);
        PreviewOptions previewOptions3 = (PreviewOptions) lazy.getValue();
        CellsButton configureSecondaryButton$lambda$2 = i().retry;
        if (previewOptions3.getSecondaryButtonText() != null) {
            configureSecondaryButton$lambda$2.setVisibility(0);
        }
        configureSecondaryButton$lambda$2.setText(previewOptions3.getSecondaryButtonText());
        Intrinsics.checkNotNullExpressionValue(configureSecondaryButton$lambda$2, "configureSecondaryButton$lambda$2");
        CellsButton.setOnClickListenerBlocked$default(configureSecondaryButton$lambda$2, 0L, new com.bbva.document.scanner.presentation.preview.b(this), 1, null);
        i().close.setOnClickListener(new s5.a(this, 1));
    }
}
