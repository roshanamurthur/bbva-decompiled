package okhttp3;

import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ExpectedUserActionOnPoiTypes;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Authenticator.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\t"}, d2 = {"Lokhttp3/Authenticator;", "", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "Lokhttp3/Request;", "route", "Lokhttp3/Route;", DigipassManagerConstants.KEY_RESPONSE, "Lokhttp3/Response;", "Companion", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Authenticator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f85431a;

    @JvmField
    @NotNull
    public static final Authenticator NONE = new Companion.a();

    @JvmField
    @NotNull
    public static final Authenticator JAVA_NET_AUTHENTICATOR = new okhttp3.internal.authenticator.JavaNetAuthenticator(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: compiled from: Authenticator.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001R\u0017\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0001¨\u0006\t"}, d2 = {"Lokhttp3/Authenticator$Companion;", "", "Lokhttp3/Authenticator;", "JAVA_NET_AUTHENTICATOR", "Lokhttp3/Authenticator;", ExpectedUserActionOnPoiTypes.NONE, "<init>", "()V", "a", "okhttp"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f85431a = new Companion();

        /* JADX INFO: compiled from: Authenticator.kt */
        public static final class a implements Authenticator {
            @Override // okhttp3.Authenticator
            @Nullable
            public final Request authenticate(@Nullable Route route, @NotNull Response response) {
                Intrinsics.checkNotNullParameter(response, "response");
                return null;
            }
        }
    }

    @Nullable
    Request authenticate(@Nullable Route route, @NotNull Response response) throws IOException;
}
