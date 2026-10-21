package mx.openpay.library.ui.signature;

import android.graphics.Bitmap;
import android.util.Base64;
import androidx.camera.camera2.internal.h0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\b\u001a\u00020\u0002R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lmx/openpay/library/ui/signature/DigitalSignatureViewModel;", "Landroidx/lifecycle/ViewModel;", "", "drawingStarted", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlinx/coroutines/Job;", "generateImage", "resetToIntro", "Landroidx/lifecycle/LiveData;", "Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState;", "getUiState", "()Landroidx/lifecycle/LiveData;", "uiState", "<init>", "()V", "SignatureUiState", "library_release"}, k = 1, mv = {1, 8, 0})
public final class DigitalSignatureViewModel extends ViewModel {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MutableLiveData f84352a = new MutableLiveData(SignatureUiState.Intro.INSTANCE);

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState;", "", "Drawing", "DrawingFinished", "Intro", "Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState$Drawing;", "Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState$DrawingFinished;", "Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState$Intro;", "library_release"}, k = 1, mv = {1, 8, 0})
    public static abstract class SignatureUiState {
        public static final int $stable = 0;

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState$Drawing;", "Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class Drawing extends SignatureUiState {
            public static final int $stable = 0;

            @NotNull
            public static final Drawing INSTANCE = new Drawing();

            public Drawing() {
                super(null);
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState$DrawingFinished;", "Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState;", "", "component1", "encodedImage", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getEncodedImage", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final /* data */ class DrawingFinished extends SignatureUiState {
            public static final int $stable = 0;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            public final String encodedImage;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public DrawingFinished(@NotNull String encodedImage) {
                super(null);
                Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
                this.encodedImage = encodedImage;
            }

            public static /* synthetic */ DrawingFinished copy$default(DrawingFinished drawingFinished, String str, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = drawingFinished.encodedImage;
                }
                return drawingFinished.copy(str);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final String getEncodedImage() {
                return this.encodedImage;
            }

            @NotNull
            public final DrawingFinished copy(@NotNull String encodedImage) {
                Intrinsics.checkNotNullParameter(encodedImage, "encodedImage");
                return new DrawingFinished(encodedImage);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DrawingFinished) && Intrinsics.areEqual(this.encodedImage, ((DrawingFinished) other).encodedImage);
            }

            @NotNull
            public final String getEncodedImage() {
                return this.encodedImage;
            }

            public int hashCode() {
                return this.encodedImage.hashCode();
            }

            @NotNull
            public String toString() {
                return h0.b("DrawingFinished(encodedImage=", this.encodedImage, ")");
            }
        }

        @StabilityInferred(parameters = 0)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState$Intro;", "Lmx/openpay/library/ui/signature/DigitalSignatureViewModel$SignatureUiState;", "library_release"}, k = 1, mv = {1, 8, 0})
        public static final class Intro extends SignatureUiState {
            public static final int $stable = 0;

            @NotNull
            public static final Intro INSTANCE = new Intro();

            public Intro() {
                super(null);
            }
        }

        public SignatureUiState() {
        }

        public /* synthetic */ SignatureUiState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final String access$encodeImage(DigitalSignatureViewModel digitalSignatureViewModel, Bitmap bitmap) {
        digitalSignatureViewModel.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
        return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
    }

    public final void drawingStarted() {
        this.f84352a.postValue(SignatureUiState.Drawing.INSTANCE);
    }

    @NotNull
    public final Job generateImage(@Nullable Bitmap bitmap) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new c(bitmap, this, null), 3, null);
    }

    @NotNull
    public final LiveData<SignatureUiState> getUiState() {
        return this.f84352a;
    }

    public final void resetToIntro() {
        this.f84352a.postValue(SignatureUiState.Intro.INSTANCE);
    }
}
