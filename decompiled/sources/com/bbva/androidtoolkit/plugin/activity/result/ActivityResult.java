package com.bbva.androidtoolkit.plugin.activity.result;

import android.content.Intent;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.localstorage.util.ConstantKt;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActivityResultManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResult;", "", "()V", ConstantKt.BIOMETRIC_NEGATIVE_BUTTON, "Success", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResult$Cancel;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResult$Success;", "toolkit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class ActivityResult {

    /* JADX INFO: compiled from: ActivityResultManager.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResult$Cancel;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResult;", "Lcom/bbva/androidtoolkit/plugin/response/Errors;", "a", "Lcom/bbva/androidtoolkit/plugin/response/Errors;", "getError", "()Lcom/bbva/androidtoolkit/plugin/response/Errors;", "error", "<init>", "(Lcom/bbva/androidtoolkit/plugin/response/Errors;)V", "toolkit_release"}, k = 1, mv = {1, 8, 0})
    public static final class Cancel extends ActivityResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Errors error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cancel(@NotNull Errors error) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            this.error = error;
        }

        @NotNull
        public final Errors getError() {
            return this.error;
        }
    }

    /* JADX INFO: compiled from: ActivityResultManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResult$Success;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResult;", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getResultCode", "()I", "resultCode", "Landroid/content/Intent;", "b", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "intent", "<init>", "(ILandroid/content/Intent;)V", "toolkit_release"}, k = 1, mv = {1, 8, 0})
    public static final class Success extends ActivityResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public final int resultCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Intent intent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(int i10, @NotNull Intent intent) {
            super(null);
            Intrinsics.checkNotNullParameter(intent, "intent");
            this.resultCode = i10;
            this.intent = intent;
        }

        @NotNull
        public final Intent getIntent() {
            return this.intent;
        }

        public final int getResultCode() {
            return this.resultCode;
        }
    }

    public ActivityResult() {
    }

    public /* synthetic */ ActivityResult(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
