package com.bbva.datepicker.plugin.factory;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.datepicker.DefaultDatePicker;
import com.bbva.datepicker.plugin.command.GetDateCommand;
import kotlin.Metadata;

/* JADX INFO: compiled from: DatePickerCommandFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/datepicker/plugin/factory/DatePickerCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "datepicker-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class DatePickerCommandFactory extends CommandFactory {

    /* JADX INFO: compiled from: DatePickerCommandFactory.kt */
    public static final class a implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29007a = new a();

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand<Object> create() {
            return new GetDateCommand(new DefaultDatePicker());
        }
    }

    public DatePickerCommandFactory() {
        addCommandProvider("get", a.f29007a);
    }
}
