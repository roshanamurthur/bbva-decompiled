package com.bbva.datepicker.plugin.command;

import android.app.Activity;
import com.bbva.androidtoolkit.optional.function.Consumer;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.datepicker.DatePicker;
import com.bbva.datepicker.model.DatePickerParams;
import com.bbva.datepicker.plugin.model.DateFormatter;
import com.bbva.datepicker.plugin.model.GetRequest;
import com.bbva.datepicker.plugin.model.GetResponse;
import com.bbva.datepicker.plugin.model.GetValidator;
import java.text.ParseException;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GetDateCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/datepicker/plugin/command/GetDateCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/datepicker/plugin/model/GetRequest;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/datepicker/DatePicker;", "datePicker", "<init>", "(Lcom/bbva/datepicker/DatePicker;)V", "Companion", "datepicker-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class GetDateCommand extends AbstractCommand<GetRequest> {

    @NotNull
    public static final String DEFAULT_FORMAT = "yyyy-MM-dd";

    @NotNull
    public static final String ID = "get";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final DatePicker f29002p0;

    /* JADX INFO: compiled from: GetDateCommand.kt */
    public static final class a<T> implements Consumer<Activity> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ GetRequest f29004b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f29005c;

        public a(GetRequest getRequest, CommandCallback commandCallback) {
            this.f29004b = getRequest;
            this.f29005c = commandCallback;
        }

        @Override // com.bbva.androidtoolkit.optional.function.Consumer
        public final void accept(Activity activity) {
            Activity activity2 = activity;
            Intrinsics.checkNotNullExpressionValue(activity2, "activity");
            GetDateCommand.access$runCommand(GetDateCommand.this, activity2, this.f29004b, this.f29005c);
        }
    }

    /* JADX INFO: compiled from: GetDateCommand.kt */
    public static final class b implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f29006p0;

        public b(CommandCallback commandCallback) {
            this.f29006p0 = commandCallback;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f29006p0.sendError(Errors.ErrorNotAvailable);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDateCommand(@NotNull DatePicker datePicker) {
        super(GetRequest.class, new GetValidator());
        Intrinsics.checkNotNullParameter(datePicker, "datePicker");
        this.f29002p0 = datePicker;
    }

    public static DatePickerParams a(GetRequest getRequest, DateFormatter dateFormatter) throws ParseException {
        long date = dateFormatter.toDate(getRequest.getDefaultDate(), -1L);
        if (date != -1) {
            return new DatePickerParams(date, dateFormatter.toDate(getRequest.getMinDate(), -1L), dateFormatter.toDate(getRequest.getMaxDate(), -1L), getRequest.getDisableWeekends());
        }
        throw new IllegalArgumentException(("Error parsing date with format " + dateFormatter.getFormat()).toString());
    }

    public static final void access$handleResult(GetDateCommand getDateCommand, DateFormatter dateFormatter, Object obj, CommandCallback commandCallback) {
        getDateCommand.getClass();
        if (Result.m5541isSuccessimpl(obj)) {
            commandCallback.sendEvent(new GetResponse(dateFormatter.dateToString((Date) obj)).toJson());
        }
        if (Result.m5538exceptionOrNullimpl(obj) != null) {
            commandCallback.sendError(Errors.ErrorCanceled);
        }
    }

    public static final void access$runCommand(GetDateCommand getDateCommand, Activity activity, GetRequest getRequest, CommandCallback commandCallback) {
        Object objM5535constructorimpl;
        getDateCommand.getClass();
        String dateFormat = getRequest.getDateFormat();
        if (dateFormat == null) {
            dateFormat = "yyyy-MM-dd";
        }
        DateFormatter dateFormatter = new DateFormatter(dateFormat);
        try {
            Result.Companion companion = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(a(getRequest, dateFormatter));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) != null) {
            commandCallback.sendError(Errors.ErrorMalformedParam);
        }
        if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
            i6.a aVar = new i6.a(getDateCommand, dateFormatter, commandCallback);
            getDateCommand.f29002p0.show(activity, (DatePickerParams) objM5535constructorimpl, aVar);
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull GetRequest params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.mActivityContainer.get().ifPresentOrElse(new a(params, callback), new b(callback));
    }
}
