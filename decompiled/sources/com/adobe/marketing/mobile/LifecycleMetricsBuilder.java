package com.adobe.marketing.mobile;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
final class LifecycleMetricsBuilder {
    private static final String LOG_TAG = "LifecycleMetricsBuilder";
    private LocalStorageService.DataStore lifecycleDataStore;
    private SystemInfoService systemInfoService;
    private long timestampInSeconds;
    private final DateFormat sdfDate = new SimpleDateFormat("M/d/yyyy", Locale.US);
    private Map<String, String> lifecycleData = new HashMap();

    public LifecycleMetricsBuilder(SystemInfoService systemInfoService, LocalStorageService.DataStore dataStore, long j10) {
        this.systemInfoService = systemInfoService;
        this.lifecycleDataStore = dataStore;
        this.timestampInSeconds = j10;
        if (dataStore == null) {
            Log.debug(LOG_TAG, "%s (Data Store), while creating LifecycleExtension Metrics Builder.", "Unexpected Null Value");
        }
        if (systemInfoService == null) {
            Log.debug(LOG_TAG, "%s (System Info Services), while creating LifecycleExtension Metrics Builder", "Unexpected Null Value");
        }
    }

    private int calculateDaysBetween(long j10, long j11) {
        long j12 = LifecycleConstants.WRONG_EPOCH_MAX_LENGTH_SECONDS;
        int i10 = 0;
        if (j10 < j12 || j11 < j12) {
            Log.debug(LOG_TAG, "Invalid timestamp - startTimestampInSeconds (%d), endTimestampInSeconds (%d)", Long.valueOf(j10), Long.valueOf(j11));
            return -1;
        }
        Calendar calendarCalendarFromTimestampInSeconds = calendarFromTimestampInSeconds(j10);
        Calendar calendarCalendarFromTimestampInSeconds2 = calendarFromTimestampInSeconds(j11);
        int i11 = calendarCalendarFromTimestampInSeconds2.get(1) - calendarCalendarFromTimestampInSeconds.get(1);
        int i12 = calendarCalendarFromTimestampInSeconds2.get(6) - calendarCalendarFromTimestampInSeconds.get(6);
        int i13 = calendarCalendarFromTimestampInSeconds2.get(1);
        if (i11 == 0) {
            return i12;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        for (int i14 = calendarCalendarFromTimestampInSeconds.get(1); i14 < i13; i14++) {
            i10 = gregorianCalendar.isLeapYear(i14) ? i10 + 366 : i10 + 365;
        }
        return i12 + i10;
    }

    private Calendar calendarFromTimestampInSeconds(long j10) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(TimeUnit.SECONDS.toMillis(j10));
        return calendar;
    }

    private String getApplicationIdentifier() {
        SystemInfoService systemInfoService = this.systemInfoService;
        if (systemInfoService == null) {
            return null;
        }
        String applicationName = systemInfoService.getApplicationName();
        String applicationVersion = this.systemInfoService.getApplicationVersion();
        String applicationVersionCode = this.systemInfoService.getApplicationVersionCode();
        Object[] objArr = new Object[3];
        objArr[0] = applicationName;
        objArr[1] = !StringUtils.isNullOrEmpty(applicationVersion) ? String.format(" %s", applicationVersion) : "";
        objArr[2] = StringUtils.isNullOrEmpty(applicationVersionCode) ? "" : String.format(" (%s)", applicationVersionCode);
        return String.format("%s%s%s", objArr);
    }

    private String getLocale() {
        Locale activeLocale;
        SystemInfoService systemInfoService = this.systemInfoService;
        if (systemInfoService == null || (activeLocale = systemInfoService.getActiveLocale()) == null) {
            return null;
        }
        return activeLocale.toString().replace('_', '-');
    }

    private String getResolution() {
        SystemInfoService systemInfoService = this.systemInfoService;
        if (systemInfoService == null) {
            return null;
        }
        SystemInfoService.DisplayInformation displayInformation = systemInfoService.getDisplayInformation();
        if (displayInformation != null) {
            return String.format(Locale.US, "%dx%d", Integer.valueOf(displayInformation.getWidthPixels()), Integer.valueOf(displayInformation.getHeightPixels()));
        }
        Log.debug(LOG_TAG, "Failed to get resolution (DisplayInformation was null)", new Object[0]);
        return null;
    }

    private String stringFromTimestamp(long j10) {
        String str;
        synchronized (this.sdfDate) {
            str = this.sdfDate.format(Long.valueOf(TimeUnit.SECONDS.toMillis(j10)));
        }
        return str;
    }

    public LifecycleMetricsBuilder addCoreData() {
        Log.trace(LOG_TAG, "Adding core data to lifecycle data map", new Object[0]);
        SystemInfoService systemInfoService = this.systemInfoService;
        if (systemInfoService == null) {
            return this;
        }
        String deviceName = systemInfoService.getDeviceName();
        if (!StringUtils.isNullOrEmpty(deviceName)) {
            this.lifecycleData.put("devicename", deviceName);
        }
        String mobileCarrierName = this.systemInfoService.getMobileCarrierName();
        if (!StringUtils.isNullOrEmpty(mobileCarrierName)) {
            this.lifecycleData.put("carriername", mobileCarrierName);
        }
        String applicationIdentifier = getApplicationIdentifier();
        if (!StringUtils.isNullOrEmpty(applicationIdentifier)) {
            this.lifecycleData.put("appid", applicationIdentifier);
        }
        String operatingSystemName = this.systemInfoService.getOperatingSystemName();
        if (!StringUtils.isNullOrEmpty(operatingSystemName)) {
            this.lifecycleData.put("osversion", operatingSystemName);
        }
        String resolution = getResolution();
        if (!StringUtils.isNullOrEmpty(resolution)) {
            this.lifecycleData.put("resolution", resolution);
        }
        String locale = getLocale();
        if (!StringUtils.isNullOrEmpty(locale)) {
            this.lifecycleData.put("locale", locale);
        }
        String runMode = this.systemInfoService.getRunMode();
        if (!StringUtils.isNullOrEmpty(runMode)) {
            this.lifecycleData.put("runmode", runMode);
        }
        return this;
    }

    public LifecycleMetricsBuilder addCrashData(boolean z10) {
        Log.trace(LOG_TAG, "Adding crash data to lifecycle data map", new Object[0]);
        if (z10) {
            this.lifecycleData.put("crashevent", "CrashEvent");
        }
        return this;
    }

    public LifecycleMetricsBuilder addGenericData() {
        int i10;
        Log.trace(LOG_TAG, "Adding generic data to the lifecycle data map", new Object[0]);
        LocalStorageService.DataStore dataStore = this.lifecycleDataStore;
        if (dataStore != null && (i10 = dataStore.getInt("Launches", -1)) != -1) {
            this.lifecycleData.put("launches", Integer.toString(i10));
        }
        Calendar calendarCalendarFromTimestampInSeconds = calendarFromTimestampInSeconds(this.timestampInSeconds);
        this.lifecycleData.put("dayofweek", Integer.toString(calendarCalendarFromTimestampInSeconds.get(7)));
        this.lifecycleData.put("hourofday", Integer.toString(calendarCalendarFromTimestampInSeconds.get(11)));
        this.lifecycleData.put("launchevent", "LaunchEvent");
        return this;
    }

    public LifecycleMetricsBuilder addInstallData() {
        Log.trace(LOG_TAG, "Adding install data to lifecycle data map", new Object[0]);
        this.lifecycleData.put("dailyenguserevent", "DailyEngUserEvent");
        this.lifecycleData.put("monthlyenguserevent", "MonthlyEngUserEvent");
        this.lifecycleData.put("installevent", "InstallEvent");
        this.lifecycleData.put("installdate", stringFromTimestamp(this.timestampInSeconds));
        LocalStorageService.DataStore dataStore = this.lifecycleDataStore;
        if (dataStore == null) {
            return this;
        }
        dataStore.setLong("InstallDate", this.timestampInSeconds);
        return this;
    }

    public LifecycleMetricsBuilder addLaunchData() {
        Log.trace(LOG_TAG, "Adding launch data to the lifecycle data map", new Object[0]);
        LocalStorageService.DataStore dataStore = this.lifecycleDataStore;
        if (dataStore == null) {
            return this;
        }
        long j10 = dataStore.getLong("LastDateUsed", 0L);
        long j11 = this.lifecycleDataStore.getLong("InstallDate", 0L);
        Calendar calendarCalendarFromTimestampInSeconds = calendarFromTimestampInSeconds(this.timestampInSeconds);
        Calendar calendarCalendarFromTimestampInSeconds2 = calendarFromTimestampInSeconds(j10);
        int iCalculateDaysBetween = calculateDaysBetween(j10, this.timestampInSeconds);
        int iCalculateDaysBetween2 = calculateDaysBetween(j11, this.timestampInSeconds);
        if (calendarCalendarFromTimestampInSeconds.get(2) != calendarCalendarFromTimestampInSeconds2.get(2) || calendarCalendarFromTimestampInSeconds.get(1) != calendarCalendarFromTimestampInSeconds2.get(1)) {
            this.lifecycleData.put("dailyenguserevent", "DailyEngUserEvent");
            this.lifecycleData.put("monthlyenguserevent", "MonthlyEngUserEvent");
        } else if (calendarCalendarFromTimestampInSeconds.get(5) != calendarCalendarFromTimestampInSeconds2.get(5)) {
            this.lifecycleData.put("dailyenguserevent", "DailyEngUserEvent");
        }
        if (iCalculateDaysBetween >= 0) {
            this.lifecycleData.put("dayssincelastuse", Integer.toString(iCalculateDaysBetween));
        }
        if (iCalculateDaysBetween2 >= 0) {
            this.lifecycleData.put("dayssincefirstuse", Integer.toString(iCalculateDaysBetween2));
        }
        return this;
    }

    public LifecycleMetricsBuilder addUpgradeData(boolean z10) {
        Log.trace(LOG_TAG, "Adding upgrade data to lifecycle data map", new Object[0]);
        if (z10) {
            this.lifecycleData.put("upgradeevent", "UpgradeEvent");
        }
        LocalStorageService.DataStore dataStore = this.lifecycleDataStore;
        if (dataStore == null) {
            return this;
        }
        long j10 = dataStore.getLong("UpgradeDate", 0L);
        if (z10) {
            this.lifecycleDataStore.setLong("UpgradeDate", this.timestampInSeconds);
            this.lifecycleDataStore.setInt("LaunchesAfterUpgrade", 0);
        } else if (j10 > 0) {
            int iCalculateDaysBetween = calculateDaysBetween(j10, this.timestampInSeconds);
            int i10 = this.lifecycleDataStore.getInt("LaunchesAfterUpgrade", 0) + 1;
            this.lifecycleDataStore.setInt("LaunchesAfterUpgrade", i10);
            this.lifecycleData.put("launchessinceupgrade", Integer.toString(i10));
            if (iCalculateDaysBetween >= 0) {
                this.lifecycleData.put("dayssincelastupgrade", Integer.toString(iCalculateDaysBetween));
            }
        }
        return this;
    }

    public Map<String, String> build() {
        return this.lifecycleData;
    }
}
