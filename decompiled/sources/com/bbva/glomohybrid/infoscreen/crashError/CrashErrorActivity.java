package com.bbva.glomohybrid.infoscreen.crashError;

import android.content.Intent;
import com.bbva.glomohybrid.infoscreen.InfoScreenContract;
import com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity;
import com.bbva.glomohybrid.infoscreen.R;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CrashErrorActivity.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\u000b\u001a\u00020\u00068TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000e\u001a\u00020\u00068TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001b\u0010\u0013\u001a\u00020\u000f8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00068TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\b\u001a\u0004\b\u0015\u0010\nR\u0014\u0010\u001a\u001a\u00020\u00178TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u00068TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/bbva/glomohybrid/infoscreen/crashError/CrashErrorActivity;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenNoCellsActivity;", "Lcom/bbva/glomohybrid/infoscreen/InfoScreenContract$Event;", "event", "", "handleEvent", "", "u0", "Lkotlin/Lazy;", "getToolbarTitle", "()Ljava/lang/String;", "toolbarTitle", "v0", "getTitleLabel", "titleLabel", "", "w0", "getDescriptionLabel", "()Ljava/lang/CharSequence;", "descriptionLabel", "x0", "getPositiveButtonText", "positiveButtonText", "", "getHeaderImage", "()I", "headerImage", "getNegativeButtonText", "negativeButtonText", "<init>", "()V", "info-modal_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class CrashErrorActivity extends InfoScreenNoCellsActivity {

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy toolbarTitle = LazyKt__LazyJVMKt.lazy(new d());

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Lazy titleLabel = LazyKt__LazyJVMKt.lazy(new c());

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy descriptionLabel = LazyKt__LazyJVMKt.lazy(new a());

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy positiveButtonText = LazyKt__LazyJVMKt.lazy(new b());

    /* JADX INFO: compiled from: CrashErrorActivity.kt */
    public static final class a extends Lambda implements Function0<CharSequence> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CharSequence invoke() {
            CharSequence text = CrashErrorActivity.this.getText(R.string.error_crash_screen_description);
            Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
            return text;
        }
    }

    /* JADX INFO: compiled from: CrashErrorActivity.kt */
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String string = CrashErrorActivity.this.getString(R.string.error_crash_screen_positive_button);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }

    /* JADX INFO: compiled from: CrashErrorActivity.kt */
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String string = CrashErrorActivity.this.getString(R.string.error_crash_screen_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }

    /* JADX INFO: compiled from: CrashErrorActivity.kt */
    public static final class d extends Lambda implements Function0<String> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            String string = CrashErrorActivity.this.getString(R.string.error_crash_screen_toolbar_title);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return string;
        }
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity
    @NotNull
    public CharSequence getDescriptionLabel() {
        return (CharSequence) this.descriptionLabel.getValue();
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity
    public int getHeaderImage() {
        return R.drawable.ic_warning_illus;
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity
    @Nullable
    public String getNegativeButtonText() {
        return null;
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity
    @NotNull
    public String getPositiveButtonText() {
        return (String) this.positiveButtonText.getValue();
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity
    @NotNull
    public String getTitleLabel() {
        return (String) this.titleLabel.getValue();
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity
    @NotNull
    public String getToolbarTitle() {
        return (String) this.toolbarTitle.getValue();
    }

    @Override // com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity
    public void handleEvent(@NotNull InfoScreenContract.Event event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!Intrinsics.areEqual(event, InfoScreenContract.Event.PositiveButtonClick.INSTANCE)) {
            if (Intrinsics.areEqual(event, InfoScreenContract.Event.NegativeButtonClick.INSTANCE) || !Intrinsics.areEqual(event, InfoScreenContract.Event.CloseButtonClick.INSTANCE)) {
                return;
            }
            finish();
            return;
        }
        Intent launchIntentForPackage = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.addFlags(268468224);
            getApplication().startActivity(launchIntentForPackage);
        }
        finish();
    }
}
