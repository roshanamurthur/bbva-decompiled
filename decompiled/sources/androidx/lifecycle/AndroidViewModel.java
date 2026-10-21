package androidx.lifecycle;

import android.app.Application;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AndroidViewModel.android.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0004\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/lifecycle/AndroidViewModel;", "Landroidx/lifecycle/ViewModel;", "Landroid/app/Application;", ExifInterface.GPS_DIRECTION_TRUE, "getApplication", "()Landroid/app/Application;", Constants.APPLICATION, "<init>", "(Landroid/app/Application;)V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0})
public class AndroidViewModel extends ViewModel {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final Application f21810p0;

    public AndroidViewModel(@NotNull Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f21810p0 = application;
    }

    @NotNull
    public <T extends Application> T getApplication() {
        T t10 = (T) this.f21810p0;
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t10;
    }
}
