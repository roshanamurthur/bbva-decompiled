package com.mypinpad.tsdk.isolation;

import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007"}, d2 = {"Lcom/mypinpad/tsdk/i/hashCode;", "", "<init>", "()V", "setX", "setOnFocusChangeListener", "Lcom/mypinpad/tsdk/i/hashCode$setOnFocusChangeListener;", "Lcom/mypinpad/tsdk/i/hashCode$setX;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class hashCode {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/hashCode$setOnFocusChangeListener;", "Lcom/mypinpad/tsdk/i/hashCode;", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setOnFocusChangeListener extends hashCode {

        @NotNull
        public static final setOnFocusChangeListener INSTANCE = new setOnFocusChangeListener();

        static {
            int i10 = ((((1 ^ 83) | (1 & 83)) << 1) - (~(-((83 & (~1)) | (1 & (-84)))))) - 1;
            int i11 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        public setOnFocusChangeListener() {
            super(null);
        }
    }

    public hashCode() {
    }

    public /* synthetic */ hashCode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/mypinpad/tsdk/i/hashCode$setX;", "Lcom/mypinpad/tsdk/i/hashCode;", "", "a", "Ljava/lang/String;", "setDividerPadding", "()Ljava/lang/String;", "setY", "", "Lcom/mypinpad/tsdk/i/setAutoSizeTextTypeUniformWithPresetSizes;", "b", "Ljava/util/List;", "setX", "()Ljava/util/List;", "", "setOnFocusChangeListener", "Ljava/lang/Throwable;"}, k = 1, mv = {1, 5, 1})
    public static final class setX extends hashCode {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f56169c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f56170d = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String setY;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final List<setAutoSizeTextTypeUniformWithPresetSizes> setX;

        @Nullable
        public Throwable setOnFocusChangeListener;

        /* JADX WARN: Illegal instructions before constructor call */
        public setX(String str, List list, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            list = (i10 & 2) != 0 ? null : list;
            th2 = (i10 & 4) != 0 ? null : th2;
            Intrinsics.checkNotNullParameter(str, "");
            super(defaultConstructorMarker2);
            this.setY = str;
            this.setX = list;
            this.setOnFocusChangeListener = th2;
        }

        public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) {
            Object obj;
            int i13 = (i11 * ResultCode.ERROR_TRUST_CERT_DATE_AFTERVALIDITY) + (i10 * (-519));
            int i14 = ~i10;
            int i15 = ~i11;
            int i16 = ~i12;
            int i17 = (((~(i11 | i12)) | (~(i14 | i15 | i16))) * 520) + i13;
            int i18 = ~(i15 | i16);
            int i19 = ~(i12 | i10);
            if ((((~(i10 | i15)) | (~(i14 | i16)) | i19) * 520) + ((i18 | i19) * (-1040)) + i17 != 1) {
                setX setx = (setX) objArr[0];
                int i20 = f56169c;
                int i21 = i20 + 20;
                int i22 = (i21 ^ (-1)) + (i21 << 1);
                f56170d = i22 % 128;
                int i23 = i22 % 2;
                obj = setx.setX;
                int i24 = (i20 & 45) + (i20 | 45);
                f56170d = i24 % 128;
                if (i24 % 2 == 0) {
                    throw null;
                }
            } else {
                setX setx2 = (setX) objArr[0];
                int i25 = f56170d;
                int i26 = i25 & 57;
                int i27 = (i25 ^ 57) | i26;
                int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
                f56169c = i28 % 128;
                int i29 = i28 % 2;
                obj = setx2.setY;
                if (i29 != 0) {
                    throw null;
                }
            }
            return obj;
        }

        @JvmName(name = "setDividerPadding")
        @NotNull
        public final String setDividerPadding() {
            return (String) setX(new Object[]{this}, 1995127706, -1995127705, System.identityHashCode(this));
        }

        @JvmName(name = "setX")
        @Nullable
        public final List<setAutoSizeTextTypeUniformWithPresetSizes> setX() {
            return (List) setX(new Object[]{this}, 1826201742, -1826201742, System.identityHashCode(this));
        }
    }
}
