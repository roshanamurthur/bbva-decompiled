package i6;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.datepicker.plugin.command.GetDateCommand;
import com.bbva.datepicker.plugin.model.DateFormatter;
import java.util.Date;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: GetDateCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Lambda implements Function1<Result<? extends Date>, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ GetDateCommand f69512p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ DateFormatter f69513q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f69514r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(GetDateCommand getDateCommand, DateFormatter dateFormatter, CommandCallback commandCallback) {
        super(1);
        this.f69512p0 = getDateCommand;
        this.f69513q0 = dateFormatter;
        this.f69514r0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Result<? extends Date> result) {
        GetDateCommand.access$handleResult(this.f69512p0, this.f69513q0, result.getF79387p0(), this.f69514r0);
        return Unit.INSTANCE;
    }
}
