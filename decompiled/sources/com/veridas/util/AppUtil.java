package com.veridas.util;

import android.app.Dialog;
import android.widget.PopupWindow;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppUtil.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/veridas/util/AppUtil;", "", "()V", "Companion", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class AppUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: AppUtil.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u0001H\u0004H\u0007¢\u0006\u0002\u0010\u0007J#\u0010\u0003\u001a\u0004\u0018\u0001H\u0004\"\b\b\u0000\u0010\u0004*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u0001H\u0004H\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/veridas/util/AppUtil$Companion;", "", "()V", "dismiss", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/app/Dialog;", "dialog", "(Landroid/app/Dialog;)Landroid/app/Dialog;", "Landroid/widget/PopupWindow;", "popupWindow", "(Landroid/widget/PopupWindow;)Landroid/widget/PopupWindow;", "common-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final <T extends Dialog> T dismiss(@Nullable T dialog) {
            if (dialog == null) {
                return null;
            }
            dialog.dismiss();
            return null;
        }

        @JvmStatic
        @Nullable
        public final <T extends PopupWindow> T dismiss(@Nullable T popupWindow) {
            if (popupWindow == null) {
                return null;
            }
            popupWindow.dismiss();
            return null;
        }
    }

    @JvmStatic
    @Nullable
    public static final <T extends Dialog> T dismiss(@Nullable T t10) {
        return (T) INSTANCE.dismiss(t10);
    }

    @JvmStatic
    @Nullable
    public static final <T extends PopupWindow> T dismiss(@Nullable T t10) {
        return (T) INSTANCE.dismiss(t10);
    }
}
