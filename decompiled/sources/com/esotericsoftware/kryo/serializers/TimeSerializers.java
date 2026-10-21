package com.esotericsoftware.kryo.serializers;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.pm.o0;
import androidx.core.content.pm.u0;
import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class TimeSerializers {

    public static class DurationSerializer extends ImmutableSerializer<Duration> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.core.app.d.d(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Duration read(Kryo kryo, Input input, Class cls) {
            return Duration.ofSeconds(input.readLong(), input.readInt(true));
        }

        public void write(Kryo kryo, Output output, Duration duration) {
            output.writeLong(duration.getSeconds());
            output.writeInt(duration.getNano(), true);
        }
    }

    public static class InstantSerializer extends ImmutableSerializer<Instant> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.core.app.h.g(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Instant read(Kryo kryo, Input input, Class cls) {
            return Instant.ofEpochSecond(input.readVarLong(true), input.readInt(true));
        }

        public void write(Kryo kryo, Output output, Instant instant) {
            output.writeVarLong(instant.getEpochSecond(), true);
            output.writeInt(instant.getNano(), true);
        }
    }

    public static class LocalDateSerializer extends ImmutableSerializer<LocalDate> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.core.graphics.e.g(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public LocalDate read(Kryo kryo, Input input, Class cls) {
            return read(input);
        }

        public void write(Kryo kryo, Output output, LocalDate localDate) {
            write(output, localDate);
        }

        public static LocalDate read(Input input) {
            return LocalDate.of(input.readInt(true), input.readByte(), input.readByte());
        }

        public static void write(Output output, LocalDate localDate) {
            output.writeInt(localDate.getYear(), true);
            output.writeByte(localDate.getMonthValue());
            output.writeByte(localDate.getDayOfMonth());
        }
    }

    public static class LocalDateTimeSerializer extends ImmutableSerializer<LocalDateTime> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.core.app.o.f(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public LocalDateTime read(Kryo kryo, Input input, Class cls) {
            return LocalDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input));
        }

        public void write(Kryo kryo, Output output, LocalDateTime localDateTime) {
            LocalDateSerializer.write(output, localDateTime.toLocalDate());
            LocalTimeSerializer.write(output, localDateTime.toLocalTime());
        }
    }

    public static class LocalTimeSerializer extends ImmutableSerializer<LocalTime> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.core.graphics.h.c(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public LocalTime read(Kryo kryo, Input input, Class cls) {
            return read(input);
        }

        public void write(Kryo kryo, Output output, LocalTime localTime) {
            write(output, localTime);
        }

        public static LocalTime read(Input input) {
            int i10;
            int i11;
            int i12 = input.readByte();
            int i13 = 0;
            if (i12 < 0) {
                i12 = ~i12;
                i10 = 0;
                i11 = 0;
            } else {
                byte b10 = input.readByte();
                if (b10 < 0) {
                    int i14 = ~b10;
                    i11 = 0;
                    i13 = i14;
                    i10 = 0;
                } else {
                    byte b11 = input.readByte();
                    if (b11 < 0) {
                        i10 = ~b11;
                    } else {
                        i13 = input.readInt(true);
                        i10 = b11;
                    }
                    i11 = i13;
                    i13 = b10;
                }
            }
            return LocalTime.of(i12, i13, i10, i11);
        }

        public static void write(Output output, LocalTime localTime) {
            if (localTime.getNano() == 0) {
                if (localTime.getSecond() == 0) {
                    if (localTime.getMinute() == 0) {
                        output.writeByte(~localTime.getHour());
                        return;
                    } else {
                        output.writeByte(localTime.getHour());
                        output.writeByte(~localTime.getMinute());
                        return;
                    }
                }
                output.writeByte(localTime.getHour());
                output.writeByte(localTime.getMinute());
                output.writeByte(~localTime.getSecond());
                return;
            }
            output.writeByte(localTime.getHour());
            output.writeByte(localTime.getMinute());
            output.writeByte(localTime.getSecond());
            output.writeInt(localTime.getNano(), true);
        }
    }

    public static class MonthDaySerializer extends ImmutableSerializer<MonthDay> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.core.graphics.l.e(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public MonthDay read(Kryo kryo, Input input, Class cls) {
            return MonthDay.of(input.readByte(), input.readByte());
        }

        public void write(Kryo kryo, Output output, MonthDay monthDay) {
            output.writeByte(monthDay.getMonthValue());
            output.writeByte(monthDay.getDayOfMonth());
        }
    }

    public static class OffsetDateTimeSerializer extends ImmutableSerializer<OffsetDateTime> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.core.util.b.f(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public OffsetDateTime read(Kryo kryo, Input input, Class cls) {
            return OffsetDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input), ZoneOffsetSerializer.read(input));
        }

        public void write(Kryo kryo, Output output, OffsetDateTime offsetDateTime) {
            LocalDateSerializer.write(output, offsetDateTime.toLocalDate());
            LocalTimeSerializer.write(output, offsetDateTime.toLocalTime());
            ZoneOffsetSerializer.write(output, offsetDateTime.getOffset());
        }
    }

    public static class OffsetTimeSerializer extends ImmutableSerializer<OffsetTime> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, i0.f(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public OffsetTime read(Kryo kryo, Input input, Class cls) {
            return OffsetTime.of(LocalTimeSerializer.read(input), ZoneOffsetSerializer.read(input));
        }

        public void write(Kryo kryo, Output output, OffsetTime offsetTime) {
            LocalTimeSerializer.write(output, offsetTime.toLocalTime());
            ZoneOffsetSerializer.write(output, offsetTime.getOffset());
        }
    }

    public static class PeriodSerializer extends ImmutableSerializer<Period> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, o0.f(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Period read(Kryo kryo, Input input, Class cls) {
            return Period.of(input.readInt(true), input.readInt(true), input.readInt(true));
        }

        public void write(Kryo kryo, Output output, Period period) {
            output.writeVarInt(period.getYears(), true);
            output.writeVarInt(period.getMonths(), true);
            output.writeVarInt(period.getDays(), true);
        }
    }

    public static class YearMonthSerializer extends ImmutableSerializer<YearMonth> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.compose.ui.platform.b.d(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public YearMonth read(Kryo kryo, Input input, Class cls) {
            return YearMonth.of(input.readInt(true), input.readByte());
        }

        public void write(Kryo kryo, Output output, YearMonth yearMonth) {
            output.writeVarInt(yearMonth.getYear(), true);
            output.writeByte(yearMonth.getMonthValue());
        }
    }

    public static class YearSerializer extends ImmutableSerializer<Year> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, a0.f(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public Year read(Kryo kryo, Input input, Class cls) {
            return Year.of(input.readInt(true));
        }

        public void write(Kryo kryo, Output output, Year year) {
            output.writeVarInt(year.getValue(), true);
        }
    }

    public static class ZoneIdSerializer extends ImmutableSerializer<ZoneId> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, c0.g(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public ZoneId read(Kryo kryo, Input input, Class cls) {
            return read(input);
        }

        public void write(Kryo kryo, Output output, ZoneId zoneId) {
            write(output, zoneId);
        }

        public static ZoneId read(Input input) {
            return ZoneId.of(input.readString());
        }

        public static void write(Output output, ZoneId zoneId) {
            output.writeString(zoneId.getId());
        }
    }

    public static class ZoneOffsetSerializer extends ImmutableSerializer<ZoneOffset> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, e0.d(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public ZoneOffset read(Kryo kryo, Input input, Class cls) {
            return read(input);
        }

        public void write(Kryo kryo, Output output, ZoneOffset zoneOffset) {
            write(output, zoneOffset);
        }

        public static ZoneOffset read(Input input) {
            byte b10 = input.readByte();
            return b10 == 127 ? ZoneOffset.ofTotalSeconds(input.readInt()) : ZoneOffset.ofTotalSeconds(b10 * 900);
        }

        public static void write(Output output, ZoneOffset zoneOffset) {
            int totalSeconds = zoneOffset.getTotalSeconds();
            int i10 = totalSeconds % TypedValues.Custom.TYPE_INT == 0 ? totalSeconds / TypedValues.Custom.TYPE_INT : 127;
            output.writeByte(i10);
            if (i10 == 127) {
                output.writeInt(totalSeconds);
            }
        }
    }

    public static class ZonedDateTimeSerializer extends ImmutableSerializer<ZonedDateTime> {
        @Override // com.esotericsoftware.kryo.Serializer
        public /* bridge */ /* synthetic */ void write(Kryo kryo, Output output, Object obj) {
            write(kryo, output, androidx.core.app.d.g(obj));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public ZonedDateTime read(Kryo kryo, Input input, Class cls) {
            return ZonedDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input), ZoneIdSerializer.read(input));
        }

        public void write(Kryo kryo, Output output, ZonedDateTime zonedDateTime) {
            LocalDateSerializer.write(output, zonedDateTime.toLocalDate());
            LocalTimeSerializer.write(output, zonedDateTime.toLocalTime());
            ZoneIdSerializer.write(output, zonedDateTime.getZone());
        }
    }

    public static void addDefaultSerializers(Kryo kryo) {
        if (Util.isClassAvailable("java.time.Duration")) {
            kryo.addDefaultSerializer(androidx.camera.camera2.internal.compat.a.d(), DurationSerializer.class);
        }
        if (Util.isClassAvailable("java.time.Instant")) {
            kryo.addDefaultSerializer(z.e(), InstantSerializer.class);
        }
        if (Util.isClassAvailable("java.time.LocalDate")) {
            kryo.addDefaultSerializer(a0.c(), LocalDateSerializer.class);
        }
        if (Util.isClassAvailable("java.time.LocalTime")) {
            kryo.addDefaultSerializer(androidx.core.view.accessibility.i.d(), LocalTimeSerializer.class);
        }
        if (Util.isClassAvailable("java.time.LocalDateTime")) {
            kryo.addDefaultSerializer(b0.c(), LocalDateTimeSerializer.class);
        }
        if (Util.isClassAvailable("java.time.ZoneOffset")) {
            kryo.addDefaultSerializer(c0.c(), ZoneOffsetSerializer.class);
        }
        if (Util.isClassAvailable("java.time.ZoneId")) {
            kryo.addDefaultSerializer(androidx.camera.camera2.internal.compat.b.g(), ZoneIdSerializer.class);
        }
        if (Util.isClassAvailable("java.time.OffsetTime")) {
            kryo.addDefaultSerializer(androidx.appcompat.app.t.f(), OffsetTimeSerializer.class);
        }
        if (Util.isClassAvailable("java.time.OffsetDateTime")) {
            kryo.addDefaultSerializer(androidx.appcompat.app.u.b(), OffsetDateTimeSerializer.class);
        }
        if (Util.isClassAvailable("java.time.ZonedDateTime")) {
            kryo.addDefaultSerializer(w.b(), ZonedDateTimeSerializer.class);
        }
        if (Util.isClassAvailable("java.time.Year")) {
            kryo.addDefaultSerializer(x.f(), YearSerializer.class);
        }
        if (Util.isClassAvailable("java.time.YearMonth")) {
            kryo.addDefaultSerializer(u0.e(), YearMonthSerializer.class);
        }
        if (Util.isClassAvailable("java.time.MonthDay")) {
            kryo.addDefaultSerializer(androidx.compose.ui.platform.b.a(), MonthDaySerializer.class);
        }
        if (Util.isClassAvailable("java.time.Period")) {
            kryo.addDefaultSerializer(y.b(), PeriodSerializer.class);
        }
    }
}
