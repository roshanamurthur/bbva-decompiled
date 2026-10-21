package b8;

import androidx.camera.core.processing.f;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.glomohybrid.base.file.infrastructure.FileActions;
import com.bbva.glomoutils.Either;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: FileActions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b extends Lambda implements Function0<ActionSpec<Either<? extends String, ? extends Boolean>>> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ FileActions f24888p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FileActions fileActions) {
        super(0);
        this.f24888p0 = fileActions;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ActionSpec<Either<? extends String, ? extends Boolean>> invoke() {
        return new ActionSpec<>(f.d("result-", this.f24888p0.getActionName()));
    }
}
