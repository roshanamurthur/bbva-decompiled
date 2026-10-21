package com.bbva.glomohybrid.base.snackbar;

import android.content.Context;
import android.view.View;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.glomoutils.time.DateExtensionsKt;
import com.bbva.showinfo.ShowInfoKt;
import com.bbva.showinfo.model.InfoSnackBar;
import com.bbva.showinfo.model.SnackBarDuration;
import com.bbva.showinfo.model.SnackBarType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnackbarSpec.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"toSnackbar", "Lcom/bbva/showinfo/model/InfoSnackBar;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec$BundleSnackbar;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec$ResourcesSnackbar;", "context", "Landroid/content/Context;", "Base_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnackbarSpecKt {

    /* JADX INFO: compiled from: SnackbarSpec.kt */
    public static final class a extends Lambda implements Function1<InfoSnackBar, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f31574p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SnackbarSpec.ResourcesSnackbar f31575q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SnackbarSpec.ResourcesSnackbar resourcesSnackbar, Context context) {
            super(1);
            this.f31574p0 = context;
            this.f31575q0 = resourcesSnackbar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InfoSnackBar infoSnackBar) {
            InfoSnackBar snackBar = infoSnackBar;
            Intrinsics.checkNotNullParameter(snackBar, "$this$snackBar");
            snackBar.setId(Integer.valueOf(View.generateViewId()));
            SnackbarSpec.ResourcesSnackbar resourcesSnackbar = this.f31575q0;
            snackBar.setMessage(this.f31574p0.getString(resourcesSnackbar.getTextId()));
            snackBar.setDuration(SnackBarDuration.INSTANCE.of(resourcesSnackbar.getDurationValue()));
            snackBar.setType(resourcesSnackbar.getSnackBarType());
            snackBar.setImages(resourcesSnackbar.getImagesResources());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SnackbarSpec.kt */
    public static final class b extends Lambda implements Function1<InfoSnackBar, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SnackbarSpec.BundleSnackbar f31576p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SnackbarSpec.BundleSnackbar bundleSnackbar) {
            super(1);
            this.f31576p0 = bundleSnackbar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(InfoSnackBar infoSnackBar) {
            InfoSnackBar snackBar = infoSnackBar;
            Intrinsics.checkNotNullParameter(snackBar, "$this$snackBar");
            SnackbarSpec.BundleSnackbar bundleSnackbar = this.f31576p0;
            snackBar.setId(Integer.valueOf(bundleSnackbar.getBundle().getInt("id")));
            snackBar.setImages(SnackbarSpec.INSTANCE.getResources());
            snackBar.setType(SnackBarType.INSTANCE.fromValue(bundleSnackbar.getBundle().getString("type", "info")));
            snackBar.setMessage(bundleSnackbar.getBundle().getString("message", ""));
            snackBar.setDuration(new SnackBarDuration.Defined(DateExtensionsKt.toMillis(Double.valueOf(bundleSnackbar.getBundle().getDouble(TypedValues.TransitionType.S_DURATION)))));
            return Unit.INSTANCE;
        }
    }

    @NotNull
    public static final InfoSnackBar toSnackbar(@NotNull SnackbarSpec.ResourcesSnackbar resourcesSnackbar, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(resourcesSnackbar, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return ShowInfoKt.snackBar(new a(resourcesSnackbar, context));
    }

    @NotNull
    public static final InfoSnackBar toSnackbar(@NotNull SnackbarSpec.BundleSnackbar bundleSnackbar) {
        Intrinsics.checkNotNullParameter(bundleSnackbar, "<this>");
        return ShowInfoKt.snackBar(new b(bundleSnackbar));
    }
}
