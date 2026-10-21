package androidx.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.annotation.VisibleForTesting;
import com.bbva.cells.component.kit.ui.property.impl.view.EnableHandler;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.veridas.detect.ImageAnalysisKt;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EdgeToEdge.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\u001a'\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\" \u0010\u000f\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\t\u0010\n\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\" \u0010\u0013\u001a\u00020\b8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\n\u0012\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0011\u0010\f¨\u0006\u0014"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/activity/SystemBarStyle;", "statusBarStyle", "navigationBarStyle", "", EnableHandler.ID, "(Landroidx/activity/ComponentActivity;Landroidx/activity/SystemBarStyle;Landroidx/activity/SystemBarStyle;)V", "enableEdgeToEdge", "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDefaultLightScrim", "()I", "getDefaultLightScrim$annotations", "()V", "DefaultLightScrim", "b", "getDefaultDarkScrim", "getDefaultDarkScrim$annotations", "DefaultDarkScrim", "activity_release"}, k = 2, mv = {1, 8, 0})
@JvmName(name = "EdgeToEdge")
@SourceDebugExtension({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
public final class EdgeToEdge {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f315a = Color.argb(ImageAnalysisKt.OVER_EXPOSED_THRESHOLD, 255, 255, 255);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f316b = Color.argb(128, 27, 27, 27);

    @JvmOverloads
    @JvmName(name = EnableHandler.ID)
    public static final void enable(@NotNull ComponentActivity componentActivity) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        enable$default(componentActivity, null, null, 3, null);
    }

    public static /* synthetic */ void enable$default(ComponentActivity componentActivity, SystemBarStyle systemBarStyle, SystemBarStyle systemBarStyle2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            systemBarStyle = SystemBarStyle.Companion.auto$default(SystemBarStyle.INSTANCE, 0, 0, null, 4, null);
        }
        if ((i10 & 2) != 0) {
            systemBarStyle2 = SystemBarStyle.Companion.auto$default(SystemBarStyle.INSTANCE, f315a, f316b, null, 4, null);
        }
        enable(componentActivity, systemBarStyle, systemBarStyle2);
    }

    public static final int getDefaultDarkScrim() {
        return f316b;
    }

    public static final int getDefaultLightScrim() {
        return f315a;
    }

    @JvmOverloads
    @JvmName(name = EnableHandler.ID)
    public static final void enable(@NotNull ComponentActivity componentActivity, @NotNull SystemBarStyle statusBarStyle) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        enable$default(componentActivity, statusBarStyle, null, 2, null);
    }

    @JvmOverloads
    @JvmName(name = EnableHandler.ID)
    public static final void enable(@NotNull ComponentActivity componentActivity, @NotNull SystemBarStyle statusBarStyle, @NotNull SystemBarStyle navigationBarStyle) {
        n iVar;
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        Intrinsics.checkNotNullParameter(statusBarStyle, "statusBarStyle");
        Intrinsics.checkNotNullParameter(navigationBarStyle, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        Function1<Resources, Boolean> detectDarkMode$activity_release = statusBarStyle.getDetectDarkMode$activity_release();
        Resources resources = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "view.resources");
        boolean zBooleanValue = detectDarkMode$activity_release.invoke(resources).booleanValue();
        Function1<Resources, Boolean> detectDarkMode$activity_release2 = navigationBarStyle.getDetectDarkMode$activity_release();
        Resources resources2 = decorView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "view.resources");
        boolean zBooleanValue2 = detectDarkMode$activity_release2.invoke(resources2).booleanValue();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            iVar = new m();
        } else if (i10 >= 26) {
            iVar = new j();
        } else {
            iVar = new i();
        }
        n nVar = iVar;
        Window window = componentActivity.getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        nVar.a(statusBarStyle, navigationBarStyle, window, decorView, zBooleanValue, zBooleanValue2);
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultDarkScrim$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getDefaultLightScrim$annotations() {
    }
}
