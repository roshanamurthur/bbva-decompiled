package androidx.appcompat.widget;

import androidx.compose.ui.graphics.vector.PathBuilder;
import com.bbva.cellscore.channel.model.Reaction;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.glomohybrid.login.presentation.reactions.LoginReaction;
import com.bbva.glomohybrid.login.presentation.viewmodel.LoginGlobalViewModel;
import com.bbva.glomohybrid.logs.LoggerKt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzdf;
import com.google.firebase.encoders.FieldDescriptor;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Reaction.ReactionExecution {
    public static int a(int i10, int i11, int i12, int i13) {
        return i10 + i11 + i12 + i13;
    }

    public static FieldDescriptor b(int i10, FieldDescriptor.Builder builder) {
        zzdf zzdfVar = new zzdf();
        zzdfVar.zza(i10);
        return builder.withProperty(zzdfVar.zzb()).build();
    }

    public static void c(PathBuilder pathBuilder, float f6, float f10, float f11) {
        pathBuilder.lineTo(f6, f10);
        pathBuilder.verticalLineToRelative(f11);
        pathBuilder.close();
    }

    @Override // com.bbva.cellscore.channel.model.Reaction.ReactionExecution
    public void execute(Object obj, Object obj2) {
        Exception exc = (Exception) obj2;
        LoginReaction.Companion companion = LoginReaction.INSTANCE;
        LoggerKt.logCritical$default("customers-error", exc, null, 4, null);
        ((LoginGlobalViewModel) obj).onActionPerformed(CustomerDataManager.ACTION_GET_CUSTOMER_ERROR, exc);
    }
}
