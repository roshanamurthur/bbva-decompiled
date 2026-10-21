package af;

import android.app.Activity;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.navigation.Route;
import com.bbva.cellscore.web.navigation.actions.NavigationAction;
import com.google.android.play.core.splitinstall.internal.zzar;
import com.google.android.play.core.splitinstall.internal.zzbk;
import java.io.File;
import org.bouncycastle.crypto.ExtendedDigest;

/* JADX INFO: compiled from: com.google.mlkit:barcode-scanning@@17.0.2 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a implements zzar, NavigationAction {
    public static void a(ExtendedDigest extendedDigest, byte[] bArr) {
        extendedDigest.update(bArr, 0, bArr.length);
    }

    public static void b(short s4, ExtendedDigest extendedDigest) {
        extendedDigest.update((byte) (s4 >>> 8));
        extendedDigest.update((byte) s4);
    }

    public static void c(int i10, ExtendedDigest extendedDigest) {
        extendedDigest.update((byte) (i10 >>> 24));
        extendedDigest.update((byte) (i10 >>> 16));
        extendedDigest.update((byte) (i10 >>> 8));
        extendedDigest.update((byte) i10);
    }

    @Override // com.bbva.cellscore.web.navigation.actions.NavigationAction
    public void execute(Activity activity, CellsMessage cellsMessage, Route route) {
        activity.finish();
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzar
    public boolean zza(Object obj, File file, File file2) {
        return new File((String) zzbk.zzg(obj.getClass(), "optimizedPathFor", String.class, File.class, file, File.class, file2)).exists();
    }
}
