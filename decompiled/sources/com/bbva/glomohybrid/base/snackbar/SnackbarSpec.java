package com.bbva.glomohybrid.base.snackbar;

import android.os.Bundle;
import bk.q;
import com.bbva.glomohybrid.base.R;
import com.bbva.showinfo.model.SnackBarType;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SnackbarSpec.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "", "()V", "BundleSnackbar", "Companion", "ResourcesSnackbar", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec$BundleSnackbar;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec$ResourcesSnackbar;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class SnackbarSpec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Map<String, Integer> f31567a = q.mapOf(TuplesKt.to(SnackBarType.ERROR.getValue(), Integer.valueOf(R.drawable.ic_warning_16)), TuplesKt.to(SnackBarType.INFO.getValue(), Integer.valueOf(R.drawable.ic_info_16)), TuplesKt.to(SnackBarType.SUCCESS.getValue(), Integer.valueOf(R.drawable.ic_done_16)), TuplesKt.to(SnackBarType.WARNING.getValue(), Integer.valueOf(R.drawable.ic_caution_16)));

    /* JADX INFO: compiled from: SnackbarSpec.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec$BundleSnackbar;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "Landroid/os/Bundle;", "b", "Landroid/os/Bundle;", "getBundle", "()Landroid/os/Bundle;", "bundle", "<init>", "(Landroid/os/Bundle;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final class BundleSnackbar extends SnackbarSpec {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Bundle bundle;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BundleSnackbar(@NotNull Bundle bundle) {
            super(null);
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            this.bundle = bundle;
        }

        @NotNull
        public final Bundle getBundle() {
            return this.bundle;
        }
    }

    /* JADX INFO: compiled from: SnackbarSpec.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001d\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec$Companion;", "", "()V", "resources", "", "", "", "getResources", "()Ljava/util/Map;", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Map<String, Integer> getResources() {
            return SnackbarSpec.f31567a;
        }
    }

    public SnackbarSpec() {
    }

    public /* synthetic */ SnackbarSpec(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: compiled from: SnackbarSpec.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\u0013\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec$ResourcesSnackbar;", "Lcom/bbva/glomohybrid/base/snackbar/SnackbarSpec;", "", "b", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "id", "c", "getTextId", "textId", "d", "getDurationValue", "durationValue", "Lcom/bbva/showinfo/model/SnackBarType;", "e", "Lcom/bbva/showinfo/model/SnackBarType;", "getSnackBarType", "()Lcom/bbva/showinfo/model/SnackBarType;", "snackBarType", "", "", "f", "Ljava/util/Map;", "getImagesResources", "()Ljava/util/Map;", "imagesResources", "<init>", "(IIILcom/bbva/showinfo/model/SnackBarType;Ljava/util/Map;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final class ResourcesSnackbar extends SnackbarSpec {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public final int id;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public final int textId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public final int durationValue;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final SnackBarType snackBarType;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Map<String, Integer> imagesResources;

        public /* synthetic */ ResourcesSnackbar(int i10, int i11, int i12, SnackBarType snackBarType, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(i10, i11, i12, (i13 & 8) != 0 ? SnackBarType.INFO : snackBarType, (i13 & 16) != 0 ? SnackbarSpec.INSTANCE.getResources() : map);
        }

        public final int getDurationValue() {
            return this.durationValue;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final Map<String, Integer> getImagesResources() {
            return this.imagesResources;
        }

        @NotNull
        public final SnackBarType getSnackBarType() {
            return this.snackBarType;
        }

        public final int getTextId() {
            return this.textId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ResourcesSnackbar(int i10, int i11, int i12, @NotNull SnackBarType snackBarType, @NotNull Map<String, Integer> imagesResources) {
            super(null);
            Intrinsics.checkNotNullParameter(snackBarType, "snackBarType");
            Intrinsics.checkNotNullParameter(imagesResources, "imagesResources");
            this.id = i10;
            this.textId = i11;
            this.durationValue = i12;
            this.snackBarType = snackBarType;
            this.imagesResources = imagesResources;
        }
    }
}
