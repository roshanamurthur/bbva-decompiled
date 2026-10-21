package com.mastercard.sonic.utils.calendar;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CalendarPart.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\f\n\u0002\b\n\b\u0080\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/mastercard/sonic/utils/calendar/CalendarPart;", "", "", "calendarPartValue", "Ljava/lang/Character;", "getCalendarPartValue", "()Ljava/lang/Character;", "setCalendarPartValue", "(Ljava/lang/Character;)V", "Companion", "MONTH", "QUARTER", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public enum CalendarPart {
    MONTH('m'),
    QUARTER('q');


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private Character calendarPartValue;

    /* JADX INFO: compiled from: CalendarPart.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/mastercard/sonic/utils/calendar/CalendarPart$Companion;", "", "()V", "getCalendarPartForValue", "Lcom/mastercard/sonic/utils/calendar/CalendarPart;", "calendarPartValue", "", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nCalendarPart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarPart.kt\ncom/mastercard/sonic/utils/calendar/CalendarPart$Companion\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,13:1\n1282#2,2:14\n*S KotlinDebug\n*F\n+ 1 CalendarPart.kt\ncom/mastercard/sonic/utils/calendar/CalendarPart$Companion\n*L\n10#1:14,2\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:14:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final CalendarPart getCalendarPartForValue(char calendarPartValue) {
            for (CalendarPart calendarPart : CalendarPart.values()) {
                if (l.equals(calendarPart.name(), String.valueOf(calendarPartValue), true)) {
                    if (calendarPart == null) {
                        return CalendarPart.MONTH;
                    }
                    return calendarPart;
                }
            }
            calendarPart = null;
            if (calendarPart == null) {
                return CalendarPart.MONTH;
            }
            return calendarPart;
        }
    }

    CalendarPart(Character ch2) {
        this.calendarPartValue = ch2;
    }

    @Nullable
    public final Character getCalendarPartValue() {
        return this.calendarPartValue;
    }

    public final void setCalendarPartValue(@Nullable Character ch2) {
        this.calendarPartValue = ch2;
    }
}
